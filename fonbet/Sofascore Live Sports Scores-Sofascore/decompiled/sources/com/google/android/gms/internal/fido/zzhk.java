package com.google.android.gms.internal.fido;

import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhk extends zzhp {
    public final long a;

    public zzhk(long j) {
        this.a = j;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        zzhp zzhpVar = (zzhp) obj;
        if (zza() != zzhpVar.zza()) {
            return zza() - zzhpVar.zza();
        }
        long abs = Math.abs(this.a);
        long abs2 = Math.abs(((zzhk) zzhpVar).a);
        if (abs < abs2) {
            return -1;
        }
        return abs > abs2 ? 1 : 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && zzhk.class == obj.getClass() && this.a == ((zzhk) obj).a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(zza()), Long.valueOf(this.a)});
    }

    public final String toString() {
        return Long.toString(this.a);
    }

    @Override // com.google.android.gms.internal.fido.zzhp
    public final int zza() {
        return zzhp.c(this.a >= 0 ? (byte) 0 : (byte) 32);
    }
}
