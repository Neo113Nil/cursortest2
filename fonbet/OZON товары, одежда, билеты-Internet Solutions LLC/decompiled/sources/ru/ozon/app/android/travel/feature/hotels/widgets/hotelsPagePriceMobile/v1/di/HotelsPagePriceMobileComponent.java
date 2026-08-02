package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPagePriceMobile.v1.di;

import Sc.InterfaceC4008j;
import Sc.k;
import hi.InterfaceC6958a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPagePriceMobile.v1.data.HotelsPagePriceMobilePriceMapper;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004R\u001b\u0010\n\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPagePriceMobile/v1/di/HotelsPagePriceMobileComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "<init>", "()V", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPagePriceMobile/v1/data/HotelsPagePriceMobilePriceMapper;", "hotelsPagePriceMobilePriceMapper$delegate", "LSc/j;", "getHotelsPagePriceMobilePriceMapper", "()Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPagePriceMobile/v1/data/HotelsPagePriceMobilePriceMapper;", "hotelsPagePriceMobilePriceMapper", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class HotelsPagePriceMobileComponent implements InterfaceC6958a {

    /* renamed from: hotelsPagePriceMobilePriceMapper$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j hotelsPagePriceMobilePriceMapper = k.b(HotelsPagePriceMobileComponent$hotelsPagePriceMobilePriceMapper$2.INSTANCE);

    @NotNull
    public final HotelsPagePriceMobilePriceMapper getHotelsPagePriceMobilePriceMapper() {
        return (HotelsPagePriceMobilePriceMapper) this.hotelsPagePriceMobilePriceMapper.getValue();
    }
}
