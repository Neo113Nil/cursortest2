package ff0;

import B4.L;
import B4.P;
import D4.X;
import S0.InterfaceC3967k;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: ff0.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C6560g extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ P f63409b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ L f63410c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f63411d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ e1.d f63412e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C6560g(P p11, L l11, androidx.compose.ui.e eVar, e1.d dVar) {
        super(2);
        this.f63409b = p11;
        this.f63410c = l11;
        this.f63411d = eVar;
        this.f63412e = dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            X.a(this.f63409b, this.f63410c, this.f63411d, this.f63412e, null, null, null, null, interfaceC3967k2, 0);
        }
        return Unit.f71690a;
    }
}
