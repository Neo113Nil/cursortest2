package ru.ozon.app.android.checkoutorderdone.orderdone.disclaimerV2.data;

import WZ.t;
import WZ.x;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.checkoutorderdone.orderdone.disclaimerV2.presentation.DisclaimerV2VI;
import ru.ozon.app.android.checkoutorderdone.orderdone.disclaimerV2.presentation.TimerVI;
import ru.ozon.app.android.cscore.padding.PaddingCompose;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.disclaimer.DisclaimerDTO;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\b\u001a\u00020\u000b*\u00020\nH\u0002¢\u0006\u0004\b\b\u0010\fJ\u001d\u0010\u0010\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/checkoutorderdone/orderdone/disclaimerV2/data/DisclaimerV2Mapper;", "", "<init>", "()V", "Lru/ozon/app/android/checkoutorderdone/orderdone/disclaimerV2/data/DisclaimerV2DTO;", "", "id", "Lru/ozon/app/android/checkoutorderdone/orderdone/disclaimerV2/presentation/DisclaimerV2VI;", "toVi", "(Lru/ozon/app/android/checkoutorderdone/orderdone/disclaimerV2/data/DisclaimerV2DTO;J)Lru/ozon/app/android/checkoutorderdone/orderdone/disclaimerV2/presentation/DisclaimerV2VI;", "Lru/ozon/app/android/checkoutorderdone/orderdone/disclaimerV2/data/Timer;", "Lru/ozon/app/android/checkoutorderdone/orderdone/disclaimerV2/presentation/TimerVI;", "(Lru/ozon/app/android/checkoutorderdone/orderdone/disclaimerV2/data/Timer;)Lru/ozon/app/android/checkoutorderdone/orderdone/disclaimerV2/presentation/TimerVI;", "state", "Ll20/d;", "widgetInfo", "map", "(Lru/ozon/app/android/checkoutorderdone/orderdone/disclaimerV2/data/DisclaimerV2DTO;Ll20/d;)Lru/ozon/app/android/checkoutorderdone/orderdone/disclaimerV2/presentation/DisclaimerV2VI;", "orderdone_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DisclaimerV2Mapper {
    private final DisclaimerV2VI toVi(DisclaimerV2DTO disclaimerV2DTO, long j11) {
        Map<String, TokenizedTrackingInfo> trackingInfo;
        Timer timer = disclaimerV2DTO.getTimer();
        t tVar = null;
        TimerVI vi2 = timer != null ? toVi(timer) : null;
        DisclaimerDTO disclaimer = disclaimerV2DTO.getDisclaimer();
        TestInfo testInfo = disclaimerV2DTO.getTestInfo();
        PaddingCompose paddings = disclaimerV2DTO.getPaddings();
        CommonControlSettings common = disclaimerV2DTO.getDisclaimer().getCommon();
        if (common != null && (trackingInfo = common.getTrackingInfo()) != null) {
            Long valueOf = Long.valueOf(j11);
            Intrinsics.checkNotNullParameter(trackingInfo, "<this>");
            tVar = x.b(trackingInfo, valueOf, null);
        }
        return new DisclaimerV2VI(j11, vi2, disclaimer, testInfo, paddings, tVar);
    }

    @NotNull
    public final DisclaimerV2VI map(@NotNull DisclaimerV2DTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return toVi(state, widgetInfo.d().hashCode());
    }

    private final TimerVI toVi(Timer timer) {
        return new TimerVI((timer.getTimeLeft() * 1000) + System.currentTimeMillis(), timer.getTimerPosition());
    }
}
