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
/* renamed from: com.inmobi.media.i1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3484i1 extends hoi implements Function2 {
    public int a;
    public final /* synthetic */ AbstractC3587m1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3484i1(AbstractC3587m1 abstractC3587m1, rq3 rq3Var) {
        super(2, rq3Var);
        this.b = abstractC3587m1;
    }

    public static final Unit a(AbstractC3587m1 abstractC3587m1, W w) {
        AbstractC3587m1.a(abstractC3587m1, w);
        return Unit.a;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new C3484i1(this.b, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3484i1(this.b, (rq3) obj2).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.a;
        try {
            if (i != 0) {
                try {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                } catch (Throwable th) {
                    this.b.b((byte) 0);
                    throw th;
                }
            } else {
                y6a.M(obj);
                C3921yo c3921yo = new C3921yo(this.b.H(), this.b.i);
                khm khmVar = new khm(this.b, 0);
                this.a = 1;
                obj = c3921yo.a(khmVar, this);
                if (obj == lu3Var) {
                    return lu3Var;
                }
            }
            AdResponse adResponse = (AdResponse) obj;
            AbstractC3587m1 abstractC3587m1 = this.b;
            C3906y9 c3906y9 = abstractC3587m1.i;
            if (c3906y9 != null) {
                C3845w0 c3845w0 = abstractC3587m1.l;
                AbstractC3354d0.a(c3845w0.e, c3845w0.f, adResponse, c3906y9);
            }
            this.b.a(adResponse);
        } catch (Y e) {
            AbstractC3587m1.a(this.b, e);
        } catch (Throwable th2) {
            C3906y9 c3906y92 = this.b.i;
            if (c3906y92 != null) {
                c3906y92.a("m1", "doAdLoadWork: " + th2);
            }
            joa joaVar = AbstractC3286aa.a;
            AbstractC3286aa.a(new Q2(th2));
            AbstractC3587m1 abstractC3587m12 = this.b;
            abstractC3587m12.getClass();
            abstractC3587m12.b((Map) tub.i(new Pair(IronSourceConstants.EVENTS_ERROR_CODE, (short) 2363)));
            abstractC3587m12.b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), (short) 0);
        }
        this.b.b((byte) 0);
        return Unit.a;
    }
}
