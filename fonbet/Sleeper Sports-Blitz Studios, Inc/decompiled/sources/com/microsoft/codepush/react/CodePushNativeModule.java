package com.microsoft.codepush.react;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public class CodePushNativeModule extends ReactContextBaseJavaModule {
    private boolean _allowed;
    private boolean _restartInProgress;
    private ArrayList<Boolean> _restartQueue;
    private String mBinaryContentsHash;
    private String mClientUniqueId;
    private CodePush mCodePush;
    private LifecycleEventListener mLifecycleEventListener;
    private int mMinimumBackgroundDuration;
    private SettingsManager mSettingsManager;
    private CodePushTelemetryManager mTelemetryManager;
    private CodePushUpdateManager mUpdateManager;

    @ReactMethod
    public void addListener(String str) {
    }

    @ReactMethod
    public void removeListeners(Integer num) {
    }

    public CodePushNativeModule(ReactApplicationContext reactApplicationContext, CodePush codePush, CodePushUpdateManager codePushUpdateManager, CodePushTelemetryManager codePushTelemetryManager, SettingsManager settingsManager) {
        super(reactApplicationContext);
        this.mBinaryContentsHash = null;
        this.mClientUniqueId = null;
        this.mLifecycleEventListener = null;
        this.mMinimumBackgroundDuration = 0;
        this._allowed = true;
        this._restartInProgress = false;
        this._restartQueue = new ArrayList<>();
        this.mCodePush = codePush;
        this.mSettingsManager = settingsManager;
        this.mTelemetryManager = codePushTelemetryManager;
        this.mUpdateManager = codePushUpdateManager;
        this.mBinaryContentsHash = CodePushUpdateUtils.getHashForBinaryContents(reactApplicationContext, codePush.isDebugMode());
        SharedPreferences sharedPreferences = codePush.getContext().getSharedPreferences("CodePush", 0);
        String string = sharedPreferences.getString(CodePushConstants.CLIENT_UNIQUE_ID_KEY, null);
        this.mClientUniqueId = string;
        if (string == null) {
            this.mClientUniqueId = UUID.randomUUID().toString();
            sharedPreferences.edit().putString(CodePushConstants.CLIENT_UNIQUE_ID_KEY, this.mClientUniqueId).apply();
        }
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        HashMap hashMap = new HashMap();
        hashMap.put("codePushInstallModeImmediate", Integer.valueOf(CodePushInstallMode.IMMEDIATE.getValue()));
        hashMap.put("codePushInstallModeOnNextRestart", Integer.valueOf(CodePushInstallMode.ON_NEXT_RESTART.getValue()));
        hashMap.put("codePushInstallModeOnNextResume", Integer.valueOf(CodePushInstallMode.ON_NEXT_RESUME.getValue()));
        hashMap.put("codePushInstallModeOnNextSuspend", Integer.valueOf(CodePushInstallMode.ON_NEXT_SUSPEND.getValue()));
        hashMap.put("codePushUpdateStateRunning", Integer.valueOf(CodePushUpdateState.RUNNING.getValue()));
        hashMap.put("codePushUpdateStatePending", Integer.valueOf(CodePushUpdateState.PENDING.getValue()));
        hashMap.put("codePushUpdateStateLatest", Integer.valueOf(CodePushUpdateState.LATEST.getValue()));
        return hashMap;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "CodePush";
    }

    private void performHardRestart() {
        try {
            ReactApplicationContext reactApplicationContext = getReactApplicationContext();
            Intent launchIntentForPackage = reactApplicationContext.getPackageManager().getLaunchIntentForPackage(reactApplicationContext.getPackageName());
            if (launchIntentForPackage != null) {
                reactApplicationContext.startActivity(Intent.makeRestartActivityTask(launchIntentForPackage.getComponent()));
                Runtime.getRuntime().exit(0);
            } else {
                CodePushUtils.log("Launch intent not found for package: " + reactApplicationContext.getPackageName());
            }
        } catch (Exception e) {
            CodePushUtils.log(e);
        }
    }

    private void clearLifecycleEventListener() {
        if (this.mLifecycleEventListener != null) {
            getReactApplicationContext().removeLifecycleEventListener(this.mLifecycleEventListener);
            this.mLifecycleEventListener = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void restartAppInternal(boolean z) {
        if (this._restartInProgress) {
            CodePushUtils.log("Restart request queued until the current restart is completed");
            this._restartQueue.add(Boolean.valueOf(z));
            return;
        }
        if (!this._allowed) {
            CodePushUtils.log("Restart request queued until restarts are re-allowed");
            this._restartQueue.add(Boolean.valueOf(z));
            return;
        }
        this._restartInProgress = true;
        if (!z || this.mSettingsManager.isPendingUpdate(null)) {
            CodePushUtils.log("Restarting app (hard restart)");
            performHardRestart();
            return;
        }
        this._restartInProgress = false;
        if (this._restartQueue.size() > 0) {
            boolean booleanValue = this._restartQueue.get(0).booleanValue();
            this._restartQueue.remove(0);
            restartAppInternal(booleanValue);
        }
    }

    @ReactMethod
    public void allow(Promise promise) {
        CodePushUtils.log("Re-allowing restarts");
        this._allowed = true;
        if (this._restartQueue.size() > 0) {
            CodePushUtils.log("Executing pending restart");
            boolean booleanValue = this._restartQueue.get(0).booleanValue();
            this._restartQueue.remove(0);
            restartAppInternal(booleanValue);
        }
        promise.resolve(null);
    }

    @ReactMethod
    public void clearPendingRestart(Promise promise) {
        this._restartQueue.clear();
        promise.resolve(null);
    }

    @ReactMethod
    public void disallow(Promise promise) {
        CodePushUtils.log("Disallowing restarts");
        this._allowed = false;
        promise.resolve(null);
    }

    @ReactMethod
    public void restartApp(boolean z, Promise promise) {
        try {
            restartAppInternal(z);
            promise.resolve(null);
        } catch (CodePushUnknownException e) {
            CodePushUtils.log(e);
            promise.reject(e);
        }
    }

    @ReactMethod
    public void downloadUpdate(final ReadableMap readableMap, final boolean z, final Promise promise) {
        new AsyncTask<Void, Void, Void>() { // from class: com.microsoft.codepush.react.CodePushNativeModule.1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            public Void doInBackground(Void... voidArr) {
                try {
                    JSONObject convertReadableToJsonObject = CodePushUtils.convertReadableToJsonObject(readableMap);
                    CodePushUtils.setJSONValueForKey(convertReadableToJsonObject, CodePushConstants.BINARY_MODIFIED_TIME_KEY, "" + CodePushNativeModule.this.mCodePush.getBinaryResourcesModifiedTime());
                    CodePushNativeModule.this.mUpdateManager.downloadPackage(convertReadableToJsonObject, CodePushNativeModule.this.mCodePush.getAssetsBundleFileName(), new DownloadProgressCallback() { // from class: com.microsoft.codepush.react.CodePushNativeModule.1.1
                        private DownloadProgress latestDownloadProgress = null;
                        private int lastDispatchedProgressPercent = -1;

                        @Override // com.microsoft.codepush.react.DownloadProgressCallback
                        public void call(DownloadProgress downloadProgress) {
                            if (z) {
                                this.latestDownloadProgress = downloadProgress;
                                boolean isCompleted = downloadProgress.isCompleted();
                                int progressPercent = this.latestDownloadProgress.getProgressPercent();
                                if (isCompleted || progressPercent != this.lastDispatchedProgressPercent) {
                                    this.lastDispatchedProgressPercent = progressPercent;
                                    dispatchDownloadProgressEvent();
                                }
                            }
                        }

                        public void dispatchDownloadProgressEvent() {
                            ((DeviceEventManagerModule.RCTDeviceEventEmitter) CodePushNativeModule.this.getReactApplicationContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(CodePushConstants.DOWNLOAD_PROGRESS_EVENT_NAME, this.latestDownloadProgress.createWritableMap());
                        }
                    }, CodePushNativeModule.this.mCodePush.getPublicKey());
                    promise.resolve(CodePushUtils.convertJsonObjectToWritable(CodePushNativeModule.this.mUpdateManager.getPackage(CodePushUtils.tryGetString(readableMap, "packageHash"))));
                    return null;
                } catch (CodePushInvalidUpdateException e) {
                    CodePushUtils.log(e);
                    CodePushNativeModule.this.mSettingsManager.saveFailedUpdate(CodePushUtils.convertReadableToJsonObject(readableMap));
                    promise.reject(e);
                    return null;
                } catch (CodePushUnknownException e2) {
                    e = e2;
                    CodePushUtils.log(e);
                    promise.reject(e);
                    return null;
                } catch (IOException e3) {
                    e = e3;
                    CodePushUtils.log(e);
                    promise.reject(e);
                    return null;
                }
            }
        }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    @ReactMethod
    public void getConfiguration(Promise promise) {
        try {
            WritableMap createMap = Arguments.createMap();
            createMap.putString(RemoteConfigConstants.RequestFieldKey.APP_VERSION, this.mCodePush.getAppVersion());
            createMap.putString(CodePushConstants.CLIENT_UNIQUE_ID_KEY, this.mClientUniqueId);
            createMap.putString("deploymentKey", this.mCodePush.getDeploymentKey());
            createMap.putString("serverUrl", this.mCodePush.getServerUrl());
            String str = this.mBinaryContentsHash;
            if (str != null) {
                createMap.putString("packageHash", str);
            }
            promise.resolve(createMap);
        } catch (CodePushUnknownException e) {
            CodePushUtils.log(e);
            promise.reject(e);
        }
    }

    @ReactMethod
    public void getUpdateMetadata(final int i, final Promise promise) {
        new AsyncTask<Void, Void, Void>() { // from class: com.microsoft.codepush.react.CodePushNativeModule.2
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            public Void doInBackground(Void... voidArr) {
                JSONObject currentPackage;
                try {
                    currentPackage = CodePushNativeModule.this.mUpdateManager.getCurrentPackage();
                } catch (CodePushMalformedDataException e) {
                    CodePushUtils.log(e.getMessage());
                    CodePushNativeModule.this.clearUpdates();
                    promise.resolve(null);
                } catch (CodePushUnknownException e2) {
                    CodePushUtils.log(e2);
                    promise.reject(e2);
                }
                if (currentPackage == null) {
                    promise.resolve(null);
                    return null;
                }
                Boolean bool = false;
                if (currentPackage.has("packageHash")) {
                    bool = Boolean.valueOf(CodePushNativeModule.this.mSettingsManager.isPendingUpdate(currentPackage.optString("packageHash", null)));
                }
                if (i == CodePushUpdateState.PENDING.getValue() && !bool.booleanValue()) {
                    promise.resolve(null);
                } else if (i == CodePushUpdateState.RUNNING.getValue() && bool.booleanValue()) {
                    JSONObject previousPackage = CodePushNativeModule.this.mUpdateManager.getPreviousPackage();
                    if (previousPackage == null) {
                        promise.resolve(null);
                        return null;
                    }
                    promise.resolve(CodePushUtils.convertJsonObjectToWritable(previousPackage));
                } else {
                    if (CodePushNativeModule.this.mCodePush.isRunningBinaryVersion()) {
                        CodePushUtils.setJSONValueForKey(currentPackage, "_isDebugOnly", true);
                    }
                    CodePushUtils.setJSONValueForKey(currentPackage, "isPending", bool);
                    promise.resolve(CodePushUtils.convertJsonObjectToWritable(currentPackage));
                }
                return null;
            }
        }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    @ReactMethod
    public void getNewStatusReport(final Promise promise) {
        new AsyncTask<Void, Void, Void>() { // from class: com.microsoft.codepush.react.CodePushNativeModule.3
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            public Void doInBackground(Void... voidArr) {
                WritableMap updateReport;
                try {
                    if (CodePushNativeModule.this.mCodePush.needToReportRollback()) {
                        CodePushNativeModule.this.mCodePush.setNeedToReportRollback(false);
                        JSONArray failedUpdates = CodePushNativeModule.this.mSettingsManager.getFailedUpdates();
                        if (failedUpdates != null && failedUpdates.length() > 0) {
                            try {
                                WritableMap rollbackReport = CodePushNativeModule.this.mTelemetryManager.getRollbackReport(CodePushUtils.convertJsonObjectToWritable(failedUpdates.getJSONObject(failedUpdates.length() - 1)));
                                if (rollbackReport != null) {
                                    promise.resolve(rollbackReport);
                                    return null;
                                }
                            } catch (JSONException e) {
                                throw new CodePushUnknownException("Unable to read failed updates information stored in SharedPreferences.", e);
                            }
                        }
                    } else if (CodePushNativeModule.this.mCodePush.didUpdate()) {
                        JSONObject currentPackage = CodePushNativeModule.this.mUpdateManager.getCurrentPackage();
                        if (currentPackage != null && (updateReport = CodePushNativeModule.this.mTelemetryManager.getUpdateReport(CodePushUtils.convertJsonObjectToWritable(currentPackage))) != null) {
                            promise.resolve(updateReport);
                            return null;
                        }
                    } else if (CodePushNativeModule.this.mCodePush.isRunningBinaryVersion()) {
                        WritableMap binaryUpdateReport = CodePushNativeModule.this.mTelemetryManager.getBinaryUpdateReport(CodePushNativeModule.this.mCodePush.getAppVersion());
                        if (binaryUpdateReport != null) {
                            promise.resolve(binaryUpdateReport);
                            return null;
                        }
                    } else {
                        WritableMap retryStatusReport = CodePushNativeModule.this.mTelemetryManager.getRetryStatusReport();
                        if (retryStatusReport != null) {
                            promise.resolve(retryStatusReport);
                            return null;
                        }
                    }
                    promise.resolve("");
                } catch (CodePushUnknownException e2) {
                    CodePushUtils.log(e2);
                    promise.reject(e2);
                }
                return null;
            }
        }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    /* renamed from: com.microsoft.codepush.react.CodePushNativeModule$4, reason: invalid class name */
    class AnonymousClass4 extends AsyncTask<Void, Void, Void> {
        final /* synthetic */ int val$installMode;
        final /* synthetic */ int val$minimumBackgroundDuration;
        final /* synthetic */ Promise val$promise;
        final /* synthetic */ ReadableMap val$updatePackage;

        AnonymousClass4(ReadableMap readableMap, int i, int i2, Promise promise) {
            this.val$updatePackage = readableMap;
            this.val$installMode = i;
            this.val$minimumBackgroundDuration = i2;
            this.val$promise = promise;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public Void doInBackground(Void... voidArr) {
            String tryGetString;
            try {
                CodePushNativeModule.this.mUpdateManager.installPackage(CodePushUtils.convertReadableToJsonObject(this.val$updatePackage), CodePushNativeModule.this.mSettingsManager.isPendingUpdate(null));
                tryGetString = CodePushUtils.tryGetString(this.val$updatePackage, "packageHash");
            } catch (CodePushUnknownException e) {
                CodePushUtils.log(e);
                this.val$promise.reject(e);
            }
            if (tryGetString == null) {
                throw new CodePushUnknownException("Update package to be installed has no hash.");
            }
            CodePushNativeModule.this.mSettingsManager.savePendingUpdate(tryGetString, false);
            if (this.val$installMode == CodePushInstallMode.ON_NEXT_RESUME.getValue() || this.val$installMode == CodePushInstallMode.IMMEDIATE.getValue() || this.val$installMode == CodePushInstallMode.ON_NEXT_SUSPEND.getValue()) {
                CodePushNativeModule.this.mMinimumBackgroundDuration = this.val$minimumBackgroundDuration;
                if (CodePushNativeModule.this.mLifecycleEventListener == null) {
                    CodePushNativeModule.this.mLifecycleEventListener = new LifecycleEventListener() { // from class: com.microsoft.codepush.react.CodePushNativeModule.4.1
                        private Date lastPausedDate = null;
                        private Handler appSuspendHandler = new Handler(Looper.getMainLooper());
                        private Runnable loadBundleRunnable = new Runnable() { // from class: com.microsoft.codepush.react.CodePushNativeModule.4.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                CodePushUtils.log("Loading bundle on suspend");
                                CodePushNativeModule.this.restartAppInternal(false);
                            }
                        };

                        @Override // com.facebook.react.bridge.LifecycleEventListener
                        public void onHostDestroy() {
                        }

                        @Override // com.facebook.react.bridge.LifecycleEventListener
                        public void onHostResume() {
                            this.appSuspendHandler.removeCallbacks(this.loadBundleRunnable);
                            if (this.lastPausedDate != null) {
                                long time = (new Date().getTime() - this.lastPausedDate.getTime()) / 1000;
                                if (AnonymousClass4.this.val$installMode == CodePushInstallMode.IMMEDIATE.getValue() || time >= CodePushNativeModule.this.mMinimumBackgroundDuration) {
                                    CodePushUtils.log("Loading bundle on resume");
                                    CodePushNativeModule.this.restartAppInternal(false);
                                }
                            }
                        }

                        @Override // com.facebook.react.bridge.LifecycleEventListener
                        public void onHostPause() {
                            this.lastPausedDate = new Date();
                            if (AnonymousClass4.this.val$installMode == CodePushInstallMode.ON_NEXT_SUSPEND.getValue() && CodePushNativeModule.this.mSettingsManager.isPendingUpdate(null)) {
                                this.appSuspendHandler.postDelayed(this.loadBundleRunnable, AnonymousClass4.this.val$minimumBackgroundDuration * 1000);
                            }
                        }
                    };
                    CodePushNativeModule.this.getReactApplicationContext().addLifecycleEventListener(CodePushNativeModule.this.mLifecycleEventListener);
                }
            }
            this.val$promise.resolve("");
            return null;
        }
    }

    @ReactMethod
    public void installUpdate(ReadableMap readableMap, int i, int i2, Promise promise) {
        new AnonymousClass4(readableMap, i, i2, promise).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    @ReactMethod
    public void isFailedUpdate(String str, Promise promise) {
        try {
            promise.resolve(Boolean.valueOf(this.mSettingsManager.isFailedHash(str)));
        } catch (CodePushUnknownException e) {
            CodePushUtils.log(e);
            promise.reject(e);
        }
    }

    @ReactMethod
    public void getLatestRollbackInfo(Promise promise) {
        try {
            JSONObject latestRollbackInfo = this.mSettingsManager.getLatestRollbackInfo();
            if (latestRollbackInfo != null) {
                promise.resolve(CodePushUtils.convertJsonObjectToWritable(latestRollbackInfo));
            } else {
                promise.resolve(null);
            }
        } catch (CodePushUnknownException e) {
            CodePushUtils.log(e);
            promise.reject(e);
        }
    }

    @ReactMethod
    public void setLatestRollbackInfo(String str, Promise promise) {
        try {
            this.mSettingsManager.setLatestRollbackInfo(str);
            promise.resolve(null);
        } catch (CodePushUnknownException e) {
            CodePushUtils.log(e);
            promise.reject(e);
        }
    }

    @ReactMethod
    public void isFirstRun(String str, Promise promise) {
        try {
            promise.resolve(Boolean.valueOf(this.mCodePush.didUpdate() && str != null && str.length() > 0 && str.equals(this.mUpdateManager.getCurrentPackageHash())));
        } catch (CodePushUnknownException e) {
            CodePushUtils.log(e);
            promise.reject(e);
        }
    }

    @ReactMethod
    public void notifyApplicationReady(Promise promise) {
        try {
            this.mSettingsManager.removePendingUpdate();
            promise.resolve("");
        } catch (CodePushUnknownException e) {
            CodePushUtils.log(e);
            promise.reject(e);
        }
    }

    @ReactMethod
    public void recordStatusReported(ReadableMap readableMap) {
        try {
            this.mTelemetryManager.recordStatusReported(readableMap);
        } catch (CodePushUnknownException e) {
            CodePushUtils.log(e);
        }
    }

    @ReactMethod
    public void saveStatusReportForRetry(ReadableMap readableMap) {
        try {
            this.mTelemetryManager.saveStatusReportForRetry(readableMap);
        } catch (CodePushUnknownException e) {
            CodePushUtils.log(e);
        }
    }

    @ReactMethod
    public void downloadAndReplaceCurrentBundle(String str) {
        try {
            if (CodePush.isUsingTestConfiguration()) {
                try {
                    this.mUpdateManager.downloadAndReplaceCurrentBundle(str, this.mCodePush.getAssetsBundleFileName());
                } catch (IOException e) {
                    throw new CodePushUnknownException("Unable to replace current bundle", e);
                }
            }
        } catch (CodePushMalformedDataException | CodePushUnknownException e2) {
            CodePushUtils.log(e2);
        }
    }

    @ReactMethod
    public void clearUpdates() {
        CodePushUtils.log("Clearing updates.");
        this.mCodePush.clearUpdates();
    }
}
