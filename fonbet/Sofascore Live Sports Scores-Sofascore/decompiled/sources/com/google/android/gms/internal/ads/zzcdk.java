package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.rewarded.RewardItem;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzcdk implements RewardItem {
    public final zzccx a;

    public zzcdk(zzccx zzccxVar) {
        this.a = zzccxVar;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public final int getAmount() {
        zzccx zzccxVar = this.a;
        if (zzccxVar != null) {
            try {
                return zzccxVar.zzf();
            } catch (RemoteException e) {
                zzo.zzj("Could not forward getAmount to RewardItem", e);
            }
        }
        return 0;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public final String getType() {
        zzccx zzccxVar = this.a;
        if (zzccxVar != null) {
            try {
                return zzccxVar.zze();
            } catch (RemoteException e) {
                zzo.zzj("Could not forward getType to RewardItem", e);
            }
        }
        return null;
    }
}
