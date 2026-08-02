package com.vk.stat.scheme;

import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MobileOfficialAppsImStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsImStat$TypeImMessagingActionItemAttachment {

    @pmi0("title")
    private final String title;

    @pmi0("type")
    private final String type;

    /* JADX WARN: Multi-variable type inference failed */
    public MobileOfficialAppsImStat$TypeImMessagingActionItemAttachment() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsImStat$TypeImMessagingActionItemAttachment)) {
            return false;
        }
        MobileOfficialAppsImStat$TypeImMessagingActionItemAttachment mobileOfficialAppsImStat$TypeImMessagingActionItemAttachment = (MobileOfficialAppsImStat$TypeImMessagingActionItemAttachment) obj;
        return epx.f(this.type, mobileOfficialAppsImStat$TypeImMessagingActionItemAttachment.type) && epx.f(this.title, mobileOfficialAppsImStat$TypeImMessagingActionItemAttachment.title);
    }

    public final int hashCode() {
        String str = this.type;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.title;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeImMessagingActionItemAttachment(type=");
        sb.append(this.type);
        sb.append(", title=");
        return ho8.a(sb, this.title, ')');
    }

    public MobileOfficialAppsImStat$TypeImMessagingActionItemAttachment(String str, String str2) {
        this.type = str;
        this.title = str2;
    }

    public /* synthetic */ MobileOfficialAppsImStat$TypeImMessagingActionItemAttachment(String str, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
