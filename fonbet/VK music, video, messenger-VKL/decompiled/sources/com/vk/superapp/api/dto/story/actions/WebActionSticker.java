package com.vk.superapp.api.dto.story.actions;

import com.vk.core.serialize.Serializer;
import com.vk.superapp.api.dto.story.WebStickerType;
import org.json.JSONObject;
import xsna.vu5;

/* compiled from: WebActionSticker.kt */
/* loaded from: classes6.dex */
public final class WebActionSticker extends StickerAction {
    public static final Serializer.c<WebActionSticker> CREATOR = new a();
    public final int b;
    public final int c;
    public final WebStickerType d;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<WebActionSticker> {
        @Override // com.vk.core.serialize.Serializer.c
        public final WebActionSticker a(Serializer serializer) {
            return new WebActionSticker(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new WebActionSticker[i];
        }
    }

    public WebActionSticker(int i, int i2) {
        this.b = i;
        this.c = i2;
        this.d = WebStickerType.STICKER;
    }

    @Override // com.vk.superapp.api.dto.story.actions.StickerAction
    public final JSONObject Ab() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("sticker_id", this.b);
        jSONObject.put("pack_id", this.c);
        return jSONObject;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.S(this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebActionSticker)) {
            return false;
        }
        WebActionSticker webActionSticker = (WebActionSticker) obj;
        return this.b == webActionSticker.b && this.c == webActionSticker.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + (Integer.hashCode(this.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebActionSticker(stickerId=");
        sb.append(this.b);
        sb.append(", packId=");
        return vu5.b(sb, this.c, ')');
    }

    @Override // com.vk.superapp.api.dto.story.actions.StickerAction
    public final WebStickerType zb() {
        return this.d;
    }

    public WebActionSticker(Serializer serializer) {
        this(serializer.u(), serializer.u());
    }
}
