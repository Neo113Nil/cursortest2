package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.l;
import androidx.viewpager2.widget.ViewPager2;
import com.sofascore.results.R;
import com.sofascore.results.view.CirclePageIndicator;
import com.sofascore.results.view.PageIndicator$SavedState;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class c5e extends View {
    public ViewPager2 a;
    public final Paint b;
    public int c;
    public int d;
    public float e;
    public final float f;
    public int g;
    public Function2 h;
    public final j41 i;

    public c5e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.cirlcePageIndicatorStyle);
        Paint paint = new Paint(1);
        paint.setColor(context.getColor(R.color.primary_default));
        paint.setStyle(Paint.Style.FILL);
        this.b = paint;
        this.f = ao2.u(4, context);
        this.i = new j41(this, 11);
    }

    public final int getDirection() {
        return this.g;
    }

    @Nullable
    public final Function2<Integer, Integer, Unit> getOnPageSelectedCallback() {
        return this.h;
    }

    public final float getPageOffset() {
        return this.e;
    }

    @NotNull
    public final Paint getPaintFill() {
        return this.b;
    }

    public abstract int getViewHeight();

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        int i;
        canvas.getClass();
        super.onDraw(canvas);
        if (this.a == null) {
            return;
        }
        Context context = getContext();
        context.getClass();
        if (hkg.c0(context)) {
            canvas.scale(-1.0f, 1.0f, getWidth() / 2.0f, getHeight() / 2.0f);
        }
        ViewPager2 viewPager2 = this.a;
        if (viewPager2 == null) {
            Intrinsics.i("viewPager");
            throw null;
        }
        l adapter = viewPager2.getAdapter();
        int i2 = 0;
        int itemCount = adapter != null ? adapter.getItemCount() : 0;
        if (itemCount <= 1) {
            return;
        }
        int i3 = this.d;
        if (i3 >= itemCount) {
            setCurrentItem(itemCount - 1);
            return;
        }
        if (this.c == 0) {
            f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        } else {
            int i4 = this.g;
            float f2 = this.e;
            f = i4 == 1 ? f2 : 1.0f - f2;
        }
        CirclePageIndicator circlePageIndicator = (CirclePageIndicator) this;
        float f3 = circlePageIndicator.m;
        float f4 = circlePageIndicator.l;
        float f5 = (3.0f * f3) + f4;
        float paddingTop = circlePageIndicator.getPaddingTop() + f4;
        float width = ((circlePageIndicator.getWidth() / 2.0f) + f3) - ((itemCount * f5) / 2.0f);
        while (i2 < itemCount) {
            float f6 = (i2 * f5) + width;
            int i5 = circlePageIndicator.j;
            if (i2 == i3) {
                i = itemCount;
                circlePageIndicator.getPaintFill().setAlpha((int) me4.b(1.0f, f, 255 - i5, i5));
                canvas.drawCircle(f6, paddingTop, f4 - ((f4 - f3) * f), circlePageIndicator.getPaintFill());
            } else {
                i = itemCount;
            }
            int direction = circlePageIndicator.getDirection();
            Paint paint = circlePageIndicator.k;
            if (direction == 1 && i2 == i3 + 1) {
                paint.setAlpha((int) ((circlePageIndicator.getPageOffset() * (255 - i5)) + i5));
                canvas.drawCircle(f6, paddingTop, (circlePageIndicator.getPageOffset() * (f4 - f3)) + f3, paint);
            } else if (circlePageIndicator.getDirection() == 0 && i2 == i3 - 1) {
                paint.setAlpha((int) (((255 - i5) * f) + i5));
                canvas.drawCircle(f6, paddingTop, ((f4 - f3) * f) + f3, paint);
            } else {
                paint.setAlpha(i5);
                canvas.drawCircle(f6, paddingTop, f3, paint);
            }
            i2++;
            itemCount = i;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode != 1073741824) {
            ViewPager2 viewPager2 = this.a;
            if (viewPager2 == null) {
                Intrinsics.i("viewPager");
                throw null;
            }
            l adapter = viewPager2.getAdapter();
            int itemCount = adapter != null ? adapter.getItemCount() : 0;
            float f = this.f;
            int i3 = (int) (((itemCount - 1) * f) + (itemCount * 2 * f) + 1.0f);
            if (mode != Integer.MIN_VALUE || i3 <= size) {
                size = i3;
            }
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 != 1073741824) {
            int viewHeight = getViewHeight();
            size2 = mode2 == Integer.MIN_VALUE ? Math.min(viewHeight, size2) : viewHeight;
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        parcelable.getClass();
        PageIndicator$SavedState pageIndicator$SavedState = (PageIndicator$SavedState) parcelable;
        super.onRestoreInstanceState(pageIndicator$SavedState.getSuperState());
        this.d = pageIndicator$SavedState.a;
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        PageIndicator$SavedState pageIndicator$SavedState = new PageIndicator$SavedState(super.onSaveInstanceState());
        pageIndicator$SavedState.a = this.d;
        return pageIndicator$SavedState;
    }

    public final void setCurrentItem(int i) {
        ViewPager2 viewPager2 = this.a;
        if (viewPager2 == null) {
            Intrinsics.i("viewPager");
            throw null;
        }
        viewPager2.setCurrentItem(i);
        this.d = i;
        invalidate();
    }

    public final void setDirection(int i) {
        this.g = i;
    }

    public final void setOnPageSelectedCallback(@Nullable Function2<? super Integer, ? super Integer, Unit> function2) {
        this.h = function2;
    }

    public final void setPageOffset(float f) {
        this.e = f;
    }

    public final void setupWithViewPager(@NotNull ViewPager2 viewPager2) {
        viewPager2.getClass();
        ViewPager2 viewPager22 = this.a;
        j41 j41Var = this.i;
        if (viewPager22 != null) {
            if (viewPager22 == viewPager2) {
                return;
            }
            if (viewPager22 == null) {
                Intrinsics.i("viewPager");
                throw null;
            }
            viewPager22.e(j41Var);
        }
        if (viewPager2.getAdapter() == null) {
            a70.r("ViewPager does not have adapter instance.");
            return;
        }
        this.a = viewPager2;
        viewPager2.a(j41Var);
        invalidate();
    }
}
