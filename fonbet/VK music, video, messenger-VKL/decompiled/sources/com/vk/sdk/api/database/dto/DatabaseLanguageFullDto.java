package com.vk.sdk.api.database.dto;

import xsna.epx;
import xsna.gq;
import xsna.pmi0;

/* compiled from: DatabaseLanguageFullDto.kt */
/* loaded from: classes5.dex */
public final class DatabaseLanguageFullDto {

    @pmi0("id")
    private final int id;

    @pmi0("native_name")
    private final String nativeName;

    public DatabaseLanguageFullDto(int i, String str) {
        this.id = i;
        this.nativeName = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DatabaseLanguageFullDto)) {
            return false;
        }
        DatabaseLanguageFullDto databaseLanguageFullDto = (DatabaseLanguageFullDto) obj;
        return this.id == databaseLanguageFullDto.id && epx.f(this.nativeName, databaseLanguageFullDto.nativeName);
    }

    public final int hashCode() {
        return this.nativeName.hashCode() + (Integer.hashCode(this.id) * 31);
    }

    public final String toString() {
        return gq.b(this.id, "DatabaseLanguageFullDto(id=", ", nativeName=", this.nativeName, ")");
    }
}
