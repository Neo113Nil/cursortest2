package defpackage;

import android.animation.ValueAnimator;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class v5g {
    public final String a;
    public final ValueAnimator b;

    public v5g(String str, ValueAnimator valueAnimator) {
        this.a = str;
        this.b = valueAnimator;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v5g)) {
            return false;
        }
        v5g v5gVar = (v5g) obj;
        return Intrinsics.c(this.a, v5gVar.a) && this.b.equals(v5gVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "RollAnimatorData(text=" + this.a + ", animator=" + this.b + ")";
    }
}
