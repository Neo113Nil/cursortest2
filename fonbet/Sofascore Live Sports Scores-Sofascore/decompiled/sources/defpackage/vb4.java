package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.MediaView;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.NativeAdMapper;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class vb4 extends NativeAdMapper {
    public final MediationAdLoadCallback q;
    public MediationNativeAdCallback r;
    public InneractiveAdSpot s;
    public NativeAdContent t;

    public vb4(MediationAdLoadCallback mediationAdLoadCallback) {
        mediationAdLoadCallback.getClass();
        this.q = mediationAdLoadCallback;
    }

    @Override // com.google.android.gms.ads.mediation.NativeAdMapper
    public final void destroy() {
        super.destroy();
        InneractiveAdSpot inneractiveAdSpot = this.s;
        if (inneractiveAdSpot != null) {
            inneractiveAdSpot.destroy();
        }
        this.s = null;
        NativeAdContent nativeAdContent = this.t;
        if (nativeAdContent != null) {
            nativeAdContent.destroy();
        }
        this.t = null;
        this.r = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    @Override // com.google.android.gms.ads.mediation.NativeAdMapper
    public final void trackViews(View view, Map map, Map map2) {
        String str;
        view.getClass();
        map.getClass();
        map2.getClass();
        view.setTag(NativeAdContent.ViewTag.ROOT);
        NativeAdContent nativeAdContent = this.t;
        MediaView mediaView = nativeAdContent != null ? nativeAdContent.getMediaView() : null;
        if (mediaView != null) {
            mediaView.setTag(NativeAdContent.ViewTag.MEDIA_VIEW);
        }
        for (Map.Entry entry : map.entrySet()) {
            String str2 = (String) entry.getKey();
            View view2 = (View) entry.getValue();
            int hashCode = str2.hashCode();
            if (hashCode != 1567014) {
                switch (hashCode) {
                    case 1567006:
                        if (str2.equals("3001")) {
                            str = NativeAdContent.ViewTag.AD_TITLE;
                            break;
                        }
                        str = NativeAdContent.ViewTag.OTHER;
                        break;
                    case 1567007:
                        if (str2.equals("3002")) {
                            str = NativeAdContent.ViewTag.CTA;
                            break;
                        }
                        str = NativeAdContent.ViewTag.OTHER;
                        break;
                    case 1567008:
                        if (str2.equals("3003")) {
                            str = NativeAdContent.ViewTag.AD_ICON;
                            break;
                        }
                        str = NativeAdContent.ViewTag.OTHER;
                        break;
                    case 1567009:
                        if (str2.equals("3004")) {
                            str = NativeAdContent.ViewTag.AD_DESCRIPTION;
                            break;
                        }
                        str = NativeAdContent.ViewTag.OTHER;
                        break;
                    default:
                        str = NativeAdContent.ViewTag.OTHER;
                        break;
                }
            } else {
                if (str2.equals("3009")) {
                    str = NativeAdContent.ViewTag.RATING;
                }
                str = NativeAdContent.ViewTag.OTHER;
            }
            view2.setTag(str);
        }
        NativeAdContent nativeAdContent2 = this.t;
        if (nativeAdContent2 != null) {
            nativeAdContent2.registerViewsForInteraction((ViewGroup) view, nativeAdContent2 != null ? nativeAdContent2.getMediaView() : null, null, map.values());
        }
    }
}
