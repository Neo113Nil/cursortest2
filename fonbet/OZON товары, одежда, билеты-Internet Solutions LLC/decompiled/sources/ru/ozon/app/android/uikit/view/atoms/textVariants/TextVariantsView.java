package ru.ozon.app.android.uikit.view.atoms.textVariants;

import Ej.b;
import Sc.InterfaceC3999a;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.n;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.view.atoms.AtomView;

@InterfaceC3999a
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010!\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001HB'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u001b\u001a\u00020\r*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010\u001d\u001a\u00020\r*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001d\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001e\u0010\u0011J\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u0018\u001a\u00020\u0007H\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\"2\u0006\u0010\u0018\u001a\u00020\u0007H\u0002¢\u0006\u0004\b#\u0010$J\u001f\u0010'\u001a\u00020\r2\u0006\u0010%\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\u0007H\u0014¢\u0006\u0004\b'\u0010\u000fJ\u0017\u0010)\u001a\u00020\r2\u0006\u0010(\u001a\u00020\u0017H\u0016¢\u0006\u0004\b)\u0010*J\u001b\u0010.\u001a\u00020\r2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020,0+¢\u0006\u0004\b.\u0010/R\u0014\u00100\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00102\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00101R\u0014\u00103\u001a\u00020\u00078\u0002X\u0082D¢\u0006\u0006\n\u0004\b3\u00101R\u0014\u00104\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00101R\u0014\u00105\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00107\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00106R\u0014\u00108\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00106R\u001c\u0010-\u001a\b\u0012\u0004\u0012\u00020,0+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u00109R\u001c\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00190:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u00109R\u001b\u0010@\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u001b\u0010C\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bA\u0010=\u001a\u0004\bB\u0010?R\u001b\u0010G\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bD\u0010=\u001a\u0004\bE\u0010F¨\u0006I"}, d2 = {"Lru/ozon/app/android/uikit/view/atoms/textVariants/TextVariantsView;", "Landroid/view/View;", "Lru/ozon/uni/android/uikit/view/atoms/AtomView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "maxWidth", "height", "", "measureVariants", "(II)V", "getViewWidth", "()I", "Landroid/graphics/Paint;", "paint", "", "getTextHeight", "(Landroid/graphics/Paint;)F", "Landroid/graphics/Canvas;", "index", "Lru/ozon/app/android/uikit/view/atoms/textVariants/TextVariantsView$MeasuredVariant;", "measuredVariant", "drawVariantBackground", "(Landroid/graphics/Canvas;ILru/ozon/app/android/uikit/view/atoms/textVariants/TextVariantsView$MeasuredVariant;)V", "drawVariantText", "getViewHeight", "Landroid/text/TextPaint;", "getVariantPaint", "(I)Landroid/text/TextPaint;", "", "isActiveVariant", "(I)Z", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "canvas", "draw", "(Landroid/graphics/Canvas;)V", "", "", "variants", "bind", "(Ljava/util/List;)V", "padding", "I", "textHorizontalPadding", "textHorizontalMargin", "textVerticalPadding", "backgroundCornerRadius", "F", "maxAspectWidth", "variantTextSize", "Ljava/util/List;", "", "measuredVariants", "textPaintPrimary$delegate", "LSc/j;", "getTextPaintPrimary", "()Landroid/text/TextPaint;", "textPaintPrimary", "textPaintSecondary$delegate", "getTextPaintSecondary", "textPaintSecondary", "bgPaintActive$delegate", "getBgPaintActive", "()Landroid/graphics/Paint;", "bgPaintActive", "MeasuredVariant", "ui-kit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TextVariantsView extends View implements AtomView {
    private final float backgroundCornerRadius;

    /* renamed from: bgPaintActive$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j bgPaintActive;
    private final float maxAspectWidth;

    @NotNull
    private List<MeasuredVariant> measuredVariants;
    private final int padding;
    private final int textHorizontalMargin;
    private final int textHorizontalPadding;

    /* renamed from: textPaintPrimary$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j textPaintPrimary;

    /* renamed from: textPaintSecondary$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j textPaintSecondary;
    private final int textVerticalPadding;
    private final float variantTextSize;

    @NotNull
    private List<String> variants;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/uikit/view/atoms/textVariants/TextVariantsView$MeasuredVariant;", "", "", "ellipsizedText", "Landroid/graphics/RectF;", "rect", "<init>", "(Ljava/lang/String;Landroid/graphics/RectF;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getEllipsizedText", "Landroid/graphics/RectF;", "getRect", "()Landroid/graphics/RectF;", "ui-kit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final /* data */ class MeasuredVariant {

        @NotNull
        private final String ellipsizedText;

        @NotNull
        private final RectF rect;

        public MeasuredVariant(@NotNull String ellipsizedText, @NotNull RectF rect) {
            Intrinsics.checkNotNullParameter(ellipsizedText, "ellipsizedText");
            Intrinsics.checkNotNullParameter(rect, "rect");
            this.ellipsizedText = ellipsizedText;
            this.rect = rect;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MeasuredVariant)) {
                return false;
            }
            MeasuredVariant measuredVariant = (MeasuredVariant) other;
            return Intrinsics.d(this.ellipsizedText, measuredVariant.ellipsizedText) && Intrinsics.d(this.rect, measuredVariant.rect);
        }

        @NotNull
        public final String getEllipsizedText() {
            return this.ellipsizedText;
        }

        @NotNull
        public final RectF getRect() {
            return this.rect;
        }

        public int hashCode() {
            return this.rect.hashCode() + (this.ellipsizedText.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "MeasuredVariant(ellipsizedText=" + this.ellipsizedText + ", rect=" + this.rect + ")";
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextVariantsView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void drawVariantBackground(Canvas canvas, int i11, MeasuredVariant measuredVariant) {
        if (isActiveVariant(i11)) {
            RectF rect = measuredVariant.getRect();
            float f7 = this.backgroundCornerRadius;
            canvas.drawRoundRect(rect, f7, f7, getBgPaintActive());
        }
    }

    private final void drawVariantText(Canvas canvas, int i11, MeasuredVariant measuredVariant) {
        TextPaint variantPaint = getVariantPaint(i11);
        float f7 = measuredVariant.getRect().left + this.textHorizontalPadding;
        Paint.FontMetrics fontMetrics = variantPaint.getFontMetrics();
        float height = canvas.getHeight() / 2;
        float f11 = fontMetrics.bottom;
        canvas.drawText(measuredVariant.getEllipsizedText(), f7, (((f11 - fontMetrics.top) / 2) + height) - f11, variantPaint);
    }

    private final Paint getBgPaintActive() {
        return (Paint) this.bgPaintActive.getValue();
    }

    private final float getTextHeight(Paint paint) {
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        return fontMetrics.bottom - fontMetrics.top;
    }

    private final TextPaint getTextPaintPrimary() {
        return (TextPaint) this.textPaintPrimary.getValue();
    }

    private final TextPaint getTextPaintSecondary() {
        return (TextPaint) this.textPaintSecondary.getValue();
    }

    private final TextPaint getVariantPaint(int index) {
        return isActiveVariant(index) ? getTextPaintPrimary() : getTextPaintSecondary();
    }

    private final int getViewHeight() {
        return this.variants.isEmpty() ? this.padding * 2 : (int) Math.ceil(getTextHeight(getVariantPaint(0)) + (this.textVerticalPadding * 2) + (this.padding * 2));
    }

    private final int getViewWidth() {
        RectF rect;
        MeasuredVariant measuredVariant = (MeasuredVariant) C7714v.Z(this.measuredVariants);
        return (measuredVariant == null || (rect = measuredVariant.getRect()) == null) ? this.padding * 2 : (int) (rect.right + this.textHorizontalMargin + this.padding);
    }

    private final boolean isActiveVariant(int index) {
        return index == 0;
    }

    private final void measureVariants(int maxWidth, int height) {
        this.measuredVariants.clear();
        float f7 = this.padding;
        int i11 = 0;
        for (Object obj : this.variants) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            TextPaint variantPaint = getVariantPaint(i11);
            String obj2 = TextUtils.ellipsize((String) obj, variantPaint, this.maxAspectWidth, TextUtils.TruncateAt.END).toString();
            float measureText = variantPaint.measureText(obj2);
            float textHeight = getTextHeight(variantPaint) + (this.textVerticalPadding * 2);
            int i13 = this.textHorizontalMargin;
            float f11 = f7 + i13;
            float f12 = measureText + (this.textHorizontalPadding * 2) + f11;
            float f13 = i13 + f12;
            if (this.padding + f13 <= maxWidth) {
                float f14 = (height - textHeight) / 2;
                this.measuredVariants.add(new MeasuredVariant(obj2, new RectF(f11, f14, f12, textHeight + f14)));
            }
            i11 = i12;
            f7 = f13;
        }
    }

    public final void bind(@NotNull List<String> variants) {
        Intrinsics.checkNotNullParameter(variants, "variants");
        if (Intrinsics.d(this.variants, variants)) {
            return;
        }
        this.variants = variants;
        requestLayout();
    }

    @Override // android.view.View
    public void draw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        onDraw(canvas);
        int i11 = 0;
        for (Object obj : this.measuredVariants) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            MeasuredVariant measuredVariant = (MeasuredVariant) obj;
            drawVariantBackground(canvas, i11, measuredVariant);
            drawVariantText(canvas, i11, measuredVariant);
            i11 = i12;
        }
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int defaultSize = View.getDefaultSize(getViewHeight(), heightMeasureSpec);
        int mode = View.MeasureSpec.getMode(widthMeasureSpec);
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        if (mode == Integer.MIN_VALUE) {
            measureVariants(size, defaultSize);
            size = getViewWidth();
        } else if (mode == 0) {
            measureVariants(Integer.MAX_VALUE, defaultSize);
            size = getViewWidth();
        } else {
            if (mode != 1073741824) {
                throw new IllegalStateException(b.a(mode, "Unsupported measure spec mode - "));
            }
            measureVariants(size, defaultSize);
        }
        setMeasuredDimension(size, defaultSize);
    }

    public /* synthetic */ TextVariantsView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextVariantsView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.padding = ResourceExtKt.toPx(0);
        this.textHorizontalPadding = ResourceExtKt.toPx(6);
        this.textHorizontalMargin = 1;
        this.textVerticalPadding = ResourceExtKt.toPx(3);
        this.backgroundCornerRadius = ResourceExtKt.toPxF(6);
        this.maxAspectWidth = ResourceExtKt.toPxF(135);
        this.variantTextSize = ResourceExtKt.toSpF(12);
        this.variants = K.f71697a;
        this.measuredVariants = new ArrayList();
        n nVar = n.NONE;
        this.textPaintPrimary = k.a(nVar, new TextVariantsView$textPaintPrimary$2(this, context));
        this.textPaintSecondary = k.a(nVar, new TextVariantsView$textPaintSecondary$2(this, context));
        this.bgPaintActive = k.a(nVar, new TextVariantsView$bgPaintActive$2(context));
    }
}
