package com.adsbynimbus.google;

import com.google.android.gms.ads.ResponseInfo;
import defpackage.a70;
import defpackage.ct8;
import defpackage.hoi;
import defpackage.hq4;
import defpackage.hs4;
import defpackage.il4;
import defpackage.kda;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.n4o;
import defpackage.o0g;
import defpackage.rq3;
import defpackage.tm0;
import defpackage.v14;
import defpackage.wcd;
import defpackage.y6a;
import defpackage.z45;
import defpackage.ztj;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo0g;", "T", "Lku3;", "", "<anonymous>", "(Lku3;)V"}, k = 3, mv = {1, 8, 0})
@il4(c = "com.adsbynimbus.google.DynamicPriceWinLossKt$notifyImpression$1", f = "DynamicPriceWinLoss.kt", l = {33}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class DynamicPriceWinLossKt$notifyImpression$1 extends hoi implements Function2<ku3, rq3<? super Unit>, Object> {
    public int r;
    public final /* synthetic */ GoogleAuctionData s;
    public final /* synthetic */ o0g t;
    public final /* synthetic */ ResponseInfo u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (Lcom/adsbynimbus/google/GoogleAuctionData;TT;Lcom/google/android/gms/ads/ResponseInfo;Lrq3<-Lcom/adsbynimbus/google/DynamicPriceWinLossKt$notifyImpression$1;>;)V */
    public DynamicPriceWinLossKt$notifyImpression$1(GoogleAuctionData googleAuctionData, o0g o0gVar, ResponseInfo responseInfo, rq3 rq3Var) {
        super(2, rq3Var);
        this.s = googleAuctionData;
        this.t = o0gVar;
        this.u = responseInfo;
    }

    @Override // defpackage.h21
    public final rq3<Unit> create(Object obj, rq3<?> rq3Var) {
        return new DynamicPriceWinLossKt$notifyImpression$1(this.s, this.t, this.u, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ku3 ku3Var, rq3<? super Unit> rq3Var) {
        return ((DynamicPriceWinLossKt$notifyImpression$1) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.r;
        if (i == 0) {
            y6a.M(obj);
            this.r = 1;
            if (n4o.y(500L, this) == lu3Var) {
                return lu3Var;
            }
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
        }
        GoogleAuctionData googleAuctionData = this.s;
        boolean nimbusWin = googleAuctionData.getNimbusWin();
        o0g o0gVar = this.t;
        if (nimbusWin) {
            wcd ad = googleAuctionData.getAd();
            tm0 tm0Var = new tm0(null, null, 7);
            ct8 ct8Var = v14.b;
            if (ct8Var == null) {
                ct8Var = ztj.a;
            }
            hs4 hs4Var = z45.a;
            hq4 hq4Var = hq4.c;
            o0gVar.getClass();
            ad.getClass();
            ct8Var.getClass();
            hq4Var.getClass();
            kda.H((String) ad.a.s.get("win_response"), "Win", tm0Var, ct8Var, hq4Var);
        } else {
            wcd ad2 = googleAuctionData.getAd();
            String price = googleAuctionData.getPrice();
            ResponseInfo responseInfo = this.u;
            kda.I(o0gVar, ad2, new tm0(price, responseInfo != null ? responseInfo.getMediationAdapterClassName() : null, 2));
        }
        return Unit.a;
    }
}
