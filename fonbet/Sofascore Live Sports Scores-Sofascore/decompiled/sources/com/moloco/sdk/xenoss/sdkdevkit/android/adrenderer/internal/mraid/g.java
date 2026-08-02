package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.m0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class g {
    public final m0 a;

    public g(m0 m0Var) {
        this.a = m0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && Intrinsics.c(this.a, ((g) obj).a);
    }

    public final int hashCode() {
        m0 m0Var = this.a;
        if (m0Var == null) {
            return 0;
        }
        return m0Var.hashCode();
    }

    public final String toString() {
        return "MraidAdData(dec=" + this.a + ')';
    }
}
