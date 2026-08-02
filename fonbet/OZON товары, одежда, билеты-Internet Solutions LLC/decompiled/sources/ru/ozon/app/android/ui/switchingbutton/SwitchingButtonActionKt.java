package ru.ozon.app.android.ui.switchingbutton;

import WZ.t;
import WZ.x;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.AtomDTO;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0002*\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/ozon/app/android/ui/switchingbutton/SwitchingButtonAction;", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "extractTokenizedEvent", "(Lru/ozon/app/android/ui/switchingbutton/SwitchingButtonAction;)LWZ/t;", "switchingbutton_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SwitchingButtonActionKt {
    public static final t extractTokenizedEvent(@NotNull SwitchingButtonAction switchingButtonAction) {
        Map<String, TokenizedTrackingInfo> trackingInfo;
        Intrinsics.checkNotNullParameter(switchingButtonAction, "<this>");
        if (switchingButtonAction.getSwitchingButton().isActive()) {
            AtomDTO activeButton = switchingButtonAction.getSwitchingButton().getActiveButton();
            if (activeButton == null || (trackingInfo = activeButton.getTrackingInfo()) == null) {
                trackingInfo = switchingButtonAction.getSwitchingButton().getDefaultButton().getTrackingInfo();
            }
        } else {
            trackingInfo = switchingButtonAction.getSwitchingButton().getDefaultButton().getTrackingInfo();
        }
        if (trackingInfo == null) {
            return null;
        }
        Long valueOf = Long.valueOf(switchingButtonAction.getVoId());
        Intrinsics.checkNotNullParameter(trackingInfo, "<this>");
        return x.b(trackingInfo, valueOf, null);
    }
}
