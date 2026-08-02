package com.vk.superapp.vkclient.js.bridge.api.events;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import ru.ok.android.externcalls.analytics.internal.storage.DatabaseHelper;
import xsna.ad6;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.tn;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: ShowSubscriptionBox.kt */
/* loaded from: classes6.dex */
public final class ShowSubscriptionBox$Parameters implements ad6 {

    @pmi0("action")
    private final Action action;

    @pmi0("instant_flow")
    private final Boolean instantFlow;

    @pmi0(DatabaseHelper.ITEM_COLUMN_NAME)
    private final String item;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    @pmi0("subscription_id")
    private final Integer subscriptionId;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ShowSubscriptionBox.kt */
    public static final class Action {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Action[] $VALUES;

        @pmi0("cancel")
        public static final Action CANCEL;

        @pmi0("create")
        public static final Action CREATE;

        @pmi0(CampaignEx.JSON_NATIVE_VIDEO_RESUME)
        public static final Action RESUME;

        static {
            Action action = new Action("CREATE", 0);
            CREATE = action;
            Action action2 = new Action("RESUME", 1);
            RESUME = action2;
            Action action3 = new Action("CANCEL", 2);
            CANCEL = action3;
            Action[] actionArr = {action, action2, action3};
            $VALUES = actionArr;
            $ENTRIES = new asp(actionArr);
        }

        private Action(String str, int i) {
        }

        public static Action valueOf(String str) {
            return (Action) Enum.valueOf(Action.class, str);
        }

        public static Action[] values() {
            return (Action[]) $VALUES.clone();
        }
    }

    public ShowSubscriptionBox$Parameters(Action action, String str, String str2, Integer num, Boolean bool) {
        this.action = action;
        this.requestId = str;
        this.item = str2;
        this.subscriptionId = num;
        this.instantFlow = bool;
    }

    public static final ShowSubscriptionBox$Parameters a(ShowSubscriptionBox$Parameters showSubscriptionBox$Parameters) {
        return showSubscriptionBox$Parameters.requestId == null ? new ShowSubscriptionBox$Parameters(showSubscriptionBox$Parameters.action, "default_request_id", showSubscriptionBox$Parameters.item, showSubscriptionBox$Parameters.subscriptionId, showSubscriptionBox$Parameters.instantFlow) : showSubscriptionBox$Parameters;
    }

    public static final void b(ShowSubscriptionBox$Parameters showSubscriptionBox$Parameters) {
        if (showSubscriptionBox$Parameters.action == null) {
            throw new IllegalArgumentException("Value of non-nullable member action cannot be\n                        null");
        }
        if (showSubscriptionBox$Parameters.requestId == null) {
            throw new IllegalArgumentException("Value of non-nullable member requestId cannot be\n                        null");
        }
    }

    public final Action c() {
        return this.action;
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
        if (!(obj instanceof ShowSubscriptionBox$Parameters)) {
            return false;
        }
        ShowSubscriptionBox$Parameters showSubscriptionBox$Parameters = (ShowSubscriptionBox$Parameters) obj;
        return this.action == showSubscriptionBox$Parameters.action && epx.f(this.requestId, showSubscriptionBox$Parameters.requestId) && epx.f(this.item, showSubscriptionBox$Parameters.item) && epx.f(this.subscriptionId, showSubscriptionBox$Parameters.subscriptionId) && epx.f(this.instantFlow, showSubscriptionBox$Parameters.instantFlow);
    }

    public final String f() {
        return this.requestId;
    }

    public final Integer g() {
        return this.subscriptionId;
    }

    public final int hashCode() {
        int a = urd0.a(this.action.hashCode() * 31, 31, this.requestId);
        String str = this.item;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.subscriptionId;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.instantFlow;
        return hashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Parameters(action=");
        sb.append(this.action);
        sb.append(", requestId=");
        sb.append(this.requestId);
        sb.append(", item=");
        sb.append(this.item);
        sb.append(", subscriptionId=");
        sb.append(this.subscriptionId);
        sb.append(", instantFlow=");
        return tn.a(sb, this.instantFlow, ')');
    }

    public /* synthetic */ ShowSubscriptionBox$Parameters(Action action, String str, String str2, Integer num, Boolean bool, int i, zcl zclVar) {
        this(action, str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : num, (i & 16) != 0 ? Boolean.FALSE : bool);
    }
}
