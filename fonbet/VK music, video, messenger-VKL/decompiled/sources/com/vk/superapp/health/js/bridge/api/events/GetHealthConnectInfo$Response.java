package com.vk.superapp.health.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.bd6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.qoy;
import xsna.zcl;

/* compiled from: GetHealthConnectInfo.kt */
/* loaded from: classes6.dex */
public final class GetHealthConnectInfo$Response implements bd6 {

    @pmi0("data")
    private final Data data;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    @pmi0("type")
    private final String type;

    public GetHealthConnectInfo$Response(String str, Data data, String str2) {
        this.type = str;
        this.data = data;
        this.requestId = str2;
    }

    @Override // xsna.bd6
    public final bd6 a(String str) {
        return new GetHealthConnectInfo$Response(this.type, this.data, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetHealthConnectInfo$Response)) {
            return false;
        }
        GetHealthConnectInfo$Response getHealthConnectInfo$Response = (GetHealthConnectInfo$Response) obj;
        return epx.f(this.type, getHealthConnectInfo$Response.type) && epx.f(this.data, getHealthConnectInfo$Response.data) && epx.f(this.requestId, getHealthConnectInfo$Response.requestId);
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

    public /* synthetic */ GetHealthConnectInfo$Response(String str, Data data, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? "VKWebAppGetHealthConnectInfoResult" : str, data, str2);
    }

    /* compiled from: GetHealthConnectInfo.kt */
    public static final class Data {

        @pmi0("device_brand")
        private final String deviceBrand;

        @pmi0("health_connect_info")
        private final String healthConnectInfo;

        @pmi0("health_connect_installer")
        private final String healthConnectInstaller;

        @pmi0("is_google_fit_installed")
        private final Boolean isGoogleFitInstalled;

        @pmi0("is_samsung_health_installed")
        private final Boolean isSamsungHealthInstalled;

        @pmi0(CommonUrlParts.REQUEST_ID)
        private final String requestId;

        @pmi0("sa_steps_health_connect")
        private final boolean saStepsHealthConnect;

        @pmi0("sa_workout_health_connect")
        private final boolean saWorkoutHealthConnect;

        public Data(String str, boolean z, boolean z2, String str2, Boolean bool, Boolean bool2, String str3, String str4) {
            this.healthConnectInfo = str;
            this.saWorkoutHealthConnect = z;
            this.saStepsHealthConnect = z2;
            this.deviceBrand = str2;
            this.isSamsungHealthInstalled = bool;
            this.isGoogleFitInstalled = bool2;
            this.healthConnectInstaller = str3;
            this.requestId = str4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            Data data = (Data) obj;
            return epx.f(this.healthConnectInfo, data.healthConnectInfo) && this.saWorkoutHealthConnect == data.saWorkoutHealthConnect && this.saStepsHealthConnect == data.saStepsHealthConnect && epx.f(this.deviceBrand, data.deviceBrand) && epx.f(this.isSamsungHealthInstalled, data.isSamsungHealthInstalled) && epx.f(this.isGoogleFitInstalled, data.isGoogleFitInstalled) && epx.f(this.healthConnectInstaller, data.healthConnectInstaller) && epx.f(this.requestId, data.requestId);
        }

        public final int hashCode() {
            int b = qoy.b(qoy.b(this.healthConnectInfo.hashCode() * 31, 31, this.saWorkoutHealthConnect), 31, this.saStepsHealthConnect);
            String str = this.deviceBrand;
            int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
            Boolean bool = this.isSamsungHealthInstalled;
            int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.isGoogleFitInstalled;
            int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            String str2 = this.healthConnectInstaller;
            int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.requestId;
            return hashCode4 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Data(healthConnectInfo=");
            sb.append(this.healthConnectInfo);
            sb.append(", saWorkoutHealthConnect=");
            sb.append(this.saWorkoutHealthConnect);
            sb.append(", saStepsHealthConnect=");
            sb.append(this.saStepsHealthConnect);
            sb.append(", deviceBrand=");
            sb.append(this.deviceBrand);
            sb.append(", isSamsungHealthInstalled=");
            sb.append(this.isSamsungHealthInstalled);
            sb.append(", isGoogleFitInstalled=");
            sb.append(this.isGoogleFitInstalled);
            sb.append(", healthConnectInstaller=");
            sb.append(this.healthConnectInstaller);
            sb.append(", requestId=");
            return ho8.a(sb, this.requestId, ')');
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ Data(String str, boolean z, boolean z2, String str2, Boolean bool, Boolean bool2, String str3, String str4, int i, zcl zclVar) {
            this(str, z, z2, str2, bool, bool2, r9, r10);
            String str5;
            String str6;
            str2 = (i & 8) != 0 ? null : str2;
            bool = (i & 16) != 0 ? null : bool;
            bool2 = (i & 32) != 0 ? null : bool2;
            if ((i & 64) != 0) {
                str5 = str4;
                str6 = null;
            } else {
                str5 = str4;
                str6 = str3;
            }
        }
    }
}
