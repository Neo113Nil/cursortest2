package defpackage;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.app.NotificationCompat;
import com.sofascore.model.network.response.EventStatisticsItem;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class kb6 extends p8 implements ViewTreeObserver.OnPreDrawListener {
    public final nr1 c;
    public final String d;
    public final bb6 e;
    public final int f;
    public final /* synthetic */ nb6 g;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public kb6(nb6 nb6Var, nr1 nr1Var, String str, bb6 bb6Var) {
        super(r1);
        str.getClass();
        this.g = nb6Var;
        ConstraintLayout constraintLayout = (ConstraintLayout) nr1Var.c;
        constraintLayout.getClass();
        this.c = nr1Var;
        this.d = str;
        this.e = bb6Var;
        this.f = ao2.s(8, this.b);
        d((hrc) nr1Var.i);
        d((hrc) nr1Var.h);
        constraintLayout.getViewTreeObserver().addOnPreDrawListener(this);
    }

    public static void d(hrc hrcVar) {
        ConstraintLayout constraintLayout = hrcVar.a;
        TextView textView = hrcVar.d;
        constraintLayout.setLayoutTransition(null);
        constraintLayout.setMinWidth(0);
        View view = hrcVar.e;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            yhk.s("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            return;
        }
        tl3 tl3Var = (tl3) layoutParams;
        tl3Var.N = 0;
        view.setLayoutParams(tl3Var);
        textView.setPaddingRelative(0, textView.getPaddingTop(), 0, textView.getPaddingBottom());
        ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
        if (layoutParams2 == null) {
            yhk.s("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            return;
        }
        tl3 tl3Var2 = (tl3) layoutParams2;
        tl3Var2.N = 0;
        textView.setLayoutParams(tl3Var2);
    }

    public static void h(ProgressBar progressBar, int i) {
        ObjectAnimator ofInt = ObjectAnimator.ofInt(progressBar, NotificationCompat.CATEGORY_PROGRESS, progressBar.getProgress(), i);
        ofInt.setDuration(200L);
        ofInt.start();
    }

    @Override // defpackage.p8
    public final void b(int i, int i2, Object obj) {
        int compare;
        String home$default;
        String away$default;
        String Q;
        EventStatisticsItem eventStatisticsItem = (EventStatisticsItem) obj;
        eventStatisticsItem.getClass();
        if (eventStatisticsItem.getHasTeamValueType()) {
            double homeValue$default = EventStatisticsItem.getHomeValue$default(eventStatisticsItem, null, 1, null);
            Double homeTotal$default = EventStatisticsItem.getHomeTotal$default(eventStatisticsItem, null, 1, null);
            double doubleValue = homeTotal$default != null ? homeTotal$default.doubleValue() : 0.0d;
            double d = Double.compare(doubleValue, 0.0d) == 0 ? 0.0d : homeValue$default / doubleValue;
            double awayValue$default = EventStatisticsItem.getAwayValue$default(eventStatisticsItem, null, 1, null);
            Double awayTotal$default = EventStatisticsItem.getAwayTotal$default(eventStatisticsItem, null, 1, null);
            double doubleValue2 = awayTotal$default != null ? awayTotal$default.doubleValue() : 0.0d;
            compare = Double.compare(d, Double.compare(doubleValue2, 0.0d) == 0 ? 0.0d : awayValue$default / doubleValue2);
        } else {
            compare = Double.compare(EventStatisticsItem.getHomeValue$default(eventStatisticsItem, null, 1, null), EventStatisticsItem.getAwayValue$default(eventStatisticsItem, null, 1, null));
        }
        boolean isNegativeStatistic = eventStatisticsItem.isNegativeStatistic();
        boolean z = (compare >= 0) ^ isNegativeStatistic;
        Context context = this.b;
        int color = z ? context.getColor(R.color.home_primary) : context.getColor(R.color.home_primary_highlight);
        int color2 = (compare <= 0) ^ isNegativeStatistic ? context.getColor(R.color.away_primary) : context.getColor(R.color.away_primary_highlight);
        nr1 nr1Var = this.c;
        ProgressBar progressBar = (ProgressBar) nr1Var.g;
        ConstraintLayout constraintLayout = (ConstraintLayout) nr1Var.c;
        TextView textView = nr1Var.b;
        ProgressBar progressBar2 = (ProgressBar) nr1Var.f;
        e(progressBar, color);
        e(progressBar2, color2);
        EventStatisticsItem.SpecialEventStatisticType specialStatisticType = eventStatisticsItem.getSpecialStatisticType();
        boolean z2 = this.g.m;
        if (z2) {
            specialStatisticType = null;
        }
        int i3 = specialStatisticType == null ? -1 : jb6.a[specialStatisticType.ordinal()];
        if (i3 == 1) {
            String string = context.getString(R.string.football_expected_goals);
            string.getClass();
            String string2 = context.getString(R.string.expected_goals_info_text);
            string2.getClass();
            f(string, string2);
        } else if (i3 == 2) {
            String string3 = context.getString(R.string.football_expected_goals_on_target);
            string3.getClass();
            String string4 = context.getString(R.string.football_expected_goals_on_target_explained);
            string4.getClass();
            f(string3, string4);
        } else if (i3 != 3) {
            haa.C(textView);
            textView.setCompoundDrawablesRelative(null, null, null, null);
            constraintLayout.setEnabled(false);
        } else {
            String string5 = context.getString(R.string.football_goals_prevented);
            string5.getClass();
            Q = hkg.Q(context, R.string.goals_prevented_info_text, null, new Object[0]);
            f(string5, Q);
        }
        if (eventStatisticsItem.getSpecialStatisticType() == EventStatisticsItem.SpecialEventStatisticType.AverageShotDistance) {
            home$default = v7a.r(context, EventStatisticsItem.getHomeValue$default(eventStatisticsItem, null, 1, null));
            away$default = v7a.r(context, EventStatisticsItem.getAwayValue$default(eventStatisticsItem, null, 1, null));
        } else {
            home$default = EventStatisticsItem.getHome$default(eventStatisticsItem, null, 1, null);
            away$default = EventStatisticsItem.getAway$default(eventStatisticsItem, null, 1, null);
        }
        hrc hrcVar = (hrc) nr1Var.h;
        hrc hrcVar2 = (hrc) nr1Var.i;
        constraintLayout.setBackgroundColor(context.getColor(R.color.surface_1));
        progressBar.setMax(1000);
        TextView textView2 = hrcVar2.d;
        haa.C(textView2);
        textView2.setLayoutDirection(0);
        textView2.setText(home$default);
        progressBar2.setMax(1000);
        TextView textView3 = hrcVar.d;
        haa.C(textView3);
        textView3.setLayoutDirection(0);
        textView3.setText(away$default);
        textView.setText(yaa.D(context, eventStatisticsItem.getName(), this.d));
        if (eventStatisticsItem.getHasTeamValueType()) {
            double absoluteAwayValue$default = EventStatisticsItem.getAbsoluteAwayValue$default(eventStatisticsItem, null, 1, null);
            Double awayTotal$default2 = EventStatisticsItem.getAwayTotal$default(eventStatisticsItem, null, 1, null);
            double doubleValue3 = awayTotal$default2 != null ? awayTotal$default2.doubleValue() : 0.0d;
            g(Double.compare(doubleValue3, 0.0d) == 0 ? 0.0d : absoluteAwayValue$default / doubleValue3, false);
            double absoluteHomeValue$default = EventStatisticsItem.getAbsoluteHomeValue$default(eventStatisticsItem, null, 1, null);
            Double homeTotal$default2 = EventStatisticsItem.getHomeTotal$default(eventStatisticsItem, null, 1, null);
            double doubleValue4 = homeTotal$default2 != null ? homeTotal$default2.doubleValue() : 0.0d;
            g(Double.compare(doubleValue4, 0.0d) == 0 ? 0.0d : absoluteHomeValue$default / doubleValue4, true);
        } else {
            double absoluteHomeValue$default2 = EventStatisticsItem.getAbsoluteHomeValue$default(eventStatisticsItem, null, 1, null);
            double absoluteAwayValue$default2 = EventStatisticsItem.getAbsoluteAwayValue$default(eventStatisticsItem, null, 1, null);
            double d2 = absoluteHomeValue$default2 + absoluteAwayValue$default2;
            int i4 = (int) ((absoluteHomeValue$default2 / d2) * 1000.0d);
            int i5 = (int) ((absoluteAwayValue$default2 / d2) * 1000.0d);
            if (!((Boolean) this.e.invoke()).booleanValue() || z2) {
                progressBar.setProgress(i4);
                progressBar2.setProgress(i5);
            } else {
                h(progressBar, i4);
                h(progressBar2, i5);
            }
        }
        sea.v(constraintLayout, eventStatisticsItem.getRoundTop() || (z2 && i == 0), eventStatisticsItem.getRoundBottom(), 0, 4, 0, null, Sdk.SDKError.Reason.GZIP_ENCODE_ERROR_VALUE);
        boolean roundTop = eventStatisticsItem.getRoundTop();
        int i6 = this.f;
        constraintLayout.setPaddingRelative(constraintLayout.getPaddingStart(), roundTop ? i6 : 0, constraintLayout.getPaddingEnd(), eventStatisticsItem.getRoundBottom() ? i6 : 0);
        ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
        if (layoutParams == null) {
            yhk.s("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int i7 = z2 ? 0 : i6;
        int i8 = z2 ? 0 : i6;
        int i9 = marginLayoutParams.topMargin;
        int i10 = marginLayoutParams.bottomMargin;
        marginLayoutParams.setMarginStart(i7);
        marginLayoutParams.topMargin = i9;
        marginLayoutParams.setMarginEnd(i8);
        marginLayoutParams.bottomMargin = i10;
        constraintLayout.setLayoutParams(marginLayoutParams);
    }

    public final void e(ProgressBar progressBar, int i) {
        int defaultColor;
        if (!((Boolean) this.e.invoke()).booleanValue() || this.g.m) {
            progressBar.setProgressTintList(ColorStateList.valueOf(i));
            return;
        }
        ColorStateList progressTintList = progressBar.getProgressTintList();
        if (progressTintList == null || (defaultColor = progressTintList.getDefaultColor()) == i) {
            return;
        }
        ArgbEvaluator argbEvaluator = new ArgbEvaluator();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        ofFloat.setDuration(200L);
        ofFloat.addUpdateListener(new fb6(argbEvaluator, defaultColor, i, progressBar, 1));
        ofFloat.start();
    }

    public final void f(String str, String str2) {
        Drawable drawable;
        nr1 nr1Var = this.c;
        TextView textView = nr1Var.b;
        TextView textView2 = nr1Var.b;
        haa.G(textView);
        ConstraintLayout constraintLayout = (ConstraintLayout) nr1Var.c;
        constraintLayout.getClass();
        aba.y(constraintLayout, 0, 3);
        constraintLayout.setEnabled(true);
        constraintLayout.setOnClickListener(new qh(16, this, str, str2));
        Context context = this.b;
        int s = ao2.s(16, context);
        Drawable drawable2 = context.getDrawable(R.drawable.ic_indicator_info_16);
        if (drawable2 == null || (drawable = drawable2.mutate()) == null) {
            drawable = null;
        } else {
            drawable.setTint(context.getColor(R.color.primary_default));
            drawable.setBounds(0, 0, s, s);
        }
        haa.K(textView2, drawable, ua5.b, null, null);
        textView2.setCompoundDrawablePadding(ao2.s(4, context));
    }

    public final void g(double d, boolean z) {
        nr1 nr1Var = this.c;
        ProgressBar progressBar = (ProgressBar) (z ? nr1Var.g : nr1Var.f);
        if (!((Boolean) this.e.invoke()).booleanValue() || this.g.m) {
            progressBar.setProgress((int) (d * 1000.0d));
        } else {
            h(progressBar, (int) (d * 1000.0d));
        }
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        nr1 nr1Var = this.c;
        int max = Math.max(((hrc) nr1Var.i).a.getWidth(), ((hrc) nr1Var.h).a.getWidth());
        ((Guideline) nr1Var.e).setGuidelineBegin(max);
        ((Guideline) nr1Var.d).setGuidelineEnd(max);
        return true;
    }
}
