package com.google.android.gms.internal.ads;

import defpackage.fn0;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhrg extends zzhrj {
    public final int a;

    public zzhrg(int i) {
        this.a = i;
    }

    public static zzhrg b(int i) {
        if (i == 16 || i == 32) {
            return new zzhrg(i);
        }
        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit are supported", Integer.valueOf(i * 8)));
    }

    @Override // com.google.android.gms.internal.ads.zzhfj
    public final boolean a() {
        return false;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzhrg) && ((zzhrg) obj).a == this.a;
    }

    public final int hashCode() {
        return Objects.hash(zzhrg.class, Integer.valueOf(this.a));
    }

    public final String toString() {
        int i = this.a;
        return fn0.k(i, "AesCmac PRF Parameters (", "-byte key)", new StringBuilder(String.valueOf(i).length() + 34));
    }
}
