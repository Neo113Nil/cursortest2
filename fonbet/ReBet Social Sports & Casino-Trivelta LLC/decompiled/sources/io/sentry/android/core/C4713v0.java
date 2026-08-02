package io.sentry.android.core;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Environment;
import android.os.LocaleList;
import android.os.StatFs;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import io.sentry.AbstractC4779m;
import io.sentry.EnumC4788n3;
import io.sentry.F3;
import io.sentry.InterfaceC4765j0;
import io.sentry.P;
import io.sentry.android.core.AbstractC4704q0;
import io.sentry.protocol.C4804f;
import io.sentry.util.C4843a;
import java.io.File;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: io.sentry.android.core.v0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4713v0 {

    /* renamed from: i, reason: collision with root package name */
    public static volatile C4713v0 f51319i;

    /* renamed from: j, reason: collision with root package name */
    public static final C4843a f51320j = new C4843a();

    /* renamed from: a, reason: collision with root package name */
    public final Context f51321a;

    /* renamed from: b, reason: collision with root package name */
    public final SentryAndroidOptions f51322b;

    /* renamed from: c, reason: collision with root package name */
    public final C4683i0 f51323c;

    /* renamed from: d, reason: collision with root package name */
    public final Boolean f51324d;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC4704q0.a f51325e;

    /* renamed from: f, reason: collision with root package name */
    public final AbstractC4704q0.b f51326f;

    /* renamed from: g, reason: collision with root package name */
    public final io.sentry.protocol.o f51327g;

    /* renamed from: h, reason: collision with root package name */
    public final Long f51328h;

    /* renamed from: io.sentry.android.core.v0$a */
    public static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$io$sentry$IConnectionStatusProvider$ConnectionStatus;

        static {
            int[] iArr = new int[P.a.values().length];
            $SwitchMap$io$sentry$IConnectionStatusProvider$ConnectionStatus = iArr;
            try {
                iArr[P.a.DISCONNECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$sentry$IConnectionStatusProvider$ConnectionStatus[P.a.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public C4713v0(Context context, SentryAndroidOptions sentryAndroidOptions) {
        this.f51321a = context;
        this.f51322b = sentryAndroidOptions;
        C4683i0 c4683i0 = new C4683i0(sentryAndroidOptions.getLogger());
        this.f51323c = c4683i0;
        io.sentry.android.core.internal.util.n.a().c();
        this.f51327g = u();
        this.f51324d = c4683i0.f();
        this.f51325e = AbstractC4704q0.v(context, sentryAndroidOptions.getLogger(), c4683i0);
        this.f51326f = AbstractC4704q0.w(context, c4683i0);
        ActivityManager.MemoryInfo n10 = AbstractC4704q0.n(context, sentryAndroidOptions.getLogger());
        if (n10 != null) {
            this.f51328h = Long.valueOf(n10.totalMem);
        } else {
            this.f51328h = null;
        }
    }

    public static Float c(Intent intent, F3 f32) {
        try {
            int intExtra = intent.getIntExtra("level", -1);
            int intExtra2 = intent.getIntExtra("scale", -1);
            if (intExtra != -1 && intExtra2 != -1) {
                return Float.valueOf((intExtra / intExtra2) * 100.0f);
            }
            return null;
        } catch (Throwable th2) {
            f32.getLogger().b(EnumC4788n3.ERROR, "Error getting device battery level.", th2);
            return null;
        }
    }

    public static C4713v0 i(Context context, SentryAndroidOptions sentryAndroidOptions) {
        if (f51319i == null) {
            InterfaceC4765j0 d10 = f51320j.d();
            try {
                if (f51319i == null) {
                    f51319i = new C4713v0(AbstractC4704q0.g(context), sentryAndroidOptions);
                }
                if (d10 != null) {
                    d10.close();
                }
            } catch (Throwable th2) {
                if (d10 != null) {
                    try {
                        d10.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
        return f51319i;
    }

    public static Boolean t(Intent intent, F3 f32) {
        try {
            int intExtra = intent.getIntExtra("plugged", -1);
            boolean z10 = true;
            if (intExtra != 1 && intExtra != 2) {
                z10 = false;
            }
            return Boolean.valueOf(z10);
        } catch (Throwable th2) {
            f32.getLogger().b(EnumC4788n3.ERROR, "Error getting device charging state.", th2);
            return null;
        }
    }

    public C4804f a(boolean z10, boolean z11) {
        String str;
        String str2;
        C4804f c4804f = new C4804f();
        c4804f.b0(Build.MANUFACTURER);
        c4804f.P(Build.BRAND);
        c4804f.V(AbstractC4704q0.l(this.f51322b.getLogger()));
        c4804f.d0(Build.MODEL);
        c4804f.e0(Build.ID);
        c4804f.L(AbstractC4704q0.j());
        if (this.f51323c.d() >= 31) {
            StringBuilder sb2 = new StringBuilder();
            str = Build.SOC_MANUFACTURER;
            sb2.append(str);
            sb2.append(" ");
            str2 = Build.SOC_MODEL;
            sb2.append(str2);
            c4804f.R(sb2.toString());
        }
        c4804f.g0(k());
        Boolean bool = this.f51324d;
        if (bool != null) {
            c4804f.n0(bool);
        }
        DisplayMetrics k10 = AbstractC4704q0.k(this.f51321a, this.f51322b.getLogger());
        if (k10 != null) {
            c4804f.m0(Integer.valueOf(k10.widthPixels));
            c4804f.l0(Integer.valueOf(k10.heightPixels));
            c4804f.j0(Float.valueOf(k10.density));
            c4804f.k0(Integer.valueOf(k10.densityDpi));
        }
        c4804f.O(e());
        c4804f.p0(n());
        if (c4804f.J() == null) {
            c4804f.Y(f());
        }
        Locale locale = Locale.getDefault();
        if (c4804f.K() == null) {
            c4804f.Z(locale.toString());
        }
        List c10 = io.sentry.android.core.internal.util.n.a().c();
        if (!c10.isEmpty()) {
            c4804f.i0(Double.valueOf(((Integer) Collections.max(c10)).doubleValue()));
            c4804f.h0(Integer.valueOf(c10.size()));
        }
        c4804f.c0(this.f51328h);
        if (z10 && this.f51322b.isCollectAdditionalContext()) {
            v(c4804f, z11, this.f51322b.isCollectExternalStorageContext());
        }
        return c4804f;
    }

    public final Intent b() {
        return AbstractC4704q0.u(this.f51321a, this.f51323c, null, new IntentFilter("android.intent.action.BATTERY_CHANGED"), null);
    }

    public final Float d(Intent intent) {
        try {
            int intExtra = intent.getIntExtra("temperature", -1);
            if (intExtra != -1) {
                return Float.valueOf(intExtra / 10.0f);
            }
            return null;
        } catch (Throwable th2) {
            this.f51322b.getLogger().b(EnumC4788n3.ERROR, "Error getting battery temperature.", th2);
            return null;
        }
    }

    public final Date e() {
        try {
            return AbstractC4779m.d(System.currentTimeMillis() - SystemClock.elapsedRealtime());
        } catch (IllegalArgumentException e10) {
            this.f51322b.getLogger().a(EnumC4788n3.ERROR, e10, "Error getting the device's boot time.", new Object[0]);
            return null;
        }
    }

    public final String f() {
        try {
            return D0.a(this.f51321a);
        } catch (Throwable th2) {
            this.f51322b.getLogger().b(EnumC4788n3.ERROR, "Error getting installationId.", th2);
            return null;
        }
    }

    public final File g(File file) {
        File[] externalFilesDirs = this.f51321a.getExternalFilesDirs(null);
        if (externalFilesDirs != null) {
            String absolutePath = file != null ? file.getAbsolutePath() : null;
            for (File file2 : externalFilesDirs) {
                if (file2 != null && (absolutePath == null || absolutePath.isEmpty() || !file2.getAbsolutePath().contains(absolutePath))) {
                    return file2;
                }
            }
        } else {
            this.f51322b.getLogger().c(EnumC4788n3.INFO, "Not possible to read getExternalFilesDirs", new Object[0]);
        }
        return null;
    }

    public final StatFs h(File file) {
        try {
            File g10 = g(file);
            if (g10 != null) {
                return new StatFs(g10.getPath());
            }
            return null;
        } catch (Throwable unused) {
            this.f51322b.getLogger().c(EnumC4788n3.INFO, "Not possible to read external files directory", new Object[0]);
            return null;
        }
    }

    public io.sentry.protocol.o j() {
        return this.f51327g;
    }

    public final C4804f.b k() {
        C4804f.b bVar;
        Throwable th2;
        try {
            bVar = io.sentry.android.core.internal.util.p.a(this.f51321a.getResources().getConfiguration().orientation);
            if (bVar != null) {
                return bVar;
            }
            try {
                this.f51322b.getLogger().c(EnumC4788n3.INFO, "No device orientation available (ORIENTATION_SQUARE|ORIENTATION_UNDEFINED)", new Object[0]);
                return null;
            } catch (Throwable th3) {
                th2 = th3;
                this.f51322b.getLogger().b(EnumC4788n3.ERROR, "Error getting device orientation.", th2);
                return bVar;
            }
        } catch (Throwable th4) {
            bVar = null;
            th2 = th4;
        }
    }

    public AbstractC4704q0.a l() {
        return this.f51325e;
    }

    public AbstractC4704q0.b m() {
        return this.f51326f;
    }

    public final TimeZone n() {
        if (this.f51323c.d() >= 33) {
            LocaleList locales = this.f51321a.getResources().getConfiguration().getLocales();
            if (!locales.isEmpty()) {
                Locale locale = locales.get(0);
                if (locale.getUnicodeLocaleType("tz") != null) {
                    return Calendar.getInstance(locale).getTimeZone();
                }
            }
        }
        return TimeZone.getDefault();
    }

    public final Long o(StatFs statFs) {
        try {
            return Long.valueOf(statFs.getBlockCountLong() * statFs.getBlockSizeLong());
        } catch (Throwable th2) {
            this.f51322b.getLogger().b(EnumC4788n3.ERROR, "Error getting total external storage amount.", th2);
            return null;
        }
    }

    public final Long p(StatFs statFs) {
        try {
            return Long.valueOf(statFs.getBlockCountLong() * statFs.getBlockSizeLong());
        } catch (Throwable th2) {
            this.f51322b.getLogger().b(EnumC4788n3.ERROR, "Error getting total internal storage amount.", th2);
            return null;
        }
    }

    public Long q() {
        return this.f51328h;
    }

    public final Long r(StatFs statFs) {
        try {
            return Long.valueOf(statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong());
        } catch (Throwable th2) {
            this.f51322b.getLogger().b(EnumC4788n3.ERROR, "Error getting unused external storage amount.", th2);
            return null;
        }
    }

    public final Long s(StatFs statFs) {
        try {
            return Long.valueOf(statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong());
        } catch (Throwable th2) {
            this.f51322b.getLogger().b(EnumC4788n3.ERROR, "Error getting unused internal storage amount.", th2);
            return null;
        }
    }

    public final io.sentry.protocol.o u() {
        io.sentry.protocol.o oVar = new io.sentry.protocol.o();
        oVar.j("Android");
        oVar.m(Build.VERSION.RELEASE);
        oVar.h(Build.DISPLAY);
        String m10 = AbstractC4704q0.m(this.f51322b.getLogger());
        if (m10 != null) {
            oVar.i(m10);
        }
        if (this.f51322b.isEnableRootCheck()) {
            oVar.k(Boolean.valueOf(new io.sentry.android.core.internal.util.u(this.f51321a, this.f51323c, this.f51322b.getLogger()).e()));
        }
        return oVar;
    }

    public final void v(C4804f c4804f, boolean z10, boolean z11) {
        StatFs h10;
        Intent b10 = b();
        if (b10 != null) {
            c4804f.M(c(b10, this.f51322b));
            c4804f.Q(t(b10, this.f51322b));
            c4804f.N(d(b10));
        }
        int i10 = a.$SwitchMap$io$sentry$IConnectionStatusProvider$ConnectionStatus[this.f51322b.getConnectionStatusProvider().s0().ordinal()];
        c4804f.f0(i10 != 1 ? i10 != 2 ? null : Boolean.TRUE : Boolean.FALSE);
        ActivityManager.MemoryInfo n10 = AbstractC4704q0.n(this.f51321a, this.f51322b.getLogger());
        if (n10 != null && z10) {
            c4804f.W(Long.valueOf(n10.availMem));
            c4804f.a0(Boolean.valueOf(n10.lowMemory));
        }
        File dataDirectory = Environment.getDataDirectory();
        if (dataDirectory != null) {
            StatFs statFs = new StatFs(dataDirectory.getPath());
            c4804f.o0(p(statFs));
            c4804f.X(s(statFs));
        }
        if (z11 && (h10 = h(this.f51321a.getExternalFilesDir(null))) != null) {
            c4804f.U(o(h10));
            c4804f.T(r(h10));
        }
        if (c4804f.I() == null) {
            c4804f.S(this.f51322b.getConnectionStatusProvider().I());
        }
    }
}
