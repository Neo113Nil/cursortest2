package ru.ozon.app.android.fresh.checkout.widgets.timeSlots.presentation;

import WZ.t;
import WZ.x;
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
import ru.ozon.app.android.fresh.checkout.widgets.timeSlots.data.TimeSlotsDTO;
import ru.ozon.app.android.fresh.checkout.widgets.timeSlots.domain.TimeSlotsVO;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.data.aspect.AspectDTO;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u00122*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006:\u0001\u0012B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000b\u001a\u00020\n*\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u00022\n\u0010\u000f\u001a\u00060\u0003j\u0002`\u000eH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/timeSlots/presentation/TimeSlotsMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/fresh/checkout/widgets/timeSlots/data/TimeSlotsDTO;", "Ll20/d;", "", "Lru/ozon/app/android/fresh/checkout/widgets/timeSlots/domain/TimeSlotsVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/fresh/checkout/widgets/timeSlots/data/TimeSlotsDTO$TimeSlot;", "Lru/ozon/app/android/fresh/checkout/widgets/timeSlots/domain/TimeSlotsVO$TimeSlot;", "toVO", "(Lru/ozon/app/android/fresh/checkout/widgets/timeSlots/data/TimeSlotsDTO$TimeSlot;)Lru/ozon/app/android/fresh/checkout/widgets/timeSlots/domain/TimeSlotsVO$TimeSlot;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/fresh/checkout/widgets/timeSlots/data/TimeSlotsDTO;Ll20/d;)Ljava/util/List;", "Companion", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class TimeSlotsMapper implements Function2<TimeSlotsDTO, d, List<? extends TimeSlotsVO>> {
    private final TimeSlotsVO.TimeSlot toVO(TimeSlotsDTO.TimeSlot timeSlot) {
        AspectDTO wrapper = timeSlot.getWrapper();
        TextDTO title = timeSlot.getTitle();
        TextDTO subtitle = timeSlot.getSubtitle();
        Paddings aspectPadding = timeSlot.getAspectPadding();
        return new TimeSlotsVO.TimeSlot(wrapper, title, subtitle, aspectPadding != null ? ResourceExtKt.toPx(aspectPadding.getPx()) : 0);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<TimeSlotsVO> invoke(@NotNull TimeSlotsDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        Map<String, TokenizedTrackingInfo> viewTrackingInfo = state.getViewTrackingInfo();
        t b11 = viewTrackingInfo != null ? x.b(viewTrackingInfo, Long.valueOf(hashCode), null) : null;
        List<TimeSlotsDTO.TimeSlot> items = state.getItems();
        ArrayList arrayList = new ArrayList(C7714v.z(items, 10));
        Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(toVO((TimeSlotsDTO.TimeSlot) it.next()));
        }
        return C7714v.a0(new TimeSlotsVO(hashCode, arrayList, b11));
    }
}
