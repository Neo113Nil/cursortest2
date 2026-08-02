package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast;

import defpackage.dmi;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class f {
    public final int a;
    public final Set b;
    public final boolean c;
    public final d d;

    public f(int i, Set set, boolean z, d dVar) {
        this.a = i;
        this.b = set;
        this.c = z;
        this.d = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.a == fVar.a && this.b.equals(fVar.b) && this.c == fVar.c && this.d.equals(fVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + dmi.e((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        return "WrapperChainParams(wrapperDepth=" + this.a + ", usedVastAdTagUrls=" + this.b + ", followAdditionalWrappers=" + this.c + ", aggregatedWrapperChainData=" + this.d + ')';
    }
}
