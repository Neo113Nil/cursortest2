package com.vk.api.generated.polls.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PollsGetExtraSexDto.kt */
/* loaded from: classes15.dex */
public final class PollsGetExtraSexDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ PollsGetExtraSexDto[] $VALUES;
    public static final Parcelable.Creator<PollsGetExtraSexDto> CREATOR;

    @pmi0("1")
    public static final PollsGetExtraSexDto TYPE_1;

    @pmi0("2")
    public static final PollsGetExtraSexDto TYPE_2;
    private final int value;

    /* compiled from: PollsGetExtraSexDto.kt */
    public static final class a implements Parcelable.Creator<PollsGetExtraSexDto> {
        @Override // android.os.Parcelable.Creator
        public final PollsGetExtraSexDto createFromParcel(Parcel parcel) {
            return PollsGetExtraSexDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PollsGetExtraSexDto[] newArray(int i) {
            return new PollsGetExtraSexDto[i];
        }
    }

    static {
        PollsGetExtraSexDto pollsGetExtraSexDto = new PollsGetExtraSexDto("TYPE_1", 0, 1);
        TYPE_1 = pollsGetExtraSexDto;
        PollsGetExtraSexDto pollsGetExtraSexDto2 = new PollsGetExtraSexDto("TYPE_2", 1, 2);
        TYPE_2 = pollsGetExtraSexDto2;
        PollsGetExtraSexDto[] pollsGetExtraSexDtoArr = {pollsGetExtraSexDto, pollsGetExtraSexDto2};
        $VALUES = pollsGetExtraSexDtoArr;
        $ENTRIES = new asp(pollsGetExtraSexDtoArr);
        CREATOR = new a();
    }

    private PollsGetExtraSexDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static PollsGetExtraSexDto valueOf(String str) {
        return (PollsGetExtraSexDto) Enum.valueOf(PollsGetExtraSexDto.class, str);
    }

    public static PollsGetExtraSexDto[] values() {
        return (PollsGetExtraSexDto[]) $VALUES.clone();
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
