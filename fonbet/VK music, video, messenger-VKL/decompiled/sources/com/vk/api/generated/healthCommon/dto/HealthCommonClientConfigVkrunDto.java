package com.vk.api.generated.healthCommon.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: HealthCommonClientConfigVkrunDto.kt */
/* loaded from: classes14.dex */
public final class HealthCommonClientConfigVkrunDto implements Parcelable {
    public static final Parcelable.Creator<HealthCommonClientConfigVkrunDto> CREATOR = new a();

    @pmi0("live_activity_sec")
    private final Integer liveActivitySec;

    @pmi0("sync")
    private final HealthCommonVkrunSyncConfigDto sync;

    /* compiled from: HealthCommonClientConfigVkrunDto.kt */
    public static final class a implements Parcelable.Creator<HealthCommonClientConfigVkrunDto> {
        @Override // android.os.Parcelable.Creator
        public final HealthCommonClientConfigVkrunDto createFromParcel(Parcel parcel) {
            return new HealthCommonClientConfigVkrunDto(HealthCommonVkrunSyncConfigDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final HealthCommonClientConfigVkrunDto[] newArray(int i) {
            return new HealthCommonClientConfigVkrunDto[i];
        }
    }

    public HealthCommonClientConfigVkrunDto(HealthCommonVkrunSyncConfigDto healthCommonVkrunSyncConfigDto, Integer num) {
        this.sync = healthCommonVkrunSyncConfigDto;
        this.liveActivitySec = num;
    }

    public final HealthCommonVkrunSyncConfigDto d() {
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
        if (!(obj instanceof HealthCommonClientConfigVkrunDto)) {
            return false;
        }
        HealthCommonClientConfigVkrunDto healthCommonClientConfigVkrunDto = (HealthCommonClientConfigVkrunDto) obj;
        return epx.f(this.sync, healthCommonClientConfigVkrunDto.sync) && epx.f(this.liveActivitySec, healthCommonClientConfigVkrunDto.liveActivitySec);
    }

    public final int hashCode() {
        int hashCode = this.sync.hashCode() * 31;
        Integer num = this.liveActivitySec;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HealthCommonClientConfigVkrunDto(sync=");
        sb.append(this.sync);
        sb.append(", liveActivitySec=");
        return uqi.b(sb, this.liveActivitySec, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.sync.writeToParcel(parcel, i);
        Integer num = this.liveActivitySec;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public /* synthetic */ HealthCommonClientConfigVkrunDto(HealthCommonVkrunSyncConfigDto healthCommonVkrunSyncConfigDto, Integer num, int i, zcl zclVar) {
        this(healthCommonVkrunSyncConfigDto, (i & 2) != 0 ? null : num);
    }
}
