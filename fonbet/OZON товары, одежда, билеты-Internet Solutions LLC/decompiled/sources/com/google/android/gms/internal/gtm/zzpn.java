package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes9.dex */
final class zzpn implements zzpm {
    zzpn() {
    }

    @Override // com.google.android.gms.internal.gtm.zzpm
    public final zzps zza(byte[] bArr) throws zzpf {
        if (bArr == null) {
            throw new zzpf("Cannot parse a null byte[]");
        }
        if (bArr.length == 0) {
            throw new zzpf("Cannot parse a 0 length byte[]");
        }
        try {
            Object obj = new JSONObject(new String(bArr)).get("resource");
            if (!(obj instanceof JSONObject)) {
                throw new zzpf("Resource map not found");
            }
            JSONObject jSONObject = (JSONObject) obj;
            zzqf zzqfVar = new zzqf();
            zzqfVar.zzc(jSONObject.optString("version"));
            JSONArray jSONArray = jSONObject.getJSONArray("macros");
            ArrayList arrayList = new ArrayList();
            for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                arrayList.add(jSONArray.getJSONObject(i11).getString("instance_name"));
            }
            List<zzqj> zzd = zzpg.zzd(jSONObject.getJSONArray("tags"), arrayList);
            List<zzqj> zzd2 = zzpg.zzd(jSONObject.getJSONArray("predicates"), arrayList);
            Iterator<zzqj> it = zzpg.zzd(jSONObject.getJSONArray("macros"), arrayList).iterator();
            while (it.hasNext()) {
                zzqfVar.zza(it.next());
            }
            JSONArray jSONArray2 = jSONObject.getJSONArray("rules");
            for (int i12 = 0; i12 < jSONArray2.length(); i12++) {
                zzqfVar.zzb(zzpg.zzb(jSONArray2.getJSONArray(i12), zzd, zzd2));
            }
            zzqg zzd3 = zzqfVar.zzd();
            zzhl.zzd("The container was successfully parsed from the resource");
            return new zzps(Status.RESULT_SUCCESS, 0, new zzpr(null, null, zzd3, 0L), zzpp.zzb.zza(bArr).zzc());
        } catch (zzpf unused) {
            throw new zzpf("The resource data is invalid. The container cannot be extracted from the JSON data");
        } catch (JSONException unused2) {
            throw new zzpf("The resource data is corrupted. The container cannot be extracted from the JSON data");
        }
    }
}
