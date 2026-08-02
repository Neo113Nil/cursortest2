package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzaif;
import com.unity3d.services.core.fid.Constants;
import defpackage.lmo;
import defpackage.yao;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzgi extends yao {
    public String d;
    public String e;
    public int f;
    public String g;
    public String h;
    public long i;
    public final long j;
    public final long k;
    public List l;
    public String m;
    public final String n;
    public int o;
    public String p;
    public String q;
    public long r;
    public String s;

    public zzgi(zzic zzicVar, long j, long j2, String str) {
        super(zzicVar);
        this.r = 0L;
        this.s = null;
        this.j = j;
        this.k = j2;
        this.n = str;
    }

    @Override // defpackage.yao
    public final boolean T() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x025d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x010d  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzr U(String str) {
        String str2;
        long j;
        boolean z;
        long j2;
        boolean z2;
        String str3;
        Class<?> loadClass;
        long a;
        String str4;
        boolean z3;
        String str5;
        zzic zzicVar;
        boolean z4;
        int i;
        int i2;
        long j3;
        ApplicationInfo a2;
        zzfx zzfxVar;
        int i3;
        long j4;
        Q();
        String W = W();
        String X = X();
        R();
        String str6 = this.e;
        R();
        long j5 = this.f;
        R();
        Preconditions.i(this.g);
        String str7 = this.g;
        zzic zzicVar2 = (zzic) this.b;
        zzal zzalVar = zzicVar2.d;
        zzgu zzguVar = zzicVar2.f;
        zzal zzalVar2 = zzicVar2.d;
        Context context = zzicVar2.a;
        zzpp zzppVar = zzicVar2.i;
        lmo lmoVar = zzicVar2.e;
        zzalVar.W();
        R();
        Q();
        long j6 = this.i;
        if (j6 == 0) {
            zzic.k(zzppVar);
            zzic zzicVar3 = (zzic) zzppVar.b;
            String packageName = context.getPackageName();
            zzppVar.Q();
            Preconditions.f(packageName);
            PackageManager packageManager = context.getPackageManager();
            z = false;
            MessageDigest j0 = zzpp.j0();
            long j7 = -1;
            if (j0 == null) {
                zzgu zzguVar2 = zzicVar3.f;
                zzic.m(zzguVar2);
                zzguVar2.g.a("Could not get MD5 instance");
                str2 = str6;
                j = j5;
            } else {
                if (packageManager != null) {
                    try {
                        if (zzppVar.y0(context, packageName)) {
                            str2 = str6;
                            j = j5;
                            j7 = 0;
                        } else {
                            str2 = str6;
                            try {
                                j = j5;
                                try {
                                    Signature[] signatureArr = Wrappers.a(context).b(64, zzicVar3.a.getPackageName()).signatures;
                                    if (signatureArr == null || signatureArr.length <= 0) {
                                        zzgu zzguVar3 = zzicVar3.f;
                                        zzic.m(zzguVar3);
                                        zzguVar3.j.a("Could not get signatures");
                                    } else {
                                        j7 = zzpp.k0(j0.digest(signatureArr[0].toByteArray()));
                                    }
                                } catch (PackageManager.NameNotFoundException e) {
                                    e = e;
                                    zzgu zzguVar4 = zzicVar3.f;
                                    zzic.m(zzguVar4);
                                    zzguVar4.g.b(e, "Package name not found");
                                    j2 = 0;
                                    this.i = j2;
                                    boolean c = zzicVar2.c();
                                    zzic.k(lmoVar);
                                    boolean z5 = !lmoVar.s;
                                    Q();
                                    if (zzicVar2.c()) {
                                    }
                                    z2 = c;
                                    str3 = null;
                                    zzic.k(lmoVar);
                                    a = lmoVar.g.a();
                                    long j8 = j2;
                                    long j9 = zzicVar2.D;
                                    if (a != 0) {
                                    }
                                    R();
                                    int i4 = this.o;
                                    Boolean d0 = zzalVar2.d0("google_analytics_adid_collection_enabled");
                                    if (d0 != null) {
                                    }
                                    zzic.k(lmoVar);
                                    lmoVar.Q();
                                    long j10 = j9;
                                    boolean z6 = lmoVar.U().getBoolean("deferred_analytics_collection", z);
                                    Boolean valueOf = Boolean.valueOf(zzalVar2.g0("google_analytics_default_allow_ad_personalization_signals", true) != zzji.GRANTED);
                                    List list = this.l;
                                    String g = lmoVar.X().g();
                                    str4 = this.m;
                                    if (str4 == null) {
                                    }
                                    String str8 = str4;
                                    if (lmoVar.X().i(zzjk.ANALYTICS_STORAGE)) {
                                    }
                                    Boolean d02 = zzalVar2.d0("google_analytics_sgtm_upload_enabled");
                                    if (d02 == null) {
                                    }
                                    zzic.k(zzppVar);
                                    zzicVar = (zzic) zzppVar.b;
                                    String str9 = str5;
                                    String W2 = W();
                                    boolean z7 = r3;
                                    if (zzicVar.a.getPackageManager() == null) {
                                    }
                                    zzic.k(lmoVar);
                                    int i5 = lmoVar.X().b;
                                    zzic.k(lmoVar);
                                    lmoVar.Q();
                                    String str10 = zzba.b(lmoVar.U().getString("dma_consent_settings", null)).b;
                                    zzaif.a();
                                    zzfxVar = zzfy.P0;
                                    if (zzalVar2.b0(null, zzfxVar)) {
                                    }
                                    zzaif.a();
                                    if (zzalVar2.b0(null, zzfxVar)) {
                                    }
                                    String str11 = zzalVar2.d;
                                    String valueOf2 = String.valueOf(zzjl.h(zzalVar2.g0("google_analytics_default_allow_ad_personalization_signals", true)));
                                    long j11 = j3;
                                    long j12 = zzicVar2.D;
                                    zzic.j(zzicVar2.u);
                                    return new zzr(W, X, str2, j, str7, 161000L, j8, str, z2, z3, str3, j10, i4, z4, z6, valueOf, this.j, list, g, str8, str9, z7, j11, i5, str10, i3, j4, str11, valueOf2, j12, zzicVar2.u.V().a, zzalVar2.b0(null, zzfy.e1) ? zzicVar2.E : 0L);
                                }
                            } catch (PackageManager.NameNotFoundException e2) {
                                e = e2;
                                j = j5;
                                zzgu zzguVar42 = zzicVar3.f;
                                zzic.m(zzguVar42);
                                zzguVar42.g.b(e, "Package name not found");
                                j2 = 0;
                                this.i = j2;
                                boolean c2 = zzicVar2.c();
                                zzic.k(lmoVar);
                                boolean z52 = !lmoVar.s;
                                Q();
                                if (zzicVar2.c()) {
                                }
                                z2 = c2;
                                str3 = null;
                                zzic.k(lmoVar);
                                a = lmoVar.g.a();
                                long j82 = j2;
                                long j92 = zzicVar2.D;
                                if (a != 0) {
                                }
                                R();
                                int i42 = this.o;
                                Boolean d03 = zzalVar2.d0("google_analytics_adid_collection_enabled");
                                if (d03 != null) {
                                }
                                zzic.k(lmoVar);
                                lmoVar.Q();
                                long j102 = j92;
                                boolean z62 = lmoVar.U().getBoolean("deferred_analytics_collection", z);
                                Boolean valueOf3 = Boolean.valueOf(zzalVar2.g0("google_analytics_default_allow_ad_personalization_signals", true) != zzji.GRANTED);
                                List list2 = this.l;
                                String g2 = lmoVar.X().g();
                                str4 = this.m;
                                if (str4 == null) {
                                }
                                String str82 = str4;
                                if (lmoVar.X().i(zzjk.ANALYTICS_STORAGE)) {
                                }
                                Boolean d022 = zzalVar2.d0("google_analytics_sgtm_upload_enabled");
                                if (d022 == null) {
                                }
                                zzic.k(zzppVar);
                                zzicVar = (zzic) zzppVar.b;
                                String str92 = str5;
                                String W22 = W();
                                boolean z72 = r3;
                                if (zzicVar.a.getPackageManager() == null) {
                                }
                                zzic.k(lmoVar);
                                int i52 = lmoVar.X().b;
                                zzic.k(lmoVar);
                                lmoVar.Q();
                                String str102 = zzba.b(lmoVar.U().getString("dma_consent_settings", null)).b;
                                zzaif.a();
                                zzfxVar = zzfy.P0;
                                if (zzalVar2.b0(null, zzfxVar)) {
                                }
                                zzaif.a();
                                if (zzalVar2.b0(null, zzfxVar)) {
                                }
                                String str112 = zzalVar2.d;
                                String valueOf22 = String.valueOf(zzjl.h(zzalVar2.g0("google_analytics_default_allow_ad_personalization_signals", true)));
                                long j112 = j3;
                                long j122 = zzicVar2.D;
                                zzic.j(zzicVar2.u);
                                return new zzr(W, X, str2, j, str7, 161000L, j82, str, z2, z3, str3, j102, i42, z4, z62, valueOf3, this.j, list2, g2, str82, str92, z72, j112, i52, str102, i3, j4, str112, valueOf22, j122, zzicVar2.u.V().a, zzalVar2.b0(null, zzfy.e1) ? zzicVar2.E : 0L);
                            }
                        }
                    } catch (PackageManager.NameNotFoundException e3) {
                        e = e3;
                        str2 = str6;
                    }
                } else {
                    str2 = str6;
                    j = j5;
                }
                j2 = 0;
                this.i = j2;
            }
            j2 = j7;
            this.i = j2;
        } else {
            str2 = str6;
            j = j5;
            z = false;
            j2 = j6;
        }
        boolean c22 = zzicVar2.c();
        zzic.k(lmoVar);
        boolean z522 = !lmoVar.s;
        Q();
        if (zzicVar2.c()) {
            if (!zzalVar2.b0(null, zzfy.H0)) {
                try {
                    loadClass = context.getClassLoader().loadClass(Constants.FID_CLASS);
                } catch (ClassNotFoundException unused) {
                }
                if (loadClass != null) {
                    z2 = c22;
                    try {
                        Object[] objArr = {context};
                        str3 = null;
                        Object invoke = loadClass.getDeclaredMethod(Constants.GET_INSTANCE, Context.class).invoke(null, objArr);
                        if (invoke != null) {
                            try {
                                str3 = (String) loadClass.getDeclaredMethod("getFirebaseInstanceId", null).invoke(invoke, null);
                            } catch (Exception unused2) {
                                zzic.m(zzguVar);
                                zzguVar.l.a("Failed to retrieve Firebase Instance Id");
                            }
                        }
                    } catch (Exception unused3) {
                        zzic.m(zzguVar);
                        zzguVar.k.a("Failed to obtain Firebase Analytics instance");
                    }
                    zzic.k(lmoVar);
                    a = lmoVar.g.a();
                    long j822 = j2;
                    long j922 = zzicVar2.D;
                    if (a != 0) {
                        j922 = Math.min(j922, a);
                    }
                    R();
                    int i422 = this.o;
                    Boolean d032 = zzalVar2.d0("google_analytics_adid_collection_enabled");
                    boolean z8 = (d032 != null || d032.booleanValue()) ? true : z;
                    zzic.k(lmoVar);
                    lmoVar.Q();
                    long j1022 = j922;
                    boolean z622 = lmoVar.U().getBoolean("deferred_analytics_collection", z);
                    Boolean valueOf32 = Boolean.valueOf(zzalVar2.g0("google_analytics_default_allow_ad_personalization_signals", true) != zzji.GRANTED);
                    List list22 = this.l;
                    String g22 = lmoVar.X().g();
                    str4 = this.m;
                    if (str4 == null) {
                        zzic.k(zzppVar);
                        str4 = zzppVar.N0();
                        this.m = str4;
                    }
                    String str822 = str4;
                    if (lmoVar.X().i(zzjk.ANALYTICS_STORAGE)) {
                        Q();
                        if (this.r == 0) {
                            z3 = z522;
                        } else {
                            zzicVar2.k.getClass();
                            long currentTimeMillis = System.currentTimeMillis() - this.r;
                            z3 = z522;
                            if (this.q != null && currentTimeMillis > 86400000 && this.s == null) {
                                V();
                            }
                        }
                        if (this.q == null) {
                            V();
                        }
                        str5 = this.q;
                    } else {
                        z3 = z522;
                        str5 = null;
                    }
                    Boolean d0222 = zzalVar2.d0("google_analytics_sgtm_upload_enabled");
                    boolean booleanValue = d0222 == null ? false : d0222.booleanValue();
                    zzic.k(zzppVar);
                    zzicVar = (zzic) zzppVar.b;
                    String str922 = str5;
                    String W222 = W();
                    boolean z722 = booleanValue;
                    if (zzicVar.a.getPackageManager() == null) {
                        z4 = z8;
                        j3 = 0;
                    } else {
                        try {
                            z4 = z8;
                            i = 0;
                            try {
                                a2 = Wrappers.a(zzicVar.a).a(0, W222);
                            } catch (PackageManager.NameNotFoundException unused4) {
                                zzgu zzguVar5 = zzicVar.f;
                                zzic.m(zzguVar5);
                                zzguVar5.m.b(W222, "PackageManager failed to find running app: app_id");
                                i2 = i;
                                j3 = i2;
                                zzic.k(lmoVar);
                                int i522 = lmoVar.X().b;
                                zzic.k(lmoVar);
                                lmoVar.Q();
                                String str1022 = zzba.b(lmoVar.U().getString("dma_consent_settings", null)).b;
                                zzaif.a();
                                zzfxVar = zzfy.P0;
                                if (zzalVar2.b0(null, zzfxVar)) {
                                }
                                zzaif.a();
                                if (zzalVar2.b0(null, zzfxVar)) {
                                }
                                String str1122 = zzalVar2.d;
                                String valueOf222 = String.valueOf(zzjl.h(zzalVar2.g0("google_analytics_default_allow_ad_personalization_signals", true)));
                                long j1122 = j3;
                                long j1222 = zzicVar2.D;
                                zzic.j(zzicVar2.u);
                                return new zzr(W, X, str2, j, str7, 161000L, j822, str, z2, z3, str3, j1022, i422, z4, z622, valueOf32, this.j, list22, g22, str822, str922, z722, j1122, i522, str1022, i3, j4, str1122, valueOf222, j1222, zzicVar2.u.V().a, zzalVar2.b0(null, zzfy.e1) ? zzicVar2.E : 0L);
                            }
                        } catch (PackageManager.NameNotFoundException unused5) {
                            z4 = z8;
                            i = 0;
                        }
                        if (a2 != null) {
                            i2 = a2.targetSdkVersion;
                            j3 = i2;
                        }
                        i2 = i;
                        j3 = i2;
                    }
                    zzic.k(lmoVar);
                    int i5222 = lmoVar.X().b;
                    zzic.k(lmoVar);
                    lmoVar.Q();
                    String str10222 = zzba.b(lmoVar.U().getString("dma_consent_settings", null)).b;
                    zzaif.a();
                    zzfxVar = zzfy.P0;
                    if (zzalVar2.b0(null, zzfxVar)) {
                        i3 = 0;
                    } else {
                        zzic.k(zzppVar);
                        i3 = zzpp.m0();
                    }
                    zzaif.a();
                    if (zzalVar2.b0(null, zzfxVar)) {
                        j4 = 0;
                    } else {
                        zzic.k(zzppVar);
                        j4 = zzppVar.n0();
                    }
                    String str11222 = zzalVar2.d;
                    String valueOf2222 = String.valueOf(zzjl.h(zzalVar2.g0("google_analytics_default_allow_ad_personalization_signals", true)));
                    long j11222 = j3;
                    long j12222 = zzicVar2.D;
                    zzic.j(zzicVar2.u);
                    return new zzr(W, X, str2, j, str7, 161000L, j822, str, z2, z3, str3, j1022, i422, z4, z622, valueOf32, this.j, list22, g22, str822, str922, z722, j11222, i5222, str10222, i3, j4, str11222, valueOf2222, j12222, zzicVar2.u.V().a, zzalVar2.b0(null, zzfy.e1) ? zzicVar2.E : 0L);
                }
                z2 = c22;
                str3 = null;
                zzic.k(lmoVar);
                a = lmoVar.g.a();
                long j8222 = j2;
                long j9222 = zzicVar2.D;
                if (a != 0) {
                }
                R();
                int i4222 = this.o;
                Boolean d0322 = zzalVar2.d0("google_analytics_adid_collection_enabled");
                if (d0322 != null) {
                }
                zzic.k(lmoVar);
                lmoVar.Q();
                long j10222 = j9222;
                boolean z6222 = lmoVar.U().getBoolean("deferred_analytics_collection", z);
                Boolean valueOf322 = Boolean.valueOf(zzalVar2.g0("google_analytics_default_allow_ad_personalization_signals", true) != zzji.GRANTED);
                List list222 = this.l;
                String g222 = lmoVar.X().g();
                str4 = this.m;
                if (str4 == null) {
                }
                String str8222 = str4;
                if (lmoVar.X().i(zzjk.ANALYTICS_STORAGE)) {
                }
                Boolean d02222 = zzalVar2.d0("google_analytics_sgtm_upload_enabled");
                if (d02222 == null) {
                }
                zzic.k(zzppVar);
                zzicVar = (zzic) zzppVar.b;
                String str9222 = str5;
                String W2222 = W();
                boolean z7222 = booleanValue;
                if (zzicVar.a.getPackageManager() == null) {
                }
                zzic.k(lmoVar);
                int i52222 = lmoVar.X().b;
                zzic.k(lmoVar);
                lmoVar.Q();
                String str102222 = zzba.b(lmoVar.U().getString("dma_consent_settings", null)).b;
                zzaif.a();
                zzfxVar = zzfy.P0;
                if (zzalVar2.b0(null, zzfxVar)) {
                }
                zzaif.a();
                if (zzalVar2.b0(null, zzfxVar)) {
                }
                String str112222 = zzalVar2.d;
                String valueOf22222 = String.valueOf(zzjl.h(zzalVar2.g0("google_analytics_default_allow_ad_personalization_signals", true)));
                long j112222 = j3;
                long j122222 = zzicVar2.D;
                zzic.j(zzicVar2.u);
                return new zzr(W, X, str2, j, str7, 161000L, j8222, str, z2, z3, str3, j10222, i4222, z4, z6222, valueOf322, this.j, list222, g222, str8222, str9222, z7222, j112222, i52222, str102222, i3, j4, str112222, valueOf22222, j122222, zzicVar2.u.V().a, zzalVar2.b0(null, zzfy.e1) ? zzicVar2.E : 0L);
            }
            zzic.m(zzguVar);
            zzguVar.o.a("Disabled IID for tests.");
        }
        z2 = c22;
        str3 = null;
        zzic.k(lmoVar);
        a = lmoVar.g.a();
        long j82222 = j2;
        long j92222 = zzicVar2.D;
        if (a != 0) {
        }
        R();
        int i42222 = this.o;
        Boolean d03222 = zzalVar2.d0("google_analytics_adid_collection_enabled");
        if (d03222 != null) {
        }
        zzic.k(lmoVar);
        lmoVar.Q();
        long j102222 = j92222;
        boolean z62222 = lmoVar.U().getBoolean("deferred_analytics_collection", z);
        Boolean valueOf3222 = Boolean.valueOf(zzalVar2.g0("google_analytics_default_allow_ad_personalization_signals", true) != zzji.GRANTED);
        List list2222 = this.l;
        String g2222 = lmoVar.X().g();
        str4 = this.m;
        if (str4 == null) {
        }
        String str82222 = str4;
        if (lmoVar.X().i(zzjk.ANALYTICS_STORAGE)) {
        }
        Boolean d022222 = zzalVar2.d0("google_analytics_sgtm_upload_enabled");
        if (d022222 == null) {
        }
        zzic.k(zzppVar);
        zzicVar = (zzic) zzppVar.b;
        String str92222 = str5;
        String W22222 = W();
        boolean z72222 = booleanValue;
        if (zzicVar.a.getPackageManager() == null) {
        }
        zzic.k(lmoVar);
        int i522222 = lmoVar.X().b;
        zzic.k(lmoVar);
        lmoVar.Q();
        String str1022222 = zzba.b(lmoVar.U().getString("dma_consent_settings", null)).b;
        zzaif.a();
        zzfxVar = zzfy.P0;
        if (zzalVar2.b0(null, zzfxVar)) {
        }
        zzaif.a();
        if (zzalVar2.b0(null, zzfxVar)) {
        }
        String str1122222 = zzalVar2.d;
        String valueOf222222 = String.valueOf(zzjl.h(zzalVar2.g0("google_analytics_default_allow_ad_personalization_signals", true)));
        long j1122222 = j3;
        long j1222222 = zzicVar2.D;
        zzic.j(zzicVar2.u);
        return new zzr(W, X, str2, j, str7, 161000L, j82222, str, z2, z3, str3, j102222, i42222, z4, z62222, valueOf3222, this.j, list2222, g2222, str82222, str92222, z72222, j1122222, i522222, str1022222, i3, j4, str1122222, valueOf222222, j1222222, zzicVar2.u.V().a, zzalVar2.b0(null, zzfy.e1) ? zzicVar2.E : 0L);
    }

    public final void V() {
        String format;
        Q();
        zzic zzicVar = (zzic) this.b;
        lmo lmoVar = zzicVar.e;
        zzgu zzguVar = zzicVar.f;
        zzic.k(lmoVar);
        if (lmoVar.X().i(zzjk.ANALYTICS_STORAGE)) {
            byte[] bArr = new byte[16];
            zzpp zzppVar = zzicVar.i;
            zzic.k(zzppVar);
            zzppVar.P0().nextBytes(bArr);
            format = String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        } else {
            zzic.m(zzguVar);
            zzguVar.n.a("Analytics Storage consent is not granted");
            format = null;
        }
        zzic.m(zzguVar);
        zzguVar.n.a("Resetting session stitching token to ".concat(format == null ? "null" : "not null"));
        this.q = format;
        zzicVar.k.getClass();
        this.r = System.currentTimeMillis();
    }

    public final String W() {
        R();
        Preconditions.i(this.d);
        return this.d;
    }

    public final String X() {
        Q();
        R();
        Preconditions.i(this.p);
        return this.p;
    }
}
