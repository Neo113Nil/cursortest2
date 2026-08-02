package defpackage;

import com.google.ads.mediation.moloco.MolocoMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.moloco.sdk.publisher.MolocoAdError;
import com.moloco.sdk.publisher.NativeAd;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class quc extends xka implements Function2 {
    public final /* synthetic */ suc i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public quc(suc sucVar) {
        super(2);
        this.i = sucVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        NativeAd nativeAd = (NativeAd) obj;
        MolocoAdError.AdCreateError adCreateError = (MolocoAdError.AdCreateError) obj2;
        suc sucVar = this.i;
        if (nativeAd == null) {
            sucVar.t.onFailure(adCreateError != null ? new AdError(adCreateError.getErrorCode(), adCreateError.getDescription(), "com.moloco.sdk") : new AdError(103, MolocoMediationAdapter.ERROR_MSG_AD_IS_NULL, MolocoMediationAdapter.ADAPTER_ERROR_DOMAIN));
        } else {
            sucVar.u = nativeAd;
            nativeAd.load(sucVar.r, sucVar);
        }
        return Unit.a;
    }
}
