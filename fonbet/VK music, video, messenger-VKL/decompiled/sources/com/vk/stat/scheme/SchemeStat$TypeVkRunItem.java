package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeAction;
import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: SchemeStat.kt */
/* loaded from: classes5.dex */
public final class SchemeStat$TypeVkRunItem implements SchemeStat$TypeAction.b {

    @pmi0("device_info_item")
    private final MobileOfficialAppsCoreDeviceStat$DeviceInfoItem deviceInfoItem;

    @pmi0("vk_run_permission_item")
    private final List<SchemeStat$VkRunPermissionItem> vkRunPermissionItem;

    @pmi0("vk_run_sync_steps_item")
    private final SchemeStat$VkRunSyncStepsItem vkRunSyncStepsItem;

    public SchemeStat$TypeVkRunItem() {
        this(null, null, null, 7, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemeStat$TypeVkRunItem)) {
            return false;
        }
        SchemeStat$TypeVkRunItem schemeStat$TypeVkRunItem = (SchemeStat$TypeVkRunItem) obj;
        return epx.f(this.vkRunPermissionItem, schemeStat$TypeVkRunItem.vkRunPermissionItem) && epx.f(this.vkRunSyncStepsItem, schemeStat$TypeVkRunItem.vkRunSyncStepsItem) && epx.f(this.deviceInfoItem, schemeStat$TypeVkRunItem.deviceInfoItem);
    }

    public final int hashCode() {
        List<SchemeStat$VkRunPermissionItem> list = this.vkRunPermissionItem;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        SchemeStat$VkRunSyncStepsItem schemeStat$VkRunSyncStepsItem = this.vkRunSyncStepsItem;
        int hashCode2 = (hashCode + (schemeStat$VkRunSyncStepsItem == null ? 0 : schemeStat$VkRunSyncStepsItem.hashCode())) * 31;
        MobileOfficialAppsCoreDeviceStat$DeviceInfoItem mobileOfficialAppsCoreDeviceStat$DeviceInfoItem = this.deviceInfoItem;
        return hashCode2 + (mobileOfficialAppsCoreDeviceStat$DeviceInfoItem != null ? mobileOfficialAppsCoreDeviceStat$DeviceInfoItem.hashCode() : 0);
    }

    public final String toString() {
        return "TypeVkRunItem(vkRunPermissionItem=" + this.vkRunPermissionItem + ", vkRunSyncStepsItem=" + this.vkRunSyncStepsItem + ", deviceInfoItem=" + this.deviceInfoItem + ')';
    }

    public SchemeStat$TypeVkRunItem(List<SchemeStat$VkRunPermissionItem> list, SchemeStat$VkRunSyncStepsItem schemeStat$VkRunSyncStepsItem, MobileOfficialAppsCoreDeviceStat$DeviceInfoItem mobileOfficialAppsCoreDeviceStat$DeviceInfoItem) {
        this.vkRunPermissionItem = list;
        this.vkRunSyncStepsItem = schemeStat$VkRunSyncStepsItem;
        this.deviceInfoItem = mobileOfficialAppsCoreDeviceStat$DeviceInfoItem;
    }

    public /* synthetic */ SchemeStat$TypeVkRunItem(List list, SchemeStat$VkRunSyncStepsItem schemeStat$VkRunSyncStepsItem, MobileOfficialAppsCoreDeviceStat$DeviceInfoItem mobileOfficialAppsCoreDeviceStat$DeviceInfoItem, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : schemeStat$VkRunSyncStepsItem, (i & 4) != 0 ? null : mobileOfficialAppsCoreDeviceStat$DeviceInfoItem);
    }
}
