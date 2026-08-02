package com.vk.api.generated.superApp.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SuperAppUniversalWidgetVerticalAlignDto.kt */
/* loaded from: classes15.dex */
public final class SuperAppUniversalWidgetVerticalAlignDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ SuperAppUniversalWidgetVerticalAlignDto[] $VALUES;

    @pmi0("bottom")
    public static final SuperAppUniversalWidgetVerticalAlignDto BOTTOM;

    @pmi0(TtmlNode.CENTER)
    public static final SuperAppUniversalWidgetVerticalAlignDto CENTER;
    public static final Parcelable.Creator<SuperAppUniversalWidgetVerticalAlignDto> CREATOR;

    @pmi0("top")
    public static final SuperAppUniversalWidgetVerticalAlignDto TOP;
    private final String value;

    /* compiled from: SuperAppUniversalWidgetVerticalAlignDto.kt */
    public static final class a implements Parcelable.Creator<SuperAppUniversalWidgetVerticalAlignDto> {
        @Override // android.os.Parcelable.Creator
        public final SuperAppUniversalWidgetVerticalAlignDto createFromParcel(Parcel parcel) {
            return SuperAppUniversalWidgetVerticalAlignDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SuperAppUniversalWidgetVerticalAlignDto[] newArray(int i) {
            return new SuperAppUniversalWidgetVerticalAlignDto[i];
        }
    }

    static {
        SuperAppUniversalWidgetVerticalAlignDto superAppUniversalWidgetVerticalAlignDto = new SuperAppUniversalWidgetVerticalAlignDto("TOP", 0, "top");
        TOP = superAppUniversalWidgetVerticalAlignDto;
        SuperAppUniversalWidgetVerticalAlignDto superAppUniversalWidgetVerticalAlignDto2 = new SuperAppUniversalWidgetVerticalAlignDto("CENTER", 1, TtmlNode.CENTER);
        CENTER = superAppUniversalWidgetVerticalAlignDto2;
        SuperAppUniversalWidgetVerticalAlignDto superAppUniversalWidgetVerticalAlignDto3 = new SuperAppUniversalWidgetVerticalAlignDto("BOTTOM", 2, "bottom");
        BOTTOM = superAppUniversalWidgetVerticalAlignDto3;
        SuperAppUniversalWidgetVerticalAlignDto[] superAppUniversalWidgetVerticalAlignDtoArr = {superAppUniversalWidgetVerticalAlignDto, superAppUniversalWidgetVerticalAlignDto2, superAppUniversalWidgetVerticalAlignDto3};
        $VALUES = superAppUniversalWidgetVerticalAlignDtoArr;
        $ENTRIES = new asp(superAppUniversalWidgetVerticalAlignDtoArr);
        CREATOR = new a();
    }

    private SuperAppUniversalWidgetVerticalAlignDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static SuperAppUniversalWidgetVerticalAlignDto valueOf(String str) {
        return (SuperAppUniversalWidgetVerticalAlignDto) Enum.valueOf(SuperAppUniversalWidgetVerticalAlignDto.class, str);
    }

    public static SuperAppUniversalWidgetVerticalAlignDto[] values() {
        return (SuperAppUniversalWidgetVerticalAlignDto[]) $VALUES.clone();
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
