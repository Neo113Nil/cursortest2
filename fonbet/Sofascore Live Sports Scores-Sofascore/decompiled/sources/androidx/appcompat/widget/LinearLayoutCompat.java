package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.unity3d.services.UnityAdsConstants;
import defpackage.bsk;
import defpackage.cp4;
import defpackage.dkf;
import defpackage.l2a;
import defpackage.lvk;
import defpackage.wt3;
import defpackage.z7b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class LinearLayoutCompat extends ViewGroup {
    private static final String ACCESSIBILITY_CLASS_NAME = "androidx.appcompat.widget.LinearLayoutCompat";
    public static final int HORIZONTAL = 0;
    private static final int INDEX_BOTTOM = 2;
    private static final int INDEX_CENTER_VERTICAL = 0;
    private static final int INDEX_FILL = 3;
    private static final int INDEX_TOP = 1;
    public static final int SHOW_DIVIDER_BEGINNING = 1;
    public static final int SHOW_DIVIDER_END = 4;
    public static final int SHOW_DIVIDER_MIDDLE = 2;
    public static final int SHOW_DIVIDER_NONE = 0;
    public static final int VERTICAL = 1;
    private static final int VERTICAL_GRAVITY_COUNT = 4;
    private boolean mBaselineAligned;
    private int mBaselineAlignedChildIndex;
    private int mBaselineChildTop;
    private Drawable mDivider;
    private int mDividerHeight;
    private int mDividerPadding;
    private int mDividerWidth;
    private int mGravity;
    private int[] mMaxAscent;
    private int[] mMaxDescent;
    private int mOrientation;
    private int mShowDividers;
    private int mTotalLength;
    private boolean mUseLargestChild;
    private float mWeightSum;

    public LinearLayoutCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mBaselineAligned = true;
        this.mBaselineAlignedChildIndex = -1;
        this.mBaselineChildTop = 0;
        this.mGravity = 8388659;
        int[] iArr = dkf.o;
        l2a y = l2a.y(i, 0, context, attributeSet, iArr);
        bsk.p(this, context, iArr, attributeSet, (TypedArray) y.c, i);
        TypedArray typedArray = (TypedArray) y.c;
        int i2 = typedArray.getInt(1, -1);
        if (i2 >= 0) {
            setOrientation(i2);
        }
        int i3 = typedArray.getInt(0, -1);
        if (i3 >= 0) {
            setGravity(i3);
        }
        boolean z = typedArray.getBoolean(2, true);
        if (!z) {
            setBaselineAligned(z);
        }
        this.mWeightSum = typedArray.getFloat(4, -1.0f);
        this.mBaselineAlignedChildIndex = typedArray.getInt(3, -1);
        this.mUseLargestChild = typedArray.getBoolean(7, false);
        setDividerDrawable(y.q(5));
        this.mShowDividers = typedArray.getInt(8, 0);
        this.mDividerPadding = typedArray.getDimensionPixelSize(6, 0);
        y.F();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof z7b;
    }

    public void drawDividersHorizontal(Canvas canvas) {
        int right;
        int left;
        int i;
        int virtualChildCount = getVirtualChildCount();
        boolean z = lvk.a;
        boolean z2 = getLayoutDirection() == 1;
        for (int i2 = 0; i2 < virtualChildCount; i2++) {
            View virtualChildAt = getVirtualChildAt(i2);
            if (virtualChildAt != null && virtualChildAt.getVisibility() != 8 && hasDividerBeforeChildAt(i2)) {
                z7b z7bVar = (z7b) virtualChildAt.getLayoutParams();
                drawVerticalDivider(canvas, z2 ? virtualChildAt.getRight() + ((LinearLayout.LayoutParams) z7bVar).rightMargin : (virtualChildAt.getLeft() - ((LinearLayout.LayoutParams) z7bVar).leftMargin) - this.mDividerWidth);
            }
        }
        if (hasDividerBeforeChildAt(virtualChildCount)) {
            View virtualChildAt2 = getVirtualChildAt(virtualChildCount - 1);
            if (virtualChildAt2 != null) {
                z7b z7bVar2 = (z7b) virtualChildAt2.getLayoutParams();
                if (z2) {
                    left = virtualChildAt2.getLeft() - ((LinearLayout.LayoutParams) z7bVar2).leftMargin;
                    i = this.mDividerWidth;
                    right = left - i;
                } else {
                    right = virtualChildAt2.getRight() + ((LinearLayout.LayoutParams) z7bVar2).rightMargin;
                }
            } else if (z2) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i = this.mDividerWidth;
                right = left - i;
            }
            drawVerticalDivider(canvas, right);
        }
    }

    public void drawDividersVertical(Canvas canvas) {
        int virtualChildCount = getVirtualChildCount();
        for (int i = 0; i < virtualChildCount; i++) {
            View virtualChildAt = getVirtualChildAt(i);
            if (virtualChildAt != null && virtualChildAt.getVisibility() != 8 && hasDividerBeforeChildAt(i)) {
                drawHorizontalDivider(canvas, (virtualChildAt.getTop() - ((LinearLayout.LayoutParams) ((z7b) virtualChildAt.getLayoutParams())).topMargin) - this.mDividerHeight);
            }
        }
        if (hasDividerBeforeChildAt(virtualChildCount)) {
            View virtualChildAt2 = getVirtualChildAt(virtualChildCount - 1);
            drawHorizontalDivider(canvas, virtualChildAt2 == null ? (getHeight() - getPaddingBottom()) - this.mDividerHeight : virtualChildAt2.getBottom() + ((LinearLayout.LayoutParams) ((z7b) virtualChildAt2.getLayoutParams())).bottomMargin);
        }
    }

    public void drawHorizontalDivider(Canvas canvas, int i) {
        this.mDivider.setBounds(getPaddingLeft() + this.mDividerPadding, i, (getWidth() - getPaddingRight()) - this.mDividerPadding, this.mDividerHeight + i);
        this.mDivider.draw(canvas);
    }

    public void drawVerticalDivider(Canvas canvas, int i) {
        this.mDivider.setBounds(i, getPaddingTop() + this.mDividerPadding, this.mDividerWidth + i, (getHeight() - getPaddingBottom()) - this.mDividerPadding);
        this.mDivider.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public z7b generateDefaultLayoutParams() {
        int i = this.mOrientation;
        if (i == 0) {
            return new z7b(-2, -2);
        }
        if (i == 1) {
            return new z7b(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public z7b generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof z7b ? new z7b((z7b) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new z7b((ViewGroup.MarginLayoutParams) layoutParams) : new z7b(layoutParams);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i;
        if (this.mBaselineAlignedChildIndex < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.mBaselineAlignedChildIndex;
        if (childCount <= i2) {
            cp4.h("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
            return 0;
        }
        View childAt = getChildAt(i2);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.mBaselineAlignedChildIndex == 0) {
                return -1;
            }
            cp4.h("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            return 0;
        }
        int i3 = this.mBaselineChildTop;
        if (this.mOrientation == 1 && (i = this.mGravity & 112) != 48) {
            if (i == 16) {
                i3 = wt3.f(((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom(), this.mTotalLength, 2, i3);
            } else if (i == 80) {
                i3 = ((getBottom() - getTop()) - getPaddingBottom()) - this.mTotalLength;
            }
        }
        return i3 + ((LinearLayout.LayoutParams) ((z7b) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.mBaselineAlignedChildIndex;
    }

    public int getChildrenSkipCount(View view, int i) {
        return 0;
    }

    public Drawable getDividerDrawable() {
        return this.mDivider;
    }

    public int getDividerPadding() {
        return this.mDividerPadding;
    }

    public int getDividerWidth() {
        return this.mDividerWidth;
    }

    public int getGravity() {
        return this.mGravity;
    }

    public int getLocationOffset(View view) {
        return 0;
    }

    public int getNextLocationOffset(View view) {
        return 0;
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public int getShowDividers() {
        return this.mShowDividers;
    }

    public View getVirtualChildAt(int i) {
        return getChildAt(i);
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.mWeightSum;
    }

    public boolean hasDividerBeforeChildAt(int i) {
        if (i == 0) {
            return (this.mShowDividers & 1) != 0;
        }
        int childCount = getChildCount();
        int i2 = this.mShowDividers;
        if (i == childCount) {
            return (i2 & 4) != 0;
        }
        if ((i2 & 2) != 0) {
            for (int i3 = i - 1; i3 >= 0; i3--) {
                if (getChildAt(i3).getVisibility() != 8) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isBaselineAligned() {
        return this.mBaselineAligned;
    }

    public boolean isMeasureWithLargestChildEnabled() {
        return this.mUseLargestChild;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void layoutHorizontal(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int f;
        boolean z = lvk.a;
        int i13 = 0;
        boolean z2 = true;
        Object[] objArr = getLayoutDirection() == 1;
        int paddingTop = getPaddingTop();
        int i14 = i4 - i2;
        int paddingBottom = i14 - getPaddingBottom();
        int paddingBottom2 = (i14 - paddingTop) - getPaddingBottom();
        int virtualChildCount = getVirtualChildCount();
        int i15 = this.mGravity;
        int i16 = 8388615 & i15;
        int i17 = i15 & 112;
        boolean z3 = this.mBaselineAligned;
        int[] iArr = this.mMaxAscent;
        int[] iArr2 = this.mMaxDescent;
        int absoluteGravity = Gravity.getAbsoluteGravity(i16, getLayoutDirection());
        int i18 = 2;
        int paddingLeft = absoluteGravity != 1 ? absoluteGravity != 5 ? getPaddingLeft() : ((getPaddingLeft() + i3) - i) - this.mTotalLength : wt3.f(i3 - i, this.mTotalLength, 2, getPaddingLeft());
        if (objArr == true) {
            i5 = virtualChildCount - 1;
            i6 = -1;
        } else {
            i5 = 0;
            i6 = 1;
        }
        while (i13 < virtualChildCount) {
            boolean z4 = z2;
            int i19 = (i6 * i13) + i5;
            int i20 = i18;
            View virtualChildAt = getVirtualChildAt(i19);
            if (virtualChildAt == null) {
                i7 = i5;
                paddingLeft = measureNullChild(i19) + paddingLeft;
            } else {
                i7 = i5;
                if (virtualChildAt.getVisibility() != 8) {
                    int measuredWidth = virtualChildAt.getMeasuredWidth();
                    int measuredHeight = virtualChildAt.getMeasuredHeight();
                    z7b z7bVar = (z7b) virtualChildAt.getLayoutParams();
                    int i21 = i13;
                    if (z3) {
                        i8 = paddingBottom;
                        if (((LinearLayout.LayoutParams) z7bVar).height != -1) {
                            i9 = virtualChildAt.getBaseline();
                            i10 = ((LinearLayout.LayoutParams) z7bVar).gravity;
                            if (i10 < 0) {
                                i10 = i17;
                            }
                            i11 = i10 & 112;
                            i12 = virtualChildCount;
                            if (i11 != 16) {
                                f = (wt3.f(paddingBottom2, measuredHeight, i20, paddingTop) + ((LinearLayout.LayoutParams) z7bVar).topMargin) - ((LinearLayout.LayoutParams) z7bVar).bottomMargin;
                            } else if (i11 == 48) {
                                f = ((LinearLayout.LayoutParams) z7bVar).topMargin + paddingTop;
                                if (i9 != -1) {
                                    f = (iArr[z4 ? 1 : 0] - i9) + f;
                                }
                            } else if (i11 != 80) {
                                f = paddingTop;
                            } else {
                                f = (i8 - measuredHeight) - ((LinearLayout.LayoutParams) z7bVar).bottomMargin;
                                if (i9 != -1) {
                                    f -= iArr2[i20] - (virtualChildAt.getMeasuredHeight() - i9);
                                }
                            }
                            if (hasDividerBeforeChildAt(i19)) {
                                paddingLeft += this.mDividerWidth;
                            }
                            int i22 = paddingLeft + ((LinearLayout.LayoutParams) z7bVar).leftMargin;
                            int locationOffset = getLocationOffset(virtualChildAt) + i22;
                            virtualChildAt.layout(locationOffset, f, locationOffset + measuredWidth, measuredHeight + f);
                            paddingLeft = getNextLocationOffset(virtualChildAt) + measuredWidth + ((LinearLayout.LayoutParams) z7bVar).rightMargin + i22;
                            i13 = getChildrenSkipCount(virtualChildAt, i19) + i21;
                            i13++;
                            i5 = i7;
                            z2 = z4 ? 1 : 0;
                            paddingBottom = i8;
                            virtualChildCount = i12;
                            i18 = 2;
                        }
                    } else {
                        i8 = paddingBottom;
                    }
                    i9 = -1;
                    i10 = ((LinearLayout.LayoutParams) z7bVar).gravity;
                    if (i10 < 0) {
                    }
                    i11 = i10 & 112;
                    i12 = virtualChildCount;
                    if (i11 != 16) {
                    }
                    if (hasDividerBeforeChildAt(i19)) {
                    }
                    int i222 = paddingLeft + ((LinearLayout.LayoutParams) z7bVar).leftMargin;
                    int locationOffset2 = getLocationOffset(virtualChildAt) + i222;
                    virtualChildAt.layout(locationOffset2, f, locationOffset2 + measuredWidth, measuredHeight + f);
                    paddingLeft = getNextLocationOffset(virtualChildAt) + measuredWidth + ((LinearLayout.LayoutParams) z7bVar).rightMargin + i222;
                    i13 = getChildrenSkipCount(virtualChildAt, i19) + i21;
                    i13++;
                    i5 = i7;
                    z2 = z4 ? 1 : 0;
                    paddingBottom = i8;
                    virtualChildCount = i12;
                    i18 = 2;
                }
            }
            i8 = paddingBottom;
            i12 = virtualChildCount;
            i13++;
            i5 = i7;
            z2 = z4 ? 1 : 0;
            paddingBottom = i8;
            virtualChildCount = i12;
            i18 = 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void layoutVertical(int i, int i2, int i3, int i4) {
        int f;
        int i5;
        int i6;
        int paddingLeft = getPaddingLeft();
        int i7 = i3 - i;
        int paddingRight = i7 - getPaddingRight();
        int paddingRight2 = (i7 - paddingLeft) - getPaddingRight();
        int virtualChildCount = getVirtualChildCount();
        int i8 = this.mGravity;
        int i9 = i8 & 112;
        int i10 = i8 & 8388615;
        int i11 = 2;
        int paddingTop = i9 != 16 ? i9 != 80 ? getPaddingTop() : ((getPaddingTop() + i4) - i2) - this.mTotalLength : wt3.f(i4 - i2, this.mTotalLength, 2, getPaddingTop());
        int i12 = 0;
        while (i12 < virtualChildCount) {
            View virtualChildAt = getVirtualChildAt(i12);
            if (virtualChildAt == null) {
                paddingTop = measureNullChild(i12) + paddingTop;
            } else if (virtualChildAt.getVisibility() != 8) {
                int measuredWidth = virtualChildAt.getMeasuredWidth();
                int measuredHeight = virtualChildAt.getMeasuredHeight();
                z7b z7bVar = (z7b) virtualChildAt.getLayoutParams();
                int i13 = ((LinearLayout.LayoutParams) z7bVar).gravity;
                if (i13 < 0) {
                    i13 = i10;
                }
                int absoluteGravity = Gravity.getAbsoluteGravity(i13, getLayoutDirection()) & 7;
                if (absoluteGravity == 1) {
                    f = wt3.f(paddingRight2, measuredWidth, i11, paddingLeft) + ((LinearLayout.LayoutParams) z7bVar).leftMargin;
                    i5 = ((LinearLayout.LayoutParams) z7bVar).rightMargin;
                } else if (absoluteGravity != 5) {
                    i6 = ((LinearLayout.LayoutParams) z7bVar).leftMargin + paddingLeft;
                    if (hasDividerBeforeChildAt(i12)) {
                        paddingTop += this.mDividerHeight;
                    }
                    int i14 = paddingTop + ((LinearLayout.LayoutParams) z7bVar).topMargin;
                    int locationOffset = getLocationOffset(virtualChildAt) + i14;
                    virtualChildAt.layout(i6, locationOffset, measuredWidth + i6, locationOffset + measuredHeight);
                    int nextLocationOffset = getNextLocationOffset(virtualChildAt) + measuredHeight + ((LinearLayout.LayoutParams) z7bVar).bottomMargin + i14;
                    i12 += getChildrenSkipCount(virtualChildAt, i12);
                    paddingTop = nextLocationOffset;
                } else {
                    f = paddingRight - measuredWidth;
                    i5 = ((LinearLayout.LayoutParams) z7bVar).rightMargin;
                }
                i6 = f - i5;
                if (hasDividerBeforeChildAt(i12)) {
                }
                int i142 = paddingTop + ((LinearLayout.LayoutParams) z7bVar).topMargin;
                int locationOffset2 = getLocationOffset(virtualChildAt) + i142;
                virtualChildAt.layout(i6, locationOffset2, measuredWidth + i6, locationOffset2 + measuredHeight);
                int nextLocationOffset2 = getNextLocationOffset(virtualChildAt) + measuredHeight + ((LinearLayout.LayoutParams) z7bVar).bottomMargin + i142;
                i12 += getChildrenSkipCount(virtualChildAt, i12);
                paddingTop = nextLocationOffset2;
            }
            i12++;
            i11 = 2;
        }
    }

    public void measureChildBeforeLayout(View view, int i, int i2, int i3, int i4, int i5) {
        measureChildWithMargins(view, i2, i3, i4, i5);
    }

    /* JADX WARN: Removed duplicated region for block: B:215:0x0440  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void measureHorizontal(int i, int i2) {
        int[] iArr;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z;
        int baseline;
        int i11;
        int i12;
        int i13;
        int childrenSkipCount;
        char c;
        int i14;
        boolean z2;
        int i15;
        int i16;
        int i17;
        int[] iArr2;
        int i18;
        int i19;
        boolean z3;
        int[] iArr3;
        View view;
        boolean z4;
        int baseline2;
        LinearLayoutCompat linearLayoutCompat = this;
        linearLayoutCompat.mTotalLength = 0;
        int virtualChildCount = linearLayoutCompat.getVirtualChildCount();
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int[] iArr4 = linearLayoutCompat.mMaxAscent;
        if (iArr4 == null || (iArr = linearLayoutCompat.mMaxDescent) == null) {
            iArr4 = new int[4];
            linearLayoutCompat.mMaxAscent = iArr4;
            iArr = new int[4];
            linearLayoutCompat.mMaxDescent = iArr;
        }
        int[] iArr5 = iArr4;
        int[] iArr6 = iArr;
        iArr5[3] = -1;
        iArr5[2] = -1;
        iArr5[1] = -1;
        iArr5[0] = -1;
        iArr6[3] = -1;
        iArr6[2] = -1;
        iArr6[1] = -1;
        iArr6[0] = -1;
        boolean z5 = linearLayoutCompat.mBaselineAligned;
        boolean z6 = linearLayoutCompat.mUseLargestChild;
        int i20 = 1073741824;
        boolean z7 = mode == 1073741824;
        boolean z8 = z6;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        boolean z9 = false;
        int i24 = 0;
        boolean z10 = false;
        boolean z11 = true;
        float f = 0.0f;
        int i25 = 0;
        int i26 = 0;
        while (true) {
            i3 = i22;
            if (i21 >= virtualChildCount) {
                break;
            }
            boolean z12 = z5;
            View virtualChildAt = linearLayoutCompat.getVirtualChildAt(i21);
            if (virtualChildAt == null) {
                linearLayoutCompat.mTotalLength = linearLayoutCompat.measureNullChild(i21) + linearLayoutCompat.mTotalLength;
            } else if (virtualChildAt.getVisibility() == 8) {
                i21 += linearLayoutCompat.getChildrenSkipCount(virtualChildAt, i21);
            } else {
                if (linearLayoutCompat.hasDividerBeforeChildAt(i21)) {
                    linearLayoutCompat.mTotalLength += linearLayoutCompat.mDividerWidth;
                }
                z7b z7bVar = (z7b) virtualChildAt.getLayoutParams();
                float f2 = ((LinearLayout.LayoutParams) z7bVar).weight;
                float f3 = f + f2;
                if (mode == i20 && ((LinearLayout.LayoutParams) z7bVar).width == 0 && f2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    int i27 = linearLayoutCompat.mTotalLength;
                    if (z7) {
                        linearLayoutCompat.mTotalLength = ((LinearLayout.LayoutParams) z7bVar).leftMargin + ((LinearLayout.LayoutParams) z7bVar).rightMargin + i27;
                    } else {
                        linearLayoutCompat.mTotalLength = Math.max(i27, ((LinearLayout.LayoutParams) z7bVar).leftMargin + i27 + ((LinearLayout.LayoutParams) z7bVar).rightMargin);
                    }
                    if (z12) {
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                        virtualChildAt.measure(makeMeasureSpec, makeMeasureSpec);
                        view = virtualChildAt;
                        i16 = virtualChildCount;
                        i17 = mode;
                        iArr2 = iArr5;
                        iArr3 = iArr6;
                    } else {
                        view = virtualChildAt;
                        i16 = virtualChildCount;
                        i17 = mode;
                        iArr2 = iArr5;
                        iArr3 = iArr6;
                        z9 = true;
                    }
                    i18 = i3;
                    i19 = 1073741824;
                    z3 = z8;
                } else {
                    if (((LinearLayout.LayoutParams) z7bVar).width != 0 || f2 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        c = 65534;
                        i14 = Integer.MIN_VALUE;
                    } else {
                        c = 65534;
                        ((LinearLayout.LayoutParams) z7bVar).width = -2;
                        i14 = 0;
                    }
                    if (f3 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        z2 = z8;
                        i15 = linearLayoutCompat.mTotalLength;
                    } else {
                        z2 = z8;
                        i15 = 0;
                    }
                    i16 = virtualChildCount;
                    i17 = mode;
                    iArr2 = iArr5;
                    i18 = i3;
                    i19 = 1073741824;
                    z3 = z2;
                    iArr3 = iArr6;
                    int i28 = i14;
                    linearLayoutCompat.measureChildBeforeLayout(virtualChildAt, i21, i, i15, i2, 0);
                    view = virtualChildAt;
                    if (i28 != Integer.MIN_VALUE) {
                        ((LinearLayout.LayoutParams) z7bVar).width = i28;
                    }
                    int measuredWidth = view.getMeasuredWidth();
                    int i29 = linearLayoutCompat.mTotalLength;
                    if (z7) {
                        linearLayoutCompat.mTotalLength = linearLayoutCompat.getNextLocationOffset(view) + ((LinearLayout.LayoutParams) z7bVar).leftMargin + measuredWidth + ((LinearLayout.LayoutParams) z7bVar).rightMargin + i29;
                    } else {
                        linearLayoutCompat.mTotalLength = Math.max(i29, linearLayoutCompat.getNextLocationOffset(view) + i29 + measuredWidth + ((LinearLayout.LayoutParams) z7bVar).leftMargin + ((LinearLayout.LayoutParams) z7bVar).rightMargin);
                    }
                    if (z3) {
                        i23 = Math.max(measuredWidth, i23);
                    }
                }
                if (mode2 == i19 || ((LinearLayout.LayoutParams) z7bVar).height != -1) {
                    z4 = false;
                } else {
                    z4 = true;
                    z10 = true;
                }
                int i30 = ((LinearLayout.LayoutParams) z7bVar).topMargin + ((LinearLayout.LayoutParams) z7bVar).bottomMargin;
                int measuredHeight = view.getMeasuredHeight() + i30;
                i24 = View.combineMeasuredStates(i24, view.getMeasuredState());
                if (z12 && (baseline2 = view.getBaseline()) != -1) {
                    int i31 = ((LinearLayout.LayoutParams) z7bVar).gravity;
                    if (i31 < 0) {
                        i31 = linearLayoutCompat.mGravity;
                    }
                    int i32 = (((i31 & 112) >> 4) & (-2)) >> 1;
                    iArr2[i32] = Math.max(iArr2[i32], baseline2);
                    iArr3[i32] = Math.max(iArr3[i32], measuredHeight - baseline2);
                }
                int max = Math.max(i18, measuredHeight);
                z11 = z11 && ((LinearLayout.LayoutParams) z7bVar).height == -1;
                if (((LinearLayout.LayoutParams) z7bVar).weight > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    if (!z4) {
                        i30 = measuredHeight;
                    }
                    i26 = Math.max(i26, i30);
                } else {
                    if (!z4) {
                        i30 = measuredHeight;
                    }
                    i25 = Math.max(i25, i30);
                }
                i21 += linearLayoutCompat.getChildrenSkipCount(view, i21);
                i22 = max;
                f = f3;
                i21++;
                z8 = z3;
                iArr6 = iArr3;
                z5 = z12;
                mode = i17;
                iArr5 = iArr2;
                virtualChildCount = i16;
                i20 = 1073741824;
            }
            i16 = virtualChildCount;
            i17 = mode;
            iArr2 = iArr5;
            iArr3 = iArr6;
            i22 = i3;
            z3 = z8;
            i21++;
            z8 = z3;
            iArr6 = iArr3;
            z5 = z12;
            mode = i17;
            iArr5 = iArr2;
            virtualChildCount = i16;
            i20 = 1073741824;
        }
        boolean z13 = z5;
        int i33 = virtualChildCount;
        int i34 = mode;
        int[] iArr7 = iArr5;
        int[] iArr8 = iArr6;
        int i35 = i24;
        boolean z14 = z8;
        if (linearLayoutCompat.mTotalLength > 0 && linearLayoutCompat.hasDividerBeforeChildAt(i33)) {
            linearLayoutCompat.mTotalLength += linearLayoutCompat.mDividerWidth;
        }
        int i36 = iArr7[1];
        int max2 = (i36 == -1 && iArr7[0] == -1 && iArr7[2] == -1 && iArr7[3] == -1) ? i3 : Math.max(i3, Math.max(iArr8[3], Math.max(iArr8[0], Math.max(iArr8[1], iArr8[2]))) + Math.max(iArr7[3], Math.max(iArr7[0], Math.max(i36, iArr7[2]))));
        int i37 = i34;
        if (z14 && (i37 == Integer.MIN_VALUE || i37 == 0)) {
            linearLayoutCompat.mTotalLength = 0;
            int i38 = 0;
            while (i38 < i33) {
                View virtualChildAt2 = linearLayoutCompat.getVirtualChildAt(i38);
                if (virtualChildAt2 == null) {
                    linearLayoutCompat.mTotalLength = linearLayoutCompat.measureNullChild(i38) + linearLayoutCompat.mTotalLength;
                } else if (virtualChildAt2.getVisibility() == 8) {
                    childrenSkipCount = i38 + linearLayoutCompat.getChildrenSkipCount(virtualChildAt2, i38);
                    i38 = childrenSkipCount + 1;
                } else {
                    z7b z7bVar2 = (z7b) virtualChildAt2.getLayoutParams();
                    int i39 = linearLayoutCompat.mTotalLength;
                    if (z7) {
                        linearLayoutCompat.mTotalLength = linearLayoutCompat.getNextLocationOffset(virtualChildAt2) + ((LinearLayout.LayoutParams) z7bVar2).leftMargin + i23 + ((LinearLayout.LayoutParams) z7bVar2).rightMargin + i39;
                    } else {
                        i13 = i38;
                        linearLayoutCompat.mTotalLength = Math.max(i39, linearLayoutCompat.getNextLocationOffset(virtualChildAt2) + i39 + i23 + ((LinearLayout.LayoutParams) z7bVar2).leftMargin + ((LinearLayout.LayoutParams) z7bVar2).rightMargin);
                        childrenSkipCount = i13;
                        i38 = childrenSkipCount + 1;
                    }
                }
                i13 = i38;
                childrenSkipCount = i13;
                i38 = childrenSkipCount + 1;
            }
        }
        int paddingRight = linearLayoutCompat.getPaddingRight() + linearLayoutCompat.getPaddingLeft() + linearLayoutCompat.mTotalLength;
        linearLayoutCompat.mTotalLength = paddingRight;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, linearLayoutCompat.getSuggestedMinimumWidth()), i, 0);
        int i40 = (16777215 & resolveSizeAndState) - linearLayoutCompat.mTotalLength;
        if (z9 || (i40 != 0 && f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) {
            float f4 = linearLayoutCompat.mWeightSum;
            if (f4 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                f = f4;
            }
            iArr7[3] = -1;
            iArr7[2] = -1;
            iArr7[1] = -1;
            iArr7[0] = -1;
            iArr8[3] = -1;
            iArr8[2] = -1;
            iArr8[1] = -1;
            iArr8[0] = -1;
            linearLayoutCompat.mTotalLength = 0;
            max2 = -1;
            int i41 = 0;
            while (i41 < i33) {
                View virtualChildAt3 = linearLayoutCompat.getVirtualChildAt(i41);
                if (virtualChildAt3 != null && virtualChildAt3.getVisibility() != 8) {
                    z7b z7bVar3 = (z7b) virtualChildAt3.getLayoutParams();
                    float f5 = ((LinearLayout.LayoutParams) z7bVar3).weight;
                    if (f5 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        i9 = resolveSizeAndState;
                        int i42 = (int) ((i40 * f5) / f);
                        f -= f5;
                        i40 -= i42;
                        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, linearLayoutCompat.getPaddingBottom() + linearLayoutCompat.getPaddingTop() + ((LinearLayout.LayoutParams) z7bVar3).topMargin + ((LinearLayout.LayoutParams) z7bVar3).bottomMargin, ((LinearLayout.LayoutParams) z7bVar3).height);
                        if (((LinearLayout.LayoutParams) z7bVar3).width == 0) {
                            i12 = 1073741824;
                            if (i37 == 1073741824) {
                                i8 = i37;
                                virtualChildAt3.measure(View.MeasureSpec.makeMeasureSpec(i42 > 0 ? i42 : 0, 1073741824), childMeasureSpec);
                                i35 = View.combineMeasuredStates(i35, virtualChildAt3.getMeasuredState() & (-16777216));
                            }
                        } else {
                            i12 = 1073741824;
                        }
                        i8 = i37;
                        int measuredWidth2 = virtualChildAt3.getMeasuredWidth() + i42;
                        if (measuredWidth2 < 0) {
                            measuredWidth2 = 0;
                        }
                        virtualChildAt3.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth2, i12), childMeasureSpec);
                        i35 = View.combineMeasuredStates(i35, virtualChildAt3.getMeasuredState() & (-16777216));
                    } else {
                        i8 = i37;
                        i9 = resolveSizeAndState;
                    }
                    int i43 = linearLayoutCompat.mTotalLength;
                    if (z7) {
                        linearLayoutCompat.mTotalLength = linearLayoutCompat.getNextLocationOffset(virtualChildAt3) + virtualChildAt3.getMeasuredWidth() + ((LinearLayout.LayoutParams) z7bVar3).leftMargin + ((LinearLayout.LayoutParams) z7bVar3).rightMargin + i43;
                    } else {
                        linearLayoutCompat.mTotalLength = Math.max(i43, linearLayoutCompat.getNextLocationOffset(virtualChildAt3) + virtualChildAt3.getMeasuredWidth() + i43 + ((LinearLayout.LayoutParams) z7bVar3).leftMargin + ((LinearLayout.LayoutParams) z7bVar3).rightMargin);
                    }
                    boolean z15 = mode2 != 1073741824 && ((LinearLayout.LayoutParams) z7bVar3).height == -1;
                    int i44 = ((LinearLayout.LayoutParams) z7bVar3).topMargin + ((LinearLayout.LayoutParams) z7bVar3).bottomMargin;
                    int measuredHeight2 = virtualChildAt3.getMeasuredHeight() + i44;
                    max2 = Math.max(max2, measuredHeight2);
                    if (!z15) {
                        i44 = measuredHeight2;
                    }
                    int max3 = Math.max(i25, i44);
                    if (z11) {
                        i10 = -1;
                        if (((LinearLayout.LayoutParams) z7bVar3).height == -1) {
                            z = true;
                            if (z13 && (baseline = virtualChildAt3.getBaseline()) != i10) {
                                i11 = ((LinearLayout.LayoutParams) z7bVar3).gravity;
                                if (i11 < 0) {
                                    i11 = linearLayoutCompat.mGravity;
                                }
                                int i45 = (((i11 & 112) >> 4) & (-2)) >> 1;
                                iArr7[i45] = Math.max(iArr7[i45], baseline);
                                iArr8[i45] = Math.max(iArr8[i45], measuredHeight2 - baseline);
                            }
                            i25 = max3;
                            z11 = z;
                            i41++;
                            resolveSizeAndState = i9;
                            i37 = i8;
                        }
                    } else {
                        i10 = -1;
                    }
                    z = false;
                    if (z13) {
                        i11 = ((LinearLayout.LayoutParams) z7bVar3).gravity;
                        if (i11 < 0) {
                        }
                        int i452 = (((i11 & 112) >> 4) & (-2)) >> 1;
                        iArr7[i452] = Math.max(iArr7[i452], baseline);
                        iArr8[i452] = Math.max(iArr8[i452], measuredHeight2 - baseline);
                    }
                    i25 = max3;
                    z11 = z;
                    i41++;
                    resolveSizeAndState = i9;
                    i37 = i8;
                }
                i8 = i37;
                i9 = resolveSizeAndState;
                i41++;
                resolveSizeAndState = i9;
                i37 = i8;
            }
            i4 = resolveSizeAndState;
            i5 = -16777216;
            linearLayoutCompat.mTotalLength = linearLayoutCompat.getPaddingRight() + linearLayoutCompat.getPaddingLeft() + linearLayoutCompat.mTotalLength;
            int i46 = iArr7[1];
            if (i46 == -1 && iArr7[0] == -1 && iArr7[2] == -1 && iArr7[3] == -1) {
                i6 = 0;
            } else {
                i6 = 0;
                max2 = Math.max(max2, Math.max(iArr8[3], Math.max(iArr8[0], Math.max(iArr8[1], iArr8[2]))) + Math.max(iArr7[3], Math.max(iArr7[0], Math.max(i46, iArr7[2]))));
            }
            i7 = i25;
        } else {
            i7 = Math.max(i25, i26);
            if (z14 && i37 != 1073741824) {
                for (int i47 = 0; i47 < i33; i47++) {
                    View virtualChildAt4 = linearLayoutCompat.getVirtualChildAt(i47);
                    if (virtualChildAt4 != null && virtualChildAt4.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((z7b) virtualChildAt4.getLayoutParams())).weight > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        virtualChildAt4.measure(View.MeasureSpec.makeMeasureSpec(i23, 1073741824), View.MeasureSpec.makeMeasureSpec(virtualChildAt4.getMeasuredHeight(), 1073741824));
                    }
                }
            }
            i4 = resolveSizeAndState;
            i5 = -16777216;
            i6 = 0;
        }
        if (z11 || mode2 == 1073741824) {
            i7 = max2;
        }
        linearLayoutCompat.setMeasuredDimension(i4 | (i35 & i5), View.resolveSizeAndState(Math.max(linearLayoutCompat.getPaddingBottom() + linearLayoutCompat.getPaddingTop() + i7, linearLayoutCompat.getSuggestedMinimumHeight()), i2, i35 << 16));
        if (z10) {
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(linearLayoutCompat.getMeasuredHeight(), 1073741824);
            int i48 = i6;
            while (i48 < i33) {
                int i49 = makeMeasureSpec2;
                View virtualChildAt5 = linearLayoutCompat.getVirtualChildAt(i48);
                if (virtualChildAt5.getVisibility() != 8) {
                    z7b z7bVar4 = (z7b) virtualChildAt5.getLayoutParams();
                    if (((LinearLayout.LayoutParams) z7bVar4).height == -1) {
                        int i50 = ((LinearLayout.LayoutParams) z7bVar4).width;
                        ((LinearLayout.LayoutParams) z7bVar4).width = virtualChildAt5.getMeasuredWidth();
                        linearLayoutCompat.measureChildWithMargins(virtualChildAt5, i, 0, i49, 0);
                        ((LinearLayout.LayoutParams) z7bVar4).width = i50;
                    }
                }
                i48++;
                linearLayoutCompat = this;
                makeMeasureSpec2 = i49;
            }
        }
    }

    public int measureNullChild(int i) {
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:173:0x02e1, code lost:
    
        if (((android.widget.LinearLayout.LayoutParams) r13).width == (-1)) goto L145;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void measureVertical(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        View view;
        boolean z2;
        int i16;
        LinearLayoutCompat linearLayoutCompat = this;
        linearLayoutCompat.mTotalLength = 0;
        int virtualChildCount = linearLayoutCompat.getVirtualChildCount();
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int i17 = linearLayoutCompat.mBaselineAlignedChildIndex;
        boolean z3 = linearLayoutCompat.mUseLargestChild;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        boolean z4 = false;
        boolean z5 = false;
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        boolean z6 = true;
        while (true) {
            int i24 = i19;
            int i25 = 8;
            if (i18 >= virtualChildCount) {
                float f2 = f;
                int i26 = virtualChildCount;
                boolean z7 = z3;
                int i27 = i23;
                int i28 = i21;
                int i29 = i22;
                int i30 = mode2;
                int i31 = i20;
                if (linearLayoutCompat.mTotalLength > 0 && linearLayoutCompat.hasDividerBeforeChildAt(i26)) {
                    linearLayoutCompat.mTotalLength += linearLayoutCompat.mDividerHeight;
                }
                int i32 = i30;
                if (z7 && (i32 == Integer.MIN_VALUE || i32 == 0)) {
                    linearLayoutCompat.mTotalLength = 0;
                    int i33 = 0;
                    while (i33 < i26) {
                        View virtualChildAt = linearLayoutCompat.getVirtualChildAt(i33);
                        if (virtualChildAt == null) {
                            linearLayoutCompat.mTotalLength = linearLayoutCompat.measureNullChild(i33) + linearLayoutCompat.mTotalLength;
                        } else if (virtualChildAt.getVisibility() == i25) {
                            i33 += linearLayoutCompat.getChildrenSkipCount(virtualChildAt, i33);
                        } else {
                            z7b z7bVar = (z7b) virtualChildAt.getLayoutParams();
                            int i34 = linearLayoutCompat.mTotalLength;
                            linearLayoutCompat.mTotalLength = Math.max(i34, linearLayoutCompat.getNextLocationOffset(virtualChildAt) + i34 + i31 + ((LinearLayout.LayoutParams) z7bVar).topMargin + ((LinearLayout.LayoutParams) z7bVar).bottomMargin);
                        }
                        i33++;
                        i25 = 8;
                    }
                }
                int paddingBottom = linearLayoutCompat.getPaddingBottom() + linearLayoutCompat.getPaddingTop() + linearLayoutCompat.mTotalLength;
                linearLayoutCompat.mTotalLength = paddingBottom;
                int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingBottom, linearLayoutCompat.getSuggestedMinimumHeight()), i2, 0);
                int i35 = (16777215 & resolveSizeAndState) - linearLayoutCompat.mTotalLength;
                if (z4 || (i35 != 0 && f2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) {
                    float f3 = linearLayoutCompat.mWeightSum;
                    if (f3 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        f2 = f3;
                    }
                    linearLayoutCompat.mTotalLength = 0;
                    int i36 = i27;
                    int i37 = i35;
                    int i38 = 0;
                    while (i38 < i26) {
                        View virtualChildAt2 = linearLayoutCompat.getVirtualChildAt(i38);
                        if (virtualChildAt2.getVisibility() == 8) {
                            i4 = i32;
                        } else {
                            z7b z7bVar2 = (z7b) virtualChildAt2.getLayoutParams();
                            float f4 = ((LinearLayout.LayoutParams) z7bVar2).weight;
                            if (f4 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                int i39 = (int) ((i37 * f4) / f2);
                                f2 -= f4;
                                i37 -= i39;
                                int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, linearLayoutCompat.getPaddingRight() + linearLayoutCompat.getPaddingLeft() + ((LinearLayout.LayoutParams) z7bVar2).leftMargin + ((LinearLayout.LayoutParams) z7bVar2).rightMargin, ((LinearLayout.LayoutParams) z7bVar2).width);
                                if (((LinearLayout.LayoutParams) z7bVar2).height == 0) {
                                    i6 = 1073741824;
                                    if (i32 == 1073741824) {
                                        if (i39 <= 0) {
                                            i39 = 0;
                                        }
                                        virtualChildAt2.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i39, 1073741824));
                                        i29 = View.combineMeasuredStates(i29, virtualChildAt2.getMeasuredState() & (-256));
                                    }
                                } else {
                                    i6 = 1073741824;
                                }
                                int measuredHeight = virtualChildAt2.getMeasuredHeight() + i39;
                                if (measuredHeight < 0) {
                                    measuredHeight = 0;
                                }
                                virtualChildAt2.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight, i6));
                                i29 = View.combineMeasuredStates(i29, virtualChildAt2.getMeasuredState() & (-256));
                            }
                            int i40 = ((LinearLayout.LayoutParams) z7bVar2).leftMargin + ((LinearLayout.LayoutParams) z7bVar2).rightMargin;
                            int measuredWidth = virtualChildAt2.getMeasuredWidth() + i40;
                            i28 = Math.max(i28, measuredWidth);
                            if (mode != 1073741824) {
                                i4 = i32;
                                i5 = -1;
                            } else {
                                i4 = i32;
                                i5 = -1;
                            }
                            i40 = measuredWidth;
                            int max = Math.max(i36, i40);
                            boolean z8 = z6 && ((LinearLayout.LayoutParams) z7bVar2).width == i5;
                            int i41 = linearLayoutCompat.mTotalLength;
                            linearLayoutCompat.mTotalLength = Math.max(i41, linearLayoutCompat.getNextLocationOffset(virtualChildAt2) + virtualChildAt2.getMeasuredHeight() + i41 + ((LinearLayout.LayoutParams) z7bVar2).topMargin + ((LinearLayout.LayoutParams) z7bVar2).bottomMargin);
                            z6 = z8;
                            i36 = max;
                        }
                        i38++;
                        i32 = i4;
                    }
                    linearLayoutCompat.mTotalLength = linearLayoutCompat.getPaddingBottom() + linearLayoutCompat.getPaddingTop() + linearLayoutCompat.mTotalLength;
                    i3 = i36;
                } else {
                    i3 = Math.max(i27, i24);
                    if (z7 && i32 != 1073741824) {
                        for (int i42 = 0; i42 < i26; i42++) {
                            View virtualChildAt3 = linearLayoutCompat.getVirtualChildAt(i42);
                            if (virtualChildAt3 != null && virtualChildAt3.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((z7b) virtualChildAt3.getLayoutParams())).weight > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                virtualChildAt3.measure(View.MeasureSpec.makeMeasureSpec(virtualChildAt3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i31, 1073741824));
                            }
                        }
                    }
                }
                if (z6 || mode == 1073741824) {
                    i3 = i28;
                }
                linearLayoutCompat.setMeasuredDimension(View.resolveSizeAndState(Math.max(linearLayoutCompat.getPaddingRight() + linearLayoutCompat.getPaddingLeft() + i3, linearLayoutCompat.getSuggestedMinimumWidth()), i, i29), resolveSizeAndState);
                if (z5) {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(linearLayoutCompat.getMeasuredWidth(), 1073741824);
                    int i43 = 0;
                    while (i43 < i26) {
                        View virtualChildAt4 = linearLayoutCompat.getVirtualChildAt(i43);
                        if (virtualChildAt4.getVisibility() != 8) {
                            z7b z7bVar3 = (z7b) virtualChildAt4.getLayoutParams();
                            if (((LinearLayout.LayoutParams) z7bVar3).width == -1) {
                                int i44 = ((LinearLayout.LayoutParams) z7bVar3).height;
                                ((LinearLayout.LayoutParams) z7bVar3).height = virtualChildAt4.getMeasuredHeight();
                                linearLayoutCompat.measureChildWithMargins(virtualChildAt4, makeMeasureSpec, 0, i2, 0);
                                ((LinearLayout.LayoutParams) z7bVar3).height = i44;
                            }
                        }
                        i43++;
                        linearLayoutCompat = this;
                    }
                    return;
                }
                return;
            }
            float f5 = f;
            View virtualChildAt5 = linearLayoutCompat.getVirtualChildAt(i18);
            if (virtualChildAt5 == null) {
                linearLayoutCompat.mTotalLength = linearLayoutCompat.measureNullChild(i18) + linearLayoutCompat.mTotalLength;
            } else if (virtualChildAt5.getVisibility() == 8) {
                i18 += linearLayoutCompat.getChildrenSkipCount(virtualChildAt5, i18);
            } else {
                if (linearLayoutCompat.hasDividerBeforeChildAt(i18)) {
                    linearLayoutCompat.mTotalLength += linearLayoutCompat.mDividerHeight;
                }
                z7b z7bVar4 = (z7b) virtualChildAt5.getLayoutParams();
                float f6 = ((LinearLayout.LayoutParams) z7bVar4).weight;
                f5 += f6;
                if (mode2 == 1073741824 && ((LinearLayout.LayoutParams) z7bVar4).height == 0 && f6 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    int i45 = linearLayoutCompat.mTotalLength;
                    linearLayoutCompat.mTotalLength = Math.max(i45, ((LinearLayout.LayoutParams) z7bVar4).topMargin + i45 + ((LinearLayout.LayoutParams) z7bVar4).bottomMargin);
                    view = virtualChildAt5;
                    i14 = virtualChildCount;
                    z = z3;
                    i10 = i23;
                    z4 = true;
                    i11 = i24;
                    i15 = i21;
                    i12 = i22;
                    i13 = mode2;
                } else {
                    if (((LinearLayout.LayoutParams) z7bVar4).height != 0 || f6 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        i7 = Integer.MIN_VALUE;
                    } else {
                        ((LinearLayout.LayoutParams) z7bVar4).height = -2;
                        i7 = 0;
                    }
                    if (f5 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        int i46 = i22;
                        i9 = linearLayoutCompat.mTotalLength;
                        i8 = i46;
                    } else {
                        i8 = i22;
                        i9 = 0;
                    }
                    int i47 = i20;
                    z = z3;
                    i10 = i23;
                    i11 = i24;
                    i12 = i8;
                    i13 = mode2;
                    i14 = virtualChildCount;
                    i15 = i21;
                    linearLayoutCompat.measureChildBeforeLayout(virtualChildAt5, i18, i, 0, i2, i9);
                    view = virtualChildAt5;
                    if (i7 != Integer.MIN_VALUE) {
                        ((LinearLayout.LayoutParams) z7bVar4).height = i7;
                    }
                    int measuredHeight2 = view.getMeasuredHeight();
                    int i48 = linearLayoutCompat.mTotalLength;
                    linearLayoutCompat.mTotalLength = Math.max(i48, linearLayoutCompat.getNextLocationOffset(view) + i48 + measuredHeight2 + ((LinearLayout.LayoutParams) z7bVar4).topMargin + ((LinearLayout.LayoutParams) z7bVar4).bottomMargin);
                    i20 = z ? Math.max(measuredHeight2, i47) : i47;
                }
                if (i17 >= 0 && i17 == i18 + 1) {
                    linearLayoutCompat.mBaselineChildTop = linearLayoutCompat.mTotalLength;
                }
                if (i18 < i17 && ((LinearLayout.LayoutParams) z7bVar4).weight > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    cp4.h("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                    return;
                }
                if (mode == 1073741824 || ((LinearLayout.LayoutParams) z7bVar4).width != -1) {
                    z2 = false;
                } else {
                    z2 = true;
                    z5 = true;
                }
                int i49 = ((LinearLayout.LayoutParams) z7bVar4).leftMargin + ((LinearLayout.LayoutParams) z7bVar4).rightMargin;
                int measuredWidth2 = view.getMeasuredWidth() + i49;
                int max2 = Math.max(i15, measuredWidth2);
                int combineMeasuredStates = View.combineMeasuredStates(i12, view.getMeasuredState());
                z6 = z6 && ((LinearLayout.LayoutParams) z7bVar4).width == -1;
                if (((LinearLayout.LayoutParams) z7bVar4).weight > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    if (!z2) {
                        i49 = measuredWidth2;
                    }
                    i16 = Math.max(i11, i49);
                    i23 = i10;
                } else {
                    if (!z2) {
                        i49 = measuredWidth2;
                    }
                    i23 = Math.max(i10, i49);
                    i16 = i11;
                }
                i18 += linearLayoutCompat.getChildrenSkipCount(view, i18);
                i19 = i16;
                i21 = max2;
                i22 = combineMeasuredStates;
                i18++;
                mode2 = i13;
                f = f5;
                virtualChildCount = i14;
                z3 = z;
            }
            i14 = virtualChildCount;
            z = z3;
            i19 = i24;
            i13 = mode2;
            i18++;
            mode2 = i13;
            f = f5;
            virtualChildCount = i14;
            z3 = z;
        }
    }

    @Override // android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        if (this.mDivider == null) {
            return;
        }
        if (this.mOrientation == 1) {
            drawDividersVertical(canvas);
        } else {
            drawDividersHorizontal(canvas);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(ACCESSIBILITY_CLASS_NAME);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(ACCESSIBILITY_CLASS_NAME);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.mOrientation == 1) {
            layoutVertical(i, i2, i3, i4);
        } else {
            layoutHorizontal(i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (this.mOrientation == 1) {
            measureVertical(i, i2);
        } else {
            measureHorizontal(i, i2);
        }
    }

    public void setBaselineAligned(boolean z) {
        this.mBaselineAligned = z;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i >= 0 && i < getChildCount()) {
            this.mBaselineAlignedChildIndex = i;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.mDivider) {
            return;
        }
        this.mDivider = drawable;
        if (drawable != null) {
            this.mDividerWidth = drawable.getIntrinsicWidth();
            this.mDividerHeight = drawable.getIntrinsicHeight();
        } else {
            this.mDividerWidth = 0;
            this.mDividerHeight = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i) {
        this.mDividerPadding = i;
    }

    public void setGravity(int i) {
        if (this.mGravity != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.mGravity = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        int i3 = this.mGravity;
        if ((8388615 & i3) != i2) {
            this.mGravity = i2 | ((-8388616) & i3);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.mUseLargestChild = z;
    }

    public void setOrientation(int i) {
        if (this.mOrientation != i) {
            this.mOrientation = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.mShowDividers) {
            requestLayout();
        }
        this.mShowDividers = i;
    }

    public void setVerticalGravity(int i) {
        int i2 = i & 112;
        int i3 = this.mGravity;
        if ((i3 & 112) != i2) {
            this.mGravity = i2 | (i3 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.mWeightSum = Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public z7b generateLayoutParams(AttributeSet attributeSet) {
        return new z7b(getContext(), attributeSet);
    }

    public LinearLayoutCompat(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
