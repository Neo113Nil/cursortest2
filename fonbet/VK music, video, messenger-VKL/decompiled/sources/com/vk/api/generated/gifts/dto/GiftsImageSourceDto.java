package com.vk.api.generated.gifts.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.shy;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: GiftsImageSourceDto.kt */
/* loaded from: classes14.dex */
public final class GiftsImageSourceDto implements Parcelable {
    public static final Parcelable.Creator<GiftsImageSourceDto> CREATOR = new a();

    @pmi0("height")
    private final int height;

    @pmi0("theme")
    private final ThemeDto theme;

    @pmi0("url")
    private final String url;

    @pmi0("width")
    private final int width;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GiftsImageSourceDto.kt */
    public static final class ThemeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ThemeDto[] $VALUES;
        public static final Parcelable.Creator<ThemeDto> CREATOR;

        @pmi0("dark")
        public static final ThemeDto DARK;

        @pmi0("light")
        public static final ThemeDto LIGHT;
        private final String value;

        /* compiled from: GiftsImageSourceDto.kt */
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

    /* compiled from: GiftsImageSourceDto.kt */
    public static final class a implements Parcelable.Creator<GiftsImageSourceDto> {
        @Override // android.os.Parcelable.Creator
        public final GiftsImageSourceDto createFromParcel(Parcel parcel) {
            return new GiftsImageSourceDto(parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readInt() == 0 ? null : ThemeDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final GiftsImageSourceDto[] newArray(int i) {
            return new GiftsImageSourceDto[i];
        }
    }

    public GiftsImageSourceDto(int i, int i2, String str, ThemeDto themeDto) {
        this.width = i;
        this.height = i2;
        this.url = str;
        this.theme = themeDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GiftsImageSourceDto)) {
            return false;
        }
        GiftsImageSourceDto giftsImageSourceDto = (GiftsImageSourceDto) obj;
        return this.width == giftsImageSourceDto.width && this.height == giftsImageSourceDto.height && epx.f(this.url, giftsImageSourceDto.url) && this.theme == giftsImageSourceDto.theme;
    }

    public final int getHeight() {
        return this.height;
    }

    public final String getUrl() {
        return this.url;
    }

    public final int getWidth() {
        return this.width;
    }

    public final int hashCode() {
        int a2 = urd0.a(shy.a(this.height, Integer.hashCode(this.width) * 31, 31), 31, this.url);
        ThemeDto themeDto = this.theme;
        return a2 + (themeDto == null ? 0 : themeDto.hashCode());
    }

    public final String toString() {
        return "GiftsImageSourceDto(width=" + this.width + ", height=" + this.height + ", url=" + this.url + ", theme=" + this.theme + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeString(this.url);
        ThemeDto themeDto = this.theme;
        if (themeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            themeDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ GiftsImageSourceDto(int i, int i2, String str, ThemeDto themeDto, int i3, zcl zclVar) {
        this(i, i2, str, (i3 & 8) != 0 ? null : themeDto);
    }
}
