package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: MessagesKeyboardButtonPropertyCarouselActionDto.kt */
/* loaded from: classes15.dex */
public final class MessagesKeyboardButtonPropertyCarouselActionDto implements Parcelable {
    public static final Parcelable.Creator<MessagesKeyboardButtonPropertyCarouselActionDto> CREATOR = new a();

    @pmi0("type")
    private final TypeDto type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MessagesKeyboardButtonPropertyCarouselActionDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;
        public static final Parcelable.Creator<TypeDto> CREATOR;

        @pmi0("open_photo")
        public static final TypeDto OPEN_PHOTO;
        private final String value;

        /* compiled from: MessagesKeyboardButtonPropertyCarouselActionDto.kt */
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
            TypeDto typeDto = new TypeDto("OPEN_PHOTO", 0, "open_photo");
            OPEN_PHOTO = typeDto;
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

    /* compiled from: MessagesKeyboardButtonPropertyCarouselActionDto.kt */
    public static final class a implements Parcelable.Creator<MessagesKeyboardButtonPropertyCarouselActionDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesKeyboardButtonPropertyCarouselActionDto createFromParcel(Parcel parcel) {
            return new MessagesKeyboardButtonPropertyCarouselActionDto(TypeDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesKeyboardButtonPropertyCarouselActionDto[] newArray(int i) {
            return new MessagesKeyboardButtonPropertyCarouselActionDto[i];
        }
    }

    public MessagesKeyboardButtonPropertyCarouselActionDto(TypeDto typeDto) {
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
        return (obj instanceof MessagesKeyboardButtonPropertyCarouselActionDto) && this.type == ((MessagesKeyboardButtonPropertyCarouselActionDto) obj).type;
    }

    public final int hashCode() {
        return this.type.hashCode();
    }

    public final String toString() {
        return "MessagesKeyboardButtonPropertyCarouselActionDto(type=" + this.type + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.type.writeToParcel(parcel, i);
    }
}
