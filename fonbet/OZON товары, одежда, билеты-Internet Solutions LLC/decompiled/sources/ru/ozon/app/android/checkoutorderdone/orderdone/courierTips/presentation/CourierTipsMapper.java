package ru.ozon.app.android.checkoutorderdone.orderdone.courierTips.presentation;

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
import ru.ozon.app.android.checkoutorderdone.orderdone.courierTips.data.CheckboxWithTextDTO;
import ru.ozon.app.android.checkoutorderdone.orderdone.courierTips.data.CourierTipsDTO;
import ru.ozon.app.android.checkoutorderdone.orderdone.courierTips.presentation.CourierTipsVO;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.chip.ChipDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\r\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0004*\b\u0012\u0004\u0012\u00020\u000f0\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\r\u001a\u00020\u0014*\u00020\u0013H\u0002¢\u0006\u0004\b\r\u0010\u0015J&\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J)\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0011\u0010\u000e¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/checkoutorderdone/orderdone/courierTips/presentation/CourierTipsMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/checkoutorderdone/orderdone/courierTips/data/CourierTipsDTO;", "Ll20/d;", "", "Lru/ozon/app/android/checkoutorderdone/orderdone/courierTips/presentation/CourierTipsVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "", "id", "", "asyncData", "toVO", "(Lru/ozon/app/android/checkoutorderdone/orderdone/courierTips/data/CourierTipsDTO;JLjava/lang/String;)Lru/ozon/app/android/checkoutorderdone/orderdone/courierTips/presentation/CourierTipsVO;", "Lru/ozon/uni/atoms/data/controls/chip/ChipDTO;", "Lru/ozon/app/android/checkoutorderdone/orderdone/courierTips/presentation/CourierTipsVO$CourierTipsVariant;", "mapDTOToVO", "(Ljava/util/List;)Ljava/util/List;", "Lru/ozon/app/android/checkoutorderdone/orderdone/courierTips/data/CheckboxWithTextDTO;", "Lru/ozon/app/android/checkoutorderdone/orderdone/courierTips/presentation/CourierTipsVO$CheckboxWithText;", "(Lru/ozon/app/android/checkoutorderdone/orderdone/courierTips/data/CheckboxWithTextDTO;)Lru/ozon/app/android/checkoutorderdone/orderdone/courierTips/presentation/CourierTipsVO$CheckboxWithText;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/checkoutorderdone/orderdone/courierTips/data/CourierTipsDTO;Ll20/d;)Ljava/util/List;", "courierTipsDTO", "orderdone_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CourierTipsMapper implements Function2<CourierTipsDTO, d, List<? extends CourierTipsVO>> {
    public static /* synthetic */ CourierTipsVO mapDTOToVO$default(CourierTipsMapper courierTipsMapper, CourierTipsDTO courierTipsDTO, long j11, String str, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            str = null;
        }
        return courierTipsMapper.mapDTOToVO(courierTipsDTO, j11, str);
    }

    private final CourierTipsVO toVO(CourierTipsDTO courierTipsDTO, long j11, String str) {
        TextDTO title = courierTipsDTO.getTitle();
        BadgeDTO badge = courierTipsDTO.getBadge();
        TextDTO subtitle = courierTipsDTO.getSubtitle();
        List<CourierTipsVO.CourierTipsVariant> mapDTOToVO = mapDTOToVO(courierTipsDTO.getVariants());
        CheckboxWithTextDTO checkbox = courierTipsDTO.getCheckbox();
        CourierTipsVO.CheckboxWithText vo = checkbox != null ? toVO(checkbox) : null;
        Map<String, TokenizedTrackingInfo> trackingInfo = courierTipsDTO.getTrackingInfo();
        return new CourierTipsVO(j11, title, badge, subtitle, mapDTOToVO, vo, str, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null, courierTipsDTO.getButton(), courierTipsDTO.getInfoButton());
    }

    @NotNull
    public final CourierTipsVO mapDTOToVO(@NotNull CourierTipsDTO courierTipsDTO, long id2, String asyncData) {
        Intrinsics.checkNotNullParameter(courierTipsDTO, "courierTipsDTO");
        return toVO(courierTipsDTO, id2, asyncData);
    }

    private final List<CourierTipsVO.CourierTipsVariant> mapDTOToVO(List<ChipDTO> list) {
        AtomActionDTO action;
        List<ChipDTO> list2 = list;
        ArrayList arrayList = new ArrayList(C7714v.z(list2, 10));
        for (ChipDTO chipDTO : list2) {
            CommonControlSettings common = chipDTO.getCommon();
            arrayList.add(new CourierTipsVO.CourierTipsVariant(chipDTO, (common == null || (action = common.getAction()) == null) ? null : AtomActionMapperKt.toAtomAction(action, chipDTO.getTrackingInfo())));
        }
        return arrayList;
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<CourierTipsVO> invoke(@NotNull CourierTipsDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(toVO(state, widgetInfo.d().hashCode(), widgetInfo.c().a()));
    }

    private final CourierTipsVO.CheckboxWithText toVO(CheckboxWithTextDTO checkboxWithTextDTO) {
        return new CourierTipsVO.CheckboxWithText(checkboxWithTextDTO.getCheckbox(), checkboxWithTextDTO.getText(), AtomActionMapperKt.toAtomAction(checkboxWithTextDTO.getAction(), checkboxWithTextDTO.getTrackingInfo()));
    }
}
