package com.vk.sdk.api.database.dto;

import xsna.epx;
import xsna.gq;
import xsna.pmi0;

/* compiled from: DatabaseCityByIdDto.kt */
/* loaded from: classes5.dex */
public final class DatabaseCityByIdDto {

    @pmi0("id")
    private final int id;

    @pmi0("title")
    private final String title;

    public DatabaseCityByIdDto(int i, String str) {
        this.id = i;
        this.title = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DatabaseCityByIdDto)) {
            return false;
        }
        DatabaseCityByIdDto databaseCityByIdDto = (DatabaseCityByIdDto) obj;
        return this.id == databaseCityByIdDto.id && epx.f(this.title, databaseCityByIdDto.title);
    }

    public final int hashCode() {
        return this.title.hashCode() + (Integer.hashCode(this.id) * 31);
    }

    public final String toString() {
        return gq.b(this.id, "DatabaseCityByIdDto(id=", ", title=", this.title, ")");
    }
}
