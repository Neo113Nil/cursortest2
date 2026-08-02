package ru.ozon.app.android.pdp.ui.configurators.ugc.reviewProduct.data;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.ui.configurators.ugc.reviewProduct.presentation.ReviewProductVO;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryV2DTO;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.rating.RatingAtom;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.v3.mappers.TextMapperKt;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bJ,\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000e2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0002J\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u00102\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewProduct/data/ReviewProductMapper;", "", "<init>", "()V", "dp4", "", "map", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewProduct/presentation/ReviewProductVO;", "reviewProductContainer", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewProduct/data/ReviewProductContainer;", "isTagSupportedForName", "", "mapProduct", ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_FIELD_NAME, "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewProduct/data/ReviewProductDTO;", "badges", "", "Lru/ozon/uni/atoms/data/AtomDTO;", "mapToBadgesVO", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewProduct/presentation/ReviewProductVO$BadgeVO;", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ReviewProductMapper {
    private final int dp4 = ResourceExtKt.toPx(4);

    private final ReviewProductVO mapProduct(ReviewProductDTO product, List<? extends AtomDTO> badges, boolean isTagSupportedForName) {
        TextDTO textDTO;
        List<ReviewProductVO.BadgeVO> list;
        long id2 = product.getId();
        String coverImage = product.getCoverImage();
        TextDTO dsTextAtom$default = TextMapperKt.dsTextAtom$default(product.getName(), null, null, null, null, null, null, null, null, null, null, null, isTagSupportedForName, 2047, null);
        TextAtom createdAt = product.getCreatedAt();
        if (createdAt != null) {
            textDTO = TextMapperKt.getDsTextAtom(createdAt);
            list = null;
        } else {
            textDTO = null;
            list = null;
        }
        RatingAtom rating = product.getRating();
        List<ReviewProductVO.BadgeVO> list2 = list;
        ButtonV3Atom.SmallButton button = product.getButton();
        List<ReviewProductVO.BadgeVO> list3 = list2;
        String deeplink = product.getDeeplink();
        if (badges != null) {
            list3 = mapToBadgesVO(badges);
        }
        CornerRadius cornerRadius = product.getCornerRadius();
        if (cornerRadius == null) {
            cornerRadius = CornerRadius.RADIUS_300;
        }
        return new ReviewProductVO(id2, coverImage, dsTextAtom$default, textDTO, rating, button, deeplink, list3, cornerRadius);
    }

    private final List<ReviewProductVO.BadgeVO> mapToBadgesVO(List<? extends AtomDTO> badges) {
        List<? extends AtomDTO> list = badges;
        ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
        int i11 = 0;
        for (Object obj : list) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            arrayList.add(new ReviewProductVO.BadgeVO(i11 == 0 ? 0 : this.dp4, i11 == C7714v.P(badges) ? 0 : this.dp4, (AtomDTO) obj));
            i11 = i12;
        }
        return arrayList;
    }

    @NotNull
    public final ReviewProductVO map(@NotNull ReviewProductContainer reviewProductContainer, boolean isTagSupportedForName) {
        Intrinsics.checkNotNullParameter(reviewProductContainer, "reviewProductContainer");
        ReviewProductDTO product = reviewProductContainer.getProduct();
        List<? extends AtomDTO> infoBadges = reviewProductContainer.getInfoBadges();
        if (infoBadges == null) {
            infoBadges = reviewProductContainer.getBadges();
        }
        return mapProduct(product, infoBadges, isTagSupportedForName);
    }
}
