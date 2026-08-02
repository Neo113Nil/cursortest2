package com.vk.newsfeed.posting.impl.domain.model;

import com.vk.newsfeed.posting.impl.domain.model.e;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$PickerType;
import xsna.vu5;

/* compiled from: PostingPatch.kt */
/* loaded from: classes4.dex */
public final class l implements e.f {
    public final MobileOfficialAppsFeedStat$PickerType b;
    public final long c;

    public l(MobileOfficialAppsFeedStat$PickerType mobileOfficialAppsFeedStat$PickerType, long j) {
        this.b = mobileOfficialAppsFeedStat$PickerType;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.b == lVar.b && this.c == lVar.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SaveStartTime(pickerType=");
        sb.append(this.b);
        sb.append(", elapsedTime=");
        return vu5.a(')', this.c, sb);
    }
}
