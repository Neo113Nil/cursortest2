package com.vk.stat.scheme;

import xsna.epx;
import xsna.pmi0;
import xsna.tn;
import xsna.zcl;

/* compiled from: MobileOfficialAppsCoreWhitelistStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsCoreWhitelistStat$HostStatus {

    @pmi0("is_available")
    private final Boolean isAvailable;

    @pmi0("name")
    private final String name;

    public MobileOfficialAppsCoreWhitelistStat$HostStatus(String str, Boolean bool) {
        this.name = str;
        this.isAvailable = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsCoreWhitelistStat$HostStatus)) {
            return false;
        }
        MobileOfficialAppsCoreWhitelistStat$HostStatus mobileOfficialAppsCoreWhitelistStat$HostStatus = (MobileOfficialAppsCoreWhitelistStat$HostStatus) obj;
        return epx.f(this.name, mobileOfficialAppsCoreWhitelistStat$HostStatus.name) && epx.f(this.isAvailable, mobileOfficialAppsCoreWhitelistStat$HostStatus.isAvailable);
    }

    public final int hashCode() {
        int hashCode = this.name.hashCode() * 31;
        Boolean bool = this.isAvailable;
        return hashCode + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HostStatus(name=");
        sb.append(this.name);
        sb.append(", isAvailable=");
        return tn.a(sb, this.isAvailable, ')');
    }

    public /* synthetic */ MobileOfficialAppsCoreWhitelistStat$HostStatus(String str, Boolean bool, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : bool);
    }
}
