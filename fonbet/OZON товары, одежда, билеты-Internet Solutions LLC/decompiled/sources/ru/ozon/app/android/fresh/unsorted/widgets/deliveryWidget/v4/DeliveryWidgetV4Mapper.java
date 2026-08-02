package ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v4;

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
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.fresh.unsorted.utils.ExtentionsKt;
import ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v4.data.DeliveryWidgetV4DTO;
import ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v4.presentation.DeliveryWidgetV4VO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.data.common.Paddings;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\n\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\t\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v4/DeliveryWidgetV4Mapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v4/data/DeliveryWidgetV4DTO;", "Ll20/d;", "", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v4/presentation/DeliveryWidgetV4VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "info", "toVO", "(Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v4/data/DeliveryWidgetV4DTO;Ll20/d;)Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v4/presentation/DeliveryWidgetV4VO;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v4/data/DeliveryWidgetV4DTO;Ll20/d;)Ljava/util/List;", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DeliveryWidgetV4Mapper implements Function2<DeliveryWidgetV4DTO, d, List<? extends DeliveryWidgetV4VO>> {
    private final DeliveryWidgetV4VO toVO(DeliveryWidgetV4DTO deliveryWidgetV4DTO, d dVar) {
        long id2 = ExtentionsKt.getId(dVar);
        List<DeliveryWidgetV4DTO.ContentBlock> deliveryConditionsBlocks = deliveryWidgetV4DTO.getDeliveryConditionsBlocks();
        ArrayList arrayList = new ArrayList(C7714v.z(deliveryConditionsBlocks, 10));
        for (DeliveryWidgetV4DTO.ContentBlock contentBlock : deliveryConditionsBlocks) {
            arrayList.add(new DeliveryWidgetV4VO.ContentBlockVO(contentBlock.getText(), contentBlock.getIcon(), contentBlock.getRightPadding()));
        }
        DeliveryWidgetV4DTO.Progress progress = deliveryWidgetV4DTO.getProgress();
        DeliveryWidgetV4VO.ProgressVO progressVO = progress != null ? new DeliveryWidgetV4VO.ProgressVO(progress.getPercentage(), progress.getColor()) : null;
        CommonAtomIconDTO chevronIcon = deliveryWidgetV4DTO.getChevron().getChevronIcon();
        Paddings rightPadding = deliveryWidgetV4DTO.getChevron().getRightPadding();
        if (rightPadding == null) {
            rightPadding = Paddings.PADDING_400;
        }
        DeliveryWidgetV4VO.ChevronVO chevronVO = new DeliveryWidgetV4VO.ChevronVO(chevronIcon, rightPadding);
        String borderColor = deliveryWidgetV4DTO.getBorderColor();
        String backgroundColor = deliveryWidgetV4DTO.getBackgroundColor();
        Paddings top = deliveryWidgetV4DTO.getSpacers().getTop();
        if (top == null) {
            top = Paddings.PADDING_400;
        }
        Paddings bottom = deliveryWidgetV4DTO.getSpacers().getBottom();
        if (bottom == null) {
            bottom = Paddings.PADDING_300;
        }
        Paddings horizontal = deliveryWidgetV4DTO.getSpacers().getHorizontal();
        if (horizontal == null) {
            horizontal = Paddings.PADDING_300;
        }
        DeliveryWidgetV4VO.SpacersVO spacersVO = new DeliveryWidgetV4VO.SpacersVO(top, bottom, horizontal, deliveryWidgetV4DTO.getSpacers().getBetween());
        long widgetUpdatePeriod = deliveryWidgetV4DTO.getWidgetUpdatePeriod();
        AtomAction atomAction = AtomActionMapperKt.toAtomAction(deliveryWidgetV4DTO.getAction(), null);
        Map<String, TokenizedTrackingInfo> trackingInfo = deliveryWidgetV4DTO.getTrackingInfo();
        return new DeliveryWidgetV4VO(id2, dVar, arrayList, progressVO, chevronVO, borderColor, backgroundColor, spacersVO, widgetUpdatePeriod, atomAction, trackingInfo != null ? TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(id2), null, 2, null) : null, false, 2048, null);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<DeliveryWidgetV4VO> invoke(@NotNull DeliveryWidgetV4DTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(toVO(state, widgetInfo));
    }
}
