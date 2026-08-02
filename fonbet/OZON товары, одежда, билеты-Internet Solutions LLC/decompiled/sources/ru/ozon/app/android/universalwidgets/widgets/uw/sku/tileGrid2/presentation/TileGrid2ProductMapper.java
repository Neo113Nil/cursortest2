package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.offline.PdpOfflineScreenWidgetsDataModel;
import ru.ozon.app.android.product.tileContentItems.vo.TileContentItem;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.data.TileGrid2VO;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.views.galleryswipeview.data.TileGrid2GalleryModel;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryV2DTO;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0018\u0010\b\u001a\u0004\u0018\u00010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002J\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/TileGrid2ProductMapper;", "", "<init>", "()V", "mapToPdp", "Lru/ozon/app/android/offline/PdpOfflineScreenWidgetsDataModel;", ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_FIELD_NAME, "Lru/ozon/app/android/product/tiles/tilegrid2/presentation/data/TileGrid2VO;", "mapPrice", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "productElements", "", "Lru/ozon/app/android/product/tileContentItems/vo/TileContentItem;", "mapTitle", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TileGrid2ProductMapper {
    private final PriceDTO mapPrice(List<? extends TileContentItem> productElements) {
        Object obj;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : productElements) {
            if (obj2 instanceof TileContentItem.Atom) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList(C7714v.z(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((TileContentItem.Atom) it.next()).getAtom());
        }
        Iterator it2 = arrayList2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            if (((AtomDTO) obj) instanceof PriceDTO) {
                break;
            }
        }
        if (obj instanceof PriceDTO) {
            return (PriceDTO) obj;
        }
        return null;
    }

    private final OzonSpannableString mapTitle(List<? extends TileContentItem> productElements) {
        Object obj;
        Object obj2;
        OzonSpannableString text;
        ArrayList arrayList = new ArrayList();
        for (Object obj3 : productElements) {
            if (obj3 instanceof TileContentItem.Atom) {
                arrayList.add(obj3);
            }
        }
        ArrayList arrayList2 = new ArrayList(C7714v.z(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((TileContentItem.Atom) it.next()).getAtom());
        }
        ListIterator listIterator = arrayList2.listIterator(arrayList2.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            if (((AtomDTO) obj) instanceof TextDTO) {
                break;
            }
        }
        TextDTO textDTO = obj instanceof TextDTO ? (TextDTO) obj : null;
        if (textDTO != null && (text = textDTO.getText()) != null) {
            return text;
        }
        ListIterator listIterator2 = arrayList2.listIterator(arrayList2.size());
        while (true) {
            if (!listIterator2.hasPrevious()) {
                obj2 = null;
                break;
            }
            obj2 = listIterator2.previous();
            if (((AtomDTO) obj2) instanceof TextAtom) {
                break;
            }
        }
        TextAtom textAtom = obj2 instanceof TextAtom ? (TextAtom) obj2 : null;
        if (textAtom != null) {
            return textAtom.getText();
        }
        return null;
    }

    @NotNull
    public final PdpOfflineScreenWidgetsDataModel mapToPdp(@NotNull TileGrid2VO product) {
        TileGrid2GalleryModel.Image image;
        Intrinsics.checkNotNullParameter(product, "product");
        TileGrid2GalleryModel.GalleryItem galleryItem = (TileGrid2GalleryModel.GalleryItem) C7714v.Q(0, product.getGalleryModel().getAdultImagesModel().getImageItems());
        return new PdpOfflineScreenWidgetsDataModel.Base((galleryItem == null || (image = galleryItem.getImage()) == null) ? null : image.getUrl(), mapPrice(product.getContentElements()), mapTitle(product.getContentElements()));
    }
}
