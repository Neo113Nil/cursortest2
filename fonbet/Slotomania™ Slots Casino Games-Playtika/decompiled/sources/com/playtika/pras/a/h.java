package com.playtika.pras.a;

import android.net.Uri;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class h {
    public Uri a;
    public String b;
    public final int c;
    public final JSONObject d;

    public h(int i, Uri uri, String str, JSONObject jSONObject) {
        this.a = uri;
        this.b = str;
        this.c = i;
        this.d = jSONObject;
    }

    public final String a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("requestCode", this.c);
        jSONObject.put("url", this.a.toString());
        jSONObject.put("state", this.b);
        JSONObject jSONObject2 = this.d;
        if (jSONObject2 != null) {
            jSONObject.put(TtmlNode.TAG_METADATA, jSONObject2);
        }
        return jSONObject.toString();
    }
}
