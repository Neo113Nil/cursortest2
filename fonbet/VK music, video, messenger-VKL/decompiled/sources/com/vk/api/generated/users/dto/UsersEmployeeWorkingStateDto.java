package com.vk.api.generated.users.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.shy;
import xsna.vu5;
import xsna.zrp;

/* compiled from: UsersEmployeeWorkingStateDto.kt */
/* loaded from: classes15.dex */
public final class UsersEmployeeWorkingStateDto implements Parcelable {
    public static final Parcelable.Creator<UsersEmployeeWorkingStateDto> CREATOR = new a();

    @pmi0("state")
    private final StateDto state;

    @pmi0("ts_from")
    private final int tsFrom;

    @pmi0("ts_to")
    private final int tsTo;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: UsersEmployeeWorkingStateDto.kt */
    public static final class StateDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ StateDto[] $VALUES;

        @pmi0("business_trip")
        public static final StateDto BUSINESS_TRIP;
        public static final Parcelable.Creator<StateDto> CREATOR;

        @pmi0("vacation")
        public static final StateDto VACATION;
        private final String value;

        /* compiled from: UsersEmployeeWorkingStateDto.kt */
        public static final class a implements Parcelable.Creator<StateDto> {
            @Override // android.os.Parcelable.Creator
            public final StateDto createFromParcel(Parcel parcel) {
                return StateDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final StateDto[] newArray(int i) {
                return new StateDto[i];
            }
        }

        static {
            StateDto stateDto = new StateDto("VACATION", 0, "vacation");
            VACATION = stateDto;
            StateDto stateDto2 = new StateDto("BUSINESS_TRIP", 1, "business_trip");
            BUSINESS_TRIP = stateDto2;
            StateDto[] stateDtoArr = {stateDto, stateDto2};
            $VALUES = stateDtoArr;
            $ENTRIES = new asp(stateDtoArr);
            CREATOR = new a();
        }

        private StateDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static StateDto valueOf(String str) {
            return (StateDto) Enum.valueOf(StateDto.class, str);
        }

        public static StateDto[] values() {
            return (StateDto[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* compiled from: UsersEmployeeWorkingStateDto.kt */
    public static final class a implements Parcelable.Creator<UsersEmployeeWorkingStateDto> {
        @Override // android.os.Parcelable.Creator
        public final UsersEmployeeWorkingStateDto createFromParcel(Parcel parcel) {
            return new UsersEmployeeWorkingStateDto(StateDto.CREATOR.createFromParcel(parcel), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final UsersEmployeeWorkingStateDto[] newArray(int i) {
            return new UsersEmployeeWorkingStateDto[i];
        }
    }

    public UsersEmployeeWorkingStateDto(StateDto stateDto, int i, int i2) {
        this.state = stateDto;
        this.tsFrom = i;
        this.tsTo = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UsersEmployeeWorkingStateDto)) {
            return false;
        }
        UsersEmployeeWorkingStateDto usersEmployeeWorkingStateDto = (UsersEmployeeWorkingStateDto) obj;
        return this.state == usersEmployeeWorkingStateDto.state && this.tsFrom == usersEmployeeWorkingStateDto.tsFrom && this.tsTo == usersEmployeeWorkingStateDto.tsTo;
    }

    public final int hashCode() {
        return Integer.hashCode(this.tsTo) + shy.a(this.tsFrom, this.state.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UsersEmployeeWorkingStateDto(state=");
        sb.append(this.state);
        sb.append(", tsFrom=");
        sb.append(this.tsFrom);
        sb.append(", tsTo=");
        return vu5.b(sb, this.tsTo, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.state.writeToParcel(parcel, i);
        parcel.writeInt(this.tsFrom);
        parcel.writeInt(this.tsTo);
    }
}
