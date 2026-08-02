package ru.ozon.app.android.fresh.feature.b2b.widgets.changeEmail.presentation;

import Sc.o;
import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import l10.InterfaceC7851b;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.fresh.feature.b2b.widgets.changeEmail.presentation.ChangeEmailViewModel;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/app/android/fresh/feature/b2b/widgets/changeEmail/presentation/ChangeEmailViewModel$Action;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.fresh.feature.b2b.widgets.changeEmail.presentation.ChangeEmailViewHolder$onAttachViewModel$2", f = "ChangeEmailViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class ChangeEmailViewHolder$onAttachViewModel$2 extends j implements Function2<ChangeEmailViewModel.Action, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ChangeEmailViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChangeEmailViewHolder$onAttachViewModel$2(ChangeEmailViewHolder changeEmailViewHolder, d<? super ChangeEmailViewHolder$onAttachViewModel$2> dVar) {
        super(2, dVar);
        this.this$0 = changeEmailViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        ChangeEmailViewHolder$onAttachViewModel$2 changeEmailViewHolder$onAttachViewModel$2 = new ChangeEmailViewHolder$onAttachViewModel$2(this.this$0, dVar);
        changeEmailViewHolder$onAttachViewModel$2.L$0 = obj;
        return changeEmailViewHolder$onAttachViewModel$2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ComposerReferences composerReferences;
        ChangeEmailView changeEmailView;
        ChangeEmailView changeEmailView2;
        ChangeEmailView changeEmailView3;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        ChangeEmailViewModel.Action action = (ChangeEmailViewModel.Action) this.L$0;
        if (action instanceof ChangeEmailViewModel.Action.ShowError) {
            changeEmailView2 = this.this$0.view;
            changeEmailView2.showError(((ChangeEmailViewModel.Action.ShowError) action).getMessage());
            changeEmailView3 = this.this$0.view;
            changeEmailView3.clearInput();
        } else if (action instanceof ChangeEmailViewModel.Action.RefreshWithParams) {
            composerReferences = this.this$0.composerReferences;
            InterfaceC7851b.a.a(composerReferences.getController(), null, null, ((ChangeEmailViewModel.Action.RefreshWithParams) action).getParams(), null, 11);
            changeEmailView = this.this$0.view;
            changeEmailView.clearInputAndError();
        } else {
            if (!(action instanceof ChangeEmailViewModel.Action.ShowNotification)) {
                throw new o();
            }
            this.this$0.showNotificationBar(((ChangeEmailViewModel.Action.ShowNotification) action).getNotification());
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ChangeEmailViewModel.Action action, d<? super Unit> dVar) {
        return ((ChangeEmailViewHolder$onAttachViewModel$2) create(action, dVar)).invokeSuspend(Unit.f71690a);
    }
}
