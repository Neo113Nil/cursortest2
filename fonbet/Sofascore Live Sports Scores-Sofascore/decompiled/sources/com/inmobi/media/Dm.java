package com.inmobi.media;

import defpackage.b98;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.rq3;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Dm implements b98 {
    public final /* synthetic */ Nm a;

    public Dm(ku3 ku3Var, Nm nm) {
        this.a = nm;
    }

    @Override // defpackage.b98
    public final Object emit(Object obj, rq3 rq3Var) {
        AbstractC3650oc abstractC3650oc = (AbstractC3650oc) obj;
        C3906y9 c3906y9 = this.a.e;
        if (c3906y9 != null) {
            c3906y9.a("VideoExperienceManager", "observeCompanionAdEvents - received companion event: " + abstractC3650oc);
        }
        Object emit = this.a.d.emit(abstractC3650oc, rq3Var);
        return emit == lu3.a ? emit : Unit.a;
    }
}
