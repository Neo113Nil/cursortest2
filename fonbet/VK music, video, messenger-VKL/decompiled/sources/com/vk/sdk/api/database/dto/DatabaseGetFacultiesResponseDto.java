package com.vk.sdk.api.database.dto;

import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.pn;

/* compiled from: DatabaseGetFacultiesResponseDto.kt */
/* loaded from: classes5.dex */
public final class DatabaseGetFacultiesResponseDto {

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<DatabaseFacultyDto> items;

    public DatabaseGetFacultiesResponseDto(int i, List<DatabaseFacultyDto> list) {
        this.count = i;
        this.items = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DatabaseGetFacultiesResponseDto)) {
            return false;
        }
        DatabaseGetFacultiesResponseDto databaseGetFacultiesResponseDto = (DatabaseGetFacultiesResponseDto) obj;
        return this.count == databaseGetFacultiesResponseDto.count && epx.f(this.items, databaseGetFacultiesResponseDto.items);
    }

    public final int hashCode() {
        return this.items.hashCode() + (Integer.hashCode(this.count) * 31);
    }

    public final String toString() {
        return pn.c(this.count, "DatabaseGetFacultiesResponseDto(count=", ", items=", ")", this.items);
    }
}
