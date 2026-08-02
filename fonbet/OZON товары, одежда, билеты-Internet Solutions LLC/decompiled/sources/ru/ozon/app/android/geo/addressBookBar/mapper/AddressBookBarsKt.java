package ru.ozon.app.android.geo.addressBookBar.mapper;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.checkoutgeo.address.common.addressCell.AddressCell;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.geo.addressBookBar.data.AddressBookBarDTO;
import ru.ozon.app.android.geo.addressBookBar.presentation.common.AddressBookBarVO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0005"}, d2 = {"toVO", "Lru/ozon/app/android/geo/addressBookBar/presentation/common/AddressBookBarVO;", "Lru/ozon/app/android/geo/addressBookBar/data/AddressBookBarDTO;", "stateId", "", "geo_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AddressBookBarsKt {
    @NotNull
    public static final AddressBookBarVO toVO(@NotNull AddressBookBarDTO addressBookBarDTO, @NotNull String stateId) {
        CellAtom.CellRegular24IconPicker cellRegular24IconPicker;
        AtomActionDTO action;
        AtomAction atomAction;
        AtomAction atomAction2;
        Intrinsics.checkNotNullParameter(addressBookBarDTO, "<this>");
        Intrinsics.checkNotNullParameter(stateId, "stateId");
        long hashCode = stateId.hashCode();
        Object cell = addressBookBarDTO.getAddressCell().getCell();
        if (cell instanceof AddressCell.RightLeftTitlesCell24Icon) {
            AddressCell.RightLeftTitlesCell24Icon rightLeftTitlesCell24Icon = (AddressCell.RightLeftTitlesCell24Icon) cell;
            AtomActionDTO action2 = rightLeftTitlesCell24Icon.getAction();
            if (action2 != null) {
                atomAction = AtomActionMapperKt.toAtomAction(action2, rightLeftTitlesCell24Icon.getTrackingInfo());
                atomAction2 = atomAction;
            }
            atomAction2 = null;
        } else {
            if ((cell instanceof CellAtom.CellRegular24IconPicker) && (action = (cellRegular24IconPicker = (CellAtom.CellRegular24IconPicker) cell).getAction()) != null) {
                atomAction = AtomActionMapperKt.toAtomAction(action, cellRegular24IconPicker.getTrackingInfo());
                atomAction2 = atomAction;
            }
            atomAction2 = null;
        }
        Boolean showSeparator = addressBookBarDTO.getShowSeparator();
        boolean booleanValue = showSeparator != null ? showSeparator.booleanValue() : false;
        AddressCell addressCell = addressBookBarDTO.getAddressCell();
        Map<String, TokenizedTrackingInfo> trackingInfo = addressBookBarDTO.getTrackingInfo();
        return new AddressBookBarVO(hashCode, booleanValue, addressCell, atomAction2, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null);
    }
}
