package com.moloco.sdk.internal.services.bidtoken.providers;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class h {
    public final Integer a;
    public final Integer b;
    public final Boolean c;

    public h(Integer num, Integer num2, Boolean bool) {
        this.a = num;
        this.b = num2;
        this.c = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Intrinsics.c(this.a, hVar.a) && Intrinsics.c(this.b, hVar.b) && Intrinsics.c(this.c, hVar.c);
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.c;
        return hashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "BatteryInfoSignal(maxBatteryLevel=" + this.a + ", batteryStatus=" + this.b + ", isPowerSaveMode=" + this.c + ')';
    }
}
