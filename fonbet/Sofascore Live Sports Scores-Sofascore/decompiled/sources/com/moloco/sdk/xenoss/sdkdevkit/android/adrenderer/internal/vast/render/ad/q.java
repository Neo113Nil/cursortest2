package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad;

import defpackage.lnb;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class q extends r {
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.o a;
    public final boolean b;

    public q(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.o oVar, boolean z) {
        this.a = oVar;
        this.b = z;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.r
    public final boolean a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q) {
            q qVar = (q) obj;
            if (this.a == qVar.a && this.b == qVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Mraid(viewModel=");
        sb.append(this.a);
        sb.append(", isLastAdPart=");
        return lnb.r(sb, this.b, ')');
    }
}
