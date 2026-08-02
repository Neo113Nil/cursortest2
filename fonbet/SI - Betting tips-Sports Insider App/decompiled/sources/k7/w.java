package k7;

import j$.util.Objects;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class w extends m {

    /* renamed from: e, reason: collision with root package name */
    public static final w f18928e = new w(0, new Object[0]);

    /* renamed from: c, reason: collision with root package name */
    public final transient Object[] f18929c;

    /* renamed from: d, reason: collision with root package name */
    public final transient int f18930d;

    public w(int i5, Object[] objArr) {
        this.f18929c = objArr;
        this.f18930d = i5;
    }

    @Override // k7.m, k7.h
    public final int a(Object[] objArr) {
        Object[] objArr2 = this.f18929c;
        int i5 = this.f18930d;
        System.arraycopy(objArr2, 0, objArr, 0, i5);
        return i5;
    }

    @Override // k7.h
    public final int b() {
        return this.f18930d;
    }

    @Override // k7.h
    public final int c() {
        return 0;
    }

    @Override // k7.h
    public final Object[] e() {
        return this.f18929c;
    }

    @Override // java.util.List
    public final Object get(int i5) {
        a.f(i5, this.f18930d);
        Object obj = this.f18929c[i5];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f18930d;
    }
}
