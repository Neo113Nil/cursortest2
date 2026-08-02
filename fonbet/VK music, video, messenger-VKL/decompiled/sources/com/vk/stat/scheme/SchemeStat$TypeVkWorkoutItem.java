package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeAction;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: SchemeStat.kt */
/* loaded from: classes5.dex */
public final class SchemeStat$TypeVkWorkoutItem implements SchemeStat$TypeAction.b {

    @pmi0("device_info_item")
    private final MobileOfficialAppsCoreDeviceStat$DeviceInfoItem deviceInfoItem;

    @pmi0("vk_sync_workouts_item")
    private final SchemeStat$VkSyncWorkoutsItem vkSyncWorkoutsItem;

    /* JADX WARN: Multi-variable type inference failed */
    public SchemeStat$TypeVkWorkoutItem() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemeStat$TypeVkWorkoutItem)) {
            return false;
        }
        SchemeStat$TypeVkWorkoutItem schemeStat$TypeVkWorkoutItem = (SchemeStat$TypeVkWorkoutItem) obj;
        return epx.f(this.vkSyncWorkoutsItem, schemeStat$TypeVkWorkoutItem.vkSyncWorkoutsItem) && epx.f(this.deviceInfoItem, schemeStat$TypeVkWorkoutItem.deviceInfoItem);
    }

    public final int hashCode() {
        SchemeStat$VkSyncWorkoutsItem schemeStat$VkSyncWorkoutsItem = this.vkSyncWorkoutsItem;
        int hashCode = (schemeStat$VkSyncWorkoutsItem == null ? 0 : schemeStat$VkSyncWorkoutsItem.hashCode()) * 31;
        MobileOfficialAppsCoreDeviceStat$DeviceInfoItem mobileOfficialAppsCoreDeviceStat$DeviceInfoItem = this.deviceInfoItem;
        return hashCode + (mobileOfficialAppsCoreDeviceStat$DeviceInfoItem != null ? mobileOfficialAppsCoreDeviceStat$DeviceInfoItem.hashCode() : 0);
    }

    public final String toString() {
        return "TypeVkWorkoutItem(vkSyncWorkoutsItem=" + this.vkSyncWorkoutsItem + ", deviceInfoItem=" + this.deviceInfoItem + ')';
    }

    public SchemeStat$TypeVkWorkoutItem(SchemeStat$VkSyncWorkoutsItem schemeStat$VkSyncWorkoutsItem, MobileOfficialAppsCoreDeviceStat$DeviceInfoItem mobileOfficialAppsCoreDeviceStat$DeviceInfoItem) {
        this.vkSyncWorkoutsItem = schemeStat$VkSyncWorkoutsItem;
        this.deviceInfoItem = mobileOfficialAppsCoreDeviceStat$DeviceInfoItem;
    }

    public /* synthetic */ SchemeStat$TypeVkWorkoutItem(SchemeStat$VkSyncWorkoutsItem schemeStat$VkSyncWorkoutsItem, MobileOfficialAppsCoreDeviceStat$DeviceInfoItem mobileOfficialAppsCoreDeviceStat$DeviceInfoItem, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : schemeStat$VkSyncWorkoutsItem, (i & 2) != 0 ? null : mobileOfficialAppsCoreDeviceStat$DeviceInfoItem);
    }
}
