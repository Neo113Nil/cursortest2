package ru.ozon.app.android.geo.map.performance;

import Sc.s;
import Wc.a;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "", "", "tilesLoaded", "pins"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.geo.map.performance.MapPerformanceAnalyticsManager$startObservation$2", f = "MapPerformanceAnalyticsManager.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class MapPerformanceAnalyticsManager$startObservation$2 extends j implements InterfaceC6511n<Boolean, Integer, d<? super Pair<? extends Integer, ? extends Boolean>>, Object> {
    /* synthetic */ int I$0;
    /* synthetic */ boolean Z$0;
    int label;

    MapPerformanceAnalyticsManager$startObservation$2(d<? super MapPerformanceAnalyticsManager$startObservation$2> dVar) {
        super(3, dVar);
    }

    @Override // fd.InterfaceC6511n
    public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Integer num, d<? super Pair<? extends Integer, ? extends Boolean>> dVar) {
        return invoke(bool.booleanValue(), num.intValue(), (d<? super Pair<Integer, Boolean>>) dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        return new Pair(new Integer(this.I$0), Boolean.valueOf(this.Z$0));
    }

    public final Object invoke(boolean z11, int i11, d<? super Pair<Integer, Boolean>> dVar) {
        MapPerformanceAnalyticsManager$startObservation$2 mapPerformanceAnalyticsManager$startObservation$2 = new MapPerformanceAnalyticsManager$startObservation$2(dVar);
        mapPerformanceAnalyticsManager$startObservation$2.Z$0 = z11;
        mapPerformanceAnalyticsManager$startObservation$2.I$0 = i11;
        return mapPerformanceAnalyticsManager$startObservation$2.invokeSuspend(Unit.f71690a);
    }
}
