package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.shape.i;
import com.google.android.material.shape.j;
import ia.l;
import l.AbstractC5335a;
import n0.AbstractC5597a;
import ua.d;
import xa.m;

/* loaded from: classes3.dex */
public class MaterialToolbar extends Toolbar {

    /* renamed from: T1, reason: collision with root package name */
    public Boolean f34746T1;

    /* renamed from: g1, reason: collision with root package name */
    public Integer f34747g1;

    /* renamed from: p1, reason: collision with root package name */
    public boolean f34748p1;

    /* renamed from: x1, reason: collision with root package name */
    public boolean f34749x1;

    /* renamed from: y1, reason: collision with root package name */
    public ImageView.ScaleType f34750y1;

    /* renamed from: V1, reason: collision with root package name */
    public static final int f34745V1 = l.f48560L;
    private static final ImageView.ScaleType[] LOGO_SCALE_TYPE_ARRAY = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    public MaterialToolbar(Context context) {
        this(context, null);
    }

    public final Pair S(TextView textView, TextView textView2) {
        int measuredWidth = getMeasuredWidth();
        int i10 = measuredWidth / 2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = measuredWidth - getPaddingRight();
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                if (childAt.getRight() < i10 && childAt.getRight() > paddingLeft) {
                    paddingLeft = childAt.getRight();
                }
                if (childAt.getLeft() > i10 && childAt.getLeft() < paddingRight) {
                    paddingRight = childAt.getLeft();
                }
            }
        }
        return new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
    }

    public void T() {
        this.f34747g1 = null;
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            AbstractC5597a.r(navigationIcon.mutate()).setTintList(null);
            setNavigationIcon(navigationIcon);
        }
    }

    public final void U(Context context) {
        Drawable background = getBackground();
        ColorStateList valueOf = background == null ? ColorStateList.valueOf(0) : d.f(background);
        if (valueOf != null) {
            i iVar = new i();
            iVar.f0(valueOf);
            iVar.T(context);
            iVar.e0(getElevation());
            setBackground(iVar);
        }
    }

    public final void V(View view, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = view.getMeasuredWidth();
        int i10 = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i11 = measuredWidth2 + i10;
        int max = Math.max(Math.max(((Integer) pair.first).intValue() - i10, 0), Math.max(i11 - ((Integer) pair.second).intValue(), 0));
        if (max > 0) {
            i10 += max;
            i11 -= max;
            view.measure(View.MeasureSpec.makeMeasureSpec(i11 - i10, 1073741824), view.getMeasuredHeightAndState());
        }
        view.layout(i10, view.getTop(), i11, view.getBottom());
    }

    public final void W() {
        if (this.f34748p1 || this.f34749x1) {
            TextView e10 = m.e(this);
            TextView c10 = m.c(this);
            if (e10 == null && c10 == null) {
                return;
            }
            Pair S10 = S(e10, c10);
            if (this.f34748p1 && e10 != null) {
                V(e10, S10);
            }
            if (!this.f34749x1 || c10 == null) {
                return;
            }
            V(c10, S10);
        }
    }

    public final Drawable X(Drawable drawable) {
        if (drawable == null || this.f34747g1 == null) {
            return drawable;
        }
        Drawable r10 = AbstractC5597a.r(drawable.mutate());
        r10.setTint(this.f34747g1.intValue());
        return r10;
    }

    public final void Y() {
        ImageView b10 = m.b(this);
        if (b10 != null) {
            Boolean bool = this.f34746T1;
            if (bool != null) {
                b10.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.f34750y1;
            if (scaleType != null) {
                b10.setScaleType(scaleType);
            }
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.f34750y1;
    }

    public Integer getNavigationIconTint() {
        return this.f34747g1;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        j.e(this);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        W();
        Y();
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        j.d(this, f10);
    }

    public void setLogoAdjustViewBounds(boolean z10) {
        Boolean bool = this.f34746T1;
        if (bool == null || bool.booleanValue() != z10) {
            this.f34746T1 = Boolean.valueOf(z10);
            requestLayout();
        }
    }

    public void setLogoScaleType(@NonNull ImageView.ScaleType scaleType) {
        if (this.f34750y1 != scaleType) {
            this.f34750y1 = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        super.setNavigationIcon(X(drawable));
    }

    public void setNavigationIconTint(int i10) {
        this.f34747g1 = Integer.valueOf(i10);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z10) {
        if (this.f34749x1 != z10) {
            this.f34749x1 = z10;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z10) {
        if (this.f34748p1 != z10) {
            this.f34748p1 = z10;
            requestLayout();
        }
    }

    public MaterialToolbar(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC5335a.f54985R);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MaterialToolbar(Context context, AttributeSet attributeSet, int i10) {
        super(La.a.d(context, attributeSet, i10, r4), attributeSet, i10);
        int i11 = f34745V1;
        Context context2 = getContext();
        TypedArray i12 = xa.l.i(context2, attributeSet, ia.m.MaterialToolbar, i10, i11, new int[0]);
        if (i12.hasValue(ia.m.f48633E4)) {
            setNavigationIconTint(i12.getColor(ia.m.f48633E4, -1));
        }
        this.f34748p1 = i12.getBoolean(ia.m.f48653G4, false);
        this.f34749x1 = i12.getBoolean(ia.m.f48643F4, false);
        int i13 = i12.getInt(ia.m.f48623D4, -1);
        if (i13 >= 0) {
            ImageView.ScaleType[] scaleTypeArr = LOGO_SCALE_TYPE_ARRAY;
            if (i13 < scaleTypeArr.length) {
                this.f34750y1 = scaleTypeArr[i13];
            }
        }
        if (i12.hasValue(ia.m.f48613C4)) {
            this.f34746T1 = Boolean.valueOf(i12.getBoolean(ia.m.f48613C4, false));
        }
        i12.recycle();
        U(context2);
    }
}
