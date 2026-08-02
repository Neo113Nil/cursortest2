package com.google.android.gms.internal.ads;

import defpackage.fn0;
import defpackage.wt3;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhgu extends zzhga {
    public final int a;
    public final int b;
    public final zzhgt c;

    public /* synthetic */ zzhgu(int i, int i2, zzhgt zzhgtVar) {
        this.a = i;
        this.b = i2;
        this.c = zzhgtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhfj
    public final boolean a() {
        return this.c != zzhgt.d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhgu)) {
            return false;
        }
        zzhgu zzhguVar = (zzhgu) obj;
        return zzhguVar.a == this.a && zzhguVar.b == this.b && zzhguVar.c == this.c;
    }

    public final int hashCode() {
        return Objects.hash(zzhgu.class, Integer.valueOf(this.a), Integer.valueOf(this.b), 16, this.c);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.c);
        int length = valueOf.length();
        int i = this.b;
        int length2 = String.valueOf(i).length();
        int length3 = String.valueOf(16).length();
        int i2 = this.a;
        StringBuilder sb = new StringBuilder(wt3.B(wt3.h(length, 30, length2, 10, length3), 15, String.valueOf(i2).length(), 10));
        wt3.t(i, "AesEax Parameters (variant: ", valueOf, ", ", sb);
        return fn0.k(i2, "-byte IV, 16-byte tag, and ", "-byte key)", sb);
    }
}
