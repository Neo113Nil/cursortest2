package com.vk.sdk.api.base.dto;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.i5s;
import xsna.n6j;
import xsna.pmi0;
import xsna.sq;
import xsna.zcl;

/* compiled from: BaseLinkButtonDto.kt */
/* loaded from: classes5.dex */
public final class BaseLinkButtonDto {

    @pmi0("action")
    private final BaseLinkButtonActionDto action;

    @pmi0("album_id")
    private final Integer albumId;

    @pmi0("audio_id")
    private final Integer audioId;

    @pmi0("block_id")
    private final String blockId;

    @pmi0("curator_id")
    private final Integer curatorId;

    @pmi0("hashtag")
    private final String hashtag;

    @pmi0("icon")
    private final String icon;

    @pmi0("owner_id")
    private final UserId ownerId;

    @pmi0("section_id")
    private final String sectionId;

    @pmi0(TtmlNode.TAG_STYLE)
    private final BaseLinkButtonStyleDto style;

    @pmi0("title")
    private final String title;

    public BaseLinkButtonDto() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseLinkButtonDto)) {
            return false;
        }
        BaseLinkButtonDto baseLinkButtonDto = (BaseLinkButtonDto) obj;
        return epx.f(this.action, baseLinkButtonDto.action) && epx.f(this.title, baseLinkButtonDto.title) && epx.f(this.blockId, baseLinkButtonDto.blockId) && epx.f(this.sectionId, baseLinkButtonDto.sectionId) && epx.f(this.curatorId, baseLinkButtonDto.curatorId) && epx.f(this.albumId, baseLinkButtonDto.albumId) && epx.f(this.ownerId, baseLinkButtonDto.ownerId) && epx.f(this.icon, baseLinkButtonDto.icon) && this.style == baseLinkButtonDto.style && epx.f(this.audioId, baseLinkButtonDto.audioId) && epx.f(this.hashtag, baseLinkButtonDto.hashtag);
    }

    public final int hashCode() {
        BaseLinkButtonActionDto baseLinkButtonActionDto = this.action;
        int hashCode = (baseLinkButtonActionDto == null ? 0 : baseLinkButtonActionDto.hashCode()) * 31;
        String str = this.title;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.blockId;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.sectionId;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.curatorId;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.albumId;
        int hashCode6 = (hashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        UserId userId = this.ownerId;
        int hashCode7 = (hashCode6 + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        String str4 = this.icon;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        BaseLinkButtonStyleDto baseLinkButtonStyleDto = this.style;
        int hashCode9 = (hashCode8 + (baseLinkButtonStyleDto == null ? 0 : baseLinkButtonStyleDto.hashCode())) * 31;
        Integer num3 = this.audioId;
        int hashCode10 = (hashCode9 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str5 = this.hashtag;
        return hashCode10 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        BaseLinkButtonActionDto baseLinkButtonActionDto = this.action;
        String str = this.title;
        String str2 = this.blockId;
        String str3 = this.sectionId;
        Integer num = this.curatorId;
        Integer num2 = this.albumId;
        UserId userId = this.ownerId;
        String str4 = this.icon;
        BaseLinkButtonStyleDto baseLinkButtonStyleDto = this.style;
        Integer num3 = this.audioId;
        String str5 = this.hashtag;
        StringBuilder sb = new StringBuilder("BaseLinkButtonDto(action=");
        sb.append(baseLinkButtonActionDto);
        sb.append(", title=");
        sb.append(str);
        sb.append(", blockId=");
        n6j.b(sb, str2, ", sectionId=", str3, ", curatorId=");
        sq.b(sb, num, ", albumId=", num2, ", ownerId=");
        sb.append(userId);
        sb.append(", icon=");
        sb.append(str4);
        sb.append(", style=");
        sb.append(baseLinkButtonStyleDto);
        sb.append(", audioId=");
        sb.append(num3);
        sb.append(", hashtag=");
        return i5s.a(sb, str5, ")");
    }

    public BaseLinkButtonDto(BaseLinkButtonActionDto baseLinkButtonActionDto, String str, String str2, String str3, Integer num, Integer num2, UserId userId, String str4, BaseLinkButtonStyleDto baseLinkButtonStyleDto, Integer num3, String str5) {
        this.action = baseLinkButtonActionDto;
        this.title = str;
        this.blockId = str2;
        this.sectionId = str3;
        this.curatorId = num;
        this.albumId = num2;
        this.ownerId = userId;
        this.icon = str4;
        this.style = baseLinkButtonStyleDto;
        this.audioId = num3;
        this.hashtag = str5;
    }

    public /* synthetic */ BaseLinkButtonDto(BaseLinkButtonActionDto baseLinkButtonActionDto, String str, String str2, String str3, Integer num, Integer num2, UserId userId, String str4, BaseLinkButtonStyleDto baseLinkButtonStyleDto, Integer num3, String str5, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : baseLinkButtonActionDto, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : num2, (i & 64) != 0 ? null : userId, (i & 128) != 0 ? null : str4, (i & 256) != 0 ? null : baseLinkButtonStyleDto, (i & 512) != 0 ? null : num3, (i & 1024) != 0 ? null : str5);
    }
}
