package ru.ozon.app.android.pdp.widgets.priceBlock.priceActions.presentation;

import java.util.Objects;
import kotlin.Metadata;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.pdp.widgets.priceBlock.priceActions.presentation.PriceActionsVO;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0018\u0010\u0003\u001a\u00020\u0004*\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"ITEM_SPACING_IN_BETWEEN_PX", "", "ITEM_SPACING_FROM_EDGES_PX", "id", "", "Lru/ozon/app/android/pdp/widgets/priceBlock/priceActions/presentation/PriceActionsVO$Action;", "getId", "(Lru/ozon/app/android/pdp/widgets/priceBlock/priceActions/presentation/PriceActionsVO$Action;)J", "pdp_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PriceActionsViewHolderKt {
    private static final int ITEM_SPACING_FROM_EDGES_PX;
    private static final int ITEM_SPACING_IN_BETWEEN_PX;

    static {
        Dimens dimens = Dimens.INSTANCE;
        ITEM_SPACING_IN_BETWEEN_PX = dimens.getDP_8();
        ITEM_SPACING_FROM_EDGES_PX = dimens.getDP_16();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long getId(PriceActionsVO.Action action) {
        return Objects.hash(action.getText(), action.getIcon());
    }
}
