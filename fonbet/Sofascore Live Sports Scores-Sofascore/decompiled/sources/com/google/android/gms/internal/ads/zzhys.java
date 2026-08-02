package com.google.android.gms.internal.ads;

import defpackage.mz1;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhys extends zzhym {
    public final zzhyp a = zzhyp.a;
    public final zzhyq b = zzhyq.a;
    public final zzhyr c = zzhyr.b;

    @Override // com.google.android.gms.internal.ads.zzhfj
    public final boolean a() {
        return this.c != zzhyr.c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhys)) {
            return false;
        }
        zzhys zzhysVar = (zzhys) obj;
        return zzhysVar.a == this.a && zzhysVar.b == this.b && zzhysVar.c == this.c;
    }

    public final int hashCode() {
        return Objects.hash(zzhys.class, this.a, 64, this.b, this.c);
    }

    public final String toString() {
        this.a.getClass();
        this.b.getClass();
        String str = this.c.a;
        return mz1.o(new StringBuilder(37 + str.length()), "SLH-DSA-SHA2-128S instance, variant: ", str);
    }
}
