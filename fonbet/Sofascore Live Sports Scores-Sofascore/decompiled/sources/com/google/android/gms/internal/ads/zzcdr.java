package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.rewarded.RewardItem;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzcdr extends zzccw {
    public final String a;
    public final int b;

    public zzcdr(RewardItem rewardItem) {
        this(rewardItem != null ? rewardItem.getType() : "", rewardItem != null ? rewardItem.getAmount() : 1);
    }

    @Override // com.google.android.gms.internal.ads.zzccx
    public final String zze() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.ads.zzccx
    public final int zzf() {
        return this.b;
    }

    public zzcdr(String str, int i) {
        this.a = str;
        this.b = i;
    }
}
