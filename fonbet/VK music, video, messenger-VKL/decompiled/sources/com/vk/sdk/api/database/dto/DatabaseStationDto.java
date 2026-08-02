package com.vk.sdk.api.database.dto;

import xsna.epx;
import xsna.kh10;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: DatabaseStationDto.kt */
/* loaded from: classes5.dex */
public final class DatabaseStationDto {

    @pmi0("city_id")
    private final Integer cityId;

    @pmi0("color")
    private final String color;

    @pmi0("id")
    private final int id;

    @pmi0("name")
    private final String name;

    public DatabaseStationDto(int i, String str, Integer num, String str2) {
        this.id = i;
        this.name = str;
        this.cityId = num;
        this.color = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DatabaseStationDto)) {
            return false;
        }
        DatabaseStationDto databaseStationDto = (DatabaseStationDto) obj;
        return this.id == databaseStationDto.id && epx.f(this.name, databaseStationDto.name) && epx.f(this.cityId, databaseStationDto.cityId) && epx.f(this.color, databaseStationDto.color);
    }

    public final int hashCode() {
        int a = urd0.a(Integer.hashCode(this.id) * 31, 31, this.name);
        Integer num = this.cityId;
        int hashCode = (a + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.color;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        int i = this.id;
        String str = this.name;
        Integer num = this.cityId;
        String str2 = this.color;
        StringBuilder a = kh10.a(i, "DatabaseStationDto(id=", ", name=", str, ", cityId=");
        a.append(num);
        a.append(", color=");
        a.append(str2);
        a.append(")");
        return a.toString();
    }

    public /* synthetic */ DatabaseStationDto(int i, String str, Integer num, String str2, int i2, zcl zclVar) {
        this(i, str, (i2 & 4) != 0 ? null : num, (i2 & 8) != 0 ? null : str2);
    }
}
