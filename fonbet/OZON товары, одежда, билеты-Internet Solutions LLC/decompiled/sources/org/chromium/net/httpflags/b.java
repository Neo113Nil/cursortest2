package org.chromium.net.httpflags;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.chromium.net.httpflags.c;
import org.chromium.net.impl.K;

/* loaded from: classes6.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static c f78707a;

    /* renamed from: b, reason: collision with root package name */
    private static String f78708b;

    /* renamed from: c, reason: collision with root package name */
    private static final Object f78709c = new Object();

    public static c a(Context context, String str) {
        Flags b11;
        synchronized (f78709c) {
            try {
                String str2 = f78708b;
                if (str2 != null && !str.equals(str2)) {
                    throw new IllegalStateException("getHttpFlags() called multiple times with different versions");
                }
                c cVar = f78707a;
                if (cVar != null) {
                    return cVar;
                }
                f78708b = str;
                vf.c.c("HttpFlagsLoader#getHttpFlags loading flags");
                try {
                    if (K.c(context)) {
                        b11 = b(context);
                    } else {
                        Log.d("HttpFlagsLoader", "Not loading HTTP flags because they are disabled in the manifest");
                        b11 = null;
                    }
                    if (b11 == null) {
                        b11 = Flags.newBuilder().build();
                    }
                    c d11 = c.d(b11, context.getPackageName(), str);
                    f78707a = d11;
                    c.b bVar = d11.b().get("Cronet_log_me");
                    if (bVar != null) {
                        Log.i("HttpFlagsLoader", "HTTP flags log line (Impl): " + bVar.g());
                    }
                    return f78707a;
                } finally {
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static Flags b(Context context) {
        ApplicationInfo applicationInfo;
        try {
            vf.c.c("HttpFlagsLoader#getProviderApplicationInfo");
            ResolveInfo resolveService = context.getPackageManager().resolveService(new Intent("android.net.http.FLAGS_FILE_PROVIDER"), 1048576);
            if (resolveService == null) {
                Log.i("HttpFlagsLoader", "Unable to resolve the HTTP flags file provider package. This is expected if the host system is not set up to provide HTTP flags.");
                applicationInfo = null;
            } else {
                applicationInfo = resolveService.serviceInfo.applicationInfo;
            }
            if (applicationInfo != null) {
                Log.d("HttpFlagsLoader", "Found application exporting HTTP flags: " + applicationInfo.packageName);
                File file = new File(new File(new File(applicationInfo.deviceProtectedDataDir), "app_httpflags"), "flags.binarypb");
                Log.d("HttpFlagsLoader", "HTTP flags file path: " + file.getAbsolutePath());
                Flags c11 = c(file);
                if (c11 != null) {
                    Log.d("HttpFlagsLoader", "Successfully loaded HTTP flags: " + c11);
                    return c11;
                }
            }
            return null;
        } catch (RuntimeException e11) {
            Log.i("HttpFlagsLoader", "Unable to load HTTP flags file", e11);
            return null;
        }
    }

    private static Flags c(File file) {
        vf.c.c("HttpFlagsLoader#loadFlagsFile");
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                Flags parseDelimitedFrom = Flags.parseDelimitedFrom(fileInputStream);
                fileInputStream.close();
                return parseDelimitedFrom;
            } catch (Throwable th2) {
                try {
                    fileInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (FileNotFoundException unused) {
            Log.i("HttpFlagsLoader", "HTTP flags file `" + file.getPath() + "` is missing. This is expected if HTTP flags functionality is currently disabled in the host system.");
            return null;
        } catch (IOException e11) {
            throw new RuntimeException("Unable to read HTTP flags file", e11);
        }
    }
}
