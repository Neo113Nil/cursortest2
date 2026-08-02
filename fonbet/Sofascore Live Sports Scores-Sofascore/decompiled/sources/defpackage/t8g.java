package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class t8g implements w8g {
    public final azj a;
    public final azj b;
    public final yyj c;

    public t8g(yyj yyjVar, azj azjVar, azj azjVar2) {
        azjVar.getClass();
        azjVar2.getClass();
        yyjVar.getClass();
        this.a = azjVar;
        this.b = azjVar2;
        this.c = yyjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t8g)) {
            return false;
        }
        t8g t8gVar = (t8g) obj;
        return Intrinsics.c(this.a, t8gVar.a) && Intrinsics.c(this.b, t8gVar.b) && Intrinsics.c(this.c, t8gVar.c);
    }

    @Override // defpackage.w8g
    public final String getKey() {
        return dmi.k(this.a.a, this.b.a, "mR:", ":");
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "MediumEnd(topStart=" + this.a + ", bottomStart=" + this.b + ", medium=" + this.c + ")";
    }
}
