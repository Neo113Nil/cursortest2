package nd;

import kotlin.jvm.functions.Function0;

/* renamed from: nd.P, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C8519P implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final X f76900a;

    public C8519P(X x11) {
        this.f76900a = x11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        X x11 = this.f76900a;
        if (x11.c().isAnonymousClass()) {
            return null;
        }
        Sd.b K11 = X.K(x11);
        if (K11.i()) {
            return null;
        }
        return K11.a().b();
    }
}
