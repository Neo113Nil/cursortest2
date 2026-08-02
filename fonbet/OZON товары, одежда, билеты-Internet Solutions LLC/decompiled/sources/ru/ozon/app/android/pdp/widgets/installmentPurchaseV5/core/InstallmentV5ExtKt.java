package ru.ozon.app.android.pdp.widgets.installmentPurchaseV5.core;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.pdp.widgets.installmentPurchaseV5.presentation.InstallmentPurchaseV5VO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0005"}, d2 = {"toVO", "Lru/ozon/app/android/pdp/widgets/installmentPurchaseV5/presentation/InstallmentPurchaseV5VO$CommonVO;", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "widgetId", "", "pdp_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class InstallmentV5ExtKt {
    @NotNull
    public static final InstallmentPurchaseV5VO.CommonVO toVO(@NotNull CommonControlSettings commonControlSettings, long j11) {
        Intrinsics.checkNotNullParameter(commonControlSettings, "<this>");
        AtomActionDTO action = commonControlSettings.getAction();
        AtomAction atomAction = action != null ? AtomActionMapperKt.toAtomAction(action, commonControlSettings.getTrackingInfo()) : null;
        Map<String, TokenizedTrackingInfo> trackingInfo = commonControlSettings.getTrackingInfo();
        return new InstallmentPurchaseV5VO.CommonVO(atomAction, trackingInfo != null ? TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null, commonControlSettings.getTestInfo());
    }
}
