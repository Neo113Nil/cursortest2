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

/* compiled from: CatalogVideoMoviePageButtonDto.kt */
/* loaded from: classes14.dex */
public final class CatalogVideoMoviePageButtonDto implements Parcelable {
    public static final Parcelable.Creator<CatalogVideoMoviePageButtonDto> CREATOR = new a();

    @pmi0("text")
    private final String text;

    @pmi0("type")
    private final TypeDto type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CatalogVideoMoviePageButtonDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;

        @pmi0("album")
        public static final TypeDto ALBUM;
        public static final Parcelable.Creator<TypeDto> CREATOR;

        @pmi0("link")
        public static final TypeDto LINK;

        @pmi0("share")
        public static final TypeDto SHARE;

        @pmi0("trailer")
        public static final TypeDto TRAILER;

        @pmi0("video")
        public static final TypeDto VIDEO;

        @pmi0("watch_later")
        public static final TypeDto WATCH_LATER;
        private final String value;

        /* compiled from: CatalogVideoMoviePageButtonDto.kt */
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
            TypeDto typeDto = new TypeDto("LINK", 0, "link");
            LINK = typeDto;
            TypeDto typeDto2 = new TypeDto("WATCH_LATER", 1, "watch_later");
            WATCH_LATER = typeDto2;
            TypeDto typeDto3 = new TypeDto("SHARE", 2, "share");
            SHARE = typeDto3;
            TypeDto typeDto4 = new TypeDto(SignalingProtocol.MEDIA_OPTION_VIDEO, 3, "video");
            VIDEO = typeDto4;
            TypeDto typeDto5 = new TypeDto("TRAILER", 4, "trailer");
            TRAILER = typeDto5;
            TypeDto typeDto6 = new TypeDto("ALBUM", 5, "album");
            ALBUM = typeDto6;
            TypeDto[] typeDtoArr = {typeDto, typeDto2, typeDto3, typeDto4, typeDto5, typeDto6};
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

    /* compiled from: CatalogVideoMoviePageButtonDto.kt */
    public static final class a implements Parcelable.Creator<CatalogVideoMoviePageButtonDto> {
        @Override // android.os.Parcelable.Creator
        public final CatalogVideoMoviePageButtonDto createFromParcel(Parcel parcel) {
            return new CatalogVideoMoviePageButtonDto(TypeDto.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogVideoMoviePageButtonDto[] newArray(int i) {
            return new CatalogVideoMoviePageButtonDto[i];
        }
    }

    public CatalogVideoMoviePageButtonDto(TypeDto typeDto, String str) {
        this.type = typeDto;
        this.text = str;
    }

    public final TypeDto d() {
        return this.type;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogVideoMoviePageButtonDto)) {
            return false;
        }
        CatalogVideoMoviePageButtonDto catalogVideoMoviePageButtonDto = (CatalogVideoMoviePageButtonDto) obj;
        return this.type == catalogVideoMoviePageButtonDto.type && epx.f(this.text, catalogVideoMoviePageButtonDto.text);
    }

    public final int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        String str = this.text;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogVideoMoviePageButtonDto(type=");
        sb.append(this.type);
        sb.append(", text=");
        return ho8.a(sb, this.text, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.type.writeToParcel(parcel, i);
        parcel.writeString(this.text);
    }

    public /* synthetic */ CatalogVideoMoviePageButtonDto(TypeDto typeDto, String str, int i, zcl zclVar) {
        this(typeDto, (i & 2) != 0 ? null : str);
    }
}
