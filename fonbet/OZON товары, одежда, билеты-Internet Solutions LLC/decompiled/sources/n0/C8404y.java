package n0;

import B1.k0;
import B1.l0;
import D1.C2805i;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: n0.y, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C8404y extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ kotlin.jvm.internal.M<k0> f76247b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C8405z f76248c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C8404y(kotlin.jvm.internal.M<k0> m11, C8405z c8405z) {
        super(0);
        this.f76247b = m11;
        this.f76248c = c8405z;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f76247b.f71787a = C2805i.a(this.f76248c, l0.a());
        return Unit.f71690a;
    }
}
