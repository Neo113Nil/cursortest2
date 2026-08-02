package com.google.android.gms.internal.ads;

import defpackage.wt3;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhjo extends zzhga {
    public final zzhjn a;

    public zzhjo(zzhjn zzhjnVar) {
        this.a = zzhjnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhfj
    public final boolean a() {
        return this.a != zzhjn.d;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzhjo) && ((zzhjo) obj).a == this.a;
    }

    public final int hashCode() {
        return Objects.hash(zzhjo.class, this.a);
    }

    public final String toString() {
        String str = this.a.a;
        return wt3.m("XChaCha20Poly1305 Parameters (variant: ", str, new StringBuilder(str.length() + 40), ")");
    }
}
