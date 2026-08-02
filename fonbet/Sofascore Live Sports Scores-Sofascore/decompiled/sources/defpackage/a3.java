package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Trace;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.sofascore.results.R;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class a3 extends ViewGroup {
    public static final /* synthetic */ int j = 0;
    public WeakReference a;
    public IBinder b;
    public xll c;
    public mg3 d;
    public lf3 e;
    public Function0 f;
    public boolean g;
    public boolean h;
    public boolean i;

    public a3(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setClipChildren(false);
        setClipToPadding(false);
        setImportantForAccessibility(1);
        y00 y00Var = new y00(this, 8);
        addOnAttachStateChangeListener(y00Var);
        fsk fskVar = new fsk(this);
        qha.C(this).a.add(fskVar);
        this.f = new nm3(1, this, y00Var, fskVar);
    }

    private final void setParentContext(mg3 mg3Var) {
        if (this.d != mg3Var) {
            this.d = mg3Var;
            if (mg3Var != null) {
                this.a = null;
            }
            xll xllVar = this.c;
            if (xllVar != null) {
                xllVar.d();
                this.c = null;
                if (isAttachedToWindow()) {
                    f();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.b != iBinder) {
            this.b = iBinder;
            this.a = null;
        }
    }

    public abstract void a(int i, of3 of3Var);

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        c();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams) {
        c();
        return super.addViewInLayout(view, i, layoutParams);
    }

    public final void b() {
        if (isAttachedToWindow()) {
            setPreviousAttachedWindowToken(getWindowToken());
            if (this.e == null) {
                xy xyVar = null;
                if (getChildCount() != 0) {
                    View childAt = getChildAt(0);
                    if (childAt instanceof xy) {
                        xyVar = (xy) childAt;
                    }
                }
                if (xyVar != null) {
                    xyVar.setComposeViewContext(k(o1j.x(this), xyVar.getComposeViewContext()));
                }
            }
            if (getShouldCreateCompositionOnAttachedToWindow()) {
                f();
            }
        }
    }

    public final void c() {
        if (this.h) {
            return;
        }
        throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
    }

    public final void d() {
        lf3 lf3Var;
        if (this.d != null || isAttachedToWindow() || ((lf3Var = this.e) != null && lf3Var.a.isAttachedToWindow())) {
            f();
        } else {
            a70.r("createComposition requires a previous call to createComposition(ComposeViewContext), a parent reference, or the View to be attached to a window. Attach the View or call setParentCompositionReference.");
        }
    }

    public final void e() {
        View childAt = getChildAt(0);
        xy xyVar = childAt instanceof xy ? (xy) childAt : null;
        if (xyVar != null && xyVar.J0) {
            xyVar.getComposeViewContext().b();
            xyVar.J0 = false;
        }
        xll xllVar = this.c;
        if (xllVar != null) {
            xllVar.d();
        }
        this.c = null;
        requestLayout();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f() {
        if (this.c == null) {
            boolean z = false;
            Object[] objArr = 0;
            try {
                this.h = true;
                Trace.beginSection("Compose:initializeView");
                try {
                    lf3 lf3Var = this.e;
                    if (lf3Var == null) {
                        lf3Var = i();
                    }
                    this.c = aml.a(this, lf3Var, new tc3(1003123809, new z2(this, objArr == true ? 1 : 0), true));
                    Unit unit = Unit.a;
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            } finally {
                this.h = false;
            }
        }
    }

    public void g(int i, int i2, int i3, int i4, boolean z) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i3 - i) - getPaddingRight(), (i4 - i2) - getPaddingBottom());
        }
    }

    /* renamed from: getAutoClearFocusBehavior-4UtRPd4, reason: not valid java name */
    public final int m0getAutoClearFocusBehavior4UtRPd4() {
        Object tag = getTag(R.id.auto_clear_focus_behavior_tag);
        bq0 bq0Var = tag instanceof bq0 ? (bq0) tag : null;
        if (bq0Var != null) {
            return bq0Var.a;
        }
        return 1;
    }

    @Nullable
    public final lf3 getComposeViewContext$ui() {
        return this.e;
    }

    public final boolean getHasComposition() {
        return this.c != null;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.g;
    }

    public void h(int i, int i2) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i, i2);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i2) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i2)));
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + childAt.getMeasuredWidth(), getPaddingBottom() + getPaddingTop() + childAt.getMeasuredHeight());
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final lf3 i() {
        lf3 composeViewContext;
        lf3 A;
        ttk ttkVar;
        if (getChildCount() != 0) {
            View childAt = getChildAt(0);
            xy xyVar = childAt instanceof xy ? (xy) childAt : null;
            if (xyVar != null) {
                composeViewContext = xyVar.getComposeViewContext();
                View x = o1j.x(this);
                A = o1j.A(x);
                if (A == null) {
                    return k(x, A);
                }
                mg3 j2 = j();
                u6b w = qha.w(x);
                if (w == null) {
                    w = composeViewContext != null ? composeViewContext.c : null;
                    if (w == null) {
                        a70.r("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
                        return null;
                    }
                }
                u6b u6bVar = w;
                qqg q = rha.q(x);
                if (q == null) {
                    q = composeViewContext != null ? composeViewContext.d : null;
                    if (q == null) {
                        a70.r("Composed into the View which doesn't propagate ViewTreeSavedStateRegistryOwner!");
                        return null;
                    }
                }
                qqg qqgVar = q;
                ttk u = sha.u(x);
                if (u == null) {
                    ttkVar = composeViewContext != null ? composeViewContext.e : null;
                } else {
                    ttkVar = u;
                }
                lf3 lf3Var = new lf3(o1j.A(o1j.x(x)), x, j2, u6bVar, qqgVar, ttkVar);
                x.setTag(R.id.androidx_compose_ui_view_compose_view_context, new WeakReference(lf3Var));
                return lf3Var;
            }
        }
        composeViewContext = null;
        View x2 = o1j.x(this);
        A = o1j.A(x2);
        if (A == null) {
        }
    }

    @Override // android.view.ViewGroup
    public final boolean isTransitionGroup() {
        return !this.i || super.isTransitionGroup();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final mg3 j() {
        kqf kqfVar;
        CoroutineContext coroutineContext;
        ece eceVar;
        mg3 mg3Var = this.d;
        if (mg3Var == null) {
            mg3Var = qal.a(this);
            if (mg3Var == null) {
                Object parent = getParent();
                while (mg3Var == null && (parent instanceof View)) {
                    View view = (View) parent;
                    mg3Var = qal.a(view);
                    parent = mha.r(view);
                }
            }
            if (mg3Var != null) {
                mg3 mg3Var2 = (!(mg3Var instanceof kqf) || ((iqf) ((kqf) mg3Var).v.getValue()).compareTo(iqf.b) > 0) ? mg3Var : null;
                if (mg3Var2 != null) {
                    this.a = new WeakReference(mg3Var2);
                }
            } else {
                mg3Var = null;
            }
            if (mg3Var == null) {
                WeakReference weakReference = this.a;
                if (weakReference == null || (mg3Var = (mg3) weakReference.get()) == null || ((mg3Var instanceof kqf) && ((iqf) ((kqf) mg3Var).v.getValue()).compareTo(iqf.b) <= 0)) {
                    mg3Var = null;
                }
                if (mg3Var == null) {
                    if (!isAttachedToWindow()) {
                        r3a.b("Cannot locate windowRecomposer; View " + this + " is not attached to a window");
                    }
                    Object r = mha.r(this);
                    View view2 = this;
                    while (r instanceof View) {
                        View view3 = (View) r;
                        if (view3.getId() == 16908290) {
                            break;
                        }
                        view2 = view3;
                        r = view3.getParent();
                    }
                    mg3 a = qal.a(view2);
                    if (a == null) {
                        ((nal) oal.a.get()).getClass();
                        g gVar = g.a;
                        tq3 tq3Var = d.Q7;
                        gVar.getClass();
                        tq3Var.getClass();
                        mqi mqiVar = l40.m;
                        if (Looper.myLooper() == Looper.getMainLooper()) {
                            coroutineContext = (CoroutineContext) l40.m.getValue();
                        } else {
                            coroutineContext = (CoroutineContext) l40.n.get();
                            if (coroutineContext == null) {
                                a70.r("no AndroidUiDispatcher for this thread");
                                return null;
                            }
                        }
                        CoroutineContext plus = coroutineContext.plus(gVar);
                        wuc wucVar = (wuc) plus.get(hjg.e);
                        if (wucVar != null) {
                            ece eceVar2 = new ece(wucVar);
                            en0 en0Var = eceVar2.b;
                            synchronized (en0Var.c) {
                                en0Var.b = false;
                                Unit unit = Unit.a;
                                eceVar = eceVar2;
                            }
                        } else {
                            eceVar = 0;
                        }
                        fsf fsfVar = new fsf();
                        CoroutineContext coroutineContext2 = (pvc) plus.get(kpg.e);
                        if (coroutineContext2 == null) {
                            coroutineContext2 = new qvc(view2.getContext().getApplicationContext());
                            fsfVar.a = coroutineContext2;
                        }
                        if (eceVar != 0) {
                            gVar = eceVar;
                        }
                        CoroutineContext plus2 = plus.plus(gVar).plus(coroutineContext2);
                        kqf kqfVar2 = new kqf(plus2);
                        synchronized (kqfVar2.d) {
                            kqfVar2.u = true;
                            Unit unit2 = Unit.a;
                        }
                        ad2 c = s9a.c(plus2);
                        u6b w = qha.w(view2);
                        g6b lifecycle = w != null ? w.getLifecycle() : null;
                        if (lifecycle == null) {
                            r3a.c("ViewTreeLifecycleOwner not found from " + view2);
                            pvd.x();
                            return null;
                        }
                        view2.addOnAttachStateChangeListener(new a16(view2, 11, kqfVar2));
                        lifecycle.a(new yo8(c, eceVar, kqfVar2, fsfVar));
                        view2.setTag(R.id.androidx_compose_ui_view_composition_context, kqfVar2);
                        c09 c09Var = c09.a;
                        Handler handler = view2.getHandler();
                        int i = s69.a;
                        view2.addOnAttachStateChangeListener(new y00(xw3.L(c09Var, new r69(handler, "windowRecomposer cleanup", false).f, null, new i3l(kqfVar2, view2, r1, 6), 2), 9));
                        kqfVar = kqfVar2;
                    } else {
                        if (!(a instanceof kqf)) {
                            a70.r("root viewTreeParentCompositionContext is not a Recomposer");
                            return null;
                        }
                        kqfVar = (kqf) a;
                    }
                    r1 = ((iqf) kqfVar.v.getValue()).compareTo(iqf.b) > 0 ? kqfVar : null;
                    if (r1 != null) {
                        this.a = new WeakReference(r1);
                    }
                    return kqfVar;
                }
            }
        }
        return mg3Var;
    }

    public final lf3 k(View view, lf3 lf3Var) {
        mg3 j2 = j();
        u6b w = qha.w(view);
        ttk u = sha.u(view);
        qqg q = rha.q(view);
        mg3 mg3Var = lf3Var.b;
        qqg qqgVar = lf3Var.d;
        u6b u6bVar = lf3Var.c;
        if (j2 == mg3Var && w == u6bVar && u == lf3Var.e && q == qqgVar) {
            return lf3Var;
        }
        if (j2.k() != lf3Var.b.k()) {
            e();
        }
        if (w == null) {
            w = u6bVar;
        }
        lf3 lf3Var2 = new lf3(lf3Var, view, j2, w, q == null ? qqgVar : q, u);
        view.setTag(R.id.androidx_compose_ui_view_compose_view_context, new WeakReference(lf3Var2));
        return lf3Var2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        x0d x0dVar = qal.a;
        Object r = mha.r(this);
        View view = this;
        while (r instanceof View) {
            View view2 = (View) r;
            if (view2.getId() == 16908290) {
                break;
            }
            view = view2;
            r = view2.getParent();
        }
        if (view.getParent() == null) {
            getHandler().postAtFrontOfQueue(new y2(this, 0));
        } else {
            b();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        g(i, i2, i3, i4, z);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        f();
        h(i, i2);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.setLayoutDirection(i);
        }
    }

    /* renamed from: setAutoClearFocusBehavior-17tfJxM, reason: not valid java name */
    public final void m1setAutoClearFocusBehavior17tfJxM(int i) {
        setTag(R.id.auto_clear_focus_behavior_tag, new bq0(i));
    }

    public final void setComposeViewContext$ui(@Nullable lf3 lf3Var) {
        if (this.e != lf3Var) {
            if (lf3Var == null) {
                e();
            } else if (getChildCount() != 0) {
                View childAt = getChildAt(0);
                xy xyVar = childAt instanceof xy ? (xy) childAt : null;
                if (xyVar != null) {
                    if (xyVar.getCoroutineContext() != lf3Var.b.k()) {
                        e();
                    }
                    xyVar.setComposeViewContext(lf3Var);
                }
            }
            this.e = lf3Var;
        }
    }

    public final void setParentCompositionContext(@Nullable mg3 mg3Var) {
        setParentContext(mg3Var);
    }

    public final void setShowLayoutBounds(boolean z) {
        this.g = z;
        KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((xy) ((ryd) childAt)).setShowLayoutBounds(z);
        }
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean z) {
        super.setTransitionGroup(z);
        this.i = true;
    }

    public final void setViewCompositionStrategy(@NotNull gsk gskVar) {
        Function0 function0 = this.f;
        if (function0 != null) {
            function0.invoke();
        }
        this.f = gskVar.a(this);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        c();
        super.addView(view, i);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        c();
        return super.addViewInLayout(view, i, layoutParams, z);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        c();
        super.addView(view, i, i2);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        c();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        c();
        super.addView(view, i, layoutParams);
    }

    public static /* synthetic */ void getComposeViewContext$ui$annotations() {
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    public /* synthetic */ a3(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
