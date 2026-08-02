package defpackage;

import com.blaze.blazesdk.user_management.annotations.AuthNeeded;
import kotlin.coroutines.g;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class pxl implements qp0 {
    @Override // defpackage.qp0
    public final qzf m(v7g v7gVar, d2g d2gVar) {
        qzf qzfVar = d2gVar.a;
        qzfVar.getClass();
        dba dbaVar = (dba) qzfVar.c(duf.a.getOrCreateKotlinClass(dba.class));
        if ((dbaVar != null ? (AuthNeeded) dbaVar.c.getAnnotation(AuthNeeded.class) : null) != null) {
            return (qzf) td4.t0(g.a, new vtl(qzfVar, null));
        }
        return null;
    }
}
