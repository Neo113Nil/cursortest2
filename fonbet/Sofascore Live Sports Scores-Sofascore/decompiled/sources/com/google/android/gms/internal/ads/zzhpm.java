package com.google.android.gms.internal.ads;

import defpackage.a70;
import defpackage.fn0;
import defpackage.wt3;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhpm extends zzhqc {
    public final int a;
    public final int b;
    public final zzhpl c;

    public /* synthetic */ zzhpm(int i, int i2, zzhpl zzhplVar) {
        this.a = i;
        this.b = i2;
        this.c = zzhplVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhfj
    public final boolean a() {
        return this.c != zzhpl.e;
    }

    public final int b() {
        zzhpl zzhplVar = zzhpl.e;
        int i = this.b;
        zzhpl zzhplVar2 = this.c;
        if (zzhplVar2 == zzhplVar) {
            return i;
        }
        if (zzhplVar2 == zzhpl.b || zzhplVar2 == zzhpl.c || zzhplVar2 == zzhpl.d) {
            return i + 5;
        }
        a70.r("Unknown variant");
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhpm)) {
            return false;
        }
        zzhpm zzhpmVar = (zzhpm) obj;
        return zzhpmVar.a == this.a && zzhpmVar.b() == b() && zzhpmVar.c == this.c;
    }

    public final int hashCode() {
        return Objects.hash(zzhpm.class, Integer.valueOf(this.a), Integer.valueOf(this.b), this.c);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.c);
        int length = valueOf.length();
        int i = this.b;
        int length2 = String.valueOf(i).length();
        int i2 = this.a;
        StringBuilder sb = new StringBuilder(wt3.h(length, 32, length2, 16, String.valueOf(i2).length()) + 10);
        wt3.t(i, "AES-CMAC Parameters (variant: ", valueOf, ", ", sb);
        return fn0.k(i2, "-byte tags, and ", "-byte key)", sb);
    }
}
