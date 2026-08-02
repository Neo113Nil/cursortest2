package j$.util.concurrent;

/* loaded from: classes2.dex */
public abstract class a extends n {

    /* renamed from: i, reason: collision with root package name */
    public final ConcurrentHashMap f17648i;
    public j j;

    public a(j[] jVarArr, int i5, int i10, ConcurrentHashMap concurrentHashMap) {
        super(jVarArr, i5, 0, i10);
        this.f17648i = concurrentHashMap;
        a();
    }

    public final boolean hasNext() {
        return this.f17665b != null;
    }

    public final boolean hasMoreElements() {
        return this.f17665b != null;
    }

    public final void remove() {
        j jVar = this.j;
        if (jVar == null) {
            throw new IllegalStateException();
        }
        this.j = null;
        this.f17648i.g(jVar.f17657b, null, null);
    }
}
