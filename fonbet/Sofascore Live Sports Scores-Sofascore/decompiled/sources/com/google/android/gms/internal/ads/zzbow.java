package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzbp;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbow implements zzbqh {
    public final zzbox a;

    public zzbow(zzbox zzboxVar) {
        this.a = zzboxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbqh
    public final void a(Object obj, Map map) {
        zzbox zzboxVar = this.a;
        if (zzboxVar == null) {
            return;
        }
        String str = (String) map.get("name");
        if (str == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzh("Ad metadata with no name parameter.");
            str = "";
        }
        Bundle bundle = null;
        if (map.containsKey("info")) {
            try {
                bundle = zzbp.zzl(new JSONObject((String) map.get("info")));
            } catch (JSONException e) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzg("Failed to convert ad metadata to JSON.", e);
            }
        }
        if (bundle != null) {
            zzboxVar.a0(bundle, str);
        } else {
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzf("Failed to convert ad metadata to Bundle.");
        }
    }
}
