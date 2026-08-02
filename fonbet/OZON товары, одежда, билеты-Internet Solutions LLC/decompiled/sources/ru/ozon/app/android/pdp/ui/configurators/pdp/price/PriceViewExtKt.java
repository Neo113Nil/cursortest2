package ru.ozon.app.android.pdp.ui.configurators.pdp.price;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aD\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\bH\u0000¨\u0006\f"}, d2 = {"bind", "", "Lru/ozon/app/android/pdp/ui/configurators/pdp/price/PriceView;", "finalPrice", "Lru/ozon/app/android/pdp/ui/configurators/pdp/price/StyledText;", "originalPrice", "finalPriceDescription", "strikethroughColor", "", "icon", "Lru/ozon/uni/atoms/data/button/Icon;", "finalPriceLocator", "configurators_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PriceViewExtKt {
    public static final void bind(@NotNull PriceView priceView, @NotNull StyledText finalPrice, StyledText styledText, StyledText styledText2, String str, Icon icon, @NotNull String finalPriceLocator) {
        Integer styleRes;
        Integer styleRes2;
        Intrinsics.checkNotNullParameter(priceView, "<this>");
        Intrinsics.checkNotNullParameter(finalPrice, "finalPrice");
        Intrinsics.checkNotNullParameter(finalPriceLocator, "finalPriceLocator");
        int resId = styledText == null ? UniColors.TEXT_PRIMARY.getResId() : UniColors.BG_ACCENT_PRIMARY.getResId();
        CharSequence text = finalPrice.getText();
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = priceView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        priceView.setPrice(text, styleParser.parseColor(context, finalPrice.getColor(), resId), finalPriceLocator);
        CharSequence text2 = styledText != null ? styledText.getText() : null;
        Context context2 = priceView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int parseColor = styleParser.parseColor(context2, styledText != null ? styledText.getColor() : null, UniColors.TEXT_PRIMARY.getResId());
        Context context3 = priceView.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        priceView.setOriginalPrice(text2, parseColor, styleParser.parseColor(context3, str, resId), icon);
        CharSequence text3 = styledText2 != null ? styledText2.getText() : null;
        Context context4 = priceView.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        priceView.setPriceDescription(text3, styleParser.parseColor(context4, styledText2 != null ? styledText2.getColor() : null, UniColors.GRAPHIC_SECONDARY_ON_DARK.getResId()));
        int i11 = R$style.TextStyle_Body_M;
        Integer styleRes3 = finalPrice.getStyleRes();
        int intValue = styleRes3 != null ? styleRes3.intValue() : i11;
        int intValue2 = (styledText == null || (styleRes2 = styledText.getStyleRes()) == null) ? i11 : styleRes2.intValue();
        if (styledText2 != null && (styleRes = styledText2.getStyleRes()) != null) {
            i11 = styleRes.intValue();
        }
        priceView.applyStyles(intValue, i11, intValue2);
    }
}
