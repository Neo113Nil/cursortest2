package com.vk.id.internal.auth.app;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0001H\u0002¨\u0006\u0006"}, d2 = {"getInt", "", "Lorg/json/JSONObject;", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "defValue", "vkid_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class VkAuthSilentAuthProviderKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int getInt(JSONObject jSONObject, String str, int i11) throws JSONException {
        return jSONObject.has(str) ? jSONObject.getInt(str) : i11;
    }
}
