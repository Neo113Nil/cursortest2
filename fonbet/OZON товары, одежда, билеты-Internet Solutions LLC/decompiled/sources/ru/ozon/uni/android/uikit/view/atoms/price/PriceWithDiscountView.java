package ru.ozon.uni.android.uikit.view.atoms.price;

import Sc.InterfaceC3999a;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.res.g;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.R$font;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.view.atoms.AtomView;

@InterfaceC3999a
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0014\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B1\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u001c\u0010\u001dR*\u0010 \u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R*\u0010&\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u00078\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R*\u0010,\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u00078\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b,\u0010'\u001a\u0004\b-\u0010)\"\u0004\b.\u0010+R*\u0010/\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b/\u0010!\u001a\u0004\b0\u0010#\"\u0004\b1\u0010%R*\u00102\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u00078\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b2\u0010'\u001a\u0004\b3\u0010)\"\u0004\b4\u0010+R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u00109\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010;\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u00107R$\u0010=\u001a\u00020<2\u0006\u0010\u001f\u001a\u00020<8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b=\u0010>\"\u0004\b?\u0010@R$\u0010A\u001a\u00020<2\u0006\u0010\u001f\u001a\u00020<8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\bA\u0010>\"\u0004\bB\u0010@R\u0014\u0010C\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010>R\u0014\u0010D\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010>R\u0016\u0010E\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010G\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010FR\u0016\u0010H\u001a\u00020<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010>R\u0016\u0010I\u001a\u00020<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010>R\u0016\u0010J\u001a\u00020<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010>R\u0016\u0010K\u001a\u00020<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010>R\u0016\u0010L\u001a\u00020<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010>R\u0016\u0010M\u001a\u00020<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010>R\u0016\u0010N\u001a\u00020<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010>R\u0016\u0010O\u001a\u00020<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010>¨\u0006P"}, d2 = {"Lru/ozon/uni/android/uikit/view/atoms/price/PriceWithDiscountView;", "Landroid/view/View;", "Lru/ozon/uni/android/uikit/view/atoms/AtomView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "width", "Landroid/text/StaticLayout;", "createPriceStaticLayout", "(I)Landroid/text/StaticLayout;", "createDiscountStaticLayout", "", "isSingleLine", "", "resolveCoordinates", "(Z)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "price", "Ljava/lang/String;", "getPrice", "()Ljava/lang/String;", "setPrice", "(Ljava/lang/String;)V", "priceColor", "I", "getPriceColor", "()I", "setPriceColor", "(I)V", "strikethroughColor", "getStrikethroughColor", "setStrikethroughColor", "discount", "getDiscount", "setDiscount", "discountColor", "getDiscountColor", "setDiscountColor", "Landroid/text/TextPaint;", "pricePaint", "Landroid/text/TextPaint;", "Landroid/graphics/Paint;", "strikethroughPaint", "Landroid/graphics/Paint;", "discountPaint", "", "priceWidth", "F", "setPriceWidth", "(F)V", "discountWidth", "setDiscountWidth", "space", "dp1", "priceStaticLayout", "Landroid/text/StaticLayout;", "discountStaticLayout", "priceTranslateX", "priceTranslateY", "lineX1", "lineY1", "lineX2", "lineY2", "discountTranslateX", "discountTranslateY", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PriceWithDiscountView extends View implements AtomView {

    @NotNull
    private String discount;
    private int discountColor;

    @NotNull
    private final TextPaint discountPaint;

    @NotNull
    private StaticLayout discountStaticLayout;
    private float discountTranslateX;
    private float discountTranslateY;
    private float discountWidth;
    private final float dp1;
    private float lineX1;
    private float lineX2;
    private float lineY1;
    private float lineY2;

    @NotNull
    private String price;
    private int priceColor;

    @NotNull
    private final TextPaint pricePaint;

    @NotNull
    private StaticLayout priceStaticLayout;
    private float priceTranslateX;
    private float priceTranslateY;
    private float priceWidth;
    private final float space;
    private int strikethroughColor;

    @NotNull
    private final Paint strikethroughPaint;

    public /* synthetic */ PriceWithDiscountView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    private final StaticLayout createDiscountStaticLayout(int width) {
        String str = this.discount;
        StaticLayout build = StaticLayout.Builder.obtain(str, 0, str.length(), this.discountPaint, width).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

    private final StaticLayout createPriceStaticLayout(int width) {
        String str = this.price;
        StaticLayout build = StaticLayout.Builder.obtain(str, 0, str.length(), this.pricePaint, width).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

    private final void resolveCoordinates(boolean isSingleLine) {
        this.priceTranslateX = getPaddingLeft();
        this.priceTranslateY = getPaddingTop();
        float height = this.priceStaticLayout.getHeight() / 2.0f;
        this.lineY1 = this.dp1 + height;
        this.lineX2 = this.priceStaticLayout.getWidth();
        this.lineY2 = height - this.dp1;
        this.discountTranslateX = isSingleLine ? this.priceWidth + this.space : 0.0f;
        this.discountTranslateY = isSingleLine ? 0.0f : this.priceStaticLayout.getHeight();
    }

    private final void setDiscountWidth(float f7) {
        if (f7 == this.discountWidth) {
            return;
        }
        this.discountWidth = f7;
        requestLayout();
    }

    private final void setPriceWidth(float f7) {
        if (f7 == this.priceWidth) {
            return;
        }
        this.priceWidth = f7;
        requestLayout();
    }

    @Override // android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        canvas.translate(this.priceTranslateX, this.priceTranslateY);
        this.priceStaticLayout.draw(canvas);
        canvas.drawLine(this.lineX1, this.lineY1, this.lineX2, this.lineY2, this.strikethroughPaint);
        canvas.translate(this.discountTranslateX, this.discountTranslateY);
        this.discountStaticLayout.draw(canvas);
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int i11 = ((int) (this.priceWidth + this.space + this.discountWidth)) + paddingRight;
        int resolveSize = View.resolveSize(i11, widthMeasureSpec);
        if (i11 <= resolveSize) {
            this.priceStaticLayout = createPriceStaticLayout((int) this.priceWidth);
            this.discountStaticLayout = createDiscountStaticLayout((int) this.discountWidth);
            resolveCoordinates(true);
            setMeasuredDimension(resolveSize, View.resolveSize(this.priceStaticLayout.getHeight() + paddingBottom, heightMeasureSpec));
            return;
        }
        int max = Math.max(Math.min(resolveSize, ((int) this.priceWidth) + paddingRight), Math.min(resolveSize, ((int) this.discountWidth) + paddingBottom));
        int i12 = max - paddingRight;
        this.priceStaticLayout = createPriceStaticLayout(Math.min((int) this.priceWidth, i12));
        this.discountStaticLayout = createDiscountStaticLayout(Math.min((int) this.discountWidth, i12));
        int height = this.discountStaticLayout.getHeight() + this.priceStaticLayout.getHeight() + paddingBottom;
        resolveCoordinates(false);
        setMeasuredDimension(max, View.resolveSize(height, heightMeasureSpec));
    }

    public final void setDiscount(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (Intrinsics.d(value, this.discount)) {
            return;
        }
        this.discount = value;
        setDiscountWidth(this.discountPaint.measureText(value));
        invalidate();
    }

    public final void setDiscountColor(int i11) {
        if (i11 != this.discountColor) {
            this.discountColor = i11;
            this.discountPaint.setColor(i11);
            invalidate();
        }
    }

    public final void setPrice(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (Intrinsics.d(value, this.price)) {
            return;
        }
        this.price = value;
        setPriceWidth(this.pricePaint.measureText(value));
        invalidate();
    }

    public final void setPriceColor(int i11) {
        if (i11 != this.priceColor) {
            this.priceColor = i11;
            this.pricePaint.setColor(i11);
            invalidate();
        }
    }

    public final void setStrikethroughColor(int i11) {
        if (i11 != this.strikethroughColor) {
            this.strikethroughColor = i11;
            this.strikethroughPaint.setColor(i11);
            invalidate();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PriceWithDiscountView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        this.price = "";
        this.priceColor = ThemeExtKt.themeColor(context, R$attr.oz_semantic_text_primary);
        this.strikethroughColor = ThemeExtKt.themeColor(context, R$attr.oz_semantic_text_sale);
        this.discount = "";
        this.discountColor = ThemeExtKt.themeColor(context, R$attr.oz_semantic_text_sale);
        TextPaint textPaint = new TextPaint(1);
        textPaint.setColor(this.priceColor);
        textPaint.setTextSize(ResourceExtKt.toSpF(12));
        textPaint.setLetterSpacing(0.02f);
        textPaint.setTypeface(g.e(R$font.onest_regular, context));
        this.pricePaint = textPaint;
        Paint paint = new Paint(1);
        paint.setColor(this.strikethroughColor);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(ResourceExtKt.toPxF(1));
        this.strikethroughPaint = paint;
        TextPaint textPaint2 = new TextPaint(1);
        textPaint2.setColor(this.discountColor);
        textPaint2.setTextSize(ResourceExtKt.toSpF(12));
        textPaint2.setLetterSpacing(0.02f);
        textPaint2.setTypeface(g.e(R$font.onest_semibold, context));
        this.discountPaint = textPaint2;
        this.space = ResourceExtKt.toPxF(4);
        this.dp1 = ResourceExtKt.toPxF(1);
        this.priceStaticLayout = createDiscountStaticLayout(0);
        this.discountStaticLayout = createDiscountStaticLayout(0);
    }
}
