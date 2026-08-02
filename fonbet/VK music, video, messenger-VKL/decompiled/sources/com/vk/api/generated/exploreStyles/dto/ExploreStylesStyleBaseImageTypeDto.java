package com.vk.api.generated.exploreStyles.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.MBridgeConstans;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ExploreStylesStyleBaseImageTypeDto.kt */
/* loaded from: classes14.dex */
public final class ExploreStylesStyleBaseImageTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ExploreStylesStyleBaseImageTypeDto[] $VALUES;

    @pmi0(MBridgeConstans.DYNAMIC_VIEW_WX_APP)
    public static final ExploreStylesStyleBaseImageTypeDto APP;

    @pmi0("circle")
    public static final ExploreStylesStyleBaseImageTypeDto CIRCLE;
    public static final Parcelable.Creator<ExploreStylesStyleBaseImageTypeDto> CREATOR;

    @pmi0("poster")
    public static final ExploreStylesStyleBaseImageTypeDto POSTER;

    @pmi0("square")
    public static final ExploreStylesStyleBaseImageTypeDto SQUARE;

    @pmi0("tv")
    public static final ExploreStylesStyleBaseImageTypeDto TV;
    private final String value;

    /* compiled from: ExploreStylesStyleBaseImageTypeDto.kt */
    public static final class a implements Parcelable.Creator<ExploreStylesStyleBaseImageTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final ExploreStylesStyleBaseImageTypeDto createFromParcel(Parcel parcel) {
            return ExploreStylesStyleBaseImageTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ExploreStylesStyleBaseImageTypeDto[] newArray(int i) {
            return new ExploreStylesStyleBaseImageTypeDto[i];
        }
    }

    static {
        ExploreStylesStyleBaseImageTypeDto exploreStylesStyleBaseImageTypeDto = new ExploreStylesStyleBaseImageTypeDto("APP", 0, MBridgeConstans.DYNAMIC_VIEW_WX_APP);
        APP = exploreStylesStyleBaseImageTypeDto;
        ExploreStylesStyleBaseImageTypeDto exploreStylesStyleBaseImageTypeDto2 = new ExploreStylesStyleBaseImageTypeDto("SQUARE", 1, "square");
        SQUARE = exploreStylesStyleBaseImageTypeDto2;
        ExploreStylesStyleBaseImageTypeDto exploreStylesStyleBaseImageTypeDto3 = new ExploreStylesStyleBaseImageTypeDto("CIRCLE", 2, "circle");
        CIRCLE = exploreStylesStyleBaseImageTypeDto3;
        ExploreStylesStyleBaseImageTypeDto exploreStylesStyleBaseImageTypeDto4 = new ExploreStylesStyleBaseImageTypeDto("POSTER", 3, "poster");
        POSTER = exploreStylesStyleBaseImageTypeDto4;
        ExploreStylesStyleBaseImageTypeDto exploreStylesStyleBaseImageTypeDto5 = new ExploreStylesStyleBaseImageTypeDto("TV", 4, "tv");
        TV = exploreStylesStyleBaseImageTypeDto5;
        ExploreStylesStyleBaseImageTypeDto[] exploreStylesStyleBaseImageTypeDtoArr = {exploreStylesStyleBaseImageTypeDto, exploreStylesStyleBaseImageTypeDto2, exploreStylesStyleBaseImageTypeDto3, exploreStylesStyleBaseImageTypeDto4, exploreStylesStyleBaseImageTypeDto5};
        $VALUES = exploreStylesStyleBaseImageTypeDtoArr;
        $ENTRIES = new asp(exploreStylesStyleBaseImageTypeDtoArr);
        CREATOR = new a();
    }

    private ExploreStylesStyleBaseImageTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static ExploreStylesStyleBaseImageTypeDto valueOf(String str) {
        return (ExploreStylesStyleBaseImageTypeDto) Enum.valueOf(ExploreStylesStyleBaseImageTypeDto.class, str);
    }

    public static ExploreStylesStyleBaseImageTypeDto[] values() {
        return (ExploreStylesStyleBaseImageTypeDto[]) $VALUES.clone();
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
