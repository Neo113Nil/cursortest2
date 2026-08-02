package hc0;

import Sc.InterfaceC4008j;
import Sc.s;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.id.nativeauth.biometry.data.api.AuthBiometryApi;
import ru.ozon.id.nativeauth.biometry.data.dto.ClearBiometryDeviceRequestDTO;
import xe.M;

@e(c = "ru.ozon.id.nativeauth.biometry.data.AuthBiometryRepository$resetBiometry$2", f = "AuthBiometryRepository.kt", l = {67, 69}, m = "invokeSuspend")
/* renamed from: hc0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C6911b extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f65291d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C6910a f65292e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C6911b(C6910a c6910a, kotlin.coroutines.d<? super C6911b> dVar) {
        super(2, dVar);
        this.f65292e = c6910a;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new C6911b(this.f65292e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C6911b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0058, code lost:
    
        if (r6.clearBiometryByDevice(r1, r5) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005a, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
    
        if (r6 == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC4008j interfaceC4008j;
        InterfaceC4008j interfaceC4008j2;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f65291d;
        C6910a c6910a = this.f65292e;
        if (i11 == 0) {
            s.b(obj);
            interfaceC4008j = c6910a.f65282c;
            ((vc0.d) interfaceC4008j.getValue()).b();
            vc0.c cVar = (vc0.c) c6910a.f65281b.getValue();
            this.f65291d = 1;
            obj = cVar.b(this);
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                return Unit.f71690a;
            }
            s.b(obj);
        }
        ClearBiometryDeviceRequestDTO clearBiometryDeviceRequestDTO = new ClearBiometryDeviceRequestDTO((String) obj);
        interfaceC4008j2 = c6910a.f65280a;
        AuthBiometryApi authBiometryApi = (AuthBiometryApi) interfaceC4008j2.getValue();
        this.f65291d = 2;
    }
}
