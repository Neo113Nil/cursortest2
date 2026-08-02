package com.vk.superapp.health.js.bridge.api.events;

import com.ironsource.C4217a2;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.asp;
import xsna.bd6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: AskWorkoutsPermissions.kt */
/* loaded from: classes6.dex */
public final class AskWorkoutsPermissions$Response implements bd6 {

    @pmi0("data")
    private final Data data;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    @pmi0("type")
    private final String type;

    public AskWorkoutsPermissions$Response(String str, Data data, String str2) {
        this.type = str;
        this.data = data;
        this.requestId = str2;
    }

    @Override // xsna.bd6
    public final bd6 a(String str) {
        return new AskWorkoutsPermissions$Response(this.type, this.data, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AskWorkoutsPermissions$Response)) {
            return false;
        }
        AskWorkoutsPermissions$Response askWorkoutsPermissions$Response = (AskWorkoutsPermissions$Response) obj;
        return epx.f(this.type, askWorkoutsPermissions$Response.type) && epx.f(this.data, askWorkoutsPermissions$Response.data) && epx.f(this.requestId, askWorkoutsPermissions$Response.requestId);
    }

    public final int hashCode() {
        int hashCode = (this.data.hashCode() + (this.type.hashCode() * 31)) * 31;
        String str = this.requestId;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Response(type=");
        sb.append(this.type);
        sb.append(", data=");
        sb.append(this.data);
        sb.append(", requestId=");
        return ho8.a(sb, this.requestId, ')');
    }

    /* compiled from: AskWorkoutsPermissions.kt */
    public static final class Data {

        @pmi0("health_connect_info")
        private final HealthConnectInfo healthConnectInfo;

        @pmi0("permission_state")
        private final PermissionState permissionState;

        @pmi0(CommonUrlParts.REQUEST_ID)
        private final String requestId;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: AskWorkoutsPermissions.kt */
        public static final class HealthConnectInfo {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ HealthConnectInfo[] $VALUES;

            @pmi0("need_install")
            public static final HealthConnectInfo NEED_INSTALL;

            @pmi0("need_mandatory_update")
            public static final HealthConnectInfo NEED_MANDATORY_UPDATE;

            @pmi0("unavailable")
            public static final HealthConnectInfo UNAVAILABLE;

            static {
                HealthConnectInfo healthConnectInfo = new HealthConnectInfo("NEED_INSTALL", 0);
                NEED_INSTALL = healthConnectInfo;
                HealthConnectInfo healthConnectInfo2 = new HealthConnectInfo("NEED_MANDATORY_UPDATE", 1);
                NEED_MANDATORY_UPDATE = healthConnectInfo2;
                HealthConnectInfo healthConnectInfo3 = new HealthConnectInfo("UNAVAILABLE", 2);
                UNAVAILABLE = healthConnectInfo3;
                HealthConnectInfo[] healthConnectInfoArr = {healthConnectInfo, healthConnectInfo2, healthConnectInfo3};
                $VALUES = healthConnectInfoArr;
                $ENTRIES = new asp(healthConnectInfoArr);
            }

            private HealthConnectInfo(String str, int i) {
            }

            public static HealthConnectInfo valueOf(String str) {
                return (HealthConnectInfo) Enum.valueOf(HealthConnectInfo.class, str);
            }

            public static HealthConnectInfo[] values() {
                return (HealthConnectInfo[]) $VALUES.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: AskWorkoutsPermissions.kt */
        public static final class PermissionState {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ PermissionState[] $VALUES;

            @pmi0(C4217a2.e)
            public static final PermissionState DISABLED;

            @pmi0("granted")
            public static final PermissionState GRANTED;

            static {
                PermissionState permissionState = new PermissionState("GRANTED", 0);
                GRANTED = permissionState;
                PermissionState permissionState2 = new PermissionState("DISABLED", 1);
                DISABLED = permissionState2;
                PermissionState[] permissionStateArr = {permissionState, permissionState2};
                $VALUES = permissionStateArr;
                $ENTRIES = new asp(permissionStateArr);
            }

            private PermissionState(String str, int i) {
            }

            public static PermissionState valueOf(String str) {
                return (PermissionState) Enum.valueOf(PermissionState.class, str);
            }

            public static PermissionState[] values() {
                return (PermissionState[]) $VALUES.clone();
            }
        }

        public Data(PermissionState permissionState, HealthConnectInfo healthConnectInfo, String str) {
            this.permissionState = permissionState;
            this.healthConnectInfo = healthConnectInfo;
            this.requestId = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            Data data = (Data) obj;
            return this.permissionState == data.permissionState && this.healthConnectInfo == data.healthConnectInfo && epx.f(this.requestId, data.requestId);
        }

        public final int hashCode() {
            int hashCode = this.permissionState.hashCode() * 31;
            HealthConnectInfo healthConnectInfo = this.healthConnectInfo;
            int hashCode2 = (hashCode + (healthConnectInfo == null ? 0 : healthConnectInfo.hashCode())) * 31;
            String str = this.requestId;
            return hashCode2 + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Data(permissionState=");
            sb.append(this.permissionState);
            sb.append(", healthConnectInfo=");
            sb.append(this.healthConnectInfo);
            sb.append(", requestId=");
            return ho8.a(sb, this.requestId, ')');
        }

        public /* synthetic */ Data(PermissionState permissionState, HealthConnectInfo healthConnectInfo, String str, int i, zcl zclVar) {
            this(permissionState, (i & 2) != 0 ? null : healthConnectInfo, str);
        }
    }

    public /* synthetic */ AskWorkoutsPermissions$Response(String str, Data data, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? "VKWebAppAskWorkoutsPermissionsResult" : str, data, str2);
    }
}
