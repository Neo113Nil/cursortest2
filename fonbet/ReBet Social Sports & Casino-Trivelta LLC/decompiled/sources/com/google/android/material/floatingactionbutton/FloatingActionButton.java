package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.C2053h;
import androidx.appcompat.widget.C2058m;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.AbstractC2082d0;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.floatingactionbutton.c;
import com.google.android.material.shape.n;
import com.google.android.material.shape.q;
import com.google.android.material.stateful.ExtendableSavedState;
import ia.e;
import ia.l;
import ia.m;
import ja.C5110g;
import java.util.List;
import n0.AbstractC5597a;
import wa.InterfaceC6734a;
import x0.f;
import xa.AbstractC6816b;
import xa.o;
import xa.p;

/* loaded from: classes3.dex */
public class FloatingActionButton extends p implements InterfaceC6734a, q, CoordinatorLayout.b {

    /* renamed from: r, reason: collision with root package name */
    public static final int f35458r = l.f48577p;

    /* renamed from: b, reason: collision with root package name */
    public ColorStateList f35459b;

    /* renamed from: c, reason: collision with root package name */
    public PorterDuff.Mode f35460c;

    /* renamed from: d, reason: collision with root package name */
    public ColorStateList f35461d;

    /* renamed from: e, reason: collision with root package name */
    public PorterDuff.Mode f35462e;

    /* renamed from: f, reason: collision with root package name */
    public ColorStateList f35463f;

    /* renamed from: g, reason: collision with root package name */
    public int f35464g;

    /* renamed from: h, reason: collision with root package name */
    public int f35465h;

    /* renamed from: i, reason: collision with root package name */
    public int f35466i;

    /* renamed from: j, reason: collision with root package name */
    public int f35467j;

    /* renamed from: k, reason: collision with root package name */
    public int f35468k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f35469l;

    /* renamed from: m, reason: collision with root package name */
    public final Rect f35470m;

    /* renamed from: n, reason: collision with root package name */
    public final Rect f35471n;

    /* renamed from: o, reason: collision with root package name */
    public final C2058m f35472o;

    /* renamed from: p, reason: collision with root package name */
    public final wa.b f35473p;

    /* renamed from: q, reason: collision with root package name */
    public c f35474q;

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        /* renamed from: I */
        public /* bridge */ /* synthetic */ boolean f(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            return super.f(coordinatorLayout, floatingActionButton, rect);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        /* renamed from: M */
        public /* bridge */ /* synthetic */ boolean l(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            return super.l(coordinatorLayout, floatingActionButton, view);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        /* renamed from: N */
        public /* bridge */ /* synthetic */ boolean p(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i10) {
            return super.p(coordinatorLayout, floatingActionButton, i10);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ void k(CoordinatorLayout.f fVar) {
            super.k(fVar);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static abstract class a {
    }

    public class b implements Ea.b {
        public b() {
        }

        @Override // Ea.b
        public void a(Drawable drawable) {
            if (drawable != null) {
                FloatingActionButton.super.setBackgroundDrawable(drawable);
            }
        }

        @Override // Ea.b
        public void b(int i10, int i11, int i12, int i13) {
            FloatingActionButton.this.f35470m.set(i10, i11, i12, i13);
            FloatingActionButton floatingActionButton = FloatingActionButton.this;
            floatingActionButton.setPadding(i10 + floatingActionButton.f35467j, i11 + FloatingActionButton.this.f35467j, i12 + FloatingActionButton.this.f35467j, i13 + FloatingActionButton.this.f35467j);
        }

        @Override // Ea.b
        public boolean c() {
            return FloatingActionButton.this.f35469l;
        }
    }

    public FloatingActionButton(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ia.c.f48196A);
    }

    private c getImpl() {
        if (this.f35474q == null) {
            this.f35474q = new c(this, new b());
        }
        return this.f35474q;
    }

    @Override // wa.InterfaceC6734a
    public boolean a() {
        return this.f35473p.c();
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
    }

    public void e(Rect rect) {
        rect.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
        k(rect);
    }

    public final int f(int i10) {
        int i11 = this.f35466i;
        if (i11 != 0) {
            return i11;
        }
        Resources resources = getResources();
        return i10 != -1 ? i10 != 1 ? resources.getDimensionPixelSize(e.f48352l) : resources.getDimensionPixelSize(e.f48350k) : Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? f(1) : f(0);
    }

    public final void g(Rect rect) {
        e(rect);
        int i10 = -this.f35474q.u();
        rect.inset(i10, i10);
    }

    @Override // android.widget.ImageButton, android.widget.ImageView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "com.google.android.material.floatingactionbutton.FloatingActionButton";
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return this.f35459b;
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f35460c;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    @NonNull
    public CoordinatorLayout.c getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return getImpl().m();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().p();
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().r();
    }

    public Drawable getContentBackground() {
        return getImpl().l();
    }

    public int getCustomSize() {
        return this.f35466i;
    }

    public int getExpandedComponentIdHint() {
        return this.f35473p.b();
    }

    public C5110g getHideMotionSpec() {
        return getImpl().o();
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.f35463f;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.f35463f;
    }

    @NonNull
    public n getShapeAppearanceModel() {
        return (n) f.g(getImpl().s());
    }

    public C5110g getShowMotionSpec() {
        return getImpl().t();
    }

    public int getSize() {
        return this.f35465h;
    }

    public int getSizeDimension() {
        return f(this.f35465h);
    }

    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    public ColorStateList getSupportImageTintList() {
        return this.f35461d;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        return this.f35462e;
    }

    public boolean getUseCompatPadding() {
        return this.f35469l;
    }

    public void h() {
        i(null);
    }

    public void i(a aVar) {
        j(aVar, true);
    }

    public void j(a aVar, boolean z10) {
        getImpl().v(p(aVar), z10);
    }

    @Override // android.widget.ImageView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
    }

    public final void k(Rect rect) {
        int i10 = rect.left;
        Rect rect2 = this.f35470m;
        rect.left = i10 + rect2.left;
        rect.top += rect2.top;
        rect.right -= rect2.right;
        rect.bottom -= rect2.bottom;
    }

    public final void l() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        ColorStateList colorStateList = this.f35461d;
        if (colorStateList == null) {
            AbstractC5597a.c(drawable);
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
        PorterDuff.Mode mode = this.f35462e;
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        drawable.mutate().setColorFilter(C2053h.e(colorForState, mode));
    }

    public void m() {
        n(null);
    }

    public void n(a aVar) {
        o(aVar, true);
    }

    public void o(a aVar, boolean z10) {
        getImpl().X(p(aVar), z10);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getImpl().A();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getImpl().C();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i10, int i11) {
        int sizeDimension = getSizeDimension();
        this.f35467j = (sizeDimension - this.f35468k) / 2;
        getImpl().Z();
        int min = Math.min(View.resolveSize(sizeDimension, i10), View.resolveSize(sizeDimension, i11));
        Rect rect = this.f35470m;
        setMeasuredDimension(rect.left + min + rect.right, min + rect.top + rect.bottom);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ExtendableSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ExtendableSavedState extendableSavedState = (ExtendableSavedState) parcelable;
        super.onRestoreInstanceState(extendableSavedState.a());
        this.f35473p.d((Bundle) f.g((Bundle) extendableSavedState.f36137c.get("expandableWidgetHelper")));
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState == null) {
            onSaveInstanceState = new Bundle();
        }
        ExtendableSavedState extendableSavedState = new ExtendableSavedState(onSaveInstanceState);
        extendableSavedState.f36137c.put("expandableWidgetHelper", this.f35473p.e());
        return extendableSavedState;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            g(this.f35471n);
            if (!this.f35471n.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final c.g p(a aVar) {
        return null;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.f35459b != colorStateList) {
            this.f35459b = colorStateList;
            getImpl().H(colorStateList);
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f35460c != mode) {
            this.f35460c = mode;
            getImpl().I(mode);
        }
    }

    public void setCompatElevation(float f10) {
        getImpl().J(f10);
    }

    public void setCompatElevationResource(int i10) {
        setCompatElevation(getResources().getDimension(i10));
    }

    public void setCompatHoveredFocusedTranslationZ(float f10) {
        getImpl().M(f10);
    }

    public void setCompatHoveredFocusedTranslationZResource(int i10) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i10));
    }

    public void setCompatPressedTranslationZ(float f10) {
        getImpl().Q(f10);
    }

    public void setCompatPressedTranslationZResource(int i10) {
        setCompatPressedTranslationZ(getResources().getDimension(i10));
    }

    public void setCustomSize(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("Custom size must be non-negative");
        }
        if (i10 != this.f35466i) {
            this.f35466i = i10;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        getImpl().a0(f10);
    }

    public void setEnsureMinTouchTargetSize(boolean z10) {
        if (z10 != getImpl().n()) {
            getImpl().K(z10);
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(int i10) {
        this.f35473p.f(i10);
    }

    public void setHideMotionSpec(C5110g c5110g) {
        getImpl().L(c5110g);
    }

    public void setHideMotionSpecResource(int i10) {
        setHideMotionSpec(C5110g.c(getContext(), i10));
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            getImpl().Y();
            if (this.f35461d != null) {
                l();
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i10) {
        this.f35472o.i(i10);
        l();
    }

    public void setMaxImageSize(int i10) {
        this.f35468k = i10;
        getImpl().O(i10);
    }

    public void setRippleColor(int i10) {
        setRippleColor(ColorStateList.valueOf(i10));
    }

    @Override // android.view.View
    public void setScaleX(float f10) {
        super.setScaleX(f10);
        getImpl().F();
    }

    @Override // android.view.View
    public void setScaleY(float f10) {
        super.setScaleY(f10);
        getImpl().F();
    }

    public void setShadowPaddingEnabled(boolean z10) {
        getImpl().S(z10);
    }

    @Override // com.google.android.material.shape.q
    public void setShapeAppearanceModel(@NonNull n nVar) {
        getImpl().T(nVar);
    }

    public void setShowMotionSpec(C5110g c5110g) {
        getImpl().U(c5110g);
    }

    public void setShowMotionSpecResource(int i10) {
        setShowMotionSpec(C5110g.c(getContext(), i10));
    }

    public void setSize(int i10) {
        this.f35466i = 0;
        if (i10 != this.f35465h) {
            this.f35465h = i10;
            requestLayout();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.f35461d != colorStateList) {
            this.f35461d = colorStateList;
            l();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.f35462e != mode) {
            this.f35462e = mode;
            l();
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f10) {
        super.setTranslationX(f10);
        getImpl().G();
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        getImpl().G();
    }

    @Override // android.view.View
    public void setTranslationZ(float f10) {
        super.setTranslationZ(f10);
        getImpl().G();
    }

    public void setUseCompatPadding(boolean z10) {
        if (this.f35469l != z10) {
            this.f35469l = z10;
            getImpl().B();
        }
    }

    @Override // xa.p, android.widget.ImageView, android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
    }

    public static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.c {

        /* renamed from: a, reason: collision with root package name */
        public Rect f35475a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f35476b;

        public BaseBehavior() {
            this.f35476b = true;
        }

        private static boolean K(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.f) {
                return ((CoordinatorLayout.f) layoutParams).f() instanceof BottomSheetBehavior;
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: I, reason: merged with bridge method [inline-methods] */
        public boolean f(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            Rect rect2 = floatingActionButton.f35470m;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        public final boolean J(View view, FloatingActionButton floatingActionButton) {
            return (this.f35476b && ((CoordinatorLayout.f) floatingActionButton.getLayoutParams()).e() == view.getId() && floatingActionButton.getUserSetVisibility() == 0) ? false : true;
        }

        public final void L(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton) {
            Rect rect = floatingActionButton.f35470m;
            if (rect.centerX() <= 0 || rect.centerY() <= 0) {
                return;
            }
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) floatingActionButton.getLayoutParams();
            int i10 = 0;
            int i11 = floatingActionButton.getRight() >= coordinatorLayout.getWidth() - ((ViewGroup.MarginLayoutParams) fVar).rightMargin ? rect.right : floatingActionButton.getLeft() <= ((ViewGroup.MarginLayoutParams) fVar).leftMargin ? -rect.left : 0;
            if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin) {
                i10 = rect.bottom;
            } else if (floatingActionButton.getTop() <= ((ViewGroup.MarginLayoutParams) fVar).topMargin) {
                i10 = -rect.top;
            }
            if (i10 != 0) {
                AbstractC2082d0.W(floatingActionButton, i10);
            }
            if (i11 != 0) {
                AbstractC2082d0.V(floatingActionButton, i11);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: M, reason: merged with bridge method [inline-methods] */
        public boolean l(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                O(coordinatorLayout, (AppBarLayout) view, floatingActionButton);
                return false;
            }
            if (!K(view)) {
                return false;
            }
            P(view, floatingActionButton);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: N, reason: merged with bridge method [inline-methods] */
        public boolean p(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i10) {
            List m10 = coordinatorLayout.m(floatingActionButton);
            int size = m10.size();
            for (int i11 = 0; i11 < size; i11++) {
                View view = (View) m10.get(i11);
                if (!(view instanceof AppBarLayout)) {
                    if (K(view) && P(view, floatingActionButton)) {
                        break;
                    }
                } else {
                    if (O(coordinatorLayout, (AppBarLayout) view, floatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.E(floatingActionButton, i10);
            L(coordinatorLayout, floatingActionButton);
            return true;
        }

        public final boolean O(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (J(appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.f35475a == null) {
                this.f35475a = new Rect();
            }
            Rect rect = this.f35475a;
            AbstractC6816b.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.j(null, false);
                return true;
            }
            floatingActionButton.o(null, false);
            return true;
        }

        public final boolean P(View view, FloatingActionButton floatingActionButton) {
            if (J(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) floatingActionButton.getLayoutParams())).topMargin) {
                floatingActionButton.j(null, false);
                return true;
            }
            floatingActionButton.o(null, false);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void k(CoordinatorLayout.f fVar) {
            if (fVar.f18787h == 0) {
                fVar.f18787h = 80;
            }
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m.FloatingActionButton_Behavior_Layout);
            this.f35476b = obtainStyledAttributes.getBoolean(m.f48611C2, true);
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public FloatingActionButton(Context context, AttributeSet attributeSet, int i10) {
        super(La.a.d(context, attributeSet, i10, r4), attributeSet, i10);
        int i11 = f35458r;
        this.f35470m = new Rect();
        this.f35471n = new Rect();
        Context context2 = getContext();
        TypedArray i12 = xa.l.i(context2, attributeSet, m.FloatingActionButton, i10, i11, new int[0]);
        this.f35459b = Ca.c.a(context2, i12, m.f48983o2);
        this.f35460c = o.k(i12.getInt(m.f48993p2, -1), null);
        this.f35463f = Ca.c.a(context2, i12, m.f49093z2);
        this.f35465h = i12.getInt(m.f49043u2, -1);
        this.f35466i = i12.getDimensionPixelSize(m.f49033t2, 0);
        this.f35464g = i12.getDimensionPixelSize(m.f49003q2, 0);
        float dimension = i12.getDimension(m.f49013r2, 0.0f);
        float dimension2 = i12.getDimension(m.f49063w2, 0.0f);
        float dimension3 = i12.getDimension(m.f49083y2, 0.0f);
        this.f35469l = i12.getBoolean(m.f48601B2, false);
        int dimensionPixelSize = getResources().getDimensionPixelSize(e.f48371u0);
        setMaxImageSize(i12.getDimensionPixelSize(m.f49073x2, 0));
        C5110g b10 = C5110g.b(context2, i12, m.f48591A2);
        C5110g b11 = C5110g.b(context2, i12, m.f49053v2);
        n m10 = n.g(context2, attributeSet, i10, i11, n.f35814m).m();
        boolean z10 = i12.getBoolean(m.f49023s2, false);
        setEnabled(i12.getBoolean(m.f48973n2, true));
        i12.recycle();
        C2058m c2058m = new C2058m(this);
        this.f35472o = c2058m;
        c2058m.g(attributeSet, i10);
        this.f35473p = new wa.b(this);
        getImpl().T(m10);
        getImpl().x(this.f35459b, this.f35460c, this.f35463f, this.f35464g);
        getImpl().P(dimensionPixelSize);
        getImpl().J(dimension);
        getImpl().M(dimension2);
        getImpl().Q(dimension3);
        getImpl().U(b10);
        getImpl().L(b11);
        getImpl().K(z10);
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.f35463f != colorStateList) {
            this.f35463f = colorStateList;
            getImpl().R(this.f35463f);
        }
    }
}
