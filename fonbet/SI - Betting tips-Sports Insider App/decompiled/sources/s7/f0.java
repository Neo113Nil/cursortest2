package s7;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import com.google.android.gms.internal.measurement.o8;
import com.google.android.gms.measurement.internal.zzr;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f0 extends z {

    /* renamed from: c, reason: collision with root package name */
    public String f22727c;

    /* renamed from: d, reason: collision with root package name */
    public String f22728d;

    /* renamed from: e, reason: collision with root package name */
    public int f22729e;

    /* renamed from: f, reason: collision with root package name */
    public String f22730f;

    /* renamed from: g, reason: collision with root package name */
    public String f22731g;

    /* renamed from: h, reason: collision with root package name */
    public long f22732h;

    /* renamed from: i, reason: collision with root package name */
    public final long f22733i;
    public final long j;

    /* renamed from: k, reason: collision with root package name */
    public List f22734k;

    /* renamed from: l, reason: collision with root package name */
    public String f22735l;

    /* renamed from: m, reason: collision with root package name */
    public int f22736m;

    /* renamed from: n, reason: collision with root package name */
    public String f22737n;

    /* renamed from: o, reason: collision with root package name */
    public String f22738o;

    /* renamed from: p, reason: collision with root package name */
    public long f22739p;
    public String q;

    public f0(f1 f1Var, long j, long j6) {
        super(f1Var);
        this.f22739p = 0L;
        this.q = null;
        this.f22733i = j;
        this.j = j6;
    }

    @Override // s7.z
    public final boolean m() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x025d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0109  */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v1 */
    /* JADX WARN: Type inference failed for: r21v3 */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzr n(String str) {
        String str2;
        String str3;
        boolean z5;
        long j;
        boolean z7;
        Class<?> loadClass;
        long j6;
        String str4;
        long a7;
        int i5;
        String str5;
        f1 f1Var;
        boolean z10;
        int i10;
        int i11;
        long j10;
        ApplicationInfo a10;
        w wVar;
        int i12;
        j();
        String p10 = p();
        String q = q();
        k();
        String str6 = this.f22728d;
        k();
        long j11 = this.f22729e;
        k();
        g6.v.h(this.f22730f);
        String str7 = this.f22730f;
        f1 f1Var2 = (f1) this.f3328a;
        e eVar = f1Var2.f22743d;
        n0 n0Var = f1Var2.f22745f;
        e eVar2 = f1Var2.f22743d;
        Context context = f1Var2.f22740a;
        v3 v3Var = f1Var2.f22748i;
        v0 v0Var = f1Var2.f22744e;
        eVar.o();
        k();
        j();
        long j12 = this.f22732h;
        long j13 = 0;
        if (j12 == 0) {
            f1.k(v3Var);
            f1 f1Var3 = (f1) v3Var.f3328a;
            String packageName = context.getPackageName();
            v3Var.j();
            g6.v.e(packageName);
            PackageManager packageManager = context.getPackageManager();
            z5 = 0;
            MessageDigest A = v3.A();
            long j14 = -1;
            if (A == null) {
                n0 n0Var2 = f1Var3.f22745f;
                f1.m(n0Var2);
                n0Var2.f22903f.a("Could not get MD5 instance");
                str2 = q;
                str3 = str6;
            } else {
                if (packageManager != null) {
                    try {
                        if (v3Var.O(context, packageName)) {
                            str2 = q;
                            str3 = str6;
                            j14 = 0;
                        } else {
                            str2 = q;
                            try {
                                str3 = str6;
                                try {
                                    Signature[] signatureArr = s6.c.a(context).b(64, f1Var3.f22740a.getPackageName()).signatures;
                                    if (signatureArr == null || signatureArr.length <= 0) {
                                        n0 n0Var3 = f1Var3.f22745f;
                                        f1.m(n0Var3);
                                        n0Var3.f22906i.a("Could not get signatures");
                                    } else {
                                        j14 = v3.B(A.digest(signatureArr[0].toByteArray()));
                                    }
                                } catch (PackageManager.NameNotFoundException e7) {
                                    e = e7;
                                    n0 n0Var4 = f1Var3.f22745f;
                                    f1.m(n0Var4);
                                    n0Var4.f22903f.b(e, "Package name not found");
                                    j = 0;
                                    this.f22732h = j;
                                    boolean d10 = f1Var2.d();
                                    f1.k(v0Var);
                                    boolean z11 = !v0Var.f23137r;
                                    j();
                                    if (f1Var2.d()) {
                                    }
                                    j6 = j;
                                    str4 = null;
                                    long j15 = f1Var2.D;
                                    f1.k(v0Var);
                                    a7 = v0Var.f23127f.a();
                                    if (a7 != 0) {
                                    }
                                    k();
                                    int i13 = this.f22736m;
                                    Boolean v5 = eVar2.v("google_analytics_adid_collection_enabled");
                                    if (v5 != null) {
                                    }
                                    f1.k(v0Var);
                                    v0Var.j();
                                    String str8 = str4;
                                    long j16 = j15;
                                    boolean z12 = v0Var.n().getBoolean("deferred_analytics_collection", z5);
                                    Boolean valueOf = Boolean.valueOf(eVar2.y("google_analytics_default_allow_ad_personalization_signals", true) == n1.GRANTED);
                                    List list = this.f22734k;
                                    String g10 = v0Var.q().g();
                                    if (this.f22735l == null) {
                                    }
                                    String str9 = this.f22735l;
                                    if (v0Var.q().i(p1.ANALYTICS_STORAGE)) {
                                    }
                                    Boolean v10 = eVar2.v("google_analytics_sgtm_upload_enabled");
                                    if (v10 != null) {
                                    }
                                    f1.k(v3Var);
                                    f1Var = (f1) v3Var.f3328a;
                                    String str10 = str5;
                                    String p11 = p();
                                    boolean z13 = r3;
                                    if (f1Var.f22740a.getPackageManager() != null) {
                                    }
                                    f1.k(v0Var);
                                    int i14 = v0Var.q().f22966b;
                                    f1.k(v0Var);
                                    v0Var.j();
                                    String str11 = l.b(v0Var.n().getString("dma_consent_settings", null)).f22862b;
                                    o8.a();
                                    wVar = x.R0;
                                    if (eVar2.t(null, wVar)) {
                                    }
                                    o8.a();
                                    if (eVar2.t(null, wVar)) {
                                    }
                                    String str12 = eVar2.f22690c;
                                    String valueOf2 = String.valueOf(q1.h(eVar2.y("google_analytics_default_allow_ad_personalization_signals", true)));
                                    long j17 = f1Var2.D;
                                    f1.j(f1Var2.f22758u);
                                    return new zzr(p10, str2, str3, j11, str7, 133005L, j6, str, z7, z11, str8, j16, i5, z10, z12, valueOf, this.f22733i, list, g10, str9, str10, z13, j10, i14, str11, i12, j13, str12, valueOf2, j17, androidx.appcompat.widget.c1.e(f1Var2.f22758u.o()));
                                }
                            } catch (PackageManager.NameNotFoundException e9) {
                                e = e9;
                                str3 = str6;
                                n0 n0Var42 = f1Var3.f22745f;
                                f1.m(n0Var42);
                                n0Var42.f22903f.b(e, "Package name not found");
                                j = 0;
                                this.f22732h = j;
                                boolean d102 = f1Var2.d();
                                f1.k(v0Var);
                                boolean z112 = !v0Var.f23137r;
                                j();
                                if (f1Var2.d()) {
                                }
                                j6 = j;
                                str4 = null;
                                long j152 = f1Var2.D;
                                f1.k(v0Var);
                                a7 = v0Var.f23127f.a();
                                if (a7 != 0) {
                                }
                                k();
                                int i132 = this.f22736m;
                                Boolean v52 = eVar2.v("google_analytics_adid_collection_enabled");
                                if (v52 != null) {
                                }
                                f1.k(v0Var);
                                v0Var.j();
                                String str82 = str4;
                                long j162 = j152;
                                boolean z122 = v0Var.n().getBoolean("deferred_analytics_collection", z5);
                                Boolean valueOf3 = Boolean.valueOf(eVar2.y("google_analytics_default_allow_ad_personalization_signals", true) == n1.GRANTED);
                                List list2 = this.f22734k;
                                String g102 = v0Var.q().g();
                                if (this.f22735l == null) {
                                }
                                String str92 = this.f22735l;
                                if (v0Var.q().i(p1.ANALYTICS_STORAGE)) {
                                }
                                Boolean v102 = eVar2.v("google_analytics_sgtm_upload_enabled");
                                if (v102 != null) {
                                }
                                f1.k(v3Var);
                                f1Var = (f1) v3Var.f3328a;
                                String str102 = str5;
                                String p112 = p();
                                boolean z132 = r3;
                                if (f1Var.f22740a.getPackageManager() != null) {
                                }
                                f1.k(v0Var);
                                int i142 = v0Var.q().f22966b;
                                f1.k(v0Var);
                                v0Var.j();
                                String str112 = l.b(v0Var.n().getString("dma_consent_settings", null)).f22862b;
                                o8.a();
                                wVar = x.R0;
                                if (eVar2.t(null, wVar)) {
                                }
                                o8.a();
                                if (eVar2.t(null, wVar)) {
                                }
                                String str122 = eVar2.f22690c;
                                String valueOf22 = String.valueOf(q1.h(eVar2.y("google_analytics_default_allow_ad_personalization_signals", true)));
                                long j172 = f1Var2.D;
                                f1.j(f1Var2.f22758u);
                                return new zzr(p10, str2, str3, j11, str7, 133005L, j6, str, z7, z112, str82, j162, i5, z10, z122, valueOf3, this.f22733i, list2, g102, str92, str102, z132, j10, i142, str112, i12, j13, str122, valueOf22, j172, androidx.appcompat.widget.c1.e(f1Var2.f22758u.o()));
                            }
                        }
                    } catch (PackageManager.NameNotFoundException e10) {
                        e = e10;
                        str2 = q;
                    }
                } else {
                    str2 = q;
                    str3 = str6;
                }
                j = 0;
                this.f22732h = j;
            }
            j = j14;
            this.f22732h = j;
        } else {
            str2 = q;
            str3 = str6;
            z5 = 0;
            j = j12;
        }
        boolean d1022 = f1Var2.d();
        f1.k(v0Var);
        boolean z1122 = !v0Var.f23137r;
        j();
        if (f1Var2.d()) {
            z7 = d1022;
            if (eVar2.t(null, x.I0)) {
                f1.m(n0Var);
                n0Var.f22910n.a("Disabled IID for tests.");
            } else {
                try {
                    loadClass = context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                } catch (ClassNotFoundException unused) {
                }
                if (loadClass != null) {
                    j6 = j;
                    try {
                        Class<?>[] clsArr = new Class[1];
                        clsArr[z5] = Context.class;
                        Method declaredMethod = loadClass.getDeclaredMethod("getInstance", clsArr);
                        Object[] objArr = new Object[1];
                        objArr[z5] = context;
                        Object invoke = declaredMethod.invoke(null, objArr);
                        if (invoke == null) {
                            str4 = null;
                        } else {
                            try {
                                str4 = (String) loadClass.getDeclaredMethod("getFirebaseInstanceId", null).invoke(invoke, null);
                            } catch (Exception unused2) {
                                f1.m(n0Var);
                                n0Var.f22907k.a("Failed to retrieve Firebase Instance Id");
                            }
                        }
                    } catch (Exception unused3) {
                        f1.m(n0Var);
                        n0Var.j.a("Failed to obtain Firebase Analytics instance");
                    }
                    long j1522 = f1Var2.D;
                    f1.k(v0Var);
                    a7 = v0Var.f23127f.a();
                    if (a7 != 0) {
                        j1522 = Math.min(j1522, a7);
                    }
                    k();
                    int i1322 = this.f22736m;
                    Boolean v522 = eVar2.v("google_analytics_adid_collection_enabled");
                    boolean z14 = (v522 != null || v522.booleanValue()) ? true : z5;
                    f1.k(v0Var);
                    v0Var.j();
                    String str822 = str4;
                    long j1622 = j1522;
                    boolean z1222 = v0Var.n().getBoolean("deferred_analytics_collection", z5);
                    Boolean valueOf32 = Boolean.valueOf(eVar2.y("google_analytics_default_allow_ad_personalization_signals", true) == n1.GRANTED);
                    List list22 = this.f22734k;
                    String g1022 = v0Var.q().g();
                    if (this.f22735l == null) {
                        f1.k(v3Var);
                        this.f22735l = v3Var.d0();
                    }
                    String str922 = this.f22735l;
                    if (v0Var.q().i(p1.ANALYTICS_STORAGE)) {
                        i5 = i1322;
                        str5 = null;
                    } else {
                        j();
                        if (this.f22739p == 0) {
                            i5 = i1322;
                        } else {
                            f1Var2.f22749k.getClass();
                            long currentTimeMillis = System.currentTimeMillis() - this.f22739p;
                            i5 = i1322;
                            if (this.f22738o != null && currentTimeMillis > 86400000 && this.q == null) {
                                o();
                            }
                        }
                        if (this.f22738o == null) {
                            o();
                        }
                        str5 = this.f22738o;
                    }
                    Boolean v1022 = eVar2.v("google_analytics_sgtm_upload_enabled");
                    boolean booleanValue = v1022 != null ? false : v1022.booleanValue();
                    f1.k(v3Var);
                    f1Var = (f1) v3Var.f3328a;
                    String str1022 = str5;
                    String p1122 = p();
                    boolean z1322 = booleanValue;
                    if (f1Var.f22740a.getPackageManager() != null) {
                        z10 = z14;
                        j10 = 0;
                    } else {
                        try {
                            z10 = z14;
                            i10 = 0;
                            try {
                                a10 = s6.c.a(f1Var.f22740a).a(0, p1122);
                            } catch (PackageManager.NameNotFoundException unused4) {
                                n0 n0Var5 = f1Var.f22745f;
                                f1.m(n0Var5);
                                n0Var5.f22908l.b(p1122, "PackageManager failed to find running app: app_id");
                                i11 = i10;
                                j10 = i11;
                                f1.k(v0Var);
                                int i1422 = v0Var.q().f22966b;
                                f1.k(v0Var);
                                v0Var.j();
                                String str1122 = l.b(v0Var.n().getString("dma_consent_settings", null)).f22862b;
                                o8.a();
                                wVar = x.R0;
                                if (eVar2.t(null, wVar)) {
                                }
                                o8.a();
                                if (eVar2.t(null, wVar)) {
                                }
                                String str1222 = eVar2.f22690c;
                                String valueOf222 = String.valueOf(q1.h(eVar2.y("google_analytics_default_allow_ad_personalization_signals", true)));
                                long j1722 = f1Var2.D;
                                f1.j(f1Var2.f22758u);
                                return new zzr(p10, str2, str3, j11, str7, 133005L, j6, str, z7, z1122, str822, j1622, i5, z10, z1222, valueOf32, this.f22733i, list22, g1022, str922, str1022, z1322, j10, i1422, str1122, i12, j13, str1222, valueOf222, j1722, androidx.appcompat.widget.c1.e(f1Var2.f22758u.o()));
                            }
                        } catch (PackageManager.NameNotFoundException unused5) {
                            z10 = z14;
                            i10 = 0;
                        }
                        if (a10 != null) {
                            i11 = a10.targetSdkVersion;
                            j10 = i11;
                        }
                        i11 = i10;
                        j10 = i11;
                    }
                    f1.k(v0Var);
                    int i14222 = v0Var.q().f22966b;
                    f1.k(v0Var);
                    v0Var.j();
                    String str11222 = l.b(v0Var.n().getString("dma_consent_settings", null)).f22862b;
                    o8.a();
                    wVar = x.R0;
                    if (eVar2.t(null, wVar)) {
                        f1.k(v3Var);
                        i12 = v3.F();
                    } else {
                        i12 = 0;
                    }
                    o8.a();
                    if (eVar2.t(null, wVar)) {
                        f1.k(v3Var);
                        j13 = v3Var.G();
                    }
                    String str12222 = eVar2.f22690c;
                    String valueOf2222 = String.valueOf(q1.h(eVar2.y("google_analytics_default_allow_ad_personalization_signals", true)));
                    long j17222 = f1Var2.D;
                    f1.j(f1Var2.f22758u);
                    return new zzr(p10, str2, str3, j11, str7, 133005L, j6, str, z7, z1122, str822, j1622, i5, z10, z1222, valueOf32, this.f22733i, list22, g1022, str922, str1022, z1322, j10, i14222, str11222, i12, j13, str12222, valueOf2222, j17222, androidx.appcompat.widget.c1.e(f1Var2.f22758u.o()));
                }
            }
        } else {
            z7 = d1022;
        }
        j6 = j;
        str4 = null;
        long j15222 = f1Var2.D;
        f1.k(v0Var);
        a7 = v0Var.f23127f.a();
        if (a7 != 0) {
        }
        k();
        int i13222 = this.f22736m;
        Boolean v5222 = eVar2.v("google_analytics_adid_collection_enabled");
        if (v5222 != null) {
        }
        f1.k(v0Var);
        v0Var.j();
        String str8222 = str4;
        long j16222 = j15222;
        boolean z12222 = v0Var.n().getBoolean("deferred_analytics_collection", z5);
        Boolean valueOf322 = Boolean.valueOf(eVar2.y("google_analytics_default_allow_ad_personalization_signals", true) == n1.GRANTED);
        List list222 = this.f22734k;
        String g10222 = v0Var.q().g();
        if (this.f22735l == null) {
        }
        String str9222 = this.f22735l;
        if (v0Var.q().i(p1.ANALYTICS_STORAGE)) {
        }
        Boolean v10222 = eVar2.v("google_analytics_sgtm_upload_enabled");
        if (v10222 != null) {
        }
        f1.k(v3Var);
        f1Var = (f1) v3Var.f3328a;
        String str10222 = str5;
        String p11222 = p();
        boolean z13222 = booleanValue;
        if (f1Var.f22740a.getPackageManager() != null) {
        }
        f1.k(v0Var);
        int i142222 = v0Var.q().f22966b;
        f1.k(v0Var);
        v0Var.j();
        String str112222 = l.b(v0Var.n().getString("dma_consent_settings", null)).f22862b;
        o8.a();
        wVar = x.R0;
        if (eVar2.t(null, wVar)) {
        }
        o8.a();
        if (eVar2.t(null, wVar)) {
        }
        String str122222 = eVar2.f22690c;
        String valueOf22222 = String.valueOf(q1.h(eVar2.y("google_analytics_default_allow_ad_personalization_signals", true)));
        long j172222 = f1Var2.D;
        f1.j(f1Var2.f22758u);
        return new zzr(p10, str2, str3, j11, str7, 133005L, j6, str, z7, z1122, str8222, j16222, i5, z10, z12222, valueOf322, this.f22733i, list222, g10222, str9222, str10222, z13222, j10, i142222, str112222, i12, j13, str122222, valueOf22222, j172222, androidx.appcompat.widget.c1.e(f1Var2.f22758u.o()));
    }

    public final void o() {
        String format;
        j();
        f1 f1Var = (f1) this.f3328a;
        v0 v0Var = f1Var.f22744e;
        n0 n0Var = f1Var.f22745f;
        f1.k(v0Var);
        if (v0Var.q().i(p1.ANALYTICS_STORAGE)) {
            byte[] bArr = new byte[16];
            v3 v3Var = f1Var.f22748i;
            f1.k(v3Var);
            v3Var.i0().nextBytes(bArr);
            format = String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        } else {
            f1.m(n0Var);
            n0Var.f22909m.a("Analytics Storage consent is not granted");
            format = null;
        }
        f1.m(n0Var);
        n0Var.f22909m.a("Resetting session stitching token to ".concat(format == null ? "null" : "not null"));
        this.f22738o = format;
        f1Var.f22749k.getClass();
        this.f22739p = System.currentTimeMillis();
    }

    public final String p() {
        k();
        g6.v.h(this.f22727c);
        return this.f22727c;
    }

    public final String q() {
        j();
        k();
        g6.v.h(this.f22737n);
        return this.f22737n;
    }
}
