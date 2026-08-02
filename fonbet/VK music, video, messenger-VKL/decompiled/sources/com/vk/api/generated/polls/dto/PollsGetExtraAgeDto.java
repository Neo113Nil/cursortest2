package com.vk.api.generated.polls.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PollsGetExtraAgeDto.kt */
/* loaded from: classes15.dex */
public final class PollsGetExtraAgeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ PollsGetExtraAgeDto[] $VALUES;
    public static final Parcelable.Creator<PollsGetExtraAgeDto> CREATOR;

    @pmi0("1")
    public static final PollsGetExtraAgeDto TYPE_1;

    @pmi0("2")
    public static final PollsGetExtraAgeDto TYPE_2;

    @pmi0("3")
    public static final PollsGetExtraAgeDto TYPE_3;
    private final int value;

    /* compiled from: PollsGetExtraAgeDto.kt */
    public static final class a implements Parcelable.Creator<PollsGetExtraAgeDto> {
        @Override // android.os.Parcelable.Creator
        public final PollsGetExtraAgeDto createFromParcel(Parcel parcel) {
            return PollsGetExtraAgeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PollsGetExtraAgeDto[] newArray(int i) {
            return new PollsGetExtraAgeDto[i];
        }
    }

    static {
        PollsGetExtraAgeDto pollsGetExtraAgeDto = new PollsGetExtraAgeDto("TYPE_1", 0, 1);
        TYPE_1 = pollsGetExtraAgeDto;
        PollsGetExtraAgeDto pollsGetExtraAgeDto2 = new PollsGetExtraAgeDto("TYPE_2", 1, 2);
        TYPE_2 = pollsGetExtraAgeDto2;
        PollsGetExtraAgeDto pollsGetExtraAgeDto3 = new PollsGetExtraAgeDto("TYPE_3", 2, 3);
        TYPE_3 = pollsGetExtraAgeDto3;
        PollsGetExtraAgeDto[] pollsGetExtraAgeDtoArr = {pollsGetExtraAgeDto, pollsGetExtraAgeDto2, pollsGetExtraAgeDto3};
        $VALUES = pollsGetExtraAgeDtoArr;
        $ENTRIES = new asp(pollsGetExtraAgeDtoArr);
        CREATOR = new a();
    }

    private PollsGetExtraAgeDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static PollsGetExtraAgeDto valueOf(String str) {
        return (PollsGetExtraAgeDto) Enum.valueOf(PollsGetExtraAgeDto.class, str);
    }

    public static PollsGetExtraAgeDto[] values() {
        return (PollsGetExtraAgeDto[]) $VALUES.clone();
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
