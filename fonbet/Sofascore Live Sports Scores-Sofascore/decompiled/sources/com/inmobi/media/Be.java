package com.inmobi.media;

import defpackage.a70;
import defpackage.hoi;
import defpackage.lu3;
import defpackage.rd0;
import defpackage.rq3;
import defpackage.y6a;
import defpackage.z88;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Be extends hoi implements Function2 {
    public int a;
    public final /* synthetic */ He b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Be(He he, rq3 rq3Var) {
        super(2, rq3Var);
        this.b = he;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new Be(this.b, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new Be(this.b, (rq3) obj2).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.a;
        if (i == 0) {
            y6a.M(obj);
            InterfaceC3880x9 l = this.b.l();
            if (l != null) {
                ((C3906y9) l).a("NativeRenderedState", "Impression Tracking Started - waiting for viewability criteria");
            }
            z88 b = ((C3754sd) this.b.b.j.getValue()).b();
            Ae ae = new Ae(null);
            this.a = 1;
            if (rd0.z(b, ae, this) == lu3Var) {
                return lu3Var;
            }
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
        }
        this.b.m();
        ((C3754sd) this.b.b.j.getValue()).a();
        return Unit.a;
    }
}
