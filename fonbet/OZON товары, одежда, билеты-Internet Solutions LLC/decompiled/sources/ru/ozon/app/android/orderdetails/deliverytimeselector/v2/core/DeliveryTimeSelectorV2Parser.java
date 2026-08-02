package ru.ozon.app.android.orderdetails.deliverytimeselector.v2.core;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.common.cellList.v2.data.CellListV2DTO;
import ru.ozon.app.android.orderdetails.deliverytimeselector.v2.data.DeliveryDatesDTO;
import ru.ozon.app.android.orderdetails.deliverytimeselector.v2.data.DeliveryTimeSelectorV2DTO;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u000022\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0001j\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003`\u0005B\u0015\b\u0007\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\r2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0003H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0012\u001a\u00020\u0011*\b\u0012\u0004\u0012\u00020\u00100\u0003H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J,\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0018\u0010\b\u001a\u00060\u0006j\u0002`\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/orderdetails/deliverytimeselector/v2/core/DeliveryTimeSelectorV2Parser;", "Lkotlin/Function2;", "", "", "", "Lru/ozon/app/android/composer/widgets/base/WidgetParser;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "<init>", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;)V", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "cellList", "Lru/ozon/app/android/common/cellList/v2/data/CellListV2DTO;", "createCellListV2", "(Ljava/util/List;)Lru/ozon/app/android/common/cellList/v2/data/CellListV2DTO;", "Lru/ozon/app/android/orderdetails/deliverytimeselector/v2/data/DeliveryTimeSelectorV2DTO$DeliveryDateDTO;", "Lru/ozon/app/android/orderdetails/deliverytimeselector/v2/data/DeliveryDatesDTO;", "toDeliveryDatesDTO", "(Ljava/util/List;)Lru/ozon/app/android/orderdetails/deliverytimeselector/v2/data/DeliveryDatesDTO;", "params", "state", "invoke", "(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DeliveryTimeSelectorV2Parser implements Function2<String, String, List<? extends Object>> {

    @NotNull
    private final JsonParser jsonDeserializer;

    public DeliveryTimeSelectorV2Parser(@NotNull JsonParser jsonDeserializer) {
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        this.jsonDeserializer = jsonDeserializer;
    }

    private final CellListV2DTO createCellListV2(List<CellDTO> cellList) {
        List list;
        CornerRadius cornerRadius = CornerRadius.RADIUS_500;
        String token = UniColors.BG_SECONDARY.getToken();
        String token2 = UniColors.LAYER_FLOOR_2.getToken();
        CommonCellSettings.LayoutPadding layoutPadding = CommonCellSettings.LayoutPadding.PADDING_400;
        Boolean bool = Boolean.FALSE;
        if (cellList != null) {
            List<CellDTO> list2 = cellList;
            list = new ArrayList(C7714v.z(list2, 10));
            for (CellDTO cellDTO : list2) {
                CellDTO.Settings settings = cellDTO.getSettings();
                list.add(CellDTO.copy$default(cellDTO, null, settings != null ? CellDTO.Settings.copy$default(settings, null, null, null, null, null, null, null, null, null, Boolean.TRUE, null, 1535, null) : null, null, null, null, 29, null));
            }
        } else {
            list = K.f71697a;
        }
        return new CellListV2DTO(cornerRadius, null, null, token, token2, null, null, layoutPadding, null, null, null, null, false, bool, null, list, 22534, null);
    }

    private final DeliveryDatesDTO toDeliveryDatesDTO(List<DeliveryTimeSelectorV2DTO.DeliveryDateDTO> list) {
        return new DeliveryDatesDTO(list);
    }

    @Override // kotlin.jvm.functions.Function2
    public List<Object> invoke(String params, String state) {
        DeliveryDatesDTO deliveryDatesDTO;
        if (state == null) {
            return K.f71697a;
        }
        DeliveryTimeSelectorV2DTO deliveryTimeSelectorV2DTO = (DeliveryTimeSelectorV2DTO) this.jsonDeserializer.fromJson(state, DeliveryTimeSelectorV2DTO.class);
        ArrayList arrayList = new ArrayList();
        List<DeliveryTimeSelectorV2DTO.DeliveryDateDTO> deliveryDates = deliveryTimeSelectorV2DTO.getDeliveryDates();
        if (deliveryDates != null && (deliveryDatesDTO = toDeliveryDatesDTO(deliveryDates)) != null) {
            arrayList.add(deliveryDatesDTO);
        }
        arrayList.add(createCellListV2(deliveryTimeSelectorV2DTO.getTimeSlots()));
        arrayList.add(deliveryTimeSelectorV2DTO.getButton());
        return arrayList;
    }
}
