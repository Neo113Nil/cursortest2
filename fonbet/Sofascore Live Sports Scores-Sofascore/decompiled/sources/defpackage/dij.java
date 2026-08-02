package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class dij {
    public final Object a;
    public final long b;

    public dij(Object obj, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this.a = obj;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dij)) {
            return false;
        }
        dij dijVar = (dij) obj;
        return Intrinsics.c(this.a, dijVar.a) && xd5.d(this.b, dijVar.b);
    }

    public final int hashCode() {
        Object obj = this.a;
        int hashCode = obj == null ? 0 : obj.hashCode();
        wd5 wd5Var = xd5.b;
        return Long.hashCode(this.b) + (hashCode * 31);
    }

    public final String toString() {
        return "TimedValue(value=" + this.a + ", duration=" + ((Object) xd5.l(this.b)) + ')';
    }
}
