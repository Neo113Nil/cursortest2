package n0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import l1.AbstractC7799Q;
import l1.AbstractC7839p0;
import n1.InterfaceC8410c;
import n1.InterfaceC8412e;

/* renamed from: n0.g, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C8386g extends AbstractC7737t implements Function1<InterfaceC8410c, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AbstractC7839p0.a f76177b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ AbstractC7799Q f76178c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C8386g(AbstractC7839p0.a aVar, AbstractC7799Q abstractC7799Q) {
        super(1);
        this.f76177b = aVar;
        this.f76178c = abstractC7799Q;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC8410c interfaceC8410c) {
        InterfaceC8410c interfaceC8410c2 = interfaceC8410c;
        interfaceC8410c2.F0();
        InterfaceC8412e.x1(interfaceC8410c2, this.f76177b.b(), this.f76178c, 0.0f, null, 60);
        return Unit.f71690a;
    }
}
