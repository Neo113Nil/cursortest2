package ru.ozon.app.android.cml.delivery.common.ext;

import WZ.t;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a-\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u00002\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a!\u0010\u000b\u001a\u0004\u0018\u00010\n*\u00020\u00002\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0000¢\u0006\u0004\b\u000b\u0010\f\"\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u0002*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "Lru/ozon/uni/atoms/af/AtomAction;", "atomAction", "(Lru/ozon/uni/atoms/data/controls/CommonControlSettings;Ljava/util/Map;)Lru/ozon/uni/atoms/af/AtomAction;", "", "widgetId", "LWZ/t;", "getTokenizedEvent", "(Lru/ozon/uni/atoms/data/controls/CommonControlSettings;Ljava/lang/Long;)LWZ/t;", "getAutomatizationId", "(Lru/ozon/uni/atoms/data/controls/CommonControlSettings;)Ljava/lang/String;", "automatizationId", "delivery_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CommonControlSettingsExtKt {
    public static final AtomAction atomAction(@NotNull CommonControlSettings commonControlSettings, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(commonControlSettings, "<this>");
        AtomActionDTO action = commonControlSettings.getAction();
        if (action != null) {
            return AtomActionMapperKt.toAtomAction(action, map);
        }
        return null;
    }

    public static /* synthetic */ AtomAction atomAction$default(CommonControlSettings commonControlSettings, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            map = commonControlSettings.getTrackingInfo();
        }
        return atomAction(commonControlSettings, map);
    }

    public static final String getAutomatizationId(@NotNull CommonControlSettings commonControlSettings) {
        Intrinsics.checkNotNullParameter(commonControlSettings, "<this>");
        TestInfo testInfo = commonControlSettings.getTestInfo();
        if (testInfo != null) {
            return testInfo.getAutomatizationId();
        }
        return null;
    }

    public static final t getTokenizedEvent(@NotNull CommonControlSettings commonControlSettings, Long l11) {
        Intrinsics.checkNotNullParameter(commonControlSettings, "<this>");
        Map<String, TokenizedTrackingInfo> trackingInfo = commonControlSettings.getTrackingInfo();
        if (trackingInfo != null) {
            return TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, l11, null, 2, null);
        }
        return null;
    }
}
