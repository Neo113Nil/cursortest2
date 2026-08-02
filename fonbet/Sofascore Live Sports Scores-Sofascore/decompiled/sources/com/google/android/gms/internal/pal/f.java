package com.google.android.gms.internal.pal;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class f extends zziz {
    public static final f d = new f(new Object[0]);
    public final transient Object[] c;

    public f(Object[] objArr) {
        this.c = objArr;
    }

    @Override // com.google.android.gms.internal.pal.zziz, com.google.android.gms.internal.pal.zziw
    public final void a(Object[] objArr) {
        System.arraycopy(this.c, 0, objArr, 0, 0);
    }

    @Override // com.google.android.gms.internal.pal.zziw
    public final int d() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzip.a(i, 0);
        Object obj = this.c[i];
        obj.getClass();
        return obj;
    }

    @Override // com.google.android.gms.internal.pal.zziw
    public final int m() {
        return 0;
    }

    @Override // com.google.android.gms.internal.pal.zziw
    public final Object[] o() {
        return this.c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return 0;
    }
}
