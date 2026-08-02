package com.vk.api.generated.likes.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LikesAddScreenModeDto.kt */
/* loaded from: classes14.dex */
public final class LikesAddScreenModeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ LikesAddScreenModeDto[] $VALUES;
    public static final Parcelable.Creator<LikesAddScreenModeDto> CREATOR;

    @pmi0("discovery")
    public static final LikesAddScreenModeDto DISCOVERY;

    @pmi0("fullscreen_landscape")
    public static final LikesAddScreenModeDto FULLSCREEN_LANDSCAPE;

    @pmi0("fullscreen_portrait")
    public static final LikesAddScreenModeDto FULLSCREEN_PORTRAIT;
    private final String value;

    /* compiled from: LikesAddScreenModeDto.kt */
    public static final class a implements Parcelable.Creator<LikesAddScreenModeDto> {
        @Override // android.os.Parcelable.Creator
        public final LikesAddScreenModeDto createFromParcel(Parcel parcel) {
            return LikesAddScreenModeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final LikesAddScreenModeDto[] newArray(int i) {
            return new LikesAddScreenModeDto[i];
        }
    }

    static {
        LikesAddScreenModeDto likesAddScreenModeDto = new LikesAddScreenModeDto("DISCOVERY", 0, "discovery");
        DISCOVERY = likesAddScreenModeDto;
        LikesAddScreenModeDto likesAddScreenModeDto2 = new LikesAddScreenModeDto("FULLSCREEN_LANDSCAPE", 1, "fullscreen_landscape");
        FULLSCREEN_LANDSCAPE = likesAddScreenModeDto2;
        LikesAddScreenModeDto likesAddScreenModeDto3 = new LikesAddScreenModeDto("FULLSCREEN_PORTRAIT", 2, "fullscreen_portrait");
        FULLSCREEN_PORTRAIT = likesAddScreenModeDto3;
        LikesAddScreenModeDto[] likesAddScreenModeDtoArr = {likesAddScreenModeDto, likesAddScreenModeDto2, likesAddScreenModeDto3};
        $VALUES = likesAddScreenModeDtoArr;
        $ENTRIES = new asp(likesAddScreenModeDtoArr);
        CREATOR = new a();
    }

    private LikesAddScreenModeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static LikesAddScreenModeDto valueOf(String str) {
        return (LikesAddScreenModeDto) Enum.valueOf(LikesAddScreenModeDto.class, str);
    }

    public static LikesAddScreenModeDto[] values() {
        return (LikesAddScreenModeDto[]) $VALUES.clone();
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
