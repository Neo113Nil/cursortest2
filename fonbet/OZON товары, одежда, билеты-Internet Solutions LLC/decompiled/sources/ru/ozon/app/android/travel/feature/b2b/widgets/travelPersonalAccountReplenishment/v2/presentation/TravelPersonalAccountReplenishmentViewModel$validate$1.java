package ru.ozon.app.android.travel.feature.b2b.widgets.travelPersonalAccountReplenishment.v2.presentation;

import Sc.s;
import Wc.a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.b2b.widgets.travelPersonalAccountReplenishment.v2.presentation.TravelPersonalAccountReplenishmentViewModel$validate$1", f = "TravelPersonalAccountReplenishmentViewModel.kt", l = {141}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class TravelPersonalAccountReplenishmentViewModel$validate$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ int $convertedAmount;
    final /* synthetic */ String $inputKey;
    final /* synthetic */ String $link;
    final /* synthetic */ Map<String, String> $params;
    final /* synthetic */ String $validateOnlyKey;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ TravelPersonalAccountReplenishmentViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TravelPersonalAccountReplenishmentViewModel$validate$1(TravelPersonalAccountReplenishmentViewModel travelPersonalAccountReplenishmentViewModel, String str, String str2, int i11, Map<String, String> map, String str3, d<? super TravelPersonalAccountReplenishmentViewModel$validate$1> dVar) {
        super(2, dVar);
        this.this$0 = travelPersonalAccountReplenishmentViewModel;
        this.$inputKey = str;
        this.$validateOnlyKey = str2;
        this.$convertedAmount = i11;
        this.$params = map;
        this.$link = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        TravelPersonalAccountReplenishmentViewModel$validate$1 travelPersonalAccountReplenishmentViewModel$validate$1 = new TravelPersonalAccountReplenishmentViewModel$validate$1(this.this$0, this.$inputKey, this.$validateOnlyKey, this.$convertedAmount, this.$params, this.$link, dVar);
        travelPersonalAccountReplenishmentViewModel$validate$1.L$0 = obj;
        return travelPersonalAccountReplenishmentViewModel$validate$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Map prepareValidationParams;
        Object helperPerformAction;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            M m11 = (M) this.L$0;
            prepareValidationParams = this.this$0.prepareValidationParams(this.$inputKey, this.$validateOnlyKey, String.valueOf(this.$convertedAmount), this.$params);
            TravelPersonalAccountReplenishmentViewModel travelPersonalAccountReplenishmentViewModel = this.this$0;
            String str = this.$link;
            this.label = 1;
            helperPerformAction = travelPersonalAccountReplenishmentViewModel.helperPerformAction(m11, str, prepareValidationParams, this);
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
        return ((TravelPersonalAccountReplenishmentViewModel$validate$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
