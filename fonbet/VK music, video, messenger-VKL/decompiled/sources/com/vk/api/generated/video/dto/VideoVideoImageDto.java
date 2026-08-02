package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BasePropertyExistsDto;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.shy;
import xsna.sn;
import xsna.tn;
import xsna.zcl;
import xsna.zrp;

/* compiled from: VideoVideoImageDto.kt */
/* loaded from: classes15.dex */
public final class VideoVideoImageDto implements Parcelable {
    public static final Parcelable.Creator<VideoVideoImageDto> CREATOR = new a();

    @pmi0("height")
    private final int height;

    @pmi0("id")
    private final String id;

    @pmi0("is_base")
    private final Boolean isBase;

    @pmi0("size")
    private final String size;

    @pmi0("theme")
    private final ThemeDto theme;

    @pmi0("url")
    private final String url;

    @pmi0("width")
    private final int width;

    @pmi0("with_padding")
    private final BasePropertyExistsDto withPadding;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VideoVideoImageDto.kt */
    public static final class ThemeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ThemeDto[] $VALUES;
        public static final Parcelable.Creator<ThemeDto> CREATOR;

        @pmi0("dark")
        public static final ThemeDto DARK;

        @pmi0("light")
        public static final ThemeDto LIGHT;
        private final String value;

        /* compiled from: VideoVideoImageDto.kt */
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

    /* compiled from: VideoVideoImageDto.kt */
    public static final class a implements Parcelable.Creator<VideoVideoImageDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoVideoImageDto createFromParcel(Parcel parcel) {
            ThemeDto themeDto;
            Boolean valueOf;
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            BasePropertyExistsDto createFromParcel = parcel.readInt() == 0 ? null : BasePropertyExistsDto.CREATOR.createFromParcel(parcel);
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            ThemeDto createFromParcel2 = parcel.readInt() == 0 ? null : ThemeDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                valueOf = null;
                themeDto = createFromParcel2;
            } else {
                themeDto = createFromParcel2;
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new VideoVideoImageDto(readString, readInt, readInt2, createFromParcel, readString2, readString3, themeDto, valueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final VideoVideoImageDto[] newArray(int i) {
            return new VideoVideoImageDto[i];
        }
    }

    public VideoVideoImageDto(String str, int i, int i2, BasePropertyExistsDto basePropertyExistsDto, String str2, String str3, ThemeDto themeDto, Boolean bool) {
        this.url = str;
        this.width = i;
        this.height = i2;
        this.withPadding = basePropertyExistsDto;
        this.size = str2;
        this.id = str3;
        this.theme = themeDto;
        this.isBase = bool;
    }

    public final BasePropertyExistsDto d() {
        return this.withPadding;
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
        if (!(obj instanceof VideoVideoImageDto)) {
            return false;
        }
        VideoVideoImageDto videoVideoImageDto = (VideoVideoImageDto) obj;
        return epx.f(this.url, videoVideoImageDto.url) && this.width == videoVideoImageDto.width && this.height == videoVideoImageDto.height && this.withPadding == videoVideoImageDto.withPadding && epx.f(this.size, videoVideoImageDto.size) && epx.f(this.id, videoVideoImageDto.id) && this.theme == videoVideoImageDto.theme && epx.f(this.isBase, videoVideoImageDto.isBase);
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
        int a2 = shy.a(this.height, shy.a(this.width, this.url.hashCode() * 31, 31), 31);
        BasePropertyExistsDto basePropertyExistsDto = this.withPadding;
        int hashCode = (a2 + (basePropertyExistsDto == null ? 0 : basePropertyExistsDto.hashCode())) * 31;
        String str = this.size;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.id;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ThemeDto themeDto = this.theme;
        int hashCode4 = (hashCode3 + (themeDto == null ? 0 : themeDto.hashCode())) * 31;
        Boolean bool = this.isBase;
        return hashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoVideoImageDto(url=");
        sb.append(this.url);
        sb.append(", width=");
        sb.append(this.width);
        sb.append(", height=");
        sb.append(this.height);
        sb.append(", withPadding=");
        sb.append(this.withPadding);
        sb.append(", size=");
        sb.append(this.size);
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
        BasePropertyExistsDto basePropertyExistsDto = this.withPadding;
        if (basePropertyExistsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            basePropertyExistsDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.size);
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

    public /* synthetic */ VideoVideoImageDto(String str, int i, int i2, BasePropertyExistsDto basePropertyExistsDto, String str2, String str3, ThemeDto themeDto, Boolean bool, int i3, zcl zclVar) {
        this(str, i, i2, (i3 & 8) != 0 ? null : basePropertyExistsDto, (i3 & 16) != 0 ? null : str2, (i3 & 32) != 0 ? null : str3, (i3 & 64) != 0 ? null : themeDto, (i3 & 128) != 0 ? null : bool);
    }
}
