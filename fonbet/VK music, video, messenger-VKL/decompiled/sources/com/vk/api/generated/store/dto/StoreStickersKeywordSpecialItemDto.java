package com.vk.api.generated.store.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: StoreStickersKeywordSpecialItemDto.kt */
/* loaded from: classes15.dex */
public final class StoreStickersKeywordSpecialItemDto implements Parcelable {
    public static final Parcelable.Creator<StoreStickersKeywordSpecialItemDto> CREATOR = new a();

    @pmi0("type")
    private final TypeDto type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: StoreStickersKeywordSpecialItemDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;
        public static final Parcelable.Creator<TypeDto> CREATOR;

        @pmi0("gift")
        public static final TypeDto GIFT;
        private final String value;

        /* compiled from: StoreStickersKeywordSpecialItemDto.kt */
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
            TypeDto typeDto = new TypeDto("GIFT", 0, "gift");
            GIFT = typeDto;
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

    /* compiled from: StoreStickersKeywordSpecialItemDto.kt */
    public static final class a implements Parcelable.Creator<StoreStickersKeywordSpecialItemDto> {
        @Override // android.os.Parcelable.Creator
        public final StoreStickersKeywordSpecialItemDto createFromParcel(Parcel parcel) {
            return new StoreStickersKeywordSpecialItemDto(TypeDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final StoreStickersKeywordSpecialItemDto[] newArray(int i) {
            return new StoreStickersKeywordSpecialItemDto[i];
        }
    }

    public StoreStickersKeywordSpecialItemDto(TypeDto typeDto) {
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
        return (obj instanceof StoreStickersKeywordSpecialItemDto) && this.type == ((StoreStickersKeywordSpecialItemDto) obj).type;
    }

    public final int hashCode() {
        return this.type.hashCode();
    }

    public final String toString() {
        return "StoreStickersKeywordSpecialItemDto(type=" + this.type + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.type.writeToParcel(parcel, i);
    }
}
