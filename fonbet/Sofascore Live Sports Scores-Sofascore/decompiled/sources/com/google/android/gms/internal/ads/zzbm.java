package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbm {
    public final int a;
    public final zzbg b;
    public final boolean c;
    public final int[] d;
    public final boolean[] e;

    static {
        String str = zzfm.a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
    }

    public zzbm(zzbg zzbgVar, boolean z, int[] iArr, boolean[] zArr) {
        int i = zzbgVar.a;
        this.a = i;
        zzguk.a(i == iArr.length && i == zArr.length);
        this.b = zzbgVar;
        this.c = z && i > 1;
        this.d = (int[]) iArr.clone();
        this.e = (boolean[]) zArr.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzbm.class != obj.getClass()) {
            return false;
        }
        zzbm zzbmVar = (zzbm) obj;
        return this.c == zzbmVar.c && this.b.equals(zzbmVar.b) && Arrays.equals(this.d, zzbmVar.d) && Arrays.equals(this.e, zzbmVar.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.e) + ((Arrays.hashCode(this.d) + (((this.b.hashCode() * 31) + (this.c ? 1 : 0)) * 31)) * 31);
    }
}
