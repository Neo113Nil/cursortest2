package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.shy;
import xsna.zrp;

/* compiled from: MarketLinkedContentSourceDto.kt */
/* loaded from: classes15.dex */
public final class MarketLinkedContentSourceDto implements Parcelable {
    public static final Parcelable.Creator<MarketLinkedContentSourceDto> CREATOR = new a();

    @pmi0("id")
    private final int id;

    @pmi0("owner_id")
    private final UserId ownerId;

    @pmi0("type")
    private final TypeDto type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MarketLinkedContentSourceDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;
        public static final Parcelable.Creator<TypeDto> CREATOR;

        @pmi0("post")
        public static final TypeDto POST;
        private final String value;

        /* compiled from: MarketLinkedContentSourceDto.kt */
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
            TypeDto typeDto = new TypeDto("POST", 0, "post");
            POST = typeDto;
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

    /* compiled from: MarketLinkedContentSourceDto.kt */
    public static final class a implements Parcelable.Creator<MarketLinkedContentSourceDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketLinkedContentSourceDto createFromParcel(Parcel parcel) {
            return new MarketLinkedContentSourceDto((UserId) parcel.readParcelable(MarketLinkedContentSourceDto.class.getClassLoader()), parcel.readInt(), TypeDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final MarketLinkedContentSourceDto[] newArray(int i) {
            return new MarketLinkedContentSourceDto[i];
        }
    }

    public MarketLinkedContentSourceDto(UserId userId, int i, TypeDto typeDto) {
        this.ownerId = userId;
        this.id = i;
        this.type = typeDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketLinkedContentSourceDto)) {
            return false;
        }
        MarketLinkedContentSourceDto marketLinkedContentSourceDto = (MarketLinkedContentSourceDto) obj;
        return epx.f(this.ownerId, marketLinkedContentSourceDto.ownerId) && this.id == marketLinkedContentSourceDto.id && this.type == marketLinkedContentSourceDto.type;
    }

    public final int getId() {
        return this.id;
    }

    public final int hashCode() {
        return this.type.hashCode() + shy.a(this.id, Long.hashCode(this.ownerId.b) * 31, 31);
    }

    public final UserId q() {
        return this.ownerId;
    }

    public final String toString() {
        return "MarketLinkedContentSourceDto(ownerId=" + this.ownerId + ", id=" + this.id + ", type=" + this.type + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.ownerId, i);
        parcel.writeInt(this.id);
        this.type.writeToParcel(parcel, i);
    }
}
