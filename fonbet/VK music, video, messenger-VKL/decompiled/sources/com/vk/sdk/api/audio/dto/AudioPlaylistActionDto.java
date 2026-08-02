package com.vk.sdk.api.audio.dto;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: AudioPlaylistActionDto.kt */
/* loaded from: classes5.dex */
public final class AudioPlaylistActionDto {

    @pmi0("location")
    private final LocationDto location;

    @pmi0("type")
    private final TypeDto type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AudioPlaylistActionDto.kt */
    public static final class LocationDto {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ LocationDto[] $VALUES;

        @pmi0("banner")
        public static final LocationDto BANNER;

        @pmi0("button")
        public static final LocationDto BUTTON;

        @pmi0("more_menu")
        public static final LocationDto MORE_MENU;
        private final String value;

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
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AudioPlaylistActionDto.kt */
    public static final class TypeDto {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;

        @pmi0("add")
        public static final TypeDto ADD;

        @pmi0("shareBanner")
        public static final TypeDto SHAREBANNER;
        private final String value;

        static {
            TypeDto typeDto = new TypeDto("ADD", 0, "add");
            ADD = typeDto;
            TypeDto typeDto2 = new TypeDto("SHAREBANNER", 1, "shareBanner");
            SHAREBANNER = typeDto2;
            TypeDto[] typeDtoArr = {typeDto, typeDto2};
            $VALUES = typeDtoArr;
            $ENTRIES = new asp(typeDtoArr);
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
    }

    public AudioPlaylistActionDto(TypeDto typeDto, LocationDto locationDto) {
        this.type = typeDto;
        this.location = locationDto;
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
        return "AudioPlaylistActionDto(type=" + this.type + ", location=" + this.location + ")";
    }
}
