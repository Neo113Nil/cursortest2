package com.vk.api.generated.polls.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PollsEditStyleDto.kt */
/* loaded from: classes15.dex */
public final class PollsEditStyleDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ PollsEditStyleDto[] $VALUES;

    @pmi0("accent")
    public static final PollsEditStyleDto ACCENT;
    public static final Parcelable.Creator<PollsEditStyleDto> CREATOR;

    @pmi0("dark")
    public static final PollsEditStyleDto DARK;

    @pmi0("light")
    public static final PollsEditStyleDto LIGHT;
    private final String value;

    /* compiled from: PollsEditStyleDto.kt */
    public static final class a implements Parcelable.Creator<PollsEditStyleDto> {
        @Override // android.os.Parcelable.Creator
        public final PollsEditStyleDto createFromParcel(Parcel parcel) {
            return PollsEditStyleDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PollsEditStyleDto[] newArray(int i) {
            return new PollsEditStyleDto[i];
        }
    }

    static {
        PollsEditStyleDto pollsEditStyleDto = new PollsEditStyleDto("ACCENT", 0, "accent");
        ACCENT = pollsEditStyleDto;
        PollsEditStyleDto pollsEditStyleDto2 = new PollsEditStyleDto("DARK", 1, "dark");
        DARK = pollsEditStyleDto2;
        PollsEditStyleDto pollsEditStyleDto3 = new PollsEditStyleDto("LIGHT", 2, "light");
        LIGHT = pollsEditStyleDto3;
        PollsEditStyleDto[] pollsEditStyleDtoArr = {pollsEditStyleDto, pollsEditStyleDto2, pollsEditStyleDto3};
        $VALUES = pollsEditStyleDtoArr;
        $ENTRIES = new asp(pollsEditStyleDtoArr);
        CREATOR = new a();
    }

    private PollsEditStyleDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static zrp<PollsEditStyleDto> i() {
        return $ENTRIES;
    }

    public static PollsEditStyleDto valueOf(String str) {
        return (PollsEditStyleDto) Enum.valueOf(PollsEditStyleDto.class, str);
    }

    public static PollsEditStyleDto[] values() {
        return (PollsEditStyleDto[]) $VALUES.clone();
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
