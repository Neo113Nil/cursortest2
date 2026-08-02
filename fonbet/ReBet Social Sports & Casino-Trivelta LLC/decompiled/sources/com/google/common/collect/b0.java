package com.google.common.collect;

/* loaded from: classes3.dex */
public final class b0 extends E {
    private static final Object[] EMPTY_ARRAY;

    /* renamed from: e, reason: collision with root package name */
    public static final b0 f36767e;

    /* renamed from: b, reason: collision with root package name */
    public final transient int f36768b;

    /* renamed from: c, reason: collision with root package name */
    public final transient int f36769c;

    /* renamed from: d, reason: collision with root package name */
    public final transient int f36770d;
    final transient Object[] elements;
    final transient Object[] table;

    static {
        Object[] objArr = new Object[0];
        EMPTY_ARRAY = objArr;
        f36767e = new b0(objArr, 0, objArr, 0, 0);
    }

    public b0(Object[] objArr, int i10, Object[] objArr2, int i11, int i12) {
        this.elements = objArr;
        this.f36768b = i10;
        this.table = objArr2;
        this.f36769c = i11;
        this.f36770d = i12;
    }

    @Override // com.google.common.collect.AbstractC3443x
    public int b(Object[] objArr, int i10) {
        System.arraycopy(this.elements, 0, objArr, i10, this.f36770d);
        return i10 + this.f36770d;
    }

    @Override // com.google.common.collect.AbstractC3443x
    public Object[] c() {
        return this.elements;
    }

    @Override // com.google.common.collect.AbstractC3443x, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        Object[] objArr = this.table;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int c10 = AbstractC3441v.c(obj);
        while (true) {
            int i10 = c10 & this.f36769c;
            Object obj2 = objArr[i10];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            c10 = i10 + 1;
        }
    }

    @Override // com.google.common.collect.AbstractC3443x
    public int e() {
        return this.f36770d;
    }

    @Override // com.google.common.collect.AbstractC3443x
    public int f() {
        return 0;
    }

    @Override // com.google.common.collect.AbstractC3443x
    public boolean g() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: h */
    public m0 iterator() {
        return a().iterator();
    }

    @Override // com.google.common.collect.E, java.util.Collection, java.util.Set
    public int hashCode() {
        return this.f36768b;
    }

    @Override // com.google.common.collect.E
    public AbstractC3445z o() {
        return AbstractC3445z.j(this.elements, this.f36770d);
    }

    @Override // com.google.common.collect.E
    public boolean p() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f36770d;
    }

    @Override // com.google.common.collect.E, com.google.common.collect.AbstractC3443x
    public Object writeReplace() {
        return super.writeReplace();
    }
}
