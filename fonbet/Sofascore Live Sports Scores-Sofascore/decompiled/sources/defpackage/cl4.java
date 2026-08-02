package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class cl4 extends q3d {
    public final el4 d;

    public cl4(el4 el4Var) {
        super(ng4.b, el4Var.a, "dayOfWeekName");
        this.d = el4Var;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof cl4) && Intrinsics.c(this.d.a, ((cl4) obj).d.a);
    }

    public final int hashCode() {
        return this.d.a.hashCode();
    }
}
