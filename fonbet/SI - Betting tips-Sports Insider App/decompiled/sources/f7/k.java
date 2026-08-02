package f7;

import j$.util.Objects;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class k extends j {

    /* renamed from: e, reason: collision with root package name */
    public static final k f9490e = new k(0, new Object[0]);

    /* renamed from: c, reason: collision with root package name */
    public final transient Object[] f9491c;

    /* renamed from: d, reason: collision with root package name */
    public final transient int f9492d;

    public k(int i5, Object[] objArr) {
        this.f9491c = objArr;
        this.f9492d = i5;
    }

    @Override // f7.g
    public final Object[] a() {
        return this.f9491c;
    }

    @Override // f7.g
    public final int b() {
        return 0;
    }

    @Override // f7.g
    public final int c() {
        return this.f9492d;
    }

    @Override // f7.g
    public final boolean d() {
        return false;
    }

    @Override // f7.j, f7.g
    public final int e(Object[] objArr) {
        Object[] objArr2 = this.f9491c;
        int i5 = this.f9492d;
        System.arraycopy(objArr2, 0, objArr, 0, i5);
        return i5;
    }

    @Override // java.util.List
    public final Object get(int i5) {
        e.c(i5, this.f9492d);
        Object obj = this.f9491c[i5];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f9492d;
    }
}
