package pd;

import androidx.lifecycle.k1;
import androidx.lifecycle.p0;
import hg.d1;
import hg.u0;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import okio.Segment;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class x extends k1 {

    /* renamed from: b, reason: collision with root package name */
    public final b f21805b = new b(((int) (Runtime.getRuntime().maxMemory() / Segment.SHARE_MINIMUM)) / 8, 2);

    /* renamed from: c, reason: collision with root package name */
    public final d1 f21806c;

    /* renamed from: d, reason: collision with root package name */
    public final p0 f21807d;

    /* renamed from: e, reason: collision with root package name */
    public final gf.t f21808e;

    /* renamed from: f, reason: collision with root package name */
    public final gf.t f21809f;

    /* renamed from: g, reason: collision with root package name */
    public final gf.t f21810g;

    /* renamed from: h, reason: collision with root package name */
    public final gf.t f21811h;

    /* renamed from: i, reason: collision with root package name */
    public final gf.t f21812i;
    public final gf.t j;

    /* renamed from: k, reason: collision with root package name */
    public final gf.t f21813k;

    /* renamed from: l, reason: collision with root package name */
    public final gf.t f21814l;

    /* renamed from: m, reason: collision with root package name */
    public final gf.t f21815m;

    /* renamed from: n, reason: collision with root package name */
    public final gf.t f21816n;

    /* renamed from: o, reason: collision with root package name */
    public final gf.t f21817o;

    /* renamed from: p, reason: collision with root package name */
    public final gf.t f21818p;
    public boolean q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f21819r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f21820s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f21821t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f21822u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f21823v;

    /* renamed from: w, reason: collision with root package name */
    public final int f21824w;

    /* renamed from: x, reason: collision with root package name */
    public int f21825x;

    public x() {
        kotlin.collections.e0 e0Var = kotlin.collections.e0.f19204a;
        this.f21806c = u0.b(e0Var);
        this.f21807d = new p0(e0Var);
        this.f21808e = gf.k.b(new id.a(28));
        this.f21809f = gf.k.b(new v(1));
        this.f21810g = gf.k.b(new v(2));
        this.f21811h = gf.k.b(new v(3));
        this.f21812i = gf.k.b(new v(4));
        this.j = gf.k.b(new v(5));
        this.f21813k = gf.k.b(new v(6));
        this.f21814l = gf.k.b(new v(7));
        this.f21815m = gf.k.b(new id.a(29));
        final int i5 = 0;
        this.f21816n = gf.k.b(new v(0));
        this.f21817o = gf.k.b(new Function0(this) { // from class: pd.w

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x f21804b;

            {
                this.f21804b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i5) {
                    case 0:
                        return kotlin.collections.t.c((ve.u0) this.f21804b.f21813k.getValue());
                    default:
                        return kotlin.collections.t.c((ve.u0) this.f21804b.f21814l.getValue());
                }
            }
        });
        final int i10 = 1;
        this.f21818p = gf.k.b(new Function0(this) { // from class: pd.w

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x f21804b;

            {
                this.f21804b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return kotlin.collections.t.c((ve.u0) this.f21804b.f21813k.getValue());
                    default:
                        return kotlin.collections.t.c((ve.u0) this.f21804b.f21814l.getValue());
                }
            }
        });
        this.f21823v = true;
        this.f21824w = 1;
        this.f21825x = 0;
    }

    @Override // androidx.lifecycle.k1
    public final void d() {
        this.f21805b.evictAll();
    }

    public final void e(boolean z5) {
        this.f21807d.h(kotlin.collections.t.c(z5 ? (ve.u0) this.f21809f.getValue() : (ve.u0) this.f21808e.getValue()));
    }

    public final void f() {
        ve.u0 u0Var = this.f21822u ? (ve.u0) this.f21811h.getValue() : null;
        ve.u0 u0Var2 = this.f21821t ? (ve.u0) this.f21810g.getValue() : null;
        ve.u0 u0Var3 = this.f21820s ? (ve.u0) this.f21812i.getValue() : null;
        ve.u0 u0Var4 = this.f21823v ? (ve.u0) this.j.getValue() : null;
        ve.u0 u0Var5 = this.q ? this.f21819r ? (ve.u0) this.f21815m.getValue() : (ve.u0) this.f21816n.getValue() : null;
        ArrayList arrayList = new ArrayList();
        if (u0Var4 != null) {
            arrayList.add(u0Var4);
        }
        if (u0Var2 != null) {
            arrayList.add(u0Var2);
        }
        if (u0Var != null) {
            arrayList.add(u0Var);
        }
        if (u0Var5 != null) {
            arrayList.add(u0Var5);
        }
        if (u0Var3 != null) {
            arrayList.add(u0Var3);
        }
        this.f21807d.h(CollectionsKt.W(arrayList));
    }

    public final void g(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
        this.f21820s = false;
        if (bool != null) {
            this.f21821t = bool.booleanValue();
        }
        this.f21822u = bool4.booleanValue();
        if (bool2 != null) {
            this.q = bool2.booleanValue();
        }
        if (bool3 != null) {
            this.f21819r = !bool3.booleanValue();
        }
    }
}
