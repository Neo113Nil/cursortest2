package defpackage;

import android.animation.ValueAnimator;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.sofascore.results.dialog.view.SofascoreRatingScaleView;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class dvh implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ SofascoreRatingScaleView b;

    public /* synthetic */ dvh(SofascoreRatingScaleView sofascoreRatingScaleView, int i) {
        this.a = i;
        this.b = sofascoreRatingScaleView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        SofascoreRatingScaleView sofascoreRatingScaleView = this.b;
        switch (i) {
            case 0:
                int i2 = SofascoreRatingScaleView.A;
                float floatValue = ((Float) fn0.i(valueAnimator)).floatValue();
                int i3 = 2;
                if (floatValue >= 9.95f) {
                    String n = dti.n(10.0d, 2);
                    sofascoreRatingScaleView.t = n;
                    sofascoreRatingScaleView.g.getTextBounds(n, 0, n.length(), sofascoreRatingScaleView.z);
                } else {
                    gvh gvhVar = sofascoreRatingScaleView.u;
                    int i4 = gvhVar == null ? -1 : fvh.a[gvhVar.ordinal()];
                    if (i4 != 2 && i4 != 3 && i4 != 4 && i4 != 5 && i4 != 6) {
                        i3 = 1;
                    }
                    double d = floatValue;
                    sofascoreRatingScaleView.t = d < 0.001d ? "-" : Math.abs(d - 10.0d) < 0.001d ? "10" : String.format(Locale.US, lnb.k(i3, "%.", InneractiveMediationDefs.GENDER_FEMALE), Arrays.copyOf(new Object[]{Double.valueOf(d)}, 1));
                }
                sofascoreRatingScaleView.invalidate();
                break;
            default:
                int i5 = SofascoreRatingScaleView.A;
                sofascoreRatingScaleView.k = ((Float) fn0.i(valueAnimator)).floatValue();
                sofascoreRatingScaleView.invalidate();
                break;
        }
    }
}
