package com.google.android.gms.internal.consent_sdk;

import defpackage.m0o;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class b extends zzdw {
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

    @Override // com.google.android.gms.internal.consent_sdk.zzds
    public final void a(Object[] objArr) {
        System.arraycopy(this.d, 0, objArr, 0, this.h);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzds, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        Object[] objArr = this.f;
        if (objArr.length == 0) {
            return false;
        }
        int rotateLeft = (int) (Integer.rotateLeft((int) (obj.hashCode() * (-862048943)), 15) * 461845907);
        while (true) {
            int i2 = rotateLeft & this.g;
            Object obj2 = objArr[i2];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            rotateLeft = i2 + 1;
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzds
    public final int d() {
        return this.h;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdw, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.e;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdw, com.google.android.gms.internal.consent_sdk.zzds, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        zzdv zzdvVar = this.b;
        if (zzdvVar == null) {
            m0o m0oVar = zzdv.b;
            int i2 = this.h;
            zzdvVar = i2 == 0 ? a.e : new a(this.d, i2);
            this.b = zzdvVar;
        }
        return zzdvVar.listIterator(0);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzds
    public final int m() {
        return 0;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzds
    /* renamed from: n */
    public final zzeb iterator() {
        zzdv zzdvVar = this.b;
        if (zzdvVar == null) {
            m0o m0oVar = zzdv.b;
            int i2 = this.h;
            zzdvVar = i2 == 0 ? a.e : new a(this.d, i2);
            this.b = zzdvVar;
        }
        return zzdvVar.listIterator(0);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzds
    public final Object[] o() {
        return this.d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.h;
    }
}
