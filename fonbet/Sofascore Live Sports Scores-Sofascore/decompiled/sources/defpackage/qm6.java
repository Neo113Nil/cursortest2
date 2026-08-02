package defpackage;

import android.view.View;
import android.widget.ImageView;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeBannerAd;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.NativeAdMapper;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class qm6 extends NativeAdMapper {
    public final MediationAdLoadCallback q;
    public NativeAdBase r;
    public MediationNativeAdCallback s;
    public MediaView t;
    public final k03 u;

    public qm6(MediationAdLoadCallback mediationAdLoadCallback, k03 k03Var) {
        this.q = mediationAdLoadCallback;
        this.u = k03Var;
    }

    @Override // com.google.android.gms.ads.mediation.NativeAdMapper
    public final void trackViews(View view, Map map, Map map2) {
        setOverrideClickHandling(true);
        ArrayList arrayList = new ArrayList(map.values());
        View view2 = (View) map.get("3003");
        NativeAdBase nativeAdBase = this.r;
        if (!(nativeAdBase instanceof NativeBannerAd)) {
            if (nativeAdBase instanceof NativeAd) {
                NativeAd nativeAd = (NativeAd) nativeAdBase;
                if (view2 instanceof ImageView) {
                    nativeAd.registerViewForInteraction(view, this.t, (ImageView) view2, arrayList);
                    return;
                } else {
                    nativeAd.registerViewForInteraction(view, this.t, arrayList);
                    return;
                }
            }
            return;
        }
        if (view2 == null) {
            return;
        }
        if (view2 instanceof ImageView) {
            ((NativeBannerAd) nativeAdBase).registerViewForInteraction(view, (ImageView) view2, arrayList);
            return;
        }
        Class<?> cls = view2.getClass();
        StringBuilder sb = new StringBuilder("Native ad icon asset is rendered with an incompatible class type. Meta Audience Network impression recording might be impacted for this ad. Expected: ImageView, actual: ");
        sb.append(cls);
        sb.append(".");
    }

    @Override // com.google.android.gms.ads.mediation.NativeAdMapper
    public final void untrackView(View view) {
        NativeAdBase nativeAdBase = this.r;
        if (nativeAdBase != null) {
            nativeAdBase.unregisterView();
            this.r.destroy();
            this.r = null;
        }
        MediaView mediaView = this.t;
        if (mediaView != null) {
            mediaView.destroy();
            this.t = null;
        }
        super.untrackView(view);
    }
}
