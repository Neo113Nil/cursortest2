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

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class l2 extends ViewGroup {
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

    public l2(Context context, AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        this.mBaselineAligned = true;
        this.mBaselineAlignedChildIndex = -1;
        this.mBaselineChildTop = 0;
        this.mGravity = 8388659;
        int[] iArr = i.a.f10843o;
        c4 f6 = c4.f(context, attributeSet, iArr, i5, 0);
        androidx.core.view.z0.n(this, context, iArr, attributeSet, f6.f722b, i5);
        TypedArray typedArray = f6.f722b;
        int i10 = typedArray.getInt(1, -1);
        if (i10 >= 0) {
            setOrientation(i10);
        }
        int i11 = typedArray.getInt(0, -1);
        if (i11 >= 0) {
            setGravity(i11);
        }
        boolean z5 = typedArray.getBoolean(2, true);
        if (!z5) {
            setBaselineAligned(z5);
        }
        this.mWeightSum = typedArray.getFloat(4, -1.0f);
        this.mBaselineAlignedChildIndex = typedArray.getInt(3, -1);
        this.mUseLargestChild = typedArray.getBoolean(7, false);
        setDividerDrawable(f6.b(5));
        this.mShowDividers = typedArray.getInt(8, 0);
        this.mDividerPadding = typedArray.getDimensionPixelSize(6, 0);
        f6.g();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof k2;
    }

    public void drawDividersHorizontal(Canvas canvas) {
        int right;
        int left;
        int i5;
        int virtualChildCount = getVirtualChildCount();
        boolean z5 = u4.f982a;
        boolean z7 = getLayoutDirection() == 1;
        for (int i10 = 0; i10 < virtualChildCount; i10++) {
            View virtualChildAt = getVirtualChildAt(i10);
            if (virtualChildAt != null && virtualChildAt.getVisibility() != 8 && hasDividerBeforeChildAt(i10)) {
                k2 k2Var = (k2) virtualChildAt.getLayoutParams();
                drawVerticalDivider(canvas, z7 ? virtualChildAt.getRight() + ((LinearLayout.LayoutParams) k2Var).rightMargin : (virtualChildAt.getLeft() - ((LinearLayout.LayoutParams) k2Var).leftMargin) - this.mDividerWidth);
            }
        }
        if (hasDividerBeforeChildAt(virtualChildCount)) {
            View virtualChildAt2 = getVirtualChildAt(virtualChildCount - 1);
            if (virtualChildAt2 != null) {
                k2 k2Var2 = (k2) virtualChildAt2.getLayoutParams();
                if (z7) {
                    left = virtualChildAt2.getLeft() - ((LinearLayout.LayoutParams) k2Var2).leftMargin;
                    i5 = this.mDividerWidth;
                    right = left - i5;
                } else {
                    right = virtualChildAt2.getRight() + ((LinearLayout.LayoutParams) k2Var2).rightMargin;
                }
            } else if (z7) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i5 = this.mDividerWidth;
                right = left - i5;
            }
            drawVerticalDivider(canvas, right);
        }
    }

    public void drawDividersVertical(Canvas canvas) {
        int virtualChildCount = getVirtualChildCount();
        for (int i5 = 0; i5 < virtualChildCount; i5++) {
            View virtualChildAt = getVirtualChildAt(i5);
            if (virtualChildAt != null && virtualChildAt.getVisibility() != 8 && hasDividerBeforeChildAt(i5)) {
                drawHorizontalDivider(canvas, (virtualChildAt.getTop() - ((LinearLayout.LayoutParams) ((k2) virtualChildAt.getLayoutParams())).topMargin) - this.mDividerHeight);
            }
        }
        if (hasDividerBeforeChildAt(virtualChildCount)) {
            View virtualChildAt2 = getVirtualChildAt(virtualChildCount - 1);
            drawHorizontalDivider(canvas, virtualChildAt2 == null ? (getHeight() - getPaddingBottom()) - this.mDividerHeight : virtualChildAt2.getBottom() + ((LinearLayout.LayoutParams) ((k2) virtualChildAt2.getLayoutParams())).bottomMargin);
        }
    }

    public void drawHorizontalDivider(Canvas canvas, int i5) {
        this.mDivider.setBounds(getPaddingLeft() + this.mDividerPadding, i5, (getWidth() - getPaddingRight()) - this.mDividerPadding, this.mDividerHeight + i5);
        this.mDivider.draw(canvas);
    }

    public void drawVerticalDivider(Canvas canvas, int i5) {
        this.mDivider.setBounds(i5, getPaddingTop() + this.mDividerPadding, this.mDividerWidth + i5, (getHeight() - getPaddingBottom()) - this.mDividerPadding);
        this.mDivider.draw(canvas);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i5;
        if (this.mBaselineAlignedChildIndex < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i10 = this.mBaselineAlignedChildIndex;
        if (childCount <= i10) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i10);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.mBaselineAlignedChildIndex == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int i11 = this.mBaselineChildTop;
        if (this.mOrientation == 1 && (i5 = this.mGravity & 112) != 48) {
            if (i5 == 16) {
                i11 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.mTotalLength) / 2;
            } else if (i5 == 80) {
                i11 = ((getBottom() - getTop()) - getPaddingBottom()) - this.mTotalLength;
            }
        }
        return i11 + ((LinearLayout.LayoutParams) ((k2) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.mBaselineAlignedChildIndex;
    }

    public int getChildrenSkipCount(View view, int i5) {
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

    public View getVirtualChildAt(int i5) {
        return getChildAt(i5);
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.mWeightSum;
    }

    public boolean hasDividerBeforeChildAt(int i5) {
        if (i5 == 0) {
            return (this.mShowDividers & 1) != 0;
        }
        if (i5 == getChildCount()) {
            return (this.mShowDividers & 4) != 0;
        }
        if ((this.mShowDividers & 2) != 0) {
            for (int i10 = i5 - 1; i10 >= 0; i10--) {
                if (getChildAt(i10).getVisibility() != 8) {
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
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void layoutHorizontal(int i5, int i10, int i11, int i12) {
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
        boolean z5 = u4.f982a;
        int i23 = 0;
        boolean z7 = true;
        Object[] objArr = getLayoutDirection() == 1;
        int paddingTop = getPaddingTop();
        int i24 = i12 - i10;
        int paddingBottom = i24 - getPaddingBottom();
        int paddingBottom2 = (i24 - paddingTop) - getPaddingBottom();
        int virtualChildCount = getVirtualChildCount();
        int i25 = this.mGravity;
        int i26 = 8388615 & i25;
        int i27 = i25 & 112;
        boolean z10 = this.mBaselineAligned;
        int[] iArr = this.mMaxAscent;
        int[] iArr2 = this.mMaxDescent;
        int absoluteGravity = Gravity.getAbsoluteGravity(i26, getLayoutDirection());
        char c2 = 2;
        int paddingLeft = absoluteGravity != 1 ? absoluteGravity != 5 ? getPaddingLeft() : ((getPaddingLeft() + i11) - i5) - this.mTotalLength : getPaddingLeft() + (((i11 - i5) - this.mTotalLength) / 2);
        if (objArr == true) {
            i13 = virtualChildCount - 1;
            i14 = -1;
        } else {
            i13 = 0;
            i14 = 1;
        }
        while (i23 < virtualChildCount) {
            boolean z11 = z7;
            int i28 = (i14 * i23) + i13;
            char c8 = c2;
            View virtualChildAt = getVirtualChildAt(i28);
            if (virtualChildAt == null) {
                i15 = i13;
                paddingLeft = measureNullChild(i28) + paddingLeft;
            } else {
                i15 = i13;
                if (virtualChildAt.getVisibility() != 8) {
                    int measuredWidth = virtualChildAt.getMeasuredWidth();
                    int measuredHeight = virtualChildAt.getMeasuredHeight();
                    k2 k2Var = (k2) virtualChildAt.getLayoutParams();
                    int i29 = i23;
                    if (z10) {
                        i16 = paddingTop;
                        if (((LinearLayout.LayoutParams) k2Var).height != -1) {
                            i17 = virtualChildAt.getBaseline();
                            i18 = ((LinearLayout.LayoutParams) k2Var).gravity;
                            if (i18 < 0) {
                                i18 = i27;
                            }
                            i19 = i18 & 112;
                            i20 = paddingBottom2;
                            if (i19 == 16) {
                                if (i19 == 48) {
                                    i21 = i16 + ((LinearLayout.LayoutParams) k2Var).topMargin;
                                    if (i17 != -1) {
                                        i21 = (iArr[z11 ? 1 : 0] - i17) + i21;
                                    }
                                } else if (i19 != 80) {
                                    i21 = i16;
                                } else {
                                    i21 = (paddingBottom - measuredHeight) - ((LinearLayout.LayoutParams) k2Var).bottomMargin;
                                    if (i17 != -1) {
                                        i22 = iArr2[c8] - (virtualChildAt.getMeasuredHeight() - i17);
                                    }
                                }
                                if (hasDividerBeforeChildAt(i28)) {
                                    paddingLeft += this.mDividerWidth;
                                }
                                int i30 = paddingLeft + ((LinearLayout.LayoutParams) k2Var).leftMargin;
                                int locationOffset = getLocationOffset(virtualChildAt) + i30;
                                virtualChildAt.layout(locationOffset, i21, locationOffset + measuredWidth, measuredHeight + i21);
                                paddingLeft = getNextLocationOffset(virtualChildAt) + measuredWidth + ((LinearLayout.LayoutParams) k2Var).rightMargin + i30;
                                i23 = getChildrenSkipCount(virtualChildAt, i28) + i29;
                                i23++;
                                c2 = c8;
                                i13 = i15;
                                z7 = z11 ? 1 : 0;
                                paddingTop = i16;
                                paddingBottom2 = i20;
                            } else {
                                i21 = ((i20 - measuredHeight) / 2) + i16 + ((LinearLayout.LayoutParams) k2Var).topMargin;
                                i22 = ((LinearLayout.LayoutParams) k2Var).bottomMargin;
                            }
                            i21 -= i22;
                            if (hasDividerBeforeChildAt(i28)) {
                            }
                            int i302 = paddingLeft + ((LinearLayout.LayoutParams) k2Var).leftMargin;
                            int locationOffset2 = getLocationOffset(virtualChildAt) + i302;
                            virtualChildAt.layout(locationOffset2, i21, locationOffset2 + measuredWidth, measuredHeight + i21);
                            paddingLeft = getNextLocationOffset(virtualChildAt) + measuredWidth + ((LinearLayout.LayoutParams) k2Var).rightMargin + i302;
                            i23 = getChildrenSkipCount(virtualChildAt, i28) + i29;
                            i23++;
                            c2 = c8;
                            i13 = i15;
                            z7 = z11 ? 1 : 0;
                            paddingTop = i16;
                            paddingBottom2 = i20;
                        }
                    } else {
                        i16 = paddingTop;
                    }
                    i17 = -1;
                    i18 = ((LinearLayout.LayoutParams) k2Var).gravity;
                    if (i18 < 0) {
                    }
                    i19 = i18 & 112;
                    i20 = paddingBottom2;
                    if (i19 == 16) {
                    }
                    i21 -= i22;
                    if (hasDividerBeforeChildAt(i28)) {
                    }
                    int i3022 = paddingLeft + ((LinearLayout.LayoutParams) k2Var).leftMargin;
                    int locationOffset22 = getLocationOffset(virtualChildAt) + i3022;
                    virtualChildAt.layout(locationOffset22, i21, locationOffset22 + measuredWidth, measuredHeight + i21);
                    paddingLeft = getNextLocationOffset(virtualChildAt) + measuredWidth + ((LinearLayout.LayoutParams) k2Var).rightMargin + i3022;
                    i23 = getChildrenSkipCount(virtualChildAt, i28) + i29;
                    i23++;
                    c2 = c8;
                    i13 = i15;
                    z7 = z11 ? 1 : 0;
                    paddingTop = i16;
                    paddingBottom2 = i20;
                }
            }
            i16 = paddingTop;
            i20 = paddingBottom2;
            i23++;
            c2 = c8;
            i13 = i15;
            z7 = z11 ? 1 : 0;
            paddingTop = i16;
            paddingBottom2 = i20;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void layoutVertical(int i5, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int paddingLeft = getPaddingLeft();
        int i16 = i11 - i5;
        int paddingRight = i16 - getPaddingRight();
        int paddingRight2 = (i16 - paddingLeft) - getPaddingRight();
        int virtualChildCount = getVirtualChildCount();
        int i17 = this.mGravity;
        int i18 = i17 & 112;
        int i19 = i17 & 8388615;
        int paddingTop = i18 != 16 ? i18 != 80 ? getPaddingTop() : ((getPaddingTop() + i12) - i10) - this.mTotalLength : (((i12 - i10) - this.mTotalLength) / 2) + getPaddingTop();
        int i20 = 0;
        while (i20 < virtualChildCount) {
            View virtualChildAt = getVirtualChildAt(i20);
            if (virtualChildAt == null) {
                paddingTop = measureNullChild(i20) + paddingTop;
            } else if (virtualChildAt.getVisibility() != 8) {
                int measuredWidth = virtualChildAt.getMeasuredWidth();
                int measuredHeight = virtualChildAt.getMeasuredHeight();
                k2 k2Var = (k2) virtualChildAt.getLayoutParams();
                int i21 = ((LinearLayout.LayoutParams) k2Var).gravity;
                if (i21 < 0) {
                    i21 = i19;
                }
                int absoluteGravity = Gravity.getAbsoluteGravity(i21, getLayoutDirection()) & 7;
                if (absoluteGravity == 1) {
                    i13 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((LinearLayout.LayoutParams) k2Var).leftMargin;
                    i14 = ((LinearLayout.LayoutParams) k2Var).rightMargin;
                } else if (absoluteGravity != 5) {
                    i15 = ((LinearLayout.LayoutParams) k2Var).leftMargin + paddingLeft;
                    if (hasDividerBeforeChildAt(i20)) {
                        paddingTop += this.mDividerHeight;
                    }
                    int i22 = paddingTop + ((LinearLayout.LayoutParams) k2Var).topMargin;
                    int locationOffset = getLocationOffset(virtualChildAt) + i22;
                    virtualChildAt.layout(i15, locationOffset, measuredWidth + i15, locationOffset + measuredHeight);
                    int nextLocationOffset = getNextLocationOffset(virtualChildAt) + measuredHeight + ((LinearLayout.LayoutParams) k2Var).bottomMargin + i22;
                    i20 += getChildrenSkipCount(virtualChildAt, i20);
                    paddingTop = nextLocationOffset;
                } else {
                    i13 = paddingRight - measuredWidth;
                    i14 = ((LinearLayout.LayoutParams) k2Var).rightMargin;
                }
                i15 = i13 - i14;
                if (hasDividerBeforeChildAt(i20)) {
                }
                int i222 = paddingTop + ((LinearLayout.LayoutParams) k2Var).topMargin;
                int locationOffset2 = getLocationOffset(virtualChildAt) + i222;
                virtualChildAt.layout(i15, locationOffset2, measuredWidth + i15, locationOffset2 + measuredHeight);
                int nextLocationOffset2 = getNextLocationOffset(virtualChildAt) + measuredHeight + ((LinearLayout.LayoutParams) k2Var).bottomMargin + i222;
                i20 += getChildrenSkipCount(virtualChildAt, i20);
                paddingTop = nextLocationOffset2;
            }
            i20++;
        }
    }

    public void measureChildBeforeLayout(View view, int i5, int i10, int i11, int i12, int i13) {
        measureChildWithMargins(view, i10, i11, i12, i13);
    }

    /* JADX WARN: Removed duplicated region for block: B:212:0x0447  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void measureHorizontal(int i5, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        boolean z5;
        int baseline;
        int i19;
        int i20;
        int i21;
        int childrenSkipCount;
        char c2;
        int i22;
        boolean z7;
        int i23;
        int i24;
        int i25;
        int[] iArr;
        int i26;
        int i27;
        boolean z10;
        int[] iArr2;
        View view;
        boolean z11;
        int baseline2;
        l2 l2Var = this;
        l2Var.mTotalLength = 0;
        int virtualChildCount = l2Var.getVirtualChildCount();
        int mode = View.MeasureSpec.getMode(i5);
        int mode2 = View.MeasureSpec.getMode(i10);
        if (l2Var.mMaxAscent == null || l2Var.mMaxDescent == null) {
            l2Var.mMaxAscent = new int[4];
            l2Var.mMaxDescent = new int[4];
        }
        int[] iArr3 = l2Var.mMaxAscent;
        int[] iArr4 = l2Var.mMaxDescent;
        iArr3[3] = -1;
        iArr3[2] = -1;
        iArr3[1] = -1;
        iArr3[0] = -1;
        iArr4[3] = -1;
        iArr4[2] = -1;
        iArr4[1] = -1;
        iArr4[0] = -1;
        boolean z12 = l2Var.mBaselineAligned;
        boolean z13 = l2Var.mUseLargestChild;
        int i28 = 1073741824;
        boolean z14 = mode == 1073741824;
        boolean z15 = z13;
        int i29 = 0;
        int i30 = 0;
        int i31 = 0;
        boolean z16 = false;
        int i32 = 0;
        boolean z17 = false;
        boolean z18 = true;
        float f6 = 0.0f;
        int i33 = 0;
        int i34 = 0;
        while (true) {
            i11 = i30;
            if (i29 >= virtualChildCount) {
                break;
            }
            boolean z19 = z12;
            View virtualChildAt = l2Var.getVirtualChildAt(i29);
            if (virtualChildAt == null) {
                l2Var.mTotalLength = l2Var.measureNullChild(i29) + l2Var.mTotalLength;
            } else if (virtualChildAt.getVisibility() == 8) {
                i29 += l2Var.getChildrenSkipCount(virtualChildAt, i29);
            } else {
                if (l2Var.hasDividerBeforeChildAt(i29)) {
                    l2Var.mTotalLength += l2Var.mDividerWidth;
                }
                k2 k2Var = (k2) virtualChildAt.getLayoutParams();
                float f10 = ((LinearLayout.LayoutParams) k2Var).weight;
                float f11 = f6 + f10;
                if (mode == i28 && ((LinearLayout.LayoutParams) k2Var).width == 0 && f10 > 0.0f) {
                    if (z14) {
                        l2Var.mTotalLength = ((LinearLayout.LayoutParams) k2Var).leftMargin + ((LinearLayout.LayoutParams) k2Var).rightMargin + l2Var.mTotalLength;
                    } else {
                        int i35 = l2Var.mTotalLength;
                        l2Var.mTotalLength = Math.max(i35, ((LinearLayout.LayoutParams) k2Var).leftMargin + i35 + ((LinearLayout.LayoutParams) k2Var).rightMargin);
                    }
                    if (z19) {
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                        virtualChildAt.measure(makeMeasureSpec, makeMeasureSpec);
                        view = virtualChildAt;
                        i24 = virtualChildCount;
                        i25 = mode;
                        iArr = iArr3;
                        iArr2 = iArr4;
                    } else {
                        view = virtualChildAt;
                        i24 = virtualChildCount;
                        i25 = mode;
                        iArr = iArr3;
                        iArr2 = iArr4;
                        z16 = true;
                    }
                    i26 = i11;
                    i27 = 1073741824;
                    z10 = z15;
                } else {
                    if (((LinearLayout.LayoutParams) k2Var).width != 0 || f10 <= 0.0f) {
                        c2 = 65534;
                        i22 = Integer.MIN_VALUE;
                    } else {
                        c2 = 65534;
                        ((LinearLayout.LayoutParams) k2Var).width = -2;
                        i22 = 0;
                    }
                    if (f11 == 0.0f) {
                        z7 = z15;
                        i23 = l2Var.mTotalLength;
                    } else {
                        z7 = z15;
                        i23 = 0;
                    }
                    i24 = virtualChildCount;
                    i25 = mode;
                    iArr = iArr3;
                    i26 = i11;
                    i27 = 1073741824;
                    z10 = z7;
                    iArr2 = iArr4;
                    int i36 = i22;
                    l2Var.measureChildBeforeLayout(virtualChildAt, i29, i5, i23, i10, 0);
                    view = virtualChildAt;
                    if (i36 != Integer.MIN_VALUE) {
                        ((LinearLayout.LayoutParams) k2Var).width = i36;
                    }
                    int measuredWidth = view.getMeasuredWidth();
                    if (z14) {
                        l2Var.mTotalLength = l2Var.getNextLocationOffset(view) + ((LinearLayout.LayoutParams) k2Var).leftMargin + measuredWidth + ((LinearLayout.LayoutParams) k2Var).rightMargin + l2Var.mTotalLength;
                    } else {
                        int i37 = l2Var.mTotalLength;
                        l2Var.mTotalLength = Math.max(i37, l2Var.getNextLocationOffset(view) + i37 + measuredWidth + ((LinearLayout.LayoutParams) k2Var).leftMargin + ((LinearLayout.LayoutParams) k2Var).rightMargin);
                    }
                    if (z10) {
                        i31 = Math.max(measuredWidth, i31);
                    }
                }
                if (mode2 == i27 || ((LinearLayout.LayoutParams) k2Var).height != -1) {
                    z11 = false;
                } else {
                    z11 = true;
                    z17 = true;
                }
                int i38 = ((LinearLayout.LayoutParams) k2Var).topMargin + ((LinearLayout.LayoutParams) k2Var).bottomMargin;
                int measuredHeight = view.getMeasuredHeight() + i38;
                i32 = View.combineMeasuredStates(i32, view.getMeasuredState());
                if (z19 && (baseline2 = view.getBaseline()) != -1) {
                    int i39 = ((LinearLayout.LayoutParams) k2Var).gravity;
                    if (i39 < 0) {
                        i39 = l2Var.mGravity;
                    }
                    int i40 = (((i39 & 112) >> 4) & (-2)) >> 1;
                    iArr[i40] = Math.max(iArr[i40], baseline2);
                    iArr2[i40] = Math.max(iArr2[i40], measuredHeight - baseline2);
                }
                int max = Math.max(i26, measuredHeight);
                z18 = z18 && ((LinearLayout.LayoutParams) k2Var).height == -1;
                if (((LinearLayout.LayoutParams) k2Var).weight > 0.0f) {
                    if (!z11) {
                        i38 = measuredHeight;
                    }
                    i34 = Math.max(i34, i38);
                } else {
                    if (!z11) {
                        i38 = measuredHeight;
                    }
                    i33 = Math.max(i33, i38);
                }
                i29 += l2Var.getChildrenSkipCount(view, i29);
                i30 = max;
                f6 = f11;
                i29++;
                z15 = z10;
                iArr4 = iArr2;
                z12 = z19;
                mode = i25;
                iArr3 = iArr;
                virtualChildCount = i24;
                i28 = 1073741824;
            }
            i24 = virtualChildCount;
            i25 = mode;
            iArr = iArr3;
            iArr2 = iArr4;
            i30 = i11;
            z10 = z15;
            i29++;
            z15 = z10;
            iArr4 = iArr2;
            z12 = z19;
            mode = i25;
            iArr3 = iArr;
            virtualChildCount = i24;
            i28 = 1073741824;
        }
        boolean z20 = z12;
        int i41 = virtualChildCount;
        int i42 = mode;
        int[] iArr5 = iArr3;
        int[] iArr6 = iArr4;
        int i43 = i32;
        boolean z21 = z15;
        if (l2Var.mTotalLength > 0 && l2Var.hasDividerBeforeChildAt(i41)) {
            l2Var.mTotalLength += l2Var.mDividerWidth;
        }
        int i44 = iArr5[1];
        int max2 = (i44 == -1 && iArr5[0] == -1 && iArr5[2] == -1 && iArr5[3] == -1) ? i11 : Math.max(i11, Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[2]))) + Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i44, iArr5[2]))));
        int i45 = i42;
        if (z21 && (i45 == Integer.MIN_VALUE || i45 == 0)) {
            l2Var.mTotalLength = 0;
            int i46 = 0;
            while (i46 < i41) {
                View virtualChildAt2 = l2Var.getVirtualChildAt(i46);
                if (virtualChildAt2 == null) {
                    l2Var.mTotalLength = l2Var.measureNullChild(i46) + l2Var.mTotalLength;
                } else if (virtualChildAt2.getVisibility() == 8) {
                    childrenSkipCount = i46 + l2Var.getChildrenSkipCount(virtualChildAt2, i46);
                    i46 = childrenSkipCount + 1;
                } else {
                    k2 k2Var2 = (k2) virtualChildAt2.getLayoutParams();
                    if (z14) {
                        l2Var.mTotalLength = l2Var.getNextLocationOffset(virtualChildAt2) + ((LinearLayout.LayoutParams) k2Var2).leftMargin + i31 + ((LinearLayout.LayoutParams) k2Var2).rightMargin + l2Var.mTotalLength;
                    } else {
                        int i47 = l2Var.mTotalLength;
                        i21 = i46;
                        l2Var.mTotalLength = Math.max(i47, l2Var.getNextLocationOffset(virtualChildAt2) + i47 + i31 + ((LinearLayout.LayoutParams) k2Var2).leftMargin + ((LinearLayout.LayoutParams) k2Var2).rightMargin);
                        childrenSkipCount = i21;
                        i46 = childrenSkipCount + 1;
                    }
                }
                i21 = i46;
                childrenSkipCount = i21;
                i46 = childrenSkipCount + 1;
            }
        }
        int paddingRight = l2Var.getPaddingRight() + l2Var.getPaddingLeft() + l2Var.mTotalLength;
        l2Var.mTotalLength = paddingRight;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, l2Var.getSuggestedMinimumWidth()), i5, 0);
        int i48 = (16777215 & resolveSizeAndState) - l2Var.mTotalLength;
        if (z16 || (i48 != 0 && f6 > 0.0f)) {
            float f12 = l2Var.mWeightSum;
            if (f12 > 0.0f) {
                f6 = f12;
            }
            iArr5[3] = -1;
            iArr5[2] = -1;
            iArr5[1] = -1;
            iArr5[0] = -1;
            iArr6[3] = -1;
            iArr6[2] = -1;
            iArr6[1] = -1;
            iArr6[0] = -1;
            l2Var.mTotalLength = 0;
            max2 = -1;
            int i49 = 0;
            while (i49 < i41) {
                View virtualChildAt3 = l2Var.getVirtualChildAt(i49);
                if (virtualChildAt3 != null && virtualChildAt3.getVisibility() != 8) {
                    k2 k2Var3 = (k2) virtualChildAt3.getLayoutParams();
                    float f13 = ((LinearLayout.LayoutParams) k2Var3).weight;
                    if (f13 > 0.0f) {
                        i17 = resolveSizeAndState;
                        int i50 = (int) ((i48 * f13) / f6);
                        f6 -= f13;
                        i48 -= i50;
                        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, l2Var.getPaddingBottom() + l2Var.getPaddingTop() + ((LinearLayout.LayoutParams) k2Var3).topMargin + ((LinearLayout.LayoutParams) k2Var3).bottomMargin, ((LinearLayout.LayoutParams) k2Var3).height);
                        if (((LinearLayout.LayoutParams) k2Var3).width == 0) {
                            i20 = 1073741824;
                            if (i45 == 1073741824) {
                                i16 = i45;
                                virtualChildAt3.measure(View.MeasureSpec.makeMeasureSpec(i50 > 0 ? i50 : 0, 1073741824), childMeasureSpec);
                                i43 = View.combineMeasuredStates(i43, virtualChildAt3.getMeasuredState() & (-16777216));
                            }
                        } else {
                            i20 = 1073741824;
                        }
                        i16 = i45;
                        int measuredWidth2 = virtualChildAt3.getMeasuredWidth() + i50;
                        if (measuredWidth2 < 0) {
                            measuredWidth2 = 0;
                        }
                        virtualChildAt3.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth2, i20), childMeasureSpec);
                        i43 = View.combineMeasuredStates(i43, virtualChildAt3.getMeasuredState() & (-16777216));
                    } else {
                        i16 = i45;
                        i17 = resolveSizeAndState;
                    }
                    if (z14) {
                        l2Var.mTotalLength = l2Var.getNextLocationOffset(virtualChildAt3) + virtualChildAt3.getMeasuredWidth() + ((LinearLayout.LayoutParams) k2Var3).leftMargin + ((LinearLayout.LayoutParams) k2Var3).rightMargin + l2Var.mTotalLength;
                    } else {
                        int i51 = l2Var.mTotalLength;
                        l2Var.mTotalLength = Math.max(i51, l2Var.getNextLocationOffset(virtualChildAt3) + virtualChildAt3.getMeasuredWidth() + i51 + ((LinearLayout.LayoutParams) k2Var3).leftMargin + ((LinearLayout.LayoutParams) k2Var3).rightMargin);
                    }
                    boolean z22 = mode2 != 1073741824 && ((LinearLayout.LayoutParams) k2Var3).height == -1;
                    int i52 = ((LinearLayout.LayoutParams) k2Var3).topMargin + ((LinearLayout.LayoutParams) k2Var3).bottomMargin;
                    int measuredHeight2 = virtualChildAt3.getMeasuredHeight() + i52;
                    max2 = Math.max(max2, measuredHeight2);
                    if (!z22) {
                        i52 = measuredHeight2;
                    }
                    int max3 = Math.max(i33, i52);
                    if (z18) {
                        i18 = -1;
                        if (((LinearLayout.LayoutParams) k2Var3).height == -1) {
                            z5 = true;
                            if (z20 && (baseline = virtualChildAt3.getBaseline()) != i18) {
                                i19 = ((LinearLayout.LayoutParams) k2Var3).gravity;
                                if (i19 < 0) {
                                    i19 = l2Var.mGravity;
                                }
                                int i53 = (((i19 & 112) >> 4) & (-2)) >> 1;
                                iArr5[i53] = Math.max(iArr5[i53], baseline);
                                iArr6[i53] = Math.max(iArr6[i53], measuredHeight2 - baseline);
                            }
                            i33 = max3;
                            z18 = z5;
                            i49++;
                            resolveSizeAndState = i17;
                            i45 = i16;
                        }
                    } else {
                        i18 = -1;
                    }
                    z5 = false;
                    if (z20) {
                        i19 = ((LinearLayout.LayoutParams) k2Var3).gravity;
                        if (i19 < 0) {
                        }
                        int i532 = (((i19 & 112) >> 4) & (-2)) >> 1;
                        iArr5[i532] = Math.max(iArr5[i532], baseline);
                        iArr6[i532] = Math.max(iArr6[i532], measuredHeight2 - baseline);
                    }
                    i33 = max3;
                    z18 = z5;
                    i49++;
                    resolveSizeAndState = i17;
                    i45 = i16;
                }
                i16 = i45;
                i17 = resolveSizeAndState;
                i49++;
                resolveSizeAndState = i17;
                i45 = i16;
            }
            i12 = resolveSizeAndState;
            i13 = -16777216;
            l2Var.mTotalLength = l2Var.getPaddingRight() + l2Var.getPaddingLeft() + l2Var.mTotalLength;
            int i54 = iArr5[1];
            if (i54 == -1 && iArr5[0] == -1 && iArr5[2] == -1 && iArr5[3] == -1) {
                i14 = 0;
            } else {
                i14 = 0;
                max2 = Math.max(max2, Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[2]))) + Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i54, iArr5[2]))));
            }
            i15 = i33;
        } else {
            i15 = Math.max(i33, i34);
            if (z21 && i45 != 1073741824) {
                for (int i55 = 0; i55 < i41; i55++) {
                    View virtualChildAt4 = l2Var.getVirtualChildAt(i55);
                    if (virtualChildAt4 != null && virtualChildAt4.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((k2) virtualChildAt4.getLayoutParams())).weight > 0.0f) {
                        virtualChildAt4.measure(View.MeasureSpec.makeMeasureSpec(i31, 1073741824), View.MeasureSpec.makeMeasureSpec(virtualChildAt4.getMeasuredHeight(), 1073741824));
                    }
                }
            }
            i12 = resolveSizeAndState;
            i13 = -16777216;
            i14 = 0;
        }
        if (z18 || mode2 == 1073741824) {
            i15 = max2;
        }
        l2Var.setMeasuredDimension(i12 | (i43 & i13), View.resolveSizeAndState(Math.max(l2Var.getPaddingBottom() + l2Var.getPaddingTop() + i15, l2Var.getSuggestedMinimumHeight()), i10, i43 << 16));
        if (z17) {
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(l2Var.getMeasuredHeight(), 1073741824);
            int i56 = i14;
            while (i56 < i41) {
                int i57 = makeMeasureSpec2;
                View virtualChildAt5 = l2Var.getVirtualChildAt(i56);
                if (virtualChildAt5.getVisibility() != 8) {
                    k2 k2Var4 = (k2) virtualChildAt5.getLayoutParams();
                    if (((LinearLayout.LayoutParams) k2Var4).height == -1) {
                        int i58 = ((LinearLayout.LayoutParams) k2Var4).width;
                        ((LinearLayout.LayoutParams) k2Var4).width = virtualChildAt5.getMeasuredWidth();
                        l2Var.measureChildWithMargins(virtualChildAt5, i5, 0, i57, 0);
                        ((LinearLayout.LayoutParams) k2Var4).width = i58;
                    }
                }
                i56++;
                l2Var = this;
                makeMeasureSpec2 = i57;
            }
        }
    }

    public int measureNullChild(int i5) {
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:173:0x02e3, code lost:
    
        if (((android.widget.LinearLayout.LayoutParams) r13).width == (-1)) goto L145;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void measureVertical(int i5, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z5;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        View view;
        boolean z7;
        int i24;
        l2 l2Var = this;
        l2Var.mTotalLength = 0;
        int virtualChildCount = l2Var.getVirtualChildCount();
        int mode = View.MeasureSpec.getMode(i5);
        int mode2 = View.MeasureSpec.getMode(i10);
        int i25 = l2Var.mBaselineAlignedChildIndex;
        boolean z10 = l2Var.mUseLargestChild;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        int i29 = 0;
        int i30 = 0;
        int i31 = 0;
        boolean z11 = false;
        boolean z12 = false;
        float f6 = 0.0f;
        boolean z13 = true;
        while (true) {
            int i32 = i27;
            int i33 = 8;
            if (i26 >= virtualChildCount) {
                float f10 = f6;
                int i34 = virtualChildCount;
                boolean z14 = z10;
                int i35 = i31;
                int i36 = i29;
                int i37 = i30;
                int i38 = mode2;
                int i39 = i28;
                if (l2Var.mTotalLength > 0 && l2Var.hasDividerBeforeChildAt(i34)) {
                    l2Var.mTotalLength += l2Var.mDividerHeight;
                }
                int i40 = i38;
                if (z14 && (i40 == Integer.MIN_VALUE || i40 == 0)) {
                    l2Var.mTotalLength = 0;
                    int i41 = 0;
                    while (i41 < i34) {
                        View virtualChildAt = l2Var.getVirtualChildAt(i41);
                        if (virtualChildAt == null) {
                            l2Var.mTotalLength = l2Var.measureNullChild(i41) + l2Var.mTotalLength;
                        } else if (virtualChildAt.getVisibility() == i33) {
                            i41 += l2Var.getChildrenSkipCount(virtualChildAt, i41);
                        } else {
                            k2 k2Var = (k2) virtualChildAt.getLayoutParams();
                            int i42 = l2Var.mTotalLength;
                            l2Var.mTotalLength = Math.max(i42, l2Var.getNextLocationOffset(virtualChildAt) + i42 + i39 + ((LinearLayout.LayoutParams) k2Var).topMargin + ((LinearLayout.LayoutParams) k2Var).bottomMargin);
                        }
                        i41++;
                        i33 = 8;
                    }
                }
                int paddingBottom = l2Var.getPaddingBottom() + l2Var.getPaddingTop() + l2Var.mTotalLength;
                l2Var.mTotalLength = paddingBottom;
                int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingBottom, l2Var.getSuggestedMinimumHeight()), i10, 0);
                int i43 = (16777215 & resolveSizeAndState) - l2Var.mTotalLength;
                if (z11 || (i43 != 0 && f10 > 0.0f)) {
                    float f11 = l2Var.mWeightSum;
                    if (f11 > 0.0f) {
                        f10 = f11;
                    }
                    l2Var.mTotalLength = 0;
                    int i44 = i35;
                    int i45 = i43;
                    int i46 = 0;
                    while (i46 < i34) {
                        View virtualChildAt2 = l2Var.getVirtualChildAt(i46);
                        if (virtualChildAt2.getVisibility() == 8) {
                            i12 = i40;
                        } else {
                            k2 k2Var2 = (k2) virtualChildAt2.getLayoutParams();
                            float f12 = ((LinearLayout.LayoutParams) k2Var2).weight;
                            if (f12 > 0.0f) {
                                int i47 = (int) ((i45 * f12) / f10);
                                f10 -= f12;
                                i45 -= i47;
                                int childMeasureSpec = ViewGroup.getChildMeasureSpec(i5, l2Var.getPaddingRight() + l2Var.getPaddingLeft() + ((LinearLayout.LayoutParams) k2Var2).leftMargin + ((LinearLayout.LayoutParams) k2Var2).rightMargin, ((LinearLayout.LayoutParams) k2Var2).width);
                                if (((LinearLayout.LayoutParams) k2Var2).height == 0) {
                                    i14 = 1073741824;
                                    if (i40 == 1073741824) {
                                        if (i47 <= 0) {
                                            i47 = 0;
                                        }
                                        virtualChildAt2.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i47, 1073741824));
                                        i37 = View.combineMeasuredStates(i37, virtualChildAt2.getMeasuredState() & (-256));
                                    }
                                } else {
                                    i14 = 1073741824;
                                }
                                int measuredHeight = virtualChildAt2.getMeasuredHeight() + i47;
                                if (measuredHeight < 0) {
                                    measuredHeight = 0;
                                }
                                virtualChildAt2.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight, i14));
                                i37 = View.combineMeasuredStates(i37, virtualChildAt2.getMeasuredState() & (-256));
                            }
                            int i48 = ((LinearLayout.LayoutParams) k2Var2).leftMargin + ((LinearLayout.LayoutParams) k2Var2).rightMargin;
                            int measuredWidth = virtualChildAt2.getMeasuredWidth() + i48;
                            i36 = Math.max(i36, measuredWidth);
                            if (mode != 1073741824) {
                                i12 = i40;
                                i13 = -1;
                            } else {
                                i12 = i40;
                                i13 = -1;
                            }
                            i48 = measuredWidth;
                            int max = Math.max(i44, i48);
                            boolean z15 = z13 && ((LinearLayout.LayoutParams) k2Var2).width == i13;
                            int i49 = l2Var.mTotalLength;
                            l2Var.mTotalLength = Math.max(i49, l2Var.getNextLocationOffset(virtualChildAt2) + virtualChildAt2.getMeasuredHeight() + i49 + ((LinearLayout.LayoutParams) k2Var2).topMargin + ((LinearLayout.LayoutParams) k2Var2).bottomMargin);
                            z13 = z15;
                            i44 = max;
                        }
                        i46++;
                        i40 = i12;
                    }
                    l2Var.mTotalLength = l2Var.getPaddingBottom() + l2Var.getPaddingTop() + l2Var.mTotalLength;
                    i11 = i44;
                } else {
                    i11 = Math.max(i35, i32);
                    if (z14 && i40 != 1073741824) {
                        for (int i50 = 0; i50 < i34; i50++) {
                            View virtualChildAt3 = l2Var.getVirtualChildAt(i50);
                            if (virtualChildAt3 != null && virtualChildAt3.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((k2) virtualChildAt3.getLayoutParams())).weight > 0.0f) {
                                virtualChildAt3.measure(View.MeasureSpec.makeMeasureSpec(virtualChildAt3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i39, 1073741824));
                            }
                        }
                    }
                }
                if (z13 || mode == 1073741824) {
                    i11 = i36;
                }
                l2Var.setMeasuredDimension(View.resolveSizeAndState(Math.max(l2Var.getPaddingRight() + l2Var.getPaddingLeft() + i11, l2Var.getSuggestedMinimumWidth()), i5, i37), resolveSizeAndState);
                if (z12) {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(l2Var.getMeasuredWidth(), 1073741824);
                    int i51 = 0;
                    while (i51 < i34) {
                        View virtualChildAt4 = l2Var.getVirtualChildAt(i51);
                        if (virtualChildAt4.getVisibility() != 8) {
                            k2 k2Var3 = (k2) virtualChildAt4.getLayoutParams();
                            if (((LinearLayout.LayoutParams) k2Var3).width == -1) {
                                int i52 = ((LinearLayout.LayoutParams) k2Var3).height;
                                ((LinearLayout.LayoutParams) k2Var3).height = virtualChildAt4.getMeasuredHeight();
                                l2Var.measureChildWithMargins(virtualChildAt4, makeMeasureSpec, 0, i10, 0);
                                ((LinearLayout.LayoutParams) k2Var3).height = i52;
                            }
                        }
                        i51++;
                        l2Var = this;
                    }
                    return;
                }
                return;
            }
            float f13 = f6;
            View virtualChildAt5 = l2Var.getVirtualChildAt(i26);
            if (virtualChildAt5 == null) {
                l2Var.mTotalLength = l2Var.measureNullChild(i26) + l2Var.mTotalLength;
            } else if (virtualChildAt5.getVisibility() == 8) {
                i26 += l2Var.getChildrenSkipCount(virtualChildAt5, i26);
            } else {
                if (l2Var.hasDividerBeforeChildAt(i26)) {
                    l2Var.mTotalLength += l2Var.mDividerHeight;
                }
                k2 k2Var4 = (k2) virtualChildAt5.getLayoutParams();
                float f14 = ((LinearLayout.LayoutParams) k2Var4).weight;
                f13 += f14;
                if (mode2 == 1073741824 && ((LinearLayout.LayoutParams) k2Var4).height == 0 && f14 > 0.0f) {
                    int i53 = l2Var.mTotalLength;
                    l2Var.mTotalLength = Math.max(i53, ((LinearLayout.LayoutParams) k2Var4).topMargin + i53 + ((LinearLayout.LayoutParams) k2Var4).bottomMargin);
                    view = virtualChildAt5;
                    i22 = virtualChildCount;
                    z5 = z10;
                    i18 = i31;
                    z11 = true;
                    i19 = i32;
                    i23 = i29;
                    i20 = i30;
                    i21 = mode2;
                } else {
                    if (((LinearLayout.LayoutParams) k2Var4).height != 0 || f14 <= 0.0f) {
                        i15 = Integer.MIN_VALUE;
                    } else {
                        ((LinearLayout.LayoutParams) k2Var4).height = -2;
                        i15 = 0;
                    }
                    if (f13 == 0.0f) {
                        int i54 = i30;
                        i17 = l2Var.mTotalLength;
                        i16 = i54;
                    } else {
                        i16 = i30;
                        i17 = 0;
                    }
                    int i55 = i28;
                    z5 = z10;
                    i18 = i31;
                    i19 = i32;
                    i20 = i16;
                    i21 = mode2;
                    i22 = virtualChildCount;
                    i23 = i29;
                    l2Var.measureChildBeforeLayout(virtualChildAt5, i26, i5, 0, i10, i17);
                    view = virtualChildAt5;
                    if (i15 != Integer.MIN_VALUE) {
                        ((LinearLayout.LayoutParams) k2Var4).height = i15;
                    }
                    int measuredHeight2 = view.getMeasuredHeight();
                    int i56 = l2Var.mTotalLength;
                    l2Var.mTotalLength = Math.max(i56, l2Var.getNextLocationOffset(view) + i56 + measuredHeight2 + ((LinearLayout.LayoutParams) k2Var4).topMargin + ((LinearLayout.LayoutParams) k2Var4).bottomMargin);
                    i28 = z5 ? Math.max(measuredHeight2, i55) : i55;
                }
                if (i25 >= 0 && i25 == i26 + 1) {
                    l2Var.mBaselineChildTop = l2Var.mTotalLength;
                }
                if (i26 < i25 && ((LinearLayout.LayoutParams) k2Var4).weight > 0.0f) {
                    throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                }
                if (mode == 1073741824 || ((LinearLayout.LayoutParams) k2Var4).width != -1) {
                    z7 = false;
                } else {
                    z7 = true;
                    z12 = true;
                }
                int i57 = ((LinearLayout.LayoutParams) k2Var4).leftMargin + ((LinearLayout.LayoutParams) k2Var4).rightMargin;
                int measuredWidth2 = view.getMeasuredWidth() + i57;
                int max2 = Math.max(i23, measuredWidth2);
                int combineMeasuredStates = View.combineMeasuredStates(i20, view.getMeasuredState());
                z13 = z13 && ((LinearLayout.LayoutParams) k2Var4).width == -1;
                if (((LinearLayout.LayoutParams) k2Var4).weight > 0.0f) {
                    if (!z7) {
                        i57 = measuredWidth2;
                    }
                    i24 = Math.max(i19, i57);
                    i31 = i18;
                } else {
                    if (!z7) {
                        i57 = measuredWidth2;
                    }
                    i31 = Math.max(i18, i57);
                    i24 = i19;
                }
                i26 += l2Var.getChildrenSkipCount(view, i26);
                i27 = i24;
                i29 = max2;
                i30 = combineMeasuredStates;
                i26++;
                mode2 = i21;
                f6 = f13;
                virtualChildCount = i22;
                z10 = z5;
            }
            i22 = virtualChildCount;
            z5 = z10;
            i27 = i32;
            i21 = mode2;
            i26++;
            mode2 = i21;
            f6 = f13;
            virtualChildCount = i22;
            z10 = z5;
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
    public void onLayout(boolean z5, int i5, int i10, int i11, int i12) {
        if (this.mOrientation == 1) {
            layoutVertical(i5, i10, i11, i12);
        } else {
            layoutHorizontal(i5, i10, i11, i12);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i5, int i10) {
        if (this.mOrientation == 1) {
            measureVertical(i5, i10);
        } else {
            measureHorizontal(i5, i10);
        }
    }

    public void setBaselineAligned(boolean z5) {
        this.mBaselineAligned = z5;
    }

    public void setBaselineAlignedChildIndex(int i5) {
        if (i5 >= 0 && i5 < getChildCount()) {
            this.mBaselineAlignedChildIndex = i5;
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

    public void setDividerPadding(int i5) {
        this.mDividerPadding = i5;
    }

    public void setGravity(int i5) {
        if (this.mGravity != i5) {
            if ((8388615 & i5) == 0) {
                i5 |= 8388611;
            }
            if ((i5 & 112) == 0) {
                i5 |= 48;
            }
            this.mGravity = i5;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i5) {
        int i10 = i5 & 8388615;
        int i11 = this.mGravity;
        if ((8388615 & i11) != i10) {
            this.mGravity = i10 | ((-8388616) & i11);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z5) {
        this.mUseLargestChild = z5;
    }

    public void setOrientation(int i5) {
        if (this.mOrientation != i5) {
            this.mOrientation = i5;
            requestLayout();
        }
    }

    public void setShowDividers(int i5) {
        if (i5 != this.mShowDividers) {
            requestLayout();
        }
        this.mShowDividers = i5;
    }

    public void setVerticalGravity(int i5) {
        int i10 = i5 & 112;
        int i11 = this.mGravity;
        if ((i11 & 112) != i10) {
            this.mGravity = i10 | (i11 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f6) {
        this.mWeightSum = Math.max(0.0f, f6);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public k2 generateDefaultLayoutParams() {
        int i5 = this.mOrientation;
        if (i5 == 0) {
            return new k2(-2, -2);
        }
        if (i5 == 1) {
            return new k2(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public k2 generateLayoutParams(AttributeSet attributeSet) {
        return new k2(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public k2 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof k2) {
            return new k2((k2) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new k2((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new k2(layoutParams);
    }
}
