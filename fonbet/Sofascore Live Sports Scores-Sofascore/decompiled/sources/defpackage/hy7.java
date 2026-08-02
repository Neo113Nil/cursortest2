package defpackage;

import com.appsflyer.internal.i;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class hy7 {
    public final int a;
    public final Integer b;
    public final String c;
    public final String d;
    public final String e;
    public final long f;

    public hy7(int i, Integer num, String str, String str2, String str3, long j) {
        str2.getClass();
        str3.getClass();
        this.a = i;
        this.b = num;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hy7)) {
            return false;
        }
        hy7 hy7Var = (hy7) obj;
        return this.a == hy7Var.a && Intrinsics.c(this.b, hy7Var.b) && Intrinsics.c(this.c, hy7Var.c) && Intrinsics.c(this.d, hy7Var.d) && Intrinsics.c(this.e, hy7Var.e) && this.f == hy7Var.f;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        Integer num = this.b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.c;
        return Long.hashCode(this.f) + dmi.c(dmi.c((hashCode2 + (str != null ? str.hashCode() : 0)) * 31, 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder r = fc6.r("FeedUniqueStage(stageId=", ", categoryId=", ", countryCode=", this.b, this.a);
        bf3.v(r, this.c, ", name=", this.d, ", description=");
        i.n(this.f, this.e, ", timestamp=", r);
        r.append(")");
        return r.toString();
    }
}
