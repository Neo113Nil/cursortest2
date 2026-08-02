package com.vk.dto.stories.model.clickable;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.common.links.AwayLink;
import com.vk.core.serialize.Serializer;
import com.vk.dto.attachments.SnippetAttachment;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.entities.stat.ClickableStickerStatInfo;
import com.vk.superapp.api.dto.story.WebClickablePoint;
import com.vk.superapp.api.dto.story.WebStickerType;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
import xsna.epx;
import xsna.fkq0;
import xsna.q500;
import xsna.zcl;

/* compiled from: ClickableServiceYcItem.kt */
/* loaded from: classes18.dex */
public final class ClickableServiceYcItem extends ClickableSticker {
    public static final Serializer.c<ClickableServiceYcItem> CREATOR = new a();
    public final Long e;
    public final UserId f;
    public final String g;
    public final SnippetAttachment h;
    public final WebStickerType i;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<ClickableServiceYcItem> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ClickableServiceYcItem a(Serializer serializer) {
            return new ClickableServiceYcItem(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ClickableServiceYcItem[i];
        }
    }

    public /* synthetic */ ClickableServiceYcItem(long j, List list, q500 q500Var, Long l, UserId userId, String str, SnippetAttachment snippetAttachment, int i, zcl zclVar) {
        this((i & 1) != 0 ? 0L : j, list, (i & 4) != 0 ? null : q500Var, (i & 8) != 0 ? null : l, (i & 16) != 0 ? null : userId, (i & 32) != 0 ? null : str, (i & 64) != 0 ? null : snippetAttachment);
    }

    @Override // com.vk.dto.stories.model.clickable.ClickableSticker
    public final void Ab(ClickableStickerStatInfo.a aVar) {
        AwayLink awayLink;
        SnippetAttachment snippetAttachment = this.h;
        aVar.b("text_value", (snippetAttachment == null || (awayLink = snippetAttachment.f) == null) ? null : awayLink.b);
        aVar.b(TtmlNode.TAG_STYLE, this.g);
    }

    @Override // com.vk.dto.stories.model.clickable.ClickableSticker
    public final WebStickerType Cb() {
        return this.i;
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
    }

    @Override // com.vk.dto.stories.model.clickable.ClickableSticker, xsna.bxx
    public final JSONObject e5() {
        JSONObject e5 = super.e5();
        UserId userId = this.f;
        if (userId != null) {
            e5.put("service_yc_item_owner_id", fkq0.b(userId) ? userId.b : fkq0.e(userId).b);
        }
        Long l = this.e;
        if (l != null) {
            e5.put("service_yc_item_id", l.longValue());
        }
        String str = this.g;
        if (str != null) {
            e5.put(TtmlNode.TAG_STYLE, str);
        }
        return e5;
    }

    @Override // com.vk.dto.stories.model.clickable.ClickableSticker
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClickableServiceYcItem) || !super.equals(obj)) {
            return false;
        }
        ClickableServiceYcItem clickableServiceYcItem = (ClickableServiceYcItem) obj;
        return epx.f(this.g, clickableServiceYcItem.g) && this.i == clickableServiceYcItem.i;
    }

    @Override // com.vk.dto.stories.model.clickable.ClickableSticker
    public final int hashCode() {
        int hashCode = super.hashCode() * 31;
        String str = this.g;
        return this.i.hashCode() + ((hashCode + (str != null ? str.hashCode() : 0)) * 31);
    }

    public ClickableServiceYcItem(long j, List<WebClickablePoint> list, q500 q500Var, Long l, UserId userId, String str, SnippetAttachment snippetAttachment) {
        super(j, list, q500Var);
        this.e = l;
        this.f = userId;
        this.g = str;
        this.h = snippetAttachment;
        this.i = WebStickerType.SERVICE_YC_ITEM;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ClickableServiceYcItem(Serializer serializer) {
        this(r1, r0 == null ? new ArrayList() : r0, serializer.y(), serializer.x(), (UserId) serializer.A(UserId.class.getClassLoader()), serializer.H(), (SnippetAttachment) serializer.G(SnippetAttachment.class.getClassLoader()));
        long w = serializer.w();
        ArrayList k = serializer.k(WebClickablePoint.class);
    }
}
