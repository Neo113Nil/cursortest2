package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class y14 extends c5n {
    public final lv1 h;

    public y14(lv1 lv1Var) {
        this.h = lv1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y14) && Intrinsics.c(this.h, ((y14) obj).h);
    }

    public final int hashCode() {
        return this.h.hashCode();
    }

    @Override // defpackage.c5n
    public final int s(int i, int i2, ema emaVar, qhe qheVar, int i3) {
        return this.h.a(i2, i);
    }

    public final String toString() {
        return "VerticalCrossAxisAlignment(vertical=" + this.h + ')';
    }
}
