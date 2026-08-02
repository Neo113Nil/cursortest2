package com.vk.api.generated.exploreStyles.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ExploreStylesStyleBaseVerticalAlignDto.kt */
/* loaded from: classes14.dex */
public final class ExploreStylesStyleBaseVerticalAlignDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ExploreStylesStyleBaseVerticalAlignDto[] $VALUES;

    @pmi0("bottom")
    public static final ExploreStylesStyleBaseVerticalAlignDto BOTTOM;

    @pmi0(TtmlNode.CENTER)
    public static final ExploreStylesStyleBaseVerticalAlignDto CENTER;
    public static final Parcelable.Creator<ExploreStylesStyleBaseVerticalAlignDto> CREATOR;

    @pmi0("top")
    public static final ExploreStylesStyleBaseVerticalAlignDto TOP;
    private final String value;

    /* compiled from: ExploreStylesStyleBaseVerticalAlignDto.kt */
    public static final class a implements Parcelable.Creator<ExploreStylesStyleBaseVerticalAlignDto> {
        @Override // android.os.Parcelable.Creator
        public final ExploreStylesStyleBaseVerticalAlignDto createFromParcel(Parcel parcel) {
            return ExploreStylesStyleBaseVerticalAlignDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ExploreStylesStyleBaseVerticalAlignDto[] newArray(int i) {
            return new ExploreStylesStyleBaseVerticalAlignDto[i];
        }
    }

    static {
        ExploreStylesStyleBaseVerticalAlignDto exploreStylesStyleBaseVerticalAlignDto = new ExploreStylesStyleBaseVerticalAlignDto("TOP", 0, "top");
        TOP = exploreStylesStyleBaseVerticalAlignDto;
        ExploreStylesStyleBaseVerticalAlignDto exploreStylesStyleBaseVerticalAlignDto2 = new ExploreStylesStyleBaseVerticalAlignDto("CENTER", 1, TtmlNode.CENTER);
        CENTER = exploreStylesStyleBaseVerticalAlignDto2;
        ExploreStylesStyleBaseVerticalAlignDto exploreStylesStyleBaseVerticalAlignDto3 = new ExploreStylesStyleBaseVerticalAlignDto("BOTTOM", 2, "bottom");
        BOTTOM = exploreStylesStyleBaseVerticalAlignDto3;
        ExploreStylesStyleBaseVerticalAlignDto[] exploreStylesStyleBaseVerticalAlignDtoArr = {exploreStylesStyleBaseVerticalAlignDto, exploreStylesStyleBaseVerticalAlignDto2, exploreStylesStyleBaseVerticalAlignDto3};
        $VALUES = exploreStylesStyleBaseVerticalAlignDtoArr;
        $ENTRIES = new asp(exploreStylesStyleBaseVerticalAlignDtoArr);
        CREATOR = new a();
    }

    private ExploreStylesStyleBaseVerticalAlignDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static ExploreStylesStyleBaseVerticalAlignDto valueOf(String str) {
        return (ExploreStylesStyleBaseVerticalAlignDto) Enum.valueOf(ExploreStylesStyleBaseVerticalAlignDto.class, str);
    }

    public static ExploreStylesStyleBaseVerticalAlignDto[] values() {
        return (ExploreStylesStyleBaseVerticalAlignDto[]) $VALUES.clone();
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
