package ru.ozon.app.android.fresh.unsorted.widgets.deliveryToCharitiesInfo.presentation;

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
import ru.ozon.app.android.fresh.unsorted.utils.ExtentionsKt;
import ru.ozon.app.android.fresh.unsorted.widgets.deliveryToCharitiesInfo.data.DeliveryToCharitiesInfoDTO;
import ru.ozon.app.android.fresh.unsorted.widgets.deliveryToCharitiesInfo.presentation.DeliveryToCharitiesInfoVO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\t\b\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u00022\n\u0010\u000f\u001a\u00060\u0003j\u0002`\u000eH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/deliveryToCharitiesInfo/presentation/DeliveryToCharitiesInfoMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryToCharitiesInfo/data/DeliveryToCharitiesInfoDTO;", "Ll20/d;", "", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryToCharitiesInfo/presentation/DeliveryToCharitiesInfoVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "", "id", "toVo", "(Lru/ozon/app/android/fresh/unsorted/widgets/deliveryToCharitiesInfo/data/DeliveryToCharitiesInfoDTO;J)Lru/ozon/app/android/fresh/unsorted/widgets/deliveryToCharitiesInfo/presentation/DeliveryToCharitiesInfoVO;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/fresh/unsorted/widgets/deliveryToCharitiesInfo/data/DeliveryToCharitiesInfoDTO;Ll20/d;)Ljava/util/List;", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DeliveryToCharitiesInfoMapper implements Function2<DeliveryToCharitiesInfoDTO, d, List<? extends DeliveryToCharitiesInfoVO>> {
    private final DeliveryToCharitiesInfoVO toVo(DeliveryToCharitiesInfoDTO deliveryToCharitiesInfoDTO, long j11) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = deliveryToCharitiesInfoDTO.getInstructions().iterator();
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                TextDTO title = deliveryToCharitiesInfoDTO.getTitle();
                TextDTO subtitle = deliveryToCharitiesInfoDTO.getSubtitle();
                TextDTO copy$default = TextDTO.copy$default(deliveryToCharitiesInfoDTO.getAgreement(), null, null, null, null, null, null, null, null, null, null, null, null, null, true, null, null, null, null, null, 516095, null);
                TextDTO about = deliveryToCharitiesInfoDTO.getAbout();
                Map<String, TokenizedTrackingInfo> trackingInfo = deliveryToCharitiesInfoDTO.getTrackingInfo();
                return new DeliveryToCharitiesInfoVO(j11, title, subtitle, arrayList, copy$default, about, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null);
            }
            Object next = it.next();
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            DeliveryToCharitiesInfoDTO.InstructionDTO instructionDTO = (DeliveryToCharitiesInfoDTO.InstructionDTO) next;
            arrayList.add(new DeliveryToCharitiesInfoVO.InstructionVO(j11, i12 + ".", instructionDTO.getTitle(), instructionDTO.getSubtitle(), instructionDTO.getButton()));
            i11 = i12;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<DeliveryToCharitiesInfoVO> invoke(@NotNull DeliveryToCharitiesInfoDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(toVo(state, ExtentionsKt.getId(widgetInfo)));
    }
}
