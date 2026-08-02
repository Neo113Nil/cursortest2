package com.vk.api.generated.polls.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PollsGetVotersAgeDto.kt */
/* loaded from: classes15.dex */
public final class PollsGetVotersAgeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ PollsGetVotersAgeDto[] $VALUES;
    public static final Parcelable.Creator<PollsGetVotersAgeDto> CREATOR;

    @pmi0("1")
    public static final PollsGetVotersAgeDto TYPE_1;

    @pmi0("2")
    public static final PollsGetVotersAgeDto TYPE_2;

    @pmi0("3")
    public static final PollsGetVotersAgeDto TYPE_3;
    private final int value;

    /* compiled from: PollsGetVotersAgeDto.kt */
    public static final class a implements Parcelable.Creator<PollsGetVotersAgeDto> {
        @Override // android.os.Parcelable.Creator
        public final PollsGetVotersAgeDto createFromParcel(Parcel parcel) {
            return PollsGetVotersAgeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PollsGetVotersAgeDto[] newArray(int i) {
            return new PollsGetVotersAgeDto[i];
        }
    }

    static {
        PollsGetVotersAgeDto pollsGetVotersAgeDto = new PollsGetVotersAgeDto("TYPE_1", 0, 1);
        TYPE_1 = pollsGetVotersAgeDto;
        PollsGetVotersAgeDto pollsGetVotersAgeDto2 = new PollsGetVotersAgeDto("TYPE_2", 1, 2);
        TYPE_2 = pollsGetVotersAgeDto2;
        PollsGetVotersAgeDto pollsGetVotersAgeDto3 = new PollsGetVotersAgeDto("TYPE_3", 2, 3);
        TYPE_3 = pollsGetVotersAgeDto3;
        PollsGetVotersAgeDto[] pollsGetVotersAgeDtoArr = {pollsGetVotersAgeDto, pollsGetVotersAgeDto2, pollsGetVotersAgeDto3};
        $VALUES = pollsGetVotersAgeDtoArr;
        $ENTRIES = new asp(pollsGetVotersAgeDtoArr);
        CREATOR = new a();
    }

    private PollsGetVotersAgeDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static PollsGetVotersAgeDto valueOf(String str) {
        return (PollsGetVotersAgeDto) Enum.valueOf(PollsGetVotersAgeDto.class, str);
    }

    public static PollsGetVotersAgeDto[] values() {
        return (PollsGetVotersAgeDto[]) $VALUES.clone();
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
