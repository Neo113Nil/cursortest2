package ru.ozon.uni.android.uikit.view.atoms.price;

import Sc.InterfaceC3999a;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.TextAppearanceSpan;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@InterfaceC3999a
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0001\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f¨\u0006\r"}, d2 = {"Lru/ozon/uni/android/uikit/view/atoms/price/PriceTextGenerator;", "", "<init>", "()V", "getSpannablePrice", "Landroid/text/SpannableString;", "price", "", "priceSubtitle", "textColor", "", "textAppearanceSpan", "Landroid/text/style/TextAppearanceSpan;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PriceTextGenerator {

    @NotNull
    public static final PriceTextGenerator INSTANCE = new PriceTextGenerator();

    private PriceTextGenerator() {
    }

    @NotNull
    public final SpannableString getSpannablePrice(CharSequence price, CharSequence priceSubtitle, int textColor, @NotNull TextAppearanceSpan textAppearanceSpan) {
        String str;
        Intrinsics.checkNotNullParameter(textAppearanceSpan, "textAppearanceSpan");
        if (price == null || priceSubtitle == null) {
            if (price == null || (str = price.toString()) == null) {
                str = "";
            }
            return new SpannableString(str);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((Object) price);
        sb2.append((Object) priceSubtitle);
        SpannableString spannableString = new SpannableString(sb2.toString());
        int length = priceSubtitle.length() + price.length();
        spannableString.setSpan(textAppearanceSpan, price.length(), length, 33);
        spannableString.setSpan(new ForegroundColorSpan(textColor), price.length(), length, 33);
        return spannableString;
    }
}
