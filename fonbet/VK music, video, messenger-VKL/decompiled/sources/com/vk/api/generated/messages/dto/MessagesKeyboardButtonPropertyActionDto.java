package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MessagesKeyboardButtonPropertyActionDto.kt */
/* loaded from: classes15.dex */
public final class MessagesKeyboardButtonPropertyActionDto implements Parcelable {
    public static final Parcelable.Creator<MessagesKeyboardButtonPropertyActionDto> CREATOR = new a();

    @pmi0("hash")
    private final String hash;

    @pmi0("payload")
    private final String payload;

    @pmi0("type")
    private final TypeDto type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MessagesKeyboardButtonPropertyActionDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;
        public static final Parcelable.Creator<TypeDto> CREATOR;

        @pmi0("vkpay")
        public static final TypeDto VKPAY;
        private final String value;

        /* compiled from: MessagesKeyboardButtonPropertyActionDto.kt */
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
            TypeDto typeDto = new TypeDto("VKPAY", 0, "vkpay");
            VKPAY = typeDto;
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

    /* compiled from: MessagesKeyboardButtonPropertyActionDto.kt */
    public static final class a implements Parcelable.Creator<MessagesKeyboardButtonPropertyActionDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesKeyboardButtonPropertyActionDto createFromParcel(Parcel parcel) {
            return new MessagesKeyboardButtonPropertyActionDto(parcel.readString(), TypeDto.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesKeyboardButtonPropertyActionDto[] newArray(int i) {
            return new MessagesKeyboardButtonPropertyActionDto[i];
        }
    }

    public MessagesKeyboardButtonPropertyActionDto(String str, TypeDto typeDto, String str2) {
        this.hash = str;
        this.type = typeDto;
        this.payload = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesKeyboardButtonPropertyActionDto)) {
            return false;
        }
        MessagesKeyboardButtonPropertyActionDto messagesKeyboardButtonPropertyActionDto = (MessagesKeyboardButtonPropertyActionDto) obj;
        return epx.f(this.hash, messagesKeyboardButtonPropertyActionDto.hash) && this.type == messagesKeyboardButtonPropertyActionDto.type && epx.f(this.payload, messagesKeyboardButtonPropertyActionDto.payload);
    }

    public final int hashCode() {
        int hashCode = (this.type.hashCode() + (this.hash.hashCode() * 31)) * 31;
        String str = this.payload;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesKeyboardButtonPropertyActionDto(hash=");
        sb.append(this.hash);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", payload=");
        return ho8.a(sb, this.payload, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.hash);
        this.type.writeToParcel(parcel, i);
        parcel.writeString(this.payload);
    }

    public /* synthetic */ MessagesKeyboardButtonPropertyActionDto(String str, TypeDto typeDto, String str2, int i, zcl zclVar) {
        this(str, typeDto, (i & 4) != 0 ? null : str2);
    }
}
