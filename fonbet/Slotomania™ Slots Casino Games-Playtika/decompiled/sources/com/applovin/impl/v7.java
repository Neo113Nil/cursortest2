package com.applovin.impl;

import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.google.android.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class v7 {
    private static final List f = Arrays.asList(MimeTypes.VIDEO_MP4, "video/webm", MimeTypes.VIDEO_H263, MimeTypes.VIDEO_MATROSKA);
    private final com.applovin.impl.sdk.l a;
    private final JSONObject c;
    private final JSONObject d;
    protected List b = new ArrayList();
    private final long e = System.currentTimeMillis();

    public v7(JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.l lVar) {
        this.a = lVar;
        this.c = jSONObject;
        this.d = jSONObject2;
    }

    public List a() {
        return this.b;
    }

    public JSONObject b() {
        return this.c;
    }

    public long c() {
        return this.e;
    }

    public int d() {
        return this.b.size();
    }

    public JSONObject e() {
        return this.d;
    }

    public List f() {
        List<String> explode = CollectionUtils.explode(JsonUtils.getString(this.c, "vast_preferred_video_types", null));
        return !explode.isEmpty() ? explode : f;
    }

    public int g() {
        return q7.c(JsonUtils.getInt(this.c, "video_completion_percent", -1));
    }
}
