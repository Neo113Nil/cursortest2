package com.vk.push.core.network.utils;

import com.vk.push.core.network.data.model.AppInfoRemote;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: AppInfoJsonParser.kt */
/* loaded from: classes5.dex */
public final class AppInfoJsonParser {
    public static final AppInfoJsonParser INSTANCE = new AppInfoJsonParser();

    public final AppInfoRemote parseAppInfo(String str) throws JSONException {
        return parseAppInfo(new JSONObject(str));
    }

    public final List<AppInfoRemote> parseAppInfoList(String str) throws JSONException {
        JSONArray jSONArray = new JSONObject(str).getJSONArray("hosts");
        AppInfoJsonParser appInfoJsonParser = INSTANCE;
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            arrayList.add(appInfoJsonParser.parseAppInfo(jSONArray.getJSONObject(i)));
        }
        return arrayList;
    }

    public final AppInfoRemote parseAppInfo(JSONObject jSONObject) throws JSONException {
        return new AppInfoRemote(jSONObject.getString("package_name"), jSONObject.getString("pub_key"), jSONObject.optBoolean("is_arbiter"));
    }
}
