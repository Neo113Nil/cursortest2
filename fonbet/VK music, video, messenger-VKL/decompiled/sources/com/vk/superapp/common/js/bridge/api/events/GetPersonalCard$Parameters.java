package com.vk.superapp.common.js.bridge.api.events;

import com.huawei.hms.support.api.entity.common.CommonConstant;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.List;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import xsna.ad6;
import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: GetPersonalCard.kt */
/* loaded from: classes6.dex */
public final class GetPersonalCard$Parameters implements ad6 {

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    @pmi0("type")
    private final List<Type> type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GetPersonalCard.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        @pmi0(RTCStatsConstants.KEY_ADDRESS)
        public static final Type ADDRESS;

        @pmi0("email")
        public static final Type EMAIL;

        @pmi0("phone")
        public static final Type PHONE;

        static {
            Type type = new Type("PHONE", 0);
            PHONE = type;
            Type type2 = new Type(CommonConstant.RETKEY.EMAIL, 1);
            EMAIL = type2;
            Type type3 = new Type("ADDRESS", 2);
            ADDRESS = type3;
            Type[] typeArr = {type, type2, type3};
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

    /* JADX WARN: Multi-variable type inference failed */
    public GetPersonalCard$Parameters(List<? extends Type> list, String str) {
        this.type = list;
        this.requestId = str;
    }

    public static final GetPersonalCard$Parameters a(GetPersonalCard$Parameters getPersonalCard$Parameters) {
        return getPersonalCard$Parameters.requestId == null ? new GetPersonalCard$Parameters(getPersonalCard$Parameters.type, "default_request_id") : getPersonalCard$Parameters;
    }

    public static final void b(GetPersonalCard$Parameters getPersonalCard$Parameters) {
        if (getPersonalCard$Parameters.type == null) {
            throw new IllegalArgumentException("Value of non-nullable member type cannot be\n                        null");
        }
        if (getPersonalCard$Parameters.requestId == null) {
            throw new IllegalArgumentException("Value of non-nullable member requestId cannot be\n                        null");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetPersonalCard$Parameters)) {
            return false;
        }
        GetPersonalCard$Parameters getPersonalCard$Parameters = (GetPersonalCard$Parameters) obj;
        return epx.f(this.type, getPersonalCard$Parameters.type) && epx.f(this.requestId, getPersonalCard$Parameters.requestId);
    }

    public final int hashCode() {
        return this.requestId.hashCode() + (this.type.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Parameters(type=");
        sb.append(this.type);
        sb.append(", requestId=");
        return ho8.a(sb, this.requestId, ')');
    }
}
