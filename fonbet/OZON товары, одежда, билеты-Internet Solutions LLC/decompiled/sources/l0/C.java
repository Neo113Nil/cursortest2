package l0;

import B1.m0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class C extends AbstractC7737t implements Function1<m0.a, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ B1.m0 f72010b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C(B1.m0 m0Var) {
        super(1);
        this.f72010b = m0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(m0.a aVar) {
        aVar.d(this.f72010b, 0, 0, 0.0f);
        return Unit.f71690a;
    }
}
