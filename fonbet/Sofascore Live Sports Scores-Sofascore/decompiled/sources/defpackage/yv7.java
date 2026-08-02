package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class yv7 implements pw7 {
    public final w31 a;

    public yv7(w31 w31Var) {
        w31Var.getClass();
        this.a = w31Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yv7) && Intrinsics.c(this.a, ((yv7) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "FeedbackClickAction(cardModel=" + this.a + ")";
    }
}
