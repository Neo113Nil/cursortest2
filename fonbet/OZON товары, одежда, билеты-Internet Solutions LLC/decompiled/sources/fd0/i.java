package fd0;

import Sc.InterfaceC4008j;
import Sc.s;
import androidx.lifecycle.C5418g0;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ru.ozon.id.nativeauth.requestPhoneAccess.data.RequestPhoneAccessDTO;
import xc0.C10702a;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.requestPhoneAccess.presentation.RequestPhoneAccessViewModel$load$1", f = "RequestPhoneAccessViewModel.kt", l = {ModuleDescriptor.MODULE_VERSION}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class i extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f63107d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ n f63108e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(n nVar, kotlin.coroutines.d<? super i> dVar) {
        super(2, dVar);
        this.f63108e = nVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new i(this.f63108e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((i) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC4008j interfaceC4008j;
        InterfaceC4008j interfaceC4008j2;
        InterfaceC4008j interfaceC4008j3;
        String str;
        C5418g0 c5418g0;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f63107d;
        n nVar = this.f63108e;
        if (i11 == 0) {
            s.b(obj);
            interfaceC4008j = nVar.f63120c;
            ((Nc0.f) interfaceC4008j.getValue()).p();
            n.p0(nVar);
            interfaceC4008j2 = nVar.f63122e;
            C10702a c10702a = (C10702a) interfaceC4008j2.getValue();
            interfaceC4008j3 = nVar.f63123f;
            Pc0.c cVar = (Pc0.c) interfaceC4008j3.getValue();
            str = nVar.f63118a;
            String b11 = cVar.o(str).b();
            this.f63107d = 1;
            obj = c10702a.v(b11, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        RequestPhoneAccessDTO requestPhoneAccessDTO = (RequestPhoneAccessDTO) obj;
        c5418g0 = nVar.f63121d;
        c5418g0.g(requestPhoneAccessDTO, "dto_saved_state_key");
        n.n0(nVar, requestPhoneAccessDTO);
        return Unit.f71690a;
    }
}
