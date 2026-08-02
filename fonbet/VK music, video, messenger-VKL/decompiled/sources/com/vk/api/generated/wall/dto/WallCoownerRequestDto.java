package com.vk.api.generated.wall.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.bh10;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: WallCoownerRequestDto.kt */
/* loaded from: classes15.dex */
public final class WallCoownerRequestDto implements Parcelable {
    public static final Parcelable.Creator<WallCoownerRequestDto> CREATOR = new a();

    @pmi0("coowner_id")
    private final UserId coownerId;

    @pmi0("owner_id")
    private final UserId ownerId;

    @pmi0("request_rejected_privacy_link")
    private final String requestRejectedPrivacyLink;

    /* compiled from: WallCoownerRequestDto.kt */
    public static final class a implements Parcelable.Creator<WallCoownerRequestDto> {
        @Override // android.os.Parcelable.Creator
        public final WallCoownerRequestDto createFromParcel(Parcel parcel) {
            return new WallCoownerRequestDto((UserId) parcel.readParcelable(WallCoownerRequestDto.class.getClassLoader()), (UserId) parcel.readParcelable(WallCoownerRequestDto.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final WallCoownerRequestDto[] newArray(int i) {
            return new WallCoownerRequestDto[i];
        }
    }

    public WallCoownerRequestDto(UserId userId, UserId userId2, String str) {
        this.ownerId = userId;
        this.coownerId = userId2;
        this.requestRejectedPrivacyLink = str;
    }

    public final UserId d() {
        return this.coownerId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.requestRejectedPrivacyLink;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WallCoownerRequestDto)) {
            return false;
        }
        WallCoownerRequestDto wallCoownerRequestDto = (WallCoownerRequestDto) obj;
        return epx.f(this.ownerId, wallCoownerRequestDto.ownerId) && epx.f(this.coownerId, wallCoownerRequestDto.coownerId) && epx.f(this.requestRejectedPrivacyLink, wallCoownerRequestDto.requestRejectedPrivacyLink);
    }

    public final int hashCode() {
        return this.requestRejectedPrivacyLink.hashCode() + bh10.a(Long.hashCode(this.ownerId.b) * 31, 31, this.coownerId.b);
    }

    public final UserId q() {
        return this.ownerId;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WallCoownerRequestDto(ownerId=");
        sb.append(this.ownerId);
        sb.append(", coownerId=");
        sb.append(this.coownerId);
        sb.append(", requestRejectedPrivacyLink=");
        return ho8.a(sb, this.requestRejectedPrivacyLink, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.ownerId, i);
        parcel.writeParcelable(this.coownerId, i);
        parcel.writeString(this.requestRejectedPrivacyLink);
    }
}
