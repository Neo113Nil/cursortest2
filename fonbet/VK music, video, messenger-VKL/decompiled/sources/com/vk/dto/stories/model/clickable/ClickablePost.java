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
import xsna.urd0;
import xsna.zcl;

/* compiled from: ClickablePost.kt */
/* loaded from: classes18.dex */
public final class ClickablePost extends ClickableSticker {
    public static final Serializer.c<ClickablePost> CREATOR = new a();
    public final int e;
    public final UserId f;
    public final String g;
    public final String h;
    public final WebStickerType i;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<ClickablePost> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ClickablePost a(Serializer serializer) {
            return new ClickablePost(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ClickablePost[i];
        }
    }

    public /* synthetic */ ClickablePost(long j, List list, q500 q500Var, int i, UserId userId, String str, int i2, zcl zclVar) {
        this((i2 & 1) != 0 ? 0L : j, list, (i2 & 4) != 0 ? null : q500Var, i, userId, str);
    }

    @Override // com.vk.dto.stories.model.clickable.ClickableSticker
    public final void Ab(ClickableStickerStatInfo.a aVar) {
        aVar.b("text_value", this.h);
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
        serializer.S(this.e);
        serializer.e0(this.f);
        serializer.j0(this.g);
    }

    @Override // com.vk.dto.stories.model.clickable.ClickableSticker, xsna.bxx
    public final JSONObject e5() {
        JSONObject e5 = super.e5();
        e5.put("post_id", this.e);
        e5.put("post_owner_id", this.f.b);
        e5.put(TtmlNode.TAG_STYLE, this.g);
        return e5;
    }

    @Override // com.vk.dto.stories.model.clickable.ClickableSticker
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClickablePost) || !super.equals(obj)) {
            return false;
        }
        ClickablePost clickablePost = (ClickablePost) obj;
        return this.e == clickablePost.e && epx.f(this.f, clickablePost.f) && epx.f(this.g, clickablePost.g) && epx.f(this.h, clickablePost.h) && this.i == clickablePost.i;
    }

    @Override // com.vk.dto.stories.model.clickable.ClickableSticker
    public final int hashCode() {
        int a2 = bh10.a(((super.hashCode() * 31) + this.e) * 31, 31, this.f.b);
        String str = this.g;
        return this.i.hashCode() + urd0.a((a2 + (str != null ? str.hashCode() : 0)) * 31, 31, this.h);
    }

    public ClickablePost(long j, List<WebClickablePoint> list, q500 q500Var, int i, UserId userId, String str) {
        super(j, list, q500Var);
        this.e = i;
        this.f = userId;
        this.g = str;
        StringBuilder sb = new StringBuilder();
        sb.append(userId);
        sb.append('_');
        sb.append(i);
        this.h = sb.toString();
        this.i = WebStickerType.POST;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ClickablePost(Serializer serializer) {
        this(r1, r3, r4, r5, r0 == null ? UserId.d : r0, serializer.H());
        long w = serializer.w();
        ArrayList k = serializer.k(WebClickablePoint.class);
        ArrayList arrayList = k == null ? new ArrayList() : k;
        q500 y = serializer.y();
        int u = serializer.u();
        UserId userId = (UserId) serializer.A(UserId.class.getClassLoader());
    }
}
