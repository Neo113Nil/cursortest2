package ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v2.data;

import java.util.ArrayList;
import java.util.Iterator;
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
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v2.data.HotelsBookTotalV2DTO;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v2.presentation.HotelsBookTotalV2VO;
import ru.ozon.app.android.travel.molecules.dto.linkButton.LinkButtonDTO;
import ru.ozon.app.android.travel.molecules.mapper.MapperExtKt;
import ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetStateMapper;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0007B\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J*\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000b\u001a\u00020\u00022\n\u0010\u0018\u001a\u00060\u0003j\u0002`\u0017H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001b\u0010\r¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v2/data/HotelsBookTotalV2Mapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v2/data/HotelsBookTotalV2DTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v2/presentation/HotelsBookTotalV2VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetStateMapper;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v2/presentation/HotelsBookTotalV2VO$State;", "<init>", "()V", "state", "mapState", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v2/data/HotelsBookTotalV2DTO;)Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v2/presentation/HotelsBookTotalV2VO$State;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v2/data/HotelsBookTotalV2DTO$PriceDetailItemDTO;", "item", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v2/presentation/HotelsBookTotalV2VO$PriceDetailItemVO;", "mapPriceDetail", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v2/data/HotelsBookTotalV2DTO$PriceDetailItemDTO;)Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v2/presentation/HotelsBookTotalV2VO$PriceDetailItemVO;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v2/data/HotelsBookTotalV2DTO$TotalPriceDetailItemDTO;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v2/presentation/HotelsBookTotalV2VO$TotalPriceDetailItemVO;", "mapTotalPriceDetail", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v2/data/HotelsBookTotalV2DTO$TotalPriceDetailItemDTO;)Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v2/presentation/HotelsBookTotalV2VO$TotalPriceDetailItemVO;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v2/data/HotelsBookTotalV2DTO;Ll20/d;)Ljava/util/List;", "mapAsyncState", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HotelsBookTotalV2Mapper implements Function2<HotelsBookTotalV2DTO, d, List<? extends HotelsBookTotalV2VO>>, AsyncWidgetStateMapper<HotelsBookTotalV2DTO, HotelsBookTotalV2VO.State> {
    private final HotelsBookTotalV2VO.PriceDetailItemVO mapPriceDetail(HotelsBookTotalV2DTO.PriceDetailItemDTO item) {
        int hashCode = item.getName().getText().hashCode();
        TextDTO name = item.getName();
        TextDTO price = item.getExtendedPrice() == null ? item.getPrice() : null;
        BadgeDTO badge = item.getExtendedPrice() == null ? item.getBadge() : null;
        TextDTO note = item.getNote();
        LinkButtonDTO detailsButton = item.getDetailsButton();
        return new HotelsBookTotalV2VO.PriceDetailItemVO(hashCode, name, price, badge, note, detailsButton != null ? MapperExtKt.toVO(detailsButton) : null, item.getInfoButton(), item.getExtendedPrice());
    }

    private final HotelsBookTotalV2VO.State mapState(HotelsBookTotalV2DTO state) {
        TextDTO textDTO;
        ArrayList arrayList;
        TextDTO title = state.getTitle();
        List<HotelsBookTotalV2DTO.PriceDetailItemDTO> priceDetails = state.getPriceDetails();
        ArrayList arrayList2 = new ArrayList(C7714v.z(priceDetails, 10));
        Iterator<T> it = priceDetails.iterator();
        while (it.hasNext()) {
            arrayList2.add(mapPriceDetail((HotelsBookTotalV2DTO.PriceDetailItemDTO) it.next()));
        }
        String dividerColor = state.getDividerColor();
        List<HotelsBookTotalV2DTO.TotalPriceDetailItemDTO> totalPriceDetails = state.getTotalPriceDetails();
        if (totalPriceDetails != null) {
            List<HotelsBookTotalV2DTO.TotalPriceDetailItemDTO> list = totalPriceDetails;
            ArrayList arrayList3 = new ArrayList(C7714v.z(list, 10));
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList3.add(mapTotalPriceDetail((HotelsBookTotalV2DTO.TotalPriceDetailItemDTO) it2.next()));
            }
            textDTO = null;
            arrayList = arrayList3;
        } else {
            textDTO = null;
            arrayList = null;
        }
        ButtonV3DTO nextButton = state.getNextButton();
        TextDTO agreement = state.getAgreement();
        if (agreement != null) {
            agreement.setTagSupported(true);
            Unit unit = Unit.f71690a;
        } else {
            agreement = textDTO;
        }
        return new HotelsBookTotalV2VO.State(title, arrayList2, dividerColor, arrayList, nextButton, agreement, state.getTrackingInfo());
    }

    private final HotelsBookTotalV2VO.TotalPriceDetailItemVO mapTotalPriceDetail(HotelsBookTotalV2DTO.TotalPriceDetailItemDTO item) {
        AtomActionDTO action;
        CommonControlSettings common = item.getCommon();
        AtomAction atomAction = null;
        Map<String, TokenizedTrackingInfo> trackingInfo = common != null ? common.getTrackingInfo() : null;
        int hashCode = item.getName().getText().hashCode();
        TextDTO name = item.getName();
        PriceDTO price = item.getPrice();
        IconDTO infoIcon = item.getInfoIcon();
        AtomActionDTO infoIconAction = item.getInfoIconAction();
        AtomAction atomAction2 = infoIconAction != null ? AtomActionMapperKt.toAtomAction(infoIconAction, trackingInfo) : null;
        TextDTO note = item.getNote();
        CommonControlSettings common2 = item.getCommon();
        if (common2 != null && (action = common2.getAction()) != null) {
            atomAction = AtomActionMapperKt.toAtomAction(action, trackingInfo);
        }
        return new HotelsBookTotalV2VO.TotalPriceDetailItemVO(hashCode, name, price, infoIcon, atomAction2, note, atomAction);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<HotelsBookTotalV2VO> invoke(@NotNull HotelsBookTotalV2DTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(new HotelsBookTotalV2VO(widgetInfo.d().hashCode(), mapState(state), false, false, widgetInfo.c().a()));
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetStateMapper
    @NotNull
    public HotelsBookTotalV2VO.State mapAsyncState(@NotNull HotelsBookTotalV2DTO state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return mapState(state);
    }
}
