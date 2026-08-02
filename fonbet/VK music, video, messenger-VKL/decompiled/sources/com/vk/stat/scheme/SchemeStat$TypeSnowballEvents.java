package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeAction;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.epx;
import xsna.pmi0;
import xsna.tn;
import xsna.zcl;

/* compiled from: SchemeStat.kt */
/* loaded from: classes5.dex */
public final class SchemeStat$TypeSnowballEvents implements SchemeStat$TypeAction.b, SchemeStat$TypeClick.b {

    @pmi0("is_my")
    private final Boolean isMy;

    @pmi0("quantity")
    private final int quantity;

    @pmi0("target_user_id")
    private final Long targetUserId;

    public SchemeStat$TypeSnowballEvents(int i, Long l, Boolean bool) {
        this.quantity = i;
        this.targetUserId = l;
        this.isMy = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemeStat$TypeSnowballEvents)) {
            return false;
        }
        SchemeStat$TypeSnowballEvents schemeStat$TypeSnowballEvents = (SchemeStat$TypeSnowballEvents) obj;
        return this.quantity == schemeStat$TypeSnowballEvents.quantity && epx.f(this.targetUserId, schemeStat$TypeSnowballEvents.targetUserId) && epx.f(this.isMy, schemeStat$TypeSnowballEvents.isMy);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.quantity) * 31;
        Long l = this.targetUserId;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Boolean bool = this.isMy;
        return hashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeSnowballEvents(quantity=");
        sb.append(this.quantity);
        sb.append(", targetUserId=");
        sb.append(this.targetUserId);
        sb.append(", isMy=");
        return tn.a(sb, this.isMy, ')');
    }

    public /* synthetic */ SchemeStat$TypeSnowballEvents(int i, Long l, Boolean bool, int i2, zcl zclVar) {
        this(i, (i2 & 2) != 0 ? null : l, (i2 & 4) != 0 ? null : bool);
    }
}
