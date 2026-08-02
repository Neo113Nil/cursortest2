package com.vk.superapp.health.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.bd6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.qoy;
import xsna.urd0;
import xsna.zcl;

/* compiled from: GetStepsPermissions.kt */
/* loaded from: classes6.dex */
public final class GetStepsPermissions$Response implements bd6 {

    @pmi0("data")
    private final Data data;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    @pmi0("type")
    private final String type;

    /* compiled from: GetStepsPermissions.kt */
    public static final class Data {

        @pmi0("can_sync")
        private final boolean canSync;

        @pmi0("has_permissions")
        private final boolean hasPermissions;

        @pmi0("mobile_services_type")
        private final String mobileServicesType;

        @pmi0(CommonUrlParts.REQUEST_ID)
        private final String requestId;

        public Data(boolean z, String str, boolean z2, String str2) {
            this.hasPermissions = z;
            this.mobileServicesType = str;
            this.canSync = z2;
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
            return this.hasPermissions == data.hasPermissions && epx.f(this.mobileServicesType, data.mobileServicesType) && this.canSync == data.canSync && epx.f(this.requestId, data.requestId);
        }

        public final int hashCode() {
            int b = qoy.b(urd0.a(Boolean.hashCode(this.hasPermissions) * 31, 31, this.mobileServicesType), 31, this.canSync);
            String str = this.requestId;
            return b + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Data(hasPermissions=");
            sb.append(this.hasPermissions);
            sb.append(", mobileServicesType=");
            sb.append(this.mobileServicesType);
            sb.append(", canSync=");
            sb.append(this.canSync);
            sb.append(", requestId=");
            return ho8.a(sb, this.requestId, ')');
        }
    }

    public GetStepsPermissions$Response(String str, Data data, String str2) {
        this.type = str;
        this.data = data;
        this.requestId = str2;
    }

    @Override // xsna.bd6
    public final bd6 a(String str) {
        return new GetStepsPermissions$Response(this.type, this.data, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetStepsPermissions$Response)) {
            return false;
        }
        GetStepsPermissions$Response getStepsPermissions$Response = (GetStepsPermissions$Response) obj;
        return epx.f(this.type, getStepsPermissions$Response.type) && epx.f(this.data, getStepsPermissions$Response.data) && epx.f(this.requestId, getStepsPermissions$Response.requestId);
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

    public /* synthetic */ GetStepsPermissions$Response(String str, Data data, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? "VKWebAppGetStepsPermissionsResult" : str, data, str2);
    }
}
