package com.inmobi.media;

import com.inmobi.media.ads.network.common.model.AdResponse;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import defpackage.a70;
import defpackage.hoi;
import defpackage.iol;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.tub;
import defpackage.xw3;
import defpackage.y6a;
import defpackage.zzl;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.ub, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3804ub extends hoi implements Function2 {
    public int a;
    public final /* synthetic */ C3275a b;
    public final /* synthetic */ AbstractC3830vb c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3804ub(C3275a c3275a, AbstractC3830vb abstractC3830vb, rq3 rq3Var) {
        super(2, rq3Var);
        this.b = c3275a;
        this.c = abstractC3830vb;
    }

    public static final Unit a(AbstractC3830vb abstractC3830vb, W w) {
        abstractC3830vb.m.a(w);
        return Unit.a;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new C3804ub(this.b, this.c, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3804ub(this.b, this.c, (rq3) obj2).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.a;
        try {
            if (i == 0) {
                y6a.M(obj);
                C3275a c3275a = this.b;
                iol iolVar = new iol(this.c, 15);
                this.a = 1;
                obj = c3275a.a(iolVar, this);
                if (obj == lu3Var) {
                    return lu3Var;
                }
            } else {
                if (i != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
            }
            AdResponse adResponse = (AdResponse) obj;
            this.c.a.getClass();
            AbstractC3830vb abstractC3830vb = this.c;
            AbstractC3354d0.a(IronSourceConstants.EVENTS_NATIVE, abstractC3830vb.d.h, adResponse, abstractC3830vb.e);
            C3906y9 c3906y9 = this.c.e;
            if (c3906y9 != null) {
                c3906y9.a("AUM-LoadResponseState", "AdResponse Parse Success");
            }
            this.c.a(adResponse);
        } catch (Y e) {
            C3906y9 c3906y92 = this.c.e;
            if (c3906y92 != null) {
                c3906y92.b("AUM-LoadResponseState", "AdResponse Parse Failure " + e);
            }
            AbstractC3830vb abstractC3830vb2 = this.c;
            abstractC3830vb2.getClass();
            V v = e.b;
            if (v instanceof C3579lj) {
                C3586m0 c3586m0 = abstractC3830vb2.g;
                xw3.L(c3586m0.a, null, null, new C3560l0(c3586m0, null), 3);
                abstractC3830vb2.a(tub.i(new Pair(IronSourceConstants.EVENTS_ERROR_CODE, (short) 0)), e.a);
            } else if (v instanceof R6) {
                abstractC3830vb2.a(tub.i(new Pair(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(((R6) v).a))), e.a);
            } else if (v instanceof S6) {
                abstractC3830vb2.a(tub.i(new Pair(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf((short) ((S6) v).a))), e.a);
            } else {
                if (!(v instanceof C3527jj)) {
                    zzl.b();
                    return null;
                }
                abstractC3830vb2.a(((C3527jj) v).a, e.a);
            }
        }
        return Unit.a;
    }
}
