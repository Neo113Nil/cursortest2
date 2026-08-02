package com.vk.sdk.api.database.dto;

import com.vk.sdk.api.base.dto.BaseObjectDto;
import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.pn;

/* compiled from: DatabaseGetChairsResponseDto.kt */
/* loaded from: classes5.dex */
public final class DatabaseGetChairsResponseDto {

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<BaseObjectDto> items;

    public DatabaseGetChairsResponseDto(int i, List<BaseObjectDto> list) {
        this.count = i;
        this.items = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DatabaseGetChairsResponseDto)) {
            return false;
        }
        DatabaseGetChairsResponseDto databaseGetChairsResponseDto = (DatabaseGetChairsResponseDto) obj;
        return this.count == databaseGetChairsResponseDto.count && epx.f(this.items, databaseGetChairsResponseDto.items);
    }

    public final int hashCode() {
        return this.items.hashCode() + (Integer.hashCode(this.count) * 31);
    }

    public final String toString() {
        return pn.c(this.count, "DatabaseGetChairsResponseDto(count=", ", items=", ")", this.items);
    }
}
