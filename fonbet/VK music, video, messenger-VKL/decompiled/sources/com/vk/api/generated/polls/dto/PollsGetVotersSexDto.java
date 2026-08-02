package com.vk.api.generated.polls.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PollsGetVotersSexDto.kt */
/* loaded from: classes15.dex */
public final class PollsGetVotersSexDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ PollsGetVotersSexDto[] $VALUES;
    public static final Parcelable.Creator<PollsGetVotersSexDto> CREATOR;

    @pmi0("1")
    public static final PollsGetVotersSexDto TYPE_1;

    @pmi0("2")
    public static final PollsGetVotersSexDto TYPE_2;
    private final int value;

    /* compiled from: PollsGetVotersSexDto.kt */
    public static final class a implements Parcelable.Creator<PollsGetVotersSexDto> {
        @Override // android.os.Parcelable.Creator
        public final PollsGetVotersSexDto createFromParcel(Parcel parcel) {
            return PollsGetVotersSexDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PollsGetVotersSexDto[] newArray(int i) {
            return new PollsGetVotersSexDto[i];
        }
    }

    static {
        PollsGetVotersSexDto pollsGetVotersSexDto = new PollsGetVotersSexDto("TYPE_1", 0, 1);
        TYPE_1 = pollsGetVotersSexDto;
        PollsGetVotersSexDto pollsGetVotersSexDto2 = new PollsGetVotersSexDto("TYPE_2", 1, 2);
        TYPE_2 = pollsGetVotersSexDto2;
        PollsGetVotersSexDto[] pollsGetVotersSexDtoArr = {pollsGetVotersSexDto, pollsGetVotersSexDto2};
        $VALUES = pollsGetVotersSexDtoArr;
        $ENTRIES = new asp(pollsGetVotersSexDtoArr);
        CREATOR = new a();
    }

    private PollsGetVotersSexDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static PollsGetVotersSexDto valueOf(String str) {
        return (PollsGetVotersSexDto) Enum.valueOf(PollsGetVotersSexDto.class, str);
    }

    public static PollsGetVotersSexDto[] values() {
        return (PollsGetVotersSexDto[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int i() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
