package com.vk.superapp.api.dto.story.actions;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.core.serialize.Serializer;
import com.vk.superapp.api.dto.story.WebStickerType;
import org.json.JSONObject;
import xsna.epx;
import xsna.ho8;
import xsna.urd0;

/* compiled from: WebActionPlace.kt */
/* loaded from: classes6.dex */
public final class WebActionPlace extends StickerAction {
    public static final Serializer.c<WebActionPlace> CREATOR = new a();
    public final int b;
    public final String c;
    public final Integer d;
    public final String e;
    public final String f;
    public final WebStickerType g;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<WebActionPlace> {
        @Override // com.vk.core.serialize.Serializer.c
        public final WebActionPlace a(Serializer serializer) {
            return new WebActionPlace(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new WebActionPlace[i];
        }
    }

    public WebActionPlace(int i, String str, Integer num, String str2, String str3) {
        this.b = i;
        this.c = str;
        this.d = num;
        this.e = str2;
        this.f = str3;
        this.g = WebStickerType.GEO;
    }

    @Override // com.vk.superapp.api.dto.story.actions.StickerAction
    public final JSONObject Ab() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("place_id", this.b);
        jSONObject.put("title", this.c);
        jSONObject.put("category_id", this.d);
        jSONObject.put(TtmlNode.TAG_STYLE, this.e);
        jSONObject.put("subtitle", this.f);
        return jSONObject;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.j0(this.c);
        serializer.V(this.d);
        serializer.j0(this.e);
        serializer.j0(this.f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebActionPlace)) {
            return false;
        }
        WebActionPlace webActionPlace = (WebActionPlace) obj;
        return this.b == webActionPlace.b && epx.f(this.c, webActionPlace.c) && epx.f(this.d, webActionPlace.d) && epx.f(this.e, webActionPlace.e) && epx.f(this.f, webActionPlace.f);
    }

    public final int hashCode() {
        int a2 = urd0.a(Integer.hashCode(this.b) * 31, 31, this.c);
        Integer num = this.d;
        int hashCode = (a2 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.e;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebActionPlace(placeId=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", categoryId=");
        sb.append(this.d);
        sb.append(", style=");
        sb.append(this.e);
        sb.append(", subtitle=");
        return ho8.a(sb, this.f, ')');
    }

    @Override // com.vk.superapp.api.dto.story.actions.StickerAction
    public final WebStickerType zb() {
        return this.g;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public WebActionPlace(Serializer serializer) {
        this(r1, r0 == null ? "" : r0, serializer.v(), serializer.H(), serializer.H());
        int u = serializer.u();
        String H = serializer.H();
    }
}
