package com.inmobi.media;

import com.inmobi.media.ads.network.common.model.InlineParams;
import defpackage.dmi;
import defpackage.vxd;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.ib, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3494ib {
    public final boolean a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final InlineParams e;

    public C3494ib(boolean z, String str, boolean z2, boolean z3, InlineParams inlineParams) {
        str.getClass();
        this.a = z;
        this.b = str;
        this.c = z2;
        this.d = z3;
        this.e = inlineParams;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3494ib)) {
            return false;
        }
        C3494ib c3494ib = (C3494ib) obj;
        return this.a == c3494ib.a && Intrinsics.c(this.b, c3494ib.b) && this.c == c3494ib.c && this.d == c3494ib.d && Intrinsics.c(this.e, c3494ib.e);
    }

    public final int hashCode() {
        int e = dmi.e(dmi.e(dmi.c(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
        InlineParams inlineParams = this.e;
        return e + (inlineParams == null ? 0 : inlineParams.hashCode());
    }

    public final String toString() {
        boolean z = this.a;
        String str = this.b;
        boolean z2 = this.c;
        boolean z3 = this.d;
        InlineParams inlineParams = this.e;
        StringBuilder sb = new StringBuilder("LandingPageState(isInAppBrowser=");
        sb.append(z);
        sb.append(", landingScheme=");
        sb.append(str);
        sb.append(", isCCTEnabled=");
        vxd.t(", isPartialTabsEnabled=", ", inlineParams=", sb, z2, z3);
        sb.append(inlineParams);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ C3494ib(boolean z, String str, boolean z2, int i) {
        this(z, (i & 2) != 0 ? "DEFAULT" : str, z2, false, null);
    }
}
