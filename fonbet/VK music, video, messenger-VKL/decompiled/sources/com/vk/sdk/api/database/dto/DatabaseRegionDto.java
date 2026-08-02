package com.vk.sdk.api.database.dto;

import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: DatabaseRegionDto.kt */
/* loaded from: classes5.dex */
public final class DatabaseRegionDto {

    @pmi0("id")
    private final Integer id;

    @pmi0("title")
    private final String title;

    /* JADX WARN: Multi-variable type inference failed */
    public DatabaseRegionDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DatabaseRegionDto)) {
            return false;
        }
        DatabaseRegionDto databaseRegionDto = (DatabaseRegionDto) obj;
        return epx.f(this.id, databaseRegionDto.id) && epx.f(this.title, databaseRegionDto.title);
    }

    public final int hashCode() {
        Integer num = this.id;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.title;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "DatabaseRegionDto(id=" + this.id + ", title=" + this.title + ")";
    }

    public DatabaseRegionDto(Integer num, String str) {
        this.id = num;
        this.title = str;
    }

    public /* synthetic */ DatabaseRegionDto(Integer num, String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str);
    }
}
