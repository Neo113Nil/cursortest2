package fd0;

import Ae.x0;
import Sc.s;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ru.ozon.id.nativeauth.requestPhoneAccess.data.RequestPhoneAccessDTO;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.requestPhoneAccess.presentation.RequestPhoneAccessViewModel$onSkipButtonClicked$1", f = "RequestPhoneAccessViewModel.kt", l = {158}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class m extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f63116d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ n f63117e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    m(n nVar, kotlin.coroutines.d<? super m> dVar) {
        super(2, dVar);
        this.f63117e = nVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new m(this.f63117e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((m) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        x0 x0Var;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f63116d;
        if (i11 == 0) {
            s.b(obj);
            n nVar = this.f63117e;
            x0Var = nVar.f63128k;
            RequestPhoneAccessDTO requestPhoneAccessDTO = (RequestPhoneAccessDTO) x0Var.getValue();
            RequestPhoneAccessDTO.OzonIdButtonDTO disallowButton = requestPhoneAccessDTO != null ? requestPhoneAccessDTO.getDisallowButton() : null;
            this.f63116d = 1;
            if (n.d0(nVar, disallowButton, null, null, this) == aVar) {
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
}
