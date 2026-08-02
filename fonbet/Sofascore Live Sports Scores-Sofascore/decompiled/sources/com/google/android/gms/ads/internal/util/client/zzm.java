package com.google.android.gms.ads.internal.util.client;

import defpackage.me4;
import defpackage.wt3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
final class zzm extends zzw {
    public final int a;
    public final int b;
    public final boolean c;

    public zzm(int i, int i2, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzw) {
            zzw zzwVar = (zzw) obj;
            if (this.a == zzwVar.zza() && this.b == zzwVar.zzb() && this.c == zzwVar.zzc()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.b ^ ((this.a ^ 1000003) * 1000003)) * 1000003) ^ (true != this.c ? 1237 : 1231);
    }

    public final String toString() {
        int i = this.a;
        int length = String.valueOf(i).length();
        int i2 = this.b;
        int length2 = String.valueOf(i2).length();
        boolean z = this.c;
        StringBuilder sb = new StringBuilder(wt3.h(length, 59, length2, 26, String.valueOf(z).length()) + 1);
        me4.r(sb, "OfflineAdConfig{impressionPrerequisite=", i, ", clickPrerequisite=", i2);
        sb.append(", notificationFlowEnabled=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.android.gms.ads.internal.util.client.zzw
    public final int zza() {
        return this.a;
    }

    @Override // com.google.android.gms.ads.internal.util.client.zzw
    public final int zzb() {
        return this.b;
    }

    @Override // com.google.android.gms.ads.internal.util.client.zzw
    public final boolean zzc() {
        return this.c;
    }
}
