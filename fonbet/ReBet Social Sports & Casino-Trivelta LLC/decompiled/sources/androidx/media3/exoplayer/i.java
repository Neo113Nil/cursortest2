package androidx.media3.exoplayer;

import F1.y;
import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.b;
import androidx.media3.exoplayer.f;
import androidx.media3.exoplayer.j;
import androidx.media3.exoplayer.k;
import androidx.media3.exoplayer.l;
import androidx.media3.exoplayer.n;
import androidx.media3.exoplayer.o;
import androidx.media3.exoplayer.p;
import androidx.media3.exoplayer.q;
import androidx.media3.exoplayer.source.C;
import androidx.media3.exoplayer.source.C2201b;
import androidx.media3.exoplayer.source.D;
import androidx.media3.exoplayer.source.e0;
import androidx.media3.exoplayer.source.m0;
import androidx.media3.exoplayer.trackselection.F;
import androidx.media3.exoplayer.trackselection.G;
import b1.AbstractC2335D;
import b1.AbstractC2346O;
import b1.C2334C;
import b1.C2338G;
import b1.C2340I;
import b1.C2350d;
import b1.z;
import com.google.common.collect.AbstractC3445z;
import e1.AbstractC4134a;
import e1.AbstractC4156x;
import e1.C4146m;
import e1.InterfaceC4143j;
import e1.InterfaceC4152t;
import e1.T;
import e1.Z;
import h1.C4415k;
import io.agora.rtc2.internal.RtcEngineEvent;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.LongCompanionObject;
import m1.I;
import m1.P0;
import m1.R0;
import m1.h1;
import m1.i1;
import m1.j1;
import m1.k1;
import m1.l1;
import m1.n1;
import m1.o1;
import n1.G1;
import n1.InterfaceC5605a;
import q1.InterfaceC6104m;

/* loaded from: classes.dex */
public final class i implements Handler.Callback, C.a, F.b, n.d, f.a, o.a, b.a, y {

    /* renamed from: y2, reason: collision with root package name */
    public static final long f21259y2 = Z.J1(10000);

    /* renamed from: B, reason: collision with root package name */
    public o1 f21261B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f21262C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f21263D;

    /* renamed from: E, reason: collision with root package name */
    public h f21264E;

    /* renamed from: F, reason: collision with root package name */
    public h1 f21265F;

    /* renamed from: G, reason: collision with root package name */
    public e f21266G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f21267H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f21268I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f21269J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f21270K;

    /* renamed from: O, reason: collision with root package name */
    public boolean f21272O;

    /* renamed from: P, reason: collision with root package name */
    public int f21273P;

    /* renamed from: R, reason: collision with root package name */
    public boolean f21274R;

    /* renamed from: T, reason: collision with root package name */
    public boolean f21275T;

    /* renamed from: V, reason: collision with root package name */
    public boolean f21277V;

    /* renamed from: V1, reason: collision with root package name */
    public ExoPlayer.c f21278V1;

    /* renamed from: W, reason: collision with root package name */
    public boolean f21279W;

    /* renamed from: X, reason: collision with root package name */
    public int f21280X;

    /* renamed from: Y, reason: collision with root package name */
    public h f21281Y;

    /* renamed from: Z, reason: collision with root package name */
    public long f21282Z;

    /* renamed from: a, reason: collision with root package name */
    public final F f21283a;

    /* renamed from: b, reason: collision with root package name */
    public final G f21284b;

    /* renamed from: b1, reason: collision with root package name */
    public long f21285b1;

    /* renamed from: c, reason: collision with root package name */
    public final j f21287c;

    /* renamed from: d, reason: collision with root package name */
    public final D1.d f21288d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC4152t f21289e;

    /* renamed from: f, reason: collision with root package name */
    public final i1 f21290f;

    /* renamed from: g, reason: collision with root package name */
    public final Looper f21291g;

    /* renamed from: g1, reason: collision with root package name */
    public int f21292g1;

    /* renamed from: h, reason: collision with root package name */
    public final AbstractC2346O.c f21294h;

    /* renamed from: i, reason: collision with root package name */
    public final AbstractC2346O.b f21295i;

    /* renamed from: j, reason: collision with root package name */
    public final long f21296j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f21297k;

    /* renamed from: l, reason: collision with root package name */
    public final androidx.media3.exoplayer.f f21298l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f21299m;

    /* renamed from: n, reason: collision with root package name */
    public final InterfaceC4143j f21300n;

    /* renamed from: o, reason: collision with root package name */
    public final f f21301o;

    /* renamed from: p, reason: collision with root package name */
    public final m f21302p;

    /* renamed from: p1, reason: collision with root package name */
    public boolean f21303p1;

    /* renamed from: p2, reason: collision with root package name */
    public boolean f21304p2;

    /* renamed from: q, reason: collision with root package name */
    public final n f21305q;

    /* renamed from: r, reason: collision with root package name */
    public final P0 f21306r;
    private final q[] rendererCapabilities;
    private final boolean[] rendererReportedReady;
    private final l1[] renderers;

    /* renamed from: s, reason: collision with root package name */
    public final long f21307s;

    /* renamed from: t, reason: collision with root package name */
    public final G1 f21308t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f21309u;

    /* renamed from: v, reason: collision with root package name */
    public final InterfaceC5605a f21310v;

    /* renamed from: w, reason: collision with root package name */
    public final InterfaceC4152t f21311w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f21312x;

    /* renamed from: x1, reason: collision with root package name */
    public I f21313x1;

    /* renamed from: y, reason: collision with root package name */
    public final androidx.media3.exoplayer.b f21315y;

    /* renamed from: y1, reason: collision with root package name */
    public long f21316y1;

    /* renamed from: z, reason: collision with root package name */
    public o1 f21317z;

    /* renamed from: g2, reason: collision with root package name */
    public long f21293g2 = -9223372036854775807L;

    /* renamed from: x2, reason: collision with root package name */
    public float f21314x2 = 1.0f;

    /* renamed from: A, reason: collision with root package name */
    public n1 f21260A = n1.f56279i;

    /* renamed from: T1, reason: collision with root package name */
    public long f21276T1 = -9223372036854775807L;

    /* renamed from: L, reason: collision with root package name */
    public long f21271L = -9223372036854775807L;

    /* renamed from: b2, reason: collision with root package name */
    public AbstractC2346O f21286b2 = AbstractC2346O.f24345a;

    public class a implements p.a {
        public a() {
        }

        @Override // androidx.media3.exoplayer.p.a
        public void a() {
            i.this.f21277V = true;
        }

        @Override // androidx.media3.exoplayer.p.a
        public void b() {
            if (i.this.g0() || i.this.f21279W) {
                i.this.f21289e.l(2);
            }
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final List f21319a;

        /* renamed from: b, reason: collision with root package name */
        public final e0 f21320b;

        /* renamed from: c, reason: collision with root package name */
        public final int f21321c;

        /* renamed from: d, reason: collision with root package name */
        public final long f21322d;

        public /* synthetic */ b(List list, e0 e0Var, int i10, long j10, a aVar) {
            this(list, e0Var, i10, j10);
        }

        public b(List list, e0 e0Var, int i10, long j10) {
            this.f21319a = list;
            this.f21320b = e0Var;
            this.f21321c = i10;
            this.f21322d = j10;
        }
    }

    public static class c {
    }

    public static final class d implements Comparable {

        /* renamed from: a, reason: collision with root package name */
        public final o f21323a;

        /* renamed from: b, reason: collision with root package name */
        public int f21324b;

        /* renamed from: c, reason: collision with root package name */
        public long f21325c;

        /* renamed from: d, reason: collision with root package name */
        public Object f21326d;

        public d(o oVar) {
            this.f21323a = oVar;
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(d dVar) {
            Object obj = this.f21326d;
            if ((obj == null) != (dVar.f21326d == null)) {
                return obj != null ? -1 : 1;
            }
            if (obj == null) {
                return 0;
            }
            int i10 = this.f21324b - dVar.f21324b;
            return i10 != 0 ? i10 : Long.compare(this.f21325c, dVar.f21325c);
        }

        public void b(int i10, long j10, Object obj) {
            this.f21324b = i10;
            this.f21325c = j10;
            this.f21326d = obj;
        }
    }

    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        public boolean f21327a;

        /* renamed from: b, reason: collision with root package name */
        public h1 f21328b;

        /* renamed from: c, reason: collision with root package name */
        public int f21329c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f21330d;

        /* renamed from: e, reason: collision with root package name */
        public int f21331e;

        public e(h1 h1Var) {
            this.f21328b = h1Var;
        }

        public void b(int i10) {
            this.f21327a |= i10 > 0;
            this.f21329c += i10;
        }

        public void c(h1 h1Var) {
            this.f21327a |= this.f21328b != h1Var;
            this.f21328b = h1Var;
        }

        public void d(int i10) {
            if (this.f21330d && this.f21331e != 5) {
                AbstractC4134a.a(i10 == 5);
                return;
            }
            this.f21327a = true;
            this.f21330d = true;
            this.f21331e = i10;
        }
    }

    public interface f {
        void a(e eVar);
    }

    public static final class g {

        /* renamed from: a, reason: collision with root package name */
        public final D.b f21332a;

        /* renamed from: b, reason: collision with root package name */
        public final long f21333b;

        /* renamed from: c, reason: collision with root package name */
        public final long f21334c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f21335d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f21336e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f21337f;

        public g(D.b bVar, long j10, long j11, boolean z10, boolean z11, boolean z12) {
            this.f21332a = bVar;
            this.f21333b = j10;
            this.f21334c = j11;
            this.f21335d = z10;
            this.f21336e = z11;
            this.f21337f = z12;
        }
    }

    public static final class h {

        /* renamed from: a, reason: collision with root package name */
        public final AbstractC2346O f21338a;

        /* renamed from: b, reason: collision with root package name */
        public final int f21339b;

        /* renamed from: c, reason: collision with root package name */
        public final long f21340c;

        public h(AbstractC2346O abstractC2346O, int i10, long j10) {
            this.f21338a = abstractC2346O;
            this.f21339b = i10;
            this.f21340c = j10;
        }
    }

    public i(Context context, p[] pVarArr, p[] pVarArr2, F f10, G g10, j jVar, D1.d dVar, int i10, boolean z10, InterfaceC5605a interfaceC5605a, o1 o1Var, P0 p02, long j10, boolean z11, boolean z12, Looper looper, InterfaceC4143j interfaceC4143j, f fVar, G1 g12, i1 i1Var, ExoPlayer.c cVar, final y yVar) {
        this.f21301o = fVar;
        this.f21283a = f10;
        this.f21284b = g10;
        this.f21287c = jVar;
        this.f21288d = dVar;
        this.f21273P = i10;
        this.f21274R = z10;
        this.f21317z = o1Var;
        this.f21306r = p02;
        this.f21307s = j10;
        this.f21316y1 = j10;
        this.f21268I = z11;
        this.f21309u = z12;
        this.f21300n = interfaceC4143j;
        this.f21308t = g12;
        this.f21278V1 = cVar;
        this.f21310v = interfaceC5605a;
        this.f21296j = jVar.h(g12);
        this.f21297k = jVar.i(g12);
        h1 k10 = h1.k(g10);
        this.f21265F = k10;
        this.f21266G = new e(k10);
        this.rendererCapabilities = new q[pVarArr.length];
        this.rendererReportedReady = new boolean[pVarArr.length];
        q.a d10 = f10.d();
        this.renderers = new l1[pVarArr.length];
        boolean z13 = false;
        for (int i11 = 0; i11 < pVarArr.length; i11++) {
            pVarArr[i11].D(i11, g12, interfaceC4143j);
            this.rendererCapabilities[i11] = pVarArr[i11].F();
            if (d10 != null) {
                this.rendererCapabilities[i11].G(d10);
            }
            p pVar = pVarArr2[i11];
            if (pVar != null) {
                pVar.D(i11, g12, interfaceC4143j);
                z13 = true;
            }
            this.renderers[i11] = new l1(pVarArr[i11], pVarArr2[i11], i11);
        }
        this.f21312x = z13;
        this.f21298l = new androidx.media3.exoplayer.f(this, interfaceC4143j);
        this.f21299m = new ArrayList();
        this.f21294h = new AbstractC2346O.c();
        this.f21295i = new AbstractC2346O.b();
        f10.e(this, dVar);
        this.f21303p1 = true;
        InterfaceC4152t d11 = interfaceC4143j.d(looper, null);
        this.f21311w = d11;
        this.f21302p = new m(interfaceC5605a, d11, new l.a() { // from class: m1.L0
            @Override // androidx.media3.exoplayer.l.a
            public final androidx.media3.exoplayer.l a(R0 r02, long j11) {
                androidx.media3.exoplayer.l z14;
                z14 = androidx.media3.exoplayer.i.this.z(r02, j11);
                return z14;
            }
        }, cVar);
        this.f21305q = new n(this, interfaceC5605a, d11, g12);
        i1 i1Var2 = i1Var == null ? new i1() : i1Var;
        this.f21290f = i1Var2;
        Looper a10 = i1Var2.a();
        this.f21291g = a10;
        InterfaceC4152t d12 = interfaceC4143j.d(a10, this);
        this.f21289e = d12;
        this.f21315y = new androidx.media3.exoplayer.b(context, a10, this);
        d12.f(35, new y() { // from class: m1.M0
            @Override // F1.y
            public final void e(long j11, long j12, androidx.media3.common.a aVar, MediaFormat mediaFormat) {
                androidx.media3.exoplayer.i.n(androidx.media3.exoplayer.i.this, yVar, j11, j12, aVar, mediaFormat);
            }
        }).a();
    }

    public static void T0(AbstractC2346O abstractC2346O, d dVar, AbstractC2346O.c cVar, AbstractC2346O.b bVar) {
        int i10 = abstractC2346O.n(abstractC2346O.h(dVar.f21326d, bVar).f24356c, cVar).f24391o;
        Object obj = abstractC2346O.g(i10, bVar, true).f24355b;
        long j10 = bVar.f24357d;
        dVar.b(i10, j10 != -9223372036854775807L ? j10 - 1 : LongCompanionObject.MAX_VALUE, obj);
    }

    public static boolean U0(d dVar, AbstractC2346O abstractC2346O, AbstractC2346O abstractC2346O2, int i10, boolean z10, AbstractC2346O.c cVar, AbstractC2346O.b bVar) {
        Object obj = dVar.f21326d;
        if (obj == null) {
            Pair X02 = X0(abstractC2346O, new h(dVar.f21323a.g(), dVar.f21323a.c(), dVar.f21323a.e() == Long.MIN_VALUE ? -9223372036854775807L : Z.a1(dVar.f21323a.e())), false, i10, z10, cVar, bVar);
            if (X02 == null) {
                return false;
            }
            dVar.b(abstractC2346O.b(X02.first), ((Long) X02.second).longValue(), X02.first);
            if (dVar.f21323a.e() == Long.MIN_VALUE) {
                T0(abstractC2346O, dVar, cVar, bVar);
            }
            return true;
        }
        int b10 = abstractC2346O.b(obj);
        if (b10 == -1) {
            return false;
        }
        if (dVar.f21323a.e() == Long.MIN_VALUE) {
            T0(abstractC2346O, dVar, cVar, bVar);
            return true;
        }
        dVar.f21324b = b10;
        abstractC2346O2.h(dVar.f21326d, bVar);
        if (bVar.f24359f && abstractC2346O2.n(bVar.f24356c, cVar).f24390n == abstractC2346O2.b(dVar.f21326d)) {
            Pair j10 = abstractC2346O.j(cVar, bVar, abstractC2346O.h(dVar.f21326d, bVar).f24356c, dVar.f21325c + bVar.o());
            dVar.b(abstractC2346O.b(j10.first), ((Long) j10.second).longValue(), j10.first);
        }
        return true;
    }

    public static g W0(AbstractC2346O abstractC2346O, h1 h1Var, h hVar, m mVar, int i10, boolean z10, AbstractC2346O.c cVar, AbstractC2346O.b bVar) {
        AbstractC2346O abstractC2346O2;
        AbstractC2346O.b bVar2;
        int i11;
        int i12;
        long j10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        long j11;
        long j12;
        int i13;
        long longValue;
        boolean z15;
        boolean z16;
        boolean z17;
        if (abstractC2346O.q()) {
            return new g(h1.l(), 0L, -9223372036854775807L, false, true, false);
        }
        D.b bVar3 = h1Var.f56219b;
        Object obj = bVar3.f21516a;
        boolean l02 = l0(h1Var, bVar);
        long j13 = (h1Var.f56219b.b() || l02) ? h1Var.f56220c : h1Var.f56236s;
        boolean z18 = false;
        if (hVar != null) {
            abstractC2346O2 = abstractC2346O;
            Pair X02 = X0(abstractC2346O2, hVar, true, i10, z10, cVar, bVar);
            if (X02 == null) {
                i12 = abstractC2346O2.a(z10);
                longValue = j13;
                z15 = false;
                z16 = false;
                z17 = true;
            } else {
                if (hVar.f21340c == -9223372036854775807L) {
                    i12 = abstractC2346O2.h(X02.first, bVar).f24356c;
                    longValue = j13;
                    z15 = false;
                } else {
                    obj = X02.first;
                    longValue = ((Long) X02.second).longValue();
                    i12 = -1;
                    z15 = true;
                }
                z16 = h1Var.f56222e == 4;
                z17 = false;
            }
            z13 = z15;
            z11 = z16;
            z12 = z17;
            bVar2 = bVar;
            i11 = -1;
            j10 = longValue;
        } else {
            abstractC2346O2 = abstractC2346O;
            if (h1Var.f56218a.q()) {
                i12 = abstractC2346O2.a(z10);
            } else if (abstractC2346O2.b(obj) == -1) {
                int Y02 = Y0(cVar, bVar, i10, z10, obj, h1Var.f56218a, abstractC2346O2);
                abstractC2346O2 = abstractC2346O2;
                if (Y02 == -1) {
                    Y02 = abstractC2346O2.a(z10);
                    z14 = true;
                } else {
                    z14 = false;
                }
                i12 = Y02;
                obj = obj;
                bVar2 = bVar;
                i11 = -1;
                z12 = z14;
                z11 = false;
                z13 = false;
                j10 = j13;
            } else if (j13 == -9223372036854775807L) {
                i12 = abstractC2346O2.h(obj, bVar).f24356c;
                obj = obj;
            } else if (l02) {
                h1Var.f56218a.h(bVar3.f21516a, bVar);
                if (h1Var.f56218a.n(bVar.f24356c, cVar).f24390n == h1Var.f56218a.b(bVar3.f21516a)) {
                    bVar2 = bVar;
                    Pair j14 = abstractC2346O2.j(cVar, bVar2, abstractC2346O2.h(obj, bVar).f24356c, bVar.o() + j13);
                    obj = j14.first;
                    i11 = -1;
                    j10 = ((Long) j14.second).longValue();
                } else {
                    bVar2 = bVar;
                    if (abstractC2346O2.h(obj, bVar2).f24357d != -9223372036854775807L) {
                        i11 = -1;
                        j10 = Z.p(j13, 0L, bVar2.f24357d - 1);
                        obj = obj;
                    } else {
                        i11 = -1;
                        obj = obj;
                        j10 = j13;
                    }
                }
                i12 = i11;
                z11 = false;
                z12 = false;
                z13 = true;
            } else {
                bVar2 = bVar;
                i11 = -1;
                obj = obj;
                i12 = -1;
                j10 = j13;
                z11 = false;
                z12 = false;
                z13 = false;
            }
            bVar2 = bVar;
            i11 = -1;
            z11 = false;
            z12 = false;
            z13 = false;
            j10 = j13;
        }
        if (i12 != i11) {
            Pair j15 = abstractC2346O2.j(cVar, bVar2, i12, -9223372036854775807L);
            obj = j15.first;
            j11 = ((Long) j15.second).longValue();
            j12 = -9223372036854775807L;
        } else {
            j11 = j10;
            j12 = j11;
        }
        D.b Q10 = mVar.Q(abstractC2346O2, obj, j11);
        int i14 = Q10.f21520e;
        boolean z19 = i14 == i11 || ((i13 = bVar3.f21520e) != i11 && i14 >= i13);
        if (bVar3.f21516a.equals(obj) && !bVar3.b() && !Q10.b() && z19) {
            z18 = true;
        }
        D.b bVar4 = Q10;
        boolean h02 = h0(l02, bVar3, j13, bVar4, abstractC2346O2.h(obj, bVar2), j12);
        if (z18 || h02) {
            bVar4 = bVar3;
        }
        if (bVar4.b()) {
            if (bVar4.equals(bVar3)) {
                j11 = h1Var.f56236s;
            } else {
                abstractC2346O2.h(bVar4.f21516a, bVar2);
                j11 = bVar4.f21518c == bVar2.l(bVar4.f21517b) ? bVar2.g() : 0L;
            }
        }
        return new g(bVar4, j11, j12, z11, z12, z13);
    }

    public static Pair X0(AbstractC2346O abstractC2346O, h hVar, boolean z10, int i10, boolean z11, AbstractC2346O.c cVar, AbstractC2346O.b bVar) {
        Pair j10;
        AbstractC2346O abstractC2346O2;
        int Y02;
        AbstractC2346O abstractC2346O3 = hVar.f21338a;
        if (abstractC2346O.q()) {
            return null;
        }
        if (abstractC2346O3.q()) {
            abstractC2346O3 = abstractC2346O;
        }
        try {
            j10 = abstractC2346O3.j(cVar, bVar, hVar.f21339b, hVar.f21340c);
            abstractC2346O2 = abstractC2346O3;
        } catch (IndexOutOfBoundsException unused) {
        }
        if (abstractC2346O.equals(abstractC2346O2)) {
            return j10;
        }
        if (abstractC2346O.b(j10.first) != -1) {
            return (abstractC2346O2.h(j10.first, bVar).f24359f && abstractC2346O2.n(bVar.f24356c, cVar).f24390n == abstractC2346O2.b(j10.first)) ? abstractC2346O.j(cVar, bVar, abstractC2346O.h(j10.first, bVar).f24356c, hVar.f21340c) : j10;
        }
        if (z10 && (Y02 = Y0(cVar, bVar, i10, z11, j10.first, abstractC2346O2, abstractC2346O)) != -1) {
            return abstractC2346O.j(cVar, bVar, Y02, -9223372036854775807L);
        }
        return null;
    }

    public static int Y0(AbstractC2346O.c cVar, AbstractC2346O.b bVar, int i10, boolean z10, Object obj, AbstractC2346O abstractC2346O, AbstractC2346O abstractC2346O2) {
        AbstractC2346O.b bVar2;
        Object obj2 = abstractC2346O.n(abstractC2346O.h(obj, bVar).f24356c, cVar).f24377a;
        int i11 = 0;
        for (int i12 = 0; i12 < abstractC2346O2.p(); i12++) {
            if (abstractC2346O2.n(i12, cVar).f24377a.equals(obj2)) {
                return i12;
            }
        }
        int b10 = abstractC2346O.b(obj);
        int i13 = abstractC2346O.i();
        int i14 = b10;
        int i15 = -1;
        while (i11 < i13 && i15 == -1) {
            AbstractC2346O.c cVar2 = cVar;
            bVar2 = bVar;
            int i16 = i10;
            boolean z11 = z10;
            AbstractC2346O abstractC2346O3 = abstractC2346O;
            i14 = abstractC2346O3.d(i14, bVar2, cVar2, i16, z11);
            if (i14 == -1) {
                break;
            }
            i15 = abstractC2346O2.b(abstractC2346O3.m(i14));
            i11++;
            abstractC2346O = abstractC2346O3;
            bVar = bVar2;
            cVar = cVar2;
            i10 = i16;
            z10 = z11;
        }
        bVar2 = bVar;
        if (i15 == -1) {
            return -1;
        }
        return abstractC2346O2.f(i15, bVar2).f24356c;
    }

    public static int Z1(int i10, int i11) {
        if (i10 == -1) {
            return 2;
        }
        if (i11 == 2) {
            return 1;
        }
        return i11;
    }

    public static int f2(int i10, int i11) {
        if (i10 == 0) {
            return 1;
        }
        if (i11 == 1) {
            return 0;
        }
        return i11;
    }

    public static boolean h0(boolean z10, D.b bVar, long j10, D.b bVar2, AbstractC2346O.b bVar3, long j11) {
        if (!z10 && j10 == j11 && bVar.f21516a.equals(bVar2.f21516a)) {
            if (bVar.b() && bVar3.s(bVar.f21517b)) {
                return (bVar3.h(bVar.f21517b, bVar.f21518c) == 4 || bVar3.h(bVar.f21517b, bVar.f21518c) == 2) ? false : true;
            }
            if (bVar2.b() && bVar3.s(bVar2.f21517b)) {
                return true;
            }
        }
        return false;
    }

    public static boolean l0(h1 h1Var, AbstractC2346O.b bVar) {
        D.b bVar2 = h1Var.f56219b;
        AbstractC2346O abstractC2346O = h1Var.f56218a;
        return abstractC2346O.q() || abstractC2346O.h(bVar2.f21516a, bVar).f24359f;
    }

    public static /* synthetic */ void n(i iVar, y yVar, long j10, long j11, androidx.media3.common.a aVar, MediaFormat mediaFormat) {
        iVar.getClass();
        yVar.e(j10, j11, aVar, mediaFormat);
        iVar.e(j10, j11, aVar, mediaFormat);
    }

    public static /* synthetic */ void o(i iVar, o oVar) {
        iVar.getClass();
        try {
            iVar.A(oVar);
        } catch (I e10) {
            AbstractC4156x.e("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e10);
            throw new RuntimeException(e10);
        }
    }

    public final void A(o oVar) {
        if (oVar.i()) {
            return;
        }
        try {
            oVar.f().t(oVar.h(), oVar.d());
        } finally {
            oVar.j(true);
        }
    }

    public final void A0() {
        l y10 = this.f21302p.y();
        if (y10 == null || this.f21302p.u() == y10 || y10.f21365h || !h2()) {
            return;
        }
        this.f21302p.y().f21365h = true;
    }

    public void A1(n1 n1Var) {
        this.f21289e.f(38, n1Var).a();
    }

    public final void B() {
        if (this.f21312x && x()) {
            for (l1 l1Var : this.renderers) {
                int h10 = l1Var.h();
                l1Var.c(this.f21298l);
                this.f21280X -= h10 - l1Var.h();
            }
            this.f21293g2 = -9223372036854775807L;
        }
    }

    public final void B0() {
        a0(this.f21305q.i(), true);
    }

    public final void B1(n1 n1Var) {
        this.f21260A = n1Var;
        w();
    }

    public final void C(int i10) {
        int h10 = this.renderers[i10].h();
        this.renderers[i10].b(this.f21298l);
        s0(i10, false);
        this.f21280X -= h10;
    }

    public final void C0(c cVar) {
        this.f21266G.b(1);
        throw null;
    }

    public final void C1(o1 o1Var) {
        this.f21317z = o1Var;
    }

    public final void D() {
        for (int i10 = 0; i10 < this.renderers.length; i10++) {
            C(i10);
        }
        this.f21293g2 = -9223372036854775807L;
    }

    public final void D0() {
        for (l u10 = this.f21302p.u(); u10 != null; u10 = u10.k()) {
            for (androidx.media3.exoplayer.trackselection.y yVar : u10.p().selections) {
                if (yVar != null) {
                    yVar.k();
                }
            }
        }
    }

    public void D1(boolean z10) {
        this.f21289e.i(12, z10 ? 1 : 0, 0).a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ad, code lost:
    
        if (r11 <= r17.f21265F.f56236s) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:124:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void E() {
        boolean z10;
        boolean z11;
        long j10;
        boolean z12;
        boolean z13;
        h1 h1Var;
        int i10;
        long c10 = this.f21300n.c();
        this.f21289e.n(2);
        Y1();
        int i11 = this.f21265F.f56222e;
        if (i11 == 1 || i11 == 4) {
            return;
        }
        l u10 = this.f21302p.u();
        if (u10 == null) {
            Z0(c10);
            return;
        }
        T.a("doSomeWork");
        d2();
        if (u10.f21362e) {
            this.f21285b1 = Z.a1(this.f21300n.b());
            u10.f21358a.v(this.f21265F.f56236s - this.f21296j, this.f21297k);
            z10 = true;
            z11 = true;
            int i12 = 0;
            while (true) {
                l1[] l1VarArr = this.renderers;
                if (i12 >= l1VarArr.length) {
                    break;
                }
                l1 l1Var = l1VarArr[i12];
                if (l1Var.h() == 0) {
                    s0(i12, false);
                } else {
                    l1Var.I(this.f21282Z, this.f21285b1);
                    z10 = z10 && l1Var.t();
                    boolean a10 = l1Var.a(u10);
                    s0(i12, a10);
                    z11 = z11 && a10;
                    if (!a10) {
                        r0(i12);
                    }
                }
                i12++;
            }
        } else {
            u10.f21358a.r();
            z10 = true;
            z11 = true;
        }
        long j11 = u10.f21364g.f56127e;
        if (z10 && u10.f21362e) {
            if (j11 != -9223372036854775807L) {
                j10 = -9223372036854775807L;
            } else {
                j10 = -9223372036854775807L;
            }
            z12 = true;
            if (z12 && this.f21269J) {
                this.f21269J = false;
                s1(false, this.f21265F.f56231n, false, 5);
            }
            if (!z12 && u10.f21364g.f56132j) {
                G1(4);
                U1();
            } else if (this.f21265F.f56222e != 2 && P1(z11)) {
                G1(3);
                this.f21313x1 = null;
                if (O1()) {
                    g2(false, false);
                    this.f21298l.g();
                    R1();
                }
            } else if (this.f21265F.f56222e == 3 && (this.f21280X != 0 ? !z11 : !k0())) {
                g2(O1(), false);
                G1(2);
                if (this.f21270K) {
                    F0();
                    this.f21306r.c();
                }
                U1();
            }
            if (this.f21265F.f56222e == 2) {
                int i13 = 0;
                while (true) {
                    l1[] l1VarArr2 = this.renderers;
                    if (i13 >= l1VarArr2.length) {
                        break;
                    }
                    if (l1VarArr2[i13].x(u10)) {
                        r0(i13);
                    }
                    i13++;
                }
                h1 h1Var2 = this.f21265F;
                if (!h1Var2.f56224g && h1Var2.f56235r < 500000 && i0(this.f21302p.n()) && O1()) {
                    if (this.f21276T1 == j10) {
                        this.f21276T1 = this.f21300n.b();
                    } else if (this.f21300n.b() - this.f21276T1 >= 4000) {
                        throw new IllegalStateException("Playback stuck buffering and not loading");
                    }
                    boolean z14 = !O1() && this.f21265F.f56222e == 3;
                    z13 = !this.f21279W && this.f21277V && z14;
                    h1Var = this.f21265F;
                    if (h1Var.f56233p != z13) {
                        this.f21265F = h1Var.i(z13);
                    }
                    this.f21277V = false;
                    if (!z13 && (i10 = this.f21265F.f56222e) != 4 && (z14 || i10 == 2 || (i10 == 3 && this.f21280X != 0))) {
                        Z0(c10);
                    }
                    T.b();
                }
            }
            this.f21276T1 = j10;
            if (O1()) {
            }
            if (this.f21279W) {
            }
            h1Var = this.f21265F;
            if (h1Var.f56233p != z13) {
            }
            this.f21277V = false;
            if (!z13) {
                Z0(c10);
            }
            T.b();
        }
        j10 = -9223372036854775807L;
        z12 = false;
        if (z12) {
            this.f21269J = false;
            s1(false, this.f21265F.f56231n, false, 5);
        }
        if (!z12) {
        }
        if (this.f21265F.f56222e != 2) {
        }
        if (this.f21265F.f56222e == 3) {
            g2(O1(), false);
            G1(2);
            if (this.f21270K) {
            }
            U1();
        }
        if (this.f21265F.f56222e == 2) {
        }
        this.f21276T1 = j10;
        if (O1()) {
        }
        if (this.f21279W) {
        }
        h1Var = this.f21265F;
        if (h1Var.f56233p != z13) {
        }
        this.f21277V = false;
        if (!z13) {
        }
        T.b();
    }

    public final void E0(boolean z10) {
        for (l u10 = this.f21302p.u(); u10 != null; u10 = u10.k()) {
            for (androidx.media3.exoplayer.trackselection.y yVar : u10.p().selections) {
                if (yVar != null) {
                    yVar.o(z10);
                }
            }
        }
    }

    public final void E1(boolean z10) {
        this.f21274R = z10;
        int Y10 = this.f21302p.Y(this.f21265F.f56218a, z10);
        if ((Y10 & 1) != 0) {
            b1(true);
        } else if ((Y10 & 2) != 0) {
            B();
        }
        Y(false);
    }

    public final void F(l lVar, int i10, boolean z10, long j10) {
        l1 l1Var = this.renderers[i10];
        if (l1Var.y()) {
            return;
        }
        boolean z11 = lVar == this.f21302p.u();
        G p10 = lVar.p();
        k1 k1Var = p10.rendererConfigurations[i10];
        androidx.media3.exoplayer.trackselection.y yVar = p10.selections[i10];
        boolean z12 = O1() && this.f21265F.f56222e == 3;
        boolean z13 = !z10 && z12;
        this.f21280X++;
        l1Var.e(k1Var, yVar, lVar.sampleStreams[i10], this.f21282Z, z13, z11, j10, lVar.m(), lVar.f21364g.f56123a, this.f21298l);
        l1Var.n(11, new a(), lVar);
        if (z12 && z11) {
            l1Var.W();
        }
    }

    public final void F0() {
        for (l u10 = this.f21302p.u(); u10 != null; u10 = u10.k()) {
            for (androidx.media3.exoplayer.trackselection.y yVar : u10.p().selections) {
                if (yVar != null) {
                    yVar.t();
                }
            }
        }
    }

    public final void F1(e0 e0Var) {
        this.f21266G.b(1);
        a0(this.f21305q.C(e0Var), false);
    }

    public final void G() {
        H(new boolean[this.renderers.length], this.f21302p.y().n());
    }

    @Override // androidx.media3.exoplayer.source.d0.a
    /* renamed from: G0, reason: merged with bridge method [inline-methods] */
    public void j(C c10) {
        this.f21289e.f(9, c10).a();
    }

    public final void G1(int i10) {
        h1 h1Var = this.f21265F;
        if (h1Var.f56222e != i10) {
            if (i10 != 2) {
                this.f21276T1 = -9223372036854775807L;
            }
            if (i10 != 3 && h1Var.f56233p) {
                this.f21265F = h1Var.i(false);
            }
            this.f21265F = this.f21265F.h(i10);
        }
    }

    public final void H(boolean[] zArr, long j10) {
        long j11;
        l y10 = this.f21302p.y();
        G p10 = y10.p();
        for (int i10 = 0; i10 < this.renderers.length; i10++) {
            if (!p10.c(i10)) {
                this.renderers[i10].L();
            }
        }
        int i11 = 0;
        while (i11 < this.renderers.length) {
            if (!p10.c(i11) || this.renderers[i11].x(y10)) {
                j11 = j10;
            } else {
                j11 = j10;
                F(y10, i11, zArr[i11], j11);
            }
            i11++;
            j10 = j11;
        }
    }

    public void H0() {
        this.f21289e.b(29).a();
    }

    public final void H1(y yVar) {
        for (l1 l1Var : this.renderers) {
            l1Var.T(yVar);
        }
    }

    public void I(long j10) {
        this.f21316y1 = j10;
    }

    public final void I0() {
        this.f21266G.b(1);
        Q0(false, false, false, true);
        this.f21287c.j(this.f21308t);
        G1(this.f21265F.f56218a.q() ? 4 : 2);
        a2();
        this.f21305q.v(this.f21288d.g());
        this.f21289e.l(2);
    }

    public boolean I1(Object obj, long j10) {
        if (!this.f21267H && this.f21291g.getThread().isAlive()) {
            C4146m c4146m = new C4146m(this.f21300n);
            this.f21289e.f(30, new Pair(obj, c4146m)).a();
            if (j10 != -9223372036854775807L) {
                return c4146m.c(j10);
            }
        }
        return true;
    }

    public final AbstractC3445z J(androidx.media3.exoplayer.trackselection.y[] yVarArr) {
        AbstractC3445z.a aVar = new AbstractC3445z.a();
        boolean z10 = false;
        for (androidx.media3.exoplayer.trackselection.y yVar : yVarArr) {
            if (yVar != null) {
                C2334C c2334c = yVar.e(0).f20540l;
                if (c2334c == null) {
                    aVar.a(new C2334C(new C2334C.a[0]));
                } else {
                    aVar.a(c2334c);
                    z10 = true;
                }
            }
        }
        return z10 ? aVar.m() : AbstractC3445z.t();
    }

    public boolean J0() {
        if (this.f21267H || !this.f21291g.getThread().isAlive()) {
            return true;
        }
        this.f21267H = true;
        C4146m c4146m = new C4146m(this.f21300n);
        this.f21289e.f(7, c4146m).a();
        return c4146m.c(this.f21307s);
    }

    public final void J1(Object obj, C4146m c4146m) {
        for (l1 l1Var : this.renderers) {
            l1Var.U(obj);
        }
        int i10 = this.f21265F.f56222e;
        if (i10 == 3 || i10 == 2) {
            this.f21289e.l(2);
        }
        if (c4146m != null) {
            c4146m.f();
        }
    }

    public final long K() {
        h1 h1Var = this.f21265F;
        return M(h1Var.f56218a, h1Var.f56219b.f21516a, h1Var.f56236s);
    }

    public final void K0(C4146m c4146m) {
        try {
            Q0(true, false, true, false);
            L0();
            this.f21287c.b(this.f21308t);
            this.f21315y.h();
            this.f21283a.j();
            G1(1);
        } finally {
            this.f21289e.g(null);
            this.f21290f.b();
            c4146m.f();
        }
    }

    public void K1(float f10) {
        this.f21289e.f(32, Float.valueOf(f10)).a();
    }

    public final long L() {
        long j10 = this.f21265F.f56222e == 3 ? 1000L : f21259y2;
        for (l1 l1Var : this.renderers) {
            j10 = Math.min(j10, Z.J1(l1Var.j(this.f21282Z, this.f21285b1)));
        }
        if (!this.f21265F.n()) {
            return j10;
        }
        l k10 = this.f21302p.u() != null ? this.f21302p.u().k() : null;
        return (k10 == null || ((float) this.f21282Z) + (((float) Z.a1(j10)) * this.f21265F.f56232o.f24315a) < ((float) k10.n())) ? j10 : Math.min(j10, f21259y2);
    }

    public final void L0() {
        for (int i10 = 0; i10 < this.renderers.length; i10++) {
            this.rendererCapabilities[i10].g();
            this.renderers[i10].H();
        }
    }

    public final void L1(float f10) {
        this.f21314x2 = f10;
        float f11 = f10 * this.f21315y.f();
        for (l1 l1Var : this.renderers) {
            l1Var.V(f11);
        }
    }

    public final long M(AbstractC2346O abstractC2346O, Object obj, long j10) {
        abstractC2346O.n(abstractC2346O.h(obj, this.f21295i).f24356c, this.f21294h);
        AbstractC2346O.c cVar = this.f21294h;
        if (cVar.f24382f != -9223372036854775807L && cVar.f()) {
            AbstractC2346O.c cVar2 = this.f21294h;
            if (cVar2.f24385i) {
                return Z.a1(cVar2.a() - this.f21294h.f24382f) - (j10 + this.f21295i.o());
            }
        }
        return -9223372036854775807L;
    }

    public final void M0(int i10, int i11, e0 e0Var) {
        this.f21266G.b(1);
        a0(this.f21305q.z(i10, i11, e0Var), false);
    }

    public final boolean M1() {
        l u10;
        l k10;
        return O1() && !this.f21269J && (u10 = this.f21302p.u()) != null && (k10 = u10.k()) != null && this.f21282Z >= k10.n() && k10.f21365h;
    }

    public final long N(l lVar) {
        if (lVar == null) {
            return 0L;
        }
        long m10 = lVar.m();
        if (!lVar.f21362e) {
            return m10;
        }
        int i10 = 0;
        while (true) {
            l1[] l1VarArr = this.renderers;
            if (i10 >= l1VarArr.length) {
                return m10;
            }
            if (l1VarArr[i10].x(lVar)) {
                long k10 = this.renderers[i10].k(lVar);
                if (k10 == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                m10 = Math.max(k10, m10);
            }
            i10++;
        }
    }

    public void N0(int i10, int i11, e0 e0Var) {
        this.f21289e.e(20, i10, i11, e0Var).a();
    }

    public final boolean N1() {
        if (!i0(this.f21302p.n())) {
            return false;
        }
        l n10 = this.f21302p.n();
        long T10 = T(n10.l());
        j.a aVar = new j.a(this.f21308t, this.f21265F.f56218a, n10.f21364g.f56123a, n10 == this.f21302p.u() ? n10.C(this.f21282Z) : n10.C(this.f21282Z) - n10.f21364g.f56124b, T10, this.f21298l.d().f24315a, this.f21265F.f56229l, this.f21270K, Q1(this.f21265F.f56218a, n10.f21364g.f56123a) ? this.f21306r.b() : -9223372036854775807L, this.f21271L);
        boolean g10 = this.f21287c.g(aVar);
        l u10 = this.f21302p.u();
        if (g10 || !u10.f21362e || T10 >= 500000) {
            return g10;
        }
        if (this.f21296j <= 0 && !this.f21297k) {
            return g10;
        }
        u10.f21358a.v(this.f21265F.f56236s, false);
        return this.f21287c.g(aVar);
    }

    public final Pair O(AbstractC2346O abstractC2346O) {
        if (abstractC2346O.q()) {
            return Pair.create(h1.l(), 0L);
        }
        Pair j10 = abstractC2346O.j(this.f21294h, this.f21295i, abstractC2346O.a(this.f21274R), -9223372036854775807L);
        D.b Q10 = this.f21302p.Q(abstractC2346O, j10.first, 0L);
        long longValue = ((Long) j10.second).longValue();
        if (Q10.b()) {
            abstractC2346O.h(Q10.f21516a, this.f21295i);
            longValue = Q10.f21518c == this.f21295i.l(Q10.f21517b) ? this.f21295i.g() : 0L;
        }
        return Pair.create(Q10, Long.valueOf(longValue));
    }

    public final void O0() {
        float f10 = this.f21298l.d().f24315a;
        l y10 = this.f21302p.y();
        G g10 = null;
        boolean z10 = true;
        for (l u10 = this.f21302p.u(); u10 != null && u10.f21362e; u10 = u10.k()) {
            h1 h1Var = this.f21265F;
            G z11 = u10.z(f10, h1Var.f56218a, h1Var.f56229l);
            if (u10 == this.f21302p.u()) {
                g10 = z11;
            }
            if (!z11.a(u10.p())) {
                if (z10) {
                    l u11 = this.f21302p.u();
                    boolean z12 = (this.f21302p.N(u11) & 1) != 0;
                    boolean[] zArr = new boolean[this.renderers.length];
                    long b10 = u11.b((G) AbstractC4134a.e(g10), this.f21265F.f56236s, z12, zArr);
                    h1 h1Var2 = this.f21265F;
                    boolean z13 = (h1Var2.f56222e == 4 || b10 == h1Var2.f56236s) ? false : true;
                    h1 h1Var3 = this.f21265F;
                    this.f21265F = e0(h1Var3.f56219b, b10, h1Var3.f56220c, h1Var3.f56221d, z13, 5);
                    if (z13) {
                        S0(b10);
                    }
                    B();
                    boolean[] zArr2 = new boolean[this.renderers.length];
                    int i10 = 0;
                    while (true) {
                        l1[] l1VarArr = this.renderers;
                        if (i10 >= l1VarArr.length) {
                            break;
                        }
                        int h10 = l1VarArr[i10].h();
                        zArr2[i10] = this.renderers[i10].y();
                        this.renderers[i10].B(u11.sampleStreams[i10], this.f21298l, this.f21282Z, zArr[i10]);
                        if (h10 - this.renderers[i10].h() > 0) {
                            s0(i10, false);
                        }
                        this.f21280X -= h10 - this.renderers[i10].h();
                        i10++;
                    }
                    H(zArr2, this.f21282Z);
                    u11.f21365h = true;
                } else {
                    this.f21302p.N(u10);
                    if (u10.f21362e) {
                        long max = Math.max(u10.f21364g.f56124b, u10.C(this.f21282Z));
                        if (this.f21312x && x() && this.f21302p.x() == u10) {
                            B();
                        }
                        u10.a(z11, max, false);
                    }
                }
                Y(true);
                if (this.f21265F.f56222e != 4) {
                    m0();
                    d2();
                    this.f21289e.l(2);
                    return;
                }
                return;
            }
            if (u10 == y10) {
                z10 = false;
            }
        }
    }

    public final boolean O1() {
        h1 h1Var = this.f21265F;
        return h1Var.f56229l && h1Var.f56231n == 0;
    }

    public Looper P() {
        return this.f21291g;
    }

    public final void P0() {
        O0();
        b1(true);
    }

    public final boolean P1(boolean z10) {
        if (this.f21280X == 0) {
            return k0();
        }
        boolean z11 = false;
        if (!z10) {
            return false;
        }
        if (!this.f21265F.f56224g) {
            return true;
        }
        l u10 = this.f21302p.u();
        long b10 = Q1(this.f21265F.f56218a, u10.f21364g.f56123a) ? this.f21306r.b() : -9223372036854775807L;
        l n10 = this.f21302p.n();
        boolean z12 = n10.s() && n10.f21364g.f56132j;
        if (n10.f21364g.f56123a.b() && !n10.f21362e) {
            z11 = true;
        }
        if (z12 || z11) {
            return true;
        }
        return this.f21287c.a(new j.a(this.f21308t, this.f21265F.f56218a, u10.f21364g.f56123a, u10.C(this.f21282Z), T(n10.j()), this.f21298l.d().f24315a, this.f21265F.f56229l, this.f21270K, b10, this.f21271L));
    }

    public final o1 Q(long j10) {
        n1 n1Var;
        Double d10;
        if (!this.f21262C || j10 == -9223372036854775807L || (d10 = (n1Var = this.f21260A).f56281b) == null || n1Var.f56282c == null) {
            return this.f21317z;
        }
        double d11 = j10;
        double doubleValue = d10.doubleValue() * d11;
        RoundingMode roundingMode = RoundingMode.FLOOR;
        long f10 = com.google.common.math.b.f(doubleValue, roundingMode);
        long f11 = com.google.common.math.b.f(this.f21260A.f56282c.doubleValue() * d11, roundingMode);
        o1 o1Var = this.f21261B;
        if (o1Var == null || o1Var.f56301a != f10 || o1Var.f56302b != f11) {
            this.f21261B = new o1(f10, f11);
        }
        return this.f21261B;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0090, code lost:
    
        if (r2.equals(r33.f21265F.f56219b) == false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Q0(boolean z10, boolean z11, boolean z12, boolean z13) {
        AbstractC2346O abstractC2346O;
        D.b bVar;
        this.f21289e.n(2);
        this.f21263D = false;
        this.f21264E = null;
        this.f21313x1 = null;
        boolean z14 = true;
        g2(false, true);
        this.f21298l.h();
        this.f21282Z = 1000000000000L;
        try {
            D();
        } catch (RuntimeException | I e10) {
            AbstractC4156x.e("ExoPlayerImplInternal", "Disable failed.", e10);
        }
        if (z10) {
            for (l1 l1Var : this.renderers) {
                try {
                    l1Var.L();
                } catch (RuntimeException e11) {
                    AbstractC4156x.e("ExoPlayerImplInternal", "Reset failed.", e11);
                }
            }
        }
        this.f21280X = 0;
        h1 h1Var = this.f21265F;
        D.b bVar2 = h1Var.f56219b;
        long j10 = h1Var.f56236s;
        long j11 = (this.f21265F.f56219b.b() || l0(this.f21265F, this.f21295i)) ? this.f21265F.f56220c : this.f21265F.f56236s;
        if (z11) {
            this.f21281Y = null;
            Pair O10 = O(this.f21265F.f56218a);
            bVar2 = (D.b) O10.first;
            j10 = ((Long) O10.second).longValue();
            j11 = -9223372036854775807L;
        }
        z14 = false;
        long j12 = j10;
        long j13 = j11;
        this.f21302p.g();
        this.f21272O = false;
        AbstractC2346O abstractC2346O2 = this.f21265F.f56218a;
        if (z12 && (abstractC2346O2 instanceof j1)) {
            abstractC2346O2 = ((j1) abstractC2346O2).E(this.f21305q.q());
            if (bVar2.f21517b != -1) {
                abstractC2346O2.h(bVar2.f21516a, this.f21295i);
                if (abstractC2346O2.n(this.f21295i.f24356c, this.f21294h).f()) {
                    abstractC2346O = abstractC2346O2;
                    bVar = new D.b(bVar2.f21516a, bVar2.f21519d);
                    h1 h1Var2 = this.f21265F;
                    int i10 = h1Var2.f56222e;
                    I i11 = z13 ? null : h1Var2.f56223f;
                    m0 m0Var = !z14 ? m0.f21830d : h1Var2.f56225h;
                    G g10 = !z14 ? this.f21284b : h1Var2.f56226i;
                    List t10 = !z14 ? AbstractC3445z.t() : h1Var2.f56227j;
                    h1 h1Var3 = this.f21265F;
                    this.f21265F = new h1(abstractC2346O, bVar, j13, j12, i10, i11, false, m0Var, g10, t10, bVar, h1Var3.f56229l, h1Var3.f56230m, h1Var3.f56231n, h1Var3.f56232o, j12, 0L, j12, 0L, false);
                    if (z12) {
                        return;
                    }
                    this.f21302p.M();
                    this.f21305q.x();
                    return;
                }
            }
        }
        abstractC2346O = abstractC2346O2;
        bVar = bVar2;
        h1 h1Var22 = this.f21265F;
        int i102 = h1Var22.f56222e;
        I i112 = z13 ? null : h1Var22.f56223f;
        m0 m0Var2 = !z14 ? m0.f21830d : h1Var22.f56225h;
        G g102 = !z14 ? this.f21284b : h1Var22.f56226i;
        List t102 = !z14 ? AbstractC3445z.t() : h1Var22.f56227j;
        h1 h1Var32 = this.f21265F;
        this.f21265F = new h1(abstractC2346O, bVar, j13, j12, i102, i112, false, m0Var2, g102, t102, bVar, h1Var32.f56229l, h1Var32.f56230m, h1Var32.f56231n, h1Var32.f56232o, j12, 0L, j12, 0L, false);
        if (z12) {
        }
    }

    public final boolean Q1(AbstractC2346O abstractC2346O, D.b bVar) {
        if (!bVar.b() && !abstractC2346O.q()) {
            abstractC2346O.n(abstractC2346O.h(bVar.f21516a, this.f21295i).f24356c, this.f21294h);
            if (this.f21294h.f()) {
                AbstractC2346O.c cVar = this.f21294h;
                if (cVar.f24385i && cVar.f24382f != -9223372036854775807L) {
                    return true;
                }
            }
        }
        return false;
    }

    public final long R() {
        if (this.f21265F.f56222e != 3 || O1()) {
            return f21259y2;
        }
        return 1000L;
    }

    public final void R0() {
        l u10 = this.f21302p.u();
        this.f21269J = u10 != null && u10.f21364g.f56131i && this.f21268I;
    }

    public final void R1() {
        l u10 = this.f21302p.u();
        if (u10 == null) {
            return;
        }
        G p10 = u10.p();
        for (int i10 = 0; i10 < this.renderers.length; i10++) {
            if (p10.c(i10)) {
                this.renderers[i10].W();
            }
        }
    }

    public final long S() {
        return T(this.f21265F.f56234q);
    }

    public final void S0(long j10) {
        l u10 = this.f21302p.u();
        long D10 = u10 == null ? j10 + 1000000000000L : u10.D(j10);
        this.f21282Z = D10;
        this.f21298l.c(D10);
        for (l1 l1Var : this.renderers) {
            l1Var.M(u10, this.f21282Z);
        }
        D0();
    }

    public void S1() {
        this.f21289e.b(6).a();
    }

    public final long T(long j10) {
        l n10 = this.f21302p.n();
        if (n10 == null) {
            return 0L;
        }
        return Math.max(0L, j10 - n10.C(this.f21282Z));
    }

    public final void T1(boolean z10, boolean z11) {
        Q0(z10 || !this.f21275T, false, true, false);
        this.f21266G.b(z11 ? 1 : 0);
        this.f21287c.e(this.f21308t);
        this.f21315y.n(this.f21265F.f56229l, 1);
        G1(1);
    }

    public final void U(int i10) {
        h1 h1Var = this.f21265F;
        c2(h1Var.f56229l, i10, h1Var.f56231n, h1Var.f56230m);
    }

    public final void U1() {
        this.f21298l.h();
        for (l1 l1Var : this.renderers) {
            l1Var.Y();
        }
    }

    public final void V() {
        L1(this.f21314x2);
    }

    public final void V0(AbstractC2346O abstractC2346O, AbstractC2346O abstractC2346O2) {
        if (abstractC2346O.q() && abstractC2346O2.q()) {
            return;
        }
        int size = this.f21299m.size() - 1;
        while (size >= 0) {
            AbstractC2346O abstractC2346O3 = abstractC2346O;
            AbstractC2346O abstractC2346O4 = abstractC2346O2;
            if (!U0((d) this.f21299m.get(size), abstractC2346O3, abstractC2346O4, this.f21273P, this.f21274R, this.f21294h, this.f21295i)) {
                ((d) this.f21299m.get(size)).f21323a.j(false);
                this.f21299m.remove(size);
            }
            size--;
            abstractC2346O = abstractC2346O3;
            abstractC2346O2 = abstractC2346O4;
        }
        Collections.sort(this.f21299m);
    }

    public final void V1() {
        l n10 = this.f21302p.n();
        boolean z10 = this.f21272O || (n10 != null && n10.f21358a.e());
        h1 h1Var = this.f21265F;
        if (z10 != h1Var.f56224g) {
            this.f21265F = h1Var.b(z10);
        }
    }

    public final void W(C c10) {
        if (this.f21302p.F(c10)) {
            this.f21302p.K(this.f21282Z);
            m0();
        } else if (this.f21302p.G(c10)) {
            n0();
        }
    }

    public final void W1(D.b bVar, m0 m0Var, G g10) {
        l lVar = (l) AbstractC4134a.e(this.f21302p.n());
        this.f21287c.c(new j.a(this.f21308t, this.f21265F.f56218a, bVar, lVar == this.f21302p.u() ? lVar.C(this.f21282Z) : lVar.C(this.f21282Z) - lVar.f21364g.f56124b, T(lVar.j()), this.f21298l.d().f24315a, this.f21265F.f56229l, this.f21270K, Q1(this.f21265F.f56218a, lVar.f21364g.f56123a) ? this.f21306r.b() : -9223372036854775807L, this.f21271L), m0Var, g10.selections);
    }

    public final void X(IOException iOException, int i10) {
        I e10 = I.e(iOException, i10);
        l u10 = this.f21302p.u();
        if (u10 != null) {
            e10 = e10.c(u10.f21364g.f56123a);
        }
        AbstractC4156x.e("ExoPlayerImplInternal", "Playback error", e10);
        T1(false, false);
        this.f21265F = this.f21265F.f(e10);
    }

    public final void X1(int i10, int i11, List list) {
        this.f21266G.b(1);
        a0(this.f21305q.D(i10, i11, list), false);
    }

    public final void Y(boolean z10) {
        l n10 = this.f21302p.n();
        D.b bVar = n10 == null ? this.f21265F.f56219b : n10.f21364g.f56123a;
        boolean equals = this.f21265F.f56228k.equals(bVar);
        if (!equals) {
            this.f21265F = this.f21265F.c(bVar);
        }
        h1 h1Var = this.f21265F;
        h1Var.f56234q = n10 == null ? h1Var.f56236s : n10.j();
        this.f21265F.f56235r = S();
        if ((!equals || z10) && n10 != null && n10.f21362e) {
            W1(n10.f21364g.f56123a, n10.o(), n10.p());
        }
    }

    public final void Y1() {
        if (this.f21265F.f56218a.q() || !this.f21305q.t()) {
            return;
        }
        boolean u02 = u0();
        y0();
        z0();
        A0();
        w0();
        x0(u02);
    }

    public final void Z(l lVar) {
        if (!lVar.f21362e) {
            float f10 = this.f21298l.d().f24315a;
            h1 h1Var = this.f21265F;
            lVar.q(f10, h1Var.f56218a, h1Var.f56229l);
        }
        W1(lVar.f21364g.f56123a, lVar.o(), lVar.p());
        if (lVar == this.f21302p.u()) {
            S0(lVar.f21364g.f56124b);
            G();
            lVar.f21365h = true;
            h1 h1Var2 = this.f21265F;
            D.b bVar = h1Var2.f56219b;
            long j10 = lVar.f21364g.f56124b;
            this.f21265F = e0(bVar, j10, h1Var2.f56220c, j10, false, 5);
        }
        m0();
    }

    public final void Z0(long j10) {
        this.f21289e.m(2, j10 + (g0() ? L() : R()));
    }

    @Override // androidx.media3.exoplayer.trackselection.F.b
    public void a(p pVar) {
        this.f21289e.l(26);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01e5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01c8  */
    /* JADX WARN: Type inference failed for: r12v0, types: [long] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a0(AbstractC2346O abstractC2346O, boolean z10) {
        AbstractC2346O abstractC2346O2;
        D.b bVar;
        boolean z11;
        int i10;
        long j10;
        boolean z12;
        int i11;
        boolean z13;
        long j11;
        long N10;
        int i12;
        boolean z14;
        AbstractC2346O abstractC2346O3 = abstractC2346O;
        g W02 = W0(abstractC2346O3, this.f21265F, this.f21281Y, this.f21302p, this.f21273P, this.f21274R, this.f21294h, this.f21295i);
        D.b bVar2 = W02.f21332a;
        ?? r12 = W02.f21334c;
        boolean z15 = W02.f21335d;
        long j12 = W02.f21333b;
        boolean z16 = (this.f21265F.f56219b.equals(bVar2) && j12 == this.f21265F.f56236s) ? false : true;
        try {
            if (W02.f21336e) {
                if (this.f21265F.f56222e != 1) {
                    G1(4);
                }
                Q0(false, false, false, true);
            }
            for (l1 l1Var : this.renderers) {
                try {
                    l1Var.S(abstractC2346O3);
                } catch (Throwable th2) {
                    th = th2;
                    abstractC2346O2 = abstractC2346O3;
                    bVar = bVar2;
                    i10 = 4;
                    j10 = r12;
                    z12 = false;
                    z11 = true;
                    i11 = -1;
                    z13 = z12;
                    h1 h1Var = this.f21265F;
                    AbstractC2346O abstractC2346O4 = h1Var.f56218a;
                    D.b bVar3 = h1Var.f56219b;
                    D.b bVar4 = bVar;
                    e2(abstractC2346O2, bVar4, abstractC2346O4, bVar3, !W02.f21337f ? j12 : -9223372036854775807L, false);
                    if (!z16 || j10 != this.f21265F.f56220c) {
                        h1 h1Var2 = this.f21265F;
                        Object obj = h1Var2.f56219b.f21516a;
                        AbstractC2346O abstractC2346O5 = h1Var2.f56218a;
                        this.f21265F = e0(bVar4, j12, j10, this.f21265F.f56221d, (z16 || !z10 || abstractC2346O5.q() || abstractC2346O5.h(obj, this.f21295i).f24359f) ? z13 : z11, abstractC2346O2.b(obj) != i11 ? i10 : 3);
                    }
                    R0();
                    V0(abstractC2346O2, this.f21265F.f56218a);
                    this.f21265F = this.f21265F.j(abstractC2346O2);
                    if (!abstractC2346O2.q()) {
                        this.f21281Y = null;
                    }
                    Y(z13);
                    this.f21289e.l(2);
                    throw th;
                }
            }
            try {
                if (z16) {
                    i12 = 2;
                    i10 = 4;
                    j10 = r12;
                    z14 = false;
                    z14 = false;
                    z11 = true;
                    i11 = -1;
                    if (!abstractC2346O3.q()) {
                        for (l u10 = this.f21302p.u(); u10 != null; u10 = u10.k()) {
                            if (u10.f21364g.f56123a.equals(bVar2)) {
                                u10.f21364g = this.f21302p.z(abstractC2346O3, u10.f21364g);
                                u10.E();
                            }
                        }
                        j12 = d1(bVar2, j12, z15);
                    }
                } else {
                    try {
                        j11 = 0;
                        N10 = this.f21302p.y() == null ? 0L : N(this.f21302p.y());
                        if (x() && this.f21302p.x() != null) {
                            j11 = N(this.f21302p.x());
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                    try {
                    } catch (Throwable th4) {
                        th = th4;
                        abstractC2346O3 = abstractC2346O;
                        i10 = 4;
                        j10 = r12;
                        r12 = 0;
                        z11 = true;
                        i11 = -1;
                        abstractC2346O2 = abstractC2346O3;
                        bVar = bVar2;
                        z13 = r12;
                        h1 h1Var3 = this.f21265F;
                        AbstractC2346O abstractC2346O42 = h1Var3.f56218a;
                        D.b bVar32 = h1Var3.f56219b;
                        D.b bVar42 = bVar;
                        e2(abstractC2346O2, bVar42, abstractC2346O42, bVar32, !W02.f21337f ? j12 : -9223372036854775807L, false);
                        if (!z16) {
                        }
                        h1 h1Var22 = this.f21265F;
                        Object obj2 = h1Var22.f56219b.f21516a;
                        AbstractC2346O abstractC2346O52 = h1Var22.f56218a;
                        if (z16) {
                        }
                        this.f21265F = e0(bVar42, j12, j10, this.f21265F.f56221d, (z16 || !z10 || abstractC2346O52.q() || abstractC2346O52.h(obj2, this.f21295i).f24359f) ? z13 : z11, abstractC2346O2.b(obj2) != i11 ? i10 : 3);
                        R0();
                        V0(abstractC2346O2, this.f21265F.f56218a);
                        this.f21265F = this.f21265F.j(abstractC2346O2);
                        if (!abstractC2346O2.q()) {
                        }
                        Y(z13);
                        this.f21289e.l(2);
                        throw th;
                    }
                    try {
                        i12 = 2;
                        z11 = true;
                        i10 = 4;
                        j10 = r12;
                        r12 = 0;
                        z14 = false;
                        z14 = false;
                        z14 = false;
                        i11 = -1;
                        try {
                            int W10 = this.f21302p.W(abstractC2346O, this.f21282Z, N10, j11);
                            abstractC2346O3 = abstractC2346O;
                            if ((W10 & 1) != 0) {
                                b1(false);
                            } else if ((W10 & 2) != 0) {
                                B();
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            abstractC2346O3 = abstractC2346O;
                            abstractC2346O2 = abstractC2346O3;
                            bVar = bVar2;
                            z13 = r12;
                            h1 h1Var32 = this.f21265F;
                            AbstractC2346O abstractC2346O422 = h1Var32.f56218a;
                            D.b bVar322 = h1Var32.f56219b;
                            D.b bVar422 = bVar;
                            e2(abstractC2346O2, bVar422, abstractC2346O422, bVar322, !W02.f21337f ? j12 : -9223372036854775807L, false);
                            if (!z16) {
                            }
                            h1 h1Var222 = this.f21265F;
                            Object obj22 = h1Var222.f56219b.f21516a;
                            AbstractC2346O abstractC2346O522 = h1Var222.f56218a;
                            if (z16) {
                            }
                            this.f21265F = e0(bVar422, j12, j10, this.f21265F.f56221d, (z16 || !z10 || abstractC2346O522.q() || abstractC2346O522.h(obj22, this.f21295i).f24359f) ? z13 : z11, abstractC2346O2.b(obj22) != i11 ? i10 : 3);
                            R0();
                            V0(abstractC2346O2, this.f21265F.f56218a);
                            this.f21265F = this.f21265F.j(abstractC2346O2);
                            if (!abstractC2346O2.q()) {
                            }
                            Y(z13);
                            this.f21289e.l(2);
                            throw th;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        abstractC2346O3 = abstractC2346O;
                        i10 = 4;
                        j10 = r12;
                        r12 = 0;
                        z11 = true;
                        i11 = -1;
                        abstractC2346O2 = abstractC2346O3;
                        bVar = bVar2;
                        z13 = r12;
                        h1 h1Var322 = this.f21265F;
                        AbstractC2346O abstractC2346O4222 = h1Var322.f56218a;
                        D.b bVar3222 = h1Var322.f56219b;
                        D.b bVar4222 = bVar;
                        e2(abstractC2346O2, bVar4222, abstractC2346O4222, bVar3222, !W02.f21337f ? j12 : -9223372036854775807L, false);
                        if (!z16) {
                        }
                        h1 h1Var2222 = this.f21265F;
                        Object obj222 = h1Var2222.f56219b.f21516a;
                        AbstractC2346O abstractC2346O5222 = h1Var2222.f56218a;
                        if (z16) {
                        }
                        this.f21265F = e0(bVar4222, j12, j10, this.f21265F.f56221d, (z16 || !z10 || abstractC2346O5222.q() || abstractC2346O5222.h(obj222, this.f21295i).f24359f) ? z13 : z11, abstractC2346O2.b(obj222) != i11 ? i10 : 3);
                        R0();
                        V0(abstractC2346O2, this.f21265F.f56218a);
                        this.f21265F = this.f21265F.j(abstractC2346O2);
                        if (!abstractC2346O2.q()) {
                        }
                        Y(z13);
                        this.f21289e.l(2);
                        throw th;
                    }
                }
                h1 h1Var4 = this.f21265F;
                e2(abstractC2346O3, bVar2, h1Var4.f56218a, h1Var4.f56219b, W02.f21337f ? j12 : -9223372036854775807L, false);
                AbstractC2346O abstractC2346O6 = abstractC2346O3;
                if (z16 || j10 != this.f21265F.f56220c) {
                    h1 h1Var5 = this.f21265F;
                    Object obj3 = h1Var5.f56219b.f21516a;
                    AbstractC2346O abstractC2346O7 = h1Var5.f56218a;
                    this.f21265F = e0(bVar2, j12, j10, this.f21265F.f56221d, (!z16 || !z10 || abstractC2346O7.q() || abstractC2346O7.h(obj3, this.f21295i).f24359f) ? z14 : z11, abstractC2346O6.b(obj3) == i11 ? i10 : 3);
                }
                R0();
                V0(abstractC2346O6, this.f21265F.f56218a);
                this.f21265F = this.f21265F.j(abstractC2346O6);
                if (!abstractC2346O6.q()) {
                    this.f21281Y = null;
                }
                Y(z14);
                this.f21289e.l(i12);
            } catch (Throwable th7) {
                th = th7;
            }
        } catch (Throwable th8) {
            th = th8;
            abstractC2346O2 = abstractC2346O3;
            bVar = bVar2;
            z11 = true;
            i10 = 4;
            j10 = r12;
            z12 = false;
        }
    }

    public void a1(AbstractC2346O abstractC2346O, int i10, long j10) {
        this.f21289e.f(3, new h(abstractC2346O, i10, j10)).a();
    }

    public final void a2() {
        h1 h1Var = this.f21265F;
        b2(h1Var.f56229l, h1Var.f56231n, h1Var.f56230m);
    }

    @Override // androidx.media3.exoplayer.trackselection.F.b
    public void b() {
        this.f21289e.l(10);
    }

    public final void b0(C c10) {
        if (this.f21302p.F(c10)) {
            Z((l) AbstractC4134a.e(this.f21302p.n()));
            return;
        }
        l v10 = this.f21302p.v(c10);
        if (v10 != null) {
            AbstractC4134a.g(!v10.f21362e);
            float f10 = this.f21298l.d().f24315a;
            h1 h1Var = this.f21265F;
            v10.q(f10, h1Var.f56218a, h1Var.f56229l);
            if (this.f21302p.G(c10)) {
                n0();
            }
        }
    }

    public final void b1(boolean z10) {
        D.b bVar = this.f21302p.u().f21364g.f56123a;
        long e12 = e1(bVar, this.f21265F.f56236s, true, false);
        if (e12 != this.f21265F.f56236s) {
            h1 h1Var = this.f21265F;
            this.f21265F = e0(bVar, e12, h1Var.f56220c, h1Var.f56221d, z10, 5);
        }
    }

    public final void b2(boolean z10, int i10, int i11) {
        c2(z10, this.f21315y.n(z10, this.f21265F.f56222e), i10, i11);
    }

    public final void c0(C2340I c2340i, float f10, boolean z10, boolean z11) {
        if (z10) {
            if (z11) {
                this.f21266G.b(1);
            }
            this.f21265F = this.f21265F.g(c2340i);
        }
        i2(c2340i.f24315a);
        for (l1 l1Var : this.renderers) {
            l1Var.Q(f10, c2340i.f24315a);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:24|(7:(11:26|(1:74)(1:32)|33|34|35|36|(1:46)|43|44|16|17)(1:75)|58|59|60|15|16|17)|47|(1:49)(1:70)|50|51|(1:53)|54|55|56|57) */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0154, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0155, code lost:
    
        r2 = r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00aa A[Catch: all -> 0x00ad, TryCatch #2 {all -> 0x00ad, blocks: (B:11:0x00a0, B:13:0x00aa, B:20:0x00b5, B:22:0x00bb, B:23:0x00be, B:24:0x00c5, B:26:0x00cf, B:28:0x00d7, B:32:0x00df, B:33:0x00ef, B:47:0x0122, B:50:0x012f), top: B:10:0x00a0 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c1(h hVar, boolean z10) {
        long longValue;
        D.b Q10;
        long j10;
        boolean z11;
        long j11;
        D.b bVar;
        long j12;
        long j13;
        long d12;
        h1 h1Var;
        AbstractC2346O abstractC2346O;
        long j14;
        D.b bVar2;
        D.b bVar3;
        long j15;
        h1 h1Var2;
        int i10;
        int i11;
        long j16;
        i iVar = this;
        iVar.f21266G.b(z10 ? 1 : 0);
        if (iVar.f21263D) {
            iVar.f21264E = hVar;
            return;
        }
        Pair X02 = X0(iVar.f21265F.f56218a, hVar, true, iVar.f21273P, iVar.f21274R, iVar.f21294h, iVar.f21295i);
        try {
            if (X02 == null) {
                Pair O10 = iVar.O(iVar.f21265F.f56218a);
                Q10 = (D.b) O10.first;
                longValue = ((Long) O10.second).longValue();
                z11 = !iVar.f21265F.f56218a.q();
                j11 = -9223372036854775807L;
            } else {
                Object obj = X02.first;
                longValue = ((Long) X02.second).longValue();
                long j17 = hVar.f21340c == -9223372036854775807L ? -9223372036854775807L : longValue;
                Q10 = iVar.f21302p.Q(iVar.f21265F.f56218a, obj, longValue);
                if (!Q10.b()) {
                    j10 = 0;
                    z11 = hVar.f21340c == -9223372036854775807L;
                    j11 = j17;
                    if (!iVar.f21265F.f56218a.q()) {
                        iVar.f21281Y = hVar;
                    } else if (X02 == null) {
                        if (iVar.f21265F.f56222e != 1) {
                            iVar.G1(4);
                        }
                        iVar.Q0(false, true, false, true);
                    } else {
                        try {
                            if (Q10.equals(iVar.f21265F.f56219b)) {
                                l u10 = iVar.f21302p.u();
                                j13 = (u10 == null || !u10.f21362e || longValue == j10) ? longValue : u10.f21358a.f(longValue, iVar.Q(iVar.f21294h.f24389m));
                                boolean z12 = z11;
                                try {
                                    if (Z.J1(j13) != Z.J1(iVar.f21265F.f56236s) || ((i10 = (h1Var2 = iVar.f21265F).f56222e) != 2 && i10 != 3)) {
                                        z11 = z12;
                                    }
                                    j15 = h1Var2.f56236s;
                                    bVar3 = Q10;
                                    i11 = 2;
                                    j16 = j15;
                                    z11 = z12;
                                    iVar.f21265F = iVar.e0(bVar3, j15, j11, j16, z11, i11);
                                    return;
                                } catch (Throwable th2) {
                                    th = th2;
                                    z11 = z12;
                                    bVar = Q10;
                                    j12 = longValue;
                                    iVar.f21265F = iVar.e0(bVar, j12, j11, j12, z11, 2);
                                    throw th;
                                }
                            }
                            j13 = longValue;
                            iVar.e2(abstractC2346O, bVar2, abstractC2346O, h1Var.f56219b, j14, true);
                            bVar3 = bVar2;
                            j11 = j14;
                            j15 = d12;
                            i11 = 2;
                            j16 = j15;
                            iVar = this;
                            iVar.f21265F = iVar.e0(bVar3, j15, j11, j16, z11, i11);
                            return;
                        } catch (Throwable th3) {
                            th = th3;
                            bVar = bVar2;
                            j11 = j14;
                            j12 = d12;
                            iVar.f21265F = iVar.e0(bVar, j12, j11, j12, z11, 2);
                            throw th;
                        }
                        iVar.f21263D = iVar.f21262C;
                        d12 = iVar.d1(Q10, j13, iVar.f21265F.f56222e == 4);
                        z11 |= longValue != d12;
                        h1Var = iVar.f21265F;
                        abstractC2346O = h1Var.f56218a;
                        j14 = j11;
                        bVar2 = Q10;
                    }
                    bVar3 = Q10;
                    j15 = longValue;
                    i11 = 2;
                    j16 = j15;
                    iVar = this;
                    iVar.f21265F = iVar.e0(bVar3, j15, j11, j16, z11, i11);
                    return;
                }
                iVar.f21265F.f56218a.h(Q10.f21516a, iVar.f21295i);
                longValue = iVar.f21295i.l(Q10.f21517b) == Q10.f21518c ? iVar.f21295i.g() : 0L;
                z11 = true;
                j11 = j17;
            }
            if (!iVar.f21265F.f56218a.q()) {
            }
            bVar3 = Q10;
            j15 = longValue;
            i11 = 2;
            j16 = j15;
            iVar = this;
            iVar.f21265F = iVar.e0(bVar3, j15, j11, j16, z11, i11);
            return;
        } catch (Throwable th4) {
            th = th4;
        }
        j10 = 0;
    }

    public final void c2(boolean z10, int i10, int i11, int i12) {
        boolean z11 = z10 && i10 != -1;
        int Z12 = Z1(i10, i12);
        int f22 = f2(i10, i11);
        h1 h1Var = this.f21265F;
        if (h1Var.f56229l == z11 && h1Var.f56231n == f22 && h1Var.f56230m == Z12) {
            return;
        }
        this.f21265F = h1Var.e(z11, Z12, f22);
        g2(false, false);
        E0(z11);
        if (!O1()) {
            U1();
            d2();
            h1 h1Var2 = this.f21265F;
            if (h1Var2.f56233p) {
                this.f21265F = h1Var2.i(false);
            }
            this.f21302p.K(this.f21282Z);
            return;
        }
        int i13 = this.f21265F.f56222e;
        if (i13 == 3) {
            this.f21298l.g();
            R1();
            this.f21289e.l(2);
        } else if (i13 == 2) {
            this.f21289e.l(2);
        }
    }

    @Override // androidx.media3.exoplayer.n.d
    public void d() {
        this.f21289e.n(2);
        this.f21289e.l(22);
    }

    public final void d0(C2340I c2340i, boolean z10) {
        c0(c2340i, c2340i.f24315a, true, z10);
    }

    public final long d1(D.b bVar, long j10, boolean z10) {
        return e1(bVar, j10, this.f21302p.u() != this.f21302p.y(), z10);
    }

    public final void d2() {
        l u10 = this.f21302p.u();
        if (u10 == null) {
            return;
        }
        long n10 = u10.f21362e ? u10.f21358a.n() : -9223372036854775807L;
        if (n10 != -9223372036854775807L) {
            if (!u10.s()) {
                this.f21302p.N(u10);
                Y(false);
                m0();
            }
            S0(n10);
            if (n10 != this.f21265F.f56236s) {
                h1 h1Var = this.f21265F;
                long j10 = n10;
                this.f21265F = e0(h1Var.f56219b, j10, h1Var.f56220c, j10, true, 5);
            }
        } else {
            long i10 = this.f21298l.i(u10 != this.f21302p.y());
            this.f21282Z = i10;
            long C10 = u10.C(i10);
            t0(this.f21265F.f56236s, C10);
            if (this.f21298l.s()) {
                boolean z10 = !this.f21266G.f21330d;
                h1 h1Var2 = this.f21265F;
                this.f21265F = e0(h1Var2.f56219b, C10, h1Var2.f56220c, C10, z10, 6);
            } else {
                this.f21265F.o(C10);
            }
        }
        this.f21265F.f56234q = this.f21302p.n().j();
        this.f21265F.f56235r = S();
        h1 h1Var3 = this.f21265F;
        if (h1Var3.f56229l && h1Var3.f56222e == 3 && Q1(h1Var3.f56218a, h1Var3.f56219b) && this.f21265F.f56232o.f24315a == 1.0f) {
            float a10 = this.f21306r.a(K(), this.f21265F.f56235r);
            if (this.f21298l.d().f24315a != a10) {
                m1(this.f21265F.f56232o.b(a10));
                c0(this.f21265F.f56232o, this.f21298l.d().f24315a, false, false);
            }
        }
    }

    @Override // F1.y
    public void e(long j10, long j11, androidx.media3.common.a aVar, MediaFormat mediaFormat) {
        if (this.f21263D) {
            this.f21289e.b(37).a();
        }
    }

    public final h1 e0(D.b bVar, long j10, long j11, long j12, boolean z10, int i10) {
        List list;
        m0 m0Var;
        G g10;
        this.f21303p1 = (!this.f21303p1 && j10 == this.f21265F.f56236s && bVar.equals(this.f21265F.f56219b)) ? false : true;
        R0();
        h1 h1Var = this.f21265F;
        m0 m0Var2 = h1Var.f56225h;
        G g11 = h1Var.f56226i;
        List list2 = h1Var.f56227j;
        if (this.f21305q.t()) {
            l u10 = this.f21302p.u();
            m0 o10 = u10 == null ? m0.f21830d : u10.o();
            G p10 = u10 == null ? this.f21284b : u10.p();
            List J10 = J(p10.selections);
            if (u10 != null) {
                R0 r02 = u10.f21364g;
                if (r02.f56125c != j11) {
                    u10.f21364g = r02.a(j11);
                }
            }
            v0();
            m0Var = o10;
            g10 = p10;
            list = J10;
        } else {
            if (!bVar.equals(this.f21265F.f56219b)) {
                m0Var2 = m0.f21830d;
                g11 = this.f21284b;
                list2 = AbstractC3445z.t();
            }
            list = list2;
            m0Var = m0Var2;
            g10 = g11;
        }
        if (z10) {
            this.f21266G.d(i10);
        }
        return this.f21265F.d(bVar, j10, j11, j12, S(), m0Var, g10, list);
    }

    public final long e1(D.b bVar, long j10, boolean z10, boolean z11) {
        U1();
        g2(false, true);
        if (z11 || this.f21265F.f56222e == 3) {
            G1(2);
        }
        l u10 = this.f21302p.u();
        l lVar = u10;
        while (lVar != null && !bVar.equals(lVar.f21364g.f56123a)) {
            lVar = lVar.k();
        }
        if (z10 || u10 != lVar || (lVar != null && lVar.D(j10) < 0)) {
            D();
            if (lVar != null) {
                while (this.f21302p.u() != lVar) {
                    this.f21302p.b();
                }
                this.f21302p.N(lVar);
                lVar.B(1000000000000L);
                G();
                lVar.f21365h = true;
            }
        }
        B();
        if (lVar != null) {
            this.f21302p.N(lVar);
            if (!lVar.f21362e) {
                lVar.f21364g = lVar.f21364g.b(j10);
            } else if (lVar.f21363f) {
                j10 = lVar.f21358a.k(j10);
                lVar.f21358a.v(j10 - this.f21296j, this.f21297k);
            }
            S0(j10);
            m0();
        } else {
            this.f21302p.g();
            S0(j10);
        }
        Y(false);
        this.f21289e.l(2);
        return j10;
    }

    public final void e2(AbstractC2346O abstractC2346O, D.b bVar, AbstractC2346O abstractC2346O2, D.b bVar2, long j10, boolean z10) {
        if (!Q1(abstractC2346O, bVar)) {
            C2340I c2340i = bVar.b() ? C2340I.f24312d : this.f21265F.f56232o;
            if (this.f21298l.d().equals(c2340i)) {
                return;
            }
            m1(c2340i);
            c0(this.f21265F.f56232o, c2340i.f24315a, false, false);
            return;
        }
        abstractC2346O.n(abstractC2346O.h(bVar.f21516a, this.f21295i).f24356c, this.f21294h);
        this.f21306r.d((z.g) Z.i(this.f21294h.f24386j));
        if (j10 != -9223372036854775807L) {
            this.f21306r.e(M(abstractC2346O, bVar.f21516a, j10));
            return;
        }
        if (!Objects.equals(!abstractC2346O2.q() ? abstractC2346O2.n(abstractC2346O2.h(bVar2.f21516a, this.f21295i).f24356c, this.f21294h).f24377a : null, this.f21294h.f24377a) || z10) {
            this.f21306r.e(-9223372036854775807L);
        }
    }

    @Override // androidx.media3.exoplayer.b.a
    public void f(float f10) {
        this.f21289e.l(34);
    }

    public final boolean f0() {
        l y10 = this.f21302p.y();
        if (!y10.f21362e) {
            return false;
        }
        int i10 = 0;
        while (true) {
            l1[] l1VarArr = this.renderers;
            if (i10 >= l1VarArr.length) {
                return true;
            }
            if (!l1VarArr[i10].o(y10)) {
                return false;
            }
            i10++;
        }
    }

    public final void f1(o oVar) {
        if (oVar.e() == -9223372036854775807L) {
            g1(oVar);
            return;
        }
        if (this.f21265F.f56218a.q()) {
            this.f21299m.add(new d(oVar));
            return;
        }
        d dVar = new d(oVar);
        AbstractC2346O abstractC2346O = this.f21265F.f56218a;
        if (!U0(dVar, abstractC2346O, abstractC2346O, this.f21273P, this.f21274R, this.f21294h, this.f21295i)) {
            oVar.j(false);
        } else {
            this.f21299m.add(dVar);
            Collections.sort(this.f21299m);
        }
    }

    @Override // androidx.media3.exoplayer.b.a
    public void g(int i10) {
        this.f21289e.i(33, i10, 0).a();
    }

    public final boolean g0() {
        if (this.f21309u) {
            return true;
        }
        return this.f21262C && this.f21260A.f56286g;
    }

    public final void g1(o oVar) {
        if (oVar.b() != this.f21291g) {
            this.f21289e.f(15, oVar).a();
            return;
        }
        A(oVar);
        int i10 = this.f21265F.f56222e;
        if (i10 == 3 || i10 == 2) {
            this.f21289e.l(2);
        }
    }

    public final void g2(boolean z10, boolean z11) {
        this.f21270K = z10;
        this.f21271L = (!z10 || z11) ? -9223372036854775807L : this.f21300n.b();
    }

    @Override // androidx.media3.exoplayer.o.a
    public void h(o oVar) {
        if (!this.f21267H && this.f21291g.getThread().isAlive()) {
            this.f21289e.f(14, oVar).a();
        } else {
            AbstractC4156x.i("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            oVar.j(false);
        }
    }

    public final void h1(final o oVar) {
        Looper b10 = oVar.b();
        if (b10.getThread().isAlive()) {
            this.f21300n.d(b10, null).j(new Runnable() { // from class: m1.K0
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.media3.exoplayer.i.o(androidx.media3.exoplayer.i.this, oVar);
                }
            });
        } else {
            AbstractC4156x.i("TAG", "Trying to send message on a dead thread.");
            oVar.j(false);
        }
    }

    public final boolean h2() {
        l y10 = this.f21302p.y();
        G p10 = y10.p();
        boolean z10 = true;
        int i10 = 0;
        while (true) {
            l1[] l1VarArr = this.renderers;
            if (i10 >= l1VarArr.length) {
                break;
            }
            int h10 = l1VarArr[i10].h();
            int J10 = this.renderers[i10].J(y10, p10, this.f21298l);
            if ((J10 & 2) != 0 && this.f21279W) {
                p1(false);
            }
            this.f21280X -= h10 - this.renderers[i10].h();
            z10 &= (J10 & 1) != 0;
            i10++;
        }
        if (z10) {
            for (int i11 = 0; i11 < this.renderers.length; i11++) {
                if (p10.c(i11) && !this.renderers[i11].x(y10)) {
                    F(y10, i11, false, y10.n());
                }
            }
        }
        return z10;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        int i10;
        D.b bVar;
        l y10;
        try {
            switch (message.what) {
                case 1:
                    boolean z10 = message.arg1 != 0;
                    int i11 = message.arg2;
                    s1(z10, i11 >> 4, true, i11 & 15);
                    break;
                case 2:
                    E();
                    break;
                case 3:
                    c1((h) message.obj, true);
                    break;
                case 4:
                    u1((C2340I) message.obj);
                    break;
                case 5:
                    C1((o1) message.obj);
                    break;
                case 6:
                    T1(false, true);
                    break;
                case 7:
                    K0((C4146m) message.obj);
                    return true;
                case 8:
                    b0((C) message.obj);
                    break;
                case 9:
                    W((C) message.obj);
                    break;
                case 10:
                    O0();
                    break;
                case 11:
                    x1(message.arg1);
                    break;
                case 12:
                    E1(message.arg1 != 0);
                    break;
                case 13:
                    l1(message.arg1 != 0, (C4146m) message.obj);
                    break;
                case 14:
                    f1((o) message.obj);
                    break;
                case 15:
                    h1((o) message.obj);
                    break;
                case 16:
                    d0((C2340I) message.obj, false);
                    break;
                case 17:
                    n1((b) message.obj);
                    break;
                case 18:
                    t((b) message.obj, message.arg1);
                    break;
                case 19:
                    android.support.v4.media.session.b.a(message.obj);
                    C0(null);
                    break;
                case 20:
                    M0(message.arg1, message.arg2, (e0) message.obj);
                    break;
                case 21:
                    F1((e0) message.obj);
                    break;
                case 22:
                    B0();
                    break;
                case 23:
                    q1(message.arg1 != 0);
                    break;
                case 24:
                default:
                    return false;
                case 25:
                    y();
                    break;
                case 26:
                    P0();
                    break;
                case 27:
                    X1(message.arg1, message.arg2, (List) message.obj);
                    break;
                case 28:
                    v1((ExoPlayer.c) message.obj);
                    break;
                case 29:
                    I0();
                    break;
                case 30:
                    Pair pair = (Pair) message.obj;
                    J1(pair.first, (C4146m) pair.second);
                    break;
                case 31:
                    k1((C2350d) message.obj, message.arg1 != 0);
                    break;
                case 32:
                    L1(((Float) message.obj).floatValue());
                    break;
                case 33:
                    U(message.arg1);
                    break;
                case 34:
                    V();
                    break;
                case 35:
                    H1((y) message.obj);
                    break;
                case 36:
                    z1(((Boolean) message.obj).booleanValue());
                    break;
                case 37:
                    this.f21263D = false;
                    h hVar = this.f21264E;
                    if (hVar != null) {
                        c1(hVar, false);
                        this.f21264E = null;
                        break;
                    }
                    break;
                case 38:
                    B1((n1) message.obj);
                    break;
            }
        } catch (C2201b e10) {
            X(e10, RtcEngineEvent.EvtType.EVT_MEDIA_ENGINE_LOAD_SUCCESS);
        } catch (C2338G e11) {
            int i12 = e11.f24302b;
            if (i12 == 1) {
                r2 = e11.f24301a ? 3001 : 3003;
            } else if (i12 == 4) {
                r2 = e11.f24301a ? 3002 : 3004;
            }
            X(e11, r2);
        } catch (C4415k e12) {
            X(e12, e12.f47548a);
        } catch (IOException e13) {
            X(e13, 2000);
        } catch (RuntimeException e14) {
            I f10 = I.f(e14, ((e14 instanceof IllegalStateException) || (e14 instanceof IllegalArgumentException)) ? 1004 : 1000);
            AbstractC4156x.e("ExoPlayerImplInternal", "Playback error", f10);
            T1(true, false);
            this.f21265F = this.f21265F.f(f10);
        } catch (I e15) {
            e = e15;
            if (e.f56098j == 1 && (y10 = this.f21302p.y()) != null && e.f56103o == null) {
                e = e.c(y10.f21364g.f56123a);
            }
            if (e.f56098j == 1 && (bVar = e.f56103o) != null && j0(e.f56100l, bVar)) {
                this.f21304p2 = true;
                B();
                l x10 = this.f21302p.x();
                l u10 = this.f21302p.u();
                if (this.f21302p.u() != x10) {
                    while (u10 != null && u10.k() != x10) {
                        u10 = u10.k();
                    }
                }
                this.f21302p.N(u10);
                if (this.f21265F.f56222e != 4) {
                    m0();
                    this.f21289e.l(2);
                }
            } else {
                I i13 = this.f21313x1;
                if (i13 != null) {
                    i13.addSuppressed(e);
                    e = this.f21313x1;
                }
                if (e.f56098j == 1 && this.f21302p.u() != this.f21302p.y()) {
                    while (this.f21302p.u() != this.f21302p.y()) {
                        this.f21302p.b();
                    }
                    l lVar = (l) AbstractC4134a.e(this.f21302p.u());
                    p0();
                    R0 r02 = lVar.f21364g;
                    D.b bVar2 = r02.f56123a;
                    long j10 = r02.f56124b;
                    this.f21265F = e0(bVar2, j10, r02.f56125c, j10, true, 0);
                }
                if (e.f56104p && (this.f21313x1 == null || (i10 = e.f24309a) == 5004 || i10 == 5003)) {
                    AbstractC4156x.j("ExoPlayerImplInternal", "Recoverable renderer error", e);
                    if (this.f21313x1 == null) {
                        this.f21313x1 = e;
                    }
                    InterfaceC4152t interfaceC4152t = this.f21289e;
                    interfaceC4152t.d(interfaceC4152t.f(25, e));
                } else {
                    AbstractC4156x.e("ExoPlayerImplInternal", "Playback error", e);
                    T1(true, false);
                    this.f21265F = this.f21265F.f(e);
                }
            }
        } catch (InterfaceC6104m.a e16) {
            X(e16, e16.f63330a);
        }
        p0();
        return true;
    }

    @Override // androidx.media3.exoplayer.source.C.a
    public void i(C c10) {
        this.f21289e.f(8, c10).a();
    }

    public final boolean i0(l lVar) {
        return (lVar == null || lVar.r() || lVar.l() == Long.MIN_VALUE) ? false : true;
    }

    public final void i1(long j10) {
        for (l1 l1Var : this.renderers) {
            l1Var.N(j10);
        }
    }

    public final void i2(float f10) {
        for (l u10 = this.f21302p.u(); u10 != null; u10 = u10.k()) {
            for (androidx.media3.exoplayer.trackselection.y yVar : u10.p().selections) {
                if (yVar != null) {
                    yVar.i(f10);
                }
            }
        }
    }

    public final boolean j0(int i10, D.b bVar) {
        if (this.f21302p.x() == null || !this.f21302p.x().f21364g.f56123a.equals(bVar)) {
            return false;
        }
        return this.renderers[i10].v(this.f21302p.x());
    }

    public void j1(C2350d c2350d, boolean z10) {
        this.f21289e.e(31, z10 ? 1 : 0, 0, c2350d).a();
    }

    public final boolean k0() {
        l u10 = this.f21302p.u();
        long j10 = u10.f21364g.f56127e;
        if (u10.f21362e) {
            return j10 == -9223372036854775807L || this.f21265F.f56236s < j10 || !O1();
        }
        return false;
    }

    public final void k1(C2350d c2350d, boolean z10) {
        this.f21283a.l(c2350d);
        androidx.media3.exoplayer.b bVar = this.f21315y;
        if (!z10) {
            c2350d = null;
        }
        bVar.k(c2350d);
        a2();
    }

    public final void l1(boolean z10, C4146m c4146m) {
        if (this.f21275T != z10) {
            this.f21275T = z10;
            if (!z10) {
                for (l1 l1Var : this.renderers) {
                    l1Var.L();
                }
            }
        }
        if (c4146m != null) {
            c4146m.f();
        }
    }

    public final void m0() {
        boolean N12 = N1();
        this.f21272O = N12;
        if (N12) {
            l lVar = (l) AbstractC4134a.e(this.f21302p.n());
            lVar.e(new k.b().f(lVar.C(this.f21282Z)).g(this.f21298l.d().f24315a).e(this.f21271L).d());
        }
        V1();
    }

    public final void m1(C2340I c2340i) {
        this.f21289e.n(16);
        this.f21298l.e(c2340i);
    }

    public final void n0() {
        this.f21302p.I();
        l w10 = this.f21302p.w();
        if (w10 != null) {
            if ((!w10.f21361d || w10.f21362e) && !w10.f21358a.e()) {
                if (this.f21287c.f(this.f21265F.f56218a, w10.f21364g.f56123a, w10.f21362e ? w10.f21358a.g() : 0L)) {
                    if (w10.f21361d) {
                        w10.e(new k.b().f(w10.C(this.f21282Z)).g(this.f21298l.d().f24315a).e(this.f21271L).d());
                    } else {
                        w10.v(this, w10.f21364g.f56124b);
                    }
                }
            }
        }
    }

    public final void n1(b bVar) {
        this.f21266G.b(1);
        if (bVar.f21321c != -1) {
            this.f21281Y = new h(new j1(bVar.f21319a, bVar.f21320b), bVar.f21321c, bVar.f21322d);
        }
        a0(this.f21305q.B(bVar.f21319a, bVar.f21320b), false);
    }

    public final void o0() {
        for (l1 l1Var : this.renderers) {
            l1Var.D();
        }
    }

    public void o1(List list, int i10, long j10, e0 e0Var) {
        this.f21289e.f(17, new b(list, e0Var, i10, j10, null)).a();
    }

    public final void p0() {
        this.f21266G.c(this.f21265F);
        if (this.f21266G.f21327a) {
            this.f21301o.a(this.f21266G);
            this.f21266G = new e(this.f21265F);
        }
    }

    public final void p1(boolean z10) {
        if (z10 == this.f21279W) {
            return;
        }
        this.f21279W = z10;
        if (z10 || !this.f21265F.f56233p) {
            return;
        }
        this.f21289e.l(2);
    }

    public final void q0() {
        l x10 = this.f21302p.x();
        if (x10 == null) {
            return;
        }
        G p10 = x10.p();
        for (int i10 = 0; i10 < this.renderers.length; i10++) {
            if (p10.c(i10) && this.renderers[i10].s() && !this.renderers[i10].u()) {
                this.renderers[i10].X();
                F(x10, i10, false, x10.n());
            }
        }
        if (x()) {
            this.f21293g2 = x10.f21358a.n();
            if (x10.s()) {
                return;
            }
            this.f21302p.N(x10);
            Y(false);
            m0();
        }
    }

    public final void q1(boolean z10) {
        this.f21268I = z10;
        R0();
        if (!this.f21269J || this.f21302p.y() == this.f21302p.u()) {
            return;
        }
        b1(true);
        Y(false);
    }

    public final void r0(int i10) {
        l1 l1Var = this.renderers[i10];
        try {
            l1Var.G((l) AbstractC4134a.e(this.f21302p.u()));
        } catch (IOException | RuntimeException e10) {
            int m10 = l1Var.m();
            if (m10 != 3 && m10 != 5) {
                throw e10;
            }
            G p10 = this.f21302p.u().p();
            AbstractC4156x.e("ExoPlayerImplInternal", "Disabling track due to error: " + androidx.media3.common.a.h(p10.selections[i10].r()), e10);
            G g10 = new G((k1[]) p10.rendererConfigurations.clone(), (androidx.media3.exoplayer.trackselection.y[]) p10.selections.clone(), p10.f21914b, p10.f21915c);
            g10.rendererConfigurations[i10] = null;
            g10.selections[i10] = null;
            C(i10);
            this.f21302p.u().a(g10, this.f21265F.f56236s, false);
        }
    }

    public void r1(boolean z10, int i10, int i11) {
        this.f21289e.i(1, z10 ? 1 : 0, i10 | (i11 << 4)).a();
    }

    public final void s0(final int i10, final boolean z10) {
        boolean[] zArr = this.rendererReportedReady;
        if (zArr[i10] != z10) {
            zArr[i10] = z10;
            this.f21311w.j(new Runnable() { // from class: m1.J0
                @Override // java.lang.Runnable
                public final void run() {
                    r0.f21310v.l0(r1, androidx.media3.exoplayer.i.this.renderers[i10].m(), z10);
                }
            });
        }
    }

    public final void s1(boolean z10, int i10, boolean z11, int i11) {
        this.f21266G.b(z11 ? 1 : 0);
        b2(z10, i10, i11);
    }

    public final void t(b bVar, int i10) {
        this.f21266G.b(1);
        n nVar = this.f21305q;
        if (i10 == -1) {
            i10 = nVar.r();
        }
        a0(nVar.f(i10, bVar.f21319a, bVar.f21320b), false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x0079, code lost:
    
        r3 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t0(long j10, long j11) {
        d dVar;
        if (this.f21299m.isEmpty() || this.f21265F.f56219b.b()) {
            return;
        }
        if (this.f21303p1) {
            j10--;
            this.f21303p1 = false;
        }
        h1 h1Var = this.f21265F;
        int b10 = h1Var.f56218a.b(h1Var.f56219b.f21516a);
        int min = Math.min(this.f21292g1, this.f21299m.size());
        d dVar2 = min > 0 ? (d) this.f21299m.get(min - 1) : null;
        while (dVar2 != null) {
            int i10 = dVar2.f21324b;
            if (i10 <= b10 && (i10 != b10 || dVar2.f21325c <= j10)) {
                break;
            }
            int i11 = min - 1;
            dVar2 = i11 > 0 ? (d) this.f21299m.get(min - 2) : null;
            min = i11;
        }
        if (min < this.f21299m.size()) {
            dVar = (d) this.f21299m.get(min);
            while (dVar != null && dVar.f21326d != null) {
                int i12 = dVar.f21324b;
                if (i12 >= b10 && (i12 != b10 || dVar.f21325c > j10)) {
                    break;
                }
                min++;
                if (min < this.f21299m.size()) {
                    dVar = (d) this.f21299m.get(min);
                }
            }
            while (dVar != null && dVar.f21326d != null && dVar.f21324b == b10) {
                long j12 = dVar.f21325c;
                if (j12 <= j10 || j12 > j11) {
                    break;
                }
                try {
                    g1(dVar.f21323a);
                    if (dVar.f21323a.a() || dVar.f21323a.i()) {
                        this.f21299m.remove(min);
                    } else {
                        min++;
                    }
                    dVar = min < this.f21299m.size() ? (d) this.f21299m.get(min) : null;
                } catch (Throwable th2) {
                    if (dVar.f21323a.a() || dVar.f21323a.i()) {
                        this.f21299m.remove(min);
                    }
                    throw th2;
                }
            }
            this.f21292g1 = min;
            return;
        }
        dVar = null;
    }

    public void t1(C2340I c2340i) {
        this.f21289e.f(4, c2340i).a();
    }

    @Override // androidx.media3.exoplayer.f.a
    public void u(C2340I c2340i) {
        this.f21289e.f(16, c2340i).a();
    }

    public final boolean u0() {
        R0 t10;
        this.f21302p.K(this.f21282Z);
        boolean z10 = false;
        if (this.f21302p.T() && (t10 = this.f21302p.t(this.f21282Z, this.f21265F)) != null) {
            l h10 = this.f21302p.h(t10);
            if (!h10.f21361d) {
                h10.v(this, t10.f56124b);
            } else if (h10.f21362e) {
                this.f21289e.f(8, h10.f21358a).a();
            }
            if (this.f21302p.u() == h10) {
                S0(t10.f56124b);
            }
            Y(false);
            z10 = true;
        }
        if (!this.f21272O) {
            m0();
            return z10;
        }
        this.f21272O = i0(this.f21302p.n());
        V1();
        return z10;
    }

    public final void u1(C2340I c2340i) {
        m1(c2340i);
        d0(this.f21298l.d(), true);
    }

    public final void v() {
        G p10 = this.f21302p.u().p();
        for (int i10 = 0; i10 < this.renderers.length; i10++) {
            if (p10.c(i10)) {
                this.renderers[i10].f();
            }
        }
    }

    public final void v0() {
        l u10;
        boolean z10;
        if (this.f21302p.u() == this.f21302p.y() && (u10 = this.f21302p.u()) != null) {
            G p10 = u10.p();
            boolean z11 = false;
            int i10 = 0;
            boolean z12 = false;
            while (true) {
                if (i10 >= this.renderers.length) {
                    z10 = true;
                    break;
                }
                if (p10.c(i10)) {
                    if (this.renderers[i10].m() != 1) {
                        z10 = false;
                        break;
                    } else if (p10.rendererConfigurations[i10].f56266a != 0) {
                        z12 = true;
                    }
                }
                i10++;
            }
            if (z12 && z10) {
                z11 = true;
            }
            p1(z11);
        }
    }

    public final void v1(ExoPlayer.c cVar) {
        this.f21278V1 = cVar;
        this.f21302p.V(this.f21265F.f56218a, cVar);
    }

    public final void w() {
        for (l1 l1Var : this.renderers) {
            l1Var.R(this.f21262C ? this.f21260A : null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void w0() {
        boolean z10;
        boolean z11 = false;
        while (M1()) {
            if (z11) {
                p0();
            }
            this.f21304p2 = false;
            l lVar = (l) AbstractC4134a.e(this.f21302p.b());
            if (this.f21265F.f56219b.f21516a.equals(lVar.f21364g.f56123a.f21516a)) {
                D.b bVar = this.f21265F.f56219b;
                if (bVar.f21517b == -1) {
                    D.b bVar2 = lVar.f21364g.f56123a;
                    if (bVar2.f21517b == -1 && bVar.f21520e != bVar2.f21520e) {
                        z10 = true;
                        R0 r02 = lVar.f21364g;
                        D.b bVar3 = r02.f56123a;
                        long j10 = r02.f56124b;
                        this.f21265F = e0(bVar3, j10, r02.f56125c, j10, !z10, 0);
                        R0();
                        d2();
                        if (x() && lVar == this.f21302p.x()) {
                            o0();
                        }
                        if (this.f21265F.f56222e != 3) {
                            R1();
                        }
                        v();
                        z11 = true;
                    }
                }
            }
            z10 = false;
            R0 r022 = lVar.f21364g;
            D.b bVar32 = r022.f56123a;
            long j102 = r022.f56124b;
            this.f21265F = e0(bVar32, j102, r022.f56125c, j102, !z10, 0);
            R0();
            d2();
            if (x()) {
                o0();
            }
            if (this.f21265F.f56222e != 3) {
            }
            v();
            z11 = true;
        }
    }

    public void w1(int i10) {
        this.f21289e.i(11, i10, 0).a();
    }

    public final boolean x() {
        if (!this.f21312x) {
            return false;
        }
        for (l1 l1Var : this.renderers) {
            if (l1Var.u()) {
                return true;
            }
        }
        return false;
    }

    public final void x0(boolean z10) {
        if (this.f21278V1.f20891a == -9223372036854775807L) {
            return;
        }
        if (z10 || !this.f21265F.f56218a.equals(this.f21286b2)) {
            AbstractC2346O abstractC2346O = this.f21265F.f56218a;
            this.f21286b2 = abstractC2346O;
            this.f21302p.B(abstractC2346O);
        }
        n0();
    }

    public final void x1(int i10) {
        this.f21273P = i10;
        int X10 = this.f21302p.X(this.f21265F.f56218a, i10);
        if ((X10 & 1) != 0) {
            b1(true);
        } else if ((X10 & 2) != 0) {
            B();
        }
        Y(false);
    }

    public final void y() {
        P0();
    }

    public final void y0() {
        l x10;
        if (this.f21269J || !this.f21312x || this.f21304p2 || x() || (x10 = this.f21302p.x()) == null || x10 != this.f21302p.y() || x10.k() == null || !x10.k().f21362e) {
            return;
        }
        this.f21302p.c();
        q0();
    }

    public void y1(boolean z10) {
        this.f21289e.f(36, Boolean.valueOf(z10)).a();
    }

    public final l z(R0 r02, long j10) {
        return new l(this.rendererCapabilities, j10, this.f21283a, this.f21287c.d(), this.f21305q, r02, this.f21284b, this.f21278V1.f20891a);
    }

    public final void z0() {
        l y10 = this.f21302p.y();
        if (y10 == null) {
            return;
        }
        int i10 = 0;
        if (y10.k() == null || this.f21269J) {
            if (y10.f21364g.f56132j || this.f21269J) {
                l1[] l1VarArr = this.renderers;
                int length = l1VarArr.length;
                while (i10 < length) {
                    l1 l1Var = l1VarArr[i10];
                    if (l1Var.x(y10) && l1Var.r(y10)) {
                        long j10 = y10.f21364g.f56127e;
                        l1Var.O(y10, (j10 == -9223372036854775807L || j10 == Long.MIN_VALUE) ? -9223372036854775807L : y10.m() + y10.f21364g.f56127e);
                    }
                    i10++;
                }
                return;
            }
            return;
        }
        if (f0()) {
            if (x() && this.f21302p.x() == this.f21302p.y()) {
                return;
            }
            if (y10.k().f21362e || this.f21282Z >= y10.k().n()) {
                G p10 = y10.p();
                l d10 = this.f21302p.d();
                G p11 = d10.p();
                AbstractC2346O abstractC2346O = this.f21265F.f56218a;
                e2(abstractC2346O, d10.f21364g.f56123a, abstractC2346O, y10.f21364g.f56123a, -9223372036854775807L, false);
                if (d10.f21362e && ((this.f21312x && this.f21293g2 != -9223372036854775807L) || d10.f21358a.n() != -9223372036854775807L)) {
                    this.f21293g2 = -9223372036854775807L;
                    boolean z10 = this.f21312x && !this.f21304p2;
                    if (z10) {
                        int i11 = 0;
                        while (true) {
                            if (i11 < this.renderers.length) {
                                if (p11.c(i11) && this.renderers[i11].m() != -2 && !AbstractC2335D.a(p11.selections[i11].r().f20543o, p11.selections[i11].r().f20539k) && !this.renderers[i11].u()) {
                                    z10 = false;
                                    break;
                                }
                                i11++;
                            } else {
                                break;
                            }
                        }
                    }
                    if (!z10) {
                        i1(d10.n());
                        if (d10.s()) {
                            return;
                        }
                        this.f21302p.N(d10);
                        Y(false);
                        m0();
                        return;
                    }
                }
                l1[] l1VarArr2 = this.renderers;
                int length2 = l1VarArr2.length;
                while (i10 < length2) {
                    l1VarArr2[i10].F(p10, p11, d10.n());
                    i10++;
                }
            }
        }
    }

    public final void z1(boolean z10) {
        if (!z10) {
            this.f21263D = false;
            this.f21289e.n(37);
            h hVar = this.f21264E;
            if (hVar != null) {
                c1(hVar, false);
                this.f21264E = null;
            }
        }
        this.f21262C = z10;
        w();
    }
}
