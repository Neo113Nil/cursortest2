package ru.ozon.app.android.account.orders.common.shipmentwidget;

import Ve.C4598rp;
import android.content.Context;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.islandSeparator.data.IslandSeparatorDTO;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.account.orders.shipmentwidget.v2.data.AtomDTOHolder;
import ru.ozon.app.android.account.orders.shipmentwidget.v2.data.ButtonsDTO;
import ru.ozon.app.android.account.orders.shipmentwidget.v2.data.ProductsDTO;
import ru.ozon.app.android.account.orders.shipmentwidget.v2.data.TextIconDTO;
import ru.ozon.app.android.atoms.data.disclaimer.DisclaimerAtom;
import ru.ozon.app.android.common.cellList.v2.data.CellListV2DTO;
import ru.ozon.app.android.cscore.orderdetails.molecule.imagesCompose.data.ComposableImageDTO;
import ru.ozon.app.android.cscore.orderdetails.molecule.imagesCompose.data.ComposableImagesDTO;
import ru.ozon.app.android.cscore.padding.HorizontalPadding;
import ru.ozon.app.android.delivery.common.AppTokensProvider;
import ru.ozon.app.android.widgets.separator.SeparatorDTO;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.productMedia.ProductMediaDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002.\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003`\u0005B\u001d\b\u0007\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0014\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0012\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0003*\b\u0012\u0004\u0012\u00020\u00160\u0003H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J*\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cR\u0018\u0010\b\u001a\u00060\u0006j\u0002`\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001dR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/account/orders/common/shipmentwidget/ShipmentWidgetV2Parser;", "Lkotlin/Function2;", "", "", "", "Lru/ozon/app/android/composer/widgets/base/WidgetParser;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "Landroid/content/Context;", "context", "<init>", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;Landroid/content/Context;)V", "", "height", "Lru/ozon/app/android/widgets/separator/SeparatorDTO;", "createSeparator", "(I)Lru/ozon/app/android/widgets/separator/SeparatorDTO;", "index", "id", "addScrollWidgetId", "(Ljava/lang/Object;ILjava/lang/String;)Ljava/lang/Object;", "Lru/ozon/app/android/cscore/orderdetails/molecule/imagesCompose/data/ComposableImageDTO;", "withKeys", "(Ljava/util/List;)Ljava/util/List;", "params", "state", "invoke", "(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Landroid/content/Context;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ShipmentWidgetV2Parser implements Function2<String, String, List<? extends Object>> {

    @NotNull
    private final Context context;

    @NotNull
    private final JsonParser jsonDeserializer;

    public ShipmentWidgetV2Parser(@NotNull JsonParser jsonDeserializer, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        Intrinsics.checkNotNullParameter(context, "context");
        this.jsonDeserializer = jsonDeserializer;
        this.context = context;
    }

    private final Object addScrollWidgetId(Object obj, int i11, String str) {
        if (i11 == 0 && (obj instanceof TextIconDTO)) {
            return TextIconDTO.copy$default((TextIconDTO) obj, null, null, null, null, null, null, str != null ? Integer.valueOf(str.hashCode()) : null, null, null, 447, null);
        }
        return obj;
    }

    private final SeparatorDTO createSeparator(int height) {
        return new SeparatorDTO(null, Integer.valueOf(height), UniColors.LAYER_FLOOR_1.getToken());
    }

    private final List<ComposableImageDTO> withKeys(List<ComposableImageDTO> list) {
        ProductMediaDTO.Image image;
        String url;
        List<ComposableImageDTO> list2 = list;
        ArrayList arrayList = new ArrayList(C7714v.z(list2, 10));
        int i11 = 0;
        for (Object obj : list2) {
            int i12 = i11 + 1;
            String str = null;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            ComposableImageDTO composableImageDTO = (ComposableImageDTO) obj;
            ProductMediaDTO productMedia = composableImageDTO.getProductMedia();
            if (productMedia == null || (image = productMedia.getImage()) == null || (url = image.getUrl()) == null) {
                ImageDTO image2 = composableImageDTO.getImage();
                if (image2 != null) {
                    str = image2.getImage();
                }
            } else {
                str = url;
            }
            arrayList.add(ComposableImageDTO.copy$default(composableImageDTO, null, null, null, null, null, null, null, null, null, C4598rp.c(i11, str, "-"), 511, null));
            i11 = i12;
        }
        return arrayList;
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<Object> invoke(String params, String state) {
        AtomActionDTO action;
        JsonParser jsonParser = this.jsonDeserializer;
        Intrinsics.f(state);
        ShipmentWidgetV2DTO shipmentWidgetV2DTO = (ShipmentWidgetV2DTO) jsonParser.fromJson(state, ShipmentWidgetV2DTO.class);
        IslandSeparatorDTO islandSeparatorDTO = new IslandSeparatorDTO(Integer.valueOf(AppTokensProvider.IslandSeparatorHeight.INSTANCE.between()), UniColors.LAYER_FLOOR_0.getToken(), IslandSeparatorDTO.Configuration.BETWEEN_SECTIONS, null, null, null);
        ArrayList arrayList = new ArrayList();
        arrayList.add(islandSeparatorDTO);
        arrayList.add(createSeparator(ResourceExtKt.toDp(ResourceExtKt.dim(this.context, shipmentWidgetV2DTO.getVerticalPadding().getTop().getCellLayoutPadding()))));
        List<Object> items = shipmentWidgetV2DTO.getItems();
        ArrayList arrayList2 = new ArrayList(C7714v.z(items, 10));
        int i11 = 0;
        for (Object obj : items) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            if (obj instanceof TextIconDTO) {
                obj = addScrollWidgetId(TextIconDTO.copy$default((TextIconDTO) obj, null, null, null, null, null, shipmentWidgetV2DTO.getCommon(), null, null, shipmentWidgetV2DTO.getHorizontalPadding(), 223, null), i11, shipmentWidgetV2DTO.getShipmentId());
            } else if ((obj instanceof TextDTO) || (obj instanceof CellDTO) || (obj instanceof DisclaimerAtom)) {
                obj = new AtomDTOHolder((AtomDTO) obj, shipmentWidgetV2DTO.getCommon(), shipmentWidgetV2DTO.getHorizontalPadding());
            } else if (obj instanceof ComposableImagesDTO) {
                ComposableImagesDTO composableImagesDTO = (ComposableImagesDTO) obj;
                String shipmentId = shipmentWidgetV2DTO.getShipmentId();
                CommonControlSettings common = shipmentWidgetV2DTO.getCommon();
                if (common == null || (action = common.getAction()) == null) {
                    action = composableImagesDTO.getAction();
                }
                AtomActionDTO atomActionDTO = action;
                HorizontalPadding horizontalPadding = shipmentWidgetV2DTO.getHorizontalPadding();
                List<ComposableImageDTO> images = composableImagesDTO.getImages();
                obj = ComposableImagesDTO.copy$default(composableImagesDTO, shipmentId, images != null ? withKeys(images) : null, atomActionDTO, null, null, horizontalPadding, null, 88, null);
            } else if (obj instanceof ButtonsDTO) {
                obj = ButtonsDTO.copy$default((ButtonsDTO) obj, null, shipmentWidgetV2DTO.getHorizontalPadding(), 1, null);
            } else if (obj instanceof ProductsDTO) {
                ProductsDTO productsDTO = (ProductsDTO) obj;
                obj = ProductsDTO.copy$default(productsDTO, null, null, productsDTO.getCommon(), shipmentWidgetV2DTO.getCommon(), shipmentWidgetV2DTO.getHorizontalPadding(), 3, null);
            } else if (obj instanceof CellListV2DTO) {
                obj = r8.copy((r34 & 1) != 0 ? r8.islandCornerRadius : null, (r34 & 2) != 0 ? r8.topIslandCornerRadius : null, (r34 & 4) != 0 ? r8.bottomIslandCornerRadius : null, (r34 & 8) != 0 ? r8.islandColor : null, (r34 & 16) != 0 ? r8.backgroundColor : null, (r34 & 32) != 0 ? r8.leftMargin : CommonCellSettings.LayoutPadding.valueOf(shipmentWidgetV2DTO.getHorizontalPadding().getLeft().name()), (r34 & 64) != 0 ? r8.rightMargin : CommonCellSettings.LayoutPadding.valueOf(shipmentWidgetV2DTO.getHorizontalPadding().getRight().name()), (r34 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? r8.topMargin : null, (r34 & 256) != 0 ? r8.bottomMargin : null, (r34 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? r8.leftPadding : null, (r34 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? r8.rightPadding : null, (r34 & 2048) != 0 ? r8.trackingInfo : null, (r34 & 4096) != 0 ? r8.enableHtmlTags : false, (r34 & 8192) != 0 ? r8.enableCellsSeparators : null, (r34 & 16384) != 0 ? r8.eventActions : null, (r34 & 32768) != 0 ? ((CellListV2DTO) obj).cells : null);
            }
            arrayList2.add(obj);
            i11 = i12;
        }
        arrayList.addAll(arrayList2);
        arrayList.add(createSeparator(ResourceExtKt.toDp(ResourceExtKt.dim(this.context, shipmentWidgetV2DTO.getVerticalPadding().getBottom().getCellLayoutPadding()))));
        return arrayList;
    }
}
