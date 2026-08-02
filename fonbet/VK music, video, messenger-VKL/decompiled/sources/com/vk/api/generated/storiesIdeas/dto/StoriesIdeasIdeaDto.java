package com.vk.api.generated.storiesIdeas.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: StoriesIdeasIdeaDto.kt */
/* loaded from: classes15.dex */
public final class StoriesIdeasIdeaDto implements Parcelable {
    public static final Parcelable.Creator<StoriesIdeasIdeaDto> CREATOR = new a();

    @pmi0("birthday")
    private final StoriesIdeasIdeaBirthdayDto birthday;

    @pmi0("gallery")
    private final StoriesIdeasIdeaGalleryDto gallery;

    @pmi0("music")
    private final StoriesIdeasIdeaMusicDto music;

    @pmi0("type")
    private final TypeDto type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: StoriesIdeasIdeaDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;

        @pmi0("birthday")
        public static final TypeDto BIRTHDAY;
        public static final Parcelable.Creator<TypeDto> CREATOR;

        @pmi0("gallery")
        public static final TypeDto GALLERY;

        @pmi0("music")
        public static final TypeDto MUSIC;
        private final String value;

        /* compiled from: StoriesIdeasIdeaDto.kt */
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
            TypeDto typeDto = new TypeDto("BIRTHDAY", 0, "birthday");
            BIRTHDAY = typeDto;
            TypeDto typeDto2 = new TypeDto("MUSIC", 1, "music");
            MUSIC = typeDto2;
            TypeDto typeDto3 = new TypeDto("GALLERY", 2, "gallery");
            GALLERY = typeDto3;
            TypeDto[] typeDtoArr = {typeDto, typeDto2, typeDto3};
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

    /* compiled from: StoriesIdeasIdeaDto.kt */
    public static final class a implements Parcelable.Creator<StoriesIdeasIdeaDto> {
        @Override // android.os.Parcelable.Creator
        public final StoriesIdeasIdeaDto createFromParcel(Parcel parcel) {
            return new StoriesIdeasIdeaDto(TypeDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StoriesIdeasIdeaGalleryDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StoriesIdeasIdeaBirthdayDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StoriesIdeasIdeaMusicDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final StoriesIdeasIdeaDto[] newArray(int i) {
            return new StoriesIdeasIdeaDto[i];
        }
    }

    public StoriesIdeasIdeaDto(TypeDto typeDto, StoriesIdeasIdeaGalleryDto storiesIdeasIdeaGalleryDto, StoriesIdeasIdeaBirthdayDto storiesIdeasIdeaBirthdayDto, StoriesIdeasIdeaMusicDto storiesIdeasIdeaMusicDto) {
        this.type = typeDto;
        this.gallery = storiesIdeasIdeaGalleryDto;
        this.birthday = storiesIdeasIdeaBirthdayDto;
        this.music = storiesIdeasIdeaMusicDto;
    }

    public final StoriesIdeasIdeaBirthdayDto d() {
        return this.birthday;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final StoriesIdeasIdeaGalleryDto e() {
        return this.gallery;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoriesIdeasIdeaDto)) {
            return false;
        }
        StoriesIdeasIdeaDto storiesIdeasIdeaDto = (StoriesIdeasIdeaDto) obj;
        return this.type == storiesIdeasIdeaDto.type && epx.f(this.gallery, storiesIdeasIdeaDto.gallery) && epx.f(this.birthday, storiesIdeasIdeaDto.birthday) && epx.f(this.music, storiesIdeasIdeaDto.music);
    }

    public final TypeDto f() {
        return this.type;
    }

    public final int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        StoriesIdeasIdeaGalleryDto storiesIdeasIdeaGalleryDto = this.gallery;
        int hashCode2 = (hashCode + (storiesIdeasIdeaGalleryDto == null ? 0 : storiesIdeasIdeaGalleryDto.hashCode())) * 31;
        StoriesIdeasIdeaBirthdayDto storiesIdeasIdeaBirthdayDto = this.birthday;
        int hashCode3 = (hashCode2 + (storiesIdeasIdeaBirthdayDto == null ? 0 : storiesIdeasIdeaBirthdayDto.hashCode())) * 31;
        StoriesIdeasIdeaMusicDto storiesIdeasIdeaMusicDto = this.music;
        return hashCode3 + (storiesIdeasIdeaMusicDto != null ? storiesIdeasIdeaMusicDto.hashCode() : 0);
    }

    public final String toString() {
        return "StoriesIdeasIdeaDto(type=" + this.type + ", gallery=" + this.gallery + ", birthday=" + this.birthday + ", music=" + this.music + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.type.writeToParcel(parcel, i);
        StoriesIdeasIdeaGalleryDto storiesIdeasIdeaGalleryDto = this.gallery;
        if (storiesIdeasIdeaGalleryDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            storiesIdeasIdeaGalleryDto.writeToParcel(parcel, i);
        }
        StoriesIdeasIdeaBirthdayDto storiesIdeasIdeaBirthdayDto = this.birthday;
        if (storiesIdeasIdeaBirthdayDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            storiesIdeasIdeaBirthdayDto.writeToParcel(parcel, i);
        }
        StoriesIdeasIdeaMusicDto storiesIdeasIdeaMusicDto = this.music;
        if (storiesIdeasIdeaMusicDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            storiesIdeasIdeaMusicDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ StoriesIdeasIdeaDto(TypeDto typeDto, StoriesIdeasIdeaGalleryDto storiesIdeasIdeaGalleryDto, StoriesIdeasIdeaBirthdayDto storiesIdeasIdeaBirthdayDto, StoriesIdeasIdeaMusicDto storiesIdeasIdeaMusicDto, int i, zcl zclVar) {
        this(typeDto, (i & 2) != 0 ? null : storiesIdeasIdeaGalleryDto, (i & 4) != 0 ? null : storiesIdeasIdeaBirthdayDto, (i & 8) != 0 ? null : storiesIdeasIdeaMusicDto);
    }
}
