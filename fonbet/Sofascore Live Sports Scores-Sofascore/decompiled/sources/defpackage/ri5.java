package defpackage;

import com.appsflyer.internal.i;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ri5 {
    public final int a;
    public final String b;

    public ri5(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ri5)) {
            return false;
        }
        ri5 ri5Var = (ri5) obj;
        return this.a == ri5Var.a && Intrinsics.c(this.b, ri5Var.b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return i.g(this.a, "EditorTournamentData(id=", ", name=", this.b, ")");
    }
}
