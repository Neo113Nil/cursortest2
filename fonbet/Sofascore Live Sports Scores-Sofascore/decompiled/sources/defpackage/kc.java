package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class kc {
    public final String a;

    public kc(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof kc) {
            return Intrinsics.c(this.a, ((kc) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
