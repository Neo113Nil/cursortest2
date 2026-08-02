package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import com.sofascore.model.Country;
import com.sofascore.model.Sports;
import com.sofascore.model.TeamSelection;
import com.sofascore.model.firebase.SurveyConfigData;
import com.sofascore.model.mvvm.model.Category;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Lineups;
import com.sofascore.model.mvvm.model.SportVariant;
import com.sofascore.model.newNetwork.PowerRankingRound;
import com.sofascore.results.R;
import com.sofascore.results.fantasy.ui.model.FantasyPlayerUiModel;
import com.unity3d.services.UnityAdsConstants;
import java.io.Serializable;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class b05 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ b05(boolean z, b3l b3lVar, l3l l3lVar, Function1 function1, Function0 function0) {
        this.a = 8;
        this.b = z;
        this.d = b3lVar;
        this.e = l3lVar;
        this.c = function1;
        this.f = function0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:139:0x0302, code lost:
    
        if (r1.getLong("PREF_USAGE_STREAK_DAYS", 1) >= r0.intValue()) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x031e, code lost:
    
        if (defpackage.ok3.p().e().getIsLoggedIn() == false) goto L171;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x026a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0256  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        n9g n9gVar;
        gv9 gv9Var;
        boolean z;
        boolean booleanValue;
        List<Integer> orPreconditions;
        boolean z2;
        boolean z3;
        boolean c;
        boolean z4;
        Integer minDaysSinceInstall;
        SharedPreferences sharedPreferences;
        int between;
        Iterator<T> it;
        boolean booleanValue2;
        boolean booleanValue3;
        int i = 18;
        int i2 = 2;
        boolean z5 = false;
        boolean z6 = true;
        switch (this.a) {
            case 0:
                boolean z7 = this.b;
                Function1 function1 = (Function1) this.c;
                Object obj2 = this.d;
                e1d e1dVar = (e1d) this.e;
                e1d e1dVar2 = (e1d) this.f;
                ie8 ie8Var = (ie8) obj;
                ie8Var.getClass();
                if (z7) {
                    return Unit.a;
                }
                if (ie8Var.g() && !((Boolean) e1dVar.getValue()).booleanValue()) {
                    e1dVar2.setValue("");
                }
                if (!ie8Var.g()) {
                    e1dVar2.setValue((String) function1.invoke(obj2));
                }
                e1dVar.setValue(Boolean.FALSE);
                return Unit.a;
            case 1:
                p46 p46Var = (p46) this.c;
                Event event = (Event) this.d;
                boolean z8 = this.b;
                Lineups lineups = (Lineups) this.e;
                Lineups lineups2 = (Lineups) this.f;
                m46 m46Var = (m46) obj;
                e9b a = e9b.a(m46Var.a, m46Var.a.c == TeamSelection.Second ? p46Var.n : p46Var.m, x21.t(event), null, 4);
                if (Boolean.valueOf(z8).equals(Boolean.TRUE)) {
                    int id = event.getId();
                    Category category = event.getTournament().getCategory();
                    category.getClass();
                    boolean z9 = Intrinsics.c(category.getSport().getSlug(), Sports.RUGBY) && SportVariant.INSTANCE.fromId(category.getSportVariant()) == SportVariant.RugbySevens;
                    gv9 W = l6g.W(lineups.getPlayers());
                    String fancyNumber = lineups.getPlayerColor().getFancyNumber();
                    o9g o9gVar = new o9g(fancyNumber != null ? Color.parseColor(fancyNumber) : -16777216, W);
                    gv9 W2 = l6g.W(lineups2.getPlayers());
                    String fancyNumber2 = lineups2.getPlayerColor().getFancyNumber();
                    n9gVar = new n9g(id, z9, o9gVar, new o9g(fancyNumber2 != null ? Color.parseColor(fancyNumber2) : -16777216, W2));
                } else {
                    n9gVar = null;
                }
                return m46.a(m46Var, a, n9gVar, false, 4);
            case 2:
                final zo6 zo6Var = (zo6) this.d;
                final Function1 function12 = (Function1) this.c;
                final boolean z10 = this.b;
                final cdi cdiVar = (cdi) this.e;
                final cdi cdiVar2 = (cdi) this.f;
                esa esaVar = (esa) obj;
                esaVar.getClass();
                esa.b(esaVar, "player_picker", new tc3(1511397211, new et8() { // from class: sc7
                    @Override // defpackage.et8
                    public final Object invoke(Object obj3, Object obj4, Object obj5, Object obj6) {
                        ((Integer) obj4).getClass();
                        of3 of3Var = (of3) obj5;
                        int intValue = ((Integer) obj6).intValue();
                        ((xpa) obj3).getClass();
                        av8 av8Var = (av8) of3Var;
                        if (av8Var.T(intValue & 1, (intValue & 129) != 128)) {
                            zo6 zo6Var2 = zo6.this;
                            m73 m73Var = zo6Var2.b;
                            FantasyPlayerUiModel fantasyPlayerUiModel = m73Var != null ? m73Var.a : null;
                            m73 m73Var2 = zo6Var2.c;
                            FantasyPlayerUiModel fantasyPlayerUiModel2 = m73Var2 != null ? m73Var2.a : null;
                            boolean booleanValue4 = ((Boolean) cdiVar.getValue()).booleanValue();
                            float floatValue = ((Number) cdiVar2.getValue()).floatValue();
                            Function1 function13 = function12;
                            boolean g = av8Var.g(function13);
                            Object O = av8Var.O();
                            Object obj7 = nf3.a;
                            if (g || O == obj7) {
                                O = new k46(22, function13);
                                av8Var.n0(O);
                            }
                            Function1 function14 = (Function1) O;
                            boolean g2 = av8Var.g(function13);
                            Object O2 = av8Var.O();
                            if (g2 || O2 == obj7) {
                                O2 = new k46(23, function13);
                                av8Var.n0(O2);
                            }
                            k53.J(fantasyPlayerUiModel, fantasyPlayerUiModel2, floatValue, booleanValue4, function14, (Function1) O2, z10, null, av8Var, 0);
                        } else {
                            av8Var.W();
                        }
                        return Unit.a;
                    }
                }, true), 2);
                if (zo6Var.g) {
                    esa.d(esaVar, null, null, fkf.a, 3);
                }
                gv9 gv9Var2 = zo6Var.d;
                if (gv9Var2 != null && !gv9Var2.isEmpty()) {
                    esa.d(esaVar, "general_statistics", null, new tc3(-51309099, new s16(zo6Var, 14), true), 2);
                }
                gv9 gv9Var3 = zo6Var.e;
                if (gv9Var3 != null && !gv9Var3.isEmpty()) {
                    final int i3 = 1;
                    esa.d(esaVar, "form_comparison", null, new tc3(-971087052, new ct8() { // from class: qc7
                        @Override // defpackage.ct8
                        public final Object invoke(Object obj3, Object obj4, Object obj5) {
                            int i4 = i3;
                            zo6 zo6Var2 = zo6Var;
                            switch (i4) {
                                case 0:
                                    of3 of3Var = (of3) obj4;
                                    int intValue = ((Integer) obj5).intValue();
                                    ((xpa) obj3).getClass();
                                    av8 av8Var = (av8) of3Var;
                                    if (av8Var.T(intValue & 1, (intValue & 17) != 16)) {
                                        String v = oea.v(R.string.next_fixtures, av8Var);
                                        xtc f0 = l98.f0(utc.a, 8.0f, 8.0f, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8);
                                        gv9 gv9Var4 = zo6Var2.f;
                                        if (gv9Var4 == null) {
                                            a70.r("Required value was null.");
                                            break;
                                        } else {
                                            f5p.c(v, gv9Var4, z10, f0, true, av8Var, 27648, 0);
                                        }
                                    } else {
                                        av8Var.W();
                                    }
                                    break;
                                default:
                                    of3 of3Var2 = (of3) obj4;
                                    int intValue2 = ((Integer) obj5).intValue();
                                    ((xpa) obj3).getClass();
                                    av8 av8Var2 = (av8) of3Var2;
                                    if (av8Var2.T(intValue2 & 1, (intValue2 & 17) != 16)) {
                                        String v2 = oea.v(R.string.last_fixtures, av8Var2);
                                        xtc f02 = l98.f0(utc.a, 8.0f, 8.0f, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8);
                                        gv9 gv9Var5 = zo6Var2.e;
                                        if (gv9Var5 == null) {
                                            a70.r("Required value was null.");
                                            break;
                                        } else {
                                            f5p.c(v2, gv9Var5, z10, f02, false, av8Var2, 3072, 16);
                                        }
                                    } else {
                                        av8Var2.W();
                                    }
                                    break;
                            }
                            return Unit.a;
                        }
                    }, true), 2);
                }
                gv9 gv9Var4 = zo6Var.f;
                if (gv9Var4 != null && !gv9Var4.isEmpty()) {
                    final int i4 = 0;
                    esa.d(esaVar, "fixture_comparison", null, new tc3(-1890865005, new ct8() { // from class: qc7
                        @Override // defpackage.ct8
                        public final Object invoke(Object obj3, Object obj4, Object obj5) {
                            int i42 = i4;
                            zo6 zo6Var2 = zo6Var;
                            switch (i42) {
                                case 0:
                                    of3 of3Var = (of3) obj4;
                                    int intValue = ((Integer) obj5).intValue();
                                    ((xpa) obj3).getClass();
                                    av8 av8Var = (av8) of3Var;
                                    if (av8Var.T(intValue & 1, (intValue & 17) != 16)) {
                                        String v = oea.v(R.string.next_fixtures, av8Var);
                                        xtc f0 = l98.f0(utc.a, 8.0f, 8.0f, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8);
                                        gv9 gv9Var42 = zo6Var2.f;
                                        if (gv9Var42 == null) {
                                            a70.r("Required value was null.");
                                            break;
                                        } else {
                                            f5p.c(v, gv9Var42, z10, f0, true, av8Var, 27648, 0);
                                        }
                                    } else {
                                        av8Var.W();
                                    }
                                    break;
                                default:
                                    of3 of3Var2 = (of3) obj4;
                                    int intValue2 = ((Integer) obj5).intValue();
                                    ((xpa) obj3).getClass();
                                    av8 av8Var2 = (av8) of3Var2;
                                    if (av8Var2.T(intValue2 & 1, (intValue2 & 17) != 16)) {
                                        String v2 = oea.v(R.string.last_fixtures, av8Var2);
                                        xtc f02 = l98.f0(utc.a, 8.0f, 8.0f, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8);
                                        gv9 gv9Var5 = zo6Var2.e;
                                        if (gv9Var5 == null) {
                                            a70.r("Required value was null.");
                                            break;
                                        } else {
                                            f5p.c(v2, gv9Var5, z10, f02, false, av8Var2, 3072, 16);
                                        }
                                    } else {
                                        av8Var2.W();
                                    }
                                    break;
                            }
                            return Unit.a;
                        }
                    }, true), 2);
                }
                return Unit.a;
            case 3:
                eza ezaVar = (eza) this.c;
                List list = (List) this.d;
                PowerRankingRound powerRankingRound = (PowerRankingRound) this.e;
                gv9 gv9Var5 = (gv9) this.f;
                boolean z11 = this.b;
                ((vnb) obj).getClass();
                int i5 = ezaVar.n;
                int i6 = ezaVar.o;
                String str = ezaVar.q;
                String str2 = ezaVar.r;
                String str3 = ezaVar.p;
                if (str3 == null) {
                    str3 = "";
                }
                String str4 = str3;
                if (list == null || (gv9Var = l6g.W(list)) == null) {
                    gv9Var = rlh.b;
                }
                gv9 gv9Var6 = gv9Var;
                if (gv9Var5 == null || !gv9Var5.isEmpty()) {
                    Iterator<E> it2 = gv9Var5.iterator();
                    while (it2.hasNext()) {
                        if (((u2f) it2.next()).f == null) {
                            z = false;
                            return new unb(new bza(i5, i6, str, str2, str4, gv9Var6, powerRankingRound, gv9Var5, z11, z));
                        }
                    }
                }
                z = true;
                return new unb(new bza(i5, i6, str, str2, str4, gv9Var6, powerRankingRound, gv9Var5, z11, z));
            case 4:
                boolean z12 = this.b;
                e1d e1dVar3 = ((h1d) this.c).d;
                e1d e1dVar4 = (e1d) this.e;
                cdi cdiVar3 = (cdi) this.d;
                cdi cdiVar4 = (cdi) this.f;
                f4g f4gVar = (f4g) obj;
                float f = 0.8f;
                float f2 = 1.0f;
                f4gVar.k(!z12 ? ((Number) cdiVar3.getValue()).floatValue() : ((Boolean) ((eoh) e1dVar3).getValue()).booleanValue() ? 1.0f : 0.8f);
                if (!z12) {
                    f = ((Number) cdiVar3.getValue()).floatValue();
                } else if (((Boolean) ((eoh) e1dVar3).getValue()).booleanValue()) {
                    f = 1.0f;
                }
                f4gVar.l(f);
                if (!z12) {
                    f2 = ((Number) cdiVar4.getValue()).floatValue();
                } else if (!((Boolean) ((eoh) e1dVar3).getValue()).booleanValue()) {
                    f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                }
                f4gVar.b(f2);
                f4gVar.s(((xvj) e1dVar4.getValue()).a);
                return Unit.a;
            case 5:
                asf asfVar = (asf) this.c;
                asf asfVar2 = (asf) this.d;
                k6d k6dVar = (k6d) this.e;
                boolean z13 = this.b;
                vg0 vg0Var = (vg0) this.f;
                d6d d6dVar = (d6d) obj;
                d6dVar.getClass();
                asfVar.a = true;
                asfVar2.a = true;
                k6dVar.n(d6dVar, z13, vg0Var);
                return Unit.a;
            case 6:
                boolean z14 = this.b;
                SurveyConfigData surveyConfigData = (SurveyConfigData) this.c;
                Context context = (Context) this.d;
                String str5 = (String) this.e;
                String str6 = (String) this.f;
                SharedPreferences sharedPreferences2 = (SharedPreferences) obj;
                sharedPreferences2.getClass();
                long currentTimeMillis = System.currentTimeMillis() / 1000;
                long j = sharedPreferences2.getLong(z14 ? "PREF_IN_APP_SURVEY_START_TIME" : "PREF_SURVEY_START_TIME", 0L);
                Long startTimestamp = surveyConfigData.getStartTimestamp();
                long max = Math.max(j, startTimestamp != null ? startTimestamp.longValue() : 0L);
                Long endTimestamp = surveyConfigData.getEndTimestamp();
                long longValue = endTimestamp != null ? endTimestamp.longValue() : Long.MAX_VALUE;
                int i7 = 17;
                if (z14) {
                    booleanValue = ((Boolean) n9e.x(context, new bvb(surveyConfigData.getId(), i))).booleanValue();
                } else {
                    int id2 = surveyConfigData.getId();
                    if (id2 == 0) {
                        SharedPreferences sharedPreferences3 = uic.j;
                        if (sharedPreferences3 == null) {
                            Context applicationContext = context.getApplicationContext();
                            synchronized (uic.i) {
                                sharedPreferences3 = a5f.d(applicationContext);
                                uic.j = sharedPreferences3;
                            }
                            sharedPreferences3.getClass();
                        }
                        booleanValue = sharedPreferences3.getBoolean("PREF_SURVEY_https://www.surveymonkey.com/r/LCMQGFB", false);
                    } else {
                        booleanValue = ((Boolean) n9e.x(context, new bvb(id2, i7))).booleanValue();
                    }
                }
                int i8 = ke0.c;
                ArrayList arrayList = dv3.a;
                Country b = dv3.b(Integer.valueOf(i8));
                String iso2Alpha = b != null ? b.getIso2Alpha() : null;
                List<String> supportedCountries = surveyConfigData.getSupportedCountries();
                boolean R = supportedCountries != null ? CollectionsKt.R(supportedCountries, iso2Alpha) : true;
                List<Integer> andPreconditions = surveyConfigData.getAndPreconditions();
                if (andPreconditions != null) {
                    if (andPreconditions.isEmpty()) {
                        andPreconditions = null;
                    }
                    if (andPreconditions != null) {
                        if (!andPreconditions.isEmpty()) {
                            Iterator<T> it3 = andPreconditions.iterator();
                            while (it3.hasNext()) {
                                int intValue = ((Number) it3.next()).intValue();
                                if (intValue == 0) {
                                    SharedPreferences sharedPreferences4 = uic.j;
                                    if (sharedPreferences4 == null) {
                                        Context applicationContext2 = context.getApplicationContext();
                                        synchronized (uic.i) {
                                            sharedPreferences4 = a5f.d(applicationContext2);
                                            uic.j = sharedPreferences4;
                                        }
                                        sharedPreferences4.getClass();
                                    }
                                    booleanValue3 = sharedPreferences4.getBoolean("PREF_SURVEY_https://www.surveymonkey.com/r/LCMQGFB", z5);
                                } else {
                                    booleanValue3 = ((Boolean) n9e.x(context, new bvb(intValue, 17))).booleanValue();
                                }
                                if (booleanValue3) {
                                    z5 = false;
                                }
                            }
                            z6 = true;
                        }
                        orPreconditions = surveyConfigData.getOrPreconditions();
                        if (orPreconditions != null && !orPreconditions.isEmpty()) {
                            it = orPreconditions.iterator();
                            while (it.hasNext()) {
                                int intValue2 = ((Number) it.next()).intValue();
                                if (intValue2 == 0) {
                                    SharedPreferences sharedPreferences5 = uic.j;
                                    if (sharedPreferences5 == null) {
                                        Context applicationContext3 = context.getApplicationContext();
                                        synchronized (uic.i) {
                                            sharedPreferences5 = a5f.d(applicationContext3);
                                            uic.j = sharedPreferences5;
                                        }
                                        sharedPreferences5.getClass();
                                    }
                                    z2 = booleanValue;
                                    booleanValue2 = sharedPreferences5.getBoolean("PREF_SURVEY_https://www.surveymonkey.com/r/LCMQGFB", false);
                                } else {
                                    z2 = booleanValue;
                                    booleanValue2 = ((Boolean) n9e.x(context, new bvb(intValue2, 17))).booleanValue();
                                }
                                if (booleanValue2) {
                                    z3 = true;
                                    c = (surveyConfigData.getShowOnScreenName() != null || surveyConfigData.getShowOnTabName() == null) ? Intrinsics.c(str5, "MainScreen") : Intrinsics.c(surveyConfigData.getShowOnScreenName(), str5) && Intrinsics.c(surveyConfigData.getShowOnTabName(), str6);
                                    Calendar calendar = ke0.a;
                                    String b2 = ke0.b(context);
                                    String showOnSelectedSport = surveyConfigData.getShowOnSelectedSport();
                                    boolean z15 = showOnSelectedSport != null || (b2.equals(showOnSelectedSport) && Intrinsics.c(str5, "MainScreen"));
                                    if (!z2 && !z6 && !z3) {
                                        minDaysSinceInstall = surveyConfigData.getMinDaysSinceInstall();
                                        Integer maxDaysSinceInstall = surveyConfigData.getMaxDaysSinceInstall();
                                        sharedPreferences = uic.j;
                                        if (sharedPreferences == null) {
                                            Context applicationContext4 = context.getApplicationContext();
                                            synchronized (uic.i) {
                                                sharedPreferences = a5f.d(applicationContext4);
                                                uic.j = sharedPreferences;
                                            }
                                            sharedPreferences.getClass();
                                        }
                                        boolean z16 = c;
                                        between = (int) ChronoUnit.DAYS.between(vxd.o(Instant.ofEpochMilli(sharedPreferences.getLong("PREF_FIRST_RUN_TIMESTAMP", System.currentTimeMillis()))), vxd.o(Instant.ofEpochMilli(System.currentTimeMillis())));
                                        if (between >= (minDaysSinceInstall == null ? minDaysSinceInstall.intValue() : Integer.MIN_VALUE)) {
                                            if (between <= (maxDaysSinceInstall != null ? maxDaysSinceInstall.intValue() : Integer.MAX_VALUE) && z16 && z15) {
                                                if (surveyConfigData.getUsageStreakMinDays() != null) {
                                                    SharedPreferences sharedPreferences6 = uic.j;
                                                    if (sharedPreferences6 == null) {
                                                        Context applicationContext5 = context.getApplicationContext();
                                                        synchronized (uic.i) {
                                                            sharedPreferences6 = a5f.d(applicationContext5);
                                                            uic.j = sharedPreferences6;
                                                        }
                                                        sharedPreferences6.getClass();
                                                    }
                                                    break;
                                                }
                                                if (Intrinsics.c(surveyConfigData.getMustBeLoggedIn(), Boolean.TRUE)) {
                                                    ia0 ia0Var = ia0.q;
                                                    break;
                                                }
                                                z4 = false;
                                                return Boolean.valueOf(max > currentTimeMillis && currentTimeMillis <= longValue && !z4 && R);
                                            }
                                        }
                                    }
                                    z4 = true;
                                    return Boolean.valueOf(max > currentTimeMillis && currentTimeMillis <= longValue && !z4 && R);
                                }
                                booleanValue = z2;
                            }
                        }
                        z2 = booleanValue;
                        z3 = false;
                        if (surveyConfigData.getShowOnScreenName() != null) {
                        }
                        Calendar calendar2 = ke0.a;
                        String b22 = ke0.b(context);
                        String showOnSelectedSport2 = surveyConfigData.getShowOnSelectedSport();
                        if (showOnSelectedSport2 != null) {
                        }
                        if (!z2) {
                            minDaysSinceInstall = surveyConfigData.getMinDaysSinceInstall();
                            Integer maxDaysSinceInstall2 = surveyConfigData.getMaxDaysSinceInstall();
                            sharedPreferences = uic.j;
                            if (sharedPreferences == null) {
                            }
                            boolean z162 = c;
                            between = (int) ChronoUnit.DAYS.between(vxd.o(Instant.ofEpochMilli(sharedPreferences.getLong("PREF_FIRST_RUN_TIMESTAMP", System.currentTimeMillis()))), vxd.o(Instant.ofEpochMilli(System.currentTimeMillis())));
                            if (between >= (minDaysSinceInstall == null ? minDaysSinceInstall.intValue() : Integer.MIN_VALUE)) {
                            }
                        }
                        z4 = true;
                        return Boolean.valueOf(max > currentTimeMillis && currentTimeMillis <= longValue && !z4 && R);
                    }
                }
                z6 = false;
                orPreconditions = surveyConfigData.getOrPreconditions();
                if (orPreconditions != null) {
                    it = orPreconditions.iterator();
                    while (it.hasNext()) {
                    }
                }
                z2 = booleanValue;
                z3 = false;
                if (surveyConfigData.getShowOnScreenName() != null) {
                }
                Calendar calendar22 = ke0.a;
                String b222 = ke0.b(context);
                String showOnSelectedSport22 = surveyConfigData.getShowOnSelectedSport();
                if (showOnSelectedSport22 != null) {
                }
                if (!z2) {
                }
                z4 = true;
                return Boolean.valueOf(max > currentTimeMillis && currentTimeMillis <= longValue && !z4 && R);
            case 7:
                esf esfVar = (esf) this.c;
                lcj lcjVar = (lcj) this.d;
                boolean z17 = this.b;
                k69 k69Var = (k69) this.e;
                esf esfVar2 = (esf) this.f;
                long a2 = f3h.a(lcjVar.o(z17));
                esfVar.a = a2;
                lcjVar.A(k69Var, a2);
                esfVar2.a = 0L;
                lcjVar.v = -1;
                return Unit.a;
            default:
                boolean z18 = this.b;
                b3l b3lVar = (b3l) this.d;
                l3l l3lVar = (l3l) this.e;
                Function1 function13 = (Function1) this.c;
                Function0 function0 = (Function0) this.f;
                esa esaVar2 = (esa) obj;
                esaVar2.getClass();
                if (z18) {
                    esa.d(esaVar2, Integer.valueOf(b3lVar.hashCode()), null, new tc3(-1424058317, new uri(b3lVar, 16), true), 2);
                }
                gv9 gv9Var7 = l3lVar.d;
                esaVar2.a(gv9Var7.size(), new wsd(i, new sbk(i2), gv9Var7), new dyg(gv9Var7, 7), new tc3(802480018, new dgk(gv9Var7, l3lVar, z18, function13, function0), true));
                return Unit.a;
        }
    }

    public /* synthetic */ b05(zo6 zo6Var, Function1 function1, boolean z, cdi cdiVar, cdi cdiVar2) {
        this.a = 2;
        this.d = zo6Var;
        this.c = function1;
        this.b = z;
        this.e = cdiVar;
        this.f = cdiVar2;
    }

    public /* synthetic */ b05(eza ezaVar, List list, PowerRankingRound powerRankingRound, gv9 gv9Var, boolean z) {
        this.a = 3;
        this.c = ezaVar;
        this.d = list;
        this.e = powerRankingRound;
        this.f = gv9Var;
        this.b = z;
    }

    public /* synthetic */ b05(asf asfVar, asf asfVar2, k6d k6dVar, boolean z, vg0 vg0Var) {
        this.a = 5;
        this.c = asfVar;
        this.d = asfVar2;
        this.e = k6dVar;
        this.b = z;
        this.f = vg0Var;
    }

    public /* synthetic */ b05(Object obj, Object obj2, boolean z, Serializable serializable, Serializable serializable2, int i) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.b = z;
        this.e = serializable;
        this.f = serializable2;
    }

    public /* synthetic */ b05(boolean z, h1d h1dVar, e1d e1dVar, vwj vwjVar, vwj vwjVar2) {
        this.a = 4;
        this.b = z;
        this.c = h1dVar;
        this.e = e1dVar;
        this.d = vwjVar;
        this.f = vwjVar2;
    }

    public /* synthetic */ b05(int i, Object obj, Object obj2, Object obj3, Object obj4, boolean z) {
        this.a = i;
        this.b = z;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }
}
