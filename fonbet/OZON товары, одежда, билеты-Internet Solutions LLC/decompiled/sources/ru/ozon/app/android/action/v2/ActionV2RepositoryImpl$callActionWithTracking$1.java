package ru.ozon.app.android.action.v2;

import W10.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.action.v2.models.ActionV2Response;

/* JADX INFO: Add missing generic type declarations: [D] */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u0002H\u0002 \u0005*\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u00040\u0004H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "D", "it", "Lru/ozon/app/android/action/v2/models/ActionV2Response;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/action/v2/models/ActionV2Response;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class ActionV2RepositoryImpl$callActionWithTracking$1<D> extends AbstractC7737t implements Function1<ActionV2Response<D>, Unit> {
    final /* synthetic */ c $widgetTrackingData;
    final /* synthetic */ ActionV2RepositoryImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ActionV2RepositoryImpl$callActionWithTracking$1(ActionV2RepositoryImpl actionV2RepositoryImpl, c cVar) {
        super(1);
        this.this$0 = actionV2RepositoryImpl;
        this.$widgetTrackingData = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
        invoke((ActionV2Response) obj);
        return Unit.f71690a;
    }

    public final void invoke(ActionV2Response<D> actionV2Response) {
        ActionV2RepositoryImpl actionV2RepositoryImpl = this.this$0;
        Intrinsics.f(actionV2Response);
        actionV2RepositoryImpl.sendAnalytics(actionV2Response, this.$widgetTrackingData);
    }
}
