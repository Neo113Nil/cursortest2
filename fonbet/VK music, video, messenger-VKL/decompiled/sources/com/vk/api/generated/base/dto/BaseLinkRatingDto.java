package com.vk.api.generated.base.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import io.reactivex.rxjava3.subjects.b;
import xsna.asp;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: BaseLinkRatingDto.kt */
/* loaded from: classes14.dex */
public final class BaseLinkRatingDto implements Parcelable {
    public static final Parcelable.Creator<BaseLinkRatingDto> CREATOR = new a();

    @pmi0("reviews_count")
    private final Integer reviewsCount;

    @pmi0("stars")
    private final Float stars;

    @pmi0("type")
    private final TypeDto type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BaseLinkRatingDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;
        public static final Parcelable.Creator<TypeDto> CREATOR;

        @pmi0(CampaignEx.JSON_KEY_STAR)
        public static final TypeDto RATING;
        private final String value;

        /* compiled from: BaseLinkRatingDto.kt */
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
            TypeDto typeDto = new TypeDto(NativeAdContent.ViewTag.RATING, 0, CampaignEx.JSON_KEY_STAR);
            RATING = typeDto;
            TypeDto[] typeDtoArr = {typeDto};
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

    /* compiled from: BaseLinkRatingDto.kt */
    public static final class a implements Parcelable.Creator<BaseLinkRatingDto> {
        @Override // android.os.Parcelable.Creator
        public final BaseLinkRatingDto createFromParcel(Parcel parcel) {
            return new BaseLinkRatingDto(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() != 0 ? TypeDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final BaseLinkRatingDto[] newArray(int i) {
            return new BaseLinkRatingDto[i];
        }
    }

    public BaseLinkRatingDto() {
        this(null, null, null, 7, null);
    }

    public final Float d() {
        return this.stars;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseLinkRatingDto)) {
            return false;
        }
        BaseLinkRatingDto baseLinkRatingDto = (BaseLinkRatingDto) obj;
        return epx.f(this.reviewsCount, baseLinkRatingDto.reviewsCount) && epx.f(this.stars, baseLinkRatingDto.stars) && this.type == baseLinkRatingDto.type;
    }

    public final int hashCode() {
        Integer num = this.reviewsCount;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Float f = this.stars;
        int hashCode2 = (hashCode + (f == null ? 0 : f.hashCode())) * 31;
        TypeDto typeDto = this.type;
        return hashCode2 + (typeDto != null ? typeDto.hashCode() : 0);
    }

    public final String toString() {
        return "BaseLinkRatingDto(reviewsCount=" + this.reviewsCount + ", stars=" + this.stars + ", type=" + this.type + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.reviewsCount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Float f = this.stars;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            b.d(parcel, 1, f);
        }
        TypeDto typeDto = this.type;
        if (typeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            typeDto.writeToParcel(parcel, i);
        }
    }

    public BaseLinkRatingDto(Integer num, Float f, TypeDto typeDto) {
        this.reviewsCount = num;
        this.stars = f;
        this.type = typeDto;
    }

    public /* synthetic */ BaseLinkRatingDto(Integer num, Float f, TypeDto typeDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : f, (i & 4) != 0 ? null : typeDto);
    }
}
