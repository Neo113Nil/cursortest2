package com.google.android.gms.internal.ads;

import defpackage.bf3;
import defpackage.fn0;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhvx extends zzhym {
    public final zzhvv a;
    public final zzhvt b;
    public final zzhvu c;
    public final zzhvw d;

    public /* synthetic */ zzhvx(zzhvv zzhvvVar, zzhvt zzhvtVar, zzhvu zzhvuVar, zzhvw zzhvwVar) {
        this.a = zzhvvVar;
        this.b = zzhvtVar;
        this.c = zzhvuVar;
        this.d = zzhvwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhfj
    public final boolean a() {
        return this.d != zzhvw.e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhvx)) {
            return false;
        }
        zzhvx zzhvxVar = (zzhvx) obj;
        return zzhvxVar.a == this.a && zzhvxVar.b == this.b && zzhvxVar.c == this.c && zzhvxVar.d == this.d;
    }

    public final int hashCode() {
        return Objects.hash(zzhvx.class, this.a, this.b, this.c, this.d);
    }

    public final String toString() {
        String str = this.d.a;
        int length = str.length();
        String str2 = this.c.a;
        int length2 = str2.length();
        String str3 = this.a.a;
        int length3 = str3.length();
        String str4 = this.b.a;
        StringBuilder sb = new StringBuilder(fn0.b(length, 39, length2, 12, length3, 9, str4.length()) + 1);
        bf3.v(sb, "ECDSA Parameters (variant: ", str, ", hashType: ", str2);
        bf3.v(sb, ", encoding: ", str3, ", curve: ", str4);
        sb.append(")");
        return sb.toString();
    }
}
