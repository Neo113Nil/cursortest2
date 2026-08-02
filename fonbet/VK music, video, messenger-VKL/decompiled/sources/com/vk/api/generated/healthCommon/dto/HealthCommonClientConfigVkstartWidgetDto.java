package com.vk.api.generated.healthCommon.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;

/* compiled from: HealthCommonClientConfigVkstartWidgetDto.kt */
/* loaded from: classes14.dex */
public final class HealthCommonClientConfigVkstartWidgetDto implements Parcelable {
    public static final Parcelable.Creator<HealthCommonClientConfigVkstartWidgetDto> CREATOR = new a();

    @pmi0("sync")
    private final HealthCommonVkstartWidgetSyncConfigDto sync;

    /* compiled from: HealthCommonClientConfigVkstartWidgetDto.kt */
    public static final class a implements Parcelable.Creator<HealthCommonClientConfigVkstartWidgetDto> {
        @Override // android.os.Parcelable.Creator
        public final HealthCommonClientConfigVkstartWidgetDto createFromParcel(Parcel parcel) {
            return new HealthCommonClientConfigVkstartWidgetDto(HealthCommonVkstartWidgetSyncConfigDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final HealthCommonClientConfigVkstartWidgetDto[] newArray(int i) {
            return new HealthCommonClientConfigVkstartWidgetDto[i];
        }
    }

    public HealthCommonClientConfigVkstartWidgetDto(HealthCommonVkstartWidgetSyncConfigDto healthCommonVkstartWidgetSyncConfigDto) {
        this.sync = healthCommonVkstartWidgetSyncConfigDto;
    }

    public final HealthCommonVkstartWidgetSyncConfigDto d() {
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
        return (obj instanceof HealthCommonClientConfigVkstartWidgetDto) && epx.f(this.sync, ((HealthCommonClientConfigVkstartWidgetDto) obj).sync);
    }

    public final int hashCode() {
        return this.sync.hashCode();
    }

    public final String toString() {
        return "HealthCommonClientConfigVkstartWidgetDto(sync=" + this.sync + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.sync.writeToParcel(parcel, i);
    }
}
