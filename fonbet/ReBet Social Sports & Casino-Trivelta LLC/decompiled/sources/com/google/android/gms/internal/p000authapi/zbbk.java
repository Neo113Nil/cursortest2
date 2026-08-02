package com.google.android.gms.internal.p000authapi;

import java.util.Objects;

/* loaded from: classes2.dex */
final class zbbk extends zbbj {
    static final zbbj zba = new zbbk(new Object[0], 0);
    final transient Object[] zbb;
    private final transient int zbc;

    public zbbk(Object[] objArr, int i10) {
        this.zbb = objArr;
        this.zbc = i10;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        zbbd.zba(i10, this.zbc, "index");
        Object obj = this.zbb[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zbc;
    }

    @Override // com.google.android.gms.internal.p000authapi.zbbg
    public final Object[] zbb() {
        return this.zbb;
    }

    @Override // com.google.android.gms.internal.p000authapi.zbbg
    public final int zbc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.p000authapi.zbbg
    public final int zbd() {
        return this.zbc;
    }

    @Override // com.google.android.gms.internal.p000authapi.zbbg
    public final boolean zbf() {
        return false;
    }

    @Override // com.google.android.gms.internal.p000authapi.zbbj, com.google.android.gms.internal.p000authapi.zbbg
    public final int zbg(Object[] objArr, int i10) {
        Object[] objArr2 = this.zbb;
        int i11 = this.zbc;
        System.arraycopy(objArr2, 0, objArr, 0, i11);
        return i11;
    }
}
