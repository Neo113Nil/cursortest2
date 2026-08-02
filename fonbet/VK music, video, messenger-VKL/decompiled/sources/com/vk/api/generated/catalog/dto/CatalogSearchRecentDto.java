package com.vk.api.generated.catalog.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: CatalogSearchRecentDto.kt */
/* loaded from: classes14.dex */
public final class CatalogSearchRecentDto implements Parcelable {
    public static final Parcelable.Creator<CatalogSearchRecentDto> CREATOR = new a();

    @pmi0("entity_type")
    private final EntityTypeDto entityType;

    @pmi0("id")
    private final String id;

    @pmi0("owner_id")
    private final String ownerId;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CatalogSearchRecentDto.kt */
    public static final class EntityTypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EntityTypeDto[] $VALUES;

        @pmi0("album")
        public static final EntityTypeDto ALBUM;

        @pmi0("artist")
        public static final EntityTypeDto ARTIST;

        @pmi0("audio")
        public static final EntityTypeDto AUDIO;

        @pmi0("audiobook")
        public static final EntityTypeDto AUDIOBOOK;
        public static final Parcelable.Creator<EntityTypeDto> CREATOR;

        @pmi0("found_by_lyrics")
        public static final EntityTypeDto FOUND_BY_LYRICS;

        @pmi0("playlist")
        public static final EntityTypeDto PLAYLIST;

        @pmi0("podcast")
        public static final EntityTypeDto PODCAST;

        @pmi0("radio")
        public static final EntityTypeDto RADIO;

        @pmi0("video")
        public static final EntityTypeDto VIDEO;
        private final String value;

        /* compiled from: CatalogSearchRecentDto.kt */
        public static final class a implements Parcelable.Creator<EntityTypeDto> {
            @Override // android.os.Parcelable.Creator
            public final EntityTypeDto createFromParcel(Parcel parcel) {
                return EntityTypeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final EntityTypeDto[] newArray(int i) {
                return new EntityTypeDto[i];
            }
        }

        static {
            EntityTypeDto entityTypeDto = new EntityTypeDto(SignalingProtocol.MEDIA_OPTION_AUDIO, 0, "audio");
            AUDIO = entityTypeDto;
            EntityTypeDto entityTypeDto2 = new EntityTypeDto("ALBUM", 1, "album");
            ALBUM = entityTypeDto2;
            EntityTypeDto entityTypeDto3 = new EntityTypeDto("PLAYLIST", 2, "playlist");
            PLAYLIST = entityTypeDto3;
            EntityTypeDto entityTypeDto4 = new EntityTypeDto("FOUND_BY_LYRICS", 3, "found_by_lyrics");
            FOUND_BY_LYRICS = entityTypeDto4;
            EntityTypeDto entityTypeDto5 = new EntityTypeDto("ARTIST", 4, "artist");
            ARTIST = entityTypeDto5;
            EntityTypeDto entityTypeDto6 = new EntityTypeDto("PODCAST", 5, "podcast");
            PODCAST = entityTypeDto6;
            EntityTypeDto entityTypeDto7 = new EntityTypeDto("RADIO", 6, "radio");
            RADIO = entityTypeDto7;
            EntityTypeDto entityTypeDto8 = new EntityTypeDto("AUDIOBOOK", 7, "audiobook");
            AUDIOBOOK = entityTypeDto8;
            EntityTypeDto entityTypeDto9 = new EntityTypeDto(SignalingProtocol.MEDIA_OPTION_VIDEO, 8, "video");
            VIDEO = entityTypeDto9;
            EntityTypeDto[] entityTypeDtoArr = {entityTypeDto, entityTypeDto2, entityTypeDto3, entityTypeDto4, entityTypeDto5, entityTypeDto6, entityTypeDto7, entityTypeDto8, entityTypeDto9};
            $VALUES = entityTypeDtoArr;
            $ENTRIES = new asp(entityTypeDtoArr);
            CREATOR = new a();
        }

        private EntityTypeDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static EntityTypeDto valueOf(String str) {
            return (EntityTypeDto) Enum.valueOf(EntityTypeDto.class, str);
        }

        public static EntityTypeDto[] values() {
            return (EntityTypeDto[]) $VALUES.clone();
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

    /* compiled from: CatalogSearchRecentDto.kt */
    public static final class a implements Parcelable.Creator<CatalogSearchRecentDto> {
        @Override // android.os.Parcelable.Creator
        public final CatalogSearchRecentDto createFromParcel(Parcel parcel) {
            return new CatalogSearchRecentDto(EntityTypeDto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogSearchRecentDto[] newArray(int i) {
            return new CatalogSearchRecentDto[i];
        }
    }

    public CatalogSearchRecentDto(EntityTypeDto entityTypeDto, String str, String str2) {
        this.entityType = entityTypeDto;
        this.id = str;
        this.ownerId = str2;
    }

    public final EntityTypeDto d() {
        return this.entityType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.ownerId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogSearchRecentDto)) {
            return false;
        }
        CatalogSearchRecentDto catalogSearchRecentDto = (CatalogSearchRecentDto) obj;
        return this.entityType == catalogSearchRecentDto.entityType && epx.f(this.id, catalogSearchRecentDto.id) && epx.f(this.ownerId, catalogSearchRecentDto.ownerId);
    }

    public final String getId() {
        return this.id;
    }

    public final int hashCode() {
        int hashCode = this.entityType.hashCode() * 31;
        String str = this.id;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.ownerId;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogSearchRecentDto(entityType=");
        sb.append(this.entityType);
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", ownerId=");
        return ho8.a(sb, this.ownerId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.entityType.writeToParcel(parcel, i);
        parcel.writeString(this.id);
        parcel.writeString(this.ownerId);
    }

    public /* synthetic */ CatalogSearchRecentDto(EntityTypeDto entityTypeDto, String str, String str2, int i, zcl zclVar) {
        this(entityTypeDto, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
    }
}
