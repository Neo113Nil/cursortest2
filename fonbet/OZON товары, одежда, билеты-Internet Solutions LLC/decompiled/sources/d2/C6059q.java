package d2;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: d2.q, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C6059q extends AbstractC7737t implements Function1<S0.N, S0.M> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C6034K f61067b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ InterfaceC6040Q f61068c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C6059q(C6034K c6034k, InterfaceC6040Q interfaceC6040Q) {
        super(1);
        this.f61067b = c6034k;
        this.f61068c = interfaceC6040Q;
    }

    @Override // kotlin.jvm.functions.Function1
    public final S0.M invoke(S0.N n11) {
        InterfaceC6040Q interfaceC6040Q = this.f61068c;
        C6034K c6034k = this.f61067b;
        c6034k.k(interfaceC6040Q);
        c6034k.p();
        return new C6058p();
    }
}
