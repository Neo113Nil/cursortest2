package com.google.android.gms.internal.identity_googleid;

import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class a extends zzj {
    public static final a d = new a(new Object[0]);
    public final transient Object[] c;

    public a(Object[] objArr) {
        this.c = objArr;
    }

    @Override // com.google.android.gms.internal.identity_googleid.zzj, com.google.android.gms.internal.identity_googleid.zzf
    public final void a(Object[] objArr) {
        System.arraycopy(this.c, 0, objArr, 0, 0);
    }

    @Override // com.google.android.gms.internal.identity_googleid.zzf
    public final int d() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zza.a(i, 0);
        Object obj = this.c[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.google.android.gms.internal.identity_googleid.zzf
    public final int m() {
        return 0;
    }

    @Override // com.google.android.gms.internal.identity_googleid.zzf
    public final Object[] o() {
        return this.c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return 0;
    }
}
