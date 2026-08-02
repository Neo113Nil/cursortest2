package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class bn6 {
    public final Object a;
    public final tc3 b;

    public bn6(gmh gmhVar, tc3 tc3Var) {
        this.a = gmhVar;
        this.b = tc3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bn6) {
            bn6 bn6Var = (bn6) obj;
            return Intrinsics.c(this.a, bn6Var.a) && this.b == bn6Var.b;
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        return this.b.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        return "FadeInFadeOutAnimationItem(key=" + this.a + ", transition=" + this.b + ')';
    }
}
