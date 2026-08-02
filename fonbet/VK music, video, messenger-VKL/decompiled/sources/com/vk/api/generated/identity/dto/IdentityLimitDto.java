package com.vk.api.generated.identity.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: IdentityLimitDto.kt */
/* loaded from: classes14.dex */
public final class IdentityLimitDto implements Parcelable {
    public static final Parcelable.Creator<IdentityLimitDto> CREATOR = new a();

    @pmi0("max_count")
    private final int maxCount;

    @pmi0("type")
    private final String type;

    /* compiled from: IdentityLimitDto.kt */
    public static final class a implements Parcelable.Creator<IdentityLimitDto> {
        @Override // android.os.Parcelable.Creator
        public final IdentityLimitDto createFromParcel(Parcel parcel) {
            return new IdentityLimitDto(parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final IdentityLimitDto[] newArray(int i) {
            return new IdentityLimitDto[i];
        }
    }

    public IdentityLimitDto(int i, String str) {
        this.maxCount = i;
        this.type = str;
    }

    public final int d() {
        return this.maxCount;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IdentityLimitDto)) {
            return false;
        }
        IdentityLimitDto identityLimitDto = (IdentityLimitDto) obj;
        return this.maxCount == identityLimitDto.maxCount && epx.f(this.type, identityLimitDto.type);
    }

    public final String getType() {
        return this.type;
    }

    public final int hashCode() {
        return this.type.hashCode() + (Integer.hashCode(this.maxCount) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IdentityLimitDto(maxCount=");
        sb.append(this.maxCount);
        sb.append(", type=");
        return ho8.a(sb, this.type, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.maxCount);
        parcel.writeString(this.type);
    }
}
