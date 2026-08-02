package com.google.android.gms.internal.ads;

import defpackage.wt3;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhhm extends zzhga {
    public final int a;
    public final zzhhl b;

    public /* synthetic */ zzhhm(int i, zzhhl zzhhlVar) {
        this.a = i;
        this.b = zzhhlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhfj
    public final boolean a() {
        return this.b != zzhhl.d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhhm)) {
            return false;
        }
        zzhhm zzhhmVar = (zzhhm) obj;
        return zzhhmVar.a == this.a && zzhhmVar.b == this.b;
    }

    public final int hashCode() {
        return Objects.hash(zzhhm.class, Integer.valueOf(this.a), this.b);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        int length = valueOf.length();
        int i = this.a;
        StringBuilder sb = new StringBuilder(length + 33 + String.valueOf(i).length() + 10);
        wt3.t(i, "AesGcmSiv Parameters (variant: ", valueOf, ", ", sb);
        sb.append("-byte key)");
        return sb.toString();
    }
}
