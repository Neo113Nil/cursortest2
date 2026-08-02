package com.vk.superapp.api.dto.story.actions;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import com.vk.superapp.api.dto.story.WebStickerType;
import org.json.JSONObject;
import xsna.epx;
import xsna.ho8;

/* compiled from: WebActionMarketItem.kt */
/* loaded from: classes6.dex */
public final class WebActionMarketItem extends StickerAction {
    public static final Serializer.c<WebActionMarketItem> CREATOR = new a();
    public final String b;
    public final Long c;
    public final UserId d;
    public final String e;
    public final WebStickerType f;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<WebActionMarketItem> {
        @Override // com.vk.core.serialize.Serializer.c
        public final WebActionMarketItem a(Serializer serializer) {
            return new WebActionMarketItem(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new WebActionMarketItem[i];
        }
    }

    public WebActionMarketItem(String str, Long l, UserId userId, String str2) {
        this.b = str;
        this.c = l;
        this.d = userId;
        this.e = str2;
        this.f = WebStickerType.MARKET_ITEM;
    }

    @Override // com.vk.superapp.api.dto.story.actions.StickerAction
    public final JSONObject Ab() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("title", this.b);
        jSONObject.put("product_id", this.c);
        jSONObject.put("owner_id", this.d);
        jSONObject.put("link", this.e);
        return jSONObject;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.b0(this.c);
        serializer.e0(this.d);
        serializer.j0(this.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebActionMarketItem)) {
            return false;
        }
        WebActionMarketItem webActionMarketItem = (WebActionMarketItem) obj;
        return epx.f(this.b, webActionMarketItem.b) && epx.f(this.c, webActionMarketItem.c) && epx.f(this.d, webActionMarketItem.d) && epx.f(this.e, webActionMarketItem.e);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        Long l = this.c;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        UserId userId = this.d;
        int hashCode3 = (hashCode2 + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        String str = this.e;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebActionMarketItem(title=");
        sb.append(this.b);
        sb.append(", productId=");
        sb.append(this.c);
        sb.append(", ownerId=");
        sb.append(this.d);
        sb.append(", link=");
        return ho8.a(sb, this.e, ')');
    }

    @Override // com.vk.superapp.api.dto.story.actions.StickerAction
    public final WebStickerType zb() {
        return this.f;
    }

    public WebActionMarketItem(Serializer serializer) {
        this(serializer.H(), serializer.x(), (UserId) serializer.A(UserId.class.getClassLoader()), serializer.H());
    }
}
