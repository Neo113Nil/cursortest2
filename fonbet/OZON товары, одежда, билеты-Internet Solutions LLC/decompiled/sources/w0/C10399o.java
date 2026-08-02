package w0;

import S0.InterfaceC3978p0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: w0.o, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C10399o extends AbstractC7737t implements Function0<C10394j> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC3978p0 f103286b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C10399o(InterfaceC3978p0 interfaceC3978p0) {
        super(0);
        this.f103286b = interfaceC3978p0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C10394j invoke() {
        return new C10394j((Function1) this.f103286b.getValue());
    }
}
