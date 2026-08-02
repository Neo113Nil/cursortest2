package ru.ozon.app.android.fresh.geo.widgets.orderStatus.v3.presentation;

import He.b;
import Sc.s;
import Wc.a;
import com.google.protobuf.DescriptorProtos$FileOptions;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import xe.C10720e0;
import xe.C10727i;
import xe.M;

@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.fresh.geo.widgets.orderStatus.v3.presentation.OrderStatusV3ViewModel$timerStart$1", f = "OrderStatusV3ViewModel.kt", l = {DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class OrderStatusV3ViewModel$timerStart$1 extends j implements Function1<d<? super Unit>, Object> {
    int label;
    final /* synthetic */ OrderStatusV3ViewModel this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.fresh.geo.widgets.orderStatus.v3.presentation.OrderStatusV3ViewModel$timerStart$1$1", f = "OrderStatusV3ViewModel.kt", l = {DescriptorProtos$FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.fresh.geo.widgets.orderStatus.v3.presentation.OrderStatusV3ViewModel$timerStart$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<M, d<? super Unit>, Object> {
        int label;
        final /* synthetic */ OrderStatusV3ViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(OrderStatusV3ViewModel orderStatusV3ViewModel, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.this$0 = orderStatusV3ViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(this.this$0, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object refreshWidgetState;
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                s.b(obj);
                OrderStatusV3ViewModel orderStatusV3ViewModel = this.this$0;
                this.label = 1;
                refreshWidgetState = orderStatusV3ViewModel.refreshWidgetState(this);
                if (refreshWidgetState == aVar) {
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
            return ((AnonymousClass1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OrderStatusV3ViewModel$timerStart$1(OrderStatusV3ViewModel orderStatusV3ViewModel, d<? super OrderStatusV3ViewModel$timerStart$1> dVar) {
        super(1, dVar);
        this.this$0 = orderStatusV3ViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(d<?> dVar) {
        return new OrderStatusV3ViewModel$timerStart$1(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            C10720e0 c10720e0 = C10720e0.f105451a;
            b bVar = b.f10879b;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (C10727i.f(bVar, anonymousClass1, this) == aVar) {
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

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(d<? super Unit> dVar) {
        return ((OrderStatusV3ViewModel$timerStart$1) create(dVar)).invokeSuspend(Unit.f71690a);
    }
}
