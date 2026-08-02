package com.vk.stat.scheme;

import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: SchemeStat.kt */
/* loaded from: classes5.dex */
public final class SchemeStat$VkSyncWorkoutsItem {

    @pmi0("gms_version")
    private final String gmsVersion;

    @pmi0("google_fit_version")
    private final String googleFitVersion;

    @pmi0("native_error_description")
    private final String nativeErrorDescription;

    @pmi0("workout_sync_time")
    private final int workoutSyncTime;

    public SchemeStat$VkSyncWorkoutsItem(int i, String str, String str2, String str3) {
        this.workoutSyncTime = i;
        this.nativeErrorDescription = str;
        this.googleFitVersion = str2;
        this.gmsVersion = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemeStat$VkSyncWorkoutsItem)) {
            return false;
        }
        SchemeStat$VkSyncWorkoutsItem schemeStat$VkSyncWorkoutsItem = (SchemeStat$VkSyncWorkoutsItem) obj;
        return this.workoutSyncTime == schemeStat$VkSyncWorkoutsItem.workoutSyncTime && epx.f(this.nativeErrorDescription, schemeStat$VkSyncWorkoutsItem.nativeErrorDescription) && epx.f(this.googleFitVersion, schemeStat$VkSyncWorkoutsItem.googleFitVersion) && epx.f(this.gmsVersion, schemeStat$VkSyncWorkoutsItem.gmsVersion);
    }

    public final int hashCode() {
        int a = urd0.a(urd0.a(Integer.hashCode(this.workoutSyncTime) * 31, 31, this.nativeErrorDescription), 31, this.googleFitVersion);
        String str = this.gmsVersion;
        return a + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VkSyncWorkoutsItem(workoutSyncTime=");
        sb.append(this.workoutSyncTime);
        sb.append(", nativeErrorDescription=");
        sb.append(this.nativeErrorDescription);
        sb.append(", googleFitVersion=");
        sb.append(this.googleFitVersion);
        sb.append(", gmsVersion=");
        return ho8.a(sb, this.gmsVersion, ')');
    }

    public /* synthetic */ SchemeStat$VkSyncWorkoutsItem(int i, String str, String str2, String str3, int i2, zcl zclVar) {
        this(i, str, str2, (i2 & 8) != 0 ? null : str3);
    }
}
