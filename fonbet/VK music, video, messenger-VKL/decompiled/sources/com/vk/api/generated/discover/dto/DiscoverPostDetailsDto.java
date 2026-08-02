package com.vk.api.generated.discover.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: DiscoverPostDetailsDto.kt */
/* loaded from: classes14.dex */
public final class DiscoverPostDetailsDto implements Parcelable {
    public static final Parcelable.Creator<DiscoverPostDetailsDto> CREATOR = new a();

    @pmi0("oid_types")
    private final String oidTypes;

    /* compiled from: DiscoverPostDetailsDto.kt */
    public static final class a implements Parcelable.Creator<DiscoverPostDetailsDto> {
        @Override // android.os.Parcelable.Creator
        public final DiscoverPostDetailsDto createFromParcel(Parcel parcel) {
            return new DiscoverPostDetailsDto(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final DiscoverPostDetailsDto[] newArray(int i) {
            return new DiscoverPostDetailsDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DiscoverPostDetailsDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DiscoverPostDetailsDto) && epx.f(this.oidTypes, ((DiscoverPostDetailsDto) obj).oidTypes);
    }

    public final int hashCode() {
        String str = this.oidTypes;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("DiscoverPostDetailsDto(oidTypes="), this.oidTypes, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.oidTypes);
    }

    public DiscoverPostDetailsDto(String str) {
        this.oidTypes = str;
    }

    public /* synthetic */ DiscoverPostDetailsDto(String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str);
    }
}
