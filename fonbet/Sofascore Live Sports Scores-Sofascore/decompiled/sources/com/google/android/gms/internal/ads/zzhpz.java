package com.google.android.gms.internal.ads;

import defpackage.a70;
import defpackage.bf3;
import defpackage.fn0;
import defpackage.me4;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhpz extends zzhqc {
    public final int a;
    public final int b;
    public final zzhpy c;
    public final zzhpx d;

    public /* synthetic */ zzhpz(int i, int i2, zzhpy zzhpyVar, zzhpx zzhpxVar) {
        this.a = i;
        this.b = i2;
        this.c = zzhpyVar;
        this.d = zzhpxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhfj
    public final boolean a() {
        return this.c != zzhpy.e;
    }

    public final int b() {
        zzhpy zzhpyVar = zzhpy.e;
        int i = this.b;
        zzhpy zzhpyVar2 = this.c;
        if (zzhpyVar2 == zzhpyVar) {
            return i;
        }
        if (zzhpyVar2 == zzhpy.b || zzhpyVar2 == zzhpy.c || zzhpyVar2 == zzhpy.d) {
            return i + 5;
        }
        a70.r("Unknown variant");
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhpz)) {
            return false;
        }
        zzhpz zzhpzVar = (zzhpz) obj;
        return zzhpzVar.a == this.a && zzhpzVar.b() == b() && zzhpzVar.c == this.c && zzhpzVar.d == this.d;
    }

    public final int hashCode() {
        return Objects.hash(zzhpz.class, Integer.valueOf(this.a), Integer.valueOf(this.b), this.c, this.d);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.c);
        String valueOf2 = String.valueOf(this.d);
        int length = valueOf.length();
        int length2 = valueOf2.length();
        int i = this.b;
        int length3 = String.valueOf(i).length();
        int i2 = this.a;
        StringBuilder sb = new StringBuilder(fn0.b(length, 38, length2, 2, length3, 16, String.valueOf(i2).length()) + 10);
        bf3.v(sb, "HMAC Parameters (variant: ", valueOf, ", hashType: ", valueOf2);
        me4.r(sb, ", ", i, "-byte tags, and ", i2);
        sb.append("-byte key)");
        return sb.toString();
    }
}
