package ru.ozon.app.android.pdp.ui.configurators.ugc.reviewForm;

import RZ.b;
import RZ.c;
import UZ.d;
import WZ.e;
import WZ.g;
import WZ.l;
import WZ.m;
import WZ.t;
import WZ.x;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.ConfiguratorReferences;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "submitActionData", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewForm/SubmitActionPendingData;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewForm/SubmitActionPendingData;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class SubmitCachedReviewConfigurator$onComposerInitialized$2 extends AbstractC7737t implements Function1<SubmitActionPendingData, Unit> {
    final /* synthetic */ ConfiguratorReferences $references;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubmitCachedReviewConfigurator$onComposerInitialized$2(ConfiguratorReferences configuratorReferences) {
        super(1);
        this.$references = configuratorReferences;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g invoke$lambda$2$lambda$1$lambda$0(SubmitActionPendingData submitActionPendingData, UZ.a aVar, g params) {
        Intrinsics.checkNotNullParameter(aVar, "<unused var>");
        Intrinsics.checkNotNullParameter(params, "params");
        return g.a(params, submitActionPendingData.getCustomTrackingInfo(), null, 2);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(SubmitActionPendingData submitActionPendingData) {
        invoke2(submitActionPendingData);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(final SubmitActionPendingData submitActionPendingData) {
        b pageAnalyticsInfo;
        t b11;
        Long widgetId = submitActionPendingData.getWidgetId();
        if (widgetId == null || (pageAnalyticsInfo = submitActionPendingData.getPageAnalyticsInfo()) == null) {
            return;
        }
        l tokenizedAnalytics = this.$references.getTokenizedAnalytics();
        tokenizedAnalytics.b(U.i(new Pair(widgetId, new c(submitActionPendingData.getWidgetToken()))));
        tokenizedAnalytics.c(U.i(new Pair(widgetId, pageAnalyticsInfo)));
        Map<String, TokenizedTrackingInfo> submitActionTrackingInfo = submitActionPendingData.getSubmitActionTrackingInfo();
        if (submitActionTrackingInfo == null || (b11 = x.b(submitActionTrackingInfo, widgetId, null)) == null) {
            return;
        }
        m.a(tokenizedAnalytics, b11, new e() { // from class: ru.ozon.app.android.pdp.ui.configurators.ugc.reviewForm.a
            @Override // WZ.e
            public final g modifyParams(UZ.a aVar, g gVar) {
                g invoke$lambda$2$lambda$1$lambda$0;
                invoke$lambda$2$lambda$1$lambda$0 = SubmitCachedReviewConfigurator$onComposerInitialized$2.invoke$lambda$2$lambda$1$lambda$0(SubmitActionPendingData.this, (d) aVar, gVar);
                return invoke$lambda$2$lambda$1$lambda$0;
            }
        });
    }
}
