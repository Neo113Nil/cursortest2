package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.ads.nativead.MediaView;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.OnMBMediaViewListener;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class ekc extends UnifiedNativeAdMapper implements OnMBMediaViewListener {
    public Campaign s;
    public final MediationAdLoadCallback t;
    public MediationNativeAdCallback u;
    public final boolean v;

    public ekc(MediationNativeAdConfiguration mediationNativeAdConfiguration, MediationAdLoadCallback mediationAdLoadCallback) {
        this.v = mediationNativeAdConfiguration.getMediationExtras().getBoolean("mute_audio");
        this.t = mediationAdLoadCallback;
    }

    public static ArrayList a(View view) {
        ArrayList arrayList = new ArrayList();
        if (view != null) {
            if (view instanceof MediaView) {
                arrayList.add(view);
                return arrayList;
            }
            if (!(view instanceof ViewGroup)) {
                arrayList.add(view);
                return arrayList;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                if (viewGroup.getChildAt(i) instanceof ViewGroup) {
                    arrayList.addAll(a(viewGroup.getChildAt(i)));
                } else {
                    arrayList.add(viewGroup.getChildAt(i));
                }
            }
        }
        return arrayList;
    }

    @Override // com.mbridge.msdk.out.OnMBMediaViewListener
    public final void onEnterFullscreen() {
        MediationNativeAdCallback mediationNativeAdCallback = this.u;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.onAdOpened();
        }
    }

    @Override // com.mbridge.msdk.out.OnMBMediaViewListener
    public final void onExitFullscreen() {
        MediationNativeAdCallback mediationNativeAdCallback = this.u;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.onAdClosed();
        }
    }

    @Override // com.mbridge.msdk.out.OnMBMediaViewListener
    public final void onVideoAdClicked(Campaign campaign) {
        MediationNativeAdCallback mediationNativeAdCallback = this.u;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.reportAdClicked();
        }
    }

    @Override // com.mbridge.msdk.out.OnMBMediaViewListener
    public final void onVideoStart() {
        MediationNativeAdCallback mediationNativeAdCallback = this.u;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.onVideoPlay();
        }
    }

    @Override // com.mbridge.msdk.out.OnMBMediaViewListener
    public final void onFinishRedirection(Campaign campaign, String str) {
    }

    @Override // com.mbridge.msdk.out.OnMBMediaViewListener
    public final void onRedirectionFailed(Campaign campaign, String str) {
    }

    @Override // com.mbridge.msdk.out.OnMBMediaViewListener
    public final void onStartRedirection(Campaign campaign, String str) {
    }
}
