package com.vk.superapp.api.dto.story.actions;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.core.serialize.Serializer;
import com.vk.superapp.api.dto.story.WebStickerType;
import org.json.JSONObject;
import xsna.epx;
import xsna.ho8;

/* compiled from: WebActionServiceYcItem.kt */
/* loaded from: classes6.dex */
public final class WebActionServiceYcItem extends StickerAction {
    public static final Serializer.c<WebActionServiceYcItem> CREATOR = new a();
    public final String b;
    public final WebStickerType c;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<WebActionServiceYcItem> {
        @Override // com.vk.core.serialize.Serializer.c
        public final WebActionServiceYcItem a(Serializer serializer) {
            return new WebActionServiceYcItem(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new WebActionServiceYcItem[i];
        }
    }

    public WebActionServiceYcItem(String str) {
        this.b = str;
        this.c = WebStickerType.SERVICE_YC_ITEM;
    }

    @Override // com.vk.superapp.api.dto.story.actions.StickerAction
    public final JSONObject Ab() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(TtmlNode.TAG_STYLE, this.b);
        return jSONObject;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WebActionServiceYcItem) && epx.f(this.b, ((WebActionServiceYcItem) obj).b);
    }

    public final int hashCode() {
        String str = this.b;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("WebActionServiceYcItem(style="), this.b, ')');
    }

    @Override // com.vk.superapp.api.dto.story.actions.StickerAction
    public final WebStickerType zb() {
        return this.c;
    }

    public WebActionServiceYcItem(Serializer serializer) {
        this(serializer.H());
    }
}
