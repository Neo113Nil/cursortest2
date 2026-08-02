package com.vk.api.generated.account.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.urd0;
import xsna.zcl;

/* compiled from: AccountToggleDto.kt */
/* loaded from: classes14.dex */
public final class AccountToggleDto implements Parcelable {
    public static final Parcelable.Creator<AccountToggleDto> CREATOR = new a();

    @pmi0("ab_group_id")
    private final Integer abGroupId;

    @pmi0("enabled")
    private final boolean enabled;

    @pmi0("experiment_id")
    private final Integer experimentId;

    @pmi0("name")
    private final String name;

    @pmi0("value")
    private final String value;

    /* compiled from: AccountToggleDto.kt */
    public static final class a implements Parcelable.Creator<AccountToggleDto> {
        @Override // android.os.Parcelable.Creator
        public final AccountToggleDto createFromParcel(Parcel parcel) {
            return new AccountToggleDto(parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final AccountToggleDto[] newArray(int i) {
            return new AccountToggleDto[i];
        }
    }

    public AccountToggleDto(boolean z, String str, String str2, Integer num, Integer num2) {
        this.enabled = z;
        this.name = str;
        this.value = str2;
        this.experimentId = num;
        this.abGroupId = num2;
    }

    public final boolean d() {
        return this.enabled;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.name;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountToggleDto)) {
            return false;
        }
        AccountToggleDto accountToggleDto = (AccountToggleDto) obj;
        return this.enabled == accountToggleDto.enabled && epx.f(this.name, accountToggleDto.name) && epx.f(this.value, accountToggleDto.value) && epx.f(this.experimentId, accountToggleDto.experimentId) && epx.f(this.abGroupId, accountToggleDto.abGroupId);
    }

    public final String f() {
        return this.value;
    }

    public final int hashCode() {
        int a2 = urd0.a(Boolean.hashCode(this.enabled) * 31, 31, this.name);
        String str = this.value;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.experimentId;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.abGroupId;
        return hashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccountToggleDto(enabled=");
        sb.append(this.enabled);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", value=");
        sb.append(this.value);
        sb.append(", experimentId=");
        sb.append(this.experimentId);
        sb.append(", abGroupId=");
        return uqi.b(sb, this.abGroupId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.enabled ? 1 : 0);
        parcel.writeString(this.name);
        parcel.writeString(this.value);
        Integer num = this.experimentId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.abGroupId;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
    }

    public /* synthetic */ AccountToggleDto(boolean z, String str, String str2, Integer num, Integer num2, int i, zcl zclVar) {
        this(z, str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : num2);
    }
}
