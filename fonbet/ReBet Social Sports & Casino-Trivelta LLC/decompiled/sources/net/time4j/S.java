package net.time4j;

/* loaded from: classes5.dex */
public final class S extends AbstractC5722o {

    /* renamed from: c, reason: collision with root package name */
    public final Object f57656c;

    public S(oi.p pVar, int i10) {
        this(pVar, i10, null);
    }

    public static oi.v c(oi.p pVar, boolean z10) {
        String name = pVar.name();
        return (name.equals("MILLI_OF_SECOND") || name.equals("MILLI_OF_DAY")) ? new C5724q('3', z10) : (name.equals("MICRO_OF_SECOND") || name.equals("MICRO_OF_DAY")) ? new C5724q('6', z10) : (name.equals("NANO_OF_SECOND") || name.equals("NANO_OF_DAY")) ? new C5724q('9', z10) : z10 ? oi.G.c(pVar) : oi.G.d(pVar);
    }

    private static Object d(oi.p pVar, Object obj) {
        return U.a(oi.G.o(pVar.getType().cast(obj), pVar), obj);
    }

    private static Object e(oi.p pVar, Object obj) {
        return U.a(oi.G.n(pVar.getType().cast(obj), pVar), obj);
    }

    @Override // oi.v
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public G apply(G g10) {
        return (G) ((oi.v) this.f57656c).apply(g10);
    }

    public S(oi.p pVar, int i10, Object obj) {
        super(pVar, i10);
        switch (i10) {
            case -1:
                this.f57656c = e(pVar, obj);
                return;
            case 0:
                this.f57656c = oi.G.l(pVar);
                return;
            case 1:
                this.f57656c = oi.G.j(pVar);
                return;
            case 2:
                this.f57656c = oi.G.f(pVar);
                return;
            case 3:
                this.f57656c = oi.G.h(pVar);
                return;
            case 4:
                this.f57656c = c(pVar, false);
                return;
            case 5:
                this.f57656c = c(pVar, true);
                return;
            case 6:
                this.f57656c = d(pVar, obj);
                return;
            default:
                throw new AssertionError("Unknown: " + a());
        }
    }
}
