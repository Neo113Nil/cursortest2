package com.vk.sdk.api.apps.dto;

import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.pn;

/* compiled from: AppsGetLeaderboardResponseDto.kt */
/* loaded from: classes5.dex */
public final class AppsGetLeaderboardResponseDto {

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<AppsLeaderboardDto> items;

    public AppsGetLeaderboardResponseDto(int i, List<AppsLeaderboardDto> list) {
        this.count = i;
        this.items = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsGetLeaderboardResponseDto)) {
            return false;
        }
        AppsGetLeaderboardResponseDto appsGetLeaderboardResponseDto = (AppsGetLeaderboardResponseDto) obj;
        return this.count == appsGetLeaderboardResponseDto.count && epx.f(this.items, appsGetLeaderboardResponseDto.items);
    }

    public final int hashCode() {
        return this.items.hashCode() + (Integer.hashCode(this.count) * 31);
    }

    public final String toString() {
        return pn.c(this.count, "AppsGetLeaderboardResponseDto(count=", ", items=", ")", this.items);
    }
}
