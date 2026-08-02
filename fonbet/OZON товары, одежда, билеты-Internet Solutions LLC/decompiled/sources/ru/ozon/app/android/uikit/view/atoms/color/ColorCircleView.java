package ru.ozon.app.android.uikit.view.atoms.color;

import Sc.InterfaceC3999a;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.res.g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.uikit.R$drawable;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@InterfaceC3999a
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0014J\u0018\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0007H\u0014J\u0010\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u00102\b\b\u0001\u0010\u001a\u001a\u00020\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/uikit/view/atoms/color/ColorCircleView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "fillPaint", "Landroid/graphics/Paint;", "strokePaint", "checkDrawable", "Landroid/graphics/drawable/LayerDrawable;", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "setSelected", "selected", "", "setColor", "color", "Companion", "ui-kit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ColorCircleView extends View {

    @NotNull
    private final LayerDrawable checkDrawable;

    @NotNull
    private final Paint fillPaint;

    @NotNull
    private final Paint strokePaint;
    private static final int selectedSize = ResourceExtKt.toPx(32);
    private static final int notSelectedSize = ResourceExtKt.toPx(24);
    private static final float dp4 = ResourceExtKt.toPxF(4);

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ColorCircleView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        float f7 = 2;
        float width = canvas.getWidth() / f7;
        float height = canvas.getHeight() / f7;
        float f11 = (isSelected() ? selectedSize : notSelectedSize) / f7;
        canvas.drawCircle(width, height, f11, this.fillPaint);
        canvas.drawCircle(width, height, f11 - (this.strokePaint.getStrokeWidth() / f7), this.strokePaint);
        if (isSelected()) {
            float f12 = dp4;
            canvas.translate(f12, f12);
            this.checkDrawable.draw(canvas);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getMode(widthMeasureSpec) == 1073741824 ? View.MeasureSpec.getSize(widthMeasureSpec) : isSelected() ? selectedSize : notSelectedSize, 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getMode(heightMeasureSpec) == 1073741824 ? View.MeasureSpec.getSize(heightMeasureSpec) : isSelected() ? selectedSize : notSelectedSize, 1073741824));
    }

    public final void setColor(int color) {
        this.fillPaint.setColor(color);
        invalidate();
    }

    @Override // android.view.View
    public void setSelected(boolean selected) {
        super.setSelected(selected);
        requestLayout();
        invalidate();
    }

    public /* synthetic */ ColorCircleView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ColorCircleView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.fillPaint = new Paint(1);
        Paint paint = new Paint(1);
        paint.setColor(ThemeExtKt.themeColor(context, R$attr.oz_semantic_separator));
        paint.setStrokeWidth(ResourceExtKt.toPxF(2));
        paint.setStyle(Paint.Style.STROKE);
        this.strokePaint = paint;
        Drawable drawable = null;
        Drawable d11 = g.d(context.getResources(), R$drawable.ic_m_ok_shadow, null);
        if (d11 != null) {
            d11.setBounds(0, 0, d11.getIntrinsicWidth(), d11.getIntrinsicHeight());
            Unit unit = Unit.f71690a;
        } else {
            d11 = null;
        }
        Drawable d12 = g.d(context.getResources(), ru.ozon.uni.R$drawable.ic_m_ok, null);
        if (d12 != null) {
            d12.setTint(context.getColor(R$color.oz_white_1));
            d12.setBounds(0, 0, d12.getIntrinsicWidth(), d12.getIntrinsicHeight());
            Unit unit2 = Unit.f71690a;
            drawable = d12;
        }
        this.checkDrawable = new LayerDrawable(new Drawable[]{d11, drawable});
    }
}
