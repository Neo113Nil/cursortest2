package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: AppsAdsSlotsVastDto.kt */
/* loaded from: classes14.dex */
public final class AppsAdsSlotsVastDto implements Parcelable {
    public static final Parcelable.Creator<AppsAdsSlotsVastDto> CREATOR = new a();

    @pmi0("endpoint_url")
    private final String endpointUrl;

    /* compiled from: AppsAdsSlotsVastDto.kt */
    public static final class a implements Parcelable.Creator<AppsAdsSlotsVastDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsAdsSlotsVastDto createFromParcel(Parcel parcel) {
            return new AppsAdsSlotsVastDto(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AppsAdsSlotsVastDto[] newArray(int i) {
            return new AppsAdsSlotsVastDto[i];
        }
    }

    public AppsAdsSlotsVastDto(String str) {
        this.endpointUrl = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AppsAdsSlotsVastDto) && epx.f(this.endpointUrl, ((AppsAdsSlotsVastDto) obj).endpointUrl);
    }

    public final int hashCode() {
        return this.endpointUrl.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("AppsAdsSlotsVastDto(endpointUrl="), this.endpointUrl, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.endpointUrl);
    }
}
