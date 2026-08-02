package s7;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.core.view.Y;
import i7.C7017a;
import ru.ozon.app.android.R;

/* renamed from: s7.e, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C9610e extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    private int f98308a;

    /* renamed from: b, reason: collision with root package name */
    private int f98309b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f98310c;

    /* renamed from: d, reason: collision with root package name */
    private int f98311d;

    public C9610e(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    protected final int a() {
        return this.f98311d;
    }

    public boolean b() {
        return this.f98310c;
    }

    protected final void c(int i11) {
        this.f98309b = i11;
    }

    protected final void d(int i11) {
        this.f98308a = i11;
    }

    public void e(boolean z11) {
        this.f98310c = z11;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int i15;
        int i16;
        if (getChildCount() == 0) {
            this.f98311d = 0;
            return;
        }
        this.f98311d = 1;
        int i17 = Y.f42258g;
        boolean z12 = getLayoutDirection() == 1;
        int paddingRight = z12 ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = z12 ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int i18 = (i13 - i11) - paddingLeft;
        int i19 = paddingRight;
        int i21 = paddingTop;
        for (int i22 = 0; i22 < getChildCount(); i22++) {
            View childAt = getChildAt(i22);
            if (childAt.getVisibility() == 8) {
                childAt.setTag(R.id.row_index_key, -1);
            } else {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i16 = marginLayoutParams.getMarginStart();
                    i15 = marginLayoutParams.getMarginEnd();
                } else {
                    i15 = 0;
                    i16 = 0;
                }
                int measuredWidth = childAt.getMeasuredWidth() + i19 + i16;
                if (!this.f98310c && measuredWidth > i18) {
                    i21 = this.f98308a + paddingTop;
                    this.f98311d++;
                    i19 = paddingRight;
                }
                childAt.setTag(R.id.row_index_key, Integer.valueOf(this.f98311d - 1));
                int i23 = i19 + i16;
                int measuredWidth2 = childAt.getMeasuredWidth() + i23;
                int measuredHeight = childAt.getMeasuredHeight() + i21;
                if (z12) {
                    childAt.layout(i18 - measuredWidth2, i21, (i18 - i19) - i16, measuredHeight);
                } else {
                    childAt.layout(i23, i21, measuredWidth2, measuredHeight);
                }
                i19 += childAt.getMeasuredWidth() + i16 + i15 + this.f98309b;
                paddingTop = measuredHeight;
            }
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int size = View.MeasureSpec.getSize(i11);
        int mode = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i12);
        int mode2 = View.MeasureSpec.getMode(i12);
        int i16 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size : Integer.MAX_VALUE;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = i16 - getPaddingRight();
        int i17 = paddingTop;
        int i18 = 0;
        for (int i19 = 0; i19 < getChildCount(); i19++) {
            View childAt = getChildAt(i19);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i11, i12);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i15 = marginLayoutParams.leftMargin;
                    i14 = marginLayoutParams.rightMargin;
                } else {
                    i14 = 0;
                    i15 = 0;
                }
                int i21 = i14;
                if (childAt.getMeasuredWidth() + paddingLeft + i15 > paddingRight && !b()) {
                    paddingLeft = getPaddingLeft();
                    i17 = paddingTop + this.f98308a;
                }
                int measuredWidth = childAt.getMeasuredWidth() + paddingLeft + i15;
                int measuredHeight = childAt.getMeasuredHeight() + i17;
                if (measuredWidth > i18) {
                    i18 = measuredWidth;
                }
                int measuredWidth2 = childAt.getMeasuredWidth() + i15 + i21 + this.f98309b + paddingLeft;
                if (i19 == getChildCount() - 1) {
                    i18 += i21;
                }
                paddingLeft = measuredWidth2;
                paddingTop = measuredHeight;
            }
        }
        int paddingRight2 = getPaddingRight() + i18;
        int paddingBottom = getPaddingBottom() + paddingTop;
        if (mode != Integer.MIN_VALUE) {
            i13 = 1073741824;
            if (mode != 1073741824) {
                size = paddingRight2;
            }
        } else {
            i13 = 1073741824;
            size = Math.min(paddingRight2, size);
        }
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(paddingBottom, size2);
        } else if (mode2 != i13) {
            size2 = paddingBottom;
        }
        setMeasuredDimension(size, size2);
    }

    public C9610e(@NonNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f98310c = false;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C7017a.f65950p, 0, 0);
        this.f98308a = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f98309b = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
    }
}
