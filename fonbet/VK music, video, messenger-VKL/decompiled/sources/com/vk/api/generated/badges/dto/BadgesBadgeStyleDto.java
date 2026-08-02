package com.vk.api.generated.badges.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: BadgesBadgeStyleDto.kt */
/* loaded from: classes14.dex */
public final class BadgesBadgeStyleDto implements Parcelable {
    public static final Parcelable.Creator<BadgesBadgeStyleDto> CREATOR = new a();

    @pmi0("background_color")
    private final String backgroundColor;

    @pmi0("color_scheme")
    private final ColorSchemeDto colorScheme;

    @pmi0("text_color")
    private final String textColor;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BadgesBadgeStyleDto.kt */
    public static final class ColorSchemeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ColorSchemeDto[] $VALUES;
        public static final Parcelable.Creator<ColorSchemeDto> CREATOR;

        @pmi0("dark")
        public static final ColorSchemeDto DARK;

        @pmi0("light")
        public static final ColorSchemeDto LIGHT;
        private final String value;

        /* compiled from: BadgesBadgeStyleDto.kt */
        public static final class a implements Parcelable.Creator<ColorSchemeDto> {
            @Override // android.os.Parcelable.Creator
            public final ColorSchemeDto createFromParcel(Parcel parcel) {
                return ColorSchemeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ColorSchemeDto[] newArray(int i) {
                return new ColorSchemeDto[i];
            }
        }

        static {
            ColorSchemeDto colorSchemeDto = new ColorSchemeDto("LIGHT", 0, "light");
            LIGHT = colorSchemeDto;
            ColorSchemeDto colorSchemeDto2 = new ColorSchemeDto("DARK", 1, "dark");
            DARK = colorSchemeDto2;
            ColorSchemeDto[] colorSchemeDtoArr = {colorSchemeDto, colorSchemeDto2};
            $VALUES = colorSchemeDtoArr;
            $ENTRIES = new asp(colorSchemeDtoArr);
            CREATOR = new a();
        }

        private ColorSchemeDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static ColorSchemeDto valueOf(String str) {
            return (ColorSchemeDto) Enum.valueOf(ColorSchemeDto.class, str);
        }

        public static ColorSchemeDto[] values() {
            return (ColorSchemeDto[]) $VALUES.clone();
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

    /* compiled from: BadgesBadgeStyleDto.kt */
    public static final class a implements Parcelable.Creator<BadgesBadgeStyleDto> {
        @Override // android.os.Parcelable.Creator
        public final BadgesBadgeStyleDto createFromParcel(Parcel parcel) {
            return new BadgesBadgeStyleDto(ColorSchemeDto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final BadgesBadgeStyleDto[] newArray(int i) {
            return new BadgesBadgeStyleDto[i];
        }
    }

    public BadgesBadgeStyleDto(ColorSchemeDto colorSchemeDto, String str, String str2) {
        this.colorScheme = colorSchemeDto;
        this.backgroundColor = str;
        this.textColor = str2;
    }

    public final String d() {
        return this.backgroundColor;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final ColorSchemeDto e() {
        return this.colorScheme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BadgesBadgeStyleDto)) {
            return false;
        }
        BadgesBadgeStyleDto badgesBadgeStyleDto = (BadgesBadgeStyleDto) obj;
        return this.colorScheme == badgesBadgeStyleDto.colorScheme && epx.f(this.backgroundColor, badgesBadgeStyleDto.backgroundColor) && epx.f(this.textColor, badgesBadgeStyleDto.textColor);
    }

    public final String f() {
        return this.textColor;
    }

    public final int hashCode() {
        int hashCode = this.colorScheme.hashCode() * 31;
        String str = this.backgroundColor;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.textColor;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BadgesBadgeStyleDto(colorScheme=");
        sb.append(this.colorScheme);
        sb.append(", backgroundColor=");
        sb.append(this.backgroundColor);
        sb.append(", textColor=");
        return ho8.a(sb, this.textColor, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.colorScheme.writeToParcel(parcel, i);
        parcel.writeString(this.backgroundColor);
        parcel.writeString(this.textColor);
    }

    public /* synthetic */ BadgesBadgeStyleDto(ColorSchemeDto colorSchemeDto, String str, String str2, int i, zcl zclVar) {
        this(colorSchemeDto, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
    }
}
