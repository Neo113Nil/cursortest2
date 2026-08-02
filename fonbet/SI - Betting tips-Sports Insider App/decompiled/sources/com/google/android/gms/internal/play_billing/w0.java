package com.google.android.gms.internal.play_billing;

import j$.util.Objects;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class w0 extends d0 {

    /* renamed from: c, reason: collision with root package name */
    public final transient Object[] f5610c;

    /* renamed from: d, reason: collision with root package name */
    public final transient int f5611d;

    /* renamed from: e, reason: collision with root package name */
    public final transient int f5612e;

    public w0(int i5, int i10, Object[] objArr) {
        this.f5610c = objArr;
        this.f5611d = i5;
        this.f5612e = i10;
    }

    @Override // com.google.android.gms.internal.play_billing.y
    public final boolean e() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i5) {
        d3.h(i5, this.f5612e);
        Object obj = this.f5610c[i5 + i5 + this.f5611d];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5612e;
    }
}
