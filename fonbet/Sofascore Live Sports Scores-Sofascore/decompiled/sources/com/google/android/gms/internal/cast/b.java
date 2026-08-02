package com.google.android.gms.internal.cast;

import defpackage.b6a;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class b extends zzhz {
    public static final Object[] i;
    public static final b j;
    public final transient Object[] d;
    public final transient int e;
    public final transient Object[] f;
    public final transient int g;
    public final transient int h;

    static {
        Object[] objArr = new Object[0];
        i = objArr;
        j = new b(0, 0, 0, objArr, objArr);
    }

    public b(int i2, int i3, int i4, Object[] objArr, Object[] objArr2) {
        this.d = objArr;
        this.e = i2;
        this.f = objArr2;
        this.g = i3;
        this.h = i4;
    }

    @Override // com.google.android.gms.internal.cast.zzhr, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f;
            if (objArr.length != 0) {
                int F = b6a.F(obj.hashCode());
                while (true) {
                    int i2 = F & this.g;
                    Object obj2 = objArr[i2];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    F = i2 + 1;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.cast.zzhr
    /* renamed from: d */
    public final zzil iterator() {
        return q().listIterator(0);
    }

    @Override // com.google.android.gms.internal.cast.zzhz, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.e;
    }

    @Override // com.google.android.gms.internal.cast.zzhz, com.google.android.gms.internal.cast.zzhr, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return q().listIterator(0);
    }

    @Override // com.google.android.gms.internal.cast.zzhr
    public final Object[] m() {
        return this.d;
    }

    @Override // com.google.android.gms.internal.cast.zzhr
    public final int n() {
        return 0;
    }

    @Override // com.google.android.gms.internal.cast.zzhr
    public final int o() {
        return this.h;
    }

    @Override // com.google.android.gms.internal.cast.zzhr
    public final int p(Object[] objArr) {
        Object[] objArr2 = this.d;
        int i2 = this.h;
        System.arraycopy(objArr2, 0, objArr, 0, i2);
        return i2;
    }

    @Override // com.google.android.gms.internal.cast.zzhz
    public final zzhv s() {
        return zzhv.r(this.h, this.d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.h;
    }
}
