package defpackage;

import com.unity3d.services.UnityAdsConstants;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class pt7 implements qt7 {
    public final int a;
    public final t3e b;

    public pt7(int i) {
        this(i, l98.C(16.0f, 24.0f, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pt7)) {
            return false;
        }
        pt7 pt7Var = (pt7) obj;
        return this.a == pt7Var.a && Intrinsics.c(this.b, pt7Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Title(stringRes=" + this.a + ", padding=" + this.b + ")";
    }

    public pt7(int i, t3e t3eVar) {
        this.a = i;
        this.b = t3eVar;
    }
}
