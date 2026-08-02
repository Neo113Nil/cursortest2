package defpackage;

import com.appsflyer.internal.i;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class i06 {
    public final int a;
    public final String b;

    public i06(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i06)) {
            return false;
        }
        i06 i06Var = (i06) obj;
        return this.a == i06Var.a && Intrinsics.c(this.b, i06Var.b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return i.g(this.a, "TeamRatingBreakdownValue(labelResId=", ", value=", this.b, ")");
    }
}
