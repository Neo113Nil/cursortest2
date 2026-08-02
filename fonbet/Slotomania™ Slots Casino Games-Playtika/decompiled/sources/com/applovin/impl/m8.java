package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class m8 {
    private final String a;
    private final String b;
    private final List c;

    public m8(JSONObject jSONObject) {
        this.a = JsonUtils.getString(jSONObject, "user_type", TtmlNode.COMBINE_ALL);
        this.b = JsonUtils.getString(jSONObject, "device_type", TtmlNode.COMBINE_ALL);
        this.c = JsonUtils.getStringList(jSONObject, "segments", null);
    }

    public String a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }

    public List c() {
        return this.c;
    }
}
