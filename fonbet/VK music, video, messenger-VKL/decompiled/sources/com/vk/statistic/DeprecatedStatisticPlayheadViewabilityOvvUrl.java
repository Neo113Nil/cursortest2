package com.vk.statistic;

import defpackage.q0;
import xsna.epx;
import xsna.qoy;
import xsna.shy;

/* compiled from: DeprecatedStatisticPlayheadViewabilityOvvUrl.kt */
/* loaded from: classes5.dex */
public final class DeprecatedStatisticPlayheadViewabilityOvvUrl extends DeprecatedStatisticUrl {
    public final String g;
    public final int h;
    public final int i;
    public final int j;
    public final DeprecatedStatisticInterface k;
    public final boolean l;
    public final int m;
    public final int n;
    public final boolean o;

    public DeprecatedStatisticPlayheadViewabilityOvvUrl(String str, int i, int i2, int i3, DeprecatedStatisticInterface deprecatedStatisticInterface, boolean z, int i4, int i5, boolean z2) {
        super(str, "playhead_viewability_value", i, i2, i3, deprecatedStatisticInterface);
        this.g = str;
        this.h = i;
        this.i = i2;
        this.j = i3;
        this.k = deprecatedStatisticInterface;
        this.l = z;
        this.m = i4;
        this.n = i5;
        this.o = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeprecatedStatisticPlayheadViewabilityOvvUrl)) {
            return false;
        }
        DeprecatedStatisticPlayheadViewabilityOvvUrl deprecatedStatisticPlayheadViewabilityOvvUrl = (DeprecatedStatisticPlayheadViewabilityOvvUrl) obj;
        return epx.f(this.g, deprecatedStatisticPlayheadViewabilityOvvUrl.g) && this.h == deprecatedStatisticPlayheadViewabilityOvvUrl.h && this.i == deprecatedStatisticPlayheadViewabilityOvvUrl.i && this.j == deprecatedStatisticPlayheadViewabilityOvvUrl.j && epx.f(this.k, deprecatedStatisticPlayheadViewabilityOvvUrl.k) && this.l == deprecatedStatisticPlayheadViewabilityOvvUrl.l && this.m == deprecatedStatisticPlayheadViewabilityOvvUrl.m && this.n == deprecatedStatisticPlayheadViewabilityOvvUrl.n && this.o == deprecatedStatisticPlayheadViewabilityOvvUrl.o;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.o) + shy.a(this.n, shy.a(this.m, qoy.b((this.k.hashCode() + shy.a(this.j, shy.a(this.i, shy.a(this.h, this.g.hashCode() * 31, 31), 31), 31)) * 31, 31, this.l), 31), 31);
    }

    @Override // com.vk.statistic.DeprecatedStatisticUrl
    public final String toString() {
        StringBuilder sb = new StringBuilder("DeprecatedStatisticPlayheadViewabilityOvvUrl(value=");
        sb.append(this.g);
        sb.append(", adsId1=");
        sb.append(this.h);
        sb.append(", adsId2=");
        sb.append(this.i);
        sb.append(", index=");
        sb.append(this.j);
        sb.append(", statistic=");
        sb.append(this.k);
        sb.append(", ovv=");
        sb.append(this.l);
        sb.append(", viewabilityPercent=");
        sb.append(this.m);
        sb.append(", time=");
        sb.append(this.n);
        sb.append(", isTimeInPercents=");
        return q0.a(sb, this.o, ')');
    }
}
