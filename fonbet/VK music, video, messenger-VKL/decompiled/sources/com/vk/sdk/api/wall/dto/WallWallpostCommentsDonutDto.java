package com.vk.sdk.api.wall.dto;

import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: WallWallpostCommentsDonutDto.kt */
/* loaded from: classes5.dex */
public final class WallWallpostCommentsDonutDto {

    @pmi0("placeholder")
    private final WallWallpostCommentsDonutPlaceholderDto placeholder;

    /* JADX WARN: Multi-variable type inference failed */
    public WallWallpostCommentsDonutDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WallWallpostCommentsDonutDto) && epx.f(this.placeholder, ((WallWallpostCommentsDonutDto) obj).placeholder);
    }

    public final int hashCode() {
        WallWallpostCommentsDonutPlaceholderDto wallWallpostCommentsDonutPlaceholderDto = this.placeholder;
        if (wallWallpostCommentsDonutPlaceholderDto == null) {
            return 0;
        }
        return wallWallpostCommentsDonutPlaceholderDto.hashCode();
    }

    public final String toString() {
        return "WallWallpostCommentsDonutDto(placeholder=" + this.placeholder + ")";
    }

    public WallWallpostCommentsDonutDto(WallWallpostCommentsDonutPlaceholderDto wallWallpostCommentsDonutPlaceholderDto) {
        this.placeholder = wallWallpostCommentsDonutPlaceholderDto;
    }

    public /* synthetic */ WallWallpostCommentsDonutDto(WallWallpostCommentsDonutPlaceholderDto wallWallpostCommentsDonutPlaceholderDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : wallWallpostCommentsDonutPlaceholderDto);
    }
}
