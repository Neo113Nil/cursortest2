package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class alh {
    public final Function1 a;
    public final j38 b;

    public alh(j38 j38Var, Function1 function1) {
        this.a = function1;
        this.b = j38Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof alh)) {
            return false;
        }
        alh alhVar = (alh) obj;
        return this.a.equals(alhVar.a) && this.b.equals(alhVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Slide(slideOffset=" + this.a + ", animationSpec=" + this.b + ')';
    }
}
