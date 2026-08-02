package com.vk.api.generated.healthCommon.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: HealthCommonVkstartSyncBackgroundConfigDto.kt */
/* loaded from: classes14.dex */
public final class HealthCommonVkstartSyncBackgroundConfigDto implements Parcelable {
    public static final Parcelable.Creator<HealthCommonVkstartSyncBackgroundConfigDto> CREATOR = new a();

    @pmi0("is_enabled")
    private final boolean isEnabled;

    @pmi0("schedule")
    private final List<String> schedule;

    /* compiled from: HealthCommonVkstartSyncBackgroundConfigDto.kt */
    public static final class a implements Parcelable.Creator<HealthCommonVkstartSyncBackgroundConfigDto> {
        @Override // android.os.Parcelable.Creator
        public final HealthCommonVkstartSyncBackgroundConfigDto createFromParcel(Parcel parcel) {
            return new HealthCommonVkstartSyncBackgroundConfigDto(parcel.readInt() != 0, parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final HealthCommonVkstartSyncBackgroundConfigDto[] newArray(int i) {
            return new HealthCommonVkstartSyncBackgroundConfigDto[i];
        }
    }

    public HealthCommonVkstartSyncBackgroundConfigDto(boolean z, List<String> list) {
        this.isEnabled = z;
        this.schedule = list;
    }

    public final List<String> d() {
        return this.schedule;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean e() {
        return this.isEnabled;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HealthCommonVkstartSyncBackgroundConfigDto)) {
            return false;
        }
        HealthCommonVkstartSyncBackgroundConfigDto healthCommonVkstartSyncBackgroundConfigDto = (HealthCommonVkstartSyncBackgroundConfigDto) obj;
        return this.isEnabled == healthCommonVkstartSyncBackgroundConfigDto.isEnabled && epx.f(this.schedule, healthCommonVkstartSyncBackgroundConfigDto.schedule);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.isEnabled) * 31;
        List<String> list = this.schedule;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HealthCommonVkstartSyncBackgroundConfigDto(isEnabled=");
        sb.append(this.isEnabled);
        sb.append(", schedule=");
        return ms9.a(')', sb, this.schedule);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.isEnabled ? 1 : 0);
        parcel.writeStringList(this.schedule);
    }

    public /* synthetic */ HealthCommonVkstartSyncBackgroundConfigDto(boolean z, List list, int i, zcl zclVar) {
        this(z, (i & 2) != 0 ? null : list);
    }
}
