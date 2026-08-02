package com.vk.sdk.api.newsfeed.dto;

import xsna.epx;
import xsna.i5s;
import xsna.pmi0;
import xsna.xe9;
import xsna.zcl;

/* compiled from: NewsfeedItemInterestItemDto.kt */
/* loaded from: classes5.dex */
public final class NewsfeedItemInterestItemDto {

    @pmi0("emoji")
    private final String emoji;

    @pmi0("id")
    private final String id;

    @pmi0("label")
    private final String label;

    public NewsfeedItemInterestItemDto() {
        this(null, null, null, 7, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedItemInterestItemDto)) {
            return false;
        }
        NewsfeedItemInterestItemDto newsfeedItemInterestItemDto = (NewsfeedItemInterestItemDto) obj;
        return epx.f(this.id, newsfeedItemInterestItemDto.id) && epx.f(this.label, newsfeedItemInterestItemDto.label) && epx.f(this.emoji, newsfeedItemInterestItemDto.emoji);
    }

    public final int hashCode() {
        String str = this.id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.label;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.emoji;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        String str = this.id;
        String str2 = this.label;
        return i5s.a(xe9.a("NewsfeedItemInterestItemDto(id=", str, ", label=", str2, ", emoji="), this.emoji, ")");
    }

    public NewsfeedItemInterestItemDto(String str, String str2, String str3) {
        this.id = str;
        this.label = str2;
        this.emoji = str3;
    }

    public /* synthetic */ NewsfeedItemInterestItemDto(String str, String str2, String str3, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
