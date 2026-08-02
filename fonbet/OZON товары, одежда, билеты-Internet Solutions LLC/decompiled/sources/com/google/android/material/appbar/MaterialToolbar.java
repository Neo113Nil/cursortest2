package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.Y;
import i7.C7017a;
import ru.ozon.app.android.R;
import s7.C9619n;
import s7.C9620o;
import y7.C10856g;
import y7.C10857h;

/* loaded from: classes9.dex */
public class MaterialToolbar extends Toolbar {

    /* renamed from: f, reason: collision with root package name */
    private static final ImageView.ScaleType[] f57948f = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* renamed from: a, reason: collision with root package name */
    private Integer f57949a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f57950b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f57951c;

    /* renamed from: d, reason: collision with root package name */
    private ImageView.ScaleType f57952d;

    /* renamed from: e, reason: collision with root package name */
    private Boolean f57953e;

    public MaterialToolbar(@NonNull Context context, AttributeSet attributeSet) {
        super(B7.a.a(context, attributeSet, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar), attributeSet, R.attr.toolbarStyle);
        Context context2 = getContext();
        TypedArray e11 = C9619n.e(context2, attributeSet, C7017a.f65921E, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar, new int[0]);
        if (e11.hasValue(2)) {
            this.f57949a = Integer.valueOf(e11.getColor(2, -1));
            Drawable navigationIcon = getNavigationIcon();
            if (navigationIcon != null) {
                setNavigationIcon(navigationIcon);
            }
        }
        this.f57950b = e11.getBoolean(4, false);
        this.f57951c = e11.getBoolean(3, false);
        int i11 = e11.getInt(1, -1);
        if (i11 >= 0) {
            ImageView.ScaleType[] scaleTypeArr = f57948f;
            if (i11 < scaleTypeArr.length) {
                this.f57952d = scaleTypeArr[i11];
            }
        }
        if (e11.hasValue(0)) {
            this.f57953e = Boolean.valueOf(e11.getBoolean(0, false));
        }
        e11.recycle();
        Drawable background = getBackground();
        if (background == null || (background instanceof ColorDrawable)) {
            C10856g c10856g = new C10856g();
            c10856g.B(ColorStateList.valueOf(background != null ? ((ColorDrawable) background).getColor() : 0));
            c10856g.v(context2);
            c10856g.A(Y.k(this));
            setBackground(c10856g);
        }
    }

    private void b(TextView textView, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = textView.getMeasuredWidth();
        int i11 = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i12 = measuredWidth2 + i11;
        int max = Math.max(Math.max(((Integer) pair.first).intValue() - i11, 0), Math.max(i12 - ((Integer) pair.second).intValue(), 0));
        if (max > 0) {
            i11 += max;
            i12 -= max;
            textView.measure(View.MeasureSpec.makeMeasureSpec(i12 - i11, 1073741824), textView.getMeasuredHeightAndState());
        }
        textView.layout(i11, textView.getTop(), i12, textView.getBottom());
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C10857h.d(this);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        Drawable drawable;
        super.onLayout(z11, i11, i12, i13, i14);
        boolean z12 = this.f57951c;
        boolean z13 = this.f57950b;
        if (z13 || z12) {
            TextView c11 = C9620o.c(this);
            TextView a11 = C9620o.a(this);
            if (c11 != null || a11 != null) {
                int measuredWidth = getMeasuredWidth();
                int i15 = measuredWidth / 2;
                int paddingLeft = getPaddingLeft();
                int paddingRight = measuredWidth - getPaddingRight();
                for (int i16 = 0; i16 < getChildCount(); i16++) {
                    View childAt = getChildAt(i16);
                    if (childAt.getVisibility() != 8 && childAt != c11 && childAt != a11) {
                        if (childAt.getRight() < i15 && childAt.getRight() > paddingLeft) {
                            paddingLeft = childAt.getRight();
                        }
                        if (childAt.getLeft() > i15 && childAt.getLeft() < paddingRight) {
                            paddingRight = childAt.getLeft();
                        }
                    }
                }
                Pair pair = new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
                if (z13 && c11 != null) {
                    b(c11, pair);
                }
                if (z12 && a11 != null) {
                    b(a11, pair);
                }
            }
        }
        Drawable logo = getLogo();
        if (logo != null) {
            for (int i17 = 0; i17 < getChildCount(); i17++) {
                View childAt2 = getChildAt(i17);
                if ((childAt2 instanceof ImageView) && (drawable = (r11 = (ImageView) childAt2).getDrawable()) != null && drawable.getConstantState() != null && drawable.getConstantState().equals(logo.getConstantState())) {
                    break;
                }
            }
        }
        ImageView imageView = null;
        if (imageView != null) {
            Boolean bool = this.f57953e;
            if (bool != null) {
                imageView.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.f57952d;
            if (scaleType != null) {
                imageView.setScaleType(scaleType);
            }
        }
    }

    @Override // android.view.View
    public final void setElevation(float f7) {
        super.setElevation(f7);
        C10857h.b(f7, this);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public final void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.f57949a != null) {
            drawable = drawable.mutate();
            androidx.core.graphics.drawable.a.i(drawable, this.f57949a.intValue());
        }
        super.setNavigationIcon(drawable);
    }
}
