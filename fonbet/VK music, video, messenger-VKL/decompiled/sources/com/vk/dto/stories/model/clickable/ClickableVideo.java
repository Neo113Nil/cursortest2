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

/* compiled from: ClickableVideo.kt */
/* loaded from: classes18.dex */
public final class ClickableVideo extends ClickableSticker {
    public static final Serializer.c<ClickableVideo> CREATOR = new a();
    public final UserId e;
    public final int f;
    public final String g;
    public final WebStickerType h;
    public final String i;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<ClickableVideo> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ClickableVideo a(Serializer serializer) {
            return new ClickableVideo(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ClickableVideo[i];
        }
    }

    public /* synthetic */ ClickableVideo(long j, List list, q500 q500Var, UserId userId, int i, String str, int i2, zcl zclVar) {
        this((i2 & 1) != 0 ? 0L : j, list, (i2 & 4) != 0 ? null : q500Var, (i2 & 8) != 0 ? UserId.d : userId, i, str);
    }

    @Override // com.vk.dto.stories.model.clickable.ClickableSticker
    public final void Ab(ClickableStickerStatInfo.a aVar) {
        aVar.b("text_value", this.i);
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
        e5.put("owner_id", this.e);
        e5.put("video_id", this.f);
        e5.put(TtmlNode.TAG_STYLE, this.g);
        return e5;
    }

    @Override // com.vk.dto.stories.model.clickable.ClickableSticker
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClickableVideo) || !super.equals(obj)) {
            return false;
        }
        ClickableVideo clickableVideo = (ClickableVideo) obj;
        return epx.f(this.e, clickableVideo.e) && this.f == clickableVideo.f && epx.f(this.g, clickableVideo.g);
    }

    @Override // com.vk.dto.stories.model.clickable.ClickableSticker
    public final int hashCode() {
        int a2 = bh10.a(shy.a(this.f, super.hashCode() * 31, 31), 31, this.e.b);
        String str = this.g;
        return a2 + (str != null ? str.hashCode() : 0);
    }

    public ClickableVideo(long j, List<WebClickablePoint> list, q500 q500Var, UserId userId, int i, String str) {
        super(j, list, q500Var);
        this.e = userId;
        this.f = i;
        this.g = str;
        this.h = WebStickerType.VK_VIDEO;
        StringBuilder sb = new StringBuilder();
        sb.append(userId);
        sb.append('_');
        sb.append(i);
        this.i = sb.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ClickableVideo(Serializer serializer) {
        this(r1, r0 == null ? new ArrayList() : r0, serializer.y(), (UserId) serializer.A(UserId.class.getClassLoader()), serializer.u(), serializer.H());
        long w = serializer.w();
        ArrayList k = serializer.k(WebClickablePoint.class);
    }
}
