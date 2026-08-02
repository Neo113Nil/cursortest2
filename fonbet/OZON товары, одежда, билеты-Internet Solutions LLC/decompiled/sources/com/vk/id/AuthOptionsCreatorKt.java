package com.vk.id;

import android.util.Base64;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002\u001a\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0002\u001a\u0014\u0010\t\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0002\u001a\f\u0010\u000b\u001a\u00020\u0005*\u00020\u0002H\u0002¨\u0006\f"}, d2 = {"addOAuthParams", "", "Lorg/json/JSONObject;", "scopes", "", "", "createStatsInfo", "statParams", "Lcom/vk/id/StatParams;", "addStatParams", "statsInfo", "toBase64", "vkid_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class AuthOptionsCreatorKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void addOAuthParams(JSONObject jSONObject, Set<String> set) {
        jSONObject.put("scope", C7714v.V(set, " ", null, null, null, 62));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addStatParams(JSONObject jSONObject, JSONObject jSONObject2) {
        jSONObject.put("stats_info", jSONObject2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JSONObject createStatsInfo(StatParams statParams) {
        JSONObject jSONObject = new JSONObject();
        if (statParams != null) {
            jSONObject.put("flow_source", statParams.getFlowSource());
            jSONObject.put("session_id", statParams.getSessionId());
        }
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String toBase64(JSONObject jSONObject) {
        String jSONObject2 = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject2, "toString(...)");
        Intrinsics.checkNotNullParameter(jSONObject2, "<this>");
        byte[] bytes = jSONObject2.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        String encodeToString = Base64.encodeToString(bytes, 0);
        Intrinsics.checkNotNullExpressionValue(encodeToString, "encodeToString(...)");
        StringBuilder sb2 = new StringBuilder();
        int length = encodeToString.length();
        for (int i11 = 0; i11 < length; i11++) {
            char charAt = encodeToString.charAt(i11);
            if (charAt != '\n') {
                sb2.append(charAt);
            }
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }
}
