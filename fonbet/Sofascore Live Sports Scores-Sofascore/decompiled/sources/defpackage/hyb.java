package defpackage;

import android.content.Context;
import android.view.View;
import android.view.animation.PathInterpolator;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class hyb {
    public final PathInterpolator a = new PathInterpolator(0.1f, 0.1f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
    public final View b;
    public final int c;
    public final int d;
    public final int e;
    public nx0 f;

    public hyb(View view) {
        this.b = view;
        Context context = view.getContext();
        this.c = x2a.M(context, R.attr.motionDurationMedium2, 300);
        this.d = x2a.M(context, R.attr.motionDurationShort3, 150);
        this.e = x2a.M(context, R.attr.motionDurationShort2, 100);
    }
}
