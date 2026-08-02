package ru.ozon.app.android.monetization.widgets.achievementsList.presentation;

import WZ.l;
import WZ.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class AchievementsListAnalyticsWidgetKt$AchievementsListAnalyticsWidget$1$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ AchievementsListAnalyticsVO $state;
    final /* synthetic */ l $tokenizedAnalytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AchievementsListAnalyticsWidgetKt$AchievementsListAnalyticsWidget$1$1(AchievementsListAnalyticsVO achievementsListAnalyticsVO, l lVar) {
        super(0);
        this.$state = achievementsListAnalyticsVO;
        this.$tokenizedAnalytics = lVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        t viewTokenizedEvent = this.$state.getViewTokenizedEvent();
        if (viewTokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.$tokenizedAnalytics, viewTokenizedEvent, null, 2, null);
        }
    }
}
