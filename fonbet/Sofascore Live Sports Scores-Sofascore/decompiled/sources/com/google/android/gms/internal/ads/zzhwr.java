package com.google.android.gms.internal.ads;

import defpackage.wt3;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhwr extends zzhym {
    public final zzhwp a = zzhwp.a;
    public final zzhwq b = zzhwq.b;

    @Override // com.google.android.gms.internal.ads.zzhfj
    public final boolean a() {
        return this.b != zzhwq.c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhwr)) {
            return false;
        }
        zzhwr zzhwrVar = (zzhwr) obj;
        return zzhwrVar.a == this.a && zzhwrVar.b == this.b;
    }

    public final int hashCode() {
        return Objects.hash(zzhwr.class, this.a, this.b);
    }

    public final String toString() {
        this.a.getClass();
        String str = this.b.a;
        return wt3.m("ML-DSA Parameters (ML-DSA instance: ML_DSA_65, variant: ", str, new StringBuilder(str.length() + 57), ")");
    }
}
