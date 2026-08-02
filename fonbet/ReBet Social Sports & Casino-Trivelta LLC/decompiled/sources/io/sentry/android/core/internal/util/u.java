package io.sentry.android.core.internal.util;

import android.content.Context;
import android.content.pm.PackageManager;
import io.sentry.EnumC4788n3;
import io.sentry.ILogger;
import io.sentry.android.core.C4683i0;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class u {

    /* renamed from: e, reason: collision with root package name */
    public static final Charset f51154e = Charset.forName("UTF-8");

    /* renamed from: a, reason: collision with root package name */
    public final Context f51155a;

    /* renamed from: b, reason: collision with root package name */
    public final C4683i0 f51156b;

    /* renamed from: c, reason: collision with root package name */
    public final ILogger f51157c;

    /* renamed from: d, reason: collision with root package name */
    public final Runtime f51158d;

    @NotNull
    private final String[] rootFiles;

    @NotNull
    private final String[] rootPackages;

    public u(Context context, C4683i0 c4683i0, ILogger iLogger) {
        this(context, c4683i0, iLogger, new String[]{"/sbin/su", "/data/local/xbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/bin/su", "/system/app/Superuser.apk", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su", "/su/bin/su", "/su/bin", "/system/xbin/daemonsu"}, new String[]{"com.devadvance.rootcloak", "com.devadvance.rootcloakplus", "com.koushikdutta.superuser", "com.thirdparty.superuser", "eu.chainfire.supersu", "com.noshufou.android.su"}, Runtime.getRuntime());
    }

    public final boolean a() {
        String a10 = this.f51156b.a();
        return a10 != null && a10.contains("test-keys");
    }

    public final boolean b() {
        for (String str : this.rootFiles) {
            try {
            } catch (RuntimeException e10) {
                this.f51157c.a(EnumC4788n3.ERROR, e10, "Error when trying to check if root file %s exists.", str);
            }
            if (new File(str).exists()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0058, code lost:
    
        if (r2 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005b, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c() {
        Process process = null;
        try {
            try {
                process = this.f51158d.exec(new String[]{"/system/xbin/which", "su"});
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(process.getInputStream(), f51154e));
                try {
                    boolean z10 = bufferedReader.readLine() != null;
                    bufferedReader.close();
                    process.destroy();
                    return z10;
                } finally {
                }
            } finally {
                if (0 != 0) {
                    process.destroy();
                }
            }
        } catch (IOException unused) {
            this.f51157c.c(EnumC4788n3.DEBUG, "SU isn't found on this Device.", new Object[0]);
        } catch (Throwable th2) {
            this.f51157c.b(EnumC4788n3.DEBUG, "Error when trying to check if SU exists.", th2);
        }
    }

    public final boolean d(ILogger iLogger) {
        PackageManager.PackageInfoFlags of2;
        C4683i0 c4683i0 = new C4683i0(iLogger);
        PackageManager packageManager = this.f51155a.getPackageManager();
        if (packageManager != null) {
            for (String str : this.rootPackages) {
                try {
                    if (c4683i0.d() < 33) {
                        packageManager.getPackageInfo(str, 0);
                        return true;
                    }
                    of2 = PackageManager.PackageInfoFlags.of(0L);
                    packageManager.getPackageInfo(str, of2);
                    return true;
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
        }
        return false;
    }

    public boolean e() {
        return a() || b() || c() || d(this.f51157c);
    }

    public u(Context context, C4683i0 c4683i0, ILogger iLogger, String[] strArr, String[] strArr2, Runtime runtime) {
        this.f51155a = (Context) io.sentry.util.w.c(context, "The application context is required.");
        this.f51156b = (C4683i0) io.sentry.util.w.c(c4683i0, "The BuildInfoProvider is required.");
        this.f51157c = (ILogger) io.sentry.util.w.c(iLogger, "The Logger is required.");
        this.rootFiles = (String[]) io.sentry.util.w.c(strArr, "The root Files are required.");
        this.rootPackages = (String[]) io.sentry.util.w.c(strArr2, "The root packages are required.");
        this.f51158d = (Runtime) io.sentry.util.w.c(runtime, "The Runtime is required.");
    }
}
