package ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v3.presentation;

import Sc.r;
import Sc.s;
import Wc.a;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v3.domain.DeliveryWidgetV3Repository;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v3/presentation/DeliveryWidgetV3VO;", "<anonymous>", "(Lxe/M;)Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v3/presentation/DeliveryWidgetV3VO;"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v3.presentation.DeliveryWidgetV3ViewModel$requestStateChange$newState$1", f = "DeliveryWidgetV3ViewModel.kt", l = {152}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class DeliveryWidgetV3ViewModel$requestStateChange$newState$1 extends j implements Function2<M, d<? super DeliveryWidgetV3VO>, Object> {
    final /* synthetic */ l20.d $info;
    final /* synthetic */ boolean $isTimerUpdate;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DeliveryWidgetV3ViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DeliveryWidgetV3ViewModel$requestStateChange$newState$1(DeliveryWidgetV3ViewModel deliveryWidgetV3ViewModel, l20.d dVar, boolean z11, d<? super DeliveryWidgetV3ViewModel$requestStateChange$newState$1> dVar2) {
        super(2, dVar2);
        this.this$0 = deliveryWidgetV3ViewModel;
        this.$info = dVar;
        this.$isTimerUpdate = z11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        DeliveryWidgetV3ViewModel$requestStateChange$newState$1 deliveryWidgetV3ViewModel$requestStateChange$newState$1 = new DeliveryWidgetV3ViewModel$requestStateChange$newState$1(this.this$0, this.$info, this.$isTimerUpdate, dVar);
        deliveryWidgetV3ViewModel$requestStateChange$newState$1.L$0 = obj;
        return deliveryWidgetV3ViewModel$requestStateChange$newState$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object a11;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        try {
            if (i11 == 0) {
                s.b(obj);
                DeliveryWidgetV3ViewModel deliveryWidgetV3ViewModel = this.this$0;
                l20.d dVar = this.$info;
                boolean z11 = this.$isTimerUpdate;
                r.Companion companion = r.INSTANCE;
                DeliveryWidgetV3Repository repository = deliveryWidgetV3ViewModel.getRepository();
                this.label = 1;
                obj = repository.requestAsyncUpdate(dVar, z11, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            a11 = (DeliveryWidgetV3VO) obj;
            r.Companion companion2 = r.INSTANCE;
        } catch (Throwable th2) {
            r.Companion companion3 = r.INSTANCE;
            a11 = s.a(th2);
        }
        Throwable b11 = r.b(a11);
        if (b11 != null && !(b11 instanceof CancellationException)) {
            Lm0.a.f17149a.e(b11);
        }
        if (a11 instanceof r.b) {
            return null;
        }
        return a11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super DeliveryWidgetV3VO> dVar) {
        return ((DeliveryWidgetV3ViewModel$requestStateChange$newState$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
