package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class umj {
    public final String a;
    public final String b;

    public umj(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof umj)) {
            return false;
        }
        umj umjVar = (umj) obj;
        return Intrinsics.c(this.a, umjVar.a) && Intrinsics.c(this.b, umjVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return bf3.k("TopStatsData(name=", this.a, ", value=", this.b, ")");
    }
}
