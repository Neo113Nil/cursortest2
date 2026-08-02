package com.vk.api.generated.marusia.dto;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q0;
import xsna.epx;
import xsna.pmi0;

/* compiled from: MarusiaCapability2ItemDto.kt */
/* loaded from: classes15.dex */
public final class MarusiaCapability2ItemDto implements Parcelable {
    public static final Parcelable.Creator<MarusiaCapability2ItemDto> CREATOR = new a();

    @pmi0("capability")
    private final String capability;

    @pmi0("enabled")
    private final boolean enabled;

    /* compiled from: MarusiaCapability2ItemDto.kt */
    public static final class a implements Parcelable.Creator<MarusiaCapability2ItemDto> {
        @Override // android.os.Parcelable.Creator
        public final MarusiaCapability2ItemDto createFromParcel(Parcel parcel) {
            return new MarusiaCapability2ItemDto(parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final MarusiaCapability2ItemDto[] newArray(int i) {
            return new MarusiaCapability2ItemDto[i];
        }
    }

    public MarusiaCapability2ItemDto(String str, boolean z) {
        this.capability = str;
        this.enabled = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarusiaCapability2ItemDto)) {
            return false;
        }
        MarusiaCapability2ItemDto marusiaCapability2ItemDto = (MarusiaCapability2ItemDto) obj;
        return epx.f(this.capability, marusiaCapability2ItemDto.capability) && this.enabled == marusiaCapability2ItemDto.enabled;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.enabled) + (this.capability.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarusiaCapability2ItemDto(capability=");
        sb.append(this.capability);
        sb.append(", enabled=");
        return q0.a(sb, this.enabled, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.capability);
        parcel.writeInt(this.enabled ? 1 : 0);
    }
}
