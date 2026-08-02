package d2;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class x extends AbstractC7737t implements Function1<Z1.q, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C6034K f61085b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    x(C6034K c6034k) {
        super(1);
        this.f61085b = c6034k;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Z1.q qVar) {
        Z1.q a11 = Z1.q.a(qVar.e());
        C6034K c6034k = this.f61085b;
        c6034k.j(a11);
        c6034k.p();
        return Unit.f71690a;
    }
}
