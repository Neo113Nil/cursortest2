package com.vk.sdk.api.newsfeed.dto;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import xsna.epx;
import xsna.pmi0;
import xsna.ss9;
import xsna.zcl;

/* compiled from: NewsfeedItemDigestButtonDto.kt */
/* loaded from: classes5.dex */
public final class NewsfeedItemDigestButtonDto {

    @pmi0(TtmlNode.TAG_STYLE)
    private final String style;

    @pmi0("title")
    private final String title;

    public NewsfeedItemDigestButtonDto(String str, String str2) {
        this.title = str;
        this.style = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedItemDigestButtonDto)) {
            return false;
        }
        NewsfeedItemDigestButtonDto newsfeedItemDigestButtonDto = (NewsfeedItemDigestButtonDto) obj;
        return epx.f(this.title, newsfeedItemDigestButtonDto.title) && epx.f(this.style, newsfeedItemDigestButtonDto.style);
    }

    public final int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        String str = this.style;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return ss9.a("NewsfeedItemDigestButtonDto(title=", this.title, ", style=", this.style, ")");
    }

    public /* synthetic */ NewsfeedItemDigestButtonDto(String str, String str2, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : str2);
    }
}
