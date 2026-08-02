package com.google.android.gms.internal.ads;

import defpackage.v4n;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class zzaaa implements zzabe {
    public final zzbg a;
    public final int b;
    public final int[] c;
    public final zzv[] d;
    public int e;

    public zzaaa(zzbg zzbgVar, int[] iArr) {
        zzv[] zzvVarArr;
        int length = iArr.length;
        zzguk.f(length > 0);
        zzbgVar.getClass();
        zzv[] zzvVarArr2 = zzbgVar.d;
        this.a = zzbgVar;
        this.b = length;
        this.d = new zzv[length];
        int i = 0;
        while (true) {
            int length2 = iArr.length;
            zzvVarArr = this.d;
            if (i >= length2) {
                break;
            }
            zzvVarArr[i] = zzvVarArr2[iArr[i]];
            i++;
        }
        Arrays.sort(zzvVarArr, v4n.p);
        this.c = new int[this.b];
        for (int i2 = 0; i2 < this.b; i2++) {
            int[] iArr2 = this.c;
            zzv zzvVar = this.d[i2];
            int i3 = 0;
            while (true) {
                if (i3 >= zzvVarArr2.length) {
                    i3 = -1;
                    break;
                } else if (zzvVar == zzvVarArr2[i3]) {
                    break;
                } else {
                    i3++;
                }
            }
            iArr2[i2] = i3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzaaa zzaaaVar = (zzaaa) obj;
            if (this.a.equals(zzaaaVar.a) && Arrays.equals(this.c, zzaaaVar.c)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzabj
    public final int f(int i) {
        for (int i2 = 0; i2 < this.b; i2++) {
            if (this.c[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    public final int hashCode() {
        int i = this.e;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.c) + (System.identityHashCode(this.a) * 31);
        this.e = hashCode;
        return hashCode;
    }

    @Override // com.google.android.gms.internal.ads.zzabj
    public final zzbg zza() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.ads.zzabj
    public final zzv zzb(int i) {
        return this.d[i];
    }

    @Override // com.google.android.gms.internal.ads.zzabe
    public final zzv zzc() {
        return this.d[0];
    }

    @Override // com.google.android.gms.internal.ads.zzabj
    public final int zze() {
        return this.c.length;
    }

    @Override // com.google.android.gms.internal.ads.zzabj
    public final int zzf(int i) {
        return this.c[i];
    }

    @Override // com.google.android.gms.internal.ads.zzabe
    public final int zzh() {
        return this.c[0];
    }
}
