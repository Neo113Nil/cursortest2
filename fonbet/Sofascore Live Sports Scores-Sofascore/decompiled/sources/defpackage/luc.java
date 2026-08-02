package defpackage;

import com.google.ads.mediation.moloco.MolocoMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.rtb.SignalCallbacks;
import com.moloco.sdk.publisher.MolocoAdError;
import com.moloco.sdk.publisher.MolocoBidTokenListener;
import com.unity3d.ads.IUnityAdsTokenListener;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final /* synthetic */ class luc implements MolocoBidTokenListener, IUnityAdsTokenListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ SignalCallbacks b;

    public /* synthetic */ luc(SignalCallbacks signalCallbacks, int i) {
        this.a = i;
        this.b = signalCallbacks;
    }

    @Override // com.moloco.sdk.publisher.MolocoBidTokenListener
    public void onBidTokenResult(String str, MolocoAdError.ErrorType errorType) {
        nuc nucVar = MolocoMediationAdapter.Companion;
        str.getClass();
        SignalCallbacks signalCallbacks = this.b;
        if (errorType != null) {
            signalCallbacks.onFailure(new AdError(errorType.getErrorCode(), errorType.getDescription(), "com.moloco.sdk"));
        } else {
            signalCallbacks.onSuccess(str);
        }
    }

    @Override // com.unity3d.ads.IUnityAdsTokenListener
    public void onUnityAdsTokenReady(String str) {
        int i = this.a;
        SignalCallbacks signalCallbacks = this.b;
        switch (i) {
            case 1:
                if (str == null) {
                    str = "";
                }
                signalCallbacks.onSuccess(str);
                break;
            default:
                if (str == null) {
                    str = "";
                }
                signalCallbacks.onSuccess(str);
                break;
        }
    }
}
