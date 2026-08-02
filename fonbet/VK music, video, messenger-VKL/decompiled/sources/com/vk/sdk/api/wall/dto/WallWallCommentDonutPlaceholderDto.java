package com.vk.sdk.api.wall.dto;

import xsna.epx;
import xsna.pmi0;
import xsna.zr;

/* compiled from: WallWallCommentDonutPlaceholderDto.kt */
/* loaded from: classes5.dex */
public final class WallWallCommentDonutPlaceholderDto {

    @pmi0("text")
    private final String text;

    public WallWallCommentDonutPlaceholderDto(String str) {
        this.text = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WallWallCommentDonutPlaceholderDto) && epx.f(this.text, ((WallWallCommentDonutPlaceholderDto) obj).text);
    }

    public final int hashCode() {
        return this.text.hashCode();
    }

    public final String toString() {
        return zr.a("WallWallCommentDonutPlaceholderDto(text=", this.text, ")");
    }
}
