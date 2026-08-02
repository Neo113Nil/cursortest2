package ru.ozon.app.android.travel.feature.general.common.widgets.servicePackageCarousel.v1.presentation;

import Sc.s;
import Wc.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.travel.feature.general.common.widgets.servicePackageCarousel.v1.presentation.ServicePackageCarouselVO;
import ru.ozon.app.android.travel.feature.general.common.widgets.servicePackageCarousel.v1.view.ServicePackageCarouselView;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, d2 = {"<anonymous>", "", "it", "", "Lru/ozon/app/android/travel/feature/general/common/widgets/servicePackageCarousel/v1/presentation/ServicePackageCarouselVO$ServicePackageCarouselCardVO;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.travel.feature.general.common.widgets.servicePackageCarousel.v1.presentation.ServicePackageCarouselWidgetViewHolder$onAttachViewModel$1", f = "ServicePackageCarouselWidgetViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ServicePackageCarouselWidgetViewHolder$onAttachViewModel$1 extends j implements Function2<List<? extends ServicePackageCarouselVO.ServicePackageCarouselCardVO>, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ServicePackageCarouselWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ServicePackageCarouselWidgetViewHolder$onAttachViewModel$1(ServicePackageCarouselWidgetViewHolder servicePackageCarouselWidgetViewHolder, d<? super ServicePackageCarouselWidgetViewHolder$onAttachViewModel$1> dVar) {
        super(2, dVar);
        this.this$0 = servicePackageCarouselWidgetViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        ServicePackageCarouselWidgetViewHolder$onAttachViewModel$1 servicePackageCarouselWidgetViewHolder$onAttachViewModel$1 = new ServicePackageCarouselWidgetViewHolder$onAttachViewModel$1(this.this$0, dVar);
        servicePackageCarouselWidgetViewHolder$onAttachViewModel$1.L$0 = obj;
        return servicePackageCarouselWidgetViewHolder$onAttachViewModel$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(List<? extends ServicePackageCarouselVO.ServicePackageCarouselCardVO> list, d<? super Unit> dVar) {
        return invoke2((List<ServicePackageCarouselVO.ServicePackageCarouselCardVO>) list, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ServicePackageCarouselView servicePackageCarouselView;
        Function1<? super AtomAction, Unit> function1;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        List<ServicePackageCarouselVO.ServicePackageCarouselCardVO> list = (List) this.L$0;
        servicePackageCarouselView = this.this$0.view;
        function1 = this.this$0.actionHandler;
        servicePackageCarouselView.setupCardsList(list, function1);
        this.this$0.trackActiveCardView(list);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(List<ServicePackageCarouselVO.ServicePackageCarouselCardVO> list, d<? super Unit> dVar) {
        return ((ServicePackageCarouselWidgetViewHolder$onAttachViewModel$1) create(list, dVar)).invokeSuspend(Unit.f71690a);
    }
}
