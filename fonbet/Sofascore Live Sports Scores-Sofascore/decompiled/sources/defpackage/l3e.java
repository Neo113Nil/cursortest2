package defpackage;

import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class l3e {
    public final float a;
    public final List b;

    public l3e(float f, int i) {
        this((i & 1) != 0 ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : f, km5.a);
    }

    public final l3e a(l3e l3eVar) {
        return new l3e(this.a + l3eVar.a, CollectionsKt.w0(l3eVar.b, this.b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l3e)) {
            return false;
        }
        l3e l3eVar = (l3e) obj;
        return p75.b(this.a, l3eVar.a) && Intrinsics.c(this.b, l3eVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PaddingDimension(dp=");
        sb.append((Object) p75.c(this.a));
        sb.append(", resourceIds=");
        return fc6.p(sb, this.b, ')');
    }

    public l3e(float f, List list) {
        this.a = f;
        this.b = list;
    }
}
