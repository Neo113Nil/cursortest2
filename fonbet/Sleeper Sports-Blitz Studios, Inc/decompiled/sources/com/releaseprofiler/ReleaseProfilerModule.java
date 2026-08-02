package com.releaseprofiler;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import android.widget.Toast;
import com.facebook.hermes.instrumentation.HermesSamplingProfiler;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import kotlin.Metadata;
import kotlin.io.ByteStreamsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ReleaseProfilerModule.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/releaseprofiler/ReleaseProfilerModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "getReactContext", "()Lcom/facebook/react/bridge/ReactApplicationContext;", "getName", "", "startProfiling", "", "stopProfiling", "", "saveToDownloads", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "Companion", "react-native-release-profiler_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ReleaseProfilerModule extends ReactContextBaseJavaModule {
    public static final String NAME = "ReleaseProfiler";
    private final ReactApplicationContext reactContext;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReleaseProfilerModule(ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.reactContext = reactContext;
    }

    public final ReactApplicationContext getReactContext() {
        return this.reactContext;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public final boolean startProfiling() {
        HermesSamplingProfiler.enable();
        return true;
    }

    @ReactMethod
    public final void stopProfiling(boolean saveToDownloads, Promise promise) {
        FileOutputStream openStream;
        Uri uri;
        Intrinsics.checkNotNullParameter(promise, "promise");
        File createTempFile = File.createTempFile("sampling-profiler-trace", ".cpuprofile", this.reactContext.getCacheDir());
        String path = createTempFile.getPath();
        Intrinsics.checkNotNull(path);
        HermesSamplingProfiler.dumpSampledTraceToFile(path);
        HermesSamplingProfiler.disable();
        Toast.makeText(this.reactContext, "Saved results from Profiler to " + path, 1).show();
        if (saveToDownloads) {
            String name = createTempFile.getName();
            if (Build.VERSION.SDK_INT >= 29) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("_display_name", name);
                contentValues.put("mime_type", "text/plain");
                contentValues.put("relative_path", Environment.DIRECTORY_DOWNLOADS);
                ContentResolver contentResolver = this.reactContext.getContentResolver();
                uri = MediaStore.Downloads.EXTERNAL_CONTENT_URI;
                Uri insert = contentResolver.insert(uri, contentValues);
                if (insert != null) {
                    openStream = new URL("file://" + path).openStream();
                    try {
                        InputStream inputStream = openStream;
                        openStream = contentResolver.openOutputStream(insert);
                        try {
                            OutputStream outputStream = openStream;
                            Intrinsics.checkNotNull(inputStream);
                            Intrinsics.checkNotNull(outputStream);
                            ByteStreamsKt.copyTo(inputStream, outputStream, 8192);
                            CloseableKt.closeFinally(openStream, null);
                            CloseableKt.closeFinally(openStream, null);
                        } finally {
                        }
                    } finally {
                    }
                }
            } else {
                File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), name);
                openStream = new URL("file://" + path).openStream();
                try {
                    InputStream inputStream2 = openStream;
                    openStream = new FileOutputStream(file);
                    try {
                        Intrinsics.checkNotNull(inputStream2);
                        long copyTo$default = ByteStreamsKt.copyTo$default(inputStream2, openStream, 0, 2, null);
                        CloseableKt.closeFinally(openStream, null);
                        Long.valueOf(copyTo$default);
                        CloseableKt.closeFinally(openStream, null);
                    } finally {
                        try {
                            throw th;
                        } finally {
                        }
                    }
                } finally {
                    try {
                        throw th;
                    } finally {
                    }
                }
            }
        }
        promise.resolve(path);
    }
}
