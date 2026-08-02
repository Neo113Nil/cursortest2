package com.google.android.gms.internal.ads;

import defpackage.wt3;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhjh extends zzhga {
    public final zzhjg a;
    public final int b;

    public zzhjh(zzhjg zzhjgVar, int i) {
        this.a = zzhjgVar;
        this.b = i;
    }

    public static zzhjh b(zzhjg zzhjgVar, int i) {
        if (i >= 8 && i <= 12) {
            return new zzhjh(zzhjgVar, i);
        }
        defpackage.zzl.x("Salt size must be between 8 and 12 bytes");
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzhfj
    public final boolean a() {
        return this.a != zzhjg.c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhjh)) {
            return false;
        }
        zzhjh zzhjhVar = (zzhjh) obj;
        return zzhjhVar.a == this.a && zzhjhVar.b == this.b;
    }

    public final int hashCode() {
        return Objects.hash(zzhjh.class, this.a, Integer.valueOf(this.b));
    }

    public final String toString() {
        String str = this.a.a;
        int length = str.length();
        int i = this.b;
        StringBuilder sb = new StringBuilder(length + 48 + String.valueOf(i).length() + 1);
        wt3.t(i, "X-AES-GCM Parameters (variant: ", str, "salt_size_bytes: ", sb);
        sb.append(")");
        return sb.toString();
    }
}
