package ru.ozon.app.android.travel.feature.b2b.widgets.b2bCreditOfferCard.presentation;

import S0.InterfaceC3978p0;
import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.b2b.widgets.b2bCreditOfferCard.presentation.B2bCreditOfferCardContentKt$B2bCreditOfferCardContent$2$1", f = "B2bCreditOfferCardContent.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class B2bCreditOfferCardContentKt$B2bCreditOfferCardContent$2$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ Function1<AtomAction, Unit> $actionHandler;
    final /* synthetic */ InterfaceC3978p0<Boolean> $isActionFired$delegate;
    final /* synthetic */ B2bCreditOfferCardVI $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    B2bCreditOfferCardContentKt$B2bCreditOfferCardContent$2$1(B2bCreditOfferCardVI b2bCreditOfferCardVI, Function1<? super AtomAction, Unit> function1, InterfaceC3978p0<Boolean> interfaceC3978p0, d<? super B2bCreditOfferCardContentKt$B2bCreditOfferCardContent$2$1> dVar) {
        super(2, dVar);
        this.$state = b2bCreditOfferCardVI;
        this.$actionHandler = function1;
        this.$isActionFired$delegate = interfaceC3978p0;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new B2bCreditOfferCardContentKt$B2bCreditOfferCardContent$2$1(this.$state, this.$actionHandler, this.$isActionFired$delegate, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        boolean B2bCreditOfferCardContent$lambda$3;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        B2bCreditOfferCardContent$lambda$3 = B2bCreditOfferCardContentKt.B2bCreditOfferCardContent$lambda$3(this.$isActionFired$delegate);
        if (!B2bCreditOfferCardContent$lambda$3 && this.$state.getAction() != null) {
            this.$actionHandler.invoke(this.$state.getAction());
            B2bCreditOfferCardContentKt.B2bCreditOfferCardContent$lambda$4(this.$isActionFired$delegate, true);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((B2bCreditOfferCardContentKt$B2bCreditOfferCardContent$2$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
