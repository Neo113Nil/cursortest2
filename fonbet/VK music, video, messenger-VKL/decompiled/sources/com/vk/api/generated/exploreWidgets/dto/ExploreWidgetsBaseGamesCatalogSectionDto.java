package com.vk.api.generated.exploreWidgets.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: ExploreWidgetsBaseGamesCatalogSectionDto.kt */
/* loaded from: classes14.dex */
public final class ExploreWidgetsBaseGamesCatalogSectionDto implements Parcelable {
    public static final Parcelable.Creator<ExploreWidgetsBaseGamesCatalogSectionDto> CREATOR = new a();

    @pmi0("collection_id")
    private final Integer collectionId;

    @pmi0("genre_id")
    private final Integer genreId;

    @pmi0("ref")
    private final String ref;

    @pmi0("screen_title")
    private final String screenTitle;

    @pmi0("section_id")
    private final String sectionId;

    @pmi0("type_section")
    private final TypeSectionDto typeSection;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ExploreWidgetsBaseGamesCatalogSectionDto.kt */
    public static final class TypeSectionDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeSectionDto[] $VALUES;

        @pmi0("collection")
        public static final TypeSectionDto COLLECTION;
        public static final Parcelable.Creator<TypeSectionDto> CREATOR;

        @pmi0("genre")
        public static final TypeSectionDto GENRE;

        @pmi0("section")
        public static final TypeSectionDto SECTION;
        private final String value;

        /* compiled from: ExploreWidgetsBaseGamesCatalogSectionDto.kt */
        public static final class a implements Parcelable.Creator<TypeSectionDto> {
            @Override // android.os.Parcelable.Creator
            public final TypeSectionDto createFromParcel(Parcel parcel) {
                return TypeSectionDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final TypeSectionDto[] newArray(int i) {
                return new TypeSectionDto[i];
            }
        }

        static {
            TypeSectionDto typeSectionDto = new TypeSectionDto("SECTION", 0, "section");
            SECTION = typeSectionDto;
            TypeSectionDto typeSectionDto2 = new TypeSectionDto("GENRE", 1, "genre");
            GENRE = typeSectionDto2;
            TypeSectionDto typeSectionDto3 = new TypeSectionDto("COLLECTION", 2, "collection");
            COLLECTION = typeSectionDto3;
            TypeSectionDto[] typeSectionDtoArr = {typeSectionDto, typeSectionDto2, typeSectionDto3};
            $VALUES = typeSectionDtoArr;
            $ENTRIES = new asp(typeSectionDtoArr);
            CREATOR = new a();
        }

        private TypeSectionDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static TypeSectionDto valueOf(String str) {
            return (TypeSectionDto) Enum.valueOf(TypeSectionDto.class, str);
        }

        public static TypeSectionDto[] values() {
            return (TypeSectionDto[]) $VALUES.clone();
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

    /* compiled from: ExploreWidgetsBaseGamesCatalogSectionDto.kt */
    public static final class a implements Parcelable.Creator<ExploreWidgetsBaseGamesCatalogSectionDto> {
        @Override // android.os.Parcelable.Creator
        public final ExploreWidgetsBaseGamesCatalogSectionDto createFromParcel(Parcel parcel) {
            return new ExploreWidgetsBaseGamesCatalogSectionDto(TypeSectionDto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ExploreWidgetsBaseGamesCatalogSectionDto[] newArray(int i) {
            return new ExploreWidgetsBaseGamesCatalogSectionDto[i];
        }
    }

    public ExploreWidgetsBaseGamesCatalogSectionDto(TypeSectionDto typeSectionDto, String str, String str2, Integer num, Integer num2, String str3) {
        this.typeSection = typeSectionDto;
        this.sectionId = str;
        this.screenTitle = str2;
        this.genreId = num;
        this.collectionId = num2;
        this.ref = str3;
    }

    public final Integer d() {
        return this.collectionId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Integer e() {
        return this.genreId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExploreWidgetsBaseGamesCatalogSectionDto)) {
            return false;
        }
        ExploreWidgetsBaseGamesCatalogSectionDto exploreWidgetsBaseGamesCatalogSectionDto = (ExploreWidgetsBaseGamesCatalogSectionDto) obj;
        return this.typeSection == exploreWidgetsBaseGamesCatalogSectionDto.typeSection && epx.f(this.sectionId, exploreWidgetsBaseGamesCatalogSectionDto.sectionId) && epx.f(this.screenTitle, exploreWidgetsBaseGamesCatalogSectionDto.screenTitle) && epx.f(this.genreId, exploreWidgetsBaseGamesCatalogSectionDto.genreId) && epx.f(this.collectionId, exploreWidgetsBaseGamesCatalogSectionDto.collectionId) && epx.f(this.ref, exploreWidgetsBaseGamesCatalogSectionDto.ref);
    }

    public final String f() {
        return this.ref;
    }

    public final String g() {
        return this.sectionId;
    }

    public final int hashCode() {
        int hashCode = this.typeSection.hashCode() * 31;
        String str = this.sectionId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.screenTitle;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.genreId;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.collectionId;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str3 = this.ref;
        return hashCode5 + (str3 != null ? str3.hashCode() : 0);
    }

    public final TypeSectionDto i() {
        return this.typeSection;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExploreWidgetsBaseGamesCatalogSectionDto(typeSection=");
        sb.append(this.typeSection);
        sb.append(", sectionId=");
        sb.append(this.sectionId);
        sb.append(", screenTitle=");
        sb.append(this.screenTitle);
        sb.append(", genreId=");
        sb.append(this.genreId);
        sb.append(", collectionId=");
        sb.append(this.collectionId);
        sb.append(", ref=");
        return ho8.a(sb, this.ref, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.typeSection.writeToParcel(parcel, i);
        parcel.writeString(this.sectionId);
        parcel.writeString(this.screenTitle);
        Integer num = this.genreId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.collectionId;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        parcel.writeString(this.ref);
    }

    public /* synthetic */ ExploreWidgetsBaseGamesCatalogSectionDto(TypeSectionDto typeSectionDto, String str, String str2, Integer num, Integer num2, String str3, int i, zcl zclVar) {
        this(typeSectionDto, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : num2, (i & 32) != 0 ? null : str3);
    }
}
