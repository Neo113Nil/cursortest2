package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilegrid3.data.mapper;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.offline.PdpOfflineScreenWidgetsDataModel;
import ru.ozon.app.android.product.tileContentItems.vo.TileContentItem;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryV2DTO;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.smalltile.presentation.vo.SmallTileMoleculeVO;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u001a\u0010\b\u001a\u0004\u0018\u00010\t2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH\u0002J\u001a\u0010\r\u001a\u0004\u0018\u00010\u000e2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH\u0002¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilegrid3/data/mapper/TilesOpenPdpOfflineProductMapper;", "", "<init>", "()V", "mapToPdp", "Lru/ozon/app/android/offline/PdpOfflineScreenWidgetsDataModel;", ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_FIELD_NAME, "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/vo/SmallTileMoleculeVO;", "mapPrice", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "productElements", "", "Lru/ozon/app/android/product/tileContentItems/vo/TileContentItem;", "mapTitle", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TilesOpenPdpOfflineProductMapper {
    private final PriceDTO mapPrice(List<? extends TileContentItem> productElements) {
        AtomDTO atomDTO;
        Object obj;
        if (productElements != null) {
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
            atomDTO = (AtomDTO) obj;
        } else {
            atomDTO = null;
        }
        if (atomDTO instanceof PriceDTO) {
            return (PriceDTO) atomDTO;
        }
        return null;
    }

    private final OzonSpannableString mapTitle(List<? extends TileContentItem> productElements) {
        if (productElements != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : productElements) {
                if (obj instanceof TileContentItem.Atom) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                AtomDTO atom = ((TileContentItem.Atom) it.next()).getAtom();
                TextDTO textDTO = atom instanceof TextDTO ? (TextDTO) atom : null;
                if (textDTO != null) {
                    arrayList2.add(textDTO);
                }
            }
            TextDTO textDTO2 = (TextDTO) C7714v.Z(arrayList2);
            if (textDTO2 != null) {
                return textDTO2.getText();
            }
        }
        return null;
    }

    @NotNull
    public final PdpOfflineScreenWidgetsDataModel mapToPdp(@NotNull SmallTileMoleculeVO product) {
        Intrinsics.checkNotNullParameter(product, "product");
        return new PdpOfflineScreenWidgetsDataModel.Base(product.getImageComponent().getImageModel().getImage().getUrl(), mapPrice(product.getStateInfo()), mapTitle(product.getStateInfo()));
    }
}
