package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class iuj {
    public final List a;
    public final String b;

    public iuj(List list, String str) {
        list.getClass();
        this.a = list;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iuj)) {
            return false;
        }
        iuj iujVar = (iuj) obj;
        return Intrinsics.c(this.a, iujVar.a) && Intrinsics.c(this.b, iujVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "TrackerTeamsResult(teams=" + this.a + ", leagueName=" + this.b + ")";
    }
}
