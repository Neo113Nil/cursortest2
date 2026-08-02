package com.google.android.material.textfield;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.LinearInterpolator;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.annotation.NonNull;
import androidx.core.view.Y;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import j7.C7292a;
import n7.C8448a;
import ru.ozon.app.android.R;
import s7.C9618m;
import y2.C10826b;
import y7.C10856g;
import y7.k;

/* loaded from: classes9.dex */
final class h extends m {

    /* renamed from: e, reason: collision with root package name */
    private final TextWatcher f58717e;

    /* renamed from: f, reason: collision with root package name */
    private final View.OnFocusChangeListener f58718f;

    /* renamed from: g, reason: collision with root package name */
    private final TextInputLayout.d f58719g;

    /* renamed from: h, reason: collision with root package name */
    private final TextInputLayout.e f58720h;

    /* renamed from: i, reason: collision with root package name */
    @SuppressLint({"ClickableViewAccessibility"})
    private final TextInputLayout.f f58721i;

    /* renamed from: j, reason: collision with root package name */
    private final View.OnAttachStateChangeListener f58722j;

    /* renamed from: k, reason: collision with root package name */
    private final C10826b.a f58723k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f58724l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f58725m;

    /* renamed from: n, reason: collision with root package name */
    private long f58726n;

    /* renamed from: o, reason: collision with root package name */
    private StateListDrawable f58727o;

    /* renamed from: p, reason: collision with root package name */
    private C10856g f58728p;

    /* renamed from: q, reason: collision with root package name */
    private AccessibilityManager f58729q;

    /* renamed from: r, reason: collision with root package name */
    private ValueAnimator f58730r;

    /* renamed from: s, reason: collision with root package name */
    private ValueAnimator f58731s;

    final class a extends C9618m {

        /* renamed from: com.google.android.material.textfield.h$a$a, reason: collision with other inner class name */
        final class RunnableC0891a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ AutoCompleteTextView f58733a;

            RunnableC0891a(AutoCompleteTextView autoCompleteTextView) {
                this.f58733a = autoCompleteTextView;
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean isPopupShowing = this.f58733a.isPopupShowing();
                h hVar = h.this;
                h.o(hVar, isPopupShowing);
                hVar.f58724l = isPopupShowing;
            }
        }

        a() {
        }

        @Override // s7.C9618m, android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            h hVar = h.this;
            EditText editText = hVar.f58749a.f58659e;
            if (!(editText instanceof AutoCompleteTextView)) {
                throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
            }
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            if (hVar.f58729q.isTouchExplorationEnabled() && h.n(autoCompleteTextView) && !hVar.f58751c.hasFocus()) {
                autoCompleteTextView.dismissDropDown();
            }
            autoCompleteTextView.post(new RunnableC0891a(autoCompleteTextView));
        }
    }

    final class b implements View.OnFocusChangeListener {
        b() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public final void onFocusChange(View view, boolean z11) {
            h hVar = h.this;
            hVar.f58749a.Q(z11);
            if (z11) {
                return;
            }
            h.o(hVar, false);
            hVar.f58724l = false;
        }
    }

    final class c extends TextInputLayout.d {
        c(TextInputLayout textInputLayout) {
            super(textInputLayout);
        }

        @Override // com.google.android.material.textfield.TextInputLayout.d, androidx.core.view.C5305a
        public final void onInitializeAccessibilityNodeInfo(View view, @NonNull y2.q qVar) {
            super.onInitializeAccessibilityNodeInfo(view, qVar);
            if (!h.n(h.this.f58749a.f58659e)) {
                qVar.K(Spinner.class.getName());
            }
            if (qVar.y()) {
                qVar.X(null);
            }
        }

        @Override // androidx.core.view.C5305a
        public final void onPopulateAccessibilityEvent(View view, @NonNull AccessibilityEvent accessibilityEvent) {
            super.onPopulateAccessibilityEvent(view, accessibilityEvent);
            h hVar = h.this;
            EditText editText = hVar.f58749a.f58659e;
            if (!(editText instanceof AutoCompleteTextView)) {
                throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
            }
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            if (accessibilityEvent.getEventType() == 1 && hVar.f58729q.isEnabled() && !h.n(hVar.f58749a.f58659e)) {
                h.q(hVar, autoCompleteTextView);
                h.r(hVar);
            }
        }
    }

    final class d implements TextInputLayout.e {
        d() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.e
        public final void a(@NonNull TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.f58659e;
            if (!(editText instanceof AutoCompleteTextView)) {
                throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
            }
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            h hVar = h.this;
            h.s(hVar, autoCompleteTextView);
            hVar.v(autoCompleteTextView);
            h.u(hVar, autoCompleteTextView);
            autoCompleteTextView.setThreshold(0);
            autoCompleteTextView.removeTextChangedListener(hVar.f58717e);
            autoCompleteTextView.addTextChangedListener(hVar.f58717e);
            textInputLayout.R(true);
            textInputLayout.b0(null);
            if (autoCompleteTextView.getKeyListener() == null && hVar.f58729q.isTouchExplorationEnabled()) {
                CheckableImageButton checkableImageButton = hVar.f58751c;
                int i11 = Y.f42258g;
                checkableImageButton.setImportantForAccessibility(2);
            }
            TextInputLayout.d dVar = hVar.f58719g;
            EditText editText2 = textInputLayout.f58659e;
            if (editText2 != null) {
                Y.C(editText2, dVar);
            }
            textInputLayout.Y(true);
        }
    }

    final class e implements TextInputLayout.f {

        final class a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ AutoCompleteTextView f58739a;

            a(AutoCompleteTextView autoCompleteTextView) {
                this.f58739a = autoCompleteTextView;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f58739a.removeTextChangedListener(h.this.f58717e);
            }
        }

        e() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.f
        public final void a(@NonNull TextInputLayout textInputLayout, int i11) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) textInputLayout.f58659e;
            h hVar = h.this;
            if (autoCompleteTextView != null && i11 == 3) {
                autoCompleteTextView.post(new a(autoCompleteTextView));
                if (autoCompleteTextView.getOnFocusChangeListener() == hVar.f58718f) {
                    autoCompleteTextView.setOnFocusChangeListener(null);
                }
                autoCompleteTextView.setOnTouchListener(null);
                autoCompleteTextView.setOnDismissListener(null);
            }
            if (i11 == 3) {
                textInputLayout.removeOnAttachStateChangeListener(hVar.f58722j);
                h.i(hVar);
            }
        }
    }

    final class f implements View.OnAttachStateChangeListener {
        f() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            h.j(h.this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            h.i(h.this);
        }
    }

    final class g implements C10826b.a {
        g() {
        }

        @Override // y2.C10826b.a
        public final void onTouchExplorationStateChanged(boolean z11) {
            h hVar = h.this;
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) hVar.f58749a.f58659e;
            if (autoCompleteTextView == null || autoCompleteTextView.getKeyListener() != null) {
                return;
            }
            CheckableImageButton checkableImageButton = hVar.f58751c;
            int i11 = z11 ? 2 : 1;
            int i12 = Y.f42258g;
            checkableImageButton.setImportantForAccessibility(i11);
        }
    }

    /* renamed from: com.google.android.material.textfield.h$h, reason: collision with other inner class name */
    final class ViewOnClickListenerC0892h implements View.OnClickListener {
        ViewOnClickListenerC0892h() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            h hVar = h.this;
            h.q(hVar, (AutoCompleteTextView) hVar.f58749a.f58659e);
        }
    }

    h(@NonNull TextInputLayout textInputLayout, int i11) {
        super(textInputLayout, i11);
        this.f58717e = new a();
        this.f58718f = new b();
        this.f58719g = new c(textInputLayout);
        this.f58720h = new d();
        this.f58721i = new e();
        this.f58722j = new f();
        this.f58723k = new g();
        this.f58724l = false;
        this.f58725m = false;
        this.f58726n = Long.MAX_VALUE;
    }

    static void i(h hVar) {
        AccessibilityManager accessibilityManager = hVar.f58729q;
        if (accessibilityManager != null) {
            C10826b.b(accessibilityManager, hVar.f58723k);
        }
    }

    static void j(h hVar) {
        if (hVar.f58729q != null) {
            TextInputLayout textInputLayout = hVar.f58749a;
            int i11 = Y.f42258g;
            if (textInputLayout.isAttachedToWindow()) {
                C10826b.a(hVar.f58729q, hVar.f58723k);
            }
        }
    }

    static boolean k(h hVar) {
        hVar.getClass();
        long currentTimeMillis = System.currentTimeMillis() - hVar.f58726n;
        return currentTimeMillis < 0 || currentTimeMillis > 300;
    }

    static boolean n(EditText editText) {
        return editText.getKeyListener() != null;
    }

    static void o(h hVar, boolean z11) {
        if (hVar.f58725m != z11) {
            hVar.f58725m = z11;
            hVar.f58731s.cancel();
            hVar.f58730r.start();
        }
    }

    static void q(h hVar, AutoCompleteTextView autoCompleteTextView) {
        if (autoCompleteTextView == null) {
            hVar.getClass();
            return;
        }
        hVar.getClass();
        long currentTimeMillis = System.currentTimeMillis() - hVar.f58726n;
        if (currentTimeMillis < 0 || currentTimeMillis > 300) {
            hVar.f58724l = false;
        }
        if (hVar.f58724l) {
            hVar.f58724l = false;
            return;
        }
        boolean z11 = hVar.f58725m;
        boolean z12 = !z11;
        if (z11 != z12) {
            hVar.f58725m = z12;
            hVar.f58731s.cancel();
            hVar.f58730r.start();
        }
        if (!hVar.f58725m) {
            autoCompleteTextView.dismissDropDown();
        } else {
            autoCompleteTextView.requestFocus();
            autoCompleteTextView.showDropDown();
        }
    }

    static void r(h hVar) {
        hVar.f58724l = true;
        hVar.f58726n = System.currentTimeMillis();
    }

    static void s(h hVar, AutoCompleteTextView autoCompleteTextView) {
        int o11 = hVar.f58749a.o();
        if (o11 == 2) {
            autoCompleteTextView.setDropDownBackgroundDrawable(hVar.f58728p);
        } else if (o11 == 1) {
            autoCompleteTextView.setDropDownBackgroundDrawable(hVar.f58727o);
        }
    }

    static void u(h hVar, AutoCompleteTextView autoCompleteTextView) {
        hVar.getClass();
        autoCompleteTextView.setOnTouchListener(new l(hVar, autoCompleteTextView));
        autoCompleteTextView.setOnFocusChangeListener(hVar.f58718f);
        autoCompleteTextView.setOnDismissListener(new i(hVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v(@NonNull AutoCompleteTextView autoCompleteTextView) {
        if (autoCompleteTextView.getKeyListener() != null) {
            return;
        }
        TextInputLayout textInputLayout = this.f58749a;
        int o11 = textInputLayout.o();
        C10856g m11 = textInputLayout.m();
        int b11 = C8448a.b(R.attr.colorControlHighlight, autoCompleteTextView);
        int[][] iArr = {new int[]{android.R.attr.state_pressed}, new int[0]};
        if (o11 != 2) {
            if (o11 == 1) {
                int n11 = textInputLayout.n();
                RippleDrawable rippleDrawable = new RippleDrawable(new ColorStateList(iArr, new int[]{C8448a.d(0.1f, b11, n11), n11}), m11, m11);
                int i11 = Y.f42258g;
                autoCompleteTextView.setBackground(rippleDrawable);
                return;
            }
            return;
        }
        int b12 = C8448a.b(R.attr.colorSurface, autoCompleteTextView);
        C10856g c10856g = new C10856g(m11.r());
        int d11 = C8448a.d(0.1f, b11, b12);
        c10856g.B(new ColorStateList(iArr, new int[]{d11, 0}));
        c10856g.setTint(b12);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{d11, b12});
        C10856g c10856g2 = new C10856g(m11.r());
        c10856g2.setTint(-1);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, c10856g, c10856g2), m11});
        int i12 = Y.f42258g;
        autoCompleteTextView.setBackground(layerDrawable);
    }

    private C10856g w(float f7, float f11, float f12, int i11) {
        k.a aVar = new k.a();
        aVar.p(f7);
        aVar.t(f7);
        aVar.h(f11);
        aVar.l(f11);
        y7.k a11 = aVar.a();
        int i12 = C10856g.f106096x;
        String simpleName = C10856g.class.getSimpleName();
        Context context = this.f58750b;
        int b11 = v7.b.b(context, R.attr.colorSurface, simpleName);
        C10856g c10856g = new C10856g();
        c10856g.v(context);
        c10856g.B(ColorStateList.valueOf(b11));
        c10856g.A(f12);
        c10856g.setShapeAppearanceModel(a11);
        c10856g.D(0, i11, 0, i11);
        return c10856g;
    }

    @Override // com.google.android.material.textfield.m
    final void a() {
        Context context = this.f58750b;
        float dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.mtrl_shape_corner_size_small_component);
        float dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        int dimensionPixelOffset3 = context.getResources().getDimensionPixelOffset(R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        C10856g w11 = w(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        C10856g w12 = w(0.0f, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        this.f58728p = w11;
        StateListDrawable stateListDrawable = new StateListDrawable();
        this.f58727o = stateListDrawable;
        stateListDrawable.addState(new int[]{android.R.attr.state_above_anchor}, w11);
        this.f58727o.addState(new int[0], w12);
        int i11 = this.f58752d;
        if (i11 == 0) {
            i11 = R.drawable.mtrl_dropdown_arrow;
        }
        TextInputLayout textInputLayout = this.f58749a;
        textInputLayout.T(i11);
        textInputLayout.S(textInputLayout.getResources().getText(R.string.exposed_dropdown_menu_content_description));
        textInputLayout.W(new ViewOnClickListenerC0892h());
        textInputLayout.g(this.f58720h);
        textInputLayout.h(this.f58721i);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        LinearInterpolator linearInterpolator = C7292a.f69463a;
        ofFloat.setInterpolator(linearInterpolator);
        ofFloat.setDuration(67);
        ofFloat.addUpdateListener(new k(this));
        this.f58731s = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat2.setInterpolator(linearInterpolator);
        ofFloat2.setDuration(50);
        ofFloat2.addUpdateListener(new k(this));
        this.f58730r = ofFloat2;
        ofFloat2.addListener(new j(this));
        this.f58729q = (AccessibilityManager) context.getSystemService("accessibility");
        textInputLayout.addOnAttachStateChangeListener(this.f58722j);
        if (this.f58729q != null) {
            TextInputLayout textInputLayout2 = this.f58749a;
            int i12 = Y.f42258g;
            if (textInputLayout2.isAttachedToWindow()) {
                C10826b.a(this.f58729q, this.f58723k);
            }
        }
    }

    @Override // com.google.android.material.textfield.m
    final boolean b(int i11) {
        return i11 != 0;
    }

    final void x(@NonNull AutoCompleteTextView autoCompleteTextView) {
        if (autoCompleteTextView.getKeyListener() == null && this.f58749a.o() == 2 && (autoCompleteTextView.getBackground() instanceof LayerDrawable)) {
            v(autoCompleteTextView);
        }
    }
}
