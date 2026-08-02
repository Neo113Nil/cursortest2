package defpackage;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.model.mvvm.model.Gender;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class m6 extends h6b implements grc {
    public final boolean d;
    public String e;
    public rrc f;
    public jrc g;
    public Gender h;
    public boolean i;
    public boolean j;
    public final int k;
    public final int l;
    public final int m;
    public final int n;
    public final int o;
    public final int p;
    public final LinkedHashSet q;
    public final ArrayList r;
    public boolean s;
    public yqc t;
    public final km5 u;
    public final km5 v;
    public final LinearInterpolator w;
    public final c0 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m6(Context context, AttributeSet attributeSet, boolean z) {
        super(context, attributeSet, 0);
        context.getClass();
        this.d = z;
        this.f = rrc.a;
        this.k = context.getColor(R.color.n_lv_3);
        this.l = context.getColor(R.color.n_lv_5);
        this.m = context.getColor(R.color.red_fighter_default);
        this.n = context.getColor(R.color.red_fighter_highlight);
        this.o = context.getColor(R.color.blue_fighter_default);
        this.p = context.getColor(R.color.blue_fighter_highlight);
        this.q = new LinkedHashSet();
        this.r = new ArrayList();
        this.s = true;
        km5 km5Var = km5.a;
        this.u = km5Var;
        this.v = km5Var;
        this.w = new LinearInterpolator();
        this.x = new c0(5);
    }

    public static void r(ConstraintLayout constraintLayout, int i) {
        constraintLayout.getClass();
        mm3 mm3Var = new mm3();
        mm3Var.e(constraintLayout);
        mm3Var.f(i, 6, 0, 6);
        mm3Var.a(constraintLayout);
    }

    @Override // defpackage.rq4
    public final void e(u6b u6bVar) {
        u6bVar.getClass();
        if (this.t != null) {
            l();
        }
    }

    public final boolean getAwayActive() {
        return this.j;
    }

    public final int getAwayDefaultColor() {
        return this.o;
    }

    public final int getAwayHighlightColor() {
        return this.p;
    }

    @NotNull
    public final Gender getBodyGraphGender() {
        Gender gender = this.h;
        if (gender != null) {
            return gender;
        }
        Intrinsics.i("bodyGraphGender");
        throw null;
    }

    @NotNull
    public List<View> getFractionModeOnlyViews() {
        return this.v;
    }

    @Nullable
    public final String getGroupTag() {
        return this.e;
    }

    public final boolean getHomeActive() {
        return this.i;
    }

    public final int getHomeDefaultColor() {
        return this.m;
    }

    public final int getHomeHighlightColor() {
        return this.n;
    }

    @NotNull
    public List<View> getPercentageModeOnlyViews() {
        return this.u;
    }

    @Nullable
    public abstract TextView getPrimaryDenominatorAway();

    @Nullable
    public abstract TextView getPrimaryDenominatorHome();

    @Nullable
    public abstract View getPrimaryHighlightAway();

    @Nullable
    public abstract View getPrimaryHighlightHome();

    @NotNull
    public abstract TextView getPrimaryLabel();

    @Nullable
    public abstract TextView getPrimaryNumeratorAway();

    @NotNull
    public abstract TextView getPrimaryNumeratorHome();

    @Nullable
    public abstract TextView getPrimaryPercentageAway();

    @NotNull
    public abstract TextView getPrimaryPercentageHome();

    @NotNull
    public Interpolator getProgressAnimationInterpolator() {
        return this.w;
    }

    @Nullable
    public TextView getSecondaryDenominatorAway() {
        return null;
    }

    @Nullable
    public TextView getSecondaryDenominatorHome() {
        return null;
    }

    @Nullable
    public View getSecondaryHighlightAway() {
        return null;
    }

    @Nullable
    public View getSecondaryHighlightHome() {
        return null;
    }

    @Nullable
    public TextView getSecondaryLabel() {
        return null;
    }

    @Nullable
    public TextView getSecondaryNumeratorAway() {
        return null;
    }

    @Nullable
    public TextView getSecondaryNumeratorHome() {
        return null;
    }

    @Nullable
    public TextView getSecondaryPercentageAway() {
        return null;
    }

    @Nullable
    public TextView getSecondaryPercentageHome() {
        return null;
    }

    @NotNull
    public Function0<Unit> getTransitionCallback() {
        return this.x;
    }

    public final int getZeroGraphColor() {
        return this.l;
    }

    public final int getZeroValueColor() {
        return this.k;
    }

    @NotNull
    public final Set<crc> getZeroValuesSet() {
        return this.q;
    }

    public abstract void l();

    public final void n(View view, float f, long j) {
        if (view != null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "scaleX", view.getScaleX(), f);
            ofFloat.setDuration(300L);
            ofFloat.setStartDelay(j);
            ofFloat.setInterpolator(new DecelerateInterpolator());
            ofFloat.start();
            this.r.add(ofFloat);
        }
    }

    public final String o(Double d) {
        yqc yqcVar = this.t;
        if (yqcVar != null && yqcVar.h) {
            int doubleValue = d != null ? (int) d.doubleValue() : 0;
            int i = doubleValue / 60;
            return String.format(dla.d(), "%d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i), Integer.valueOf(doubleValue - (i * 60))}, 2));
        }
        double doubleValue2 = d != null ? d.doubleValue() : 0.0d;
        String format = String.format(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(doubleValue2)}, 1));
        int a = wzb.a(doubleValue2);
        return ((double) a) == Double.parseDouble(format) ? String.valueOf(a) : format;
    }

    public final double p(crc crcVar) {
        arc arcVar;
        arc arcVar2;
        crcVar.getClass();
        int ordinal = crcVar.ordinal();
        Double d = null;
        if (ordinal == 0) {
            yqc yqcVar = this.t;
            if (yqcVar != null) {
                d = Double.valueOf(yqcVar.c.a);
            }
        } else if (ordinal == 1) {
            yqc yqcVar2 = this.t;
            if (yqcVar2 != null) {
                d = Double.valueOf(yqcVar2.d.a);
            }
        } else if (ordinal == 2) {
            yqc yqcVar3 = this.t;
            if (yqcVar3 != null && (arcVar = yqcVar3.e) != null) {
                d = Double.valueOf(arcVar.a);
            }
        } else {
            if (ordinal != 3) {
                zzl.b();
                return 0.0d;
            }
            yqc yqcVar4 = this.t;
            if (yqcVar4 != null && (arcVar2 = yqcVar4.f) != null) {
                d = Double.valueOf(arcVar2.a);
            }
        }
        return llf.a((d != null ? d.doubleValue() : 0.0d) / 100.0d, 0.0d, 1.0d);
    }

    public final void q(boolean z, boolean z2, Gender gender) {
        this.i = z;
        this.j = z2;
        if (gender == null) {
            gender = Gender.Male;
        }
        setBodyGraphGender(gender);
        if (!this.i) {
            getPrimaryPercentageHome().setText("-");
            TextView secondaryPercentageHome = getSecondaryPercentageHome();
            if (secondaryPercentageHome != null) {
                secondaryPercentageHome.setText("-");
            }
        }
        if (this.j) {
            return;
        }
        TextView primaryPercentageAway = getPrimaryPercentageAway();
        if (primaryPercentageAway != null) {
            primaryPercentageAway.setText("-");
        }
        TextView secondaryPercentageAway = getSecondaryPercentageAway();
        if (secondaryPercentageAway != null) {
            secondaryPercentageAway.setText("-");
        }
    }

    public final void s(String str, String str2) {
        str.getClass();
        this.e = str;
        setTag(str2);
        String string = getContext().getString(tnf.p(str2));
        string.getClass();
        getPrimaryLabel().setText(string);
    }

    public final void setAwayActive(boolean z) {
        this.j = z;
    }

    public final void setBodyGraphGender(@NotNull Gender gender) {
        gender.getClass();
        this.h = gender;
    }

    @Override // defpackage.grc
    public void setDisplayMode(@NotNull rrc rrcVar) {
        rrcVar.getClass();
        this.f = rrcVar;
        this.s = rrcVar == rrc.b;
        if (rrcVar == rrc.a) {
            ArrayList arrayList = this.r;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((Animator) it.next()).cancel();
            }
            arrayList.clear();
            View primaryHighlightHome = getPrimaryHighlightHome();
            if (primaryHighlightHome != null) {
                primaryHighlightHome.setScaleX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
            View primaryHighlightAway = getPrimaryHighlightAway();
            if (primaryHighlightAway != null) {
                primaryHighlightAway.setScaleX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
            View secondaryHighlightHome = getSecondaryHighlightHome();
            if (secondaryHighlightHome != null) {
                secondaryHighlightHome.setScaleX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
            View secondaryHighlightAway = getSecondaryHighlightAway();
            if (secondaryHighlightAway != null) {
                secondaryHighlightAway.setScaleX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
        }
        getTransitionCallback().invoke();
        Iterator<T> it2 = getPercentageModeOnlyViews().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            View view = (View) it2.next();
            if (view != null) {
                view.setVisibility(rrcVar == rrc.a ? 0 : 8);
            }
        }
        for (View view2 : getFractionModeOnlyViews()) {
            if (view2 != null) {
                view2.setVisibility((rrcVar == rrc.b && this.d) ? 0 : 8);
            }
        }
        yqc yqcVar = this.t;
        if (yqcVar != null) {
            setStatisticData(yqcVar);
        }
    }

    public final void setFractionalDisplay(@NotNull yqc yqcVar) {
        yqcVar.getClass();
        arc arcVar = yqcVar.f;
        arc arcVar2 = yqcVar.d;
        arc arcVar3 = yqcVar.c;
        this.s = false;
        if (this.i) {
            TextView primaryNumeratorHome = getPrimaryNumeratorHome();
            arc arcVar4 = yqcVar.e;
            primaryNumeratorHome.setText(o(Double.valueOf(arcVar3.b)));
            TextView primaryDenominatorHome = getPrimaryDenominatorHome();
            if (primaryDenominatorHome != null) {
                primaryDenominatorHome.setText(o(arcVar3.c));
            }
            TextView secondaryNumeratorHome = getSecondaryNumeratorHome();
            if (secondaryNumeratorHome != null) {
                secondaryNumeratorHome.setText(o(arcVar4 != null ? Double.valueOf(arcVar4.b) : null));
            }
            TextView secondaryDenominatorHome = getSecondaryDenominatorHome();
            if (secondaryDenominatorHome != null) {
                secondaryDenominatorHome.setText(o(arcVar4 != null ? arcVar4.c : null));
            }
        }
        if (this.j) {
            TextView primaryNumeratorAway = getPrimaryNumeratorAway();
            if (primaryNumeratorAway != null) {
                primaryNumeratorAway.setText(o(Double.valueOf(arcVar2.b)));
            }
            TextView primaryDenominatorAway = getPrimaryDenominatorAway();
            if (primaryDenominatorAway != null) {
                primaryDenominatorAway.setText(o(arcVar2.c));
            }
            TextView secondaryNumeratorAway = getSecondaryNumeratorAway();
            if (secondaryNumeratorAway != null) {
                secondaryNumeratorAway.setText(o(arcVar != null ? Double.valueOf(arcVar.b) : null));
            }
            TextView secondaryDenominatorAway = getSecondaryDenominatorAway();
            if (secondaryDenominatorAway != null) {
                secondaryDenominatorAway.setText(o(arcVar != null ? arcVar.c : null));
            }
        }
    }

    public final void setGroupTag(@Nullable String str) {
        this.e = str;
    }

    public final void setHomeActive(boolean z) {
        this.i = z;
    }

    public void setPercentageDisplay(@NotNull yqc yqcVar) {
        yqcVar.getClass();
        if (this.i) {
            getPrimaryPercentageHome().setText(rei.v(yqcVar.c.a));
            TextView secondaryPercentageHome = getSecondaryPercentageHome();
            if (secondaryPercentageHome != null) {
                arc arcVar = yqcVar.e;
                secondaryPercentageHome.setText(rei.v(arcVar != null ? arcVar.a : 0.0d));
            }
        }
        if (this.j) {
            TextView primaryPercentageAway = getPrimaryPercentageAway();
            if (primaryPercentageAway != null) {
                double d = yqcVar.d.a;
                String format = String.format(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(d)}, 1));
                int a = wzb.a(d);
                if (a == Double.parseDouble(format)) {
                    format = String.valueOf(a);
                }
                primaryPercentageAway.setText(format + "%");
            }
            TextView secondaryPercentageAway = getSecondaryPercentageAway();
            if (secondaryPercentageAway != null) {
                arc arcVar2 = yqcVar.f;
                double d2 = arcVar2 != null ? arcVar2.a : 0.0d;
                String format2 = String.format(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(d2)}, 1));
                int a2 = wzb.a(d2);
                if (a2 == Double.parseDouble(format2)) {
                    format2 = String.valueOf(a2);
                }
                secondaryPercentageAway.setText(format2 + "%");
            }
        }
    }

    public final void setStatisticData(@NotNull yqc yqcVar) {
        e6b b;
        yqcVar.getClass();
        this.t = yqcVar;
        LinkedHashSet linkedHashSet = this.q;
        linkedHashSet.clear();
        if (yqcVar.c.a < 0.10000000149011612d) {
            linkedHashSet.add(crc.a);
        }
        if (yqcVar.d.a < 0.10000000149011612d) {
            linkedHashSet.add(crc.b);
        }
        arc arcVar = yqcVar.e;
        if ((arcVar != null ? arcVar.a : 0.0d) < 0.10000000149011612d) {
            linkedHashSet.add(crc.c);
        }
        arc arcVar2 = yqcVar.f;
        if ((arcVar2 != null ? arcVar2.a : 0.0d) < 0.10000000149011612d) {
            linkedHashSet.add(crc.d);
        }
        t();
        View primaryHighlightHome = getPrimaryHighlightHome();
        int i = this.n;
        if (primaryHighlightHome != null) {
            primaryHighlightHome.setBackgroundTintList(ColorStateList.valueOf(i));
        }
        View secondaryHighlightHome = getSecondaryHighlightHome();
        if (secondaryHighlightHome != null) {
            secondaryHighlightHome.setBackgroundTintList(ColorStateList.valueOf(i));
        }
        View primaryHighlightAway = getPrimaryHighlightAway();
        int i2 = this.p;
        if (primaryHighlightAway != null) {
            primaryHighlightAway.setBackgroundTintList(ColorStateList.valueOf(i2));
        }
        View secondaryHighlightAway = getSecondaryHighlightAway();
        if (secondaryHighlightAway != null) {
            secondaryHighlightAway.setBackgroundTintList(ColorStateList.valueOf(i2));
        }
        ArrayList arrayList = this.r;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Animator) it.next()).cancel();
        }
        arrayList.clear();
        if (this.g == jrc.c && this.f != rrc.a) {
            long j = this.s ? 500L : 0L;
            loc locVar = yqcVar.g;
            int i3 = locVar == null ? -1 : l6.a[locVar.ordinal()];
            if (i3 == 1) {
                n(getPrimaryHighlightHome(), 1.0f, j);
                n(getPrimaryHighlightAway(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, j);
            } else if (i3 != 2) {
                n(getPrimaryHighlightAway(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, j);
                n(getPrimaryHighlightHome(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, j);
            } else {
                n(getPrimaryHighlightAway(), 1.0f, j);
                n(getPrimaryHighlightHome(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, j);
            }
            n(getSecondaryHighlightHome(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, j);
            n(getSecondaryHighlightAway(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, j);
        }
        int ordinal = this.f.ordinal();
        if (ordinal == 0) {
            setPercentageDisplay(yqcVar);
        } else {
            if (ordinal != 1) {
                zzl.b();
                return;
            }
            setFractionalDisplay(yqcVar);
        }
        g6b t = qea.t(this);
        if (t == null || (b = t.b()) == null || b.compareTo(e6b.e) < 0) {
            return;
        }
        l();
    }

    public final void setStatisticsMode(@NotNull jrc jrcVar) {
        jrcVar.getClass();
        this.g = jrcVar;
    }

    public final void setupLayoutTransitions(@NotNull ViewGroup... viewGroupArr) {
        viewGroupArr.getClass();
        for (ViewGroup viewGroup : viewGroupArr) {
            viewGroup.getLayoutTransition().setAnimateParentHierarchy(false);
            viewGroup.getLayoutTransition().enableTransitionType(4);
            viewGroup.getLayoutTransition().setDuration(300L);
        }
    }

    public abstract void t();
}
