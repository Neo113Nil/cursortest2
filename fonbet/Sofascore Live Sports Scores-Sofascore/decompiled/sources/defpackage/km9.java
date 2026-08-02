package defpackage;

import com.blaze.blazesdk.ads.ima.BlazeIMAHandlerEventType;
import com.blaze.blazesdk.ads.ima.models.BlazeImaAdInfo;
import com.blaze.ima.BlazeIMAAdRequestInformation;
import com.blaze.ima.BlazeIMADelegate;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class km9 implements BlazeIMADelegate {
    public final ia0 a;

    public km9(ia0 ia0Var) {
        this.a = ia0Var;
    }

    @Override // com.blaze.ima.BlazeIMADelegate
    public final /* bridge */ Object additionalIMATagQueryParams(BlazeIMAAdRequestInformation blazeIMAAdRequestInformation, rq3 rq3Var) {
        return BlazeIMADelegate.DefaultImpls.additionalIMATagQueryParams(this, blazeIMAAdRequestInformation, rq3Var);
    }

    @Override // com.blaze.ima.BlazeIMADelegate
    public final /* bridge */ Object customIMASettings(BlazeIMAAdRequestInformation blazeIMAAdRequestInformation, rq3 rq3Var) {
        return BlazeIMADelegate.DefaultImpls.customIMASettings(this, blazeIMAAdRequestInformation, rq3Var);
    }

    @Override // com.blaze.ima.BlazeIMADelegate
    public final void onIMAAdError(String str) {
        str.getClass();
    }

    @Override // com.blaze.ima.BlazeIMADelegate
    public final void onIMAAdEvent(BlazeIMAHandlerEventType blazeIMAHandlerEventType, BlazeImaAdInfo blazeImaAdInfo) {
        blazeIMAHandlerEventType.getClass();
        int i = jm9.a[blazeIMAHandlerEventType.ordinal()];
        ia0 ia0Var = this.a;
        if (i == 1) {
            nv.E0(ia0Var, mv.IMA);
        } else {
            if (i != 2) {
                return;
            }
            nv.D0(ia0Var, mv.IMA);
        }
    }

    @Override // com.blaze.ima.BlazeIMADelegate
    public final /* bridge */ Object overrideAdTagUrl(BlazeIMAAdRequestInformation blazeIMAAdRequestInformation, rq3 rq3Var) {
        return BlazeIMADelegate.DefaultImpls.overrideAdTagUrl(this, blazeIMAAdRequestInformation, rq3Var);
    }
}
