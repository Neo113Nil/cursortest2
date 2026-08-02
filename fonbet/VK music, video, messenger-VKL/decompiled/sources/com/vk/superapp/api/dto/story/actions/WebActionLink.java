package com.vk.superapp.api.dto.story.actions;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.core.serialize.Serializer;
import com.vk.superapp.api.dto.story.WebStickerType;
import org.json.JSONObject;
import xsna.epx;
import xsna.ho8;

/* compiled from: WebActionLink.kt */
/* loaded from: classes6.dex */
public final class WebActionLink extends StickerAction {
    public static final Serializer.c<WebActionLink> CREATOR = new a();
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final WebStickerType f;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<WebActionLink> {
        @Override // com.vk.core.serialize.Serializer.c
        public final WebActionLink a(Serializer serializer) {
            return new WebActionLink(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new WebActionLink[i];
        }
    }

    public WebActionLink(String str, String str2, String str3, String str4) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = WebStickerType.LINK;
    }

    @Override // com.vk.superapp.api.dto.story.actions.StickerAction
    public final JSONObject Ab() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("link", this.b);
        jSONObject.put("tooltip_text_key", this.c);
        jSONObject.put("text", this.d);
        jSONObject.put(TtmlNode.TAG_STYLE, this.e);
        return jSONObject;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.j0(this.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebActionLink)) {
            return false;
        }
        WebActionLink webActionLink = (WebActionLink) obj;
        return epx.f(this.b, webActionLink.b) && epx.f(this.c, webActionLink.c) && epx.f(this.d, webActionLink.d) && epx.f(this.e, webActionLink.e);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        String str = this.c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebActionLink(link=");
        sb.append(this.b);
        sb.append(", tooltipTextKey=");
        sb.append(this.c);
        sb.append(", text=");
        sb.append(this.d);
        sb.append(", style=");
        return ho8.a(sb, this.e, ')');
    }

    @Override // com.vk.superapp.api.dto.story.actions.StickerAction
    public final WebStickerType zb() {
        return this.f;
    }

    public WebActionLink(Serializer serializer) {
        this(serializer.H(), serializer.H(), serializer.H(), serializer.H());
    }
}
