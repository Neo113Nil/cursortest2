package com.vk.api.generated.spaces.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: SpacesGetInviteLinkResponseDto.kt */
/* loaded from: classes15.dex */
public final class SpacesGetInviteLinkResponseDto implements Parcelable {
    public static final Parcelable.Creator<SpacesGetInviteLinkResponseDto> CREATOR = new a();

    @pmi0("link")
    private final String link;

    /* compiled from: SpacesGetInviteLinkResponseDto.kt */
    public static final class a implements Parcelable.Creator<SpacesGetInviteLinkResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final SpacesGetInviteLinkResponseDto createFromParcel(Parcel parcel) {
            return new SpacesGetInviteLinkResponseDto(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SpacesGetInviteLinkResponseDto[] newArray(int i) {
            return new SpacesGetInviteLinkResponseDto[i];
        }
    }

    public SpacesGetInviteLinkResponseDto(String str) {
        this.link = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SpacesGetInviteLinkResponseDto) && epx.f(this.link, ((SpacesGetInviteLinkResponseDto) obj).link);
    }

    public final int hashCode() {
        return this.link.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("SpacesGetInviteLinkResponseDto(link="), this.link, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.link);
    }
}
