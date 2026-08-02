package com.vk.push.core.remote.config.omicron.retriever;

import androidx.annotation.NonNull;
import com.vk.push.core.analytics.AnalyticsBaseParamsConstantsKt;
import com.vk.push.core.remote.config.omicron.AnalyticsHandler;
import com.vk.push.core.remote.config.omicron.Data;
import com.vk.push.core.remote.config.omicron.ParseException;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ResponseParserImpl implements ResponseParser {
    public final AnalyticsHandler a;

    public ResponseParserImpl(AnalyticsHandler analyticsHandler) {
        this.a = analyticsHandler;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0050 A[SYNTHETIC] */
    @Override // com.vk.push.core.remote.config.omicron.retriever.ResponseParser
    @NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Data parse(@NonNull String str) throws ParseException {
        boolean z;
        try {
            this.a.onConfigReceivedFromNetwork(str);
            JSONObject jSONObject = new JSONObject(str);
            Data.Builder condition = Data.newBuilder().version(Integer.valueOf(jSONObject.getInt("config_v"))).condition(jSONObject.getString("cond_s"));
            JSONObject optJSONObject = jSONObject.optJSONObject("config");
            if (optJSONObject != null) {
                Iterator<String> keys = optJSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    Object obj = optJSONObject.get(next);
                    if (!(obj instanceof JSONObject) && !(obj instanceof JSONArray)) {
                        z = false;
                        if (z) {
                            condition.pair(next, obj);
                        } else {
                            condition.pair(next, obj.toString());
                        }
                    }
                    z = true;
                    if (z) {
                    }
                }
            }
            JSONObject optJSONObject2 = jSONObject.optJSONObject(AnalyticsBaseParamsConstantsKt.SEGMENTS);
            if (optJSONObject2 != null) {
                HashMap hashMap = new HashMap(optJSONObject2.length());
                Iterator<String> keys2 = optJSONObject2.keys();
                while (keys2.hasNext()) {
                    String next2 = keys2.next();
                    hashMap.put(next2, optJSONObject2.getString(next2));
                }
                condition.segments(hashMap);
            }
            return condition.build();
        } catch (JSONException e) {
            throw new ParseException(e);
        }
    }
}
