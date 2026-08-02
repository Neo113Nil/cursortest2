package com.inmobi.media;

import defpackage.hoi;
import defpackage.iol;
import defpackage.ljg;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.qe, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3704qe extends hoi implements Function2 {
    public final /* synthetic */ He a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3704qe(He he, rq3 rq3Var) {
        super(2, rq3Var);
        this.a = he;
    }

    public static final Unit a(He he, short s) {
        InterfaceC3880x9 l = he.l();
        if (l != null) {
            ((C3906y9) l).a("NativeRenderedState", ljg.j(s, "onAssetClickEvent "));
        }
        ((C3418fd) he.b.m.getValue()).a(s);
        return Unit.a;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new C3704qe(this.a, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3704qe(this.a, (rq3) obj2).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        C3577lh c3577lh = (C3577lh) this.a.b.o.getValue();
        He he = this.a;
        C3525jh c3525jh = he.b.c;
        iol iolVar = new iol(he, 13);
        c3577lh.getClass();
        C3577lh.a(c3525jh, iolVar);
        return Unit.a;
    }
}
