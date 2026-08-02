package defpackage;

import com.sofascore.results.R;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class f29 {
    public final r9k a;
    public final Integer b;
    public final float c;
    public final int d;
    public final Integer e;
    public final boolean f;

    public /* synthetic */ f29(m9k m9kVar, Integer num, float f, int i) {
        this(m9kVar, num, f, (i & 8) != 0 ? R.color.n_lv_1 : R.color.surface_1, null, (i & 32) == 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f29)) {
            return false;
        }
        f29 f29Var = (f29) obj;
        return Intrinsics.c(this.a, f29Var.a) && Intrinsics.c(this.b, f29Var.b) && Float.compare(this.c, f29Var.c) == 0 && this.d == f29Var.d && Intrinsics.c(this.e, f29Var.e) && this.f == f29Var.f;
    }

    public final int hashCode() {
        r9k r9kVar = this.a;
        int hashCode = (r9kVar == null ? 0 : r9kVar.hashCode()) * 31;
        Integer num = this.b;
        int a = wv8.a(this.d, fc6.a(this.c, (hashCode + (num == null ? 0 : num.hashCode())) * 31, 31), 31);
        Integer num2 = this.e;
        return Boolean.hashCode(this.f) + ((a + (num2 != null ? num2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "GrandSlamResultUIModel(text=" + this.a + ", colorRes=" + this.b + ", alpha=" + this.c + ", textColorRes=" + this.d + ", seasonId=" + this.e + ", isUpcoming=" + this.f + ")";
    }

    public f29(r9k r9kVar, Integer num, float f, int i, Integer num2, boolean z) {
        this.a = r9kVar;
        this.b = num;
        this.c = f;
        this.d = i;
        this.e = num2;
        this.f = z;
    }
}
