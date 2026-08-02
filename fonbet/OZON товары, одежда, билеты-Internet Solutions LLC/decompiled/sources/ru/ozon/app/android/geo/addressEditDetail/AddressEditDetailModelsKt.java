package ru.ozon.app.android.geo.addressEditDetail;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.checkoutgeo.checkout.views.checkoutCellList.CheckoutCellListDTO;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.geo.addressEditDetail.AddressEditDetailDynamicElementVO;
import ru.ozon.app.android.geo.options.data.Options;
import ru.ozon.app.android.geo.options.presentation.MappersKt;
import ru.ozon.app.android.yandexsearchsheet.YandexSearchSheetFragment;
import ru.ozon.uni.atoms.data.AtomDTO;

@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u001e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u0002H\b0\u0006H\u0002¨\u0006\t"}, d2 = {"toVO", "Lru/ozon/app/android/geo/addressEditDetail/AddressEditDetailVO;", "Lru/ozon/app/android/geo/addressEditDetail/AddressEditDetailDTO;", "stateId", "", "toVo", "", "Lru/ozon/app/android/geo/addressEditDetail/AddressEditDetailDynamicElementVO;", "E", "geo_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AddressEditDetailModelsKt {
    @NotNull
    public static final AddressEditDetailVO toVO(@NotNull AddressEditDetailDTO addressEditDetailDTO, @NotNull String stateId) {
        Intrinsics.checkNotNullParameter(addressEditDetailDTO, "<this>");
        Intrinsics.checkNotNullParameter(stateId, "stateId");
        long hashCode = stateId.hashCode();
        List<AtomDTO> address = addressEditDetailDTO.getAddress();
        List<Object> newAddress = addressEditDetailDTO.getNewAddress();
        List<AddressEditDetailDynamicElementVO> vo = newAddress != null ? toVo(newAddress) : null;
        AtomDTO buttonApp = addressEditDetailDTO.getButtonApp();
        Options openSearchOptions = addressEditDetailDTO.getOpenSearchOptions();
        YandexSearchSheetFragment.Data yandexSearchFragmentData = openSearchOptions != null ? MappersKt.toYandexSearchFragmentData(openSearchOptions) : null;
        Map<String, TokenizedTrackingInfo> trackingInfo = addressEditDetailDTO.getTrackingInfo();
        return new AddressEditDetailVO(hashCode, address, vo, buttonApp, yandexSearchFragmentData, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null);
    }

    private static final <E> List<AddressEditDetailDynamicElementVO> toVo(List<? extends E> list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            AddressEditDetailDynamicElementVO atom = obj instanceof AtomDTO ? new AddressEditDetailDynamicElementVO.Atom((AtomDTO) obj) : obj instanceof CheckoutCellListDTO ? new AddressEditDetailDynamicElementVO.CheckoutCellList((CheckoutCellListDTO) obj) : null;
            if (atom != null) {
                arrayList.add(atom);
            }
        }
        return arrayList;
    }
}
