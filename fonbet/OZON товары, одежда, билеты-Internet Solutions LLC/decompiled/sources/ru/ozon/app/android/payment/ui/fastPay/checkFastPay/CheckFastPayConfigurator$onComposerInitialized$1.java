package ru.ozon.app.android.payment.ui.fastPay.checkFastPay;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "event", "Lru/ozon/app/android/payment/ui/fastPay/checkFastPay/CheckFastPayEvent;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.payment.ui.fastPay.checkFastPay.CheckFastPayConfigurator$onComposerInitialized$1", f = "CheckFastPayConfigurator.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class CheckFastPayConfigurator$onComposerInitialized$1 extends j implements Function2<CheckFastPayEvent, d<? super Unit>, Object> {
    final /* synthetic */ CheckFastPayDelegate $fastPayDelegate;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CheckFastPayConfigurator$onComposerInitialized$1(CheckFastPayDelegate checkFastPayDelegate, d<? super CheckFastPayConfigurator$onComposerInitialized$1> dVar) {
        super(2, dVar);
        this.$fastPayDelegate = checkFastPayDelegate;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        CheckFastPayConfigurator$onComposerInitialized$1 checkFastPayConfigurator$onComposerInitialized$1 = new CheckFastPayConfigurator$onComposerInitialized$1(this.$fastPayDelegate, dVar);
        checkFastPayConfigurator$onComposerInitialized$1.L$0 = obj;
        return checkFastPayConfigurator$onComposerInitialized$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        this.$fastPayDelegate.processEvent$payment_prodGoogleAllVendorsRelease((CheckFastPayEvent) this.L$0);
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CheckFastPayEvent checkFastPayEvent, d<? super Unit> dVar) {
        return ((CheckFastPayConfigurator$onComposerInitialized$1) create(checkFastPayEvent, dVar)).invokeSuspend(Unit.f71690a);
    }
}
