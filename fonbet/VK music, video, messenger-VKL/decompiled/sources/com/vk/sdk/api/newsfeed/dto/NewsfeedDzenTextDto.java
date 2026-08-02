package com.vk.sdk.api.newsfeed.dto;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import xsna.epx;
import xsna.pmi0;
import xsna.xe9;
import xsna.xq;
import xsna.zcl;

/* compiled from: NewsfeedDzenTextDto.kt */
/* loaded from: classes5.dex */
public final class NewsfeedDzenTextDto {

    @pmi0(TtmlNode.BOLD)
    private final Boolean bold;

    @pmi0("text")
    private final String text;

    @pmi0("text_size")
    private final String textSize;

    public NewsfeedDzenTextDto(String str, String str2, Boolean bool) {
        this.text = str;
        this.textSize = str2;
        this.bold = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedDzenTextDto)) {
            return false;
        }
        NewsfeedDzenTextDto newsfeedDzenTextDto = (NewsfeedDzenTextDto) obj;
        return epx.f(this.text, newsfeedDzenTextDto.text) && epx.f(this.textSize, newsfeedDzenTextDto.textSize) && epx.f(this.bold, newsfeedDzenTextDto.bold);
    }

    public final int hashCode() {
        int hashCode = this.text.hashCode() * 31;
        String str = this.textSize;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.bold;
        return hashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        String str = this.text;
        String str2 = this.textSize;
        return xq.d(xe9.a("NewsfeedDzenTextDto(text=", str, ", textSize=", str2, ", bold="), this.bold, ")");
    }

    public /* synthetic */ NewsfeedDzenTextDto(String str, String str2, Boolean bool, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : bool);
    }
}
