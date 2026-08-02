package com.vk.stat.scheme;

import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: SchemeStat.kt */
/* loaded from: classes5.dex */
public final class SchemeStat$TypeClassifiedsFilterApplyClick {

    @pmi0("search_id")
    private final String searchId;

    @pmi0("track_code")
    private final String trackCode;

    /* JADX WARN: Multi-variable type inference failed */
    public SchemeStat$TypeClassifiedsFilterApplyClick() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemeStat$TypeClassifiedsFilterApplyClick)) {
            return false;
        }
        SchemeStat$TypeClassifiedsFilterApplyClick schemeStat$TypeClassifiedsFilterApplyClick = (SchemeStat$TypeClassifiedsFilterApplyClick) obj;
        return epx.f(this.searchId, schemeStat$TypeClassifiedsFilterApplyClick.searchId) && epx.f(this.trackCode, schemeStat$TypeClassifiedsFilterApplyClick.trackCode);
    }

    public final int hashCode() {
        String str = this.searchId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.trackCode;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeClassifiedsFilterApplyClick(searchId=");
        sb.append(this.searchId);
        sb.append(", trackCode=");
        return ho8.a(sb, this.trackCode, ')');
    }

    public SchemeStat$TypeClassifiedsFilterApplyClick(String str, String str2) {
        this.searchId = str;
        this.trackCode = str2;
    }

    public /* synthetic */ SchemeStat$TypeClassifiedsFilterApplyClick(String str, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
