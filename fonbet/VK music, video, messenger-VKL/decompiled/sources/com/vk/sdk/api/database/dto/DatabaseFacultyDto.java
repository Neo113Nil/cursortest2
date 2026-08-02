package com.vk.sdk.api.database.dto;

import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: DatabaseFacultyDto.kt */
/* loaded from: classes5.dex */
public final class DatabaseFacultyDto {

    @pmi0("id")
    private final Integer id;

    @pmi0("title")
    private final String title;

    /* JADX WARN: Multi-variable type inference failed */
    public DatabaseFacultyDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DatabaseFacultyDto)) {
            return false;
        }
        DatabaseFacultyDto databaseFacultyDto = (DatabaseFacultyDto) obj;
        return epx.f(this.id, databaseFacultyDto.id) && epx.f(this.title, databaseFacultyDto.title);
    }

    public final int hashCode() {
        Integer num = this.id;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.title;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "DatabaseFacultyDto(id=" + this.id + ", title=" + this.title + ")";
    }

    public DatabaseFacultyDto(Integer num, String str) {
        this.id = num;
        this.title = str;
    }

    public /* synthetic */ DatabaseFacultyDto(Integer num, String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str);
    }
}
