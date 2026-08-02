package com.vk.sdk.api.users.dto;

import com.mbridge.msdk.MBridgeConstans;
import com.vk.push.core.analytics.AnalyticsBaseParamsConstantsKt;
import xsna.epx;
import xsna.kh10;
import xsna.pmi0;
import xsna.shy;
import xsna.urd0;
import xsna.zcl;

/* compiled from: UsersMilitaryDto.kt */
/* loaded from: classes5.dex */
public final class UsersMilitaryDto {

    @pmi0(AnalyticsBaseParamsConstantsKt.COUNTRY_ID)
    private final int countryId;

    @pmi0("from")
    private final Integer from;

    @pmi0("id")
    private final Integer id;

    @pmi0("unit")
    private final String unit;

    @pmi0(MBridgeConstans.PROPERTIES_UNIT_ID)
    private final int unitId;

    @pmi0("until")
    private final Integer until;

    public UsersMilitaryDto(int i, String str, int i2, Integer num, Integer num2, Integer num3) {
        this.countryId = i;
        this.unit = str;
        this.unitId = i2;
        this.from = num;
        this.id = num2;
        this.until = num3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UsersMilitaryDto)) {
            return false;
        }
        UsersMilitaryDto usersMilitaryDto = (UsersMilitaryDto) obj;
        return this.countryId == usersMilitaryDto.countryId && epx.f(this.unit, usersMilitaryDto.unit) && this.unitId == usersMilitaryDto.unitId && epx.f(this.from, usersMilitaryDto.from) && epx.f(this.id, usersMilitaryDto.id) && epx.f(this.until, usersMilitaryDto.until);
    }

    public final int hashCode() {
        int a = shy.a(this.unitId, urd0.a(Integer.hashCode(this.countryId) * 31, 31, this.unit), 31);
        Integer num = this.from;
        int hashCode = (a + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.id;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.until;
        return hashCode2 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        int i = this.countryId;
        String str = this.unit;
        int i2 = this.unitId;
        Integer num = this.from;
        Integer num2 = this.id;
        Integer num3 = this.until;
        StringBuilder a = kh10.a(i, "UsersMilitaryDto(countryId=", ", unit=", str, ", unitId=");
        a.append(i2);
        a.append(", from=");
        a.append(num);
        a.append(", id=");
        a.append(num2);
        a.append(", until=");
        a.append(num3);
        a.append(")");
        return a.toString();
    }

    public /* synthetic */ UsersMilitaryDto(int i, String str, int i2, Integer num, Integer num2, Integer num3, int i3, zcl zclVar) {
        this(i, str, i2, (i3 & 8) != 0 ? null : num, (i3 & 16) != 0 ? null : num2, (i3 & 32) != 0 ? null : num3);
    }
}
