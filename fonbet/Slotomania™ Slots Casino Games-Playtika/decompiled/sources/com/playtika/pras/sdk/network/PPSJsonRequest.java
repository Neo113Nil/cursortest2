package com.playtika.pras.sdk.network;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class PPSJsonRequest extends JsonObjectRequest {
    private String networkType;

    public PPSJsonRequest(String str, JSONObject jSONObject, final NetworkApiListener<ApiResponse> networkApiListener, String str2) {
        super(str, jSONObject, new Response.Listener<JSONObject>() { // from class: com.playtika.pras.sdk.network.PPSJsonRequest.1
            @Override // com.android.volley.Response.Listener
            public void onResponse(JSONObject jSONObject2) {
                NetworkApiListener.this.onResponse(new ApiResponse(jSONObject2));
            }
        }, new Response.ErrorListener() { // from class: com.playtika.pras.sdk.network.PPSJsonRequest.2
            @Override // com.android.volley.Response.ErrorListener
            public void onErrorResponse(VolleyError volleyError) {
                NetworkApiListener.this.onResponse(new ApiResponse(volleyError));
            }
        });
        this.networkType = str2;
    }

    @Override // com.android.volley.Request
    public Map getHeaders() {
        HashMap hashMap = new HashMap();
        hashMap.put("X-Network-Type", this.networkType);
        return hashMap;
    }
}
