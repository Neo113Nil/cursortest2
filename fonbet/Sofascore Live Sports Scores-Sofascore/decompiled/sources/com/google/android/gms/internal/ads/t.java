package com.google.android.gms.internal.ads;

import defpackage.d2a;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class t extends zzgxw {
    public static final Object[] i;
    public static final t j;
    public final transient Object[] d;
    public final transient int e;
    public final transient Object[] f;
    public final transient int g;
    public final transient int h;

    static {
        Object[] objArr = new Object[0];
        i = objArr;
        j = new t(0, 0, 0, objArr, objArr);
    }

    public t(int i2, int i3, int i4, Object[] objArr, Object[] objArr2) {
        this.d = objArr;
        this.e = i2;
        this.f = objArr2;
        this.g = i3;
        this.h = i4;
    }

    @Override // com.google.android.gms.internal.ads.zzgxi, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f;
            if (objArr.length != 0) {
                int J = d2a.J(obj);
                while (true) {
                    int i2 = J & this.g;
                    Object obj2 = objArr[i2];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    J = i2 + 1;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgxi
    /* renamed from: d */
    public final zzhaa iterator() {
        return p().listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.zzgxw, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.e;
    }

    @Override // com.google.android.gms.internal.ads.zzgxw, com.google.android.gms.internal.ads.zzgxi, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return p().listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.zzgxi
    public final Object[] m() {
        return this.d;
    }

    @Override // com.google.android.gms.internal.ads.zzgxi
    public final int n() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzgxi
    public final int o() {
        return this.h;
    }

    @Override // com.google.android.gms.internal.ads.zzgxi
    public final boolean q() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgxi
    public final int r(Object[] objArr, int i2) {
        Object[] objArr2 = this.d;
        int i3 = this.h;
        System.arraycopy(objArr2, 0, objArr, i2, i3);
        return i2 + i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.h;
    }

    @Override // com.google.android.gms.internal.ads.zzgxw
    public final zzgxm w() {
        return zzgxm.z(this.h, this.d);
    }
}
