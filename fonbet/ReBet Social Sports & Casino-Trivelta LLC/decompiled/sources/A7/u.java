package A7;

/* loaded from: classes2.dex */
public class u implements x {

    /* renamed from: a, reason: collision with root package name */
    public final x f251a;

    /* renamed from: b, reason: collision with root package name */
    public final z f252b;

    public u(x xVar, z zVar) {
        this.f251a = xVar;
        this.f252b = zVar;
    }

    @Override // A7.x
    public H6.a a(Object obj, H6.a aVar) {
        this.f252b.c(obj);
        return this.f251a.a(obj, aVar);
    }

    @Override // A7.x
    public void b(Object obj) {
        this.f251a.b(obj);
    }

    @Override // A7.x
    public boolean e(D6.l lVar) {
        return this.f251a.e(lVar);
    }

    @Override // A7.x
    public int f(D6.l lVar) {
        return this.f251a.f(lVar);
    }

    @Override // A7.x
    public H6.a get(Object obj) {
        H6.a aVar = this.f251a.get(obj);
        if (aVar == null) {
            this.f252b.b(obj);
            return aVar;
        }
        this.f252b.a(obj);
        return aVar;
    }
}
