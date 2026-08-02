package defpackage;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class efl {
    public final gv9 a;

    public efl(gv9 gv9Var) {
        gv9Var.getClass();
        this.a = gv9Var;
    }

    public final ffl a() {
        Object obj;
        Iterator<E> it = this.a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((ffl) obj).a == 1) {
                break;
            }
        }
        return (ffl) obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof efl) && Intrinsics.c(this.a, ((efl) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "WorldCupKnockoutData(rounds=" + this.a + ")";
    }
}
