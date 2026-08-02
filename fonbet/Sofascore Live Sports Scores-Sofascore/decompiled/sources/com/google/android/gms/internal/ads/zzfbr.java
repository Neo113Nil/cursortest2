package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.util.Base64;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfbr implements zzfdg {
    public final HashMap a;

    public zzfbr(HashMap hashMap) {
        this.a = hashMap;
    }

    @Override // com.google.android.gms.internal.ads.zzfdg
    public final void zza(Object obj) {
        Bundle bundle = (Bundle) obj;
        HashMap hashMap = this.a;
        if (hashMap.isEmpty()) {
            return;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.T8)).booleanValue()) {
            JSONArray jSONArray = new JSONArray();
            for (Map.Entry entry : hashMap.entrySet()) {
                ArrayDeque arrayDeque = (ArrayDeque) entry.getValue();
                if (!arrayDeque.isEmpty()) {
                    zzebp zzebpVar = (zzebp) entry.getKey();
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("id", zzebpVar.a());
                        jSONObject.put("event_type", zzebpVar.b());
                        JSONArray jSONArray2 = new JSONArray();
                        Iterator it = arrayDeque.iterator();
                        while (it.hasNext()) {
                            jSONArray2.put((Long) it.next());
                        }
                        jSONObject.put("timestamps", jSONArray2);
                        jSONArray.put(jSONObject);
                    } catch (JSONException e) {
                        com.google.android.gms.ads.internal.util.zze.zzb("Failed putting the on-device storage record.", e);
                    }
                }
            }
            if (jSONArray.length() > 0) {
                bundle.putString("on_device_storage_records", jSONArray.toString());
                return;
            }
            return;
        }
        zzheg E = zzhej.E();
        for (Map.Entry entry2 : hashMap.entrySet()) {
            ArrayDeque arrayDeque2 = (ArrayDeque) entry2.getValue();
            if (!arrayDeque2.isEmpty()) {
                zzebp zzebpVar2 = (zzebp) entry2.getKey();
                int b = zzebpVar2.b();
                int i = 1;
                if (b != 0) {
                    if (b != 1) {
                        i = 3;
                        if (b != 2) {
                            i = b != 3 ? 0 : 4;
                        }
                    } else {
                        i = 2;
                    }
                }
                if (i != 0) {
                    zzhee D = zzhef.D();
                    long a = zzebpVar2.a();
                    D.n();
                    ((zzhef) D.b).E(a);
                    D.n();
                    ((zzhef) D.b).F(i);
                    zzhef zzhefVar = (zzhef) D.o();
                    zzheh D2 = zzhei.D();
                    D2.n();
                    ((zzhei) D2.b).E(zzhefVar);
                    D2.n();
                    ((zzhei) D2.b).F(arrayDeque2);
                    E.n();
                    ((zzhej) E.b).F((zzhei) D2.o());
                }
            }
        }
        zzhej zzhejVar = (zzhej) E.o();
        if (zzhejVar.D() > 0) {
            bundle.putString("ods", Base64.encodeToString(zzhejVar.d(), 11));
        }
    }
}
