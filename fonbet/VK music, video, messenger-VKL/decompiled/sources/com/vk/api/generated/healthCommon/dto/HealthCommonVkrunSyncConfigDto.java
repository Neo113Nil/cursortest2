package com.vk.api.generated.healthCommon.dto;

import android.os.Parcel;
import android.os.Parcelable;
import io.appmetrica.analytics.impl.L2;
import xsna.epx;
import xsna.pmi0;

/* compiled from: HealthCommonVkrunSyncConfigDto.kt */
/* loaded from: classes14.dex */
public final class HealthCommonVkrunSyncConfigDto implements Parcelable {
    public static final Parcelable.Creator<HealthCommonVkrunSyncConfigDto> CREATOR = new a();

    @pmi0(L2.g)
    private final HealthCommonVkrunSyncBackgroundConfigDto background;

    @pmi0("is_enabled")
    private final boolean isEnabled;

    /* compiled from: HealthCommonVkrunSyncConfigDto.kt */
    public static final class a implements Parcelable.Creator<HealthCommonVkrunSyncConfigDto> {
        @Override // android.os.Parcelable.Creator
        public final HealthCommonVkrunSyncConfigDto createFromParcel(Parcel parcel) {
            return new HealthCommonVkrunSyncConfigDto(parcel.readInt() != 0, HealthCommonVkrunSyncBackgroundConfigDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final HealthCommonVkrunSyncConfigDto[] newArray(int i) {
            return new HealthCommonVkrunSyncConfigDto[i];
        }
    }

    public HealthCommonVkrunSyncConfigDto(boolean z, HealthCommonVkrunSyncBackgroundConfigDto healthCommonVkrunSyncBackgroundConfigDto) {
        this.isEnabled = z;
        this.background = healthCommonVkrunSyncBackgroundConfigDto;
    }

    public final HealthCommonVkrunSyncBackgroundConfigDto d() {
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
        if (!(obj instanceof HealthCommonVkrunSyncConfigDto)) {
            return false;
        }
        HealthCommonVkrunSyncConfigDto healthCommonVkrunSyncConfigDto = (HealthCommonVkrunSyncConfigDto) obj;
        return this.isEnabled == healthCommonVkrunSyncConfigDto.isEnabled && epx.f(this.background, healthCommonVkrunSyncConfigDto.background);
    }

    public final int hashCode() {
        return this.background.hashCode() + (Boolean.hashCode(this.isEnabled) * 31);
    }

    public final String toString() {
        return "HealthCommonVkrunSyncConfigDto(isEnabled=" + this.isEnabled + ", background=" + this.background + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.isEnabled ? 1 : 0);
        this.background.writeToParcel(parcel, i);
    }
}
