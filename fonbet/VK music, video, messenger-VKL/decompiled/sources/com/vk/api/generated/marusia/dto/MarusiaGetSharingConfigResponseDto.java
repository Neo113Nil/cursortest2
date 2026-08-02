package com.vk.api.generated.marusia.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MarusiaGetSharingConfigResponseDto.kt */
/* loaded from: classes15.dex */
public final class MarusiaGetSharingConfigResponseDto implements Parcelable {
    public static final Parcelable.Creator<MarusiaGetSharingConfigResponseDto> CREATOR = new a();

    @pmi0("chat")
    private final MarusiaSharingConfigChatDto chat;

    /* compiled from: MarusiaGetSharingConfigResponseDto.kt */
    public static final class a implements Parcelable.Creator<MarusiaGetSharingConfigResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MarusiaGetSharingConfigResponseDto createFromParcel(Parcel parcel) {
            return new MarusiaGetSharingConfigResponseDto(parcel.readInt() == 0 ? null : MarusiaSharingConfigChatDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final MarusiaGetSharingConfigResponseDto[] newArray(int i) {
            return new MarusiaGetSharingConfigResponseDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MarusiaGetSharingConfigResponseDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MarusiaGetSharingConfigResponseDto) && epx.f(this.chat, ((MarusiaGetSharingConfigResponseDto) obj).chat);
    }

    public final int hashCode() {
        MarusiaSharingConfigChatDto marusiaSharingConfigChatDto = this.chat;
        if (marusiaSharingConfigChatDto == null) {
            return 0;
        }
        return marusiaSharingConfigChatDto.hashCode();
    }

    public final String toString() {
        return "MarusiaGetSharingConfigResponseDto(chat=" + this.chat + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        MarusiaSharingConfigChatDto marusiaSharingConfigChatDto = this.chat;
        if (marusiaSharingConfigChatDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marusiaSharingConfigChatDto.writeToParcel(parcel, i);
        }
    }

    public MarusiaGetSharingConfigResponseDto(MarusiaSharingConfigChatDto marusiaSharingConfigChatDto) {
        this.chat = marusiaSharingConfigChatDto;
    }

    public /* synthetic */ MarusiaGetSharingConfigResponseDto(MarusiaSharingConfigChatDto marusiaSharingConfigChatDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : marusiaSharingConfigChatDto);
    }
}
