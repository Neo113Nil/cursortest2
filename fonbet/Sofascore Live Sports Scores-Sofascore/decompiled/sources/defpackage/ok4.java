package defpackage;

import com.ironsource.InterfaceC4060ee;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h(with = avc.class)
/* loaded from: classes7.dex */
public final class ok4 extends kk4 {

    @NotNull
    public static final nk4 Companion = new nk4();
    public final int b;

    public ok4(int i) {
        this.b = i;
        if (i > 0) {
            return;
        }
        ogj.h(lnb.k(i, "Unit duration must be positive, but was ", " months."));
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ok4) {
            return this.b == ((ok4) obj).b;
        }
        return false;
    }

    public final int hashCode() {
        return this.b ^ 131072;
    }

    public final String toString() {
        int i = this.b;
        return i % InterfaceC4060ee.c.d == 0 ? rk4.a(i / InterfaceC4060ee.c.d, "CENTURY") : i % 12 == 0 ? rk4.a(i / 12, "YEAR") : i % 3 == 0 ? rk4.a(i / 3, "QUARTER") : rk4.a(i, "MONTH");
    }
}
