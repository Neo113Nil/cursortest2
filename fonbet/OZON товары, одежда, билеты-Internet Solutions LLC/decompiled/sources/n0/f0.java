package n0;

import B1.m0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class f0 extends AbstractC7737t implements Function1<m0.a, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ m0 f76174b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f76175c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f76176d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f0(int i11, int i12, m0 m0Var) {
        super(1);
        this.f76174b = m0Var;
        this.f76175c = i11;
        this.f76176d = i12;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(m0.a aVar) {
        m0.a.k(aVar, this.f76174b, this.f76175c, this.f76176d);
        return Unit.f71690a;
    }
}
