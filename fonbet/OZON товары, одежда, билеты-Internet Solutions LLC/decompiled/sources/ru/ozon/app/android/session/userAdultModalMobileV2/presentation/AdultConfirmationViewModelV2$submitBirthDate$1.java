package ru.ozon.app.android.session.userAdultModalMobileV2.presentation;

import Ae.x0;
import Sc.s;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.session.userAdultModalMobileV2.presentation.BirthdateStateUi;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.session.userAdultModalMobileV2.presentation.AdultConfirmationViewModelV2$submitBirthDate$1", f = "AdultConfirmationViewModelV2.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class AdultConfirmationViewModelV2$submitBirthDate$1 extends j implements Function2<M, d<? super Unit>, Object> {
    int label;
    final /* synthetic */ AdultConfirmationViewModelV2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdultConfirmationViewModelV2$submitBirthDate$1(AdultConfirmationViewModelV2 adultConfirmationViewModelV2, d<? super AdultConfirmationViewModelV2$submitBirthDate$1> dVar) {
        super(2, dVar);
        this.this$0 = adultConfirmationViewModelV2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new AdultConfirmationViewModelV2$submitBirthDate$1(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        x0 x0Var;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        x0Var = this.this$0.state;
        x0Var.setValue(BirthdateStateUi.Loading.INSTANCE);
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((AdultConfirmationViewModelV2$submitBirthDate$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
