package com.vk.sdk.api.bugtracker.dto;

import xsna.epx;
import xsna.i5s;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: BugtrackerBugreportSubscribeStateDto.kt */
/* loaded from: classes5.dex */
public final class BugtrackerBugreportSubscribeStateDto {

    @pmi0("can_set_subscribe")
    private final boolean canSetSubscribe;

    @pmi0("is_subscribed")
    private final Boolean isSubscribed;

    @pmi0("set_subscribe_hash")
    private final String setSubscribeHash;

    public BugtrackerBugreportSubscribeStateDto(boolean z, Boolean bool, String str) {
        this.canSetSubscribe = z;
        this.isSubscribed = bool;
        this.setSubscribeHash = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BugtrackerBugreportSubscribeStateDto)) {
            return false;
        }
        BugtrackerBugreportSubscribeStateDto bugtrackerBugreportSubscribeStateDto = (BugtrackerBugreportSubscribeStateDto) obj;
        return this.canSetSubscribe == bugtrackerBugreportSubscribeStateDto.canSetSubscribe && epx.f(this.isSubscribed, bugtrackerBugreportSubscribeStateDto.isSubscribed) && epx.f(this.setSubscribeHash, bugtrackerBugreportSubscribeStateDto.setSubscribeHash);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.canSetSubscribe) * 31;
        Boolean bool = this.isSubscribed;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.setSubscribeHash;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        boolean z = this.canSetSubscribe;
        Boolean bool = this.isSubscribed;
        String str = this.setSubscribeHash;
        StringBuilder sb = new StringBuilder("BugtrackerBugreportSubscribeStateDto(canSetSubscribe=");
        sb.append(z);
        sb.append(", isSubscribed=");
        sb.append(bool);
        sb.append(", setSubscribeHash=");
        return i5s.a(sb, str, ")");
    }

    public /* synthetic */ BugtrackerBugreportSubscribeStateDto(boolean z, Boolean bool, String str, int i, zcl zclVar) {
        this(z, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : str);
    }
}
