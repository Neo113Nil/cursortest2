package com.google.android.gms.internal.fido;

import defpackage.mz1;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhn extends zzhp {
    public final String a;

    public zzhn(String str) {
        this.a = str;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        zzhp zzhpVar = (zzhp) obj;
        int zza = zzhpVar.zza();
        int c = zzhp.c((byte) 96);
        if (c != zza) {
            return c - zzhpVar.zza();
        }
        String str = ((zzhn) zzhpVar).a;
        int length = str.length();
        String str2 = this.a;
        if (str2.length() == length) {
            return str2.compareTo(str);
        }
        return str2.length() - str.length();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzhn.class == obj.getClass()) {
            return this.a.equals(((zzhn) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(zzhp.c((byte) 96)), this.a});
    }

    public final String toString() {
        return mz1.o(new StringBuilder("\""), this.a, "\"");
    }

    @Override // com.google.android.gms.internal.fido.zzhp
    public final int zza() {
        return zzhp.c((byte) 96);
    }
}
