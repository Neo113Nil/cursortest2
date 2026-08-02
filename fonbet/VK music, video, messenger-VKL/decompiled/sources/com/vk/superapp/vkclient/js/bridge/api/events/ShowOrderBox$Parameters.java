package com.vk.superapp.vkclient.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import ru.ok.android.externcalls.analytics.internal.storage.DatabaseHelper;
import xsna.ad6;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.shy;
import xsna.tn;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: ShowOrderBox.kt */
/* loaded from: classes6.dex */
public final class ShowOrderBox$Parameters implements ad6 {

    @pmi0("hide_success_message")
    private final Boolean hideSuccessMessage;

    @pmi0("instant_flow")
    private final Boolean instantFlow;

    @pmi0(DatabaseHelper.ITEM_COLUMN_NAME)
    private final String item;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    @pmi0("type")
    private final Type type;

    @pmi0("votes")
    private final int votes;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ShowOrderBox.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        @pmi0(DatabaseHelper.ITEM_COLUMN_NAME)
        public static final Type ITEM;

        @pmi0("votes")
        public static final Type VOTES;

        static {
            Type type = new Type("ITEM", 0);
            ITEM = type;
            Type type2 = new Type("VOTES", 1);
            VOTES = type2;
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

    public ShowOrderBox$Parameters(Type type, String str, int i, String str2, Boolean bool, Boolean bool2) {
        this.type = type;
        this.item = str;
        this.votes = i;
        this.requestId = str2;
        this.instantFlow = bool;
        this.hideSuccessMessage = bool2;
    }

    public static final ShowOrderBox$Parameters a(ShowOrderBox$Parameters showOrderBox$Parameters) {
        return showOrderBox$Parameters.requestId == null ? new ShowOrderBox$Parameters(showOrderBox$Parameters.type, showOrderBox$Parameters.item, showOrderBox$Parameters.votes, "default_request_id", showOrderBox$Parameters.instantFlow, showOrderBox$Parameters.hideSuccessMessage) : showOrderBox$Parameters;
    }

    public static final void b(ShowOrderBox$Parameters showOrderBox$Parameters) {
        if (showOrderBox$Parameters.type == null) {
            throw new IllegalArgumentException("Value of non-nullable member type cannot be\n                        null");
        }
        if (showOrderBox$Parameters.item == null) {
            throw new IllegalArgumentException("Value of non-nullable member item cannot be\n                        null");
        }
        if (showOrderBox$Parameters.requestId == null) {
            throw new IllegalArgumentException("Value of non-nullable member requestId cannot be\n                        null");
        }
    }

    public final Boolean c() {
        return this.hideSuccessMessage;
    }

    public final Boolean d() {
        return this.instantFlow;
    }

    public final String e() {
        return this.item;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShowOrderBox$Parameters)) {
            return false;
        }
        ShowOrderBox$Parameters showOrderBox$Parameters = (ShowOrderBox$Parameters) obj;
        return this.type == showOrderBox$Parameters.type && epx.f(this.item, showOrderBox$Parameters.item) && this.votes == showOrderBox$Parameters.votes && epx.f(this.requestId, showOrderBox$Parameters.requestId) && epx.f(this.instantFlow, showOrderBox$Parameters.instantFlow) && epx.f(this.hideSuccessMessage, showOrderBox$Parameters.hideSuccessMessage);
    }

    public final String f() {
        return this.requestId;
    }

    public final Type g() {
        return this.type;
    }

    public final int hashCode() {
        int a = urd0.a(shy.a(this.votes, urd0.a(this.type.hashCode() * 31, 31, this.item), 31), 31, this.requestId);
        Boolean bool = this.instantFlow;
        int hashCode = (a + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.hideSuccessMessage;
        return hashCode + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Parameters(type=");
        sb.append(this.type);
        sb.append(", item=");
        sb.append(this.item);
        sb.append(", votes=");
        sb.append(this.votes);
        sb.append(", requestId=");
        sb.append(this.requestId);
        sb.append(", instantFlow=");
        sb.append(this.instantFlow);
        sb.append(", hideSuccessMessage=");
        return tn.a(sb, this.hideSuccessMessage, ')');
    }

    public /* synthetic */ ShowOrderBox$Parameters(Type type, String str, int i, String str2, Boolean bool, Boolean bool2, int i2, zcl zclVar) {
        this(type, str, i, str2, (i2 & 16) != 0 ? Boolean.FALSE : bool, (i2 & 32) != 0 ? null : bool2);
    }
}
