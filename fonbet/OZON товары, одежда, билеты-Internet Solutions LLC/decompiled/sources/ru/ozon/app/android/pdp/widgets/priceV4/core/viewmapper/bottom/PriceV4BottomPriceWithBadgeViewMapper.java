package ru.ozon.app.android.pdp.widgets.priceV4.core.viewmapper.bottom;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.widgets.priceV4.data.PriceV4DtoWrapper$Bottom;
import ru.ozon.app.android.pdp.widgets.priceV4.presentation.vo.PriceV4BottomViewConfiguration;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lru/ozon/app/android/pdp/widgets/priceV4/core/viewmapper/bottom/PriceV4BottomPriceWithBadgeViewMapper;", "Lru/ozon/app/android/pdp/widgets/priceV4/core/viewmapper/bottom/BasePriceV4BottomViewMapper;", "<init>", "()V", "viewConfiguration", "Lru/ozon/app/android/pdp/widgets/priceV4/presentation/vo/PriceV4BottomViewConfiguration;", "getViewConfiguration", "()Lru/ozon/app/android/pdp/widgets/priceV4/presentation/vo/PriceV4BottomViewConfiguration;", "canMap", "", "state", "", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PriceV4BottomPriceWithBadgeViewMapper extends BasePriceV4BottomViewMapper {

    @NotNull
    private final PriceV4BottomViewConfiguration viewConfiguration = PriceV4BottomViewConfiguration.PRICE_ATOM_AND_BADGE;

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        if (!(state instanceof PriceV4DtoWrapper$Bottom)) {
            return false;
        }
        PriceV4DtoWrapper$Bottom priceV4DtoWrapper$Bottom = (PriceV4DtoWrapper$Bottom) state;
        return (priceV4DtoWrapper$Bottom.getPrice() == null || priceV4DtoWrapper$Bottom.getBottomFinBadge() == null) ? false : true;
    }

    @Override // ru.ozon.app.android.pdp.widgets.priceV4.core.viewmapper.bottom.BasePriceV4BottomViewMapper
    @NotNull
    public PriceV4BottomViewConfiguration getViewConfiguration() {
        return this.viewConfiguration;
    }
}
