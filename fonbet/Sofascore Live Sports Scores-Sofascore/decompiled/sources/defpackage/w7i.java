package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class w7i implements z7i {
    public final String a;
    public final String b;

    public w7i(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w7i)) {
            return false;
        }
        w7i w7iVar = (w7i) obj;
        return Intrinsics.c(this.a, w7iVar.a) && Intrinsics.c(this.b, w7iVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return bf3.k("LegendRow(short=", this.a, ", long=", this.b, ")");
    }
}
