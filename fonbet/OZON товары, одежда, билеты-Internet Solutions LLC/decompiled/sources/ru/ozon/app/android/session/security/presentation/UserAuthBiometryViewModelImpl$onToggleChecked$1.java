package ru.ozon.app.android.session.security.presentation;

import Fb0.a;
import Sc.s;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.session.security.presentation.UserAuthBiometryViewModelImpl$onToggleChecked$1", f = "UserAuthBiometryViewModelImpl.kt", l = {21}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class UserAuthBiometryViewModelImpl$onToggleChecked$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ String $analyticsTag;
    final /* synthetic */ boolean $checked;
    int label;
    final /* synthetic */ UserAuthBiometryViewModelImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UserAuthBiometryViewModelImpl$onToggleChecked$1(UserAuthBiometryViewModelImpl userAuthBiometryViewModelImpl, boolean z11, String str, d<? super UserAuthBiometryViewModelImpl$onToggleChecked$1> dVar) {
        super(2, dVar);
        this.this$0 = userAuthBiometryViewModelImpl;
        this.$checked = z11;
        this.$analyticsTag = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new UserAuthBiometryViewModelImpl$onToggleChecked$1(this.this$0, this.$checked, this.$analyticsTag, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        try {
            if (i11 == 0) {
                s.b(obj);
                aVar = this.this$0.biometryAuth;
                boolean z11 = this.$checked;
                String str = this.$analyticsTag;
                this.label = 1;
                if (aVar.a(z11, str, this) == aVar2) {
                    return aVar2;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            this.this$0.getEventsLiveData().postValue(new Success(this.$checked));
        } catch (CancellationException e11) {
            throw e11;
        } catch (Exception unused) {
            this.this$0.getEventsLiveData().postValue(new Failure(!this.$checked));
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((UserAuthBiometryViewModelImpl$onToggleChecked$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
