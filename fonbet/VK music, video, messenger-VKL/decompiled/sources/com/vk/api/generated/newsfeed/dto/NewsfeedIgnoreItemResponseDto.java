package com.vk.api.generated.newsfeed.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: NewsfeedIgnoreItemResponseDto.kt */
/* loaded from: classes15.dex */
public final class NewsfeedIgnoreItemResponseDto implements Parcelable {
    public static final Parcelable.Creator<NewsfeedIgnoreItemResponseDto> CREATOR = new a();

    @pmi0("message")
    private final String message;

    @pmi0("status")
    private final boolean status;

    /* compiled from: NewsfeedIgnoreItemResponseDto.kt */
    public static final class a implements Parcelable.Creator<NewsfeedIgnoreItemResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final NewsfeedIgnoreItemResponseDto createFromParcel(Parcel parcel) {
            return new NewsfeedIgnoreItemResponseDto(parcel.readInt() != 0, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final NewsfeedIgnoreItemResponseDto[] newArray(int i) {
            return new NewsfeedIgnoreItemResponseDto[i];
        }
    }

    public NewsfeedIgnoreItemResponseDto(boolean z, String str) {
        this.status = z;
        this.message = str;
    }

    public final boolean d() {
        return this.status;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedIgnoreItemResponseDto)) {
            return false;
        }
        NewsfeedIgnoreItemResponseDto newsfeedIgnoreItemResponseDto = (NewsfeedIgnoreItemResponseDto) obj;
        return this.status == newsfeedIgnoreItemResponseDto.status && epx.f(this.message, newsfeedIgnoreItemResponseDto.message);
    }

    public final String getMessage() {
        return this.message;
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.status) * 31;
        String str = this.message;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NewsfeedIgnoreItemResponseDto(status=");
        sb.append(this.status);
        sb.append(", message=");
        return ho8.a(sb, this.message, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.status ? 1 : 0);
        parcel.writeString(this.message);
    }

    public /* synthetic */ NewsfeedIgnoreItemResponseDto(boolean z, String str, int i, zcl zclVar) {
        this(z, (i & 2) != 0 ? null : str);
    }
}
