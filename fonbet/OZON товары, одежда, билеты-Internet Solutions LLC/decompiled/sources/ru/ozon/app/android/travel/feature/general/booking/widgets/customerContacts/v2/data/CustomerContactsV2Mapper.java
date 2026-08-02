package ru.ozon.app.android.travel.feature.general.booking.widgets.customerContacts.v2.data;

import WZ.x;
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
import ru.ozon.app.android.travel.feature.general.booking.widgets.customerContacts.v2.presentation.CustomerContactsV2VO;
import ru.ozon.app.android.travel.molecules.dto.commonInput.v1.CommonInputDTO;
import ru.ozon.app.android.travel.molecules.input.v1.CommonInputVO;
import ru.ozon.app.android.travel.molecules.input.v1.mapper.CommonInputMapperKt;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ*\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000e\u001a\u00020\u00022\n\u0010\u0010\u001a\u00060\u0003j\u0002`\u000fH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/customerContacts/v2/data/CustomerContactsV2Mapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/customerContacts/v2/data/CustomerContactsV2DTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/general/booking/widgets/customerContacts/v2/presentation/CustomerContactsV2VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "dto", "", "stateId", "mapToVO", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/customerContacts/v2/data/CustomerContactsV2DTO;Ljava/lang/String;)Lru/ozon/app/android/travel/feature/general/booking/widgets/customerContacts/v2/presentation/CustomerContactsV2VO;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/customerContacts/v2/data/CustomerContactsV2DTO;Ll20/d;)Ljava/util/List;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CustomerContactsV2Mapper implements Function2<CustomerContactsV2DTO, d, List<? extends CustomerContactsV2VO>> {
    private final CustomerContactsV2VO mapToVO(CustomerContactsV2DTO dto, String stateId) {
        AtomActionDTO action;
        CellDTO.LeftBlock leftBlock;
        int hashCode = stateId.hashCode();
        long j11 = hashCode;
        CellDTO cellInfo = dto.getCellInfo();
        CommonControlSettings common = (cellInfo == null || (leftBlock = cellInfo.getLeftBlock()) == null) ? null : leftBlock.getCommon();
        TextAtom title = dto.getTitle();
        TextAtom subtitle = dto.getSubtitle();
        List<CommonInputDTO> inputs = dto.getInputs();
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        for (Object obj : inputs) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            CommonInputDTO commonInputDTO = (CommonInputDTO) obj;
            Boolean valueOf = Boolean.valueOf(i11 == C7714v.P(dto.getInputs()));
            Long valueOf2 = Long.valueOf(j11);
            TextAtom title2 = dto.getTitle();
            CommonInputVO vo = CommonInputMapperKt.toVO(commonInputDTO, valueOf, valueOf2, i11, String.valueOf(title2 != null ? title2.getText() : null));
            CommonInputVO.TextCommonInputVO textCommonInputVO = vo instanceof CommonInputVO.TextCommonInputVO ? (CommonInputVO.TextCommonInputVO) vo : null;
            if (textCommonInputVO != null) {
                arrayList.add(textCommonInputVO);
            }
            i11 = i12;
        }
        Map<String, TokenizedTrackingInfo> trackingInfo = dto.getTrackingInfo();
        return new CustomerContactsV2VO(j11, Integer.valueOf(hashCode), title, subtitle, arrayList, dto.getCellInfo(), (common == null || (action = common.getAction()) == null) ? null : AtomActionMapperKt.toAtomAction(action, null), common != null ? common.getTrackingInfo() : null, trackingInfo != null ? x.b(trackingInfo, Long.valueOf(j11), null) : null);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<CustomerContactsV2VO> invoke(@NotNull CustomerContactsV2DTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(mapToVO(state, widgetInfo.d()));
    }
}
