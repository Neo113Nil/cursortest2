package com.vk.api.generated.polls.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PollsEditBackgroundIdDto.kt */
/* loaded from: classes15.dex */
public final class PollsEditBackgroundIdDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ PollsEditBackgroundIdDto[] $VALUES;
    public static final Parcelable.Creator<PollsEditBackgroundIdDto> CREATOR;

    @pmi0("0")
    public static final PollsEditBackgroundIdDto TYPE_0;

    @pmi0("1")
    public static final PollsEditBackgroundIdDto TYPE_1;

    @pmi0("2")
    public static final PollsEditBackgroundIdDto TYPE_2;

    @pmi0("3")
    public static final PollsEditBackgroundIdDto TYPE_3;

    @pmi0("4")
    public static final PollsEditBackgroundIdDto TYPE_4;

    @pmi0("6")
    public static final PollsEditBackgroundIdDto TYPE_6;

    @pmi0("8")
    public static final PollsEditBackgroundIdDto TYPE_8;

    @pmi0("9")
    public static final PollsEditBackgroundIdDto TYPE_9;
    private final String value;

    /* compiled from: PollsEditBackgroundIdDto.kt */
    public static final class a implements Parcelable.Creator<PollsEditBackgroundIdDto> {
        @Override // android.os.Parcelable.Creator
        public final PollsEditBackgroundIdDto createFromParcel(Parcel parcel) {
            return PollsEditBackgroundIdDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PollsEditBackgroundIdDto[] newArray(int i) {
            return new PollsEditBackgroundIdDto[i];
        }
    }

    static {
        PollsEditBackgroundIdDto pollsEditBackgroundIdDto = new PollsEditBackgroundIdDto("TYPE_0", 0, "0");
        TYPE_0 = pollsEditBackgroundIdDto;
        PollsEditBackgroundIdDto pollsEditBackgroundIdDto2 = new PollsEditBackgroundIdDto("TYPE_1", 1, "1");
        TYPE_1 = pollsEditBackgroundIdDto2;
        PollsEditBackgroundIdDto pollsEditBackgroundIdDto3 = new PollsEditBackgroundIdDto("TYPE_2", 2, "2");
        TYPE_2 = pollsEditBackgroundIdDto3;
        PollsEditBackgroundIdDto pollsEditBackgroundIdDto4 = new PollsEditBackgroundIdDto("TYPE_3", 3, "3");
        TYPE_3 = pollsEditBackgroundIdDto4;
        PollsEditBackgroundIdDto pollsEditBackgroundIdDto5 = new PollsEditBackgroundIdDto("TYPE_4", 4, "4");
        TYPE_4 = pollsEditBackgroundIdDto5;
        PollsEditBackgroundIdDto pollsEditBackgroundIdDto6 = new PollsEditBackgroundIdDto("TYPE_6", 5, "6");
        TYPE_6 = pollsEditBackgroundIdDto6;
        PollsEditBackgroundIdDto pollsEditBackgroundIdDto7 = new PollsEditBackgroundIdDto("TYPE_8", 6, "8");
        TYPE_8 = pollsEditBackgroundIdDto7;
        PollsEditBackgroundIdDto pollsEditBackgroundIdDto8 = new PollsEditBackgroundIdDto("TYPE_9", 7, "9");
        TYPE_9 = pollsEditBackgroundIdDto8;
        PollsEditBackgroundIdDto[] pollsEditBackgroundIdDtoArr = {pollsEditBackgroundIdDto, pollsEditBackgroundIdDto2, pollsEditBackgroundIdDto3, pollsEditBackgroundIdDto4, pollsEditBackgroundIdDto5, pollsEditBackgroundIdDto6, pollsEditBackgroundIdDto7, pollsEditBackgroundIdDto8};
        $VALUES = pollsEditBackgroundIdDtoArr;
        $ENTRIES = new asp(pollsEditBackgroundIdDtoArr);
        CREATOR = new a();
    }

    private PollsEditBackgroundIdDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static zrp<PollsEditBackgroundIdDto> i() {
        return $ENTRIES;
    }

    public static PollsEditBackgroundIdDto valueOf(String str) {
        return (PollsEditBackgroundIdDto) Enum.valueOf(PollsEditBackgroundIdDto.class, str);
    }

    public static PollsEditBackgroundIdDto[] values() {
        return (PollsEditBackgroundIdDto[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String j() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
