package defpackage;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class so implements q4a {
    public final dib a;
    public final kja b = new kja(1, 0, 0, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);

    public so(dib dibVar) {
        this.a = dibVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof so) && Intrinsics.c(this.a, ((so) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.q4a
    public final void j(l9j l9jVar) {
        z41 a = l9jVar.a();
        int i = 0;
        while (true) {
            i1d i1dVar = (i1d) a.b;
            if (i >= i1dVar.c) {
                return;
            }
            jn2 jn2Var = (jn2) i1dVar.a[i];
            long g = t6a.g(jn2Var.a, jn2Var.b);
            jn2 jn2Var2 = (jn2) ((i1d) a.b).a[i];
            t6a.g(jn2Var2.c, jn2Var2.d);
            if (!pej.d(g)) {
                int g2 = pej.g(g);
                int f = pej.f(g);
                String upperCase = t6a.K(g, l9jVar.c).toUpperCase(this.a.a);
                upperCase.getClass();
                l9jVar.c(g2, f, upperCase);
            }
            i++;
        }
    }

    @Override // defpackage.q4a
    public final kja k() {
        return this.b;
    }

    public final String toString() {
        return "InputTransformation.allCaps(locale=" + this.a + ')';
    }
}
