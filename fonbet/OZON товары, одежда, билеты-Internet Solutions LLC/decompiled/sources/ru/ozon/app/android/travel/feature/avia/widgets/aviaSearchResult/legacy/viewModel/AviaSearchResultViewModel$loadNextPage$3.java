package ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.viewModel;

import Lm0.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.logger.LoggerExtKt;
import ru.ozon.app.android.travel.actionhandler.utils.extensions.ActionV2RepositoryError;
import ru.ozon.app.android.travel.logger.TravelActionLogger;
import ru.ozon.app.android.utils.buildUtils.BuildUtils;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "e", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
final class AviaSearchResultViewModel$loadNextPage$3 extends AbstractC7737t implements Function1<Throwable, Unit> {
    final /* synthetic */ AviaSearchResultViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AviaSearchResultViewModel$loadNextPage$3(AviaSearchResultViewModel aviaSearchResultViewModel) {
        super(1);
        this.this$0 = aviaSearchResultViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
        invoke2(th2);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable e11) {
        Throwable th2;
        Intrinsics.checkNotNullParameter(e11, "e");
        if (e11 instanceof ActionV2RepositoryError) {
            TravelActionLogger.INSTANCE.logException(e11, "travel_aviaSearchResult3_paging");
            th2 = e11;
        } else {
            th2 = e11;
            LoggerExtKt.sendNonFatal$default(th2, null, "travel_aviaSearchResult3_paging", null, 10, null);
        }
        BuildUtils buildUtils = BuildUtils.INSTANCE;
        if (buildUtils.isQaFlavor() || buildUtils.isDebug()) {
            a.b bVar = a.f17149a;
            bVar.b("travel_aviaSearchResult3_paging");
            bVar.e(th2);
        }
        this.this$0.isPaginationCompleted = true;
        this.this$0.isLoadingNextPage = false;
    }
}
