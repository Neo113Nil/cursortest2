package com.vungle.ads.internal.network;

import defpackage.d2g;
import defpackage.epf;
import defpackage.kof;
import defpackage.p7a;
import defpackage.pzf;
import defpackage.q7a;
import defpackage.qzf;
import defpackage.x52;
import defpackage.y49;
import defpackage.yzf;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class u implements q7a {
    @Override // defpackage.q7a
    public final d2g intercept(p7a p7aVar) {
        p7aVar.getClass();
        epf epfVar = (epf) p7aVar;
        qzf qzfVar = epfVar.e;
        yzf yzfVar = qzfVar.d;
        if (yzfVar == null || qzfVar.c.a("Content-Encoding") != null) {
            return epfVar.b(qzfVar);
        }
        pzf b = qzfVar.b();
        b.c("Content-Encoding", "gzip");
        String str = qzfVar.b;
        x52 x52Var = new x52();
        kof kofVar = new kof(new y49(x52Var));
        yzfVar.writeTo(kofVar);
        kofVar.close();
        b.e(str, new t(yzfVar, x52Var));
        return epfVar.b(new qzf(b));
    }
}
