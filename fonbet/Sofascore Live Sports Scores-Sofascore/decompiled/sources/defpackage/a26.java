package defpackage;

import android.animation.ValueAnimator;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class a26 {
    public final String a;
    public final ValueAnimator b;
    public final boolean c;

    public a26(String str, ValueAnimator valueAnimator, boolean z) {
        this.a = str;
        this.b = valueAnimator;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a26)) {
            return false;
        }
        a26 a26Var = (a26) obj;
        return Intrinsics.c(this.a, a26Var.a) && this.b.equals(a26Var.b) && this.c == a26Var.c;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = str == null ? 0 : str.hashCode();
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (hashCode * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AnimatorData(text=");
        sb.append(this.a);
        sb.append(", animator=");
        sb.append(this.b);
        sb.append(", showBackground=");
        return wt3.p(sb, this.c, ")");
    }
}
