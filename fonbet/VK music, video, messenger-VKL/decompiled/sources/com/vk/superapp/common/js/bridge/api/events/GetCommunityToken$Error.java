package com.vk.superapp.common.js.bridge.api.events;

import com.vk.superapp.base.js.bridge.Responses$AuthError;
import com.vk.superapp.base.js.bridge.Responses$ClientError;
import com.vk.superapp.base.js.bridge.a;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: GetCommunityToken.kt */
/* loaded from: classes6.dex */
public final class GetCommunityToken$Error implements a {

    @pmi0("data")
    private final Data data;

    @pmi0("type")
    private final String type;

    public GetCommunityToken$Error(String str, Data data) {
        this.type = str;
        this.data = data;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetCommunityToken$Error)) {
            return false;
        }
        GetCommunityToken$Error getCommunityToken$Error = (GetCommunityToken$Error) obj;
        return epx.f(this.type, getCommunityToken$Error.type) && epx.f(this.data, getCommunityToken$Error.data);
    }

    public final int hashCode() {
        return this.data.hashCode() + (this.type.hashCode() * 31);
    }

    public final String toString() {
        return "Error(type=" + this.type + ", data=" + this.data + ')';
    }

    public /* synthetic */ GetCommunityToken$Error(String str, Data data, int i, zcl zclVar) {
        this((i & 1) != 0 ? "VKWebAppGetCommunityTokenFailed" : str, data);
    }

    /* compiled from: GetCommunityToken.kt */
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
        /* compiled from: GetCommunityToken.kt */
        public static final class Type {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ Type[] $VALUES;

            @pmi0("auth_error")
            public static final Type AUTH_ERROR;

            @pmi0("client_error")
            public static final Type CLIENT_ERROR;

            static {
                Type type = new Type("CLIENT_ERROR", 0);
                CLIENT_ERROR = type;
                Type type2 = new Type("AUTH_ERROR", 1);
                AUTH_ERROR = type2;
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

        public Data(Type type, String str, Responses$ClientError responses$ClientError, Responses$AuthError responses$AuthError) {
            this.type = type;
            this.requestId = str;
            this.clientError = responses$ClientError;
            this.authError = responses$AuthError;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            Data data = (Data) obj;
            return this.type == data.type && epx.f(this.requestId, data.requestId) && epx.f(this.clientError, data.clientError) && epx.f(this.authError, data.authError);
        }

        public final int hashCode() {
            int hashCode = this.type.hashCode() * 31;
            String str = this.requestId;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            Responses$ClientError responses$ClientError = this.clientError;
            int hashCode3 = (hashCode2 + (responses$ClientError == null ? 0 : responses$ClientError.hashCode())) * 31;
            Responses$AuthError responses$AuthError = this.authError;
            return hashCode3 + (responses$AuthError != null ? responses$AuthError.hashCode() : 0);
        }

        public final String toString() {
            return "Data(type=" + this.type + ", requestId=" + this.requestId + ", clientError=" + this.clientError + ", authError=" + this.authError + ')';
        }

        public /* synthetic */ Data(Type type, String str, Responses$ClientError responses$ClientError, Responses$AuthError responses$AuthError, int i, zcl zclVar) {
            this(type, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : responses$ClientError, (i & 8) != 0 ? null : responses$AuthError);
        }
    }
}
