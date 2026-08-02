package l0;

import B1.m0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: l0.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C7760d extends AbstractC7737t implements Function1<m0.a, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ B1.m0 f72082b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ N f72083c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C7760d(B1.m0 m0Var, N n11) {
        super(1);
        this.f72082b = m0Var;
        this.f72083c = n11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(m0.a aVar) {
        aVar.d(this.f72082b, 0, 0, this.f72083c.d());
        return Unit.f71690a;
    }
}
