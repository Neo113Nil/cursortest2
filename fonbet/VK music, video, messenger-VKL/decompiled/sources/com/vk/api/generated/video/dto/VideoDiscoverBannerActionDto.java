package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: VideoDiscoverBannerActionDto.kt */
/* loaded from: classes15.dex */
public final class VideoDiscoverBannerActionDto implements Parcelable {
    public static final Parcelable.Creator<VideoDiscoverBannerActionDto> CREATOR = new a();

    @pmi0("target")
    private final String target;

    @pmi0("type")
    private final TypeDto type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VideoDiscoverBannerActionDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;
        public static final Parcelable.Creator<TypeDto> CREATOR;

        @pmi0("open_section")
        public static final TypeDto OPEN_SECTION;

        @pmi0("open_url")
        public static final TypeDto OPEN_URL;
        private final String value;

        /* compiled from: VideoDiscoverBannerActionDto.kt */
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
            TypeDto typeDto = new TypeDto("OPEN_URL", 0, "open_url");
            OPEN_URL = typeDto;
            TypeDto typeDto2 = new TypeDto("OPEN_SECTION", 1, "open_section");
            OPEN_SECTION = typeDto2;
            TypeDto[] typeDtoArr = {typeDto, typeDto2};
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

    /* compiled from: VideoDiscoverBannerActionDto.kt */
    public static final class a implements Parcelable.Creator<VideoDiscoverBannerActionDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoDiscoverBannerActionDto createFromParcel(Parcel parcel) {
            return new VideoDiscoverBannerActionDto(TypeDto.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoDiscoverBannerActionDto[] newArray(int i) {
            return new VideoDiscoverBannerActionDto[i];
        }
    }

    public VideoDiscoverBannerActionDto(TypeDto typeDto, String str) {
        this.type = typeDto;
        this.target = str;
    }

    public final String d() {
        return this.target;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final TypeDto e() {
        return this.type;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoDiscoverBannerActionDto)) {
            return false;
        }
        VideoDiscoverBannerActionDto videoDiscoverBannerActionDto = (VideoDiscoverBannerActionDto) obj;
        return this.type == videoDiscoverBannerActionDto.type && epx.f(this.target, videoDiscoverBannerActionDto.target);
    }

    public final int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        String str = this.target;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoDiscoverBannerActionDto(type=");
        sb.append(this.type);
        sb.append(", target=");
        return ho8.a(sb, this.target, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.type.writeToParcel(parcel, i);
        parcel.writeString(this.target);
    }

    public /* synthetic */ VideoDiscoverBannerActionDto(TypeDto typeDto, String str, int i, zcl zclVar) {
        this(typeDto, (i & 2) != 0 ? null : str);
    }
}
