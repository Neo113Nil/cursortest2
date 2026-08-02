package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast;

import defpackage.dmi;
import defpackage.fc6;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class d {
    public final List a;
    public final List b;
    public final List c;

    public d(List list, List list2, List list3) {
        list2.getClass();
        this.a = list;
        this.b = list2;
        this.c = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.a.equals(dVar.a) && Intrinsics.c(this.b, dVar.b) && this.c.equals(dVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + dmi.d(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AggregatedWrapperChainAdData(impressions=");
        sb.append(this.a);
        sb.append(", errorUrls=");
        sb.append(this.b);
        sb.append(", creativesPerWrapper=");
        return fc6.p(sb, this.c, ')');
    }
}
