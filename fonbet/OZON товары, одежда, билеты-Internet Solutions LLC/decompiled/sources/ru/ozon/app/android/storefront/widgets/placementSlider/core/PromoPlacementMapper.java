package ru.ozon.app.android.storefront.widgets.placementSlider.core;

import WZ.x;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductContainerDTO;
import ru.ozon.app.android.storefront.widgets.placementSlider.data.BannerDTO;
import ru.ozon.app.android.storefront.widgets.placementSlider.data.PromoPlacementDTO;
import ru.ozon.app.android.storefront.widgets.placementSlider.presentation.BannerVO;
import ru.ozon.app.android.storefront.widgets.placementSlider.presentation.PromoPlacementVO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\f\u001a\u00020\u000b*\u00020\t2\u0006\u0010\n\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\f\u0010\rJ&\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/storefront/widgets/placementSlider/core/PromoPlacementMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/storefront/widgets/placementSlider/data/PromoPlacementDTO;", "Ll20/d;", "", "Lru/ozon/app/android/storefront/widgets/placementSlider/presentation/PromoPlacementVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/storefront/widgets/placementSlider/data/BannerDTO;", "widgetInfo", "Lru/ozon/app/android/storefront/widgets/placementSlider/presentation/BannerVO;", "toVO", "(Lru/ozon/app/android/storefront/widgets/placementSlider/data/BannerDTO;Ll20/d;)Lru/ozon/app/android/storefront/widgets/placementSlider/presentation/BannerVO;", "state", "invoke", "(Lru/ozon/app/android/storefront/widgets/placementSlider/data/PromoPlacementDTO;Ll20/d;)Ljava/util/List;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PromoPlacementMapper implements Function2<PromoPlacementDTO, d, List<? extends PromoPlacementVO>> {
    private final BannerVO toVO(BannerDTO bannerDTO, d dVar) {
        long hashCode = (dVar.d() + ProductContainerDTO.RATIO_DELIMITER + bannerDTO.getImageURL()).hashCode();
        String lightBackgroundColor = bannerDTO.getLightBackgroundColor();
        String darkBackgroundColor = bannerDTO.getDarkBackgroundColor();
        TextDTO title = bannerDTO.getTitle();
        TextDTO subtitle = bannerDTO.getSubtitle();
        BadgeDTO actionBadge = bannerDTO.getActionBadge();
        String imageURL = bannerDTO.getImageURL();
        AtomActionDTO action = bannerDTO.getAction();
        AtomAction atomAction = action != null ? AtomActionMapperKt.toAtomAction(action, bannerDTO.getTrackingInfo()) : null;
        AtomActionDTO viewAction = bannerDTO.getViewAction();
        AtomAction atomAction2 = viewAction != null ? AtomActionMapperKt.toAtomAction(viewAction, null) : null;
        Map<String, TokenizedTrackingInfo> trackingInfo = bannerDTO.getTrackingInfo();
        return new BannerVO(hashCode, lightBackgroundColor, darkBackgroundColor, title, subtitle, actionBadge, imageURL, atomAction, atomAction2, trackingInfo != null ? x.d(trackingInfo, dVar) : null);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<PromoPlacementVO> invoke(@NotNull PromoPlacementDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        List<BannerDTO> items = state.getItems();
        ArrayList arrayList = new ArrayList();
        for (BannerDTO bannerDTO : items) {
            if (h.K(bannerDTO.getImageURL())) {
                bannerDTO = null;
            }
            BannerVO vo = bannerDTO != null ? toVO(bannerDTO, widgetInfo) : null;
            if (vo != null) {
                arrayList.add(vo);
            }
        }
        if (arrayList.isEmpty()) {
            return K.f71697a;
        }
        long hashCode = widgetInfo.d().hashCode();
        Long scrollInterval = state.getScrollInterval();
        return C7714v.a0(new PromoPlacementVO(hashCode, scrollInterval != null ? scrollInterval.longValue() : 5L, arrayList, widgetInfo));
    }
}
