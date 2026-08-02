package ru.ozon.app.android.session.userAdultModalMobileV2.presentation;

import Sc.s;
import a00.C4911f;
import android.os.Bundle;
import androidx.fragment.app.G;
import androidx.lifecycle.J;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.session.userAdultModalMobileV2.presentation.models.UserAdultModalV2VO;
import ru.ozon.composer.compose.widget.i;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.session.userAdultModalMobileV2.presentation.ComposableSingletons$ComposeAdultConfirmationViewHolderKt$lambda-1$1$1$1", f = "ComposeAdultConfirmationViewHolder.kt", l = {}, m = "invokeSuspend")
/* renamed from: ru.ozon.app.android.session.userAdultModalMobileV2.presentation.ComposableSingletons$ComposeAdultConfirmationViewHolderKt$lambda-1$1$1$1, reason: invalid class name */
/* loaded from: classes2.dex */
final class ComposableSingletons$ComposeAdultConfirmationViewHolderKt$lambda1$1$1$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ AdultConfirmationViewModelV2 $adultConfirmationViewModel;
    final /* synthetic */ C4911f $localOwnerContainer;
    final /* synthetic */ i<UserAdultModalV2VO> $this_content;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ComposableSingletons$ComposeAdultConfirmationViewHolderKt$lambda1$1$1$1(AdultConfirmationViewModelV2 adultConfirmationViewModelV2, i<UserAdultModalV2VO> iVar, C4911f c4911f, d<? super ComposableSingletons$ComposeAdultConfirmationViewHolderKt$lambda1$1$1$1> dVar) {
        super(2, dVar);
        this.$adultConfirmationViewModel = adultConfirmationViewModelV2;
        this.$this_content = iVar;
        this.$localOwnerContainer = c4911f;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new ComposableSingletons$ComposeAdultConfirmationViewHolderKt$lambda1$1$1$1(this.$adultConfirmationViewModel, this.$this_content, this.$localOwnerContainer, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        this.$adultConfirmationViewModel.setStateVO(this.$this_content.b());
        G k11 = this.$localOwnerContainer.k();
        J e11 = this.$localOwnerContainer.e();
        final AdultConfirmationViewModelV2 adultConfirmationViewModelV2 = this.$adultConfirmationViewModel;
        k11.n1("DATE_ARG", e11, new androidx.fragment.app.M() { // from class: ru.ozon.app.android.session.userAdultModalMobileV2.presentation.a
            @Override // androidx.fragment.app.M
            public final void f(Bundle bundle, String str) {
                AdultConfirmationViewModelV2.this.setDate(bundle);
            }
        });
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((ComposableSingletons$ComposeAdultConfirmationViewHolderKt$lambda1$1$1$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
