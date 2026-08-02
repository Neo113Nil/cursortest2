package com.vk.api.generated.vkRun.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;

/* compiled from: VkRunBackgroundSyncConfigDto.kt */
/* loaded from: classes15.dex */
public final class VkRunBackgroundSyncConfigDto implements Parcelable {
    public static final Parcelable.Creator<VkRunBackgroundSyncConfigDto> CREATOR = new a();

    @pmi0("is_enabled")
    private final boolean isEnabled;

    @pmi0("schedule")
    private final List<String> schedule;

    /* compiled from: VkRunBackgroundSyncConfigDto.kt */
    public static final class a implements Parcelable.Creator<VkRunBackgroundSyncConfigDto> {
        @Override // android.os.Parcelable.Creator
        public final VkRunBackgroundSyncConfigDto createFromParcel(Parcel parcel) {
            return new VkRunBackgroundSyncConfigDto(parcel.readInt() != 0, parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final VkRunBackgroundSyncConfigDto[] newArray(int i) {
            return new VkRunBackgroundSyncConfigDto[i];
        }
    }

    public VkRunBackgroundSyncConfigDto(boolean z, List<String> list) {
        this.isEnabled = z;
        this.schedule = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VkRunBackgroundSyncConfigDto)) {
            return false;
        }
        VkRunBackgroundSyncConfigDto vkRunBackgroundSyncConfigDto = (VkRunBackgroundSyncConfigDto) obj;
        return this.isEnabled == vkRunBackgroundSyncConfigDto.isEnabled && epx.f(this.schedule, vkRunBackgroundSyncConfigDto.schedule);
    }

    public final int hashCode() {
        return this.schedule.hashCode() + (Boolean.hashCode(this.isEnabled) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VkRunBackgroundSyncConfigDto(isEnabled=");
        sb.append(this.isEnabled);
        sb.append(", schedule=");
        return ms9.a(')', sb, this.schedule);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.isEnabled ? 1 : 0);
        parcel.writeStringList(this.schedule);
    }
}
