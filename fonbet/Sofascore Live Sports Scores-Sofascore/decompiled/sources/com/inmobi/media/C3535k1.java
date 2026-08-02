package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.media.ads.network.common.model.AdResponse;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import defpackage.a70;
import defpackage.hoi;
import defpackage.joa;
import defpackage.khm;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.tub;
import defpackage.y6a;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.k1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3535k1 extends hoi implements Function2 {
    public int a;
    public final /* synthetic */ byte[] b;
    public final /* synthetic */ AbstractC3587m1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3535k1(byte[] bArr, AbstractC3587m1 abstractC3587m1, rq3 rq3Var) {
        super(2, rq3Var);
        this.b = bArr;
        this.c = abstractC3587m1;
    }

    public static final Unit a(AbstractC3587m1 abstractC3587m1, W w) {
        AbstractC3587m1.a(abstractC3587m1, w);
        return Unit.a;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new C3535k1(this.b, this.c, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3535k1(this.b, this.c, (rq3) obj2).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.a;
        try {
            if (i == 0) {
                y6a.M(obj);
                byte[] bArr = this.b;
                AbstractC3587m1 abstractC3587m1 = this.c;
                C3275a c3275a = new C3275a(bArr, abstractC3587m1.l.a, abstractC3587m1.i);
                khm khmVar = new khm(this.c, 1);
                this.a = 1;
                obj = c3275a.a(khmVar, this);
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
            AbstractC3587m1 abstractC3587m12 = this.c;
            C3906y9 c3906y9 = abstractC3587m12.i;
            if (c3906y9 != null) {
                C3845w0 c3845w0 = abstractC3587m12.l;
                AbstractC3354d0.a(c3845w0.e, c3845w0.f, adResponse, c3906y9);
            }
            this.c.a(adResponse);
        } catch (Y e) {
            AbstractC3587m1 abstractC3587m13 = this.c;
            V v = e.b;
            if (v instanceof C3527jj) {
                abstractC3587m13.b(((C3527jj) v).a);
            }
            abstractC3587m13.b(e.a, true, (short) 0);
        } catch (Throwable th) {
            C3906y9 c3906y92 = this.c.i;
            if (c3906y92 != null) {
                c3906y92.a("m1", "doAdLoadWork: " + th);
            }
            joa joaVar = AbstractC3286aa.a;
            AbstractC3286aa.a(new Q2(th));
            AbstractC3587m1 abstractC3587m14 = this.c;
            abstractC3587m14.getClass();
            abstractC3587m14.b((Map) tub.i(new Pair(IronSourceConstants.EVENTS_ERROR_CODE, (short) 2363)));
            abstractC3587m14.b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), (short) 0);
        }
        return Unit.a;
    }
}
