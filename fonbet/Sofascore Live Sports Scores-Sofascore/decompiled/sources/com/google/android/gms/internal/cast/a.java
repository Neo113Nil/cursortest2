package com.google.android.gms.internal.cast;

import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class a extends zzhv {
    public static final a e = new a(new Object[0], 0);
    public final transient Object[] c;
    public final transient int d;

    public a(Object[] objArr, int i) {
        this.c = objArr;
        this.d = i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzhd.a(i, this.d);
        Object obj = this.c[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.google.android.gms.internal.cast.zzhr
    public final Object[] m() {
        return this.c;
    }

    @Override // com.google.android.gms.internal.cast.zzhr
    public final int n() {
        return 0;
    }

    @Override // com.google.android.gms.internal.cast.zzhr
    public final int o() {
        return this.d;
    }

    @Override // com.google.android.gms.internal.cast.zzhv, com.google.android.gms.internal.cast.zzhr
    public final int p(Object[] objArr) {
        Object[] objArr2 = this.c;
        int i = this.d;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
