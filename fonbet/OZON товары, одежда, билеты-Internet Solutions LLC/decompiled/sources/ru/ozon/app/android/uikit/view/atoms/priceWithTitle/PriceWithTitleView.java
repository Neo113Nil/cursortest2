package ru.ozon.app.android.uikit.view.atoms.priceWithTitle;

import Sc.InterfaceC3999a;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.app.android.uikit.utils.TextPaintStyleParser;
import ru.ozon.uni.R$color;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.view.atoms.AtomView;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;

@InterfaceC3999a
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0015\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B1\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0013J%\u0010\u001a\u001a\u00020\u0019*\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00162\b\b\u0001\u0010\u0018\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001d\u001a\u00020\u0007*\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010\u001f\u001a\u00020\u0007*\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b\u001f\u0010\u001eJ\u0019\u0010 \u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b \u0010\u0010J\u0017\u0010#\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020!H\u0014¢\u0006\u0004\b#\u0010$J\u001f\u0010'\u001a\u00020\u00112\u0006\u0010%\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\u0007H\u0014¢\u0006\u0004\b'\u0010(J)\u0010-\u001a\u00020\u00112\u0006\u0010*\u001a\u00020)2\b\b\u0001\u0010+\u001a\u00020\u00072\b\b\u0001\u0010,\u001a\u00020\u0007¢\u0006\u0004\b-\u0010.J!\u00100\u001a\u00020\u00112\b\u0010/\u001a\u0004\u0018\u00010)2\b\b\u0001\u0010+\u001a\u00020\u0007¢\u0006\u0004\b0\u00101J#\u00105\u001a\u00020\u00112\n\b\u0001\u00102\u001a\u0004\u0018\u00010\u00072\b\u00104\u001a\u0004\u0018\u000103¢\u0006\u0004\b5\u00106R*\u00108\u001a\u00020\u00072\u0006\u00107\u001a\u00020\u00078\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R*\u0010?\u001a\u00020>2\u0006\u00107\u001a\u00020>8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR*\u0010E\u001a\u00020\u00072\u0006\u00107\u001a\u00020\u00078\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\bE\u00109\u001a\u0004\bF\u0010;\"\u0004\bG\u0010=R.\u0010H\u001a\u0004\u0018\u00010\u00072\b\u00107\u001a\u0004\u0018\u00010\u00078\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\u0016\u0010*\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010NR\u0016\u0010O\u001a\u00020\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bO\u00109R\u0018\u0010/\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010NR\u0016\u0010P\u001a\u00020\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bP\u00109R\u0014\u0010Q\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bQ\u00109R\u0016\u0010R\u001a\u00020\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bR\u00109R\u0018\u0010S\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010V\u001a\u00020U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010Y\u001a\u00020X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0014\u0010[\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0014\u0010]\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010\\R\u0014\u0010^\u001a\u00020U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010WR\u0014\u0010_\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010@R\u0018\u0010`\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010aR\u0018\u0010b\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010aR\u0014\u0010c\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u00109R\u0014\u0010d\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u00109R\u0014\u0010e\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u00109R\u0016\u0010f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010gR\u0014\u0010i\u001a\u00020h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010j¨\u0006k"}, d2 = {"Lru/ozon/app/android/uikit/view/atoms/priceWithTitle/PriceWithTitleView;", "Landroid/view/View;", "Lru/ozon/uni/android/uikit/view/atoms/AtomView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Landroid/view/MotionEvent;", "event", "", "checkSpanClick", "(Landroid/view/MotionEvent;)Z", "", "updatePriceBackground", "()V", "updatePriceBackgroundRect", "", "Landroid/text/TextPaint;", "paint", "width", "Landroid/text/StaticLayout;", "toStaticLayout", "(Ljava/lang/CharSequence;Landroid/text/TextPaint;I)Landroid/text/StaticLayout;", "Landroid/text/Layout;", "safeWidth", "(Landroid/text/Layout;)I", "safeHeight", "onTouchEvent", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "price", "style", "textColor", "setPriceWithStyle", "(Lru/ozon/uni/atoms/utils/OzonSpannableString;II)V", SelectionItemFormDTO.TITLE_FIELD_NAME, "setTitleWithStyle", "(Lru/ozon/uni/atoms/utils/OzonSpannableString;I)V", "color", "", "gradient", "setPriceBackground", "(Ljava/lang/Integer;[I)V", AppMeasurementSdk.ConditionalUserProperty.VALUE, "priceColor", "I", "getPriceColor", "()I", "setPriceColor", "(I)V", "", "priceBackgroundCornerRadius", "F", "getPriceBackgroundCornerRadius", "()F", "setPriceBackgroundCornerRadius", "(F)V", "titleColor", "getTitleColor", "setTitleColor", "strikethroughColor", "Ljava/lang/Integer;", "getStrikethroughColor", "()Ljava/lang/Integer;", "setStrikethroughColor", "(Ljava/lang/Integer;)V", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "priceStyle", "titleStyle", "defaultPriceBackgroundColor", "priceBackgroundColor", "priceBackgroundGradient", "[I", "Landroid/graphics/Paint;", "priceBackgroundPaint", "Landroid/graphics/Paint;", "Landroid/graphics/RectF;", "priceBackgroundRect", "Landroid/graphics/RectF;", "pricePaint", "Landroid/text/TextPaint;", "titlePaint", "strikethroughPaint", "strikethroughHalfHeight", "priceLayout", "Landroid/text/StaticLayout;", "titleLayout", "pricePadding", "titleLeftMargin", "titleTopMargin", "isSingleLine", "Z", "Lru/ozon/app/android/uikit/utils/TextPaintStyleParser;", "textPaintStyleParser", "Lru/ozon/app/android/uikit/utils/TextPaintStyleParser;", "ui-kit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PriceWithTitleView extends View implements AtomView {
    private final int defaultPriceBackgroundColor;
    private boolean isSingleLine;

    @NotNull
    private OzonSpannableString price;
    private int priceBackgroundColor;
    private float priceBackgroundCornerRadius;
    private int[] priceBackgroundGradient;

    @NotNull
    private final Paint priceBackgroundPaint;

    @NotNull
    private final RectF priceBackgroundRect;
    private int priceColor;
    private StaticLayout priceLayout;
    private final int pricePadding;

    @NotNull
    private final TextPaint pricePaint;
    private int priceStyle;
    private Integer strikethroughColor;
    private final float strikethroughHalfHeight;

    @NotNull
    private final Paint strikethroughPaint;

    @NotNull
    private final TextPaintStyleParser textPaintStyleParser;
    private OzonSpannableString title;
    private int titleColor;
    private StaticLayout titleLayout;
    private final int titleLeftMargin;

    @NotNull
    private final TextPaint titlePaint;
    private int titleStyle;
    private final int titleTopMargin;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PriceWithTitleView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final boolean checkSpanClick(MotionEvent event) {
        StaticLayout staticLayout;
        int safeHeight;
        OzonSpannableString ozonSpannableString = this.title;
        if (ozonSpannableString != null && (staticLayout = this.titleLayout) != null && event != null && event.getAction() == 1) {
            float x11 = event.getX();
            float paddingLeft = x11 - getPaddingLeft();
            int y11 = ((int) event.getY()) - getPaddingTop();
            if (this.isSingleLine) {
                paddingLeft -= safeWidth(this.priceLayout) + this.titleLeftMargin;
                safeHeight = (safeHeight(this.priceLayout) - staticLayout.getHeight()) / 2;
            } else {
                safeHeight = safeHeight(this.priceLayout) + this.titleTopMargin;
            }
            int i11 = y11 - safeHeight;
            if (paddingLeft >= 0.0f && paddingLeft <= staticLayout.getWidth() && i11 >= 0 && i11 <= staticLayout.getHeight()) {
                int offsetForHorizontal = staticLayout.getOffsetForHorizontal(staticLayout.getLineForVertical(i11), paddingLeft);
                ClickableSpan[] clickableSpanArr = (ClickableSpan[]) ozonSpannableString.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                Intrinsics.f(clickableSpanArr);
                if (!(clickableSpanArr.length == 0)) {
                    clickableSpanArr[0].onClick(this);
                    return true;
                }
            }
        }
        return false;
    }

    private final int safeHeight(Layout layout) {
        if (layout != null) {
            return layout.getHeight();
        }
        return 0;
    }

    private final int safeWidth(Layout layout) {
        if (layout != null) {
            return layout.getWidth();
        }
        return 0;
    }

    private final StaticLayout toStaticLayout(CharSequence charSequence, TextPaint textPaint, int i11) {
        int length = charSequence.length();
        if (i11 < 1) {
            i11 = 1;
        }
        StaticLayout build = StaticLayout.Builder.obtain(charSequence, 0, length, textPaint, i11).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

    private final void updatePriceBackground() {
        LinearGradient linearGradient;
        int[] iArr = this.priceBackgroundGradient;
        float safeWidth = (this.pricePadding * 2.0f) + safeWidth(this.priceLayout);
        Paint paint = this.priceBackgroundPaint;
        if (iArr == null) {
            paint.setColor(this.priceBackgroundColor);
            linearGradient = null;
        } else {
            linearGradient = new LinearGradient(0.0f, 0.0f, safeWidth, 0.0f, iArr, (float[]) null, Shader.TileMode.CLAMP);
        }
        paint.setShader(linearGradient);
    }

    private final void updatePriceBackgroundRect() {
        float width = this.priceBackgroundRect.width();
        float height = this.priceBackgroundRect.height();
        float safeWidth = (this.pricePadding * 2.0f) + safeWidth(this.priceLayout);
        float safeHeight = safeHeight(this.priceLayout);
        if (width == safeWidth && height == safeHeight) {
            return;
        }
        int[] iArr = this.priceBackgroundGradient;
        this.priceBackgroundPaint.setShader(iArr != null ? new LinearGradient(0.0f, 0.0f, safeWidth, 0.0f, iArr, (float[]) null, Shader.TileMode.CLAMP) : null);
        this.priceBackgroundRect.set(0.0f, 0.0f, safeWidth, safeHeight);
    }

    public final int getPriceColor() {
        return this.priceColor;
    }

    @Override // android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        canvas.translate(getPaddingLeft(), getPaddingTop());
        RectF rectF = this.priceBackgroundRect;
        float f7 = this.priceBackgroundCornerRadius;
        canvas.drawRoundRect(rectF, f7, f7, this.priceBackgroundPaint);
        canvas.translate(this.pricePadding, 0.0f);
        StaticLayout staticLayout = this.priceLayout;
        if (staticLayout != null) {
            staticLayout.draw(canvas);
        }
        StaticLayout staticLayout2 = this.titleLayout;
        if (staticLayout2 != null) {
            if (this.isSingleLine) {
                canvas.translate(safeWidth(this.priceLayout) + this.pricePadding + this.titleLeftMargin, (safeHeight(this.priceLayout) - staticLayout2.getHeight()) / 2.0f);
            } else {
                canvas.translate(-this.pricePadding, safeHeight(this.priceLayout) + this.titleTopMargin);
            }
            staticLayout2.draw(canvas);
            if (this.strikethroughColor != null) {
                canvas.drawLine(0.0f, (staticLayout2.getHeight() / 2.0f) + this.strikethroughHalfHeight, staticLayout2.getWidth(), (staticLayout2.getHeight() / 2.0f) - this.strikethroughHalfHeight, this.strikethroughPaint);
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int height;
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        OzonSpannableString ozonSpannableString = this.price;
        OzonSpannableString ozonSpannableString2 = this.title;
        int ceil = (int) Math.ceil(Layout.getDesiredWidth(ozonSpannableString, this.pricePaint));
        int ceil2 = ozonSpannableString2 != null ? (int) Math.ceil(Layout.getDesiredWidth(ozonSpannableString2, this.titlePaint)) : 0;
        int i11 = (this.pricePadding * 2) + paddingRight + ceil + (ozonSpannableString2 != null ? this.titleLeftMargin + ceil2 : 0);
        int resolveSize = View.resolveSize(i11, widthMeasureSpec);
        if (i11 <= resolveSize) {
            this.priceLayout = toStaticLayout(ozonSpannableString, this.pricePaint, ceil);
            this.titleLayout = ozonSpannableString2 != null ? toStaticLayout(ozonSpannableString2, this.titlePaint, ceil2) : null;
            int safeHeight = safeHeight(this.priceLayout);
            StaticLayout staticLayout = this.titleLayout;
            height = Math.max(safeHeight, staticLayout != null ? staticLayout.getHeight() : 0) + paddingBottom;
            this.isSingleLine = true;
        } else {
            resolveSize = Math.max(Math.min(resolveSize, (this.pricePadding * 2) + ceil + paddingRight), Math.min(resolveSize, ceil2 + paddingRight));
            int i12 = resolveSize - paddingRight;
            this.priceLayout = toStaticLayout(ozonSpannableString, this.pricePaint, Math.min(ceil, i12 - (this.pricePadding * 2)));
            this.titleLayout = ozonSpannableString2 != null ? toStaticLayout(ozonSpannableString2, this.titlePaint, Math.min(ceil2, i12)) : null;
            int safeHeight2 = safeHeight(this.priceLayout);
            StaticLayout staticLayout2 = this.titleLayout;
            height = safeHeight2 + (staticLayout2 != null ? staticLayout2.getHeight() + this.titleTopMargin : 0);
            this.isSingleLine = false;
        }
        updatePriceBackgroundRect();
        setMeasuredDimension(resolveSize, View.resolveSize(height, heightMeasureSpec));
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        return checkSpanClick(event) || super.onTouchEvent(event);
    }

    public final void setPriceBackground(Integer color, int[] gradient) {
        boolean equals = Arrays.equals(this.priceBackgroundGradient, gradient);
        this.priceBackgroundGradient = gradient;
        int intValue = color != null ? color.intValue() : this.defaultPriceBackgroundColor;
        boolean z11 = (equals && this.priceBackgroundColor == intValue) ? false : true;
        this.priceBackgroundColor = intValue;
        if (z11) {
            updatePriceBackground();
            invalidate();
        }
    }

    public final void setPriceBackgroundCornerRadius(float f7) {
        if (this.priceBackgroundCornerRadius == f7) {
            return;
        }
        this.priceBackgroundCornerRadius = f7;
        invalidate();
    }

    public final void setPriceColor(int i11) {
        if (this.priceColor == i11) {
            return;
        }
        this.priceColor = i11;
        this.pricePaint.setColor(i11);
        invalidate();
    }

    public final void setPriceWithStyle(@NotNull OzonSpannableString price, int style, int textColor) {
        boolean z11;
        Intrinsics.checkNotNullParameter(price, "price");
        boolean z12 = true;
        if (Intrinsics.d(this.price, price)) {
            z11 = false;
        } else {
            this.price = price;
            z11 = true;
        }
        if (this.priceStyle != style) {
            this.priceStyle = style;
            this.textPaintStyleParser.applyStyle(this.pricePaint, style, Integer.valueOf(textColor));
        } else {
            z12 = z11;
        }
        if (z12) {
            requestLayout();
            invalidate();
        }
    }

    public final void setStrikethroughColor(Integer num) {
        if (Intrinsics.d(this.strikethroughColor, num)) {
            return;
        }
        this.strikethroughColor = num;
        if (num != null) {
            this.strikethroughPaint.setColor(num.intValue());
        }
        invalidate();
    }

    public final void setTitleColor(int i11) {
        if (this.titleColor == i11) {
            return;
        }
        this.titleColor = i11;
        this.titlePaint.setColor(i11);
        invalidate();
    }

    public final void setTitleWithStyle(OzonSpannableString title, int style) {
        boolean z11;
        boolean z12 = true;
        if (Intrinsics.d(this.title, title)) {
            z11 = false;
        } else {
            this.title = title;
            z11 = true;
        }
        if (this.titleStyle != style) {
            this.titleStyle = style;
            TextPaintStyleParser.applyStyle$default(this.textPaintStyleParser, this.titlePaint, style, null, 4, null);
            if (!z11 && title == null) {
                z12 = false;
            }
            z11 = z12;
        }
        if (z11) {
            requestLayout();
            invalidate();
        }
    }

    public /* synthetic */ PriceWithTitleView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PriceWithTitleView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        this.priceColor = context.getColor(R$color.oz_black);
        this.priceBackgroundCornerRadius = ResourceExtKt.toPxF(4, context);
        this.titleColor = context.getColor(R$color.oz_text_secondary);
        this.price = OzonSpannableStringKt.toOzonSpannableString("");
        this.priceStyle = R$style.TextStyle_Body_L_Bold;
        this.titleStyle = R$style.TextStyle_Caption;
        int color = context.getColor(R$color.oz_semantic_credit);
        this.defaultPriceBackgroundColor = color;
        this.priceBackgroundColor = color;
        Paint paint = new Paint(1);
        paint.setColor(this.priceBackgroundColor);
        this.priceBackgroundPaint = paint;
        this.priceBackgroundRect = new RectF();
        TextPaint textPaint = new TextPaint(1);
        this.pricePaint = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        textPaint2.linkColor = context.getColor(R$color.oz_blue);
        this.titlePaint = textPaint2;
        Paint paint2 = new Paint(1);
        paint2.setStrokeWidth(ResourceExtKt.toPxF(1, context));
        this.strikethroughPaint = paint2;
        this.strikethroughHalfHeight = ResourceExtKt.toPxF(1, context);
        this.pricePadding = ResourceExtKt.toPx(4, context);
        this.titleLeftMargin = ResourceExtKt.toPx(4, context);
        this.titleTopMargin = ResourceExtKt.toPx(2, context);
        this.isSingleLine = true;
        TextPaintStyleParser textPaintStyleParser = new TextPaintStyleParser(context);
        this.textPaintStyleParser = textPaintStyleParser;
        textPaint.setColor(this.priceColor);
        textPaint2.setColor(this.titleColor);
        TextPaintStyleParser.applyStyle$default(textPaintStyleParser, textPaint, this.priceStyle, null, 4, null);
        TextPaintStyleParser.applyStyle$default(textPaintStyleParser, textPaint2, this.titleStyle, null, 4, null);
        setClickable(true);
    }
}
