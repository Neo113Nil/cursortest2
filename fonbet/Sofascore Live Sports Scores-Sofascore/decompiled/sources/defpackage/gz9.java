package defpackage;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class gz9 extends iz9 {
    public final h0a c;
    public final Integer d;
    public final boolean e;
    public final ArrayList f;

    public gz9(h0a h0aVar, Integer num, boolean z, ArrayList arrayList) {
        this.c = h0aVar;
        this.d = num;
        this.e = z;
        this.f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gz9)) {
            return false;
        }
        gz9 gz9Var = (gz9) obj;
        return this.c.equals(gz9Var.c) && Intrinsics.c(this.d, gz9Var.d) && this.e == gz9Var.e && this.f.equals(gz9Var.f);
    }

    public final int hashCode() {
        int hashCode = this.c.hashCode() * 31;
        Integer num = this.d;
        return this.f.hashCode() + dmi.e((hashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.e);
    }

    public final String toString() {
        return "RegularIncident(uiModel=" + this.c + ", id=" + this.d + ", isEnabled=" + this.e + ", players=" + this.f + ")";
    }
}
