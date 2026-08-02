package defpackage;

import com.google.ads.mediation.moloco.MolocoMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.moloco.sdk.publisher.Banner;
import com.moloco.sdk.publisher.MolocoAdError;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class huc implements Function2 {
    public final /* synthetic */ iuc a;

    public huc(iuc iucVar) {
        this.a = iucVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Banner banner = (Banner) obj;
        MolocoAdError.AdCreateError adCreateError = (MolocoAdError.AdCreateError) obj2;
        iuc iucVar = this.a;
        MediationAdLoadCallback mediationAdLoadCallback = iucVar.a;
        if (adCreateError != null) {
            mediationAdLoadCallback.onFailure(new AdError(adCreateError.getErrorCode(), adCreateError.getDescription(), "com.moloco.sdk"));
        } else if (banner == null) {
            mediationAdLoadCallback.onFailure(new AdError(103, MolocoMediationAdapter.ERROR_MSG_AD_IS_NULL, MolocoMediationAdapter.ADAPTER_ERROR_DOMAIN));
        } else {
            iucVar.f = banner;
            banner.setAdShowListener(iucVar);
            Banner banner2 = iucVar.f;
            if (banner2 == null) {
                Intrinsics.i("molocoAd");
                throw null;
            }
            banner2.load(iucVar.d, iucVar);
        }
        return Unit.a;
    }
}
