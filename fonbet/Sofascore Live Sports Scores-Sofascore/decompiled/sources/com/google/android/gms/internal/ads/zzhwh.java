package com.google.android.gms.internal.ads;

import defpackage.wt3;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhwh extends zzhym {
    public final zzhwg a;

    public zzhwh(zzhwg zzhwgVar) {
        this.a = zzhwgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhfj
    public final boolean a() {
        return this.a != zzhwg.e;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzhwh) && ((zzhwh) obj).a == this.a;
    }

    public final int hashCode() {
        return Objects.hash(zzhwh.class, this.a);
    }

    public final String toString() {
        String str = this.a.a;
        return wt3.m("Ed25519 Parameters (variant: ", str, new StringBuilder(str.length() + 30), ")");
    }
}
