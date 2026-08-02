package ru.ozon.app.android.geo.addressEditDetailV2.mapper;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.checkoutgeo.checkout.views.checkoutCellList.CheckoutCellListDTO;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.geo.addressEditDetailV2.data.AddressEditDetailV2DTO;
import ru.ozon.app.android.geo.addressEditDetailV2.presentation.AddressEditDetailV2DynamicElementVO;
import ru.ozon.app.android.geo.addressEditDetailV2.presentation.AddressEditDetailV2VO;
import ru.ozon.app.android.geo.options.data.Options;
import ru.ozon.app.android.geo.options.presentation.MappersKt;
import ru.ozon.app.android.yandexsearchsheet.YandexSearchSheetFragment;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0004\"\u0004\b\u0000\u0010\t*\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ&\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/geo/addressEditDetailV2/mapper/AddressEditDetailV2Mapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/geo/addressEditDetailV2/data/AddressEditDetailV2DTO;", "Ll20/d;", "", "Lru/ozon/app/android/geo/addressEditDetailV2/presentation/AddressEditDetailV2VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "E", "Lru/ozon/app/android/geo/addressEditDetailV2/presentation/AddressEditDetailV2DynamicElementVO;", "toVo", "(Ljava/util/List;)Ljava/util/List;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/geo/addressEditDetailV2/data/AddressEditDetailV2DTO;Ll20/d;)Ljava/util/List;", "", "stateId", "toVO", "(Lru/ozon/app/android/geo/addressEditDetailV2/data/AddressEditDetailV2DTO;Ljava/lang/String;)Lru/ozon/app/android/geo/addressEditDetailV2/presentation/AddressEditDetailV2VO;", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AddressEditDetailV2Mapper implements Function2<AddressEditDetailV2DTO, d, List<? extends AddressEditDetailV2VO>> {
    private final <E> List<AddressEditDetailV2DynamicElementVO> toVo(List<? extends E> list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            AddressEditDetailV2DynamicElementVO button = obj instanceof ButtonV3DTO ? new AddressEditDetailV2DynamicElementVO.Button((ButtonV3DTO) obj) : obj instanceof CheckoutCellListDTO ? new AddressEditDetailV2DynamicElementVO.CheckoutCellList((CheckoutCellListDTO) obj) : null;
            if (button != null) {
                arrayList.add(button);
            }
        }
        return arrayList;
    }

    @NotNull
    public final AddressEditDetailV2VO toVO(@NotNull AddressEditDetailV2DTO addressEditDetailV2DTO, @NotNull String stateId) {
        Intrinsics.checkNotNullParameter(addressEditDetailV2DTO, "<this>");
        Intrinsics.checkNotNullParameter(stateId, "stateId");
        long hashCode = stateId.hashCode();
        List<Object> address = addressEditDetailV2DTO.getAddress();
        List<AddressEditDetailV2DynamicElementVO> vo = address != null ? toVo(address) : null;
        Options openSearchOptions = addressEditDetailV2DTO.getOpenSearchOptions();
        YandexSearchSheetFragment.Data yandexSearchFragmentData = openSearchOptions != null ? MappersKt.toYandexSearchFragmentData(openSearchOptions) : null;
        Map<String, TokenizedTrackingInfo> trackingInfo = addressEditDetailV2DTO.getTrackingInfo();
        return new AddressEditDetailV2VO(hashCode, vo, yandexSearchFragmentData, trackingInfo != null ? TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<AddressEditDetailV2VO> invoke(@NotNull AddressEditDetailV2DTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(toVO(state, widgetInfo.d()));
    }
}
