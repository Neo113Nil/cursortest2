package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
public final class zzcrn implements zzcrh {
    private final zzecf zza;

    zzcrn(zzecf zzecfVar) {
        this.zza = zzecfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcrh
    public final void zza(Map map) {
        char c;
        String str = (String) map.get("gesture");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        int hashCode = str.hashCode();
        if (hashCode != 97520651) {
            if (hashCode == 109399814 && str.equals("shake")) {
                c = 0;
            }
            c = 65535;
        } else {
            if (str.equals("flick")) {
                c = 1;
            }
            c = 65535;
        }
        if (c == 0) {
            this.zza.zze(zzecb.SHAKE);
        } else if (c != 1) {
            this.zza.zze(zzecb.NONE);
        } else {
            this.zza.zze(zzecb.FLICK);
        }
    }
}
