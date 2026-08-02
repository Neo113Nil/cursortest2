package j3;

import B0.A0;
import B4.V;
import Ij.C3261b;
import android.text.TextUtils;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.common.collect.AbstractC5880y;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;

/* renamed from: j3.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7272n {

    /* renamed from: A, reason: collision with root package name */
    public final int f69096A;

    /* renamed from: B, reason: collision with root package name */
    public final float f69097B;

    /* renamed from: C, reason: collision with root package name */
    public final byte[] f69098C;

    /* renamed from: D, reason: collision with root package name */
    public final int f69099D;

    /* renamed from: E, reason: collision with root package name */
    public final C7267i f69100E;

    /* renamed from: F, reason: collision with root package name */
    public final int f69101F;

    /* renamed from: G, reason: collision with root package name */
    public final int f69102G;

    /* renamed from: H, reason: collision with root package name */
    public final int f69103H;

    /* renamed from: I, reason: collision with root package name */
    public final int f69104I;

    /* renamed from: J, reason: collision with root package name */
    public final int f69105J;

    /* renamed from: K, reason: collision with root package name */
    public final int f69106K;

    /* renamed from: L, reason: collision with root package name */
    public final int f69107L;

    /* renamed from: M, reason: collision with root package name */
    public final int f69108M;

    /* renamed from: N, reason: collision with root package name */
    public final int f69109N;

    /* renamed from: O, reason: collision with root package name */
    public final int f69110O;

    /* renamed from: P, reason: collision with root package name */
    public final int f69111P;

    /* renamed from: Q, reason: collision with root package name */
    private int f69112Q;

    /* renamed from: a, reason: collision with root package name */
    public final String f69113a;

    /* renamed from: b, reason: collision with root package name */
    public final String f69114b;

    /* renamed from: c, reason: collision with root package name */
    public final List<C7274p> f69115c;

    /* renamed from: d, reason: collision with root package name */
    public final String f69116d;

    /* renamed from: e, reason: collision with root package name */
    public final int f69117e;

    /* renamed from: f, reason: collision with root package name */
    public final int f69118f;

    /* renamed from: g, reason: collision with root package name */
    public final int f69119g;

    /* renamed from: h, reason: collision with root package name */
    public final int f69120h;

    /* renamed from: i, reason: collision with root package name */
    public final int f69121i;

    /* renamed from: j, reason: collision with root package name */
    public final int f69122j;

    /* renamed from: k, reason: collision with root package name */
    public final String f69123k;

    /* renamed from: l, reason: collision with root package name */
    public final t f69124l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f69125m;

    /* renamed from: n, reason: collision with root package name */
    public final String f69126n;

    /* renamed from: o, reason: collision with root package name */
    public final String f69127o;

    /* renamed from: p, reason: collision with root package name */
    public final int f69128p;

    /* renamed from: q, reason: collision with root package name */
    public final int f69129q;

    /* renamed from: r, reason: collision with root package name */
    public final List<byte[]> f69130r;

    /* renamed from: s, reason: collision with root package name */
    public final C7270l f69131s;

    /* renamed from: t, reason: collision with root package name */
    public final long f69132t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f69133u;

    /* renamed from: v, reason: collision with root package name */
    public final int f69134v;

    /* renamed from: w, reason: collision with root package name */
    public final int f69135w;

    /* renamed from: x, reason: collision with root package name */
    public final int f69136x;

    /* renamed from: y, reason: collision with root package name */
    public final int f69137y;

    /* renamed from: z, reason: collision with root package name */
    public final float f69138z;

    static {
        new a().P();
        m3.N.L(0);
        m3.N.L(1);
        m3.N.L(2);
        m3.N.L(3);
        m3.N.L(4);
        Pk0.h.f(5, 6, 7, 8, 9);
        Pk0.h.f(10, 11, 12, 13, 14);
        Pk0.h.f(15, 16, 17, 18, 19);
        Pk0.h.f(20, 21, 22, 23, 24);
        Pk0.h.f(25, 26, 27, 28, 29);
        Pk0.h.f(30, 31, 32, 33, 34);
        m3.N.L(35);
        m3.N.L(36);
    }

    C7272n(a aVar) {
        boolean z11;
        String str;
        this.f69113a = aVar.f69154a;
        String R11 = m3.N.R(aVar.f69157d);
        this.f69116d = R11;
        if (aVar.f69156c.isEmpty() && aVar.f69155b != null) {
            this.f69115c = AbstractC5880y.B(new C7274p(R11, aVar.f69155b));
            this.f69114b = aVar.f69155b;
        } else if (aVar.f69156c.isEmpty() || aVar.f69155b != null) {
            if (!aVar.f69156c.isEmpty() || aVar.f69155b != null) {
                for (int i11 = 0; i11 < aVar.f69156c.size(); i11++) {
                    if (!((C7274p) aVar.f69156c.get(i11)).f69181b.equals(aVar.f69155b)) {
                    }
                }
                z11 = false;
                G10.a.h(z11);
                this.f69115c = aVar.f69156c;
                this.f69114b = aVar.f69155b;
            }
            z11 = true;
            G10.a.h(z11);
            this.f69115c = aVar.f69156c;
            this.f69114b = aVar.f69155b;
        } else {
            this.f69115c = aVar.f69156c;
            List list = aVar.f69156c;
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    str = ((C7274p) list.get(0)).f69181b;
                    break;
                }
                C7274p c7274p = (C7274p) it.next();
                if (TextUtils.equals(c7274p.f69180a, R11)) {
                    str = c7274p.f69181b;
                    break;
                }
            }
            this.f69114b = str;
        }
        this.f69117e = aVar.f69158e;
        G10.a.g("Auxiliary track type must only be set to a value other than AUXILIARY_TRACK_TYPE_UNDEFINED only when ROLE_FLAG_AUXILIARY is set", aVar.f69160g == 0 || (aVar.f69159f & 32768) != 0);
        this.f69118f = aVar.f69159f;
        this.f69119g = aVar.f69160g;
        int i12 = aVar.f69161h;
        this.f69120h = i12;
        int i13 = aVar.f69162i;
        this.f69121i = i13;
        this.f69122j = i13 != -1 ? i13 : i12;
        this.f69123k = aVar.f69163j;
        this.f69124l = aVar.f69164k;
        this.f69125m = aVar.f69165l;
        this.f69126n = aVar.f69166m;
        this.f69127o = aVar.f69167n;
        this.f69128p = aVar.f69168o;
        this.f69129q = aVar.f69169p;
        this.f69130r = aVar.f69170q == null ? Collections.EMPTY_LIST : aVar.f69170q;
        C7270l c7270l = aVar.f69171r;
        this.f69131s = c7270l;
        this.f69132t = aVar.f69172s;
        this.f69133u = aVar.f69173t;
        this.f69134v = aVar.f69174u;
        this.f69135w = aVar.f69175v;
        this.f69136x = aVar.f69176w;
        this.f69137y = aVar.f69177x;
        this.f69138z = aVar.f69178y;
        this.f69096A = aVar.f69179z == -1 ? 0 : aVar.f69179z;
        this.f69097B = aVar.f69139A == -1.0f ? 1.0f : aVar.f69139A;
        this.f69098C = aVar.f69140B;
        this.f69099D = aVar.f69141C;
        this.f69100E = aVar.f69142D;
        this.f69101F = aVar.f69143E;
        this.f69102G = aVar.f69144F;
        this.f69103H = aVar.f69145G;
        this.f69104I = aVar.f69146H;
        this.f69105J = aVar.f69147I == -1 ? 0 : aVar.f69147I;
        this.f69106K = aVar.f69148J != -1 ? aVar.f69148J : 0;
        this.f69107L = aVar.f69149K;
        this.f69108M = aVar.f69150L;
        this.f69109N = aVar.f69151M;
        this.f69110O = aVar.f69152N;
        if (aVar.f69153O != 0 || c7270l == null) {
            this.f69111P = aVar.f69153O;
        } else {
            this.f69111P = 1;
        }
    }

    public static String d(C7272n c7272n) {
        String str;
        int i11;
        int i12;
        if (c7272n == null) {
            return "null";
        }
        O7.f d11 = O7.f.d();
        StringBuilder e11 = C3261b.e("id=");
        e11.append(c7272n.f69113a);
        e11.append(", mimeType=");
        e11.append(c7272n.f69127o);
        String str2 = c7272n.f69126n;
        if (str2 != null) {
            e11.append(", container=");
            e11.append(str2);
        }
        int i13 = c7272n.f69122j;
        if (i13 != -1) {
            e11.append(", bitrate=");
            e11.append(i13);
        }
        String str3 = c7272n.f69123k;
        if (str3 != null) {
            e11.append(", codecs=");
            e11.append(str3);
        }
        C7270l c7270l = c7272n.f69131s;
        if (c7270l != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (int i14 = 0; i14 < c7270l.f69087d; i14++) {
                UUID uuid = c7270l.c(i14).f69089b;
                if (uuid.equals(C7266h.f69062b)) {
                    linkedHashSet.add("cenc");
                } else if (uuid.equals(C7266h.f69063c)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(C7266h.f69065e)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(C7266h.f69064d)) {
                    linkedHashSet.add("widevine");
                } else if (uuid.equals(C7266h.f69061a)) {
                    linkedHashSet.add("universal");
                } else {
                    linkedHashSet.add("unknown (" + uuid + ")");
                }
            }
            e11.append(", drm=[");
            d11.a(e11, linkedHashSet);
            e11.append(']');
        }
        int i15 = c7272n.f69134v;
        if (i15 != -1 && (i12 = c7272n.f69135w) != -1) {
            A0.c(i15, i12, ", res=", "x", e11);
        }
        int i16 = c7272n.f69136x;
        if (i16 != -1 && (i11 = c7272n.f69137y) != -1) {
            A0.c(i16, i11, ", decRes=", "x", e11);
        }
        float f7 = c7272n.f69097B;
        double d12 = f7;
        int i17 = Q7.a.f23009a;
        if (Math.copySign(d12 - 1.0d, 1.0d) > 0.001d && d12 != 1.0d && (!Double.isNaN(d12) || !Double.isNaN(1.0d))) {
            e11.append(", par=");
            Object[] objArr = {Float.valueOf(f7)};
            int i18 = m3.N.f74289a;
            e11.append(String.format(Locale.US, "%.3f", objArr));
        }
        C7267i c7267i = c7272n.f69100E;
        if (c7267i != null && ((c7267i.f69071e != -1 && c7267i.f69072f != -1) || c7267i.e())) {
            e11.append(", color=");
            e11.append(c7267i.i());
        }
        float f11 = c7272n.f69138z;
        if (f11 != -1.0f) {
            e11.append(", fps=");
            e11.append(f11);
        }
        int i19 = c7272n.f69101F;
        if (i19 != -1) {
            e11.append(", maxSubLayers=");
            e11.append(i19);
        }
        int i21 = c7272n.f69102G;
        if (i21 != -1) {
            e11.append(", channels=");
            e11.append(i21);
        }
        int i22 = c7272n.f69103H;
        if (i22 != -1) {
            e11.append(", sample_rate=");
            e11.append(i22);
        }
        String str4 = c7272n.f69116d;
        if (str4 != null) {
            e11.append(", language=");
            e11.append(str4);
        }
        List<C7274p> list = c7272n.f69115c;
        if (!list.isEmpty()) {
            e11.append(", labels=[");
            d11.a(e11, com.google.common.collect.G.a(list, new V()));
            e11.append("]");
        }
        int i23 = c7272n.f69117e;
        if (i23 != 0) {
            e11.append(", selectionFlags=[");
            int i24 = m3.N.f74289a;
            ArrayList arrayList = new ArrayList();
            if ((i23 & 4) != 0) {
                arrayList.add("auto");
            }
            if ((i23 & 1) != 0) {
                arrayList.add("default");
            }
            if ((i23 & 2) != 0) {
                arrayList.add("forced");
            }
            d11.a(e11, arrayList);
            e11.append("]");
        }
        int i25 = c7272n.f69118f;
        if (i25 != 0) {
            e11.append(", roleFlags=[");
            int i26 = m3.N.f74289a;
            ArrayList arrayList2 = new ArrayList();
            if ((i25 & 1) != 0) {
                arrayList2.add("main");
            }
            if ((i25 & 2) != 0) {
                arrayList2.add("alt");
            }
            if ((i25 & 4) != 0) {
                arrayList2.add("supplementary");
            }
            if ((i25 & 8) != 0) {
                arrayList2.add("commentary");
            }
            if ((i25 & 16) != 0) {
                arrayList2.add("dub");
            }
            if ((i25 & 32) != 0) {
                arrayList2.add("emergency");
            }
            if ((i25 & 64) != 0) {
                arrayList2.add("caption");
            }
            if ((i25 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                arrayList2.add("subtitle");
            }
            if ((i25 & 256) != 0) {
                arrayList2.add("sign");
            }
            if ((i25 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                arrayList2.add("describes-video");
            }
            if ((i25 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                arrayList2.add("describes-music");
            }
            if ((i25 & 2048) != 0) {
                arrayList2.add("enhanced-intelligibility");
            }
            if ((i25 & 4096) != 0) {
                arrayList2.add("transcribes-dialog");
            }
            if ((i25 & 8192) != 0) {
                arrayList2.add("easy-read");
            }
            if ((i25 & 16384) != 0) {
                arrayList2.add("trick-play");
            }
            if ((i25 & 32768) != 0) {
                arrayList2.add("auxiliary");
            }
            d11.a(e11, arrayList2);
            e11.append("]");
        }
        Object obj = c7272n.f69125m;
        if (obj != null) {
            e11.append(", customData=");
            e11.append(obj);
        }
        if ((i25 & 32768) != 0) {
            e11.append(", auxiliaryTrackType=");
            int i27 = m3.N.f74289a;
            int i28 = c7272n.f69119g;
            if (i28 == 0) {
                str = "undefined";
            } else if (i28 == 1) {
                str = "original";
            } else if (i28 == 2) {
                str = "depth-linear";
            } else if (i28 == 3) {
                str = "depth-inverse";
            } else {
                if (i28 != 4) {
                    throw new IllegalStateException("Unsupported auxiliary track type");
                }
                str = "depth metadata";
            }
            e11.append(str);
        }
        return e11.toString();
    }

    public final a a() {
        return new a(this);
    }

    public final C7272n b(int i11) {
        a aVar = new a(this);
        aVar.X(i11);
        return new C7272n(aVar);
    }

    public final boolean c(C7272n c7272n) {
        List<byte[]> list = this.f69130r;
        if (list.size() != c7272n.f69130r.size()) {
            return false;
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            if (!Arrays.equals(list.get(i11), c7272n.f69130r.get(i11))) {
                return false;
            }
        }
        return true;
    }

    public final C7272n e(C7272n c7272n) {
        String str;
        if (this == c7272n) {
            return this;
        }
        int h11 = u.h(this.f69127o);
        String str2 = c7272n.f69113a;
        String str3 = c7272n.f69114b;
        if (str3 == null) {
            str3 = this.f69114b;
        }
        List<C7274p> list = c7272n.f69115c;
        if (list.isEmpty()) {
            list = this.f69115c;
        }
        if ((h11 != 3 && h11 != 1) || (str = c7272n.f69116d) == null) {
            str = this.f69116d;
        }
        int i11 = this.f69120h;
        if (i11 == -1) {
            i11 = c7272n.f69120h;
        }
        int i12 = this.f69121i;
        if (i12 == -1) {
            i12 = c7272n.f69121i;
        }
        String str4 = this.f69123k;
        if (str4 == null) {
            String w11 = m3.N.w(h11, c7272n.f69123k);
            if (m3.N.d0(w11).length == 1) {
                str4 = w11;
            }
        }
        t tVar = c7272n.f69124l;
        t tVar2 = this.f69124l;
        if (tVar2 != null) {
            tVar = tVar2.b(tVar);
        }
        float f7 = this.f69138z;
        if (f7 == -1.0f && h11 == 2) {
            f7 = c7272n.f69138z;
        }
        int i13 = this.f69117e | c7272n.f69117e;
        int i14 = this.f69118f | c7272n.f69118f;
        C7270l b11 = C7270l.b(c7272n.f69131s, this.f69131s);
        a aVar = new a(this);
        aVar.j0(str2);
        aVar.l0(str3);
        aVar.m0(list);
        aVar.n0(str);
        aVar.A0(i13);
        aVar.w0(i14);
        aVar.S(i11);
        aVar.t0(i12);
        aVar.U(str4);
        aVar.r0(tVar);
        aVar.c0(b11);
        aVar.f0(f7);
        aVar.D0(c7272n.f69109N);
        aVar.E0(c7272n.f69110O);
        return new C7272n(aVar);
    }

    public final boolean equals(Object obj) {
        int i11;
        if (this == obj) {
            return true;
        }
        if (obj != null && C7272n.class == obj.getClass()) {
            C7272n c7272n = (C7272n) obj;
            int i12 = this.f69112Q;
            if ((i12 == 0 || (i11 = c7272n.f69112Q) == 0 || i12 == i11) && this.f69117e == c7272n.f69117e && this.f69118f == c7272n.f69118f && this.f69119g == c7272n.f69119g && this.f69120h == c7272n.f69120h && this.f69121i == c7272n.f69121i && this.f69128p == c7272n.f69128p && this.f69132t == c7272n.f69132t && this.f69134v == c7272n.f69134v && this.f69135w == c7272n.f69135w && this.f69136x == c7272n.f69136x && this.f69137y == c7272n.f69137y && this.f69096A == c7272n.f69096A && this.f69099D == c7272n.f69099D && this.f69101F == c7272n.f69101F && this.f69102G == c7272n.f69102G && this.f69103H == c7272n.f69103H && this.f69104I == c7272n.f69104I && this.f69105J == c7272n.f69105J && this.f69106K == c7272n.f69106K && this.f69107L == c7272n.f69107L && this.f69109N == c7272n.f69109N && this.f69110O == c7272n.f69110O && this.f69111P == c7272n.f69111P && Float.compare(this.f69138z, c7272n.f69138z) == 0 && Float.compare(this.f69097B, c7272n.f69097B) == 0 && Objects.equals(this.f69113a, c7272n.f69113a) && Objects.equals(this.f69114b, c7272n.f69114b) && this.f69115c.equals(c7272n.f69115c) && Objects.equals(this.f69123k, c7272n.f69123k) && Objects.equals(this.f69126n, c7272n.f69126n) && Objects.equals(this.f69127o, c7272n.f69127o) && Objects.equals(this.f69116d, c7272n.f69116d) && Arrays.equals(this.f69098C, c7272n.f69098C) && Objects.equals(this.f69124l, c7272n.f69124l) && Objects.equals(this.f69100E, c7272n.f69100E) && Objects.equals(this.f69131s, c7272n.f69131s) && c(c7272n) && Objects.equals(this.f69125m, c7272n.f69125m)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f69112Q == 0) {
            String str = this.f69113a;
            int hashCode = (527 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f69114b;
            int hashCode2 = (this.f69115c.hashCode() + ((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
            String str3 = this.f69116d;
            int hashCode3 = (((((((((((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f69117e) * 31) + this.f69118f) * 31) + this.f69119g) * 31) + this.f69120h) * 31) + this.f69121i) * 31;
            String str4 = this.f69123k;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            t tVar = this.f69124l;
            int hashCode5 = (hashCode4 + (tVar == null ? 0 : tVar.hashCode())) * 31;
            Object obj = this.f69125m;
            int hashCode6 = (hashCode5 + (obj == null ? 0 : obj.hashCode())) * 31;
            String str5 = this.f69126n;
            int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f69127o;
            this.f69112Q = ((((((((((((((((((((((Float.floatToIntBits(this.f69097B) + ((((Float.floatToIntBits(this.f69138z) + ((((((((((((((hashCode7 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.f69128p) * 31) + ((int) this.f69132t)) * 31) + this.f69134v) * 31) + this.f69135w) * 31) + this.f69136x) * 31) + this.f69137y) * 31)) * 31) + this.f69096A) * 31)) * 31) + this.f69099D) * 31) + this.f69101F) * 31) + this.f69102G) * 31) + this.f69103H) * 31) + this.f69104I) * 31) + this.f69105J) * 31) + this.f69106K) * 31) + this.f69107L) * 31) + this.f69109N) * 31) + this.f69110O) * 31) + this.f69111P;
        }
        return this.f69112Q;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Format(");
        sb2.append(this.f69113a);
        sb2.append(", ");
        sb2.append(this.f69114b);
        sb2.append(", ");
        sb2.append(this.f69126n);
        sb2.append(", ");
        sb2.append(this.f69127o);
        sb2.append(", ");
        sb2.append(this.f69123k);
        sb2.append(", ");
        sb2.append(this.f69122j);
        sb2.append(", ");
        sb2.append(this.f69116d);
        sb2.append(", [");
        sb2.append(this.f69134v);
        sb2.append(", ");
        sb2.append(this.f69135w);
        sb2.append(", ");
        sb2.append(this.f69138z);
        sb2.append(", ");
        sb2.append(this.f69100E);
        sb2.append("], [");
        sb2.append(this.f69102G);
        sb2.append(", ");
        return K00.b.e(this.f69103H, "])", sb2);
    }

    /* renamed from: j3.n$a */
    public static final class a {

        /* renamed from: A, reason: collision with root package name */
        private float f69139A;

        /* renamed from: B, reason: collision with root package name */
        private byte[] f69140B;

        /* renamed from: C, reason: collision with root package name */
        private int f69141C;

        /* renamed from: D, reason: collision with root package name */
        private C7267i f69142D;

        /* renamed from: E, reason: collision with root package name */
        private int f69143E;

        /* renamed from: F, reason: collision with root package name */
        private int f69144F;

        /* renamed from: G, reason: collision with root package name */
        private int f69145G;

        /* renamed from: H, reason: collision with root package name */
        private int f69146H;

        /* renamed from: I, reason: collision with root package name */
        private int f69147I;

        /* renamed from: J, reason: collision with root package name */
        private int f69148J;

        /* renamed from: K, reason: collision with root package name */
        private int f69149K;

        /* renamed from: L, reason: collision with root package name */
        private int f69150L;

        /* renamed from: M, reason: collision with root package name */
        private int f69151M;

        /* renamed from: N, reason: collision with root package name */
        private int f69152N;

        /* renamed from: O, reason: collision with root package name */
        private int f69153O;

        /* renamed from: a, reason: collision with root package name */
        private String f69154a;

        /* renamed from: b, reason: collision with root package name */
        private String f69155b;

        /* renamed from: c, reason: collision with root package name */
        private List<C7274p> f69156c;

        /* renamed from: d, reason: collision with root package name */
        private String f69157d;

        /* renamed from: e, reason: collision with root package name */
        private int f69158e;

        /* renamed from: f, reason: collision with root package name */
        private int f69159f;

        /* renamed from: g, reason: collision with root package name */
        private int f69160g;

        /* renamed from: h, reason: collision with root package name */
        private int f69161h;

        /* renamed from: i, reason: collision with root package name */
        private int f69162i;

        /* renamed from: j, reason: collision with root package name */
        private String f69163j;

        /* renamed from: k, reason: collision with root package name */
        private t f69164k;

        /* renamed from: l, reason: collision with root package name */
        private Object f69165l;

        /* renamed from: m, reason: collision with root package name */
        private String f69166m;

        /* renamed from: n, reason: collision with root package name */
        private String f69167n;

        /* renamed from: o, reason: collision with root package name */
        private int f69168o;

        /* renamed from: p, reason: collision with root package name */
        private int f69169p;

        /* renamed from: q, reason: collision with root package name */
        private List<byte[]> f69170q;

        /* renamed from: r, reason: collision with root package name */
        private C7270l f69171r;

        /* renamed from: s, reason: collision with root package name */
        private long f69172s;

        /* renamed from: t, reason: collision with root package name */
        private boolean f69173t;

        /* renamed from: u, reason: collision with root package name */
        private int f69174u;

        /* renamed from: v, reason: collision with root package name */
        private int f69175v;

        /* renamed from: w, reason: collision with root package name */
        private int f69176w;

        /* renamed from: x, reason: collision with root package name */
        private int f69177x;

        /* renamed from: y, reason: collision with root package name */
        private float f69178y;

        /* renamed from: z, reason: collision with root package name */
        private int f69179z;

        public a() {
            this.f69156c = AbstractC5880y.v();
            this.f69161h = -1;
            this.f69162i = -1;
            this.f69168o = -1;
            this.f69169p = -1;
            this.f69172s = Long.MAX_VALUE;
            this.f69174u = -1;
            this.f69175v = -1;
            this.f69176w = -1;
            this.f69177x = -1;
            this.f69178y = -1.0f;
            this.f69139A = 1.0f;
            this.f69141C = -1;
            this.f69143E = -1;
            this.f69144F = -1;
            this.f69145G = -1;
            this.f69146H = -1;
            this.f69149K = -1;
            this.f69150L = 1;
            this.f69151M = -1;
            this.f69152N = -1;
            this.f69153O = 0;
            this.f69160g = 0;
        }

        public final void A0(int i11) {
            this.f69158e = i11;
        }

        public final void B0(int i11) {
            this.f69141C = i11;
        }

        public final void C0(long j11) {
            this.f69172s = j11;
        }

        public final void D0(int i11) {
            this.f69151M = i11;
        }

        public final void E0(int i11) {
            this.f69152N = i11;
        }

        public final void F0(int i11) {
            this.f69174u = i11;
        }

        public final C7272n P() {
            return new C7272n(this);
        }

        public final void Q(int i11) {
            this.f69149K = i11;
        }

        public final void R(int i11) {
            this.f69160g = i11;
        }

        public final void S(int i11) {
            this.f69161h = i11;
        }

        public final void T(int i11) {
            this.f69144F = i11;
        }

        public final void U(String str) {
            this.f69163j = str;
        }

        public final void V(C7267i c7267i) {
            this.f69142D = c7267i;
        }

        public final void W(String str) {
            this.f69166m = u.m(str);
        }

        public final void X(int i11) {
            this.f69153O = i11;
        }

        public final void Y(int i11) {
            this.f69150L = i11;
        }

        public final void Z(Object obj) {
            this.f69165l = obj;
        }

        public final void a0(int i11) {
            this.f69177x = i11;
        }

        public final void b0(int i11) {
            this.f69176w = i11;
        }

        public final void c0(C7270l c7270l) {
            this.f69171r = c7270l;
        }

        public final void d0(int i11) {
            this.f69147I = i11;
        }

        public final void e0(int i11) {
            this.f69148J = i11;
        }

        public final void f0(float f7) {
            this.f69178y = f7;
        }

        public final void g0() {
            this.f69173t = true;
        }

        public final void h0(int i11) {
            this.f69175v = i11;
        }

        public final void i0(int i11) {
            this.f69154a = Integer.toString(i11);
        }

        public final void j0(String str) {
            this.f69154a = str;
        }

        public final void k0(List list) {
            this.f69170q = list;
        }

        public final void l0(String str) {
            this.f69155b = str;
        }

        public final void m0(List list) {
            this.f69156c = AbstractC5880y.n(list);
        }

        public final void n0(String str) {
            this.f69157d = str;
        }

        public final void o0(int i11) {
            this.f69168o = i11;
        }

        public final void p0(int i11) {
            this.f69169p = i11;
        }

        public final void q0(int i11) {
            this.f69143E = i11;
        }

        public final void r0(t tVar) {
            this.f69164k = tVar;
        }

        public final void s0(int i11) {
            this.f69146H = i11;
        }

        public final void t0(int i11) {
            this.f69162i = i11;
        }

        public final void u0(float f7) {
            this.f69139A = f7;
        }

        public final void v0(byte[] bArr) {
            this.f69140B = bArr;
        }

        public final void w0(int i11) {
            this.f69159f = i11;
        }

        public final void x0(int i11) {
            this.f69179z = i11;
        }

        public final void y0(String str) {
            this.f69167n = u.m(str);
        }

        public final void z0(int i11) {
            this.f69145G = i11;
        }

        a(C7272n c7272n) {
            this.f69154a = c7272n.f69113a;
            this.f69155b = c7272n.f69114b;
            this.f69156c = c7272n.f69115c;
            this.f69157d = c7272n.f69116d;
            this.f69158e = c7272n.f69117e;
            this.f69159f = c7272n.f69118f;
            this.f69161h = c7272n.f69120h;
            this.f69162i = c7272n.f69121i;
            this.f69163j = c7272n.f69123k;
            this.f69164k = c7272n.f69124l;
            this.f69165l = c7272n.f69125m;
            this.f69166m = c7272n.f69126n;
            this.f69167n = c7272n.f69127o;
            this.f69168o = c7272n.f69128p;
            this.f69169p = c7272n.f69129q;
            this.f69170q = c7272n.f69130r;
            this.f69171r = c7272n.f69131s;
            this.f69172s = c7272n.f69132t;
            this.f69173t = c7272n.f69133u;
            this.f69174u = c7272n.f69134v;
            this.f69175v = c7272n.f69135w;
            this.f69176w = c7272n.f69136x;
            this.f69177x = c7272n.f69137y;
            this.f69178y = c7272n.f69138z;
            this.f69179z = c7272n.f69096A;
            this.f69139A = c7272n.f69097B;
            this.f69140B = c7272n.f69098C;
            this.f69141C = c7272n.f69099D;
            this.f69142D = c7272n.f69100E;
            this.f69143E = c7272n.f69101F;
            this.f69144F = c7272n.f69102G;
            this.f69145G = c7272n.f69103H;
            this.f69146H = c7272n.f69104I;
            this.f69147I = c7272n.f69105J;
            this.f69148J = c7272n.f69106K;
            this.f69149K = c7272n.f69107L;
            this.f69150L = c7272n.f69108M;
            this.f69151M = c7272n.f69109N;
            this.f69152N = c7272n.f69110O;
            this.f69153O = c7272n.f69111P;
        }
    }
}
