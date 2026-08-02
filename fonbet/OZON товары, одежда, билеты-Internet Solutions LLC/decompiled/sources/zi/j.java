package zi;

import S0.InterfaceC3978p0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes10.dex */
final class j extends AbstractC7737t implements Function1<Object, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC3978p0 f109190b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(InterfaceC3978p0 interfaceC3978p0) {
        super(1);
        this.f109190b = interfaceC3978p0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Object obj) {
        ((Function1) this.f109190b.getValue()).invoke(obj);
        return Unit.f71690a;
    }
}
