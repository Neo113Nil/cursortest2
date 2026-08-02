package defpackage;

import com.sofascore.results.R;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class ml1 {
    public final String a;
    public final int b;
    public final int c;
    public final Integer d;
    public final boolean e;

    public ml1(int i, int i2, String str, boolean z, Integer num) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = num;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ml1)) {
            return false;
        }
        ml1 ml1Var = (ml1) obj;
        return Intrinsics.c(this.a, ml1Var.a) && this.b == ml1Var.b && this.c == ml1Var.c && Intrinsics.c(this.d, ml1Var.d) && this.e == ml1Var.e;
    }

    public final int hashCode() {
        String str = this.a;
        int a = wv8.a(this.c, wv8.a(this.b, (str == null ? 0 : str.hashCode()) * 31, 31), 31);
        Integer num = this.d;
        return Boolean.hashCode(this.e) + ((a + (num != null ? num.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder q = mz1.q(this.b, "FilterOption(internalName=", this.a, ", labelResId=", ", shortLabelResId=");
        q.append(this.c);
        q.append(", colorResId=");
        q.append(this.d);
        q.append(", enabled=");
        return wt3.p(q, this.e, ")");
    }

    public /* synthetic */ ml1(int i) {
        this(i, R.string.all, null, true, null);
    }
}
