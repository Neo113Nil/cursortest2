package ru.ozon.app.android.storefront.widgets.fashionOnboarding.analytics;

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
/* loaded from: classes2.dex */
final class FashionTabOnBoardingAnalytics$trackOnBoardingBackgroundClicked$1 extends AbstractC7737t implements Function1<BackwardCompatibleAnalyticsDataLayer, Unit> {
    public static final FashionTabOnBoardingAnalytics$trackOnBoardingBackgroundClicked$1 INSTANCE = new FashionTabOnBoardingAnalytics$trackOnBoardingBackgroundClicked$1();

    FashionTabOnBoardingAnalytics$trackOnBoardingBackgroundClicked$1() {
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
        Long l11 = null;
        String str = null;
        EventEntity.Widget widget = new EventEntity.Widget(null, "onboarding_fashion", null, null, null, l11, null, null, null, null, null, null, null, null, str, null, null, null, null, null, 1048573, null);
        Long l12 = null;
        Long l13 = null;
        Long l14 = null;
        Long l15 = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        Object[] objArr3 = 0 == true ? 1 : 0;
        Object[] objArr4 = 0 == true ? 1 : 0;
        Object[] objArr5 = 0 == true ? 1 : 0;
        Object[] objArr6 = 0 == true ? 1 : 0;
        Object[] objArr7 = 0 == true ? 1 : 0;
        Object[] objArr8 = 0 == true ? 1 : 0;
        Object[] objArr9 = 0 == true ? 1 : 0;
        Object[] objArr10 = 0 == true ? 1 : 0;
        Object[] objArr11 = 0 == true ? 1 : 0;
        Object[] objArr12 = 0 == true ? 1 : 0;
        Object[] objArr13 = 0 == true ? 1 : 0;
        Object[] objArr14 = 0 == true ? 1 : 0;
        Object[] objArr15 = 0 == true ? 1 : 0;
        Object[] objArr16 = 0 == true ? 1 : 0;
        Object[] objArr17 = 0 == true ? 1 : 0;
        EventEntity.Obj obj = new EventEntity.Obj("ui", objArr2, objArr3, objArr4, l11, objArr5, objArr6, objArr7, objArr8, objArr9, objArr10, objArr11, objArr12, str, objArr13, objArr14, objArr15, objArr16, objArr17, l12, objArr, null, l13, l14, l15, null, null, str2, null, str3, str4, 2147483646, null);
        Object[] objArr18 = 0 == true ? 1 : 0;
        Object[] objArr19 = 0 == true ? 1 : 0;
        Object[] objArr20 = 0 == true ? 1 : 0;
        Object[] objArr21 = 0 == true ? 1 : 0;
        Object[] objArr22 = 0 == true ? 1 : 0;
        Object[] objArr23 = 0 == true ? 1 : 0;
        Object[] objArr24 = 0 == true ? 1 : 0;
        Object[] objArr25 = 0 == true ? 1 : 0;
        Object[] objArr26 = 0 == true ? 1 : 0;
        Object[] objArr27 = 0 == true ? 1 : 0;
        Object[] objArr28 = 0 == true ? 1 : 0;
        Object[] objArr29 = 0 == true ? 1 : 0;
        Object[] objArr30 = 0 == true ? 1 : 0;
        Object[] objArr31 = 0 == true ? 1 : 0;
        Object[] objArr32 = 0 == true ? 1 : 0;
        Object[] objArr33 = 0 == true ? 1 : 0;
        Object[] objArr34 = 0 == true ? 1 : 0;
        Object[] objArr35 = 0 == true ? 1 : 0;
        Object[] objArr36 = 0 == true ? 1 : 0;
        Object[] objArr37 = 0 == true ? 1 : 0;
        Object[] objArr38 = 0 == true ? 1 : 0;
        Object[] objArr39 = 0 == true ? 1 : 0;
        sendEventAsync.setOzonTrackerEvent(new AnalyticsDataLayer.OzonTrackerEvent(ActionType.CLICK.INSTANCE, obj, new EventEntity.Properties(objArr19, objArr20, objArr21, l11, objArr22, objArr23, objArr24, objArr25, objArr26, objArr27, objArr28, objArr29, str, objArr30, objArr31, objArr32, objArr33, objArr34, l12, objArr18, objArr36, l13, l14, l15, objArr37, objArr38, str2, objArr39, str3, str4, null, objArr35, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, "page", null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, 16381, null), widget, null, 16, null));
    }
}
