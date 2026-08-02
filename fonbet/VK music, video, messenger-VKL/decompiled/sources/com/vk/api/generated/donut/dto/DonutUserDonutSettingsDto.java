package com.vk.api.generated.donut.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: DonutUserDonutSettingsDto.kt */
/* loaded from: classes14.dex */
public final class DonutUserDonutSettingsDto implements Parcelable {
    public static final Parcelable.Creator<DonutUserDonutSettingsDto> CREATOR = new a();

    @pmi0("visibility")
    private final VisibilityDto visibility;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DonutUserDonutSettingsDto.kt */
    public static final class VisibilityDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ VisibilityDto[] $VALUES;
        public static final Parcelable.Creator<VisibilityDto> CREATOR;

        @pmi0("visible_everybody")
        public static final VisibilityDto VISIBLE_EVERYBODY;

        @pmi0("visible_friends")
        public static final VisibilityDto VISIBLE_FRIENDS;

        @pmi0("visible_nobody")
        public static final VisibilityDto VISIBLE_NOBODY;
        private final String value;

        /* compiled from: DonutUserDonutSettingsDto.kt */
        public static final class a implements Parcelable.Creator<VisibilityDto> {
            @Override // android.os.Parcelable.Creator
            public final VisibilityDto createFromParcel(Parcel parcel) {
                return VisibilityDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final VisibilityDto[] newArray(int i) {
                return new VisibilityDto[i];
            }
        }

        static {
            VisibilityDto visibilityDto = new VisibilityDto("VISIBLE_NOBODY", 0, "visible_nobody");
            VISIBLE_NOBODY = visibilityDto;
            VisibilityDto visibilityDto2 = new VisibilityDto("VISIBLE_FRIENDS", 1, "visible_friends");
            VISIBLE_FRIENDS = visibilityDto2;
            VisibilityDto visibilityDto3 = new VisibilityDto("VISIBLE_EVERYBODY", 2, "visible_everybody");
            VISIBLE_EVERYBODY = visibilityDto3;
            VisibilityDto[] visibilityDtoArr = {visibilityDto, visibilityDto2, visibilityDto3};
            $VALUES = visibilityDtoArr;
            $ENTRIES = new asp(visibilityDtoArr);
            CREATOR = new a();
        }

        private VisibilityDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static VisibilityDto valueOf(String str) {
            return (VisibilityDto) Enum.valueOf(VisibilityDto.class, str);
        }

        public static VisibilityDto[] values() {
            return (VisibilityDto[]) $VALUES.clone();
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

    /* compiled from: DonutUserDonutSettingsDto.kt */
    public static final class a implements Parcelable.Creator<DonutUserDonutSettingsDto> {
        @Override // android.os.Parcelable.Creator
        public final DonutUserDonutSettingsDto createFromParcel(Parcel parcel) {
            return new DonutUserDonutSettingsDto(VisibilityDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final DonutUserDonutSettingsDto[] newArray(int i) {
            return new DonutUserDonutSettingsDto[i];
        }
    }

    public DonutUserDonutSettingsDto(VisibilityDto visibilityDto) {
        this.visibility = visibilityDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DonutUserDonutSettingsDto) && this.visibility == ((DonutUserDonutSettingsDto) obj).visibility;
    }

    public final int hashCode() {
        return this.visibility.hashCode();
    }

    public final String toString() {
        return "DonutUserDonutSettingsDto(visibility=" + this.visibility + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.visibility.writeToParcel(parcel, i);
    }
}
