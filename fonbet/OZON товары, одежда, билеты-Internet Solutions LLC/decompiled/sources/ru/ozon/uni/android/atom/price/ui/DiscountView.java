package ru.ozon.uni.android.atom.price.ui;

import Sc.InterfaceC4008j;
import Sc.k;
import Sc.n;
import android.content.Context;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.atom.price.data.StyleKt;
import ru.ozon.uni.android.atom.price.span.AppearanceSpan;
import ru.ozon.uni.android.atom.price.span.SpaceSpan;
import ru.ozon.uni.android.atom.price.utils.CommonPriceUtilsKt;
import ru.ozon.uni.android.ds.UniGlobalConfig;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.price.PriceDTOKt;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 #2\u00020\u0001:\u0001#B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\f\u001a\u00020\u000b*\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ+\u0010\u0013\u001a\u00020\u0012*\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0017\u001a\u00020\u0012*\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u001a\u001a\u00020\u0012*\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\n¢\u0006\u0004\b\u001c\u0010\u001dR\u001b\u0010\"\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006$"}, d2 = {"Lru/ozon/uni/android/atom/price/ui/DiscountView;", "Landroidx/appcompat/widget/AppCompatTextView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "", "buildDiscountText", "(Lru/ozon/uni/atoms/data/price/PriceDTO;)Ljava/lang/CharSequence;", "Landroid/text/SpannableStringBuilder;", "", "text", "data", "", "applyDiscountSpan", "(Landroid/text/SpannableStringBuilder;Ljava/lang/String;Lru/ozon/uni/atoms/data/price/PriceDTO;Landroid/content/Context;)V", "Landroid/graphics/Paint;", "paint", "applyStyledTextSpan", "(Landroid/text/SpannableStringBuilder;Ljava/lang/String;Landroid/graphics/Paint;)V", "space", "applySpaceSpan", "(Landroid/text/SpannableStringBuilder;I)V", "setContent", "(Lru/ozon/uni/atoms/data/price/PriceDTO;)V", "discountPaint$delegate", "LSc/j;", "getDiscountPaint", "()Landroid/graphics/Paint;", "discountPaint", "Companion", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DiscountView extends AppCompatTextView {

    /* renamed from: discountPaint$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j discountPaint;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/uni/android/atom/price/ui/DiscountView$Companion;", "", "<init>", "()V", "EMPTY_STRING", "", "EMPTY_SYMBOL", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ DiscountView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final void applyDiscountSpan(SpannableStringBuilder spannableStringBuilder, String str, PriceDTO priceDTO, Context context) {
        int discountTextAppearanceResId = PriceDTOKt.getTextAppearance(priceDTO).getDiscountTextAppearanceResId();
        Integer parseColor = StyleParser.INSTANCE.parseColor(context, priceDTO.getDiscountColor());
        applyStyledTextSpan(spannableStringBuilder, str, CommonPriceUtilsKt.configure(getDiscountPaint(), Integer.valueOf(discountTextAppearanceResId), Integer.valueOf(parseColor != null ? parseColor.intValue() : ThemeExtKt.themeColor(context, StyleKt.getPriceStyleThemed(priceDTO.getPriceStyle().getStyleType()).getDiscountColorAttr())), context));
    }

    private final void applySpaceSpan(SpannableStringBuilder spannableStringBuilder, int i11) {
        spannableStringBuilder.append("\u200b");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.setSpan(new SpaceSpan(i11), length - 1, length, 33);
    }

    private final void applyStyledTextSpan(SpannableStringBuilder spannableStringBuilder, String str, Paint paint) {
        spannableStringBuilder.append((CharSequence) str);
        int length = spannableStringBuilder.length() - str.length();
        spannableStringBuilder.setSpan(new AppearanceSpan(paint), length, str.length() + length, 33);
    }

    private final CharSequence buildDiscountText(PriceDTO priceDTO) {
        String discount = priceDTO.getDiscount();
        if (discount == null) {
            return "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        applySpaceSpan(spannableStringBuilder, UiExtKt.toPx(PriceDTOKt.getPricePreset(priceDTO).getContentGap()));
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        applyDiscountSpan(spannableStringBuilder, discount, priceDTO, context);
        return spannableStringBuilder;
    }

    private final Paint getDiscountPaint() {
        return (Paint) this.discountPaint.getValue();
    }

    public final void setContent(@NotNull PriceDTO data) {
        Intrinsics.checkNotNullParameter(data, "data");
        if (data.getDiscount() != null) {
            setText(buildDiscountText(data), TextView.BufferType.SPANNABLE);
        }
        if (UniGlobalConfig.INSTANCE.getTestTagsAsContentDescription()) {
            setContentDescription(data.getDiscount());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiscountView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.discountPaint = k.a(n.NONE, DiscountView$discountPaint$2.INSTANCE);
        setIncludeFontPadding(false);
        setSingleLine(true);
    }
}
