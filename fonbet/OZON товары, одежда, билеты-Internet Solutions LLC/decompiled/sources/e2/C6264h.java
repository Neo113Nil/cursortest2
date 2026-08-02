package e2;

import bc.C5637m;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import l1.InterfaceC7825i0;

/* renamed from: e2.h, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C6264h extends AbstractC7737t implements Function1<InterfaceC7825i0, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ j2.g f61831b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C6264h(j2.g gVar) {
        super(1);
        this.f61831b = gVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC7825i0 interfaceC7825i0) {
        InterfaceC7825i0 interfaceC7825i02 = interfaceC7825i0;
        j2.g gVar = this.f61831b;
        if (!Float.isNaN(gVar.f68906f) || !Float.isNaN(gVar.f68907g)) {
            interfaceC7825i02.g0(C5637m.a(Float.isNaN(gVar.f68906f) ? 0.5f : gVar.f68906f, Float.isNaN(gVar.f68907g) ? 0.5f : gVar.f68907g));
        }
        if (!Float.isNaN(gVar.f68908h)) {
            interfaceC7825i02.e(gVar.f68908h);
        }
        if (!Float.isNaN(gVar.f68909i)) {
            interfaceC7825i02.f(gVar.f68909i);
        }
        if (!Float.isNaN(gVar.f68910j)) {
            interfaceC7825i02.h(gVar.f68910j);
        }
        if (!Float.isNaN(gVar.f68911k)) {
            interfaceC7825i02.n(gVar.f68911k);
        }
        if (!Float.isNaN(gVar.f68912l)) {
            interfaceC7825i02.c(gVar.f68912l);
        }
        if (!Float.isNaN(gVar.f68913m)) {
            interfaceC7825i02.z(gVar.f68913m);
        }
        if (!Float.isNaN(gVar.f68914n) || !Float.isNaN(gVar.f68915o)) {
            interfaceC7825i02.j(Float.isNaN(gVar.f68914n) ? 1.0f : gVar.f68914n);
            interfaceC7825i02.k(Float.isNaN(gVar.f68915o) ? 1.0f : gVar.f68915o);
        }
        if (!Float.isNaN(gVar.f68916p)) {
            interfaceC7825i02.setAlpha(gVar.f68916p);
        }
        return Unit.f71690a;
    }
}
