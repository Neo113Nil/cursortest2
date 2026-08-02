package defpackage;

import com.blaze.blazesdk.ads.custom_native.models.BlazeAdRequestData;
import com.blaze.gam.custom_native.BlazeCustomNativeAdsManager;
import com.blaze.gam.custom_native.BlazeCustomNativeAdsProvider;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class g2m extends sq3 {
    public Object r;
    public BlazeAdRequestData s;
    public String t;
    public String u;
    public fsf v;
    public BlazeCustomNativeAdsManager w;
    public /* synthetic */ Object x;
    public final /* synthetic */ BlazeCustomNativeAdsProvider y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2m(BlazeCustomNativeAdsProvider blazeCustomNativeAdsProvider, rq3 rq3Var) {
        super(rq3Var);
        this.y = blazeCustomNativeAdsProvider;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.x = obj;
        this.z |= Integer.MIN_VALUE;
        return this.y.generateAd(null, this);
    }
}
