package com.vk.sdk.api.wall.dto;

import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: WallWallCommentDonutDto.kt */
/* loaded from: classes5.dex */
public final class WallWallCommentDonutDto {

    @pmi0("is_don")
    private final Boolean isDon;

    @pmi0("placeholder")
    private final WallWallCommentDonutPlaceholderDto placeholder;

    /* JADX WARN: Multi-variable type inference failed */
    public WallWallCommentDonutDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WallWallCommentDonutDto)) {
            return false;
        }
        WallWallCommentDonutDto wallWallCommentDonutDto = (WallWallCommentDonutDto) obj;
        return epx.f(this.isDon, wallWallCommentDonutDto.isDon) && epx.f(this.placeholder, wallWallCommentDonutDto.placeholder);
    }

    public final int hashCode() {
        Boolean bool = this.isDon;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        WallWallCommentDonutPlaceholderDto wallWallCommentDonutPlaceholderDto = this.placeholder;
        return hashCode + (wallWallCommentDonutPlaceholderDto != null ? wallWallCommentDonutPlaceholderDto.hashCode() : 0);
    }

    public final String toString() {
        return "WallWallCommentDonutDto(isDon=" + this.isDon + ", placeholder=" + this.placeholder + ")";
    }

    public WallWallCommentDonutDto(Boolean bool, WallWallCommentDonutPlaceholderDto wallWallCommentDonutPlaceholderDto) {
        this.isDon = bool;
        this.placeholder = wallWallCommentDonutPlaceholderDto;
    }

    public /* synthetic */ WallWallCommentDonutDto(Boolean bool, WallWallCommentDonutPlaceholderDto wallWallCommentDonutPlaceholderDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : wallWallCommentDonutPlaceholderDto);
    }
}
