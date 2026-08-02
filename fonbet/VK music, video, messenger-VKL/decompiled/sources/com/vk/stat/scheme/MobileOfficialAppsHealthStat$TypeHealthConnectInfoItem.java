package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeAction;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsHealthStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsHealthStat$TypeHealthConnectInfoItem implements SchemeStat$TypeAction.b {

    @pmi0("health_connect_installer")
    private final HealthConnectInstaller healthConnectInstaller;

    @pmi0("health_connect_sdk_status")
    private final HealthConnectSdkStatus healthConnectSdkStatus;

    @pmi0("is_google_fit_installed")
    private final Boolean isGoogleFitInstalled;

    @pmi0("is_samsung_health_installed")
    private final Boolean isSamsungHealthInstalled;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsHealthStat.kt */
    public static final class HealthConnectInstaller {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ HealthConnectInstaller[] $VALUES;

        @pmi0("not_installed")
        public static final HealthConnectInstaller NOT_INSTALLED;

        @pmi0("play_store")
        public static final HealthConnectInstaller PLAY_STORE;

        @pmi0("system_preinstalled")
        public static final HealthConnectInstaller SYSTEM_PREINSTALLED;

        @pmi0("unknown_source")
        public static final HealthConnectInstaller UNKNOWN_SOURCE;

        static {
            HealthConnectInstaller healthConnectInstaller = new HealthConnectInstaller("SYSTEM_PREINSTALLED", 0);
            SYSTEM_PREINSTALLED = healthConnectInstaller;
            HealthConnectInstaller healthConnectInstaller2 = new HealthConnectInstaller("PLAY_STORE", 1);
            PLAY_STORE = healthConnectInstaller2;
            HealthConnectInstaller healthConnectInstaller3 = new HealthConnectInstaller("UNKNOWN_SOURCE", 2);
            UNKNOWN_SOURCE = healthConnectInstaller3;
            HealthConnectInstaller healthConnectInstaller4 = new HealthConnectInstaller("NOT_INSTALLED", 3);
            NOT_INSTALLED = healthConnectInstaller4;
            HealthConnectInstaller[] healthConnectInstallerArr = {healthConnectInstaller, healthConnectInstaller2, healthConnectInstaller3, healthConnectInstaller4};
            $VALUES = healthConnectInstallerArr;
            $ENTRIES = new asp(healthConnectInstallerArr);
        }

        private HealthConnectInstaller(String str, int i) {
        }

        public static HealthConnectInstaller valueOf(String str) {
            return (HealthConnectInstaller) Enum.valueOf(HealthConnectInstaller.class, str);
        }

        public static HealthConnectInstaller[] values() {
            return (HealthConnectInstaller[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsHealthStat.kt */
    public static final class HealthConnectSdkStatus {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ HealthConnectSdkStatus[] $VALUES;

        @pmi0("available")
        public static final HealthConnectSdkStatus AVAILABLE;

        @pmi0("need_install")
        public static final HealthConnectSdkStatus NEED_INSTALL;

        @pmi0("need_update")
        public static final HealthConnectSdkStatus NEED_UPDATE;

        @pmi0("unavailable")
        public static final HealthConnectSdkStatus UNAVAILABLE;

        @pmi0("unavailable_timeout")
        public static final HealthConnectSdkStatus UNAVAILABLE_TIMEOUT;

        static {
            HealthConnectSdkStatus healthConnectSdkStatus = new HealthConnectSdkStatus("UNAVAILABLE", 0);
            UNAVAILABLE = healthConnectSdkStatus;
            HealthConnectSdkStatus healthConnectSdkStatus2 = new HealthConnectSdkStatus("AVAILABLE", 1);
            AVAILABLE = healthConnectSdkStatus2;
            HealthConnectSdkStatus healthConnectSdkStatus3 = new HealthConnectSdkStatus("NEED_UPDATE", 2);
            NEED_UPDATE = healthConnectSdkStatus3;
            HealthConnectSdkStatus healthConnectSdkStatus4 = new HealthConnectSdkStatus("NEED_INSTALL", 3);
            NEED_INSTALL = healthConnectSdkStatus4;
            HealthConnectSdkStatus healthConnectSdkStatus5 = new HealthConnectSdkStatus("UNAVAILABLE_TIMEOUT", 4);
            UNAVAILABLE_TIMEOUT = healthConnectSdkStatus5;
            HealthConnectSdkStatus[] healthConnectSdkStatusArr = {healthConnectSdkStatus, healthConnectSdkStatus2, healthConnectSdkStatus3, healthConnectSdkStatus4, healthConnectSdkStatus5};
            $VALUES = healthConnectSdkStatusArr;
            $ENTRIES = new asp(healthConnectSdkStatusArr);
        }

        private HealthConnectSdkStatus(String str, int i) {
        }

        public static HealthConnectSdkStatus valueOf(String str) {
            return (HealthConnectSdkStatus) Enum.valueOf(HealthConnectSdkStatus.class, str);
        }

        public static HealthConnectSdkStatus[] values() {
            return (HealthConnectSdkStatus[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsHealthStat$TypeHealthConnectInfoItem() {
        this(null, null, null, null, 15, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsHealthStat$TypeHealthConnectInfoItem)) {
            return false;
        }
        MobileOfficialAppsHealthStat$TypeHealthConnectInfoItem mobileOfficialAppsHealthStat$TypeHealthConnectInfoItem = (MobileOfficialAppsHealthStat$TypeHealthConnectInfoItem) obj;
        return this.healthConnectInstaller == mobileOfficialAppsHealthStat$TypeHealthConnectInfoItem.healthConnectInstaller && epx.f(this.isGoogleFitInstalled, mobileOfficialAppsHealthStat$TypeHealthConnectInfoItem.isGoogleFitInstalled) && epx.f(this.isSamsungHealthInstalled, mobileOfficialAppsHealthStat$TypeHealthConnectInfoItem.isSamsungHealthInstalled) && this.healthConnectSdkStatus == mobileOfficialAppsHealthStat$TypeHealthConnectInfoItem.healthConnectSdkStatus;
    }

    public final int hashCode() {
        HealthConnectInstaller healthConnectInstaller = this.healthConnectInstaller;
        int hashCode = (healthConnectInstaller == null ? 0 : healthConnectInstaller.hashCode()) * 31;
        Boolean bool = this.isGoogleFitInstalled;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isSamsungHealthInstalled;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        HealthConnectSdkStatus healthConnectSdkStatus = this.healthConnectSdkStatus;
        return hashCode3 + (healthConnectSdkStatus != null ? healthConnectSdkStatus.hashCode() : 0);
    }

    public final String toString() {
        return "TypeHealthConnectInfoItem(healthConnectInstaller=" + this.healthConnectInstaller + ", isGoogleFitInstalled=" + this.isGoogleFitInstalled + ", isSamsungHealthInstalled=" + this.isSamsungHealthInstalled + ", healthConnectSdkStatus=" + this.healthConnectSdkStatus + ')';
    }

    public MobileOfficialAppsHealthStat$TypeHealthConnectInfoItem(HealthConnectInstaller healthConnectInstaller, Boolean bool, Boolean bool2, HealthConnectSdkStatus healthConnectSdkStatus) {
        this.healthConnectInstaller = healthConnectInstaller;
        this.isGoogleFitInstalled = bool;
        this.isSamsungHealthInstalled = bool2;
        this.healthConnectSdkStatus = healthConnectSdkStatus;
    }

    public /* synthetic */ MobileOfficialAppsHealthStat$TypeHealthConnectInfoItem(HealthConnectInstaller healthConnectInstaller, Boolean bool, Boolean bool2, HealthConnectSdkStatus healthConnectSdkStatus, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : healthConnectInstaller, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : bool2, (i & 8) != 0 ? null : healthConnectSdkStatus);
    }
}
