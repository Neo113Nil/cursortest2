package ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.viewModel;

import Lm0.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.logger.LoggerExtKt;
import ru.ozon.app.android.travel.actionhandler.utils.extensions.ActionV2RepositoryError;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.presentation.AviaSearchResultVO;
import ru.ozon.app.android.travel.logger.TravelActionLogger;
import ru.ozon.app.android.utils.buildUtils.BuildUtils;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "error", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
final class AviaSearchResultViewModel$selectLuggage$5 extends AbstractC7737t implements Function1<Throwable, Unit> {
    final /* synthetic */ AviaSearchResultVO.AviaSearchResultItemVO.Flight $oldItem;
    final /* synthetic */ AviaSearchResultViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AviaSearchResultViewModel$selectLuggage$5(AviaSearchResultViewModel aviaSearchResultViewModel, AviaSearchResultVO.AviaSearchResultItemVO.Flight flight) {
        super(1);
        this.this$0 = aviaSearchResultViewModel;
        this.$oldItem = flight;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
        invoke2(th2);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable error) {
        Throwable th2;
        Intrinsics.checkNotNullParameter(error, "error");
        if (error instanceof ActionV2RepositoryError) {
            TravelActionLogger.INSTANCE.logException(error, "travel_aviaSearchResult3_luggage");
            th2 = error;
        } else {
            th2 = error;
            LoggerExtKt.sendNonFatal$default(th2, null, "travel_aviaSearchResult3_luggage", null, 10, null);
        }
        BuildUtils buildUtils = BuildUtils.INSTANCE;
        if (buildUtils.isQaFlavor() || buildUtils.isDebug()) {
            a.b bVar = a.f17149a;
            bVar.b("travel_aviaSearchResult3_luggage");
            bVar.e(th2);
        }
        AviaSearchResultViewModel aviaSearchResultViewModel = this.this$0;
        AviaSearchResultVO.AviaSearchResultItemVO.Flight flight = this.$oldItem;
        flight.setProgressVisible(false);
        aviaSearchResultViewModel.updateItem(flight, true);
    }
}
