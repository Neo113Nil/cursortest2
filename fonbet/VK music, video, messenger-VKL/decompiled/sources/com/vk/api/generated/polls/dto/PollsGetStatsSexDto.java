package com.vk.api.generated.polls.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PollsGetStatsSexDto.kt */
/* loaded from: classes15.dex */
public final class PollsGetStatsSexDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ PollsGetStatsSexDto[] $VALUES;
    public static final Parcelable.Creator<PollsGetStatsSexDto> CREATOR;

    @pmi0("1")
    public static final PollsGetStatsSexDto TYPE_1;

    @pmi0("2")
    public static final PollsGetStatsSexDto TYPE_2;
    private final int value;

    /* compiled from: PollsGetStatsSexDto.kt */
    public static final class a implements Parcelable.Creator<PollsGetStatsSexDto> {
        @Override // android.os.Parcelable.Creator
        public final PollsGetStatsSexDto createFromParcel(Parcel parcel) {
            return PollsGetStatsSexDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PollsGetStatsSexDto[] newArray(int i) {
            return new PollsGetStatsSexDto[i];
        }
    }

    static {
        PollsGetStatsSexDto pollsGetStatsSexDto = new PollsGetStatsSexDto("TYPE_1", 0, 1);
        TYPE_1 = pollsGetStatsSexDto;
        PollsGetStatsSexDto pollsGetStatsSexDto2 = new PollsGetStatsSexDto("TYPE_2", 1, 2);
        TYPE_2 = pollsGetStatsSexDto2;
        PollsGetStatsSexDto[] pollsGetStatsSexDtoArr = {pollsGetStatsSexDto, pollsGetStatsSexDto2};
        $VALUES = pollsGetStatsSexDtoArr;
        $ENTRIES = new asp(pollsGetStatsSexDtoArr);
        CREATOR = new a();
    }

    private PollsGetStatsSexDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static PollsGetStatsSexDto valueOf(String str) {
        return (PollsGetStatsSexDto) Enum.valueOf(PollsGetStatsSexDto.class, str);
    }

    public static PollsGetStatsSexDto[] values() {
        return (PollsGetStatsSexDto[]) $VALUES.clone();
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
