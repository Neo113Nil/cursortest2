package ru.ozon.app.android.travel.feature.general.booking.widgets.customerContacts.v3.data;

import WZ.x;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.feature.general.booking.widgets.customerContacts.v3.presentation.CustomerContactsV3VO;
import ru.ozon.app.android.travel.molecules.dto.commonInput.v2.CommonInputV2DTO;
import ru.ozon.app.android.travel.molecules.input.v2.CommonInputV2VO;
import ru.ozon.app.android.travel.molecules.input.v2.mapper.CommonInputV2MapperKt;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ*\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000e\u001a\u00020\u00022\n\u0010\u0010\u001a\u00060\u0003j\u0002`\u000fH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/customerContacts/v3/data/CustomerContactsV3Mapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/customerContacts/v3/data/CustomerContactsV3DTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/general/booking/widgets/customerContacts/v3/presentation/CustomerContactsV3VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "dto", "", "stateId", "mapToVO", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/customerContacts/v3/data/CustomerContactsV3DTO;Ljava/lang/String;)Lru/ozon/app/android/travel/feature/general/booking/widgets/customerContacts/v3/presentation/CustomerContactsV3VO;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/customerContacts/v3/data/CustomerContactsV3DTO;Ll20/d;)Ljava/util/List;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CustomerContactsV3Mapper implements Function2<CustomerContactsV3DTO, d, List<? extends CustomerContactsV3VO>> {
    private final CustomerContactsV3VO mapToVO(CustomerContactsV3DTO dto, String stateId) {
        CommonInputV2VO commonInputV2VO;
        CommonInputV2VO commonInputV2VO2;
        AtomActionDTO action;
        CellDTO.LeftBlock leftBlock;
        long hashCode = stateId.hashCode();
        CellDTO cellInfo = dto.getCellInfo();
        CommonControlSettings common = (cellInfo == null || (leftBlock = cellInfo.getLeftBlock()) == null) ? null : leftBlock.getCommon();
        TextDTO title = dto.getTitle();
        CommonInputV2DTO phoneNumber = dto.getPhoneNumber();
        if (phoneNumber != null) {
            commonInputV2VO = CommonInputV2MapperKt.toVO$default(phoneNumber, null, null, (hashCode + "-" + dto.getPhoneNumber().getName()).hashCode(), 3, null);
        } else {
            commonInputV2VO = null;
        }
        CommonInputV2VO.TextInputV2 textInputV2 = commonInputV2VO instanceof CommonInputV2VO.TextInputV2 ? (CommonInputV2VO.TextInputV2) commonInputV2VO : null;
        CommonInputV2DTO email = dto.getEmail();
        if (email != null) {
            commonInputV2VO2 = CommonInputV2MapperKt.toVO$default(email, null, null, (hashCode + "-" + dto.getEmail().getName()).hashCode(), 3, null);
        } else {
            commonInputV2VO2 = null;
        }
        CommonInputV2VO.TextInputV2 textInputV22 = commonInputV2VO2 instanceof CommonInputV2VO.TextInputV2 ? (CommonInputV2VO.TextInputV2) commonInputV2VO2 : null;
        CellDTO cell = dto.getCell();
        CellDTO cellInfo2 = dto.getCellInfo();
        ButtonV3DTO button = dto.getButton();
        Map<String, TokenizedTrackingInfo> trackingInfo = dto.getTrackingInfo();
        return new CustomerContactsV3VO(hashCode, title, textInputV2, textInputV22, cell, cellInfo2, button, (common == null || (action = common.getAction()) == null) ? null : AtomActionMapperKt.toAtomAction(action, null), common != null ? common.getTrackingInfo() : null, trackingInfo != null ? x.b(trackingInfo, Long.valueOf(hashCode), null) : null, false, UserVerificationMethods.USER_VERIFY_ALL, null);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<CustomerContactsV3VO> invoke(@NotNull CustomerContactsV3DTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(mapToVO(state, widgetInfo.d()));
    }
}
