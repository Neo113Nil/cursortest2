package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;
import com.sofascore.model.mvvm.model.Gender;
import com.sofascore.results.R;
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
public abstract class r6 extends h6b implements grc {
    public final boolean d;
    public String e;
    public rrc f;
    public Gender g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final LinkedHashSet l;
    public xqc m;
    public final km5 n;
    public final km5 o;
    public final LinearInterpolator p;
    public final c0 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r6(Context context, boolean z) {
        super(context, null, 0);
        context.getClass();
        this.d = z;
        this.f = rrc.a;
        this.h = context.getColor(R.color.n_lv_3);
        this.i = context.getColor(R.color.n_lv_5);
        this.j = context.getColor(R.color.red_fighter_default);
        this.k = context.getColor(R.color.red_fighter_highlight);
        this.l = new LinkedHashSet();
        km5 km5Var = km5.a;
        this.n = km5Var;
        this.o = km5Var;
        this.p = new LinearInterpolator();
        this.q = new c0(6);
    }

    @Override // defpackage.rq4
    public final void e(u6b u6bVar) {
        u6bVar.getClass();
        if (this.m != null) {
            l();
        }
    }

    @NotNull
    public final Gender getBodyGraphGender() {
        Gender gender = this.g;
        if (gender != null) {
            return gender;
        }
        Intrinsics.i("bodyGraphGender");
        throw null;
    }

    public final int getDefaultColor() {
        return this.j;
    }

    @NotNull
    public List<View> getFractionModeOnlyViews() {
        return this.o;
    }

    @Nullable
    public final String getGroupTag() {
        return this.e;
    }

    public final int getHighlightColor() {
        return this.k;
    }

    @NotNull
    public List<View> getPercentageModeOnlyViews() {
        return this.n;
    }

    @Nullable
    public abstract TextView getPrimaryDenominator();

    @Nullable
    public abstract TextView getPrimaryLabel();

    @NotNull
    public abstract TextView getPrimaryNumerator();

    @NotNull
    public abstract TextView getPrimaryPercentage();

    @NotNull
    public Interpolator getProgressAnimationInterpolator() {
        return this.p;
    }

    @Nullable
    public TextView getSecondaryDenominator() {
        return null;
    }

    @Nullable
    public TextView getSecondaryLabel() {
        return null;
    }

    @Nullable
    public TextView getSecondaryNumerator() {
        return null;
    }

    @Nullable
    public TextView getSecondaryPercentage() {
        return null;
    }

    @NotNull
    public Function0<Unit> getTransitionCallback() {
        return this.q;
    }

    public final int getZeroGraphColor() {
        return this.i;
    }

    public final int getZeroValueColor() {
        return this.h;
    }

    @NotNull
    public final Set<crc> getZeroValuesSet() {
        return this.l;
    }

    public abstract void l();

    public final String n(Double d) {
        xqc xqcVar = this.m;
        if (xqcVar != null && xqcVar.e) {
            int doubleValue = d != null ? (int) d.doubleValue() : 0;
            int i = doubleValue / 60;
            return String.format(dla.d(), "%d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i), Integer.valueOf(doubleValue - (i * 60))}, 2));
        }
        double doubleValue2 = d != null ? d.doubleValue() : 0.0d;
        String format = String.format(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(doubleValue2)}, 1));
        int a = wzb.a(doubleValue2);
        return ((double) a) == Double.parseDouble(format) ? String.valueOf(a) : format;
    }

    public final double o(crc crcVar) {
        xqc xqcVar;
        crcVar.getClass();
        int ordinal = crcVar.ordinal();
        Double d = null;
        if (ordinal == 0) {
            xqc xqcVar2 = this.m;
            if (xqcVar2 != null) {
                d = Double.valueOf(xqcVar2.c.a);
            }
        } else if (ordinal == 2 && (xqcVar = this.m) != null) {
            d = Double.valueOf(xqcVar.d.a);
        }
        return llf.a((d != null ? d.doubleValue() : 0.0d) / 100.0d, 0.0d, 1.0d);
    }

    public abstract void p();

    public final void setBodyGraphGender(@NotNull Gender gender) {
        gender.getClass();
        this.g = gender;
    }

    @Override // defpackage.grc
    public void setDisplayMode(@NotNull rrc rrcVar) {
        rrcVar.getClass();
        this.f = rrcVar;
        getTransitionCallback().invoke();
        Iterator<T> it = getPercentageModeOnlyViews().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            View view = (View) it.next();
            if (view != null) {
                view.setVisibility(rrcVar == rrc.a ? 0 : 8);
            }
        }
        for (View view2 : getFractionModeOnlyViews()) {
            if (view2 != null) {
                view2.setVisibility((rrcVar == rrc.b && this.d) ? 0 : 8);
            }
        }
        xqc xqcVar = this.m;
        if (xqcVar != null) {
            setStatisticData(xqcVar);
        }
    }

    public final void setFractionalDisplay(@NotNull xqc xqcVar) {
        xqcVar.getClass();
        TextView primaryNumerator = getPrimaryNumerator();
        arc arcVar = xqcVar.c;
        arc arcVar2 = xqcVar.d;
        primaryNumerator.setText(n(Double.valueOf(arcVar.b)));
        TextView primaryDenominator = getPrimaryDenominator();
        if (primaryDenominator != null) {
            primaryDenominator.setText(n(arcVar.c));
        }
        TextView secondaryNumerator = getSecondaryNumerator();
        if (secondaryNumerator != null) {
            secondaryNumerator.setText(n(Double.valueOf(arcVar2.b)));
        }
        TextView secondaryDenominator = getSecondaryDenominator();
        if (secondaryDenominator != null) {
            secondaryDenominator.setText(n(arcVar2.c));
        }
    }

    public final void setGroupTag(@Nullable String str) {
        this.e = str;
    }

    public void setPercentageDisplay(@NotNull xqc xqcVar) {
        xqcVar.getClass();
        getPrimaryPercentage().setText(rei.v(xqcVar.c.a));
        TextView secondaryPercentage = getSecondaryPercentage();
        if (secondaryPercentage != null) {
            secondaryPercentage.setText(rei.v(xqcVar.d.a));
        }
    }

    public final void setStatisticData(@NotNull xqc xqcVar) {
        e6b b;
        xqcVar.getClass();
        this.m = xqcVar;
        LinkedHashSet linkedHashSet = this.l;
        linkedHashSet.clear();
        if (xqcVar.c.a < 0.10000000149011612d) {
            linkedHashSet.add(crc.a);
        }
        if (xqcVar.d.a < 0.10000000149011612d) {
            linkedHashSet.add(crc.c);
        }
        p();
        int ordinal = this.f.ordinal();
        if (ordinal == 0) {
            setPercentageDisplay(xqcVar);
        } else {
            if (ordinal != 1) {
                zzl.b();
                return;
            }
            setFractionalDisplay(xqcVar);
        }
        g6b t = qea.t(this);
        if (t == null || (b = t.b()) == null || b.compareTo(e6b.e) < 0) {
            return;
        }
        l();
    }

    public final void setupLayoutTransitions(@NotNull ViewGroup... viewGroupArr) {
        viewGroupArr.getClass();
        for (ViewGroup viewGroup : viewGroupArr) {
            viewGroup.getLayoutTransition().setAnimateParentHierarchy(false);
            viewGroup.getLayoutTransition().enableTransitionType(4);
            viewGroup.getLayoutTransition().setDuration(300L);
        }
    }
}
