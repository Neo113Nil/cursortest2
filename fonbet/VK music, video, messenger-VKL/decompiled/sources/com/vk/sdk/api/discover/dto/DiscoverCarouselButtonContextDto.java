package com.vk.sdk.api.discover.dto;

import xsna.epx;
import xsna.i5s;
import xsna.kh10;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: DiscoverCarouselButtonContextDto.kt */
/* loaded from: classes5.dex */
public final class DiscoverCarouselButtonContextDto {

    @pmi0("object_id")
    private final int objectId;

    @pmi0("original_url")
    private final String originalUrl;

    @pmi0("view_url")
    private final String viewUrl;

    public DiscoverCarouselButtonContextDto(int i, String str, String str2) {
        this.objectId = i;
        this.viewUrl = str;
        this.originalUrl = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DiscoverCarouselButtonContextDto)) {
            return false;
        }
        DiscoverCarouselButtonContextDto discoverCarouselButtonContextDto = (DiscoverCarouselButtonContextDto) obj;
        return this.objectId == discoverCarouselButtonContextDto.objectId && epx.f(this.viewUrl, discoverCarouselButtonContextDto.viewUrl) && epx.f(this.originalUrl, discoverCarouselButtonContextDto.originalUrl);
    }

    public final int hashCode() {
        int a = urd0.a(Integer.hashCode(this.objectId) * 31, 31, this.viewUrl);
        String str = this.originalUrl;
        return a + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        int i = this.objectId;
        String str = this.viewUrl;
        return i5s.a(kh10.a(i, "DiscoverCarouselButtonContextDto(objectId=", ", viewUrl=", str, ", originalUrl="), this.originalUrl, ")");
    }

    public /* synthetic */ DiscoverCarouselButtonContextDto(int i, String str, String str2, int i2, zcl zclVar) {
        this(i, str, (i2 & 4) != 0 ? null : str2);
    }
}
