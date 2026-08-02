package com.vk.stat.scheme;

import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import ru.ok.tracer.base.ucum.UcumUtils;
import xsna.epx;
import xsna.pmi0;
import xsna.so;
import xsna.zcl;

/* compiled from: MobileOfficialAppsCoreAccessibilityStat.kt */
/* loaded from: classes11.dex */
public final class MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityBrightness {

    @pmi0("current")
    private final Float current;

    @pmi0(InneractiveMediationNameConsts.MAX)
    private final Integer max;

    @pmi0(UcumUtils.UCUM_MINUTES)
    private final Integer min;

    public MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityBrightness() {
        this(null, null, null, 7, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityBrightness)) {
            return false;
        }
        MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityBrightness mobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityBrightness = (MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityBrightness) obj;
        return epx.f(this.min, mobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityBrightness.min) && epx.f(this.max, mobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityBrightness.max) && epx.f(this.current, mobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityBrightness.current);
    }

    public final int hashCode() {
        Integer num = this.min;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.max;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Float f = this.current;
        return hashCode2 + (f != null ? f.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CoreAccessibilityBrightness(min=");
        sb.append(this.min);
        sb.append(", max=");
        sb.append(this.max);
        sb.append(", current=");
        return so.b(sb, this.current, ')');
    }

    public MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityBrightness(Integer num, Integer num2, Float f) {
        this.min = num;
        this.max = num2;
        this.current = f;
    }

    public /* synthetic */ MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityBrightness(Integer num, Integer num2, Float f, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : f);
    }
}
