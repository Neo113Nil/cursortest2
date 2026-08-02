package com.vk.api.generated.audio.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: AudioPlaylistActionDto.kt */
/* loaded from: classes14.dex */
public final class AudioPlaylistActionDto implements Parcelable {
    public static final Parcelable.Creator<AudioPlaylistActionDto> CREATOR = new a();

    @pmi0("location")
    private final LocationDto location;

    @pmi0("type")
    private final TypeDto type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AudioPlaylistActionDto.kt */
    public static final class LocationDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ LocationDto[] $VALUES;

        @pmi0("banner")
        public static final LocationDto BANNER;

        @pmi0("button")
        public static final LocationDto BUTTON;
        public static final Parcelable.Creator<LocationDto> CREATOR;

        @pmi0("more_menu")
        public static final LocationDto MORE_MENU;
        private final String value;

        /* compiled from: AudioPlaylistActionDto.kt */
        public static final class a implements Parcelable.Creator<LocationDto> {
            @Override // android.os.Parcelable.Creator
            public final LocationDto createFromParcel(Parcel parcel) {
                return LocationDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final LocationDto[] newArray(int i) {
                return new LocationDto[i];
            }
        }

        static {
            LocationDto locationDto = new LocationDto("MORE_MENU", 0, "more_menu");
            MORE_MENU = locationDto;
            LocationDto locationDto2 = new LocationDto("BUTTON", 1, "button");
            BUTTON = locationDto2;
            LocationDto locationDto3 = new LocationDto("BANNER", 2, "banner");
            BANNER = locationDto3;
            LocationDto[] locationDtoArr = {locationDto, locationDto2, locationDto3};
            $VALUES = locationDtoArr;
            $ENTRIES = new asp(locationDtoArr);
            CREATOR = new a();
        }

        private LocationDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static LocationDto valueOf(String str) {
            return (LocationDto) Enum.valueOf(LocationDto.class, str);
        }

        public static LocationDto[] values() {
            return (LocationDto[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String i() {
            return this.value;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AudioPlaylistActionDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;

        @pmi0("add")
        public static final TypeDto ADD;
        public static final Parcelable.Creator<TypeDto> CREATOR;

        @pmi0("shareBanner")
        public static final TypeDto SHAREBANNER;
        private final String value;

        /* compiled from: AudioPlaylistActionDto.kt */
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
            TypeDto typeDto = new TypeDto("ADD", 0, "add");
            ADD = typeDto;
            TypeDto typeDto2 = new TypeDto("SHAREBANNER", 1, "shareBanner");
            SHAREBANNER = typeDto2;
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

        public final String i() {
            return this.value;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* compiled from: AudioPlaylistActionDto.kt */
    public static final class a implements Parcelable.Creator<AudioPlaylistActionDto> {
        @Override // android.os.Parcelable.Creator
        public final AudioPlaylistActionDto createFromParcel(Parcel parcel) {
            return new AudioPlaylistActionDto(TypeDto.CREATOR.createFromParcel(parcel), LocationDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final AudioPlaylistActionDto[] newArray(int i) {
            return new AudioPlaylistActionDto[i];
        }
    }

    public AudioPlaylistActionDto(TypeDto typeDto, LocationDto locationDto) {
        this.type = typeDto;
        this.location = locationDto;
    }

    public final LocationDto d() {
        return this.location;
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
        if (!(obj instanceof AudioPlaylistActionDto)) {
            return false;
        }
        AudioPlaylistActionDto audioPlaylistActionDto = (AudioPlaylistActionDto) obj;
        return this.type == audioPlaylistActionDto.type && this.location == audioPlaylistActionDto.location;
    }

    public final int hashCode() {
        return this.location.hashCode() + (this.type.hashCode() * 31);
    }

    public final String toString() {
        return "AudioPlaylistActionDto(type=" + this.type + ", location=" + this.location + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.type.writeToParcel(parcel, i);
        this.location.writeToParcel(parcel, i);
    }
}
