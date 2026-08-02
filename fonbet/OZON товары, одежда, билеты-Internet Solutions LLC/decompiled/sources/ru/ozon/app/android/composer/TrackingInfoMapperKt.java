package ru.ozon.app.android.composer;

import Sc.InterfaceC3999a;
import WZ.t;
import WZ.x;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.tracker.model.TrinityEventEntityKt;

@Metadata(d1 = {"\u0000 \n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a9\u0010\b\u001a\u00060\u0006j\u0002`\u0007*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\b\u0010\t\u001a9\u0010\n\u001a\u00060\u0006j\u0002`\u0007*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "", "widgetId", TrinityEventEntityKt.ACTION_TYPE_JSON_NAME, "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "toTokenizedEvent", "(Ljava/util/Map;Ljava/lang/Long;Ljava/lang/String;)LWZ/t;", "mapToTokenizedEvent", "composer_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TrackingInfoMapperKt {
    @InterfaceC3999a
    @NotNull
    public static final t mapToTokenizedEvent(@NotNull Map<String, TokenizedTrackingInfo> map, Long l11, String str) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        return x.b(map, l11, str);
    }

    public static /* synthetic */ t mapToTokenizedEvent$default(Map map, Long l11, String str, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = null;
        }
        return mapToTokenizedEvent(map, l11, str);
    }

    @InterfaceC3999a
    @NotNull
    public static final t toTokenizedEvent(@NotNull Map<String, TokenizedTrackingInfo> map, Long l11, String str) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        return x.b(map, l11, str);
    }

    public static /* synthetic */ t toTokenizedEvent$default(Map map, Long l11, String str, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = null;
        }
        return toTokenizedEvent(map, l11, str);
    }
}
