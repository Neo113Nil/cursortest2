package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.braze.ui.actions.brazeactions.steps.StepData;
import com.google.common.util.concurrent.ListenableFuture;
import com.ironsource.X3;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes6.dex */
public final class zzbpv implements zzbpe {
    private final Object zza = new Object();
    private final Map zzb = new HashMap();

    @Override // com.google.android.gms.internal.ads.zzbpe
    public final void zza(Object obj, Map map) {
        String concat;
        String str = (String) map.get("id");
        String str2 = (String) map.get(X3.g.e);
        String str3 = (String) map.get("fail_reason");
        String str4 = (String) map.get("fail_stack");
        String str5 = (String) map.get("result");
        if (true == TextUtils.isEmpty(str4)) {
            str3 = "Unknown Fail Reason.";
        }
        if (TextUtils.isEmpty(str4)) {
            concat = "";
        } else {
            String.valueOf(str4);
            concat = "\n".concat(String.valueOf(str4));
        }
        synchronized (this.zza) {
            zzbpu zzbpuVar = (zzbpu) this.zzb.remove(str);
            if (zzbpuVar == null) {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 50);
                sb.append("Received result for unexpected method invocation: ");
                sb.append(str);
                String sb2 = sb.toString();
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi(sb2);
                return;
            }
            if (!TextUtils.isEmpty(str2)) {
                StringBuilder sb3 = new StringBuilder(String.valueOf(str3).length() + concat.length());
                sb3.append(str3);
                sb3.append(concat);
                zzbpuVar.zzb(sb3.toString());
                return;
            }
            if (str5 == null) {
                zzbpuVar.zza(null);
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(str5);
                if (com.google.android.gms.ads.internal.util.zze.zzc()) {
                    String jSONObject2 = jSONObject.toString(2);
                    StringBuilder sb4 = new StringBuilder(String.valueOf(jSONObject2).length() + 13);
                    sb4.append("Result GMSG: ");
                    sb4.append(jSONObject2);
                    com.google.android.gms.ads.internal.util.zze.zza(sb4.toString());
                }
                zzbpuVar.zza(jSONObject);
            } catch (JSONException e) {
                zzbpuVar.zzb(e.getMessage());
            }
        }
    }

    public final void zzb(String str, zzbpu zzbpuVar) {
        synchronized (this.zza) {
            this.zzb.put(str, zzbpuVar);
        }
    }

    public final ListenableFuture zzc(zzbsm zzbsmVar, String str, JSONObject jSONObject) {
        zzcfk zzcfkVar = new zzcfk();
        com.google.android.gms.ads.internal.zzt.zzc();
        String uuid = UUID.randomUUID().toString();
        zzb(uuid, new zzbpt(this, zzcfkVar));
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", uuid);
            jSONObject2.put(StepData.ARGS, jSONObject);
            zzbsmVar.zzb(str, jSONObject2);
            return zzcfkVar;
        } catch (Exception e) {
            zzcfkVar.zzd(e);
            return zzcfkVar;
        }
    }
}
