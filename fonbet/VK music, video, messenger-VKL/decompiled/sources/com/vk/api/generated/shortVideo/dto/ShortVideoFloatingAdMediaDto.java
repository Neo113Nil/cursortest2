package com.vk.api.generated.shortVideo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.internal.bind.TreeTypeAdapter;
import xsna.a9y;
import xsna.asp;
import xsna.b9y;
import xsna.epx;
import xsna.go9;
import xsna.nr;
import xsna.pmi0;
import xsna.shy;
import xsna.sn;
import xsna.tn;
import xsna.up;
import xsna.uqi;
import xsna.urd0;
import xsna.z8y;
import xsna.zcl;
import xsna.zrp;

/* compiled from: ShortVideoFloatingAdMediaDto.kt */
/* loaded from: classes15.dex */
public abstract class ShortVideoFloatingAdMediaDto implements Parcelable {

    /* compiled from: ShortVideoFloatingAdMediaDto.kt */
    public static final class Deserializer implements a9y<ShortVideoFloatingAdMediaDto> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            String f = up.f(b9yVar, "type");
            if (epx.f(f, "animation")) {
                return (ShortVideoFloatingAdMediaDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, ShortVideoFloatingAdAnimationDto.class);
            }
            if (epx.f(f, "image")) {
                return (ShortVideoFloatingAdMediaDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, ShortVideoFloatingAdImageDto.class);
            }
            throw new IllegalStateException(go9.b("no mapping for the type:", f));
        }
    }

    /* compiled from: ShortVideoFloatingAdMediaDto.kt */
    public static final class ShortVideoFloatingAdAnimationDto extends ShortVideoFloatingAdMediaDto implements Parcelable {
        public static final Parcelable.Creator<ShortVideoFloatingAdAnimationDto> CREATOR = new a();

        @pmi0("delay")
        private final Integer delay;

        @pmi0("duration")
        private final int duration;

        @pmi0("height")
        private final int height;

        @pmi0("type")
        private final TypeDto type;

        @pmi0("url")
        private final String url;

        @pmi0("width")
        private final int width;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: ShortVideoFloatingAdMediaDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;

            @pmi0("animation")
            public static final TypeDto ANIMATION;
            public static final Parcelable.Creator<TypeDto> CREATOR;
            private final String value;

            /* compiled from: ShortVideoFloatingAdMediaDto.kt */
            public static final class a implements Parcelable.Creator<TypeDto> {
                @Override // android.os.Parcelable.Creator
                public final TypeDto createFromParcel(Parcel parcel) {
                    return TypeDto.valueOf(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final TypeDto[] newArray(int i) {
                    return new TypeDto[i];
                }
            }

            static {
                TypeDto typeDto = new TypeDto("ANIMATION", 0, "animation");
                ANIMATION = typeDto;
                TypeDto[] typeDtoArr = {typeDto};
                $VALUES = typeDtoArr;
                $ENTRIES = new asp(typeDtoArr);
                CREATOR = new a();
            }

            private TypeDto(String str, int i, String str2) {
                this.value = str2;
            }

            public static TypeDto valueOf(String str) {
                return (TypeDto) Enum.valueOf(TypeDto.class, str);
            }

            public static TypeDto[] values() {
                return (TypeDto[]) $VALUES.clone();
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

        /* compiled from: ShortVideoFloatingAdMediaDto.kt */
        public static final class a implements Parcelable.Creator<ShortVideoFloatingAdAnimationDto> {
            @Override // android.os.Parcelable.Creator
            public final ShortVideoFloatingAdAnimationDto createFromParcel(Parcel parcel) {
                return new ShortVideoFloatingAdAnimationDto(TypeDto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            }

            @Override // android.os.Parcelable.Creator
            public final ShortVideoFloatingAdAnimationDto[] newArray(int i) {
                return new ShortVideoFloatingAdAnimationDto[i];
            }
        }

        public /* synthetic */ ShortVideoFloatingAdAnimationDto(TypeDto typeDto, String str, int i, int i2, int i3, Integer num, int i4, zcl zclVar) {
            this(typeDto, str, i, i2, i3, (i4 & 32) != 0 ? null : num);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShortVideoFloatingAdAnimationDto)) {
                return false;
            }
            ShortVideoFloatingAdAnimationDto shortVideoFloatingAdAnimationDto = (ShortVideoFloatingAdAnimationDto) obj;
            return this.type == shortVideoFloatingAdAnimationDto.type && epx.f(this.url, shortVideoFloatingAdAnimationDto.url) && this.duration == shortVideoFloatingAdAnimationDto.duration && this.width == shortVideoFloatingAdAnimationDto.width && this.height == shortVideoFloatingAdAnimationDto.height && epx.f(this.delay, shortVideoFloatingAdAnimationDto.delay);
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
            int a2 = shy.a(this.height, shy.a(this.width, shy.a(this.duration, urd0.a(this.type.hashCode() * 31, 31, this.url), 31), 31), 31);
            Integer num = this.delay;
            return a2 + (num == null ? 0 : num.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ShortVideoFloatingAdAnimationDto(type=");
            sb.append(this.type);
            sb.append(", url=");
            sb.append(this.url);
            sb.append(", duration=");
            sb.append(this.duration);
            sb.append(", width=");
            sb.append(this.width);
            sb.append(", height=");
            sb.append(this.height);
            sb.append(", delay=");
            return uqi.b(sb, this.delay, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            parcel.writeString(this.url);
            parcel.writeInt(this.duration);
            parcel.writeInt(this.width);
            parcel.writeInt(this.height);
            Integer num = this.delay;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num);
            }
        }

        public ShortVideoFloatingAdAnimationDto(TypeDto typeDto, String str, int i, int i2, int i3, Integer num) {
            super(null);
            this.type = typeDto;
            this.url = str;
            this.duration = i;
            this.width = i2;
            this.height = i3;
            this.delay = num;
        }
    }

    /* compiled from: ShortVideoFloatingAdMediaDto.kt */
    public static final class ShortVideoFloatingAdImageDto extends ShortVideoFloatingAdMediaDto implements Parcelable {
        public static final Parcelable.Creator<ShortVideoFloatingAdImageDto> CREATOR = new a();

        @pmi0("height")
        private final int height;

        @pmi0("id")
        private final String id;

        @pmi0("is_base")
        private final Boolean isBase;

        @pmi0("theme")
        private final ThemeDto theme;

        @pmi0("type")
        private final TypeDto type;

        @pmi0("url")
        private final String url;

        @pmi0("width")
        private final int width;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: ShortVideoFloatingAdMediaDto.kt */
        public static final class ThemeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ ThemeDto[] $VALUES;
            public static final Parcelable.Creator<ThemeDto> CREATOR;

            @pmi0("dark")
            public static final ThemeDto DARK;

            @pmi0("light")
            public static final ThemeDto LIGHT;
            private final String value;

            /* compiled from: ShortVideoFloatingAdMediaDto.kt */
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

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: ShortVideoFloatingAdMediaDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("image")
            public static final TypeDto IMAGE;
            private final String value;

            /* compiled from: ShortVideoFloatingAdMediaDto.kt */
            public static final class a implements Parcelable.Creator<TypeDto> {
                @Override // android.os.Parcelable.Creator
                public final TypeDto createFromParcel(Parcel parcel) {
                    return TypeDto.valueOf(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final TypeDto[] newArray(int i) {
                    return new TypeDto[i];
                }
            }

            static {
                TypeDto typeDto = new TypeDto("IMAGE", 0, "image");
                IMAGE = typeDto;
                TypeDto[] typeDtoArr = {typeDto};
                $VALUES = typeDtoArr;
                $ENTRIES = new asp(typeDtoArr);
                CREATOR = new a();
            }

            private TypeDto(String str, int i, String str2) {
                this.value = str2;
            }

            public static TypeDto valueOf(String str) {
                return (TypeDto) Enum.valueOf(TypeDto.class, str);
            }

            public static TypeDto[] values() {
                return (TypeDto[]) $VALUES.clone();
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

        /* compiled from: ShortVideoFloatingAdMediaDto.kt */
        public static final class a implements Parcelable.Creator<ShortVideoFloatingAdImageDto> {
            @Override // android.os.Parcelable.Creator
            public final ShortVideoFloatingAdImageDto createFromParcel(Parcel parcel) {
                TypeDto createFromParcel = TypeDto.CREATOR.createFromParcel(parcel);
                String readString = parcel.readString();
                int readInt = parcel.readInt();
                int readInt2 = parcel.readInt();
                String readString2 = parcel.readString();
                Boolean bool = null;
                ThemeDto createFromParcel2 = parcel.readInt() == 0 ? null : ThemeDto.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() != 0) {
                    bool = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new ShortVideoFloatingAdImageDto(createFromParcel, readString, readInt, readInt2, readString2, createFromParcel2, bool);
            }

            @Override // android.os.Parcelable.Creator
            public final ShortVideoFloatingAdImageDto[] newArray(int i) {
                return new ShortVideoFloatingAdImageDto[i];
            }
        }

        public /* synthetic */ ShortVideoFloatingAdImageDto(TypeDto typeDto, String str, int i, int i2, String str2, ThemeDto themeDto, Boolean bool, int i3, zcl zclVar) {
            this(typeDto, str, i, i2, (i3 & 16) != 0 ? null : str2, (i3 & 32) != 0 ? null : themeDto, (i3 & 64) != 0 ? null : bool);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShortVideoFloatingAdImageDto)) {
                return false;
            }
            ShortVideoFloatingAdImageDto shortVideoFloatingAdImageDto = (ShortVideoFloatingAdImageDto) obj;
            return this.type == shortVideoFloatingAdImageDto.type && epx.f(this.url, shortVideoFloatingAdImageDto.url) && this.width == shortVideoFloatingAdImageDto.width && this.height == shortVideoFloatingAdImageDto.height && epx.f(this.id, shortVideoFloatingAdImageDto.id) && this.theme == shortVideoFloatingAdImageDto.theme && epx.f(this.isBase, shortVideoFloatingAdImageDto.isBase);
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
            int a2 = shy.a(this.height, shy.a(this.width, urd0.a(this.type.hashCode() * 31, 31, this.url), 31), 31);
            String str = this.id;
            int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
            ThemeDto themeDto = this.theme;
            int hashCode2 = (hashCode + (themeDto == null ? 0 : themeDto.hashCode())) * 31;
            Boolean bool = this.isBase;
            return hashCode2 + (bool != null ? bool.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ShortVideoFloatingAdImageDto(type=");
            sb.append(this.type);
            sb.append(", url=");
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
            this.type.writeToParcel(parcel, i);
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

        public ShortVideoFloatingAdImageDto(TypeDto typeDto, String str, int i, int i2, String str2, ThemeDto themeDto, Boolean bool) {
            super(null);
            this.type = typeDto;
            this.url = str;
            this.width = i;
            this.height = i2;
            this.id = str2;
            this.theme = themeDto;
            this.isBase = bool;
        }
    }

    public /* synthetic */ ShortVideoFloatingAdMediaDto(zcl zclVar) {
        this();
    }

    private ShortVideoFloatingAdMediaDto() {
    }
}
