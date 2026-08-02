package f2;

/* loaded from: classes.dex */
final class f<T> {

    /* renamed from: a, reason: collision with root package name */
    private final Object[] f62470a = new Object[256];

    /* renamed from: b, reason: collision with root package name */
    private int f62471b;

    f() {
    }

    public final T a() {
        int i11 = this.f62471b;
        if (i11 <= 0) {
            return null;
        }
        int i12 = i11 - 1;
        Object[] objArr = this.f62470a;
        T t2 = (T) objArr[i12];
        objArr[i12] = null;
        this.f62471b = i11 - 1;
        return t2;
    }

    public final void b(C6402b c6402b) {
        int i11 = this.f62471b;
        Object[] objArr = this.f62470a;
        if (i11 < objArr.length) {
            objArr[i11] = c6402b;
            this.f62471b = i11 + 1;
        }
    }

    public final void c(int i11, Object[] objArr) {
        if (i11 > objArr.length) {
            i11 = objArr.length;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            Object obj = objArr[i12];
            int i13 = this.f62471b;
            Object[] objArr2 = this.f62470a;
            if (i13 < objArr2.length) {
                objArr2[i13] = obj;
                this.f62471b = i13 + 1;
            }
        }
    }
}
