package com.vk.api.generated.newsfeed.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: NewsfeedInfoBlockButtonDto.kt */
/* loaded from: classes15.dex */
public final class NewsfeedInfoBlockButtonDto implements Parcelable {
    public static final Parcelable.Creator<NewsfeedInfoBlockButtonDto> CREATOR = new a();

    @pmi0("text")
    private final String text;

    /* compiled from: NewsfeedInfoBlockButtonDto.kt */
    public static final class a implements Parcelable.Creator<NewsfeedInfoBlockButtonDto> {
        @Override // android.os.Parcelable.Creator
        public final NewsfeedInfoBlockButtonDto createFromParcel(Parcel parcel) {
            return new NewsfeedInfoBlockButtonDto(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final NewsfeedInfoBlockButtonDto[] newArray(int i) {
            return new NewsfeedInfoBlockButtonDto[i];
        }
    }

    public NewsfeedInfoBlockButtonDto(String str) {
        this.text = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof NewsfeedInfoBlockButtonDto) && epx.f(this.text, ((NewsfeedInfoBlockButtonDto) obj).text);
    }

    public final int hashCode() {
        return this.text.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("NewsfeedInfoBlockButtonDto(text="), this.text, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.text);
    }
}
