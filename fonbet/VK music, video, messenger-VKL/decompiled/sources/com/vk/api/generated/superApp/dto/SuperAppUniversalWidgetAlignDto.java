package com.vk.api.generated.superApp.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SuperAppUniversalWidgetAlignDto.kt */
/* loaded from: classes15.dex */
public final class SuperAppUniversalWidgetAlignDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ SuperAppUniversalWidgetAlignDto[] $VALUES;

    @pmi0(TtmlNode.CENTER)
    public static final SuperAppUniversalWidgetAlignDto CENTER;
    public static final Parcelable.Creator<SuperAppUniversalWidgetAlignDto> CREATOR;

    @pmi0(TtmlNode.LEFT)
    public static final SuperAppUniversalWidgetAlignDto LEFT;

    @pmi0(TtmlNode.RIGHT)
    public static final SuperAppUniversalWidgetAlignDto RIGHT;
    private final String value;

    /* compiled from: SuperAppUniversalWidgetAlignDto.kt */
    public static final class a implements Parcelable.Creator<SuperAppUniversalWidgetAlignDto> {
        @Override // android.os.Parcelable.Creator
        public final SuperAppUniversalWidgetAlignDto createFromParcel(Parcel parcel) {
            return SuperAppUniversalWidgetAlignDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SuperAppUniversalWidgetAlignDto[] newArray(int i) {
            return new SuperAppUniversalWidgetAlignDto[i];
        }
    }

    static {
        SuperAppUniversalWidgetAlignDto superAppUniversalWidgetAlignDto = new SuperAppUniversalWidgetAlignDto("LEFT", 0, TtmlNode.LEFT);
        LEFT = superAppUniversalWidgetAlignDto;
        SuperAppUniversalWidgetAlignDto superAppUniversalWidgetAlignDto2 = new SuperAppUniversalWidgetAlignDto("CENTER", 1, TtmlNode.CENTER);
        CENTER = superAppUniversalWidgetAlignDto2;
        SuperAppUniversalWidgetAlignDto superAppUniversalWidgetAlignDto3 = new SuperAppUniversalWidgetAlignDto("RIGHT", 2, TtmlNode.RIGHT);
        RIGHT = superAppUniversalWidgetAlignDto3;
        SuperAppUniversalWidgetAlignDto[] superAppUniversalWidgetAlignDtoArr = {superAppUniversalWidgetAlignDto, superAppUniversalWidgetAlignDto2, superAppUniversalWidgetAlignDto3};
        $VALUES = superAppUniversalWidgetAlignDtoArr;
        $ENTRIES = new asp(superAppUniversalWidgetAlignDtoArr);
        CREATOR = new a();
    }

    private SuperAppUniversalWidgetAlignDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static SuperAppUniversalWidgetAlignDto valueOf(String str) {
        return (SuperAppUniversalWidgetAlignDto) Enum.valueOf(SuperAppUniversalWidgetAlignDto.class, str);
    }

    public static SuperAppUniversalWidgetAlignDto[] values() {
        return (SuperAppUniversalWidgetAlignDto[]) $VALUES.clone();
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
