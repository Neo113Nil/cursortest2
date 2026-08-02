package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MarketItemCardQuickMessageDto.kt */
/* loaded from: classes15.dex */
public final class MarketItemCardQuickMessageDto implements Parcelable {
    public static final Parcelable.Creator<MarketItemCardQuickMessageDto> CREATOR = new a();

    @pmi0("contact_id")
    private final int contactId;

    @pmi0("message")
    private final String message;

    @pmi0("message_id")
    private final String messageId;

    @pmi0("title")
    private final String title;

    @pmi0("type")
    private final TypeDto type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MarketItemCardQuickMessageDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;

        @pmi0("chatButton")
        public static final TypeDto CHATBUTTON;
        public static final Parcelable.Creator<TypeDto> CREATOR;

        @pmi0("message")
        public static final TypeDto MESSAGE;
        private final String value;

        /* compiled from: MarketItemCardQuickMessageDto.kt */
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
            TypeDto typeDto = new TypeDto("MESSAGE", 0, "message");
            MESSAGE = typeDto;
            TypeDto typeDto2 = new TypeDto("CHATBUTTON", 1, "chatButton");
            CHATBUTTON = typeDto2;
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

        public final String i() {
            return this.value;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* compiled from: MarketItemCardQuickMessageDto.kt */
    public static final class a implements Parcelable.Creator<MarketItemCardQuickMessageDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketItemCardQuickMessageDto createFromParcel(Parcel parcel) {
            return new MarketItemCardQuickMessageDto(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : TypeDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final MarketItemCardQuickMessageDto[] newArray(int i) {
            return new MarketItemCardQuickMessageDto[i];
        }
    }

    public MarketItemCardQuickMessageDto(int i, String str, String str2, String str3, TypeDto typeDto) {
        this.contactId = i;
        this.title = str;
        this.message = str2;
        this.messageId = str3;
        this.type = typeDto;
    }

    public final int d() {
        return this.contactId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.messageId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketItemCardQuickMessageDto)) {
            return false;
        }
        MarketItemCardQuickMessageDto marketItemCardQuickMessageDto = (MarketItemCardQuickMessageDto) obj;
        return this.contactId == marketItemCardQuickMessageDto.contactId && epx.f(this.title, marketItemCardQuickMessageDto.title) && epx.f(this.message, marketItemCardQuickMessageDto.message) && epx.f(this.messageId, marketItemCardQuickMessageDto.messageId) && this.type == marketItemCardQuickMessageDto.type;
    }

    public final TypeDto f() {
        return this.type;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int a2 = urd0.a(urd0.a(urd0.a(Integer.hashCode(this.contactId) * 31, 31, this.title), 31, this.message), 31, this.messageId);
        TypeDto typeDto = this.type;
        return a2 + (typeDto == null ? 0 : typeDto.hashCode());
    }

    public final String toString() {
        return "MarketItemCardQuickMessageDto(contactId=" + this.contactId + ", title=" + this.title + ", message=" + this.message + ", messageId=" + this.messageId + ", type=" + this.type + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.contactId);
        parcel.writeString(this.title);
        parcel.writeString(this.message);
        parcel.writeString(this.messageId);
        TypeDto typeDto = this.type;
        if (typeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            typeDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ MarketItemCardQuickMessageDto(int i, String str, String str2, String str3, TypeDto typeDto, int i2, zcl zclVar) {
        this(i, str, str2, str3, (i2 & 16) != 0 ? null : typeDto);
    }
}
