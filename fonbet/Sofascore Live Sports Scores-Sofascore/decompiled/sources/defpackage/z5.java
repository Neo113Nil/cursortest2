package defpackage;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
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
public abstract class z5 extends r6 {
    public final LinkedHashMap r;
    public boolean s;
    public final DecelerateInterpolator t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z5(Context context, boolean z) {
        super(context, z);
        context.getClass();
        this.r = new LinkedHashMap();
        this.t = new DecelerateInterpolator();
    }

    @Override // defpackage.r6
    @NotNull
    public List<Group> getFractionModeOnlyViews() {
        Group group = getPrimaryTextLayout().c;
        hrc secondaryTextLayout = getSecondaryTextLayout();
        return ph0.x(new Group[]{group, secondaryTextLayout != null ? secondaryTextLayout.c : null});
    }

    @NotNull
    public abstract ImageView getPrimaryBodyPart();

    @Override // defpackage.r6
    @NotNull
    public TextView getPrimaryDenominator() {
        return getPrimaryTextLayout().b;
    }

    @Override // defpackage.r6
    @NotNull
    public TextView getPrimaryNumerator() {
        return getPrimaryTextLayout().d;
    }

    @Override // defpackage.r6
    @NotNull
    public TextView getPrimaryPercentage() {
        return getPrimaryTextLayout().d;
    }

    @NotNull
    public abstract hrc getPrimaryTextLayout();

    @Nullable
    public abstract ImageView getSecondaryBodyPart();

    @Override // defpackage.r6
    @Nullable
    public TextView getSecondaryDenominator() {
        hrc secondaryTextLayout = getSecondaryTextLayout();
        if (secondaryTextLayout != null) {
            return secondaryTextLayout.b;
        }
        return null;
    }

    @Override // defpackage.r6
    @Nullable
    public TextView getSecondaryNumerator() {
        hrc secondaryTextLayout = getSecondaryTextLayout();
        if (secondaryTextLayout != null) {
            return secondaryTextLayout.d;
        }
        return null;
    }

    @Override // defpackage.r6
    @Nullable
    public TextView getSecondaryPercentage() {
        hrc secondaryTextLayout = getSecondaryTextLayout();
        if (secondaryTextLayout != null) {
            return secondaryTextLayout.d;
        }
        return null;
    }

    @Nullable
    public abstract hrc getSecondaryTextLayout();

    @Override // defpackage.r6
    public final void l() {
        Iterator it = ((ArrayList) ph0.x(new Pair[]{new Pair(getPrimaryBodyPart(), crc.a), new Pair(getSecondaryBodyPart(), crc.c)})).iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            ImageView imageView = (ImageView) pair.a;
            crc crcVar = (crc) pair.b;
            if (imageView != null) {
                int zeroGraphColor = getZeroValuesSet().contains(crcVar) ? getZeroGraphColor() : getDefaultColor();
                if (!getZeroValuesSet().contains(crcVar)) {
                    zeroGraphColor = o23.k(zeroGraphColor, (int) (o(crcVar) * 255.0d));
                }
                int i = zeroGraphColor;
                ArgbEvaluator argbEvaluator = new ArgbEvaluator();
                ColorStateList imageTintList = imageView.getImageTintList();
                int defaultColor = imageTintList != null ? imageTintList.getDefaultColor() : getZeroGraphColor();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                ofFloat.setInterpolator(getProgressAnimationInterpolator());
                ofFloat.setDuration(500L);
                ofFloat.addUpdateListener(new x5(argbEvaluator, defaultColor, i, imageView, 1));
                ofFloat.start();
                LinkedHashMap linkedHashMap = this.r;
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

    @Override // defpackage.r6
    public final void p() {
        if (!this.s) {
            this.s = true;
            q();
        }
        getPrimaryTextLayout().d.setTextColor(getZeroValuesSet().contains(crc.a) ? getZeroValueColor() : getDefaultColor());
        hrc secondaryTextLayout = getSecondaryTextLayout();
        if (secondaryTextLayout != null) {
            secondaryTextLayout.d.setTextColor(getZeroValuesSet().contains(crc.c) ? getZeroValueColor() : getDefaultColor());
        }
    }

    public abstract void q();

    @Override // defpackage.r6
    @NotNull
    public DecelerateInterpolator getProgressAnimationInterpolator() {
        return this.t;
    }
}
