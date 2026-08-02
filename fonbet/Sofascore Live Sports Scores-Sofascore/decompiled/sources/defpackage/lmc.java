package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class lmc {
    public final x2g a;
    public final String b;

    public lmc(x2g x2gVar, String str) {
        x2gVar.getClass();
        this.a = x2gVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lmc)) {
            return false;
        }
        lmc lmcVar = (lmc) obj;
        return Intrinsics.c(this.a, lmcVar.a) && Intrinsics.c(this.b, lmcVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "MmaMainScreenEventsData(events=" + this.a + ", previousDateWithEvents=" + this.b + ")";
    }
}
