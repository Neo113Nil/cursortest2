package com.vk.stat.scheme;

import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: CommonEcommStat.kt */
/* loaded from: classes5.dex */
public final class CommonEcommStat$TypeSmbSubscriptionsCancelSubscriptionReasonSendItem {

    @pmi0("reason")
    private final String reason;

    @pmi0("reason_other")
    private final String reasonOther;

    /* JADX WARN: Multi-variable type inference failed */
    public CommonEcommStat$TypeSmbSubscriptionsCancelSubscriptionReasonSendItem() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonEcommStat$TypeSmbSubscriptionsCancelSubscriptionReasonSendItem)) {
            return false;
        }
        CommonEcommStat$TypeSmbSubscriptionsCancelSubscriptionReasonSendItem commonEcommStat$TypeSmbSubscriptionsCancelSubscriptionReasonSendItem = (CommonEcommStat$TypeSmbSubscriptionsCancelSubscriptionReasonSendItem) obj;
        return epx.f(this.reason, commonEcommStat$TypeSmbSubscriptionsCancelSubscriptionReasonSendItem.reason) && epx.f(this.reasonOther, commonEcommStat$TypeSmbSubscriptionsCancelSubscriptionReasonSendItem.reasonOther);
    }

    public final int hashCode() {
        String str = this.reason;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.reasonOther;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeSmbSubscriptionsCancelSubscriptionReasonSendItem(reason=");
        sb.append(this.reason);
        sb.append(", reasonOther=");
        return ho8.a(sb, this.reasonOther, ')');
    }

    public CommonEcommStat$TypeSmbSubscriptionsCancelSubscriptionReasonSendItem(String str, String str2) {
        this.reason = str;
        this.reasonOther = str2;
    }

    public /* synthetic */ CommonEcommStat$TypeSmbSubscriptionsCancelSubscriptionReasonSendItem(String str, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
