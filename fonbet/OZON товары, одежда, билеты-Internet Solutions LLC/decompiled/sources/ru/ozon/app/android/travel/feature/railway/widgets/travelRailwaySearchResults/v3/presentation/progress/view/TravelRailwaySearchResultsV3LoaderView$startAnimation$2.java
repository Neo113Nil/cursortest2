package ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v3.presentation.progress.view;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v3.presentation.progress.view.TravelRailwaySearchResultsV3LoaderView$startAnimation$2", f = "TravelRailwaySearchResultsV3LoaderView.kt", l = {68}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class TravelRailwaySearchResultsV3LoaderView$startAnimation$2 extends j implements Function2<M, d<? super Unit>, Object> {
    int label;
    final /* synthetic */ TravelRailwaySearchResultsV3LoaderView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TravelRailwaySearchResultsV3LoaderView$startAnimation$2(TravelRailwaySearchResultsV3LoaderView travelRailwaySearchResultsV3LoaderView, d<? super TravelRailwaySearchResultsV3LoaderView$startAnimation$2> dVar) {
        super(2, dVar);
        this.this$0 = travelRailwaySearchResultsV3LoaderView;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new TravelRailwaySearchResultsV3LoaderView$startAnimation$2(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object updateAnim;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            TravelRailwaySearchResultsV3LoaderView travelRailwaySearchResultsV3LoaderView = this.this$0;
            this.label = 1;
            updateAnim = travelRailwaySearchResultsV3LoaderView.updateAnim(this);
            if (updateAnim == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((TravelRailwaySearchResultsV3LoaderView$startAnimation$2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
