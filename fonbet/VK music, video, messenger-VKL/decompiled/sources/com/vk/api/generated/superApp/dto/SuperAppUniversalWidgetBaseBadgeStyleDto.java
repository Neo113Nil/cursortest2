package com.vk.api.generated.superApp.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: SuperAppUniversalWidgetBaseBadgeStyleDto.kt */
/* loaded from: classes15.dex */
public final class SuperAppUniversalWidgetBaseBadgeStyleDto implements Parcelable {
    public static final Parcelable.Creator<SuperAppUniversalWidgetBaseBadgeStyleDto> CREATOR = new a();

    @pmi0("align")
    private final AlignDto align;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SuperAppUniversalWidgetBaseBadgeStyleDto.kt */
    public static final class AlignDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ AlignDto[] $VALUES;
        public static final Parcelable.Creator<AlignDto> CREATOR;

        @pmi0(TtmlNode.LEFT)
        public static final AlignDto LEFT;

        @pmi0(TtmlNode.RIGHT)
        public static final AlignDto RIGHT;
        private final String value;

        /* compiled from: SuperAppUniversalWidgetBaseBadgeStyleDto.kt */
        public static final class a implements Parcelable.Creator<AlignDto> {
            @Override // android.os.Parcelable.Creator
            public final AlignDto createFromParcel(Parcel parcel) {
                return AlignDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final AlignDto[] newArray(int i) {
                return new AlignDto[i];
            }
        }

        static {
            AlignDto alignDto = new AlignDto("LEFT", 0, TtmlNode.LEFT);
            LEFT = alignDto;
            AlignDto alignDto2 = new AlignDto("RIGHT", 1, TtmlNode.RIGHT);
            RIGHT = alignDto2;
            AlignDto[] alignDtoArr = {alignDto, alignDto2};
            $VALUES = alignDtoArr;
            $ENTRIES = new asp(alignDtoArr);
            CREATOR = new a();
        }

        private AlignDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static AlignDto valueOf(String str) {
            return (AlignDto) Enum.valueOf(AlignDto.class, str);
        }

        public static AlignDto[] values() {
            return (AlignDto[]) $VALUES.clone();
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

    /* compiled from: SuperAppUniversalWidgetBaseBadgeStyleDto.kt */
    public static final class a implements Parcelable.Creator<SuperAppUniversalWidgetBaseBadgeStyleDto> {
        @Override // android.os.Parcelable.Creator
        public final SuperAppUniversalWidgetBaseBadgeStyleDto createFromParcel(Parcel parcel) {
            return new SuperAppUniversalWidgetBaseBadgeStyleDto(AlignDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final SuperAppUniversalWidgetBaseBadgeStyleDto[] newArray(int i) {
            return new SuperAppUniversalWidgetBaseBadgeStyleDto[i];
        }
    }

    public SuperAppUniversalWidgetBaseBadgeStyleDto(AlignDto alignDto) {
        this.align = alignDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SuperAppUniversalWidgetBaseBadgeStyleDto) && this.align == ((SuperAppUniversalWidgetBaseBadgeStyleDto) obj).align;
    }

    public final int hashCode() {
        return this.align.hashCode();
    }

    public final String toString() {
        return "SuperAppUniversalWidgetBaseBadgeStyleDto(align=" + this.align + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.align.writeToParcel(parcel, i);
    }
}
