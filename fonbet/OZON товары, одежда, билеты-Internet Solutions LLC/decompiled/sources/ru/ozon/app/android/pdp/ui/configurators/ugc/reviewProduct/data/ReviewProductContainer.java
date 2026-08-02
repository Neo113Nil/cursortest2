package ru.ozon.app.android.pdp.ui.configurators.ugc.reviewProduct.data;

import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryV2DTO;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\n¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewProduct/data/ReviewProductContainer;", "", ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_FIELD_NAME, "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewProduct/data/ReviewProductDTO;", "getProduct", "()Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewProduct/data/ReviewProductDTO;", "infoBadges", "", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getInfoBadges", "()Ljava/util/List;", "badges", "Lru/ozon/uni/atoms/data/badge/Badge;", "getBadges", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface ReviewProductContainer {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static List<Badge> getBadges(@NotNull ReviewProductContainer reviewProductContainer) {
            return null;
        }
    }

    List<Badge> getBadges();

    List<BadgeDTO> getInfoBadges();

    @NotNull
    ReviewProductDTO getProduct();
}
