package com.vk.api.generated.healthCommon.dto;

import android.os.Parcel;
import android.os.Parcelable;
import io.appmetrica.analytics.impl.L2;
import xsna.epx;
import xsna.pmi0;

/* compiled from: HealthCommonVkstartSyncConfigDto.kt */
/* loaded from: classes14.dex */
public final class HealthCommonVkstartSyncConfigDto implements Parcelable {
    public static final Parcelable.Creator<HealthCommonVkstartSyncConfigDto> CREATOR = new a();

    @pmi0(L2.g)
    private final HealthCommonVkstartSyncBackgroundConfigDto background;

    @pmi0("is_enabled")
    private final boolean isEnabled;

    /* compiled from: HealthCommonVkstartSyncConfigDto.kt */
    public static final class a implements Parcelable.Creator<HealthCommonVkstartSyncConfigDto> {
        @Override // android.os.Parcelable.Creator
        public final HealthCommonVkstartSyncConfigDto createFromParcel(Parcel parcel) {
            return new HealthCommonVkstartSyncConfigDto(parcel.readInt() != 0, HealthCommonVkstartSyncBackgroundConfigDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final HealthCommonVkstartSyncConfigDto[] newArray(int i) {
            return new HealthCommonVkstartSyncConfigDto[i];
        }
    }

    public HealthCommonVkstartSyncConfigDto(boolean z, HealthCommonVkstartSyncBackgroundConfigDto healthCommonVkstartSyncBackgroundConfigDto) {
        this.isEnabled = z;
        this.background = healthCommonVkstartSyncBackgroundConfigDto;
    }

    public final HealthCommonVkstartSyncBackgroundConfigDto d() {
        return this.background;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HealthCommonVkstartSyncConfigDto)) {
            return false;
        }
        HealthCommonVkstartSyncConfigDto healthCommonVkstartSyncConfigDto = (HealthCommonVkstartSyncConfigDto) obj;
        return this.isEnabled == healthCommonVkstartSyncConfigDto.isEnabled && epx.f(this.background, healthCommonVkstartSyncConfigDto.background);
    }

    public final int hashCode() {
        return this.background.hashCode() + (Boolean.hashCode(this.isEnabled) * 31);
    }

    public final String toString() {
        return "HealthCommonVkstartSyncConfigDto(isEnabled=" + this.isEnabled + ", background=" + this.background + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.isEnabled ? 1 : 0);
        this.background.writeToParcel(parcel, i);
    }
}
