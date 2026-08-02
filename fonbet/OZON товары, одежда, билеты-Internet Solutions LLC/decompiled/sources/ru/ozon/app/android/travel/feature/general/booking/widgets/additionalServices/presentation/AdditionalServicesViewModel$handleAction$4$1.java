package ru.ozon.app.android.travel.feature.general.booking.widgets.additionalServices.presentation;

import Sc.s;
import Wc.a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.travel.feature.general.booking.widgets.additionalServices.presentation.cell.AdditionalServicesCellVO;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.general.booking.widgets.additionalServices.presentation.AdditionalServicesViewModel$handleAction$4$1", f = "AdditionalServicesViewModel.kt", l = {294}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class AdditionalServicesViewModel$handleAction$4$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ String $asyncData;
    final /* synthetic */ AdditionalServicesCellVO $cell;
    final /* synthetic */ Map<String, Object> $params;
    int label;
    final /* synthetic */ AdditionalServicesViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdditionalServicesViewModel$handleAction$4$1(AdditionalServicesViewModel additionalServicesViewModel, String str, Map<String, ? extends Object> map, AdditionalServicesCellVO additionalServicesCellVO, d<? super AdditionalServicesViewModel$handleAction$4$1> dVar) {
        super(2, dVar);
        this.this$0 = additionalServicesViewModel;
        this.$asyncData = str;
        this.$params = map;
        this.$cell = additionalServicesCellVO;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new AdditionalServicesViewModel$handleAction$4$1(this.this$0, this.$asyncData, this.$params, this.$cell, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Map map;
        Object fetchWithJobsMap;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            AdditionalServicesViewModel additionalServicesViewModel = this.this$0;
            String str = this.$asyncData;
            Map<String, Object> map2 = this.$params;
            AdditionalServicesCellVO additionalServicesCellVO = this.$cell;
            map = additionalServicesViewModel.tariffsFetchJobs;
            this.label = 1;
            fetchWithJobsMap = additionalServicesViewModel.fetchWithJobsMap(str, map2, additionalServicesCellVO, map, this);
            if (fetchWithJobsMap == aVar) {
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
        return ((AdditionalServicesViewModel$handleAction$4$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
