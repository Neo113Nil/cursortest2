package ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.color;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0014J\u0014\u0010\u0016\u001a\u00020\u00132\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0017R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/aspectsCompactV2/color/AspectColorVariantView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "colors", "", "outlineWidth", "", "paint", "Landroid/graphics/Paint;", "outlinePaint", "arcAngle", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "setColors", "", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AspectColorVariantView extends View {
    private float arcAngle;

    @NotNull
    private final List<Integer> colors;

    @NotNull
    private Paint outlinePaint;
    private final float outlineWidth;

    @NotNull
    private Paint paint;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AspectColorVariantView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        canvas.drawOval(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom(), this.outlinePaint);
        int i11 = 0;
        for (Object obj : this.colors) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            this.paint.setColor(((Number) obj).intValue());
            canvas.drawArc(getPaddingLeft() + this.outlineWidth, getPaddingTop() + this.outlineWidth, (getWidth() - this.outlineWidth) - getPaddingRight(), (getHeight() - this.outlineWidth) - getPaddingTop(), (i11 * this.arcAngle) - 90, this.arcAngle, true, this.paint);
            i11 = i12;
        }
    }

    public final void setColors(@NotNull List<Integer> colors) {
        Intrinsics.checkNotNullParameter(colors, "colors");
        if (Intrinsics.d(this.colors, colors)) {
            return;
        }
        this.colors.clear();
        List<Integer> list = colors;
        this.colors.addAll(list);
        this.arcAngle = !list.isEmpty() ? 360.0f / colors.size() : 0.0f;
        invalidate();
    }

    public /* synthetic */ AspectColorVariantView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AspectColorVariantView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.colors = new ArrayList();
        this.outlineWidth = ResourceExtKt.toPxF(1);
        Paint paint = new Paint();
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setAntiAlias(true);
        this.paint = paint;
        Paint paint2 = new Paint();
        paint2.setStyle(style);
        paint2.setAntiAlias(true);
        paint2.setColor(ThemeExtKt.themeColor(context, R$attr.layerOverlayParanja));
        this.outlinePaint = paint2;
    }
}
