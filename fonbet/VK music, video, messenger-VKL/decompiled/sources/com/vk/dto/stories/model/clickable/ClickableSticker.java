package com.vk.dto.stories.model.clickable;

import com.vk.core.serialize.Serializer;
import com.vk.dto.stories.entities.stat.ClickableStickerStatInfo;
import com.vk.superapp.api.dto.story.WebClickablePoint;
import com.vk.superapp.api.dto.story.WebStickerType;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.bxx;
import xsna.epx;
import xsna.fw3;
import xsna.q500;

/* compiled from: ClickableSticker.kt */
/* loaded from: classes18.dex */
public abstract class ClickableSticker extends Serializer.StreamParcelableAdapter implements bxx {
    public final long b;
    public final List<WebClickablePoint> c;
    public final q500 d;

    /* compiled from: ClickableSticker.kt */
    public static final class a {
        public static List a(JSONObject jSONObject) {
            JSONArray optJSONArray = jSONObject.optJSONArray("clickable_area");
            if (optJSONArray == null) {
                return EmptyList.b;
            }
            ArrayList arrayList = new ArrayList(optJSONArray.length());
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                Serializer.c<WebClickablePoint> cVar = WebClickablePoint.CREATOR;
                arrayList.add(WebClickablePoint.a.a(jSONObject2));
            }
            return arrayList;
        }

        public static q500 b(JSONObject jSONObject) {
            if (!jSONObject.has("start_time") || !jSONObject.has("duration")) {
                return null;
            }
            return new q500(jSONObject.getLong("start_time"), jSONObject.getLong("duration") + jSONObject.getLong("start_time"));
        }
    }

    public ClickableSticker(long j, List<WebClickablePoint> list, q500 q500Var) {
        this.b = j;
        this.c = list;
        this.d = q500Var;
    }

    public String Bb() {
        return Cb().i();
    }

    public abstract WebStickerType Cb();

    public JSONObject e5() {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        for (WebClickablePoint webClickablePoint : this.c) {
            webClickablePoint.getClass();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("x", webClickablePoint.b);
            jSONObject2.put("y", webClickablePoint.c);
            jSONArray.put(jSONObject2);
        }
        jSONObject.put("type", Cb().i());
        jSONObject.put("clickable_area", jSONArray);
        q500 q500Var = this.d;
        if (q500Var != null) {
            long j = q500Var.b;
            jSONObject.put("start_time", j);
            jSONObject.put("duration", q500Var.c - j);
        }
        return jSONObject;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClickableSticker)) {
            return false;
        }
        ClickableSticker clickableSticker = (ClickableSticker) obj;
        return this.b == clickableSticker.b && epx.f(this.c, clickableSticker.c) && epx.f(this.d, clickableSticker.d) && Cb() == clickableSticker.Cb();
    }

    public int hashCode() {
        int a2 = fw3.a(Long.hashCode(this.b) * 31, 31, this.c);
        q500 q500Var = this.d;
        return Cb().hashCode() + ((a2 + (q500Var != null ? q500Var.hashCode() : 0)) * 31);
    }

    public String toString() {
        return "ClickableSticker(id=" + this.b + ", area=" + this.c + ", clickTimeline=" + this.d + ", type=" + Cb() + ')';
    }

    public final ClickableStickerStatInfo zb() {
        String Bb = Bb();
        ClickableStickerStatInfo.a aVar = new ClickableStickerStatInfo.a();
        Ab(aVar);
        return new ClickableStickerStatInfo(this.b, Bb, aVar.a, aVar.b, aVar.c);
    }

    public void Ab(ClickableStickerStatInfo.a aVar) {
    }
}
