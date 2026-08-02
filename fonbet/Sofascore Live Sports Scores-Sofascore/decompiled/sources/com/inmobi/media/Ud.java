package com.inmobi.media;

import defpackage.b98;
import defpackage.fo2;
import defpackage.j8f;
import defpackage.k8f;
import defpackage.rq3;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Ud implements b98 {
    public final /* synthetic */ Wd a;
    public final /* synthetic */ k8f b;

    public Ud(Wd wd, k8f k8fVar) {
        this.a = wd;
        this.b = k8fVar;
    }

    @Override // defpackage.b98
    public final Object emit(Object obj, rq3 rq3Var) {
        AbstractC3650oc abstractC3650oc = (AbstractC3650oc) obj;
        if (abstractC3650oc instanceof C3868wn) {
            Wd wd = this.a;
            C3868wn c3868wn = (C3868wn) abstractC3650oc;
            k8f k8fVar = this.b;
            if (!wd.c) {
                Long l = wd.d;
                if (l != null) {
                    if (c3868wn.a >= l.longValue() + wd.a.b) {
                        if (!(((j8f) k8fVar).e.d(Unit.a) instanceof fo2)) {
                            wd.c = true;
                            wd.d = null;
                            wd.b.set(false);
                        }
                    }
                } else {
                    wd.d = Long.valueOf(c3868wn.a);
                    wd.b.set(true);
                }
            }
        } else if ((abstractC3650oc instanceof Jn) || (abstractC3650oc instanceof C3635nn)) {
            Wd wd2 = this.a;
            wd2.d = null;
            wd2.b.set(false);
        }
        return Unit.a;
    }
}
