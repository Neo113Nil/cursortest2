package ru.ozon.app.android.session.userAdultModalMobile;

import WZ.t;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.composer.ui.widget.f;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\u0011\u001a\u00020\u0010*\u00060\u0004j\u0002`\u00052\n\u0010\b\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\n\u001a\u00020\t2\n\u0010\r\u001a\u00060\u000bj\u0002`\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012JK\u0010\u001a\u001a\u00020\u00102\n\u0010\u0013\u001a\u00060\u0004j\u0002`\u00052\n\u0010\u0016\u001a\u00060\u0014j\u0002`\u00152\u000e\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00072\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017¢\u0006\u0004\b\u001a\u0010\u001bR$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0016\u0010\"\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/ozon/app/android/session/userAdultModalMobile/ViewAnalyticSenderDelegate;", "", "<init>", "()V", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "Lru/ozon/composer/ui/widget/f;", "Lru/ozon/app/android/tools/ViewedPond;", "viewedPond", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "", "widgetId", "", "processViewEvent", "(Ll20/c;Lru/ozon/composer/ui/widget/f;Lru/ozon/app/android/composer/ComposerReferences;LWZ/t;Ljava/lang/String;)V", "vo", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "trackViewScreen", "(Ll20/c;LW10/c;Lru/ozon/composer/ui/widget/f;Ljava/util/Map;)V", "Lru/ozon/app/android/composer/ComposerReferences;", "getComposerReferences", "()Lru/ozon/app/android/composer/ComposerReferences;", "setComposerReferences", "(Lru/ozon/app/android/composer/ComposerReferences;)V", "", "analyticIsSended", "Z", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ViewAnalyticSenderDelegate {
    private boolean analyticIsSended;
    private ComposerReferences composerReferences;

    private final void processViewEvent(c cVar, f fVar, ComposerReferences composerReferences, t tVar, String str) {
        if (fVar.c(str)) {
            return;
        }
        fVar.d(Long.valueOf(cVar.getId()), str);
        TokenizedAnalyticsExtensionsKt.processViewEvents$default(composerReferences.getTokenizedAnalytics(), tVar, null, 2, null);
    }

    public final void setComposerReferences(ComposerReferences composerReferences) {
        this.composerReferences = composerReferences;
    }

    public final void trackViewScreen(@NotNull c vo, @NotNull W10.c trackingData, f viewedPond, Map<String, TokenizedTrackingInfo> trackingInfo) {
        ComposerReferences composerReferences;
        t tokenizedEvent$default;
        String c11;
        Intrinsics.checkNotNullParameter(vo, "vo");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        if (this.analyticIsSended) {
            return;
        }
        this.analyticIsSended = true;
        if (viewedPond == null || (composerReferences = this.composerReferences) == null || trackingInfo == null || (tokenizedEvent$default = TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(vo.getId()), null, 2, null)) == null || (c11 = trackingData.c()) == null) {
            return;
        }
        String str = !h.K(c11) ? c11 : null;
        if (str == null) {
            return;
        }
        processViewEvent(vo, viewedPond, composerReferences, tokenizedEvent$default, str);
    }
}
