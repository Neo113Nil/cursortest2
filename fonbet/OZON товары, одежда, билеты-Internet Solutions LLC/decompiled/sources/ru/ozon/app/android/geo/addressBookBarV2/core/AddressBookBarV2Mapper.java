package ru.ozon.app.android.geo.addressBookBarV2.core;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutgeo.address.addressUiInfoService.AddressUiInfoViewModel;
import ru.ozon.app.android.checkoutgeo.address.common.addressCell.AddressCell;
import ru.ozon.app.android.geo.addressBookBarV2.data.AddressBookBarV2DTO;
import ru.ozon.app.android.geo.addressBookBarV2.presentation.AddressBookBarV2VO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ&\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0011\u001a\u0004\u0018\u00010\u0005*\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/geo/addressBookBarV2/core/AddressBookBarV2Mapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/geo/addressBookBarV2/data/AddressBookBarV2DTO;", "Ll20/d;", "", "Lru/ozon/app/android/geo/addressBookBarV2/presentation/AddressBookBarV2VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Lru/ozon/app/android/checkoutgeo/address/addressUiInfoService/AddressUiInfoViewModel;", "addressUiInfoViewModel", "<init>", "(Lru/ozon/app/android/checkoutgeo/address/addressUiInfoService/AddressUiInfoViewModel;)V", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/geo/addressBookBarV2/data/AddressBookBarV2DTO;Ll20/d;)Ljava/util/List;", "", "stateId", "toVO", "(Lru/ozon/app/android/geo/addressBookBarV2/data/AddressBookBarV2DTO;Ljava/lang/String;)Lru/ozon/app/android/geo/addressBookBarV2/presentation/AddressBookBarV2VO;", "Lru/ozon/app/android/checkoutgeo/address/addressUiInfoService/AddressUiInfoViewModel;", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AddressBookBarV2Mapper implements Function2<AddressBookBarV2DTO, d, List<? extends AddressBookBarV2VO>> {

    @NotNull
    private final AddressUiInfoViewModel addressUiInfoViewModel;

    public AddressBookBarV2Mapper(@NotNull AddressUiInfoViewModel addressUiInfoViewModel) {
        Intrinsics.checkNotNullParameter(addressUiInfoViewModel, "addressUiInfoViewModel");
        this.addressUiInfoViewModel = addressUiInfoViewModel;
    }

    public final AddressBookBarV2VO toVO(@NotNull AddressBookBarV2DTO addressBookBarV2DTO, @NotNull String stateId) {
        Intrinsics.checkNotNullParameter(addressBookBarV2DTO, "<this>");
        Intrinsics.checkNotNullParameter(stateId, "stateId");
        long hashCode = stateId.hashCode();
        Object cell = addressBookBarV2DTO.getAddressCell().getCell();
        AddressCell.RightLeftTitlesCell24Icon rightLeftTitlesCell24Icon = cell instanceof AddressCell.RightLeftTitlesCell24Icon ? (AddressCell.RightLeftTitlesCell24Icon) cell : null;
        if (rightLeftTitlesCell24Icon == null) {
            return null;
        }
        AtomActionDTO action = rightLeftTitlesCell24Icon.getAction();
        AtomAction atomAction = action != null ? AtomActionMapperKt.toAtomAction(action, rightLeftTitlesCell24Icon.getTrackingInfo()) : null;
        String backgroundColor = addressBookBarV2DTO.getBackgroundColor();
        Boolean isEmbedded = addressBookBarV2DTO.isEmbedded();
        return new AddressBookBarV2VO(hashCode, false, rightLeftTitlesCell24Icon, isEmbedded != null ? isEmbedded.booleanValue() : false, backgroundColor, atomAction, addressBookBarV2DTO.getAddressCell().getUpdateSettings(), addressBookBarV2DTO.getGeoAction());
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<AddressBookBarV2VO> invoke(@NotNull AddressBookBarV2DTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        this.addressUiInfoViewModel.setAddressCellV2(state.getAddressCell());
        AddressBookBarV2VO vo = toVO(state, widgetInfo.d());
        List<AddressBookBarV2VO> a02 = vo != null ? C7714v.a0(vo) : null;
        return a02 == null ? K.f71697a : a02;
    }
}
