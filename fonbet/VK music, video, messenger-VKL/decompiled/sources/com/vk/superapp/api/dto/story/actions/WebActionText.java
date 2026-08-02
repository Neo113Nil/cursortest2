package com.vk.superapp.api.dto.story.actions;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.core.serialize.Serializer;
import com.vk.superapp.api.dto.story.WebStickerType;
import org.json.JSONObject;
import xsna.epx;
import xsna.so;

/* compiled from: WebActionText.kt */
/* loaded from: classes6.dex */
public final class WebActionText extends StickerAction {
    public static final Serializer.c<WebActionText> CREATOR = new a();
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final Float g;
    public final Float h;
    public final WebStickerType i;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<WebActionText> {
        @Override // com.vk.core.serialize.Serializer.c
        public final WebActionText a(Serializer serializer) {
            return new WebActionText(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new WebActionText[i];
        }
    }

    public WebActionText(String str, String str2, String str3, String str4, String str5, Float f, Float f2) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = f;
        this.h = f2;
        this.i = WebStickerType.TEXT;
    }

    @Override // com.vk.superapp.api.dto.story.actions.StickerAction
    public final JSONObject Ab() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("text", this.b);
        jSONObject.put(TtmlNode.TAG_STYLE, this.c);
        jSONObject.put("background_style", this.d);
        jSONObject.put("alignment", this.e);
        jSONObject.put("selection_color", this.f);
        jSONObject.put("font_size", this.g);
        jSONObject.put("font_size_px", this.h);
        return jSONObject;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.j0(this.e);
        serializer.j0(this.f);
        serializer.R(this.g);
        serializer.R(this.h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebActionText)) {
            return false;
        }
        WebActionText webActionText = (WebActionText) obj;
        return epx.f(this.b, webActionText.b) && epx.f(this.c, webActionText.c) && epx.f(this.d, webActionText.d) && epx.f(this.e, webActionText.e) && epx.f(this.f, webActionText.f) && epx.f(this.g, webActionText.g) && epx.f(this.h, webActionText.h);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        String str = this.c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Float f = this.g;
        int hashCode6 = (hashCode5 + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.h;
        return hashCode6 + (f2 != null ? f2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebActionText(text=");
        sb.append(this.b);
        sb.append(", style=");
        sb.append(this.c);
        sb.append(", backgroundStyle=");
        sb.append(this.d);
        sb.append(", alignment=");
        sb.append(this.e);
        sb.append(", selectionColor=");
        sb.append(this.f);
        sb.append(", fontSize=");
        sb.append(this.g);
        sb.append(", fontSizePx=");
        return so.b(sb, this.h, ')');
    }

    @Override // com.vk.superapp.api.dto.story.actions.StickerAction
    public final WebStickerType zb() {
        return this.i;
    }

    public WebActionText(Serializer serializer) {
        this(serializer.H(), serializer.H(), serializer.H(), serializer.H(), serializer.H(), serializer.t(), serializer.t());
    }
}
