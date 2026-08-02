package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.views.galleryswipeview.indicator;

import Gl.C3124a;
import android.animation.ArgbEvaluator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.View;
import androidx.annotation.NonNull;

/* loaded from: classes7.dex */
public class NonXmlScrollingPagerIndicator extends View {
    private Runnable attachRunnable;
    private boolean autoRtl;
    private final ArgbEvaluator colorEvaluator;
    private PagerAttacher<?> currentAttacher;
    private int dotColor;
    private boolean dotCountInitialized;
    private final int dotMinimumSize;
    private final int dotNormalSize;
    private SparseArray<Float> dotScale;
    private final int dotSelectedSize;
    private final Drawable firstDotDrawable;
    private float firstDotOffset;
    private int infiniteDotCount;
    private int itemCount;
    private final Drawable lastDotDrawable;
    private boolean looped;
    private int orientation;
    private final Paint paint;
    private int selectedDotColor;
    private final int spaceBetweenDotCenters;
    private int visibleDotCount;
    private int visibleDotThreshold;
    private float visibleFramePosition;
    private float visibleFrameWidth;

    public interface PagerAttacher<T> {
        void attachToPager(@NonNull NonXmlScrollingPagerIndicator nonXmlScrollingPagerIndicator, @NonNull T t2);

        void detachFromPager();
    }

    public NonXmlScrollingPagerIndicator(Context context, int i11, int i12, float f7, float f11, float f12, int i13) {
        this(context, i11, i12, f7, f11, f12, i13, 2, false, 0, null, null);
    }

    private void adjustFramePosition(float f7, int i11) {
        int i12 = this.itemCount;
        int i13 = this.visibleDotCount;
        if (i12 <= i13) {
            this.visibleFramePosition = 0.0f;
            return;
        }
        if (this.looped || i12 <= i13) {
            this.visibleFramePosition = ((this.spaceBetweenDotCenters * f7) + getDotOffsetAt(this.infiniteDotCount / 2)) - (this.visibleFrameWidth / 2.0f);
            return;
        }
        this.visibleFramePosition = ((this.spaceBetweenDotCenters * f7) + getDotOffsetAt(i11)) - (this.visibleFrameWidth / 2.0f);
        int i14 = this.visibleDotCount / 2;
        float dotOffsetAt = getDotOffsetAt((getDotCount() - 1) - i14);
        if ((this.visibleFrameWidth / 2.0f) + this.visibleFramePosition < getDotOffsetAt(i14)) {
            this.visibleFramePosition = getDotOffsetAt(i14) - (this.visibleFrameWidth / 2.0f);
            return;
        }
        float f11 = this.visibleFramePosition;
        float f12 = this.visibleFrameWidth;
        if ((f12 / 2.0f) + f11 > dotOffsetAt) {
            this.visibleFramePosition = dotOffsetAt - (f12 / 2.0f);
        }
    }

    private int calculateDotColor(float f7) {
        return ((Integer) this.colorEvaluator.evaluate(f7, Integer.valueOf(this.dotColor), Integer.valueOf(this.selectedDotColor))).intValue();
    }

    private int getDotCount() {
        return (!this.looped || this.itemCount <= this.visibleDotCount) ? this.itemCount : this.infiniteDotCount;
    }

    private float getDotOffsetAt(int i11) {
        return this.firstDotOffset + (i11 * this.spaceBetweenDotCenters);
    }

    private float getDotScaleAt(int i11) {
        Float f7 = this.dotScale.get(i11);
        if (f7 != null) {
            return f7.floatValue();
        }
        return 0.0f;
    }

    private void initDots(int i11) {
        if (this.itemCount == i11 && this.dotCountInitialized) {
            return;
        }
        this.itemCount = i11;
        this.dotCountInitialized = true;
        this.dotScale = new SparseArray<>();
        if (i11 < this.visibleDotThreshold) {
            requestLayout();
            invalidate();
        } else {
            this.firstDotOffset = (!this.looped || this.itemCount <= this.visibleDotCount) ? this.dotSelectedSize / 2 : 0.0f;
            this.visibleFrameWidth = ((this.visibleDotCount - 1) * this.spaceBetweenDotCenters) + this.dotSelectedSize;
            requestLayout();
            invalidate();
        }
    }

    private boolean isRtl() {
        return getLayoutDirection() == 1;
    }

    private void scaleDotByOffset(int i11, float f7) {
        if (this.dotScale == null || getDotCount() == 0) {
            return;
        }
        setDotScaleAt(i11, 1.0f - Math.abs(f7));
    }

    private void setDotScaleAt(int i11, float f7) {
        if (f7 == 0.0f) {
            this.dotScale.remove(i11);
        } else {
            this.dotScale.put(i11, Float.valueOf(f7));
        }
    }

    private void updateScaleInIdleState(int i11) {
        if (!this.looped || this.itemCount < this.visibleDotCount) {
            this.dotScale.clear();
            this.dotScale.put(i11, Float.valueOf(1.0f));
            invalidate();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> void attachToPager(@NonNull final T t2, @NonNull final PagerAttacher<T> pagerAttacher) {
        detachFromPager();
        pagerAttacher.attachToPager(this, t2);
        this.currentAttacher = pagerAttacher;
        this.attachRunnable = new Runnable() { // from class: ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.views.galleryswipeview.indicator.NonXmlScrollingPagerIndicator.1
            @Override // java.lang.Runnable
            public void run() {
                NonXmlScrollingPagerIndicator.this.itemCount = -1;
                NonXmlScrollingPagerIndicator.this.attachToPager(t2, pagerAttacher);
            }
        };
    }

    public void detachFromPager() {
        PagerAttacher<?> pagerAttacher = this.currentAttacher;
        if (pagerAttacher != null) {
            pagerAttacher.detachFromPager();
            this.currentAttacher = null;
            this.attachRunnable = null;
            this.autoRtl = true;
        }
        this.dotCountInitialized = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0106  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onDraw(Canvas canvas) {
        char c11;
        float dotScaleAt;
        float f7;
        Drawable drawable;
        int dotCount = getDotCount();
        if (dotCount < this.visibleDotThreshold) {
            return;
        }
        int i11 = this.spaceBetweenDotCenters;
        char c12 = 2;
        float a11 = C3124a.a(r4, this.dotNormalSize, 2, i11) * 0.7f;
        float f11 = this.dotSelectedSize / 2;
        float f12 = i11 * 0.85714287f;
        float f13 = this.visibleFramePosition;
        int i12 = ((int) (f13 - this.firstDotOffset)) / i11;
        int dotOffsetAt = (((int) ((f13 + this.visibleFrameWidth) - getDotOffsetAt(i12))) / this.spaceBetweenDotCenters) + i12;
        if (i12 == 0 && dotOffsetAt + 1 > dotCount) {
            dotOffsetAt = dotCount - 1;
        }
        int i13 = i12;
        while (i13 <= dotOffsetAt) {
            float dotOffsetAt2 = getDotOffsetAt(i13);
            float f14 = this.visibleFramePosition;
            if (dotOffsetAt2 >= f14) {
                float f15 = this.visibleFrameWidth;
                if (dotOffsetAt2 < f14 + f15) {
                    if (!this.looped || this.itemCount <= this.visibleDotCount) {
                        dotScaleAt = getDotScaleAt(i13);
                    } else {
                        float f16 = (f15 / 2.0f) + f14;
                        dotScaleAt = (dotOffsetAt2 < f16 - f12 || dotOffsetAt2 > f16) ? (dotOffsetAt2 <= f16 || dotOffsetAt2 >= f16 + f12) ? 0.0f : 1.0f - ((dotOffsetAt2 - f16) / f12) : ((dotOffsetAt2 - f16) + f12) / f12;
                    }
                    float f17 = ((this.dotSelectedSize - r12) * dotScaleAt) + this.dotNormalSize;
                    if (this.itemCount > this.visibleDotCount) {
                        float f18 = (this.looped || !(i13 == 0 || i13 == dotCount + (-1))) ? a11 : f11;
                        int width = getWidth();
                        c11 = c12;
                        if (this.orientation == 1) {
                            width = getHeight();
                        }
                        int i14 = width;
                        float f19 = this.visibleFramePosition;
                        if (dotOffsetAt2 - f19 < f18) {
                            float f21 = ((dotOffsetAt2 - f19) * f17) / f18;
                            int i15 = this.dotMinimumSize;
                            if (f21 <= i15) {
                                f17 = i15;
                            } else if (f21 < f17) {
                                f17 = f21;
                            }
                        } else {
                            float f22 = i14;
                            if (dotOffsetAt2 - f19 > f22 - f18) {
                                f7 = 2.0f;
                                float f23 = ((((-dotOffsetAt2) + f19) + f22) * f17) / f18;
                                int i16 = this.dotMinimumSize;
                                if (f23 <= i16) {
                                    f17 = i16;
                                } else if (f23 < f17) {
                                    f17 = f23;
                                }
                                this.paint.setColor(calculateDotColor(dotScaleAt));
                                drawable = i13 != i12 ? this.firstDotDrawable : i13 == dotOffsetAt ? this.lastDotDrawable : null;
                                if (drawable == null) {
                                    if (this.orientation == 0) {
                                        drawable.setBounds((int) ((dotOffsetAt2 - this.visibleFramePosition) - (this.dotSelectedSize / 2)), (getMeasuredHeight() / 2) - (this.dotSelectedSize / 2), (int) ((dotOffsetAt2 - this.visibleFramePosition) + (r13 / 2)), (this.dotSelectedSize / 2) + (getMeasuredHeight() / 2));
                                    } else {
                                        drawable.setBounds((getMeasuredWidth() / 2) - (this.dotSelectedSize / 2), (int) ((dotOffsetAt2 - this.visibleFramePosition) - (r12 / 2)), (this.dotSelectedSize / 2) + (getMeasuredWidth() / 2), (int) ((dotOffsetAt2 - this.visibleFramePosition) + (r14 / 2)));
                                    }
                                    drawable.setTint(this.paint.getColor());
                                    drawable.draw(canvas);
                                } else if (this.orientation == 0) {
                                    float f24 = dotOffsetAt2 - this.visibleFramePosition;
                                    if (this.autoRtl && isRtl()) {
                                        f24 = getWidth() - f24;
                                    }
                                    canvas.drawCircle(f24, getMeasuredHeight() / 2, f17 / f7, this.paint);
                                } else {
                                    canvas.drawCircle(getMeasuredWidth() / 2, dotOffsetAt2 - this.visibleFramePosition, f17 / f7, this.paint);
                                }
                                i13++;
                                c12 = c11;
                            }
                        }
                    } else {
                        c11 = c12;
                    }
                    f7 = 2.0f;
                    this.paint.setColor(calculateDotColor(dotScaleAt));
                    if (i13 != i12) {
                    }
                    if (drawable == null) {
                    }
                    i13++;
                    c12 = c11;
                }
            }
            c11 = c12;
            i13++;
            c12 = c11;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0037  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onMeasure(int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int mode;
        int size;
        int i16;
        int i17;
        int mode2;
        if (this.orientation == 0) {
            if (isInEditMode()) {
                i16 = (this.visibleDotCount - 1) * this.spaceBetweenDotCenters;
                i17 = this.dotSelectedSize;
            } else {
                int i18 = this.itemCount;
                if (i18 >= this.visibleDotCount) {
                    size = (int) this.visibleFrameWidth;
                    mode2 = View.MeasureSpec.getMode(i12);
                    i15 = View.MeasureSpec.getSize(i12);
                    int i19 = this.dotSelectedSize;
                    if (mode2 != Integer.MIN_VALUE) {
                        i15 = Math.min(i19, i15);
                    } else if (mode2 != 1073741824) {
                        i15 = i19;
                    }
                } else {
                    i16 = (i18 - 1) * this.spaceBetweenDotCenters;
                    i17 = this.dotSelectedSize;
                }
            }
            size = i16 + i17;
            mode2 = View.MeasureSpec.getMode(i12);
            i15 = View.MeasureSpec.getSize(i12);
            int i192 = this.dotSelectedSize;
            if (mode2 != Integer.MIN_VALUE) {
            }
        } else {
            if (isInEditMode()) {
                i13 = (this.visibleDotCount - 1) * this.spaceBetweenDotCenters;
                i14 = this.dotSelectedSize;
            } else {
                int i21 = this.itemCount;
                if (i21 >= this.visibleDotCount) {
                    i15 = (int) this.visibleFrameWidth;
                    mode = View.MeasureSpec.getMode(i11);
                    size = View.MeasureSpec.getSize(i11);
                    int i22 = this.dotSelectedSize;
                    if (mode != Integer.MIN_VALUE) {
                        size = Math.min(i22, size);
                    } else if (mode != 1073741824) {
                        size = i22;
                    }
                } else {
                    i13 = (i21 - 1) * this.spaceBetweenDotCenters;
                    i14 = this.dotSelectedSize;
                }
            }
            i15 = i13 + i14;
            mode = View.MeasureSpec.getMode(i11);
            size = View.MeasureSpec.getSize(i11);
            int i222 = this.dotSelectedSize;
            if (mode != Integer.MIN_VALUE) {
            }
        }
        setMeasuredDimension(size, i15);
    }

    public void onPageScrolled(int i11, float f7) {
        int i12;
        if (f7 < 0.0f || f7 > 1.0f) {
            throw new IllegalArgumentException("Offset must be [0, 1]");
        }
        if (i11 < 0 || (i11 != 0 && i11 >= this.itemCount)) {
            throw new IndexOutOfBoundsException("page must be [0, adapter.getItemCount())");
        }
        if (!this.looped || ((i12 = this.itemCount) <= this.visibleDotCount && i12 > 1)) {
            this.dotScale.clear();
            if (this.orientation == 0) {
                scaleDotByOffset(i11, f7);
                int i13 = this.itemCount;
                if (i11 < i13 - 1) {
                    scaleDotByOffset(i11 + 1, 1.0f - f7);
                } else if (i13 > 1) {
                    scaleDotByOffset(0, 1.0f - f7);
                }
            } else {
                scaleDotByOffset(i11 - 1, f7);
                scaleDotByOffset(i11, 1.0f - f7);
            }
            invalidate();
        }
        if (this.orientation == 0) {
            adjustFramePosition(f7, i11);
        } else {
            adjustFramePosition(f7, i11 - 1);
        }
        invalidate();
    }

    public void reattach() {
        Runnable runnable = this.attachRunnable;
        if (runnable != null) {
            runnable.run();
            invalidate();
        }
    }

    public void setCurrentPosition(int i11) {
        if (i11 != 0 && (i11 < 0 || i11 >= this.itemCount)) {
            throw new IndexOutOfBoundsException("Position must be [0, adapter.getItemCount()]");
        }
        if (this.itemCount == 0) {
            return;
        }
        adjustFramePosition(0.0f, i11);
        updateScaleInIdleState(i11);
    }

    public void setDotCount(int i11) {
        initDots(i11);
    }

    public void setVisibleDotCount(int i11) {
        if (i11 % 2 == 0) {
            throw new IllegalArgumentException("visibleDotCount must be odd");
        }
        this.visibleDotCount = i11;
        this.infiniteDotCount = i11 + 2;
        if (this.attachRunnable != null) {
            reattach();
        } else {
            requestLayout();
        }
    }

    public NonXmlScrollingPagerIndicator(Context context, int i11, int i12, float f7, float f11, float f12, int i13, int i14, boolean z11, int i15, Drawable drawable, Drawable drawable2) {
        super(context);
        this.colorEvaluator = new ArgbEvaluator();
        this.autoRtl = true;
        this.dotColor = i11;
        this.selectedDotColor = i12;
        int i16 = (int) f7;
        this.dotNormalSize = i16;
        this.dotSelectedSize = (int) f11;
        this.dotMinimumSize = -1;
        this.spaceBetweenDotCenters = ((int) f12) + i16;
        this.looped = z11;
        setVisibleDotCount(i13);
        this.visibleDotThreshold = i14;
        this.orientation = i15;
        this.firstDotDrawable = drawable;
        this.lastDotDrawable = drawable2;
        Paint paint = new Paint();
        this.paint = paint;
        paint.setAntiAlias(true);
        if (isInEditMode()) {
            setDotCount(i13);
            onPageScrolled(i13 / 2, 0.0f);
        }
    }
}
