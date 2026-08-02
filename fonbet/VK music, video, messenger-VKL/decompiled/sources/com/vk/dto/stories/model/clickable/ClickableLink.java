package com.vk.dto.stories.model.clickable;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.core.serialize.Serializer;
import com.vk.dto.attachments.SnippetAttachment;
import com.vk.dto.stories.entities.stat.ClickableStickerStatInfo;
import com.vk.superapp.api.dto.story.WebClickablePoint;
import com.vk.superapp.api.dto.story.WebStickerType;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
import xsna.epx;
import xsna.q500;
import xsna.urd0;
import xsna.zcl;

/* compiled from: ClickableLink.kt */
/* loaded from: classes18.dex */
public final class ClickableLink extends ClickableSticker {
    public static final Serializer.c<ClickableLink> CREATOR = new a();
    public final String e;
    public final String f;
    public final String g;
    public final SnippetAttachment h;
    public final String i;
    public final Boolean j;
    public final WebStickerType k;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<ClickableLink> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ClickableLink a(Serializer serializer) {
            return new ClickableLink(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ClickableLink[i];
        }
    }

    public /* synthetic */ ClickableLink(long j, List list, q500 q500Var, String str, String str2, String str3, SnippetAttachment snippetAttachment, String str4, Boolean bool, int i, zcl zclVar) {
        this((i & 1) != 0 ? 0L : j, list, (i & 4) != 0 ? null : q500Var, str, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : snippetAttachment, str4, (i & 256) != 0 ? Boolean.FALSE : bool);
    }

    @Override // com.vk.dto.stories.model.clickable.ClickableSticker
    public final void Ab(ClickableStickerStatInfo.a aVar) {
        aVar.b(TtmlNode.TAG_STYLE, this.i);
    }

    @Override // com.vk.dto.stories.model.clickable.ClickableSticker
    public final String Bb() {
        return epx.f(this.j, Boolean.TRUE) ? "native_link" : WebStickerType.LINK.i();
    }

    @Override // com.vk.dto.stories.model.clickable.ClickableSticker
    public final WebStickerType Cb() {
        return this.k;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.Y(this.b);
        serializer.W(this.c);
        serializer.d0(this.d);
        serializer.j0(this.e);
        serializer.j0(this.f);
        serializer.j0(this.g);
        serializer.i0(this.h);
        serializer.j0(this.i);
        serializer.J(this.j);
    }

    @Override // com.vk.dto.stories.model.clickable.ClickableSticker, xsna.bxx
    public final JSONObject e5() {
        JSONObject e5 = super.e5();
        e5.put("link", this.e);
        e5.put(TtmlNode.TAG_STYLE, this.i);
        String str = this.f;
        if (str != null) {
            e5.put("tooltip_text_key", str);
        }
        return e5;
    }

    @Override // com.vk.dto.stories.model.clickable.ClickableSticker
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClickableLink) || !super.equals(obj)) {
            return false;
        }
        ClickableLink clickableLink = (ClickableLink) obj;
        return epx.f(this.e, clickableLink.e) && epx.f(this.f, clickableLink.f) && epx.f(this.g, clickableLink.g) && epx.f(this.h, clickableLink.h) && epx.f(this.i, clickableLink.i) && epx.f(this.j, clickableLink.j) && this.k == clickableLink.k;
    }

    @Override // com.vk.dto.stories.model.clickable.ClickableSticker
    public final int hashCode() {
        int a2 = urd0.a(super.hashCode() * 31, 31, this.e);
        String str = this.f;
        int hashCode = (a2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.g;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        SnippetAttachment snippetAttachment = this.h;
        int hashCode3 = (hashCode2 + (snippetAttachment != null ? snippetAttachment.hashCode() : 0)) * 31;
        String str3 = this.i;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Boolean bool = this.j;
        return this.k.hashCode() + ((hashCode4 + (bool != null ? bool.hashCode() : 0)) * 31);
    }

    public ClickableLink(long j, List<WebClickablePoint> list, q500 q500Var, String str, String str2, String str3, SnippetAttachment snippetAttachment, String str4, Boolean bool) {
        super(j, list, q500Var);
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.h = snippetAttachment;
        this.i = str4;
        this.j = bool;
        this.k = WebStickerType.LINK;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ClickableLink(Serializer serializer) {
        this(r1, r3, r4, r0 == null ? "" : r0, serializer.H(), serializer.H(), (SnippetAttachment) serializer.G(SnippetAttachment.class.getClassLoader()), serializer.H(), serializer.n());
        long w = serializer.w();
        ArrayList k = serializer.k(WebClickablePoint.class);
        ArrayList arrayList = k == null ? new ArrayList() : k;
        q500 y = serializer.y();
        String H = serializer.H();
    }
}
