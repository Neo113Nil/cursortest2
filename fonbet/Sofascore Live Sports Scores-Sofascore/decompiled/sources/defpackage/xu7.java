package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.icu.text.DateTimePatternGenerator;
import android.os.Handler;
import android.os.Looper;
import android.text.format.DateFormat;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.appsflyer.internal.i;
import com.sofascore.model.Colors;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Round;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.model.mvvm.model.Tournament;
import com.sofascore.model.odds.FeaturedOddsWithProvider;
import com.sofascore.model.odds.OddsChoice;
import com.sofascore.model.odds.OddsCountryProvider;
import com.sofascore.model.odds.OddsProvider;
import com.sofascore.model.odds.ProviderOdds;
import com.sofascore.results.R;
import com.sofascore.results.featuredtournament.view.FeaturedTournamentOddsView;
import com.sofascore.results.view.BellButton;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class xu7 extends p8 {
    public final /* synthetic */ inb c;
    public final f92 d;
    public final joa e;
    public final int f;
    public final joa g;
    public final joa h;
    public Event i;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public xu7(f92 f92Var, g6b g6bVar) {
        super(r0);
        g6bVar.getClass();
        FrameLayout frameLayout = f92Var.c;
        frameLayout.getClass();
        this.c = inb.h;
        this.d = f92Var;
        final int i = 0;
        Function0 function0 = new Function0(this) { // from class: wu7
            public final /* synthetic */ xu7 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int color;
                int i2 = i;
                xu7 xu7Var = this.b;
                switch (i2) {
                    case 0:
                        color = xu7Var.b.getColor(R.color.n_lv_1);
                        break;
                    case 1:
                        color = xu7Var.b.getColor(R.color.stayDarkLive);
                        break;
                    default:
                        return new gl0(xu7Var, Looper.getMainLooper(), 4);
                }
                return Integer.valueOf(color);
            }
        };
        ysa ysaVar = ysa.c;
        this.e = ypa.a(ysaVar, function0);
        this.f = this.b.getColor(R.color.n_lv_3);
        final int i2 = 1;
        this.g = ypa.a(ysaVar, new Function0(this) { // from class: wu7
            public final /* synthetic */ xu7 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int color;
                int i22 = i2;
                xu7 xu7Var = this.b;
                switch (i22) {
                    case 0:
                        color = xu7Var.b.getColor(R.color.n_lv_1);
                        break;
                    case 1:
                        color = xu7Var.b.getColor(R.color.stayDarkLive);
                        break;
                    default:
                        return new gl0(xu7Var, Looper.getMainLooper(), 4);
                }
                return Integer.valueOf(color);
            }
        });
        final int i3 = 2;
        this.h = ypa.a(ysaVar, new Function0(this) { // from class: wu7
            public final /* synthetic */ xu7 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int color;
                int i22 = i3;
                xu7 xu7Var = this.b;
                switch (i22) {
                    case 0:
                        color = xu7Var.b.getColor(R.color.n_lv_1);
                        break;
                    case 1:
                        color = xu7Var.b.getColor(R.color.stayDarkLive);
                        break;
                    default:
                        return new gl0(xu7Var, Looper.getMainLooper(), 4);
                }
                return Integer.valueOf(color);
            }
        });
        ConstraintLayout constraintLayout = f92Var.b;
        z8e.V(this.itemView.getContext().getColor(R.color.surface_2), constraintLayout);
        ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
        if (layoutParams == null) {
            yhk.s("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            throw null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        Context context = this.itemView.getContext();
        context.getClass();
        marginLayoutParams.topMargin = ao2.s(8, context);
        marginLayoutParams.bottomMargin = 0;
        constraintLayout.setLayoutParams(marginLayoutParams);
        constraintLayout.setElevation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        ((FeaturedTournamentOddsView) f92Var.m).setLifecycle(g6bVar);
    }

    @Override // defpackage.p8
    public final void a(Object obj) {
        obj.getClass();
        if (obj instanceof scb) {
            this.c.getClass();
            inb.o((BellButton) this.d.l, (scb) obj);
        }
    }

    @Override // defpackage.p8
    public final /* bridge */ /* synthetic */ void b(int i, int i2, Object obj) {
        e(i, (iv7) obj);
    }

    @Override // defpackage.p8
    public final void c(int i, int i2, Object obj) {
        iv7 iv7Var = (iv7) obj;
        iv7Var.getClass();
        e(i, iv7Var);
    }

    public final int d() {
        return ((Number) this.e.getValue()).intValue();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01c2, code lost:
    
        if (r1.equals(com.sofascore.model.mvvm.model.StatusKt.STATUS_POSTPONED) == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01d9, code lost:
    
        r9.setVisibility(0);
        r9.setText(defpackage.afi.c(r8, r4.getStatusDescription(), defpackage.ok3.s(r4), true));
        r0 = r4.getStartTimestamp();
        r2 = defpackage.hk4.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01f8, code lost:
    
        if (android.text.format.DateFormat.is24HourFormat(r8) == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01fa, code lost:
    
        r2 = r2.getBestPattern("Hm");
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0203, code lost:
    
        r2.getClass();
        r2 = defpackage.hk4.a(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01ff, code lost:
    
        r2 = r2.getBestPattern("hm");
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01cb, code lost:
    
        if (r1.equals(com.sofascore.model.mvvm.model.StatusKt.STATUS_WILL_CONTINUE) == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0218, code lost:
    
        r11.setVisibility(0);
        r1 = java.lang.Integer.valueOf(d());
        r5 = com.sofascore.model.mvvm.model.Event.getWinnerCode$default(r4, null, 1, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0229, code lost:
    
        if (r5 != null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0230, code lost:
    
        if (r5.intValue() != 1) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0234, code lost:
    
        if (r1 == null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0236, code lost:
    
        r1 = r1.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x023c, code lost:
    
        r10.setTextColor(r1);
        r1 = java.lang.Integer.valueOf(d());
        r5 = com.sofascore.model.mvvm.model.Event.getWinnerCode$default(r4, null, 1, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x024c, code lost:
    
        if (r5 != null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0254, code lost:
    
        if (r5.intValue() != 2) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0258, code lost:
    
        if (r1 == null) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x025a, code lost:
    
        r1 = r1.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0260, code lost:
    
        r15.setTextColor(r1);
        r12.setTextColor(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x026a, code lost:
    
        if (defpackage.ok3.z(r4) == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x026c, code lost:
    
        f(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0270, code lost:
    
        r11.setText(defpackage.z8e.u(r8, r4.getStatusDescription(), defpackage.ok3.s(r4), true));
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x025f, code lost:
    
        r1 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0257, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x023b, code lost:
    
        r1 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0233, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x01d6, code lost:
    
        if (r1.equals(com.sofascore.model.mvvm.model.StatusKt.STATUS_CANCELED) == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0215, code lost:
    
        if (r1.equals(com.sofascore.model.mvvm.model.StatusKt.STATUS_FINISHED) == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x02e8, code lost:
    
        if (r1.equals(com.sofascore.model.mvvm.model.StatusKt.STATUS_SUSPENDED) == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0369, code lost:
    
        r9.setVisibility(0);
        r9.setText(defpackage.afi.c(r8, r4.getStatusDescription(), defpackage.ok3.s(r4), true));
        r1 = java.lang.Integer.valueOf(d());
        r5 = com.sofascore.model.mvvm.model.Event.getHomeScore$default(r4, null, 1, null).getDisplay();
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x038d, code lost:
    
        if (r5 == null) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x038f, code lost:
    
        r5 = r5.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0395, code lost:
    
        r3 = com.sofascore.model.mvvm.model.Event.getAwayScore$default(r4, null, 1, null).getDisplay();
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x039d, code lost:
    
        if (r3 == null) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x039f, code lost:
    
        r3 = r3.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x03a5, code lost:
    
        if (r5 <= r3) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x03a8, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x03a9, code lost:
    
        if (r1 == null) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x03ab, code lost:
    
        r1 = r1.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x03b1, code lost:
    
        r10.setTextColor(r1);
        r1 = java.lang.Integer.valueOf(d());
        r0 = com.sofascore.model.mvvm.model.Event.getHomeScore$default(r4, null, 1, null).getDisplay();
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x03c6, code lost:
    
        if (r0 == null) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x03c8, code lost:
    
        r0 = r0.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x03ce, code lost:
    
        r3 = com.sofascore.model.mvvm.model.Event.getAwayScore$default(r4, null, 1, null).getDisplay();
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x03d6, code lost:
    
        if (r3 == null) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x03d8, code lost:
    
        r3 = r3.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x03de, code lost:
    
        if (r0 >= r3) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x03e1, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x03e2, code lost:
    
        if (r1 == null) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x03e4, code lost:
    
        r0 = r1.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x03ea, code lost:
    
        r15.setTextColor(r0);
        r12.setTextColor(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x03e9, code lost:
    
        r0 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x03dd, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x03cd, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x03b0, code lost:
    
        r1 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x03a4, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0394, code lost:
    
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x02f5, code lost:
    
        if (r1.equals(r20) == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x005e, code lost:
    
        r6 = kotlin.text.StringsKt__StringsKt.split$default(r15, new java.lang.String[]{" "}, false, 0, 6, null);
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x030e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(int i, iv7 iv7Var) {
        Object obj;
        int i2;
        String str;
        ProviderOdds featuredOdds;
        ProviderOdds featuredOdds2;
        ProviderOdds featuredOdds3;
        ProviderOdds featuredOdds4;
        String i3;
        String str2;
        String groupName;
        List split$default;
        String str3;
        iv7Var.getClass();
        Event event = iv7Var.a;
        this.i = event;
        f92 f92Var = this.d;
        FrameLayout frameLayout = f92Var.c;
        TextView textView = (TextView) f92Var.o;
        frameLayout.getClass();
        sea.v(frameLayout, i == 0, false, 0, 0, 0, null, Sdk.SDKError.Reason.GZIP_ENCODE_ERROR_VALUE);
        FrameLayout frameLayout2 = f92Var.c;
        frameLayout2.getClass();
        aba.y(frameLayout2, 0, 3);
        Regex regex = d7g.a;
        Round roundInfo = event.getRoundInfo();
        Context context = this.b;
        String b = d7g.b(context, roundInfo, false, Sports.FOOTBALL);
        TextView textView2 = f92Var.h;
        if (event.getTournament().getGroupName() != null) {
            Locale locale = Locale.getDefault();
            Tournament tournament = event.getTournament();
            tournament.getClass();
            String groupName2 = tournament.getGroupName();
            if (groupName2 == null || split$default == null || (str3 = (String) CollectionsKt.a0(1, split$default)) == null || (groupName = context.getString(R.string.competition_group_name, str3)) == null) {
                groupName = tournament.getGroupName();
            }
            b = String.format(locale, "%s, %s", Arrays.copyOf(new Object[]{groupName, b}, 2));
        }
        textView2.setText(b);
        ((BellButton) f92Var.l).e(event, wu.FEATURED_TOURNAMENT);
        as9.o(f92Var.j, Event.getHomeTeam$default(event, null, 1, null).getId());
        as9.o((ImageView) f92Var.k, Event.getAwayTeam$default(event, null, 1, null).getId());
        f92Var.e.setText(Event.getHomeTeam$default(event, null, 1, null).getNameCode());
        ((TextView) f92Var.p).setText(Event.getAwayTeam$default(event, null, 1, null).getNameCode());
        TextView textView3 = (TextView) f92Var.n;
        TextView textView4 = (TextView) f92Var.s;
        TextView textView5 = (TextView) f92Var.g;
        TextView textView6 = (TextView) f92Var.t;
        TextView textView7 = (TextView) f92Var.q;
        TextView textView8 = f92Var.f;
        TextView textView9 = (TextView) f92Var.r;
        textView3.setVisibility(4);
        textView9.setVisibility(8);
        textView4.setVisibility(8);
        textView8.setVisibility(8);
        textView7.setVisibility(8);
        textView6.setVisibility(8);
        textView5.setVisibility(8);
        textView3.setTextColor(d());
        textView9.setTextColor(d());
        textView3.setText(pd0.u(context, event));
        if (ph0.a0(new String[]{StatusKt.STATUS_FINISHED, StatusKt.STATUS_WILL_CONTINUE, StatusKt.STATUS_IN_PROGRESS, StatusKt.STATUS_SUSPENDED, StatusKt.STATUS_INTERRUPTED}).contains(event.getStatus().getType())) {
            textView6.setVisibility(0);
            textView8.setVisibility(0);
            textView7.setVisibility(0);
            Integer display = Event.getHomeScore$default(event, null, 1, null).getDisplay();
            if (display != null) {
                String valueOf = String.valueOf(display.intValue());
                obj = StatusKt.STATUS_INTERRUPTED;
                str2 = valueOf;
            } else {
                obj = StatusKt.STATUS_INTERRUPTED;
                str2 = null;
            }
            textView8.setText(str2);
            Integer display2 = Event.getAwayScore$default(event, null, 1, null).getDisplay();
            textView7.setText(display2 != null ? String.valueOf(display2.intValue()) : null);
            i2 = 0;
        } else {
            obj = StatusKt.STATUS_INTERRUPTED;
            i2 = 0;
            textView3.setVisibility(0);
        }
        joa joaVar = this.h;
        ((Handler) joaVar.getValue()).removeMessages(i2);
        String type = event.getStatus().getType();
        Locale locale2 = Locale.US;
        String k = i.k(locale2, type, locale2);
        int hashCode = k.hashCode();
        int i4 = this.f;
        switch (hashCode) {
            case -1947652542:
                break;
            case -1661628965:
                break;
            case -1411655086:
                if (k.equals(StatusKt.STATUS_IN_PROGRESS)) {
                    ((Handler) joaVar.getValue()).removeMessages(0);
                    ((Handler) joaVar.getValue()).sendEmptyMessage(9);
                    textView9.setVisibility(0);
                    joa joaVar2 = this.g;
                    textView8.setTextColor(((Number) joaVar2.getValue()).intValue());
                    textView7.setTextColor(((Number) joaVar2.getValue()).intValue());
                    textView6.setTextColor(((Number) joaVar2.getValue()).intValue());
                    textView9.setTextColor(((Number) joaVar2.getValue()).intValue());
                    if (ok3.z(event)) {
                        f(event);
                        break;
                    }
                }
                textView4.setVisibility(0);
                if (!ug5.w(event.getStartTimestamp())) {
                    i3 = context.getString(R.string.yesterday);
                } else if (ug5.u(event.getStartTimestamp())) {
                    i3 = context.getString(R.string.today);
                } else if (ug5.v(event.getStartTimestamp())) {
                    i3 = context.getString(R.string.tomorrow);
                } else {
                    long startTimestamp = event.getStartTimestamp();
                    bi4 bi4Var = bi4.PATTERN_DMY_SHORT;
                    ConcurrentHashMap concurrentHashMap = hk4.a;
                    i3 = fc6.i(startTimestamp, hk4.a(bi4Var.d()));
                }
                textView4.setText(i3);
                long startTimestamp2 = event.getStartTimestamp();
                DateTimePatternGenerator b2 = hk4.b();
                String bestPattern = !DateFormat.is24HourFormat(context) ? b2.getBestPattern("Hm") : b2.getBestPattern("hm");
                bestPattern.getClass();
                DateTimeFormatter a = hk4.a(bestPattern);
                fn0.u(startTimestamp2, a, textView3);
                break;
            case -673660814:
                break;
            case -123173735:
                break;
            case 527231609:
                break;
            case 2018521742:
                break;
            default:
                textView4.setVisibility(0);
                if (!ug5.w(event.getStartTimestamp())) {
                }
                textView4.setText(i3);
                long startTimestamp22 = event.getStartTimestamp();
                DateTimePatternGenerator b22 = hk4.b();
                if (!DateFormat.is24HourFormat(context)) {
                }
                bestPattern.getClass();
                DateTimeFormatter a2 = hk4.a(bestPattern);
                fn0.u(startTimestamp22, a2, textView3);
                break;
        }
        FeaturedOddsWithProvider featuredOddsWithProvider = iv7Var.b;
        TextView textView10 = f92Var.d;
        textView.setVisibility(featuredOddsWithProvider != null ? 0 : 8);
        textView.setText(rld.n(context, (featuredOddsWithProvider == null || (featuredOdds4 = featuredOddsWithProvider.getFeaturedOdds()) == null) ? null : featuredOdds4.getMarketName(), ok3.s(event)));
        f92Var.i.setVisibility(Intrinsics.c((featuredOddsWithProvider == null || (featuredOdds3 = featuredOddsWithProvider.getFeaturedOdds()) == null) ? null : Boolean.valueOf(featuredOdds3.isLive()), Boolean.TRUE) ? 0 : 8);
        textView10.setVisibility(((featuredOddsWithProvider == null || (featuredOdds2 = featuredOddsWithProvider.getFeaturedOdds()) == null) ? null : featuredOdds2.getChoiceGroup()) != null ? 0 : 8);
        textView10.setText((featuredOddsWithProvider == null || (featuredOdds = featuredOddsWithProvider.getFeaturedOdds()) == null) ? null : featuredOdds.getChoiceGroup());
        FeaturedTournamentOddsView featuredTournamentOddsView = (FeaturedTournamentOddsView) f92Var.m;
        v82 v82Var = featuredTournamentOddsView.a;
        if (featuredOddsWithProvider == null) {
            v82Var.b.setVisibility(8);
            return;
        }
        zsk zskVar = featuredTournamentOddsView.b;
        if (zskVar != null) {
            zskVar.a();
        }
        g6b g6bVar = featuredTournamentOddsView.c;
        if (g6bVar != null) {
            zsk zskVar2 = new zsk(g6bVar, 30);
            str = null;
            zskVar2.b(featuredTournamentOddsView, new l97(6, featuredTournamentOddsView, event, featuredOddsWithProvider), null);
            featuredTournamentOddsView.b = zskVar2;
        } else {
            str = null;
        }
        View view = v82Var.b;
        ImageView imageView = (ImageView) v82Var.d;
        view.setVisibility(0);
        ProviderOdds featuredOdds5 = featuredOddsWithProvider.getFeaturedOdds();
        String str4 = str;
        OddsCountryProvider countryProvider = featuredOddsWithProvider.getCountryProvider();
        OddsProvider provider = countryProvider.getProvider();
        as9.k(imageView, provider.getId());
        aba.y(imageView, 0, 3);
        Colors colors = countryProvider.getProvider().getColors();
        Drawable mutate = imageView.getBackground().mutate();
        if (colors != null) {
            str4 = colors.getPrimary();
        }
        v9g.K(mutate, (str4 == null || str4.length() == 0) ? featuredTournamentOddsView.getContext().getColor(R.color.neutral_default) : Color.parseColor(colors.getPrimary()));
        z8e.a0(imageView, 1000L, new l31(featuredTournamentOddsView, featuredOdds5, countryProvider, event, provider, 5));
        List<OddsChoice> choicesReversible = featuredOdds5.getChoicesReversible();
        featuredTournamentOddsView.f((pu1) v82Var.c, (OddsChoice) CollectionsKt.a0(0, choicesReversible), featuredOddsWithProvider, event);
        featuredTournamentOddsView.f((pu1) v82Var.f, (OddsChoice) CollectionsKt.a0(1, choicesReversible), featuredOddsWithProvider, event);
        featuredTournamentOddsView.f((pu1) v82Var.g, (OddsChoice) CollectionsKt.a0(2, choicesReversible), featuredOddsWithProvider, event);
    }

    public final void f(Event event) {
        String str;
        int m = yid.m(Event.getHomeScore$default(event, null, 1, null).getPenalties());
        int m2 = yid.m(Event.getAwayScore$default(event, null, 1, null).getPenalties());
        TextView textView = (TextView) this.d.r;
        Context context = this.b;
        if (hkg.c0(context)) {
            str = m2 + " - " + m + " " + context.getString(R.string.penalties_short);
        } else {
            str = context.getString(R.string.penalties_short) + " " + m + " - " + m2;
        }
        textView.setText(str);
    }
}
