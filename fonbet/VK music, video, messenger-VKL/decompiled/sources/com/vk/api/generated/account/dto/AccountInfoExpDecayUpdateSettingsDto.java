package com.vk.api.generated.account.dto;

import android.os.Parcel;
import android.os.Parcelable;
import io.reactivex.rxjava3.subjects.b;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.so;
import xsna.zcl;

/* compiled from: AccountInfoExpDecayUpdateSettingsDto.kt */
/* loaded from: classes14.dex */
public final class AccountInfoExpDecayUpdateSettingsDto implements Parcelable {
    public static final Parcelable.Creator<AccountInfoExpDecayUpdateSettingsDto> CREATOR = new a();

    @pmi0("base_period")
    private final Integer basePeriod;

    @pmi0("inactive_progression_common_ratio")
    private final Float inactiveProgressionCommonRatio;

    /* compiled from: AccountInfoExpDecayUpdateSettingsDto.kt */
    public static final class a implements Parcelable.Creator<AccountInfoExpDecayUpdateSettingsDto> {
        @Override // android.os.Parcelable.Creator
        public final AccountInfoExpDecayUpdateSettingsDto createFromParcel(Parcel parcel) {
            return new AccountInfoExpDecayUpdateSettingsDto(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Float.valueOf(parcel.readFloat()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final AccountInfoExpDecayUpdateSettingsDto[] newArray(int i) {
            return new AccountInfoExpDecayUpdateSettingsDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AccountInfoExpDecayUpdateSettingsDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountInfoExpDecayUpdateSettingsDto)) {
            return false;
        }
        AccountInfoExpDecayUpdateSettingsDto accountInfoExpDecayUpdateSettingsDto = (AccountInfoExpDecayUpdateSettingsDto) obj;
        return epx.f(this.basePeriod, accountInfoExpDecayUpdateSettingsDto.basePeriod) && epx.f(this.inactiveProgressionCommonRatio, accountInfoExpDecayUpdateSettingsDto.inactiveProgressionCommonRatio);
    }

    public final int hashCode() {
        Integer num = this.basePeriod;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Float f = this.inactiveProgressionCommonRatio;
        return hashCode + (f != null ? f.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccountInfoExpDecayUpdateSettingsDto(basePeriod=");
        sb.append(this.basePeriod);
        sb.append(", inactiveProgressionCommonRatio=");
        return so.b(sb, this.inactiveProgressionCommonRatio, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.basePeriod;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Float f = this.inactiveProgressionCommonRatio;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            b.d(parcel, 1, f);
        }
    }

    public AccountInfoExpDecayUpdateSettingsDto(Integer num, Float f) {
        this.basePeriod = num;
        this.inactiveProgressionCommonRatio = f;
    }

    public /* synthetic */ AccountInfoExpDecayUpdateSettingsDto(Integer num, Float f, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : f);
    }
}
