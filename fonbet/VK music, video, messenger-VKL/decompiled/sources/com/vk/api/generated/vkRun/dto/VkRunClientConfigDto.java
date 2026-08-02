package com.vk.api.generated.vkRun.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: VkRunClientConfigDto.kt */
/* loaded from: classes15.dex */
public final class VkRunClientConfigDto implements Parcelable {
    public static final Parcelable.Creator<VkRunClientConfigDto> CREATOR = new a();

    @pmi0("background_sync")
    private final VkRunBackgroundSyncConfigDto backgroundSync;

    @pmi0("live_activity_sec")
    private final Integer liveActivitySec;

    /* compiled from: VkRunClientConfigDto.kt */
    public static final class a implements Parcelable.Creator<VkRunClientConfigDto> {
        @Override // android.os.Parcelable.Creator
        public final VkRunClientConfigDto createFromParcel(Parcel parcel) {
            return new VkRunClientConfigDto(VkRunBackgroundSyncConfigDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final VkRunClientConfigDto[] newArray(int i) {
            return new VkRunClientConfigDto[i];
        }
    }

    public VkRunClientConfigDto(VkRunBackgroundSyncConfigDto vkRunBackgroundSyncConfigDto, Integer num) {
        this.backgroundSync = vkRunBackgroundSyncConfigDto;
        this.liveActivitySec = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VkRunClientConfigDto)) {
            return false;
        }
        VkRunClientConfigDto vkRunClientConfigDto = (VkRunClientConfigDto) obj;
        return epx.f(this.backgroundSync, vkRunClientConfigDto.backgroundSync) && epx.f(this.liveActivitySec, vkRunClientConfigDto.liveActivitySec);
    }

    public final int hashCode() {
        int hashCode = this.backgroundSync.hashCode() * 31;
        Integer num = this.liveActivitySec;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VkRunClientConfigDto(backgroundSync=");
        sb.append(this.backgroundSync);
        sb.append(", liveActivitySec=");
        return uqi.b(sb, this.liveActivitySec, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.backgroundSync.writeToParcel(parcel, i);
        Integer num = this.liveActivitySec;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public /* synthetic */ VkRunClientConfigDto(VkRunBackgroundSyncConfigDto vkRunBackgroundSyncConfigDto, Integer num, int i, zcl zclVar) {
        this(vkRunBackgroundSyncConfigDto, (i & 2) != 0 ? null : num);
    }
}
