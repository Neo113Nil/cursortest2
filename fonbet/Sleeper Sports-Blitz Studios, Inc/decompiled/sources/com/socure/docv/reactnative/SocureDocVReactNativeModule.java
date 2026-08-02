package com.socure.docv.reactnative;

import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.socure.docv.capturesdk.api.Platform;
import com.socure.docv.capturesdk.api.SocureDocVContext;
import com.socure.docv.capturesdk.api.SocureDocVError;
import com.socure.docv.capturesdk.api.SocureSdk;
import com.socure.docv.capturesdk.common.utils.ResultListener;
import com.socure.docv.capturesdk.common.utils.SocureDocVFailure;
import com.socure.docv.capturesdk.common.utils.SocureDocVSuccess;
import com.socure.docv.capturesdk.common.utils.SocureResult;
import com.turboimage.events.SuccessEvent;
import io.radar.sdk.RadarTrackingOptions;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SocureDocVReactNativeModule.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u000e\u001a\u00020\bH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J\u0018\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\fH\u0007J0\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\fH\u0007J\u0018\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\fH\u0002J*\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\n2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u0010\u0010!\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020 H\u0016J\u0010\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0002J\u0010\u0010'\u001a\u00020\b2\u0006\u0010(\u001a\u00020)H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082D¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/socure/docv/reactnative/SocureDocVReactNativeModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "Lcom/facebook/react/bridge/ActivityEventListener;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "TAG", "", "SOCURE_SDK_REQUEST_CODE", "", "onSuccessCallback", "Lcom/facebook/react/bridge/Callback;", "onErrorCallback", "getName", "initDocVSdk", "", "verificationToken", "publicKey", "useSocureGov", "", "launchDocVSdk", SuccessEvent.EVENT_NAME, "onError", "launchSocureDocV", "setupLaunch", "onActivityResult", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ACTIVITY, "Landroid/app/Activity;", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onNewIntent", SDKConstants.PARAM_INTENT, "convertResultToReadbleMap", "Lcom/facebook/react/bridge/ReadableMap;", "result", "Lcom/socure/docv/capturesdk/common/utils/SocureResult;", "getErrorMessage", "socureDocVError", "Lcom/socure/docv/capturesdk/api/SocureDocVError;", "socure-inc_docv-react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SocureDocVReactNativeModule extends ReactContextBaseJavaModule implements ActivityEventListener {
    private final int SOCURE_SDK_REQUEST_CODE;
    private final String TAG;
    private Callback onErrorCallback;
    private Callback onSuccessCallback;

    /* compiled from: SocureDocVReactNativeModule.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SocureDocVError.values().length];
            try {
                iArr[SocureDocVError.NO_INTERNET_CONNECTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SocureDocVError.SESSION_INITIATION_FAILURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SocureDocVError.CAMERA_PERMISSION_DECLINED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SocureDocVError.CONSENT_DECLINED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SocureDocVError.DOCUMENT_UPLOAD_FAILURE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[SocureDocVError.INVALID_DOCV_TRANSACTION_TOKEN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[SocureDocVError.INVALID_PUBLIC_KEY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[SocureDocVError.SESSION_EXPIRED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[SocureDocVError.USER_CANCELED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onNewIntent(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SocureDocVReactNativeModule(ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.TAG = "SDLT_RN";
        this.SOCURE_SDK_REQUEST_CODE = 753;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "SocureDocVReactNative";
    }

    @ReactMethod
    public final void initDocVSdk(String verificationToken, String publicKey, boolean useSocureGov) {
        Intrinsics.checkNotNullParameter(verificationToken, "verificationToken");
        Intrinsics.checkNotNullParameter(publicKey, "publicKey");
        Log.d(this.TAG, "initDocVSdk - init native sdk");
        SocureSdk.initSdk(new SocureDocVContext(verificationToken, publicKey, useSocureGov, null, null));
    }

    @ReactMethod
    public final void launchDocVSdk(Callback onSuccess, Callback onError) {
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onError, "onError");
        Log.d(this.TAG, "launchDocVSdk - launch using experimental api");
        setupLaunch(onSuccess, onError);
        Activity currentActivity = getReactApplicationContext().getCurrentActivity();
        if (currentActivity == null) {
            Log.e(this.TAG, "Aborting since app activity object is null");
        } else {
            currentActivity.startActivityForResult(SocureSdk.getIntent(currentActivity), this.SOCURE_SDK_REQUEST_CODE);
        }
    }

    @ReactMethod
    public final void launchSocureDocV(String verificationToken, String publicKey, boolean useSocureGov, Callback onSuccess, Callback onError) {
        Intrinsics.checkNotNullParameter(verificationToken, "verificationToken");
        Intrinsics.checkNotNullParameter(publicKey, "publicKey");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onError, "onError");
        Log.d(this.TAG, "launchSocureDocV - launch Socure SDK");
        setupLaunch(onSuccess, onError);
        Activity currentActivity = getReactApplicationContext().getCurrentActivity();
        if (currentActivity == null) {
            Log.e(this.TAG, "Aborting since app activity object is null");
        } else {
            currentActivity.startActivityForResult(SocureSdk.getIntent(currentActivity, new SocureDocVContext(verificationToken, publicKey, useSocureGov, null, null)), this.SOCURE_SDK_REQUEST_CODE);
        }
    }

    private final void setupLaunch(Callback onSuccess, Callback onError) {
        this.onSuccessCallback = onSuccess;
        this.onErrorCallback = onError;
        Log.d(this.TAG, "launchSocureDocV - registering activity event listener");
        getReactApplicationContext().addActivityEventListener(this);
        SocureSdk.setSource(Platform.REACT_NATIVE);
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onActivityResult(Activity activity, int requestCode, int resultCode, Intent data) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (requestCode == this.SOCURE_SDK_REQUEST_CODE) {
            if (data != null) {
                SocureSdk.getResult(data, new ResultListener() { // from class: com.socure.docv.reactnative.SocureDocVReactNativeModule$$ExternalSyntheticLambda0
                    @Override // com.socure.docv.capturesdk.common.utils.ResultListener
                    public final void onResult(SocureResult socureResult) {
                        SocureDocVReactNativeModule.onActivityResult$lambda$3$lambda$2(SocureDocVReactNativeModule.this, socureResult);
                    }
                });
            }
            Log.d(this.TAG, "onActivityResult - requestCode matched, removing activity event listener");
            getReactApplicationContext().removeActivityEventListener(this);
            return;
        }
        Log.d(this.TAG, "onActivityResult - requestCode does not match: " + requestCode + ", not removing activity event listener");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onActivityResult$lambda$3$lambda$2(SocureDocVReactNativeModule socureDocVReactNativeModule, SocureResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        Log.d(socureDocVReactNativeModule.TAG, "onResult called: " + result);
        if (result instanceof SocureDocVSuccess) {
            Callback callback = socureDocVReactNativeModule.onSuccessCallback;
            if (callback != null) {
                callback.invoke(socureDocVReactNativeModule.convertResultToReadbleMap(result));
                return;
            }
            return;
        }
        Callback callback2 = socureDocVReactNativeModule.onErrorCallback;
        if (callback2 != null) {
            callback2.invoke(socureDocVReactNativeModule.convertResultToReadbleMap(result));
        }
    }

    private final ReadableMap convertResultToReadbleMap(SocureResult result) {
        WritableMap createMap = Arguments.createMap();
        if (result instanceof SocureDocVSuccess) {
            createMap.putString("deviceSessionToken", ((SocureDocVSuccess) result).getDeviceSessionToken());
        } else {
            createMap.putString("deviceSessionToken", result.getDeviceSessionToken());
            Intrinsics.checkNotNull(result, "null cannot be cast to non-null type com.socure.docv.capturesdk.common.utils.SocureDocVFailure");
            createMap.putString("error", getErrorMessage(((SocureDocVFailure) result).getError()));
        }
        return createMap;
    }

    private final String getErrorMessage(SocureDocVError socureDocVError) {
        switch (WhenMappings.$EnumSwitchMapping$0[socureDocVError.ordinal()]) {
            case 1:
                return "No internet connection";
            case 2:
                return "Failed to initiate the session";
            case 3:
                return "Permissions to open the camera declined by the user";
            case 4:
                return "Consent declined by the user";
            case 5:
                return "Failed to upload the documents";
            case 6:
                return "Invalid transaction token";
            case 7:
                return "Invalid or missing SDK key";
            case 8:
                return "Session expired";
            case 9:
                return "Scan canceled by the user";
            default:
                return "Unknown error";
        }
    }
}
