package ru.ozon.app.android.payment.ui.createorder;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.analytics.datalayer.AnalyticsDataLayer;
import ru.ozon.app.android.analytics.modules.BackwardCompatibleAnalyticsDataLayer;
import ru.ozon.tracker.model.EventEntity;
import ru.ozon.tracker.sendEvent.ActionType;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lru/ozon/app/android/analytics/modules/BackwardCompatibleAnalyticsDataLayer;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class CreateAndPayAnalytics$sendGooglePayCanceledEvent$1 extends AbstractC7737t implements Function1<BackwardCompatibleAnalyticsDataLayer, Unit> {
    public static final CreateAndPayAnalytics$sendGooglePayCanceledEvent$1 INSTANCE = new CreateAndPayAnalytics$sendGooglePayCanceledEvent$1();

    CreateAndPayAnalytics$sendGooglePayCanceledEvent$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(BackwardCompatibleAnalyticsDataLayer backwardCompatibleAnalyticsDataLayer) {
        invoke2(backwardCompatibleAnalyticsDataLayer);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(BackwardCompatibleAnalyticsDataLayer sendEventAsync) {
        Intrinsics.checkNotNullParameter(sendEventAsync, "$this$sendEventAsync");
        sendEventAsync.setOzonTrackerEvent(new AnalyticsDataLayer.OzonTrackerEvent(ActionType.PAYMENT_FAILURE.INSTANCE, new EventEntity.Obj("google_pay", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2147483646, null), new EventEntity.Properties(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, "user_cancelled", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -129, 16383, null), null, null, 24, null));
    }
}
