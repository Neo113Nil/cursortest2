package u0;

import S0.InterfaceC3967k;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.core.view.C5331n;
import androidx.core.view.C5353y0;
import c1.C5710a;
import c1.C5721l;
import c1.InterfaceC5704H;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;

/* loaded from: classes8.dex */
public final class M {

    /* renamed from: x, reason: collision with root package name */
    @NotNull
    private static final WeakHashMap<View, M> f99614x = new WeakHashMap<>();

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f99615y = 0;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C9892a f99616a = a.a(4, "captionBar");

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C9892a f99617b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C9892a f99618c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C9892a f99619d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final C9892a f99620e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final C9892a f99621f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final C9892a f99622g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final C9892a f99623h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final C9892a f99624i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final I f99625j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final J f99626k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final J f99627l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final J f99628m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private final I f99629n;

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    private final I f99630o;

    /* renamed from: p, reason: collision with root package name */
    @NotNull
    private final I f99631p;

    /* renamed from: q, reason: collision with root package name */
    @NotNull
    private final I f99632q;

    /* renamed from: r, reason: collision with root package name */
    @NotNull
    private final I f99633r;

    /* renamed from: s, reason: collision with root package name */
    @NotNull
    private final I f99634s;

    /* renamed from: t, reason: collision with root package name */
    @NotNull
    private final I f99635t;

    /* renamed from: u, reason: collision with root package name */
    private final boolean f99636u;

    /* renamed from: v, reason: collision with root package name */
    private int f99637v;

    /* renamed from: w, reason: collision with root package name */
    @NotNull
    private final RunnableC9906o f99638w;

    public static final class a {
        public static final C9892a a(int i11, String str) {
            int i12 = M.f99615y;
            return new C9892a(i11, str);
        }

        public static final I b(int i11, String str) {
            int i12 = M.f99615y;
            return new I(new r(0, 0, 0, 0), str);
        }

        @NotNull
        public static M c(InterfaceC3967k interfaceC3967k) {
            M m11;
            View view = (View) interfaceC3967k.m(AndroidCompositionLocals_androidKt.h());
            synchronized (M.f99614x) {
                try {
                    WeakHashMap weakHashMap = M.f99614x;
                    Object obj = weakHashMap.get(view);
                    if (obj == null) {
                        obj = new M(view);
                        weakHashMap.put(view, obj);
                    }
                    m11 = (M) obj;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            boolean F11 = interfaceC3967k.F(m11) | interfaceC3967k.F(view);
            Object C11 = interfaceC3967k.C();
            if (F11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new L(m11, view);
                interfaceC3967k.x(C11);
            }
            S0.Q.c(m11, (Function1) C11, interfaceC3967k);
            return m11;
        }
    }

    public M(View view) {
        C9892a a11 = a.a(UserVerificationMethods.USER_VERIFY_PATTERN, "displayCutout");
        this.f99617b = a11;
        C9892a a12 = a.a(8, "ime");
        this.f99618c = a12;
        C9892a a13 = a.a(32, "mandatorySystemGestures");
        this.f99619d = a13;
        this.f99620e = a.a(2, "navigationBars");
        this.f99621f = a.a(1, "statusBars");
        C9892a a14 = a.a(7, "systemBars");
        this.f99622g = a14;
        C9892a a15 = a.a(16, "systemGestures");
        this.f99623h = a15;
        C9892a a16 = a.a(64, "tappableElement");
        this.f99624i = a16;
        I i11 = new I(new r(0, 0, 0, 0), "waterfall");
        this.f99625j = i11;
        G g10 = new G(new G(a14, a12), a11);
        this.f99626k = g10;
        G g11 = new G(new G(new G(a16, a13), a15), i11);
        this.f99627l = g11;
        this.f99628m = new G(g10, g11);
        this.f99629n = a.b(4, "captionBarIgnoringVisibility");
        this.f99630o = a.b(2, "navigationBarsIgnoringVisibility");
        this.f99631p = a.b(1, "statusBarsIgnoringVisibility");
        this.f99632q = a.b(7, "systemBarsIgnoringVisibility");
        this.f99633r = a.b(64, "tappableElementIgnoringVisibility");
        this.f99634s = a.b(8, "imeAnimationTarget");
        this.f99635t = a.b(8, "imeAnimationSource");
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        Object tag = view2 != null ? view2.getTag(R.id.consume_window_insets_tag) : null;
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        this.f99636u = bool != null ? bool.booleanValue() : true;
        this.f99638w = new RunnableC9906o(this);
    }

    public static void k(M m11, C5353y0 c5353y0) {
        AtomicReference atomicReference;
        boolean z11 = false;
        m11.f99616a.g(c5353y0, 0);
        m11.f99618c.g(c5353y0, 0);
        m11.f99617b.g(c5353y0, 0);
        m11.f99620e.g(c5353y0, 0);
        m11.f99621f.g(c5353y0, 0);
        m11.f99622g.g(c5353y0, 0);
        m11.f99623h.g(c5353y0, 0);
        m11.f99624i.g(c5353y0, 0);
        m11.f99619d.g(c5353y0, 0);
        m11.f99629n.f(Y.b(c5353y0.g(4)));
        m11.f99630o.f(Y.b(c5353y0.g(2)));
        m11.f99631p.f(Y.b(c5353y0.g(1)));
        m11.f99632q.f(Y.b(c5353y0.g(7)));
        m11.f99633r.f(Y.b(c5353y0.g(64)));
        C5331n e11 = c5353y0.e();
        if (e11 != null) {
            m11.f99625j.f(Y.b(e11.e()));
        }
        synchronized (C5721l.D()) {
            atomicReference = C5721l.f56259j;
            androidx.collection.M<InterfaceC5704H> D11 = ((C5710a) atomicReference.get()).D();
            if (D11 != null) {
                if (D11.c()) {
                    z11 = true;
                }
            }
        }
        if (z11) {
            C5721l.b();
        }
    }

    public final void b(@NotNull View view) {
        int i11 = this.f99637v - 1;
        this.f99637v = i11;
        if (i11 == 0) {
            androidx.core.view.Y.J(view, null);
            androidx.core.view.Y.Q(view, null);
            view.removeOnAttachStateChangeListener(this.f99638w);
        }
    }

    public final boolean c() {
        return this.f99636u;
    }

    @NotNull
    public final C9892a d() {
        return this.f99618c;
    }

    @NotNull
    public final C9892a e() {
        return this.f99620e;
    }

    @NotNull
    public final J f() {
        return this.f99628m;
    }

    @NotNull
    public final J g() {
        return this.f99626k;
    }

    @NotNull
    public final C9892a h() {
        return this.f99621f;
    }

    @NotNull
    public final C9892a i() {
        return this.f99622g;
    }

    public final void j(@NotNull View view) {
        if (this.f99637v == 0) {
            RunnableC9906o runnableC9906o = this.f99638w;
            androidx.core.view.Y.J(view, runnableC9906o);
            if (view.isAttachedToWindow()) {
                view.requestApplyInsets();
            }
            view.addOnAttachStateChangeListener(runnableC9906o);
            androidx.core.view.Y.Q(view, runnableC9906o);
        }
        this.f99637v++;
    }

    public final void l(@NotNull C5353y0 c5353y0) {
        this.f99635t.f(Y.b(c5353y0.f(8)));
    }

    public final void m(@NotNull C5353y0 c5353y0) {
        this.f99634s.f(Y.b(c5353y0.f(8)));
    }
}
