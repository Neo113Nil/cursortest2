package com.vk.sdk.api.base.dto;

import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import xsna.epx;
import xsna.i5s;
import xsna.jq;
import xsna.mq;
import xsna.n6j;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: BasePlaceDto.kt */
/* loaded from: classes5.dex */
public final class BasePlaceDto {

    @pmi0(RTCStatsConstants.KEY_ADDRESS)
    private final String address;

    @pmi0("checkins")
    private final Integer checkins;

    @pmi0("city")
    private final String city;

    @pmi0("country")
    private final String country;

    @pmi0("created")
    private final Integer created;

    @pmi0("icon")
    private final String icon;

    @pmi0("id")
    private final Integer id;

    @pmi0("latitude")
    private final Float latitude;

    @pmi0("longitude")
    private final Float longitude;

    @pmi0("title")
    private final String title;

    @pmi0("type")
    private final String type;

    public BasePlaceDto() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BasePlaceDto)) {
            return false;
        }
        BasePlaceDto basePlaceDto = (BasePlaceDto) obj;
        return epx.f(this.address, basePlaceDto.address) && epx.f(this.checkins, basePlaceDto.checkins) && epx.f(this.city, basePlaceDto.city) && epx.f(this.country, basePlaceDto.country) && epx.f(this.created, basePlaceDto.created) && epx.f(this.icon, basePlaceDto.icon) && epx.f(this.id, basePlaceDto.id) && epx.f(this.latitude, basePlaceDto.latitude) && epx.f(this.longitude, basePlaceDto.longitude) && epx.f(this.title, basePlaceDto.title) && epx.f(this.type, basePlaceDto.type);
    }

    public final int hashCode() {
        String str = this.address;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.checkins;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.city;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.country;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num2 = this.created;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str4 = this.icon;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num3 = this.id;
        int hashCode7 = (hashCode6 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Float f = this.latitude;
        int hashCode8 = (hashCode7 + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.longitude;
        int hashCode9 = (hashCode8 + (f2 == null ? 0 : f2.hashCode())) * 31;
        String str5 = this.title;
        int hashCode10 = (hashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.type;
        return hashCode10 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        String str = this.address;
        Integer num = this.checkins;
        String str2 = this.city;
        String str3 = this.country;
        Integer num2 = this.created;
        String str4 = this.icon;
        Integer num3 = this.id;
        Float f = this.latitude;
        Float f2 = this.longitude;
        String str5 = this.title;
        String str6 = this.type;
        StringBuilder d = jq.d(num, "BasePlaceDto(address=", str, ", checkins=", ", city=");
        n6j.b(d, str2, ", country=", str3, ", created=");
        mq.b(num2, ", icon=", str4, ", id=", d);
        d.append(num3);
        d.append(", latitude=");
        d.append(f);
        d.append(", longitude=");
        d.append(f2);
        d.append(", title=");
        d.append(str5);
        d.append(", type=");
        return i5s.a(d, str6, ")");
    }

    public BasePlaceDto(String str, Integer num, String str2, String str3, Integer num2, String str4, Integer num3, Float f, Float f2, String str5, String str6) {
        this.address = str;
        this.checkins = num;
        this.city = str2;
        this.country = str3;
        this.created = num2;
        this.icon = str4;
        this.id = num3;
        this.latitude = f;
        this.longitude = f2;
        this.title = str5;
        this.type = str6;
    }

    public /* synthetic */ BasePlaceDto(String str, Integer num, String str2, String str3, Integer num2, String str4, Integer num3, Float f, Float f2, String str5, String str6, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : num2, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : num3, (i & 128) != 0 ? null : f, (i & 256) != 0 ? null : f2, (i & 512) != 0 ? null : str5, (i & 1024) != 0 ? null : str6);
    }
}
