package com.vk.api.generated.polls.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PollsCreateStyleDto.kt */
/* loaded from: classes15.dex */
public final class PollsCreateStyleDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ PollsCreateStyleDto[] $VALUES;

    @pmi0("accent")
    public static final PollsCreateStyleDto ACCENT;
    public static final Parcelable.Creator<PollsCreateStyleDto> CREATOR;

    @pmi0("dark")
    public static final PollsCreateStyleDto DARK;

    @pmi0("light")
    public static final PollsCreateStyleDto LIGHT;
    private final String value;

    /* compiled from: PollsCreateStyleDto.kt */
    public static final class a implements Parcelable.Creator<PollsCreateStyleDto> {
        @Override // android.os.Parcelable.Creator
        public final PollsCreateStyleDto createFromParcel(Parcel parcel) {
            return PollsCreateStyleDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PollsCreateStyleDto[] newArray(int i) {
            return new PollsCreateStyleDto[i];
        }
    }

    static {
        PollsCreateStyleDto pollsCreateStyleDto = new PollsCreateStyleDto("ACCENT", 0, "accent");
        ACCENT = pollsCreateStyleDto;
        PollsCreateStyleDto pollsCreateStyleDto2 = new PollsCreateStyleDto("DARK", 1, "dark");
        DARK = pollsCreateStyleDto2;
        PollsCreateStyleDto pollsCreateStyleDto3 = new PollsCreateStyleDto("LIGHT", 2, "light");
        LIGHT = pollsCreateStyleDto3;
        PollsCreateStyleDto[] pollsCreateStyleDtoArr = {pollsCreateStyleDto, pollsCreateStyleDto2, pollsCreateStyleDto3};
        $VALUES = pollsCreateStyleDtoArr;
        $ENTRIES = new asp(pollsCreateStyleDtoArr);
        CREATOR = new a();
    }

    private PollsCreateStyleDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static PollsCreateStyleDto valueOf(String str) {
        return (PollsCreateStyleDto) Enum.valueOf(PollsCreateStyleDto.class, str);
    }

    public static PollsCreateStyleDto[] values() {
        return (PollsCreateStyleDto[]) $VALUES.clone();
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
