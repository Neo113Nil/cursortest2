package com.google.android.gms.internal.p002firebaseauthapi;

import K9.r;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzaia {
    private List<zzaib> zza;

    public zzaia() {
        this.zza = new ArrayList();
    }

    public static zzaia zza(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return new zzaia(new ArrayList());
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i10);
            arrayList.add(jSONObject == null ? new zzaib() : new zzaib(r.a(jSONObject.optString("federatedId")), r.a(jSONObject.optString("displayName")), r.a(jSONObject.optString("photoUrl")), r.a(jSONObject.optString("providerId")), null, r.a(jSONObject.optString("phoneNumber")), r.a(jSONObject.optString("email"))));
        }
        return new zzaia(arrayList);
    }

    private zzaia(List<zzaib> list) {
        if (!list.isEmpty()) {
            this.zza = Collections.unmodifiableList(list);
        } else {
            this.zza = Collections.EMPTY_LIST;
        }
    }

    public final List<zzaib> zza() {
        return this.zza;
    }
}
