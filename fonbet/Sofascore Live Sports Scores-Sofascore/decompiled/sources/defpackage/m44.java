package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class m44 implements n44 {
    public final String a;
    public final scj b;
    public final a64 c;
    public final gv9 d;
    public final scj e;
    public final String f;
    public final boolean g;
    public final List h;

    public m44(String str, scj scjVar, a64 a64Var, gv9 gv9Var, scj scjVar2, String str2, boolean z, List list) {
        str.getClass();
        scjVar.getClass();
        a64Var.getClass();
        gv9Var.getClass();
        scjVar2.getClass();
        list.getClass();
        this.a = str;
        this.b = scjVar;
        this.c = a64Var;
        this.d = gv9Var;
        this.e = scjVar2;
        this.f = str2;
        this.g = z;
        this.h = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m44)) {
            return false;
        }
        m44 m44Var = (m44) obj;
        return Intrinsics.c(this.a, m44Var.a) && Intrinsics.c(this.b, m44Var.b) && this.c == m44Var.c && Intrinsics.c(this.d, m44Var.d) && Intrinsics.c(this.e, m44Var.e) && Intrinsics.c(this.f, m44Var.f) && this.g == m44Var.g && Intrinsics.c(this.h, m44Var.h);
    }

    public final int hashCode() {
        int hashCode = (this.e.hashCode() + ljg.d((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d)) * 31;
        String str = this.f;
        return this.h.hashCode() + dmi.e((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.g);
    }

    public final String toString() {
        return "SearchState(title=" + this.a + ", searchText=" + this.b + ", searchPlayerEntity=" + this.c + ", searchPlayersList=" + this.d + ", addPlayerText=" + this.e + ", error=" + this.f + ", hasPlayers=" + this.g + ", disabledPlayers=" + this.h + ")";
    }
}
