package com.inmobi.media;

import android.os.SystemClock;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.media.ads.network.common.model.AdResponse;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import defpackage.a70;
import defpackage.hoi;
import defpackage.lu3;
import defpackage.qij;
import defpackage.rq3;
import defpackage.wba;
import defpackage.y6a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Y6 extends hoi implements Function2 {
    public int a;
    public final /* synthetic */ Z6 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y6(Z6 z6, rq3 rq3Var) {
        super(2, rq3Var);
        this.b = z6;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new Y6(this.b, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new Y6(this.b, (rq3) obj2).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.a;
        try {
            if (i == 0) {
                y6a.M(obj);
                C3328c0 c3328c0 = this.b.f;
                c3328c0.getClass();
                c3328c0.c = SystemClock.elapsedRealtime();
                Integer num = this.b.m.d;
                long intValue = num != null ? num.intValue() : 15000;
                X6 x6 = new X6(this.b, null);
                this.a = 1;
                obj = wba.U(intValue, x6, this);
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
            this.b.a.getClass();
            Z6 z6 = this.b;
            AbstractC3354d0.a(IronSourceConstants.EVENTS_NATIVE, z6.d.h, adResponse, z6.e);
            C3906y9 c3906y9 = this.b.e;
            if (c3906y9 != null) {
                c3906y9.a("AUM-FetchingState", "AdResponse Parse Success");
            }
            this.b.a(adResponse);
        } catch (Y e) {
            C3906y9 c3906y92 = this.b.e;
            if (c3906y92 != null) {
                c3906y92.b("AUM-FetchingState", "AdResponse Parse Failure " + e);
            }
            this.b.a(e);
        } catch (qij unused) {
            C3906y9 c3906y93 = this.b.e;
            if (c3906y93 != null) {
                c3906y93.b("AUM-FetchingState", "Ad fetch timed out");
            }
            this.b.a(new Y(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REQUEST_TIMED_OUT), new R6((short) 2138)));
        }
        return Unit.a;
    }
}
