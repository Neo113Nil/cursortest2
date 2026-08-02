package ru.ozon.app.android.autopicker.view.productpickersearch.presentation;

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
/* loaded from: classes11.dex */
final class ProductPickerSearchAnalytics$trackButton$1 extends AbstractC7737t implements Function1<BackwardCompatibleAnalyticsDataLayer, Unit> {
    final /* synthetic */ ButtonAnalyticsData $data;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProductPickerSearchAnalytics$trackButton$1(ButtonAnalyticsData buttonAnalyticsData) {
        super(1);
        this.$data = buttonAnalyticsData;
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
        String str2 = null;
        String str3 = null;
        Long l11 = null;
        Long l12 = null;
        Long l13 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
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
        Object[] objArr18 = 0 == true ? 1 : 0;
        Object[] objArr19 = 0 == true ? 1 : 0;
        sendEventAsync.setOzonTrackerEvent(new AnalyticsDataLayer.OzonTrackerEvent(ActionType.CLICK.INSTANCE, new EventEntity.Obj("ui", this.$data.getTrackingInfoId(), null, str, null, null, null, null, null, null, null, null, null, null, str2, null, str3, null, null, null, null, null, null, l11, l12, null, l13, str4, str5, null, str6, 2147483644, null), new EventEntity.Properties(null, str, objArr2, objArr3, objArr4, objArr5, objArr6, objArr7, objArr8, objArr9, objArr10, objArr11, str2, objArr12, str3, objArr13, objArr14, objArr15, objArr16, null, objArr17, l11, l12, objArr18, l13, str4, str5, objArr19, str6, this.$data.getStatus(), objArr, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, "button", null, null, null, null, null, null, null, null, null, null, null, null, -536870913, -1, 16381, null), new EventEntity.Widget(null, this.$data.getActionType(), str, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, str2, 0 == true ? 1 : 0, str3, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 1048573, 0 == true ? 1 : 0), null, 16, null));
    }
}
