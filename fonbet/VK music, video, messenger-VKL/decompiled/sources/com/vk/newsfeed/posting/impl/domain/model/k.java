package com.vk.newsfeed.posting.impl.domain.model;

import com.vk.newsfeed.posting.impl.domain.model.e;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$PickerType;
import xsna.epx;
import xsna.iq;

/* compiled from: PostingPatch.kt */
/* loaded from: classes4.dex */
public final class k implements e.f {
    public final MobileOfficialAppsFeedStat$PickerType b;
    public final Long c;
    public final Long d;

    public k(MobileOfficialAppsFeedStat$PickerType mobileOfficialAppsFeedStat$PickerType, Long l, Long l2) {
        this.b = mobileOfficialAppsFeedStat$PickerType;
        this.c = l;
        this.d = l2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.b == kVar.b && epx.f(this.c, kVar.c) && epx.f(this.d, kVar.d);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        Long l = this.c;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.d;
        return hashCode2 + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SavePickTime(pickerType=");
        sb.append(this.b);
        sb.append(", interactiveElapsedTime=");
        sb.append(this.c);
        sb.append(", pickElapsedTime=");
        return iq.b(sb, this.d, ')');
    }
}
