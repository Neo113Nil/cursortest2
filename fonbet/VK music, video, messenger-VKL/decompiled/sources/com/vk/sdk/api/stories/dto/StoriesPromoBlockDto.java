package com.vk.sdk.api.stories.dto;

import xsna.epx;
import xsna.n23;
import xsna.pmi0;
import xsna.qoy;
import xsna.urd0;
import xsna.xe9;

/* compiled from: StoriesPromoBlockDto.kt */
/* loaded from: classes5.dex */
public final class StoriesPromoBlockDto {

    @pmi0("is_advice")
    private final boolean isAdvice;

    @pmi0("name")
    private final String name;

    @pmi0("not_animated")
    private final boolean notAnimated;

    @pmi0("photo_100")
    private final String photo100;

    @pmi0("photo_50")
    private final String photo50;

    public StoriesPromoBlockDto(String str, String str2, String str3, boolean z, boolean z2) {
        this.name = str;
        this.photo50 = str2;
        this.photo100 = str3;
        this.notAnimated = z;
        this.isAdvice = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoriesPromoBlockDto)) {
            return false;
        }
        StoriesPromoBlockDto storiesPromoBlockDto = (StoriesPromoBlockDto) obj;
        return epx.f(this.name, storiesPromoBlockDto.name) && epx.f(this.photo50, storiesPromoBlockDto.photo50) && epx.f(this.photo100, storiesPromoBlockDto.photo100) && this.notAnimated == storiesPromoBlockDto.notAnimated && this.isAdvice == storiesPromoBlockDto.isAdvice;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isAdvice) + qoy.b(urd0.a(urd0.a(this.name.hashCode() * 31, 31, this.photo50), 31, this.photo100), 31, this.notAnimated);
    }

    public final String toString() {
        String str = this.name;
        String str2 = this.photo50;
        String str3 = this.photo100;
        boolean z = this.notAnimated;
        boolean z2 = this.isAdvice;
        StringBuilder a = xe9.a("StoriesPromoBlockDto(name=", str, ", photo50=", str2, ", photo100=");
        a.append(str3);
        a.append(", notAnimated=");
        a.append(z);
        a.append(", isAdvice=");
        return n23.b(a, z2, ")");
    }
}
