package com.vk.sdk.api.newsfeed.dto;

import xsna.epx;
import xsna.pmi0;
import xsna.ss9;
import xsna.zcl;

/* compiled from: NewsfeedNewsfeedItemColorDto.kt */
/* loaded from: classes5.dex */
public final class NewsfeedNewsfeedItemColorDto {

    @pmi0("dark")
    private final String dark;

    @pmi0("light")
    private final String light;

    /* JADX WARN: Multi-variable type inference failed */
    public NewsfeedNewsfeedItemColorDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedNewsfeedItemColorDto)) {
            return false;
        }
        NewsfeedNewsfeedItemColorDto newsfeedNewsfeedItemColorDto = (NewsfeedNewsfeedItemColorDto) obj;
        return epx.f(this.light, newsfeedNewsfeedItemColorDto.light) && epx.f(this.dark, newsfeedNewsfeedItemColorDto.dark);
    }

    public final int hashCode() {
        String str = this.light;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.dark;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return ss9.a("NewsfeedNewsfeedItemColorDto(light=", this.light, ", dark=", this.dark, ")");
    }

    public NewsfeedNewsfeedItemColorDto(String str, String str2) {
        this.light = str;
        this.dark = str2;
    }

    public /* synthetic */ NewsfeedNewsfeedItemColorDto(String str, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
