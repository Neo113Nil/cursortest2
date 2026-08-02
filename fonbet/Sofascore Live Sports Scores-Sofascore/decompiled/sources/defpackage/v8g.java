package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class v8g implements w8g {
    public final azj a;
    public final azj b;

    public v8g(azj azjVar, azj azjVar2) {
        azjVar.getClass();
        azjVar2.getClass();
        this.a = azjVar;
        this.b = azjVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v8g)) {
            return false;
        }
        v8g v8gVar = (v8g) obj;
        return Intrinsics.c(this.a, v8gVar.a) && Intrinsics.c(this.b, v8gVar.b);
    }

    @Override // defpackage.w8g
    public final String getKey() {
        return dmi.k(this.a.a, this.b.a, "s:", ":");
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TwoSmall(left=" + this.a + ", right=" + this.b + ")";
    }
}
