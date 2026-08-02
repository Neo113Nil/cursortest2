package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
/* loaded from: classes6.dex */
public final class yr3 {

    @NotNull
    public static final xr3 Companion = new xr3();
    public final int a;
    public final Integer b;
    public final int c;
    public final Integer d;

    public /* synthetic */ yr3(int i, int i2, int i3, Integer num, Integer num2) {
        if (15 != (i & 15)) {
            oea.z(i, 15, wr3.a.getDescriptor());
            throw null;
        }
        this.a = i2;
        this.b = num;
        this.c = i3;
        this.d = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yr3)) {
            return false;
        }
        yr3 yr3Var = (yr3) obj;
        return this.a == yr3Var.a && Intrinsics.c(this.b, yr3Var.b) && this.c == yr3Var.c && Intrinsics.c(this.d, yr3Var.d);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        Integer num = this.b;
        int a = wv8.a(this.c, (hashCode + (num == null ? 0 : num.hashCode())) * 31, 31);
        Integer num2 = this.d;
        return a + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder r = fc6.r("ContributionLog(descriptionRes=", ", colorRes=", ", drawableRes=", this.b, this.a);
        r.append(this.c);
        r.append(", statusTextRes=");
        r.append(this.d);
        r.append(")");
        return r.toString();
    }

    public yr3(Integer num, int i, int i2, Integer num2) {
        this.a = i;
        this.b = num;
        this.c = i2;
        this.d = num2;
    }
}
