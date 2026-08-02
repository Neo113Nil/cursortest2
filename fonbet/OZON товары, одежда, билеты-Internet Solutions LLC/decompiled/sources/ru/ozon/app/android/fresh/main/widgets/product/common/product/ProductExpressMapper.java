package ru.ozon.app.android.fresh.main.widgets.product.common.product;

import WZ.t;
import android.os.Parcelable;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMoleculeV2;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMoleculeV2ExtKt;
import ru.ozon.app.android.fresh.main.widgets.product.common.product.ProductContainerDTO;
import ru.ozon.app.android.fresh.main.widgets.product.common.product.ProductVO;
import ru.ozon.app.android.product.imagesswipeview.AdultImageView;
import ru.ozon.app.android.product.imagesswipeview.Paranja;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.badge.Badge;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 $2\u00020\u0001:\u0001$B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J3\u0010\u000e\u001a\u00020\r2\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00042\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0004*\b\u0012\u0004\u0012\u00020\u00140\u0004H\u0002¢\u0006\u0004\b\u0015\u0010\u0006J\u001f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0004*\b\u0012\u0004\u0012\u00020\u00160\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\u0006J\u0015\u0010\u0018\u001a\u00020\t*\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J7\u0010\"\u001a\u0004\u0018\u00010!2\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u000b2\n\u0010\u001f\u001a\u00060\u001dj\u0002`\u001e2\b\b\u0002\u0010 \u001a\u00020\t¢\u0006\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/product/common/product/ProductExpressMapper;", "", "<init>", "()V", "", "modifyTopRightButtons", "(Ljava/util/List;)Ljava/util/List;", "", "imageUrls", "", FavoriteProductMolecule.IS_ADULT_PARAMS_NAME, "Lru/ozon/app/android/fresh/main/widgets/product/common/product/ProductContainerDTO$Options;", "options", "Lru/ozon/app/android/product/imagesswipeview/AdultImageView$Image;", "getImages", "(Ljava/util/List;Ljava/lang/Boolean;Lru/ozon/app/android/fresh/main/widgets/product/common/product/ProductContainerDTO$Options;)Lru/ozon/app/android/product/imagesswipeview/AdultImageView$Image;", "itemsAreFaded", "Lru/ozon/app/android/product/imagesswipeview/Paranja;", "setParanjaType", "(Ljava/lang/Boolean;)Lru/ozon/app/android/product/imagesswipeview/Paranja;", "Lru/ozon/app/android/fresh/main/widgets/product/common/product/ImageBadge;", "filterByValidPositions", "Lru/ozon/uni/atoms/data/AtomDTO;", "mutateStateAction", "computeIsAdultFlag", "(Ljava/lang/Boolean;)Z", "Lru/ozon/app/android/fresh/main/widgets/product/common/product/ProductDTO;", "dto", "containerOptions", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "isLast", "Lru/ozon/app/android/fresh/main/widgets/product/common/product/ProductVO;", "productDtoToVo", "(Lru/ozon/app/android/fresh/main/widgets/product/common/product/ProductDTO;Lru/ozon/app/android/fresh/main/widgets/product/common/product/ProductContainerDTO$Options;Ll20/d;Z)Lru/ozon/app/android/fresh/main/widgets/product/common/product/ProductVO;", "Companion", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ProductExpressMapper {

    @NotNull
    private static final Set<String> validPositions;

    static {
        String[] elements = {"top", "bottom", "left", "right"};
        Intrinsics.checkNotNullParameter(elements, "elements");
        validPositions = C7705l.j0(elements);
    }

    private final boolean computeIsAdultFlag(Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private final List<ImageBadge> filterByValidPositions(List<ImageBadge> list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            ImageBadge imageBadge = (ImageBadge) obj;
            Set<String> set = validPositions;
            if (set.contains(imageBadge.getPosition().getX()) && set.contains(imageBadge.getPosition().getY())) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    private final AdultImageView.Image getImages(List<String> imageUrls, Boolean isAdult, ProductContainerDTO.Options options) {
        String str;
        if (imageUrls == null || (str = (String) C7714v.K(imageUrls)) == null) {
            str = "";
        }
        return new AdultImageView.Image(str, AdultImageView.Image.HeightMode.Unspecified.INSTANCE, 1.0f, options != null && options.getImageGrey(), computeIsAdultFlag(isAdult), false, null, setParanjaType(options != null ? Boolean.valueOf(options.getItemsAreFaded()) : null), ImageView.ScaleType.FIT_CENTER, false, null, false, 3616, null);
    }

    private final List<Object> modifyTopRightButtons(List<? extends Object> list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof FavoriteProductMoleculeV2) {
                obj = FavoriteProductMoleculeV2ExtKt.mapToV1$default((FavoriteProductMoleculeV2) obj, false, 1, null);
            }
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    private final List<AtomDTO> mutateStateAction(List<? extends AtomDTO> list) {
        List<? extends AtomDTO> list2 = list;
        ArrayList arrayList = new ArrayList(C7714v.z(list2, 10));
        for (Parcelable parcelable : list2) {
            if (parcelable instanceof Badge) {
                Badge badge = (Badge) parcelable;
                if (badge.getAction() == null) {
                    parcelable = Badge.copy$default(badge, null, null, null, null, null, new AtomActionDTO(AtomActionDTO.Behavior.CUSTOM, null, "badgeActionId", null, 10, null), null, null, null, null, null, null, null, 8159, null);
                }
            }
            arrayList.add(parcelable);
        }
        return arrayList;
    }

    public static /* synthetic */ ProductVO productDtoToVo$default(ProductExpressMapper productExpressMapper, ProductDTO productDTO, ProductContainerDTO.Options options, d dVar, boolean z11, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            z11 = true;
        }
        return productExpressMapper.productDtoToVo(productDTO, options, dVar, z11);
    }

    private final Paranja setParanjaType(Boolean itemsAreFaded) {
        return Intrinsics.d(itemsAreFaded, Boolean.TRUE) ? Paranja.PARANJA_BOTH_THEMES : Paranja.PARANJA_DISABLED_WHITE_BACKGROUND;
    }

    public final ProductVO productDtoToVo(@NotNull ProductDTO dto, ProductContainerDTO.Options containerOptions, @NotNull d widgetInfo, boolean isLast) {
        AdultImageView.Image image;
        List<Object> list;
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        t tVar = null;
        if (dto.isAdult() == null) {
            return null;
        }
        List<AtomDTO> state = dto.getState();
        long hashCode = state != null ? state.hashCode() : dto.hashCode();
        ProductVO.Type fromString = ProductVO.Type.INSTANCE.fromString(widgetInfo.c().b());
        long skuId = dto.getSkuId();
        AdultImageView.Image images = getImages(dto.getImages(), Boolean.valueOf(computeIsAdultFlag(dto.isAdult())), containerOptions);
        List<ImageBadge> imageBadges = dto.getImageBadges();
        List<ImageBadge> filterByValidPositions = imageBadges != null ? filterByValidPositions(imageBadges) : null;
        boolean computeIsAdultFlag = computeIsAdultFlag(dto.isAdult());
        Boolean isFavorite = dto.isFavorite();
        AtomActionDTO atomActionDTO = new AtomActionDTO(AtomActionDTO.Behavior.REDIRECT, dto.getLink(), null, null, 12, null);
        List<AtomDTO> state2 = dto.getState();
        List<AtomDTO> mutateStateAction = state2 != null ? mutateStateAction(state2) : null;
        AtomDTO button = dto.getButton();
        AtomDTO secondaryButton = dto.getSecondaryButton();
        Map<String, TokenizedTrackingInfo> trackingInfo = dto.getTrackingInfo();
        Map<String, TokenizedTrackingInfo> trackingInfo2 = dto.getTrackingInfo();
        if (trackingInfo2 != null) {
            image = images;
            tVar = TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo2, Long.valueOf(hashCode), null, 2, null);
        } else {
            image = images;
        }
        t tVar2 = tVar;
        List<Object> topRightButtons = dto.getTopRightButtons();
        if (topRightButtons == null || (list = modifyTopRightButtons(topRightButtons)) == null) {
            list = K.f71697a;
        }
        return new ProductVO(hashCode, fromString, skuId, image, filterByValidPositions, computeIsAdultFlag, false, isFavorite, atomActionDTO, mutateStateAction, button, secondaryButton, trackingInfo, tVar2, containerOptions, isLast, list, 64, null);
    }
}
