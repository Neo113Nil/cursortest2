package ec0;

import kc0.InterfaceC7643a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes3.dex */
final class f extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ h f62129b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ InterfaceC7643a.b f62130c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(h hVar, InterfaceC7643a.b bVar) {
        super(0);
        this.f62129b = hVar;
        this.f62130c = bVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        j u11 = h.u(this.f62129b);
        InterfaceC7643a.b bVar = this.f62130c;
        u11.M0(bVar.c(), bVar.a());
        return Unit.f71690a;
    }
}
