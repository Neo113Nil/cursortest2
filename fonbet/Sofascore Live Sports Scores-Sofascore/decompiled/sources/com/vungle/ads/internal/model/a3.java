package com.vungle.ads.internal.model;

import androidx.core.app.NotificationCompat;
import com.unity3d.services.UnityAdsConstants;
import defpackage.a7a;
import defpackage.fc6;
import defpackage.lkb;
import defpackage.lnb;
import defpackage.uhi;
import defpackage.uye;
import defpackage.wf3;
import defpackage.wv8;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class a3 {

    @NotNull
    public static final z2 Companion = new z2();
    public boolean a;
    public String b;
    public Integer c;
    public float d;
    public String e;
    public int f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public float l;
    public int m;
    public boolean n;
    public int o;
    public boolean p;
    public String q;
    public String r;
    public Long s;
    public Long t;
    public Long u;
    public Long v;
    public String w;

    public /* synthetic */ a3(int i, boolean z, String str, Integer num, float f, String str2, int i2, String str3, String str4, String str5, String str6, String str7, float f2, int i3, boolean z2, int i4, boolean z3, String str8, String str9, Long l, Long l2, Long l3, Long l4, String str10) {
        if ((i & 1) == 0) {
            this.a = false;
        } else {
            this.a = z;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num;
        }
        if ((i & 8) == 0) {
            this.d = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        } else {
            this.d = f;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str2;
        }
        if ((i & 32) == 0) {
            this.f = 0;
        } else {
            this.f = i2;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str3;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = str4;
        }
        if ((i & NotificationCompat.FLAG_LOCAL_ONLY) == 0) {
            this.i = null;
        } else {
            this.i = str5;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = str6;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = str7;
        }
        if ((i & com.ironsource.mediationsdk.metadata.a.o) == 0) {
            this.l = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        } else {
            this.l = f2;
        }
        if ((i & 4096) == 0) {
            this.m = 1;
        } else {
            this.m = i3;
        }
        if ((i & 8192) == 0) {
            this.n = false;
        } else {
            this.n = z2;
        }
        if ((i & 16384) == 0) {
            this.o = 1;
        } else {
            this.o = i4;
        }
        if ((32768 & i) == 0) {
            this.p = false;
        } else {
            this.p = z3;
        }
        if ((65536 & i) == 0) {
            this.q = null;
        } else {
            this.q = str8;
        }
        if ((131072 & i) == 0) {
            this.r = null;
        } else {
            this.r = str9;
        }
        if ((262144 & i) == 0) {
            this.s = null;
        } else {
            this.s = l;
        }
        if ((524288 & i) == 0) {
            this.t = null;
        } else {
            this.t = l2;
        }
        if ((1048576 & i) == 0) {
            this.u = null;
        } else {
            this.u = l3;
        }
        if ((2097152 & i) == 0) {
            this.v = null;
        } else {
            this.v = l4;
        }
        if ((i & 4194304) == 0) {
            this.w = null;
        } else {
            this.w = str10;
        }
    }

    public static final void a(a3 a3Var, wf3 wf3Var, uye uyeVar) {
        Float valueOf = Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        a3Var.getClass();
        wf3Var.getClass();
        uyeVar.getClass();
        if (wf3Var.o(uyeVar) || a3Var.a) {
            wf3Var.x(uyeVar, 0, a3Var.a);
        }
        if (wf3Var.o(uyeVar) || a3Var.b != null) {
            wf3Var.h(uyeVar, 1, uhi.a, a3Var.b);
        }
        if (wf3Var.o(uyeVar) || a3Var.c != null) {
            wf3Var.h(uyeVar, 2, a7a.a, a3Var.c);
        }
        if (wf3Var.o(uyeVar) || !Float.valueOf(a3Var.d).equals(valueOf)) {
            wf3Var.t(uyeVar, 3, a3Var.d);
        }
        if (wf3Var.o(uyeVar) || a3Var.e != null) {
            wf3Var.h(uyeVar, 4, uhi.a, a3Var.e);
        }
        if (wf3Var.o(uyeVar) || a3Var.f != 0) {
            wf3Var.u(5, a3Var.f, uyeVar);
        }
        if (wf3Var.o(uyeVar) || a3Var.g != null) {
            wf3Var.h(uyeVar, 6, uhi.a, a3Var.g);
        }
        if (wf3Var.o(uyeVar) || a3Var.h != null) {
            wf3Var.h(uyeVar, 7, uhi.a, a3Var.h);
        }
        if (wf3Var.o(uyeVar) || a3Var.i != null) {
            wf3Var.h(uyeVar, 8, uhi.a, a3Var.i);
        }
        if (wf3Var.o(uyeVar) || a3Var.j != null) {
            wf3Var.h(uyeVar, 9, uhi.a, a3Var.j);
        }
        if (wf3Var.o(uyeVar) || a3Var.k != null) {
            wf3Var.h(uyeVar, 10, uhi.a, a3Var.k);
        }
        if (wf3Var.o(uyeVar) || !Float.valueOf(a3Var.l).equals(valueOf)) {
            wf3Var.t(uyeVar, 11, a3Var.l);
        }
        if (wf3Var.o(uyeVar) || a3Var.m != 1) {
            wf3Var.u(12, a3Var.m, uyeVar);
        }
        if (wf3Var.o(uyeVar) || a3Var.n) {
            wf3Var.x(uyeVar, 13, a3Var.n);
        }
        if (wf3Var.o(uyeVar) || a3Var.o != 1) {
            wf3Var.u(14, a3Var.o, uyeVar);
        }
        if (wf3Var.o(uyeVar) || a3Var.p) {
            wf3Var.x(uyeVar, 15, a3Var.p);
        }
        if (wf3Var.o(uyeVar) || a3Var.q != null) {
            wf3Var.h(uyeVar, 16, uhi.a, a3Var.q);
        }
        if (wf3Var.o(uyeVar) || a3Var.r != null) {
            wf3Var.h(uyeVar, 17, uhi.a, a3Var.r);
        }
        if (wf3Var.o(uyeVar) || a3Var.s != null) {
            wf3Var.h(uyeVar, 18, lkb.a, a3Var.s);
        }
        if (wf3Var.o(uyeVar) || a3Var.t != null) {
            wf3Var.h(uyeVar, 19, lkb.a, a3Var.t);
        }
        if (wf3Var.o(uyeVar) || a3Var.u != null) {
            wf3Var.h(uyeVar, 20, lkb.a, a3Var.u);
        }
        if (wf3Var.o(uyeVar) || a3Var.v != null) {
            wf3Var.h(uyeVar, 21, lkb.a, a3Var.v);
        }
        if (!wf3Var.o(uyeVar) && a3Var.w == null) {
            return;
        }
        wf3Var.h(uyeVar, 22, uhi.a, a3Var.w);
    }

    public final void b(String str) {
        this.b = str;
    }

    public final void c(String str) {
        this.e = str;
    }

    public final void d(String str) {
        this.g = str;
    }

    public final void e(String str) {
        this.h = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a3)) {
            return false;
        }
        a3 a3Var = (a3) obj;
        return this.a == a3Var.a && Intrinsics.c(this.b, a3Var.b) && Intrinsics.c(this.c, a3Var.c) && Float.valueOf(this.d).equals(Float.valueOf(a3Var.d)) && Intrinsics.c(this.e, a3Var.e) && this.f == a3Var.f && Intrinsics.c(this.g, a3Var.g) && Intrinsics.c(this.h, a3Var.h) && Intrinsics.c(this.i, a3Var.i) && Intrinsics.c(this.j, a3Var.j) && Intrinsics.c(this.k, a3Var.k) && Float.valueOf(this.l).equals(Float.valueOf(a3Var.l)) && this.m == a3Var.m && this.n == a3Var.n && this.o == a3Var.o && this.p == a3Var.p && Intrinsics.c(this.q, a3Var.q) && Intrinsics.c(this.r, a3Var.r) && Intrinsics.c(this.s, a3Var.s) && Intrinsics.c(this.t, a3Var.t) && Intrinsics.c(this.u, a3Var.u) && Intrinsics.c(this.v, a3Var.v) && Intrinsics.c(this.w, a3Var.w);
    }

    public final void f(String str) {
        this.q = str;
    }

    public final void g(String str) {
        this.w = str;
    }

    public final void h(String str) {
        this.j = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r3v28, types: [boolean] */
    public final int hashCode() {
        boolean z = this.a;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        String str = this.b;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.c;
        int a = fc6.a(this.d, (hashCode + (num == null ? 0 : num.hashCode())) * 31, 31);
        String str2 = this.e;
        int a2 = wv8.a(this.f, (a + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        String str3 = this.g;
        int hashCode2 = (a2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.h;
        int hashCode3 = (hashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.i;
        int hashCode4 = (hashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.j;
        int hashCode5 = (hashCode4 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.k;
        int a3 = wv8.a(this.m, fc6.a(this.l, (hashCode5 + (str7 == null ? 0 : str7.hashCode())) * 31, 31), 31);
        ?? r3 = this.n;
        int i2 = r3;
        if (r3 != 0) {
            i2 = 1;
        }
        int a4 = wv8.a(this.o, (a3 + i2) * 31, 31);
        boolean z2 = this.p;
        int i3 = (a4 + (z2 ? 1 : z2 ? 1 : 0)) * 31;
        String str8 = this.q;
        int hashCode6 = (i3 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.r;
        int hashCode7 = (hashCode6 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Long l = this.s;
        int hashCode8 = (hashCode7 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.t;
        int hashCode9 = (hashCode8 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.u;
        int hashCode10 = (hashCode9 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.v;
        int hashCode11 = (hashCode10 + (l4 == null ? 0 : l4.hashCode())) * 31;
        String str10 = this.w;
        return hashCode11 + (str10 != null ? str10.hashCode() : 0);
    }

    public final void i(String str) {
        this.i = str;
    }

    public final void j(String str) {
        this.k = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VungleExt(isGooglePlayServicesAvailable=");
        sb.append(this.a);
        sb.append(", appSetId=");
        sb.append(this.b);
        sb.append(", appSetIdScope=");
        sb.append(this.c);
        sb.append(", batteryLevel=");
        sb.append(this.d);
        sb.append(", batteryState=");
        sb.append(this.e);
        sb.append(", batterySaverEnabled=");
        sb.append(this.f);
        sb.append(", connectionType=");
        sb.append(this.g);
        sb.append(", connectionTypeDetail=");
        sb.append(this.h);
        sb.append(", locale=");
        sb.append(this.i);
        sb.append(", language=");
        sb.append(this.j);
        sb.append(", timeZone=");
        sb.append(this.k);
        sb.append(", volumeLevel=");
        sb.append(this.l);
        sb.append(", soundEnabled=");
        sb.append(this.m);
        sb.append(", isTv=");
        sb.append(this.n);
        sb.append(", sdCardAvailable=");
        sb.append(this.o);
        sb.append(", isSideloadEnabled=");
        sb.append(this.p);
        sb.append(", gaid=");
        sb.append(this.q);
        sb.append(", amazonAdvertisingId=");
        sb.append(this.r);
        sb.append(", sit=");
        sb.append(this.s);
        sb.append(", oit=");
        sb.append(this.t);
        sb.append(", ort=");
        sb.append(this.u);
        sb.append(", obt=");
        sb.append(this.v);
        sb.append(", gpVersion=");
        return lnb.q(sb, this.w, ')');
    }

    public a3(boolean z, String str, Integer num, float f, String str2, int i, String str3, String str4, String str5, String str6, String str7, float f2, int i2, boolean z2, int i3, boolean z3, String str8, String str9, Long l, Long l2, Long l3, Long l4, String str10) {
        this.a = z;
        this.b = str;
        this.c = num;
        this.d = f;
        this.e = str2;
        this.f = i;
        this.g = str3;
        this.h = str4;
        this.i = str5;
        this.j = str6;
        this.k = str7;
        this.l = f2;
        this.m = i2;
        this.n = z2;
        this.o = i3;
        this.p = z3;
        this.q = str8;
        this.r = str9;
        this.s = l;
        this.t = l2;
        this.u = l3;
        this.v = l4;
        this.w = str10;
    }

    public final void b(float f) {
        this.l = f;
    }

    public final void c(int i) {
        this.m = i;
    }

    public final void d(Long l) {
        this.s = l;
    }

    public final void b(boolean z) {
        this.n = z;
    }

    public final void c(Long l) {
        this.u = l;
    }

    public final void b(int i) {
        this.o = i;
    }

    public final void b(Long l) {
        this.t = l;
    }

    public /* synthetic */ a3() {
        this(false, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 0, null, null, null, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1, false, 1, false, null, null, null, null, null, null, null);
    }

    public final void a(boolean z) {
        this.a = z;
    }

    public final void a(Integer num) {
        this.c = num;
    }

    public final void a(float f) {
        this.d = f;
    }

    public final void a(int i) {
        this.f = i;
    }

    public final void a() {
        this.p = false;
    }

    public final void a(String str) {
        this.r = str;
    }

    public final void a(Long l) {
        this.v = l;
    }
}
