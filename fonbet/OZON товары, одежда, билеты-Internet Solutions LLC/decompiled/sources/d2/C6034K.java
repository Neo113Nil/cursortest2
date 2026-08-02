package d2;

import Bl0.C2652m;
import S0.A1;
import S0.AbstractC3984t;
import S0.C3969l;
import S0.C3991w0;
import S0.D1;
import S0.InterfaceC3967k;
import S0.J0;
import S0.n1;
import a1.C4912a;
import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import androidx.compose.ui.platform.AbstractC5228a;
import androidx.lifecycle.C0;
import androidx.lifecycle.D0;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.UUID;
import k1.C7459e;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;

@SuppressLint({"ViewConstructor"})
/* renamed from: d2.K, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C6034K extends AbstractC5228a {

    /* renamed from: s, reason: collision with root package name */
    @NotNull
    private static final Function1<C6034K, Unit> f60999s = a.f61018b;

    /* renamed from: a, reason: collision with root package name */
    private Function0<Unit> f61000a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private C6041S f61001b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final View f61002c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC6037N f61003d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final WindowManager f61004e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final WindowManager.LayoutParams f61005f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private InterfaceC6040Q f61006g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private Z1.s f61007h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final C3991w0 f61008i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final C3991w0 f61009j;

    /* renamed from: k, reason: collision with root package name */
    private Z1.o f61010k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final A1 f61011l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final Rect f61012m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private final c1.y f61013n;

    /* renamed from: o, reason: collision with root package name */
    private Object f61014o;

    /* renamed from: p, reason: collision with root package name */
    @NotNull
    private final C3991w0 f61015p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f61016q;

    /* renamed from: r, reason: collision with root package name */
    @NotNull
    private final int[] f61017r;

    /* renamed from: d2.K$a */
    static final class a extends AbstractC7737t implements Function1<C6034K, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f61018b = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(C6034K c6034k) {
            C6034K c6034k2 = c6034k;
            if (c6034k2.isAttachedToWindow()) {
                c6034k2.p();
            }
            return Unit.f71690a;
        }
    }

    /* renamed from: d2.K$b */
    static final class b extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f61020c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i11) {
            super(2);
            this.f61020c = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            num.intValue();
            int e11 = C2652m.e(this.f61020c | 1);
            C6034K.this.Content(interfaceC3967k, e11);
            return Unit.f71690a;
        }
    }

    /* renamed from: d2.K$c */
    public /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f61021a;

        static {
            int[] iArr = new int[Z1.s.values().length];
            try {
                iArr[Z1.s.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Z1.s.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f61021a = iArr;
        }
    }

    /* renamed from: d2.K$d */
    static final class d extends AbstractC7737t implements Function0<Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.L f61022b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C6034K f61023c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Z1.o f61024d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f61025e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f61026f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(kotlin.jvm.internal.L l11, C6034K c6034k, Z1.o oVar, long j11, long j12) {
            super(0);
            this.f61022b = l11;
            this.f61023c = c6034k;
            this.f61024d = oVar;
            this.f61025e = j11;
            this.f61026f = j12;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            C6034K c6034k = this.f61023c;
            InterfaceC6040Q f7 = c6034k.f();
            Z1.s d11 = c6034k.d();
            this.f61022b.f71786a = f7.mo6calculatePositionllwVHH4(this.f61024d, this.f61025e, d11, this.f61026f);
            return Unit.f71690a;
        }
    }

    public C6034K() {
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6034K(Function0 function0, C6041S c6041s, View view, Z1.d dVar, InterfaceC6040Q interfaceC6040Q, UUID uuid) {
        super(view.getContext(), null, 0, 6, null);
        C3991w0 f7;
        C3991w0 f11;
        C3991w0 f12;
        InterfaceC6037N c6038o = Build.VERSION.SDK_INT >= 29 ? new C6038O() : new C6039P();
        this.f61000a = function0;
        this.f61001b = c6041s;
        this.f61002c = view;
        this.f61003d = c6038o;
        Object systemService = view.getContext().getSystemService("window");
        Intrinsics.g(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.f61004e = (WindowManager) systemService;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        layoutParams.flags = C6054l.b(this.f61001b, C6054l.c(view));
        layoutParams.type = 1002;
        layoutParams.token = view.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(view.getContext().getResources().getString(R.string.default_popup_window_title));
        this.f61005f = layoutParams;
        this.f61006g = interfaceC6040Q;
        this.f61007h = Z1.s.Ltr;
        f7 = n1.f(null, D1.f25195a);
        this.f61008i = f7;
        f11 = n1.f(null, D1.f25195a);
        this.f61009j = f11;
        this.f61011l = n1.e(new C6035L(this));
        this.f61012m = new Rect();
        this.f61013n = new c1.y(new C6036M(this));
        setId(android.R.id.content);
        C0.b(this, C0.a(view));
        D0.b(this, D0.a(view));
        M4.f.b(this, M4.f.a(view));
        setTag(R.id.compose_view_saveable_id_tag, "Popup:" + uuid);
        setClipChildren(false);
        setElevation(dVar.v1((float) 8));
        setOutlineProvider(new C6033J());
        f12 = n1.f(C6028E.f60979a, D1.f25195a);
        this.f61015p = f12;
        this.f61017r = new int[2];
    }

    public static final B1.B a(C6034K c6034k) {
        return (B1.B) c6034k.f61009j.getValue();
    }

    @Override // androidx.compose.ui.platform.AbstractC5228a
    public final void Content(InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C3969l u11 = interfaceC3967k.u(-857613600);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(this) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 3) == 2 && u11.b()) {
            u11.j();
        } else {
            ((Function2) this.f61015p.getValue()).invoke(u11, 0);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new b(i11));
        }
    }

    public final void b() {
        C0.b(this, null);
        this.f61004e.removeViewImmediate(this);
    }

    public final boolean c() {
        return ((Boolean) this.f61011l.getValue()).booleanValue();
    }

    @NotNull
    public final Z1.s d() {
        return this.f61007h;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(@NotNull KeyEvent keyEvent) {
        KeyEvent.DispatcherState keyDispatcherState;
        if (keyEvent.getKeyCode() == 4 && this.f61001b.a()) {
            if (getKeyDispatcherState() == null) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                }
                return true;
            }
            if (keyEvent.getAction() == 1 && (keyDispatcherState = getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent) && !keyEvent.isCanceled()) {
                Function0<Unit> function0 = this.f61000a;
                if (function0 != null) {
                    function0.invoke();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Z1.q e() {
        return (Z1.q) this.f61008i.getValue();
    }

    @NotNull
    public final InterfaceC6040Q f() {
        return this.f61006g;
    }

    public final void g() {
        int[] iArr = this.f61017r;
        int i11 = iArr[0];
        int i12 = iArr[1];
        this.f61002c.getLocationOnScreen(iArr);
        if (i11 == iArr[0] && i12 == iArr[1]) {
            return;
        }
        n();
    }

    @Override // androidx.compose.ui.platform.AbstractC5228a
    /* renamed from: getShouldCreateCompositionOnAttachedToWindow */
    protected final boolean getF40614b() {
        return this.f61016q;
    }

    public final void h(@NotNull AbstractC3984t abstractC3984t, @NotNull C4912a c4912a) {
        setParentCompositionContext(abstractC3984t);
        this.f61015p.setValue(c4912a);
        this.f61016q = true;
    }

    public final void i(@NotNull Z1.s sVar) {
        this.f61007h = sVar;
    }

    @Override // androidx.compose.ui.platform.AbstractC5228a
    public final void internalOnLayout$ui_release(boolean z11, int i11, int i12, int i13, int i14) {
        super.internalOnLayout$ui_release(z11, i11, i12, i13, i14);
        this.f61001b.getClass();
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        WindowManager.LayoutParams layoutParams = this.f61005f;
        layoutParams.width = childAt.getMeasuredWidth();
        layoutParams.height = childAt.getMeasuredHeight();
        ((C6039P) this.f61003d).getClass();
        this.f61004e.updateViewLayout(this, layoutParams);
    }

    @Override // androidx.compose.ui.platform.AbstractC5228a
    public final void internalOnMeasure$ui_release(int i11, int i12) {
        this.f61001b.getClass();
        super.internalOnMeasure$ui_release(View.MeasureSpec.makeMeasureSpec(Math.round(getContext().getResources().getConfiguration().screenWidthDp * getContext().getResources().getDisplayMetrics().density), LinearLayoutManager.INVALID_OFFSET), View.MeasureSpec.makeMeasureSpec(Math.round(getContext().getResources().getConfiguration().screenHeightDp * getContext().getResources().getDisplayMetrics().density), LinearLayoutManager.INVALID_OFFSET));
    }

    public final void j(Z1.q qVar) {
        this.f61008i.setValue(qVar);
    }

    public final void k(@NotNull InterfaceC6040Q interfaceC6040Q) {
        this.f61006g = interfaceC6040Q;
    }

    public final void l() {
        this.f61004e.addView(this, this.f61005f);
    }

    public final void m(Function0 function0, @NotNull C6041S c6041s, @NotNull Z1.s sVar) {
        this.f61000a = function0;
        if (!Intrinsics.d(this.f61001b, c6041s)) {
            c6041s.getClass();
            WindowManager.LayoutParams layoutParams = this.f61005f;
            this.f61001b = c6041s;
            layoutParams.flags = C6054l.b(c6041s, C6054l.c(this.f61002c));
            ((C6039P) this.f61003d).getClass();
            this.f61004e.updateViewLayout(this, layoutParams);
        }
        int i11 = c.f61021a[sVar.ordinal()];
        int i12 = 1;
        if (i11 == 1) {
            i12 = 0;
        } else if (i11 != 2) {
            throw new Sc.o();
        }
        super.setLayoutDirection(i12);
    }

    public final void n() {
        B1.B b11 = (B1.B) this.f61009j.getValue();
        if (b11 != null) {
            if (!b11.I()) {
                b11 = null;
            }
            if (b11 == null) {
                return;
            }
            long a11 = b11.a();
            long u11 = b11.u(0L);
            Z1.o a12 = Z1.p.a(Z1.n.a(Math.round(C7459e.g(u11)), Math.round(C7459e.h(u11))), a11);
            if (a12.equals(this.f61010k)) {
                return;
            }
            this.f61010k = a12;
            p();
        }
    }

    public final void o(@NotNull B1.B b11) {
        this.f61009j.setValue(b11);
        n();
    }

    @Override // androidx.compose.ui.platform.AbstractC5228a, android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f61013n.l();
        if (!this.f61001b.a() || Build.VERSION.SDK_INT < 33) {
            return;
        }
        if (this.f61014o == null) {
            this.f61014o = C6026C.a(this.f61000a);
        }
        C6026C.b(this, this.f61014o);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c1.y yVar = this.f61013n;
        yVar.m();
        yVar.h();
        if (Build.VERSION.SDK_INT >= 33) {
            C6026C.c(this, this.f61014o);
        }
        this.f61014o = null;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f61001b.b()) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && (motionEvent.getX() < 0.0f || motionEvent.getX() >= getWidth() || motionEvent.getY() < 0.0f || motionEvent.getY() >= getHeight())) {
            Function0<Unit> function0 = this.f61000a;
            if (function0 != null) {
                function0.invoke();
                return true;
            }
        } else {
            if (motionEvent == null || motionEvent.getAction() != 4) {
                return super.onTouchEvent(motionEvent);
            }
            Function0<Unit> function02 = this.f61000a;
            if (function02 != null) {
                function02.invoke();
            }
        }
        return true;
    }

    public final void p() {
        Z1.q e11;
        Z1.o oVar = this.f61010k;
        if (oVar == null || (e11 = e()) == null) {
            return;
        }
        long e12 = e11.e();
        InterfaceC6037N interfaceC6037N = this.f61003d;
        ((C6039P) interfaceC6037N).getClass();
        View view = this.f61002c;
        Rect rect = this.f61012m;
        view.getWindowVisibleDisplayFrame(rect);
        int i11 = C6054l.f61056b;
        Z1.o oVar2 = new Z1.o(rect.left, rect.top, rect.right, rect.bottom);
        long a11 = Z1.r.a(oVar2.i(), oVar2.d());
        kotlin.jvm.internal.L l11 = new kotlin.jvm.internal.L();
        l11.f71786a = 0L;
        this.f61013n.k(this, f60999s, new d(l11, this, oVar, a11, e12));
        WindowManager.LayoutParams layoutParams = this.f61005f;
        long j11 = l11.f71786a;
        layoutParams.x = (int) (j11 >> 32);
        layoutParams.y = (int) (j11 & 4294967295L);
        if (this.f61001b.c()) {
            interfaceC6037N.a(this, (int) (a11 >> 32), (int) (a11 & 4294967295L));
        }
        this.f61004e.updateViewLayout(this, layoutParams);
    }

    @Override // android.view.View
    public final void setLayoutDirection(int i11) {
    }
}
