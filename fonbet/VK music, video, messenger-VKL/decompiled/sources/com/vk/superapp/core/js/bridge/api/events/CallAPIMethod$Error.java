package com.vk.superapp.core.js.bridge.api.events;

import com.vk.superapp.base.js.bridge.Responses$ApiError;
import com.vk.superapp.base.js.bridge.Responses$ClientError;
import com.vk.superapp.base.js.bridge.a;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: CallAPIMethod.kt */
/* loaded from: classes6.dex */
public final class CallAPIMethod$Error implements a {

    @pmi0("data")
    private final Data data;

    @pmi0("type")
    private final String type;

    public CallAPIMethod$Error(String str, Data data) {
        this.type = str;
        this.data = data;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CallAPIMethod$Error)) {
            return false;
        }
        CallAPIMethod$Error callAPIMethod$Error = (CallAPIMethod$Error) obj;
        return epx.f(this.type, callAPIMethod$Error.type) && epx.f(this.data, callAPIMethod$Error.data);
    }

    public final int hashCode() {
        return this.data.hashCode() + (this.type.hashCode() * 31);
    }

    public final String toString() {
        return "Error(type=" + this.type + ", data=" + this.data + ')';
    }

    public /* synthetic */ CallAPIMethod$Error(String str, Data data, int i, zcl zclVar) {
        this((i & 1) != 0 ? "VKWebAppCallAPIMethodFailed" : str, data);
    }

    /* compiled from: CallAPIMethod.kt */
    public static final class Data implements a.InterfaceC1867a {

        @pmi0("api_error")
        private final Responses$ApiError apiError;

        @pmi0("client_error")
        private final Responses$ClientError clientError;

        @pmi0(CommonUrlParts.REQUEST_ID)
        private final String requestId;

        @pmi0("type")
        private final Type type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: CallAPIMethod.kt */
        public static final class Type {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ Type[] $VALUES;

            @pmi0("api_error")
            public static final Type API_ERROR;

            @pmi0("client_error")
            public static final Type CLIENT_ERROR;

            static {
                Type type = new Type("CLIENT_ERROR", 0);
                CLIENT_ERROR = type;
                Type type2 = new Type("API_ERROR", 1);
                API_ERROR = type2;
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

        public Data(Type type, String str, Responses$ClientError responses$ClientError, Responses$ApiError responses$ApiError) {
            this.type = type;
            this.requestId = str;
            this.clientError = responses$ClientError;
            this.apiError = responses$ApiError;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            Data data = (Data) obj;
            return this.type == data.type && epx.f(this.requestId, data.requestId) && epx.f(this.clientError, data.clientError) && epx.f(this.apiError, data.apiError);
        }

        public final int hashCode() {
            int hashCode = this.type.hashCode() * 31;
            String str = this.requestId;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            Responses$ClientError responses$ClientError = this.clientError;
            int hashCode3 = (hashCode2 + (responses$ClientError == null ? 0 : responses$ClientError.hashCode())) * 31;
            Responses$ApiError responses$ApiError = this.apiError;
            return hashCode3 + (responses$ApiError != null ? responses$ApiError.hashCode() : 0);
        }

        public final String toString() {
            return "Data(type=" + this.type + ", requestId=" + this.requestId + ", clientError=" + this.clientError + ", apiError=" + this.apiError + ')';
        }

        public /* synthetic */ Data(Type type, String str, Responses$ClientError responses$ClientError, Responses$ApiError responses$ApiError, int i, zcl zclVar) {
            this(type, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : responses$ClientError, (i & 8) != 0 ? null : responses$ApiError);
        }
    }
}
