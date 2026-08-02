package ru.ozon.app.android.network.dependency;

import android.content.Context;
import gi.C6739a;
import gi.C6740b;
import hi.InterfaceC6958a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.analytics.di.AnalyticsComponentApi;
import ru.ozon.app.android.analytics.performance.PerformanceTrackerDelegate;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/analytics/performance/PerformanceTrackerDelegate;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class AntibotPerfAnalyticServiceImpl$performanceTrackerDelegate$2 extends AbstractC7737t implements Function0<PerformanceTrackerDelegate> {
    final /* synthetic */ AntibotPerfAnalyticServiceImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AntibotPerfAnalyticServiceImpl$performanceTrackerDelegate$2(AntibotPerfAnalyticServiceImpl antibotPerfAnalyticServiceImpl) {
        super(0);
        this.this$0 = antibotPerfAnalyticServiceImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final PerformanceTrackerDelegate invoke() {
        Context context;
        context = this.this$0.context;
        if (AnalyticsComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AnalyticsComponentApi is not DiComponent");
        }
        C6740b dependencyStorage = C6739a.a(context, AnalyticsComponentApi.class).getDependencyStorage();
        if (AnalyticsComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AnalyticsComponentApi is not DiComponent");
        }
        return ((AnalyticsComponentApi) dependencyStorage.b(AnalyticsComponentApi.class)).getPerformanceTrackerDelegate();
    }
}
