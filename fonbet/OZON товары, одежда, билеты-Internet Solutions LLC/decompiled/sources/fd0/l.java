package fd0;

import Ae.x0;
import Sc.InterfaceC4008j;
import Sc.s;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.maplibre.android.log.Logger;
import ru.ozon.id.nativeauth.requestPhoneAccess.data.RequestPhoneAccessDTO;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.requestPhoneAccess.presentation.RequestPhoneAccessViewModel$onRequestPermissionsResult$1", f = "RequestPhoneAccessViewModel.kt", l = {Logger.NONE}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class l extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f63112d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C6513a f63113e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C6513a f63114f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ n f63115g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l(C6513a c6513a, C6513a c6513a2, n nVar, kotlin.coroutines.d<? super l> dVar) {
        super(2, dVar);
        this.f63113e = c6513a;
        this.f63114f = c6513a2;
        this.f63115g = nVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new l(this.f63113e, this.f63114f, this.f63115g, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((l) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC4008j interfaceC4008j;
        x0 x0Var;
        RequestPhoneAccessDTO.OzonIdButtonDTO allowButton;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f63112d;
        if (i11 == 0) {
            s.b(obj);
            C6513a c6513a = this.f63113e;
            boolean z11 = c6513a.a() || c6513a.b();
            n nVar = this.f63115g;
            if (z11) {
                C6513a c6513a2 = this.f63114f;
                if (c6513a2.a() || c6513a2.b()) {
                    x0Var = nVar.f63128k;
                    RequestPhoneAccessDTO requestPhoneAccessDTO = (RequestPhoneAccessDTO) x0Var.getValue();
                    if (requestPhoneAccessDTO == null || (allowButton = requestPhoneAccessDTO.getAllowButton()) == null) {
                        return Unit.f71690a;
                    }
                    Boolean valueOf = Boolean.valueOf(c6513a.a());
                    Boolean valueOf2 = Boolean.valueOf(c6513a2.a());
                    this.f63112d = 1;
                    if (n.d0(nVar, allowButton, valueOf, valueOf2, this) == aVar) {
                        return aVar;
                    }
                }
            }
            interfaceC4008j = nVar.f63123f;
            ((Pc0.c) interfaceC4008j.getValue()).A();
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return Unit.f71690a;
    }
}
