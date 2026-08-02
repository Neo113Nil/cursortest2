package androidx.media3.exoplayer.trackselection;

import android.content.Context;
import android.graphics.Point;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.accessibility.CaptioningManager;
import androidx.media3.exoplayer.q;
import androidx.media3.exoplayer.source.D;
import androidx.media3.exoplayer.source.m0;
import androidx.media3.exoplayer.trackselection.B;
import androidx.media3.exoplayer.trackselection.C2225a;
import androidx.media3.exoplayer.trackselection.n;
import androidx.media3.exoplayer.trackselection.y;
import b1.AbstractC2346O;
import b1.C2350d;
import b1.P;
import b1.Q;
import b1.S;
import com.google.common.collect.AbstractC3436p;
import com.google.common.collect.AbstractC3445z;
import com.google.common.collect.W;
import e1.AbstractC4134a;
import e1.AbstractC4156x;
import e1.Z;
import io.agora.rtc2.internal.RtcEngineEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;
import m1.k1;
import o1.V;

/* loaded from: classes.dex */
public class n extends B implements q.a {

    /* renamed from: l, reason: collision with root package name */
    public static final W f21961l = W.d(new Comparator() { // from class: androidx.media3.exoplayer.trackselection.d
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return n.w((Integer) obj, (Integer) obj2);
        }
    });

    /* renamed from: d, reason: collision with root package name */
    public final Object f21962d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f21963e;

    /* renamed from: f, reason: collision with root package name */
    public final y.b f21964f;

    /* renamed from: g, reason: collision with root package name */
    public e f21965g;

    /* renamed from: h, reason: collision with root package name */
    public Thread f21966h;

    /* renamed from: i, reason: collision with root package name */
    public g f21967i;

    /* renamed from: j, reason: collision with root package name */
    public C2350d f21968j;

    /* renamed from: k, reason: collision with root package name */
    public Boolean f21969k;

    public static final class b extends i implements Comparable {

        /* renamed from: e, reason: collision with root package name */
        public final int f21970e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f21971f;

        /* renamed from: g, reason: collision with root package name */
        public final String f21972g;

        /* renamed from: h, reason: collision with root package name */
        public final e f21973h;

        /* renamed from: i, reason: collision with root package name */
        public final boolean f21974i;

        /* renamed from: j, reason: collision with root package name */
        public final int f21975j;

        /* renamed from: k, reason: collision with root package name */
        public final int f21976k;

        /* renamed from: l, reason: collision with root package name */
        public final int f21977l;

        /* renamed from: m, reason: collision with root package name */
        public final boolean f21978m;

        /* renamed from: n, reason: collision with root package name */
        public final boolean f21979n;

        /* renamed from: o, reason: collision with root package name */
        public final int f21980o;

        /* renamed from: p, reason: collision with root package name */
        public final int f21981p;

        /* renamed from: q, reason: collision with root package name */
        public final boolean f21982q;

        /* renamed from: r, reason: collision with root package name */
        public final int f21983r;

        /* renamed from: s, reason: collision with root package name */
        public final int f21984s;

        /* renamed from: t, reason: collision with root package name */
        public final int f21985t;

        /* renamed from: u, reason: collision with root package name */
        public final int f21986u;

        /* renamed from: v, reason: collision with root package name */
        public final boolean f21987v;

        /* renamed from: w, reason: collision with root package name */
        public final boolean f21988w;

        /* renamed from: x, reason: collision with root package name */
        public final boolean f21989x;

        public b(int i10, P p10, int i11, e eVar, int i12, boolean z10, Ra.o oVar, int i13) {
            super(i10, p10, i11);
            int i14;
            int i15;
            int i16;
            this.f21973h = eVar;
            int i17 = eVar.f22030y0 ? 24 : 16;
            this.f21978m = eVar.f22026u0 && (i13 & i17) != 0;
            this.f21972g = n.W(this.f22067d.f20532d);
            this.f21974i = androidx.media3.exoplayer.q.k(i12, false);
            int i18 = 0;
            while (true) {
                i14 = Integer.MAX_VALUE;
                if (i18 >= eVar.f24459p.size()) {
                    i15 = 0;
                    i18 = Integer.MAX_VALUE;
                    break;
                } else {
                    i15 = n.J(this.f22067d, (String) eVar.f24459p.get(i18), false);
                    if (i15 > 0) {
                        break;
                    } else {
                        i18++;
                    }
                }
            }
            this.f21976k = i18;
            this.f21975j = i15;
            this.f21977l = n.N(this.f22067d.f20534f, eVar.f24460q);
            androidx.media3.common.a aVar = this.f22067d;
            int i19 = aVar.f20534f;
            this.f21979n = i19 == 0 || (i19 & 1) != 0;
            this.f21982q = (aVar.f20533e & 1) != 0;
            this.f21989x = n.R(aVar);
            androidx.media3.common.a aVar2 = this.f22067d;
            int i20 = aVar2.f20518F;
            this.f21983r = i20;
            this.f21984s = aVar2.f20519G;
            int i21 = aVar2.f20538j;
            this.f21985t = i21;
            this.f21971f = (i21 == -1 || i21 <= eVar.f24462s) && (i20 == -1 || i20 <= eVar.f24461r) && oVar.apply(aVar2);
            String[] v02 = Z.v0();
            int i22 = 0;
            while (true) {
                if (i22 >= v02.length) {
                    i16 = 0;
                    i22 = Integer.MAX_VALUE;
                    break;
                } else {
                    i16 = n.J(this.f22067d, v02[i22], false);
                    if (i16 > 0) {
                        break;
                    } else {
                        i22++;
                    }
                }
            }
            this.f21980o = i22;
            this.f21981p = i16;
            int i23 = 0;
            while (true) {
                if (i23 < eVar.f24463t.size()) {
                    String str = this.f22067d.f20543o;
                    if (str != null && str.equals(eVar.f24463t.get(i23))) {
                        i14 = i23;
                        break;
                    }
                    i23++;
                } else {
                    break;
                }
            }
            this.f21986u = i14;
            this.f21987v = androidx.media3.exoplayer.q.j(i12) == 128;
            this.f21988w = androidx.media3.exoplayer.q.E(i12) == 64;
            this.f21970e = f(i12, z10, i17);
        }

        public static int c(List list, List list2) {
            return ((b) Collections.max(list)).compareTo((b) Collections.max(list2));
        }

        public static AbstractC3445z e(int i10, P p10, e eVar, int[] iArr, boolean z10, Ra.o oVar, int i11) {
            AbstractC3445z.a k10 = AbstractC3445z.k();
            for (int i12 = 0; i12 < p10.f24395a; i12++) {
                k10.a(new b(i10, p10, i12, eVar, iArr[i12], z10, oVar, i11));
            }
            return k10.m();
        }

        @Override // androidx.media3.exoplayer.trackselection.n.i
        public int a() {
            return this.f21970e;
        }

        @Override // java.lang.Comparable
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            W o10 = (this.f21971f && this.f21974i) ? n.f21961l : n.f21961l.o();
            AbstractC3436p f10 = AbstractC3436p.j().g(this.f21974i, bVar.f21974i).f(Integer.valueOf(this.f21976k), Integer.valueOf(bVar.f21976k), W.h().o()).d(this.f21975j, bVar.f21975j).d(this.f21977l, bVar.f21977l).g(this.f21982q, bVar.f21982q).g(this.f21979n, bVar.f21979n).f(Integer.valueOf(this.f21980o), Integer.valueOf(bVar.f21980o), W.h().o()).d(this.f21981p, bVar.f21981p).g(this.f21971f, bVar.f21971f).f(Integer.valueOf(this.f21986u), Integer.valueOf(bVar.f21986u), W.h().o());
            if (this.f21973h.f24440B) {
                f10 = f10.f(Integer.valueOf(this.f21985t), Integer.valueOf(bVar.f21985t), n.f21961l.o());
            }
            AbstractC3436p f11 = f10.g(this.f21987v, bVar.f21987v).g(this.f21988w, bVar.f21988w).g(this.f21989x, bVar.f21989x).f(Integer.valueOf(this.f21983r), Integer.valueOf(bVar.f21983r), o10).f(Integer.valueOf(this.f21984s), Integer.valueOf(bVar.f21984s), o10);
            if (Objects.equals(this.f21972g, bVar.f21972g)) {
                f11 = f11.f(Integer.valueOf(this.f21985t), Integer.valueOf(bVar.f21985t), o10);
            }
            return f11.i();
        }

        public final int f(int i10, boolean z10, int i11) {
            if (!androidx.media3.exoplayer.q.k(i10, this.f21973h.f22015A0)) {
                return 0;
            }
            if (!this.f21971f && !this.f21973h.f22025t0) {
                return 0;
            }
            e eVar = this.f21973h;
            if (eVar.f24464u.f24474a == 2 && !n.X(eVar, i10, this.f22067d)) {
                return 0;
            }
            if (!androidx.media3.exoplayer.q.k(i10, false) || !this.f21971f || this.f22067d.f20538j == -1) {
                return 1;
            }
            e eVar2 = this.f21973h;
            if (eVar2.f24441C || eVar2.f24440B) {
                return 1;
            }
            return ((!eVar2.f22017C0 && z10) || eVar2.f24464u.f24474a == 2 || (i10 & i11) == 0) ? 1 : 2;
        }

        @Override // androidx.media3.exoplayer.trackselection.n.i
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public boolean b(b bVar) {
            int i10;
            String str;
            int i11;
            if (!this.f21973h.f22028w0 && ((i11 = this.f22067d.f20518F) == -1 || i11 != bVar.f22067d.f20518F)) {
                return false;
            }
            if (!this.f21978m && ((str = this.f22067d.f20543o) == null || !TextUtils.equals(str, bVar.f22067d.f20543o))) {
                return false;
            }
            e eVar = this.f21973h;
            if (!eVar.f22027v0 && ((i10 = this.f22067d.f20519G) == -1 || i10 != bVar.f22067d.f20519G)) {
                return false;
            }
            if (eVar.f22029x0) {
                return true;
            }
            return this.f21987v == bVar.f21987v && this.f21988w == bVar.f21988w;
        }
    }

    public static final class c extends i implements Comparable {

        /* renamed from: e, reason: collision with root package name */
        public final int f21990e;

        /* renamed from: f, reason: collision with root package name */
        public final int f21991f;

        public c(int i10, P p10, int i11, e eVar, int i12) {
            super(i10, p10, i11);
            this.f21990e = androidx.media3.exoplayer.q.k(i12, eVar.f22015A0) ? 1 : 0;
            this.f21991f = this.f22067d.e();
        }

        public static int c(List list, List list2) {
            return ((c) list.get(0)).compareTo((c) list2.get(0));
        }

        public static AbstractC3445z e(int i10, P p10, e eVar, int[] iArr) {
            AbstractC3445z.a k10 = AbstractC3445z.k();
            for (int i11 = 0; i11 < p10.f24395a; i11++) {
                k10.a(new c(i10, p10, i11, eVar, iArr[i11]));
            }
            return k10.m();
        }

        @Override // androidx.media3.exoplayer.trackselection.n.i
        public int a() {
            return this.f21990e;
        }

        @Override // java.lang.Comparable
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public int compareTo(c cVar) {
            return Integer.compare(this.f21991f, cVar.f21991f);
        }

        @Override // androidx.media3.exoplayer.trackselection.n.i
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public boolean b(c cVar) {
            return false;
        }
    }

    public static final class d implements Comparable {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f21992a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f21993b;

        public d(androidx.media3.common.a aVar, int i10) {
            this.f21992a = (aVar.f20533e & 1) != 0;
            this.f21993b = androidx.media3.exoplayer.q.k(i10, false);
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(d dVar) {
            return AbstractC3436p.j().g(this.f21993b, dVar.f21993b).g(this.f21992a, dVar.f21992a).i();
        }
    }

    public static final class e extends S {

        /* renamed from: G0, reason: collision with root package name */
        public static final e f21994G0;

        /* renamed from: H0, reason: collision with root package name */
        public static final e f21995H0;

        /* renamed from: I0, reason: collision with root package name */
        public static final String f21996I0;

        /* renamed from: J0, reason: collision with root package name */
        public static final String f21997J0;

        /* renamed from: K0, reason: collision with root package name */
        public static final String f21998K0;

        /* renamed from: L0, reason: collision with root package name */
        public static final String f21999L0;

        /* renamed from: M0, reason: collision with root package name */
        public static final String f22000M0;

        /* renamed from: N0, reason: collision with root package name */
        public static final String f22001N0;

        /* renamed from: O0, reason: collision with root package name */
        public static final String f22002O0;

        /* renamed from: P0, reason: collision with root package name */
        public static final String f22003P0;

        /* renamed from: Q0, reason: collision with root package name */
        public static final String f22004Q0;

        /* renamed from: R0, reason: collision with root package name */
        public static final String f22005R0;

        /* renamed from: S0, reason: collision with root package name */
        public static final String f22006S0;

        /* renamed from: T0, reason: collision with root package name */
        public static final String f22007T0;

        /* renamed from: U0, reason: collision with root package name */
        public static final String f22008U0;

        /* renamed from: V0, reason: collision with root package name */
        public static final String f22009V0;

        /* renamed from: W0, reason: collision with root package name */
        public static final String f22010W0;

        /* renamed from: X0, reason: collision with root package name */
        public static final String f22011X0;

        /* renamed from: Y0, reason: collision with root package name */
        public static final String f22012Y0;

        /* renamed from: Z0, reason: collision with root package name */
        public static final String f22013Z0;

        /* renamed from: a1, reason: collision with root package name */
        public static final String f22014a1;

        /* renamed from: A0, reason: collision with root package name */
        public final boolean f22015A0;

        /* renamed from: B0, reason: collision with root package name */
        public final boolean f22016B0;

        /* renamed from: C0, reason: collision with root package name */
        public final boolean f22017C0;

        /* renamed from: D0, reason: collision with root package name */
        public final boolean f22018D0;

        /* renamed from: E0, reason: collision with root package name */
        public final SparseArray f22019E0;

        /* renamed from: F0, reason: collision with root package name */
        public final SparseBooleanArray f22020F0;

        /* renamed from: p0, reason: collision with root package name */
        public final boolean f22021p0;

        /* renamed from: q0, reason: collision with root package name */
        public final boolean f22022q0;

        /* renamed from: r0, reason: collision with root package name */
        public final boolean f22023r0;

        /* renamed from: s0, reason: collision with root package name */
        public final boolean f22024s0;

        /* renamed from: t0, reason: collision with root package name */
        public final boolean f22025t0;

        /* renamed from: u0, reason: collision with root package name */
        public final boolean f22026u0;

        /* renamed from: v0, reason: collision with root package name */
        public final boolean f22027v0;

        /* renamed from: w0, reason: collision with root package name */
        public final boolean f22028w0;

        /* renamed from: x0, reason: collision with root package name */
        public final boolean f22029x0;

        /* renamed from: y0, reason: collision with root package name */
        public final boolean f22030y0;

        /* renamed from: z0, reason: collision with root package name */
        public final boolean f22031z0;

        public static final class a extends S.c {

            /* renamed from: F, reason: collision with root package name */
            public boolean f22032F;

            /* renamed from: G, reason: collision with root package name */
            public boolean f22033G;

            /* renamed from: H, reason: collision with root package name */
            public boolean f22034H;

            /* renamed from: I, reason: collision with root package name */
            public boolean f22035I;

            /* renamed from: J, reason: collision with root package name */
            public boolean f22036J;

            /* renamed from: K, reason: collision with root package name */
            public boolean f22037K;

            /* renamed from: L, reason: collision with root package name */
            public boolean f22038L;

            /* renamed from: M, reason: collision with root package name */
            public boolean f22039M;

            /* renamed from: N, reason: collision with root package name */
            public boolean f22040N;

            /* renamed from: O, reason: collision with root package name */
            public boolean f22041O;

            /* renamed from: P, reason: collision with root package name */
            public boolean f22042P;

            /* renamed from: Q, reason: collision with root package name */
            public boolean f22043Q;

            /* renamed from: R, reason: collision with root package name */
            public boolean f22044R;

            /* renamed from: S, reason: collision with root package name */
            public boolean f22045S;

            /* renamed from: T, reason: collision with root package name */
            public boolean f22046T;

            /* renamed from: U, reason: collision with root package name */
            public final SparseArray f22047U;

            /* renamed from: V, reason: collision with root package name */
            public final SparseBooleanArray f22048V;

            public static SparseArray p0(SparseArray sparseArray) {
                SparseArray sparseArray2 = new SparseArray();
                for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                    sparseArray2.put(sparseArray.keyAt(i10), new HashMap((Map) sparseArray.valueAt(i10)));
                }
                return sparseArray2;
            }

            public a A0(int i10) {
                super.P(i10);
                return this;
            }

            @Override // b1.S.c
            /* renamed from: B0, reason: merged with bridge method [inline-methods] */
            public a Q(Q q10) {
                super.Q(q10);
                return this;
            }

            @Override // b1.S.c
            /* renamed from: C0, reason: merged with bridge method [inline-methods] */
            public a R(String str) {
                super.R(str);
                return this;
            }

            @Override // b1.S.c
            /* renamed from: D0, reason: merged with bridge method [inline-methods] */
            public a S(String... strArr) {
                super.S(strArr);
                return this;
            }

            @Override // b1.S.c
            /* renamed from: E0, reason: merged with bridge method [inline-methods] */
            public a T(int i10) {
                super.T(i10);
                return this;
            }

            public a F0(int i10, boolean z10) {
                if (this.f22048V.get(i10) == z10) {
                    return this;
                }
                if (z10) {
                    this.f22048V.put(i10, true);
                    return this;
                }
                this.f22048V.delete(i10);
                return this;
            }

            @Override // b1.S.c
            /* renamed from: G0, reason: merged with bridge method [inline-methods] */
            public a U(int i10, boolean z10) {
                super.U(i10, z10);
                return this;
            }

            public a m0(Q q10) {
                super.F(q10);
                return this;
            }

            @Override // b1.S.c
            /* renamed from: n0, reason: merged with bridge method [inline-methods] */
            public e G() {
                return new e(this);
            }

            @Override // b1.S.c
            /* renamed from: o0, reason: merged with bridge method [inline-methods] */
            public a H(int i10) {
                super.H(i10);
                return this;
            }

            public final void q0() {
                this.f22032F = true;
                this.f22033G = false;
                this.f22034H = true;
                this.f22035I = false;
                this.f22036J = true;
                this.f22037K = false;
                this.f22038L = false;
                this.f22039M = false;
                this.f22040N = false;
                this.f22041O = true;
                this.f22042P = true;
                this.f22043Q = true;
                this.f22044R = false;
                this.f22045S = true;
                this.f22046T = false;
            }

            public a r0(S s10) {
                super.K(s10);
                return this;
            }

            public a s0(boolean z10) {
                this.f22042P = z10;
                return this;
            }

            @Override // b1.S.c
            /* renamed from: t0, reason: merged with bridge method [inline-methods] */
            public a L(Set set) {
                super.L(set);
                return this;
            }

            public a u0(boolean z10) {
                this.f22036J = z10;
                return this;
            }

            public a v0(boolean z10) {
                this.f22043Q = z10;
                return this;
            }

            public a w0(boolean z10) {
                this.f22032F = z10;
                return this;
            }

            public a x0(boolean z10) {
                super.M(z10);
                return this;
            }

            public a y0(boolean z10) {
                super.N(z10);
                return this;
            }

            @Override // b1.S.c
            /* renamed from: z0, reason: merged with bridge method [inline-methods] */
            public a O(int i10) {
                super.O(i10);
                return this;
            }

            public a() {
                this.f22047U = new SparseArray();
                this.f22048V = new SparseBooleanArray();
                q0();
            }

            public a(Context context) {
                this();
            }

            public a(e eVar) {
                super(eVar);
                this.f22032F = eVar.f22021p0;
                this.f22033G = eVar.f22022q0;
                this.f22034H = eVar.f22023r0;
                this.f22035I = eVar.f22024s0;
                this.f22036J = eVar.f22025t0;
                this.f22037K = eVar.f22026u0;
                this.f22038L = eVar.f22027v0;
                this.f22039M = eVar.f22028w0;
                this.f22040N = eVar.f22029x0;
                this.f22041O = eVar.f22030y0;
                this.f22042P = eVar.f22031z0;
                this.f22043Q = eVar.f22015A0;
                this.f22044R = eVar.f22016B0;
                this.f22045S = eVar.f22017C0;
                this.f22046T = eVar.f22018D0;
                this.f22047U = p0(eVar.f22019E0);
                this.f22048V = eVar.f22020F0.clone();
            }
        }

        static {
            e G10 = new a().G();
            f21994G0 = G10;
            f21995H0 = G10;
            f21996I0 = Z.K0(1000);
            f21997J0 = Z.K0(1001);
            f21998K0 = Z.K0(RtcEngineEvent.EvtType.EVT_MEDIA_ENGINE_LOAD_SUCCESS);
            f21999L0 = Z.K0(1003);
            f22000M0 = Z.K0(1004);
            f22001N0 = Z.K0(1005);
            f22002O0 = Z.K0(RtcEngineEvent.EvtType.EVT_MEDIA_ENGINE_START_CALL_SUCCESS);
            f22003P0 = Z.K0(RtcEngineEvent.EvtType.EVT_VIDEO_STOPPED);
            f22004Q0 = Z.K0(1008);
            f22005R0 = Z.K0(1009);
            f22006S0 = Z.K0(1010);
            f22007T0 = Z.K0(1011);
            f22008U0 = Z.K0(1012);
            f22009V0 = Z.K0(1013);
            f22010W0 = Z.K0(1014);
            f22011X0 = Z.K0(1015);
            f22012Y0 = Z.K0(1016);
            f22013Z0 = Z.K0(1017);
            f22014a1 = Z.K0(1018);
        }

        public static boolean d(SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2) {
            int size = sparseBooleanArray.size();
            if (sparseBooleanArray2.size() != size) {
                return false;
            }
            for (int i10 = 0; i10 < size; i10++) {
                if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i10)) < 0) {
                    return false;
                }
            }
            return true;
        }

        public static boolean e(SparseArray sparseArray, SparseArray sparseArray2) {
            int size = sparseArray.size();
            if (sparseArray2.size() != size) {
                return false;
            }
            for (int i10 = 0; i10 < size; i10++) {
                int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i10));
                if (indexOfKey < 0 || !f((Map) sparseArray.valueAt(i10), (Map) sparseArray2.valueAt(indexOfKey))) {
                    return false;
                }
            }
            return true;
        }

        public static boolean f(Map map, Map map2) {
            if (map2.size() != map.size()) {
                return false;
            }
            for (Map.Entry entry : map.entrySet()) {
                m0 m0Var = (m0) entry.getKey();
                if (!map2.containsKey(m0Var) || !Objects.equals(entry.getValue(), map2.get(m0Var))) {
                    return false;
                }
            }
            return true;
        }

        @Override // b1.S
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && e.class == obj.getClass()) {
                e eVar = (e) obj;
                if (super.equals(eVar) && this.f22021p0 == eVar.f22021p0 && this.f22022q0 == eVar.f22022q0 && this.f22023r0 == eVar.f22023r0 && this.f22024s0 == eVar.f22024s0 && this.f22025t0 == eVar.f22025t0 && this.f22026u0 == eVar.f22026u0 && this.f22027v0 == eVar.f22027v0 && this.f22028w0 == eVar.f22028w0 && this.f22029x0 == eVar.f22029x0 && this.f22030y0 == eVar.f22030y0 && this.f22031z0 == eVar.f22031z0 && this.f22015A0 == eVar.f22015A0 && this.f22016B0 == eVar.f22016B0 && this.f22017C0 == eVar.f22017C0 && this.f22018D0 == eVar.f22018D0 && d(this.f22020F0, eVar.f22020F0) && e(this.f22019E0, eVar.f22019E0)) {
                    return true;
                }
            }
            return false;
        }

        @Override // b1.S
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public a a() {
            return new a();
        }

        public boolean h(int i10) {
            return this.f22020F0.get(i10);
        }

        @Override // b1.S
        public int hashCode() {
            return ((((((((((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.f22021p0 ? 1 : 0)) * 31) + (this.f22022q0 ? 1 : 0)) * 31) + (this.f22023r0 ? 1 : 0)) * 31) + (this.f22024s0 ? 1 : 0)) * 31) + (this.f22025t0 ? 1 : 0)) * 31) + (this.f22026u0 ? 1 : 0)) * 31) + (this.f22027v0 ? 1 : 0)) * 31) + (this.f22028w0 ? 1 : 0)) * 31) + (this.f22029x0 ? 1 : 0)) * 31) + (this.f22030y0 ? 1 : 0)) * 31) + (this.f22031z0 ? 1 : 0)) * 31) + (this.f22015A0 ? 1 : 0)) * 31) + (this.f22016B0 ? 1 : 0)) * 31) + (this.f22017C0 ? 1 : 0)) * 31) + (this.f22018D0 ? 1 : 0);
        }

        public f i(int i10, m0 m0Var) {
            Map map = (Map) this.f22019E0.get(i10);
            if (map != null) {
                android.support.v4.media.session.b.a(map.get(m0Var));
            }
            return null;
        }

        public boolean j(int i10, m0 m0Var) {
            Map map = (Map) this.f22019E0.get(i10);
            return map != null && map.containsKey(m0Var);
        }

        public e(a aVar) {
            super(aVar);
            this.f22021p0 = aVar.f22032F;
            this.f22022q0 = aVar.f22033G;
            this.f22023r0 = aVar.f22034H;
            this.f22024s0 = aVar.f22035I;
            this.f22025t0 = aVar.f22036J;
            this.f22026u0 = aVar.f22037K;
            this.f22027v0 = aVar.f22038L;
            this.f22028w0 = aVar.f22039M;
            this.f22029x0 = aVar.f22040N;
            this.f22030y0 = aVar.f22041O;
            this.f22031z0 = aVar.f22042P;
            this.f22015A0 = aVar.f22043Q;
            this.f22016B0 = aVar.f22044R;
            this.f22017C0 = aVar.f22045S;
            this.f22018D0 = aVar.f22046T;
            this.f22019E0 = aVar.f22047U;
            this.f22020F0 = aVar.f22048V;
        }
    }

    public static final class f {
    }

    public static class g {

        /* renamed from: a, reason: collision with root package name */
        public final Spatializer f22049a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f22050b;

        /* renamed from: c, reason: collision with root package name */
        public final Handler f22051c;

        /* renamed from: d, reason: collision with root package name */
        public final Spatializer$OnSpatializerStateChangedListener f22052d;

        public class a implements Spatializer$OnSpatializerStateChangedListener {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ n f22053a;

            public a(n nVar) {
                this.f22053a = nVar;
            }

            public void onSpatializerAvailableChanged(Spatializer spatializer, boolean z10) {
                this.f22053a.U();
            }

            public void onSpatializerEnabledChanged(Spatializer spatializer, boolean z10) {
                this.f22053a.U();
            }
        }

        public g(Context context, n nVar, Boolean bool) {
            Spatializer spatializer;
            int immersiveAudioLevel;
            AudioManager c10 = context == null ? null : c1.m.c(context);
            if (c10 == null || (bool != null && bool.booleanValue())) {
                this.f22049a = null;
                this.f22050b = false;
                this.f22051c = null;
                this.f22052d = null;
                return;
            }
            spatializer = c10.getSpatializer();
            this.f22049a = spatializer;
            immersiveAudioLevel = spatializer.getImmersiveAudioLevel();
            this.f22050b = immersiveAudioLevel != 0;
            a aVar = new a(nVar);
            this.f22052d = aVar;
            Handler handler = new Handler((Looper) AbstractC4134a.i(Looper.myLooper()));
            this.f22051c = handler;
            Objects.requireNonNull(handler);
            spatializer.addOnSpatializerStateChangedListener(new V(handler), aVar);
        }

        public boolean a(C2350d c2350d, androidx.media3.common.a aVar) {
            int i10;
            boolean canBeSpatialized;
            if (Objects.equals(aVar.f20543o, "audio/eac3-joc")) {
                i10 = aVar.f20518F;
                if (i10 == 16) {
                    i10 = 12;
                }
            } else if (Objects.equals(aVar.f20543o, "audio/iamf")) {
                i10 = aVar.f20518F;
                if (i10 == -1) {
                    i10 = 6;
                }
            } else if (Objects.equals(aVar.f20543o, "audio/ac4")) {
                i10 = aVar.f20518F;
                if (i10 == 18 || i10 == 21) {
                    i10 = 24;
                }
            } else {
                i10 = aVar.f20518F;
            }
            int N10 = Z.N(i10);
            if (N10 == 0) {
                return false;
            }
            AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(N10);
            int i11 = aVar.f20519G;
            if (i11 != -1) {
                channelMask.setSampleRate(i11);
            }
            canBeSpatialized = s.a(AbstractC4134a.e(this.f22049a)).canBeSpatialized(c2350d.a().f24581a, channelMask.build());
            return canBeSpatialized;
        }

        public boolean b() {
            boolean isAvailable;
            isAvailable = s.a(AbstractC4134a.e(this.f22049a)).isAvailable();
            return isAvailable;
        }

        public boolean c() {
            boolean isEnabled;
            isEnabled = s.a(AbstractC4134a.e(this.f22049a)).isEnabled();
            return isEnabled;
        }

        public boolean d() {
            return this.f22050b;
        }

        public void e() {
            Spatializer$OnSpatializerStateChangedListener spatializer$OnSpatializerStateChangedListener;
            Spatializer spatializer = this.f22049a;
            if (spatializer == null || (spatializer$OnSpatializerStateChangedListener = this.f22052d) == null || this.f22051c == null) {
                return;
            }
            spatializer.removeOnSpatializerStateChangedListener(spatializer$OnSpatializerStateChangedListener);
            this.f22051c.removeCallbacksAndMessages(null);
        }
    }

    public static final class h extends i implements Comparable {

        /* renamed from: e, reason: collision with root package name */
        public final int f22055e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f22056f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f22057g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f22058h;

        /* renamed from: i, reason: collision with root package name */
        public final int f22059i;

        /* renamed from: j, reason: collision with root package name */
        public final int f22060j;

        /* renamed from: k, reason: collision with root package name */
        public final int f22061k;

        /* renamed from: l, reason: collision with root package name */
        public final int f22062l;

        /* renamed from: m, reason: collision with root package name */
        public final boolean f22063m;

        public h(int i10, P p10, int i11, e eVar, int i12, String str, String str2) {
            super(i10, p10, i11);
            int i13;
            int i14 = 0;
            this.f22056f = androidx.media3.exoplayer.q.k(i12, false);
            int i15 = this.f22067d.f20533e & (~eVar.f24468y);
            this.f22057g = (i15 & 1) != 0;
            this.f22058h = (i15 & 2) != 0;
            AbstractC3445z u10 = str2 != null ? AbstractC3445z.u(str2) : eVar.f24465v.isEmpty() ? AbstractC3445z.u("") : eVar.f24465v;
            int i16 = 0;
            while (true) {
                if (i16 >= u10.size()) {
                    i16 = Integer.MAX_VALUE;
                    i13 = 0;
                    break;
                } else {
                    i13 = n.J(this.f22067d, (String) u10.get(i16), eVar.f24469z);
                    if (i13 > 0) {
                        break;
                    } else {
                        i16++;
                    }
                }
            }
            this.f22059i = i16;
            this.f22060j = i13;
            int N10 = n.N(this.f22067d.f20534f, str2 != null ? 1088 : eVar.f24466w);
            this.f22061k = N10;
            this.f22063m = (1088 & this.f22067d.f20534f) != 0;
            int J10 = n.J(this.f22067d, str, n.W(str) == null);
            this.f22062l = J10;
            boolean z10 = i13 > 0 || (eVar.f24465v.isEmpty() && N10 > 0) || this.f22057g || (this.f22058h && J10 > 0);
            if (androidx.media3.exoplayer.q.k(i12, eVar.f22015A0) && z10) {
                i14 = 1;
            }
            this.f22055e = i14;
        }

        public static int c(List list, List list2) {
            return ((h) list.get(0)).compareTo((h) list2.get(0));
        }

        public static AbstractC3445z e(int i10, P p10, e eVar, int[] iArr, String str, String str2) {
            AbstractC3445z.a k10 = AbstractC3445z.k();
            for (int i11 = 0; i11 < p10.f24395a; i11++) {
                k10.a(new h(i10, p10, i11, eVar, iArr[i11], str, str2));
            }
            return k10.m();
        }

        @Override // androidx.media3.exoplayer.trackselection.n.i
        public int a() {
            return this.f22055e;
        }

        @Override // java.lang.Comparable
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public int compareTo(h hVar) {
            AbstractC3436p d10 = AbstractC3436p.j().g(this.f22056f, hVar.f22056f).f(Integer.valueOf(this.f22059i), Integer.valueOf(hVar.f22059i), W.h().o()).d(this.f22060j, hVar.f22060j).d(this.f22061k, hVar.f22061k).g(this.f22057g, hVar.f22057g).f(Boolean.valueOf(this.f22058h), Boolean.valueOf(hVar.f22058h), this.f22060j == 0 ? W.h() : W.h().o()).d(this.f22062l, hVar.f22062l);
            if (this.f22061k == 0) {
                d10 = d10.h(this.f22063m, hVar.f22063m);
            }
            return d10.i();
        }

        @Override // androidx.media3.exoplayer.trackselection.n.i
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public boolean b(h hVar) {
            return false;
        }
    }

    public static abstract class i {

        /* renamed from: a, reason: collision with root package name */
        public final int f22064a;

        /* renamed from: b, reason: collision with root package name */
        public final P f22065b;

        /* renamed from: c, reason: collision with root package name */
        public final int f22066c;

        /* renamed from: d, reason: collision with root package name */
        public final androidx.media3.common.a f22067d;

        public interface a {
            List a(int i10, P p10, int[] iArr);
        }

        public i(int i10, P p10, int i11) {
            this.f22064a = i10;
            this.f22065b = p10;
            this.f22066c = i11;
            this.f22067d = p10.a(i11);
        }

        public abstract int a();

        public abstract boolean b(i iVar);
    }

    public static final class j extends i {

        /* renamed from: e, reason: collision with root package name */
        public final boolean f22068e;

        /* renamed from: f, reason: collision with root package name */
        public final e f22069f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f22070g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f22071h;

        /* renamed from: i, reason: collision with root package name */
        public final boolean f22072i;

        /* renamed from: j, reason: collision with root package name */
        public final int f22073j;

        /* renamed from: k, reason: collision with root package name */
        public final int f22074k;

        /* renamed from: l, reason: collision with root package name */
        public final int f22075l;

        /* renamed from: m, reason: collision with root package name */
        public final int f22076m;

        /* renamed from: n, reason: collision with root package name */
        public final int f22077n;

        /* renamed from: o, reason: collision with root package name */
        public final int f22078o;

        /* renamed from: p, reason: collision with root package name */
        public final boolean f22079p;

        /* renamed from: q, reason: collision with root package name */
        public final int f22080q;

        /* renamed from: r, reason: collision with root package name */
        public final boolean f22081r;

        /* renamed from: s, reason: collision with root package name */
        public final int f22082s;

        /* renamed from: t, reason: collision with root package name */
        public final boolean f22083t;

        /* renamed from: u, reason: collision with root package name */
        public final boolean f22084u;

        /* renamed from: v, reason: collision with root package name */
        public final int f22085v;

        /* JADX WARN: Removed duplicated region for block: B:49:0x008a  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x00ab  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x00d7  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x00e6  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x00fa  */
        /* JADX WARN: Removed duplicated region for block: B:78:0x011b  */
        /* JADX WARN: Removed duplicated region for block: B:81:0x0129  */
        /* JADX WARN: Removed duplicated region for block: B:85:0x011d  */
        /* JADX WARN: Removed duplicated region for block: B:89:0x0111 A[EDGE_INSN: B:89:0x0111->B:76:0x0111 BREAK  A[LOOP:1: B:68:0x00f2->B:87:0x010e], SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:90:0x00e8  */
        /* JADX WARN: Removed duplicated region for block: B:92:0x00bf A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public j(int i10, P p10, int i11, e eVar, int i12, String str, int i13, boolean z10) {
            super(i10, p10, i11);
            boolean z11;
            boolean z12;
            int i14;
            int i15;
            int i16;
            int i17;
            androidx.media3.common.a aVar;
            int i18;
            int i19;
            float f10;
            int i20;
            androidx.media3.common.a aVar2;
            int i21;
            int i22;
            int i23;
            this.f22069f = eVar;
            int i24 = eVar.f22023r0 ? 24 : 16;
            this.f22081r = eVar.f22022q0 && (i13 & i24) != 0;
            if (z10 && (((i21 = (aVar2 = this.f22067d).f20550v) == -1 || i21 <= eVar.f24444a) && ((i22 = aVar2.f20551w) == -1 || i22 <= eVar.f24445b))) {
                float f11 = aVar2.f20554z;
                if ((f11 == -1.0f || f11 <= eVar.f24446c) && ((i23 = aVar2.f20538j) == -1 || i23 <= eVar.f24447d)) {
                    z11 = true;
                    this.f22068e = z11;
                    if (z10 && (((i18 = (aVar = this.f22067d).f20550v) == -1 || i18 >= eVar.f24448e) && ((i19 = aVar.f20551w) == -1 || i19 >= eVar.f24449f))) {
                        f10 = aVar.f20554z;
                        if ((f10 != -1.0f || f10 >= eVar.f24450g) && ((i20 = aVar.f20538j) == -1 || i20 >= eVar.f24451h)) {
                            z12 = true;
                            this.f22070g = z12;
                            this.f22071h = androidx.media3.exoplayer.q.k(i12, false);
                            androidx.media3.common.a aVar3 = this.f22067d;
                            float f12 = aVar3.f20554z;
                            this.f22072i = f12 == -1.0f && f12 >= 10.0f;
                            this.f22073j = aVar3.f20538j;
                            this.f22074k = aVar3.e();
                            i14 = 0;
                            while (true) {
                                i15 = Integer.MAX_VALUE;
                                if (i14 < eVar.f24457n.size()) {
                                    i14 = Integer.MAX_VALUE;
                                    i16 = 0;
                                    break;
                                } else {
                                    i16 = n.J(this.f22067d, (String) eVar.f24457n.get(i14), false);
                                    if (i16 > 0) {
                                        break;
                                    } else {
                                        i14++;
                                    }
                                }
                            }
                            this.f22076m = i14;
                            this.f22077n = i16;
                            this.f22078o = n.N(this.f22067d.f20534f, eVar.f24458o);
                            int i25 = this.f22067d.f20534f;
                            this.f22079p = (i25 == 0 && (i25 & 1) == 0) ? false : true;
                            this.f22080q = n.J(this.f22067d, str, n.W(str) != null);
                            i17 = 0;
                            while (true) {
                                if (i17 < eVar.f24456m.size()) {
                                    String str2 = this.f22067d.f20543o;
                                    if (str2 != null && str2.equals(eVar.f24456m.get(i17))) {
                                        i15 = i17;
                                        break;
                                    }
                                    i17++;
                                } else {
                                    break;
                                }
                            }
                            this.f22075l = i15;
                            this.f22083t = androidx.media3.exoplayer.q.j(i12) != 128;
                            this.f22084u = androidx.media3.exoplayer.q.E(i12) == 64;
                            this.f22085v = n.O(this.f22067d.f20543o);
                            this.f22082s = i(i12, i24);
                        }
                    }
                    z12 = false;
                    this.f22070g = z12;
                    this.f22071h = androidx.media3.exoplayer.q.k(i12, false);
                    androidx.media3.common.a aVar32 = this.f22067d;
                    float f122 = aVar32.f20554z;
                    this.f22072i = f122 == -1.0f && f122 >= 10.0f;
                    this.f22073j = aVar32.f20538j;
                    this.f22074k = aVar32.e();
                    i14 = 0;
                    while (true) {
                        i15 = Integer.MAX_VALUE;
                        if (i14 < eVar.f24457n.size()) {
                        }
                        i14++;
                    }
                    this.f22076m = i14;
                    this.f22077n = i16;
                    this.f22078o = n.N(this.f22067d.f20534f, eVar.f24458o);
                    int i252 = this.f22067d.f20534f;
                    this.f22079p = (i252 == 0 && (i252 & 1) == 0) ? false : true;
                    this.f22080q = n.J(this.f22067d, str, n.W(str) != null);
                    i17 = 0;
                    while (true) {
                        if (i17 < eVar.f24456m.size()) {
                        }
                        i17++;
                    }
                    this.f22075l = i15;
                    this.f22083t = androidx.media3.exoplayer.q.j(i12) != 128;
                    this.f22084u = androidx.media3.exoplayer.q.E(i12) == 64;
                    this.f22085v = n.O(this.f22067d.f20543o);
                    this.f22082s = i(i12, i24);
                }
            }
            z11 = false;
            this.f22068e = z11;
            if (z10) {
                f10 = aVar.f20554z;
                if (f10 != -1.0f) {
                }
                z12 = true;
                this.f22070g = z12;
                this.f22071h = androidx.media3.exoplayer.q.k(i12, false);
                androidx.media3.common.a aVar322 = this.f22067d;
                float f1222 = aVar322.f20554z;
                this.f22072i = f1222 == -1.0f && f1222 >= 10.0f;
                this.f22073j = aVar322.f20538j;
                this.f22074k = aVar322.e();
                i14 = 0;
                while (true) {
                    i15 = Integer.MAX_VALUE;
                    if (i14 < eVar.f24457n.size()) {
                    }
                    i14++;
                }
                this.f22076m = i14;
                this.f22077n = i16;
                this.f22078o = n.N(this.f22067d.f20534f, eVar.f24458o);
                int i2522 = this.f22067d.f20534f;
                this.f22079p = (i2522 == 0 && (i2522 & 1) == 0) ? false : true;
                this.f22080q = n.J(this.f22067d, str, n.W(str) != null);
                i17 = 0;
                while (true) {
                    if (i17 < eVar.f24456m.size()) {
                    }
                    i17++;
                }
                this.f22075l = i15;
                this.f22083t = androidx.media3.exoplayer.q.j(i12) != 128;
                this.f22084u = androidx.media3.exoplayer.q.E(i12) == 64;
                this.f22085v = n.O(this.f22067d.f20543o);
                this.f22082s = i(i12, i24);
            }
            z12 = false;
            this.f22070g = z12;
            this.f22071h = androidx.media3.exoplayer.q.k(i12, false);
            androidx.media3.common.a aVar3222 = this.f22067d;
            float f12222 = aVar3222.f20554z;
            this.f22072i = f12222 == -1.0f && f12222 >= 10.0f;
            this.f22073j = aVar3222.f20538j;
            this.f22074k = aVar3222.e();
            i14 = 0;
            while (true) {
                i15 = Integer.MAX_VALUE;
                if (i14 < eVar.f24457n.size()) {
                }
                i14++;
            }
            this.f22076m = i14;
            this.f22077n = i16;
            this.f22078o = n.N(this.f22067d.f20534f, eVar.f24458o);
            int i25222 = this.f22067d.f20534f;
            this.f22079p = (i25222 == 0 && (i25222 & 1) == 0) ? false : true;
            this.f22080q = n.J(this.f22067d, str, n.W(str) != null);
            i17 = 0;
            while (true) {
                if (i17 < eVar.f24456m.size()) {
                }
                i17++;
            }
            this.f22075l = i15;
            this.f22083t = androidx.media3.exoplayer.q.j(i12) != 128;
            this.f22084u = androidx.media3.exoplayer.q.E(i12) == 64;
            this.f22085v = n.O(this.f22067d.f20543o);
            this.f22082s = i(i12, i24);
        }

        public static int e(j jVar, j jVar2) {
            AbstractC3436p g10 = AbstractC3436p.j().g(jVar.f22071h, jVar2.f22071h).f(Integer.valueOf(jVar.f22076m), Integer.valueOf(jVar2.f22076m), W.h().o()).d(jVar.f22077n, jVar2.f22077n).d(jVar.f22078o, jVar2.f22078o).g(jVar.f22079p, jVar2.f22079p).d(jVar.f22080q, jVar2.f22080q).g(jVar.f22072i, jVar2.f22072i).g(jVar.f22068e, jVar2.f22068e).g(jVar.f22070g, jVar2.f22070g).f(Integer.valueOf(jVar.f22075l), Integer.valueOf(jVar2.f22075l), W.h().o()).g(jVar.f22083t, jVar2.f22083t).g(jVar.f22084u, jVar2.f22084u);
            if (jVar.f22083t && jVar.f22084u) {
                g10 = g10.d(jVar.f22085v, jVar2.f22085v);
            }
            return g10.i();
        }

        public static int f(j jVar, j jVar2) {
            W o10 = (jVar.f22068e && jVar.f22071h) ? n.f21961l : n.f21961l.o();
            AbstractC3436p j10 = AbstractC3436p.j();
            if (jVar.f22069f.f24440B) {
                j10 = j10.f(Integer.valueOf(jVar.f22073j), Integer.valueOf(jVar2.f22073j), n.f21961l.o());
            }
            return j10.f(Integer.valueOf(jVar.f22074k), Integer.valueOf(jVar2.f22074k), o10).f(Integer.valueOf(jVar.f22073j), Integer.valueOf(jVar2.f22073j), o10).i();
        }

        public static int g(List list, List list2) {
            return AbstractC3436p.j().f((j) Collections.max(list, new Comparator() { // from class: androidx.media3.exoplayer.trackselection.w
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int e10;
                    e10 = n.j.e((n.j) obj, (n.j) obj2);
                    return e10;
                }
            }), (j) Collections.max(list2, new Comparator() { // from class: androidx.media3.exoplayer.trackselection.w
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int e10;
                    e10 = n.j.e((n.j) obj, (n.j) obj2);
                    return e10;
                }
            }), new Comparator() { // from class: androidx.media3.exoplayer.trackselection.w
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int e10;
                    e10 = n.j.e((n.j) obj, (n.j) obj2);
                    return e10;
                }
            }).d(list.size(), list2.size()).f((j) Collections.max(list, new Comparator() { // from class: androidx.media3.exoplayer.trackselection.x
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int f10;
                    f10 = n.j.f((n.j) obj, (n.j) obj2);
                    return f10;
                }
            }), (j) Collections.max(list2, new Comparator() { // from class: androidx.media3.exoplayer.trackselection.x
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int f10;
                    f10 = n.j.f((n.j) obj, (n.j) obj2);
                    return f10;
                }
            }), new Comparator() { // from class: androidx.media3.exoplayer.trackselection.x
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int f10;
                    f10 = n.j.f((n.j) obj, (n.j) obj2);
                    return f10;
                }
            }).i();
        }

        public static AbstractC3445z h(int i10, P p10, e eVar, int[] iArr, String str, int i11, Point point) {
            int K10 = n.K(p10, point != null ? point.x : eVar.f24452i, point != null ? point.y : eVar.f24453j, eVar.f24455l);
            AbstractC3445z.a k10 = AbstractC3445z.k();
            for (int i12 = 0; i12 < p10.f24395a; i12++) {
                int e10 = p10.a(i12).e();
                k10.a(new j(i10, p10, i12, eVar, iArr[i12], str, i11, K10 == Integer.MAX_VALUE || (e10 != -1 && e10 <= K10)));
            }
            return k10.m();
        }

        @Override // androidx.media3.exoplayer.trackselection.n.i
        public int a() {
            return this.f22082s;
        }

        public final int i(int i10, int i11) {
            if ((this.f22067d.f20534f & 16384) != 0 || !androidx.media3.exoplayer.q.k(i10, this.f22069f.f22015A0)) {
                return 0;
            }
            if (!this.f22068e && !this.f22069f.f22021p0) {
                return 0;
            }
            if (!androidx.media3.exoplayer.q.k(i10, false) || !this.f22070g || !this.f22068e || this.f22067d.f20538j == -1) {
                return 1;
            }
            e eVar = this.f22069f;
            return (eVar.f24441C || eVar.f24440B || (i10 & i11) == 0) ? 1 : 2;
        }

        @Override // androidx.media3.exoplayer.trackselection.n.i
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean b(j jVar) {
            if (!this.f22081r && !Objects.equals(this.f22067d.f20543o, jVar.f22067d.f20543o)) {
                return false;
            }
            if (this.f22069f.f22024s0) {
                return true;
            }
            return this.f22083t == jVar.f22083t && this.f22084u == jVar.f22084u;
        }
    }

    public n(Context context) {
        this(context, new C2225a.b());
    }

    public static void F(B.a aVar, e eVar, y.a[] aVarArr) {
        int d10 = aVar.d();
        for (int i10 = 0; i10 < d10; i10++) {
            m0 f10 = aVar.f(i10);
            if (eVar.j(i10, f10)) {
                eVar.i(i10, f10);
                aVarArr[i10] = null;
            }
        }
    }

    public static void G(B.a aVar, S s10, y.a[] aVarArr) {
        int d10 = aVar.d();
        HashMap hashMap = new HashMap();
        for (int i10 = 0; i10 < d10; i10++) {
            I(aVar.f(i10), s10, hashMap);
        }
        I(aVar.h(), s10, hashMap);
        for (int i11 = 0; i11 < d10; i11++) {
            Q q10 = (Q) hashMap.get(Integer.valueOf(aVar.e(i11)));
            if (q10 != null) {
                aVarArr[i11] = (q10.f24402b.isEmpty() || aVar.f(i11).d(q10.f24401a) == -1) ? null : new y.a(q10.f24401a, com.google.common.primitives.f.o(q10.f24402b));
            }
        }
    }

    public static void I(m0 m0Var, S s10, Map map) {
        Q q10;
        for (int i10 = 0; i10 < m0Var.f21832a; i10++) {
            Q q11 = (Q) s10.f24442D.get(m0Var.b(i10));
            if (q11 != null && ((q10 = (Q) map.get(Integer.valueOf(q11.a()))) == null || (q10.f24402b.isEmpty() && !q11.f24402b.isEmpty()))) {
                map.put(Integer.valueOf(q11.a()), q11);
            }
        }
    }

    public static int J(androidx.media3.common.a aVar, String str, boolean z10) {
        if (!TextUtils.isEmpty(str) && str.equals(aVar.f20532d)) {
            return 4;
        }
        String W10 = W(str);
        String W11 = W(aVar.f20532d);
        if (W11 == null || W10 == null) {
            return (z10 && W11 == null) ? 1 : 0;
        }
        if (W11.startsWith(W10) || W10.startsWith(W11)) {
            return 3;
        }
        return Z.B1(W11, "-")[0].equals(Z.B1(W10, "-")[0]) ? 2 : 0;
    }

    public static int K(P p10, int i10, int i11, boolean z10) {
        int i12;
        int i13 = Integer.MAX_VALUE;
        if (i10 != Integer.MAX_VALUE && i11 != Integer.MAX_VALUE) {
            for (int i14 = 0; i14 < p10.f24395a; i14++) {
                androidx.media3.common.a a10 = p10.a(i14);
                int i15 = a10.f20550v;
                if (i15 > 0 && (i12 = a10.f20551w) > 0) {
                    Point d10 = E.d(z10, i10, i11, i15, i12);
                    int i16 = a10.f20550v;
                    int i17 = a10.f20551w;
                    int i18 = i16 * i17;
                    if (i16 >= ((int) (d10.x * 0.98f)) && i17 >= ((int) (d10.y * 0.98f)) && i18 < i13) {
                        i13 = i18;
                    }
                }
            }
        }
        return i13;
    }

    public static String M(Context context) {
        CaptioningManager captioningManager;
        Locale locale;
        if (context == null || (captioningManager = (CaptioningManager) context.getSystemService("captioning")) == null || !captioningManager.isEnabled() || (locale = captioningManager.getLocale()) == null) {
            return null;
        }
        return Z.j0(locale);
    }

    public static int N(int i10, int i11) {
        if (i10 == 0 || i10 != i11) {
            return Integer.bitCount(i10 & i11);
        }
        return Integer.MAX_VALUE;
    }

    public static int O(String str) {
        if (str == null) {
            return 0;
        }
        switch (str) {
        }
        return 0;
    }

    public static boolean Q(androidx.media3.common.a aVar) {
        String str = aVar.f20543o;
        if (str == null) {
            return false;
        }
        str.getClass();
        switch (str) {
        }
        return false;
    }

    public static boolean R(androidx.media3.common.a aVar) {
        String str = aVar.f20543o;
        if (str == null) {
            return false;
        }
        str.getClass();
        switch (str) {
        }
        return false;
    }

    public static void S(e eVar, B.a aVar, int[][][] iArr, k1[] k1VarArr, y[] yVarArr) {
        int i10 = -1;
        boolean z10 = false;
        int i11 = 0;
        for (int i12 = 0; i12 < aVar.d(); i12++) {
            int e10 = aVar.e(i12);
            y yVar = yVarArr[i12];
            if (e10 != 1 && yVar != null) {
                return;
            }
            if (e10 == 1 && yVar != null && yVar.length() == 1) {
                if (X(eVar, iArr[i12][aVar.f(i12).d(yVar.m())][yVar.f(0)], yVar.r())) {
                    i11++;
                    i10 = i12;
                }
            }
        }
        if (i11 == 1) {
            int i13 = eVar.f24464u.f24475b ? 1 : 2;
            k1 k1Var = k1VarArr[i10];
            if (k1Var != null && k1Var.f56267b) {
                z10 = true;
            }
            k1VarArr[i10] = new k1(i13, z10);
        }
    }

    public static void T(B.a aVar, int[][][] iArr, k1[] k1VarArr, y[] yVarArr) {
        boolean z10;
        int i10 = -1;
        int i11 = -1;
        for (int i12 = 0; i12 < aVar.d(); i12++) {
            int e10 = aVar.e(i12);
            y yVar = yVarArr[i12];
            if ((e10 == 1 || e10 == 2) && yVar != null && Y(iArr[i12], aVar.f(i12), yVar)) {
                if (e10 == 1) {
                    if (i11 != -1) {
                        z10 = false;
                        break;
                    }
                    i11 = i12;
                } else {
                    if (i10 != -1) {
                        z10 = false;
                        break;
                    }
                    i10 = i12;
                }
            }
        }
        z10 = true;
        if (z10 && ((i11 == -1 || i10 == -1) ? false : true)) {
            k1 k1Var = new k1(0, true);
            k1VarArr[i11] = k1Var;
            k1VarArr[i10] = k1Var;
        }
    }

    public static String W(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    public static boolean X(e eVar, int i10, androidx.media3.common.a aVar) {
        if (androidx.media3.exoplayer.q.w(i10) == 0) {
            return false;
        }
        if (eVar.f24464u.f24476c && (androidx.media3.exoplayer.q.w(i10) & 2048) == 0) {
            return false;
        }
        if (eVar.f24464u.f24475b) {
            boolean z10 = (aVar.f20521I == 0 && aVar.f20522J == 0) ? false : true;
            boolean z11 = (androidx.media3.exoplayer.q.w(i10) & 1024) != 0;
            if (z10 && !z11) {
                return false;
            }
        }
        return true;
    }

    public static boolean Y(int[][] iArr, m0 m0Var, y yVar) {
        if (yVar == null) {
            return false;
        }
        int d10 = m0Var.d(yVar.m());
        for (int i10 = 0; i10 < yVar.length(); i10++) {
            if (androidx.media3.exoplayer.q.p(iArr[d10][yVar.f(i10)]) != 32) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ List s(final n nVar, final e eVar, boolean z10, int[] iArr, int i10, P p10, int[] iArr2) {
        nVar.getClass();
        return b.e(i10, p10, eVar, iArr2, z10, new Ra.o() { // from class: androidx.media3.exoplayer.trackselection.m
            @Override // Ra.o
            public final boolean apply(Object obj) {
                boolean P10;
                P10 = n.this.P((androidx.media3.common.a) obj, eVar);
                return P10;
            }
        }, iArr[i10]);
    }

    public static /* synthetic */ int w(Integer num, Integer num2) {
        if (num.intValue() == -1) {
            return num2.intValue() == -1 ? 0 : -1;
        }
        if (num2.intValue() == -1) {
            return 1;
        }
        return num.intValue() - num2.intValue();
    }

    public e.a H() {
        return c().a();
    }

    @Override // androidx.media3.exoplayer.trackselection.F
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public e c() {
        e eVar;
        synchronized (this.f21962d) {
            eVar = this.f21965g;
        }
        return eVar;
    }

    public final boolean P(androidx.media3.common.a aVar, e eVar) {
        int i10;
        g gVar;
        g gVar2;
        if (!eVar.f22031z0) {
            return true;
        }
        Boolean bool = this.f21969k;
        if ((bool != null && bool.booleanValue()) || (i10 = aVar.f20518F) == -1 || i10 <= 2) {
            return true;
        }
        if (!Q(aVar) || (Build.VERSION.SDK_INT >= 32 && (gVar2 = this.f21967i) != null && gVar2.d())) {
            return Build.VERSION.SDK_INT >= 32 && (gVar = this.f21967i) != null && gVar.d() && this.f21967i.b() && this.f21967i.c() && this.f21967i.a(this.f21968j, aVar);
        }
        return true;
    }

    public final void U() {
        boolean z10;
        g gVar;
        synchronized (this.f21962d) {
            try {
                z10 = this.f21965g.f22031z0 && Build.VERSION.SDK_INT >= 32 && (gVar = this.f21967i) != null && gVar.d();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            f();
        }
    }

    public final void V(androidx.media3.exoplayer.p pVar) {
        boolean z10;
        synchronized (this.f21962d) {
            z10 = this.f21965g.f22018D0;
        }
        if (z10) {
            g(pVar);
        }
    }

    public y.a[] Z(B.a aVar, int[][][] iArr, int[] iArr2, e eVar) {
        String str;
        int d10 = aVar.d();
        y.a[] aVarArr = new y.a[d10];
        Pair a02 = a0(aVar, iArr, iArr2, eVar);
        if (a02 != null) {
            aVarArr[((Integer) a02.second).intValue()] = (y.a) a02.first;
        }
        if (a02 == null) {
            str = null;
        } else {
            Object obj = a02.first;
            str = ((y.a) obj).f22086a.a(((y.a) obj).tracks[0]).f20532d;
        }
        Pair f02 = f0(aVar, iArr, iArr2, eVar, str);
        String str2 = str;
        Pair b02 = (eVar.f24439A || f02 == null) ? b0(aVar, iArr, eVar) : null;
        if (b02 != null) {
            aVarArr[((Integer) b02.second).intValue()] = (y.a) b02.first;
        } else if (f02 != null) {
            aVarArr[((Integer) f02.second).intValue()] = (y.a) f02.first;
        }
        Pair d02 = d0(aVar, iArr, eVar, str2);
        if (d02 != null) {
            aVarArr[((Integer) d02.second).intValue()] = (y.a) d02.first;
        }
        for (int i10 = 0; i10 < d10; i10++) {
            int e10 = aVar.e(i10);
            if (e10 != 2 && e10 != 1 && e10 != 3 && e10 != 4) {
                aVarArr[i10] = c0(e10, aVar.f(i10), iArr[i10], eVar);
            }
        }
        return aVarArr;
    }

    @Override // androidx.media3.exoplayer.q.a
    public void a(androidx.media3.exoplayer.p pVar) {
        V(pVar);
    }

    public Pair a0(B.a aVar, int[][][] iArr, final int[] iArr2, final e eVar) {
        final boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 < aVar.d()) {
                if (2 == aVar.e(i10) && aVar.f(i10).f21832a > 0) {
                    z10 = true;
                    break;
                }
                i10++;
            } else {
                break;
            }
        }
        return e0(1, aVar, iArr, new i.a() { // from class: androidx.media3.exoplayer.trackselection.i
            @Override // androidx.media3.exoplayer.trackselection.n.i.a
            public final List a(int i11, P p10, int[] iArr3) {
                return n.s(n.this, eVar, z10, iArr2, i11, p10, iArr3);
            }
        }, new Comparator() { // from class: androidx.media3.exoplayer.trackselection.j
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return n.b.c((List) obj, (List) obj2);
            }
        });
    }

    public Pair b0(B.a aVar, int[][][] iArr, final e eVar) {
        if (eVar.f24464u.f24474a == 2) {
            return null;
        }
        return e0(4, aVar, iArr, new i.a() { // from class: androidx.media3.exoplayer.trackselection.e
            @Override // androidx.media3.exoplayer.trackselection.n.i.a
            public final List a(int i10, P p10, int[] iArr2) {
                List e10;
                e10 = n.c.e(i10, p10, n.e.this, iArr2);
                return e10;
            }
        }, new Comparator() { // from class: androidx.media3.exoplayer.trackselection.f
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return n.c.c((List) obj, (List) obj2);
            }
        });
    }

    public y.a c0(int i10, m0 m0Var, int[][] iArr, e eVar) {
        if (eVar.f24464u.f24474a == 2) {
            return null;
        }
        int i11 = 0;
        P p10 = null;
        d dVar = null;
        for (int i12 = 0; i12 < m0Var.f21832a; i12++) {
            P b10 = m0Var.b(i12);
            int[] iArr2 = iArr[i12];
            for (int i13 = 0; i13 < b10.f24395a; i13++) {
                if (androidx.media3.exoplayer.q.k(iArr2[i13], eVar.f22015A0)) {
                    d dVar2 = new d(b10.a(i13), iArr2[i13]);
                    if (dVar == null || dVar2.compareTo(dVar) > 0) {
                        p10 = b10;
                        i11 = i13;
                        dVar = dVar2;
                    }
                }
            }
        }
        if (p10 == null) {
            return null;
        }
        return new y.a(p10, i11);
    }

    @Override // androidx.media3.exoplayer.trackselection.F
    public q.a d() {
        return this;
    }

    public Pair d0(B.a aVar, int[][][] iArr, final e eVar, final String str) {
        if (eVar.f24464u.f24474a == 2) {
            return null;
        }
        final String M10 = eVar.f24467x ? M(this.f21963e) : null;
        return e0(3, aVar, iArr, new i.a() { // from class: androidx.media3.exoplayer.trackselection.k
            @Override // androidx.media3.exoplayer.trackselection.n.i.a
            public final List a(int i10, P p10, int[] iArr2) {
                List e10;
                e10 = n.h.e(i10, p10, n.e.this, iArr2, str, M10);
                return e10;
            }
        }, new Comparator() { // from class: androidx.media3.exoplayer.trackselection.l
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return n.h.c((List) obj, (List) obj2);
            }
        });
    }

    public final Pair e0(int i10, B.a aVar, int[][][] iArr, i.a aVar2, Comparator comparator) {
        int i11;
        RandomAccess randomAccess;
        B.a aVar3 = aVar;
        ArrayList arrayList = new ArrayList();
        int d10 = aVar3.d();
        int i12 = 0;
        while (i12 < d10) {
            if (i10 == aVar3.e(i12)) {
                m0 f10 = aVar3.f(i12);
                for (int i13 = 0; i13 < f10.f21832a; i13++) {
                    P b10 = f10.b(i13);
                    List a10 = aVar2.a(i12, b10, iArr[i12][i13]);
                    boolean[] zArr = new boolean[b10.f24395a];
                    int i14 = 0;
                    while (i14 < b10.f24395a) {
                        i iVar = (i) a10.get(i14);
                        int a11 = iVar.a();
                        if (zArr[i14] || a11 == 0) {
                            i11 = d10;
                        } else {
                            if (a11 == 1) {
                                randomAccess = AbstractC3445z.u(iVar);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(iVar);
                                int i15 = i14 + 1;
                                while (i15 < b10.f24395a) {
                                    i iVar2 = (i) a10.get(i15);
                                    int i16 = d10;
                                    if (iVar2.a() == 2 && iVar.b(iVar2)) {
                                        arrayList2.add(iVar2);
                                        zArr[i15] = true;
                                    }
                                    i15++;
                                    d10 = i16;
                                }
                                randomAccess = arrayList2;
                            }
                            i11 = d10;
                            arrayList.add(randomAccess);
                        }
                        i14++;
                        d10 = i11;
                    }
                }
            }
            i12++;
            aVar3 = aVar;
            d10 = d10;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i17 = 0; i17 < list.size(); i17++) {
            iArr2[i17] = ((i) list.get(i17)).f22066c;
        }
        i iVar3 = (i) list.get(0);
        return Pair.create(new y.a(iVar3.f22065b, iArr2), Integer.valueOf(iVar3.f22064a));
    }

    public Pair f0(B.a aVar, int[][][] iArr, final int[] iArr2, final e eVar, final String str) {
        Context context;
        final Point point = null;
        if (eVar.f24464u.f24474a == 2) {
            return null;
        }
        if (eVar.f24454k && (context = this.f21963e) != null) {
            point = Z.Y(context);
        }
        return e0(2, aVar, iArr, new i.a() { // from class: androidx.media3.exoplayer.trackselection.g
            @Override // androidx.media3.exoplayer.trackselection.n.i.a
            public final List a(int i10, P p10, int[] iArr3) {
                List h10;
                h10 = n.j.h(i10, p10, n.e.this, iArr3, str, iArr2[i10], point);
                return h10;
            }
        }, new Comparator() { // from class: androidx.media3.exoplayer.trackselection.h
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return n.j.g((List) obj, (List) obj2);
            }
        });
    }

    public void g0(e.a aVar) {
        h0(aVar.G());
    }

    @Override // androidx.media3.exoplayer.trackselection.F
    public boolean h() {
        return true;
    }

    public final void h0(e eVar) {
        boolean equals;
        AbstractC4134a.e(eVar);
        synchronized (this.f21962d) {
            equals = this.f21965g.equals(eVar);
            this.f21965g = eVar;
        }
        if (equals) {
            return;
        }
        if (eVar.f22031z0 && this.f21963e == null) {
            AbstractC4156x.i("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
        f();
    }

    @Override // androidx.media3.exoplayer.trackselection.F
    public void j() {
        g gVar;
        synchronized (this.f21962d) {
            try {
                Thread thread = this.f21966h;
                if (thread != null) {
                    AbstractC4134a.h(thread == Thread.currentThread(), "DefaultTrackSelector is accessed on the wrong thread.");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (Build.VERSION.SDK_INT >= 32 && (gVar = this.f21967i) != null) {
            gVar.e();
            this.f21967i = null;
        }
        super.j();
    }

    @Override // androidx.media3.exoplayer.trackselection.F
    public void l(C2350d c2350d) {
        if (this.f21968j.equals(c2350d)) {
            return;
        }
        this.f21968j = c2350d;
        U();
    }

    @Override // androidx.media3.exoplayer.trackselection.F
    public void m(S s10) {
        if (s10 instanceof e) {
            h0((e) s10);
        }
        h0(new e.a().r0(s10).G());
    }

    @Override // androidx.media3.exoplayer.trackselection.B
    public final Pair r(B.a aVar, int[][][] iArr, int[] iArr2, D.b bVar, AbstractC2346O abstractC2346O) {
        e eVar;
        Context context;
        synchronized (this.f21962d) {
            this.f21966h = Thread.currentThread();
            eVar = this.f21965g;
        }
        if (this.f21969k == null && (context = this.f21963e) != null) {
            this.f21969k = Boolean.valueOf(Z.T0(context));
        }
        if (eVar.f22031z0 && Build.VERSION.SDK_INT >= 32 && this.f21967i == null) {
            this.f21967i = new g(this.f21963e, this, this.f21969k);
        }
        int d10 = aVar.d();
        y.a[] Z10 = Z(aVar, iArr, iArr2, eVar);
        G(aVar, eVar, Z10);
        F(aVar, eVar, Z10);
        for (int i10 = 0; i10 < d10; i10++) {
            int e10 = aVar.e(i10);
            if (eVar.h(i10) || eVar.f24443E.contains(Integer.valueOf(e10))) {
                Z10[i10] = null;
            }
        }
        y[] a10 = this.f21964f.a(Z10, b(), bVar, abstractC2346O);
        k1[] k1VarArr = new k1[d10];
        for (int i11 = 0; i11 < d10; i11++) {
            k1VarArr[i11] = (eVar.h(i11) || eVar.f24443E.contains(Integer.valueOf(aVar.e(i11))) || (aVar.e(i11) != -2 && a10[i11] == null)) ? null : k1.f56265c;
        }
        if (eVar.f22016B0) {
            T(aVar, iArr, k1VarArr, a10);
        }
        if (eVar.f24464u.f24474a != 0) {
            S(eVar, aVar, iArr, k1VarArr, a10);
        }
        return Pair.create(k1VarArr, a10);
    }

    public n(Context context, y.b bVar) {
        this(context, e.f21994G0, bVar);
    }

    public n(Context context, S s10, y.b bVar) {
        this(s10, bVar, context);
    }

    public n(S s10, y.b bVar, Context context) {
        this.f21962d = new Object();
        this.f21963e = context != null ? context.getApplicationContext() : null;
        this.f21964f = bVar;
        if (s10 instanceof e) {
            this.f21965g = (e) s10;
        } else {
            this.f21965g = e.f21994G0.a().r0(s10).G();
        }
        this.f21968j = C2350d.f24567h;
        if (this.f21965g.f22031z0 && context == null) {
            AbstractC4156x.i("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }
}
