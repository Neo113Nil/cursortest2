package com.vk.statistic;

import defpackage.q0;
import xsna.epx;
import xsna.shy;

/* compiled from: DeprecatedStatisticPlayheadReachedUrl.kt */
/* loaded from: classes5.dex */
public final class DeprecatedStatisticPlayheadReachedUrl extends DeprecatedStatisticUrl {
    public final String g;
    public final int h;
    public final int i;
    public final int j;
    public final DeprecatedStatisticInterface k;
    public final int l;
    public final boolean m;

    public DeprecatedStatisticPlayheadReachedUrl(String str, int i, int i2, int i3, DeprecatedStatisticInterface deprecatedStatisticInterface, int i4, boolean z) {
        super(str, "playhead_reached_value", i, i2, i3, deprecatedStatisticInterface);
        this.g = str;
        this.h = i;
        this.i = i2;
        this.j = i3;
        this.k = deprecatedStatisticInterface;
        this.l = i4;
        this.m = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeprecatedStatisticPlayheadReachedUrl)) {
            return false;
        }
        DeprecatedStatisticPlayheadReachedUrl deprecatedStatisticPlayheadReachedUrl = (DeprecatedStatisticPlayheadReachedUrl) obj;
        return epx.f(this.g, deprecatedStatisticPlayheadReachedUrl.g) && this.h == deprecatedStatisticPlayheadReachedUrl.h && this.i == deprecatedStatisticPlayheadReachedUrl.i && this.j == deprecatedStatisticPlayheadReachedUrl.j && epx.f(this.k, deprecatedStatisticPlayheadReachedUrl.k) && this.l == deprecatedStatisticPlayheadReachedUrl.l && this.m == deprecatedStatisticPlayheadReachedUrl.m;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.m) + shy.a(this.l, (this.k.hashCode() + shy.a(this.j, shy.a(this.i, shy.a(this.h, this.g.hashCode() * 31, 31), 31), 31)) * 31, 31);
    }

    @Override // com.vk.statistic.DeprecatedStatisticUrl
    public final String toString() {
        StringBuilder sb = new StringBuilder("DeprecatedStatisticPlayheadReachedUrl(value=");
        sb.append(this.g);
        sb.append(", adsId1=");
        sb.append(this.h);
        sb.append(", adsId2=");
        sb.append(this.i);
        sb.append(", index=");
        sb.append(this.j);
        sb.append(", statistic=");
        sb.append(this.k);
        sb.append(", time=");
        sb.append(this.l);
        sb.append(", isTimeInPercents=");
        return q0.a(sb, this.m, ')');
    }
}
