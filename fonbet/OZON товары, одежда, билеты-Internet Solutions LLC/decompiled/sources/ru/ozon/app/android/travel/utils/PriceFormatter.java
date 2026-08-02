package ru.ozon.app.android.travel.utils;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ3\u0010\u000e\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/travel/utils/PriceFormatter;", "", "<init>", "()V", "format", "", "price", "", "currencySign", "", "separator", "showCurrency", "", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/CharSequence;", "formatF", "", "(Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/CharSequence;", "utils_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PriceFormatter {
    public static /* synthetic */ CharSequence format$default(PriceFormatter priceFormatter, Integer num, String str, String str2, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = "₽";
        }
        if ((i11 & 4) != 0) {
            str2 = "\u2009";
        }
        if ((i11 & 8) != 0) {
            z11 = true;
        }
        return priceFormatter.format(num, str, str2, z11);
    }

    public static /* synthetic */ CharSequence formatF$default(PriceFormatter priceFormatter, Float f7, String str, String str2, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = "₽";
        }
        if ((i11 & 4) != 0) {
            str2 = "\u2009";
        }
        if ((i11 & 8) != 0) {
            z11 = true;
        }
        return priceFormatter.formatF(f7, str, str2, z11);
    }

    @NotNull
    public final CharSequence format(Integer price, @NotNull String currencySign, @NotNull String separator, boolean showCurrency) {
        Intrinsics.checkNotNullParameter(currencySign, "currencySign");
        Intrinsics.checkNotNullParameter(separator, "separator");
        if (price == null) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        boolean z11 = price.intValue() < 0;
        int i11 = 0;
        do {
            if (i11 == 3) {
                sb2.append(separator);
                i11 = 0;
            } else {
                sb2.append(Math.abs(price.intValue() % 10));
                price = Integer.valueOf(price.intValue() / 10);
                i11++;
            }
        } while (price.intValue() != 0);
        if (z11) {
            sb2.append("-");
        }
        StringBuilder reverse = sb2.reverse();
        if (showCurrency) {
            reverse.append(separator);
            reverse.append(currencySign);
        }
        Intrinsics.f(reverse);
        return reverse;
    }

    @NotNull
    public final CharSequence formatF(Float price, @NotNull String currencySign, @NotNull String separator, boolean showCurrency) {
        Intrinsics.checkNotNullParameter(currencySign, "currencySign");
        Intrinsics.checkNotNullParameter(separator, "separator");
        if (price == null) {
            return "";
        }
        float floatValue = price.floatValue() % 1;
        StringBuilder sb2 = new StringBuilder(format(Integer.valueOf((int) price.floatValue()), currencySign, separator, showCurrency));
        if (floatValue > 0.0f) {
            String format = String.format("%.2f", Arrays.copyOf(new Object[]{price}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            sb2.append(format);
        }
        return sb2;
    }
}
