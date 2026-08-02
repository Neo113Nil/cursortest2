package com.vk.stat.scheme;

import xsna.pmi0;
import xsna.shy;

/* compiled from: SchemeStat.kt */
/* loaded from: classes5.dex */
public final class SchemeStat$VkRunSyncStepsItem {

    @pmi0("amount_of_days")
    private final int amountOfDays;

    @pmi0("is_manual_steps_enabled")
    private final boolean isManualStepsEnabled;

    @pmi0("steps_sync_time")
    private final int stepsSyncTime;

    public SchemeStat$VkRunSyncStepsItem(int i, int i2, boolean z) {
        this.stepsSyncTime = i;
        this.amountOfDays = i2;
        this.isManualStepsEnabled = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemeStat$VkRunSyncStepsItem)) {
            return false;
        }
        SchemeStat$VkRunSyncStepsItem schemeStat$VkRunSyncStepsItem = (SchemeStat$VkRunSyncStepsItem) obj;
        return this.stepsSyncTime == schemeStat$VkRunSyncStepsItem.stepsSyncTime && this.amountOfDays == schemeStat$VkRunSyncStepsItem.amountOfDays && this.isManualStepsEnabled == schemeStat$VkRunSyncStepsItem.isManualStepsEnabled;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isManualStepsEnabled) + shy.a(this.amountOfDays, Integer.hashCode(this.stepsSyncTime) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VkRunSyncStepsItem(stepsSyncTime=");
        sb.append(this.stepsSyncTime);
        sb.append(", amountOfDays=");
        sb.append(this.amountOfDays);
        sb.append(", isManualStepsEnabled=");
        return defpackage.q0.a(sb, this.isManualStepsEnabled, ')');
    }
}
