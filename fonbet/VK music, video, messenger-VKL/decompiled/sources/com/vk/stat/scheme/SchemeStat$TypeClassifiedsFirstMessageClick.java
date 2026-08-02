package com.vk.stat.scheme;

import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: SchemeStat.kt */
/* loaded from: classes5.dex */
public final class SchemeStat$TypeClassifiedsFirstMessageClick {

    @pmi0("classified_id")
    private final String classifiedId;

    @pmi0("classified_url")
    private final String classifiedUrl;

    @pmi0("source_screen")
    private final MobileOfficialAppsCoreNavStat$EventScreen sourceScreen;

    @pmi0("track_code")
    private final String trackCode;

    public SchemeStat$TypeClassifiedsFirstMessageClick() {
        this(null, null, null, null, 15, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemeStat$TypeClassifiedsFirstMessageClick)) {
            return false;
        }
        SchemeStat$TypeClassifiedsFirstMessageClick schemeStat$TypeClassifiedsFirstMessageClick = (SchemeStat$TypeClassifiedsFirstMessageClick) obj;
        return epx.f(this.classifiedId, schemeStat$TypeClassifiedsFirstMessageClick.classifiedId) && epx.f(this.classifiedUrl, schemeStat$TypeClassifiedsFirstMessageClick.classifiedUrl) && epx.f(this.trackCode, schemeStat$TypeClassifiedsFirstMessageClick.trackCode) && this.sourceScreen == schemeStat$TypeClassifiedsFirstMessageClick.sourceScreen;
    }

    public final int hashCode() {
        String str = this.classifiedId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.classifiedUrl;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.trackCode;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = this.sourceScreen;
        return hashCode3 + (mobileOfficialAppsCoreNavStat$EventScreen != null ? mobileOfficialAppsCoreNavStat$EventScreen.hashCode() : 0);
    }

    public final String toString() {
        return "TypeClassifiedsFirstMessageClick(classifiedId=" + this.classifiedId + ", classifiedUrl=" + this.classifiedUrl + ", trackCode=" + this.trackCode + ", sourceScreen=" + this.sourceScreen + ')';
    }

    public SchemeStat$TypeClassifiedsFirstMessageClick(String str, String str2, String str3, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen) {
        this.classifiedId = str;
        this.classifiedUrl = str2;
        this.trackCode = str3;
        this.sourceScreen = mobileOfficialAppsCoreNavStat$EventScreen;
    }

    public /* synthetic */ SchemeStat$TypeClassifiedsFirstMessageClick(String str, String str2, String str3, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : mobileOfficialAppsCoreNavStat$EventScreen);
    }
}
