package ru.ozon.app.android.ugc.widgets.selectionsList.presentation.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.uni.android.atom.productMedia.ProductMediaView;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.data.productMedia.ProductMediaDTO;
import ru.ozon.uni.atoms.v3.holders.productMedia.ProductMediaHolderKt;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0007H\u0014J0\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u0007H\u0014J\u0010\u0010!\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020#H\u0014J\u0014\u0010$\u001a\u00020\u00172\f\u0010%\u001a\b\u0012\u0004\u0012\u00020'0&R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\fX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lru/ozon/app/android/ugc/widgets/selectionsList/presentation/views/ProductMediaStackView;", "Landroid/view/ViewGroup;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "overlapPx", "cutoutBorderPx", "", "cornerRadiusPx", "antiAlias", "ringPath", "Landroid/graphics/Path;", "inner", "Landroid/graphics/RectF;", "outer", "ringClearPaint", "Landroid/graphics/Paint;", "onMeasure", "", "widthMeasureSpec", "heightMeasureSpec", "onLayout", "changed", "", "left", "top", "right", "bottom", "dispatchDraw", "canvas", "Landroid/graphics/Canvas;", "setItems", "newItems", "", "Lru/ozon/uni/atoms/data/productMedia/ProductMediaDTO;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ProductMediaStackView extends ViewGroup {
    private final float antiAlias;
    private float cornerRadiusPx;
    private float cutoutBorderPx;

    @NotNull
    private final RectF inner;

    @NotNull
    private final RectF outer;
    private int overlapPx;

    @NotNull
    private final Paint ringClearPaint;

    @NotNull
    private final Path ringPath;

    public /* synthetic */ ProductMediaStackView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
        super.dispatchDraw(canvas);
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            this.inner.set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
            RectF rectF = this.outer;
            RectF rectF2 = this.inner;
            float f7 = rectF2.left;
            float f11 = this.cutoutBorderPx;
            rectF.set(f7 - f11, rectF2.top - f11, rectF2.right + f11, rectF2.bottom + f11);
            Path path = this.ringPath;
            path.reset();
            path.setFillType(Path.FillType.EVEN_ODD);
            RectF rectF3 = this.outer;
            float f12 = this.cornerRadiusPx;
            float f13 = this.cutoutBorderPx;
            float f14 = f12 + f13;
            float f15 = f12 + f13;
            Path.Direction direction = Path.Direction.CW;
            path.addRoundRect(rectF3, f14, f15, direction);
            RectF rectF4 = this.inner;
            float f16 = this.cornerRadiusPx;
            path.addRoundRect(rectF4, f16, f16, direction);
            int save = canvas.save();
            try {
                RectF rectF5 = this.inner;
                float f17 = rectF5.right;
                float f18 = this.cornerRadiusPx + this.cutoutBorderPx;
                float f19 = this.antiAlias;
                float f21 = f17 - (f18 + f19);
                float f22 = rectF5.left + f19;
                if (f21 < f22) {
                    f21 = f22;
                }
                canvas.clipRect(0.0f, 0.0f, f21, canvas.getHeight());
                canvas.drawPath(this.ringPath, this.ringClearPaint);
                canvas.restoreToCount(save);
            } catch (Throwable th2) {
                canvas.restoreToCount(save);
                throw th2;
            }
        }
        canvas.restoreToCount(saveLayer);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        int paddingTop = getPaddingTop();
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            int paddingLeft = (this.overlapPx * i11) + getPaddingLeft();
            childAt.layout(paddingLeft, paddingTop, childAt.getMeasuredWidth() + paddingLeft, childAt.getMeasuredHeight() + paddingTop);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int paddingTop;
        int mode = View.MeasureSpec.getMode(heightMeasureSpec);
        int size = View.MeasureSpec.getSize(heightMeasureSpec);
        if (mode == 0 || (paddingTop = (size - getPaddingTop()) - getPaddingBottom()) < 0) {
            paddingTop = 0;
        }
        int makeMeasureSpec = paddingTop == 0 ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec(paddingTop, LinearLayoutManager.INVALID_OFFSET);
        int childCount = getChildCount();
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            measureChild(childAt, View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
            i11 = Math.max(i11, childAt.getMeasuredWidth());
            i12 = Math.max(i12, childAt.getMeasuredHeight());
        }
        setMeasuredDimension(View.resolveSize(getPaddingRight() + getPaddingLeft() + (getChildCount() != 0 ? ((getChildCount() - 1) * this.overlapPx) + i11 : 0), widthMeasureSpec), View.resolveSize(getPaddingBottom() + getPaddingTop() + i12, heightMeasureSpec));
    }

    public final void setItems(@NotNull List<ProductMediaDTO> newItems) {
        Intrinsics.checkNotNullParameter(newItems, "newItems");
        int size = newItems.size();
        int childCount = getChildCount();
        int min = Math.min(size, childCount);
        for (int i11 = 0; i11 < min; i11++) {
            View childAt = getChildAt(i11);
            Intrinsics.g(childAt, "null cannot be cast to non-null type ru.ozon.uni.android.atom.productMedia.ProductMediaView");
            ProductMediaHolderKt.bind$default((ProductMediaView) childAt, newItems.get(i11), null, 2, null);
        }
        if (childCount > size) {
            removeViews(size, childCount - size);
        }
        int i12 = size - childCount;
        for (int i13 = 0; i13 < i12; i13++) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            ProductMediaView productMediaView = new ProductMediaView(context, null, 0, 6, null);
            productMediaView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            ProductMediaHolderKt.bind$default(productMediaView, newItems.get(childCount + i13), null, 2, null);
            productMediaView.setOnClickListener(null);
            addView(productMediaView);
        }
        ViewExtKt.showOrGone(this, Boolean.valueOf(size != 0));
        invalidate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductMediaStackView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        Dimens dimens = Dimens.INSTANCE;
        this.overlapPx = dimens.getDP_10();
        this.cutoutBorderPx = dimens.getDPF_1();
        this.cornerRadiusPx = dimens.getDPF_6();
        this.antiAlias = 0.5f;
        this.ringPath = new Path();
        this.inner = new RectF();
        this.outer = new RectF();
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.ringClearPaint = paint;
        setClipToPadding(false);
        setClipChildren(false);
        setWillNotDraw(false);
        setBackground(null);
    }
}
