package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.core.view.AbstractC2082d0;
import androidx.core.view.AbstractC2112t;

/* loaded from: classes.dex */
public class LinearLayoutCompat extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public boolean f17002a;

    /* renamed from: b, reason: collision with root package name */
    public int f17003b;

    /* renamed from: c, reason: collision with root package name */
    public int f17004c;

    /* renamed from: d, reason: collision with root package name */
    public int f17005d;

    /* renamed from: e, reason: collision with root package name */
    public int f17006e;

    /* renamed from: f, reason: collision with root package name */
    public int f17007f;

    /* renamed from: g, reason: collision with root package name */
    public float f17008g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f17009h;

    /* renamed from: i, reason: collision with root package name */
    public Drawable f17010i;

    /* renamed from: j, reason: collision with root package name */
    public int f17011j;

    /* renamed from: k, reason: collision with root package name */
    public int f17012k;

    /* renamed from: l, reason: collision with root package name */
    public int f17013l;

    /* renamed from: m, reason: collision with root package name */
    public int f17014m;
    private int[] mMaxAscent;
    private int[] mMaxDescent;

    public static class a extends LinearLayout.LayoutParams {
        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public a(int i10, int i11) {
            super(i10, i11);
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    public LinearLayoutCompat(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void j(int i10, int i11) {
        int i12;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        int i13 = 0;
        while (i13 < i10) {
            View q10 = q(i13);
            if (q10.getVisibility() != 8) {
                a aVar = (a) q10.getLayoutParams();
                if (((LinearLayout.LayoutParams) aVar).width == -1) {
                    int i14 = ((LinearLayout.LayoutParams) aVar).height;
                    ((LinearLayout.LayoutParams) aVar).height = q10.getMeasuredHeight();
                    i12 = i11;
                    measureChildWithMargins(q10, makeMeasureSpec, 0, i12, 0);
                    ((LinearLayout.LayoutParams) aVar).height = i14;
                    i13++;
                    i11 = i12;
                }
            }
            i12 = i11;
            i13++;
            i11 = i12;
        }
    }

    private void y(View view, int i10, int i11, int i12, int i13) {
        view.layout(i10, i11, i12 + i10, i13 + i11);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    public void e(Canvas canvas) {
        int right;
        int left;
        int i10;
        int virtualChildCount = getVirtualChildCount();
        boolean b10 = l0.b(this);
        for (int i11 = 0; i11 < virtualChildCount; i11++) {
            View q10 = q(i11);
            if (q10 != null && q10.getVisibility() != 8 && r(i11)) {
                a aVar = (a) q10.getLayoutParams();
                h(canvas, b10 ? q10.getRight() + ((LinearLayout.LayoutParams) aVar).rightMargin : (q10.getLeft() - ((LinearLayout.LayoutParams) aVar).leftMargin) - this.f17011j);
            }
        }
        if (r(virtualChildCount)) {
            View q11 = q(virtualChildCount - 1);
            if (q11 != null) {
                a aVar2 = (a) q11.getLayoutParams();
                if (b10) {
                    left = q11.getLeft() - ((LinearLayout.LayoutParams) aVar2).leftMargin;
                    i10 = this.f17011j;
                    right = left - i10;
                } else {
                    right = q11.getRight() + ((LinearLayout.LayoutParams) aVar2).rightMargin;
                }
            } else if (b10) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i10 = this.f17011j;
                right = left - i10;
            }
            h(canvas, right);
        }
    }

    public void f(Canvas canvas) {
        int virtualChildCount = getVirtualChildCount();
        for (int i10 = 0; i10 < virtualChildCount; i10++) {
            View q10 = q(i10);
            if (q10 != null && q10.getVisibility() != 8 && r(i10)) {
                g(canvas, (q10.getTop() - ((LinearLayout.LayoutParams) ((a) q10.getLayoutParams())).topMargin) - this.f17012k);
            }
        }
        if (r(virtualChildCount)) {
            View q11 = q(virtualChildCount - 1);
            g(canvas, q11 == null ? (getHeight() - getPaddingBottom()) - this.f17012k : q11.getBottom() + ((LinearLayout.LayoutParams) ((a) q11.getLayoutParams())).bottomMargin);
        }
    }

    public void g(Canvas canvas, int i10) {
        this.f17010i.setBounds(getPaddingLeft() + this.f17014m, i10, (getWidth() - getPaddingRight()) - this.f17014m, this.f17012k + i10);
        this.f17010i.draw(canvas);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i10;
        if (this.f17003b < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i11 = this.f17003b;
        if (childCount <= i11) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i11);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f17003b == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int i12 = this.f17004c;
        if (this.f17005d == 1 && (i10 = this.f17006e & 112) != 48) {
            if (i10 == 16) {
                i12 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f17007f) / 2;
            } else if (i10 == 80) {
                i12 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f17007f;
            }
        }
        return i12 + ((LinearLayout.LayoutParams) ((a) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f17003b;
    }

    public Drawable getDividerDrawable() {
        return this.f17010i;
    }

    public int getDividerPadding() {
        return this.f17014m;
    }

    public int getDividerWidth() {
        return this.f17011j;
    }

    public int getGravity() {
        return this.f17006e;
    }

    public int getOrientation() {
        return this.f17005d;
    }

    public int getShowDividers() {
        return this.f17013l;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f17008g;
    }

    public void h(Canvas canvas, int i10) {
        this.f17010i.setBounds(i10, getPaddingTop() + this.f17014m, this.f17011j + i10, (getHeight() - getPaddingBottom()) - this.f17014m);
        this.f17010i.draw(canvas);
    }

    public final void i(int i10, int i11) {
        int i12;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        int i13 = 0;
        while (i13 < i10) {
            View q10 = q(i13);
            if (q10.getVisibility() != 8) {
                a aVar = (a) q10.getLayoutParams();
                if (((LinearLayout.LayoutParams) aVar).height == -1) {
                    int i14 = ((LinearLayout.LayoutParams) aVar).width;
                    ((LinearLayout.LayoutParams) aVar).width = q10.getMeasuredWidth();
                    i12 = i11;
                    measureChildWithMargins(q10, i12, 0, makeMeasureSpec, 0);
                    ((LinearLayout.LayoutParams) aVar).width = i14;
                    i13++;
                    i11 = i12;
                }
            }
            i12 = i11;
            i13++;
            i11 = i12;
        }
    }

    @Override // android.view.ViewGroup
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public a generateDefaultLayoutParams() {
        int i10 = this.f17005d;
        if (i10 == 0) {
            return new a(-2, -2);
        }
        if (i10 == 1) {
            return new a(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a ? new a((ViewGroup.MarginLayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new a((ViewGroup.MarginLayoutParams) layoutParams) : new a(layoutParams);
    }

    public int n(View view, int i10) {
        return 0;
    }

    public int o(View view) {
        return 0;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.f17010i == null) {
            return;
        }
        if (this.f17005d == 1) {
            f(canvas);
        } else {
            e(canvas);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        if (this.f17005d == 1) {
            t(i10, i11, i12, i13);
        } else {
            s(i10, i11, i12, i13);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        if (this.f17005d == 1) {
            x(i10, i11);
        } else {
            v(i10, i11);
        }
    }

    public int p(View view) {
        return 0;
    }

    public View q(int i10) {
        return getChildAt(i10);
    }

    public boolean r(int i10) {
        if (i10 == 0) {
            return (this.f17013l & 1) != 0;
        }
        if (i10 == getChildCount()) {
            return (this.f17013l & 4) != 0;
        }
        if ((this.f17013l & 2) != 0) {
            for (int i11 = i10 - 1; i11 >= 0; i11--) {
                if (getChildAt(i11).getVisibility() != 8) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void s(int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        char c10;
        boolean z10;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        boolean b10 = l0.b(this);
        int paddingTop = getPaddingTop();
        int i24 = i13 - i11;
        int paddingBottom = i24 - getPaddingBottom();
        int paddingBottom2 = (i24 - paddingTop) - getPaddingBottom();
        int virtualChildCount = getVirtualChildCount();
        int i25 = this.f17006e;
        int i26 = i25 & 112;
        boolean z11 = this.f17002a;
        int[] iArr = this.mMaxAscent;
        int[] iArr2 = this.mMaxDescent;
        int b11 = AbstractC2112t.b(8388615 & i25, getLayoutDirection());
        char c11 = 2;
        boolean z12 = true;
        int paddingLeft = b11 != 1 ? b11 != 5 ? getPaddingLeft() : ((getPaddingLeft() + i12) - i10) - this.f17007f : getPaddingLeft() + (((i12 - i10) - this.f17007f) / 2);
        if (b10) {
            i14 = virtualChildCount - 1;
            i15 = -1;
        } else {
            i14 = 0;
            i15 = 1;
        }
        int i27 = 0;
        while (i27 < virtualChildCount) {
            int i28 = i14 + (i15 * i27);
            int i29 = i27;
            View q10 = q(i28);
            if (q10 == null) {
                paddingLeft += w(i28);
                i17 = i29;
                i16 = paddingTop;
                c10 = c11;
                z10 = z12;
            } else {
                c10 = c11;
                z10 = z12;
                if (q10.getVisibility() != 8) {
                    int measuredWidth = q10.getMeasuredWidth();
                    int measuredHeight = q10.getMeasuredHeight();
                    a aVar = (a) q10.getLayoutParams();
                    int i30 = paddingLeft;
                    if (z11) {
                        i18 = measuredHeight;
                        if (((LinearLayout.LayoutParams) aVar).height != -1) {
                            i19 = q10.getBaseline();
                            i20 = ((LinearLayout.LayoutParams) aVar).gravity;
                            if (i20 < 0) {
                                i20 = i26;
                            }
                            i21 = i20 & 112;
                            i16 = paddingTop;
                            if (i21 == 16) {
                                if (i21 == 48) {
                                    i22 = i16 + ((LinearLayout.LayoutParams) aVar).topMargin;
                                    if (i19 != -1) {
                                        i22 += iArr[z10 ? 1 : 0] - i19;
                                    }
                                } else if (i21 != 80) {
                                    i22 = i16;
                                } else {
                                    i22 = (paddingBottom - i18) - ((LinearLayout.LayoutParams) aVar).bottomMargin;
                                    if (i19 != -1) {
                                        i23 = iArr2[c10] - (q10.getMeasuredHeight() - i19);
                                    }
                                }
                                int i31 = ((LinearLayout.LayoutParams) aVar).leftMargin + (r(i28) ? i30 + this.f17011j : i30);
                                y(q10, o(q10) + i31, i22, measuredWidth, i18);
                                int p10 = i31 + ((LinearLayout.LayoutParams) aVar).rightMargin + measuredWidth + p(q10);
                                i17 = n(q10, i28) + i29;
                                paddingLeft = p10;
                            } else {
                                i22 = i16 + ((paddingBottom2 - i18) / 2) + ((LinearLayout.LayoutParams) aVar).topMargin;
                                i23 = ((LinearLayout.LayoutParams) aVar).bottomMargin;
                            }
                            i22 -= i23;
                            int i312 = ((LinearLayout.LayoutParams) aVar).leftMargin + (r(i28) ? i30 + this.f17011j : i30);
                            y(q10, o(q10) + i312, i22, measuredWidth, i18);
                            int p102 = i312 + ((LinearLayout.LayoutParams) aVar).rightMargin + measuredWidth + p(q10);
                            i17 = n(q10, i28) + i29;
                            paddingLeft = p102;
                        }
                    } else {
                        i18 = measuredHeight;
                    }
                    i19 = -1;
                    i20 = ((LinearLayout.LayoutParams) aVar).gravity;
                    if (i20 < 0) {
                    }
                    i21 = i20 & 112;
                    i16 = paddingTop;
                    if (i21 == 16) {
                    }
                    i22 -= i23;
                    int i3122 = ((LinearLayout.LayoutParams) aVar).leftMargin + (r(i28) ? i30 + this.f17011j : i30);
                    y(q10, o(q10) + i3122, i22, measuredWidth, i18);
                    int p1022 = i3122 + ((LinearLayout.LayoutParams) aVar).rightMargin + measuredWidth + p(q10);
                    i17 = n(q10, i28) + i29;
                    paddingLeft = p1022;
                } else {
                    i16 = paddingTop;
                    i17 = i29;
                }
            }
            i27 = i17 + 1;
            c11 = c10;
            z12 = z10;
            paddingTop = i16;
        }
    }

    public void setBaselineAligned(boolean z10) {
        this.f17002a = z10;
    }

    public void setBaselineAlignedChildIndex(int i10) {
        if (i10 >= 0 && i10 < getChildCount()) {
            this.f17003b = i10;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f17010i) {
            return;
        }
        this.f17010i = drawable;
        if (drawable != null) {
            this.f17011j = drawable.getIntrinsicWidth();
            this.f17012k = drawable.getIntrinsicHeight();
        } else {
            this.f17011j = 0;
            this.f17012k = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i10) {
        this.f17014m = i10;
    }

    public void setGravity(int i10) {
        if (this.f17006e != i10) {
            if ((8388615 & i10) == 0) {
                i10 |= 8388611;
            }
            if ((i10 & 112) == 0) {
                i10 |= 48;
            }
            this.f17006e = i10;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i10) {
        int i11 = i10 & 8388615;
        int i12 = this.f17006e;
        if ((8388615 & i12) != i11) {
            this.f17006e = i11 | ((-8388616) & i12);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z10) {
        this.f17009h = z10;
    }

    public void setOrientation(int i10) {
        if (this.f17005d != i10) {
            this.f17005d = i10;
            requestLayout();
        }
    }

    public void setShowDividers(int i10) {
        if (i10 != this.f17013l) {
            requestLayout();
        }
        this.f17013l = i10;
    }

    public void setVerticalGravity(int i10) {
        int i11 = i10 & 112;
        int i12 = this.f17006e;
        if ((i12 & 112) != i11) {
            this.f17006e = i11 | (i12 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f10) {
        this.f17008g = Math.max(0.0f, f10);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void t(int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        int paddingLeft = getPaddingLeft();
        int i17 = i12 - i10;
        int paddingRight = i17 - getPaddingRight();
        int paddingRight2 = (i17 - paddingLeft) - getPaddingRight();
        int virtualChildCount = getVirtualChildCount();
        int i18 = this.f17006e;
        int i19 = i18 & 112;
        int i20 = i18 & 8388615;
        int paddingTop = i19 != 16 ? i19 != 80 ? getPaddingTop() : ((getPaddingTop() + i13) - i11) - this.f17007f : getPaddingTop() + (((i13 - i11) - this.f17007f) / 2);
        int i21 = 0;
        while (i21 < virtualChildCount) {
            View q10 = q(i21);
            if (q10 == null) {
                paddingTop += w(i21);
            } else if (q10.getVisibility() != 8) {
                int measuredWidth = q10.getMeasuredWidth();
                int measuredHeight = q10.getMeasuredHeight();
                a aVar = (a) q10.getLayoutParams();
                int i22 = ((LinearLayout.LayoutParams) aVar).gravity;
                if (i22 < 0) {
                    i22 = i20;
                }
                int b10 = AbstractC2112t.b(i22, getLayoutDirection()) & 7;
                if (b10 == 1) {
                    i14 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((LinearLayout.LayoutParams) aVar).leftMargin;
                    i15 = ((LinearLayout.LayoutParams) aVar).rightMargin;
                } else if (b10 != 5) {
                    i16 = ((LinearLayout.LayoutParams) aVar).leftMargin + paddingLeft;
                    int i23 = i16;
                    if (r(i21)) {
                        paddingTop += this.f17012k;
                    }
                    int i24 = paddingTop + ((LinearLayout.LayoutParams) aVar).topMargin;
                    y(q10, i23, i24 + o(q10), measuredWidth, measuredHeight);
                    paddingTop = i24 + measuredHeight + ((LinearLayout.LayoutParams) aVar).bottomMargin + p(q10);
                    i21 += n(q10, i21);
                    i21++;
                } else {
                    i14 = paddingRight - measuredWidth;
                    i15 = ((LinearLayout.LayoutParams) aVar).rightMargin;
                }
                i16 = i14 - i15;
                int i232 = i16;
                if (r(i21)) {
                }
                int i242 = paddingTop + ((LinearLayout.LayoutParams) aVar).topMargin;
                y(q10, i232, i242 + o(q10), measuredWidth, measuredHeight);
                paddingTop = i242 + measuredHeight + ((LinearLayout.LayoutParams) aVar).bottomMargin + p(q10);
                i21 += n(q10, i21);
                i21++;
            }
            i21++;
        }
    }

    public void u(View view, int i10, int i11, int i12, int i13, int i14) {
        measureChildWithMargins(view, i11, i12, i13, i14);
    }

    /* JADX WARN: Removed duplicated region for block: B:180:0x0461  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void v(int i10, int i11) {
        int i12;
        int i13;
        float f10;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        boolean z10;
        int baseline;
        int i21;
        int i22;
        float f11;
        int i23;
        char c10;
        int i24;
        boolean z11;
        int i25;
        int i26;
        int i27;
        int[] iArr;
        int i28;
        int i29;
        boolean z12;
        int[] iArr2;
        View view;
        boolean z13;
        boolean z14;
        int baseline2;
        this.f17007f = 0;
        int virtualChildCount = getVirtualChildCount();
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        if (this.mMaxAscent == null || this.mMaxDescent == null) {
            this.mMaxAscent = new int[4];
            this.mMaxDescent = new int[4];
        }
        int[] iArr3 = this.mMaxAscent;
        int[] iArr4 = this.mMaxDescent;
        iArr3[3] = -1;
        iArr3[2] = -1;
        iArr3[1] = -1;
        iArr3[0] = -1;
        iArr4[3] = -1;
        iArr4[2] = -1;
        iArr4[1] = -1;
        iArr4[0] = -1;
        boolean z15 = this.f17002a;
        boolean z16 = this.f17009h;
        int i30 = 1073741824;
        boolean z17 = mode == 1073741824;
        boolean z18 = z16;
        int i31 = 0;
        int i32 = 0;
        int i33 = 0;
        boolean z19 = false;
        int i34 = 0;
        boolean z20 = false;
        boolean z21 = true;
        float f12 = 0.0f;
        int i35 = 0;
        int i36 = 0;
        while (true) {
            i12 = i32;
            if (i31 >= virtualChildCount) {
                break;
            }
            boolean z22 = z15;
            View q10 = q(i31);
            if (q10 == null) {
                this.f17007f += w(i31);
            } else if (q10.getVisibility() == 8) {
                i31 += n(q10, i31);
            } else {
                if (r(i31)) {
                    this.f17007f += this.f17011j;
                }
                a aVar = (a) q10.getLayoutParams();
                float f13 = ((LinearLayout.LayoutParams) aVar).weight;
                float f14 = f12 + f13;
                if (mode == i30 && ((LinearLayout.LayoutParams) aVar).width == 0 && f13 > 0.0f) {
                    if (z17) {
                        this.f17007f += ((LinearLayout.LayoutParams) aVar).leftMargin + ((LinearLayout.LayoutParams) aVar).rightMargin;
                    } else {
                        int i37 = this.f17007f;
                        this.f17007f = Math.max(i37, ((LinearLayout.LayoutParams) aVar).leftMargin + i37 + ((LinearLayout.LayoutParams) aVar).rightMargin);
                    }
                    if (z22) {
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                        q10.measure(makeMeasureSpec, makeMeasureSpec);
                        i26 = virtualChildCount;
                        i27 = mode;
                        iArr = iArr3;
                        iArr2 = iArr4;
                    } else {
                        i26 = virtualChildCount;
                        i27 = mode;
                        iArr = iArr3;
                        iArr2 = iArr4;
                        z19 = true;
                    }
                    i28 = i12;
                    i29 = 1073741824;
                    z12 = z18;
                    view = q10;
                } else {
                    if (((LinearLayout.LayoutParams) aVar).width != 0 || f13 <= 0.0f) {
                        c10 = 65534;
                        i24 = Integer.MIN_VALUE;
                    } else {
                        c10 = 65534;
                        ((LinearLayout.LayoutParams) aVar).width = -2;
                        i24 = 0;
                    }
                    if (f14 == 0.0f) {
                        z11 = z18;
                        i25 = this.f17007f;
                    } else {
                        z11 = z18;
                        i25 = 0;
                    }
                    i26 = virtualChildCount;
                    i27 = mode;
                    iArr = iArr3;
                    i28 = i12;
                    i29 = 1073741824;
                    z12 = z11;
                    iArr2 = iArr4;
                    int i38 = i24;
                    u(q10, i31, i10, i25, i11, 0);
                    view = q10;
                    if (i38 != Integer.MIN_VALUE) {
                        ((LinearLayout.LayoutParams) aVar).width = i38;
                    }
                    int measuredWidth = view.getMeasuredWidth();
                    if (z17) {
                        this.f17007f += ((LinearLayout.LayoutParams) aVar).leftMargin + measuredWidth + ((LinearLayout.LayoutParams) aVar).rightMargin + p(view);
                    } else {
                        int i39 = this.f17007f;
                        this.f17007f = Math.max(i39, i39 + measuredWidth + ((LinearLayout.LayoutParams) aVar).leftMargin + ((LinearLayout.LayoutParams) aVar).rightMargin + p(view));
                    }
                    if (z12) {
                        i33 = Math.max(measuredWidth, i33);
                    }
                }
                if (mode2 == i29 || ((LinearLayout.LayoutParams) aVar).height != -1) {
                    z13 = false;
                } else {
                    z13 = true;
                    z20 = true;
                }
                int i40 = ((LinearLayout.LayoutParams) aVar).topMargin + ((LinearLayout.LayoutParams) aVar).bottomMargin;
                int measuredHeight = view.getMeasuredHeight() + i40;
                i34 = View.combineMeasuredStates(i34, view.getMeasuredState());
                if (!z22 || (baseline2 = view.getBaseline()) == -1) {
                    z14 = z13;
                } else {
                    int i41 = ((LinearLayout.LayoutParams) aVar).gravity;
                    if (i41 < 0) {
                        i41 = this.f17006e;
                    }
                    int i42 = (((i41 & 112) >> 4) & (-2)) >> 1;
                    z14 = z13;
                    iArr[i42] = Math.max(iArr[i42], baseline2);
                    iArr2[i42] = Math.max(iArr2[i42], measuredHeight - baseline2);
                }
                int max = Math.max(i28, measuredHeight);
                z21 = z21 && ((LinearLayout.LayoutParams) aVar).height == -1;
                if (((LinearLayout.LayoutParams) aVar).weight > 0.0f) {
                    if (!z14) {
                        i40 = measuredHeight;
                    }
                    i36 = Math.max(i36, i40);
                } else {
                    if (!z14) {
                        i40 = measuredHeight;
                    }
                    i35 = Math.max(i35, i40);
                }
                i31 += n(view, i31);
                i32 = max;
                f12 = f14;
                i31++;
                z18 = z12;
                iArr4 = iArr2;
                z15 = z22;
                mode = i27;
                iArr3 = iArr;
                virtualChildCount = i26;
                i30 = 1073741824;
            }
            i26 = virtualChildCount;
            i27 = mode;
            iArr = iArr3;
            iArr2 = iArr4;
            i32 = i12;
            z12 = z18;
            i31++;
            z18 = z12;
            iArr4 = iArr2;
            z15 = z22;
            mode = i27;
            iArr3 = iArr;
            virtualChildCount = i26;
            i30 = 1073741824;
        }
        boolean z23 = z15;
        int i43 = virtualChildCount;
        int i44 = mode;
        int[] iArr5 = iArr3;
        int[] iArr6 = iArr4;
        int i45 = i34;
        boolean z24 = z18;
        if (this.f17007f > 0) {
            i13 = i43;
            if (r(i13)) {
                this.f17007f += this.f17011j;
            }
        } else {
            i13 = i43;
        }
        int i46 = iArr5[1];
        int max2 = (i46 == -1 && iArr5[0] == -1 && iArr5[2] == -1 && iArr5[3] == -1) ? i12 : Math.max(i12, Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i46, iArr5[2]))) + Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[2]))));
        if (z24) {
            i14 = i44;
            if (i14 == Integer.MIN_VALUE || i14 == 0) {
                this.f17007f = 0;
                int i47 = 0;
                while (i47 < i13) {
                    View q11 = q(i47);
                    if (q11 == null) {
                        this.f17007f += w(i47);
                    } else if (q11.getVisibility() == 8) {
                        i47 += n(q11, i47);
                    } else {
                        a aVar2 = (a) q11.getLayoutParams();
                        if (z17) {
                            f11 = f12;
                            this.f17007f += ((LinearLayout.LayoutParams) aVar2).leftMargin + i33 + ((LinearLayout.LayoutParams) aVar2).rightMargin + p(q11);
                            i23 = max2;
                            i47++;
                            f12 = f11;
                            max2 = i23;
                        } else {
                            f11 = f12;
                            int i48 = this.f17007f;
                            i23 = max2;
                            this.f17007f = Math.max(i48, i48 + i33 + ((LinearLayout.LayoutParams) aVar2).leftMargin + ((LinearLayout.LayoutParams) aVar2).rightMargin + p(q11));
                            i47++;
                            f12 = f11;
                            max2 = i23;
                        }
                    }
                    f11 = f12;
                    i23 = max2;
                    i47++;
                    f12 = f11;
                    max2 = i23;
                }
            }
            f10 = f12;
        } else {
            f10 = f12;
            i14 = i44;
        }
        int i49 = max2;
        int paddingLeft = this.f17007f + getPaddingLeft() + getPaddingRight();
        this.f17007f = paddingLeft;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i10, 0);
        int i50 = (16777215 & resolveSizeAndState) - this.f17007f;
        if (z19 || (i50 != 0 && f10 > 0.0f)) {
            float f15 = this.f17008g;
            if (f15 > 0.0f) {
                f10 = f15;
            }
            iArr5[3] = -1;
            iArr5[2] = -1;
            iArr5[1] = -1;
            iArr5[0] = -1;
            iArr6[3] = -1;
            iArr6[2] = -1;
            iArr6[1] = -1;
            iArr6[0] = -1;
            this.f17007f = 0;
            int i51 = i45;
            int i52 = -1;
            int i53 = 0;
            while (i53 < i13) {
                View q12 = q(i53);
                if (q12 == null || q12.getVisibility() == 8) {
                    i19 = resolveSizeAndState;
                } else {
                    a aVar3 = (a) q12.getLayoutParams();
                    float f16 = ((LinearLayout.LayoutParams) aVar3).weight;
                    if (f16 > 0.0f) {
                        int i54 = (int) ((i50 * f16) / f10);
                        f10 -= f16;
                        i50 -= i54;
                        i19 = resolveSizeAndState;
                        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i11, getPaddingTop() + getPaddingBottom() + ((LinearLayout.LayoutParams) aVar3).topMargin + ((LinearLayout.LayoutParams) aVar3).bottomMargin, ((LinearLayout.LayoutParams) aVar3).height);
                        if (((LinearLayout.LayoutParams) aVar3).width == 0) {
                            i22 = 1073741824;
                            if (i14 == 1073741824) {
                                if (i54 <= 0) {
                                    i54 = 0;
                                }
                                q12.measure(View.MeasureSpec.makeMeasureSpec(i54, 1073741824), childMeasureSpec);
                                i51 = View.combineMeasuredStates(i51, q12.getMeasuredState() & (-16777216));
                            }
                        } else {
                            i22 = 1073741824;
                        }
                        int measuredWidth2 = q12.getMeasuredWidth() + i54;
                        if (measuredWidth2 < 0) {
                            measuredWidth2 = 0;
                        }
                        q12.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth2, i22), childMeasureSpec);
                        i51 = View.combineMeasuredStates(i51, q12.getMeasuredState() & (-16777216));
                    } else {
                        i19 = resolveSizeAndState;
                    }
                    if (z17) {
                        this.f17007f += q12.getMeasuredWidth() + ((LinearLayout.LayoutParams) aVar3).leftMargin + ((LinearLayout.LayoutParams) aVar3).rightMargin + p(q12);
                    } else {
                        int i55 = this.f17007f;
                        this.f17007f = Math.max(i55, q12.getMeasuredWidth() + i55 + ((LinearLayout.LayoutParams) aVar3).leftMargin + ((LinearLayout.LayoutParams) aVar3).rightMargin + p(q12));
                    }
                    boolean z25 = mode2 != 1073741824 && ((LinearLayout.LayoutParams) aVar3).height == -1;
                    int i56 = ((LinearLayout.LayoutParams) aVar3).topMargin + ((LinearLayout.LayoutParams) aVar3).bottomMargin;
                    int measuredHeight2 = q12.getMeasuredHeight() + i56;
                    i52 = Math.max(i52, measuredHeight2);
                    if (!z25) {
                        i56 = measuredHeight2;
                    }
                    int max3 = Math.max(i35, i56);
                    if (z21) {
                        i20 = -1;
                        if (((LinearLayout.LayoutParams) aVar3).height == -1) {
                            z10 = true;
                            if (z23 && (baseline = q12.getBaseline()) != i20) {
                                i21 = ((LinearLayout.LayoutParams) aVar3).gravity;
                                if (i21 < 0) {
                                    i21 = this.f17006e;
                                }
                                int i57 = (((i21 & 112) >> 4) & (-2)) >> 1;
                                iArr5[i57] = Math.max(iArr5[i57], baseline);
                                iArr6[i57] = Math.max(iArr6[i57], measuredHeight2 - baseline);
                            }
                            i35 = max3;
                            z21 = z10;
                        }
                    } else {
                        i20 = -1;
                    }
                    z10 = false;
                    if (z23) {
                        i21 = ((LinearLayout.LayoutParams) aVar3).gravity;
                        if (i21 < 0) {
                        }
                        int i572 = (((i21 & 112) >> 4) & (-2)) >> 1;
                        iArr5[i572] = Math.max(iArr5[i572], baseline);
                        iArr6[i572] = Math.max(iArr6[i572], measuredHeight2 - baseline);
                    }
                    i35 = max3;
                    z21 = z10;
                }
                i53++;
                resolveSizeAndState = i19;
            }
            i15 = resolveSizeAndState;
            i16 = -16777216;
            this.f17007f += getPaddingLeft() + getPaddingRight();
            int i58 = iArr5[1];
            i49 = (i58 == -1 && iArr5[0] == -1 && iArr5[2] == -1 && iArr5[3] == -1) ? i52 : Math.max(i52, Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i58, iArr5[2]))) + Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[2]))));
            i17 = i51;
            i18 = i35;
        } else {
            i18 = Math.max(i35, i36);
            if (z24 && i14 != 1073741824) {
                for (int i59 = 0; i59 < i13; i59++) {
                    View q13 = q(i59);
                    if (q13 != null && q13.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((a) q13.getLayoutParams())).weight > 0.0f) {
                        q13.measure(View.MeasureSpec.makeMeasureSpec(i33, 1073741824), View.MeasureSpec.makeMeasureSpec(q13.getMeasuredHeight(), 1073741824));
                    }
                }
            }
            i15 = resolveSizeAndState;
            i17 = i45;
            i16 = -16777216;
        }
        if (z21 || mode2 == 1073741824) {
            i18 = i49;
        }
        setMeasuredDimension(i15 | (i17 & i16), View.resolveSizeAndState(Math.max(i18 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i11, i17 << 16));
        if (z20) {
            i(i13, i10);
        }
    }

    public int w(int i10) {
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0160  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void x(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        View view;
        boolean z10;
        int i25;
        boolean z11;
        int max;
        int i26;
        this.f17007f = 0;
        int virtualChildCount = getVirtualChildCount();
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int i27 = this.f17003b;
        boolean z12 = this.f17009h;
        int i28 = 0;
        int i29 = 0;
        int i30 = 0;
        int i31 = 0;
        int i32 = 0;
        int i33 = 0;
        boolean z13 = false;
        boolean z14 = false;
        float f10 = 0.0f;
        boolean z15 = true;
        while (true) {
            int i34 = 8;
            if (i28 >= virtualChildCount) {
                float f11 = f10;
                int i35 = i29;
                int i36 = virtualChildCount;
                int i37 = mode2;
                boolean z16 = z12;
                int i38 = i30;
                int i39 = i31;
                int i40 = i32;
                if (this.f17007f > 0) {
                    i12 = i36;
                    if (r(i12)) {
                        this.f17007f += this.f17012k;
                    }
                } else {
                    i12 = i36;
                }
                int i41 = i37;
                if (z16 && (i41 == Integer.MIN_VALUE || i41 == 0)) {
                    this.f17007f = 0;
                    int i42 = 0;
                    while (i42 < i12) {
                        View q10 = q(i42);
                        if (q10 == null) {
                            this.f17007f += w(i42);
                        } else if (q10.getVisibility() == i34) {
                            i42 += n(q10, i42);
                        } else {
                            a aVar = (a) q10.getLayoutParams();
                            int i43 = this.f17007f;
                            this.f17007f = Math.max(i43, i43 + i38 + ((LinearLayout.LayoutParams) aVar).topMargin + ((LinearLayout.LayoutParams) aVar).bottomMargin + p(q10));
                        }
                        i42++;
                        i34 = 8;
                    }
                }
                int paddingTop = this.f17007f + getPaddingTop() + getPaddingBottom();
                this.f17007f = paddingTop;
                int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i11, 0);
                int i44 = (16777215 & resolveSizeAndState) - this.f17007f;
                if (z13 || (i44 != 0 && f11 > 0.0f)) {
                    float f12 = this.f17008g;
                    if (f12 <= 0.0f) {
                        f12 = f11;
                    }
                    this.f17007f = 0;
                    float f13 = f12;
                    int i45 = i44;
                    int i46 = 0;
                    while (i46 < i12) {
                        View q11 = q(i46);
                        if (q11.getVisibility() == 8) {
                            i14 = i41;
                            i15 = i46;
                        } else {
                            a aVar2 = (a) q11.getLayoutParams();
                            float f14 = ((LinearLayout.LayoutParams) aVar2).weight;
                            if (f14 > 0.0f) {
                                i15 = i46;
                                int i47 = (int) ((i45 * f14) / f13);
                                f13 -= f14;
                                i45 -= i47;
                                int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + ((LinearLayout.LayoutParams) aVar2).leftMargin + ((LinearLayout.LayoutParams) aVar2).rightMargin, ((LinearLayout.LayoutParams) aVar2).width);
                                if (((LinearLayout.LayoutParams) aVar2).height == 0) {
                                    i17 = 1073741824;
                                    if (i41 == 1073741824) {
                                        i14 = i41;
                                        q11.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i47 > 0 ? i47 : 0, 1073741824));
                                        i40 = View.combineMeasuredStates(i40, q11.getMeasuredState() & (-256));
                                    }
                                } else {
                                    i17 = 1073741824;
                                }
                                i14 = i41;
                                int measuredHeight = q11.getMeasuredHeight() + i47;
                                if (measuredHeight < 0) {
                                    measuredHeight = 0;
                                }
                                q11.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight, i17));
                                i40 = View.combineMeasuredStates(i40, q11.getMeasuredState() & (-256));
                            } else {
                                i14 = i41;
                                i15 = i46;
                            }
                            int i48 = ((LinearLayout.LayoutParams) aVar2).leftMargin + ((LinearLayout.LayoutParams) aVar2).rightMargin;
                            int measuredWidth = q11.getMeasuredWidth() + i48;
                            i39 = Math.max(i39, measuredWidth);
                            if (mode != 1073741824) {
                                i16 = -1;
                                if (((LinearLayout.LayoutParams) aVar2).width == -1) {
                                    measuredWidth = i48;
                                }
                            } else {
                                i16 = -1;
                            }
                            int max2 = Math.max(i33, measuredWidth);
                            boolean z17 = z15 && ((LinearLayout.LayoutParams) aVar2).width == i16;
                            int i49 = this.f17007f;
                            this.f17007f = Math.max(i49, i49 + q11.getMeasuredHeight() + ((LinearLayout.LayoutParams) aVar2).topMargin + ((LinearLayout.LayoutParams) aVar2).bottomMargin + p(q11));
                            i33 = max2;
                            z15 = z17;
                        }
                        i46 = i15 + 1;
                        i41 = i14;
                    }
                    this.f17007f += getPaddingTop() + getPaddingBottom();
                    i13 = i33;
                } else {
                    i13 = Math.max(i33, i35);
                    if (z16 && i41 != 1073741824) {
                        for (int i50 = 0; i50 < i12; i50++) {
                            View q12 = q(i50);
                            if (q12 != null && q12.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((a) q12.getLayoutParams())).weight > 0.0f) {
                                q12.measure(View.MeasureSpec.makeMeasureSpec(q12.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i38, 1073741824));
                            }
                        }
                    }
                }
                if (!z15 && mode != 1073741824) {
                    i39 = i13;
                }
                setMeasuredDimension(View.resolveSizeAndState(Math.max(i39 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i10, i40), resolveSizeAndState);
                if (z14) {
                    j(i12, i11);
                    return;
                }
                return;
            }
            float f15 = f10;
            View q13 = q(i28);
            if (q13 == null) {
                this.f17007f += w(i28);
            } else if (q13.getVisibility() == 8) {
                i28 += n(q13, i28);
            } else {
                if (r(i28)) {
                    this.f17007f += this.f17012k;
                }
                a aVar3 = (a) q13.getLayoutParams();
                float f16 = ((LinearLayout.LayoutParams) aVar3).weight;
                float f17 = f15 + f16;
                if (mode2 == 1073741824 && ((LinearLayout.LayoutParams) aVar3).height == 0 && f16 > 0.0f) {
                    int i51 = this.f17007f;
                    this.f17007f = Math.max(i51, ((LinearLayout.LayoutParams) aVar3).topMargin + i51 + ((LinearLayout.LayoutParams) aVar3).bottomMargin);
                    i25 = i29;
                    i21 = virtualChildCount;
                    i22 = mode2;
                    z13 = true;
                    view = q13;
                    i24 = i31;
                    i23 = i32;
                    z10 = z12;
                } else {
                    if (((LinearLayout.LayoutParams) aVar3).height != 0 || f16 <= 0.0f) {
                        i18 = Integer.MIN_VALUE;
                    } else {
                        ((LinearLayout.LayoutParams) aVar3).height = -2;
                        i18 = 0;
                    }
                    if (f17 == 0.0f) {
                        int i52 = i32;
                        i20 = this.f17007f;
                        i19 = i52;
                    } else {
                        i19 = i32;
                        i20 = 0;
                    }
                    int i53 = i30;
                    i21 = virtualChildCount;
                    i22 = mode2;
                    i23 = i19;
                    i24 = i31;
                    view = q13;
                    z10 = z12;
                    i25 = i29;
                    u(view, i28, i10, 0, i11, i20);
                    if (i18 != Integer.MIN_VALUE) {
                        ((LinearLayout.LayoutParams) aVar3).height = i18;
                    }
                    int measuredHeight2 = view.getMeasuredHeight();
                    int i54 = this.f17007f;
                    this.f17007f = Math.max(i54, i54 + measuredHeight2 + ((LinearLayout.LayoutParams) aVar3).topMargin + ((LinearLayout.LayoutParams) aVar3).bottomMargin + p(view));
                    i30 = z10 ? Math.max(measuredHeight2, i53) : i53;
                }
                if (i27 >= 0 && i27 == i28 + 1) {
                    this.f17004c = this.f17007f;
                }
                if (i28 < i27 && ((LinearLayout.LayoutParams) aVar3).weight > 0.0f) {
                    throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                }
                if (mode == 1073741824 || ((LinearLayout.LayoutParams) aVar3).width != -1) {
                    z11 = false;
                } else {
                    z11 = true;
                    z14 = true;
                }
                int i55 = ((LinearLayout.LayoutParams) aVar3).leftMargin + ((LinearLayout.LayoutParams) aVar3).rightMargin;
                int measuredWidth2 = view.getMeasuredWidth() + i55;
                max = Math.max(i24, measuredWidth2);
                int i56 = i30;
                int combineMeasuredStates = View.combineMeasuredStates(i23, view.getMeasuredState());
                if (z15) {
                    i26 = combineMeasuredStates;
                    if (((LinearLayout.LayoutParams) aVar3).width == -1) {
                        z15 = true;
                        if (((LinearLayout.LayoutParams) aVar3).weight <= 0.0f) {
                            if (!z11) {
                                i55 = measuredWidth2;
                            }
                            i25 = Math.max(i25, i55);
                        } else {
                            if (!z11) {
                                i55 = measuredWidth2;
                            }
                            i33 = Math.max(i33, i55);
                        }
                        i28 += n(view, i28);
                        f10 = f17;
                        i30 = i56;
                        i32 = i26;
                        i28++;
                        i31 = max;
                        i29 = i25;
                        z12 = z10;
                        mode2 = i22;
                        virtualChildCount = i21;
                    }
                } else {
                    i26 = combineMeasuredStates;
                }
                z15 = false;
                if (((LinearLayout.LayoutParams) aVar3).weight <= 0.0f) {
                }
                i28 += n(view, i28);
                f10 = f17;
                i30 = i56;
                i32 = i26;
                i28++;
                i31 = max;
                i29 = i25;
                z12 = z10;
                mode2 = i22;
                virtualChildCount = i21;
            }
            i25 = i29;
            i21 = virtualChildCount;
            i22 = mode2;
            z10 = z12;
            f10 = f15;
            max = i31;
            i28++;
            i31 = max;
            i29 = i25;
            z12 = z10;
            mode2 = i22;
            virtualChildCount = i21;
        }
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f17002a = true;
        this.f17003b = -1;
        this.f17004c = 0;
        this.f17006e = 8388659;
        a0 v10 = a0.v(context, attributeSet, l.j.LinearLayoutCompat, i10, 0);
        AbstractC2082d0.j0(this, context, l.j.LinearLayoutCompat, attributeSet, v10.r(), i10, 0);
        int k10 = v10.k(l.j.f55207K0, -1);
        if (k10 >= 0) {
            setOrientation(k10);
        }
        int k11 = v10.k(l.j.f55203J0, -1);
        if (k11 >= 0) {
            setGravity(k11);
        }
        boolean a10 = v10.a(l.j.f55211L0, true);
        if (!a10) {
            setBaselineAligned(a10);
        }
        this.f17008g = v10.i(l.j.f55219N0, -1.0f);
        this.f17003b = v10.k(l.j.f55215M0, -1);
        this.f17009h = v10.a(l.j.f55231Q0, false);
        setDividerDrawable(v10.g(l.j.f55223O0));
        this.f17013l = v10.k(l.j.f55235R0, 0);
        this.f17014m = v10.f(l.j.f55227P0, 0);
        v10.x();
    }
}
