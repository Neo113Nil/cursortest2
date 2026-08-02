package n0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import l1.AbstractC7799Q;
import l1.s0;
import n1.InterfaceC8410c;
import n1.InterfaceC8412e;

/* renamed from: n0.j, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C8389j extends AbstractC7737t implements Function1<InterfaceC8410c, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ s0 f76197b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ AbstractC7799Q f76198c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C8389j(s0 s0Var, AbstractC7799Q abstractC7799Q) {
        super(1);
        this.f76197b = s0Var;
        this.f76198c = abstractC7799Q;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC8410c interfaceC8410c) {
        InterfaceC8410c interfaceC8410c2 = interfaceC8410c;
        interfaceC8410c2.F0();
        InterfaceC8412e.x1(interfaceC8410c2, this.f76197b, this.f76198c, 0.0f, null, 60);
        return Unit.f71690a;
    }
}
