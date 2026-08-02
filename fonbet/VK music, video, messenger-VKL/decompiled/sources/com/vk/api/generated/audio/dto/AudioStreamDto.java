package com.vk.api.generated.audio.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;
import xsna.zrp;

/* compiled from: AudioStreamDto.kt */
/* loaded from: classes14.dex */
public final class AudioStreamDto implements Parcelable {
    public static final Parcelable.Creator<AudioStreamDto> CREATOR = new a();

    @pmi0("fallback_url")
    private final String fallbackUrl;

    @pmi0("type")
    private final TypeDto type;

    @pmi0("url")
    private final String url;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AudioStreamDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;
        public static final Parcelable.Creator<TypeDto> CREATOR;

        @pmi0("dash")
        public static final TypeDto DASH;

        @pmi0("hls")
        public static final TypeDto HLS;

        @pmi0("hls_range")
        public static final TypeDto HLS_RANGE;

        @pmi0("hls_ts")
        public static final TypeDto HLS_TS;

        @pmi0("mp3")
        public static final TypeDto MP3;
        private final String value;

        /* compiled from: AudioStreamDto.kt */
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
            TypeDto typeDto = new TypeDto("MP3", 0, "mp3");
            MP3 = typeDto;
            TypeDto typeDto2 = new TypeDto("HLS", 1, "hls");
            HLS = typeDto2;
            TypeDto typeDto3 = new TypeDto("HLS_RANGE", 2, "hls_range");
            HLS_RANGE = typeDto3;
            TypeDto typeDto4 = new TypeDto("HLS_TS", 3, "hls_ts");
            HLS_TS = typeDto4;
            TypeDto typeDto5 = new TypeDto("DASH", 4, "dash");
            DASH = typeDto5;
            TypeDto[] typeDtoArr = {typeDto, typeDto2, typeDto3, typeDto4, typeDto5};
            $VALUES = typeDtoArr;
            $ENTRIES = new asp(typeDtoArr);
            CREATOR = new a();
        }

        private TypeDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static zrp<TypeDto> i() {
            return $ENTRIES;
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

        public final String j() {
            return this.value;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* compiled from: AudioStreamDto.kt */
    public static final class a implements Parcelable.Creator<AudioStreamDto> {
        @Override // android.os.Parcelable.Creator
        public final AudioStreamDto createFromParcel(Parcel parcel) {
            return new AudioStreamDto(TypeDto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AudioStreamDto[] newArray(int i) {
            return new AudioStreamDto[i];
        }
    }

    public AudioStreamDto(TypeDto typeDto, String str, String str2) {
        this.type = typeDto;
        this.url = str;
        this.fallbackUrl = str2;
    }

    public final String d() {
        return this.fallbackUrl;
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
        if (!(obj instanceof AudioStreamDto)) {
            return false;
        }
        AudioStreamDto audioStreamDto = (AudioStreamDto) obj;
        return this.type == audioStreamDto.type && epx.f(this.url, audioStreamDto.url) && epx.f(this.fallbackUrl, audioStreamDto.fallbackUrl);
    }

    public final String getUrl() {
        return this.url;
    }

    public final int hashCode() {
        return this.fallbackUrl.hashCode() + urd0.a(this.type.hashCode() * 31, 31, this.url);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioStreamDto(type=");
        sb.append(this.type);
        sb.append(", url=");
        sb.append(this.url);
        sb.append(", fallbackUrl=");
        return ho8.a(sb, this.fallbackUrl, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.type.writeToParcel(parcel, i);
        parcel.writeString(this.url);
        parcel.writeString(this.fallbackUrl);
    }
}
