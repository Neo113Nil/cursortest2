package com.vk.superapp.health.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.bd6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: ShowVKRunNotification.kt */
/* loaded from: classes6.dex */
public final class ShowVKRunNotification$Response implements bd6 {

    @pmi0("data")
    private final Data data;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    @pmi0("type")
    private final String type;

    public ShowVKRunNotification$Response(String str, Data data, String str2) {
        this.type = str;
        this.data = data;
        this.requestId = str2;
    }

    @Override // xsna.bd6
    public final bd6 a(String str) {
        return new ShowVKRunNotification$Response(this.type, this.data, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShowVKRunNotification$Response)) {
            return false;
        }
        ShowVKRunNotification$Response showVKRunNotification$Response = (ShowVKRunNotification$Response) obj;
        return epx.f(this.type, showVKRunNotification$Response.type) && epx.f(this.data, showVKRunNotification$Response.data) && epx.f(this.requestId, showVKRunNotification$Response.requestId);
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

    public /* synthetic */ ShowVKRunNotification$Response(String str, Data data, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? "VKWebAppShowVKRunNotificationResult" : str, data, str2);
    }

    /* compiled from: ShowVKRunNotification.kt */
    public static final class Data {

        @pmi0("id")
        private final String id;

        @pmi0("is_feature_available")
        private final Boolean isFeatureAvailable;

        @pmi0("is_showing")
        private final Boolean isShowing;

        @pmi0(CommonUrlParts.REQUEST_ID)
        private final String requestId;

        @pmi0("result")
        private final Boolean result;

        public Data(Boolean bool, Boolean bool2, Boolean bool3, String str, String str2) {
            this.isFeatureAvailable = bool;
            this.result = bool2;
            this.isShowing = bool3;
            this.id = str;
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
            return epx.f(this.isFeatureAvailable, data.isFeatureAvailable) && epx.f(this.result, data.result) && epx.f(this.isShowing, data.isShowing) && epx.f(this.id, data.id) && epx.f(this.requestId, data.requestId);
        }

        public final int hashCode() {
            Boolean bool = this.isFeatureAvailable;
            int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            Boolean bool2 = this.result;
            int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            Boolean bool3 = this.isShowing;
            int hashCode3 = (hashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            String str = this.id;
            int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.requestId;
            return hashCode4 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Data(isFeatureAvailable=");
            sb.append(this.isFeatureAvailable);
            sb.append(", result=");
            sb.append(this.result);
            sb.append(", isShowing=");
            sb.append(this.isShowing);
            sb.append(", id=");
            sb.append(this.id);
            sb.append(", requestId=");
            return ho8.a(sb, this.requestId, ')');
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ Data(Boolean bool, Boolean bool2, Boolean bool3, String str, String str2, int i, zcl zclVar) {
            this(bool, bool2, bool3, r6, r7);
            String str3;
            String str4;
            bool = (i & 1) != 0 ? null : bool;
            bool2 = (i & 2) != 0 ? null : bool2;
            bool3 = (i & 4) != 0 ? null : bool3;
            if ((i & 8) != 0) {
                str3 = str2;
                str4 = null;
            } else {
                str3 = str2;
                str4 = str;
            }
        }
    }
}
