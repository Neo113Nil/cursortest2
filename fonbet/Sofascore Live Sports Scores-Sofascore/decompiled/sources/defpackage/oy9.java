package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.inmobi.ads.InMobiNative;
import com.inmobi.media.ads.nativeAd.InMobiNativeViewData;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class oy9 extends UnifiedNativeAdMapper {
    public final t9d s;
    public final boolean t;
    public final MediationAdLoadCallback u;
    public final fy9 v;

    public oy9(t9d t9dVar, Boolean bool, MediationAdLoadCallback mediationAdLoadCallback, fy9 fy9Var) {
        this.s = t9dVar;
        this.t = bool.booleanValue();
        this.u = mediationAdLoadCallback;
        this.v = fy9Var;
        setOverrideImpressionRecording(true);
    }

    @Override // com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
    public final void trackViews(View view, Map map, Map map2) {
        setOverrideClickHandling(true);
        View view2 = (View) map.get("3001");
        View view3 = (View) map.get("3004");
        View view4 = (View) map.get("3003");
        View view5 = (View) map.get("3002");
        View view6 = (View) map.get("3005");
        View view7 = (View) map.get("3009");
        InMobiNativeViewData.Builder builder = new InMobiNativeViewData.Builder((ViewGroup) view);
        if (view2 != null) {
            builder.setTitleView(view2);
        }
        if (view3 != null) {
            builder.setDescriptionView(view3);
        }
        if (view4 instanceof ImageView) {
            builder.setIconView((ImageView) view4);
        }
        if (view5 != null) {
            builder.setCTAView(view5);
        }
        if (view6 != null) {
            builder.setAdvertiserView(view6);
        }
        if (view7 != null) {
            builder.setRatingView(view7);
        }
        ((InMobiNative) this.s.a).registerViewForTracking(builder.build());
    }

    @Override // com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
    public final void untrackView(View view) {
        ((InMobiNative) this.s.a).unTrackViews();
    }
}
