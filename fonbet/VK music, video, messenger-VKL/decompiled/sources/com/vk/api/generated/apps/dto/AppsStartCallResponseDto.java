package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: AppsStartCallResponseDto.kt */
/* loaded from: classes14.dex */
public final class AppsStartCallResponseDto implements Parcelable {
    public static final Parcelable.Creator<AppsStartCallResponseDto> CREATOR = new a();

    @pmi0(ApiProtocol.KEY_JOIN_LINK)
    private final String joinLink;

    /* compiled from: AppsStartCallResponseDto.kt */
    public static final class a implements Parcelable.Creator<AppsStartCallResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsStartCallResponseDto createFromParcel(Parcel parcel) {
            return new AppsStartCallResponseDto(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AppsStartCallResponseDto[] newArray(int i) {
            return new AppsStartCallResponseDto[i];
        }
    }

    public AppsStartCallResponseDto(String str) {
        this.joinLink = str;
    }

    public final String d() {
        return this.joinLink;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AppsStartCallResponseDto) && epx.f(this.joinLink, ((AppsStartCallResponseDto) obj).joinLink);
    }

    public final int hashCode() {
        return this.joinLink.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("AppsStartCallResponseDto(joinLink="), this.joinLink, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.joinLink);
    }
}
