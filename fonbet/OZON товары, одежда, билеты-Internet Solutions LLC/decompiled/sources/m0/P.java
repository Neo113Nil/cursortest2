package m0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import m0.O;

/* loaded from: classes.dex */
final class P extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Number f73593b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ O.a<Object, Object> f73594c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Number f73595d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ N<Object> f73596e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    P(Number number, O.a aVar, Number number2, N n11) {
        super(0);
        this.f73593b = number;
        this.f73594c = aVar;
        this.f73595d = number2;
        this.f73596e = n11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        O.a<Object, Object> aVar = this.f73594c;
        Object b11 = aVar.b();
        Number number = this.f73593b;
        boolean equals = number.equals(b11);
        Number number2 = this.f73595d;
        if (!equals || !number2.equals(aVar.k())) {
            aVar.w(number, number2, this.f73596e);
        }
        return Unit.f71690a;
    }
}
