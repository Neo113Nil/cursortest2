package com.vk.dto.stories.model.clickable;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.api.generated.shortVideo.dto.ShortVideoClickableStickerItemDto;
import com.vk.core.serialize.Serializer;
import com.vk.dto.stories.entities.stat.ClickableStickerStatInfo;
import com.vk.superapp.api.dto.story.WebClickablePoint;
import com.vk.superapp.api.dto.story.WebStickerType;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
import xsna.q500;
import xsna.qoy;
import xsna.zcl;

/* compiled from: ClickableReaction.kt */
/* loaded from: classes18.dex */
public final class ClickableReaction extends ClickableSticker {
    public static final Serializer.c<ClickableReaction> CREATOR = new a();
    public final int e;
    public final boolean f;
    public final WebStickerType g;
    public final String h;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<ClickableReaction> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ClickableReaction a(Serializer serializer) {
            return new ClickableReaction(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ClickableReaction[i];
        }
    }

    public /* synthetic */ ClickableReaction(long j, List list, q500 q500Var, int i, boolean z, int i2, zcl zclVar) {
        this((i2 & 1) != 0 ? 0L : j, list, (i2 & 4) != 0 ? null : q500Var, i, z);
    }

    @Override // com.vk.dto.stories.model.clickable.ClickableSticker
    public final void Ab(ClickableStickerStatInfo.a aVar) {
        aVar.a(Integer.valueOf(this.e), "id_value");
        aVar.b(TtmlNode.TAG_STYLE, this.f ? "dark" : "light");
    }

    @Override // com.vk.dto.stories.model.clickable.ClickableSticker
    public final String Bb() {
        return this.h;
    }

    @Override // com.vk.dto.stories.model.clickable.ClickableSticker
    public final WebStickerType Cb() {
        return this.g;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.Y(this.b);
        serializer.W(this.c);
        serializer.d0(this.d);
        serializer.S(this.e);
        serializer.L(this.f ? (byte) 1 : (byte) 0);
    }

    @Override // com.vk.dto.stories.model.clickable.ClickableSticker, xsna.bxx
    public final JSONObject e5() {
        JSONObject e5 = super.e5();
        e5.put("reaction_id", this.e);
        e5.put(TtmlNode.TAG_STYLE, (this.f ? ShortVideoClickableStickerItemDto.StyleDto.DARK : ShortVideoClickableStickerItemDto.StyleDto.LIGHT).i());
        return e5;
    }

    @Override // com.vk.dto.stories.model.clickable.ClickableSticker
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClickableReaction) || !super.equals(obj)) {
            return false;
        }
        ClickableReaction clickableReaction = (ClickableReaction) obj;
        return this.e == clickableReaction.e && this.f == clickableReaction.f && this.g == clickableReaction.g;
    }

    @Override // com.vk.dto.stories.model.clickable.ClickableSticker
    public final int hashCode() {
        return this.g.hashCode() + qoy.b(((super.hashCode() * 31) + this.e) * 31, 31, this.f);
    }

    public ClickableReaction(long j, List<WebClickablePoint> list, q500 q500Var, int i, boolean z) {
        super(j, list, q500Var);
        this.e = i;
        this.f = z;
        this.g = WebStickerType.REACTION;
        this.h = "reaction";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ClickableReaction(Serializer serializer) {
        this(r1, r0 == null ? new ArrayList() : r0, serializer.y(), serializer.u(), serializer.m());
        long w = serializer.w();
        ArrayList k = serializer.k(WebClickablePoint.class);
    }
}
