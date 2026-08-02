package com.google.android.gms.internal.play_billing;

import defpackage.tba;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class b extends zzcf {
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

    @Override // com.google.android.gms.internal.play_billing.zzbx
    public final int a(Object[] objArr) {
        Object[] objArr2 = this.d;
        int i2 = this.h;
        System.arraycopy(objArr2, 0, objArr, 0, i2);
        return i2;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbx, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f;
            if (objArr.length != 0) {
                int Q = tba.Q(obj.hashCode());
                while (true) {
                    int i2 = Q & this.g;
                    Object obj2 = objArr[i2];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    Q = i2 + 1;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbx
    public final int d() {
        return this.h;
    }

    @Override // com.google.android.gms.internal.play_billing.zzcf, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.e;
    }

    @Override // com.google.android.gms.internal.play_billing.zzcf, com.google.android.gms.internal.play_billing.zzbx, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return n().listIterator(0);
    }

    @Override // com.google.android.gms.internal.play_billing.zzbx
    public final int m() {
        return 0;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbx
    /* renamed from: o */
    public final zzcs iterator() {
        return n().listIterator(0);
    }

    @Override // com.google.android.gms.internal.play_billing.zzbx
    public final Object[] q() {
        return this.d;
    }

    @Override // com.google.android.gms.internal.play_billing.zzcf
    public final zzca s() {
        return zzca.s(this.h, this.d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.h;
    }
}
