package ru.ozon.app.android.payment.ui.createorder;

import He.c;
import Sc.o;
import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.checkoutgeo.payment.sberpay.AuthorizePaymentDO;
import ru.ozon.app.android.checkoutgeo.payment.sberpay.MobilePaymentToken;
import ru.ozon.app.android.utils.Result;
import ru.ozon.app.android.utils.ResultKt;
import xe.C10720e0;
import xe.C10727i;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.payment.ui.createorder.CreateAndPayViewModel$handlePaymentSuccess$1", f = "CreateAndPayViewModel.kt", l = {366, 367}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class CreateAndPayViewModel$handlePaymentSuccess$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ String $paymentInformation;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CreateAndPayViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CreateAndPayViewModel$handlePaymentSuccess$1(CreateAndPayViewModel createAndPayViewModel, String str, d<? super CreateAndPayViewModel$handlePaymentSuccess$1> dVar) {
        super(2, dVar);
        this.this$0 = createAndPayViewModel;
        this.$paymentInformation = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        CreateAndPayViewModel$handlePaymentSuccess$1 createAndPayViewModel$handlePaymentSuccess$1 = new CreateAndPayViewModel$handlePaymentSuccess$1(this.this$0, this.$paymentInformation, dVar);
        createAndPayViewModel$handlePaymentSuccess$1.L$0 = obj;
        return createAndPayViewModel$handlePaymentSuccess$1;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(2:33|(1:(7:36|37|15|16|(1:18)(2:21|(1:23)(2:24|25))|19|20)(2:38|39))(2:40|41))(4:3|4|5|(2:7|8))|10|11|12|13|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0081, code lost:
    
        if (r12 == r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0092, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00af  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Throwable th2;
        CreateAndPayViewModel$handlePaymentSuccess$1 createAndPayViewModel$handlePaymentSuccess$1;
        CreateAndPayViewModel createAndPayViewModel;
        Object failure;
        CreateAndPayRepository createAndPayRepository;
        CreateAndPayViewModelState createAndPayViewModelState;
        CreateAndPayViewModelState createAndPayViewModelState2;
        CreateAndPayViewModelState createAndPayViewModelState3;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 != 0) {
            try {
            } catch (Throwable th3) {
                th2 = th3;
                createAndPayViewModel$handlePaymentSuccess$1 = this;
                failure = new Result.Failure(th2);
                if (!(failure instanceof Result.Success)) {
                }
                return Unit.f71690a;
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                createAndPayViewModel$handlePaymentSuccess$1 = this;
                failure = new Result.Success((AuthorizePaymentDO) ResultKt.getOrThrow((Result) obj));
                if (!(failure instanceof Result.Success)) {
                    createAndPayViewModel$handlePaymentSuccess$1.this$0.processAuthorizeResponse((AuthorizePaymentDO) ((Result.Success) failure).getValue());
                } else {
                    if (!(failure instanceof Result.Failure)) {
                        throw new o();
                    }
                    createAndPayViewModel$handlePaymentSuccess$1.this$0.sendCriticalError(((Result.Failure) failure).getThrowable());
                    createAndPayViewModel$handlePaymentSuccess$1.this$0.sendHideLoader();
                }
                return Unit.f71690a;
            }
            createAndPayViewModel = (CreateAndPayViewModel) this.L$0;
            s.b(obj);
        } else {
            s.b(obj);
            CreateAndPayViewModel.sendShowLoader$default(this.this$0, null, 1, null);
            createAndPayViewModel = this.this$0;
            String str = this.$paymentInformation;
            try {
                c a11 = C10720e0.a();
                CreateAndPayViewModel$handlePaymentSuccess$1$result$1$token$1 createAndPayViewModel$handlePaymentSuccess$1$result$1$token$1 = new CreateAndPayViewModel$handlePaymentSuccess$1$result$1$token$1(createAndPayViewModel, str, null);
                this.L$0 = createAndPayViewModel;
                this.label = 1;
                obj = C10727i.f(a11, createAndPayViewModel$handlePaymentSuccess$1$result$1$token$1, this);
                if (obj == aVar) {
                    return aVar;
                }
            } catch (Throwable th4) {
                th = th4;
                createAndPayViewModel$handlePaymentSuccess$1 = this;
                th2 = th;
                failure = new Result.Failure(th2);
                if (!(failure instanceof Result.Success)) {
                }
                return Unit.f71690a;
            }
        }
        MobilePaymentToken mobilePaymentToken = (MobilePaymentToken) obj;
        createAndPayRepository = createAndPayViewModel.repository;
        createAndPayViewModelState = createAndPayViewModel.vmState;
        String orderNumber = createAndPayViewModelState.getLastGooglePayInfo().getOrderNumber();
        createAndPayViewModelState2 = createAndPayViewModel.vmState;
        String paymentToken = createAndPayViewModelState2.getLastGooglePayInfo().getPaymentToken();
        createAndPayViewModelState3 = createAndPayViewModel.vmState;
        String authorizeComposerActionName = createAndPayViewModelState3.getLastGooglePayInfo().getAuthorizeComposerActionName();
        this.L$0 = null;
        this.label = 2;
        createAndPayViewModel$handlePaymentSuccess$1 = this;
        obj = createAndPayRepository.processGooglePay(orderNumber, paymentToken, authorizeComposerActionName, mobilePaymentToken, createAndPayViewModel$handlePaymentSuccess$1);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((CreateAndPayViewModel$handlePaymentSuccess$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
