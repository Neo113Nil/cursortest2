package m7;

import j$.util.Objects;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class o extends n {

    /* renamed from: e, reason: collision with root package name */
    public static final o f20470e = new o(0, new Object[0]);

    /* renamed from: c, reason: collision with root package name */
    public final transient Object[] f20471c;

    /* renamed from: d, reason: collision with root package name */
    public final transient int f20472d;

    public o(int i5, Object[] objArr) {
        this.f20471c = objArr;
        this.f20472d = i5;
    }

    @Override // m7.k
    public final Object[] a() {
        return this.f20471c;
    }

    @Override // m7.k
    public final int b() {
        return 0;
    }

    @Override // m7.k
    public final int c() {
        return this.f20472d;
    }

    @Override // m7.k
    public final boolean d() {
        return false;
    }

    @Override // m7.n, m7.k
    public final int e(Object[] objArr) {
        Object[] objArr2 = this.f20471c;
        int i5 = this.f20472d;
        System.arraycopy(objArr2, 0, objArr, 0, i5);
        return i5;
    }

    @Override // java.util.List
    public final Object get(int i5) {
        y4.a.K(i5, this.f20472d);
        Object obj = this.f20471c[i5];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f20472d;
    }
}
