package com.vk.api.generated.exploreStyles.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.X3;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ExploreStylesStyleBaseColorDto.kt */
/* loaded from: classes14.dex */
public final class ExploreStylesStyleBaseColorDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ExploreStylesStyleBaseColorDto[] $VALUES;

    @pmi0("accent")
    public static final ExploreStylesStyleBaseColorDto ACCENT;
    public static final Parcelable.Creator<ExploreStylesStyleBaseColorDto> CREATOR;

    @pmi0("dynamic_blue")
    public static final ExploreStylesStyleBaseColorDto DYNAMIC_BLUE;

    @pmi0("dynamic_gray")
    public static final ExploreStylesStyleBaseColorDto DYNAMIC_GRAY;

    @pmi0("dynamic_green")
    public static final ExploreStylesStyleBaseColorDto DYNAMIC_GREEN;

    @pmi0("dynamic_orange")
    public static final ExploreStylesStyleBaseColorDto DYNAMIC_ORANGE;

    @pmi0("dynamic_red")
    public static final ExploreStylesStyleBaseColorDto DYNAMIC_RED;

    @pmi0("dynamic_violet")
    public static final ExploreStylesStyleBaseColorDto DYNAMIC_VIOLET;

    @pmi0("primary")
    public static final ExploreStylesStyleBaseColorDto PRIMARY;

    @pmi0(X3.i.Y)
    public static final ExploreStylesStyleBaseColorDto SECONDARY;
    private final String value;

    /* compiled from: ExploreStylesStyleBaseColorDto.kt */
    public static final class a implements Parcelable.Creator<ExploreStylesStyleBaseColorDto> {
        @Override // android.os.Parcelable.Creator
        public final ExploreStylesStyleBaseColorDto createFromParcel(Parcel parcel) {
            return ExploreStylesStyleBaseColorDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ExploreStylesStyleBaseColorDto[] newArray(int i) {
            return new ExploreStylesStyleBaseColorDto[i];
        }
    }

    static {
        ExploreStylesStyleBaseColorDto exploreStylesStyleBaseColorDto = new ExploreStylesStyleBaseColorDto("ACCENT", 0, "accent");
        ACCENT = exploreStylesStyleBaseColorDto;
        ExploreStylesStyleBaseColorDto exploreStylesStyleBaseColorDto2 = new ExploreStylesStyleBaseColorDto("SECONDARY", 1, X3.i.Y);
        SECONDARY = exploreStylesStyleBaseColorDto2;
        ExploreStylesStyleBaseColorDto exploreStylesStyleBaseColorDto3 = new ExploreStylesStyleBaseColorDto("PRIMARY", 2, "primary");
        PRIMARY = exploreStylesStyleBaseColorDto3;
        ExploreStylesStyleBaseColorDto exploreStylesStyleBaseColorDto4 = new ExploreStylesStyleBaseColorDto("DYNAMIC_BLUE", 3, "dynamic_blue");
        DYNAMIC_BLUE = exploreStylesStyleBaseColorDto4;
        ExploreStylesStyleBaseColorDto exploreStylesStyleBaseColorDto5 = new ExploreStylesStyleBaseColorDto("DYNAMIC_GRAY", 4, "dynamic_gray");
        DYNAMIC_GRAY = exploreStylesStyleBaseColorDto5;
        ExploreStylesStyleBaseColorDto exploreStylesStyleBaseColorDto6 = new ExploreStylesStyleBaseColorDto("DYNAMIC_RED", 5, "dynamic_red");
        DYNAMIC_RED = exploreStylesStyleBaseColorDto6;
        ExploreStylesStyleBaseColorDto exploreStylesStyleBaseColorDto7 = new ExploreStylesStyleBaseColorDto("DYNAMIC_GREEN", 6, "dynamic_green");
        DYNAMIC_GREEN = exploreStylesStyleBaseColorDto7;
        ExploreStylesStyleBaseColorDto exploreStylesStyleBaseColorDto8 = new ExploreStylesStyleBaseColorDto("DYNAMIC_ORANGE", 7, "dynamic_orange");
        DYNAMIC_ORANGE = exploreStylesStyleBaseColorDto8;
        ExploreStylesStyleBaseColorDto exploreStylesStyleBaseColorDto9 = new ExploreStylesStyleBaseColorDto("DYNAMIC_VIOLET", 8, "dynamic_violet");
        DYNAMIC_VIOLET = exploreStylesStyleBaseColorDto9;
        ExploreStylesStyleBaseColorDto[] exploreStylesStyleBaseColorDtoArr = {exploreStylesStyleBaseColorDto, exploreStylesStyleBaseColorDto2, exploreStylesStyleBaseColorDto3, exploreStylesStyleBaseColorDto4, exploreStylesStyleBaseColorDto5, exploreStylesStyleBaseColorDto6, exploreStylesStyleBaseColorDto7, exploreStylesStyleBaseColorDto8, exploreStylesStyleBaseColorDto9};
        $VALUES = exploreStylesStyleBaseColorDtoArr;
        $ENTRIES = new asp(exploreStylesStyleBaseColorDtoArr);
        CREATOR = new a();
    }

    private ExploreStylesStyleBaseColorDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static ExploreStylesStyleBaseColorDto valueOf(String str) {
        return (ExploreStylesStyleBaseColorDto) Enum.valueOf(ExploreStylesStyleBaseColorDto.class, str);
    }

    public static ExploreStylesStyleBaseColorDto[] values() {
        return (ExploreStylesStyleBaseColorDto[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String i() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
