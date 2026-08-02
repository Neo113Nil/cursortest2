package com.vk.dto.stories.model.clickable;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.core.serialize.Serializer;
import com.vk.dto.stories.entities.stat.ClickableStickerStatInfo;
import com.vk.superapp.api.dto.story.WebClickablePoint;
import com.vk.superapp.api.dto.story.WebStickerType;
import java.util.List;
import kotlin.collections.EmptyList;
import org.json.JSONObject;
import xsna.epx;
import xsna.q500;
import xsna.urd0;
import xsna.zcl;

/* compiled from: ClickableHashtag.kt */
/* loaded from: classes18.dex */
public final class ClickableHashtag extends ClickableSticker {
    public static final Serializer.c<ClickableHashtag> CREATOR = new a();
    public final String e;
    public final String f;
    public final WebStickerType g;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<ClickableHashtag> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ClickableHashtag a(Serializer serializer) {
            return new ClickableHashtag(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ClickableHashtag[i];
        }
    }

    public /* synthetic */ ClickableHashtag(long j, List list, q500 q500Var, String str, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? 0L : j, list, (i & 4) != 0 ? null : q500Var, str, str2);
    }

    @Override // com.vk.dto.stories.model.clickable.ClickableSticker
    public final void Ab(ClickableStickerStatInfo.a aVar) {
        aVar.b("text_value", this.e);
        aVar.b(TtmlNode.TAG_STYLE, this.f);
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
        serializer.j0(this.e);
        serializer.j0(this.f);
    }

    @Override // com.vk.dto.stories.model.clickable.ClickableSticker, xsna.bxx
    public final JSONObject e5() {
        JSONObject e5 = super.e5();
        e5.put("hashtag", this.e);
        e5.put(TtmlNode.TAG_STYLE, this.f);
        return e5;
    }

    @Override // com.vk.dto.stories.model.clickable.ClickableSticker
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClickableHashtag) || !super.equals(obj)) {
            return false;
        }
        ClickableHashtag clickableHashtag = (ClickableHashtag) obj;
        return epx.f(this.e, clickableHashtag.e) && epx.f(this.f, clickableHashtag.f) && this.g == clickableHashtag.g;
    }

    @Override // com.vk.dto.stories.model.clickable.ClickableSticker
    public final int hashCode() {
        int a2 = urd0.a(super.hashCode() * 31, 31, this.e);
        String str = this.f;
        return this.g.hashCode() + ((a2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public ClickableHashtag(long j, List<WebClickablePoint> list, q500 q500Var, String str, String str2) {
        super(j, list, q500Var);
        this.e = str;
        this.f = str2;
        this.g = WebStickerType.HASHTAG;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ClickableHashtag(Serializer serializer) {
        this(r1, r3, r4, r0 == null ? "" : r0, serializer.H());
        long w = serializer.w();
        List k = serializer.k(WebClickablePoint.class);
        List list = k == null ? EmptyList.b : k;
        q500 y = serializer.y();
        String H = serializer.H();
    }
}
