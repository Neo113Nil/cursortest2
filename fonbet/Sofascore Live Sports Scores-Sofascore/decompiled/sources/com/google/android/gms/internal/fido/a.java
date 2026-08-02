package com.google.android.gms.internal.fido;

import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class a extends zzcc {
    public static final a e = new a(new Object[0], 0);
    public final transient Object[] c;
    public final transient int d;

    public a(Object[] objArr, int i) {
        this.c = objArr;
        this.d = i;
    }

    @Override // com.google.android.gms.internal.fido.zzcc, com.google.android.gms.internal.fido.zzby
    public final int a(Object[] objArr) {
        Object[] objArr2 = this.c;
        int i = this.d;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // com.google.android.gms.internal.fido.zzby
    public final int d() {
        return this.d;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzbm.a(i, this.d);
        Object obj = this.c[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.google.android.gms.internal.fido.zzby
    public final int m() {
        return 0;
    }

    @Override // com.google.android.gms.internal.fido.zzby
    public final Object[] o() {
        return this.c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
