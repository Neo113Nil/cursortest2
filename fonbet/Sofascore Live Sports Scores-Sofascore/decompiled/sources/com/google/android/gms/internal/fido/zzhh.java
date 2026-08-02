package com.google.android.gms.internal.fido;

import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhh extends zzhp {
    public final boolean a;

    public zzhh(boolean z) {
        this.a = z;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        zzhp zzhpVar = (zzhp) obj;
        int zza = zzhpVar.zza();
        int c = zzhp.c((byte) -32);
        if (c != zza) {
            return c - zzhpVar.zza();
        }
        return (true != this.a ? 20 : 21) - (true != ((zzhh) zzhpVar).a ? 20 : 21);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && zzhh.class == obj.getClass() && this.a == ((zzhh) obj).a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(zzhp.c((byte) -32)), Boolean.valueOf(this.a)});
    }

    public final String toString() {
        return Boolean.toString(this.a);
    }

    @Override // com.google.android.gms.internal.fido.zzhp
    public final int zza() {
        return zzhp.c((byte) -32);
    }
}
