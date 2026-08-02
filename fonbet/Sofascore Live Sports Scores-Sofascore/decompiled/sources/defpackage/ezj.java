package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class ezj {
    public final yyj a;
    public final dzj b;

    public ezj(yyj yyjVar, dzj dzjVar) {
        yyjVar.getClass();
        this.a = yyjVar;
        this.b = dzjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ezj)) {
            return false;
        }
        ezj ezjVar = (ezj) obj;
        return Intrinsics.c(this.a, ezjVar.a) && this.b == ezjVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PendingMedium(item=" + this.a + ", side=" + this.b + ")";
    }
}
