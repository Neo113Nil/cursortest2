package ru.ozon.app.android.fresh.feature.b2b.widgets.legals.registration.presentation;

import Sc.o;
import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.registration.presentation.RegistrationViewModel;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "state", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/presentation/RegistrationViewModel$State;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.fresh.feature.b2b.widgets.legals.registration.presentation.RegistrationViewHolder$observeScreenState$1", f = "RegistrationViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class RegistrationViewHolder$observeScreenState$1 extends j implements Function2<RegistrationViewModel.State, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ RegistrationViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RegistrationViewHolder$observeScreenState$1(RegistrationViewHolder registrationViewHolder, d<? super RegistrationViewHolder$observeScreenState$1> dVar) {
        super(2, dVar);
        this.this$0 = registrationViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        RegistrationViewHolder$observeScreenState$1 registrationViewHolder$observeScreenState$1 = new RegistrationViewHolder$observeScreenState$1(this.this$0, dVar);
        registrationViewHolder$observeScreenState$1.L$0 = obj;
        return registrationViewHolder$observeScreenState$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        RegistrationView registrationView;
        RegistrationView registrationView2;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        RegistrationViewModel.State state = (RegistrationViewModel.State) this.L$0;
        if (state instanceof RegistrationViewModel.State.Idle) {
            registrationView2 = this.this$0.containerView;
            registrationView2.hideLoader();
        } else {
            if (!(state instanceof RegistrationViewModel.State.Loading)) {
                throw new o();
            }
            registrationView = this.this$0.containerView;
            registrationView.showLoader();
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(RegistrationViewModel.State state, d<? super Unit> dVar) {
        return ((RegistrationViewHolder$observeScreenState$1) create(state, dVar)).invokeSuspend(Unit.f71690a);
    }
}
