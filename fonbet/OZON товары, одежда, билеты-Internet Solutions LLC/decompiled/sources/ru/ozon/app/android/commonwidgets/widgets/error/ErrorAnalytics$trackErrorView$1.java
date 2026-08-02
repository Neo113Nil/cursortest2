package ru.ozon.app.android.commonwidgets.widgets.error;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.analytics.datalayer.AnalyticsDataLayer;
import ru.ozon.app.android.analytics.modules.BackwardCompatibleAnalyticsDataLayer;
import ru.ozon.tracker.model.EventEntity;
import ru.ozon.tracker.sendEvent.ActionType;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lru/ozon/app/android/analytics/modules/BackwardCompatibleAnalyticsDataLayer;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class ErrorAnalytics$trackErrorView$1 extends AbstractC7737t implements Function1<BackwardCompatibleAnalyticsDataLayer, Unit> {
    final /* synthetic */ Integer $errorCode;
    final /* synthetic */ String $errorId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ErrorAnalytics$trackErrorView$1(String str, Integer num) {
        super(1);
        this.$errorId = str;
        this.$errorCode = num;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(BackwardCompatibleAnalyticsDataLayer backwardCompatibleAnalyticsDataLayer) {
        invoke2(backwardCompatibleAnalyticsDataLayer);
        return Unit.f71690a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(BackwardCompatibleAnalyticsDataLayer sendEventAsync) {
        EventEntity.Properties properties;
        Intrinsics.checkNotNullParameter(sendEventAsync, "$this$sendEventAsync");
        ActionType.Custom custom = new ActionType.Custom(TokenizedTrackingInfo.ACTION_ERROR_VIEW);
        String str = null;
        Long l11 = null;
        Long l12 = null;
        Long l13 = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Long l14 = null;
        EventEntity.Obj obj = new EventEntity.Obj("error", this.$errorId, null, str, null, null, l11, l12, l13, null, null, str2, null, null, str3, null, str4, null, l14, null, null, null, null, null, null, null, null, null, null, null, null, 2147483644, null);
        EventEntity.Widget widget = new EventEntity.Widget(null, "error.composerError", str, 0 == true ? 1 : 0, 0 == true ? 1 : 0, l11, l12, l13, 0 == true ? 1 : 0, 0 == true ? 1 : 0, str2, 0 == true ? 1 : 0, 0 == true ? 1 : 0, str3, 0 == true ? 1 : 0, str4, 0 == true ? 1 : 0, l14, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 1048573, 0 == true ? 1 : 0);
        Integer num = this.$errorCode;
        if (num != null) {
            properties = new EventEntity.Properties(null, null, null, null, null, null, null, null, Integer.valueOf(num.intValue()), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -257, -1, 16383, null);
        } else {
            properties = null;
        }
        sendEventAsync.setOzonTrackerEvent(new AnalyticsDataLayer.OzonTrackerEvent(custom, obj, properties, widget, null, 16, null));
    }
}
