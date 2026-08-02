package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeView;
import xsna.pmi0;

/* compiled from: MobileOfficialAppsFeedStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsFeedStat$TypeFeedShowIconComment implements SchemeStat$TypeView.b {

    @pmi0("event_subtype")
    private final MobileOfficialAppsFeedStat$SocialProofAuthorType eventSubtype;

    public MobileOfficialAppsFeedStat$TypeFeedShowIconComment(MobileOfficialAppsFeedStat$SocialProofAuthorType mobileOfficialAppsFeedStat$SocialProofAuthorType) {
        this.eventSubtype = mobileOfficialAppsFeedStat$SocialProofAuthorType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsFeedStat$TypeFeedShowIconComment) && this.eventSubtype == ((MobileOfficialAppsFeedStat$TypeFeedShowIconComment) obj).eventSubtype;
    }

    public final int hashCode() {
        return this.eventSubtype.hashCode();
    }

    public final String toString() {
        return "TypeFeedShowIconComment(eventSubtype=" + this.eventSubtype + ')';
    }
}
