package com.vk.superapp.api.dto.story.actions;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.core.serialize.Serializer;
import com.vk.superapp.api.dto.story.WebStickerType;
import org.json.JSONObject;
import xsna.epx;
import xsna.ho8;

/* compiled from: WebActionHashtag.kt */
/* loaded from: classes6.dex */
public final class WebActionHashtag extends StickerAction {
    public static final Serializer.c<WebActionHashtag> CREATOR = new a();
    public final String b;
    public final String c;
    public final WebStickerType d;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<WebActionHashtag> {
        @Override // com.vk.core.serialize.Serializer.c
        public final WebActionHashtag a(Serializer serializer) {
            return new WebActionHashtag(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new WebActionHashtag[i];
        }
    }

    public WebActionHashtag(String str, String str2) {
        this.b = str;
        this.c = str2;
        this.d = WebStickerType.HASHTAG;
    }

    @Override // com.vk.superapp.api.dto.story.actions.StickerAction
    public final JSONObject Ab() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("hashtag", this.b);
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
        if (!(obj instanceof WebActionHashtag)) {
            return false;
        }
        WebActionHashtag webActionHashtag = (WebActionHashtag) obj;
        return epx.f(this.b, webActionHashtag.b) && epx.f(this.c, webActionHashtag.c);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        String str = this.c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebActionHashtag(hashtag=");
        sb.append(this.b);
        sb.append(", style=");
        return ho8.a(sb, this.c, ')');
    }

    @Override // com.vk.superapp.api.dto.story.actions.StickerAction
    public final WebStickerType zb() {
        return this.d;
    }

    public WebActionHashtag(Serializer serializer) {
        this(serializer.H(), serializer.H());
    }
}
