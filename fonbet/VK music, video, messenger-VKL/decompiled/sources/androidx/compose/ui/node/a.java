package androidx.compose.ui.node;

import android.os.SystemClock;
import android.view.MotionEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.node.b;
import androidx.compose.ui.node.p;
import androidx.compose.ui.unit.LayoutDirection;
import com.unity3d.services.UnityAdsConstants;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import xsna.a730;
import xsna.a9e0;
import xsna.azl;
import xsna.b730;
import xsna.be;
import xsna.bmb0;
import xsna.ca80;
import xsna.ck;
import xsna.cmb0;
import xsna.cwr;
import xsna.dgi0;
import xsna.dp10;
import xsna.emb0;
import xsna.ep10;
import xsna.fdi;
import xsna.fgi0;
import xsna.fmb0;
import xsna.fy5;
import xsna.gy5;
import xsna.gzs;
import xsna.in8;
import xsna.itl;
import xsna.j680;
import xsna.jwr;
import xsna.kgp;
import xsna.kio;
import xsna.kvr;
import xsna.l590;
import xsna.li90;
import xsna.lio;
import xsna.loy;
import xsna.lvr;
import xsna.m490;
import xsna.mi90;
import xsna.mio;
import xsna.noy;
import xsna.o1u;
import xsna.oho;
import xsna.ony;
import xsna.owr;
import xsna.ph50;
import xsna.plb0;
import xsna.pli;
import xsna.q630;
import xsna.s3q0;
import xsna.sgi0;
import xsna.t590;
import xsna.ta80;
import xsna.tgi0;
import xsna.tny;
import xsna.toy;
import xsna.ttf0;
import xsna.twr;
import xsna.uwr;
import xsna.uzw;
import xsna.x630;
import xsna.xfi0;
import xsna.xlb0;
import xsna.xwr;
import xsna.xzs;
import xsna.y630;
import xsna.z630;
import xsna.zo10;
import xsna.zox;

/* compiled from: BackwardsCompatNode.kt */
/* loaded from: classes11.dex */
public final class a extends q630.c implements noy, lio, fgi0, cmb0, a730, mi90, ony, o1u, lvr, owr, uwr, l590, in8 {
    public q630.b p;
    public boolean q;
    public fy5 r;
    public HashSet<x630<?>> s;
    public tny t;

    /* compiled from: BackwardsCompatNode.kt */
    /* renamed from: androidx.compose.ui.node.a$a, reason: collision with other inner class name */
    public static final class C0014a extends Lambda implements gzs<s3q0> {
        public C0014a() {
            super(0);
        }

        @Override // xsna.gzs
        public final s3q0 invoke() {
            a.this.k2();
            return s3q0.a;
        }
    }

    /* compiled from: BackwardsCompatNode.kt */
    public static final class b implements p.a {
        public b() {
        }

        @Override // androidx.compose.ui.node.p.a
        public final void h() {
            a aVar = a.this;
            if (aVar.t == null) {
                aVar.s0(itl.d(aVar, 4194304));
            }
        }
    }

    /* compiled from: BackwardsCompatNode.kt */
    public static final class c extends Lambda implements gzs<s3q0> {
        public c() {
            super(0);
        }

        @Override // xsna.gzs
        public final s3q0 invoke() {
            ((y630) a.this.p).h();
            return s3q0.a;
        }
    }

    @Override // xsna.lvr
    public final void D(xwr xwrVar) {
        q630.b bVar = this.p;
        if (!(bVar instanceof kvr)) {
            uzw.b("onFocusEvent called on wrong node");
        }
        ((kvr) bVar).m();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0122 A[ORIG_RETURN, RETURN] */
    @Override // xsna.cmb0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void H(plb0 plb0Var, PointerEventPass pointerEventPass, long j) {
        boolean z;
        boolean z2;
        boolean z3;
        emb0.b p = ((bmb0) this.p).p();
        emb0 emb0Var = emb0.this;
        List<xlb0> list = plb0Var.a;
        List<xlb0> list2 = list;
        int size = list2.size();
        for (int i = 0; i < size; i++) {
            xlb0 xlb0Var = list.get(i);
            if (fdi.m(xlb0Var) || fdi.o(xlb0Var)) {
                z = false;
                break;
            }
        }
        z = true;
        if (z) {
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (!list.get(i2).c()) {
                }
            }
            z2 = true;
            if (!emb0Var.c) {
                int size3 = list2.size();
                int i3 = 0;
                while (true) {
                    if (i3 < size3) {
                        xlb0 xlb0Var2 = list.get(i3);
                        if (fdi.m(xlb0Var2) || fdi.o(xlb0Var2)) {
                            break;
                        } else {
                            i3++;
                        }
                    } else if (!z2) {
                        z3 = false;
                    }
                }
            }
            z3 = true;
            if (p.b != emb0.a.NotDispatching) {
                if (pointerEventPass == PointerEventPass.Initial && z3) {
                    p.c = plb0Var;
                    p.g(plb0Var, !z || emb0Var.c);
                }
                if (pointerEventPass == PointerEventPass.Main && z && plb0Var.equals(p.c) && emb0Var.c) {
                    int size4 = list2.size();
                    for (int i4 = 0; i4 < size4; i4++) {
                        list.get(i4).a();
                    }
                }
                if (pointerEventPass == PointerEventPass.Final && !z3 && !plb0Var.equals(p.c)) {
                    p.g(plb0Var, true);
                }
            }
            if (pointerEventPass != PointerEventPass.Final) {
                int size5 = list2.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size5) {
                        p.b = emb0.a.Unknown;
                        emb0Var.c = false;
                        p.c = null;
                        break;
                    } else if (!fdi.o(list.get(i5))) {
                        break;
                    } else {
                        i5++;
                    }
                }
                if (plb0Var.equals(p.c) && z) {
                    int size6 = list2.size();
                    int i6 = 0;
                    while (true) {
                        if (i6 >= size6) {
                            break;
                        }
                        if (!list.get(i6).c()) {
                            i6++;
                        } else if (!emb0Var.c) {
                            p.j(plb0Var);
                            return;
                        }
                    }
                    int size7 = list2.size();
                    for (int i7 = 0; i7 < size7; i7++) {
                        list.get(i7).a();
                    }
                    return;
                }
                return;
            }
            return;
        }
        z2 = false;
        if (!emb0Var.c) {
        }
        z3 = true;
        if (p.b != emb0.a.NotDispatching) {
        }
        if (pointerEventPass != PointerEventPass.Final) {
        }
    }

    @Override // xsna.cmb0
    public final void K() {
        ((bmb0) this.p).p().getClass();
    }

    @Override // xsna.mi90
    public final Object N(azl azlVar, Object obj) {
        return ((li90) this.p).n();
    }

    @Override // xsna.cmb0
    public final boolean R1() {
        ((bmb0) this.p).p().getClass();
        return true;
    }

    @Override // xsna.o1u
    public final void T1(o oVar) {
        ((j680) this.p).o(oVar);
    }

    @Override // xsna.a730
    public final be U0() {
        fy5 fy5Var = this.r;
        return fy5Var != null ? fy5Var : kgp.b;
    }

    @Override // xsna.q630.c
    public final void a2() {
        i2(true);
    }

    @Override // xsna.q630.c
    public final void b2() {
        j2();
    }

    @Override // xsna.noy
    public final dp10 c(ep10 ep10Var, zo10 zo10Var, long j) {
        return ((loy) this.p).c(ep10Var, zo10Var, j);
    }

    @Override // xsna.in8
    public final long d() {
        return pli.w(itl.d(this, 128).d);
    }

    @Override // xsna.l590
    public final boolean d1() {
        return this.o;
    }

    @Override // xsna.ony, xsna.lp10
    public final void e(long j) {
        q630.b bVar = this.p;
        if (bVar instanceof ta80) {
            ((ta80) bVar).e(j);
        }
    }

    @Override // xsna.owr
    public final void f1(jwr jwrVar) {
        q630.b bVar = this.p;
        if (!(bVar instanceof cwr)) {
            uzw.b("applyFocusProperties called on wrong node");
        }
        ((cwr) bVar).q();
    }

    @Override // xsna.in8
    public final azl getDensity() {
        return itl.f(this).z;
    }

    @Override // xsna.in8
    public final LayoutDirection getLayoutDirection() {
        return itl.f(this).A;
    }

    @Override // xsna.cmb0
    public final void h1() {
        emb0.b p = ((bmb0) this.p).p();
        emb0 emb0Var = emb0.this;
        if (p.b == emb0.a.Dispatching) {
            long uptimeMillis = SystemClock.uptimeMillis();
            fmb0 fmb0Var = new fmb0(emb0Var);
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0);
            obtain.setSource(0);
            fmb0Var.invoke(obtain);
            obtain.recycle();
            p.b = emb0.a.Unknown;
            emb0Var.c = false;
            p.c = null;
        }
    }

    @Override // xsna.lio
    public final void i1() {
        this.q = true;
        mio.a(this);
    }

    public final void i2(boolean z) {
        if (!this.o) {
            uzw.b("initializeModifier called on unattached node");
        }
        q630.b bVar = this.p;
        if ((this.d & 32) != 0) {
            if (bVar instanceof y630) {
                itl.g(this).q(new C0014a());
            }
            if (bVar instanceof b730) {
                b730<?> b730Var = (b730) bVar;
                fy5 fy5Var = this.r;
                if (fy5Var == null || !fy5Var.K(b730Var.getKey())) {
                    fy5 fy5Var2 = new fy5();
                    fy5Var2.b = b730Var;
                    this.r = fy5Var2;
                    b.C0015b c0015b = androidx.compose.ui.node.b.a;
                    if (itl.f(this).G.e.p) {
                        z630 modifierLocalManager = itl.g(this).getModifierLocalManager();
                        a9e0<?> key = b730Var.getKey();
                        modifierLocalManager.b.b(this);
                        modifierLocalManager.c.b(key);
                        modifierLocalManager.a();
                    }
                } else {
                    fy5Var.b = b730Var;
                    z630 modifierLocalManager2 = itl.g(this).getModifierLocalManager();
                    a9e0<?> key2 = b730Var.getKey();
                    modifierLocalManager2.b.b(this);
                    modifierLocalManager2.c.b(key2);
                    modifierLocalManager2.a();
                }
            }
        }
        if ((this.d & 4) != 0) {
            if (bVar instanceof oho) {
                this.q = true;
            }
            if (!z) {
                itl.d(this, 2).P1();
            }
        }
        if ((this.d & 2) != 0) {
            b.C0015b c0015b2 = androidx.compose.ui.node.b.a;
            if (itl.f(this).G.e.p) {
                o oVar = this.i;
                ((d) oVar).n2(this);
                m490 m490Var = oVar.P;
                if (m490Var != null) {
                    m490Var.invalidate();
                }
            }
            if (!z) {
                itl.d(this, 2).P1();
                itl.f(this).Q();
            }
        }
        if (bVar instanceof ttf0) {
            ((ttf0) bVar).f(itl.f(this));
        }
        if ((this.d & 128) != 0 && (bVar instanceof ta80)) {
            b.C0015b c0015b3 = androidx.compose.ui.node.b.a;
            if (itl.f(this).G.e.p) {
                itl.f(this).Q();
            }
        }
        if ((4194304 & this.d) != 0 && (bVar instanceof ca80)) {
            this.t = null;
            b.C0015b c0015b4 = androidx.compose.ui.node.b.a;
            if (itl.f(this).G.e.p) {
                itl.g(this).f(new b());
            }
        }
        if ((this.d & 256) != 0 && (bVar instanceof j680)) {
            b.C0015b c0015b5 = androidx.compose.ui.node.b.a;
            if (itl.f(this).G.e.p) {
                itl.f(this).Q();
            }
        }
        if (bVar instanceof twr) {
            ((twr) bVar).i().a.b(this);
        }
        if ((this.d & 16) != 0 && (bVar instanceof bmb0)) {
            ((bmb0) bVar).p().a = this.i;
        }
        if ((this.d & 8) != 0) {
            itl.g(this).v();
        }
    }

    public final void j2() {
        if (!this.o) {
            uzw.b("unInitializeModifier called on unattached node");
        }
        q630.b bVar = this.p;
        if ((this.d & 32) != 0) {
            if (bVar instanceof b730) {
                z630 modifierLocalManager = itl.g(this).getModifierLocalManager();
                a9e0 key = ((b730) bVar).getKey();
                modifierLocalManager.d.b(itl.f(this));
                modifierLocalManager.e.b(key);
                modifierLocalManager.a();
            }
            if (bVar instanceof y630) {
                b.C0015b c0015b = androidx.compose.ui.node.b.a;
                ((y630) bVar).h();
            }
        }
        if ((this.d & 8) != 0) {
            itl.g(this).v();
        }
        if (bVar instanceof twr) {
            ((twr) bVar).i().a.j(this);
        }
    }

    @Override // xsna.noy
    public final int k(f fVar, zox zoxVar, int i) {
        return ((loy) this.p).k(fVar, zoxVar, i);
    }

    public final void k2() {
        if (this.o) {
            this.s.clear();
            t590 snapshotObserver = itl.g(this).getSnapshotObserver();
            snapshotObserver.a.d(this, androidx.compose.ui.node.b.b, new c());
        }
    }

    @Override // xsna.fgi0
    public final void l1(tgi0 tgi0Var) {
        int i;
        xfi0 d = ((dgi0) this.p).d();
        xfi0 xfi0Var = (xfi0) tgi0Var;
        ph50<sgi0<?>, Object> ph50Var = xfi0Var.b;
        if (d.d) {
            xfi0Var.d = true;
        }
        if (d.e) {
            xfi0Var.e = true;
        }
        ph50<sgi0<?>, Object> ph50Var2 = d.b;
        Object[] objArr = ph50Var2.b;
        Object[] objArr2 = ph50Var2.c;
        long[] jArr = ph50Var2.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j = jArr[i2];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8;
                int i4 = 8 - ((~(i2 - length)) >>> 31);
                int i5 = 0;
                while (i5 < i4) {
                    if ((255 & j) < 128) {
                        int i6 = (i2 << 3) + i5;
                        Object obj = objArr[i6];
                        Object obj2 = objArr2[i6];
                        sgi0<?> sgi0Var = (sgi0) obj;
                        if (!ph50Var.a(sgi0Var)) {
                            ph50Var.p(sgi0Var, obj2);
                        } else if (obj2 instanceof ck) {
                            ck ckVar = (ck) ph50Var.d(sgi0Var);
                            i = i3;
                            String str = ckVar.a;
                            if (str == null) {
                                str = ((ck) obj2).a;
                            }
                            xzs xzsVar = ckVar.b;
                            if (xzsVar == null) {
                                xzsVar = ((ck) obj2).b;
                            }
                            ph50Var.p(sgi0Var, new ck(str, xzsVar));
                            j >>= i;
                            i5++;
                            i3 = i;
                        }
                    }
                    i = i3;
                    j >>= i;
                    i5++;
                    i3 = i;
                }
                if (i4 != i3) {
                    return;
                }
            }
            if (i2 == length) {
                return;
            } else {
                i2++;
            }
        }
    }

    @Override // xsna.htl, xsna.cmb0
    public final void q() {
        if (this.p instanceof bmb0) {
            h1();
        }
    }

    @Override // xsna.ony
    public final void s0(tny tnyVar) {
        this.t = tnyVar;
        q630.b bVar = this.p;
        if (bVar instanceof ca80) {
            ((ca80) bVar).l();
        }
    }

    public final String toString() {
        return this.p.toString();
    }

    @Override // xsna.lio
    public final void v(toy toyVar) {
        q630.b bVar = this.p;
        kio kioVar = (kio) bVar;
        if (this.q && (bVar instanceof oho)) {
            if (bVar != null) {
                t590 snapshotObserver = itl.g(this).getSnapshotObserver();
                snapshotObserver.a.d(this, androidx.compose.ui.node.b.a, new gy5(bVar, this));
            }
            this.q = false;
        }
        kioVar.v(toyVar);
    }

    @Override // xsna.noy
    public final int w(f fVar, zox zoxVar, int i) {
        return ((loy) this.p).w(fVar, zoxVar, i);
    }

    @Override // xsna.noy
    public final int x(f fVar, zox zoxVar, int i) {
        return ((loy) this.p).x(fVar, zoxVar, i);
    }

    @Override // xsna.noy
    public final int y(f fVar, zox zoxVar, int i) {
        return ((loy) this.p).y(fVar, zoxVar, i);
    }
}
