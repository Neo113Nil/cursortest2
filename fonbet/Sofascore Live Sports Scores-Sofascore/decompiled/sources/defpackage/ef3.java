package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ef3 {
    public final int a;
    public final Integer b;

    public ef3(int i, uaa uaaVar, Integer num) {
        this.a = i;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ef3)) {
            return false;
        }
        ef3 ef3Var = (ef3) obj;
        return this.a == ef3Var.a && Intrinsics.c(null, null) && Intrinsics.c(this.b, ef3Var.b);
    }

    public final int hashCode() {
        int hashCode = ((Integer.hashCode(this.a) * 31) + 0) * 31;
        Integer num = this.b;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ComposeStackTraceFrame(groupKey=");
        sb.append(this.a);
        sb.append(", sourceInfo=");
        sb.append((Object) null);
        sb.append(", groupOffset=");
        return bf3.n(sb, this.b, ')');
    }
}
