package f8;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class r extends j {

    /* renamed from: i, reason: collision with root package name */
    public static final Object[] f9532i;
    public static final r j;

    /* renamed from: d, reason: collision with root package name */
    public final transient Object[] f9533d;

    /* renamed from: e, reason: collision with root package name */
    public final transient int f9534e;

    /* renamed from: f, reason: collision with root package name */
    public final transient Object[] f9535f;

    /* renamed from: g, reason: collision with root package name */
    public final transient int f9536g;

    /* renamed from: h, reason: collision with root package name */
    public final transient int f9537h;

    static {
        Object[] objArr = new Object[0];
        f9532i = objArr;
        j = new r(0, 0, 0, objArr, objArr);
    }

    public r(int i5, int i10, int i11, Object[] objArr, Object[] objArr2) {
        this.f9533d = objArr;
        this.f9534e = i5;
        this.f9535f = objArr2;
        this.f9536g = i10;
        this.f9537h = i11;
    }

    @Override // f8.a
    public final int a(Object[] objArr) {
        Object[] objArr2 = this.f9533d;
        int i5 = this.f9537h;
        System.arraycopy(objArr2, 0, objArr, 0, i5);
        return i5;
    }

    @Override // f8.a
    public final Object[] b() {
        return this.f9533d;
    }

    @Override // f8.a
    public final int c() {
        return this.f9537h;
    }

    @Override // f8.a, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f9535f;
            if (objArr.length != 0) {
                int y5 = m4.g.y(obj.hashCode());
                while (true) {
                    int i5 = y5 & this.f9536g;
                    Object obj2 = objArr[i5];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    y5 = i5 + 1;
                }
            }
        }
        return false;
    }

    @Override // f8.a
    public final int d() {
        return 0;
    }

    @Override // f8.a
    /* renamed from: e */
    public final t iterator() {
        return f().listIterator(0);
    }

    @Override // f8.j, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f9534e;
    }

    @Override // f8.j
    public final e i() {
        return e.f(this.f9537h, this.f9533d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f9537h;
    }
}
