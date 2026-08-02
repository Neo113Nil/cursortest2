package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class zkh {
    public final of3 a;

    public /* synthetic */ zkh(of3 of3Var) {
        this.a = of3Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zkh) {
            return Intrinsics.c(this.a, ((zkh) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SkippableUpdater(composer=" + this.a + ')';
    }
}
