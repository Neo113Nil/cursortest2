package com.vk.superapp.dating.sdk.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.ad6;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: NavigateToSettings.kt */
/* loaded from: classes6.dex */
public final class NavigateToSettings$Parameters implements ad6 {

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    @pmi0("type")
    private final Type type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: NavigateToSettings.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        @pmi0("common")
        public static final Type COMMON;

        @pmi0("vpn")
        public static final Type VPN;

        static {
            Type type = new Type("COMMON", 0);
            COMMON = type;
            Type type2 = new Type("VPN", 1);
            VPN = type2;
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

    public NavigateToSettings$Parameters(String str, Type type) {
        this.requestId = str;
        this.type = type;
    }

    public static final NavigateToSettings$Parameters a(NavigateToSettings$Parameters navigateToSettings$Parameters) {
        return navigateToSettings$Parameters.requestId == null ? new NavigateToSettings$Parameters("default_request_id", navigateToSettings$Parameters.type) : navigateToSettings$Parameters;
    }

    public static final void b(NavigateToSettings$Parameters navigateToSettings$Parameters) {
        if (navigateToSettings$Parameters.requestId == null) {
            throw new IllegalArgumentException("Value of non-nullable member requestId cannot be\n                        null");
        }
    }

    public final String c() {
        return this.requestId;
    }

    public final Type d() {
        return this.type;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NavigateToSettings$Parameters)) {
            return false;
        }
        NavigateToSettings$Parameters navigateToSettings$Parameters = (NavigateToSettings$Parameters) obj;
        return epx.f(this.requestId, navigateToSettings$Parameters.requestId) && this.type == navigateToSettings$Parameters.type;
    }

    public final int hashCode() {
        int hashCode = this.requestId.hashCode() * 31;
        Type type = this.type;
        return hashCode + (type == null ? 0 : type.hashCode());
    }

    public final String toString() {
        return "Parameters(requestId=" + this.requestId + ", type=" + this.type + ')';
    }

    public /* synthetic */ NavigateToSettings$Parameters(String str, Type type, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : type);
    }
}
