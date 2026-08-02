package com.vk.stat.scheme;

import com.vk.stat.scheme.MobileOfficialAppsFeedStat$PostingTimelineEvent;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MobileOfficialAppsFeedStat.kt */
/* loaded from: classes11.dex */
public final class MobileOfficialAppsFeedStat$PostingError implements MobileOfficialAppsFeedStat$PostingTimelineEvent.b {

    @pmi0("code")
    private final String code;

    @pmi0("message")
    private final String message;

    /* JADX WARN: Multi-variable type inference failed */
    public MobileOfficialAppsFeedStat$PostingError() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsFeedStat$PostingError)) {
            return false;
        }
        MobileOfficialAppsFeedStat$PostingError mobileOfficialAppsFeedStat$PostingError = (MobileOfficialAppsFeedStat$PostingError) obj;
        return epx.f(this.message, mobileOfficialAppsFeedStat$PostingError.message) && epx.f(this.code, mobileOfficialAppsFeedStat$PostingError.code);
    }

    public final int hashCode() {
        String str = this.message;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.code;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PostingError(message=");
        sb.append(this.message);
        sb.append(", code=");
        return ho8.a(sb, this.code, ')');
    }

    public MobileOfficialAppsFeedStat$PostingError(String str, String str2) {
        this.message = str;
        this.code = str2;
    }

    public /* synthetic */ MobileOfficialAppsFeedStat$PostingError(String str, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
