package ru.ozon.app.android.geo.map.performance;

import Sc.s;
import Wc.a;
import i10.k;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import l10.i;
import ru.ozon.composer.ui.widget.l;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lkotlin/Pair;", "", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.geo.map.performance.MapPerformanceAnalyticsManager$startObservation$4", f = "MapPerformanceAnalyticsManager.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class MapPerformanceAnalyticsManager$startObservation$4 extends j implements Function2<Pair<? extends Integer, ? extends Boolean>, d<? super Unit>, Object> {
    int label;
    final /* synthetic */ MapPerformanceAnalyticsManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MapPerformanceAnalyticsManager$startObservation$4(MapPerformanceAnalyticsManager mapPerformanceAnalyticsManager, d<? super MapPerformanceAnalyticsManager$startObservation$4> dVar) {
        super(2, dVar);
        this.this$0 = mapPerformanceAnalyticsManager;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new MapPerformanceAnalyticsManager$startObservation$4(this.this$0, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Pair<? extends Integer, ? extends Boolean> pair, d<? super Unit> dVar) {
        return invoke2((Pair<Integer, Boolean>) pair, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        i iVar;
        String d11;
        MapPerformanceAnalyticsSender mapPerformanceAnalyticsSender;
        i iVar2;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        iVar = this.this$0.container;
        k.a<l> e11 = iVar.J().r().b().e();
        if (e11 != null && (d11 = e11.d()) != null) {
            MapPerformanceAnalyticsManager mapPerformanceAnalyticsManager = this.this$0;
            mapPerformanceAnalyticsSender = mapPerformanceAnalyticsManager.mapPerformanceAnalyticsSender;
            iVar2 = mapPerformanceAnalyticsManager.container;
            mapPerformanceAnalyticsSender.sendAnalytics(d11, iVar2.J().r().b().l().j());
        }
        this.this$0.needSendAnalytics = false;
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Pair<Integer, Boolean> pair, d<? super Unit> dVar) {
        return ((MapPerformanceAnalyticsManager$startObservation$4) create(pair, dVar)).invokeSuspend(Unit.f71690a);
    }
}
