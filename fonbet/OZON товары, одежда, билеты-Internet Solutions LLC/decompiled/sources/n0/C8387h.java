package n0;

import k1.C7460f;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import l1.C7795M;
import l1.InterfaceC7829k0;
import n1.InterfaceC8410c;
import n1.InterfaceC8412e;

/* renamed from: n0.h, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C8387h extends AbstractC7737t implements Function1<InterfaceC8410c, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C7460f f76185b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ kotlin.jvm.internal.M<InterfaceC7829k0> f76186c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ long f76187d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C7795M f76188e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C8387h(C7460f c7460f, kotlin.jvm.internal.M m11, long j11, C7795M c7795m) {
        super(1);
        this.f76185b = c7460f;
        this.f76186c = m11;
        this.f76187d = j11;
        this.f76188e = c7795m;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC8410c interfaceC8410c) {
        float f7;
        float f11;
        InterfaceC8410c interfaceC8410c2 = interfaceC8410c;
        interfaceC8410c2.F0();
        C7460f c7460f = this.f76185b;
        float n11 = c7460f.n();
        float q11 = c7460f.q();
        kotlin.jvm.internal.M<InterfaceC7829k0> m11 = this.f76186c;
        long j11 = this.f76187d;
        C7795M c7795m = this.f76188e;
        interfaceC8410c2.w0().f().g(n11, q11);
        try {
            f7 = n11;
            try {
                InterfaceC8412e.y1(interfaceC8410c2, m11.f71787a, 0L, j11, 0L, 0L, 0.0f, null, c7795m, 0, 0, 890);
                interfaceC8410c2.w0().f().g(-f7, -q11);
                return Unit.f71690a;
            } catch (Throwable th2) {
                th = th2;
                f11 = q11;
                interfaceC8410c2.w0().f().g(-f7, -f11);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            f7 = n11;
            f11 = q11;
        }
    }
}
