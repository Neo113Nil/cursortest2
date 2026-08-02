package j$.util.concurrent;

/* loaded from: classes2.dex */
public final class p extends j {

    /* renamed from: e, reason: collision with root package name */
    public p f17677e;

    /* renamed from: f, reason: collision with root package name */
    public p f17678f;

    /* renamed from: g, reason: collision with root package name */
    public p f17679g;

    /* renamed from: h, reason: collision with root package name */
    public p f17680h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f17681i;

    public p(int i5, Object obj, Object obj2, j jVar, p pVar) {
        super(i5, obj, obj2, jVar);
        this.f17677e = pVar;
    }

    @Override // j$.util.concurrent.j
    public final j a(int i5, Object obj) {
        return b(i5, obj, null);
    }

    public final p b(int i5, Object obj, Class cls) {
        if (obj == null) {
            return null;
        }
        p pVar = this;
        do {
            p pVar2 = pVar.f17678f;
            p pVar3 = pVar.f17679g;
            int i10 = pVar.f17656a;
            if (i10 <= i5) {
                if (i10 >= i5) {
                    Object obj2 = pVar.f17657b;
                    if (obj2 == obj || (obj2 != null && obj.equals(obj2))) {
                        return pVar;
                    }
                    if (pVar2 != null) {
                        if (pVar3 != null) {
                            if (cls != null || (cls = ConcurrentHashMap.c(obj)) != null) {
                                int i11 = ConcurrentHashMap.f17625g;
                                int compareTo = (obj2 == null || obj2.getClass() != cls) ? 0 : ((Comparable) obj).compareTo(obj2);
                                if (compareTo != 0) {
                                    if (compareTo >= 0) {
                                        pVar2 = pVar3;
                                    }
                                }
                            }
                            p b10 = pVar3.b(i5, obj, cls);
                            if (b10 != null) {
                                return b10;
                            }
                        }
                    }
                }
                pVar = pVar3;
            }
            pVar = pVar2;
        } while (pVar != null);
        return null;
    }
}
