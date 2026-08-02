package com.vk.newsfeed.posting.impl.domain.model;

import com.vk.newsfeed.posting.impl.domain.model.e;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$PickerType;
import xsna.epx;

/* compiled from: PostingPatch.kt */
/* loaded from: classes4.dex */
public final class m implements e.f {
    public final MobileOfficialAppsFeedStat$PickerType b;
    public final PickerTechMetrics c;

    public m(MobileOfficialAppsFeedStat$PickerType mobileOfficialAppsFeedStat$PickerType, PickerTechMetrics pickerTechMetrics) {
        this.b = mobileOfficialAppsFeedStat$PickerType;
        this.c = pickerTechMetrics;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.b == mVar.b && epx.f(this.c, mVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "SaveTechMetrics(pickerType=" + this.b + ", techMetrics=" + this.c + ')';
    }
}
