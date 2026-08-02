package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.braze.ui.actions.brazeactions.steps.StepData;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes5.dex */
final class zzbok implements zzbpe {
    zzbok() {
    }

    @Override // com.google.android.gms.internal.ads.zzbpe
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcki zzckiVar = (zzcki) obj;
        try {
            JSONArray jSONArray = new JSONArray((String) map.get(StepData.ARGS));
            SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(zzckiVar.getContext()).edit();
            for (int i = 0; i < jSONArray.length(); i++) {
                edit.remove(jSONArray.getString(i));
            }
            edit.apply();
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "GMSG clear local storage keys handler");
        }
    }
}
