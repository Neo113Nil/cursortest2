package com.vk.superapp.vkclient.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.ad6;
import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: ShowGoodOrderBox.kt */
/* loaded from: classes6.dex */
public final class ShowGoodOrderBox$Parameters implements ad6 {

    @pmi0("external_item_id")
    private final String externalItemId;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    @pmi0("type")
    private final Type type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ShowGoodOrderBox.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        @pmi0("goods_order")
        public static final Type GOODS_ORDER;

        @pmi0("goods_subscription")
        public static final Type GOODS_SUBSCRIPTION;

        static {
            Type type = new Type("GOODS_ORDER", 0);
            GOODS_ORDER = type;
            Type type2 = new Type("GOODS_SUBSCRIPTION", 1);
            GOODS_SUBSCRIPTION = type2;
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

    public ShowGoodOrderBox$Parameters(Type type, String str, String str2) {
        this.type = type;
        this.requestId = str;
        this.externalItemId = str2;
    }

    public static final ShowGoodOrderBox$Parameters a(ShowGoodOrderBox$Parameters showGoodOrderBox$Parameters) {
        return showGoodOrderBox$Parameters.requestId == null ? new ShowGoodOrderBox$Parameters(showGoodOrderBox$Parameters.type, "default_request_id", showGoodOrderBox$Parameters.externalItemId) : showGoodOrderBox$Parameters;
    }

    public static final void b(ShowGoodOrderBox$Parameters showGoodOrderBox$Parameters) {
        if (showGoodOrderBox$Parameters.type == null) {
            throw new IllegalArgumentException("Value of non-nullable member type cannot be\n                        null");
        }
        if (showGoodOrderBox$Parameters.requestId == null) {
            throw new IllegalArgumentException("Value of non-nullable member requestId cannot be\n                        null");
        }
    }

    public final String c() {
        return this.externalItemId;
    }

    public final String d() {
        return this.requestId;
    }

    public final Type e() {
        return this.type;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShowGoodOrderBox$Parameters)) {
            return false;
        }
        ShowGoodOrderBox$Parameters showGoodOrderBox$Parameters = (ShowGoodOrderBox$Parameters) obj;
        return this.type == showGoodOrderBox$Parameters.type && epx.f(this.requestId, showGoodOrderBox$Parameters.requestId) && epx.f(this.externalItemId, showGoodOrderBox$Parameters.externalItemId);
    }

    public final int hashCode() {
        int a = urd0.a(this.type.hashCode() * 31, 31, this.requestId);
        String str = this.externalItemId;
        return a + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Parameters(type=");
        sb.append(this.type);
        sb.append(", requestId=");
        sb.append(this.requestId);
        sb.append(", externalItemId=");
        return ho8.a(sb, this.externalItemId, ')');
    }

    public /* synthetic */ ShowGoodOrderBox$Parameters(Type type, String str, String str2, int i, zcl zclVar) {
        this(type, str, (i & 4) != 0 ? null : str2);
    }
}
