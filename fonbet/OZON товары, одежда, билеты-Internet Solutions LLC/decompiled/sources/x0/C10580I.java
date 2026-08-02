package x0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: x0.I, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C10580I extends AbstractC7737t implements Function1<S0.N, S0.M> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C10578G f104680b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C10580I(C10578G c10578g) {
        super(1);
        this.f104680b = c10578g;
    }

    @Override // kotlin.jvm.functions.Function1
    public final S0.M invoke(S0.N n11) {
        return new C10579H(this.f104680b);
    }
}
