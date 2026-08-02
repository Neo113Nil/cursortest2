package com.vk.sdk.api.database.dto;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.sdk.api.base.dto.BaseBoolIntDto;
import xsna.epx;
import xsna.kh10;
import xsna.n6j;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: DatabaseCityDto.kt */
/* loaded from: classes5.dex */
public final class DatabaseCityDto {

    @pmi0("area")
    private final String area;

    @pmi0("country")
    private final String country;

    @pmi0("id")
    private final int id;

    @pmi0("important")
    private final BaseBoolIntDto important;

    @pmi0(TtmlNode.TAG_REGION)
    private final String region;

    @pmi0("title")
    private final String title;

    public DatabaseCityDto(int i, String str, String str2, String str3, String str4, BaseBoolIntDto baseBoolIntDto) {
        this.id = i;
        this.title = str;
        this.area = str2;
        this.region = str3;
        this.country = str4;
        this.important = baseBoolIntDto;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DatabaseCityDto)) {
            return false;
        }
        DatabaseCityDto databaseCityDto = (DatabaseCityDto) obj;
        return this.id == databaseCityDto.id && epx.f(this.title, databaseCityDto.title) && epx.f(this.area, databaseCityDto.area) && epx.f(this.region, databaseCityDto.region) && epx.f(this.country, databaseCityDto.country) && this.important == databaseCityDto.important;
    }

    public final int hashCode() {
        int a = urd0.a(Integer.hashCode(this.id) * 31, 31, this.title);
        String str = this.area;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.region;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.country;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto = this.important;
        return hashCode3 + (baseBoolIntDto != null ? baseBoolIntDto.hashCode() : 0);
    }

    public final String toString() {
        int i = this.id;
        String str = this.title;
        String str2 = this.area;
        String str3 = this.region;
        String str4 = this.country;
        BaseBoolIntDto baseBoolIntDto = this.important;
        StringBuilder a = kh10.a(i, "DatabaseCityDto(id=", ", title=", str, ", area=");
        n6j.b(a, str2, ", region=", str3, ", country=");
        a.append(str4);
        a.append(", important=");
        a.append(baseBoolIntDto);
        a.append(")");
        return a.toString();
    }

    public /* synthetic */ DatabaseCityDto(int i, String str, String str2, String str3, String str4, BaseBoolIntDto baseBoolIntDto, int i2, zcl zclVar) {
        this(i, str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : str3, (i2 & 16) != 0 ? null : str4, (i2 & 32) != 0 ? null : baseBoolIntDto);
    }
}
