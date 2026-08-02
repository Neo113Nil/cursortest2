package com.vk.api.generated.wall.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WallParseAttachedLinkParsingTypeDto.kt */
/* loaded from: classes15.dex */
public final class WallParseAttachedLinkParsingTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ WallParseAttachedLinkParsingTypeDto[] $VALUES;
    public static final Parcelable.Creator<WallParseAttachedLinkParsingTypeDto> CREATOR;

    @pmi0("legacy")
    public static final WallParseAttachedLinkParsingTypeDto LEGACY;

    @pmi0("posting_v2")
    public static final WallParseAttachedLinkParsingTypeDto POSTING_V2;
    private final String value;

    /* compiled from: WallParseAttachedLinkParsingTypeDto.kt */
    public static final class a implements Parcelable.Creator<WallParseAttachedLinkParsingTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final WallParseAttachedLinkParsingTypeDto createFromParcel(Parcel parcel) {
            return WallParseAttachedLinkParsingTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final WallParseAttachedLinkParsingTypeDto[] newArray(int i) {
            return new WallParseAttachedLinkParsingTypeDto[i];
        }
    }

    static {
        WallParseAttachedLinkParsingTypeDto wallParseAttachedLinkParsingTypeDto = new WallParseAttachedLinkParsingTypeDto("LEGACY", 0, "legacy");
        LEGACY = wallParseAttachedLinkParsingTypeDto;
        WallParseAttachedLinkParsingTypeDto wallParseAttachedLinkParsingTypeDto2 = new WallParseAttachedLinkParsingTypeDto("POSTING_V2", 1, "posting_v2");
        POSTING_V2 = wallParseAttachedLinkParsingTypeDto2;
        WallParseAttachedLinkParsingTypeDto[] wallParseAttachedLinkParsingTypeDtoArr = {wallParseAttachedLinkParsingTypeDto, wallParseAttachedLinkParsingTypeDto2};
        $VALUES = wallParseAttachedLinkParsingTypeDtoArr;
        $ENTRIES = new asp(wallParseAttachedLinkParsingTypeDtoArr);
        CREATOR = new a();
    }

    private WallParseAttachedLinkParsingTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static WallParseAttachedLinkParsingTypeDto valueOf(String str) {
        return (WallParseAttachedLinkParsingTypeDto) Enum.valueOf(WallParseAttachedLinkParsingTypeDto.class, str);
    }

    public static WallParseAttachedLinkParsingTypeDto[] values() {
        return (WallParseAttachedLinkParsingTypeDto[]) $VALUES.clone();
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
