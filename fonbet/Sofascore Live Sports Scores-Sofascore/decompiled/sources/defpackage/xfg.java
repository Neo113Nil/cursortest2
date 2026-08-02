package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.equativ.displaysdk.adadapter.SASParallaxBannerAdapter;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.f1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final /* synthetic */ class xfg implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xfg(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        float measuredHeight;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                SASParallaxBannerAdapter sASParallaxBannerAdapter = (SASParallaxBannerAdapter) obj;
                FrameLayout frameLayout = sASParallaxBannerAdapter.g;
                if (frameLayout == null) {
                    Intrinsics.i("renderedViewParallaxContainer");
                    throw null;
                }
                int[] iArr = new int[2];
                RelativeLayout relativeLayout = sASParallaxBannerAdapter.f;
                if (relativeLayout == null) {
                    Intrinsics.i("parallaxBannerView");
                    throw null;
                }
                relativeLayout.getLocationOnScreen(iArr);
                RelativeLayout relativeLayout2 = sASParallaxBannerAdapter.f;
                if (relativeLayout2 == null) {
                    Intrinsics.i("parallaxBannerView");
                    throw null;
                }
                View rootView = relativeLayout2.getRootView();
                int[] iArr2 = new int[2];
                rootView.getLocationOnScreen(iArr2);
                int[] a = fdg.a(rootView);
                int height = rootView.getHeight();
                agg aggVar = sASParallaxBannerAdapter.m;
                int i2 = aggVar.b;
                int i3 = aggVar.d + i2;
                int i4 = a[1];
                int i5 = height - ((i3 + i4) + a[3]);
                int i6 = ((iArr[1] - iArr2[1]) - i2) - i4;
                wfg wfgVar = sASParallaxBannerAdapter.d;
                if (wfgVar == null) {
                    Intrinsics.i("parallaxAd");
                    throw null;
                }
                int ordinal = wfgVar.a.ordinal();
                if (ordinal == 0) {
                    if (sASParallaxBannerAdapter.g == null) {
                        Intrinsics.i("renderedViewParallaxContainer");
                        throw null;
                    }
                    measuredHeight = ((i5 - r13.getMeasuredHeight()) / 2.0f) - i6;
                } else {
                    if (ordinal != 1) {
                        zzl.b();
                        return false;
                    }
                    RelativeLayout relativeLayout3 = sASParallaxBannerAdapter.f;
                    if (relativeLayout3 == null) {
                        Intrinsics.i("parallaxBannerView");
                        throw null;
                    }
                    int measuredHeight2 = relativeLayout3.getMeasuredHeight();
                    FrameLayout frameLayout2 = sASParallaxBannerAdapter.g;
                    if (frameLayout2 == null) {
                        Intrinsics.i("renderedViewParallaxContainer");
                        throw null;
                    }
                    int measuredHeight3 = frameLayout2.getMeasuredHeight();
                    float f = i6;
                    float f2 = f / (i5 - measuredHeight2);
                    if (f2 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        measuredHeight = -f;
                    } else if (f2 > 1.0f) {
                        measuredHeight = (i5 - measuredHeight3) - i6;
                    } else {
                        measuredHeight = (measuredHeight3 - measuredHeight2) * (-f2);
                    }
                }
                frameLayout.setY(measuredHeight);
                return true;
            default:
                return f1.a((f1) obj);
        }
    }
}
