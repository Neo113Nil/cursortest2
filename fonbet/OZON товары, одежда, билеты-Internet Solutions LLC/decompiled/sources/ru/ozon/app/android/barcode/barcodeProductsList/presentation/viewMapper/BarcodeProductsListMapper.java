package ru.ozon.app.android.barcode.barcodeProductsList.presentation.viewMapper;

import B0.C2454a;
import Lh.b;
import WZ.x;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.barcode.barcodeProductsList.data.BarcodeProductsListDTO;
import ru.ozon.app.android.barcode.barcodeProductsList.data.CountTextDisplayType;
import ru.ozon.app.android.barcode.barcodeProductsList.data.ItemDTO;
import ru.ozon.app.android.barcode.barcodeProductsList.data.VerticalPaddingDTO;
import ru.ozon.app.android.barcode.barcodeProductsList.presentation.viewItem.BarcodeProductsListVI;
import ru.ozon.app.android.barcode.barcodeProductsList.presentation.viewItem.Item;
import ru.ozon.app.android.barcode.barcodeProductsList.presentation.viewItem.ProductListItem;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\n\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\t\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000f\u001a\u00020\f*\u00020\f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J1\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004*\b\u0012\u0004\u0012\u00020\u00110\u00042\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J&\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/barcode/barcodeProductsList/presentation/viewMapper/BarcodeProductsListMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/barcode/barcodeProductsList/data/BarcodeProductsListDTO;", "Ll20/d;", "", "Lru/ozon/app/android/barcode/barcodeProductsList/presentation/viewItem/BarcodeProductsListVI;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "widgetInfo", "toVI", "(Lru/ozon/app/android/barcode/barcodeProductsList/data/BarcodeProductsListDTO;Ll20/d;)Lru/ozon/app/android/barcode/barcodeProductsList/presentation/viewItem/BarcodeProductsListVI;", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "", "stateId", "withIdInActionParams", "(Lru/ozon/uni/atoms/data/dsCell/CellDTO;Ljava/lang/String;)Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "Lru/ozon/app/android/barcode/barcodeProductsList/data/ItemDTO;", "backgroundColor", "Lru/ozon/app/android/barcode/barcodeProductsList/presentation/viewItem/Item;", "mapToVI", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;", "state", "invoke", "(Lru/ozon/app/android/barcode/barcodeProductsList/data/BarcodeProductsListDTO;Ll20/d;)Ljava/util/List;", "barcode_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BarcodeProductsListMapper implements Function2<BarcodeProductsListDTO, d, List<? extends BarcodeProductsListVI>> {
    private final List<Item> mapToVI(List<ItemDTO> list, String str, String str2) {
        List<PriceDTO.Component> price;
        ProductListItem.Status nearTitle;
        List<ItemDTO> list2 = list;
        ArrayList arrayList = new ArrayList(C7714v.z(list2, 10));
        int i11 = 0;
        for (Object obj : list2) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            ItemDTO itemDTO = (ItemDTO) obj;
            long a11 = b.a(i11, str, "-");
            Tc.b builder = C7714v.B();
            if (itemDTO.getStatus().getCountDisplay() == CountTextDisplayType.ContainerRight) {
                TextDTO title = itemDTO.getStatus().getTitle();
                PriceDTO price2 = itemDTO.getStatus().getPrice();
                price = price2 != null ? price2.getPrice() : null;
                nearTitle = new ProductListItem.Status.ContainerRight((str + "-" + i11 + "-" + title + "-" + price).hashCode(), itemDTO.getStatus().getTitle(), itemDTO.getStatus().getCount(), itemDTO.getStatus().getPrice());
            } else {
                TextDTO title2 = itemDTO.getStatus().getTitle();
                PriceDTO price3 = itemDTO.getStatus().getPrice();
                price = price3 != null ? price3.getPrice() : null;
                nearTitle = new ProductListItem.Status.NearTitle((str + "-" + i11 + "-" + title2 + "-" + price).hashCode(), itemDTO.getStatus().getTitle(), itemDTO.getStatus().getCount(), itemDTO.getStatus().getPrice());
            }
            builder.add(nearTitle);
            builder.addAll(BarcodeProductsListMapperKt.mapToVI(itemDTO.getProducts(), str + "-" + i11));
            ButtonV3DTO button = itemDTO.getButton();
            if (button != null) {
                String title3 = itemDTO.getButton().getTitle();
                builder.add(new ProductListItem.Button((str + "-" + title3).hashCode(), BarcodeProductsListMapperKt.withIdInActionParams(button, String.valueOf(a11))));
            }
            Unit unit = Unit.f71690a;
            Intrinsics.checkNotNullParameter(builder, "builder");
            arrayList.add(new Item(a11, builder.B(), str2 == null ? UniColors.LAYER_FLOOR_1.getToken() : str2, false, 8, null));
            i11 = i12;
        }
        return arrayList;
    }

    private final BarcodeProductsListVI toVI(BarcodeProductsListDTO barcodeProductsListDTO, d dVar) {
        long hashCode = dVar.d().hashCode();
        CellDTO withIdInActionParams = withIdInActionParams(barcodeProductsListDTO.getHeader(), dVar.d());
        List<Item> mapToVI = mapToVI(barcodeProductsListDTO.getItems(), dVar.d(), barcodeProductsListDTO.getBackgroundColor());
        VerticalPaddingDTO verticalPadding = barcodeProductsListDTO.getVerticalPadding();
        Map<String, TokenizedTrackingInfo> trackingInfo = barcodeProductsListDTO.getTrackingInfo();
        TestInfo testInfo = barcodeProductsListDTO.getTestInfo();
        Map<String, TokenizedTrackingInfo> trackingInfo2 = barcodeProductsListDTO.getTrackingInfo();
        return new BarcodeProductsListVI(hashCode, withIdInActionParams, mapToVI, verticalPadding, trackingInfo, testInfo, true, trackingInfo2 != null ? x.d(trackingInfo2, dVar) : null);
    }

    private final CellDTO withIdInActionParams(CellDTO cellDTO, String str) {
        AtomActionDTO action;
        CommonControlSettings common = cellDTO.getCommon();
        CommonControlSettings commonControlSettings = null;
        r1 = null;
        AtomActionDTO atomActionDTO = null;
        if (common != null) {
            CommonControlSettings common2 = cellDTO.getCommon();
            if (common2 != null && (action = common2.getAction()) != null) {
                atomActionDTO = AtomActionDTO.copy$default(action, null, null, null, C2454a.b("id", str), null, 23, null);
            }
            commonControlSettings = CommonControlSettings.copy$default(common, atomActionDTO, null, null, 6, null);
        }
        return CellDTO.copy$default(cellDTO, null, null, null, null, commonControlSettings, 15, null);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<BarcodeProductsListVI> invoke(@NotNull BarcodeProductsListDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(toVI(state, widgetInfo));
    }
}
