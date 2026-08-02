package com.vk.superapp.api.dto.story.actions;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.core.serialize.Serializer;
import com.vk.superapp.api.dto.story.WebStickerType;
import org.json.JSONObject;
import xsna.epx;
import xsna.ho8;

/* compiled from: WebActionMention.kt */
/* loaded from: classes6.dex */
public final class WebActionMention extends StickerAction {
    public static final Serializer.c<WebActionMention> CREATOR = new a();
    public final String b;
    public final String c;
    public final WebStickerType d;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<WebActionMention> {
        @Override // com.vk.core.serialize.Serializer.c
        public final WebActionMention a(Serializer serializer) {
            return new WebActionMention(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new WebActionMention[i];
        }
    }

    public WebActionMention(String str, String str2) {
        this.b = str;
        this.c = str2;
        this.d = WebStickerType.MENTION;
    }

    @Override // com.vk.superapp.api.dto.story.actions.StickerAction
    public final JSONObject Ab() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("mention", this.b);
        jSONObject.put(TtmlNode.TAG_STYLE, this.c);
        return jSONObject;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebActionMention)) {
            return false;
        }
        WebActionMention webActionMention = (WebActionMention) obj;
        return epx.f(this.b, webActionMention.b) && epx.f(this.c, webActionMention.c);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        String str = this.c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebActionMention(mention=");
        sb.append(this.b);
        sb.append(", style=");
        return ho8.a(sb, this.c, ')');
    }

    @Override // com.vk.superapp.api.dto.story.actions.StickerAction
    public final WebStickerType zb() {
        return this.d;
    }

    public WebActionMention(Serializer serializer) {
        this(serializer.H(), serializer.H());
    }
}
