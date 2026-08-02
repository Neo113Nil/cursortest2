package com.vk.superapp.common.js.bridge.api.events;

import com.vk.superapp.base.js.bridge.Responses$ClientError;
import com.vk.superapp.base.js.bridge.a;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.asp;
import xsna.epx;
import xsna.fr;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: UsersSearch.kt */
/* loaded from: classes6.dex */
public final class UsersSearch$Error implements a {

    @pmi0("data")
    private final Data data;

    @pmi0("type")
    private final String type;

    public UsersSearch$Error(String str, Data data) {
        this.type = str;
        this.data = data;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UsersSearch$Error)) {
            return false;
        }
        UsersSearch$Error usersSearch$Error = (UsersSearch$Error) obj;
        return epx.f(this.type, usersSearch$Error.type) && epx.f(this.data, usersSearch$Error.data);
    }

    public final int hashCode() {
        return this.data.hashCode() + (this.type.hashCode() * 31);
    }

    public final String toString() {
        return "Error(type=" + this.type + ", data=" + this.data + ')';
    }

    /* compiled from: UsersSearch.kt */
    public static final class Data implements a.InterfaceC1867a {

        @pmi0("client_error")
        private final Responses$ClientError clientError;

        @pmi0(CommonUrlParts.REQUEST_ID)
        private final String requestId;

        @pmi0("type")
        private final Type type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: UsersSearch.kt */
        public static final class Type {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ Type[] $VALUES;

            @pmi0("client_error")
            public static final Type CLIENT_ERROR;

            static {
                Type type = new Type("CLIENT_ERROR", 0);
                CLIENT_ERROR = type;
                Type[] typeArr = {type};
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

        public Data(Type type, String str, Responses$ClientError responses$ClientError) {
            this.type = type;
            this.requestId = str;
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
            return this.type == data.type && epx.f(this.requestId, data.requestId) && epx.f(this.clientError, data.clientError);
        }

        public final int hashCode() {
            int hashCode = this.type.hashCode() * 31;
            String str = this.requestId;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            Responses$ClientError responses$ClientError = this.clientError;
            return hashCode2 + (responses$ClientError != null ? responses$ClientError.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Data(type=");
            sb.append(this.type);
            sb.append(", requestId=");
            sb.append(this.requestId);
            sb.append(", clientError=");
            return fr.a(sb, this.clientError, ')');
        }

        public /* synthetic */ Data(Type type, String str, Responses$ClientError responses$ClientError, int i, zcl zclVar) {
            this(type, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : responses$ClientError);
        }
    }

    public /* synthetic */ UsersSearch$Error(String str, Data data, int i, zcl zclVar) {
        this((i & 1) != 0 ? "VKWebAppUsersSearchFailed" : str, data);
    }
}
