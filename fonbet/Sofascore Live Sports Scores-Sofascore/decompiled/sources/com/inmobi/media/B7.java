package com.inmobi.media;

import defpackage.b98;
import defpackage.ku3;
import defpackage.rq3;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class B7 implements b98 {
    public final /* synthetic */ V7 a;

    public B7(ku3 ku3Var, V7 v7) {
        this.a = v7;
    }

    @Override // defpackage.b98
    public final Object emit(Object obj, rq3 rq3Var) {
        V7 v7 = this.a;
        v7.x.a();
        v7.l.set(Jg.STATE_PLAYBACK_COMPLETED);
        return Unit.a;
    }
}
