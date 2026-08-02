package ru.ozon.app.android.tabbar.feature.tab.profile;

import Ae.x0;
import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.tabbar.feature.tab.profile.ProfileViewModelImpl$checkIfUnauthorizedIndicatorEnabled$1", f = "ProfileTabViewModel.kt", l = {107}, m = "invokeSuspend")
/* loaded from: classes7.dex */
final class ProfileViewModelImpl$checkIfUnauthorizedIndicatorEnabled$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ boolean $isUnauthorizedIndicatorEnabled;
    int label;
    final /* synthetic */ ProfileViewModelImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProfileViewModelImpl$checkIfUnauthorizedIndicatorEnabled$1(ProfileViewModelImpl profileViewModelImpl, boolean z11, d<? super ProfileViewModelImpl$checkIfUnauthorizedIndicatorEnabled$1> dVar) {
        super(2, dVar);
        this.this$0 = profileViewModelImpl;
        this.$isUnauthorizedIndicatorEnabled = z11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new ProfileViewModelImpl$checkIfUnauthorizedIndicatorEnabled$1(this.this$0, this.$isUnauthorizedIndicatorEnabled, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        x0 x0Var;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            x0Var = this.this$0.unauthorizedIndicatorEnabledState;
            Boolean valueOf = Boolean.valueOf(this.$isUnauthorizedIndicatorEnabled);
            this.label = 1;
            if (x0Var.emit(valueOf, this) == aVar) {
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
        return ((ProfileViewModelImpl$checkIfUnauthorizedIndicatorEnabled$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
