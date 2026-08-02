package com.vk.api.generated.users.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.MBridgeConstans;
import com.vk.push.core.analytics.AnalyticsBaseParamsConstantsKt;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.shy;
import xsna.uqi;
import xsna.urd0;
import xsna.zcl;

/* compiled from: UsersMilitaryDto.kt */
/* loaded from: classes15.dex */
public final class UsersMilitaryDto implements Parcelable {
    public static final Parcelable.Creator<UsersMilitaryDto> CREATOR = new a();

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

    /* compiled from: UsersMilitaryDto.kt */
    public static final class a implements Parcelable.Creator<UsersMilitaryDto> {
        @Override // android.os.Parcelable.Creator
        public final UsersMilitaryDto createFromParcel(Parcel parcel) {
            return new UsersMilitaryDto(parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final UsersMilitaryDto[] newArray(int i) {
            return new UsersMilitaryDto[i];
        }
    }

    public UsersMilitaryDto(int i, String str, int i2, Integer num, Integer num2, Integer num3) {
        this.countryId = i;
        this.unit = str;
        this.unitId = i2;
        this.from = num;
        this.id = num2;
        this.until = num3;
    }

    public final int d() {
        return this.countryId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Integer e() {
        return this.from;
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

    public final String f() {
        return this.unit;
    }

    public final Integer g() {
        return this.until;
    }

    public final int hashCode() {
        int a2 = shy.a(this.unitId, urd0.a(Integer.hashCode(this.countryId) * 31, 31, this.unit), 31);
        Integer num = this.from;
        int hashCode = (a2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.id;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.until;
        return hashCode2 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UsersMilitaryDto(countryId=");
        sb.append(this.countryId);
        sb.append(", unit=");
        sb.append(this.unit);
        sb.append(", unitId=");
        sb.append(this.unitId);
        sb.append(", from=");
        sb.append(this.from);
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", until=");
        return uqi.b(sb, this.until, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.countryId);
        parcel.writeString(this.unit);
        parcel.writeInt(this.unitId);
        Integer num = this.from;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.id;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        Integer num3 = this.until;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
    }

    public /* synthetic */ UsersMilitaryDto(int i, String str, int i2, Integer num, Integer num2, Integer num3, int i3, zcl zclVar) {
        this(i, str, i2, (i3 & 8) != 0 ? null : num, (i3 & 16) != 0 ? null : num2, (i3 & 32) != 0 ? null : num3);
    }
}
