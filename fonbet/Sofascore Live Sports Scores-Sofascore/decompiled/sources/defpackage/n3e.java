package defpackage;

import com.unity3d.services.UnityAdsConstants;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class n3e implements uy8 {
    public final l3e a;
    public final l3e b;
    public final l3e c;
    public final l3e d;
    public final l3e e;
    public final l3e f;

    public /* synthetic */ n3e(l3e l3eVar, l3e l3eVar2, l3e l3eVar3, l3e l3eVar4) {
        this(new l3e(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3), l3eVar, l3eVar2, new l3e(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3), l3eVar3, l3eVar4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n3e)) {
            return false;
        }
        n3e n3eVar = (n3e) obj;
        return Intrinsics.c(this.a, n3eVar.a) && Intrinsics.c(this.b, n3eVar.b) && Intrinsics.c(this.c, n3eVar.c) && Intrinsics.c(this.d, n3eVar.d) && Intrinsics.c(this.e, n3eVar.e) && Intrinsics.c(this.f, n3eVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "PaddingModifier(left=" + this.a + ", start=" + this.b + ", top=" + this.c + ", right=" + this.d + ", end=" + this.e + ", bottom=" + this.f + ')';
    }

    public n3e(l3e l3eVar, l3e l3eVar2, l3e l3eVar3, l3e l3eVar4, l3e l3eVar5, l3e l3eVar6) {
        this.a = l3eVar;
        this.b = l3eVar2;
        this.c = l3eVar3;
        this.d = l3eVar4;
        this.e = l3eVar5;
        this.f = l3eVar6;
    }
}
