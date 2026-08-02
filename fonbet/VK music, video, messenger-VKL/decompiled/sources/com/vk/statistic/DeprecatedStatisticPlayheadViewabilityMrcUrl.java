package com.vk.statistic;

import xsna.epx;
import xsna.shy;
import xsna.vu5;

/* compiled from: DeprecatedStatisticPlayheadViewabilityMrcUrl.kt */
/* loaded from: classes5.dex */
public final class DeprecatedStatisticPlayheadViewabilityMrcUrl extends DeprecatedStatisticUrl {
    public final String g;
    public final int h;
    public final int i;
    public final int j;
    public final DeprecatedStatisticInterface k;
    public final TargetPlayheadViewability l;
    public final int m;
    public final int n;

    public DeprecatedStatisticPlayheadViewabilityMrcUrl(String str, int i, int i2, int i3, DeprecatedStatisticInterface deprecatedStatisticInterface, TargetPlayheadViewability targetPlayheadViewability, int i4, int i5) {
        super(str, "playhead_viewability_value", i, i2, i3, deprecatedStatisticInterface);
        this.g = str;
        this.h = i;
        this.i = i2;
        this.j = i3;
        this.k = deprecatedStatisticInterface;
        this.l = targetPlayheadViewability;
        this.m = i4;
        this.n = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeprecatedStatisticPlayheadViewabilityMrcUrl)) {
            return false;
        }
        DeprecatedStatisticPlayheadViewabilityMrcUrl deprecatedStatisticPlayheadViewabilityMrcUrl = (DeprecatedStatisticPlayheadViewabilityMrcUrl) obj;
        return epx.f(this.g, deprecatedStatisticPlayheadViewabilityMrcUrl.g) && this.h == deprecatedStatisticPlayheadViewabilityMrcUrl.h && this.i == deprecatedStatisticPlayheadViewabilityMrcUrl.i && this.j == deprecatedStatisticPlayheadViewabilityMrcUrl.j && epx.f(this.k, deprecatedStatisticPlayheadViewabilityMrcUrl.k) && this.l == deprecatedStatisticPlayheadViewabilityMrcUrl.l && this.m == deprecatedStatisticPlayheadViewabilityMrcUrl.m && this.n == deprecatedStatisticPlayheadViewabilityMrcUrl.n;
    }

    public final int hashCode() {
        return Integer.hashCode(this.n) + shy.a(this.m, (this.l.hashCode() + ((this.k.hashCode() + shy.a(this.j, shy.a(this.i, shy.a(this.h, this.g.hashCode() * 31, 31), 31), 31)) * 31)) * 31, 31);
    }

    @Override // com.vk.statistic.DeprecatedStatisticUrl
    public final String toString() {
        StringBuilder sb = new StringBuilder("DeprecatedStatisticPlayheadViewabilityMrcUrl(value=");
        sb.append(this.g);
        sb.append(", adsId1=");
        sb.append(this.h);
        sb.append(", adsId2=");
        sb.append(this.i);
        sb.append(", index=");
        sb.append(this.j);
        sb.append(", statistic=");
        sb.append(this.k);
        sb.append(", target=");
        sb.append(this.l);
        sb.append(", viewabilityPercent=");
        sb.append(this.m);
        sb.append(", duration=");
        return vu5.b(sb, this.n, ')');
    }
}
