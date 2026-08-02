package ru.ozon.app.android.travel.feature.general.common.widgets.pricesHistogram.v1.presentation;

import WZ.l;
import WZ.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0018\u0010\u0003\u001a\u0014 \u0002*\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u00010\u0000j\u0002`\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "kotlin.jvm.PlatformType", "event", "", "invoke", "(LWZ/t;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class PricesHistogramWidgetViewHolder$observeAction$7 extends AbstractC7737t implements Function1<t, Unit> {
    final /* synthetic */ PricesHistogramWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PricesHistogramWidgetViewHolder$observeAction$7(PricesHistogramWidgetViewHolder pricesHistogramWidgetViewHolder) {
        super(1);
        this.this$0 = pricesHistogramWidgetViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(t tVar) {
        invoke2(tVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(t tVar) {
        l lVar;
        lVar = this.this$0.tokenizedAnalytics;
        Intrinsics.f(tVar);
        TokenizedAnalyticsExtensionsKt.processClickEvents$default(lVar, tVar, null, 2, null);
    }
}
