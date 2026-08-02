package com.vk.superapp.api.dto.story.actions;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.core.serialize.Serializer;
import com.vk.superapp.api.dto.story.WebStickerType;
import org.json.JSONObject;
import xsna.epx;
import xsna.ho8;
import xsna.zcl;

/* compiled from: WebActionTime.kt */
/* loaded from: classes6.dex */
public final class WebActionTime extends StickerAction {
    public static final Serializer.c<WebActionTime> CREATOR = new a();
    public final String b;
    public final Long c;
    public final String d;
    public final String e;
    public final WebStickerType f;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<WebActionTime> {
        @Override // com.vk.core.serialize.Serializer.c
        public final WebActionTime a(Serializer serializer) {
            return new WebActionTime(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new WebActionTime[i];
        }
    }

    public /* synthetic */ WebActionTime(String str, Long l, String str2, String str3, int i, zcl zclVar) {
        this(str, l, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
    }

    @Override // com.vk.superapp.api.dto.story.actions.StickerAction
    public final JSONObject Ab() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(TtmlNode.TAG_STYLE, this.b);
        jSONObject.put("timestamp_ms", this.c);
        jSONObject.put("title", this.d);
        jSONObject.put("date", this.e);
        return jSONObject;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.b0(this.c);
        serializer.j0(this.d);
        serializer.j0(this.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebActionTime)) {
            return false;
        }
        WebActionTime webActionTime = (WebActionTime) obj;
        return epx.f(this.b, webActionTime.b) && epx.f(this.c, webActionTime.c) && epx.f(this.d, webActionTime.d) && epx.f(this.e, webActionTime.e);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        Long l = this.c;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.d;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebActionTime(style=");
        sb.append(this.b);
        sb.append(", timestampMs=");
        sb.append(this.c);
        sb.append(", title=");
        sb.append(this.d);
        sb.append(", date=");
        return ho8.a(sb, this.e, ')');
    }

    @Override // com.vk.superapp.api.dto.story.actions.StickerAction
    public final WebStickerType zb() {
        return this.f;
    }

    public WebActionTime(String str, Long l, String str2, String str3) {
        this.b = str;
        this.c = l;
        this.d = str2;
        this.e = str3;
        this.f = WebStickerType.TIME;
    }

    public WebActionTime(Serializer serializer) {
        this(serializer.H(), serializer.x(), serializer.H(), serializer.H());
    }
}
