package spay.sdk.data.dto.response;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import spay.sdk.domain.model.response.CardAmountData;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a\f\u0010\u0003\u001a\u00020\u0004*\u00020\u0005H\u0000¨\u0006\u0006"}, d2 = {"takeKopecksFromDouble", "", "", "toDto", "Lspay/sdk/data/dto/response/CardAmountDataDto;", "Lspay/sdk/domain/model/response/CardAmountData;", "SPaySDK_baseRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CardAmountDataDtoKt {
    private static final int takeKopecksFromDouble(String str) {
        try {
            int length = str.length();
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    i11 = -1;
                    break;
                }
                if (str.charAt(i11) == '.') {
                    break;
                }
                i11++;
            }
            if (i11 == -1) {
                str = str + "00";
            } else {
                int i12 = i11 + 1;
                String substring = str.substring(i12);
                Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                if (substring.length() >= 2) {
                    str = h.q0(i11 + 2, h.X(str, ".", "", false));
                } else {
                    String substring2 = str.substring(i12);
                    Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
                    if (substring2.length() < 2) {
                        String substring3 = str.substring(0, i11);
                        Intrinsics.checkNotNullExpressionValue(substring3, "substring(...)");
                        if (Intrinsics.d(substring3, "0")) {
                            str = "0";
                        }
                    }
                    String substring4 = str.substring(i12);
                    Intrinsics.checkNotNullExpressionValue(substring4, "substring(...)");
                    if (substring4.length() < 2) {
                        str = h.q0(i12, h.X(str, ".", "", false)) + "0";
                    }
                }
            }
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    @NotNull
    public static final CardAmountDataDto toDto(@NotNull CardAmountData cardAmountData) {
        Intrinsics.checkNotNullParameter(cardAmountData, "<this>");
        double amount = cardAmountData.getAmount() / 100;
        String currency = cardAmountData.getCurrency();
        Intrinsics.checkNotNullParameter(currency, "<this>");
        return new CardAmountDataDto(amount, Intrinsics.d(currency, "₽") ? "RUB" : "");
    }
}
