package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.ironsource.U3;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbqz implements zzbqh {
    public final Object a = new Object();
    public final HashMap b = new HashMap();

    @Override // com.google.android.gms.internal.ads.zzbqh
    public final void a(Object obj, Map map) {
        String str = (String) map.get("id");
        String str2 = (String) map.get(U3.g.e);
        String str3 = (String) map.get("fail_reason");
        String str4 = (String) map.get("fail_stack");
        String str5 = (String) map.get("result");
        if (true == TextUtils.isEmpty(str4)) {
            str3 = "Unknown Fail Reason.";
        }
        String concat = TextUtils.isEmpty(str4) ? "" : "\n".concat(String.valueOf(str4));
        synchronized (this.a) {
            try {
                zzbqy zzbqyVar = (zzbqy) this.b.remove(str);
                if (zzbqyVar == null) {
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 50);
                    sb.append("Received result for unexpected method invocation: ");
                    sb.append(str);
                    String sb2 = sb.toString();
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    zzo.zzi(sb2);
                    return;
                }
                if (!TextUtils.isEmpty(str2)) {
                    StringBuilder sb3 = new StringBuilder(String.valueOf(str3).length() + concat.length());
                    sb3.append(str3);
                    sb3.append(concat);
                    zzbqyVar.zzb(sb3.toString());
                    return;
                }
                if (str5 == null) {
                    zzbqyVar.a(null);
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
                    zzbqyVar.a(jSONObject);
                } catch (JSONException e) {
                    zzbqyVar.zzb(e.getMessage());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(String str, zzbqy zzbqyVar) {
        synchronized (this.a) {
            this.b.put(str, zzbqyVar);
        }
    }
}
