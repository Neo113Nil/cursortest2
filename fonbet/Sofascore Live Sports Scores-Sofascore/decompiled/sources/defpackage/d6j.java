package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class d6j {
    public final String a;
    public final Boolean b;
    public final Function0 c;

    public /* synthetic */ d6j(String str, deh dehVar, int i) {
        this(str, (i & 2) != 0 ? null : Boolean.TRUE, (i & 4) != 0 ? null : dehVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d6j)) {
            return false;
        }
        d6j d6jVar = (d6j) obj;
        return Intrinsics.c(this.a, d6jVar.a) && Intrinsics.c(this.b, d6jVar.b) && Intrinsics.c(this.c, d6jVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Boolean bool = this.b;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Function0 function0 = this.c;
        return hashCode2 + (function0 != null ? function0.hashCode() : 0);
    }

    public final String toString() {
        return "TennisPlayerRankingRow(value=" + this.a + ", hasImproved=" + this.b + ", onClick=" + this.c + ")";
    }

    public d6j(String str, Boolean bool, Function0 function0) {
        this.a = str;
        this.b = bool;
        this.c = function0;
    }
}
