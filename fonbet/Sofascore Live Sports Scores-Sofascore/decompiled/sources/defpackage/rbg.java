package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class rbg {
    public final List a;
    public final String b;

    public rbg(List list, String str) {
        list.getClass();
        this.a = list;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rbg)) {
            return false;
        }
        rbg rbgVar = (rbg) obj;
        return Intrinsics.c(this.a, rbgVar.a) && Intrinsics.c(this.b, rbgVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "SASAdResponse(ads=" + this.a + ", noAdUrl=" + this.b + ")";
    }
}
