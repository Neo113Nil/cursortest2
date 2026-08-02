package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseImageDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;

/* compiled from: MessagesConversationBarPayloadGiftsHolidaysTrailingImageDto.kt */
/* loaded from: classes15.dex */
public final class MessagesConversationBarPayloadGiftsHolidaysTrailingImageDto implements Parcelable {
    public static final Parcelable.Creator<MessagesConversationBarPayloadGiftsHolidaysTrailingImageDto> CREATOR = new a();

    @pmi0("images")
    private final List<BaseImageDto> images;

    /* compiled from: MessagesConversationBarPayloadGiftsHolidaysTrailingImageDto.kt */
    public static final class a implements Parcelable.Creator<MessagesConversationBarPayloadGiftsHolidaysTrailingImageDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesConversationBarPayloadGiftsHolidaysTrailingImageDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = bo.b(MessagesConversationBarPayloadGiftsHolidaysTrailingImageDto.class, parcel, arrayList, i, 1);
            }
            return new MessagesConversationBarPayloadGiftsHolidaysTrailingImageDto(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesConversationBarPayloadGiftsHolidaysTrailingImageDto[] newArray(int i) {
            return new MessagesConversationBarPayloadGiftsHolidaysTrailingImageDto[i];
        }
    }

    public MessagesConversationBarPayloadGiftsHolidaysTrailingImageDto(List<BaseImageDto> list) {
        this.images = list;
    }

    public final List<BaseImageDto> d() {
        return this.images;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MessagesConversationBarPayloadGiftsHolidaysTrailingImageDto) && epx.f(this.images, ((MessagesConversationBarPayloadGiftsHolidaysTrailingImageDto) obj).images);
    }

    public final int hashCode() {
        return this.images.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("MessagesConversationBarPayloadGiftsHolidaysTrailingImageDto(images="), this.images);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.images);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
    }
}
