package com.vk.sdk.api.wall.dto;

import xsna.epx;
import xsna.pmi0;
import xsna.zr;

/* compiled from: WallWallpostDonutPlaceholderDto.kt */
/* loaded from: classes5.dex */
public final class WallWallpostDonutPlaceholderDto {

    @pmi0("text")
    private final String text;

    public WallWallpostDonutPlaceholderDto(String str) {
        this.text = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WallWallpostDonutPlaceholderDto) && epx.f(this.text, ((WallWallpostDonutPlaceholderDto) obj).text);
    }

    public final int hashCode() {
        return this.text.hashCode();
    }

    public final String toString() {
        return zr.a("WallWallpostDonutPlaceholderDto(text=", this.text, ")");
    }
}
