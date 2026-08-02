package com.inmobi.media;

import defpackage.b98;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.z88;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Hm implements z88 {
    public final /* synthetic */ z88 a;

    public Hm(z88 z88Var) {
        this.a = z88Var;
    }

    @Override // defpackage.z88
    public final Object collect(b98 b98Var, rq3 rq3Var) {
        Object collect = this.a.collect(new Gm(b98Var), rq3Var);
        return collect == lu3.a ? collect : Unit.a;
    }
}
