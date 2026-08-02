package pf0;

import We.B;
import We.G;
import We.L;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* renamed from: pf0.d, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC8921d extends AbstractC8922e {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C8920c f80512a = new B() { // from class: pf0.c
        @Override // We.B
        public final L intercept(B.a aVar) {
            G.a aVar2 = new G.a(Ek.a.a(aVar, "chain"));
            AbstractC8921d abstractC8921d = AbstractC8921d.this;
            aVar2.d(abstractC8921d.getKey(), abstractC8921d.c().invoke());
            return aVar.proceed(aVar2.b());
        }
    };

    @NotNull
    public abstract Function0<String> c();

    @Override // pf0.AbstractC8922e
    @NotNull
    public B getInterceptor() {
        return this.f80512a;
    }
}
