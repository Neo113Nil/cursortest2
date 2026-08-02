package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class oc {
    public final String a;
    public final int b;
    public final long c;

    public oc(int i, long j, String str) {
        str.getClass();
        this.a = str;
        this.b = i;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oc)) {
            return false;
        }
        oc ocVar = (oc) obj;
        return Intrinsics.c(this.a, ocVar.a) && this.b == ocVar.b && this.c == ocVar.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + wv8.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return lnb.l(this.c, ")", mz1.q(this.b, "ActiveLeagueUiModel(title=", this.a, ", level=", ", endDateTimestamp="));
    }
}
