package ru.ozon.app.android.common.filterWidgets.filtervalues.presentation;

import B0.C2454a;
import WZ.e;
import WZ.g;
import WZ.t;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00060\u0007j\u0002`\b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\t\u0010\nJ3\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/ApplyFiltersAnalyticDelegate;", "", "<init>", "()V", "", "", "selectedIds", "LWZ/e;", "Lru/ozon/app/android/analytics/modules/tokenized/CustomParamsModifier;", "modifyAnalyticsData", "(Ljava/util/List;)LWZ/e;", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "action", "", "voId", "", "send", "(Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;Ljava/util/List;J)V", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ApplyFiltersAnalyticDelegate {
    private final e modifyAnalyticsData(List<String> selectedIds) {
        return new IO.a(C2454a.b("filterValue", C7714v.V(selectedIds, ",", null, null, null, 62)), 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g modifyAnalyticsData$lambda$0(Map map, UZ.a aVar, g params) {
        Intrinsics.checkNotNullParameter(aVar, "<unused var>");
        Intrinsics.checkNotNullParameter(params, "params");
        return g.a(params, map, null, 2);
    }

    public final void send(@NotNull ComposerReferences refs, @NotNull AtomAction.ComposerAction action, @NotNull List<String> selectedIds, long voId) {
        t mapToTokenizedEvent$default;
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(selectedIds, "selectedIds");
        Map<String, TokenizedTrackingInfo> trackingInfo = action.getTrackingInfo();
        if (trackingInfo == null || (mapToTokenizedEvent$default = TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(voId), null, 2, null)) == null) {
            return;
        }
        TokenizedAnalyticsExtensionsKt.processComposerEvents(refs.getTokenizedAnalytics(), mapToTokenizedEvent$default, modifyAnalyticsData(selectedIds));
    }
}
