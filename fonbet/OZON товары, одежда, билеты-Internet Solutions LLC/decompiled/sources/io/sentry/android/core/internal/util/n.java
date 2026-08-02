package io.sentry.android.core.internal.util;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import io.sentry.I2;
import io.sentry.ILogger;
import io.sentry.android.core.I;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: g, reason: collision with root package name */
    private static final Charset f67214g = Charset.forName("UTF-8");

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f67215a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final I f67216b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ILogger f67217c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final String[] f67218d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final String[] f67219e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final Runtime f67220f;

    public n(@NotNull Context context, @NotNull ILogger iLogger, @NotNull I i11) {
        Runtime runtime = Runtime.getRuntime();
        this.f67215a = context;
        io.sentry.util.p.b(i11, "The BuildInfoProvider is required.");
        this.f67216b = i11;
        io.sentry.util.p.b(iLogger, "The Logger is required.");
        this.f67217c = iLogger;
        this.f67218d = new String[]{"/sbin/su", "/data/local/xbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/bin/su", "/system/app/Superuser.apk", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su", "/su/bin/su", "/su/bin", "/system/xbin/daemonsu"};
        this.f67219e = new String[]{"com.devadvance.rootcloak", "com.devadvance.rootcloakplus", "com.koushikdutta.superuser", "com.thirdparty.superuser", "eu.chainfire.supersu", "com.noshufou.android.su"};
        io.sentry.util.p.b(runtime, "The Runtime is required.");
        this.f67220f = runtime;
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x008e, code lost:
    
        if (0 == 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0091, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x007f, code lost:
    
        r2.destroy();
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x007d, code lost:
    
        if (0 == 0) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a() {
        boolean z11;
        PackageManager.PackageInfoFlags of2;
        Process exec;
        BufferedReader bufferedReader;
        this.f67216b.getClass();
        String str = Build.TAGS;
        if (str != null && str.contains("test-keys")) {
            return true;
        }
        String[] strArr = this.f67218d;
        int length = strArr.length;
        int i11 = 0;
        while (true) {
            ILogger iLogger = this.f67217c;
            if (i11 < length) {
                String str2 = strArr[i11];
                try {
                } catch (RuntimeException e11) {
                    iLogger.b(I2.ERROR, e11, "Error when trying to check if root file %s exists.", str2);
                }
                if (new File(str2).exists()) {
                    return true;
                }
                i11++;
            } else {
                Process process = null;
                try {
                    try {
                        try {
                            exec = this.f67220f.exec(new String[]{"/system/xbin/which", "su"});
                            bufferedReader = new BufferedReader(new InputStreamReader(exec.getInputStream(), f67214g));
                        } catch (IOException unused) {
                            iLogger.c(I2.DEBUG, "SU isn't found on this Device.", new Object[0]);
                        }
                    } catch (Throwable th2) {
                        iLogger.a(I2.DEBUG, "Error when trying to check if SU exists.", th2);
                    }
                    try {
                        boolean z12 = bufferedReader.readLine() != null;
                        bufferedReader.close();
                        exec.destroy();
                        if (z12) {
                            return true;
                        }
                        new I(iLogger);
                        PackageManager packageManager = this.f67215a.getPackageManager();
                        if (packageManager != null) {
                            for (String str3 : this.f67219e) {
                                try {
                                    if (Build.VERSION.SDK_INT >= 33) {
                                        of2 = PackageManager.PackageInfoFlags.of(0L);
                                        packageManager.getPackageInfo(str3, of2);
                                    } else {
                                        packageManager.getPackageInfo(str3, 0);
                                    }
                                    z11 = true;
                                    return !z11;
                                } catch (PackageManager.NameNotFoundException unused2) {
                                }
                            }
                        }
                        z11 = false;
                        if (!z11) {
                        }
                    } catch (Throwable th3) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                } catch (Throwable th5) {
                    if (0 != 0) {
                        process.destroy();
                    }
                    throw th5;
                }
            }
        }
    }
}
