package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ef2 {
    public static final ef2 b = new ef2();
    public final zad a;

    public ef2() {
        this.a = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ef2) {
            return Intrinsics.c(this.a, ((ef2) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        zad zadVar = this.a;
        if (zadVar != null) {
            return zadVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "WriteResult(response=" + this.a + ")";
    }

    public ef2(zad zadVar) {
        this.a = zadVar;
    }
}
