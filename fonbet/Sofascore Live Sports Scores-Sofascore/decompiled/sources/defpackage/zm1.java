package defpackage;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class zm1 extends n4o {
    public final m22 m;
    public final String n;
    public final ArrayList o;

    public zm1(m22 m22Var, String str, ArrayList arrayList) {
        str.getClass();
        this.m = m22Var;
        this.n = str;
        this.o = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zm1)) {
            return false;
        }
        zm1 zm1Var = (zm1) obj;
        return this.m.equals(zm1Var.m) && Intrinsics.c(this.n, zm1Var.n) && this.o.equals(zm1Var.o);
    }

    public final int hashCode() {
        return this.o.hashCode() + dmi.c(this.m.hashCode() * 31, 31, this.n);
    }

    public final String toString() {
        return "BaseballTotalData(section=" + this.m + ", name=" + this.n + ", columnsWithValues=" + this.o + ")";
    }
}
