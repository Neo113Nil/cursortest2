package ru.ozon.app.android.fresh.unsorted.widgets.deliveryProblems.presentation;

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
import ru.ozon.app.android.fresh.unsorted.widgets.deliveryProblems.data.DeliveryProblemsDTO;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u0005*\u00020\u00022\n\u0010\n\u001a\u00060\u0003j\u0002`\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u00022\n\u0010\n\u001a\u00060\u0003j\u0002`\tH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/deliveryProblems/presentation/DeliveryProblemsMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryProblems/data/DeliveryProblemsDTO;", "Ll20/d;", "", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryProblems/presentation/DeliveryProblemsVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "toVO", "(Lru/ozon/app/android/fresh/unsorted/widgets/deliveryProblems/data/DeliveryProblemsDTO;Ll20/d;)Lru/ozon/app/android/fresh/unsorted/widgets/deliveryProblems/presentation/DeliveryProblemsVO;", "state", "invoke", "(Lru/ozon/app/android/fresh/unsorted/widgets/deliveryProblems/data/DeliveryProblemsDTO;Ll20/d;)Ljava/util/List;", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DeliveryProblemsMapper implements Function2<DeliveryProblemsDTO, d, List<? extends DeliveryProblemsVO>> {
    private final DeliveryProblemsVO toVO(DeliveryProblemsDTO deliveryProblemsDTO, d dVar) {
        long hashCode = dVar.d().hashCode();
        TextAtom text = deliveryProblemsDTO.getText();
        Icon icon = deliveryProblemsDTO.getIcon();
        Map<String, TokenizedTrackingInfo> trackingInfo = deliveryProblemsDTO.getTrackingInfo();
        return new DeliveryProblemsVO(hashCode, text, icon, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<DeliveryProblemsVO> invoke(@NotNull DeliveryProblemsDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(toVO(state, widgetInfo));
    }
}
