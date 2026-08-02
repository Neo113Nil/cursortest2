package com.vk.api.generated.wall.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: WallWallpostAttachmentOnlineBookingDto.kt */
/* loaded from: classes15.dex */
public final class WallWallpostAttachmentOnlineBookingDto implements Parcelable {
    public static final Parcelable.Creator<WallWallpostAttachmentOnlineBookingDto> CREATOR = new a();

    @pmi0("booking_app_url")
    private final String bookingAppUrl;

    /* compiled from: WallWallpostAttachmentOnlineBookingDto.kt */
    public static final class a implements Parcelable.Creator<WallWallpostAttachmentOnlineBookingDto> {
        @Override // android.os.Parcelable.Creator
        public final WallWallpostAttachmentOnlineBookingDto createFromParcel(Parcel parcel) {
            return new WallWallpostAttachmentOnlineBookingDto(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final WallWallpostAttachmentOnlineBookingDto[] newArray(int i) {
            return new WallWallpostAttachmentOnlineBookingDto[i];
        }
    }

    public WallWallpostAttachmentOnlineBookingDto(String str) {
        this.bookingAppUrl = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WallWallpostAttachmentOnlineBookingDto) && epx.f(this.bookingAppUrl, ((WallWallpostAttachmentOnlineBookingDto) obj).bookingAppUrl);
    }

    public final int hashCode() {
        return this.bookingAppUrl.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("WallWallpostAttachmentOnlineBookingDto(bookingAppUrl="), this.bookingAppUrl, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.bookingAppUrl);
    }
}
