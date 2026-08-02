package ru.ozon.app.android.geo.pvzSearcher;

import WZ.t;
import WZ.x;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.uni.android.flashbar.model.Restriction;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class PvzSearcherActionObserver$showRestriction$2$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ Restriction $restriction;
    final /* synthetic */ Long $widgetId;
    final /* synthetic */ PvzSearcherActionObserver this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PvzSearcherActionObserver$showRestriction$2$1(Restriction restriction, Long l11, PvzSearcherActionObserver pvzSearcherActionObserver) {
        super(0);
        this.$restriction = restriction;
        this.$widgetId = l11;
        this.this$0 = pvzSearcherActionObserver;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ComposerReferences composerReferences;
        Map<String, TokenizedTrackingInfo> trackingInfo = this.$restriction.getTrackingInfo();
        if (trackingInfo != null) {
            Long l11 = this.$widgetId;
            Intrinsics.checkNotNullParameter(trackingInfo, "<this>");
            t b11 = x.b(trackingInfo, l11, null);
            if (b11 != null) {
                composerReferences = this.this$0.references;
                TokenizedAnalyticsExtensionsKt.processIgnoreViewPoolViewEvents$default(composerReferences.getTokenizedAnalytics(), b11, null, 2, null);
            }
        }
    }
}
