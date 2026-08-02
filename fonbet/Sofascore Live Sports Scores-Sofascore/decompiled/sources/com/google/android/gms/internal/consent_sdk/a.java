package com.google.android.gms.internal.consent_sdk;

import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class a extends zzdv {
    public static final a e = new a(new Object[0], 0);
    public final transient Object[] c;
    public final transient int d;

    public a(Object[] objArr, int i) {
        this.c = objArr;
        this.d = i;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdv, com.google.android.gms.internal.consent_sdk.zzds
    public final void a(Object[] objArr) {
        System.arraycopy(this.c, 0, objArr, 0, this.d);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzds
    public final int d() {
        return this.d;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzdj.a(i, this.d);
        Object obj = this.c[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzds
    public final int m() {
        return 0;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzds
    public final Object[] o() {
        return this.c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
