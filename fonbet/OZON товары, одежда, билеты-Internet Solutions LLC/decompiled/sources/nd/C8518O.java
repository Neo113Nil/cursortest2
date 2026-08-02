package nd;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import nd.X;

/* renamed from: nd.O, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C8518O implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final X f76896a;

    /* renamed from: b, reason: collision with root package name */
    private final X.a f76897b;

    public C8518O(X.a aVar, X x11) {
        this.f76896a = x11;
        this.f76897b = aVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        X x11 = this.f76896a;
        if (x11.c().isAnonymousClass()) {
            return null;
        }
        Sd.b K11 = X.K(x11);
        if (!K11.i()) {
            String b11 = K11.h().b();
            Intrinsics.checkNotNullExpressionValue(b11, "asString(...)");
            return b11;
        }
        Class c11 = x11.c();
        this.f76897b.getClass();
        String simpleName = c11.getSimpleName();
        Method enclosingMethod = c11.getEnclosingMethod();
        if (enclosingMethod != null) {
            return kotlin.text.h.i0(simpleName, enclosingMethod.getName() + '$');
        }
        Constructor<?> enclosingConstructor = c11.getEnclosingConstructor();
        if (enclosingConstructor == null) {
            return kotlin.text.h.h0('$', simpleName, simpleName);
        }
        return kotlin.text.h.i0(simpleName, enclosingConstructor.getName() + '$');
    }
}
