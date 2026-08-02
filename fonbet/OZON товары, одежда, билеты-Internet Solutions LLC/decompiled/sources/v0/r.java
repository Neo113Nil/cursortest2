package v0;

import S0.InterfaceC3978p0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes.dex */
final class r extends AbstractC7737t implements Function0<C10173m> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC3978p0 f101561b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    r(InterfaceC3978p0 interfaceC3978p0) {
        super(0);
        this.f101561b = interfaceC3978p0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C10173m invoke() {
        return new C10173m((Function1) this.f101561b.getValue());
    }
}
