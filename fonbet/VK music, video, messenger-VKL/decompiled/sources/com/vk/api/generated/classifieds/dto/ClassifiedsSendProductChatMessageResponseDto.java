package com.vk.api.generated.classifieds.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: ClassifiedsSendProductChatMessageResponseDto.kt */
/* loaded from: classes14.dex */
public final class ClassifiedsSendProductChatMessageResponseDto implements Parcelable {
    public static final Parcelable.Creator<ClassifiedsSendProductChatMessageResponseDto> CREATOR = new a();

    @pmi0("chat_id")
    private final String chatId;

    @pmi0("product_id")
    private final String productId;

    /* compiled from: ClassifiedsSendProductChatMessageResponseDto.kt */
    public static final class a implements Parcelable.Creator<ClassifiedsSendProductChatMessageResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final ClassifiedsSendProductChatMessageResponseDto createFromParcel(Parcel parcel) {
            return new ClassifiedsSendProductChatMessageResponseDto(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ClassifiedsSendProductChatMessageResponseDto[] newArray(int i) {
            return new ClassifiedsSendProductChatMessageResponseDto[i];
        }
    }

    public ClassifiedsSendProductChatMessageResponseDto(String str, String str2) {
        this.productId = str;
        this.chatId = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClassifiedsSendProductChatMessageResponseDto)) {
            return false;
        }
        ClassifiedsSendProductChatMessageResponseDto classifiedsSendProductChatMessageResponseDto = (ClassifiedsSendProductChatMessageResponseDto) obj;
        return epx.f(this.productId, classifiedsSendProductChatMessageResponseDto.productId) && epx.f(this.chatId, classifiedsSendProductChatMessageResponseDto.chatId);
    }

    public final int hashCode() {
        return this.chatId.hashCode() + (this.productId.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClassifiedsSendProductChatMessageResponseDto(productId=");
        sb.append(this.productId);
        sb.append(", chatId=");
        return ho8.a(sb, this.chatId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.productId);
        parcel.writeString(this.chatId);
    }
}
