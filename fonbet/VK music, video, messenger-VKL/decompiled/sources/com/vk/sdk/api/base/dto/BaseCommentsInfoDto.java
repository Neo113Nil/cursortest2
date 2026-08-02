package com.vk.sdk.api.base.dto;

import com.vk.sdk.api.wall.dto.WallWallCommentDto;
import com.vk.sdk.api.wall.dto.WallWallpostCommentsDonutDto;
import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.vp;
import xsna.zcl;

/* compiled from: BaseCommentsInfoDto.kt */
/* loaded from: classes5.dex */
public final class BaseCommentsInfoDto {

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

    public BaseCommentsInfoDto() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseCommentsInfoDto)) {
            return false;
        }
        BaseCommentsInfoDto baseCommentsInfoDto = (BaseCommentsInfoDto) obj;
        return this.canPost == baseCommentsInfoDto.canPost && this.canOpen == baseCommentsInfoDto.canOpen && this.canClose == baseCommentsInfoDto.canClose && epx.f(this.count, baseCommentsInfoDto.count) && epx.f(this.groupsCanPost, baseCommentsInfoDto.groupsCanPost) && epx.f(this.donut, baseCommentsInfoDto.donut) && epx.f(this.list, baseCommentsInfoDto.list);
    }

    public final int hashCode() {
        BaseBoolIntDto baseBoolIntDto = this.canPost;
        int hashCode = (baseBoolIntDto == null ? 0 : baseBoolIntDto.hashCode()) * 31;
        BaseBoolIntDto baseBoolIntDto2 = this.canOpen;
        int hashCode2 = (hashCode + (baseBoolIntDto2 == null ? 0 : baseBoolIntDto2.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto3 = this.canClose;
        int hashCode3 = (hashCode2 + (baseBoolIntDto3 == null ? 0 : baseBoolIntDto3.hashCode())) * 31;
        Integer num = this.count;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.groupsCanPost;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        WallWallpostCommentsDonutDto wallWallpostCommentsDonutDto = this.donut;
        int hashCode6 = (hashCode5 + (wallWallpostCommentsDonutDto == null ? 0 : wallWallpostCommentsDonutDto.hashCode())) * 31;
        List<WallWallCommentDto> list = this.list;
        return hashCode6 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        BaseBoolIntDto baseBoolIntDto = this.canPost;
        BaseBoolIntDto baseBoolIntDto2 = this.canOpen;
        BaseBoolIntDto baseBoolIntDto3 = this.canClose;
        Integer num = this.count;
        Boolean bool = this.groupsCanPost;
        WallWallpostCommentsDonutDto wallWallpostCommentsDonutDto = this.donut;
        List<WallWallCommentDto> list = this.list;
        StringBuilder sb = new StringBuilder("BaseCommentsInfoDto(canPost=");
        sb.append(baseBoolIntDto);
        sb.append(", canOpen=");
        sb.append(baseBoolIntDto2);
        sb.append(", canClose=");
        sb.append(baseBoolIntDto3);
        sb.append(", count=");
        sb.append(num);
        sb.append(", groupsCanPost=");
        sb.append(bool);
        sb.append(", donut=");
        sb.append(wallWallpostCommentsDonutDto);
        sb.append(", list=");
        return vp.b(")", sb, list);
    }

    public BaseCommentsInfoDto(BaseBoolIntDto baseBoolIntDto, BaseBoolIntDto baseBoolIntDto2, BaseBoolIntDto baseBoolIntDto3, Integer num, Boolean bool, WallWallpostCommentsDonutDto wallWallpostCommentsDonutDto, List<WallWallCommentDto> list) {
        this.canPost = baseBoolIntDto;
        this.canOpen = baseBoolIntDto2;
        this.canClose = baseBoolIntDto3;
        this.count = num;
        this.groupsCanPost = bool;
        this.donut = wallWallpostCommentsDonutDto;
        this.list = list;
    }

    public /* synthetic */ BaseCommentsInfoDto(BaseBoolIntDto baseBoolIntDto, BaseBoolIntDto baseBoolIntDto2, BaseBoolIntDto baseBoolIntDto3, Integer num, Boolean bool, WallWallpostCommentsDonutDto wallWallpostCommentsDonutDto, List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : baseBoolIntDto, (i & 2) != 0 ? null : baseBoolIntDto2, (i & 4) != 0 ? null : baseBoolIntDto3, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? null : wallWallpostCommentsDonutDto, (i & 64) != 0 ? null : list);
    }
}
