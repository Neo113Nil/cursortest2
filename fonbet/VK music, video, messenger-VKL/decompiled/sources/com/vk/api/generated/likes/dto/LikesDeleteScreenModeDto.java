package com.vk.api.generated.likes.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LikesDeleteScreenModeDto.kt */
/* loaded from: classes14.dex */
public final class LikesDeleteScreenModeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ LikesDeleteScreenModeDto[] $VALUES;
    public static final Parcelable.Creator<LikesDeleteScreenModeDto> CREATOR;

    @pmi0("discovery")
    public static final LikesDeleteScreenModeDto DISCOVERY;

    @pmi0("fullscreen_landscape")
    public static final LikesDeleteScreenModeDto FULLSCREEN_LANDSCAPE;

    @pmi0("fullscreen_portrait")
    public static final LikesDeleteScreenModeDto FULLSCREEN_PORTRAIT;
    private final String value;

    /* compiled from: LikesDeleteScreenModeDto.kt */
    public static final class a implements Parcelable.Creator<LikesDeleteScreenModeDto> {
        @Override // android.os.Parcelable.Creator
        public final LikesDeleteScreenModeDto createFromParcel(Parcel parcel) {
            return LikesDeleteScreenModeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final LikesDeleteScreenModeDto[] newArray(int i) {
            return new LikesDeleteScreenModeDto[i];
        }
    }

    static {
        LikesDeleteScreenModeDto likesDeleteScreenModeDto = new LikesDeleteScreenModeDto("DISCOVERY", 0, "discovery");
        DISCOVERY = likesDeleteScreenModeDto;
        LikesDeleteScreenModeDto likesDeleteScreenModeDto2 = new LikesDeleteScreenModeDto("FULLSCREEN_LANDSCAPE", 1, "fullscreen_landscape");
        FULLSCREEN_LANDSCAPE = likesDeleteScreenModeDto2;
        LikesDeleteScreenModeDto likesDeleteScreenModeDto3 = new LikesDeleteScreenModeDto("FULLSCREEN_PORTRAIT", 2, "fullscreen_portrait");
        FULLSCREEN_PORTRAIT = likesDeleteScreenModeDto3;
        LikesDeleteScreenModeDto[] likesDeleteScreenModeDtoArr = {likesDeleteScreenModeDto, likesDeleteScreenModeDto2, likesDeleteScreenModeDto3};
        $VALUES = likesDeleteScreenModeDtoArr;
        $ENTRIES = new asp(likesDeleteScreenModeDtoArr);
        CREATOR = new a();
    }

    private LikesDeleteScreenModeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static LikesDeleteScreenModeDto valueOf(String str) {
        return (LikesDeleteScreenModeDto) Enum.valueOf(LikesDeleteScreenModeDto.class, str);
    }

    public static LikesDeleteScreenModeDto[] values() {
        return (LikesDeleteScreenModeDto[]) $VALUES.clone();
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
