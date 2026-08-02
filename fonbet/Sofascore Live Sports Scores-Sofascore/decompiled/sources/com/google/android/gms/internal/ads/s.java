package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class s extends zzgxm {
    public static final s e = new s(new Object[0], 0);
    public final transient Object[] c;
    public final transient int d;

    public s(Object[] objArr, int i) {
        this.c = objArr;
        this.d = i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzguk.i(i, this.d);
        Object obj = this.c[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.google.android.gms.internal.ads.zzgxi
    public final Object[] m() {
        return this.c;
    }

    @Override // com.google.android.gms.internal.ads.zzgxi
    public final int n() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzgxi
    public final int o() {
        return this.d;
    }

    @Override // com.google.android.gms.internal.ads.zzgxi
    public final boolean q() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgxm, com.google.android.gms.internal.ads.zzgxi
    public final int r(Object[] objArr, int i) {
        Object[] objArr2 = this.c;
        int i2 = this.d;
        System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
