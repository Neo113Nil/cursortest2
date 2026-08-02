package defpackage;

import com.blaze.blazesdk.ads.custom_native.BlazeGoogleCustomNativeAdsHandler;
import com.blaze.blazesdk.ads.custom_native.models.BlazeGoogleCustomNativeAdModel;
import com.blaze.gam.custom_native.BlazeCustomNativeAdData;
import com.blaze.gam.custom_native.BlazeCustomNativeAdsParsingKt;
import com.blaze.gam.custom_native.BlazeCustomNativeAdsReportingKt;
import com.blaze.gam.custom_native.BlazeGAMCustomNativeAdsDelegate;
import com.blaze.gam.custom_native.BlazeGamCustomNativeAdRequestInformation;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class f94 implements BlazeGAMCustomNativeAdsDelegate {
    public final ia0 a;

    public f94(ia0 ia0Var) {
        this.a = ia0Var;
    }

    @Override // com.blaze.gam.custom_native.BlazeGAMCustomNativeAdsDelegate
    public final /* bridge */ Object customGAMTargetingProperties(BlazeGamCustomNativeAdRequestInformation blazeGamCustomNativeAdRequestInformation, rq3 rq3Var) {
        return BlazeGAMCustomNativeAdsDelegate.DefaultImpls.customGAMTargetingProperties(this, blazeGamCustomNativeAdRequestInformation, rq3Var);
    }

    @Override // com.blaze.gam.custom_native.BlazeGAMCustomNativeAdsDelegate
    public final /* bridge */ Object networkExtras(BlazeGamCustomNativeAdRequestInformation blazeGamCustomNativeAdRequestInformation, rq3 rq3Var) {
        return BlazeGAMCustomNativeAdsDelegate.DefaultImpls.networkExtras(this, blazeGamCustomNativeAdRequestInformation, rq3Var);
    }

    @Override // com.blaze.gam.custom_native.BlazeGAMCustomNativeAdsDelegate
    public final void onGAMCustomNativeAdError(String str) {
        str.getClass();
    }

    @Override // com.blaze.gam.custom_native.BlazeGAMCustomNativeAdsDelegate
    public final void onGAMCustomNativeAdEvent(BlazeGoogleCustomNativeAdsHandler.EventType eventType, BlazeCustomNativeAdData blazeCustomNativeAdData) {
        eventType.getClass();
        blazeCustomNativeAdData.getClass();
        BlazeGoogleCustomNativeAdModel adModel = BlazeCustomNativeAdsParsingKt.toAdModel(blazeCustomNativeAdData.getNativeAd(), blazeCustomNativeAdData.getExtraInfo());
        if (adModel != null) {
            int i = e94.a[eventType.ordinal()];
            ia0 ia0Var = this.a;
            if (i == 1) {
                nv.E0(ia0Var, mv.NATIVE);
            } else if (i == 2) {
                nv.D0(ia0Var, mv.NATIVE);
            }
            BlazeCustomNativeAdsReportingKt.reportAdEvent(eventType, adModel);
        }
    }

    @Override // com.blaze.gam.custom_native.BlazeGAMCustomNativeAdsDelegate
    public final /* bridge */ Object publisherProvidedId(BlazeGamCustomNativeAdRequestInformation blazeGamCustomNativeAdRequestInformation, rq3 rq3Var) {
        return BlazeGAMCustomNativeAdsDelegate.DefaultImpls.publisherProvidedId(this, blazeGamCustomNativeAdRequestInformation, rq3Var);
    }
}
