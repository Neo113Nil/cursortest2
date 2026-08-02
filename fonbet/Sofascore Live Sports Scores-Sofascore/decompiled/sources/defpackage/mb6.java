package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.app.NotificationCompat;
import com.sofascore.model.network.response.EventStatisticsItem;
import com.sofascore.results.R;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class mb6 extends p8 implements ViewTreeObserver.OnPreDrawListener {
    public final v82 c;
    public final String d;
    public final bb6 e;
    public final /* synthetic */ nb6 f;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public mb6(nb6 nb6Var, v82 v82Var, String str, bb6 bb6Var) {
        super(r1);
        str.getClass();
        this.f = nb6Var;
        ConstraintLayout constraintLayout = (ConstraintLayout) v82Var.b;
        constraintLayout.getClass();
        this.c = v82Var;
        this.d = str;
        this.e = bb6Var;
    }

    @Override // defpackage.p8
    public final void b(int i, int i2, Object obj) {
        EventStatisticsItem eventStatisticsItem = (EventStatisticsItem) obj;
        boolean z = this.f.m;
        eventStatisticsItem.getClass();
        double homeValue$default = EventStatisticsItem.getHomeValue$default(eventStatisticsItem, null, 1, null);
        double awayValue$default = EventStatisticsItem.getAwayValue$default(eventStatisticsItem, null, 1, null) + homeValue$default;
        int compare = Double.compare(awayValue$default, 0.0d);
        v82 v82Var = this.c;
        ProgressBar progressBar = (ProgressBar) v82Var.f;
        Context context = this.b;
        if (compare == 0) {
            progressBar.setProgressTintList(ColorStateList.valueOf(0));
            progressBar.setBackgroundTintList(eq3.q(R.color.n_lv_5, context));
        } else {
            progressBar.setProgressTintList(eq3.q(R.color.home_primary, context));
            progressBar.setBackgroundTintList(eq3.q(R.color.away_primary, context));
            progressBar.setMax(wzb.a(awayValue$default) * 20);
            if (!((Boolean) this.e.invoke()).booleanValue() || z) {
                progressBar.setProgress(wzb.a(homeValue$default) * 20);
            } else {
                ObjectAnimator ofInt = ObjectAnimator.ofInt(progressBar, NotificationCompat.CATEGORY_PROGRESS, progressBar.getProgress(), wzb.a(homeValue$default) * 20);
                ofInt.setDuration(200L);
                ofInt.start();
            }
        }
        TextView textView = (TextView) v82Var.g;
        ConstraintLayout constraintLayout = (ConstraintLayout) v82Var.b;
        TextView textView2 = (TextView) v82Var.d;
        textView.setText(EventStatisticsItem.getHome$default(eventStatisticsItem, null, 1, null));
        ((TextView) v82Var.e).setText(EventStatisticsItem.getAway$default(eventStatisticsItem, null, 1, null));
        textView2.setText(yaa.D(context, eventStatisticsItem.getName(), this.d));
        EventStatisticsItem.SpecialEventStatisticType specialStatisticType = eventStatisticsItem.getSpecialStatisticType();
        if (z) {
            specialStatisticType = null;
        }
        int i3 = specialStatisticType == null ? -1 : lb6.a[specialStatisticType.ordinal()];
        if (i3 == 1) {
            String string = context.getString(R.string.hockey_corsi_percentage);
            string.getClass();
            String string2 = context.getString(R.string.hockey_corsi_percentage_info);
            string2.getClass();
            d(string, string2);
        } else if (i3 != 2) {
            haa.C(textView2);
            textView2.setCompoundDrawablesRelative(null, null, null, null);
            constraintLayout.setEnabled(false);
            constraintLayout.setOnClickListener(null);
        } else {
            String string3 = context.getString(R.string.hockey_fenwick_percentage);
            string3.getClass();
            String string4 = context.getString(R.string.hockey_fenwick_percentage_info);
            string4.getClass();
            d(string3, string4);
        }
        constraintLayout.getClass();
        sea.v(constraintLayout, eventStatisticsItem.getRoundTop() || (z && i == 0), eventStatisticsItem.getRoundBottom(), 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
        ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
        if (layoutParams == null) {
            yhk.s("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int s = z ? 0 : ao2.s(8, context);
        int s2 = z ? 0 : ao2.s(8, context);
        int i4 = marginLayoutParams.topMargin;
        int i5 = marginLayoutParams.bottomMargin;
        marginLayoutParams.setMarginStart(s);
        marginLayoutParams.topMargin = i4;
        marginLayoutParams.setMarginEnd(s2);
        marginLayoutParams.bottomMargin = i5;
        constraintLayout.setLayoutParams(marginLayoutParams);
    }

    public final void d(String str, String str2) {
        Drawable drawable;
        v82 v82Var = this.c;
        TextView textView = (TextView) v82Var.d;
        haa.G(textView);
        ConstraintLayout constraintLayout = (ConstraintLayout) v82Var.b;
        constraintLayout.getClass();
        aba.y(constraintLayout, 0, 3);
        constraintLayout.setEnabled(true);
        z8e.a0(constraintLayout, 1000L, new mi(23, this, str, str2));
        Context context = this.b;
        int s = ao2.s(16, context);
        Drawable drawable2 = context.getDrawable(R.drawable.ic_indicator_info_16);
        if (drawable2 == null || (drawable = drawable2.mutate()) == null) {
            drawable = null;
        } else {
            drawable.setTint(context.getColor(R.color.primary_default));
            drawable.setBounds(0, 0, s, s);
        }
        haa.K(textView, drawable, ua5.b, null, null);
        textView.setCompoundDrawablePadding(ao2.s(4, context));
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        v82 v82Var = this.c;
        int max = Math.max(((TextView) v82Var.g).getWidth(), ((TextView) v82Var.e).getWidth());
        ((Guideline) v82Var.c).setGuidelineBegin(max);
        ((Guideline) v82Var.h).setGuidelineEnd(max);
        return true;
    }
}
