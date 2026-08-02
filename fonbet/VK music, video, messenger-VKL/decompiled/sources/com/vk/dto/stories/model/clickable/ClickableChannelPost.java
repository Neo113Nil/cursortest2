package com.vk.dto.stories.model.clickable;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.entities.stat.ClickableStickerStatInfo;
import com.vk.superapp.api.dto.story.WebClickablePoint;
import com.vk.superapp.api.dto.story.WebStickerType;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
import xsna.bh10;
import xsna.epx;
import xsna.q500;
import xsna.shy;
import xsna.zcl;

/* compiled from: ClickableChannelPost.kt */
/* loaded from: classes18.dex */
public final class ClickableChannelPost extends ClickableSticker {
    public static final Serializer.c<ClickableChannelPost> CREATOR = new a();
    public final UserId e;
    public final UserId f;
    public final int g;
    public final String h;
    public final String i;
    public final WebStickerType j;
    public final String k;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<ClickableChannelPost> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ClickableChannelPost a(Serializer serializer) {
            return new ClickableChannelPost(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ClickableChannelPost[i];
        }
    }

    public /* synthetic */ ClickableChannelPost(long j, List list, q500 q500Var, UserId userId, UserId userId2, int i, String str, String str2, int i2, zcl zclVar) {
        this((i2 & 1) != 0 ? 0L : j, list, (i2 & 4) != 0 ? null : q500Var, (i2 & 8) != 0 ? UserId.d : userId, (i2 & 16) != 0 ? UserId.d : userId2, i, str, (i2 & 128) != 0 ? null : str2);
    }

    @Override // com.vk.dto.stories.model.clickable.ClickableSticker
    public final void Ab(ClickableStickerStatInfo.a aVar) {
        aVar.b("text_value", this.k);
        aVar.b(TtmlNode.TAG_STYLE, this.h);
    }

    @Override // com.vk.dto.stories.model.clickable.ClickableSticker
    public final WebStickerType Cb() {
        return this.j;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.Y(this.b);
        serializer.W(this.c);
        serializer.d0(this.d);
        serializer.e0(this.e);
        serializer.e0(this.f);
        serializer.S(this.g);
        serializer.j0(this.h);
        serializer.j0(this.i);
    }

    @Override // com.vk.dto.stories.model.clickable.ClickableSticker, xsna.bxx
    public final JSONObject e5() {
        JSONObject e5 = super.e5();
        e5.put("channel_owner_id", this.e);
        e5.put("channel_post_owner_id", this.f);
        e5.put("channel_post_id", this.g);
        e5.put(TtmlNode.TAG_STYLE, this.h);
        e5.put("channel_name", this.i);
        return e5;
    }

    @Override // com.vk.dto.stories.model.clickable.ClickableSticker
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClickableChannelPost) || !super.equals(obj)) {
            return false;
        }
        ClickableChannelPost clickableChannelPost = (ClickableChannelPost) obj;
        return epx.f(this.e, clickableChannelPost.e) && epx.f(this.f, clickableChannelPost.f) && this.g == clickableChannelPost.g && epx.f(this.h, clickableChannelPost.h);
    }

    @Override // com.vk.dto.stories.model.clickable.ClickableSticker
    public final int hashCode() {
        int a2 = bh10.a(bh10.a(shy.a(this.g, super.hashCode() * 31, 31), 31, this.f.b), 31, this.e.b);
        String str = this.h;
        return a2 + (str != null ? str.hashCode() : 0);
    }

    public ClickableChannelPost(long j, List<WebClickablePoint> list, q500 q500Var, UserId userId, UserId userId2, int i, String str, String str2) {
        super(j, list, q500Var);
        this.e = userId;
        this.f = userId2;
        this.g = i;
        this.h = str;
        this.i = str2;
        this.j = WebStickerType.CHANNEL_POST;
        StringBuilder sb = new StringBuilder();
        sb.append(userId2);
        sb.append('_');
        sb.append(i);
        this.k = sb.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ClickableChannelPost(Serializer serializer) {
        this(r1, r0 == null ? new ArrayList() : r0, serializer.y(), (UserId) serializer.A(UserId.class.getClassLoader()), (UserId) serializer.A(UserId.class.getClassLoader()), serializer.u(), serializer.H(), serializer.H());
        long w = serializer.w();
        ArrayList k = serializer.k(WebClickablePoint.class);
    }
}
