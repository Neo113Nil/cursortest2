package ru.ozon.app.android.common.serviceCarousel.presentation;

import Sc.s;
import Wc.a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.common.serviceCarousel.data.ServiceCarouselApi;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.common.serviceCarousel.presentation.ServiceCarouselViewModel$trackFreshNewLabelClick$1", f = "ServiceCarouselViewModel.kt", l = {20}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class ServiceCarouselViewModel$trackFreshNewLabelClick$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ Map<String, String> $params;
    int label;
    final /* synthetic */ ServiceCarouselViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ServiceCarouselViewModel$trackFreshNewLabelClick$1(ServiceCarouselViewModel serviceCarouselViewModel, Map<String, String> map, d<? super ServiceCarouselViewModel$trackFreshNewLabelClick$1> dVar) {
        super(2, dVar);
        this.this$0 = serviceCarouselViewModel;
        this.$params = map;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new ServiceCarouselViewModel$trackFreshNewLabelClick$1(this.this$0, this.$params, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ServiceCarouselApi serviceCarouselApi;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        try {
            if (i11 == 0) {
                s.b(obj);
                serviceCarouselApi = this.this$0.api;
                Map<String, String> map = this.$params;
                this.label = 1;
                if (serviceCarouselApi.trackFreshNewLabelClick(map, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
        } catch (Exception e11) {
            Lm0.a.f17149a.e(e11);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((ServiceCarouselViewModel$trackFreshNewLabelClick$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
