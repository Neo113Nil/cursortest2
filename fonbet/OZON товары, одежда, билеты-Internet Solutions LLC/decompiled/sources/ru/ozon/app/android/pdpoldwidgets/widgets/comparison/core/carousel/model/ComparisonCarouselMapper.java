package ru.ozon.app.android.pdpoldwidgets.widgets.comparison.core.carousel.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdpoldwidgets.widgets.comparison.core.carousel.model.ComparisonCarouselVO;
import ru.ozon.app.android.pdpoldwidgets.widgets.comparison.data.ComparisonDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.v3.mappers.TextMapperKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u0004\u0018\u00010\n*\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000f\u001a\u00020\u000e*\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J&\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/carousel/model/ComparisonCarouselMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/data/ComparisonDTO;", "Ll20/d;", "", "Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/carousel/model/ComparisonCarouselVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "", "Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/carousel/model/ComparisonCarouselVO$CarouselVO$Button;", "toButtonVO", "(Ljava/lang/Object;)Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/carousel/model/ComparisonCarouselVO$CarouselVO$Button;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "toIconButtonV3DTO", "(Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;)Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "dto", "widgetInfo", "invoke", "(Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/data/ComparisonDTO;Ll20/d;)Ljava/util/List;", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ComparisonCarouselMapper implements Function2<ComparisonDTO, d, List<? extends ComparisonCarouselVO>> {
    private final ComparisonCarouselVO.CarouselVO.Button toButtonVO(Object obj) {
        if (obj instanceof ButtonV3Atom.AddToCartAtom.AddToCartButton) {
            return new ComparisonCarouselVO.CarouselVO.Button.AddToCartButton((ButtonV3Atom.AddToCartAtom.AddToCartButton) obj);
        }
        if (!(obj instanceof ComparisonDTO.ComparisonProductsDTO.SmallButtonsDTO)) {
            return null;
        }
        ComparisonDTO.ComparisonProductsDTO.SmallButtonsDTO smallButtonsDTO = (ComparisonDTO.ComparisonProductsDTO.SmallButtonsDTO) obj;
        ButtonV3Atom.SmallButton smallButton = smallButtonsDTO.getSmallButton();
        ComparisonDTO.ComparisonProductsDTO.SmallButtonsDTO.NotifyButton notifyButton = smallButtonsDTO.getNotifyButton();
        return new ComparisonCarouselVO.CarouselVO.Button.SmallButtons(smallButton, notifyButton != null ? new ComparisonCarouselVO.CarouselVO.Button.SmallButtons.NotifyButton(notifyButton.isSubscribed(), notifyButton.getSubscribeButton(), notifyButton.getUnsubscribeButton()) : null);
    }

    private final IconButtonV3DTO toIconButtonV3DTO(ButtonV3Atom.SmallIconButton smallIconButton) {
        ButtonV3DTO.StyleTypes styleTypes = ButtonV3DTO.StyleTypes.CUSTOM;
        IconButtonV3DTO.IconButtonShape iconButtonShape = IconButtonV3DTO.IconButtonShape.SHAPE_SQUARE;
        String icon = smallIconButton.getIcon();
        String tintColor = smallIconButton.getTintColor();
        if (tintColor == null) {
            tintColor = UniColors.TEXT_PRIMARY.getToken();
        }
        return new IconButtonV3DTO(IconButtonV3DTO.Sizes.SIZE_300, styleTypes, iconButtonShape, icon, null, tintColor, UniColors.LAYER_FLOOR_1.getToken(), new CommonControlSettings(smallIconButton.getAction(), smallIconButton.getTrackingInfo(), smallIconButton.getTestInfo()), Boolean.TRUE, null, null, null, null, null, 15888, null);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<ComparisonCarouselVO> invoke(@NotNull ComparisonDTO dto, @NotNull d widgetInfo) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        AtomActionDTO productActionOnSwipe = dto.getProducts().getProductActionOnSwipe();
        List<ComparisonDTO.ComparisonProductsDTO.CarouselDTO> carousels = dto.getProducts().getCarousels();
        ArrayList arrayList2 = new ArrayList(C7714v.z(carousels, 10));
        Iterator<T> it = carousels.iterator();
        while (true) {
            arrayList = null;
            ComparisonCarouselVO.CarouselVO.ProductViewType.EmptyProductVO emptyProductVO = null;
            if (!it.hasNext()) {
                break;
            }
            ComparisonDTO.ComparisonProductsDTO.CarouselDTO carouselDTO = (ComparisonDTO.ComparisonProductsDTO.CarouselDTO) it.next();
            int selectedIndex = carouselDTO.getSelectedIndex();
            ComparisonDTO.ComparisonProductsDTO.EmptyProductDTO emptyProduct = carouselDTO.getEmptyProduct();
            if (emptyProduct != null) {
                emptyProductVO = new ComparisonCarouselVO.CarouselVO.ProductViewType.EmptyProductVO(emptyProduct.getImage(), emptyProduct.getButton());
            }
            arrayList2.add(new ComparisonCarouselVO.CarouselVO.Index(selectedIndex, emptyProductVO));
        }
        List<ComparisonDTO.ComparisonProductsDTO.ComparedProductDTO> products = dto.getProducts().getProducts();
        if (products != null) {
            List<ComparisonDTO.ComparisonProductsDTO.ComparedProductDTO> list = products;
            arrayList = new ArrayList(C7714v.z(list, 10));
            for (ComparisonDTO.ComparisonProductsDTO.ComparedProductDTO comparedProductDTO : list) {
                arrayList.add(new ComparisonCarouselVO.CarouselVO.ProductViewType.ComparedProduct(comparedProductDTO.getSkuString(), comparedProductDTO.getImage(), comparedProductDTO.getTitle().getMaxLines() == null ? TextMapperKt.dsTextAtom$default(comparedProductDTO.getTitle(), null, null, null, null, null, null, null, null, null, 3, null, false, 3583, null) : TextMapperKt.getDsTextAtom(comparedProductDTO.getTitle()), comparedProductDTO.getPrice(), comparedProductDTO.getBadge(), comparedProductDTO.getFavoriteButton(), toIconButtonV3DTO(comparedProductDTO.getRemoveButton()), toButtonVO(comparedProductDTO.getButton()), comparedProductDTO.getPageInfo(), comparedProductDTO.getDeeplink()));
            }
        }
        return C7714v.a0(new ComparisonCarouselVO(hashCode, new ComparisonCarouselVO.CarouselVO(productActionOnSwipe, arrayList2, arrayList)));
    }
}
