package com.google.android.material.navigation;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.g0;
import androidx.core.view.H;
import androidx.core.view.Y;
import i7.C7017a;
import j7.C7292a;
import k7.C7597a;
import t7.C9774a;
import y2.q;
import y7.C10856g;

/* loaded from: classes9.dex */
public abstract class a extends FrameLayout implements n.a {

    /* renamed from: A, reason: collision with root package name */
    private static final int[] f58436A = {R.attr.state_checked};

    /* renamed from: B, reason: collision with root package name */
    private static final c f58437B = new c();

    /* renamed from: a, reason: collision with root package name */
    private boolean f58438a;

    /* renamed from: b, reason: collision with root package name */
    private int f58439b;

    /* renamed from: c, reason: collision with root package name */
    private int f58440c;

    /* renamed from: d, reason: collision with root package name */
    private float f58441d;

    /* renamed from: e, reason: collision with root package name */
    private float f58442e;

    /* renamed from: f, reason: collision with root package name */
    private float f58443f;

    /* renamed from: g, reason: collision with root package name */
    private int f58444g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f58445h;

    /* renamed from: i, reason: collision with root package name */
    private final FrameLayout f58446i;

    /* renamed from: j, reason: collision with root package name */
    private final View f58447j;

    /* renamed from: k, reason: collision with root package name */
    private final ImageView f58448k;

    /* renamed from: l, reason: collision with root package name */
    private final ViewGroup f58449l;

    /* renamed from: m, reason: collision with root package name */
    private final TextView f58450m;

    /* renamed from: n, reason: collision with root package name */
    private final TextView f58451n;

    /* renamed from: o, reason: collision with root package name */
    private i f58452o;

    /* renamed from: p, reason: collision with root package name */
    private ColorStateList f58453p;

    /* renamed from: q, reason: collision with root package name */
    private Drawable f58454q;

    /* renamed from: r, reason: collision with root package name */
    private Drawable f58455r;

    /* renamed from: s, reason: collision with root package name */
    private ValueAnimator f58456s;

    /* renamed from: t, reason: collision with root package name */
    private c f58457t;

    /* renamed from: u, reason: collision with root package name */
    private float f58458u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f58459v;

    /* renamed from: w, reason: collision with root package name */
    private int f58460w;

    /* renamed from: x, reason: collision with root package name */
    private int f58461x;

    /* renamed from: y, reason: collision with root package name */
    private int f58462y;

    /* renamed from: z, reason: collision with root package name */
    private C7597a f58463z;

    /* renamed from: com.google.android.material.navigation.a$a, reason: collision with other inner class name */
    final class ViewOnLayoutChangeListenerC0885a implements View.OnLayoutChangeListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.google.android.material.bottomnavigation.a f58464a;

        ViewOnLayoutChangeListenerC0885a(com.google.android.material.bottomnavigation.a aVar) {
            this.f58464a = aVar;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
            com.google.android.material.bottomnavigation.a aVar = this.f58464a;
            if (((a) aVar).f58448k.getVisibility() == 0) {
                a.b(aVar, ((a) aVar).f58448k);
            }
        }
    }

    final class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f58465a;

        b(int i11) {
            this.f58465a = i11;
        }

        @Override // java.lang.Runnable
        public final void run() {
            a.this.G(this.f58465a);
        }
    }

    private static class c {
        protected float a(float f7, float f11) {
            return 1.0f;
        }
    }

    private static class d extends c {
        @Override // com.google.android.material.navigation.a.c
        protected final float a(float f7, float f11) {
            return C7292a.a(0.4f, 1.0f, f7);
        }
    }

    public a(@NonNull Context context) {
        super(context);
        this.f58438a = false;
        this.f58457t = f58437B;
        this.f58458u = 0.0f;
        this.f58459v = false;
        this.f58460w = 0;
        this.f58461x = 0;
        this.f58462y = 0;
        LayoutInflater.from(context).inflate(ru.ozon.app.android.R.layout.design_bottom_navigation_item, (ViewGroup) this, true);
        this.f58446i = (FrameLayout) findViewById(ru.ozon.app.android.R.id.navigation_bar_item_icon_container);
        this.f58447j = findViewById(ru.ozon.app.android.R.id.navigation_bar_item_active_indicator_view);
        ImageView imageView = (ImageView) findViewById(ru.ozon.app.android.R.id.navigation_bar_item_icon_view);
        this.f58448k = imageView;
        ViewGroup viewGroup = (ViewGroup) findViewById(ru.ozon.app.android.R.id.navigation_bar_item_labels_group);
        this.f58449l = viewGroup;
        TextView textView = (TextView) findViewById(ru.ozon.app.android.R.id.navigation_bar_item_small_label_view);
        this.f58450m = textView;
        TextView textView2 = (TextView) findViewById(ru.ozon.app.android.R.id.navigation_bar_item_large_label_view);
        this.f58451n = textView2;
        setBackgroundResource(ru.ozon.app.android.R.drawable.mtrl_navigation_bar_item_background);
        this.f58439b = getResources().getDimensionPixelSize(ru.ozon.app.android.R.dimen.design_bottom_navigation_margin);
        this.f58440c = viewGroup.getPaddingBottom();
        int i11 = Y.f42258g;
        textView.setImportantForAccessibility(2);
        textView2.setImportantForAccessibility(2);
        setFocusable(true);
        h(textView.getTextSize(), textView2.getTextSize());
        if (imageView != null) {
            imageView.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC0885a((com.google.android.material.bottomnavigation.a) this));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void C(TextView textView, int i11) {
        int i12;
        textView.setTextAppearance(i11);
        Context context = textView.getContext();
        if (i11 != 0) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i11, C7017a.f65931O);
            TypedValue typedValue = new TypedValue();
            boolean value = obtainStyledAttributes.getValue(0, typedValue);
            obtainStyledAttributes.recycle();
            if (value) {
                i12 = typedValue.getComplexUnit() == 2 ? Math.round(TypedValue.complexToFloat(typedValue.data) * context.getResources().getDisplayMetrics().density) : TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics());
                if (i12 == 0) {
                    textView.setTextSize(0, i12);
                    return;
                }
                return;
            }
        }
        i12 = 0;
        if (i12 == 0) {
        }
    }

    private static void E(@NonNull View view, float f7, float f11, int i11) {
        view.setScaleX(f7);
        view.setScaleY(f11);
        view.setVisibility(i11);
    }

    private static void F(@NonNull View view, int i11, int i12) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i11;
        layoutParams.bottomMargin = i11;
        layoutParams.gravity = i12;
        view.setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G(int i11) {
        View view = this.f58447j;
        if (view == null) {
            return;
        }
        int min = Math.min(this.f58460w, i11 - (this.f58462y * 2));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.height = this.f58461x;
        layoutParams.width = min;
        view.setLayoutParams(layoutParams);
    }

    private static void H(int i11, @NonNull View view) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i11);
    }

    static void b(com.google.android.material.bottomnavigation.a aVar, ImageView imageView) {
        C7597a c7597a = ((a) aVar).f58463z;
        if (c7597a != null) {
            Rect rect = new Rect();
            imageView.getDrawingRect(rect);
            c7597a.setBounds(rect);
            c7597a.j(imageView, null);
        }
    }

    private void h(float f7, float f11) {
        this.f58441d = f7 - f11;
        this.f58442e = (f11 * 1.0f) / f7;
        this.f58443f = (f7 * 1.0f) / f11;
    }

    private View j() {
        FrameLayout frameLayout = this.f58446i;
        return frameLayout != null ? frameLayout : this.f58448k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p(float f7, float f11) {
        View view = this.f58447j;
        if (view != null) {
            c cVar = this.f58457t;
            cVar.getClass();
            view.setScaleX(C7292a.a(0.4f, 1.0f, f7));
            view.setScaleY(cVar.a(f7, f11));
            view.setAlpha(C7292a.b(0.0f, 1.0f, f11 == 0.0f ? 0.8f : 0.0f, f11 == 0.0f ? 1.0f : 0.2f, f7));
        }
        this.f58458u = f7;
    }

    public final void A(int i11) {
        TextView textView = this.f58451n;
        C(textView, i11);
        h(this.f58450m.getTextSize(), textView.getTextSize());
    }

    public final void B(int i11) {
        TextView textView = this.f58450m;
        C(textView, i11);
        h(textView.getTextSize(), this.f58451n.getTextSize());
    }

    public final void D(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f58450m.setTextColor(colorStateList);
            this.f58451n.setTextColor(colorStateList);
        }
    }

    @Override // androidx.appcompat.view.menu.n.a
    public final boolean c() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n.a
    public final void e(@NonNull i iVar) {
        this.f58452o = iVar;
        iVar.getClass();
        refreshDrawableState();
        s(iVar.isChecked());
        setEnabled(iVar.isEnabled());
        Drawable icon = iVar.getIcon();
        if (icon != this.f58454q) {
            this.f58454q = icon;
            if (icon != null) {
                Drawable.ConstantState constantState = icon.getConstantState();
                if (constantState != null) {
                    icon = constantState.newDrawable();
                }
                icon = icon.mutate();
                this.f58455r = icon;
                ColorStateList colorStateList = this.f58453p;
                if (colorStateList != null) {
                    androidx.core.graphics.drawable.a.j(icon, colorStateList);
                }
            }
            this.f58448k.setImageDrawable(icon);
        }
        CharSequence title = iVar.getTitle();
        this.f58450m.setText(title);
        this.f58451n.setText(title);
        i iVar2 = this.f58452o;
        if (iVar2 == null || TextUtils.isEmpty(iVar2.getContentDescription())) {
            setContentDescription(title);
        }
        i iVar3 = this.f58452o;
        if (iVar3 != null && !TextUtils.isEmpty(iVar3.getTooltipText())) {
            title = this.f58452o.getTooltipText();
        }
        g0.a(this, title);
        setId(iVar.getItemId());
        if (!TextUtils.isEmpty(iVar.getContentDescription())) {
            setContentDescription(iVar.getContentDescription());
        }
        g0.a(this, !TextUtils.isEmpty(iVar.getTooltipText()) ? iVar.getTooltipText() : iVar.getTitle());
        setVisibility(iVar.isVisible() ? 0 : 8);
        this.f58438a = true;
    }

    @Override // androidx.appcompat.view.menu.n.a
    public final i g() {
        return this.f58452o;
    }

    @Override // android.view.View
    protected final int getSuggestedMinimumHeight() {
        ViewGroup viewGroup = this.f58449l;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
        C7597a c7597a = this.f58463z;
        int minimumHeight = c7597a != null ? c7597a.getMinimumHeight() / 2 : 0;
        return viewGroup.getMeasuredHeight() + this.f58448k.getMeasuredWidth() + Math.max(minimumHeight, ((FrameLayout.LayoutParams) j().getLayoutParams()).topMargin) + minimumHeight + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // android.view.View
    protected final int getSuggestedMinimumWidth() {
        ViewGroup viewGroup = this.f58449l;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
        int measuredWidth = viewGroup.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
        C7597a c7597a = this.f58463z;
        int minimumWidth = c7597a == null ? 0 : c7597a.getMinimumWidth() - this.f58463z.g();
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) j().getLayoutParams();
        return Math.max(Math.max(minimumWidth, layoutParams2.rightMargin) + this.f58448k.getMeasuredWidth() + Math.max(minimumWidth, layoutParams2.leftMargin), measuredWidth);
    }

    final void i() {
        k();
        this.f58452o = null;
        this.f58458u = 0.0f;
        this.f58438a = false;
    }

    final void k() {
        if (this.f58463z != null) {
            ImageView imageView = this.f58448k;
            if (imageView != null) {
                setClipChildren(true);
                setClipToPadding(true);
                C7597a c7597a = this.f58463z;
                if (c7597a != null) {
                    if (c7597a.f() != null) {
                        c7597a.f().setForeground(null);
                    } else {
                        imageView.getOverlay().remove(c7597a);
                    }
                }
            }
            this.f58463z = null;
        }
    }

    public final void l(C10856g c10856g) {
        View view = this.f58447j;
        if (view == null) {
            return;
        }
        view.setBackgroundDrawable(c10856g);
    }

    public final void m(boolean z11) {
        this.f58459v = z11;
        View view = this.f58447j;
        if (view != null) {
            view.setVisibility(z11 ? 0 : 8);
            requestLayout();
        }
    }

    public final void n(int i11) {
        this.f58461x = i11;
        G(getWidth());
    }

    public final void o(int i11) {
        this.f58462y = i11;
        G(getWidth());
    }

    @Override // android.view.ViewGroup, android.view.View
    @NonNull
    public final int[] onCreateDrawableState(int i11) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i11 + 1);
        i iVar = this.f58452o;
        if (iVar != null && iVar.isCheckable() && this.f58452o.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f58436A);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C7597a c7597a = this.f58463z;
        if (c7597a != null && c7597a.isVisible()) {
            CharSequence title = this.f58452o.getTitle();
            if (!TextUtils.isEmpty(this.f58452o.getContentDescription())) {
                title = this.f58452o.getContentDescription();
            }
            accessibilityNodeInfo.setContentDescription(((Object) title) + ", " + ((Object) this.f58463z.e()));
        }
        q A02 = q.A0(accessibilityNodeInfo);
        ViewGroup viewGroup = (ViewGroup) getParent();
        int indexOfChild = viewGroup.indexOfChild(this);
        int i11 = 0;
        for (int i12 = 0; i12 < indexOfChild; i12++) {
            View childAt = viewGroup.getChildAt(i12);
            if ((childAt instanceof a) && childAt.getVisibility() == 0) {
                i11++;
            }
        }
        A02.N(q.f.f(0, 1, i11, 1, false, isSelected()));
        if (isSelected()) {
            A02.L(false);
            A02.D(q.a.f105942e);
        }
        A02.k0(getResources().getString(ru.ozon.app.android.R.string.item_view_role_description));
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
        post(new b(i11));
    }

    public final void q(int i11) {
        this.f58460w = i11;
        G(getWidth());
    }

    final void r(@NonNull C7597a c7597a) {
        C7597a c7597a2 = this.f58463z;
        if (c7597a2 == c7597a) {
            return;
        }
        boolean z11 = c7597a2 != null;
        ImageView imageView = this.f58448k;
        if (z11 && imageView != null) {
            Log.w("NavigationBar", "Multiple badges shouldn't be attached to one item.");
            if (this.f58463z != null) {
                setClipChildren(true);
                setClipToPadding(true);
                C7597a c7597a3 = this.f58463z;
                if (c7597a3 != null) {
                    if (c7597a3.f() != null) {
                        c7597a3.f().setForeground(null);
                    } else {
                        imageView.getOverlay().remove(c7597a3);
                    }
                }
                this.f58463z = null;
            }
        }
        this.f58463z = c7597a;
        if (imageView == null || c7597a == null) {
            return;
        }
        setClipChildren(false);
        setClipToPadding(false);
        C7597a c7597a4 = this.f58463z;
        Rect rect = new Rect();
        imageView.getDrawingRect(rect);
        c7597a4.setBounds(rect);
        c7597a4.j(imageView, null);
        if (c7597a4.f() != null) {
            c7597a4.f().setForeground(c7597a4);
        } else {
            imageView.getOverlay().add(c7597a4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x011f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s(boolean z11) {
        int i11;
        TextView textView = this.f58451n;
        textView.setPivotX(textView.getWidth() / 2);
        textView.setPivotY(textView.getBaseline());
        TextView textView2 = this.f58450m;
        textView2.setPivotX(textView2.getWidth() / 2);
        textView2.setPivotY(textView2.getBaseline());
        float f7 = z11 ? 1.0f : 0.0f;
        if (this.f58459v && this.f58438a) {
            int i12 = Y.f42258g;
            if (isAttachedToWindow()) {
                ValueAnimator valueAnimator = this.f58456s;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.f58456s = null;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f58458u, f7);
                this.f58456s = ofFloat;
                ofFloat.addUpdateListener(new com.google.android.material.navigation.b(this, f7));
                this.f58456s.setInterpolator(C9774a.c(getContext(), C7292a.f69464b));
                ValueAnimator valueAnimator2 = this.f58456s;
                Context context = getContext();
                int integer = getResources().getInteger(ru.ozon.app.android.R.integer.material_motion_duration_long_1);
                TypedValue a11 = v7.b.a(ru.ozon.app.android.R.attr.motionDurationLong1, context);
                if (a11 != null && a11.type == 16) {
                    integer = a11.data;
                }
                valueAnimator2.setDuration(integer);
                this.f58456s.start();
                i11 = this.f58444g;
                ViewGroup viewGroup = this.f58449l;
                if (i11 == -1) {
                    if (i11 == 0) {
                        if (z11) {
                            F(j(), this.f58439b, 49);
                            H(this.f58440c, viewGroup);
                            textView.setVisibility(0);
                        } else {
                            F(j(), this.f58439b, 17);
                            H(0, viewGroup);
                            textView.setVisibility(4);
                        }
                        textView2.setVisibility(4);
                    } else if (i11 == 1) {
                        H(this.f58440c, viewGroup);
                        if (z11) {
                            F(j(), (int) (this.f58439b + this.f58441d), 49);
                            E(textView, 1.0f, 1.0f, 0);
                            float f11 = this.f58442e;
                            E(textView2, f11, f11, 4);
                        } else {
                            F(j(), this.f58439b, 49);
                            float f12 = this.f58443f;
                            E(textView, f12, f12, 4);
                            E(textView2, 1.0f, 1.0f, 0);
                        }
                    } else if (i11 == 2) {
                        F(j(), this.f58439b, 17);
                        textView.setVisibility(8);
                        textView2.setVisibility(8);
                    }
                } else if (this.f58445h) {
                    if (z11) {
                        F(j(), this.f58439b, 49);
                        H(this.f58440c, viewGroup);
                        textView.setVisibility(0);
                    } else {
                        F(j(), this.f58439b, 17);
                        H(0, viewGroup);
                        textView.setVisibility(4);
                    }
                    textView2.setVisibility(4);
                } else {
                    H(this.f58440c, viewGroup);
                    if (z11) {
                        F(j(), (int) (this.f58439b + this.f58441d), 49);
                        E(textView, 1.0f, 1.0f, 0);
                        float f13 = this.f58442e;
                        E(textView2, f13, f13, 4);
                    } else {
                        F(j(), this.f58439b, 49);
                        float f14 = this.f58443f;
                        E(textView, f14, f14, 4);
                        E(textView2, 1.0f, 1.0f, 0);
                    }
                }
                refreshDrawableState();
                setSelected(z11);
            }
        }
        p(f7, f7);
        i11 = this.f58444g;
        ViewGroup viewGroup2 = this.f58449l;
        if (i11 == -1) {
        }
        refreshDrawableState();
        setSelected(z11);
    }

    @Override // android.view.View
    public final void setEnabled(boolean z11) {
        super.setEnabled(z11);
        this.f58450m.setEnabled(z11);
        this.f58451n.setEnabled(z11);
        this.f58448k.setEnabled(z11);
        if (z11) {
            Y.K(this, H.b(getContext()));
        } else {
            Y.K(this, null);
        }
    }

    public final void t(int i11) {
        ImageView imageView = this.f58448k;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams();
        layoutParams.width = i11;
        layoutParams.height = i11;
        imageView.setLayoutParams(layoutParams);
    }

    public final void u(ColorStateList colorStateList) {
        Drawable drawable;
        this.f58453p = colorStateList;
        if (this.f58452o == null || (drawable = this.f58455r) == null) {
            return;
        }
        androidx.core.graphics.drawable.a.j(drawable, colorStateList);
        this.f58455r.invalidateSelf();
    }

    public final void v(Drawable drawable) {
        if (drawable != null && drawable.getConstantState() != null) {
            drawable = drawable.getConstantState().newDrawable().mutate();
        }
        int i11 = Y.f42258g;
        setBackground(drawable);
    }

    public final void w(int i11) {
        if (this.f58440c != i11) {
            this.f58440c = i11;
            i iVar = this.f58452o;
            if (iVar != null) {
                s(iVar.isChecked());
            }
        }
    }

    public final void x(int i11) {
        if (this.f58439b != i11) {
            this.f58439b = i11;
            i iVar = this.f58452o;
            if (iVar != null) {
                s(iVar.isChecked());
            }
        }
    }

    public final void y(int i11) {
        if (this.f58444g != i11) {
            this.f58444g = i11;
            this.f58457t = f58437B;
            G(getWidth());
            i iVar = this.f58452o;
            if (iVar != null) {
                s(iVar.isChecked());
            }
        }
    }

    public final void z(boolean z11) {
        if (this.f58445h != z11) {
            this.f58445h = z11;
            i iVar = this.f58452o;
            if (iVar != null) {
                s(iVar.isChecked());
            }
        }
    }
}
