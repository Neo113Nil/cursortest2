package com.vk.dto.geo;

import org.json.JSONObject;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;

/* compiled from: GeoLocation.kt */
/* loaded from: classes18.dex */
public final class a {
    public static final GeoLocation a(JSONObject jSONObject, JSONObject jSONObject2) {
        int optInt = jSONObject2.optInt("id", 0);
        int optInt2 = jSONObject2.optInt("total_checkins", 0);
        int optInt3 = jSONObject2.optInt("category", 0);
        int optInt4 = jSONObject2.optInt("owner_id", 0);
        int optInt5 = jSONObject.optInt("distance", 0);
        double optDouble = jSONObject2.optDouble("latitude", ConnectivityTracker.DEFAULT_UPLINK_BITRATE);
        double optDouble2 = jSONObject2.optDouble("longitude", ConnectivityTracker.DEFAULT_UPLINK_BITRATE);
        String optString = jSONObject2.optString("title", "");
        String optString2 = jSONObject2.optString("group_photo", "");
        String optString3 = jSONObject2.optString(RTCStatsConstants.KEY_ADDRESS, "");
        String optString4 = jSONObject2.optString("city", "");
        String optString5 = jSONObject2.optString("country", "");
        JSONObject optJSONObject = jSONObject2.optJSONObject("category_object");
        return new GeoLocation(optInt, optInt2, optInt3, optInt4, optInt5, optDouble, optDouble2, optString, optString2, optString3, optString4, optString5, optJSONObject != null ? optJSONObject.getString("title") : null);
    }
}
