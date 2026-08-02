package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.C5068m;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.Y;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.floatingactionbutton.d;
import com.google.android.material.floatingactionbutton.g;
import i7.C7017a;
import j7.C7299h;
import java.util.List;
import r7.C9214b;
import r7.InterfaceC9213a;
import ru.ozon.app.android.R;
import s7.C9609d;
import s7.C9619n;
import s7.C9621p;
import s7.C9623r;
import w7.C10444a;
import y7.C10856g;
import y7.k;
import y7.o;
import z7.C10996a;

/* loaded from: classes9.dex */
public class FloatingActionButton extends C9623r implements InterfaceC9213a, o, CoordinatorLayout.b {

    /* renamed from: b, reason: collision with root package name */
    private ColorStateList f58331b;

    /* renamed from: c, reason: collision with root package name */
    private PorterDuff.Mode f58332c;

    /* renamed from: d, reason: collision with root package name */
    private int f58333d;

    /* renamed from: e, reason: collision with root package name */
    private int f58334e;

    /* renamed from: f, reason: collision with root package name */
    private int f58335f;

    /* renamed from: g, reason: collision with root package name */
    private int f58336g;

    /* renamed from: h, reason: collision with root package name */
    boolean f58337h;

    /* renamed from: i, reason: collision with root package name */
    final Rect f58338i;

    /* renamed from: j, reason: collision with root package name */
    private final Rect f58339j;

    /* renamed from: k, reason: collision with root package name */
    @NonNull
    private final C5068m f58340k;

    /* renamed from: l, reason: collision with root package name */
    @NonNull
    private final C9214b f58341l;

    /* renamed from: m, reason: collision with root package name */
    private g f58342m;

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class a implements x7.b {
        a() {
        }
    }

    class b<T extends FloatingActionButton> implements d.f {
        @Override // com.google.android.material.floatingactionbutton.d.f
        public final void a() {
            throw null;
        }

        @Override // com.google.android.material.floatingactionbutton.d.f
        public final void b() {
            throw null;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            ((b) obj).getClass();
            throw null;
        }

        public final int hashCode() {
            throw null;
        }
    }

    public FloatingActionButton(@NonNull Context context, AttributeSet attributeSet) {
        super(B7.a.a(context, attributeSet, R.attr.floatingActionButtonStyle, R.style.Widget_Design_FloatingActionButton), attributeSet, R.attr.floatingActionButtonStyle);
        ColorStateList colorStateList;
        Drawable drawable;
        Drawable drawable2;
        this.f58338i = new Rect();
        this.f58339j = new Rect();
        Context context2 = getContext();
        TypedArray e11 = C9619n.e(context2, attributeSet, C7017a.f65948n, R.attr.floatingActionButtonStyle, R.style.Widget_Design_FloatingActionButton, new int[0]);
        this.f58331b = v7.c.a(context2, e11, 1);
        this.f58332c = C9621p.e(e11.getInt(2, -1), null);
        ColorStateList a11 = v7.c.a(context2, e11, 12);
        this.f58333d = e11.getInt(7, -1);
        this.f58334e = e11.getDimensionPixelSize(6, 0);
        int dimensionPixelSize = e11.getDimensionPixelSize(3, 0);
        float dimension = e11.getDimension(4, 0.0f);
        float dimension2 = e11.getDimension(9, 0.0f);
        float dimension3 = e11.getDimension(11, 0.0f);
        this.f58337h = e11.getBoolean(16, false);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.mtrl_fab_min_touch_target);
        int dimensionPixelSize3 = e11.getDimensionPixelSize(10, 0);
        this.f58336g = dimensionPixelSize3;
        l().y(dimensionPixelSize3);
        C7299h a12 = C7299h.a(context2, e11, 15);
        C7299h a13 = C7299h.a(context2, e11, 8);
        k a14 = k.d(context2, attributeSet, R.attr.floatingActionButtonStyle, R.style.Widget_Design_FloatingActionButton, k.f106138m).a();
        boolean z11 = e11.getBoolean(5, false);
        setEnabled(e11.getBoolean(0, true));
        e11.recycle();
        C5068m c5068m = new C5068m(this);
        this.f58340k = c5068m;
        c5068m.d(attributeSet, R.attr.floatingActionButtonStyle);
        this.f58341l = new C9214b(this);
        l().z(a14);
        d l11 = l();
        ColorStateList colorStateList2 = this.f58331b;
        PorterDuff.Mode mode = this.f58332c;
        g gVar = (g) l11;
        k kVar = gVar.f58374a;
        kVar.getClass();
        g.a aVar = new g.a(kVar);
        gVar.f58375b = aVar;
        aVar.setTintList(colorStateList2);
        if (mode != null) {
            gVar.f58375b.setTintMode(mode);
        }
        C10856g c10856g = gVar.f58375b;
        FloatingActionButton floatingActionButton = gVar.f58394u;
        c10856g.v(floatingActionButton.getContext());
        if (dimensionPixelSize > 0) {
            Context context3 = floatingActionButton.getContext();
            k kVar2 = gVar.f58374a;
            kVar2.getClass();
            com.google.android.material.floatingactionbutton.a aVar2 = new com.google.android.material.floatingactionbutton.a(kVar2);
            colorStateList = a11;
            aVar2.c(androidx.core.content.a.getColor(context3, R.color.design_fab_stroke_top_outer_color), androidx.core.content.a.getColor(context3, R.color.design_fab_stroke_top_inner_color), androidx.core.content.a.getColor(context3, R.color.design_fab_stroke_end_inner_color), androidx.core.content.a.getColor(context3, R.color.design_fab_stroke_end_outer_color));
            aVar2.b(dimensionPixelSize);
            aVar2.a(colorStateList2);
            gVar.f58377d = aVar2;
            com.google.android.material.floatingactionbutton.a aVar3 = gVar.f58377d;
            aVar3.getClass();
            C10856g c10856g2 = gVar.f58375b;
            c10856g2.getClass();
            drawable2 = new LayerDrawable(new Drawable[]{aVar3, c10856g2});
            drawable = null;
        } else {
            colorStateList = a11;
            drawable = null;
            gVar.f58377d = null;
            drawable2 = gVar.f58375b;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(C10444a.b(colorStateList), drawable2, drawable);
        gVar.f58376c = rippleDrawable;
        gVar.f58378e = rippleDrawable;
        l().f58383j = dimensionPixelSize2;
        d l12 = l();
        if (l12.f58380g != dimension) {
            l12.f58380g = dimension;
            l12.t(dimension, l12.f58381h, l12.f58382i);
        }
        d l13 = l();
        if (l13.f58381h != dimension2) {
            l13.f58381h = dimension2;
            l13.t(l13.f58380g, dimension2, l13.f58382i);
        }
        d l14 = l();
        if (l14.f58382i != dimension3) {
            l14.f58382i = dimension3;
            l14.t(l14.f58380g, l14.f58381h, dimension3);
        }
        l().A(a12);
        l().x(a13);
        l().f58379f = z11;
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    private d l() {
        if (this.f58342m == null) {
            this.f58342m = new g(this, new a());
        }
        return this.f58342m;
    }

    private int p(int i11) {
        int i12 = this.f58334e;
        if (i12 != 0) {
            return i12;
        }
        Resources resources = getResources();
        return i11 != -1 ? i11 != 1 ? resources.getDimensionPixelSize(R.dimen.design_fab_size_normal) : resources.getDimensionPixelSize(R.dimen.design_fab_size_mini) : Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? p(1) : p(0);
    }

    private void s(@NonNull Rect rect) {
        int i11 = rect.left;
        Rect rect2 = this.f58338i;
        rect.left = i11 + rect2.left;
        rect.top += rect2.top;
        rect.right -= rect2.right;
        rect.bottom -= rect2.bottom;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    @NonNull
    public final CoordinatorLayout.c<FloatingActionButton> a() {
        return new Behavior();
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        d l11 = l();
        getDrawableState();
        l11.getClass();
    }

    public final void f() {
        l().e();
    }

    public final void g(@NonNull Animator.AnimatorListener animatorListener) {
        l().f(animatorListener);
    }

    @Override // android.view.View
    public final ColorStateList getBackgroundTintList() {
        return this.f58331b;
    }

    @Override // android.view.View
    public final PorterDuff.Mode getBackgroundTintMode() {
        return this.f58332c;
    }

    public final void h() {
        l().g(new b());
    }

    @Deprecated
    public final boolean i(@NonNull Rect rect) {
        int i11 = Y.f42258g;
        if (!isLaidOut()) {
            return false;
        }
        rect.set(0, 0, getWidth(), getHeight());
        s(rect);
        return true;
    }

    @Override // r7.InterfaceC9213a
    public final boolean isExpanded() {
        return this.f58341l.b();
    }

    public final int j() {
        return this.f58341l.a();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        l().getClass();
    }

    public final C7299h k() {
        return l().m();
    }

    public final void m(@NonNull Rect rect) {
        rect.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
        s(rect);
    }

    public final C7299h n() {
        return l().o();
    }

    final int o() {
        return p(this.f58333d);
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        l().r();
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        l().s();
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onMeasure(int i11, int i12) {
        int p11 = p(this.f58333d);
        this.f58335f = (p11 - this.f58336g) / 2;
        l().F();
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        if (mode == Integer.MIN_VALUE) {
            size = Math.min(p11, size);
        } else if (mode == 0) {
            size = p11;
        } else if (mode != 1073741824) {
            throw new IllegalArgumentException();
        }
        int mode2 = View.MeasureSpec.getMode(i12);
        int size2 = View.MeasureSpec.getSize(i12);
        if (mode2 == Integer.MIN_VALUE) {
            p11 = Math.min(p11, size2);
        } else if (mode2 != 0) {
            if (mode2 != 1073741824) {
                throw new IllegalArgumentException();
            }
            p11 = size2;
        }
        int min = Math.min(size, p11);
        Rect rect = this.f58338i;
        setMeasuredDimension(rect.left + min + rect.right, min + rect.top + rect.bottom);
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C10996a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C10996a c10996a = (C10996a) parcelable;
        super.onRestoreInstanceState(c10996a.a());
        Bundle bundle = c10996a.f107308c.get("expandableWidgetHelper");
        bundle.getClass();
        this.f58341l.c(bundle);
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState == null) {
            onSaveInstanceState = new Bundle();
        }
        C10996a c10996a = new C10996a(onSaveInstanceState);
        c10996a.f107308c.put("expandableWidgetHelper", this.f58341l.d());
        return c10996a;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(@NonNull MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            Rect rect = this.f58339j;
            if (i(rect) && !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    final void q() {
        l().p();
    }

    public final boolean r() {
        return l().q();
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i11) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i11) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public final void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.f58331b != colorStateList) {
            this.f58331b = colorStateList;
            d l11 = l();
            C10856g c10856g = l11.f58375b;
            if (c10856g != null) {
                c10856g.setTintList(colorStateList);
            }
            com.google.android.material.floatingactionbutton.a aVar = l11.f58377d;
            if (aVar != null) {
                aVar.a(colorStateList);
            }
        }
    }

    @Override // android.view.View
    public final void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f58332c != mode) {
            this.f58332c = mode;
            C10856g c10856g = l().f58375b;
            if (c10856g != null) {
                c10856g.setTintMode(mode);
            }
        }
    }

    @Override // android.view.View
    public final void setElevation(float f7) {
        super.setElevation(f7);
        C10856g c10856g = l().f58375b;
        if (c10856g != null) {
            c10856g.A(f7);
        }
    }

    @Override // android.widget.ImageView
    public final void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            l().E();
        }
    }

    @Override // android.widget.ImageView
    public final void setImageResource(int i11) {
        this.f58340k.f(i11);
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        drawable.clearColorFilter();
    }

    @Override // android.view.View
    public final void setScaleX(float f7) {
        super.setScaleX(f7);
        l().v();
    }

    @Override // android.view.View
    public final void setScaleY(float f7) {
        super.setScaleY(f7);
        l().v();
    }

    @Override // y7.o
    public final void setShapeAppearanceModel(@NonNull k kVar) {
        l().z(kVar);
    }

    @Override // android.view.View
    public final void setTranslationX(float f7) {
        super.setTranslationX(f7);
        l().w();
    }

    @Override // android.view.View
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        l().w();
    }

    @Override // android.view.View
    public final void setTranslationZ(float f7) {
        super.setTranslationZ(f7);
        l().w();
    }

    @Override // s7.C9623r, android.widget.ImageView, android.view.View
    public final void setVisibility(int i11) {
        c(i11, true);
    }

    public final void t() {
        l().x(C7299h.b(R.animator.mtrl_fab_hide_motion_spec, getContext()));
    }

    public final void u() {
        l().A(C7299h.b(R.animator.mtrl_fab_show_motion_spec, getContext()));
    }

    final void v() {
        l().C();
    }

    protected static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.c<T> {

        /* renamed from: a, reason: collision with root package name */
        private Rect f58343a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f58344b;

        public BaseBehavior() {
            this.f58344b = true;
        }

        private boolean b(CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, @NonNull FloatingActionButton floatingActionButton) {
            if (!(this.f58344b && ((CoordinatorLayout.f) floatingActionButton.getLayoutParams()).b() == appBarLayout.getId() && floatingActionButton.b() == 0)) {
                return false;
            }
            if (this.f58343a == null) {
                this.f58343a = new Rect();
            }
            Rect rect = this.f58343a;
            C9609d.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.h()) {
                floatingActionButton.q();
            } else {
                floatingActionButton.v();
            }
            return true;
        }

        private boolean c(@NonNull View view, @NonNull FloatingActionButton floatingActionButton) {
            if (!(this.f58344b && ((CoordinatorLayout.f) floatingActionButton.getLayoutParams()).b() == view.getId() && floatingActionButton.b() == 0)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) floatingActionButton.getLayoutParams())).topMargin) {
                floatingActionButton.q();
            } else {
                floatingActionButton.v();
            }
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean getInsetDodgeRect(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull Rect rect) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            Rect rect2 = floatingActionButton.f58338i;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final void onAttachedToLayoutParams(@NonNull CoordinatorLayout.f fVar) {
            if (fVar.f41889h == 0) {
                fVar.f41889h = 80;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, @NonNull View view, View view2) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                b(coordinatorLayout, (AppBarLayout) view2, floatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof CoordinatorLayout.f ? ((CoordinatorLayout.f) layoutParams).c() instanceof BottomSheetBehavior : false) {
                    c(view2, floatingActionButton);
                }
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i11) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            List<View> dependencies = coordinatorLayout.getDependencies(floatingActionButton);
            int size = dependencies.size();
            int i12 = 0;
            for (int i13 = 0; i13 < size; i13++) {
                View view2 = dependencies.get(i13);
                if (!(view2 instanceof AppBarLayout)) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if ((layoutParams instanceof CoordinatorLayout.f ? ((CoordinatorLayout.f) layoutParams).c() instanceof BottomSheetBehavior : false) && c(view2, floatingActionButton)) {
                        break;
                    }
                } else {
                    if (b(coordinatorLayout, (AppBarLayout) view2, floatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.onLayoutChild(floatingActionButton, i11);
            Rect rect = floatingActionButton.f58338i;
            if (rect != null && rect.centerX() > 0 && rect.centerY() > 0) {
                CoordinatorLayout.f fVar = (CoordinatorLayout.f) floatingActionButton.getLayoutParams();
                int i14 = floatingActionButton.getRight() >= coordinatorLayout.getWidth() - ((ViewGroup.MarginLayoutParams) fVar).rightMargin ? rect.right : floatingActionButton.getLeft() <= ((ViewGroup.MarginLayoutParams) fVar).leftMargin ? -rect.left : 0;
                if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin) {
                    i12 = rect.bottom;
                } else if (floatingActionButton.getTop() <= ((ViewGroup.MarginLayoutParams) fVar).topMargin) {
                    i12 = -rect.top;
                }
                if (i12 != 0) {
                    int i15 = Y.f42258g;
                    floatingActionButton.offsetTopAndBottom(i12);
                }
                if (i14 != 0) {
                    int i16 = Y.f42258g;
                    floatingActionButton.offsetLeftAndRight(i14);
                }
            }
            return true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7017a.f65949o);
            this.f58344b = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        }
    }
}
