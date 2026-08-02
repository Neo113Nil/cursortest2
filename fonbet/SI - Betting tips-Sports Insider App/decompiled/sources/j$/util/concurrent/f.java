package j$.util.concurrent;

/* loaded from: classes2.dex */
public final class f extends j {

    /* renamed from: e, reason: collision with root package name */
    public final j[] f17650e;

    public f(j[] jVarArr) {
        super(-1, null, null);
        this.f17650e = jVarArr;
    }

    @Override // j$.util.concurrent.j
    public final j a(int i5, Object obj) {
        j k6;
        Object obj2;
        j[] jVarArr = this.f17650e;
        loop0: while (true) {
            int length = jVarArr.length;
            if (length == 0 || (k6 = ConcurrentHashMap.k(jVarArr, (length - 1) & i5)) == null) {
                return null;
            }
            do {
                int i10 = k6.f17656a;
                if (i10 != i5 || ((obj2 = k6.f17657b) != obj && (obj2 == null || !obj.equals(obj2)))) {
                    if (i10 < 0) {
                        if (k6 instanceof f) {
                            jVarArr = ((f) k6).f17650e;
                        } else {
                            return k6.a(i5, obj);
                        }
                    } else {
                        k6 = k6.f17659d;
                    }
                }
            } while (k6 != null);
            return null;
        }
        return k6;
    }
}
