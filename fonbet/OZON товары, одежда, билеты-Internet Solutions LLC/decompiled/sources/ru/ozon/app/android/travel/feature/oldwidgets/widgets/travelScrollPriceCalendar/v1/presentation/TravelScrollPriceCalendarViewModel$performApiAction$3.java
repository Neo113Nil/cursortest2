package ru.ozon.app.android.travel.feature.oldwidgets.widgets.travelScrollPriceCalendar.v1.presentation;

import Lm0.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.logger.LoggerExtKt;
import ru.ozon.app.android.travel.actionhandler.utils.extensions.ActionV2RepositoryError;
import ru.ozon.app.android.travel.feature.oldwidgets.widgets.travelScrollPriceCalendar.v1.presentation.TravelScrollPriceCalendarViewModel;
import ru.ozon.app.android.travel.logger.TravelActionLogger;
import ru.ozon.app.android.utils.buildUtils.BuildUtils;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class TravelScrollPriceCalendarViewModel$performApiAction$3 extends AbstractC7737t implements Function1<Throwable, Unit> {
    final /* synthetic */ TravelScrollPriceCalendarViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TravelScrollPriceCalendarViewModel$performApiAction$3(TravelScrollPriceCalendarViewModel travelScrollPriceCalendarViewModel) {
        super(1);
        this.this$0 = travelScrollPriceCalendarViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
        invoke2(th2);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th2) {
        Throwable th3;
        Intrinsics.f(th2);
        if (th2 instanceof ActionV2RepositoryError) {
            TravelActionLogger.INSTANCE.logException(th2, "travel_travelScrollPriceCalendar1_action");
            th3 = th2;
        } else {
            th3 = th2;
            LoggerExtKt.sendNonFatal$default(th3, null, "travel_travelScrollPriceCalendar1_action", null, 10, null);
        }
        BuildUtils buildUtils = BuildUtils.INSTANCE;
        if (buildUtils.isQaFlavor() || buildUtils.isDebug()) {
            a.b bVar = a.f17149a;
            bVar.b("travel_travelScrollPriceCalendar1_action");
            bVar.e(th3);
        }
        this.this$0.getActionLiveData().setValue(TravelScrollPriceCalendarViewModel.Action.Error.INSTANCE);
    }
}
