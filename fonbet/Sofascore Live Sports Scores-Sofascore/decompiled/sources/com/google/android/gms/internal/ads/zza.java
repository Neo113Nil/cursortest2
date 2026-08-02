package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zza {
    public final int a;
    public final Uri[] b;
    public final zzak[] c;
    public final int[] d;
    public final long[] e;
    public final String[] f;
    public final zzb[] g;

    static {
        String str = zzfm.a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
        Integer.toString(8, 36);
        Integer.toString(9, 36);
        Integer.toString(10, 36);
        Integer.toString(11, 36);
    }

    public zza(int i, int[] iArr, zzak[] zzakVarArr, long[] jArr, String[] strArr, zzb[] zzbVarArr) {
        Uri uri;
        int length = iArr.length;
        int length2 = zzakVarArr.length;
        int i2 = 0;
        zzguk.a(length == length2);
        zzguk.a(length == zzbVarArr.length);
        this.a = i;
        this.d = iArr;
        this.c = zzakVarArr;
        this.e = jArr;
        this.b = new Uri[length2];
        while (true) {
            Uri[] uriArr = this.b;
            if (i2 >= uriArr.length) {
                this.f = strArr;
                this.g = zzbVarArr;
                return;
            }
            zzak zzakVar = zzakVarArr[i2];
            if (zzakVar == null) {
                uri = null;
            } else {
                zzag zzagVar = zzakVar.b;
                zzagVar.getClass();
                uri = zzagVar.a;
            }
            uriArr[i2] = uri;
            i2++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zza.class != obj.getClass()) {
            return false;
        }
        zza zzaVar = (zza) obj;
        return this.a == zzaVar.a && Arrays.equals(this.c, zzaVar.c) && Arrays.equals(this.d, zzaVar.d) && Arrays.equals(this.e, zzaVar.e) && Arrays.equals(this.f, zzaVar.f) && Arrays.equals(this.g, zzaVar.g);
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.g) + ((((Arrays.hashCode(this.e) + ((Arrays.hashCode(this.d) + ((Arrays.hashCode(this.c) + (((this.a * 31) - 1) * 961)) * 31)) * 31)) * 29791) + Arrays.hashCode(this.f)) * 31)) * 31;
    }
}
