package org.maplibre.android.storage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Environment;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.File;
import java.util.concurrent.locks.ReentrantLock;
import org.maplibre.android.MapLibre;
import org.maplibre.android.b;
import org.maplibre.android.log.Logger;
import org.maplibre.android.util.TileServerOptions;
import org.maplibre.android.utils.e;

/* loaded from: classes10.dex */
public class FileSource {

    /* renamed from: a, reason: collision with root package name */
    private static final ReentrantLock f79979a = new ReentrantLock();

    /* renamed from: b, reason: collision with root package name */
    private static final ReentrantLock f79980b = new ReentrantLock();

    /* renamed from: c, reason: collision with root package name */
    private static String f79981c;

    /* renamed from: d, reason: collision with root package name */
    private static String f79982d;

    /* renamed from: e, reason: collision with root package name */
    private static FileSource f79983e;

    @Keep
    private long nativePtr;

    @Keep
    public interface ResourceTransformCallback {
        String onURL(int i11, String str);
    }

    @Keep
    public interface ResourcesCachePathChangeCallback {
        void onError(@NonNull String str);

        void onSuccess(@NonNull String str);
    }

    private static class a extends AsyncTask<Context, Void, Void> {
        @Override // android.os.AsyncTask
        protected final Void doInBackground(Context[] contextArr) {
            Context[] contextArr2 = contextArr;
            FileSource.d(contextArr2[0]);
            FileSource.c(contextArr2[0]);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0057  */
    @NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String a(@NonNull Context context) {
        boolean z11;
        boolean z12;
        File externalFilesDir;
        Bundle bundle;
        String string = context.getSharedPreferences("MapboxSharedPreferences", 0).getString("fileSourceResourcesCachePath", null);
        if (!((string == null || string.isEmpty()) ? false : new File(string).canWrite())) {
            try {
                bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), UserVerificationMethods.USER_VERIFY_PATTERN).metaData;
            } catch (PackageManager.NameNotFoundException e11) {
                Logger.e("Mbgl-FileSource", "Failed to read the package metadata: ", e11);
                b.b(e11);
            } catch (Exception e12) {
                Logger.e("Mbgl-FileSource", "Failed to read the storage key: ", e12);
                b.b(e12);
            }
            if (bundle != null) {
                z11 = bundle.getBoolean("com.mapbox.SetStorageExternal", false);
                if (z11) {
                    String externalStorageState = Environment.getExternalStorageState();
                    if ("mounted".equals(externalStorageState) || "mounted_ro".equals(externalStorageState)) {
                        z12 = true;
                    } else {
                        Logger.w("Mbgl-FileSource", "External storage was requested but it isn't readable. For API level < 18 make sure you've requested READ_EXTERNAL_STORAGE or WRITE_EXTERNAL_STORAGE permissions in your app Manifest (defaulting to internal storage).");
                        z12 = false;
                    }
                    if (z12 && (externalFilesDir = context.getExternalFilesDir(null)) != null) {
                        string = externalFilesDir.getAbsolutePath();
                        context.getSharedPreferences("MapboxSharedPreferences", 0).edit().remove("fileSourceResourcesCachePath").apply();
                    }
                }
                string = context.getFilesDir().getAbsolutePath();
                context.getSharedPreferences("MapboxSharedPreferences", 0).edit().remove("fileSourceResourcesCachePath").apply();
            }
            z11 = false;
            if (z11) {
            }
            string = context.getFilesDir().getAbsolutePath();
            context.getSharedPreferences("MapboxSharedPreferences", 0).edit().remove("fileSourceResourcesCachePath").apply();
        }
        return string;
    }

    public static synchronized FileSource b(@NonNull Context context) {
        FileSource fileSource;
        synchronized (FileSource.class) {
            try {
                if (f79983e == null) {
                    String d11 = d(context);
                    FileSource fileSource2 = new FileSource();
                    fileSource2.initialize(MapLibre.getApiKey(), d11, MapLibre.getTileServerOptions());
                    f79983e = fileSource2;
                }
                fileSource = f79983e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return fileSource;
    }

    public static String c(@NonNull Context context) {
        ReentrantLock reentrantLock = f79980b;
        reentrantLock.lock();
        try {
            if (f79982d == null) {
                f79982d = context.getCacheDir().getAbsolutePath();
            }
            String str = f79982d;
            reentrantLock.unlock();
            return str;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    @NonNull
    public static String d(@NonNull Context context) {
        ReentrantLock reentrantLock = f79979a;
        reentrantLock.lock();
        try {
            if (f79981c == null) {
                f79981c = a(context);
            }
            String str = f79981c;
            reentrantLock.unlock();
            return str;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public static void e(Context context) {
        e.a("Mbgl-FileSource");
        new a().execute(context);
    }

    @Keep
    private native void initialize(String str, String str2, TileServerOptions tileServerOptions);

    @Keep
    private native void setResourceCachePath(String str, ResourcesCachePathChangeCallback resourcesCachePathChangeCallback);

    @Keep
    public native void activate();

    @Keep
    public native void deactivate();

    @Keep
    protected native void finalize() throws Throwable;

    @NonNull
    @Keep
    public native String getApiBaseUrl();

    @NonNull
    @Keep
    public native String getApiKey();

    @Keep
    public native boolean isActivated();

    @Keep
    public native void setApiBaseUrl(String str);

    @Keep
    public native void setApiKey(String str);

    @Keep
    public native void setResourceTransform(ResourceTransformCallback resourceTransformCallback);

    @Keep
    public native void setTileServerOptions(TileServerOptions tileServerOptions);
}
