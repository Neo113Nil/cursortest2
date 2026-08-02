package com.vk.api.generated.gifts.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: GiftsAnimationSourceDto.kt */
/* loaded from: classes14.dex */
public final class GiftsAnimationSourceDto implements Parcelable {
    public static final Parcelable.Creator<GiftsAnimationSourceDto> CREATOR = new a();

    @pmi0("theme")
    private final ThemeDto theme;

    @pmi0("url")
    private final String url;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GiftsAnimationSourceDto.kt */
    public static final class ThemeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ThemeDto[] $VALUES;
        public static final Parcelable.Creator<ThemeDto> CREATOR;

        @pmi0("dark")
        public static final ThemeDto DARK;

        @pmi0("light")
        public static final ThemeDto LIGHT;
        private final String value;

        /* compiled from: GiftsAnimationSourceDto.kt */
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

    /* compiled from: GiftsAnimationSourceDto.kt */
    public static final class a implements Parcelable.Creator<GiftsAnimationSourceDto> {
        @Override // android.os.Parcelable.Creator
        public final GiftsAnimationSourceDto createFromParcel(Parcel parcel) {
            return new GiftsAnimationSourceDto(parcel.readString(), parcel.readInt() == 0 ? null : ThemeDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final GiftsAnimationSourceDto[] newArray(int i) {
            return new GiftsAnimationSourceDto[i];
        }
    }

    public GiftsAnimationSourceDto(String str, ThemeDto themeDto) {
        this.url = str;
        this.theme = themeDto;
    }

    public final ThemeDto d() {
        return this.theme;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GiftsAnimationSourceDto)) {
            return false;
        }
        GiftsAnimationSourceDto giftsAnimationSourceDto = (GiftsAnimationSourceDto) obj;
        return epx.f(this.url, giftsAnimationSourceDto.url) && this.theme == giftsAnimationSourceDto.theme;
    }

    public final String getUrl() {
        return this.url;
    }

    public final int hashCode() {
        int hashCode = this.url.hashCode() * 31;
        ThemeDto themeDto = this.theme;
        return hashCode + (themeDto == null ? 0 : themeDto.hashCode());
    }

    public final String toString() {
        return "GiftsAnimationSourceDto(url=" + this.url + ", theme=" + this.theme + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.url);
        ThemeDto themeDto = this.theme;
        if (themeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            themeDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ GiftsAnimationSourceDto(String str, ThemeDto themeDto, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : themeDto);
    }
}
