package com.inmobi.media;

import defpackage.hoi;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Ji extends hoi implements Function2 {
    public final /* synthetic */ Mi a;
    public final /* synthetic */ Map b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ji(Mi mi, Map map, rq3 rq3Var) {
        super(2, rq3Var);
        this.a = mi;
        this.b = map;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new Ji(this.a, this.b, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new Ji(this.a, this.b, (rq3) obj2).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        Mi mi = this.a;
        boolean a = mi.a(mi.c.b);
        Mi mi2 = this.a;
        if (a) {
            InterfaceC3880x9 l = mi2.l();
            if (l != null) {
                ((C3906y9) l).b("AUM-RenderedState", "onAdClicked callback blocked.");
            }
        } else {
            mi2.d.onAdClicked(this.b);
        }
        return Unit.a;
    }
}
