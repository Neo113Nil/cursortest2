package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.R$attr;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.google.android.material.shape.MaterialShapeDrawable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
import xsna.b0u0;
import xsna.bdl;
import xsna.fpo0;
import xsna.iut0;
import xsna.t3p0;
import xsna.tko;
import xsna.zm10;

/* loaded from: classes13.dex */
public class MaterialToolbar extends Toolbar {
    public static final int d0 = R$style.Widget_MaterialComponents_Toolbar;
    public static final ImageView.ScaleType[] e0 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    @Nullable
    public Integer V;
    public boolean W;
    public boolean a0;

    @Nullable
    public ImageView.ScaleType b0;

    @Nullable
    public Boolean c0;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MaterialToolbar(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(zm10.a(context, attributeSet, r3, r4), attributeSet, r3);
        int i = R$attr.toolbarStyle;
        int i2 = d0;
        Context context2 = getContext();
        TypedArray d = fpo0.d(context2, attributeSet, R$styleable.MaterialToolbar, i, i2, new int[0]);
        if (d.hasValue(R$styleable.MaterialToolbar_navigationIconTint)) {
            setNavigationIconTint(d.getColor(R$styleable.MaterialToolbar_navigationIconTint, -1));
        }
        this.W = d.getBoolean(R$styleable.MaterialToolbar_titleCentered, false);
        this.a0 = d.getBoolean(R$styleable.MaterialToolbar_subtitleCentered, false);
        int i3 = d.getInt(R$styleable.MaterialToolbar_logoScaleType, -1);
        if (i3 >= 0) {
            ImageView.ScaleType[] scaleTypeArr = e0;
            if (i3 < scaleTypeArr.length) {
                this.b0 = scaleTypeArr[i3];
            }
        }
        if (d.hasValue(R$styleable.MaterialToolbar_logoAdjustViewBounds)) {
            this.c0 = Boolean.valueOf(d.getBoolean(R$styleable.MaterialToolbar_logoAdjustViewBounds, false));
        }
        d.recycle();
        Drawable background = getBackground();
        ColorStateList valueOf = background == null ? ColorStateList.valueOf(0) : tko.d(background);
        if (valueOf != null) {
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
            materialShapeDrawable.setFillColor(valueOf);
            materialShapeDrawable.initializeElevationOverlay(context2);
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            materialShapeDrawable.setElevation(getElevation());
            setBackground(materialShapeDrawable);
        }
    }

    @Nullable
    public ImageView.ScaleType getLogoScaleType() {
        return this.b0;
    }

    @Nullable
    public Integer getNavigationIconTint() {
        return this.V;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public final void l(int i) {
        Menu menu = getMenu();
        boolean z = menu instanceof f;
        if (z) {
            ((f) menu).w();
        }
        super.l(i);
        if (z) {
            ((f) menu).v();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        bdl.f(this);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ImageView imageView;
        Drawable drawable;
        super.onLayout(z, i, i2, i3, i4);
        int i5 = 0;
        ImageView imageView2 = null;
        if (this.W || this.a0) {
            ArrayList b = t3p0.b(this, getTitle());
            boolean isEmpty = b.isEmpty();
            t3p0.a aVar = t3p0.a;
            TextView textView = isEmpty ? null : (TextView) Collections.min(b, aVar);
            ArrayList b2 = t3p0.b(this, getSubtitle());
            TextView textView2 = b2.isEmpty() ? null : (TextView) Collections.max(b2, aVar);
            if (textView != null || textView2 != null) {
                int measuredWidth = getMeasuredWidth();
                int i6 = measuredWidth / 2;
                int paddingLeft = getPaddingLeft();
                int paddingRight = measuredWidth - getPaddingRight();
                for (int i7 = 0; i7 < getChildCount(); i7++) {
                    View childAt = getChildAt(i7);
                    if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                        if (childAt.getRight() < i6 && childAt.getRight() > paddingLeft) {
                            paddingLeft = childAt.getRight();
                        }
                        if (childAt.getLeft() > i6 && childAt.getLeft() < paddingRight) {
                            paddingRight = childAt.getLeft();
                        }
                    }
                }
                Pair pair = new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
                if (this.W && textView != null) {
                    w(textView, pair);
                }
                if (this.a0 && textView2 != null) {
                    w(textView2, pair);
                }
            }
        }
        Drawable logo = getLogo();
        if (logo != null) {
            while (true) {
                if (i5 >= getChildCount()) {
                    break;
                }
                View childAt2 = getChildAt(i5);
                if ((childAt2 instanceof ImageView) && (drawable = (imageView = (ImageView) childAt2).getDrawable()) != null && drawable.getConstantState() != null && drawable.getConstantState().equals(logo.getConstantState())) {
                    imageView2 = imageView;
                    break;
                }
                i5++;
            }
        }
        if (imageView2 != null) {
            Boolean bool = this.c0;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.b0;
            if (scaleType != null) {
                imageView2.setScaleType(scaleType);
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        bdl.d(this, f);
    }

    public void setLogoAdjustViewBounds(boolean z) {
        Boolean bool = this.c0;
        if (bool == null || bool.booleanValue() != z) {
            this.c0 = Boolean.valueOf(z);
            requestLayout();
        }
    }

    public void setLogoScaleType(@NonNull ImageView.ScaleType scaleType) {
        if (this.b0 != scaleType) {
            this.b0 = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(@Nullable Drawable drawable) {
        if (drawable != null && this.V != null) {
            drawable = drawable.mutate();
            drawable.setTint(this.V.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i) {
        this.V = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z) {
        if (this.a0 != z) {
            this.a0 = z;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z) {
        if (this.W != z) {
            this.W = z;
            requestLayout();
        }
    }

    public final void w(TextView textView, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = textView.getMeasuredWidth();
        int i = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i2 = measuredWidth2 + i;
        int max = Math.max(Math.max(((Integer) pair.first).intValue() - i, 0), Math.max(i2 - ((Integer) pair.second).intValue(), 0));
        if (max > 0) {
            i += max;
            i2 -= max;
            textView.measure(View.MeasureSpec.makeMeasureSpec(i2 - i, 1073741824), textView.getMeasuredHeightAndState());
        }
        textView.layout(i, textView.getTop(), i2, textView.getBottom());
    }
}
