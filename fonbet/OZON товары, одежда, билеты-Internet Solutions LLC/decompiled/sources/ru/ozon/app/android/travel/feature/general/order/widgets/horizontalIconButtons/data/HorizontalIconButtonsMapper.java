package ru.ozon.app.android.travel.feature.general.order.widgets.horizontalIconButtons.data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.travel.feature.general.order.widgets.horizontalIconButtons.data.HorizontalIconButtonsDTO;
import ru.ozon.app.android.travel.feature.general.order.widgets.horizontalIconButtons.presentation.HorizontalIconButtonsVO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ*\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000e\u001a\u00020\u00022\n\u0010\u0010\u001a\u00060\u0003j\u0002`\u000fH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/horizontalIconButtons/data/HorizontalIconButtonsMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/general/order/widgets/horizontalIconButtons/data/HorizontalIconButtonsDTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/general/order/widgets/horizontalIconButtons/presentation/HorizontalIconButtonsVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/travel/feature/general/order/widgets/horizontalIconButtons/data/HorizontalIconButtonsDTO$IconButtonDTO;", "dto", "Lru/ozon/app/android/travel/feature/general/order/widgets/horizontalIconButtons/presentation/HorizontalIconButtonsVO$IconButtonVO;", "mapIconButton", "(Lru/ozon/app/android/travel/feature/general/order/widgets/horizontalIconButtons/data/HorizontalIconButtonsDTO$IconButtonDTO;)Lru/ozon/app/android/travel/feature/general/order/widgets/horizontalIconButtons/presentation/HorizontalIconButtonsVO$IconButtonVO;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/general/order/widgets/horizontalIconButtons/data/HorizontalIconButtonsDTO;Ll20/d;)Ljava/util/List;", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HorizontalIconButtonsMapper implements Function2<HorizontalIconButtonsDTO, d, List<? extends HorizontalIconButtonsVO>> {
    private final HorizontalIconButtonsVO.IconButtonVO mapIconButton(HorizontalIconButtonsDTO.IconButtonDTO dto) {
        return new HorizontalIconButtonsVO.IconButtonVO(dto.getIcon(), dto.getTitle(), dto.getBackgroundColor(), AtomActionMapperKt.toAtomAction(dto.getAction(), dto.getTrackingInfo()));
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<HorizontalIconButtonsVO> invoke(@NotNull HorizontalIconButtonsDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        List<HorizontalIconButtonsDTO.IconButtonDTO> buttons = state.getButtons();
        ArrayList arrayList = new ArrayList(C7714v.z(buttons, 10));
        Iterator<T> it = buttons.iterator();
        while (it.hasNext()) {
            arrayList.add(mapIconButton((HorizontalIconButtonsDTO.IconButtonDTO) it.next()));
        }
        Map<String, TokenizedTrackingInfo> trackingInfo = state.getTrackingInfo();
        return C7714v.a0(new HorizontalIconButtonsVO(hashCode, arrayList, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null));
    }
}
