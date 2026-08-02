package defpackage;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.sofascore.model.network.response.EventStatisticsItem;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.text.NumberFormat;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class hb6 extends p8 {
    public final String c;
    public final Function0 d;
    public final NumberFormat e;
    public final /* synthetic */ nb6 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hb6(nb6 nb6Var, View view, String str, Function0 function0) {
        super(view);
        view.getClass();
        str.getClass();
        this.f = nb6Var;
        this.c = str;
        this.d = function0;
        NumberFormat numberFormat = NumberFormat.getInstance(dla.d());
        numberFormat.setMaximumFractionDigits(2);
        this.e = numberFormat;
    }

    public static void o(CircularProgressIndicator circularProgressIndicator, int i) {
        ObjectAnimator ofInt = ObjectAnimator.ofInt(circularProgressIndicator, NotificationCompat.CATEGORY_PROGRESS, circularProgressIndicator.getProgress(), i);
        ofInt.setDuration(200L);
        ofInt.start();
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0225  */
    @Override // defpackage.p8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(int i, int i2, Object obj) {
        int compare;
        String str;
        String str2;
        Double awayTotal$default;
        String Q;
        EventStatisticsItem eventStatisticsItem = (EventStatisticsItem) obj;
        int i3 = 0;
        eventStatisticsItem.getClass();
        if (eventStatisticsItem.getHasTeamValueType()) {
            double homeValue$default = EventStatisticsItem.getHomeValue$default(eventStatisticsItem, null, 1, null);
            Double homeTotal$default = EventStatisticsItem.getHomeTotal$default(eventStatisticsItem, null, 1, null);
            double doubleValue = homeTotal$default != null ? homeTotal$default.doubleValue() : 0.0d;
            double d = Double.compare(doubleValue, 0.0d) == 0 ? 0.0d : homeValue$default / doubleValue;
            double awayValue$default = EventStatisticsItem.getAwayValue$default(eventStatisticsItem, null, 1, null);
            Double awayTotal$default2 = EventStatisticsItem.getAwayTotal$default(eventStatisticsItem, null, 1, null);
            double doubleValue2 = awayTotal$default2 != null ? awayTotal$default2.doubleValue() : 0.0d;
            compare = Double.compare(d, Double.compare(doubleValue2, 0.0d) == 0 ? 0.0d : awayValue$default / doubleValue2);
        } else {
            compare = Double.compare(EventStatisticsItem.getHomeValue$default(eventStatisticsItem, null, 1, null), EventStatisticsItem.getAwayValue$default(eventStatisticsItem, null, 1, null));
        }
        boolean isNegativeStatistic = eventStatisticsItem.isNegativeStatistic();
        boolean z = (compare >= 0) ^ isNegativeStatistic;
        Context context = this.b;
        int color = z ? context.getColor(R.color.home_primary) : context.getColor(R.color.home_primary_highlight);
        int color2 = (compare <= 0) ^ isNegativeStatistic ? context.getColor(R.color.away_primary) : context.getColor(R.color.away_primary_highlight);
        l(i(), color);
        l(h(), color2);
        EventStatisticsItem.SpecialEventStatisticType specialStatisticType = eventStatisticsItem.getSpecialStatisticType();
        boolean z2 = this.f.m;
        if (z2) {
            specialStatisticType = null;
        }
        int i4 = specialStatisticType == null ? -1 : gb6.a[specialStatisticType.ordinal()];
        if (i4 == 1) {
            String string = context.getString(R.string.football_expected_goals);
            string.getClass();
            String string2 = context.getString(R.string.expected_goals_info_text);
            string2.getClass();
            m(string, string2);
        } else if (i4 == 2) {
            String string3 = context.getString(R.string.football_expected_goals_on_target);
            string3.getClass();
            String string4 = context.getString(R.string.football_expected_goals_on_target_explained);
            string4.getClass();
            m(string3, string4);
        } else if (i4 != 3) {
            d().setBackgroundTintList(ColorStateList.valueOf(context.getColor(R.color.surface_1)));
            haa.C(e());
            e().setCompoundDrawablesRelative(null, null, null, null);
            this.itemView.setEnabled(false);
        } else {
            String string5 = context.getString(R.string.football_goals_prevented);
            string5.getClass();
            Q = hkg.Q(context, R.string.goals_prevented_info_text, null, new Object[0]);
            m(string5, Q);
        }
        i().setMax(1000);
        h().setMax(1000);
        e().setText(yaa.D(context, eventStatisticsItem.getName(), this.c));
        boolean hasTeamValueType = eventStatisticsItem.getHasTeamValueType();
        str = "-";
        NumberFormat numberFormat = this.e;
        if (hasTeamValueType) {
            String format = numberFormat.format(EventStatisticsItem.getHomeValue$default(eventStatisticsItem, null, 1, null));
            Object homeTotal$default2 = EventStatisticsItem.getHomeTotal$default(eventStatisticsItem, null, 1, null);
            if (homeTotal$default2 == null) {
                homeTotal$default2 = r3;
            }
            String format2 = numberFormat.format(homeTotal$default2);
            TextView k = k();
            if (k != null) {
                k.setText(format + "/\u200b" + format2);
            }
            String format3 = numberFormat.format(EventStatisticsItem.getAwayValue$default(eventStatisticsItem, null, 1, null));
            Object awayTotal$default3 = EventStatisticsItem.getAwayTotal$default(eventStatisticsItem, null, 1, null);
            String format4 = numberFormat.format(awayTotal$default3 != null ? awayTotal$default3 : 0);
            TextView j = j();
            if (j != null) {
                j.setText(format3 + "/\u200b" + format4);
            }
            Double homeTotal$default3 = EventStatisticsItem.getHomeTotal$default(eventStatisticsItem, null, 1, null);
            if (homeTotal$default3 != null) {
                if (homeTotal$default3.doubleValue() <= 0.01d) {
                    homeTotal$default3 = null;
                }
                if (homeTotal$default3 != null) {
                    str2 = mz1.i(wzb.a((EventStatisticsItem.getHomeValue$default(eventStatisticsItem, null, 1, null) / homeTotal$default3.doubleValue()) * 100.0d), "%");
                    g().setText(str2);
                    awayTotal$default = EventStatisticsItem.getAwayTotal$default(eventStatisticsItem, null, 1, null);
                    if (awayTotal$default != null) {
                        if (awayTotal$default.doubleValue() <= 0.01d) {
                            awayTotal$default = null;
                        }
                        if (awayTotal$default != null) {
                            str = mz1.i(wzb.a((EventStatisticsItem.getAwayValue$default(eventStatisticsItem, null, 1, null) / awayTotal$default.doubleValue()) * 100.0d), "%");
                        }
                    }
                    f().setText(str);
                    double absoluteAwayValue$default = EventStatisticsItem.getAbsoluteAwayValue$default(eventStatisticsItem, null, 1, null);
                    Double awayTotal$default4 = EventStatisticsItem.getAwayTotal$default(eventStatisticsItem, null, 1, null);
                    double doubleValue3 = awayTotal$default4 == null ? awayTotal$default4.doubleValue() : 0.0d;
                    double d2 = Double.compare(doubleValue3, 0.0d) != 0 ? 0.0d : absoluteAwayValue$default / doubleValue3;
                    i3 = 0;
                    n(d2, false);
                    double absoluteHomeValue$default = EventStatisticsItem.getAbsoluteHomeValue$default(eventStatisticsItem, null, 1, null);
                    Double homeTotal$default4 = EventStatisticsItem.getHomeTotal$default(eventStatisticsItem, null, 1, null);
                    double doubleValue4 = homeTotal$default4 == null ? homeTotal$default4.doubleValue() : 0.0d;
                    n(Double.compare(doubleValue4, 0.0d) != 0 ? absoluteHomeValue$default / doubleValue4 : 0.0d, true);
                }
            }
            str2 = "-";
            g().setText(str2);
            awayTotal$default = EventStatisticsItem.getAwayTotal$default(eventStatisticsItem, null, 1, null);
            if (awayTotal$default != null) {
            }
            f().setText(str);
            double absoluteAwayValue$default2 = EventStatisticsItem.getAbsoluteAwayValue$default(eventStatisticsItem, null, 1, null);
            Double awayTotal$default42 = EventStatisticsItem.getAwayTotal$default(eventStatisticsItem, null, 1, null);
            if (awayTotal$default42 == null) {
            }
            if (Double.compare(doubleValue3, 0.0d) != 0) {
            }
            i3 = 0;
            n(d2, false);
            double absoluteHomeValue$default2 = EventStatisticsItem.getAbsoluteHomeValue$default(eventStatisticsItem, null, 1, null);
            Double homeTotal$default42 = EventStatisticsItem.getHomeTotal$default(eventStatisticsItem, null, 1, null);
            if (homeTotal$default42 == null) {
            }
            n(Double.compare(doubleValue4, 0.0d) != 0 ? absoluteHomeValue$default2 / doubleValue4 : 0.0d, true);
        } else {
            TextView k2 = k();
            if (k2 != null) {
                k2.setText(numberFormat.format(EventStatisticsItem.getHomeValue$default(eventStatisticsItem, null, 1, null)));
            }
            TextView j2 = j();
            if (j2 != null) {
                j2.setText(numberFormat.format(EventStatisticsItem.getAwayValue$default(eventStatisticsItem, null, 1, null)));
            }
            double absoluteAwayValue$default3 = EventStatisticsItem.getAbsoluteAwayValue$default(eventStatisticsItem, null, 1, null) + EventStatisticsItem.getAbsoluteHomeValue$default(eventStatisticsItem, null, 1, null);
            double absoluteHomeValue$default3 = (EventStatisticsItem.getAbsoluteHomeValue$default(eventStatisticsItem, null, 1, null) / absoluteAwayValue$default3) * 100.0d;
            Double valueOf = Double.valueOf(absoluteHomeValue$default3);
            if (Double.isNaN(absoluteHomeValue$default3)) {
                valueOf = null;
            }
            g().setText(valueOf != null ? mz1.i(wzb.a(valueOf.doubleValue()), "%") : "-");
            double absoluteAwayValue$default4 = (EventStatisticsItem.getAbsoluteAwayValue$default(eventStatisticsItem, null, 1, null) / absoluteAwayValue$default3) * 100.0d;
            Double valueOf2 = Double.valueOf(absoluteAwayValue$default4);
            if (Double.isNaN(absoluteAwayValue$default4)) {
                valueOf2 = null;
            }
            f().setText(valueOf2 != null ? mz1.i(wzb.a(valueOf2.doubleValue()), "%") : "-");
            double absoluteHomeValue$default4 = EventStatisticsItem.getAbsoluteHomeValue$default(eventStatisticsItem, null, 1, null);
            double absoluteAwayValue$default5 = EventStatisticsItem.getAbsoluteAwayValue$default(eventStatisticsItem, null, 1, null);
            double d3 = absoluteHomeValue$default4 + absoluteAwayValue$default5;
            int i5 = (int) ((absoluteHomeValue$default4 / d3) * 1000.0d);
            int i6 = (int) ((absoluteAwayValue$default5 / d3) * 1000.0d);
            if (!((Boolean) this.d.invoke()).booleanValue() || z2) {
                i().setProgress(i5);
                h().setProgress(i6);
            } else {
                o(i(), i5);
                o(h(), i6);
            }
        }
        sea.v(d(), eventStatisticsItem.getRoundTop(), eventStatisticsItem.getRoundBottom(), 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
        ConstraintLayout d4 = d();
        ViewGroup.LayoutParams layoutParams = d4.getLayoutParams();
        if (layoutParams == null) {
            yhk.s("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int s = z2 ? i3 : ao2.s(8, context);
        if (!z2) {
            i3 = ao2.s(8, context);
        }
        int i7 = marginLayoutParams.topMargin;
        int i8 = marginLayoutParams.bottomMargin;
        marginLayoutParams.setMarginStart(s);
        marginLayoutParams.topMargin = i7;
        marginLayoutParams.setMarginEnd(i3);
        marginLayoutParams.bottomMargin = i8;
        d4.setLayoutParams(marginLayoutParams);
    }

    public abstract ConstraintLayout d();

    public abstract TextView e();

    public abstract TextView f();

    public abstract TextView g();

    public abstract CircularProgressIndicator h();

    public abstract CircularProgressIndicator i();

    public abstract TextView j();

    public abstract TextView k();

    public final void l(CircularProgressIndicator circularProgressIndicator, int i) {
        int intValue;
        if (!((Boolean) this.d.invoke()).booleanValue() || this.f.m) {
            circularProgressIndicator.setIndicatorColor(i);
            return;
        }
        int[] indicatorColor = circularProgressIndicator.getIndicatorColor();
        indicatorColor.getClass();
        Integer valueOf = indicatorColor.length == 0 ? null : Integer.valueOf(indicatorColor[0]);
        if (valueOf == null || (intValue = valueOf.intValue()) == i) {
            return;
        }
        ArgbEvaluator argbEvaluator = new ArgbEvaluator();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        ofFloat.setDuration(200L);
        ofFloat.addUpdateListener(new fb6(argbEvaluator, intValue, i, circularProgressIndicator, 0));
        ofFloat.start();
    }

    public final void m(String str, String str2) {
        Drawable drawable;
        haa.G(e());
        View view = this.itemView;
        view.getClass();
        aba.y(view, 0, 3);
        this.itemView.setEnabled(true);
        this.itemView.setOnClickListener(new qh(15, this, str, str2));
        Context context = this.b;
        int s = ao2.s(16, context);
        Drawable drawable2 = context.getDrawable(R.drawable.ic_indicator_info_16);
        if (drawable2 == null || (drawable = drawable2.mutate()) == null) {
            drawable = null;
        } else {
            drawable.setTint(context.getColor(R.color.primary_default));
            drawable.setBounds(0, 0, s, s);
        }
        TextView e = e();
        ua5 ua5Var = ua5.b;
        e.getClass();
        haa.K(e, drawable, ua5Var, null, null);
        e().setCompoundDrawablePadding(ao2.s(4, context));
    }

    public final void n(double d, boolean z) {
        CircularProgressIndicator i = z ? i() : h();
        if (!((Boolean) this.d.invoke()).booleanValue() || this.f.m) {
            i.setProgress((int) (d * 1000.0d));
        } else {
            o(i, (int) (d * 1000.0d));
        }
    }
}
