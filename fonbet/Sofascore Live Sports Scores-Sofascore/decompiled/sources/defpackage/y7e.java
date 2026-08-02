package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class y7e extends UnifiedNativeAdMapper {
    public final MediationAdLoadCallback s;
    public final s7e t;
    public final b8e u;
    public final q7e v;
    public MediationNativeAdCallback w;
    public PAGNativeAd x;

    public y7e(MediationAdLoadCallback mediationAdLoadCallback, s7e s7eVar, b8e b8eVar, q7e q7eVar) {
        this.s = mediationAdLoadCallback;
        this.t = s7eVar;
        this.u = b8eVar;
        this.v = q7eVar;
    }

    @Override // com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
    public final void trackViews(View view, Map map, Map map2) {
        HashMap hashMap = new HashMap(map);
        hashMap.remove("3011");
        hashMap.remove("3012");
        View view2 = (View) hashMap.get("3002");
        ArrayList arrayList = new ArrayList();
        if (view2 != null) {
            arrayList.add(view2);
        }
        this.x.registerViewForInteraction((ViewGroup) view, new ArrayList(hashMap.values()), arrayList, (View) null, new by9(this));
        getAdChoicesContent().setOnClickListener(new cb(this, 8));
    }
}
