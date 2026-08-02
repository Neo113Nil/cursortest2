package com.vk.sdk.api.newsfeed.dto;

import com.vk.sdk.api.base.dto.BaseBoolIntDto;
import com.vk.sdk.api.wall.dto.WallWallCommentDto;
import com.vk.sdk.api.wall.dto.WallWallpostCommentsDonutDto;
import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.rq;
import xsna.to;
import xsna.zcl;

/* compiled from: NewsfeedCommentsBaseDto.kt */
/* loaded from: classes5.dex */
public final class NewsfeedCommentsBaseDto {

    @pmi0("can_close")
    private final BaseBoolIntDto canClose;

    @pmi0("can_open")
    private final BaseBoolIntDto canOpen;

    @pmi0("can_post")
    private final BaseBoolIntDto canPost;

    @pmi0("count")
    private final Integer count;

    @pmi0("donut")
    private final WallWallpostCommentsDonutDto donut;

    @pmi0("groups_can_post")
    private final Boolean groupsCanPost;

    @pmi0("list")
    private final List<WallWallCommentDto> list;

    public NewsfeedCommentsBaseDto() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedCommentsBaseDto)) {
            return false;
        }
        NewsfeedCommentsBaseDto newsfeedCommentsBaseDto = (NewsfeedCommentsBaseDto) obj;
        return epx.f(this.list, newsfeedCommentsBaseDto.list) && this.canPost == newsfeedCommentsBaseDto.canPost && this.canOpen == newsfeedCommentsBaseDto.canOpen && this.canClose == newsfeedCommentsBaseDto.canClose && epx.f(this.count, newsfeedCommentsBaseDto.count) && epx.f(this.groupsCanPost, newsfeedCommentsBaseDto.groupsCanPost) && epx.f(this.donut, newsfeedCommentsBaseDto.donut);
    }

    public final int hashCode() {
        List<WallWallCommentDto> list = this.list;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        BaseBoolIntDto baseBoolIntDto = this.canPost;
        int hashCode2 = (hashCode + (baseBoolIntDto == null ? 0 : baseBoolIntDto.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto2 = this.canOpen;
        int hashCode3 = (hashCode2 + (baseBoolIntDto2 == null ? 0 : baseBoolIntDto2.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto3 = this.canClose;
        int hashCode4 = (hashCode3 + (baseBoolIntDto3 == null ? 0 : baseBoolIntDto3.hashCode())) * 31;
        Integer num = this.count;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.groupsCanPost;
        int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        WallWallpostCommentsDonutDto wallWallpostCommentsDonutDto = this.donut;
        return hashCode6 + (wallWallpostCommentsDonutDto != null ? wallWallpostCommentsDonutDto.hashCode() : 0);
    }

    public final String toString() {
        List<WallWallCommentDto> list = this.list;
        BaseBoolIntDto baseBoolIntDto = this.canPost;
        BaseBoolIntDto baseBoolIntDto2 = this.canOpen;
        BaseBoolIntDto baseBoolIntDto3 = this.canClose;
        Integer num = this.count;
        Boolean bool = this.groupsCanPost;
        WallWallpostCommentsDonutDto wallWallpostCommentsDonutDto = this.donut;
        StringBuilder sb = new StringBuilder("NewsfeedCommentsBaseDto(list=");
        sb.append(list);
        sb.append(", canPost=");
        sb.append(baseBoolIntDto);
        sb.append(", canOpen=");
        to.b(sb, baseBoolIntDto2, ", canClose=", baseBoolIntDto3, ", count=");
        rq.h(sb, num, ", groupsCanPost=", bool, ", donut=");
        sb.append(wallWallpostCommentsDonutDto);
        sb.append(")");
        return sb.toString();
    }

    public NewsfeedCommentsBaseDto(List<WallWallCommentDto> list, BaseBoolIntDto baseBoolIntDto, BaseBoolIntDto baseBoolIntDto2, BaseBoolIntDto baseBoolIntDto3, Integer num, Boolean bool, WallWallpostCommentsDonutDto wallWallpostCommentsDonutDto) {
        this.list = list;
        this.canPost = baseBoolIntDto;
        this.canOpen = baseBoolIntDto2;
        this.canClose = baseBoolIntDto3;
        this.count = num;
        this.groupsCanPost = bool;
        this.donut = wallWallpostCommentsDonutDto;
    }

    public /* synthetic */ NewsfeedCommentsBaseDto(List list, BaseBoolIntDto baseBoolIntDto, BaseBoolIntDto baseBoolIntDto2, BaseBoolIntDto baseBoolIntDto3, Integer num, Boolean bool, WallWallpostCommentsDonutDto wallWallpostCommentsDonutDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : baseBoolIntDto, (i & 4) != 0 ? null : baseBoolIntDto2, (i & 8) != 0 ? null : baseBoolIntDto3, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : bool, (i & 64) != 0 ? null : wallWallpostCommentsDonutDto);
    }
}
