package he;

import he.n;
import kotlin.jvm.functions.Function1;

/* loaded from: classes10.dex */
final class p implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final n.c f65463a;

    /* renamed from: b, reason: collision with root package name */
    private final n f65464b;

    public p(n.c cVar, n nVar) {
        this.f65463a = cVar;
        this.f65464b = nVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return n.c.a(this.f65463a, this.f65464b, (Sd.f) obj);
    }
}
