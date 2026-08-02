package com.vk.api.generated.catalog.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: CatalogSearchAuthorItemDto.kt */
/* loaded from: classes14.dex */
public final class CatalogSearchAuthorItemDto implements Parcelable {
    public static final Parcelable.Creator<CatalogSearchAuthorItemDto> CREATOR = new a();

    @pmi0("content_type")
    private final ContentTypeDto contentType;

    @pmi0("description")
    private final String description;

    @pmi0("id")
    private final long id;

    @pmi0("section_id")
    private final String sectionId;

    @pmi0("track_code")
    private final String trackCode;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CatalogSearchAuthorItemDto.kt */
    public static final class ContentTypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ContentTypeDto[] $VALUES;

        @pmi0("clips")
        public static final ContentTypeDto CLIPS;
        public static final Parcelable.Creator<ContentTypeDto> CREATOR;

        @pmi0("videos")
        public static final ContentTypeDto VIDEOS;
        private final String value;

        /* compiled from: CatalogSearchAuthorItemDto.kt */
        public static final class a implements Parcelable.Creator<ContentTypeDto> {
            @Override // android.os.Parcelable.Creator
            public final ContentTypeDto createFromParcel(Parcel parcel) {
                return ContentTypeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ContentTypeDto[] newArray(int i) {
                return new ContentTypeDto[i];
            }
        }

        static {
            ContentTypeDto contentTypeDto = new ContentTypeDto("CLIPS", 0, "clips");
            CLIPS = contentTypeDto;
            ContentTypeDto contentTypeDto2 = new ContentTypeDto("VIDEOS", 1, "videos");
            VIDEOS = contentTypeDto2;
            ContentTypeDto[] contentTypeDtoArr = {contentTypeDto, contentTypeDto2};
            $VALUES = contentTypeDtoArr;
            $ENTRIES = new asp(contentTypeDtoArr);
            CREATOR = new a();
        }

        private ContentTypeDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static ContentTypeDto valueOf(String str) {
            return (ContentTypeDto) Enum.valueOf(ContentTypeDto.class, str);
        }

        public static ContentTypeDto[] values() {
            return (ContentTypeDto[]) $VALUES.clone();
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

    /* compiled from: CatalogSearchAuthorItemDto.kt */
    public static final class a implements Parcelable.Creator<CatalogSearchAuthorItemDto> {
        @Override // android.os.Parcelable.Creator
        public final CatalogSearchAuthorItemDto createFromParcel(Parcel parcel) {
            return new CatalogSearchAuthorItemDto(parcel.readLong(), parcel.readInt() == 0 ? null : ContentTypeDto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogSearchAuthorItemDto[] newArray(int i) {
            return new CatalogSearchAuthorItemDto[i];
        }
    }

    public CatalogSearchAuthorItemDto(long j, ContentTypeDto contentTypeDto, String str, String str2, String str3) {
        this.id = j;
        this.contentType = contentTypeDto;
        this.description = str;
        this.trackCode = str2;
        this.sectionId = str3;
    }

    public final ContentTypeDto d() {
        return this.contentType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final long e() {
        return this.id;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogSearchAuthorItemDto)) {
            return false;
        }
        CatalogSearchAuthorItemDto catalogSearchAuthorItemDto = (CatalogSearchAuthorItemDto) obj;
        return this.id == catalogSearchAuthorItemDto.id && this.contentType == catalogSearchAuthorItemDto.contentType && epx.f(this.description, catalogSearchAuthorItemDto.description) && epx.f(this.trackCode, catalogSearchAuthorItemDto.trackCode) && epx.f(this.sectionId, catalogSearchAuthorItemDto.sectionId);
    }

    public final String f() {
        return this.sectionId;
    }

    public final String getDescription() {
        return this.description;
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        ContentTypeDto contentTypeDto = this.contentType;
        int hashCode2 = (hashCode + (contentTypeDto == null ? 0 : contentTypeDto.hashCode())) * 31;
        String str = this.description;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.trackCode;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.sectionId;
        return hashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String r() {
        return this.trackCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogSearchAuthorItemDto(id=");
        sb.append(this.id);
        sb.append(", contentType=");
        sb.append(this.contentType);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", trackCode=");
        sb.append(this.trackCode);
        sb.append(", sectionId=");
        return ho8.a(sb, this.sectionId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.id);
        ContentTypeDto contentTypeDto = this.contentType;
        if (contentTypeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            contentTypeDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.description);
        parcel.writeString(this.trackCode);
        parcel.writeString(this.sectionId);
    }

    public /* synthetic */ CatalogSearchAuthorItemDto(long j, ContentTypeDto contentTypeDto, String str, String str2, String str3, int i, zcl zclVar) {
        this(j, (i & 2) != 0 ? null : contentTypeDto, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3);
    }
}
