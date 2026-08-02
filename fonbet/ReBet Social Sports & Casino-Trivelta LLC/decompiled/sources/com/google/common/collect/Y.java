package com.google.common.collect;

import com.google.common.collect.a0;

/* loaded from: classes3.dex */
public final class Y extends AbstractC3442w {

    /* renamed from: h, reason: collision with root package name */
    public static final Y f36741h = new Y();
    final transient Object[] alternatingKeysAndValues;

    /* renamed from: d, reason: collision with root package name */
    public final transient Object f36742d;

    /* renamed from: e, reason: collision with root package name */
    public final transient int f36743e;

    /* renamed from: f, reason: collision with root package name */
    public final transient int f36744f;

    /* renamed from: g, reason: collision with root package name */
    public final transient Y f36745g;

    public Y() {
        this.f36742d = null;
        this.alternatingKeysAndValues = new Object[0];
        this.f36743e = 0;
        this.f36744f = 0;
        this.f36745g = this;
    }

    @Override // com.google.common.collect.B
    public E f() {
        return new a0.a(this, this.alternatingKeysAndValues, this.f36743e, this.f36744f);
    }

    @Override // com.google.common.collect.B
    public E g() {
        return new a0.b(this, new a0.c(this.alternatingKeysAndValues, this.f36743e, this.f36744f));
    }

    @Override // com.google.common.collect.B, java.util.Map
    public Object get(Object obj) {
        Object v10 = a0.v(this.f36742d, this.alternatingKeysAndValues, this.f36744f, this.f36743e, obj);
        if (v10 == null) {
            return null;
        }
        return v10;
    }

    @Override // com.google.common.collect.B
    public boolean k() {
        return false;
    }

    @Override // com.google.common.collect.AbstractC3442w
    public AbstractC3442w s() {
        return this.f36745g;
    }

    @Override // java.util.Map
    public int size() {
        return this.f36744f;
    }

    @Override // com.google.common.collect.AbstractC3442w, com.google.common.collect.B
    public Object writeReplace() {
        return super.writeReplace();
    }

    public Y(Object[] objArr, int i10) {
        this.alternatingKeysAndValues = objArr;
        this.f36744f = i10;
        this.f36743e = 0;
        int k10 = i10 >= 2 ? E.k(i10) : 0;
        this.f36742d = a0.u(objArr, i10, k10, 0);
        this.f36745g = new Y(a0.u(objArr, i10, k10, 1), objArr, i10, this);
    }

    public Y(Object obj, Object[] objArr, int i10, Y y10) {
        this.f36742d = obj;
        this.alternatingKeysAndValues = objArr;
        this.f36743e = 1;
        this.f36744f = i10;
        this.f36745g = y10;
    }
}
