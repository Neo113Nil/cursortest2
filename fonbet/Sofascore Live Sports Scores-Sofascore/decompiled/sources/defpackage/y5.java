package defpackage;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class y5 extends m6 {
    public final DecelerateInterpolator A;
    public final LinkedHashMap y;
    public boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y5(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, false);
        context.getClass();
        this.y = new LinkedHashMap();
        this.A = new DecelerateInterpolator();
    }

    @Override // defpackage.m6
    @NotNull
    public List<Group> getFractionModeOnlyViews() {
        Group group = getPrimaryTextLayoutHome().c;
        if (!getHomeActive()) {
            group = null;
        }
        Group group2 = getPrimaryTextLayoutAway().c;
        if (!getAwayActive()) {
            group2 = null;
        }
        hrc secondaryTextLayoutHome = getSecondaryTextLayoutHome();
        Group group3 = secondaryTextLayoutHome != null ? secondaryTextLayoutHome.c : null;
        if (!getHomeActive()) {
            group3 = null;
        }
        hrc secondaryTextLayoutAway = getSecondaryTextLayoutAway();
        return ph0.x(new Group[]{group, group2, group3, getAwayActive() ? secondaryTextLayoutAway != null ? secondaryTextLayoutAway.c : null : null});
    }

    @NotNull
    public abstract ImageView getPrimaryBodyPartAway();

    @NotNull
    public abstract ImageView getPrimaryBodyPartHome();

    @Override // defpackage.m6
    @NotNull
    public TextView getPrimaryDenominatorAway() {
        return getPrimaryTextLayoutAway().b;
    }

    @Override // defpackage.m6
    @NotNull
    public TextView getPrimaryDenominatorHome() {
        return getPrimaryTextLayoutHome().b;
    }

    @Override // defpackage.m6
    @NotNull
    public View getPrimaryHighlightAway() {
        return getPrimaryTextLayoutAway().e;
    }

    @Override // defpackage.m6
    @NotNull
    public View getPrimaryHighlightHome() {
        return getPrimaryTextLayoutHome().e;
    }

    @Override // defpackage.m6
    @NotNull
    public TextView getPrimaryNumeratorAway() {
        return getPrimaryTextLayoutAway().d;
    }

    @Override // defpackage.m6
    @NotNull
    public TextView getPrimaryNumeratorHome() {
        return getPrimaryTextLayoutHome().d;
    }

    @Override // defpackage.m6
    @NotNull
    public TextView getPrimaryPercentageAway() {
        return getPrimaryTextLayoutAway().d;
    }

    @Override // defpackage.m6
    @NotNull
    public TextView getPrimaryPercentageHome() {
        return getPrimaryTextLayoutHome().d;
    }

    @NotNull
    public abstract hrc getPrimaryTextLayoutAway();

    @NotNull
    public abstract hrc getPrimaryTextLayoutHome();

    @Nullable
    public abstract ImageView getSecondaryBodyPartAway();

    @Nullable
    public abstract ImageView getSecondaryBodyPartHome();

    @Override // defpackage.m6
    @Nullable
    public TextView getSecondaryDenominatorAway() {
        hrc secondaryTextLayoutAway = getSecondaryTextLayoutAway();
        if (secondaryTextLayoutAway != null) {
            return secondaryTextLayoutAway.b;
        }
        return null;
    }

    @Override // defpackage.m6
    @Nullable
    public TextView getSecondaryDenominatorHome() {
        hrc secondaryTextLayoutHome = getSecondaryTextLayoutHome();
        if (secondaryTextLayoutHome != null) {
            return secondaryTextLayoutHome.b;
        }
        return null;
    }

    @Override // defpackage.m6
    @Nullable
    public View getSecondaryHighlightAway() {
        hrc secondaryTextLayoutAway = getSecondaryTextLayoutAway();
        if (secondaryTextLayoutAway != null) {
            return secondaryTextLayoutAway.e;
        }
        return null;
    }

    @Override // defpackage.m6
    @Nullable
    public View getSecondaryHighlightHome() {
        hrc secondaryTextLayoutHome = getSecondaryTextLayoutHome();
        if (secondaryTextLayoutHome != null) {
            return secondaryTextLayoutHome.e;
        }
        return null;
    }

    @Override // defpackage.m6
    @Nullable
    public TextView getSecondaryNumeratorAway() {
        hrc secondaryTextLayoutAway = getSecondaryTextLayoutAway();
        if (secondaryTextLayoutAway != null) {
            return secondaryTextLayoutAway.d;
        }
        return null;
    }

    @Override // defpackage.m6
    @Nullable
    public TextView getSecondaryNumeratorHome() {
        hrc secondaryTextLayoutHome = getSecondaryTextLayoutHome();
        if (secondaryTextLayoutHome != null) {
            return secondaryTextLayoutHome.d;
        }
        return null;
    }

    @Override // defpackage.m6
    @Nullable
    public TextView getSecondaryPercentageAway() {
        hrc secondaryTextLayoutAway = getSecondaryTextLayoutAway();
        if (secondaryTextLayoutAway != null) {
            return secondaryTextLayoutAway.d;
        }
        return null;
    }

    @Override // defpackage.m6
    @Nullable
    public TextView getSecondaryPercentageHome() {
        hrc secondaryTextLayoutHome = getSecondaryTextLayoutHome();
        if (secondaryTextLayoutHome != null) {
            return secondaryTextLayoutHome.d;
        }
        return null;
    }

    @Nullable
    public abstract hrc getSecondaryTextLayoutAway();

    @Nullable
    public abstract hrc getSecondaryTextLayoutHome();

    @Override // defpackage.m6
    public final void l() {
        Pair pair = new Pair(getPrimaryBodyPartHome(), crc.a);
        if (!getHomeActive()) {
            pair = null;
        }
        Pair pair2 = new Pair(getPrimaryBodyPartAway(), crc.b);
        if (!getAwayActive()) {
            pair2 = null;
        }
        Pair pair3 = new Pair(getSecondaryBodyPartHome(), crc.c);
        if (!getHomeActive()) {
            pair3 = null;
        }
        Iterator it = ((ArrayList) ph0.x(new Pair[]{pair, pair2, pair3, getAwayActive() ? new Pair(getSecondaryBodyPartAway(), crc.d) : null})).iterator();
        while (it.hasNext()) {
            Pair pair4 = (Pair) it.next();
            ImageView imageView = (ImageView) pair4.a;
            crc crcVar = (crc) pair4.b;
            if (imageView != null) {
                int u = u(crcVar, true);
                if (!getZeroValuesSet().contains(crcVar)) {
                    u = o23.k(u, (int) (p(crcVar) * 255.0d));
                }
                int i = u;
                ArgbEvaluator argbEvaluator = new ArgbEvaluator();
                ColorStateList imageTintList = imageView.getImageTintList();
                int defaultColor = imageTintList != null ? imageTintList.getDefaultColor() : getZeroGraphColor();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                ofFloat.setInterpolator(getProgressAnimationInterpolator());
                ofFloat.setDuration(500L);
                ofFloat.addUpdateListener(new x5(argbEvaluator, defaultColor, i, imageView, 0));
                ofFloat.start();
                LinkedHashMap linkedHashMap = this.y;
                ValueAnimator valueAnimator = (ValueAnimator) linkedHashMap.get(crcVar);
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                }
                ValueAnimator valueAnimator2 = (ValueAnimator) linkedHashMap.get(crcVar);
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                linkedHashMap.put(crcVar, ofFloat);
            }
        }
    }

    @Override // defpackage.m6
    public final void t() {
        if (!this.z) {
            this.z = true;
            v();
        }
        if (getHomeActive()) {
            getPrimaryTextLayoutHome().d.setTextColor(u(crc.a, false));
            hrc secondaryTextLayoutHome = getSecondaryTextLayoutHome();
            if (secondaryTextLayoutHome != null) {
                secondaryTextLayoutHome.d.setTextColor(u(crc.c, false));
            }
        }
        if (getAwayActive()) {
            getPrimaryTextLayoutAway().d.setTextColor(u(crc.b, false));
            hrc secondaryTextLayoutAway = getSecondaryTextLayoutAway();
            if (secondaryTextLayoutAway != null) {
                secondaryTextLayoutAway.d.setTextColor(u(crc.d, false));
            }
        }
    }

    public final int u(crc crcVar, boolean z) {
        if (getZeroValuesSet().contains(crcVar)) {
            return z ? getZeroGraphColor() : getZeroValueColor();
        }
        if (crcVar == crc.a || crcVar == crc.c) {
            return getHomeDefaultColor();
        }
        if (crcVar == crc.b || crcVar == crc.d) {
            return getAwayDefaultColor();
        }
        zzl.b();
        return 0;
    }

    public abstract void v();

    @Override // defpackage.m6
    @NotNull
    public DecelerateInterpolator getProgressAnimationInterpolator() {
        return this.A;
    }
}
