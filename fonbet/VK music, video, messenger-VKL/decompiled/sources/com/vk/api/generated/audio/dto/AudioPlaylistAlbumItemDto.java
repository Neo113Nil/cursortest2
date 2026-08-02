package com.vk.api.generated.audio.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.Ad;
import com.mbridge.msdk.MBridgeConstans;
import xsna.asp;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: AudioPlaylistAlbumItemDto.kt */
/* loaded from: classes14.dex */
public final class AudioPlaylistAlbumItemDto implements Parcelable {
    public static final Parcelable.Creator<AudioPlaylistAlbumItemDto> CREATOR = new a();

    @pmi0("type")
    private final TypeDto type;

    @pmi0(MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW)
    private final ViewDto view;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AudioPlaylistAlbumItemDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;

        @pmi0("album")
        public static final TypeDto ALBUM;

        @pmi0("collection")
        public static final TypeDto COLLECTION;
        public static final Parcelable.Creator<TypeDto> CREATOR;

        @pmi0("ep")
        public static final TypeDto EP;

        @pmi0(Ad.d)
        public static final TypeDto SINGLE;
        private final String value;

        /* compiled from: AudioPlaylistAlbumItemDto.kt */
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
            TypeDto typeDto = new TypeDto("ALBUM", 0, "album");
            ALBUM = typeDto;
            TypeDto typeDto2 = new TypeDto("EP", 1, "ep");
            EP = typeDto2;
            TypeDto typeDto3 = new TypeDto("COLLECTION", 2, "collection");
            COLLECTION = typeDto3;
            TypeDto typeDto4 = new TypeDto("SINGLE", 3, Ad.d);
            SINGLE = typeDto4;
            TypeDto[] typeDtoArr = {typeDto, typeDto2, typeDto3, typeDto4};
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

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AudioPlaylistAlbumItemDto.kt */
    public static final class ViewDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ViewDto[] $VALUES;

        @pmi0("collection")
        public static final ViewDto COLLECTION;
        public static final Parcelable.Creator<ViewDto> CREATOR;

        @pmi0("main_feat")
        public static final ViewDto MAIN_FEAT;

        @pmi0("main_only")
        public static final ViewDto MAIN_ONLY;

        @pmi0("playlist")
        public static final ViewDto PLAYLIST;
        private final String value;

        /* compiled from: AudioPlaylistAlbumItemDto.kt */
        public static final class a implements Parcelable.Creator<ViewDto> {
            @Override // android.os.Parcelable.Creator
            public final ViewDto createFromParcel(Parcel parcel) {
                return ViewDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ViewDto[] newArray(int i) {
                return new ViewDto[i];
            }
        }

        static {
            ViewDto viewDto = new ViewDto("PLAYLIST", 0, "playlist");
            PLAYLIST = viewDto;
            ViewDto viewDto2 = new ViewDto("MAIN_ONLY", 1, "main_only");
            MAIN_ONLY = viewDto2;
            ViewDto viewDto3 = new ViewDto("MAIN_FEAT", 2, "main_feat");
            MAIN_FEAT = viewDto3;
            ViewDto viewDto4 = new ViewDto("COLLECTION", 3, "collection");
            COLLECTION = viewDto4;
            ViewDto[] viewDtoArr = {viewDto, viewDto2, viewDto3, viewDto4};
            $VALUES = viewDtoArr;
            $ENTRIES = new asp(viewDtoArr);
            CREATOR = new a();
        }

        private ViewDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static ViewDto valueOf(String str) {
            return (ViewDto) Enum.valueOf(ViewDto.class, str);
        }

        public static ViewDto[] values() {
            return (ViewDto[]) $VALUES.clone();
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

    /* compiled from: AudioPlaylistAlbumItemDto.kt */
    public static final class a implements Parcelable.Creator<AudioPlaylistAlbumItemDto> {
        @Override // android.os.Parcelable.Creator
        public final AudioPlaylistAlbumItemDto createFromParcel(Parcel parcel) {
            return new AudioPlaylistAlbumItemDto(TypeDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ViewDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final AudioPlaylistAlbumItemDto[] newArray(int i) {
            return new AudioPlaylistAlbumItemDto[i];
        }
    }

    public AudioPlaylistAlbumItemDto(TypeDto typeDto, ViewDto viewDto) {
        this.type = typeDto;
        this.view = viewDto;
    }

    public final TypeDto d() {
        return this.type;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final ViewDto e() {
        return this.view;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioPlaylistAlbumItemDto)) {
            return false;
        }
        AudioPlaylistAlbumItemDto audioPlaylistAlbumItemDto = (AudioPlaylistAlbumItemDto) obj;
        return this.type == audioPlaylistAlbumItemDto.type && this.view == audioPlaylistAlbumItemDto.view;
    }

    public final int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        ViewDto viewDto = this.view;
        return hashCode + (viewDto == null ? 0 : viewDto.hashCode());
    }

    public final String toString() {
        return "AudioPlaylistAlbumItemDto(type=" + this.type + ", view=" + this.view + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.type.writeToParcel(parcel, i);
        ViewDto viewDto = this.view;
        if (viewDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            viewDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ AudioPlaylistAlbumItemDto(TypeDto typeDto, ViewDto viewDto, int i, zcl zclVar) {
        this(typeDto, (i & 2) != 0 ? null : viewDto);
    }
}
