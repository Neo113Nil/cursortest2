package fe;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
final class T implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final X f63185a;

    public T(X x11) {
        this.f63185a = x11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return X.b(this.f63185a, ((Number) obj).intValue());
    }
}
