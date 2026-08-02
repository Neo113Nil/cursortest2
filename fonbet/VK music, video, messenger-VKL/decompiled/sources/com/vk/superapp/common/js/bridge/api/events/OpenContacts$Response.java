package com.vk.superapp.common.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.bd6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: OpenContacts.kt */
/* loaded from: classes6.dex */
public final class OpenContacts$Response implements bd6 {

    @pmi0("data")
    private final Data data;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    @pmi0("type")
    private final String type;

    public OpenContacts$Response(String str, Data data, String str2) {
        this.type = str;
        this.data = data;
        this.requestId = str2;
    }

    @Override // xsna.bd6
    public final bd6 a(String str) {
        return new OpenContacts$Response(this.type, this.data, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OpenContacts$Response)) {
            return false;
        }
        OpenContacts$Response openContacts$Response = (OpenContacts$Response) obj;
        return epx.f(this.type, openContacts$Response.type) && epx.f(this.data, openContacts$Response.data) && epx.f(this.requestId, openContacts$Response.requestId);
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

    /* compiled from: OpenContacts.kt */
    public static final class Data {

        @pmi0("first_name")
        private final String firstName;

        @pmi0("last_name")
        private final String lastName;

        @pmi0("phone")
        private final String phone;

        @pmi0(CommonUrlParts.REQUEST_ID)
        private final String requestId;

        public Data(String str, String str2, String str3, String str4) {
            this.phone = str;
            this.firstName = str2;
            this.lastName = str3;
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
            return epx.f(this.phone, data.phone) && epx.f(this.firstName, data.firstName) && epx.f(this.lastName, data.lastName) && epx.f(this.requestId, data.requestId);
        }

        public final int hashCode() {
            String str = this.phone;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.firstName;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.lastName;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.requestId;
            return hashCode3 + (str4 != null ? str4.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Data(phone=");
            sb.append(this.phone);
            sb.append(", firstName=");
            sb.append(this.firstName);
            sb.append(", lastName=");
            sb.append(this.lastName);
            sb.append(", requestId=");
            return ho8.a(sb, this.requestId, ')');
        }

        public /* synthetic */ Data(String str, String str2, String str3, String str4, int i, zcl zclVar) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, str4);
        }
    }

    public /* synthetic */ OpenContacts$Response(String str, Data data, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? "VKWebAppOpenContactsResult" : str, data, str2);
    }
}
