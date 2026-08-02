package l0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import l1.InterfaceC7825i0;
import l1.N0;
import m0.D0;

/* loaded from: classes8.dex */
final class T extends AbstractC7737t implements Function1<InterfaceC7825i0, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ D0.a.C1247a f72044b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ D0.a.C1247a f72045c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ D0.a.C1247a f72046d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    T(D0.a.C1247a c1247a, D0.a.C1247a c1247a2, D0.a.C1247a c1247a3) {
        super(1);
        this.f72044b = c1247a;
        this.f72045c = c1247a2;
        this.f72046d = c1247a3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC7825i0 interfaceC7825i0) {
        InterfaceC7825i0 interfaceC7825i02 = interfaceC7825i0;
        D0.a.C1247a c1247a = this.f72044b;
        interfaceC7825i02.setAlpha(c1247a != null ? ((Number) c1247a.getValue()).floatValue() : 1.0f);
        D0.a.C1247a c1247a2 = this.f72045c;
        interfaceC7825i02.j(c1247a2 != null ? ((Number) c1247a2.getValue()).floatValue() : 1.0f);
        interfaceC7825i02.k(c1247a2 != null ? ((Number) c1247a2.getValue()).floatValue() : 1.0f);
        D0.a.C1247a c1247a3 = this.f72046d;
        interfaceC7825i02.g0(c1247a3 != null ? ((N0) c1247a3.getValue()).g() : N0.f72232b);
        return Unit.f71690a;
    }
}
