package com.vk.sdk.api.database.dto;

import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: DatabaseUniversityDto.kt */
/* loaded from: classes5.dex */
public final class DatabaseUniversityDto {

    @pmi0("id")
    private final Integer id;

    @pmi0("title")
    private final String title;

    /* JADX WARN: Multi-variable type inference failed */
    public DatabaseUniversityDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DatabaseUniversityDto)) {
            return false;
        }
        DatabaseUniversityDto databaseUniversityDto = (DatabaseUniversityDto) obj;
        return epx.f(this.id, databaseUniversityDto.id) && epx.f(this.title, databaseUniversityDto.title);
    }

    public final int hashCode() {
        Integer num = this.id;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.title;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "DatabaseUniversityDto(id=" + this.id + ", title=" + this.title + ")";
    }

    public DatabaseUniversityDto(Integer num, String str) {
        this.id = num;
        this.title = str;
    }

    public /* synthetic */ DatabaseUniversityDto(Integer num, String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str);
    }
}
