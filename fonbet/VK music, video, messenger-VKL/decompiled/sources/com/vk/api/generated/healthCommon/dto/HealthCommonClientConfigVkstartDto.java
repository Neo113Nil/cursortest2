package com.vk.api.generated.healthCommon.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;

/* compiled from: HealthCommonClientConfigVkstartDto.kt */
/* loaded from: classes14.dex */
public final class HealthCommonClientConfigVkstartDto implements Parcelable {
    public static final Parcelable.Creator<HealthCommonClientConfigVkstartDto> CREATOR = new a();

    @pmi0("sync")
    private final HealthCommonVkstartSyncConfigDto sync;

    /* compiled from: HealthCommonClientConfigVkstartDto.kt */
    public static final class a implements Parcelable.Creator<HealthCommonClientConfigVkstartDto> {
        @Override // android.os.Parcelable.Creator
        public final HealthCommonClientConfigVkstartDto createFromParcel(Parcel parcel) {
            return new HealthCommonClientConfigVkstartDto(HealthCommonVkstartSyncConfigDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final HealthCommonClientConfigVkstartDto[] newArray(int i) {
            return new HealthCommonClientConfigVkstartDto[i];
        }
    }

    public HealthCommonClientConfigVkstartDto(HealthCommonVkstartSyncConfigDto healthCommonVkstartSyncConfigDto) {
        this.sync = healthCommonVkstartSyncConfigDto;
    }

    public final HealthCommonVkstartSyncConfigDto d() {
        return this.sync;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof HealthCommonClientConfigVkstartDto) && epx.f(this.sync, ((HealthCommonClientConfigVkstartDto) obj).sync);
    }

    public final int hashCode() {
        return this.sync.hashCode();
    }

    public final String toString() {
        return "HealthCommonClientConfigVkstartDto(sync=" + this.sync + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.sync.writeToParcel(parcel, i);
    }
}
