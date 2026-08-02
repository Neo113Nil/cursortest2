package ru.ozon.app.android.payment.ui.fastPay.linkFastPay;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "event", "Lru/ozon/app/android/payment/ui/fastPay/linkFastPay/LinkFastPayEvent;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.payment.ui.fastPay.linkFastPay.LinkFastPayConfigurator$onComposerInitialized$1", f = "LinkFastPayConfigurator.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class LinkFastPayConfigurator$onComposerInitialized$1 extends j implements Function2<LinkFastPayEvent, d<? super Unit>, Object> {
    final /* synthetic */ LinkFastPayDelegate $fastPayDelegate;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LinkFastPayConfigurator$onComposerInitialized$1(LinkFastPayDelegate linkFastPayDelegate, d<? super LinkFastPayConfigurator$onComposerInitialized$1> dVar) {
        super(2, dVar);
        this.$fastPayDelegate = linkFastPayDelegate;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        LinkFastPayConfigurator$onComposerInitialized$1 linkFastPayConfigurator$onComposerInitialized$1 = new LinkFastPayConfigurator$onComposerInitialized$1(this.$fastPayDelegate, dVar);
        linkFastPayConfigurator$onComposerInitialized$1.L$0 = obj;
        return linkFastPayConfigurator$onComposerInitialized$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        this.$fastPayDelegate.processEvent$payment_prodGoogleAllVendorsRelease((LinkFastPayEvent) this.L$0);
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(LinkFastPayEvent linkFastPayEvent, d<? super Unit> dVar) {
        return ((LinkFastPayConfigurator$onComposerInitialized$1) create(linkFastPayEvent, dVar)).invokeSuspend(Unit.f71690a);
    }
}
