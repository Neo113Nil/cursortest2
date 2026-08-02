package ru.ozon.app.android.fresh.navigation.onboarding.analytics;

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
/* loaded from: classes12.dex */
final class FreshTabOnBoardingAnalytics$trackFreshTabOnBoardingScreenViewed$1 extends AbstractC7737t implements Function1<BackwardCompatibleAnalyticsDataLayer, Unit> {
    public static final FreshTabOnBoardingAnalytics$trackFreshTabOnBoardingScreenViewed$1 INSTANCE = new FreshTabOnBoardingAnalytics$trackFreshTabOnBoardingScreenViewed$1();

    FreshTabOnBoardingAnalytics$trackFreshTabOnBoardingScreenViewed$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(BackwardCompatibleAnalyticsDataLayer backwardCompatibleAnalyticsDataLayer) {
        invoke2(backwardCompatibleAnalyticsDataLayer);
        return Unit.f71690a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(BackwardCompatibleAnalyticsDataLayer sendEventAsync) {
        Intrinsics.checkNotNullParameter(sendEventAsync, "$this$sendEventAsync");
        String str = null;
        Long l11 = null;
        Long l12 = null;
        Long l13 = null;
        String str2 = null;
        Long l14 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        EventEntity.Widget widget = new EventEntity.Widget(null, "onbording_express", str, null, null, l11, null, l12, l13, null, str2, l14, null, str3, str4, str5, null, null, str6, null, 1048573, null);
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        Object[] objArr3 = 0 == true ? 1 : 0;
        Object[] objArr4 = 0 == true ? 1 : 0;
        Object[] objArr5 = 0 == true ? 1 : 0;
        Object[] objArr6 = 0 == true ? 1 : 0;
        Object[] objArr7 = 0 == true ? 1 : 0;
        Object[] objArr8 = 0 == true ? 1 : 0;
        Object[] objArr9 = 0 == true ? 1 : 0;
        sendEventAsync.setOzonTrackerEvent(new AnalyticsDataLayer.OzonTrackerEvent(ActionType.VIEW.INSTANCE, new EventEntity.Obj("widget", str, objArr2, objArr3, l11, objArr4, l12, l13, objArr5, str2, l14, objArr6, str3, str4, str5, objArr7, objArr8, str6, objArr9, null, objArr, null, null, null, null, null, null, null, null, null, null, 2147483646, null), null, widget, null, 20, null));
    }
}
