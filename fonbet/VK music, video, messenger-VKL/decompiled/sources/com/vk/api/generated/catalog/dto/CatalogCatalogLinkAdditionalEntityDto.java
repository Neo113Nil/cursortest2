package com.vk.api.generated.catalog.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: CatalogCatalogLinkAdditionalEntityDto.kt */
/* loaded from: classes14.dex */
public final class CatalogCatalogLinkAdditionalEntityDto implements Parcelable {
    public static final Parcelable.Creator<CatalogCatalogLinkAdditionalEntityDto> CREATOR = new a();

    @pmi0("entity_type")
    private final EntityTypeDto entityType;

    @pmi0("value")
    private final String value;

    @pmi0("value_type")
    private final ValueTypeDto valueType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CatalogCatalogLinkAdditionalEntityDto.kt */
    public static final class EntityTypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EntityTypeDto[] $VALUES;

        @pmi0("catalog_music_audios")
        public static final EntityTypeDto CATALOG_MUSIC_AUDIOS;
        public static final Parcelable.Creator<EntityTypeDto> CREATOR;

        @pmi0("owner_url")
        public static final EntityTypeDto OWNER_URL;
        private final String value;

        /* compiled from: CatalogCatalogLinkAdditionalEntityDto.kt */
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
            EntityTypeDto entityTypeDto = new EntityTypeDto("OWNER_URL", 0, "owner_url");
            OWNER_URL = entityTypeDto;
            EntityTypeDto entityTypeDto2 = new EntityTypeDto("CATALOG_MUSIC_AUDIOS", 1, "catalog_music_audios");
            CATALOG_MUSIC_AUDIOS = entityTypeDto2;
            EntityTypeDto[] entityTypeDtoArr = {entityTypeDto, entityTypeDto2};
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

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CatalogCatalogLinkAdditionalEntityDto.kt */
    public static final class ValueTypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ValueTypeDto[] $VALUES;

        @pmi0("catalog_block_id")
        public static final ValueTypeDto CATALOG_BLOCK_ID;
        public static final Parcelable.Creator<ValueTypeDto> CREATOR;

        @pmi0("url")
        public static final ValueTypeDto URL;
        private final String value;

        /* compiled from: CatalogCatalogLinkAdditionalEntityDto.kt */
        public static final class a implements Parcelable.Creator<ValueTypeDto> {
            @Override // android.os.Parcelable.Creator
            public final ValueTypeDto createFromParcel(Parcel parcel) {
                return ValueTypeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ValueTypeDto[] newArray(int i) {
                return new ValueTypeDto[i];
            }
        }

        static {
            ValueTypeDto valueTypeDto = new ValueTypeDto("CATALOG_BLOCK_ID", 0, "catalog_block_id");
            CATALOG_BLOCK_ID = valueTypeDto;
            ValueTypeDto valueTypeDto2 = new ValueTypeDto("URL", 1, "url");
            URL = valueTypeDto2;
            ValueTypeDto[] valueTypeDtoArr = {valueTypeDto, valueTypeDto2};
            $VALUES = valueTypeDtoArr;
            $ENTRIES = new asp(valueTypeDtoArr);
            CREATOR = new a();
        }

        private ValueTypeDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static ValueTypeDto valueOf(String str) {
            return (ValueTypeDto) Enum.valueOf(ValueTypeDto.class, str);
        }

        public static ValueTypeDto[] values() {
            return (ValueTypeDto[]) $VALUES.clone();
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

    /* compiled from: CatalogCatalogLinkAdditionalEntityDto.kt */
    public static final class a implements Parcelable.Creator<CatalogCatalogLinkAdditionalEntityDto> {
        @Override // android.os.Parcelable.Creator
        public final CatalogCatalogLinkAdditionalEntityDto createFromParcel(Parcel parcel) {
            return new CatalogCatalogLinkAdditionalEntityDto(EntityTypeDto.CREATOR.createFromParcel(parcel), ValueTypeDto.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogCatalogLinkAdditionalEntityDto[] newArray(int i) {
            return new CatalogCatalogLinkAdditionalEntityDto[i];
        }
    }

    public CatalogCatalogLinkAdditionalEntityDto(EntityTypeDto entityTypeDto, ValueTypeDto valueTypeDto, String str) {
        this.entityType = entityTypeDto;
        this.valueType = valueTypeDto;
        this.value = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogCatalogLinkAdditionalEntityDto)) {
            return false;
        }
        CatalogCatalogLinkAdditionalEntityDto catalogCatalogLinkAdditionalEntityDto = (CatalogCatalogLinkAdditionalEntityDto) obj;
        return this.entityType == catalogCatalogLinkAdditionalEntityDto.entityType && this.valueType == catalogCatalogLinkAdditionalEntityDto.valueType && epx.f(this.value, catalogCatalogLinkAdditionalEntityDto.value);
    }

    public final int hashCode() {
        return this.value.hashCode() + ((this.valueType.hashCode() + (this.entityType.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogCatalogLinkAdditionalEntityDto(entityType=");
        sb.append(this.entityType);
        sb.append(", valueType=");
        sb.append(this.valueType);
        sb.append(", value=");
        return ho8.a(sb, this.value, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.entityType.writeToParcel(parcel, i);
        this.valueType.writeToParcel(parcel, i);
        parcel.writeString(this.value);
    }
}
