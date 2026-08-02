package io.sentry.android.core.internal.util;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import io.sentry.ILogger;
import io.sentry.android.core.n0;
import io.sentry.b5;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: g, reason: collision with root package name */
    public static final Charset f15727g = Charset.forName("UTF-8");

    /* renamed from: a, reason: collision with root package name */
    public final Context f15728a;

    /* renamed from: b, reason: collision with root package name */
    public final n0 f15729b;

    /* renamed from: c, reason: collision with root package name */
    public final ILogger f15730c;

    /* renamed from: d, reason: collision with root package name */
    public final String[] f15731d;

    /* renamed from: e, reason: collision with root package name */
    public final String[] f15732e;

    /* renamed from: f, reason: collision with root package name */
    public final Runtime f15733f;

    public j(Context context, ILogger iLogger, n0 n0Var) {
        Runtime runtime = Runtime.getRuntime();
        this.f15728a = context;
        y4.a.C(n0Var, "The BuildInfoProvider is required.");
        this.f15729b = n0Var;
        y4.a.C(iLogger, "The Logger is required.");
        this.f15730c = iLogger;
        this.f15731d = new String[]{"/sbin/su", "/data/local/xbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/bin/su", "/system/app/Superuser.apk", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su", "/su/bin/su", "/su/bin", "/system/xbin/daemonsu"};
        this.f15732e = new String[]{"com.devadvance.rootcloak", "com.devadvance.rootcloakplus", "com.koushikdutta.superuser", "com.thirdparty.superuser", "eu.chainfire.supersu", "com.noshufou.android.su"};
        y4.a.C(runtime, "The Runtime is required.");
        this.f15733f = runtime;
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
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a() {
        boolean z5;
        Process exec;
        BufferedReader bufferedReader;
        this.f15729b.getClass();
        String str = Build.TAGS;
        if (str != null && str.contains("test-keys")) {
            return true;
        }
        String[] strArr = this.f15731d;
        int length = strArr.length;
        int i5 = 0;
        while (true) {
            ILogger iLogger = this.f15730c;
            if (i5 < length) {
                String str2 = strArr[i5];
                try {
                } catch (RuntimeException e7) {
                    iLogger.b(b5.ERROR, e7, "Error when trying to check if root file %s exists.", str2);
                }
                if (new File(str2).exists()) {
                    return true;
                }
                i5++;
            } else {
                Process process = null;
                try {
                    try {
                        try {
                            exec = this.f15733f.exec(new String[]{"/system/xbin/which", "su"});
                            bufferedReader = new BufferedReader(new InputStreamReader(exec.getInputStream(), f15727g));
                        } catch (IOException unused) {
                            iLogger.h(b5.DEBUG, "SU isn't found on this Device.", new Object[0]);
                        }
                    } catch (Throwable th2) {
                        iLogger.e(b5.DEBUG, "Error when trying to check if SU exists.", th2);
                    }
                    try {
                        boolean z7 = bufferedReader.readLine() != null;
                        bufferedReader.close();
                        exec.destroy();
                        if (z7) {
                            return true;
                        }
                        y4.a.C(iLogger, "The ILogger object is required.");
                        PackageManager packageManager = this.f15728a.getPackageManager();
                        if (packageManager != null) {
                            for (String str3 : this.f15732e) {
                                try {
                                    if (Build.VERSION.SDK_INT >= 33) {
                                        packageManager.getPackageInfo(str3, PackageManager.PackageInfoFlags.of(0L));
                                    } else {
                                        packageManager.getPackageInfo(str3, 0);
                                    }
                                    z5 = true;
                                    return !z5;
                                } catch (PackageManager.NameNotFoundException unused2) {
                                }
                            }
                        }
                        z5 = false;
                        if (!z5) {
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
