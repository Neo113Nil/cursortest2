package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.views.image;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import hd.C6915b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0015\u001a\u00020\f2\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0015\u0010\u0016R$\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010 R\u0016\u0010#\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010%\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010$¨\u0006&"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/views/image/AspectRatioImageWithBgView;", "Landroidx/appcompat/widget/AppCompatImageView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "widthMeasureSpec", "heightMeasureSpec", "", "onMeasure", "(II)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "firstColor", "secondColor", "bindBackgroundColors", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "", "ratio", "Ljava/lang/Float;", "getRatio", "()Ljava/lang/Float;", "setRatio", "(Ljava/lang/Float;)V", "Landroid/graphics/Paint;", "bgFirstPaint", "Landroid/graphics/Paint;", "bgSecondPaint", "", "skipDrawBgFirst", "Z", "skipDrawBgSecond", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AspectRatioImageWithBgView extends AppCompatImageView {

    @NotNull
    private final Paint bgFirstPaint;

    @NotNull
    private final Paint bgSecondPaint;
    private Float ratio;
    private boolean skipDrawBgFirst;
    private boolean skipDrawBgSecond;

    public /* synthetic */ AspectRatioImageWithBgView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    public final void bindBackgroundColors(Integer firstColor, Integer secondColor) {
        if (firstColor != null) {
            this.bgFirstPaint.setColor(firstColor.intValue());
        }
        if (secondColor != null) {
            this.bgSecondPaint.setColor(secondColor.intValue());
        }
        this.skipDrawBgFirst = firstColor == null;
        this.skipDrawBgSecond = secondColor == null;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        Canvas canvas2;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        float left = getLeft();
        float right = getRight();
        float top = getTop();
        float bottom = getBottom();
        float f7 = bottom / 2.0f;
        if (this.skipDrawBgFirst) {
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.drawRect(left, top, right, f7 + 1, this.bgFirstPaint);
        }
        if (!this.skipDrawBgSecond) {
            canvas2.drawRect(left, f7, right, bottom, this.bgSecondPaint);
        }
        super.onDraw(canvas2);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        Float f7 = this.ratio;
        if (f7 == null) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            return;
        }
        float floatValue = f7.floatValue();
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(C6915b.c(size * floatValue), 1073741824));
    }

    public final void setRatio(Float f7) {
        this.ratio = f7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AspectRatioImageWithBgView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.ratio = Float.valueOf(1.0f);
        this.bgFirstPaint = new Paint();
        this.bgSecondPaint = new Paint();
    }
}
