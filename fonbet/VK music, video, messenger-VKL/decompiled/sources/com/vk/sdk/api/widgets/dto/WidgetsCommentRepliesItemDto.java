package com.vk.sdk.api.widgets.dto;

import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import com.vk.sdk.api.users.dto.UsersUserFullDto;
import xsna.epx;
import xsna.pmi0;
import xsna.wr;
import xsna.zcl;

/* compiled from: WidgetsCommentRepliesItemDto.kt */
/* loaded from: classes5.dex */
public final class WidgetsCommentRepliesItemDto {

    @pmi0(BidResponsedEx.KEY_CID)
    private final Integer cid;

    @pmi0("date")
    private final Integer date;

    @pmi0("likes")
    private final WidgetsWidgetLikesDto likes;

    @pmi0("text")
    private final String text;

    @pmi0("uid")
    private final Integer uid;

    @pmi0("user")
    private final UsersUserFullDto user;

    public WidgetsCommentRepliesItemDto() {
        this(null, null, null, null, null, null, 63, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WidgetsCommentRepliesItemDto)) {
            return false;
        }
        WidgetsCommentRepliesItemDto widgetsCommentRepliesItemDto = (WidgetsCommentRepliesItemDto) obj;
        return epx.f(this.cid, widgetsCommentRepliesItemDto.cid) && epx.f(this.date, widgetsCommentRepliesItemDto.date) && epx.f(this.likes, widgetsCommentRepliesItemDto.likes) && epx.f(this.text, widgetsCommentRepliesItemDto.text) && epx.f(this.uid, widgetsCommentRepliesItemDto.uid) && epx.f(this.user, widgetsCommentRepliesItemDto.user);
    }

    public final int hashCode() {
        Integer num = this.cid;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.date;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        WidgetsWidgetLikesDto widgetsWidgetLikesDto = this.likes;
        int hashCode3 = (hashCode2 + (widgetsWidgetLikesDto == null ? 0 : widgetsWidgetLikesDto.hashCode())) * 31;
        String str = this.text;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num3 = this.uid;
        int hashCode5 = (hashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        UsersUserFullDto usersUserFullDto = this.user;
        return hashCode5 + (usersUserFullDto != null ? usersUserFullDto.hashCode() : 0);
    }

    public final String toString() {
        Integer num = this.cid;
        Integer num2 = this.date;
        WidgetsWidgetLikesDto widgetsWidgetLikesDto = this.likes;
        String str = this.text;
        Integer num3 = this.uid;
        UsersUserFullDto usersUserFullDto = this.user;
        StringBuilder a = wr.a(num, "WidgetsCommentRepliesItemDto(cid=", num2, ", date=", ", likes=");
        a.append(widgetsWidgetLikesDto);
        a.append(", text=");
        a.append(str);
        a.append(", uid=");
        a.append(num3);
        a.append(", user=");
        a.append(usersUserFullDto);
        a.append(")");
        return a.toString();
    }

    public WidgetsCommentRepliesItemDto(Integer num, Integer num2, WidgetsWidgetLikesDto widgetsWidgetLikesDto, String str, Integer num3, UsersUserFullDto usersUserFullDto) {
        this.cid = num;
        this.date = num2;
        this.likes = widgetsWidgetLikesDto;
        this.text = str;
        this.uid = num3;
        this.user = usersUserFullDto;
    }

    public /* synthetic */ WidgetsCommentRepliesItemDto(Integer num, Integer num2, WidgetsWidgetLikesDto widgetsWidgetLikesDto, String str, Integer num3, UsersUserFullDto usersUserFullDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : widgetsWidgetLikesDto, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : num3, (i & 32) != 0 ? null : usersUserFullDto);
    }
}
