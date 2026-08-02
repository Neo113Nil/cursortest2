package ru.ozon.app.android.yandexsearchsheet.data;

import W10.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.action.v2.analytic.ActionAnalyticDelegate;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.yandexsearchsheet.DetailsSuggest;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/action/v2/models/ActionV2Response;", "Lru/ozon/app/android/yandexsearchsheet/DetailsSuggest;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/action/v2/models/ActionV2Response;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class YandexSearchSheetRepository$getDetails$1 extends AbstractC7737t implements Function1<ActionV2Response<DetailsSuggest>, Unit> {
    final /* synthetic */ c $trackingData;
    final /* synthetic */ YandexSearchSheetRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    YandexSearchSheetRepository$getDetails$1(YandexSearchSheetRepository yandexSearchSheetRepository, c cVar) {
        super(1);
        this.this$0 = yandexSearchSheetRepository;
        this.$trackingData = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ActionV2Response<DetailsSuggest> actionV2Response) {
        invoke2(actionV2Response);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ActionV2Response<DetailsSuggest> actionV2Response) {
        ActionAnalyticDelegate actionAnalyticDelegate;
        actionAnalyticDelegate = this.this$0.actionAnalyticDelegate;
        DetailsSuggest data = actionV2Response.getData();
        actionAnalyticDelegate.sendAnalytics(data != null ? data.getTrackingInfo() : null, actionV2Response.getTrackingPayloads(), this.$trackingData);
    }
}
