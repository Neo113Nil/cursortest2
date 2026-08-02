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
import ru.ozon.app.android.travel.feature.b2b.widgets.travelPersonalAccountReplenishment.v2.data.TravelPersonalAccountReplenishmentApi;
import ru.ozon.app.android.travel.feature.b2b.widgets.travelPersonalAccountReplenishment.v2.data.TravelPersonalAccountReplenishmentMapper;
import ru.ozon.app.android.travel.feature.b2b.widgets.travelPersonalAccountReplenishment.v2.data.TravelPersonalAccountReplenishmentResponse;
import ru.ozon.app.android.travel.feature.b2b.widgets.travelPersonalAccountReplenishment.v2.presentation.TravelPersonalAccountReplenishmentViewModel;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "Lru/ozon/app/android/travel/feature/b2b/widgets/travelPersonalAccountReplenishment/v2/presentation/TravelPersonalAccountReplenishmentViewModel$Result;", "<anonymous>", "(Lxe/M;)Lru/ozon/app/android/travel/feature/b2b/widgets/travelPersonalAccountReplenishment/v2/presentation/TravelPersonalAccountReplenishmentViewModel$Result;"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.b2b.widgets.travelPersonalAccountReplenishment.v2.presentation.TravelPersonalAccountReplenishmentViewModel$helperPerformAction$2$result$1", f = "TravelPersonalAccountReplenishmentViewModel.kt", l = {169}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class TravelPersonalAccountReplenishmentViewModel$helperPerformAction$2$result$1 extends j implements Function2<M, d<? super TravelPersonalAccountReplenishmentViewModel.Result>, Object> {
    final /* synthetic */ String $link;
    final /* synthetic */ Map<String, Object> $params;
    int label;
    final /* synthetic */ TravelPersonalAccountReplenishmentViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TravelPersonalAccountReplenishmentViewModel$helperPerformAction$2$result$1(TravelPersonalAccountReplenishmentViewModel travelPersonalAccountReplenishmentViewModel, String str, Map<String, ? extends Object> map, d<? super TravelPersonalAccountReplenishmentViewModel$helperPerformAction$2$result$1> dVar) {
        super(2, dVar);
        this.this$0 = travelPersonalAccountReplenishmentViewModel;
        this.$link = str;
        this.$params = map;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new TravelPersonalAccountReplenishmentViewModel$helperPerformAction$2$result$1(this.this$0, this.$link, this.$params, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        TravelPersonalAccountReplenishmentApi travelPersonalAccountReplenishmentApi;
        TravelPersonalAccountReplenishmentMapper travelPersonalAccountReplenishmentMapper;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            travelPersonalAccountReplenishmentApi = this.this$0.api;
            String str = this.$link;
            Map<String, Object> map = this.$params;
            this.label = 1;
            obj = travelPersonalAccountReplenishmentApi.performAction(str, map, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        TravelPersonalAccountReplenishmentResponse travelPersonalAccountReplenishmentResponse = (TravelPersonalAccountReplenishmentResponse) obj;
        if (travelPersonalAccountReplenishmentResponse.getAction() != null) {
            return new TravelPersonalAccountReplenishmentViewModel.Result.Success(AtomActionMapperKt.toAtomAction(travelPersonalAccountReplenishmentResponse.getAction(), null));
        }
        travelPersonalAccountReplenishmentMapper = this.this$0.mapper;
        return new TravelPersonalAccountReplenishmentViewModel.Result.InputError(travelPersonalAccountReplenishmentMapper.mapErrors(travelPersonalAccountReplenishmentResponse.getSum().getErrors()));
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super TravelPersonalAccountReplenishmentViewModel.Result> dVar) {
        return ((TravelPersonalAccountReplenishmentViewModel$helperPerformAction$2$result$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
