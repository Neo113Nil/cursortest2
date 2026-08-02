package com.vk.sdk.api.database.dto;

import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.pn;

/* compiled from: DatabaseGetRegionsResponseDto.kt */
/* loaded from: classes5.dex */
public final class DatabaseGetRegionsResponseDto {

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<DatabaseRegionDto> items;

    public DatabaseGetRegionsResponseDto(int i, List<DatabaseRegionDto> list) {
        this.count = i;
        this.items = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DatabaseGetRegionsResponseDto)) {
            return false;
        }
        DatabaseGetRegionsResponseDto databaseGetRegionsResponseDto = (DatabaseGetRegionsResponseDto) obj;
        return this.count == databaseGetRegionsResponseDto.count && epx.f(this.items, databaseGetRegionsResponseDto.items);
    }

    public final int hashCode() {
        return this.items.hashCode() + (Integer.hashCode(this.count) * 31);
    }

    public final String toString() {
        return pn.c(this.count, "DatabaseGetRegionsResponseDto(count=", ", items=", ")", this.items);
    }
}
