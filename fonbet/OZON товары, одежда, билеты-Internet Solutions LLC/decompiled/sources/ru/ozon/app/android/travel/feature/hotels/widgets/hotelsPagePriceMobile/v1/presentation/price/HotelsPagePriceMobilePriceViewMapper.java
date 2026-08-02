package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPagePriceMobile.v1.presentation.price;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPagePriceMobile.v1.data.HotelsPagePriceMobileDTO;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPagePriceMobile.v1.di.HotelsPagePriceMobileComponent;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPagePriceMobile.v1.view.HotelsPagePriceMobileView;
import ru.ozon.composer.ui.widget.g;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u00162\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!¨\u0006\""}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPagePriceMobile/v1/presentation/price/HotelsPagePriceMobilePriceViewMapper;", "Lru/ozon/composer/ui/widget/g;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPagePriceMobile/v1/data/HotelsPagePriceMobileDTO;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPagePriceMobile/v1/presentation/price/HotelsPagePriceMobilePriceVI;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPagePriceMobile/v1/di/HotelsPagePriceMobileComponent;", "component", "<init>", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPagePriceMobile/v1/di/HotelsPagePriceMobileComponent;)V", "Ll10/i;", "container", "Landroid/view/View;", "view", "Lru/ozon/composer/ui/widget/k;", "createHolder", "(Ll10/i;Landroid/view/View;)Lru/ozon/composer/ui/widget/k;", "Landroid/view/ViewGroup;", "parent", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "state", "Ll20/d;", "info", "", "map", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPagePriceMobile/v1/data/HotelsPagePriceMobileDTO;Ll20/d;)Ljava/util/List;", "", "", "canMap", "(Ljava/lang/Object;)Z", "oldItem", "newItem", "getPayload", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPagePriceMobile/v1/presentation/price/HotelsPagePriceMobilePriceVI;Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPagePriceMobile/v1/presentation/price/HotelsPagePriceMobilePriceVI;)Ljava/lang/Object;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPagePriceMobile/v1/di/HotelsPagePriceMobileComponent;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsPagePriceMobilePriceViewMapper extends g<HotelsPagePriceMobileDTO, HotelsPagePriceMobilePriceVI> {

    @NotNull
    private final HotelsPagePriceMobileComponent component;

    public HotelsPagePriceMobilePriceViewMapper(@NotNull HotelsPagePriceMobileComponent component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.component = component;
    }

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        if (!(state instanceof HotelsPagePriceMobileDTO)) {
            return false;
        }
        HotelsPagePriceMobileDTO hotelsPagePriceMobileDTO = (HotelsPagePriceMobileDTO) state;
        return (hotelsPagePriceMobileDTO.getPrice() == null || hotelsPagePriceMobileDTO.isSkeleton()) ? false : true;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    /* renamed from: createHolder */
    public k<HotelsPagePriceMobilePriceVI> createHolder2(@NotNull i container, @NotNull View view) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(view, "view");
        return new HotelsPagePriceMobilePriceWidgetViewHolder((HotelsPagePriceMobileView) view, container.X(), container);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        HotelsPagePriceMobileView hotelsPagePriceMobileView = new HotelsPagePriceMobileView(context);
        hotelsPagePriceMobileView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return hotelsPagePriceMobileView;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Object getPayload(@NotNull HotelsPagePriceMobilePriceVI oldItem, @NotNull HotelsPagePriceMobilePriceVI newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        HotelsPagePriceMobilePricePayload hotelsPagePriceMobilePricePayload = new HotelsPagePriceMobilePricePayload();
        if (!Intrinsics.d(oldItem.getPrice(), newItem.getPrice())) {
            hotelsPagePriceMobilePricePayload.setPriceChanged();
        }
        if (!Intrinsics.d(oldItem.getWithBankBadge(), newItem.getWithBankBadge())) {
            hotelsPagePriceMobilePricePayload.setBankBadgeChanged();
        }
        if (!Intrinsics.d(oldItem.getNightsCountBadge(), newItem.getNightsCountBadge())) {
            hotelsPagePriceMobilePricePayload.setNightsCountBadgeChanged();
        }
        if (Intrinsics.d(oldItem.getStarsBadge(), newItem.getStarsBadge()) && Intrinsics.d(oldItem.getStarsDetailInfoBadge(), newItem.getStarsDetailInfoBadge())) {
            return hotelsPagePriceMobilePricePayload;
        }
        hotelsPagePriceMobilePricePayload.setStarsChanged();
        return hotelsPagePriceMobilePricePayload;
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<HotelsPagePriceMobilePriceVI> map(@NotNull HotelsPagePriceMobileDTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return this.component.getHotelsPagePriceMobilePriceMapper().invoke(state.getPrice(), info);
    }
}
