package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhbh implements Serializable {
    public static final zzhbh c = new zzhbh(new long[0], 0);
    public final long[] a;
    public final int b;

    public zzhbh(long[] jArr, int i) {
        this.a = jArr;
        this.b = i;
    }

    public final long a(int i) {
        zzguk.i(i, this.b);
        return this.a[i];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzhbh)) {
            return false;
        }
        zzhbh zzhbhVar = (zzhbh) obj;
        int i = zzhbhVar.b;
        int i2 = this.b;
        if (i2 != i) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (a(i3) != zzhbhVar.a(i3)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.b; i2++) {
            i = (i * 31) + Long.hashCode(this.a[i2]);
        }
        return i;
    }

    public final String toString() {
        int i = this.b;
        if (i == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder(i * 5);
        sb.append('[');
        long[] jArr = this.a;
        sb.append(jArr[0]);
        for (int i2 = 1; i2 < i; i2++) {
            sb.append(", ");
            sb.append(jArr[i2]);
        }
        sb.append(']');
        return sb.toString();
    }
}
