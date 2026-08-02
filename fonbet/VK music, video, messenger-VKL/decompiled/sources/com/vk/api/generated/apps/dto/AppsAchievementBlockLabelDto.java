package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: AppsAchievementBlockLabelDto.kt */
/* loaded from: classes14.dex */
public final class AppsAchievementBlockLabelDto implements Parcelable {
    public static final Parcelable.Creator<AppsAchievementBlockLabelDto> CREATOR = new a();

    @pmi0("color")
    private final ColorDto color;

    @pmi0("text")
    private final String text;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AppsAchievementBlockLabelDto.kt */
    public static final class ColorDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ColorDto[] $VALUES;
        public static final Parcelable.Creator<ColorDto> CREATOR;

        @pmi0("green")
        public static final ColorDto GREEN;

        @pmi0("red")
        public static final ColorDto RED;

        @pmi0("yellow")
        public static final ColorDto YELLOW;
        private final String value;

        /* compiled from: AppsAchievementBlockLabelDto.kt */
        public static final class a implements Parcelable.Creator<ColorDto> {
            @Override // android.os.Parcelable.Creator
            public final ColorDto createFromParcel(Parcel parcel) {
                return ColorDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ColorDto[] newArray(int i) {
                return new ColorDto[i];
            }
        }

        static {
            ColorDto colorDto = new ColorDto("GREEN", 0, "green");
            GREEN = colorDto;
            ColorDto colorDto2 = new ColorDto("YELLOW", 1, "yellow");
            YELLOW = colorDto2;
            ColorDto colorDto3 = new ColorDto("RED", 2, "red");
            RED = colorDto3;
            ColorDto[] colorDtoArr = {colorDto, colorDto2, colorDto3};
            $VALUES = colorDtoArr;
            $ENTRIES = new asp(colorDtoArr);
            CREATOR = new a();
        }

        private ColorDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static ColorDto valueOf(String str) {
            return (ColorDto) Enum.valueOf(ColorDto.class, str);
        }

        public static ColorDto[] values() {
            return (ColorDto[]) $VALUES.clone();
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

    /* compiled from: AppsAchievementBlockLabelDto.kt */
    public static final class a implements Parcelable.Creator<AppsAchievementBlockLabelDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsAchievementBlockLabelDto createFromParcel(Parcel parcel) {
            return new AppsAchievementBlockLabelDto(parcel.readString(), ColorDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final AppsAchievementBlockLabelDto[] newArray(int i) {
            return new AppsAchievementBlockLabelDto[i];
        }
    }

    public AppsAchievementBlockLabelDto(String str, ColorDto colorDto) {
        this.text = str;
        this.color = colorDto;
    }

    public final ColorDto d() {
        return this.color;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.text;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsAchievementBlockLabelDto)) {
            return false;
        }
        AppsAchievementBlockLabelDto appsAchievementBlockLabelDto = (AppsAchievementBlockLabelDto) obj;
        return epx.f(this.text, appsAchievementBlockLabelDto.text) && this.color == appsAchievementBlockLabelDto.color;
    }

    public final int hashCode() {
        return this.color.hashCode() + (this.text.hashCode() * 31);
    }

    public final String toString() {
        return "AppsAchievementBlockLabelDto(text=" + this.text + ", color=" + this.color + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.text);
        this.color.writeToParcel(parcel, i);
    }
}
