package ru.ozon.app.android.ugc.widgets.profileInputs.presentation;

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
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.ugc.databinding.WidgetProfileInputsBinding;
import ru.ozon.app.android.ugc.widgets.profileInputs.presentation.InputResult;
import ru.ozon.uni.android.cell.text.TextFieldCellView;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "result", "Lru/ozon/app/android/ugc/widgets/profileInputs/presentation/InputResult;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.ugc.widgets.profileInputs.presentation.ProfileInputsViewHolder$onAttachViewModel$1", f = "ProfileInputsViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ProfileInputsViewHolder$onAttachViewModel$1 extends j implements Function2<InputResult, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ProfileInputsViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProfileInputsViewHolder$onAttachViewModel$1(ProfileInputsViewHolder profileInputsViewHolder, d<? super ProfileInputsViewHolder$onAttachViewModel$1> dVar) {
        super(2, dVar);
        this.this$0 = profileInputsViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        ProfileInputsViewHolder$onAttachViewModel$1 profileInputsViewHolder$onAttachViewModel$1 = new ProfileInputsViewHolder$onAttachViewModel$1(this.this$0, dVar);
        profileInputsViewHolder$onAttachViewModel$1.L$0 = obj;
        return profileInputsViewHolder$onAttachViewModel$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        WidgetProfileInputsBinding widgetProfileInputsBinding;
        WidgetProfileInputsBinding widgetProfileInputsBinding2;
        Function1 function1;
        WidgetProfileInputsBinding widgetProfileInputsBinding3;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        InputResult inputResult = (InputResult) this.L$0;
        if (inputResult instanceof InputResult.InputError) {
            ProfileInputsViewHolder profileInputsViewHolder = this.this$0;
            widgetProfileInputsBinding3 = profileInputsViewHolder.binding;
            TextFieldCellView profileInputView = widgetProfileInputsBinding3.profileInputView;
            Intrinsics.checkNotNullExpressionValue(profileInputView, "profileInputView");
            profileInputsViewHolder.showError(profileInputView, ((InputResult.InputError) inputResult).getError());
        } else if (inputResult instanceof InputResult.NotificationError) {
            this.this$0.showNotification(((InputResult.NotificationError) inputResult).getErrorNotificationBar());
        } else if (inputResult instanceof InputResult.ChangeNameSuccess) {
            function1 = this.this$0.actionHandlerDismiss;
            function1.invoke(new AtomAction.DismissRefresh(null, null, null, null, null, null, 53, null));
        } else if (inputResult instanceof InputResult.Idle) {
            ProfileInputsViewHolder profileInputsViewHolder2 = this.this$0;
            widgetProfileInputsBinding2 = profileInputsViewHolder2.binding;
            TextFieldCellView profileInputView2 = widgetProfileInputsBinding2.profileInputView;
            Intrinsics.checkNotNullExpressionValue(profileInputView2, "profileInputView");
            profileInputsViewHolder2.showBottomLabelOrGone(profileInputView2, false);
        } else {
            if (!(inputResult instanceof InputResult.InputSuccess)) {
                throw new o();
            }
            ProfileInputsViewHolder profileInputsViewHolder3 = this.this$0;
            widgetProfileInputsBinding = profileInputsViewHolder3.binding;
            TextFieldCellView profileInputView3 = widgetProfileInputsBinding.profileInputView;
            Intrinsics.checkNotNullExpressionValue(profileInputView3, "profileInputView");
            profileInputsViewHolder3.showBottomLabelOrGone(profileInputView3, true);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InputResult inputResult, d<? super Unit> dVar) {
        return ((ProfileInputsViewHolder$onAttachViewModel$1) create(inputResult, dVar)).invokeSuspend(Unit.f71690a);
    }
}
