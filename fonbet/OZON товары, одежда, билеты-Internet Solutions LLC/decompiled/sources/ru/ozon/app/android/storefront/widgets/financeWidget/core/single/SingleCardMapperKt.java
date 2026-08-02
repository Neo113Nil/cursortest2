package ru.ozon.app.android.storefront.widgets.financeWidget.core.single;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.widgets.financeWidget.data.FinanceWidgetDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u0000\u001a\u0014\u0010\u0002\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000¨\u0006\u0006"}, d2 = {"setMaxLinesForBalanceState", "Lru/ozon/app/android/storefront/widgets/financeWidget/data/FinanceWidgetDTO$ItemDTO$BalanceState;", "setMaxLinesForPromoState", "Lru/ozon/app/android/storefront/widgets/financeWidget/data/FinanceWidgetDTO$ItemDTO$PromoState;", "alignment", "Lru/ozon/uni/atoms/data/text/TextDTO$TextAlignment;", "storefront_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SingleCardMapperKt {
    @NotNull
    public static final FinanceWidgetDTO.ItemDTO.BalanceState setMaxLinesForBalanceState(@NotNull FinanceWidgetDTO.ItemDTO.BalanceState balanceState) {
        Intrinsics.checkNotNullParameter(balanceState, "<this>");
        return FinanceWidgetDTO.ItemDTO.BalanceState.copy$default(balanceState, TextDTO.copy$default(balanceState.getTitle(), null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, 1, 262143, null), TextDTO.copy$default(balanceState.getBalance(), null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, 1, 262143, null), null, null, null, null, 60, null);
    }

    @NotNull
    public static final FinanceWidgetDTO.ItemDTO.PromoState setMaxLinesForPromoState(@NotNull FinanceWidgetDTO.ItemDTO.PromoState promoState, @NotNull TextDTO.TextAlignment alignment) {
        Intrinsics.checkNotNullParameter(promoState, "<this>");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        return FinanceWidgetDTO.ItemDTO.PromoState.copy$default(promoState, TextDTO.copy$default(promoState.getTitle(), null, alignment, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, 2, 262141, null), null, 2, null);
    }
}
