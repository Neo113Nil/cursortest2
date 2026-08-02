package hc0;

import Sc.InterfaceC4008j;
import Sc.s;
import com.google.protobuf.DescriptorProtos$MethodOptions;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.id.nativeauth.biometry.data.api.AuthBiometryApi;
import ru.ozon.id.nativeauth.biometry.data.dto.PublicKeyRequestDTO;
import xe.M;

@e(c = "ru.ozon.id.nativeauth.biometry.data.AuthBiometryRepository$sendPublicKey$2", f = "AuthBiometryRepository.kt", l = {28, DescriptorProtos$MethodOptions.FEATURES_FIELD_NUMBER}, m = "invokeSuspend")
/* renamed from: hc0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C6912c extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f65293d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C6910a f65294e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ String f65295f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ String f65296g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C6912c(C6910a c6910a, String str, String str2, kotlin.coroutines.d<? super C6912c> dVar) {
        super(2, dVar);
        this.f65294e = c6910a;
        this.f65295f = str;
        this.f65296g = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new C6912c(this.f65294e, this.f65295f, this.f65296g, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C6912c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004f, code lost:
    
        if (r7.setDevicePublicKey(r1, r6) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0031, code lost:
    
        if (r7 == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC4008j interfaceC4008j;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f65293d;
        C6910a c6910a = this.f65294e;
        if (i11 == 0) {
            s.b(obj);
            vc0.c cVar = (vc0.c) c6910a.f65281b.getValue();
            this.f65293d = 1;
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
        PublicKeyRequestDTO publicKeyRequestDTO = new PublicKeyRequestDTO((String) obj, this.f65295f, this.f65296g);
        interfaceC4008j = c6910a.f65280a;
        AuthBiometryApi authBiometryApi = (AuthBiometryApi) interfaceC4008j.getValue();
        this.f65293d = 2;
    }
}
