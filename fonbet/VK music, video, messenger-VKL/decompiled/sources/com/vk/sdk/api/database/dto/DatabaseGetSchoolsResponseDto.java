package com.vk.sdk.api.database.dto;

import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.pn;

/* compiled from: DatabaseGetSchoolsResponseDto.kt */
/* loaded from: classes5.dex */
public final class DatabaseGetSchoolsResponseDto {

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<DatabaseSchoolDto> items;

    public DatabaseGetSchoolsResponseDto(int i, List<DatabaseSchoolDto> list) {
        this.count = i;
        this.items = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DatabaseGetSchoolsResponseDto)) {
            return false;
        }
        DatabaseGetSchoolsResponseDto databaseGetSchoolsResponseDto = (DatabaseGetSchoolsResponseDto) obj;
        return this.count == databaseGetSchoolsResponseDto.count && epx.f(this.items, databaseGetSchoolsResponseDto.items);
    }

    public final int hashCode() {
        return this.items.hashCode() + (Integer.hashCode(this.count) * 31);
    }

    public final String toString() {
        return pn.c(this.count, "DatabaseGetSchoolsResponseDto(count=", ", items=", ")", this.items);
    }
}
