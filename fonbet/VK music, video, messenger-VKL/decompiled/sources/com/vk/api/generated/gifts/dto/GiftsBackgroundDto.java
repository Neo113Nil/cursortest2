package com.vk.api.generated.gifts.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: GiftsBackgroundDto.kt */
/* loaded from: classes14.dex */
public final class GiftsBackgroundDto implements Parcelable {
    public static final Parcelable.Creator<GiftsBackgroundDto> CREATOR = new a();

    @pmi0("color")
    private final String color;

    @pmi0("image")
    private final GiftsImageDto image;

    @pmi0("theme")
    private final ThemeDto theme;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GiftsBackgroundDto.kt */
    public static final class ThemeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ThemeDto[] $VALUES;
        public static final Parcelable.Creator<ThemeDto> CREATOR;

        @pmi0("dark")
        public static final ThemeDto DARK;

        @pmi0("light")
        public static final ThemeDto LIGHT;
        private final String value;

        /* compiled from: GiftsBackgroundDto.kt */
        public static final class a implements Parcelable.Creator<ThemeDto> {
            @Override // android.os.Parcelable.Creator
            public final ThemeDto createFromParcel(Parcel parcel) {
                return ThemeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ThemeDto[] newArray(int i) {
                return new ThemeDto[i];
            }
        }

        static {
            ThemeDto themeDto = new ThemeDto("LIGHT", 0, "light");
            LIGHT = themeDto;
            ThemeDto themeDto2 = new ThemeDto("DARK", 1, "dark");
            DARK = themeDto2;
            ThemeDto[] themeDtoArr = {themeDto, themeDto2};
            $VALUES = themeDtoArr;
            $ENTRIES = new asp(themeDtoArr);
            CREATOR = new a();
        }

        private ThemeDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static ThemeDto valueOf(String str) {
            return (ThemeDto) Enum.valueOf(ThemeDto.class, str);
        }

        public static ThemeDto[] values() {
            return (ThemeDto[]) $VALUES.clone();
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

    /* compiled from: GiftsBackgroundDto.kt */
    public static final class a implements Parcelable.Creator<GiftsBackgroundDto> {
        @Override // android.os.Parcelable.Creator
        public final GiftsBackgroundDto createFromParcel(Parcel parcel) {
            return new GiftsBackgroundDto(parcel.readString(), parcel.readInt() == 0 ? null : ThemeDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? GiftsImageDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final GiftsBackgroundDto[] newArray(int i) {
            return new GiftsBackgroundDto[i];
        }
    }

    public GiftsBackgroundDto(String str, ThemeDto themeDto, GiftsImageDto giftsImageDto) {
        this.color = str;
        this.theme = themeDto;
        this.image = giftsImageDto;
    }

    public final String d() {
        return this.color;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final GiftsImageDto e() {
        return this.image;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GiftsBackgroundDto)) {
            return false;
        }
        GiftsBackgroundDto giftsBackgroundDto = (GiftsBackgroundDto) obj;
        return epx.f(this.color, giftsBackgroundDto.color) && this.theme == giftsBackgroundDto.theme && epx.f(this.image, giftsBackgroundDto.image);
    }

    public final ThemeDto f() {
        return this.theme;
    }

    public final int hashCode() {
        int hashCode = this.color.hashCode() * 31;
        ThemeDto themeDto = this.theme;
        int hashCode2 = (hashCode + (themeDto == null ? 0 : themeDto.hashCode())) * 31;
        GiftsImageDto giftsImageDto = this.image;
        return hashCode2 + (giftsImageDto != null ? giftsImageDto.hashCode() : 0);
    }

    public final String toString() {
        return "GiftsBackgroundDto(color=" + this.color + ", theme=" + this.theme + ", image=" + this.image + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.color);
        ThemeDto themeDto = this.theme;
        if (themeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            themeDto.writeToParcel(parcel, i);
        }
        GiftsImageDto giftsImageDto = this.image;
        if (giftsImageDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            giftsImageDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ GiftsBackgroundDto(String str, ThemeDto themeDto, GiftsImageDto giftsImageDto, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : themeDto, (i & 4) != 0 ? null : giftsImageDto);
    }
}
