package fr.greweb.reactnativeviewshot;

import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.Log;
import androidx.annotation.NonNull;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.fabric.FabricUIManager;
import com.facebook.react.uimanager.UIManagerHelper;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* loaded from: classes4.dex */
public class RNViewShotModule extends NativeRNViewShotSpec {
    private static final String TEMP_FILE_PREFIX = "ReactNative-snapshot-image";
    private final Executor executor;
    private final ReactApplicationContext reactContext;

    public static class a extends GuardedAsyncTask implements FilenameFilter {

        /* renamed from: a, reason: collision with root package name */
        public final File f46790a;

        /* renamed from: b, reason: collision with root package name */
        public final File f46791b;

        public final void a(File file) {
            File[] listFiles = file.listFiles(this);
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    if (file2.delete()) {
                        file2.getAbsolutePath();
                    }
                }
            }
        }

        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            return str.startsWith(RNViewShotModule.TEMP_FILE_PREFIX);
        }

        public a(ReactContext reactContext) {
            super(reactContext);
            this.f46790a = reactContext.getCacheDir();
            this.f46791b = reactContext.getExternalCacheDir();
        }

        @Override // com.facebook.react.bridge.GuardedAsyncTask
        public void doInBackgroundGuarded(Void... voidArr) {
            File file = this.f46790a;
            if (file != null) {
                a(file);
            }
            File file2 = this.f46791b;
            if (file2 != null) {
                a(file2);
            }
        }
    }

    public RNViewShotModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.executor = Executors.newCachedThreadPool();
        this.reactContext = reactApplicationContext;
    }

    @NonNull
    private File createTempFile(@NonNull Context context, @NonNull String str, String str2) {
        File externalCacheDir = context.getExternalCacheDir();
        File cacheDir = context.getCacheDir();
        if (externalCacheDir == null && cacheDir == null) {
            throw new IOException("No cache directory available");
        }
        if (externalCacheDir == null || (cacheDir != null && externalCacheDir.getFreeSpace() <= cacheDir.getFreeSpace())) {
            externalCacheDir = cacheDir;
        }
        String str3 = "." + str;
        return str2 != null ? File.createTempFile(str2, str3, externalCacheDir) : File.createTempFile(TEMP_FILE_PREFIX, str3, externalCacheDir);
    }

    @Override // fr.greweb.reactnativeviewshot.NativeRNViewShotSpec
    @ReactMethod
    public void captureRef(Double d10, ReadableMap readableMap, Promise promise) {
        int i10 = -1;
        int intValue = d10 == null ? -1 : d10.intValue();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        reactApplicationContext.getResources().getDisplayMetrics();
        String string = readableMap.getString("format");
        if ("jpg".equals(string)) {
            i10 = 0;
        } else if ("webm".equals(string)) {
            i10 = 2;
        } else if (!"raw".equals(string)) {
            i10 = 1;
        }
        double d11 = readableMap.getDouble("quality");
        Integer valueOf = readableMap.hasKey("width") ? Integer.valueOf(readableMap.getInt("width")) : null;
        Integer valueOf2 = readableMap.hasKey("height") ? Integer.valueOf(readableMap.getInt("height")) : null;
        String string2 = readableMap.getString("result");
        String string3 = readableMap.hasKey("fileName") ? readableMap.getString("fileName") : null;
        try {
            ((FabricUIManager) UIManagerHelper.getUIManager(reactApplicationContext, 2)).addUIBlock(new fr.greweb.reactnativeviewshot.a(intValue, string, i10, d11, valueOf, valueOf2, "tmpfile".equals(string2) ? createTempFile(getReactApplicationContext(), string, string3) : null, string2, Boolean.valueOf(readableMap.getBoolean("snapshotContentContainer")), this.reactContext, getCurrentActivity(), readableMap.hasKey("handleGLSurfaceViewOnAndroid") && readableMap.getBoolean("handleGLSurfaceViewOnAndroid"), promise, this.executor));
        } catch (Throwable th2) {
            Log.e(NativeRNViewShotSpec.NAME, "Failed to snapshot view tag " + intValue, th2);
            promise.reject("E_UNABLE_TO_SNAPSHOT", "Failed to snapshot view tag " + intValue);
        }
    }

    @Override // fr.greweb.reactnativeviewshot.NativeRNViewShotSpec
    @ReactMethod
    public void captureScreen(ReadableMap readableMap, Promise promise) {
        captureRef(Double.valueOf(-1.0d), readableMap, promise);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void invalidate() {
        super.invalidate();
        new a(getReactApplicationContext()).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    @Override // fr.greweb.reactnativeviewshot.NativeRNViewShotSpec
    @ReactMethod
    public void releaseCapture(String str) {
        String path = Uri.parse(str).getPath();
        if (path == null) {
            return;
        }
        File file = new File(path);
        if (file.exists()) {
            File parentFile = file.getParentFile();
            if (parentFile.equals(this.reactContext.getExternalCacheDir()) || parentFile.equals(this.reactContext.getCacheDir())) {
                file.delete();
            }
        }
    }
}
