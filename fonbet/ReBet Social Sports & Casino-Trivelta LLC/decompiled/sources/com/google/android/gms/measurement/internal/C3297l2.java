package com.google.android.gms.measurement.internal;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC3191o;
import java.math.BigInteger;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: com.google.android.gms.measurement.internal.l2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3297l2 extends AbstractC3225c2 {

    /* renamed from: c, reason: collision with root package name */
    public String f34104c;

    /* renamed from: d, reason: collision with root package name */
    public String f34105d;

    /* renamed from: e, reason: collision with root package name */
    public int f34106e;

    /* renamed from: f, reason: collision with root package name */
    public String f34107f;

    /* renamed from: g, reason: collision with root package name */
    public String f34108g;

    /* renamed from: h, reason: collision with root package name */
    public long f34109h;

    /* renamed from: i, reason: collision with root package name */
    public final long f34110i;

    /* renamed from: j, reason: collision with root package name */
    public final long f34111j;

    /* renamed from: k, reason: collision with root package name */
    public List f34112k;

    /* renamed from: l, reason: collision with root package name */
    public String f34113l;

    /* renamed from: m, reason: collision with root package name */
    public int f34114m;

    /* renamed from: n, reason: collision with root package name */
    public String f34115n;

    /* renamed from: o, reason: collision with root package name */
    public String f34116o;

    /* renamed from: p, reason: collision with root package name */
    public long f34117p;

    /* renamed from: q, reason: collision with root package name */
    public String f34118q;

    public C3297l2(C3298l3 c3298l3, long j10, long j11) {
        super(c3298l3);
        this.f34117p = 0L;
        this.f34118q = null;
        this.f34110i = j10;
        this.f34111j = j11;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC3225c2
    public final boolean m() {
        return true;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:0|1|(1:3)(6:59|60|(1:62)(2:77|(1:79))|63|64|(16:66|(1:68)(1:75)|69|70|5|(2:7|(2:9|(2:11|(2:13|(2:15|(2:17|(1:19)(1:52))(1:53))(1:54))(1:55))(1:56))(1:57))(1:58)|20|21|22|(1:24)(1:49)|25|(1:27)|29|(3:31|(1:33)(3:40|(3:43|(1:45)(1:46)|41)|47)|(2:35|36)(2:38|39))|48|(0)(0)))|4|5|(0)(0)|20|21|22|(0)(0)|25|(0)|29|(0)|48|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0199, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x019a, code lost:
    
        r11.f33578a.a().o().c("Fetching Google App Id failed with exception. appId", com.google.android.gms.measurement.internal.C3392x2.x(r1), r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0187 A[Catch: IllegalStateException -> 0x0199, TRY_LEAVE, TryCatch #2 {IllegalStateException -> 0x0199, blocks: (B:22:0x016d, B:25:0x0183, B:27:0x0187), top: B:21:0x016d }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00c7  */
    @Override // com.google.android.gms.measurement.internal.AbstractC3225c2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n() {
        String str;
        String str2;
        PackageInfo packageInfo;
        int h10;
        List K10;
        String a10;
        C3298l3 c3298l3 = this.f33578a;
        c3298l3.a().w().c("sdkVersion bundled with app, dynamiteVersion", Long.valueOf(this.f34111j), Long.valueOf(this.f34110i));
        String packageName = c3298l3.d().getPackageName();
        PackageManager packageManager = c3298l3.d().getPackageManager();
        String str3 = "";
        int i10 = Integer.MIN_VALUE;
        String str4 = "Unknown";
        String str5 = "unknown";
        if (packageManager == null) {
            c3298l3.a().o().b("PackageManager is null, app identity information might be inaccurate. appId", C3392x2.x(packageName));
        } else {
            try {
                str5 = packageManager.getInstallerPackageName(packageName);
            } catch (IllegalArgumentException unused) {
                this.f33578a.a().o().b("Error retrieving app installer package name. appId", C3392x2.x(packageName));
            }
            if (str5 == null) {
                str5 = "manual_install";
            } else if ("com.android.vending".equals(str5)) {
                str5 = "";
            }
            try {
                packageInfo = packageManager.getPackageInfo(this.f33578a.d().getPackageName(), 0);
            } catch (PackageManager.NameNotFoundException unused2) {
                str = "Unknown";
            }
            if (packageInfo != null) {
                CharSequence applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                str2 = !TextUtils.isEmpty(applicationLabel) ? applicationLabel.toString() : "Unknown";
                try {
                    str4 = packageInfo.versionName;
                    i10 = packageInfo.versionCode;
                } catch (PackageManager.NameNotFoundException unused3) {
                    str = str4;
                    str4 = str2;
                    this.f33578a.a().o().c("Error retrieving package info. appId, appName", C3392x2.x(packageName), str4);
                    str2 = str4;
                    str4 = str;
                    this.f34104c = packageName;
                    this.f34107f = str5;
                    this.f34105d = str4;
                    this.f34106e = i10;
                    this.f34108g = str2;
                    this.f34109h = 0L;
                    C3298l3 c3298l32 = this.f33578a;
                    h10 = c3298l32.h();
                    if (h10 == 0) {
                    }
                    this.f34115n = "";
                    C3298l3 c3298l33 = this.f33578a;
                    c3298l33.c();
                    a10 = AbstractC3260g5.a(c3298l33.d(), "google_app_id", c3298l32.H());
                    if (!TextUtils.isEmpty(a10)) {
                    }
                    this.f34115n = str3;
                    if (h10 == 0) {
                    }
                    this.f34112k = null;
                    C3298l3 c3298l34 = this.f33578a;
                    c3298l34.c();
                    K10 = c3298l34.w().K("analytics.safelisted_events");
                    if (K10 != null) {
                    }
                    this.f34112k = K10;
                    if (packageManager == null) {
                    }
                }
                this.f34104c = packageName;
                this.f34107f = str5;
                this.f34105d = str4;
                this.f34106e = i10;
                this.f34108g = str2;
                this.f34109h = 0L;
                C3298l3 c3298l322 = this.f33578a;
                h10 = c3298l322.h();
                if (h10 == 0) {
                    this.f33578a.a().w().a("App measurement collection enabled");
                } else if (h10 == 1) {
                    this.f33578a.a().u().a("App measurement deactivated via the manifest");
                } else if (h10 == 3) {
                    this.f33578a.a().u().a("App measurement disabled by setAnalyticsCollectionEnabled(false)");
                } else if (h10 == 4) {
                    this.f33578a.a().u().a("App measurement disabled via the manifest");
                } else if (h10 == 6) {
                    this.f33578a.a().t().a("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
                } else if (h10 == 7) {
                    this.f33578a.a().u().a("App measurement disabled via the global data collection setting");
                } else if (h10 != 8) {
                    C3298l3 c3298l35 = this.f33578a;
                    c3298l35.a().u().a("App measurement disabled");
                    c3298l35.a().p().a("Invalid scion state in identity");
                } else {
                    this.f33578a.a().u().a("App measurement disabled due to denied storage consent");
                }
                this.f34115n = "";
                C3298l3 c3298l332 = this.f33578a;
                c3298l332.c();
                a10 = AbstractC3260g5.a(c3298l332.d(), "google_app_id", c3298l322.H());
                if (!TextUtils.isEmpty(a10)) {
                    str3 = a10;
                }
                this.f34115n = str3;
                if (h10 == 0) {
                    c3298l332.a().w().c("App measurement enabled for app package, google app id", this.f34104c, this.f34115n);
                }
                this.f34112k = null;
                C3298l3 c3298l342 = this.f33578a;
                c3298l342.c();
                K10 = c3298l342.w().K("analytics.safelisted_events");
                if (K10 != null) {
                    if (K10.isEmpty()) {
                        c3298l342.a().t().a("Safelisted event list is empty. Ignoring");
                    } else {
                        Iterator it = K10.iterator();
                        while (it.hasNext()) {
                            if (!c3298l342.C().u0("safelisted event", (String) it.next())) {
                                break;
                            }
                        }
                    }
                    if (packageManager == null) {
                        this.f34114m = M9.b.a(c3298l342.d()) ? 1 : 0;
                        return;
                    } else {
                        this.f34114m = 0;
                        return;
                    }
                }
                this.f34112k = K10;
                if (packageManager == null) {
                }
            }
        }
        str2 = "Unknown";
        this.f34104c = packageName;
        this.f34107f = str5;
        this.f34105d = str4;
        this.f34106e = i10;
        this.f34108g = str2;
        this.f34109h = 0L;
        C3298l3 c3298l3222 = this.f33578a;
        h10 = c3298l3222.h();
        if (h10 == 0) {
        }
        this.f34115n = "";
        C3298l3 c3298l3322 = this.f33578a;
        c3298l3322.c();
        a10 = AbstractC3260g5.a(c3298l3322.d(), "google_app_id", c3298l3222.H());
        if (!TextUtils.isEmpty(a10)) {
        }
        this.f34115n = str3;
        if (h10 == 0) {
        }
        this.f34112k = null;
        C3298l3 c3298l3422 = this.f33578a;
        c3298l3422.c();
        K10 = c3298l3422.w().K("analytics.safelisted_events");
        if (K10 != null) {
        }
        this.f34112k = K10;
        if (packageManager == null) {
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v0 com.google.android.gms.measurement.internal.zzr, still in use, count: 2, list:
          (r2v0 com.google.android.gms.measurement.internal.zzr) from 0x018d: MOVE (r21v1 com.google.android.gms.measurement.internal.zzr) = (r2v0 com.google.android.gms.measurement.internal.zzr) (LINE:398)
          (r2v0 com.google.android.gms.measurement.internal.zzr) from 0x0188: MOVE (r21v4 com.google.android.gms.measurement.internal.zzr) = (r2v0 com.google.android.gms.measurement.internal.zzr) (LINE:393)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:447)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    public final com.google.android.gms.measurement.internal.zzr o(java.lang.String r45) {
        /*
            Method dump skipped, instructions count: 847
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C3297l2.o(java.lang.String):com.google.android.gms.measurement.internal.zzr");
    }

    public final void p() {
        String format;
        h();
        C3298l3 c3298l3 = this.f33578a;
        if (c3298l3.x().w().o(U3.ANALYTICS_STORAGE)) {
            byte[] bArr = new byte[16];
            c3298l3.C().q0().nextBytes(bArr);
            format = String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        } else {
            c3298l3.a().v().a("Analytics Storage consent is not granted");
            format = null;
        }
        c3298l3.a().v().a(String.format("Resetting session stitching token to %s", format == null ? "null" : "not null"));
        this.f34116o = format;
        this.f34117p = c3298l3.e().a();
    }

    public final String q() {
        j();
        AbstractC3191o.m(this.f34104c);
        return this.f34104c;
    }

    public final String r() {
        h();
        j();
        AbstractC3191o.m(this.f34115n);
        return this.f34115n;
    }

    public final String s() {
        j();
        AbstractC3191o.m(this.f34108g);
        return this.f34108g;
    }

    public final int t() {
        j();
        return this.f34106e;
    }

    public final long u() {
        return this.f34111j;
    }

    public final int v() {
        j();
        return this.f34114m;
    }

    public final List w() {
        return this.f34112k;
    }

    public final boolean x(String str) {
        String str2 = this.f34118q;
        boolean z10 = false;
        if (str2 != null && !str2.equals(str)) {
            z10 = true;
        }
        this.f34118q = str;
        return z10;
    }
}
