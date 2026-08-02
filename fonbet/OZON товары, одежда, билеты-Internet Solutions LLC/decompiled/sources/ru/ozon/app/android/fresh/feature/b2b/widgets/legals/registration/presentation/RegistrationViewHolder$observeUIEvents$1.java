package ru.ozon.app.android.fresh.feature.b2b.widgets.legals.registration.presentation;

import Sc.o;
import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.h;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.common.LegalRouter;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.registration.presentation.RegistrationViewModel;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "event", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/presentation/RegistrationViewModel$UIEvent;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.fresh.feature.b2b.widgets.legals.registration.presentation.RegistrationViewHolder$observeUIEvents$1", f = "RegistrationViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class RegistrationViewHolder$observeUIEvents$1 extends j implements Function2<RegistrationViewModel.UIEvent, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ RegistrationViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RegistrationViewHolder$observeUIEvents$1(RegistrationViewHolder registrationViewHolder, d<? super RegistrationViewHolder$observeUIEvents$1> dVar) {
        super(2, dVar);
        this.this$0 = registrationViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        RegistrationViewHolder$observeUIEvents$1 registrationViewHolder$observeUIEvents$1 = new RegistrationViewHolder$observeUIEvents$1(this.this$0, dVar);
        registrationViewHolder$observeUIEvents$1.L$0 = obj;
        return registrationViewHolder$observeUIEvents$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        RegistrationView registrationView;
        Function1 function1;
        LegalRouter legalRouter;
        RegistrationView registrationView2;
        RegistrationView registrationView3;
        RegistrationViewModel registrationViewModel;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        RegistrationViewModel.UIEvent uIEvent = (RegistrationViewModel.UIEvent) this.L$0;
        if (uIEvent instanceof RegistrationViewModel.UIEvent.AddressUpdate) {
            registrationView3 = this.this$0.containerView;
            InputFieldView input = registrationView3.getInput(FormPageDTO.Field.FIELD_TYPE_ADDRESS);
            if ((input != null ? input.getInputText() : null) != null) {
                input.setInputText(((RegistrationViewModel.UIEvent.AddressUpdate) uIEvent).getValue());
            }
            registrationViewModel = this.this$0.viewModel;
            registrationViewModel.getPostCodeByAddress(((RegistrationViewModel.UIEvent.AddressUpdate) uIEvent).getValue());
        } else if (uIEvent instanceof RegistrationViewModel.UIEvent.PostCodeUpdate) {
            registrationView2 = this.this$0.containerView;
            InputFieldView input2 = registrationView2.getInput("postCode");
            if (input2 != null) {
                RegistrationViewModel.UIEvent.PostCodeUpdate postCodeUpdate = (RegistrationViewModel.UIEvent.PostCodeUpdate) uIEvent;
                if (h.K(postCodeUpdate.getValue())) {
                    input2.disableInput();
                } else {
                    input2.setInputText(postCodeUpdate.getValue());
                }
            }
        } else if (uIEvent instanceof RegistrationViewModel.UIEvent.Notification) {
            this.this$0.showNotificationBar(((RegistrationViewModel.UIEvent.Notification) uIEvent).getValue());
            legalRouter = this.this$0.router;
            legalRouter.openHome();
        } else if (uIEvent instanceof RegistrationViewModel.UIEvent.Navigation) {
            function1 = this.this$0.actionHandler;
            function1.invoke(AtomActionMapperKt.toAtomAction(((RegistrationViewModel.UIEvent.Navigation) uIEvent).getAction(), null));
        } else if (uIEvent instanceof RegistrationViewModel.UIEvent.NetworkError) {
            RegistrationViewModel.UIEvent.NetworkError networkError = (RegistrationViewModel.UIEvent.NetworkError) uIEvent;
            NotificationDTO notification = networkError.getNotification();
            if (notification != null) {
                this.this$0.showNotificationBar(notification);
            } else {
                this.this$0.showErrorMessage(networkError.getMessage());
            }
        } else {
            if (!(uIEvent instanceof RegistrationViewModel.UIEvent.InputsError)) {
                throw new o();
            }
            registrationView = this.this$0.containerView;
            registrationView.showErrors(((RegistrationViewModel.UIEvent.InputsError) uIEvent).getErrors());
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(RegistrationViewModel.UIEvent uIEvent, d<? super Unit> dVar) {
        return ((RegistrationViewHolder$observeUIEvents$1) create(uIEvent, dVar)).invokeSuspend(Unit.f71690a);
    }
}
