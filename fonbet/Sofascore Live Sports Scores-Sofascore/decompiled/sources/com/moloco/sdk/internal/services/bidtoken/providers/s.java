package com.moloco.sdk.internal.services.bidtoken.providers;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.f1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class s {
    public final Integer a;
    public final Integer b;
    public final Boolean c;
    public final f1 d;

    public s(Integer num, Integer num2, Boolean bool, f1 f1Var) {
        this.a = num;
        this.b = num2;
        this.c = bool;
        this.d = f1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return Intrinsics.c(this.a, sVar.a) && Intrinsics.c(this.b, sVar.b) && Intrinsics.c(this.c, sVar.c) && Intrinsics.c(this.d, sVar.d);
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.c;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        f1 f1Var = this.d;
        return hashCode3 + (f1Var != null ? f1Var.hashCode() : 0);
    }

    public final String toString() {
        return "NetworkInfoSignal(mobileCountryCode=" + this.a + ", mobileNetworkCode=" + this.b + ", networkRestricted=" + this.c + ", networkType=" + this.d + ')';
    }
}
