package defpackage;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import com.sofascore.results.view.SofascoreRatingView;
import com.sofascore.results.view.SofascoreSmallRatingView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class gse implements rq4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ g6b b;
    public final /* synthetic */ View c;
    public final /* synthetic */ View d;

    public /* synthetic */ gse(g6b g6bVar, View view, View view2, int i) {
        this.a = i;
        this.b = g6bVar;
        this.c = view;
        this.d = view2;
    }

    @Override // defpackage.rq4
    public final void e(u6b u6bVar) {
        int i = this.a;
        View view = this.d;
        g6b g6bVar = this.b;
        u6bVar.getClass();
        switch (i) {
            case 0:
                g6bVar.d(this);
                hse hseVar = (hse) view;
                int i2 = hse.k;
                hseVar.l();
                AnimatorSet animatorSet = hseVar.g;
                if (animatorSet != null) {
                    animatorSet.start();
                }
                ValueAnimator valueAnimator = hseVar.f;
                if (valueAnimator != null) {
                    valueAnimator.start();
                }
                hseVar.h = true;
                break;
            case 1:
                g6bVar.d(this);
                SofascoreRatingView sofascoreRatingView = (SofascoreRatingView) view;
                if (sofascoreRatingView.getShouldAnimate()) {
                    if (sofascoreRatingView.i != 0.0d || sofascoreRatingView.getAllowZeroRating()) {
                        sofascoreRatingView.g(sofascoreRatingView.i);
                        sofascoreRatingView.setShouldAnimate(false);
                        break;
                    }
                }
                break;
            default:
                g6bVar.d(this);
                SofascoreSmallRatingView sofascoreSmallRatingView = (SofascoreSmallRatingView) view;
                Double valueOf = Double.valueOf(sofascoreSmallRatingView.h);
                AnimatorSet animatorSet2 = sofascoreSmallRatingView.v;
                if (animatorSet2 != null) {
                    animatorSet2.cancel();
                }
                AnimatorSet animatorSet3 = new AnimatorSet();
                animatorSet3.playTogether(sofascoreSmallRatingView.i(valueOf, true));
                animatorSet3.start();
                AnimatorSet animatorSet4 = sofascoreSmallRatingView.v;
                if (animatorSet4 != null) {
                    animatorSet4.cancel();
                }
                sofascoreSmallRatingView.v = animatorSet3;
                sofascoreSmallRatingView.setShouldAnimate(false);
                break;
        }
    }
}
