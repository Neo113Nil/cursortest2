package ru.ozon.app.android.orders.cml.groupButtons.data;

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
import ru.ozon.app.android.orders.cml.groupButtons.presentation.viewItem.GroupButtonsVO;
import ru.ozon.uni.atoms.data.TestInfo;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ&\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/orders/cml/groupButtons/data/GroupButtonsMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/orders/cml/groupButtons/data/GroupButtonsDTO;", "Ll20/d;", "", "Lru/ozon/app/android/orders/cml/groupButtons/presentation/viewItem/GroupButtonsVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "", "widgetId", "toVO", "(Lru/ozon/app/android/orders/cml/groupButtons/data/GroupButtonsDTO;J)Lru/ozon/app/android/orders/cml/groupButtons/presentation/viewItem/GroupButtonsVO;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/orders/cml/groupButtons/data/GroupButtonsDTO;Ll20/d;)Ljava/util/List;", "orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GroupButtonsMapper implements Function2<GroupButtonsDTO, d, List<? extends GroupButtonsVO>> {
    private final GroupButtonsVO toVO(GroupButtonsDTO groupButtonsDTO, long j11) {
        List<TextAndIconButtonDTO> buttons = groupButtonsDTO.getButtons();
        TestInfo testInfo = groupButtonsDTO.getTestInfo();
        Map<String, TokenizedTrackingInfo> trackingInfo = groupButtonsDTO.getTrackingInfo();
        return new GroupButtonsVO(j11, buttons, testInfo, trackingInfo != null ? TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null, groupButtonsDTO.getVerticalPadding());
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<GroupButtonsVO> invoke(@NotNull GroupButtonsDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(toVO(state, widgetInfo.d().hashCode()));
    }
}
