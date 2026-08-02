package com.vk.sdk.api.wall.dto;

import xsna.epx;
import xsna.pmi0;
import xsna.zr;

/* compiled from: WallWallpostCommentsDonutPlaceholderDto.kt */
/* loaded from: classes5.dex */
public final class WallWallpostCommentsDonutPlaceholderDto {

    @pmi0("text")
    private final String text;

    public WallWallpostCommentsDonutPlaceholderDto(String str) {
        this.text = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WallWallpostCommentsDonutPlaceholderDto) && epx.f(this.text, ((WallWallpostCommentsDonutPlaceholderDto) obj).text);
    }

    public final int hashCode() {
        return this.text.hashCode();
    }

    public final String toString() {
        return zr.a("WallWallpostCommentsDonutPlaceholderDto(text=", this.text, ")");
    }
}
