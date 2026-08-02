package com.vk.superapp.auth.js.bridge.api.events;

import com.vk.superapp.base.js.bridge.Responses$AuthError;
import com.vk.superapp.base.js.bridge.Responses$ClientError;
import com.vk.superapp.base.js.bridge.a;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.asp;
import xsna.epx;
import xsna.fr;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: GetSilentToken.kt */
/* loaded from: classes6.dex */
public final class GetSilentToken$Error implements a {

    @pmi0("data")
    private final Data data;

    @pmi0("type")
    private final String type;

    public GetSilentToken$Error(String str, Data data) {
        this.type = str;
        this.data = data;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetSilentToken$Error)) {
            return false;
        }
        GetSilentToken$Error getSilentToken$Error = (GetSilentToken$Error) obj;
        return epx.f(this.type, getSilentToken$Error.type) && epx.f(this.data, getSilentToken$Error.data);
    }

    public final int hashCode() {
        return this.data.hashCode() + (this.type.hashCode() * 31);
    }

    public final String toString() {
        return "Error(type=" + this.type + ", data=" + this.data + ')';
    }

    public /* synthetic */ GetSilentToken$Error(String str, Data data, int i, zcl zclVar) {
        this((i & 1) != 0 ? "VKWebAppGetSilentTokenFailed" : str, data);
    }

    /* compiled from: GetSilentToken.kt */
    public static final class Data implements a.InterfaceC1867a {

        @pmi0("auth_error")
        private final Responses$AuthError authError;

        @pmi0("client_error")
        private final Responses$ClientError clientError;

        @pmi0(CommonUrlParts.REQUEST_ID)
        private final String requestId;

        @pmi0("type")
        private final Type type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: GetSilentToken.kt */
        public static final class Type {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ Type[] $VALUES;

            @pmi0("auth_error")
            public static final Type AUTH_ERROR;

            @pmi0("client_error")
            public static final Type CLIENT_ERROR;

            static {
                Type type = new Type("AUTH_ERROR", 0);
                AUTH_ERROR = type;
                Type type2 = new Type("CLIENT_ERROR", 1);
                CLIENT_ERROR = type2;
                Type[] typeArr = {type, type2};
                $VALUES = typeArr;
                $ENTRIES = new asp(typeArr);
            }

            private Type(String str, int i) {
            }

            public static Type valueOf(String str) {
                return (Type) Enum.valueOf(Type.class, str);
            }

            public static Type[] values() {
                return (Type[]) $VALUES.clone();
            }
        }

        public Data(Type type, String str, Responses$AuthError responses$AuthError, Responses$ClientError responses$ClientError) {
            this.type = type;
            this.requestId = str;
            this.authError = responses$AuthError;
            this.clientError = responses$ClientError;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            Data data = (Data) obj;
            return this.type == data.type && epx.f(this.requestId, data.requestId) && epx.f(this.authError, data.authError) && epx.f(this.clientError, data.clientError);
        }

        public final int hashCode() {
            int hashCode = this.type.hashCode() * 31;
            String str = this.requestId;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            Responses$AuthError responses$AuthError = this.authError;
            int hashCode3 = (hashCode2 + (responses$AuthError == null ? 0 : responses$AuthError.hashCode())) * 31;
            Responses$ClientError responses$ClientError = this.clientError;
            return hashCode3 + (responses$ClientError != null ? responses$ClientError.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Data(type=");
            sb.append(this.type);
            sb.append(", requestId=");
            sb.append(this.requestId);
            sb.append(", authError=");
            sb.append(this.authError);
            sb.append(", clientError=");
            return fr.a(sb, this.clientError, ')');
        }

        public /* synthetic */ Data(Type type, String str, Responses$AuthError responses$AuthError, Responses$ClientError responses$ClientError, int i, zcl zclVar) {
            this(type, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : responses$AuthError, (i & 8) != 0 ? null : responses$ClientError);
        }
    }
}
