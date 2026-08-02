package ru.ozon.app.android.pdp.widgets.priceBlock.priceV2.presentation.price;

import B0.C2454a;
import Lh.a;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.ui.configurators.pdp.price.PriceV2VO$TypedPrice;
import ru.ozon.app.android.pdp.utils.CornersConfig;
import ru.ozon.app.android.pdp.widgets.priceBlock.priceV2.presentation.PriceV2VOWrapper;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0081\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b\"\u0010\u0012R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/presentation/price/PriceV2MainPriceVO;", "Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/presentation/PriceV2VOWrapper;", "", "id", "Lru/ozon/app/android/pdp/utils/CornersConfig;", "backgroundCornersConfig", "Lru/ozon/app/android/pdp/ui/configurators/pdp/price/PriceV2VO$TypedPrice;", "price", "", "bottomPadding", "LWZ/t;", "event", "<init>", "(JLru/ozon/app/android/pdp/utils/CornersConfig;Lru/ozon/app/android/pdp/ui/configurators/pdp/price/PriceV2VO$TypedPrice;ILWZ/t;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/pdp/utils/CornersConfig;", "getBackgroundCornersConfig", "()Lru/ozon/app/android/pdp/utils/CornersConfig;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/price/PriceV2VO$TypedPrice;", "getPrice", "()Lru/ozon/app/android/pdp/ui/configurators/pdp/price/PriceV2VO$TypedPrice;", "I", "getBottomPadding", "LWZ/t;", "getEvent", "()LWZ/t;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class PriceV2MainPriceVO implements PriceV2VOWrapper {

    @NotNull
    private final CornersConfig backgroundCornersConfig;
    private final int bottomPadding;
    private final t event;
    private final long id;

    @NotNull
    private final PriceV2VO$TypedPrice price;

    public PriceV2MainPriceVO(long j11, @NotNull CornersConfig backgroundCornersConfig, @NotNull PriceV2VO$TypedPrice price, int i11, t tVar) {
        Intrinsics.checkNotNullParameter(backgroundCornersConfig, "backgroundCornersConfig");
        Intrinsics.checkNotNullParameter(price, "price");
        this.id = j11;
        this.backgroundCornersConfig = backgroundCornersConfig;
        this.price = price;
        this.bottomPadding = i11;
        this.event = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PriceV2MainPriceVO)) {
            return false;
        }
        PriceV2MainPriceVO priceV2MainPriceVO = (PriceV2MainPriceVO) other;
        return this.id == priceV2MainPriceVO.id && this.backgroundCornersConfig == priceV2MainPriceVO.backgroundCornersConfig && Intrinsics.d(this.price, priceV2MainPriceVO.price) && this.bottomPadding == priceV2MainPriceVO.bottomPadding && Intrinsics.d(this.event, priceV2MainPriceVO.event);
    }

    @NotNull
    public CornersConfig getBackgroundCornersConfig() {
        return this.backgroundCornersConfig;
    }

    public final int getBottomPadding() {
        return this.bottomPadding;
    }

    public final t getEvent() {
        return this.event;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final PriceV2VO$TypedPrice getPrice() {
        return this.price;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return PriceV2VOWrapper.DefaultImpls.getScrollWidgetKey(this);
    }

    @Override // l20.c
    public int getViewItemKey() {
        return PriceV2VOWrapper.DefaultImpls.getViewItemKey(this);
    }

    public int hashCode() {
        int a11 = C2454a.a(this.bottomPadding, (this.price.hashCode() + ((this.backgroundCornersConfig.hashCode() + (Long.hashCode(this.id) * 31)) * 31)) * 31, 31);
        t tVar = this.event;
        return a11 + (tVar == null ? 0 : tVar.hashCode());
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        CornersConfig cornersConfig = this.backgroundCornersConfig;
        PriceV2VO$TypedPrice priceV2VO$TypedPrice = this.price;
        int i11 = this.bottomPadding;
        t tVar = this.event;
        StringBuilder sb2 = new StringBuilder("PriceV2MainPriceVO(id=");
        sb2.append(j11);
        sb2.append(", backgroundCornersConfig=");
        sb2.append(cornersConfig);
        sb2.append(", price=");
        sb2.append(priceV2VO$TypedPrice);
        sb2.append(", bottomPadding=");
        sb2.append(i11);
        return a.b(sb2, ", event=", tVar, ")");
    }
}
