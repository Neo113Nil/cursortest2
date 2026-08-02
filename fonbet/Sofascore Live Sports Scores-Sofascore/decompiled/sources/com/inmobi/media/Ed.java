package com.inmobi.media;

import com.inmobi.media.ads.network.inmobiJson.model.JsonAssetObject;
import defpackage.a70;
import defpackage.hoi;
import defpackage.hs4;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.tz9;
import defpackage.xw3;
import defpackage.y6a;
import defpackage.z45;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Ed extends hoi implements Function2 {
    public int a;
    public final /* synthetic */ Qd b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ed(Qd qd, rq3 rq3Var) {
        super(2, rq3Var);
        this.b = qd;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new Ed(this.b, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new Ed(this.b, (rq3) obj2).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00c6, code lost:
    
        if (r8 == r0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00c8, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0064, code lost:
    
        if (r9.a(r8) == r0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0058, code lost:
    
        if (defpackage.xw3.R(defpackage.rob.a, new com.inmobi.media.Fd(r9, null), r8) == r0) goto L38;
     */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2 = lu3.a;
        int i = this.a;
        if (i == 0) {
            y6a.M(obj);
            Qd qd = this.b;
            InterfaceC3880x9 l = qd.l();
            if (l != null) {
                ((C3906y9) l).a("NativeLoadingState", "fireAdLoadCalledBeacons - firing ad load called beacons");
            }
            ((Aj) qd.g.getValue()).a(C3472hf.a);
            Qd qd2 = this.b;
            this.a = 1;
            qd2.getClass();
            hs4 hs4Var = z45.a;
        } else if (i == 1) {
            y6a.M(obj);
        } else {
            if (i != 2) {
                if (i == 3) {
                    y6a.M(obj);
                    return Unit.a;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
            Qd qd3 = this.b;
            JsonAssetObject assetsObject = qd3.b.b.getAssetsObject();
            if ((assetsObject != null ? assetsObject.getMedia() : null) == null) {
                InterfaceC3880x9 l2 = qd3.l();
                if (l2 != null) {
                    ((C3906y9) l2).a("NativeLoadingState", "listenToVideoLoadAndErrorEvents - no media assets, skipping");
                }
            } else {
                InterfaceC3880x9 l3 = qd3.l();
                if (l3 != null) {
                    ((C3906y9) l3).a("NativeLoadingState", "listenToVideoLoadAndErrorEvents - media assets found, setting up listener");
                }
                xw3.L(qd3.e, null, null, new Hd(new Kd(((C3909yc) qd3.b.g.getValue()).e), null, qd3), 3);
            }
            Qd qd4 = this.b;
            this.a = 3;
            qd4.getClass();
            Object P = tz9.P(new Nd(qd4, null), this);
            if (P != obj2) {
                P = Unit.a;
            }
        }
        Df df = Df.a;
        this.a = 2;
    }
}
