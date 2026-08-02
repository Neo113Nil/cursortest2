package ru.ozon.app.android.fresh.feature.b2b.widgets.legals.registration.presentation;

import Ae.w0;
import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.registration.presentation.RegistrationViewModel;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.fresh.feature.b2b.widgets.legals.registration.presentation.RegistrationViewModel$updateAddress$1", f = "RegistrationViewModel.kt", l = {62}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class RegistrationViewModel$updateAddress$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ String $address;
    int label;
    final /* synthetic */ RegistrationViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RegistrationViewModel$updateAddress$1(RegistrationViewModel registrationViewModel, String str, d<? super RegistrationViewModel$updateAddress$1> dVar) {
        super(2, dVar);
        this.this$0 = registrationViewModel;
        this.$address = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new RegistrationViewModel$updateAddress$1(this.this$0, this.$address, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        w0 w0Var;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            w0Var = this.this$0._events;
            RegistrationViewModel.UIEvent.AddressUpdate addressUpdate = new RegistrationViewModel.UIEvent.AddressUpdate(this.$address);
            this.label = 1;
            if (w0Var.emit(addressUpdate, this) == aVar) {
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
        return ((RegistrationViewModel$updateAddress$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
