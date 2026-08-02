package com.google.android.gms.internal.ads;

import defpackage.bf3;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhic extends zzhga {
    public final String a;
    public final zzhib b;

    public zzhic(String str, zzhib zzhibVar) {
        this.a = str;
        this.b = zzhibVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhfj
    public final boolean a() {
        return this.b != zzhib.c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhic)) {
            return false;
        }
        zzhic zzhicVar = (zzhic) obj;
        return zzhicVar.a.equals(this.a) && zzhicVar.b.equals(this.b);
    }

    public final int hashCode() {
        return Objects.hash(zzhic.class, this.a, this.b);
    }

    public final String toString() {
        String str = this.b.a;
        String str2 = this.a;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 45 + str.length() + 1);
        bf3.v(sb, "LegacyKmsAead Parameters (keyUri: ", str2, ", variant: ", str);
        sb.append(")");
        return sb.toString();
    }
}
