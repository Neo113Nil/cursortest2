package com.vk.superapp.common.js.bridge.api.events;

import com.google.gson.JsonParseException;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.a9y;
import xsna.ad6;
import xsna.asp;
import xsna.b9y;
import xsna.epx;
import xsna.hay;
import xsna.pmi0;
import xsna.tay;
import xsna.uay;
import xsna.uqi;
import xsna.urd0;
import xsna.z8y;
import xsna.zcl;
import xsna.zrp;

/* compiled from: OpenPayForm.kt */
/* loaded from: classes6.dex */
public final class OpenPayForm$Parameters implements ad6 {

    @pmi0("action")
    private final Action action;

    @pmi0("app_id")
    private final Integer appId;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: OpenPayForm.kt */
    public static final class Action {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Action[] $VALUES;
        public static final Action PAY_TO_GROUP;
        public static final Action PAY_TO_SERVICE;
        public static final Action PAY_TO_USER;
        public static final Action RECURRENT;
        public static final Action TRANSFER_TO_GROUP;
        public static final Action TRANSFER_TO_USER;
        private final String value;

        /* compiled from: OpenPayForm.kt */
        public static final class Serializer implements uay<Action>, a9y<Action> {
            @Override // xsna.a9y
            public final Object a(b9y b9yVar, z8y z8yVar) {
                Action action;
                Action[] values = Action.values();
                int length = values.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        action = null;
                        break;
                    }
                    action = values[i];
                    if (epx.f(action.value.toString(), b9yVar.i().k())) {
                        break;
                    }
                    i++;
                }
                if (action != null) {
                    return action;
                }
                throw new JsonParseException(String.valueOf(b9yVar));
            }

            @Override // xsna.uay
            public final b9y b(Object obj, tay tayVar) {
                return new hay(((Action) obj).value);
            }
        }

        static {
            Action action = new Action("PAY_TO_SERVICE", 0, "pay-to-service");
            PAY_TO_SERVICE = action;
            Action action2 = new Action("PAY_TO_USER", 1, "pay-to-user");
            PAY_TO_USER = action2;
            Action action3 = new Action("PAY_TO_GROUP", 2, "pay-to-group");
            PAY_TO_GROUP = action3;
            Action action4 = new Action("TRANSFER_TO_GROUP", 3, "transfer-to-group");
            TRANSFER_TO_GROUP = action4;
            Action action5 = new Action("TRANSFER_TO_USER", 4, "transfer-to-user");
            TRANSFER_TO_USER = action5;
            Action action6 = new Action("RECURRENT", 5, "recurrent");
            RECURRENT = action6;
            Action[] actionArr = {action, action2, action3, action4, action5, action6};
            $VALUES = actionArr;
            $ENTRIES = new asp(actionArr);
        }

        public Action(String str, int i, String str2) {
            this.value = str2;
        }

        public static Action valueOf(String str) {
            return (Action) Enum.valueOf(Action.class, str);
        }

        public static Action[] values() {
            return (Action[]) $VALUES.clone();
        }
    }

    public OpenPayForm$Parameters(Action action, String str, Integer num) {
        this.action = action;
        this.requestId = str;
        this.appId = num;
    }

    public static final OpenPayForm$Parameters a(OpenPayForm$Parameters openPayForm$Parameters) {
        return openPayForm$Parameters.requestId == null ? new OpenPayForm$Parameters(openPayForm$Parameters.action, "default_request_id", openPayForm$Parameters.appId) : openPayForm$Parameters;
    }

    public static final void b(OpenPayForm$Parameters openPayForm$Parameters) {
        Integer num = openPayForm$Parameters.appId;
        if (num != null && num.intValue() < 1) {
            throw new IllegalArgumentException("Value appId cannot be less than 1");
        }
    }

    public static final void c(OpenPayForm$Parameters openPayForm$Parameters) {
        if (openPayForm$Parameters.action == null) {
            throw new IllegalArgumentException("Value of non-nullable member action cannot be\n                        null");
        }
        if (openPayForm$Parameters.requestId == null) {
            throw new IllegalArgumentException("Value of non-nullable member requestId cannot be\n                        null");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OpenPayForm$Parameters)) {
            return false;
        }
        OpenPayForm$Parameters openPayForm$Parameters = (OpenPayForm$Parameters) obj;
        return this.action == openPayForm$Parameters.action && epx.f(this.requestId, openPayForm$Parameters.requestId) && epx.f(this.appId, openPayForm$Parameters.appId);
    }

    public final int hashCode() {
        int a = urd0.a(this.action.hashCode() * 31, 31, this.requestId);
        Integer num = this.appId;
        return a + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Parameters(action=");
        sb.append(this.action);
        sb.append(", requestId=");
        sb.append(this.requestId);
        sb.append(", appId=");
        return uqi.b(sb, this.appId, ')');
    }

    public /* synthetic */ OpenPayForm$Parameters(Action action, String str, Integer num, int i, zcl zclVar) {
        this(action, str, (i & 4) != 0 ? null : num);
    }
}
