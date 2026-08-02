package androidx.compose.ui.node;

import V.g;
import X.h;
import androidx.compose.ui.node.LayoutNode;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final LayoutNode f17617a;

    /* renamed from: b, reason: collision with root package name */
    public LayoutNode.e f17618b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f17619c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f17620d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f17621e;

    /* renamed from: f, reason: collision with root package name */
    public int f17622f;

    /* renamed from: g, reason: collision with root package name */
    public final a f17623g;

    public final class a extends g implements X.b {

        /* renamed from: k, reason: collision with root package name */
        public boolean f17629k;

        /* renamed from: o, reason: collision with root package name */
        public boolean f17633o;

        /* renamed from: p, reason: collision with root package name */
        public float f17634p;

        /* renamed from: f, reason: collision with root package name */
        public int f17624f = Integer.MAX_VALUE;

        /* renamed from: g, reason: collision with root package name */
        public int f17625g = Integer.MAX_VALUE;

        /* renamed from: h, reason: collision with root package name */
        public LayoutNode.g f17626h = LayoutNode.g.NotUsed;

        /* renamed from: i, reason: collision with root package name */
        public long f17627i = e0.g.f45452a.a();

        /* renamed from: j, reason: collision with root package name */
        public boolean f17628j = true;

        /* renamed from: l, reason: collision with root package name */
        public final X.a f17630l = new h(this);

        /* renamed from: m, reason: collision with root package name */
        public final C.a f17631m = new C.a(new a[16], 0);

        /* renamed from: n, reason: collision with root package name */
        public boolean f17632n = true;

        /* renamed from: androidx.compose.ui.node.b$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0348a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;
            public static final /* synthetic */ int[] $EnumSwitchMapping$1;

            static {
                int[] iArr = new int[LayoutNode.e.values().length];
                try {
                    iArr[LayoutNode.e.Measuring.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[LayoutNode.e.LayingOut.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
                int[] iArr2 = new int[LayoutNode.g.values().length];
                try {
                    iArr2[LayoutNode.g.InMeasureBlock.ordinal()] = 1;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr2[LayoutNode.g.InLayoutBlock.ordinal()] = 2;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$1 = iArr2;
            }
        }

        public a() {
        }

        public final boolean j() {
            return this.f17633o;
        }

        public final int k() {
            return this.f17625g;
        }

        public final float l() {
            return this.f17634p;
        }

        public final void m(boolean z10) {
            LayoutNode t10;
            LayoutNode t11 = b.this.f17617a.t();
            LayoutNode.g intrinsicsUsageByParent = b.this.f17617a.getIntrinsicsUsageByParent();
            if (t11 == null || intrinsicsUsageByParent == LayoutNode.g.NotUsed) {
                return;
            }
            while (t11.getIntrinsicsUsageByParent() == intrinsicsUsageByParent && (t10 = t11.t()) != null) {
                t11 = t10;
            }
            int i10 = C0348a.$EnumSwitchMapping$1[intrinsicsUsageByParent.ordinal()];
            if (i10 == 1) {
                LayoutNode.H(t11, z10, false, 2, null);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("Intrinsics isn't used by the parent");
                }
                t11.E(z10);
            }
        }

        public boolean n() {
            return this.f17629k;
        }

        public final void o() {
            C.a y10;
            int l10;
            if (b.this.b() <= 0 || (l10 = (y10 = b.this.f17617a.y()).l()) <= 0) {
                return;
            }
            Object[] k10 = y10.k();
            int i10 = 0;
            do {
                LayoutNode layoutNode = (LayoutNode) k10[i10];
                b layoutDelegate = layoutNode.getLayoutDelegate();
                if ((layoutDelegate.d() || layoutDelegate.c()) && !layoutDelegate.f()) {
                    LayoutNode.F(layoutNode, false, 1, null);
                }
                layoutDelegate.h().o();
                i10++;
            } while (i10 < l10);
        }

        public final void p(boolean z10) {
            this.f17632n = z10;
        }
    }

    public b(LayoutNode layoutNode) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        this.f17617a = layoutNode;
        this.f17618b = LayoutNode.e.Idle;
        this.f17623g = new a();
    }

    public final int b() {
        return this.f17622f;
    }

    public final boolean c() {
        return this.f17621e;
    }

    public final boolean d() {
        return this.f17620d;
    }

    public final int e() {
        return this.f17623g.g();
    }

    public final boolean f() {
        return this.f17619c;
    }

    public final LayoutNode.e g() {
        return this.f17618b;
    }

    public final a h() {
        return this.f17623g;
    }

    public final int i() {
        return this.f17623g.i();
    }

    public final void j() {
        this.f17623g.p(true);
    }

    public final void k() {
        LayoutNode.e l10 = this.f17617a.l();
        if (l10 == LayoutNode.e.LayingOut || l10 == LayoutNode.e.LookaheadLayingOut) {
            if (this.f17623g.j()) {
                n(true);
            } else {
                m(true);
            }
        }
        if (l10 == LayoutNode.e.LookaheadLayingOut) {
            m(true);
        }
    }

    public final void l(int i10) {
        int i11 = this.f17622f;
        this.f17622f = i10;
        if ((i11 == 0) != (i10 == 0)) {
            LayoutNode t10 = this.f17617a.t();
            b layoutDelegate = t10 != null ? t10.getLayoutDelegate() : null;
            if (layoutDelegate != null) {
                if (i10 == 0) {
                    layoutDelegate.l(layoutDelegate.f17622f - 1);
                } else {
                    layoutDelegate.l(layoutDelegate.f17622f + 1);
                }
            }
        }
    }

    public final void m(boolean z10) {
        if (this.f17621e != z10) {
            this.f17621e = z10;
            if (z10 && !this.f17620d) {
                l(this.f17622f + 1);
            } else {
                if (z10 || this.f17620d) {
                    return;
                }
                l(this.f17622f - 1);
            }
        }
    }

    public final void n(boolean z10) {
        if (this.f17620d != z10) {
            this.f17620d = z10;
            if (z10 && !this.f17621e) {
                l(this.f17622f + 1);
            } else {
                if (z10 || this.f17621e) {
                    return;
                }
                l(this.f17622f - 1);
            }
        }
    }
}
