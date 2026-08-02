package dc0;

import Sc.InterfaceC4008j;
import com.google.protobuf.DescriptorProtos$FileOptions;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.account.AuthCookieHandler$handle$1", f = "AuthCookieHandler.kt", l = {DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER, 52}, m = "invokeSuspend")
/* renamed from: dc0.k, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C6165k extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f61552d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C6160f f61553e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ ArrayList f61554f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ String f61555g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C6165k(C6160f c6160f, ArrayList arrayList, String str, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f61553e = c6160f;
        this.f61554f = arrayList;
        this.f61555g = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new C6165k(this.f61553e, this.f61554f, this.f61555g, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C6165k) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0063, code lost:
    
        if (dc0.C6160f.c(r4, r8, r5, r1, r7) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0065, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0031, code lost:
    
        if (r8 == r0) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC4008j interfaceC4008j;
        InterfaceC4008j interfaceC4008j2;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f61552d;
        C6160f c6160f = this.f61553e;
        if (i11 == 0) {
            Sc.s.b(obj);
            interfaceC4008j = c6160f.f61542a;
            C6178x c6178x = (C6178x) interfaceC4008j.getValue();
            this.f61552d = 1;
            obj = c6178x.a(this);
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
                return Unit.f71690a;
            }
            Sc.s.b(obj);
        }
        C6154S c6154s = (C6154S) obj;
        ArrayList arrayList = this.f61554f;
        String str = this.f61555g;
        C6154S D11 = C6171q.D(C6171q.h(str, arrayList));
        interfaceC4008j2 = c6160f.f61542a;
        C6154S d11 = ((C6178x) interfaceC4008j2.getValue()).d(D11);
        if (!C6171q.p(str, arrayList)) {
            return Unit.f71690a;
        }
        ArrayList l11 = C6171q.l(str, arrayList);
        this.f61552d = 2;
    }
}
