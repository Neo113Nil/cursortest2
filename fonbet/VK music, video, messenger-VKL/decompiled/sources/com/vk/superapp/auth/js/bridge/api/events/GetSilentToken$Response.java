package com.vk.superapp.auth.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.List;
import xsna.bd6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.shy;
import xsna.urd0;
import xsna.zcl;

/* compiled from: GetSilentToken.kt */
/* loaded from: classes6.dex */
public final class GetSilentToken$Response implements bd6 {

    @pmi0("data")
    private final Data data;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    @pmi0("type")
    private final String type;

    public GetSilentToken$Response(String str, Data data, String str2) {
        this.type = str;
        this.data = data;
        this.requestId = str2;
    }

    @Override // xsna.bd6
    public final bd6 a(String str) {
        return new GetSilentToken$Response(this.type, this.data, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetSilentToken$Response)) {
            return false;
        }
        GetSilentToken$Response getSilentToken$Response = (GetSilentToken$Response) obj;
        return epx.f(this.type, getSilentToken$Response.type) && epx.f(this.data, getSilentToken$Response.data) && epx.f(this.requestId, getSilentToken$Response.requestId);
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

    public /* synthetic */ GetSilentToken$Response(String str, Data data, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? "VKWebAppGetSilentTokenResult" : str, data, str2);
    }

    /* compiled from: GetSilentToken.kt */
    public static final class Data {

        @pmi0(CommonUrlParts.REQUEST_ID)
        private final String requestId;

        @pmi0("tokens")
        private final List<Tokens> tokens;

        public Data(List<Tokens> list, String str) {
            this.tokens = list;
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
            return epx.f(this.tokens, data.tokens) && epx.f(this.requestId, data.requestId);
        }

        public final int hashCode() {
            int hashCode = this.tokens.hashCode() * 31;
            String str = this.requestId;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Data(tokens=");
            sb.append(this.tokens);
            sb.append(", requestId=");
            return ho8.a(sb, this.requestId, ')');
        }

        /* compiled from: GetSilentToken.kt */
        public static final class Tokens {

            @pmi0("first_name")
            private final String firstName;

            @pmi0("last_name")
            private final String lastName;

            @pmi0("phone")
            private final String phone;

            @pmi0("photo_100")
            private final String photo100;

            @pmi0("photo_200")
            private final String photo200;

            @pmi0("photo_50")
            private final String photo50;

            @pmi0("token")
            private final String token;

            @pmi0("ttl")
            private final int ttl;

            @pmi0("uuid")
            private final String uuid;

            public Tokens(String str, int i, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
                this.token = str;
                this.ttl = i;
                this.firstName = str2;
                this.lastName = str3;
                this.uuid = str4;
                this.photo50 = str5;
                this.photo100 = str6;
                this.photo200 = str7;
                this.phone = str8;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Tokens)) {
                    return false;
                }
                Tokens tokens = (Tokens) obj;
                return epx.f(this.token, tokens.token) && this.ttl == tokens.ttl && epx.f(this.firstName, tokens.firstName) && epx.f(this.lastName, tokens.lastName) && epx.f(this.uuid, tokens.uuid) && epx.f(this.photo50, tokens.photo50) && epx.f(this.photo100, tokens.photo100) && epx.f(this.photo200, tokens.photo200) && epx.f(this.phone, tokens.phone);
            }

            public final int hashCode() {
                int a = urd0.a(urd0.a(urd0.a(shy.a(this.ttl, this.token.hashCode() * 31, 31), 31, this.firstName), 31, this.lastName), 31, this.uuid);
                String str = this.photo50;
                int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.photo100;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.photo200;
                int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.phone;
                return hashCode3 + (str4 != null ? str4.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Tokens(token=");
                sb.append(this.token);
                sb.append(", ttl=");
                sb.append(this.ttl);
                sb.append(", firstName=");
                sb.append(this.firstName);
                sb.append(", lastName=");
                sb.append(this.lastName);
                sb.append(", uuid=");
                sb.append(this.uuid);
                sb.append(", photo50=");
                sb.append(this.photo50);
                sb.append(", photo100=");
                sb.append(this.photo100);
                sb.append(", photo200=");
                sb.append(this.photo200);
                sb.append(", phone=");
                return ho8.a(sb, this.phone, ')');
            }

            public /* synthetic */ Tokens(String str, int i, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i2, zcl zclVar) {
                this(str, i, str2, str3, str4, (i2 & 32) != 0 ? null : str5, (i2 & 64) != 0 ? null : str6, (i2 & 128) != 0 ? null : str7, (i2 & 256) != 0 ? null : str8);
            }
        }
    }
}
