package ru.ozon.app.android.fresh.feature.b2b.widgets.changeEmail.presentation;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "seconds", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.fresh.feature.b2b.widgets.changeEmail.presentation.ChangeEmailViewHolder$onAttachViewModel$1", f = "ChangeEmailViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class ChangeEmailViewHolder$onAttachViewModel$1 extends j implements Function2<Integer, d<? super Unit>, Object> {
    /* synthetic */ int I$0;
    int label;
    final /* synthetic */ ChangeEmailViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChangeEmailViewHolder$onAttachViewModel$1(ChangeEmailViewHolder changeEmailViewHolder, d<? super ChangeEmailViewHolder$onAttachViewModel$1> dVar) {
        super(2, dVar);
        this.this$0 = changeEmailViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        ChangeEmailViewHolder$onAttachViewModel$1 changeEmailViewHolder$onAttachViewModel$1 = new ChangeEmailViewHolder$onAttachViewModel$1(this.this$0, dVar);
        changeEmailViewHolder$onAttachViewModel$1.I$0 = ((Number) obj).intValue();
        return changeEmailViewHolder$onAttachViewModel$1;
    }

    public final Object invoke(int i11, d<? super Unit> dVar) {
        return ((ChangeEmailViewHolder$onAttachViewModel$1) create(Integer.valueOf(i11), dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ChangeEmailView changeEmailView;
        ChangeEmailViewModel changeEmailViewModel;
        ChangeEmailView changeEmailView2;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        int i11 = this.I$0;
        changeEmailView = this.this$0.view;
        changeEmailViewModel = this.this$0.viewModel;
        changeEmailView.updateTimer(changeEmailViewModel.getTimerState());
        if (i11 == 0) {
            changeEmailView2 = this.this$0.view;
            changeEmailView2.rebindPrimaryButton();
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Integer num, d<? super Unit> dVar) {
        return invoke(num.intValue(), dVar);
    }
}
