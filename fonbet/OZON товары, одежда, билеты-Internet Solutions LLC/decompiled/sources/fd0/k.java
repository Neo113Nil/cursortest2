package fd0;

import Ae.x0;
import Sc.s;
import android.app.Application;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.id.nativeauth.requestPhoneAccess.data.RequestPhoneAccessDTO;
import xe.M;
import ze.C11115c;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.requestPhoneAccess.presentation.RequestPhoneAccessViewModel$onRequestButtonClicked$1", f = "RequestPhoneAccessViewModel.kt", l = {145}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class k extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f63110d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ n f63111e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    k(n nVar, kotlin.coroutines.d<? super k> dVar) {
        super(2, dVar);
        this.f63111e = nVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new k(this.f63111e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((k) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Application application;
        C11115c c11115c;
        x0 x0Var;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f63110d;
        if (i11 == 0) {
            s.b(obj);
            n nVar = this.f63111e;
            application = nVar.f63119b;
            Intrinsics.checkNotNullParameter(application, "<this>");
            if (td0.l.a(application, (String[]) Arrays.copyOf(new String[]{"android.permission.READ_CALL_LOG", "android.permission.READ_PHONE_STATE"}, 2))) {
                x0Var = nVar.f63128k;
                RequestPhoneAccessDTO requestPhoneAccessDTO = (RequestPhoneAccessDTO) x0Var.getValue();
                RequestPhoneAccessDTO.OzonIdButtonDTO allowButton = requestPhoneAccessDTO != null ? requestPhoneAccessDTO.getAllowButton() : null;
                Boolean bool = Boolean.TRUE;
                this.f63110d = 1;
                if (n.d0(nVar, allowButton, bool, bool, this) == aVar) {
                    return aVar;
                }
            } else {
                c11115c = nVar.f63130m;
                c11115c.b(Unit.f71690a);
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
