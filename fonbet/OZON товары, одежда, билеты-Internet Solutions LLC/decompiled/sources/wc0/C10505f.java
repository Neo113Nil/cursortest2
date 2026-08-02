package wc0;

import Sc.s;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.id.nativeauth.data.api.ActionApi;
import ru.ozon.id.nativeauth.data.models.DeeplinkOtpFlowDTO;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.data.action.ActionAuthRepositoryImpl$callOtpStartMobile$2", f = "ActionAuthRepositoryImpl.kt", l = {57}, m = "invokeSuspend")
/* renamed from: wc0.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C10505f extends j implements Function2<M, kotlin.coroutines.d<? super DeeplinkOtpFlowDTO>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f104151d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ String f104152e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C10503d f104153f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C10505f(String str, kotlin.coroutines.d dVar, C10503d c10503d) {
        super(2, dVar);
        this.f104152e = str;
        this.f104153f = c10503d;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new C10505f(this.f104152e, dVar, this.f104153f);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super DeeplinkOtpFlowDTO> dVar) {
        return ((C10505f) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f104151d;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            return obj;
        }
        s.b(obj);
        String str = "otpStartMobile?token=" + this.f104152e;
        C10503d c10503d = this.f104153f;
        String t2 = c10503d.t(str, true);
        ActionApi l11 = C10503d.l(c10503d);
        this.f104151d = 1;
        Object startOtpFlow = l11.startOtpFlow(t2, this);
        return startOtpFlow == aVar ? aVar : startOtpFlow;
    }
}
