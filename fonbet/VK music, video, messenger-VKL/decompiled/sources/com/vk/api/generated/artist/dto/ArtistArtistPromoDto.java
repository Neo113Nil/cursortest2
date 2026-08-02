package com.vk.api.generated.artist.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: ArtistArtistPromoDto.kt */
/* loaded from: classes14.dex */
public final class ArtistArtistPromoDto implements Parcelable {
    public static final Parcelable.Creator<ArtistArtistPromoDto> CREATOR = new a();

    @pmi0("caption")
    private final String caption;

    @pmi0("expired")
    private final Integer expired;

    @pmi0("track_code")
    private final String trackCode;

    @pmi0("type")
    private final TypeDto type;

    @pmi0("url")
    private final String url;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ArtistArtistPromoDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;

        @pmi0("concert")
        public static final TypeDto CONCERT;
        public static final Parcelable.Creator<TypeDto> CREATOR;

        @pmi0("merch")
        public static final TypeDto MERCH;
        private final String value;

        /* compiled from: ArtistArtistPromoDto.kt */
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
            TypeDto typeDto = new TypeDto("CONCERT", 0, "concert");
            CONCERT = typeDto;
            TypeDto typeDto2 = new TypeDto("MERCH", 1, "merch");
            MERCH = typeDto2;
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

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* compiled from: ArtistArtistPromoDto.kt */
    public static final class a implements Parcelable.Creator<ArtistArtistPromoDto> {
        @Override // android.os.Parcelable.Creator
        public final ArtistArtistPromoDto createFromParcel(Parcel parcel) {
            return new ArtistArtistPromoDto(parcel.readString(), parcel.readString(), TypeDto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final ArtistArtistPromoDto[] newArray(int i) {
            return new ArtistArtistPromoDto[i];
        }
    }

    public ArtistArtistPromoDto(String str, String str2, TypeDto typeDto, String str3, Integer num) {
        this.caption = str;
        this.url = str2;
        this.type = typeDto;
        this.trackCode = str3;
        this.expired = num;
    }

    public final String d() {
        return this.caption;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Integer e() {
        return this.expired;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ArtistArtistPromoDto)) {
            return false;
        }
        ArtistArtistPromoDto artistArtistPromoDto = (ArtistArtistPromoDto) obj;
        return epx.f(this.caption, artistArtistPromoDto.caption) && epx.f(this.url, artistArtistPromoDto.url) && this.type == artistArtistPromoDto.type && epx.f(this.trackCode, artistArtistPromoDto.trackCode) && epx.f(this.expired, artistArtistPromoDto.expired);
    }

    public final TypeDto f() {
        return this.type;
    }

    public final String getUrl() {
        return this.url;
    }

    public final int hashCode() {
        int hashCode = (this.type.hashCode() + urd0.a(this.caption.hashCode() * 31, 31, this.url)) * 31;
        String str = this.trackCode;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.expired;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String r() {
        return this.trackCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ArtistArtistPromoDto(caption=");
        sb.append(this.caption);
        sb.append(", url=");
        sb.append(this.url);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", trackCode=");
        sb.append(this.trackCode);
        sb.append(", expired=");
        return uqi.b(sb, this.expired, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.caption);
        parcel.writeString(this.url);
        this.type.writeToParcel(parcel, i);
        parcel.writeString(this.trackCode);
        Integer num = this.expired;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public /* synthetic */ ArtistArtistPromoDto(String str, String str2, TypeDto typeDto, String str3, Integer num, int i, zcl zclVar) {
        this(str, str2, typeDto, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : num);
    }
}
