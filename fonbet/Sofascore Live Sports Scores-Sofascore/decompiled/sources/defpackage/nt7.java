package defpackage;

import com.unity3d.services.UnityAdsConstants;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class nt7 implements qt7 {
    public final int a;
    public final t3e b;

    public /* synthetic */ nt7(int i) {
        this(i, l98.B(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nt7)) {
            return false;
        }
        nt7 nt7Var = (nt7) obj;
        return this.a == nt7Var.a && Intrinsics.c(this.b, nt7Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Image(drawableRes=" + this.a + ", padding=" + this.b + ")";
    }

    public nt7(int i, t3e t3eVar) {
        this.a = i;
        this.b = t3eVar;
    }
}
