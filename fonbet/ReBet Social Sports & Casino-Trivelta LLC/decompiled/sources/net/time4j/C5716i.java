package net.time4j;

/* renamed from: net.time4j.i, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5716i extends AbstractC5722o {

    /* renamed from: c, reason: collision with root package name */
    public final Object f58241c;

    public C5716i(oi.p pVar, int i10) {
        this(pVar, i10, null);
    }

    public static Object c(oi.p pVar, Object obj) {
        return U.a(oi.G.o(pVar.getType().cast(obj), pVar), obj);
    }

    public static Object d(oi.p pVar, Object obj) {
        return U.a(oi.G.n(pVar.getType().cast(obj), pVar), obj);
    }

    @Override // oi.v
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public F apply(F f10) {
        return (F) ((oi.v) this.f58241c).apply(f10);
    }

    public C5716i(oi.p pVar, int i10, Object obj) {
        super(pVar, i10);
        switch (i10) {
            case -1:
                this.f58241c = d(pVar, obj);
                return;
            case 0:
                this.f58241c = oi.G.l(pVar);
                return;
            case 1:
                this.f58241c = oi.G.j(pVar);
                return;
            case 2:
                this.f58241c = oi.G.f(pVar);
                return;
            case 3:
                this.f58241c = oi.G.h(pVar);
                return;
            case 4:
                this.f58241c = oi.G.d(pVar);
                return;
            case 5:
                this.f58241c = oi.G.c(pVar);
                return;
            case 6:
                this.f58241c = c(pVar, obj);
                return;
            default:
                throw new AssertionError("Unknown: " + a());
        }
    }
}
