package defpackage;

import com.ironsource.C4094gc;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class x49 implements q7a {
    public final zdc a;

    public x49(zdc zdcVar) {
        this.a = zdcVar;
    }

    @Override // defpackage.q7a
    public final d2g intercept(p7a p7aVar) {
        epf epfVar = (epf) p7aVar;
        qzf qzfVar = epfVar.e;
        qzfVar.getClass();
        qzf qzfVar2 = (qzfVar.c.a("Content-Encoding") != null || Intrinsics.c(qzfVar.b, C4094gc.a)) ? qzfVar : null;
        if (qzfVar2 == null) {
            pzf b = qzfVar.b();
            b.c("Content-Encoding", "gzip");
            b.e(qzfVar.b, new w49(qzfVar, this));
            qzfVar2 = new qzf(b);
        }
        return epfVar.b(qzfVar2);
    }
}
