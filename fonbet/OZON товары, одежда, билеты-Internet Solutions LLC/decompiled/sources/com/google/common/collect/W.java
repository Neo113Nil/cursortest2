package com.google.common.collect;

/* loaded from: classes.dex */
final class W<E> extends A<E> {

    /* renamed from: i, reason: collision with root package name */
    private static final Object[] f59046i;

    /* renamed from: j, reason: collision with root package name */
    static final W<Object> f59047j;

    /* renamed from: d, reason: collision with root package name */
    final transient Object[] f59048d;

    /* renamed from: e, reason: collision with root package name */
    private final transient int f59049e;

    /* renamed from: f, reason: collision with root package name */
    final transient Object[] f59050f;

    /* renamed from: g, reason: collision with root package name */
    private final transient int f59051g;

    /* renamed from: h, reason: collision with root package name */
    private final transient int f59052h;

    static {
        Object[] objArr = new Object[0];
        f59046i = objArr;
        f59047j = new W<>(objArr, 0, objArr, 0, 0);
    }

    W(Object[] objArr, int i11, Object[] objArr2, int i12, int i13) {
        this.f59048d = objArr;
        this.f59049e = i11;
        this.f59050f = objArr2;
        this.f59051g = i12;
        this.f59052h = i13;
    }

    @Override // com.google.common.collect.A
    final AbstractC5880y<E> A() {
        return AbstractC5880y.l(this.f59052h, this.f59048d);
    }

    @Override // com.google.common.collect.AbstractC5878w
    final int b(int i11, Object[] objArr) {
        Object[] objArr2 = this.f59048d;
        int i12 = this.f59052h;
        System.arraycopy(objArr2, 0, objArr, i11, i12);
        return i11 + i12;
    }

    @Override // com.google.common.collect.AbstractC5878w, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f59050f;
            if (objArr.length != 0) {
                int b11 = C5877v.b(obj);
                while (true) {
                    int i11 = b11 & this.f59051g;
                    Object obj2 = objArr[i11];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    b11 = i11 + 1;
                }
            }
        }
        return false;
    }

    @Override // com.google.common.collect.AbstractC5878w
    final Object[] e() {
        return this.f59048d;
    }

    @Override // com.google.common.collect.AbstractC5878w
    final int f() {
        return this.f59052h;
    }

    @Override // com.google.common.collect.AbstractC5878w
    final int g() {
        return 0;
    }

    @Override // com.google.common.collect.AbstractC5878w
    final boolean h() {
        return false;
    }

    @Override // com.google.common.collect.A, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f59049e;
    }

    @Override // com.google.common.collect.A, com.google.common.collect.AbstractC5878w, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: i */
    public final f0<E> iterator() {
        return a().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f59052h;
    }

    @Override // com.google.common.collect.A, com.google.common.collect.AbstractC5878w
    Object writeReplace() {
        return super.writeReplace();
    }
}
