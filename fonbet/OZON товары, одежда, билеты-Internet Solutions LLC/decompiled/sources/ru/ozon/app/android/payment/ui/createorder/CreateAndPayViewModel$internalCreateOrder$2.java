package ru.ozon.app.android.payment.ui.createorder;

import Sc.o;
import Sc.s;
import W10.c;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.checkoutgeo.payment.sberpay.OrderDO;
import ru.ozon.app.android.payment.ui.createorder.highload.HighLoadProgressBar;
import ru.ozon.app.android.utils.Result;
import xe.B0;
import xe.C10727i;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.payment.ui.createorder.CreateAndPayViewModel$internalCreateOrder$2", f = "CreateAndPayViewModel.kt", l = {242, 247, 256}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class CreateAndPayViewModel$internalCreateOrder$2 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ String $actionName;
    final /* synthetic */ HighLoadProgressBar $item;
    final /* synthetic */ c $trackingData;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CreateAndPayViewModel this$0;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.payment.ui.createorder.CreateAndPayViewModel$internalCreateOrder$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function0<Unit> {
        final /* synthetic */ OrderDO $orderDO;
        final /* synthetic */ CreateAndPayViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(CreateAndPayViewModel createAndPayViewModel, OrderDO orderDO) {
            super(0);
            this.this$0 = createAndPayViewModel;
            this.$orderDO = orderDO;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.this$0.processOrderCreated(this.$orderDO);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.payment.ui.createorder.CreateAndPayViewModel$internalCreateOrder$2$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function0<Unit> {
        final /* synthetic */ Result<OrderDO> $result;
        final /* synthetic */ CreateAndPayViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(CreateAndPayViewModel createAndPayViewModel, Result<OrderDO> result) {
            super(0);
            this.this$0 = createAndPayViewModel;
            this.$result = result;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.this$0.sendCriticalError(((Result.Failure) this.$result).getThrowable());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CreateAndPayViewModel$internalCreateOrder$2(CreateAndPayViewModel createAndPayViewModel, String str, c cVar, HighLoadProgressBar highLoadProgressBar, d<? super CreateAndPayViewModel$internalCreateOrder$2> dVar) {
        super(2, dVar);
        this.this$0 = createAndPayViewModel;
        this.$actionName = str;
        this.$trackingData = cVar;
        this.$item = highLoadProgressBar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        CreateAndPayViewModel$internalCreateOrder$2 createAndPayViewModel$internalCreateOrder$2 = new CreateAndPayViewModel$internalCreateOrder$2(this.this$0, this.$actionName, this.$trackingData, this.$item, dVar);
        createAndPayViewModel$internalCreateOrder$2.L$0 = obj;
        return createAndPayViewModel$internalCreateOrder$2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0061, code lost:
    
        if (r14 == r0) goto L30;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        B0 c11;
        CreateAndPayRepository createAndPayRepository;
        CreateAndPayViewModel$internalCreateOrder$2 createAndPayViewModel$internalCreateOrder$2;
        Result result;
        OrderDO orderDO;
        OrderDO orderDO2;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            M m11 = (M) this.L$0;
            this.this$0.sendShowProgressBar();
            c11 = C10727i.c(m11, null, null, new CreateAndPayViewModel$internalCreateOrder$2$waitJob$1(this.$item, null), 3);
            createAndPayRepository = this.this$0.repository;
            String str = this.$actionName;
            c cVar = this.$trackingData;
            this.L$0 = c11;
            this.label = 1;
            createAndPayViewModel$internalCreateOrder$2 = this;
            obj = CreateAndPayRepository.createOrderOrPay$default(createAndPayRepository, str, cVar, null, createAndPayViewModel$internalCreateOrder$2, 4, null);
        } else {
            if (i11 != 1) {
                if (i11 == 2) {
                    orderDO2 = (OrderDO) this.L$0;
                    s.b(obj);
                    createAndPayViewModel$internalCreateOrder$2 = this;
                    orderDO = orderDO2;
                    CreateAndPayViewModel createAndPayViewModel = createAndPayViewModel$internalCreateOrder$2.this$0;
                    createAndPayViewModel.withHideProgressBar(new AnonymousClass1(createAndPayViewModel, orderDO));
                    return Unit.f71690a;
                }
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                result = (Result) this.L$0;
                s.b(obj);
                createAndPayViewModel$internalCreateOrder$2 = this;
                CreateAndPayViewModel createAndPayViewModel2 = createAndPayViewModel$internalCreateOrder$2.this$0;
                createAndPayViewModel2.withHideProgressBar(new AnonymousClass2(createAndPayViewModel2, result));
                return Unit.f71690a;
            }
            c11 = (B0) this.L$0;
            s.b(obj);
            createAndPayViewModel$internalCreateOrder$2 = this;
        }
        Result result2 = (Result) obj;
        if (result2 instanceof Result.Success) {
            createAndPayViewModel$internalCreateOrder$2.this$0.isActionInProgress = false;
            orderDO = (OrderDO) ((Result.Success) result2).getValue();
            if (!(orderDO instanceof OrderDO.OrderError)) {
                c11.j(null);
                CreateAndPayViewModel createAndPayViewModel3 = createAndPayViewModel$internalCreateOrder$2.this$0;
                createAndPayViewModel3.withHideProgressBar(new AnonymousClass1(createAndPayViewModel3, orderDO));
                return Unit.f71690a;
            }
            createAndPayViewModel$internalCreateOrder$2.L$0 = orderDO;
            createAndPayViewModel$internalCreateOrder$2.label = 2;
            if (c11.r0(this) != aVar) {
                orderDO2 = orderDO;
                orderDO = orderDO2;
                CreateAndPayViewModel createAndPayViewModel32 = createAndPayViewModel$internalCreateOrder$2.this$0;
                createAndPayViewModel32.withHideProgressBar(new AnonymousClass1(createAndPayViewModel32, orderDO));
                return Unit.f71690a;
            }
        } else {
            if (!(result2 instanceof Result.Failure)) {
                throw new o();
            }
            createAndPayViewModel$internalCreateOrder$2.this$0.isActionInProgress = false;
            createAndPayViewModel$internalCreateOrder$2.L$0 = result2;
            createAndPayViewModel$internalCreateOrder$2.label = 3;
            if (c11.r0(this) != aVar) {
                result = result2;
                CreateAndPayViewModel createAndPayViewModel22 = createAndPayViewModel$internalCreateOrder$2.this$0;
                createAndPayViewModel22.withHideProgressBar(new AnonymousClass2(createAndPayViewModel22, result));
                return Unit.f71690a;
            }
        }
        return aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((CreateAndPayViewModel$internalCreateOrder$2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
