package com.vk.sdk.api.ads.dto;

import xsna.epx;
import xsna.pmi0;
import xsna.ss9;
import xsna.zcl;

/* compiled from: AdsStoryItemStatsUrlViewDto.kt */
/* loaded from: classes5.dex */
public final class AdsStoryItemStatsUrlViewDto {

    @pmi0("event_type")
    private final String eventType;

    @pmi0("rhash")
    private final String rhash;

    /* JADX WARN: Multi-variable type inference failed */
    public AdsStoryItemStatsUrlViewDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdsStoryItemStatsUrlViewDto)) {
            return false;
        }
        AdsStoryItemStatsUrlViewDto adsStoryItemStatsUrlViewDto = (AdsStoryItemStatsUrlViewDto) obj;
        return epx.f(this.eventType, adsStoryItemStatsUrlViewDto.eventType) && epx.f(this.rhash, adsStoryItemStatsUrlViewDto.rhash);
    }

    public final int hashCode() {
        String str = this.eventType;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.rhash;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return ss9.a("AdsStoryItemStatsUrlViewDto(eventType=", this.eventType, ", rhash=", this.rhash, ")");
    }

    public AdsStoryItemStatsUrlViewDto(String str, String str2) {
        this.eventType = str;
        this.rhash = str2;
    }

    public /* synthetic */ AdsStoryItemStatsUrlViewDto(String str, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
