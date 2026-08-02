package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class u8g implements w8g {
    public final yyj a;
    public final azj b;
    public final azj c;

    public u8g(yyj yyjVar, azj azjVar, azj azjVar2) {
        yyjVar.getClass();
        azjVar.getClass();
        azjVar2.getClass();
        this.a = yyjVar;
        this.b = azjVar;
        this.c = azjVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u8g)) {
            return false;
        }
        u8g u8gVar = (u8g) obj;
        return Intrinsics.c(this.a, u8gVar.a) && Intrinsics.c(this.b, u8gVar.b) && Intrinsics.c(this.c, u8gVar.c);
    }

    @Override // defpackage.w8g
    public final String getKey() {
        return dmi.k(this.b.a, this.c.a, "mL:", ":");
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "MediumStart(medium=" + this.a + ", topEnd=" + this.b + ", bottomEnd=" + this.c + ")";
    }
}
