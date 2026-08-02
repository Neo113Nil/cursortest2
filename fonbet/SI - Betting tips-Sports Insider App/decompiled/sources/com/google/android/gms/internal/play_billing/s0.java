package com.google.android.gms.internal.play_billing;

import j$.util.Objects;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class s0 extends d0 {

    /* renamed from: e, reason: collision with root package name */
    public static final s0 f5567e = new s0(0, new Object[0]);

    /* renamed from: c, reason: collision with root package name */
    public final transient Object[] f5568c;

    /* renamed from: d, reason: collision with root package name */
    public final transient int f5569d;

    public s0(int i5, Object[] objArr) {
        this.f5568c = objArr;
        this.f5569d = i5;
    }

    @Override // com.google.android.gms.internal.play_billing.d0, com.google.android.gms.internal.play_billing.y
    public final int a(Object[] objArr) {
        Object[] objArr2 = this.f5568c;
        int i5 = this.f5569d;
        System.arraycopy(objArr2, 0, objArr, 0, i5);
        return i5;
    }

    @Override // com.google.android.gms.internal.play_billing.y
    public final int b() {
        return this.f5569d;
    }

    @Override // com.google.android.gms.internal.play_billing.y
    public final int c() {
        return 0;
    }

    @Override // com.google.android.gms.internal.play_billing.y
    public final boolean e() {
        return false;
    }

    @Override // com.google.android.gms.internal.play_billing.y
    public final Object[] f() {
        return this.f5568c;
    }

    @Override // java.util.List
    public final Object get(int i5) {
        d3.h(i5, this.f5569d);
        Object obj = this.f5568c[i5];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5569d;
    }
}
