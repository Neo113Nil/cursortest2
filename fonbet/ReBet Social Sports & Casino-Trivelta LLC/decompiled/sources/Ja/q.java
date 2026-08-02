package Ja;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.Editable;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import ja.AbstractC5104a;
import kotlin.jvm.internal.LongCompanionObject;

/* loaded from: classes3.dex */
public class q extends s {

    /* renamed from: e, reason: collision with root package name */
    public final int f6000e;

    /* renamed from: f, reason: collision with root package name */
    public final int f6001f;

    /* renamed from: g, reason: collision with root package name */
    public final TimeInterpolator f6002g;

    /* renamed from: h, reason: collision with root package name */
    public AutoCompleteTextView f6003h;

    /* renamed from: i, reason: collision with root package name */
    public final View.OnClickListener f6004i;

    /* renamed from: j, reason: collision with root package name */
    public final View.OnFocusChangeListener f6005j;

    /* renamed from: k, reason: collision with root package name */
    public final AccessibilityManager.TouchExplorationStateChangeListener f6006k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f6007l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f6008m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f6009n;

    /* renamed from: o, reason: collision with root package name */
    public long f6010o;

    /* renamed from: p, reason: collision with root package name */
    public AccessibilityManager f6011p;

    /* renamed from: q, reason: collision with root package name */
    public ValueAnimator f6012q;

    /* renamed from: r, reason: collision with root package name */
    public ValueAnimator f6013r;

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            q.this.r();
            q.this.f6013r.start();
        }
    }

    public q(com.google.android.material.textfield.a aVar) {
        super(aVar);
        this.f6004i = new View.OnClickListener() { // from class: Ja.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                q.this.J();
            }
        };
        this.f6005j = new View.OnFocusChangeListener() { // from class: Ja.n
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                q.y(q.this, view, z10);
            }
        };
        this.f6006k = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: Ja.o
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z10) {
                q.w(q.this, z10);
            }
        };
        this.f6010o = LongCompanionObject.MAX_VALUE;
        this.f6001f = za.h.f(aVar.getContext(), ia.c.f48219X, 67);
        this.f6000e = za.h.f(aVar.getContext(), ia.c.f48219X, 50);
        this.f6002g = za.h.g(aVar.getContext(), ia.c.f48227c0, AbstractC5104a.f53858a);
    }

    public static /* synthetic */ void A(q qVar) {
        qVar.K();
        qVar.H(false);
    }

    public static AutoCompleteTextView D(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    private void F() {
        this.f6013r = E(this.f6001f, 0.0f, 1.0f);
        ValueAnimator E10 = E(this.f6000e, 1.0f, 0.0f);
        this.f6012q = E10;
        E10.addListener(new a());
    }

    public static /* synthetic */ void v(q qVar) {
        boolean isPopupShowing = qVar.f6003h.isPopupShowing();
        qVar.H(isPopupShowing);
        qVar.f6008m = isPopupShowing;
    }

    public static /* synthetic */ void w(q qVar, boolean z10) {
        AutoCompleteTextView autoCompleteTextView = qVar.f6003h;
        if (autoCompleteTextView == null || r.a(autoCompleteTextView)) {
            return;
        }
        qVar.f6018d.setImportantForAccessibility(z10 ? 2 : 1);
    }

    public static /* synthetic */ void x(q qVar, ValueAnimator valueAnimator) {
        qVar.getClass();
        qVar.f6018d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static /* synthetic */ void y(q qVar, View view, boolean z10) {
        qVar.f6007l = z10;
        qVar.r();
        if (z10) {
            return;
        }
        qVar.H(false);
        qVar.f6008m = false;
    }

    public static /* synthetic */ boolean z(q qVar, View view, MotionEvent motionEvent) {
        qVar.getClass();
        if (motionEvent.getAction() == 1) {
            if (qVar.G()) {
                qVar.f6008m = false;
            }
            qVar.J();
            qVar.K();
        }
        return false;
    }

    public final ValueAnimator E(int i10, float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(this.f6002g);
        ofFloat.setDuration(i10);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: Ja.j
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                q.x(q.this, valueAnimator);
            }
        });
        return ofFloat;
    }

    public final boolean G() {
        long uptimeMillis = SystemClock.uptimeMillis() - this.f6010o;
        return uptimeMillis < 0 || uptimeMillis > 300;
    }

    public final void H(boolean z10) {
        if (this.f6009n != z10) {
            this.f6009n = z10;
            this.f6013r.cancel();
            this.f6012q.start();
        }
    }

    public final void I() {
        this.f6003h.setOnTouchListener(new View.OnTouchListener() { // from class: Ja.k
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return q.z(q.this, view, motionEvent);
            }
        });
        this.f6003h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: Ja.l
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                q.A(q.this);
            }
        });
        this.f6003h.setThreshold(0);
    }

    public final void J() {
        if (this.f6003h == null) {
            return;
        }
        if (G()) {
            this.f6008m = false;
        }
        if (this.f6008m) {
            this.f6008m = false;
            return;
        }
        H(!this.f6009n);
        if (!this.f6009n) {
            this.f6003h.dismissDropDown();
        } else {
            this.f6003h.requestFocus();
            this.f6003h.showDropDown();
        }
    }

    public final void K() {
        this.f6008m = true;
        this.f6010o = SystemClock.uptimeMillis();
    }

    @Override // Ja.s
    public void a(Editable editable) {
        if (this.f6011p.isTouchExplorationEnabled() && r.a(this.f6003h) && !this.f6018d.hasFocus()) {
            this.f6003h.dismissDropDown();
        }
        this.f6003h.post(new Runnable() { // from class: Ja.p
            @Override // java.lang.Runnable
            public final void run() {
                q.v(q.this);
            }
        });
    }

    @Override // Ja.s
    public int c() {
        return ia.k.f48529g;
    }

    @Override // Ja.s
    public int d() {
        return ia.f.f48389h;
    }

    @Override // Ja.s
    public View.OnFocusChangeListener e() {
        return this.f6005j;
    }

    @Override // Ja.s
    public View.OnClickListener f() {
        return this.f6004i;
    }

    @Override // Ja.s
    public AccessibilityManager.TouchExplorationStateChangeListener h() {
        return this.f6006k;
    }

    @Override // Ja.s
    public boolean i(int i10) {
        return i10 != 0;
    }

    @Override // Ja.s
    public boolean j() {
        return true;
    }

    @Override // Ja.s
    public boolean k() {
        return this.f6007l;
    }

    @Override // Ja.s
    public boolean l() {
        return true;
    }

    @Override // Ja.s
    public boolean m() {
        return this.f6009n;
    }

    @Override // Ja.s
    public void n(EditText editText) {
        this.f6003h = D(editText);
        I();
        this.f6015a.setErrorIconDrawable((Drawable) null);
        if (!r.a(editText) && this.f6011p.isTouchExplorationEnabled()) {
            this.f6018d.setImportantForAccessibility(2);
        }
        this.f6015a.setEndIconVisible(true);
    }

    @Override // Ja.s
    public void o(View view, y0.z zVar) {
        if (!r.a(this.f6003h)) {
            zVar.w0(Spinner.class.getName());
        }
        if (zVar.g0()) {
            zVar.I0(null);
        }
    }

    @Override // Ja.s
    public void p(View view, AccessibilityEvent accessibilityEvent) {
        if (!this.f6011p.isEnabled() || r.a(this.f6003h)) {
            return;
        }
        boolean z10 = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.f6009n && !this.f6003h.isPopupShowing();
        if (accessibilityEvent.getEventType() == 1 || z10) {
            J();
            K();
        }
    }

    @Override // Ja.s
    public void s() {
        F();
        this.f6011p = (AccessibilityManager) this.f6017c.getSystemService("accessibility");
    }

    @Override // Ja.s
    public boolean t() {
        return true;
    }

    @Override // Ja.s
    public void u() {
        AutoCompleteTextView autoCompleteTextView = this.f6003h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.f6003h.setOnDismissListener(null);
        }
    }
}
