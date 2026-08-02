package ru.ozon.app.android.payment.ui.createorder;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.checkoutgeo.payment.GooglePayManager;
import ru.ozon.app.android.checkoutgeo.payment.sberpay.MobilePaymentToken;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "Lru/ozon/app/android/checkoutgeo/payment/sberpay/MobilePaymentToken;", "<anonymous>", "(Lxe/M;)Lru/ozon/app/android/checkoutgeo/payment/sberpay/MobilePaymentToken;"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.payment.ui.createorder.CreateAndPayViewModel$handlePaymentSuccess$1$result$1$token$1", f = "CreateAndPayViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class CreateAndPayViewModel$handlePaymentSuccess$1$result$1$token$1 extends j implements Function2<M, d<? super MobilePaymentToken>, Object> {
    final /* synthetic */ String $paymentInformation;
    int label;
    final /* synthetic */ CreateAndPayViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CreateAndPayViewModel$handlePaymentSuccess$1$result$1$token$1(CreateAndPayViewModel createAndPayViewModel, String str, d<? super CreateAndPayViewModel$handlePaymentSuccess$1$result$1$token$1> dVar) {
        super(2, dVar);
        this.this$0 = createAndPayViewModel;
        this.$paymentInformation = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new CreateAndPayViewModel$handlePaymentSuccess$1$result$1$token$1(this.this$0, this.$paymentInformation, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        GooglePayManager googlePayManager;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        googlePayManager = this.this$0.googlePayManager;
        return googlePayManager.getMobilePaymentToken(this.$paymentInformation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super MobilePaymentToken> dVar) {
        return ((CreateAndPayViewModel$handlePaymentSuccess$1$result$1$token$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
