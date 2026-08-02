package ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v3.presentation;

import Sc.s;
import Wc.a;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v3.presentation.DeliveryWidgetV3ViewModel$scheduleUpdate$1", f = "DeliveryWidgetV3ViewModel.kt", l = {113, 114}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class DeliveryWidgetV3ViewModel$scheduleUpdate$1 extends j implements Function2<M, d<? super Unit>, Object> {
    int label;
    final /* synthetic */ DeliveryWidgetV3ViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DeliveryWidgetV3ViewModel$scheduleUpdate$1(DeliveryWidgetV3ViewModel deliveryWidgetV3ViewModel, d<? super DeliveryWidgetV3ViewModel$scheduleUpdate$1> dVar) {
        super(2, dVar);
        this.this$0 = deliveryWidgetV3ViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new DeliveryWidgetV3ViewModel$scheduleUpdate$1(this.this$0, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004a, code lost:
    
        if (r7 == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0037, code lost:
    
        if (xe.Y.b(r4, r6) == r0) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object requestStateChange;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            DeliveryWidgetV3VO currentState = this.this$0.getCurrentState();
            if (currentState == null) {
                return Unit.f71690a;
            }
            long millis = TimeUnit.SECONDS.toMillis(currentState.getWidgetUpdatePeriod());
            this.label = 1;
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                return Unit.f71690a;
            }
            s.b(obj);
        }
        l20.d dVar = this.this$0.widgetInfoCache;
        if (dVar != null) {
            DeliveryWidgetV3ViewModel deliveryWidgetV3ViewModel = this.this$0;
            this.label = 2;
            requestStateChange = deliveryWidgetV3ViewModel.requestStateChange(dVar, true, this);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((DeliveryWidgetV3ViewModel$scheduleUpdate$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
