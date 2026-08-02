package com.vk.sdk.api.newsfeed.dto;

import xsna.epx;
import xsna.pmi0;
import xsna.zr;

/* compiled from: NewsfeedInfoBlockButtonDto.kt */
/* loaded from: classes5.dex */
public final class NewsfeedInfoBlockButtonDto {

    @pmi0("text")
    private final String text;

    public NewsfeedInfoBlockButtonDto(String str) {
        this.text = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof NewsfeedInfoBlockButtonDto) && epx.f(this.text, ((NewsfeedInfoBlockButtonDto) obj).text);
    }

    public final int hashCode() {
        return this.text.hashCode();
    }

    public final String toString() {
        return zr.a("NewsfeedInfoBlockButtonDto(text=", this.text, ")");
    }
}
