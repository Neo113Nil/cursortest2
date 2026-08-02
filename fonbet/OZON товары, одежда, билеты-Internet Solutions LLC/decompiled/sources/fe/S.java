package fe;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
final class S implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final X f63184a;

    public S(X x11) {
        this.f63184a = x11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return X.a(this.f63184a, ((Number) obj).intValue());
    }
}
