package com.vk.api.generated.auth.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: AuthAppConfigVkcAuthActionDto.kt */
/* loaded from: classes14.dex */
public final class AuthAppConfigVkcAuthActionDto implements Parcelable {
    public static final Parcelable.Creator<AuthAppConfigVkcAuthActionDto> CREATOR = new a();

    @pmi0("caption_text")
    private final String captionText;

    /* compiled from: AuthAppConfigVkcAuthActionDto.kt */
    public static final class a implements Parcelable.Creator<AuthAppConfigVkcAuthActionDto> {
        @Override // android.os.Parcelable.Creator
        public final AuthAppConfigVkcAuthActionDto createFromParcel(Parcel parcel) {
            return new AuthAppConfigVkcAuthActionDto(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AuthAppConfigVkcAuthActionDto[] newArray(int i) {
            return new AuthAppConfigVkcAuthActionDto[i];
        }
    }

    public AuthAppConfigVkcAuthActionDto(String str) {
        this.captionText = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AuthAppConfigVkcAuthActionDto) && epx.f(this.captionText, ((AuthAppConfigVkcAuthActionDto) obj).captionText);
    }

    public final int hashCode() {
        return this.captionText.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("AuthAppConfigVkcAuthActionDto(captionText="), this.captionText, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.captionText);
    }
}
