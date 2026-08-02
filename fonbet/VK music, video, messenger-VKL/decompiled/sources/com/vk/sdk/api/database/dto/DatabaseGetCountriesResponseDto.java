package com.vk.sdk.api.database.dto;

import com.vk.sdk.api.base.dto.BaseCountryDto;
import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.pn;

/* compiled from: DatabaseGetCountriesResponseDto.kt */
/* loaded from: classes5.dex */
public final class DatabaseGetCountriesResponseDto {

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<BaseCountryDto> items;

    public DatabaseGetCountriesResponseDto(int i, List<BaseCountryDto> list) {
        this.count = i;
        this.items = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DatabaseGetCountriesResponseDto)) {
            return false;
        }
        DatabaseGetCountriesResponseDto databaseGetCountriesResponseDto = (DatabaseGetCountriesResponseDto) obj;
        return this.count == databaseGetCountriesResponseDto.count && epx.f(this.items, databaseGetCountriesResponseDto.items);
    }

    public final int hashCode() {
        return this.items.hashCode() + (Integer.hashCode(this.count) * 31);
    }

    public final String toString() {
        return pn.c(this.count, "DatabaseGetCountriesResponseDto(count=", ", items=", ")", this.items);
    }
}
