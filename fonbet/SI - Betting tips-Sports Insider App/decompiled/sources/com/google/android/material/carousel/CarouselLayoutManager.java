package com.google.android.material.carousel;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.c1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.g1;
import androidx.recyclerview.widget.k1;
import androidx.recyclerview.widget.l1;
import androidx.recyclerview.widget.m0;
import androidx.recyclerview.widget.s1;
import androidx.recyclerview.widget.x1;
import androidx.recyclerview.widget.z1;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.carousel.CarouselStrategy;
import com.google.android.material.carousel.KeylineState;
import com.google.android.play.core.appupdate.b;
import d9.e;
import g0.c;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class CarouselLayoutManager extends k1 implements Carousel, x1 {
    public static final int ALIGNMENT_CENTER = 1;
    public static final int ALIGNMENT_START = 0;
    public static final int HORIZONTAL = 0;
    private static final String TAG = "CarouselLayoutManager";
    public static final int VERTICAL = 1;
    private int carouselAlignment;

    @NonNull
    private CarouselStrategy carouselStrategy;
    private int currentEstimatedPosition;
    private int currentFillStartPosition;
    private KeylineState currentKeylineState;
    private final DebugItemDecoration debugItemDecoration;
    private boolean isDebuggingEnabled;
    private KeylineStateList keylineStateList;
    private Map<Integer, KeylineState> keylineStatePositionMap;
    private int lastItemCount;
    int maxScroll;
    int minScroll;
    private CarouselOrientationHelper orientationHelper;
    private final View.OnLayoutChangeListener recyclerViewSizeChangeListener;
    int scrollOffset;

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    public static final class ChildCalculations {
        final float center;
        final View child;
        final float offsetCenter;
        final KeylineRange range;

        public ChildCalculations(View view, float f6, float f10, KeylineRange keylineRange) {
            this.child = view;
            this.center = f6;
            this.offsetCenter = f10;
            this.range = keylineRange;
        }
    }

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    public static class DebugItemDecoration extends g1 {
        private List<KeylineState.Keyline> keylines;
        private final Paint linePaint;

        public DebugItemDecoration() {
            Paint paint = new Paint();
            this.linePaint = paint;
            this.keylines = DesugarCollections.unmodifiableList(new ArrayList());
            paint.setStrokeWidth(5.0f);
            paint.setColor(-65281);
        }

        @Override // androidx.recyclerview.widget.g1
        public void onDrawOver(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull z1 z1Var) {
            super.onDrawOver(canvas, recyclerView, z1Var);
            this.linePaint.setStrokeWidth(recyclerView.getResources().getDimension(R.dimen.m3_carousel_debug_keyline_width));
            for (KeylineState.Keyline keyline : this.keylines) {
                this.linePaint.setColor(c.b(-65281, -16776961, keyline.mask));
                if (((CarouselLayoutManager) recyclerView.getLayoutManager()).isHorizontal()) {
                    canvas.drawLine(keyline.locOffset, ((CarouselLayoutManager) recyclerView.getLayoutManager()).getParentTop(), keyline.locOffset, ((CarouselLayoutManager) recyclerView.getLayoutManager()).getParentBottom(), this.linePaint);
                } else {
                    canvas.drawLine(((CarouselLayoutManager) recyclerView.getLayoutManager()).getParentLeft(), keyline.locOffset, ((CarouselLayoutManager) recyclerView.getLayoutManager()).getParentRight(), keyline.locOffset, this.linePaint);
                }
            }
        }

        public void setKeylines(List<KeylineState.Keyline> list) {
            this.keylines = DesugarCollections.unmodifiableList(list);
        }
    }

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    public static class KeylineRange {
        final KeylineState.Keyline leftOrTop;
        final KeylineState.Keyline rightOrBottom;

        public KeylineRange(KeylineState.Keyline keyline, KeylineState.Keyline keyline2) {
            if (keyline.loc > keyline2.loc) {
                throw new IllegalArgumentException();
            }
            this.leftOrTop = keyline;
            this.rightOrBottom = keyline2;
        }
    }

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    public static class LayoutDirection {
        private static final int INVALID_LAYOUT = Integer.MIN_VALUE;
        private static final int LAYOUT_END = 1;
        private static final int LAYOUT_START = -1;

        private LayoutDirection() {
        }
    }

    public CarouselLayoutManager() {
        this(new MultiBrowseCarouselStrategy());
    }

    private void addAndLayoutView(View view, int i5, ChildCalculations childCalculations) {
        float itemSize = this.currentKeylineState.getItemSize() / 2.0f;
        addView(view, i5);
        measureChildWithMargins(view, 0, 0);
        float f6 = childCalculations.offsetCenter;
        this.orientationHelper.layoutDecoratedWithMargins(view, (int) (f6 - itemSize), (int) (f6 + itemSize));
        updateChildMaskForLocation(view, childCalculations.center, childCalculations.range);
    }

    private float addEnd(float f6, float f10) {
        return isLayoutRtl() ? f6 - f10 : f6 + f10;
    }

    private float addStart(float f6, float f10) {
        return isLayoutRtl() ? f6 + f10 : f6 - f10;
    }

    private void addViewAtPosition(@NonNull s1 s1Var, int i5, int i10) {
        if (i5 < 0 || i5 >= getItemCount()) {
            return;
        }
        ChildCalculations makeChildCalculations = makeChildCalculations(s1Var, calculateChildStartForFill(i5), i5);
        addAndLayoutView(makeChildCalculations.child, i10, makeChildCalculations);
    }

    private void addViewsEnd(s1 s1Var, z1 z1Var, int i5) {
        float calculateChildStartForFill = calculateChildStartForFill(i5);
        while (i5 < z1Var.b()) {
            float addEnd = addEnd(calculateChildStartForFill, this.currentKeylineState.getItemSize() / 2.0f);
            KeylineRange surroundingKeylineRange = getSurroundingKeylineRange(this.currentKeylineState.getKeylines(), addEnd, false);
            float calculateChildOffsetCenterForLocation = calculateChildOffsetCenterForLocation(addEnd, surroundingKeylineRange);
            if (isLocOffsetOutOfFillBoundsEnd(calculateChildOffsetCenterForLocation, surroundingKeylineRange)) {
                return;
            }
            calculateChildStartForFill = addEnd(calculateChildStartForFill, this.currentKeylineState.getItemSize());
            if (!isLocOffsetOutOfFillBoundsStart(calculateChildOffsetCenterForLocation, surroundingKeylineRange)) {
                View d10 = s1Var.d(i5);
                addAndLayoutView(d10, -1, new ChildCalculations(d10, addEnd, calculateChildOffsetCenterForLocation, surroundingKeylineRange));
            }
            i5++;
        }
    }

    private void addViewsStart(s1 s1Var, int i5) {
        float calculateChildStartForFill = calculateChildStartForFill(i5);
        while (i5 >= 0) {
            float addEnd = addEnd(calculateChildStartForFill, this.currentKeylineState.getItemSize() / 2.0f);
            KeylineRange surroundingKeylineRange = getSurroundingKeylineRange(this.currentKeylineState.getKeylines(), addEnd, false);
            float calculateChildOffsetCenterForLocation = calculateChildOffsetCenterForLocation(addEnd, surroundingKeylineRange);
            if (isLocOffsetOutOfFillBoundsStart(calculateChildOffsetCenterForLocation, surroundingKeylineRange)) {
                return;
            }
            calculateChildStartForFill = addStart(calculateChildStartForFill, this.currentKeylineState.getItemSize());
            if (!isLocOffsetOutOfFillBoundsEnd(calculateChildOffsetCenterForLocation, surroundingKeylineRange)) {
                View d10 = s1Var.d(i5);
                addAndLayoutView(d10, 0, new ChildCalculations(d10, addEnd, calculateChildOffsetCenterForLocation, surroundingKeylineRange));
            }
            i5--;
        }
    }

    private float calculateChildOffsetCenterForLocation(float f6, KeylineRange keylineRange) {
        KeylineState.Keyline keyline = keylineRange.leftOrTop;
        float f10 = keyline.locOffset;
        KeylineState.Keyline keyline2 = keylineRange.rightOrBottom;
        float lerp = AnimationUtils.lerp(f10, keyline2.locOffset, keyline.loc, keyline2.loc, f6);
        if (keylineRange.rightOrBottom != this.currentKeylineState.getFirstKeyline() && keylineRange.leftOrTop != this.currentKeylineState.getLastKeyline()) {
            return lerp;
        }
        KeylineState.Keyline keyline3 = keylineRange.rightOrBottom;
        return e.w(1.0f, keyline3.mask, f6 - keyline3.loc, lerp);
    }

    private float calculateChildStartForFill(int i5) {
        return addEnd(getParentStart() - this.scrollOffset, this.currentKeylineState.getItemSize() * i5);
    }

    private int calculateEndScroll(z1 z1Var, KeylineStateList keylineStateList) {
        boolean isLayoutRtl = isLayoutRtl();
        KeylineState startState = isLayoutRtl ? keylineStateList.getStartState() : keylineStateList.getEndState();
        KeylineState.Keyline firstFocalKeyline = isLayoutRtl ? startState.getFirstFocalKeyline() : startState.getLastFocalKeyline();
        int itemSize = (int) ((((isLayoutRtl ? -1 : 1) * firstFocalKeyline.maskedItemSize) / 2.0f) + (((startState.getItemSize() * (z1Var.b() - 1)) * (isLayoutRtl ? -1.0f : 1.0f)) - (firstFocalKeyline.loc - getParentStart())));
        return isLayoutRtl ? Math.min(0, itemSize) : Math.max(0, itemSize);
    }

    private static int calculateShouldScrollBy(int i5, int i10, int i11, int i12) {
        int i13 = i10 + i5;
        return i13 < i11 ? i11 - i10 : i13 > i12 ? i12 - i10 : i5;
    }

    private int calculateStartScroll(@NonNull KeylineStateList keylineStateList) {
        boolean isLayoutRtl = isLayoutRtl();
        KeylineState endState = isLayoutRtl ? keylineStateList.getEndState() : keylineStateList.getStartState();
        return (int) (getParentStart() - addStart((isLayoutRtl ? endState.getLastFocalKeyline() : endState.getFirstFocalKeyline()).loc, endState.getItemSize() / 2.0f));
    }

    private int convertFocusDirectionToLayoutDirection(int i5) {
        int orientation = getOrientation();
        if (i5 == 1) {
            return -1;
        }
        if (i5 == 2) {
            return 1;
        }
        if (i5 == 17) {
            if (orientation == 0) {
                return isLayoutRtl() ? 1 : -1;
            }
            return Integer.MIN_VALUE;
        }
        if (i5 == 33) {
            return orientation == 1 ? -1 : Integer.MIN_VALUE;
        }
        if (i5 == 66) {
            if (orientation == 0) {
                return isLayoutRtl() ? -1 : 1;
            }
            return Integer.MIN_VALUE;
        }
        if (i5 == 130) {
            return orientation == 1 ? 1 : Integer.MIN_VALUE;
        }
        Log.d(TAG, "Unknown focus request:" + i5);
        return Integer.MIN_VALUE;
    }

    private void fill(s1 s1Var, z1 z1Var) {
        removeAndRecycleOutOfBoundsViews(s1Var);
        if (getChildCount() == 0) {
            addViewsStart(s1Var, this.currentFillStartPosition - 1);
            addViewsEnd(s1Var, z1Var, this.currentFillStartPosition);
        } else {
            int position = getPosition(getChildAt(0));
            int position2 = getPosition(getChildAt(getChildCount() - 1));
            addViewsStart(s1Var, position - 1);
            addViewsEnd(s1Var, z1Var, position2 + 1);
        }
        validateChildOrderIfDebugging();
    }

    private View getChildClosestToEnd() {
        return getChildAt(isLayoutRtl() ? 0 : getChildCount() - 1);
    }

    private View getChildClosestToStart() {
        return getChildAt(isLayoutRtl() ? getChildCount() - 1 : 0);
    }

    private int getContainerSize() {
        return isHorizontal() ? getContainerWidth() : getContainerHeight();
    }

    private float getDecoratedCenterWithMargins(View view) {
        super.getDecoratedBoundsWithMargins(view, new Rect());
        return isHorizontal() ? r0.centerX() : r0.centerY();
    }

    private int getItemMargins() {
        int i5;
        int i10;
        if (getChildCount() <= 0) {
            return 0;
        }
        l1 l1Var = (l1) getChildAt(0).getLayoutParams();
        if (this.orientationHelper.orientation == 0) {
            i5 = ((ViewGroup.MarginLayoutParams) l1Var).leftMargin;
            i10 = ((ViewGroup.MarginLayoutParams) l1Var).rightMargin;
        } else {
            i5 = ((ViewGroup.MarginLayoutParams) l1Var).topMargin;
            i10 = ((ViewGroup.MarginLayoutParams) l1Var).bottomMargin;
        }
        return i5 + i10;
    }

    private KeylineState getKeylineStartingState(KeylineStateList keylineStateList) {
        return isLayoutRtl() ? keylineStateList.getEndState() : keylineStateList.getStartState();
    }

    private KeylineState getKeylineStateForPosition(int i5) {
        KeylineState keylineState;
        Map<Integer, KeylineState> map = this.keylineStatePositionMap;
        return (map == null || (keylineState = map.get(Integer.valueOf(b.f(i5, 0, Math.max(0, getItemCount() + (-1)))))) == null) ? this.keylineStateList.getDefaultState() : keylineState;
    }

    private int getLeftOrTopPaddingForKeylineShift() {
        if (getClipToPadding()) {
            return 0;
        }
        return getOrientation() == 1 ? getPaddingTop() : getPaddingLeft();
    }

    private float getMaskedItemSizeForLocOffset(float f6, KeylineRange keylineRange) {
        KeylineState.Keyline keyline = keylineRange.leftOrTop;
        float f10 = keyline.maskedItemSize;
        KeylineState.Keyline keyline2 = keylineRange.rightOrBottom;
        return AnimationUtils.lerp(f10, keyline2.maskedItemSize, keyline.locOffset, keyline2.locOffset, f6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getParentBottom() {
        return this.orientationHelper.getParentBottom();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getParentLeft() {
        return this.orientationHelper.getParentLeft();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getParentRight() {
        return this.orientationHelper.getParentRight();
    }

    private int getParentStart() {
        return this.orientationHelper.getParentStart();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getParentTop() {
        return this.orientationHelper.getParentTop();
    }

    private int getRightOrBottomPaddingForKeylineShift() {
        if (getClipToPadding()) {
            return 0;
        }
        return getOrientation() == 1 ? getPaddingBottom() : getPaddingRight();
    }

    private int getScrollOffsetForPosition(int i5, KeylineState keylineState) {
        if (isLayoutRtl()) {
            return (int) (((getContainerSize() - keylineState.getLastFocalKeyline().loc) - (keylineState.getItemSize() * i5)) - (keylineState.getItemSize() / 2.0f));
        }
        return (int) ((keylineState.getItemSize() / 2.0f) + ((keylineState.getItemSize() * i5) - keylineState.getFirstFocalKeyline().loc));
    }

    private int getSmallestScrollOffsetToFocalKeyline(int i5, @NonNull KeylineState keylineState) {
        int i10 = Integer.MAX_VALUE;
        for (KeylineState.Keyline keyline : keylineState.getFocalKeylines()) {
            float itemSize = (keylineState.getItemSize() / 2.0f) + (keylineState.getItemSize() * i5);
            int containerSize = (isLayoutRtl() ? (int) ((getContainerSize() - keyline.loc) - itemSize) : (int) (itemSize - keyline.loc)) - this.scrollOffset;
            if (Math.abs(i10) > Math.abs(containerSize)) {
                i10 = containerSize;
            }
        }
        return i10;
    }

    private static KeylineRange getSurroundingKeylineRange(List<KeylineState.Keyline> list, float f6, boolean z5) {
        float f10 = Float.MAX_VALUE;
        int i5 = -1;
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        float f11 = -3.4028235E38f;
        float f12 = Float.MAX_VALUE;
        float f13 = Float.MAX_VALUE;
        for (int i13 = 0; i13 < list.size(); i13++) {
            KeylineState.Keyline keyline = list.get(i13);
            float f14 = z5 ? keyline.locOffset : keyline.loc;
            float abs = Math.abs(f14 - f6);
            if (f14 <= f6 && abs <= f10) {
                i5 = i13;
                f10 = abs;
            }
            if (f14 > f6 && abs <= f12) {
                i11 = i13;
                f12 = abs;
            }
            if (f14 <= f13) {
                i10 = i13;
                f13 = f14;
            }
            if (f14 > f11) {
                i12 = i13;
                f11 = f14;
            }
        }
        if (i5 == -1) {
            i5 = i10;
        }
        if (i11 == -1) {
            i11 = i12;
        }
        return new KeylineRange(list.get(i5), list.get(i11));
    }

    private boolean isLocOffsetOutOfFillBoundsEnd(float f6, KeylineRange keylineRange) {
        float addStart = addStart(f6, getMaskedItemSizeForLocOffset(f6, keylineRange) / 2.0f);
        return isLayoutRtl() ? addStart < 0.0f : addStart > ((float) getContainerSize());
    }

    private boolean isLocOffsetOutOfFillBoundsStart(float f6, KeylineRange keylineRange) {
        float addEnd = addEnd(f6, getMaskedItemSizeForLocOffset(f6, keylineRange) / 2.0f);
        return isLayoutRtl() ? addEnd > ((float) getContainerSize()) : addEnd < 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(View view, int i5, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        if (i11 - i5 == i15 - i13 && i12 - i10 == i16 - i14) {
            return;
        }
        view.post(new aa.c(8, this));
    }

    private void logChildrenIfDebugging() {
        if (this.isDebuggingEnabled && Log.isLoggable(TAG, 3)) {
            Log.d(TAG, "internal representation of views on the screen");
            for (int i5 = 0; i5 < getChildCount(); i5++) {
                View childAt = getChildAt(i5);
                Log.d(TAG, "item position " + getPosition(childAt) + ", center:" + getDecoratedCenterWithMargins(childAt) + ", child index:" + i5);
            }
            Log.d(TAG, "==============");
        }
    }

    private ChildCalculations makeChildCalculations(s1 s1Var, float f6, int i5) {
        View d10 = s1Var.d(i5);
        measureChildWithMargins(d10, 0, 0);
        float addEnd = addEnd(f6, this.currentKeylineState.getItemSize() / 2.0f);
        KeylineRange surroundingKeylineRange = getSurroundingKeylineRange(this.currentKeylineState.getKeylines(), addEnd, false);
        return new ChildCalculations(d10, addEnd, calculateChildOffsetCenterForLocation(addEnd, surroundingKeylineRange), surroundingKeylineRange);
    }

    private float offsetChild(View view, float f6, float f10, Rect rect) {
        float addEnd = addEnd(f6, f10);
        KeylineRange surroundingKeylineRange = getSurroundingKeylineRange(this.currentKeylineState.getKeylines(), addEnd, false);
        float calculateChildOffsetCenterForLocation = calculateChildOffsetCenterForLocation(addEnd, surroundingKeylineRange);
        super.getDecoratedBoundsWithMargins(view, rect);
        updateChildMaskForLocation(view, addEnd, surroundingKeylineRange);
        this.orientationHelper.offsetChild(view, rect, f10, calculateChildOffsetCenterForLocation);
        return calculateChildOffsetCenterForLocation;
    }

    private void recalculateKeylineStateList(s1 s1Var) {
        View d10 = s1Var.d(0);
        measureChildWithMargins(d10, 0, 0);
        KeylineState onFirstChildMeasuredWithMargins = this.carouselStrategy.onFirstChildMeasuredWithMargins(this, d10);
        if (isLayoutRtl()) {
            onFirstChildMeasuredWithMargins = KeylineState.reverse(onFirstChildMeasuredWithMargins, getContainerSize());
        }
        this.keylineStateList = KeylineStateList.from(this, onFirstChildMeasuredWithMargins, getItemMargins(), getLeftOrTopPaddingForKeylineShift(), getRightOrBottomPaddingForKeylineShift(), this.carouselStrategy.getStrategyType());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void refreshKeylineState() {
        this.keylineStateList = null;
        requestLayout();
    }

    private void removeAndRecycleOutOfBoundsViews(s1 s1Var) {
        while (getChildCount() > 0) {
            View childAt = getChildAt(0);
            float decoratedCenterWithMargins = getDecoratedCenterWithMargins(childAt);
            if (!isLocOffsetOutOfFillBoundsStart(decoratedCenterWithMargins, getSurroundingKeylineRange(this.currentKeylineState.getKeylines(), decoratedCenterWithMargins, true))) {
                break;
            } else {
                removeAndRecycleView(childAt, s1Var);
            }
        }
        while (getChildCount() - 1 >= 0) {
            View childAt2 = getChildAt(getChildCount() - 1);
            float decoratedCenterWithMargins2 = getDecoratedCenterWithMargins(childAt2);
            if (!isLocOffsetOutOfFillBoundsEnd(decoratedCenterWithMargins2, getSurroundingKeylineRange(this.currentKeylineState.getKeylines(), decoratedCenterWithMargins2, true))) {
                return;
            } else {
                removeAndRecycleView(childAt2, s1Var);
            }
        }
    }

    private void scrollBy(RecyclerView recyclerView, int i5) {
        if (isHorizontal()) {
            recyclerView.scrollBy(i5, 0);
        } else {
            recyclerView.scrollBy(0, i5);
        }
    }

    private void setCarouselAttributes(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.Carousel);
            setCarouselAlignment(obtainStyledAttributes.getInt(R.styleable.Carousel_carousel_alignment, 0));
            setOrientation(obtainStyledAttributes.getInt(0, 0));
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void updateChildMaskForLocation(View view, float f6, KeylineRange keylineRange) {
        if (view instanceof Maskable) {
            KeylineState.Keyline keyline = keylineRange.leftOrTop;
            float f10 = keyline.mask;
            KeylineState.Keyline keyline2 = keylineRange.rightOrBottom;
            float lerp = AnimationUtils.lerp(f10, keyline2.mask, keyline.loc, keyline2.loc, f6);
            float height = view.getHeight();
            float width = view.getWidth();
            RectF maskRect = this.orientationHelper.getMaskRect(height, width, AnimationUtils.lerp(0.0f, height / 2.0f, 0.0f, 1.0f, lerp), AnimationUtils.lerp(0.0f, width / 2.0f, 0.0f, 1.0f, lerp));
            float calculateChildOffsetCenterForLocation = calculateChildOffsetCenterForLocation(f6, keylineRange);
            RectF rectF = new RectF(calculateChildOffsetCenterForLocation - (maskRect.width() / 2.0f), calculateChildOffsetCenterForLocation - (maskRect.height() / 2.0f), (maskRect.width() / 2.0f) + calculateChildOffsetCenterForLocation, (maskRect.height() / 2.0f) + calculateChildOffsetCenterForLocation);
            RectF rectF2 = new RectF(getParentLeft(), getParentTop(), getParentRight(), getParentBottom());
            if (this.carouselStrategy.getStrategyType() == CarouselStrategy.StrategyType.CONTAINED) {
                this.orientationHelper.containMaskWithinBounds(maskRect, rectF, rectF2);
            }
            this.orientationHelper.moveMaskOnEdgeOutsideBounds(maskRect, rectF, rectF2);
            ((Maskable) view).setMaskRectF(maskRect);
        }
    }

    private void updateCurrentKeylineStateForScrollOffset(@NonNull KeylineStateList keylineStateList) {
        int i5 = this.maxScroll;
        int i10 = this.minScroll;
        if (i5 <= i10) {
            this.currentKeylineState = getKeylineStartingState(keylineStateList);
        } else {
            this.currentKeylineState = keylineStateList.getShiftedState(this.scrollOffset, i10, i5);
        }
        this.debugItemDecoration.setKeylines(this.currentKeylineState.getKeylines());
    }

    private void updateItemCount() {
        int itemCount = getItemCount();
        int i5 = this.lastItemCount;
        if (itemCount == i5 || this.keylineStateList == null) {
            return;
        }
        if (this.carouselStrategy.shouldRefreshKeylineState(this, i5)) {
            refreshKeylineState();
        }
        this.lastItemCount = itemCount;
    }

    private void validateChildOrderIfDebugging() {
        if (!this.isDebuggingEnabled || getChildCount() < 1) {
            return;
        }
        int i5 = 0;
        while (i5 < getChildCount() - 1) {
            int position = getPosition(getChildAt(i5));
            int i10 = i5 + 1;
            int position2 = getPosition(getChildAt(i10));
            if (position > position2) {
                logChildrenIfDebugging();
                throw new IllegalStateException("Detected invalid child order. Child at index [" + i5 + "] had adapter position [" + position + "] and child at index [" + i10 + "] had adapter position [" + position2 + "].");
            }
            i5 = i10;
        }
    }

    public int calculateScrollDeltaToMakePositionVisible(int i5) {
        return (int) (this.scrollOffset - getScrollOffsetForPosition(i5, getKeylineStateForPosition(i5)));
    }

    @Override // androidx.recyclerview.widget.k1
    public boolean canScrollHorizontally() {
        return isHorizontal();
    }

    @Override // androidx.recyclerview.widget.k1
    public boolean canScrollVertically() {
        return !isHorizontal();
    }

    @Override // androidx.recyclerview.widget.k1
    public int computeHorizontalScrollExtent(@NonNull z1 z1Var) {
        if (getChildCount() == 0 || this.keylineStateList == null || getItemCount() <= 1) {
            return 0;
        }
        return (int) (getWidth() * (this.keylineStateList.getDefaultState().getItemSize() / computeHorizontalScrollRange(z1Var)));
    }

    @Override // androidx.recyclerview.widget.k1
    public int computeHorizontalScrollOffset(@NonNull z1 z1Var) {
        return this.scrollOffset;
    }

    @Override // androidx.recyclerview.widget.k1
    public int computeHorizontalScrollRange(@NonNull z1 z1Var) {
        return this.maxScroll - this.minScroll;
    }

    @Override // androidx.recyclerview.widget.x1
    public PointF computeScrollVectorForPosition(int i5) {
        if (this.keylineStateList == null) {
            return null;
        }
        int offsetToScrollToPosition = getOffsetToScrollToPosition(i5, getKeylineStateForPosition(i5));
        return isHorizontal() ? new PointF(offsetToScrollToPosition, 0.0f) : new PointF(0.0f, offsetToScrollToPosition);
    }

    @Override // androidx.recyclerview.widget.k1
    public int computeVerticalScrollExtent(@NonNull z1 z1Var) {
        if (getChildCount() == 0 || this.keylineStateList == null || getItemCount() <= 1) {
            return 0;
        }
        return (int) (getHeight() * (this.keylineStateList.getDefaultState().getItemSize() / computeVerticalScrollRange(z1Var)));
    }

    @Override // androidx.recyclerview.widget.k1
    public int computeVerticalScrollOffset(@NonNull z1 z1Var) {
        return this.scrollOffset;
    }

    @Override // androidx.recyclerview.widget.k1
    public int computeVerticalScrollRange(@NonNull z1 z1Var) {
        return this.maxScroll - this.minScroll;
    }

    @Override // androidx.recyclerview.widget.k1
    public l1 generateDefaultLayoutParams() {
        return new l1(-2, -2);
    }

    @Override // com.google.android.material.carousel.Carousel
    public int getCarouselAlignment() {
        return this.carouselAlignment;
    }

    @Override // com.google.android.material.carousel.Carousel
    public int getContainerHeight() {
        return getHeight();
    }

    @Override // com.google.android.material.carousel.Carousel
    public int getContainerWidth() {
        return getWidth();
    }

    @Override // androidx.recyclerview.widget.k1
    public void getDecoratedBoundsWithMargins(@NonNull View view, @NonNull Rect rect) {
        super.getDecoratedBoundsWithMargins(view, rect);
        float centerY = rect.centerY();
        if (isHorizontal()) {
            centerY = rect.centerX();
        }
        float maskedItemSizeForLocOffset = getMaskedItemSizeForLocOffset(centerY, getSurroundingKeylineRange(this.currentKeylineState.getKeylines(), centerY, true));
        float width = isHorizontal() ? (rect.width() - maskedItemSizeForLocOffset) / 2.0f : 0.0f;
        float height = isHorizontal() ? 0.0f : (rect.height() - maskedItemSizeForLocOffset) / 2.0f;
        rect.set((int) (rect.left + width), (int) (rect.top + height), (int) (rect.right - width), (int) (rect.bottom - height));
    }

    public int getOffsetToScrollToPosition(int i5, @NonNull KeylineState keylineState) {
        return getScrollOffsetForPosition(i5, keylineState) - this.scrollOffset;
    }

    public int getOffsetToScrollToPositionForSnap(int i5, boolean z5) {
        int offsetToScrollToPosition = getOffsetToScrollToPosition(i5, this.keylineStateList.getShiftedState(this.scrollOffset, this.minScroll, this.maxScroll, true));
        int offsetToScrollToPosition2 = this.keylineStatePositionMap != null ? getOffsetToScrollToPosition(i5, getKeylineStateForPosition(i5)) : offsetToScrollToPosition;
        return (!z5 || Math.abs(offsetToScrollToPosition2) >= Math.abs(offsetToScrollToPosition)) ? offsetToScrollToPosition : offsetToScrollToPosition2;
    }

    public int getOrientation() {
        return this.orientationHelper.orientation;
    }

    @Override // androidx.recyclerview.widget.k1
    public boolean isAutoMeasureEnabled() {
        return true;
    }

    @Override // com.google.android.material.carousel.Carousel
    public boolean isHorizontal() {
        return this.orientationHelper.orientation == 0;
    }

    public boolean isLayoutRtl() {
        return isHorizontal() && getLayoutDirection() == 1;
    }

    @Override // androidx.recyclerview.widget.k1
    public void measureChildWithMargins(@NonNull View view, int i5, int i10) {
        if (!(view instanceof Maskable)) {
            throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
        }
        l1 l1Var = (l1) view.getLayoutParams();
        Rect rect = new Rect();
        calculateItemDecorationsForChild(view, rect);
        int i11 = rect.left + rect.right + i5;
        int i12 = rect.top + rect.bottom + i10;
        KeylineStateList keylineStateList = this.keylineStateList;
        float itemSize = (keylineStateList == null || this.orientationHelper.orientation != 0) ? ((ViewGroup.MarginLayoutParams) l1Var).width : keylineStateList.getDefaultState().getItemSize();
        KeylineStateList keylineStateList2 = this.keylineStateList;
        view.measure(k1.getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingRight() + getPaddingLeft() + ((ViewGroup.MarginLayoutParams) l1Var).leftMargin + ((ViewGroup.MarginLayoutParams) l1Var).rightMargin + i11, (int) itemSize, canScrollHorizontally()), k1.getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingBottom() + getPaddingTop() + ((ViewGroup.MarginLayoutParams) l1Var).topMargin + ((ViewGroup.MarginLayoutParams) l1Var).bottomMargin + i12, (int) ((keylineStateList2 == null || this.orientationHelper.orientation != 1) ? ((ViewGroup.MarginLayoutParams) l1Var).height : keylineStateList2.getDefaultState().getItemSize()), canScrollVertically()));
    }

    public void notifyItemSizeChanged() {
        refreshKeylineState();
    }

    @Override // androidx.recyclerview.widget.k1
    public void onAttachedToWindow(RecyclerView recyclerView) {
        super.onAttachedToWindow(recyclerView);
        this.carouselStrategy.initialize(recyclerView.getContext());
        refreshKeylineState();
        recyclerView.addOnLayoutChangeListener(this.recyclerViewSizeChangeListener);
    }

    @Override // androidx.recyclerview.widget.k1
    public void onDetachedFromWindow(RecyclerView recyclerView, s1 s1Var) {
        onDetachedFromWindow(recyclerView);
        recyclerView.removeOnLayoutChangeListener(this.recyclerViewSizeChangeListener);
    }

    @Override // androidx.recyclerview.widget.k1
    public View onFocusSearchFailed(@NonNull View view, int i5, @NonNull s1 s1Var, @NonNull z1 z1Var) {
        int convertFocusDirectionToLayoutDirection;
        if (getChildCount() == 0 || (convertFocusDirectionToLayoutDirection = convertFocusDirectionToLayoutDirection(i5)) == Integer.MIN_VALUE) {
            return null;
        }
        if (convertFocusDirectionToLayoutDirection == -1) {
            if (getPosition(view) == 0) {
                return null;
            }
            addViewAtPosition(s1Var, getPosition(getChildAt(0)) - 1, 0);
            return getChildClosestToStart();
        }
        if (getPosition(view) == getItemCount() - 1) {
            return null;
        }
        addViewAtPosition(s1Var, getPosition(getChildAt(getChildCount() - 1)) + 1, -1);
        return getChildClosestToEnd();
    }

    @Override // androidx.recyclerview.widget.k1
    public void onInitializeAccessibilityEvent(@NonNull AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            accessibilityEvent.setFromIndex(getPosition(getChildAt(0)));
            accessibilityEvent.setToIndex(getPosition(getChildAt(getChildCount() - 1)));
        }
    }

    @Override // androidx.recyclerview.widget.k1
    public void onItemsAdded(@NonNull RecyclerView recyclerView, int i5, int i10) {
        super.onItemsAdded(recyclerView, i5, i10);
        updateItemCount();
    }

    @Override // androidx.recyclerview.widget.k1
    public void onItemsChanged(@NonNull RecyclerView recyclerView) {
        super.onItemsChanged(recyclerView);
        updateItemCount();
    }

    @Override // androidx.recyclerview.widget.k1
    public void onItemsRemoved(@NonNull RecyclerView recyclerView, int i5, int i10) {
        super.onItemsRemoved(recyclerView, i5, i10);
        updateItemCount();
    }

    @Override // androidx.recyclerview.widget.k1
    public void onLayoutChildren(s1 s1Var, z1 z1Var) {
        if (z1Var.b() <= 0 || getContainerSize() <= 0.0f) {
            removeAndRecycleAllViews(s1Var);
            this.currentFillStartPosition = 0;
            return;
        }
        boolean isLayoutRtl = isLayoutRtl();
        KeylineStateList keylineStateList = this.keylineStateList;
        boolean z5 = keylineStateList == null;
        if (z5 || keylineStateList.getDefaultState().getCarouselSize() != getContainerSize()) {
            recalculateKeylineStateList(s1Var);
        }
        int calculateStartScroll = calculateStartScroll(this.keylineStateList);
        int calculateEndScroll = calculateEndScroll(z1Var, this.keylineStateList);
        this.minScroll = isLayoutRtl ? calculateEndScroll : calculateStartScroll;
        if (isLayoutRtl) {
            calculateEndScroll = calculateStartScroll;
        }
        this.maxScroll = calculateEndScroll;
        if (z5) {
            this.scrollOffset = calculateStartScroll;
            this.keylineStatePositionMap = this.keylineStateList.getKeylineStateForPositionMap(getItemCount(), this.minScroll, this.maxScroll, isLayoutRtl());
            int i5 = this.currentEstimatedPosition;
            if (i5 != -1) {
                this.scrollOffset = getScrollOffsetForPosition(i5, getKeylineStateForPosition(i5));
            }
        }
        int i10 = this.scrollOffset;
        this.scrollOffset = i10 + calculateShouldScrollBy(0, i10, this.minScroll, this.maxScroll);
        this.currentFillStartPosition = b.f(this.currentFillStartPosition, 0, z1Var.b());
        updateCurrentKeylineStateForScrollOffset(this.keylineStateList);
        detachAndScrapAttachedViews(s1Var);
        fill(s1Var, z1Var);
        this.lastItemCount = getItemCount();
    }

    @Override // androidx.recyclerview.widget.k1
    public void onLayoutCompleted(z1 z1Var) {
        if (getChildCount() == 0) {
            this.currentFillStartPosition = 0;
        } else {
            this.currentFillStartPosition = getPosition(getChildAt(0));
        }
        validateChildOrderIfDebugging();
    }

    @Override // androidx.recyclerview.widget.k1
    public boolean requestChildRectangleOnScreen(@NonNull RecyclerView recyclerView, @NonNull View view, @NonNull Rect rect, boolean z5, boolean z7) {
        int smallestScrollOffsetToFocalKeyline;
        if (this.keylineStateList == null || (smallestScrollOffsetToFocalKeyline = getSmallestScrollOffsetToFocalKeyline(getPosition(view), getKeylineStateForPosition(getPosition(view)))) == 0) {
            return false;
        }
        scrollBy(recyclerView, getSmallestScrollOffsetToFocalKeyline(getPosition(view), this.keylineStateList.getShiftedState(this.scrollOffset + calculateShouldScrollBy(smallestScrollOffsetToFocalKeyline, this.scrollOffset, this.minScroll, this.maxScroll), this.minScroll, this.maxScroll)));
        return true;
    }

    @Override // androidx.recyclerview.widget.k1
    public int scrollHorizontallyBy(int i5, s1 s1Var, z1 z1Var) {
        if (canScrollHorizontally()) {
            return scrollBy(i5, s1Var, z1Var);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.k1
    public void scrollToPosition(int i5) {
        this.currentEstimatedPosition = i5;
        if (this.keylineStateList == null) {
            return;
        }
        this.scrollOffset = getScrollOffsetForPosition(i5, getKeylineStateForPosition(i5));
        this.currentFillStartPosition = b.f(i5, 0, Math.max(0, getItemCount() - 1));
        updateCurrentKeylineStateForScrollOffset(this.keylineStateList);
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.k1
    public int scrollVerticallyBy(int i5, s1 s1Var, z1 z1Var) {
        if (canScrollVertically()) {
            return scrollBy(i5, s1Var, z1Var);
        }
        return 0;
    }

    public void setCarouselAlignment(int i5) {
        this.carouselAlignment = i5;
        refreshKeylineState();
    }

    public void setCarouselStrategy(@NonNull CarouselStrategy carouselStrategy) {
        this.carouselStrategy = carouselStrategy;
        refreshKeylineState();
    }

    public void setDebuggingEnabled(@NonNull RecyclerView recyclerView, boolean z5) {
        this.isDebuggingEnabled = z5;
        recyclerView.removeItemDecoration(this.debugItemDecoration);
        if (z5) {
            recyclerView.addItemDecoration(this.debugItemDecoration);
        }
        recyclerView.invalidateItemDecorations();
    }

    public void setOrientation(int i5) {
        if (i5 != 0 && i5 != 1) {
            throw new IllegalArgumentException(c1.i(i5, "invalid orientation:"));
        }
        assertNotInLayoutOrScroll(null);
        CarouselOrientationHelper carouselOrientationHelper = this.orientationHelper;
        if (carouselOrientationHelper == null || i5 != carouselOrientationHelper.orientation) {
            this.orientationHelper = CarouselOrientationHelper.createOrientationHelper(this, i5);
            refreshKeylineState();
        }
    }

    @Override // androidx.recyclerview.widget.k1
    public void smoothScrollToPosition(RecyclerView recyclerView, z1 z1Var, int i5) {
        m0 m0Var = new m0(recyclerView.getContext()) { // from class: com.google.android.material.carousel.CarouselLayoutManager.1
            @Override // androidx.recyclerview.widget.m0
            public int calculateDxToMakeVisible(View view, int i10) {
                if (CarouselLayoutManager.this.keylineStateList == null || !CarouselLayoutManager.this.isHorizontal()) {
                    return 0;
                }
                CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
                return carouselLayoutManager.calculateScrollDeltaToMakePositionVisible(carouselLayoutManager.getPosition(view));
            }

            @Override // androidx.recyclerview.widget.m0
            public int calculateDyToMakeVisible(View view, int i10) {
                if (CarouselLayoutManager.this.keylineStateList == null || CarouselLayoutManager.this.isHorizontal()) {
                    return 0;
                }
                CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
                return carouselLayoutManager.calculateScrollDeltaToMakePositionVisible(carouselLayoutManager.getPosition(view));
            }

            @Override // androidx.recyclerview.widget.y1
            public PointF computeScrollVectorForPosition(int i10) {
                return CarouselLayoutManager.this.computeScrollVectorForPosition(i10);
            }
        };
        m0Var.setTargetPosition(i5);
        startSmoothScroll(m0Var);
    }

    public CarouselLayoutManager(@NonNull CarouselStrategy carouselStrategy) {
        this(carouselStrategy, 0);
    }

    public CarouselLayoutManager(@NonNull CarouselStrategy carouselStrategy, int i5) {
        this.isDebuggingEnabled = false;
        this.debugItemDecoration = new DebugItemDecoration();
        this.currentFillStartPosition = 0;
        this.recyclerViewSizeChangeListener = new a(0, this);
        this.currentEstimatedPosition = -1;
        this.carouselAlignment = 0;
        setCarouselStrategy(carouselStrategy);
        setOrientation(i5);
    }

    private int scrollBy(int i5, s1 s1Var, z1 z1Var) {
        float f6;
        if (getChildCount() == 0 || i5 == 0) {
            return 0;
        }
        if (this.keylineStateList == null) {
            recalculateKeylineStateList(s1Var);
        }
        if (getItemCount() <= getKeylineStartingState(this.keylineStateList).getTotalVisibleFocalItems()) {
            return 0;
        }
        int calculateShouldScrollBy = calculateShouldScrollBy(i5, this.scrollOffset, this.minScroll, this.maxScroll);
        this.scrollOffset += calculateShouldScrollBy;
        updateCurrentKeylineStateForScrollOffset(this.keylineStateList);
        float itemSize = this.currentKeylineState.getItemSize() / 2.0f;
        float calculateChildStartForFill = calculateChildStartForFill(getPosition(getChildAt(0)));
        Rect rect = new Rect();
        if (isLayoutRtl()) {
            f6 = this.currentKeylineState.getLastFocalKeyline().locOffset;
        } else {
            f6 = this.currentKeylineState.getFirstFocalKeyline().locOffset;
        }
        float f10 = Float.MAX_VALUE;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            float abs = Math.abs(f6 - offsetChild(childAt, calculateChildStartForFill, itemSize, rect));
            if (childAt != null && abs < f10) {
                this.currentEstimatedPosition = getPosition(childAt);
                f10 = abs;
            }
            calculateChildStartForFill = addEnd(calculateChildStartForFill, this.currentKeylineState.getItemSize());
        }
        fill(s1Var, z1Var);
        return calculateShouldScrollBy;
    }

    @SuppressLint({"UnknownNullness"})
    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i5, int i10) {
        this.isDebuggingEnabled = false;
        this.debugItemDecoration = new DebugItemDecoration();
        this.currentFillStartPosition = 0;
        this.recyclerViewSizeChangeListener = new a(0, this);
        this.currentEstimatedPosition = -1;
        this.carouselAlignment = 0;
        setCarouselStrategy(new MultiBrowseCarouselStrategy());
        setCarouselAttributes(context, attributeSet);
    }
}
