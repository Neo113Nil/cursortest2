package com.vk.api.generated.money.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.gp;
import xsna.pmi0;

/* compiled from: MoneyDebtorDto.kt */
/* loaded from: classes15.dex */
public final class MoneyDebtorDto implements Parcelable {
    public static final Parcelable.Creator<MoneyDebtorDto> CREATOR = new a();

    @pmi0("id")
    private final UserId id;

    /* compiled from: MoneyDebtorDto.kt */
    public static final class a implements Parcelable.Creator<MoneyDebtorDto> {
        @Override // android.os.Parcelable.Creator
        public final MoneyDebtorDto createFromParcel(Parcel parcel) {
            return new MoneyDebtorDto((UserId) parcel.readParcelable(MoneyDebtorDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final MoneyDebtorDto[] newArray(int i) {
            return new MoneyDebtorDto[i];
        }
    }

    public MoneyDebtorDto(UserId userId) {
        this.id = userId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MoneyDebtorDto) && epx.f(this.id, ((MoneyDebtorDto) obj).id);
    }

    public final int hashCode() {
        return Long.hashCode(this.id.b);
    }

    public final String toString() {
        return gp.b(new StringBuilder("MoneyDebtorDto(id="), this.id, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.id, i);
    }
}
