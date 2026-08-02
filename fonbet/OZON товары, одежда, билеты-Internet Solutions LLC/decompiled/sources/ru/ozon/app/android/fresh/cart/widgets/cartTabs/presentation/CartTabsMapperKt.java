package ru.ozon.app.android.fresh.cart.widgets.cartTabs.presentation;

import WZ.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.fresh.cart.widgets.cartTabs.data.CartTabsDTO;
import ru.ozon.app.android.fresh.cart.widgets.cartTabs.presentation.CartTabsVO;
import ru.ozon.uni.atoms.data.aspect.AspectDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.indicator.IndicatorDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\n\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001b\u0010\u0005\u001a\u00020\n*\u00020\u00072\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0005\u0010\u000b\u001a\u0013\u0010\u0005\u001a\u00020\r*\u00020\fH\u0002¢\u0006\u0004\b\u0005\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/fresh/cart/widgets/cartTabs/data/CartTabsDTO;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "Lru/ozon/app/android/fresh/cart/widgets/cartTabs/presentation/CartTabsVO;", "toVO", "(Lru/ozon/app/android/fresh/cart/widgets/cartTabs/data/CartTabsDTO;Ll20/d;)Lru/ozon/app/android/fresh/cart/widgets/cartTabs/presentation/CartTabsVO;", "Lru/ozon/app/android/fresh/cart/widgets/cartTabs/data/CartTabsDTO$CartTabItem;", "", "widgetId", "Lru/ozon/app/android/fresh/cart/widgets/cartTabs/presentation/CartTabsVO$CartTabItem;", "(Lru/ozon/app/android/fresh/cart/widgets/cartTabs/data/CartTabsDTO$CartTabItem;J)Lru/ozon/app/android/fresh/cart/widgets/cartTabs/presentation/CartTabsVO$CartTabItem;", "Lru/ozon/app/android/fresh/cart/widgets/cartTabs/data/CartTabsDTO$Spacers;", "Lru/ozon/app/android/fresh/cart/widgets/cartTabs/presentation/CartTabsVO$Spacers;", "(Lru/ozon/app/android/fresh/cart/widgets/cartTabs/data/CartTabsDTO$Spacers;)Lru/ozon/app/android/fresh/cart/widgets/cartTabs/presentation/CartTabsVO$Spacers;", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CartTabsMapperKt {
    @NotNull
    public static final CartTabsVO toVO(@NotNull CartTabsDTO cartTabsDTO, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(cartTabsDTO, "<this>");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        List<CartTabsDTO.CartTabItem> items = cartTabsDTO.getItems();
        ArrayList arrayList = new ArrayList(C7714v.z(items, 10));
        Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(toVO((CartTabsDTO.CartTabItem) it.next(), hashCode));
        }
        CartTabsDTO.Spacers spacers = cartTabsDTO.getSpacers();
        if (spacers == null) {
            spacers = new CartTabsDTO.Spacers(null, null, null, null, 15, null);
        }
        CartTabsVO.Spacers vo = toVO(spacers);
        Map<String, TokenizedTrackingInfo> trackingInfo = cartTabsDTO.getTrackingInfo();
        t mapToTokenizedEvent$default = trackingInfo != null ? TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null;
        Iterator<CartTabsDTO.CartTabItem> it2 = cartTabsDTO.getItems().iterator();
        int i11 = 0;
        while (true) {
            if (!it2.hasNext()) {
                i11 = -1;
                break;
            }
            if (it2.next().getWrapper().getState() == AspectDTO.AspectState.SELECTED) {
                break;
            }
            i11++;
        }
        return new CartTabsVO(hashCode, arrayList, vo, mapToTokenizedEvent$default, i11);
    }

    private static final CartTabsVO.CartTabItem toVO(CartTabsDTO.CartTabItem cartTabItem, long j11) {
        Map<String, TokenizedTrackingInfo> trackingInfo;
        AspectDTO wrapper = cartTabItem.getWrapper();
        TextDTO title = cartTabItem.getTitle();
        IndicatorDTO indicator = cartTabItem.getIndicator();
        float m1867getDpD9Ej5fM = cartTabItem.getAspectPadding().m1867getDpD9Ej5fM();
        CommonControlSettings common = cartTabItem.getWrapper().getCommon();
        t tVar = null;
        if (common != null && (trackingInfo = common.getTrackingInfo()) != null) {
            tVar = TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null);
        }
        return new CartTabsVO.CartTabItem(wrapper, title, indicator, m1867getDpD9Ej5fM, tVar, null);
    }

    private static final CartTabsVO.Spacers toVO(CartTabsDTO.Spacers spacers) {
        return new CartTabsVO.Spacers(spacers.getTop().m1867getDpD9Ej5fM(), spacers.getBottom().m1867getDpD9Ej5fM(), spacers.getLeft().m1867getDpD9Ej5fM(), spacers.getRight().m1867getDpD9Ej5fM(), null);
    }
}
