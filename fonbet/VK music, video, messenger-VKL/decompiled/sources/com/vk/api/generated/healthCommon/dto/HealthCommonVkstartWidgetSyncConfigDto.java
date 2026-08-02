package com.vk.api.generated.healthCommon.dto;

import android.os.Parcel;
import android.os.Parcelable;
import io.appmetrica.analytics.impl.L2;
import xsna.epx;
import xsna.pmi0;

/* compiled from: HealthCommonVkstartWidgetSyncConfigDto.kt */
/* loaded from: classes14.dex */
public final class HealthCommonVkstartWidgetSyncConfigDto implements Parcelable {
    public static final Parcelable.Creator<HealthCommonVkstartWidgetSyncConfigDto> CREATOR = new a();

    @pmi0(L2.g)
    private final HealthCommonVkstartWidgetSyncBackgroundConfigDto background;

    @pmi0("is_enabled")
    private final boolean isEnabled;

    /* compiled from: HealthCommonVkstartWidgetSyncConfigDto.kt */
    public static final class a implements Parcelable.Creator<HealthCommonVkstartWidgetSyncConfigDto> {
        @Override // android.os.Parcelable.Creator
        public final HealthCommonVkstartWidgetSyncConfigDto createFromParcel(Parcel parcel) {
            return new HealthCommonVkstartWidgetSyncConfigDto(parcel.readInt() != 0, HealthCommonVkstartWidgetSyncBackgroundConfigDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final HealthCommonVkstartWidgetSyncConfigDto[] newArray(int i) {
            return new HealthCommonVkstartWidgetSyncConfigDto[i];
        }
    }

    public HealthCommonVkstartWidgetSyncConfigDto(boolean z, HealthCommonVkstartWidgetSyncBackgroundConfigDto healthCommonVkstartWidgetSyncBackgroundConfigDto) {
        this.isEnabled = z;
        this.background = healthCommonVkstartWidgetSyncBackgroundConfigDto;
    }

    public final HealthCommonVkstartWidgetSyncBackgroundConfigDto d() {
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
        if (!(obj instanceof HealthCommonVkstartWidgetSyncConfigDto)) {
            return false;
        }
        HealthCommonVkstartWidgetSyncConfigDto healthCommonVkstartWidgetSyncConfigDto = (HealthCommonVkstartWidgetSyncConfigDto) obj;
        return this.isEnabled == healthCommonVkstartWidgetSyncConfigDto.isEnabled && epx.f(this.background, healthCommonVkstartWidgetSyncConfigDto.background);
    }

    public final int hashCode() {
        return this.background.hashCode() + (Boolean.hashCode(this.isEnabled) * 31);
    }

    public final String toString() {
        return "HealthCommonVkstartWidgetSyncConfigDto(isEnabled=" + this.isEnabled + ", background=" + this.background + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.isEnabled ? 1 : 0);
        this.background.writeToParcel(parcel, i);
    }
}
