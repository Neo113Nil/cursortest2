package com.vk.dto.stories.model.clickable;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.core.serialize.Serializer;
import com.vk.dto.attachments.SnippetAttachment;
import com.vk.dto.common.Good;
import com.vk.dto.common.Image;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.Photo;
import com.vk.dto.stories.entities.stat.ClickableStickerStatInfo;
import com.vk.superapp.api.dto.story.WebClickablePoint;
import com.vk.superapp.api.dto.story.WebStickerType;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
import xsna.epx;
import xsna.q500;
import xsna.zcl;

/* compiled from: ClickableMarketItem.kt */
/* loaded from: classes18.dex */
public final class ClickableMarketItem extends ClickableSticker {
    public static final Serializer.c<ClickableMarketItem> CREATOR = new a();
    public final Long e;
    public final UserId f;
    public final String g;
    public final Image h;
    public final Photo i;
    public final Good j;
    public final SnippetAttachment k;
    public final String l;
    public final String m;
    public final WebStickerType n;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<ClickableMarketItem> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ClickableMarketItem a(Serializer serializer) {
            return new ClickableMarketItem(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ClickableMarketItem[i];
        }
    }

    public /* synthetic */ ClickableMarketItem(long j, List list, q500 q500Var, Long l, UserId userId, String str, Image image, Photo photo, Good good, SnippetAttachment snippetAttachment, String str2, String str3, int i, zcl zclVar) {
        this((i & 1) != 0 ? 0L : j, list, (i & 4) != 0 ? null : q500Var, l, userId, str, (i & 64) != 0 ? null : image, (i & 128) != 0 ? null : photo, (i & 256) != 0 ? null : good, (i & 512) != 0 ? null : snippetAttachment, (i & 1024) != 0 ? null : str2, (i & 2048) != 0 ? null : str3);
    }

    @Override // com.vk.dto.stories.model.clickable.ClickableSticker
    public final void Ab(ClickableStickerStatInfo.a aVar) {
        String str;
        Long l;
        UserId userId = this.f;
        if (userId == null || (l = this.e) == null) {
            str = null;
        } else {
            long longValue = l.longValue();
            StringBuilder sb = new StringBuilder();
            sb.append(userId);
            sb.append('_');
            sb.append(longValue);
            str = sb.toString();
        }
        aVar.b("text_value", str);
        aVar.b(TtmlNode.TAG_STYLE, this.m);
    }

    @Override // com.vk.dto.stories.model.clickable.ClickableSticker
    public final WebStickerType Cb() {
        return this.n;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.Y(this.b);
        serializer.W(this.c);
        serializer.d0(this.d);
        serializer.b0(this.e);
        serializer.e0(this.f);
        serializer.j0(this.g);
        serializer.i0(this.h);
        serializer.i0(this.i);
        serializer.i0(this.j);
        serializer.i0(this.k);
        serializer.m0(this.l);
        serializer.j0(this.m);
    }

    @Override // com.vk.dto.stories.model.clickable.ClickableSticker, xsna.bxx
    public final JSONObject e5() {
        JSONObject e5 = super.e5();
        Long l = this.e;
        if (l != null) {
            e5.put("market_item_id", l.longValue());
        }
        UserId userId = this.f;
        if (userId != null) {
            e5.put("market_item_owner_id", userId);
        }
        String str = this.g;
        if (str != null) {
            e5.put("link", str);
        }
        String str2 = this.m;
        if (str2 != null) {
            e5.put(TtmlNode.TAG_STYLE, str2);
        }
        return e5;
    }

    @Override // com.vk.dto.stories.model.clickable.ClickableSticker
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClickableMarketItem) || !super.equals(obj)) {
            return false;
        }
        ClickableMarketItem clickableMarketItem = (ClickableMarketItem) obj;
        return epx.f(this.e, clickableMarketItem.e) && epx.f(this.f, clickableMarketItem.f) && epx.f(this.g, clickableMarketItem.g) && epx.f(this.h, clickableMarketItem.h) && epx.f(this.i, clickableMarketItem.i) && epx.f(this.j, clickableMarketItem.j) && epx.f(this.k, clickableMarketItem.k) && this.n == clickableMarketItem.n && epx.f(this.m, clickableMarketItem.m);
    }

    @Override // com.vk.dto.stories.model.clickable.ClickableSticker
    public final int hashCode() {
        int hashCode = super.hashCode() * 31;
        Long l = this.e;
        int hashCode2 = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        UserId userId = this.f;
        int hashCode3 = (hashCode2 + (userId != null ? Long.hashCode(userId.b) : 0)) * 31;
        String str = this.g;
        int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 31;
        Image image = this.h;
        int hashCode5 = (hashCode4 + (image != null ? image.hashCode() : 0)) * 31;
        Photo photo = this.i;
        int hashCode6 = (hashCode5 + (photo != null ? photo.hashCode() : 0)) * 31;
        Good good = this.j;
        int hashCode7 = (hashCode6 + (good != null ? good.hashCode() : 0)) * 31;
        SnippetAttachment snippetAttachment = this.k;
        int hashCode8 = (this.n.hashCode() + ((hashCode7 + (snippetAttachment != null ? snippetAttachment.hashCode() : 0)) * 31)) * 31;
        String str2 = this.l;
        int hashCode9 = (hashCode8 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.m;
        return hashCode9 + (str3 != null ? str3.hashCode() : 0);
    }

    public ClickableMarketItem(long j, List<WebClickablePoint> list, q500 q500Var, Long l, UserId userId, String str, Image image, Photo photo, Good good, SnippetAttachment snippetAttachment, String str2, String str3) {
        super(j, list, q500Var);
        this.e = l;
        this.f = userId;
        this.g = str;
        this.h = image;
        this.i = photo;
        this.j = good;
        this.k = snippetAttachment;
        this.l = str2;
        this.m = str3;
        this.n = WebStickerType.MARKET_ITEM;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ClickableMarketItem(Serializer serializer) {
        this(r1, r0 == null ? new ArrayList() : r0, serializer.y(), serializer.x(), (UserId) serializer.A(UserId.class.getClassLoader()), serializer.H(), (Image) serializer.G(Image.class.getClassLoader()), (Photo) serializer.G(Photo.class.getClassLoader()), (Good) serializer.G(Good.class.getClassLoader()), (SnippetAttachment) serializer.G(SnippetAttachment.class.getClassLoader()), serializer.I(), serializer.H());
        long w = serializer.w();
        ArrayList k = serializer.k(WebClickablePoint.class);
    }
}
