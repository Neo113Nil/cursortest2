package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.icu.text.DateTimePatternGenerator;
import android.text.format.DateFormat;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.model.Colors;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.model.odds.FeaturedOddsWithProvider;
import com.sofascore.model.odds.OddsChoice;
import com.sofascore.model.odds.OddsCountryProvider;
import com.sofascore.model.odds.OddsProvider;
import com.sofascore.model.odds.ProviderOdds;
import com.sofascore.results.R;
import com.sofascore.results.view.BellButton;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class wd6 extends p8 {
    public static final /* synthetic */ int i = 0;
    public final js2 c;
    public final u6b d;
    public final int e;
    public final int f;
    public final int g;
    public g9i h;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public wd6(js2 js2Var, u6b u6bVar) {
        super(r0);
        ConstraintLayout constraintLayout = (ConstraintLayout) js2Var.i;
        constraintLayout.getClass();
        this.c = js2Var;
        this.d = u6bVar;
        this.e = this.b.getColor(R.color.n_lv_1);
        this.f = this.b.getColor(R.color.n_lv_3);
        this.g = this.b.getColor(R.color.live);
        constraintLayout.getClass();
        aba.y(constraintLayout, 0, 3);
        constraintLayout.setClipToOutline(true);
        v82 v82Var = (v82) js2Var.k;
        ((TextView) v82Var.h).setVisibility(0);
        pu1[] pu1VarArr = {(pu1) v82Var.c, (pu1) v82Var.f, (pu1) v82Var.g};
        for (int i2 = 0; i2 < 3; i2++) {
            z8e.V(this.itemView.getContext().getColor(R.color.surface_2), pu1VarArr[i2].b);
        }
    }

    @Override // defpackage.p8
    public final void a(Object obj) {
        obj.getClass();
        if (obj instanceof scb) {
            inb.o((BellButton) this.c.j, (scb) obj);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x0277, code lost:
    
        if (r1.equals(r18) == false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x02a7, code lost:
    
        r6.setVisibility(0);
        r6.setText(defpackage.afi.c(r10, r3.getStatusDescription(), defpackage.ok3.s(r3), true));
        r1 = java.lang.Integer.valueOf(r4);
        r5 = com.sofascore.model.mvvm.model.Event.getHomeScore$default(r3, null, 1, null).getDisplay();
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x02c7, code lost:
    
        if (r5 == null) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x02c9, code lost:
    
        r5 = r5.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x02cf, code lost:
    
        r2 = com.sofascore.model.mvvm.model.Event.getAwayScore$default(r3, null, 1, null).getDisplay();
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x02d7, code lost:
    
        if (r2 == null) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x02d9, code lost:
    
        r2 = r2.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x02df, code lost:
    
        if (r5 <= r2) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x02e2, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x02e3, code lost:
    
        if (r1 == null) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x02e5, code lost:
    
        r1 = r1.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x02eb, code lost:
    
        r15.setTextColor(r1);
        r1 = java.lang.Integer.valueOf(r4);
        r2 = null;
        r5 = com.sofascore.model.mvvm.model.Event.getHomeScore$default(r3, null, 1, null).getDisplay();
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x02fc, code lost:
    
        if (r5 == null) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x02fe, code lost:
    
        r5 = r5.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0304, code lost:
    
        r3 = com.sofascore.model.mvvm.model.Event.getAwayScore$default(r3, null, 1, null).getDisplay();
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x030c, code lost:
    
        if (r3 == null) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x030e, code lost:
    
        r3 = r3.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0314, code lost:
    
        if (r5 >= r3) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0317, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0318, code lost:
    
        if (r1 == null) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x031a, code lost:
    
        r1 = r1.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0320, code lost:
    
        r14.setTextColor(r1);
        r7.setTextColor(r8);
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x031f, code lost:
    
        r1 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0313, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0303, code lost:
    
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x02ea, code lost:
    
        r1 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x02de, code lost:
    
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x02ce, code lost:
    
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0283, code lost:
    
        if (r1.equals(com.sofascore.model.mvvm.model.StatusKt.STATUS_INTERRUPTED) == false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x017e, code lost:
    
        if (r1.equals(com.sofascore.model.mvvm.model.StatusKt.STATUS_POSTPONED) == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0195, code lost:
    
        r6.setVisibility(0);
        r6.setText(defpackage.afi.c(r10, r3.getStatusDescription(), defpackage.ok3.s(r3), true));
        r6 = r3.getStartTimestamp();
        r1 = defpackage.hk4.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01b4, code lost:
    
        if (android.text.format.DateFormat.is24HourFormat(r10) == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01b6, code lost:
    
        r1 = r1.getBestPattern("Hm");
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01bf, code lost:
    
        r1.getClass();
        defpackage.fn0.u(r6, defpackage.hk4.a(r1), r5);
        r1 = r1;
        r2 = null;
        r9 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01bb, code lost:
    
        r1 = r1.getBestPattern("hm");
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0187, code lost:
    
        if (r1.equals(com.sofascore.model.mvvm.model.StatusKt.STATUS_WILL_CONTINUE) == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01d6, code lost:
    
        r12.setVisibility(0);
        r12.setText(defpackage.z8e.u(r10, r3.getStatusDescription(), defpackage.ok3.s(r3), true));
        r1 = java.lang.Integer.valueOf(r4);
        r5 = com.sofascore.model.mvvm.model.Event.getWinnerCode$default(r3, null, 1, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01f2, code lost:
    
        if (r5 != null) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01f9, code lost:
    
        if (r5.intValue() != 1) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01fd, code lost:
    
        if (r1 == null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01ff, code lost:
    
        r1 = r1.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0205, code lost:
    
        r15.setTextColor(r1);
        r1 = java.lang.Integer.valueOf(r4);
        r3 = com.sofascore.model.mvvm.model.Event.getWinnerCode$default(r3, null, 1, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0211, code lost:
    
        if (r3 != null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0213, code lost:
    
        r9 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x021d, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x021e, code lost:
    
        if (r1 == null) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0220, code lost:
    
        r1 = r1.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0226, code lost:
    
        r14.setTextColor(r1);
        r7.setTextColor(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0225, code lost:
    
        r1 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0215, code lost:
    
        r9 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x021a, code lost:
    
        if (r3.intValue() != 2) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0204, code lost:
    
        r1 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01fc, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0192, code lost:
    
        if (r1.equals(com.sofascore.model.mvvm.model.StatusKt.STATUS_CANCELED) == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01d3, code lost:
    
        if (r1.equals(com.sofascore.model.mvvm.model.StatusKt.STATUS_FINISHED) == false) goto L37;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:28:0x0172. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0298  */
    @Override // defpackage.p8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(int i2, int i3, Object obj) {
        Object obj2;
        char c;
        String str;
        fy6 fy6Var;
        String str2;
        fy6 fy6Var2 = (fy6) obj;
        fy6Var2.getClass();
        y21 y21Var = fy6Var2.a;
        Event d = y21Var.d();
        js2 js2Var = this.c;
        ConstraintLayout constraintLayout = (ConstraintLayout) js2Var.i;
        ImageView imageView = (ImageView) js2Var.b;
        constraintLayout.getClass();
        ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
        if (layoutParams == null) {
            yhk.s("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        Context context = this.b;
        marginLayoutParams.topMargin = i2 == 0 ? ao2.s(8, context) : ao2.s(4, context);
        constraintLayout.setLayoutParams(marginLayoutParams);
        TextView textView = (TextView) js2Var.f;
        long startTimestamp = d.getStartTimestamp();
        bi4 bi4Var = bi4.PATTERN_DMY;
        ConcurrentHashMap concurrentHashMap = hk4.a;
        fn0.u(startTimestamp, hk4.a(bi4Var.d()), textView);
        ((BellButton) js2Var.j).e(d, wu.MAIN_FAVORITES);
        boolean z = y21Var.m;
        ImageView imageView2 = (ImageView) js2Var.c;
        imageView.setVisibility(z ? 0 : 8);
        imageView2.setVisibility(z ? 0 : 8);
        if (z) {
            as9.o(imageView, Event.getHomeTeam$default(d, null, 1, null).getId());
            as9.o(imageView2, Event.getAwayTeam$default(d, null, 1, null).getId());
        } else {
            imageView.setImageDrawable(null);
            imageView2.setImageDrawable(null);
        }
        js2Var.d.setText(tba.p(context, Event.getHomeTeam$default(d, null, 1, null)));
        ((TextView) js2Var.h).setText(tba.p(context, Event.getAwayTeam$default(d, null, 1, null)));
        TextView textView2 = (TextView) js2Var.g;
        TextView textView3 = (TextView) js2Var.o;
        TextView textView4 = (TextView) js2Var.n;
        TextView textView5 = (TextView) js2Var.l;
        TextView textView6 = (TextView) js2Var.e;
        TextView textView7 = (TextView) js2Var.m;
        textView2.setVisibility(4);
        textView7.setVisibility(8);
        textView6.setVisibility(8);
        textView5.setVisibility(8);
        textView4.setVisibility(8);
        textView3.setVisibility(8);
        int i4 = this.f;
        textView7.setTextColor(i4);
        textView2.setTextColor(i4);
        textView2.setText(pd0.u(context, d));
        if (ph0.a0(new String[]{StatusKt.STATUS_FINISHED, StatusKt.STATUS_WILL_CONTINUE, StatusKt.STATUS_IN_PROGRESS, StatusKt.STATUS_SUSPENDED, StatusKt.STATUS_INTERRUPTED}).contains(d.getStatus().getType())) {
            textView4.setVisibility(0);
            textView6.setVisibility(0);
            textView5.setVisibility(0);
            Integer display = Event.getHomeScore$default(d, null, 1, null).getDisplay();
            if (display != null) {
                String valueOf = String.valueOf(display.intValue());
                obj2 = StatusKt.STATUS_SUSPENDED;
                str2 = valueOf;
            } else {
                obj2 = StatusKt.STATUS_SUSPENDED;
                str2 = null;
            }
            textView6.setText(str2);
            Integer display2 = Event.getAwayScore$default(d, null, 1, null).getDisplay();
            textView5.setText(display2 != null ? String.valueOf(display2.intValue()) : null);
        } else {
            obj2 = StatusKt.STATUS_SUSPENDED;
            textView2.setVisibility(0);
        }
        g9i g9iVar = this.h;
        if (g9iVar != null) {
            g9iVar.e(null);
        }
        String type = d.getStatus().getType();
        int hashCode = type.hashCode();
        int i5 = this.e;
        switch (hashCode) {
            case -1947652542:
                c = 2;
                break;
            case -1661628965:
                c = 2;
                break;
            case -1411655086:
                c = 2;
                if (type.equals(StatusKt.STATUS_IN_PROGRESS)) {
                    textView7.setVisibility(0);
                    g9i g9iVar2 = this.h;
                    rq3 rq3Var = null;
                    if (g9iVar2 != null) {
                        g9iVar2.e(null);
                    }
                    u6b u6bVar = this.d;
                    this.h = u6bVar != null ? xw3.L(wca.x(u6bVar.getLifecycle()), null, null, new rh4(this, d, rq3Var, 16), 3) : null;
                    int i6 = this.g;
                    textView6.setTextColor(i6);
                    textView5.setTextColor(i6);
                    textView4.setTextColor(i6);
                    textView7.setTextColor(i6);
                    fy6Var = fy6Var2;
                    str = null;
                    break;
                }
                long startTimestamp2 = d.getStartTimestamp();
                DateTimePatternGenerator b = hk4.b();
                String bestPattern = !DateFormat.is24HourFormat(context) ? b.getBestPattern("Hm") : b.getBestPattern("hm");
                bestPattern.getClass();
                fn0.u(startTimestamp2, hk4.a(bestPattern), textView2);
                fy6Var = fy6Var2;
                str = null;
            case -673660814:
                break;
            case -123173735:
                break;
            case 527231609:
                break;
            case 2018521742:
                break;
            default:
                c = 2;
                long startTimestamp22 = d.getStartTimestamp();
                DateTimePatternGenerator b2 = hk4.b();
                if (!DateFormat.is24HourFormat(context)) {
                }
                bestPattern.getClass();
                fn0.u(startTimestamp22, hk4.a(bestPattern), textView2);
                fy6Var = fy6Var2;
                str = null;
                break;
        }
        FeaturedOddsWithProvider featuredOddsWithProvider = fy6Var.b;
        Event d2 = y21Var.d();
        v82 v82Var = (v82) js2Var.k;
        View view = v82Var.b;
        if (featuredOddsWithProvider == null) {
            view.setVisibility(8);
            return;
        }
        ImageView imageView3 = (ImageView) v82Var.d;
        view.setVisibility(0);
        ProviderOdds featuredOdds = featuredOddsWithProvider.getFeaturedOdds();
        OddsCountryProvider countryProvider = featuredOddsWithProvider.getCountryProvider();
        OddsProvider provider = countryProvider.getProvider();
        ((TextView) v82Var.e).setVisibility(featuredOdds.isLive() ? 0 : 8);
        ((TextView) v82Var.h).setText(rld.n(context, featuredOdds.getMarketName(), ok3.s(d2)));
        as9.k(imageView3, provider.getId());
        aba.y(imageView3, 0, 3);
        Colors colors = countryProvider.getProvider().getColors();
        Drawable mutate = imageView3.getBackground().mutate();
        String primary = colors != null ? colors.getPrimary() : str;
        v9g.K(mutate, (primary == null || primary.length() == 0) ? context.getColor(R.color.neutral_default) : Color.parseColor(colors.getPrimary()));
        imageView3.setOnClickListener(new cn(29, this, provider));
        List<OddsChoice> choicesReversible = featuredOdds.getChoicesReversible();
        pu1 pu1Var = (pu1) v82Var.c;
        choicesReversible.getClass();
        d(pu1Var, (OddsChoice) CollectionsKt.a0(choicesReversible.size() - 3, choicesReversible), featuredOddsWithProvider, d2, featuredOdds.getChoiceGroup());
        d((pu1) v82Var.f, (OddsChoice) CollectionsKt.a0(choicesReversible.size() - 2, choicesReversible), featuredOddsWithProvider, d2, null);
        d((pu1) v82Var.g, (OddsChoice) CollectionsKt.a0(choicesReversible.size() - 1, choicesReversible), featuredOddsWithProvider, d2, null);
    }

    public final void d(pu1 pu1Var, OddsChoice oddsChoice, FeaturedOddsWithProvider featuredOddsWithProvider, Event event, String str) {
        TextView textView = pu1Var.d;
        TextView textView2 = pu1Var.e;
        LinearLayout linearLayout = pu1Var.b;
        if (oddsChoice == null) {
            if (str == null) {
                linearLayout.setVisibility(8);
                return;
            }
            linearLayout.setVisibility(0);
            linearLayout.setOnClickListener(null);
            linearLayout.setBackground(null);
            textView.setText(str);
            textView2.setVisibility(8);
            return;
        }
        OddsCountryProvider countryProvider = featuredOddsWithProvider.getCountryProvider();
        ProviderOdds featuredOdds = featuredOddsWithProvider.getFeaturedOdds();
        ImageView imageView = pu1Var.c;
        linearLayout.setVisibility(0);
        linearLayout.setActivated(ok3.C(event) && oddsChoice.getWinning());
        String reversibleName$default = OddsChoice.getReversibleName$default(oddsChoice, null, 1, null);
        String s = ok3.s(event);
        Context context = this.b;
        textView.setText(rld.n(context, reversibleName$default, s));
        textView2.setVisibility(0);
        textView2.setTextColor(context.getColor(featuredOdds.isLive() ? R.color.value : R.color.n_lv_1));
        l4a.K(textView2, rld.m(context, oddsChoice.getFractionalValue()));
        imageView.setVisibility(oddsChoice.getChange() != 0 ? 0 : 8);
        if (oddsChoice.getChange() < 0) {
            imageView.setImageTintList(eq3.q(R.color.live, context));
            imageView.setRotation(180.0f);
        } else if (oddsChoice.getChange() > 0) {
            imageView.setImageTintList(eq3.q(R.color.success, context));
            imageView.setRotation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        String k = rld.k(context, countryProvider, featuredOddsWithProvider.getFeaturedOdds(), oddsChoice);
        if (k == null || k.length() == 0 || !countryProvider.getBranded()) {
            linearLayout.setClickable(false);
            linearLayout.setEnabled(false);
            linearLayout.setOnClickListener(null);
        } else {
            linearLayout.setClickable(true);
            linearLayout.setEnabled(true);
            linearLayout.setOnClickListener(new qh(17, linearLayout, countryProvider, k));
        }
    }
}
