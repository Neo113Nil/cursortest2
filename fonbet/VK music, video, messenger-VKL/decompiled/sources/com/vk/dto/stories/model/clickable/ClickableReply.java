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
import xsna.zcl;

/* compiled from: ClickableReply.kt */
/* loaded from: classes18.dex */
public final class ClickableReply extends ClickableSticker {
    public static final Serializer.c<ClickableReply> CREATOR = new a();
    public final UserId e;
    public final int f;
    public final String g;
    public final WebStickerType h;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<ClickableReply> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ClickableReply a(Serializer serializer) {
            return new ClickableReply(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ClickableReply[i];
        }
    }

    public /* synthetic */ ClickableReply(long j, List list, q500 q500Var, UserId userId, int i, String str, int i2, zcl zclVar) {
        this((i2 & 1) != 0 ? 0L : j, list, (i2 & 4) != 0 ? null : q500Var, (i2 & 8) != 0 ? UserId.d : userId, (i2 & 16) != 0 ? 0 : i, (i2 & 32) != 0 ? null : str);
    }

    @Override // com.vk.dto.stories.model.clickable.ClickableSticker
    public final void Ab(ClickableStickerStatInfo.a aVar) {
        aVar.b(TtmlNode.TAG_STYLE, this.g);
    }

    @Override // com.vk.dto.stories.model.clickable.ClickableSticker
    public final WebStickerType Cb() {
        return this.h;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.Y(this.b);
        serializer.W(this.c);
        serializer.d0(this.d);
        serializer.e0(this.e);
        serializer.S(this.f);
        serializer.j0(this.g);
    }

    @Override // com.vk.dto.stories.model.clickable.ClickableSticker, xsna.bxx
    public final JSONObject e5() {
        JSONObject e5 = super.e5();
        e5.put(TtmlNode.TAG_STYLE, this.g);
        return e5;
    }

    @Override // com.vk.dto.stories.model.clickable.ClickableSticker
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClickableReply) || !super.equals(obj)) {
            return false;
        }
        ClickableReply clickableReply = (ClickableReply) obj;
        return epx.f(this.e, clickableReply.e) && this.f == clickableReply.f && this.h == clickableReply.h && epx.f(this.g, clickableReply.g);
    }

    @Override // com.vk.dto.stories.model.clickable.ClickableSticker
    public final int hashCode() {
        int hashCode = (this.h.hashCode() + ((bh10.a(super.hashCode() * 31, 31, this.e.b) + this.f) * 31)) * 31;
        String str = this.g;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public ClickableReply(long j, List<WebClickablePoint> list, q500 q500Var, UserId userId, int i, String str) {
        super(j, list, q500Var);
        this.e = userId;
        this.f = i;
        this.g = str;
        this.h = WebStickerType.REPLY;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ClickableReply(Serializer serializer) {
        this(r1, r0 == null ? new ArrayList() : r0, serializer.y(), (UserId) serializer.A(UserId.class.getClassLoader()), serializer.u(), serializer.H());
        long w = serializer.w();
        ArrayList k = serializer.k(WebClickablePoint.class);
    }
}
