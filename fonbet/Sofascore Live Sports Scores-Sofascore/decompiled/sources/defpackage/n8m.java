package defpackage;

import android.os.Bundle;
import com.blaze.gam.custom_native.BlazeCustomNativeAdsProvider;
import com.blaze.gam.custom_native.BlazeGAMCustomNativeAdsDelegate;
import com.blaze.gam.custom_native.BlazeGamCustomNativeAdRequestInformation;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class n8m extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ BlazeCustomNativeAdsProvider t;
    public final /* synthetic */ BlazeGamCustomNativeAdRequestInformation u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n8m(BlazeCustomNativeAdsProvider blazeCustomNativeAdsProvider, BlazeGamCustomNativeAdRequestInformation blazeGamCustomNativeAdRequestInformation, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = blazeCustomNativeAdsProvider;
        this.u = blazeGamCustomNativeAdRequestInformation;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        BlazeGamCustomNativeAdRequestInformation blazeGamCustomNativeAdRequestInformation = this.u;
        BlazeCustomNativeAdsProvider blazeCustomNativeAdsProvider = this.t;
        switch (i) {
            case 0:
                return new n8m(blazeCustomNativeAdsProvider, blazeGamCustomNativeAdRequestInformation, rq3Var, 0);
            case 1:
                return new n8m(blazeCustomNativeAdsProvider, blazeGamCustomNativeAdRequestInformation, rq3Var, 1);
            default:
                return new n8m(blazeCustomNativeAdsProvider, blazeGamCustomNativeAdRequestInformation, rq3Var, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.r;
        BlazeGamCustomNativeAdRequestInformation blazeGamCustomNativeAdRequestInformation = this.u;
        BlazeCustomNativeAdsProvider blazeCustomNativeAdsProvider = this.t;
        rq3 rq3Var = (rq3) obj2;
        switch (i) {
            case 0:
                return new n8m(blazeCustomNativeAdsProvider, blazeGamCustomNativeAdRequestInformation, rq3Var, 0).invokeSuspend(Unit.a);
            case 1:
                return new n8m(blazeCustomNativeAdsProvider, blazeGamCustomNativeAdRequestInformation, rq3Var, 1).invokeSuspend(Unit.a);
            default:
                return new n8m(blazeCustomNativeAdsProvider, blazeGamCustomNativeAdRequestInformation, rq3Var, 2).invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        BlazeGAMCustomNativeAdsDelegate blazeGAMCustomNativeAdsDelegate;
        BlazeGAMCustomNativeAdsDelegate blazeGAMCustomNativeAdsDelegate2;
        BlazeGAMCustomNativeAdsDelegate blazeGAMCustomNativeAdsDelegate3;
        int i = this.r;
        BlazeGamCustomNativeAdRequestInformation blazeGamCustomNativeAdRequestInformation = this.u;
        BlazeCustomNativeAdsProvider blazeCustomNativeAdsProvider = this.t;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                if (i2 == 0) {
                    y6a.M(obj);
                    blazeGAMCustomNativeAdsDelegate = blazeCustomNativeAdsProvider.delegate;
                    if (blazeGAMCustomNativeAdsDelegate != null) {
                        this.s = 1;
                        obj = blazeGAMCustomNativeAdsDelegate.customGAMTargetingProperties(blazeGamCustomNativeAdRequestInformation, this);
                        if (obj == lu3Var) {
                            return lu3Var;
                        }
                    }
                    lm5 lm5Var = lm5.a;
                    lm5Var.getClass();
                    return lm5Var;
                }
                if (i2 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                Map map = (Map) obj;
                if (map != null) {
                    return map;
                }
                lm5 lm5Var2 = lm5.a;
                lm5Var2.getClass();
                return lm5Var2;
            case 1:
                lu3 lu3Var2 = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    blazeGAMCustomNativeAdsDelegate2 = blazeCustomNativeAdsProvider.delegate;
                    if (blazeGAMCustomNativeAdsDelegate2 == null) {
                        return null;
                    }
                    this.s = 1;
                    obj = blazeGAMCustomNativeAdsDelegate2.networkExtras(blazeGamCustomNativeAdRequestInformation, this);
                    if (obj == lu3Var2) {
                        return lu3Var2;
                    }
                } else {
                    if (i3 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return (Bundle) obj;
            default:
                lu3 lu3Var3 = lu3.a;
                int i4 = this.s;
                if (i4 == 0) {
                    y6a.M(obj);
                    blazeGAMCustomNativeAdsDelegate3 = blazeCustomNativeAdsProvider.delegate;
                    if (blazeGAMCustomNativeAdsDelegate3 == null) {
                        return null;
                    }
                    this.s = 1;
                    obj = blazeGAMCustomNativeAdsDelegate3.publisherProvidedId(blazeGamCustomNativeAdRequestInformation, this);
                    if (obj == lu3Var3) {
                        return lu3Var3;
                    }
                } else {
                    if (i4 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return (String) obj;
        }
    }
}
