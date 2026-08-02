package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.api.Status;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes9.dex */
final class zzpo implements zzpm {
    zzpo() {
    }

    @Override // com.google.android.gms.internal.gtm.zzpm
    public final zzps zza(byte[] bArr) throws zzpf {
        zzqp zzc;
        if (bArr == null) {
            throw new zzpf("Cannot parse a null byte[]");
        }
        if (bArr.length == 0) {
            throw new zzpf("Cannot parse a 0 length byte[]");
        }
        try {
            JSONObject jSONObject = new JSONObject(new String(bArr));
            JSONArray optJSONArray = jSONObject.optJSONArray("runtime");
            if (optJSONArray == null) {
                zzc = null;
            } else {
                zzqn zzqnVar = new zzqn();
                Object obj = jSONObject.get("resource");
                if (!(obj instanceof JSONObject)) {
                    throw new zzpf("Resource map not found");
                }
                zzqnVar.zzb(((JSONObject) obj).optString("version"));
                for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
                    Object obj2 = optJSONArray.get(i11);
                    if (!(obj2 instanceof JSONArray) || ((JSONArray) obj2).length() != 0) {
                        zzqnVar.zza(zzpg.zza(obj2));
                    }
                }
                zzc = zzqnVar.zzc();
            }
            if (zzc != null) {
                zzhl.zzd("The runtime configuration was successfully parsed from the resource");
            }
            return new zzps(Status.RESULT_SUCCESS, 0, null, zzc);
        } catch (zzpf unused) {
            throw new zzpf("The resource data is invalid. The runtime  configuration cannot be extracted from the JSON data");
        } catch (JSONException unused2) {
            throw new zzpf("The resource data is corrupted. The runtime configuration cannot be extracted from the JSON data");
        }
    }
}
