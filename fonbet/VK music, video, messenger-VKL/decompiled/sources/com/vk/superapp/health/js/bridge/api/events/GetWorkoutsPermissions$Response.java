package com.vk.superapp.health.js.bridge.api.events;

import com.ironsource.C4217a2;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.asp;
import xsna.bd6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.qoy;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: GetWorkoutsPermissions.kt */
/* loaded from: classes6.dex */
public final class GetWorkoutsPermissions$Response implements bd6 {

    @pmi0("data")
    private final Data data;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    @pmi0("type")
    private final String type;

    public GetWorkoutsPermissions$Response(String str, Data data, String str2) {
        this.type = str;
        this.data = data;
        this.requestId = str2;
    }

    @Override // xsna.bd6
    public final bd6 a(String str) {
        return new GetWorkoutsPermissions$Response(this.type, this.data, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetWorkoutsPermissions$Response)) {
            return false;
        }
        GetWorkoutsPermissions$Response getWorkoutsPermissions$Response = (GetWorkoutsPermissions$Response) obj;
        return epx.f(this.type, getWorkoutsPermissions$Response.type) && epx.f(this.data, getWorkoutsPermissions$Response.data) && epx.f(this.requestId, getWorkoutsPermissions$Response.requestId);
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

    public /* synthetic */ GetWorkoutsPermissions$Response(String str, Data data, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? "VKWebAppGetWorkoutsPermissionsResult" : str, data, str2);
    }

    /* compiled from: GetWorkoutsPermissions.kt */
    public static final class Data {

        @pmi0("can_sync")
        private final boolean canSync;

        @pmi0("has_activity_recognition")
        private final Boolean hasActivityRecognition;

        @pmi0("has_logged_gms")
        private final Boolean hasLoggedGms;

        @pmi0("mobile_services_type")
        private final String mobileServicesType;

        @pmi0("permission_state")
        private final PermissionState permissionState;

        @pmi0(CommonUrlParts.REQUEST_ID)
        private final String requestId;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: GetWorkoutsPermissions.kt */
        public static final class PermissionState {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ PermissionState[] $VALUES;

            @pmi0(C4217a2.e)
            public static final PermissionState DISABLED;

            @pmi0("disabled_can_ask")
            public static final PermissionState DISABLED_CAN_ASK;

            @pmi0("granted")
            public static final PermissionState GRANTED;

            static {
                PermissionState permissionState = new PermissionState("GRANTED", 0);
                GRANTED = permissionState;
                PermissionState permissionState2 = new PermissionState("DISABLED_CAN_ASK", 1);
                DISABLED_CAN_ASK = permissionState2;
                PermissionState permissionState3 = new PermissionState("DISABLED", 2);
                DISABLED = permissionState3;
                PermissionState[] permissionStateArr = {permissionState, permissionState2, permissionState3};
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

        public Data(PermissionState permissionState, String str, boolean z, Boolean bool, Boolean bool2, String str2) {
            this.permissionState = permissionState;
            this.mobileServicesType = str;
            this.canSync = z;
            this.hasActivityRecognition = bool;
            this.hasLoggedGms = bool2;
            this.requestId = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            Data data = (Data) obj;
            return this.permissionState == data.permissionState && epx.f(this.mobileServicesType, data.mobileServicesType) && this.canSync == data.canSync && epx.f(this.hasActivityRecognition, data.hasActivityRecognition) && epx.f(this.hasLoggedGms, data.hasLoggedGms) && epx.f(this.requestId, data.requestId);
        }

        public final int hashCode() {
            int b = qoy.b(urd0.a(this.permissionState.hashCode() * 31, 31, this.mobileServicesType), 31, this.canSync);
            Boolean bool = this.hasActivityRecognition;
            int hashCode = (b + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.hasLoggedGms;
            int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            String str = this.requestId;
            return hashCode2 + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Data(permissionState=");
            sb.append(this.permissionState);
            sb.append(", mobileServicesType=");
            sb.append(this.mobileServicesType);
            sb.append(", canSync=");
            sb.append(this.canSync);
            sb.append(", hasActivityRecognition=");
            sb.append(this.hasActivityRecognition);
            sb.append(", hasLoggedGms=");
            sb.append(this.hasLoggedGms);
            sb.append(", requestId=");
            return ho8.a(sb, this.requestId, ')');
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ Data(PermissionState permissionState, String str, boolean z, Boolean bool, Boolean bool2, String str2, int i, zcl zclVar) {
            this(permissionState, str, z, bool, r7, r8);
            String str3;
            Boolean bool3;
            bool = (i & 8) != 0 ? null : bool;
            if ((i & 16) != 0) {
                str3 = str2;
                bool3 = null;
            } else {
                str3 = str2;
                bool3 = bool2;
            }
        }
    }
}
