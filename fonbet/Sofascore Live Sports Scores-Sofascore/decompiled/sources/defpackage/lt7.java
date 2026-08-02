package defpackage;

import com.unity3d.services.UnityAdsConstants;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class lt7 implements qt7 {
    public final int a;
    public final t3e b;

    public lt7(int i) {
        this(i, l98.C(16.0f, 16.0f, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lt7)) {
            return false;
        }
        lt7 lt7Var = (lt7) obj;
        return this.a == lt7Var.a && Intrinsics.c(this.b, lt7Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "BulletPoint(stringRes=" + this.a + ", padding=" + this.b + ")";
    }

    public lt7(int i, t3e t3eVar) {
        this.a = i;
        this.b = t3eVar;
    }
}
