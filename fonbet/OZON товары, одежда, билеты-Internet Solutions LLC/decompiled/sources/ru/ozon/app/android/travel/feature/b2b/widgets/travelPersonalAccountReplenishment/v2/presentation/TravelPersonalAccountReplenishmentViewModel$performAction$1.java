package ru.ozon.app.android.travel.feature.b2b.widgets.travelPersonalAccountReplenishment.v2.presentation;

import Sc.s;
import Wc.a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.b2b.widgets.travelPersonalAccountReplenishment.v2.presentation.TravelPersonalAccountReplenishmentViewModel$performAction$1", f = "TravelPersonalAccountReplenishmentViewModel.kt", l = {120}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class TravelPersonalAccountReplenishmentViewModel$performAction$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ String $link;
    final /* synthetic */ Map<String, String> $params;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ TravelPersonalAccountReplenishmentViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TravelPersonalAccountReplenishmentViewModel$performAction$1(TravelPersonalAccountReplenishmentViewModel travelPersonalAccountReplenishmentViewModel, String str, Map<String, String> map, d<? super TravelPersonalAccountReplenishmentViewModel$performAction$1> dVar) {
        super(2, dVar);
        this.this$0 = travelPersonalAccountReplenishmentViewModel;
        this.$link = str;
        this.$params = map;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        TravelPersonalAccountReplenishmentViewModel$performAction$1 travelPersonalAccountReplenishmentViewModel$performAction$1 = new TravelPersonalAccountReplenishmentViewModel$performAction$1(this.this$0, this.$link, this.$params, dVar);
        travelPersonalAccountReplenishmentViewModel$performAction$1.L$0 = obj;
        return travelPersonalAccountReplenishmentViewModel$performAction$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object helperPerformAction;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            M m11 = (M) this.L$0;
            TravelPersonalAccountReplenishmentViewModel travelPersonalAccountReplenishmentViewModel = this.this$0;
            String str = this.$link;
            Map<String, String> map = this.$params;
            if (map == null) {
                map = U.c();
            }
            this.label = 1;
            helperPerformAction = travelPersonalAccountReplenishmentViewModel.helperPerformAction(m11, str, map, this);
            if (helperPerformAction == aVar) {
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
        return ((TravelPersonalAccountReplenishmentViewModel$performAction$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
