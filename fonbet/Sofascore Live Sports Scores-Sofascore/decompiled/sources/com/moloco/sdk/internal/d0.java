package com.moloco.sdk.internal;

import com.moloco.sdk.publisher.MolocoAdError;
import defpackage.dmi;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class d0 {
    public final MolocoAdError a;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c b;
    public final Map c;

    public d0(MolocoAdError molocoAdError, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c cVar, Map map) {
        cVar.getClass();
        map.getClass();
        this.a = molocoAdError;
        this.b = cVar;
        this.c = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return this.a.equals(d0Var.a) && Intrinsics.c(this.b, d0Var.b) && Intrinsics.c(this.c, d0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MolocoInternalAdError(molocoAdError=");
        sb.append(this.a);
        sb.append(", subErrorType=");
        sb.append(this.b);
        sb.append(", details=");
        return dmi.s(sb, this.c, ')');
    }
}
