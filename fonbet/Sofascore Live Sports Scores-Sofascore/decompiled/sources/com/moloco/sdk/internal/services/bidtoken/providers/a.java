package com.moloco.sdk.internal.services.bidtoken.providers;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class a {
    public final Boolean a;
    public final Boolean b;
    public final Boolean c;
    public final Float d;

    public a(Boolean bool, Boolean bool2, Boolean bool3, Float f) {
        this.a = bool;
        this.b = bool2;
        this.c = bool3;
        this.d = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.c(this.a, aVar.a) && Intrinsics.c(this.b, aVar.b) && Intrinsics.c(this.c, aVar.c) && Intrinsics.c(this.d, aVar.d);
    }

    public final int hashCode() {
        Boolean bool = this.a;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.b;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.c;
        int hashCode3 = (hashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Float f = this.d;
        return hashCode3 + (f != null ? f.hashCode() : 0);
    }

    public final String toString() {
        return "AccessibilitySignal(accessibilityCaptioningEnabled=" + this.a + ", accessibilityLargePointerIcon=" + this.b + ", reduceBrightColorsActivated=" + this.c + ", fontScale=" + this.d + ')';
    }
}
