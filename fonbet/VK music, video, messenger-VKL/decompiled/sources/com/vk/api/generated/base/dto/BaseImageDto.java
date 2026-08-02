package com.vk.api.generated.base.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.shy;
import xsna.sn;
import xsna.tn;
import xsna.zcl;
import xsna.zrp;

/* compiled from: BaseImageDto.kt */
/* loaded from: classes14.dex */
public final class BaseImageDto implements Parcelable {
    public static final Parcelable.Creator<BaseImageDto> CREATOR = new a();

    @pmi0("height")
    private final int height;

    @pmi0("id")
    private final String id;

    @pmi0("is_base")
    private final Boolean isBase;

    @pmi0("theme")
    private final ThemeDto theme;

    @pmi0("url")
    private final String url;

    @pmi0("width")
    private final int width;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BaseImageDto.kt */
    public static final class ThemeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ThemeDto[] $VALUES;
        public static final Parcelable.Creator<ThemeDto> CREATOR;

        @pmi0("dark")
        public static final ThemeDto DARK;

        @pmi0("light")
        public static final ThemeDto LIGHT;
        private final String value;

        /* compiled from: BaseImageDto.kt */
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

        public static zrp<ThemeDto> i() {
            return $ENTRIES;
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

        public final String j() {
            return this.value;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* compiled from: BaseImageDto.kt */
    public static final class a implements Parcelable.Creator<BaseImageDto> {
        @Override // android.os.Parcelable.Creator
        public final BaseImageDto createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            String readString2 = parcel.readString();
            Boolean bool = null;
            ThemeDto createFromParcel = parcel.readInt() == 0 ? null : ThemeDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new BaseImageDto(readString, readInt, readInt2, readString2, createFromParcel, bool);
        }

        @Override // android.os.Parcelable.Creator
        public final BaseImageDto[] newArray(int i) {
            return new BaseImageDto[i];
        }
    }

    public BaseImageDto(String str, int i, int i2, String str2, ThemeDto themeDto, Boolean bool) {
        this.url = str;
        this.width = i;
        this.height = i2;
        this.id = str2;
        this.theme = themeDto;
        this.isBase = bool;
    }

    public final ThemeDto d() {
        return this.theme;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Boolean e() {
        return this.isBase;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseImageDto)) {
            return false;
        }
        BaseImageDto baseImageDto = (BaseImageDto) obj;
        return epx.f(this.url, baseImageDto.url) && this.width == baseImageDto.width && this.height == baseImageDto.height && epx.f(this.id, baseImageDto.id) && this.theme == baseImageDto.theme && epx.f(this.isBase, baseImageDto.isBase);
    }

    public final int getHeight() {
        return this.height;
    }

    public final String getId() {
        return this.id;
    }

    public final String getUrl() {
        return this.url;
    }

    public final int getWidth() {
        return this.width;
    }

    public final int hashCode() {
        int a2 = shy.a(this.height, shy.a(this.width, this.url.hashCode() * 31, 31), 31);
        String str = this.id;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        ThemeDto themeDto = this.theme;
        int hashCode2 = (hashCode + (themeDto == null ? 0 : themeDto.hashCode())) * 31;
        Boolean bool = this.isBase;
        return hashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseImageDto(url=");
        sb.append(this.url);
        sb.append(", width=");
        sb.append(this.width);
        sb.append(", height=");
        sb.append(this.height);
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", theme=");
        sb.append(this.theme);
        sb.append(", isBase=");
        return tn.a(sb, this.isBase, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.url);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeString(this.id);
        ThemeDto themeDto = this.theme;
        if (themeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            themeDto.writeToParcel(parcel, i);
        }
        Boolean bool = this.isBase;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
    }

    public /* synthetic */ BaseImageDto(String str, int i, int i2, String str2, ThemeDto themeDto, Boolean bool, int i3, zcl zclVar) {
        this(str, i, i2, (i3 & 8) != 0 ? null : str2, (i3 & 16) != 0 ? null : themeDto, (i3 & 32) != 0 ? null : bool);
    }
}
