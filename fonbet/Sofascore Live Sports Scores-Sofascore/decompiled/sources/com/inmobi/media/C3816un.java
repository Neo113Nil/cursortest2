package com.inmobi.media;

import defpackage.b98;
import defpackage.f1d;
import defpackage.fdi;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.z88;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.un, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3816un implements z88 {
    public final /* synthetic */ f1d a;

    public C3816un(f1d f1dVar) {
        this.a = f1dVar;
    }

    @Override // defpackage.z88
    public final Object collect(b98 b98Var, rq3 rq3Var) {
        Object collect = ((fdi) this.a).collect(new C3790tn(b98Var), rq3Var);
        return collect == lu3.a ? collect : Unit.a;
    }
}
