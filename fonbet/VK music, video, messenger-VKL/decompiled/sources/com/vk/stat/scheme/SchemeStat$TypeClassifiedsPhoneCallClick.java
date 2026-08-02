package com.vk.stat.scheme;

import xsna.bh10;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: SchemeStat.kt */
/* loaded from: classes5.dex */
public final class SchemeStat$TypeClassifiedsPhoneCallClick {

    @pmi0("classified_id")
    private final String classifiedId;

    @pmi0("classified_url")
    private final String classifiedUrl;

    @pmi0("item_id")
    private final Long itemId;

    @pmi0("owner_id")
    private final long ownerId;

    @pmi0("source_screen")
    private final MobileOfficialAppsCoreNavStat$EventScreen sourceScreen;

    @pmi0("track_code")
    private final String trackCode;

    public SchemeStat$TypeClassifiedsPhoneCallClick(String str, long j, String str2, Long l, String str3, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen) {
        this.classifiedId = str;
        this.ownerId = j;
        this.classifiedUrl = str2;
        this.itemId = l;
        this.trackCode = str3;
        this.sourceScreen = mobileOfficialAppsCoreNavStat$EventScreen;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemeStat$TypeClassifiedsPhoneCallClick)) {
            return false;
        }
        SchemeStat$TypeClassifiedsPhoneCallClick schemeStat$TypeClassifiedsPhoneCallClick = (SchemeStat$TypeClassifiedsPhoneCallClick) obj;
        return epx.f(this.classifiedId, schemeStat$TypeClassifiedsPhoneCallClick.classifiedId) && this.ownerId == schemeStat$TypeClassifiedsPhoneCallClick.ownerId && epx.f(this.classifiedUrl, schemeStat$TypeClassifiedsPhoneCallClick.classifiedUrl) && epx.f(this.itemId, schemeStat$TypeClassifiedsPhoneCallClick.itemId) && epx.f(this.trackCode, schemeStat$TypeClassifiedsPhoneCallClick.trackCode) && this.sourceScreen == schemeStat$TypeClassifiedsPhoneCallClick.sourceScreen;
    }

    public final int hashCode() {
        int a = bh10.a(this.classifiedId.hashCode() * 31, 31, this.ownerId);
        String str = this.classifiedUrl;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.itemId;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.trackCode;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = this.sourceScreen;
        return hashCode3 + (mobileOfficialAppsCoreNavStat$EventScreen != null ? mobileOfficialAppsCoreNavStat$EventScreen.hashCode() : 0);
    }

    public final String toString() {
        return "TypeClassifiedsPhoneCallClick(classifiedId=" + this.classifiedId + ", ownerId=" + this.ownerId + ", classifiedUrl=" + this.classifiedUrl + ", itemId=" + this.itemId + ", trackCode=" + this.trackCode + ", sourceScreen=" + this.sourceScreen + ')';
    }

    public /* synthetic */ SchemeStat$TypeClassifiedsPhoneCallClick(String str, long j, String str2, Long l, String str3, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, int i, zcl zclVar) {
        this(str, j, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : l, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : mobileOfficialAppsCoreNavStat$EventScreen);
    }
}
