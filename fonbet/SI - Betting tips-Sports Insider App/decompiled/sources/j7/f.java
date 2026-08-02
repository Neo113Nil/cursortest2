package j7;

import j$.util.Objects;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f extends e {

    /* renamed from: e, reason: collision with root package name */
    public static final f f18273e = new f(0, new Object[0]);

    /* renamed from: c, reason: collision with root package name */
    public final transient Object[] f18274c;

    /* renamed from: d, reason: collision with root package name */
    public final transient int f18275d;

    public f(int i5, Object[] objArr) {
        this.f18274c = objArr;
        this.f18275d = i5;
    }

    @Override // j7.a
    public final Object[] a() {
        return this.f18274c;
    }

    @Override // j7.a
    public final int b() {
        return 0;
    }

    @Override // j7.a
    public final int c() {
        return this.f18275d;
    }

    @Override // j7.e, j7.a
    public final int d(Object[] objArr) {
        Object[] objArr2 = this.f18274c;
        int i5 = this.f18275d;
        System.arraycopy(objArr2, 0, objArr, 0, i5);
        return i5;
    }

    @Override // java.util.List
    public final Object get(int i5) {
        y4.a.I(i5, this.f18275d);
        Object obj = this.f18274c[i5];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f18275d;
    }
}
