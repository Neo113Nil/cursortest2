package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;

/* compiled from: MessagesMessageActionPhotoDto.kt */
/* loaded from: classes15.dex */
public final class MessagesMessageActionPhotoDto implements Parcelable {
    public static final Parcelable.Creator<MessagesMessageActionPhotoDto> CREATOR = new a();

    @pmi0("photo_100")
    private final String photo100;

    @pmi0("photo_200")
    private final String photo200;

    @pmi0("photo_50")
    private final String photo50;

    @pmi0("photo_base")
    private final String photoBase;

    /* compiled from: MessagesMessageActionPhotoDto.kt */
    public static final class a implements Parcelable.Creator<MessagesMessageActionPhotoDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesMessageActionPhotoDto createFromParcel(Parcel parcel) {
            return new MessagesMessageActionPhotoDto(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesMessageActionPhotoDto[] newArray(int i) {
            return new MessagesMessageActionPhotoDto[i];
        }
    }

    public MessagesMessageActionPhotoDto(String str, String str2, String str3, String str4) {
        this.photo50 = str;
        this.photo100 = str2;
        this.photo200 = str3;
        this.photoBase = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesMessageActionPhotoDto)) {
            return false;
        }
        MessagesMessageActionPhotoDto messagesMessageActionPhotoDto = (MessagesMessageActionPhotoDto) obj;
        return epx.f(this.photo50, messagesMessageActionPhotoDto.photo50) && epx.f(this.photo100, messagesMessageActionPhotoDto.photo100) && epx.f(this.photo200, messagesMessageActionPhotoDto.photo200) && epx.f(this.photoBase, messagesMessageActionPhotoDto.photoBase);
    }

    public final int hashCode() {
        return this.photoBase.hashCode() + urd0.a(urd0.a(this.photo50.hashCode() * 31, 31, this.photo100), 31, this.photo200);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesMessageActionPhotoDto(photo50=");
        sb.append(this.photo50);
        sb.append(", photo100=");
        sb.append(this.photo100);
        sb.append(", photo200=");
        sb.append(this.photo200);
        sb.append(", photoBase=");
        return ho8.a(sb, this.photoBase, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.photo50);
        parcel.writeString(this.photo100);
        parcel.writeString(this.photo200);
        parcel.writeString(this.photoBase);
    }
}
