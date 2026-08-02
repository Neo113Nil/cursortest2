package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import androidx.activity.ComponentActivity;
import androidx.compose.runtime.a;
import androidx.compose.runtime.e;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.appsflyer.internal.i;
import com.google.android.material.appbar.AppBarLayout;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import com.sofascore.model.fantasy.FantasyCompetitionType;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.model.mvvm.model.StatusTime;
import com.sofascore.model.newNetwork.statistics.season.team.BasketballTeamSeasonStatistics;
import com.sofascore.model.newNetwork.statistics.season.team.TeamSeasonStatistics;
import com.sofascore.results.R;
import com.sofascore.results.base.BaseActivity;
import com.sofascore.results.fantasy.ui.model.FantasyPlayerFixtureUiModel;
import com.sofascore.results.league.fragment.details.compose.totr.share.TotrSharePayload;
import com.sofascore.results.mvvm.base.AbstractActivity;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.qrf;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class z8e {
    public static final bk0 a = new bk0();
    public static final tc3 b = new tc3(-1534420452, new qs2(14), false);
    public static final tc3 c = new tc3(-1202409654, new pd3(14), false);
    public static final lqa[] d = new lqa[0];
    public static final KSerializer[] e = new KSerializer[0];
    public static final xlh f = new xlh(1);
    public static final ylh g = new ylh(1);
    public static final /* synthetic */ int h = 0;
    public static final /* synthetic */ int i = 0;
    public static final /* synthetic */ int j = 0;
    public static final /* synthetic */ int k = 0;
    public static final /* synthetic */ int l = 0;
    public static final /* synthetic */ int m = 0;

    /* JADX WARN: Removed duplicated region for block: B:12:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object A(ArrayList arrayList, ucd ucdVar, sq3 sq3Var) {
        fk0 fk0Var;
        int i2;
        wek wekVar;
        Iterator it;
        if (sq3Var instanceof fk0) {
            fk0Var = (fk0) sq3Var;
            int i3 = fk0Var.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                fk0Var.t = i3 - Integer.MIN_VALUE;
                Object obj = fk0Var.s;
                lu3 lu3Var = lu3.a;
                i2 = fk0Var.t;
                rq3 rq3Var = null;
                if (i2 != 0) {
                    y6a.M(obj);
                    ArrayList arrayList2 = new ArrayList(k13.r(arrayList, 10));
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        if (it2.next() != null) {
                            pvd.j();
                            return null;
                        }
                        ad2 ad2Var = oc3.a;
                        hs4 hs4Var = z45.a;
                        arrayList2.add(xw3.t(ad2Var, hq4.c, new l0(ucdVar, rq3Var, 17), 2));
                    }
                    fk0Var.r = ucdVar;
                    fk0Var.t = 1;
                    obj = m6k.u(arrayList2, fk0Var);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ucdVar = fk0Var.r;
                    y6a.M(obj);
                }
                ArrayList W = CollectionsKt.W((Iterable) obj);
                ucdVar.getClass();
                pv1 pv1Var = ucdVar.a;
                wekVar = pv1Var.e;
                if (wekVar != null) {
                    pv1Var.e = new wek(new vek(null, null, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE), Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE);
                } else if (wekVar.h == null) {
                    wekVar.h = new vek(null, null, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE);
                }
                it = W.iterator();
                if (it.hasNext()) {
                    return ucdVar;
                }
                throw lnb.i(it);
            }
        }
        fk0Var = new fk0(sq3Var);
        Object obj2 = fk0Var.s;
        lu3 lu3Var2 = lu3.a;
        i2 = fk0Var.t;
        rq3 rq3Var2 = null;
        if (i2 != 0) {
        }
        ArrayList W2 = CollectionsKt.W((Iterable) obj2);
        ucdVar.getClass();
        pv1 pv1Var2 = ucdVar.a;
        wekVar = pv1Var2.e;
        if (wekVar != null) {
        }
        it = W2.iterator();
        if (it.hasNext()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object B(long j2, Function1 function1, sq3 sq3Var) {
        gk6 gk6Var;
        int i2;
        long j3;
        long j4;
        int c2;
        if (sq3Var instanceof gk6) {
            gk6Var = (gk6) sq3Var;
            int i3 = gk6Var.v;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                gk6Var.v = i3 - Integer.MIN_VALUE;
                Object obj = gk6Var.u;
                Object obj2 = lu3.a;
                i2 = gk6Var.v;
                if (i2 != 0) {
                    y6a.M(obj);
                    xhj.a.getClass();
                    xuc.a.getClass();
                    long b2 = xuc.b();
                    gk6Var.t = null;
                    gk6Var.r = j2;
                    gk6Var.s = b2;
                    gk6Var.v = 1;
                    obj = function1.invoke(gk6Var);
                    if (obj != obj2) {
                        j3 = j2;
                        j4 = b2;
                    }
                    return obj2;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Object obj3 = gk6Var.t;
                    y6a.M(obj);
                    return obj3;
                }
                j4 = gk6Var.s;
                j3 = gk6Var.r;
                y6a.M(obj);
                dij dijVar = new dij(obj, whj.b(j4), null);
                long j5 = dijVar.b;
                long h2 = xd5.h(j3, j5);
                xd5.b.getClass();
                c2 = xd5.c(h2, 0L);
                Object obj4 = dijVar.a;
                if (c2 > 0) {
                    gk6Var.t = obj4;
                    gk6Var.r = j3;
                    gk6Var.s = j5;
                    gk6Var.v = 2;
                    if (n4o.z(h2, gk6Var) == obj2) {
                        return obj2;
                    }
                }
                return obj4;
            }
        }
        gk6Var = new gk6(sq3Var);
        Object obj5 = gk6Var.u;
        Object obj22 = lu3.a;
        i2 = gk6Var.v;
        if (i2 != 0) {
        }
        dij dijVar2 = new dij(obj5, whj.b(j4), null);
        long j52 = dijVar2.b;
        long h22 = xd5.h(j3, j52);
        xd5.b.getClass();
        c2 = xd5.c(h22, 0L);
        Object obj42 = dijVar2.a;
        if (c2 > 0) {
        }
        return obj42;
    }

    public static final void C(Activity activity, int i2, Intent intent) {
        activity.getClass();
        activity.setResult(i2, intent);
        activity.finish();
    }

    public static final String D(Double d2) {
        double s = yid.s(Math.abs(d2.doubleValue()), 2);
        return (0.01d > s || s > 0.09d) ? yid.c("%.1f", d2) : yid.c("%.2f", d2);
    }

    public static String E(long j2, boolean z, boolean z2) {
        long j3 = j2 / 60;
        long j4 = j2 % 60;
        String str = z2 ? "%02d" : "%d";
        if (!z) {
            return String.format(dla.d(), str, Long.valueOf(j3));
        }
        return String.format(dla.d(), str, Long.valueOf(j3)) + ":" + String.format(dla.d(), "%02d", Long.valueOf(j4));
    }

    public static final BasketballTeamSeasonStatistics F(c73 c73Var) {
        d73 d73Var = c73Var.c;
        TeamSeasonStatistics teamSeasonStatistics = d73Var != null ? d73Var.g : null;
        if (teamSeasonStatistics instanceof BasketballTeamSeasonStatistics) {
            return (BasketballTeamSeasonStatistics) teamSeasonStatistics;
        }
        return null;
    }

    public static final int G(of3 of3Var) {
        of3Var.getClass();
        return Long.hashCode(((av8) of3Var).T);
    }

    public static String H(StatusTime statusTime, int i2) {
        long initial = ((statusTime.getInitial() + (System.currentTimeMillis() / 1000)) + i2) - statusTime.getTimestamp();
        if (initial > statusTime.getMax()) {
            return ((long) Math.ceil(statusTime.getMax() / 60.0d)) + "'+";
        }
        return ((long) Math.ceil(initial / 60.0d)) + "'";
    }

    public static String I(Calendar calendar) {
        return ljg.j(TimeZone.getDefault().getOffset(calendar.getTime().getTime()) / 1000, "");
    }

    public static final void J(ViewGroup viewGroup, int i2) {
        viewGroup.getClass();
        int childCount = viewGroup.getChildCount();
        for (int i3 = i2 + 1; i3 < childCount; i3++) {
            View childAt = viewGroup.getChildAt(i3);
            childAt.getClass();
            childAt.setVisibility(8);
        }
    }

    public static String K(long j2, Context context) {
        Locale d2 = dla.d();
        long currentTimeMillis = (System.currentTimeMillis() / 1000) - j2;
        return currentTimeMillis > 86400 ? currentTimeMillis < 172800 ? context.getResources().getString(R.string.day_ago) : String.format(d2, context.getResources().getString(R.string.days_ago), Long.valueOf(currentTimeMillis / 86400)) : currentTimeMillis > 3600 ? currentTimeMillis < 7200 ? context.getResources().getString(R.string.hour_ago) : String.format(d2, context.getResources().getString(R.string.hours_ago), Long.valueOf(currentTimeMillis / 3600)) : currentTimeMillis > 60 ? currentTimeMillis < 120 ? context.getResources().getString(R.string.minute_ago) : String.format(d2, context.getResources().getString(R.string.minutes_ago), Long.valueOf(currentTimeMillis / 60)) : context.getResources().getString(R.string.now);
    }

    public static hq9 L(of3 of3Var) {
        av8 av8Var = (av8) of3Var;
        long j2 = ((r13) av8Var.k(lo3.a)).a;
        g23 g23Var = (g23) av8Var.k(i23.a);
        hq9 hq9Var = g23Var.c0;
        if (hq9Var == null) {
            long j3 = r13.h;
            hq9 hq9Var2 = new hq9(j3, j2, j3, r13.c(j2, l9i.a));
            g23Var.c0 = hq9Var2;
            hq9Var = hq9Var2;
        }
        long j4 = hq9Var.b;
        if (e8k.a(j4, j2)) {
            return hq9Var;
        }
        long c2 = r13.c(j2, l9i.a);
        long j5 = hq9Var.a;
        long j6 = hq9Var.c;
        if (j2 == 16) {
            j2 = j4;
        }
        if (c2 == 16) {
            c2 = hq9Var.d;
        }
        return new hq9(j5, j2, j6, c2);
    }

    public static final Integer M(List list, Function1 function1) {
        list.getClass();
        Iterator it = list.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            }
            if (((Boolean) function1.invoke(it.next())).booleanValue()) {
                break;
            }
            i2++;
        }
        if (i2 == -1) {
            return null;
        }
        return Integer.valueOf(i2);
    }

    public static final void N() {
        throw new IllegalStateException("Invalid applier");
    }

    public static final boolean O(Context context) {
        SharedPreferences d2;
        context.getClass();
        context.getClass();
        SharedPreferences sharedPreferences = uic.j;
        if (sharedPreferences == null) {
            Context applicationContext = context.getApplicationContext();
            synchronized (uic.i) {
                d2 = a5f.d(applicationContext);
                uic.j = d2;
            }
            d2.getClass();
            sharedPreferences = d2;
        }
        return sharedPreferences.getBoolean("PREF_AD_ADAPTER_INITIALISED", false);
    }

    public static final Double P(Integer num, BasketballTeamSeasonStatistics basketballTeamSeasonStatistics) {
        return td4.n0(num, basketballTeamSeasonStatistics != null ? basketballTeamSeasonStatistics.getMatches() : null);
    }

    public static final void Q(ht9 ht9Var, Context context, int i2, String str, Integer num) {
        context.getClass();
        R(ht9Var, context, context.getDrawable(i2), str, num);
    }

    public static final void R(ht9 ht9Var, Context context, Drawable drawable, String str, Integer num) {
        Drawable mutate;
        context.getClass();
        if (num != null) {
            int intValue = num.intValue();
            if (drawable != null && (mutate = drawable.mutate()) != null) {
                v9g.K(mutate, context.getColor(intValue));
            }
        }
        sl6 sl6Var = vt9.a;
        ht9Var.n = new yx7(drawable != null ? rfo.u(drawable) : null, 28);
        vt9.b(ht9Var, drawable);
        if (str != null) {
            ht9Var.c(str);
        }
    }

    public static final a S(of3 of3Var) {
        av8 av8Var = (av8) of3Var;
        av8Var.Z(206, sf3.e);
        if (av8Var.S) {
            mlh.y(av8Var.I);
        }
        Object G = av8Var.G();
        ev8 ev8Var = G instanceof ev8 ? (ev8) G : null;
        if (ev8Var == null) {
            ev8Var = new e4g(new yu8(new a(av8Var, av8Var.T, av8Var.q, av8Var.C, av8Var.h.t)), -1);
            av8Var.o0(ev8Var);
        }
        a aVar = ((yu8) ev8Var.a).a;
        ((eoh) aVar.f).setValue(av8Var.m());
        av8Var.s(false);
        return aVar;
    }

    public static final boolean T(View view, long j2) {
        view.getClass();
        Object tag = view.getTag(R.id.view_click_timestamp_tag);
        Long l2 = tag instanceof Long ? (Long) tag : null;
        long longValue = l2 != null ? l2.longValue() : 0L;
        long currentTimeMillis = System.currentTimeMillis();
        if (longValue + j2 >= currentTimeMillis) {
            return false;
        }
        view.setTag(R.id.view_click_timestamp_tag, Long.valueOf(currentTimeMillis));
        return true;
    }

    public static final void U(Context context, boolean z) {
        SharedPreferences d2;
        SharedPreferences sharedPreferences = uic.j;
        if (sharedPreferences == null) {
            Context applicationContext = context.getApplicationContext();
            synchronized (uic.i) {
                d2 = a5f.d(applicationContext);
                uic.j = d2;
            }
            d2.getClass();
            sharedPreferences = d2;
        }
        SharedPreferences.Editor i2 = dmi.i(sharedPreferences, "PREF_AD_ADAPTER_INITIALISED", z);
        Unit unit = Unit.a;
        i2.apply();
    }

    public static final void V(int i2, View view) {
        view.getClass();
        view.setBackgroundTintList(ColorStateList.valueOf(i2));
    }

    public static final void W(FragmentActivity fragmentActivity) {
        SharedPreferences d2;
        fragmentActivity.getClass();
        SharedPreferences sharedPreferences = uic.j;
        if (sharedPreferences == null) {
            Context applicationContext = fragmentActivity.getApplicationContext();
            synchronized (uic.i) {
                d2 = a5f.d(applicationContext);
                uic.j = d2;
            }
            d2.getClass();
            sharedPreferences = d2;
        }
        SharedPreferences.Editor i2 = dmi.i(sharedPreferences, "PREF_REMOVE_ADS_BANNER_CLICK", false);
        Unit unit = Unit.a;
        i2.apply();
    }

    public static final void X(SwipeRefreshLayout swipeRefreshLayout, Context context, Integer num) {
        swipeRefreshLayout.getClass();
        context.getClass();
        swipeRefreshLayout.setProgressBackgroundColorSchemeColor(context.getColor(R.color.surface_0));
        if (num != null) {
            swipeRefreshLayout.setColorSchemeColors(num.intValue());
        } else {
            swipeRefreshLayout.setColorSchemeColors(context.getColor(R.color.primary_default));
        }
    }

    public static final void Y(ImageView imageView, Context context, int i2) {
        context.getClass();
        imageView.setImageTintList(ColorStateList.valueOf(context.getColor(i2)));
    }

    public static final void Z(Context context) {
        SharedPreferences d2;
        SharedPreferences sharedPreferences = uic.j;
        if (sharedPreferences == null) {
            Context applicationContext = context.getApplicationContext();
            synchronized (uic.i) {
                d2 = a5f.d(applicationContext);
                uic.j = d2;
            }
            d2.getClass();
            sharedPreferences = d2;
        }
        SharedPreferences.Editor i2 = dmi.i(sharedPreferences, "PREF_REMOVE_ADS_PURCHASED", true);
        Unit unit = Unit.a;
        i2.apply();
    }

    public static final void a(zd7 zd7Var, xtc xtcVar, of3 of3Var, int i2) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1842788445);
        int i3 = i2 | (av8Var.g(zd7Var) ? 4 : 2) | (av8Var.g(xtcVar) ? 32 : 16);
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            Context context = (Context) av8Var.k(nz.b);
            kv1 kv1Var = uxf.p;
            ng0 ng0Var = new ng0(4.0f, true, new a70(6));
            xtc h2 = ljg.h(8.0f, fz8.d0(xtcVar, n9a.b), lz.D(R.color.surface_2, av8Var), 4.0f);
            u23 a2 = t23.a(ng0Var, kv1Var, av8Var, 54);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, h2);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            f50 f50Var = hf3.g;
            waa.K(av8Var, a2, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var, m2, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            String C2 = f5p.C(context, zd7Var.b, zd7Var.c);
            yf8 yf8Var = xth.a;
            udj.c(C2, null, lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.c(), av8Var, 0, 24960, 110586);
            utc utcVar = utc.a;
            kq9.b(s6a.N(R.drawable.team_logo_placeholder, 6, av8Var), null, bkh.l(utcVar, 16.0f), lz.D(R.color.neutral_default, av8Var), av8Var, 432, 0);
            mv1 mv1Var = uxf.g;
            xtc g2 = bkh.g(l98.c0(n9e.q(bkh.d(utcVar, 1.0f), lz.D(R.color.neutral_default, av8Var), o7g.a(4.0f)), 4.0f, 2.0f), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            k1c c2 = e12.c(mv1Var, false);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C3 = fqj.C(av8Var, g2);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, c2, f50Var);
            waa.K(av8Var, m3, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C3, f50Var3);
            q5a.w("-", null, lz.D(R.color.surface_1, av8Var), null, 0L, 0L, null, 0L, 0, false, 1, 0, xth.k(), av8Var, 6, 24576, 114682);
            av8Var = av8Var;
            av8Var.s(true);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new kz6(zd7Var, xtcVar, i2, 10);
        }
    }

    public static final void a0(final View view, final long j2, final Function0 function0) {
        view.getClass();
        view.setOnClickListener(new View.OnClickListener() { // from class: dk6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Function0 function02;
                if (!z8e.T(view, j2) || (function02 = function0) == null) {
                    return;
                }
                function02.invoke();
            }
        });
    }

    public static final void b(w12 w12Var, boolean z, Function0 function0, xtc xtcVar, of3 of3Var, int i2, int i3) {
        xtc xtcVar2;
        int i4;
        av8 av8Var;
        xtc xtcVar3;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(115217775);
        int i5 = i2 | (av8Var2.g(w12Var) ? 4 : 2) | (av8Var2.h(z) ? 32 : 16) | (av8Var2.i(function0) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        int i6 = i3 & 8;
        if (i6 != 0) {
            i4 = i5 | 3072;
            xtcVar2 = xtcVar;
        } else {
            xtcVar2 = xtcVar;
            i4 = i5 | (av8Var2.g(xtcVar2) ? com.ironsource.mediationsdk.metadata.a.o : 1024);
        }
        if (av8Var2.T(i4 & 1, (i4 & 1171) != 1170)) {
            utc utcVar = utc.a;
            xtc xtcVar4 = i6 != 0 ? utcVar : xtcVar2;
            xtc c2 = bkh.c(xtcVar4, 1.0f);
            long D = lz.D(R.color.n_lv_4, av8Var2);
            Object O = av8Var2.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = mz1.e(av8Var2);
            }
            wzc wzcVar = (wzc) O;
            Object[] objArr = new Object[0];
            Object O2 = av8Var2.O();
            if (O2 == a99Var) {
                O2 = b74.k;
                av8Var2.n0(O2);
            }
            xtc xtcVar5 = xtcVar4;
            xtc p = bkh.p(l98.d0(tol.y(c2, true, true, false, D, wzcVar, new gm(function0, (boh) o3a.N(objArr, (Function0) O2, av8Var2, 48), 14), av8Var2, 0), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1), w12Var.b ? 40.0f : 32.0f);
            l8g a2 = k8g.a(ww9.f, uxf.m, av8Var2, 54);
            int hashCode = Long.hashCode(av8Var2.T);
            aee m2 = av8Var2.m();
            xtc C = fqj.C(av8Var2, p);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, a2, hf3.g);
            waa.K(av8Var2, m2, hf3.f);
            waa.K(av8Var2, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var2, hf3.k);
            waa.K(av8Var2, C, hf3.d);
            String upperCase = w12Var.a.a(av8Var2).toUpperCase(Locale.ROOT);
            upperCase.getClass();
            long f2 = z ? ljg.f(av8Var2, -2024323266, R.color.primary_default, av8Var2, false) : ljg.f(av8Var2, -2024322476, R.color.n_lv_3, av8Var2, false);
            yf8 yf8Var = xth.a;
            q5a.w(upperCase, null, f2, null, 0L, 0L, new p7j(3), 0L, 0, false, 1, 0, dfj.a(xth.n(), 0L, 0L, null, null, 0L, null, 0, 1, 0L, null, null, 0, 16711679), av8Var2, 0, 24576, 113658);
            av8Var = av8Var2;
            if (z) {
                av8Var.d0(1670733251);
                kq9.b(s6a.N(R.drawable.ic_arrow_drop_down_16, 6, av8Var), null, bkh.l(utcVar, 10.0f), lz.D(R.color.primary_default, av8Var), av8Var, 432, 0);
                av8Var.s(false);
            } else {
                av8Var.d0(1671008407);
                av8Var.s(false);
            }
            av8Var.s(true);
            xtcVar3 = xtcVar5;
        } else {
            av8Var = av8Var2;
            av8Var.W();
            xtcVar3 = xtcVar2;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new s73(w12Var, z, function0, xtcVar3, i2, i3);
        }
    }

    public static void b0(RecyclerView recyclerView, Context context, final boolean z, boolean z2, final z4c z4cVar, int i2) {
        final int i3 = (i2 & 2) != 0 ? 1 : 0;
        if ((i2 & 4) != 0) {
            z = false;
        }
        if ((i2 & 8) != 0) {
            z2 = true;
        }
        if ((i2 & 16) != 0) {
            z4cVar = null;
        }
        recyclerView.getClass();
        context.getClass();
        recyclerView.setLayoutManager(new LinearLayoutManager(i3) { // from class: com.sofascore.results.mvvm.base.ExtensionKt$setUp$1
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.n
            public final void onLayoutCompleted(qrf qrfVar) {
                super.onLayoutCompleted(qrfVar);
                Function0 function0 = z4cVar;
                if (function0 != null) {
                    function0.invoke();
                }
            }

            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.n
            /* renamed from: supportsPredictiveItemAnimations, reason: from getter */
            public final boolean getA() {
                return z;
            }
        });
        recyclerView.setHasFixedSize(z2);
        recyclerView.setDescendantFocusability(131072);
        m itemAnimator = recyclerView.getItemAnimator();
        nq4 nq4Var = itemAnimator instanceof nq4 ? (nq4) itemAnimator : null;
        if (nq4Var != null) {
            nq4Var.g = z;
        }
    }

    public static final void c(String str, String str2, xtc xtcVar, of3 of3Var, int i2) {
        xtc xtcVar2;
        str.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(238019362);
        int i3 = i2 | (av8Var.g(str) ? 4 : 2) | (av8Var.g(str2) ? 32 : 16) | 384;
        if (av8Var.T(i3 & 1, (i3 & 147) != 146)) {
            n7g a2 = o7g.a(24.0f);
            utc utcVar = utc.a;
            xtc b0 = l98.b0(n9e.q(d2a.E(utcVar, 8.0f, a2, false, 0L, 28), lz.D(R.color.surface_1, av8Var), o7g.a(24.0f)), 8.0f);
            l8g a3 = k8g.a(ww9.b, uxf.l, av8Var, 0);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, b0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a3, hf3.g);
            waa.K(av8Var, m2, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            td4.k(str2, bkh.l(utcVar, 16.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, av8Var, ((i3 >> 3) & 14) | 48, 12);
            nq8.h(av8Var, bkh.p(utcVar, 4.0f));
            yf8 yf8Var = xth.a;
            udj.c(str, null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.b(), av8Var, i3 & 14, 24960, 110586);
            av8Var = av8Var;
            av8Var.s(true);
            xtcVar2 = utcVar;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new cv3(str, str2, xtcVar2, i2, 0);
        }
    }

    public static final boolean c0(BaseActivity baseActivity, long j2) {
        SharedPreferences d2;
        Iterator it = b.j(3, 7, 30).iterator();
        boolean z = false;
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            long currentTimeMillis = System.currentTimeMillis();
            SharedPreferences sharedPreferences = uic.j;
            if (sharedPreferences == null) {
                Context applicationContext = baseActivity.getApplicationContext();
                synchronized (uic.i) {
                    sharedPreferences = a5f.d(applicationContext);
                    uic.j = sharedPreferences;
                }
                sharedPreferences.getClass();
            }
            if (currentTimeMillis - sharedPreferences.getLong("PREF_FIRST_RUN_TIMESTAMP", 0L) <= intValue * 86400000) {
                break;
            }
            SharedPreferences sharedPreferences2 = uic.j;
            if (sharedPreferences2 == null) {
                Context applicationContext2 = baseActivity.getApplicationContext();
                synchronized (uic.i) {
                    sharedPreferences2 = a5f.d(applicationContext2);
                    uic.j = sharedPreferences2;
                }
                sharedPreferences2.getClass();
            }
            if (!sharedPreferences2.getBoolean(d0(intValue), false)) {
                SharedPreferences sharedPreferences3 = uic.j;
                if (sharedPreferences3 == null) {
                    Context applicationContext3 = baseActivity.getApplicationContext();
                    synchronized (uic.i) {
                        sharedPreferences3 = a5f.d(applicationContext3);
                        uic.j = sharedPreferences3;
                    }
                    sharedPreferences3.getClass();
                }
                SharedPreferences.Editor edit = sharedPreferences3.edit();
                edit.getClass();
                edit.putBoolean(d0(intValue), true);
                Unit unit = Unit.a;
                edit.apply();
                z = true;
            }
        }
        if (!z) {
            if (j2 > System.currentTimeMillis() - ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS) {
                SharedPreferences sharedPreferences4 = uic.j;
                if (sharedPreferences4 == null) {
                    Context applicationContext4 = baseActivity.getApplicationContext();
                    synchronized (uic.i) {
                        d2 = a5f.d(applicationContext4);
                        uic.j = d2;
                    }
                    d2.getClass();
                    sharedPreferences4 = d2;
                }
                if (sharedPreferences4.getBoolean("PREF_REMOVE_ADS_BANNER_CLICK", true)) {
                }
            }
            return false;
        }
        return true;
    }

    public static final void d(gv9 gv9Var, xtc xtcVar, of3 of3Var, int i2) {
        gv9 gv9Var2;
        xtc xtcVar2;
        Object obj;
        gv9Var.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(83179653);
        int i3 = i2 | (av8Var.g(gv9Var) ? 4 : 2) | 48;
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = e.f(((ps5) CollectionsKt.Y(gv9Var)).a);
                av8Var.n0(O);
            }
            e1d e1dVar = (e1d) O;
            Iterator<E> it = gv9Var.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (((ps5) obj).a.equals((r9k) e1dVar.getValue())) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            ps5 ps5Var = (ps5) obj;
            if (ps5Var == null) {
                ps5Var = (ps5) CollectionsKt.Y(gv9Var);
            }
            utc utcVar = utc.a;
            xtc d0 = l98.d0(n9e.q(bkh.d(utcVar, 1.0f), lz.D(R.color.surface_1, av8Var), o7g.a(16.0f)), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1);
            u23 a2 = t23.a(ww9.d, uxf.o, av8Var, 0);
            ps5 ps5Var2 = ps5Var;
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, d0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a2, hf3.g);
            waa.K(av8Var, m2, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            xtc f0 = l98.f0(l98.d0(utcVar, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
            String v = oea.v(R.string.tennis_ai_match_forecast_title, av8Var);
            yf8 yf8Var = xth.a;
            xtcVar2 = utcVar;
            udj.c(v, f0, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.j(), av8Var, 48, 0, 131064);
            av8 av8Var2 = av8Var;
            ps5 ps5Var3 = (ps5) CollectionsKt.firstOrNull(gv9Var);
            q9k q9kVar = ps5Var3 != null ? ps5Var3.b : null;
            if (q9kVar == null) {
                av8Var2.d0(1450679553);
                av8Var2.s(false);
            } else {
                av8Var2.d0(1450679554);
                udj.c(q9kVar.a(av8Var2), l98.d0(xtcVar2, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), lz.D(R.color.n_lv_3, av8Var2), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), av8Var2, 48, 0, 131064);
                av8Var2 = av8Var2;
                Unit unit = Unit.a;
                av8Var2.s(false);
            }
            av8Var2.d0(1570826265);
            gv9Var2 = gv9Var;
            ArrayList arrayList = new ArrayList(k13.r(gv9Var2, 10));
            Iterator<E> it2 = gv9Var2.iterator();
            while (it2.hasNext()) {
                q9k q9kVar2 = ((ps5) it2.next()).a;
                arrayList.add(new s1h(q9kVar2, q9kVar2.a(av8Var2), true));
            }
            av8Var2.s(false);
            b7 Z = l6g.Z(arrayList);
            r9k r9kVar = (r9k) e1dVar.getValue();
            Object O2 = av8Var2.O();
            if (O2 == a99Var) {
                O2 = new w30(24, e1dVar);
                av8Var2.n0(O2);
            }
            av8 av8Var3 = av8Var2;
            l4a.a(Z, r9kVar, (Function1) O2, l98.d0(xtcVar2, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), null, false, av8Var3, 3456, 48);
            av8Var = av8Var3;
            av8Var.d0(1570835618);
            gv9<qs5> gv9Var3 = ps5Var2.c;
            gv9 gv9Var4 = ps5Var2.d;
            for (qs5 qs5Var : gv9Var3) {
                n9e.d(384, 8, av8Var, l98.d0(xtcVar2, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), qs5Var.a.a(av8Var), qs5Var.b.a(av8Var), qs5Var.c, null);
            }
            av8Var.s(false);
            if (gv9Var4.isEmpty()) {
                av8Var.d0(1451901171);
                av8Var.s(false);
            } else {
                av8Var.d0(1451624403);
                rha.c(oea.v(R.string.possible_outcomes, av8Var), null, null, av8Var, 0, 6);
                av8Var = av8Var;
                Iterator<E> it3 = gv9Var4.iterator();
                while (it3.hasNext()) {
                    e((rs5) it3.next(), null, av8Var, 0);
                }
                av8Var.s(false);
            }
            av8Var.s(true);
        } else {
            gv9Var2 = gv9Var;
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new y81(gv9Var2, xtcVar2, i2, 5);
        }
    }

    public static final String d0(int i2) {
        return lnb.k(i2, "remove_ads_banner_", "_days_passed");
    }

    public static final void e(rs5 rs5Var, xtc xtcVar, of3 of3Var, int i2) {
        xtc xtcVar2;
        rs5 rs5Var2 = rs5Var;
        rs5Var2.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1666498597);
        int i3 = i2 | (av8Var.g(rs5Var2) ? 4 : 2) | 48;
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            utc utcVar = utc.a;
            xtc c0 = l98.c0(bkh.d(utcVar, 1.0f), 16.0f, 8.0f);
            l8g a2 = k8g.a(ww9.b, uxf.m, av8Var, 48);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, c0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a2, hf3.g);
            waa.K(av8Var, m2, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            String a3 = rs5Var2.a.a(av8Var);
            yf8 yf8Var = xth.a;
            q5a.w(a3, bkh.p(utcVar, 32.0f), lz.D(R.color.n_lv_1, av8Var), null, 0L, 0L, null, 0L, 0, false, 0, 0, xth.e(), av8Var, 48, 0, 131064);
            nq8.h(av8Var, bkh.p(utcVar, 8.0f));
            td4.J(rs5Var.b, 48, av8Var, bkh.l(utcVar, 16.0f));
            nq8.h(av8Var, bkh.p(utcVar, 16.0f));
            udj.c(rs5Var.c, new goa(1.0f, true), lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.e(), av8Var, 0, 0, 131064);
            nq8.h(av8Var, bkh.p(utcVar, 16.0f));
            rs5Var2 = rs5Var;
            q5a.w(yid.q(rs5Var2.d, 1), null, lz.D(R.color.n_lv_1, av8Var), null, 0L, 0L, new p7j(6), 0L, 0, false, 0, 0, xth.e(), av8Var, 0, 0, 130042);
            av8Var = av8Var;
            av8Var.s(true);
            xtcVar2 = utcVar;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new ns4(rs5Var2, xtcVar2, i2, 11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e0(av4 av4Var, long j2, rq3 rq3Var) {
        hk6 hk6Var;
        int i2;
        long j3;
        long j4;
        int c2;
        if (rq3Var instanceof hk6) {
            hk6Var = (hk6) rq3Var;
            int i3 = hk6Var.v;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                hk6Var.v = i3 - Integer.MIN_VALUE;
                Object obj = hk6Var.u;
                Object obj2 = lu3.a;
                i2 = hk6Var.v;
                if (i2 != 0) {
                    y6a.M(obj);
                    xhj.a.getClass();
                    xuc.a.getClass();
                    long b2 = xuc.b();
                    hk6Var.r = null;
                    hk6Var.s = j2;
                    hk6Var.t = b2;
                    hk6Var.v = 1;
                    obj = av4Var.w(hk6Var);
                    if (obj != obj2) {
                        j3 = j2;
                        j4 = b2;
                    }
                    return obj2;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Object obj3 = hk6Var.r;
                    y6a.M(obj);
                    return obj3;
                }
                j4 = hk6Var.t;
                j3 = hk6Var.s;
                y6a.M(obj);
                dij dijVar = new dij(obj, whj.b(j4), null);
                long j5 = dijVar.b;
                long h2 = xd5.h(j3, j5);
                xd5.b.getClass();
                c2 = xd5.c(h2, 0L);
                Object obj4 = dijVar.a;
                if (c2 > 0) {
                    hk6Var.r = obj4;
                    hk6Var.s = j3;
                    hk6Var.t = j5;
                    hk6Var.v = 2;
                    if (n4o.z(h2, hk6Var) == obj2) {
                        return obj2;
                    }
                }
                return obj4;
            }
        }
        hk6Var = new hk6(rq3Var);
        Object obj5 = hk6Var.u;
        Object obj22 = lu3.a;
        i2 = hk6Var.v;
        if (i2 != 0) {
        }
        dij dijVar2 = new dij(obj5, whj.b(j4), null);
        long j52 = dijVar2.b;
        long h22 = xd5.h(j3, j52);
        xd5.b.getClass();
        c2 = xd5.c(h22, 0L);
        Object obj42 = dijVar2.a;
        if (c2 > 0) {
        }
        return obj42;
    }

    public static final void f(final gv9 gv9Var, final float f2, final boolean z, final qug qugVar, final boolean z2, final int i2, final boolean z3, final String str, final r9k r9kVar, final Function1 function1, final Function1 function12, final Function0 function0, final xtc xtcVar, of3 of3Var, final int i3) {
        boolean z4;
        av8 av8Var;
        float f3;
        int i4;
        boolean z5;
        String a2;
        float f4 = rd0.i;
        float f5 = rd0.h;
        gv9Var.getClass();
        qugVar.getClass();
        str.getClass();
        function1.getClass();
        function12.getClass();
        function0.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-1233037151);
        int i5 = i3 | (av8Var2.g(gv9Var) ? 4 : 2) | (av8Var2.d(f2) ? 32 : 16) | (av8Var2.h(z) ? 256 : 128) | (av8Var2.g(qugVar) ? com.ironsource.mediationsdk.metadata.a.o : 1024) | (av8Var2.h(z2) ? 16384 : 8192) | (av8Var2.e(i2) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE) | (av8Var2.h(z3) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (av8Var2.g(str) ? 8388608 : 4194304) | (av8Var2.g(r9kVar) ? 67108864 : 33554432) | (av8Var2.i(function1) ? 536870912 : 268435456);
        if (av8Var2.T(i5 & 1, ((i5 & 306783379) == 306783378 && ((((av8Var2.i(function12) ? (char) 4 : (char) 2) | (av8Var2.i(function0) ? ' ' : (char) 16)) | (av8Var2.g(xtcVar) ? (char) 256 : (char) 128)) & 147) == 146) ? false : true)) {
            final kx4 kx4Var = (kx4) av8Var2.k(dh3.h);
            Object O = av8Var2.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = hz8.G(g.a, av8Var2);
                av8Var2.n0(O);
            }
            final ku3 ku3Var = (ku3) O;
            float a3 = xt5.a(str) + 6.0f;
            if (z3) {
                a3 += 32.0f;
            }
            float f6 = a3;
            float f7 = z3 ? 40.0f : 49.0f;
            if (z3) {
                float f8 = rd0.j;
                f3 = 40.0f;
            } else {
                float f9 = rd0.k;
                f3 = 41.0f;
            }
            float b2 = llf.b(kx4Var.D0(f2), xt5.a(str), 104.0f);
            float H0 = kx4Var.H0(104.0f);
            boolean z6 = ((i5 & 14) == 4) | ((3670016 & i5) == 1048576);
            Object O2 = av8Var2.O();
            if (z6 || O2 == a99Var) {
                O2 = z3 ? l6g.W(CollectionsKt.S(gv9Var, 1)) : gv9Var;
                av8Var2.n0(O2);
            }
            final gv9 gv9Var2 = (gv9) O2;
            int i6 = i5 & 7168;
            boolean z7 = i6 == 2048;
            Object O3 = av8Var2.O();
            if (z7 || O3 == a99Var) {
                i4 = i5;
                O3 = goh.b(new fu5(qugVar, 1));
                av8Var2.n0(O3);
            } else {
                i4 = i5;
            }
            cdi cdiVar = (cdi) O3;
            boolean z8 = i6 == 2048;
            Object O4 = av8Var2.O();
            if (z8 || O4 == a99Var) {
                O4 = goh.b(new fu5(qugVar, 2));
                av8Var2.n0(O4);
            }
            cdi cdiVar2 = (cdi) O4;
            boolean z9 = ((Boolean) cdiVar.getValue()).booleanValue() && f2 >= H0;
            long D = lz.D(R.color.surface_1, av8Var2);
            jf9 jf9Var = oyn.e;
            xtc d2 = bkh.d(bkh.e(n9e.q(xtcVar, D, jf9Var), 48.0f), 1.0f);
            k1c c2 = e12.c(uxf.c, false);
            int hashCode = Long.hashCode(av8Var2.T);
            aee m2 = av8Var2.m();
            xtc C = fqj.C(av8Var2, d2);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            f50 f50Var = hf3.g;
            waa.K(av8Var2, c2, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var2, m2, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var2, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var2, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var2, C, f50Var3);
            xtc f0 = l98.f0(bkh.c, b2 + (z3 ? 40.0f : 49.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14);
            mv1 mv1Var = uxf.f;
            n12 n12Var = n12.a;
            int i7 = i4;
            z4 = z2;
            dy0.b(n12Var.a(f0, mv1Var), null, yqo.H(-1912545723, av8Var2, new ct8() { // from class: zu5
                @Override // defpackage.ct8
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    f50 f50Var4;
                    boolean z10;
                    ry ryVar2;
                    Function1 function13;
                    a99 a99Var2;
                    int i8;
                    zg3 zg3Var2;
                    f50 f50Var5;
                    int i9;
                    f50 f50Var6;
                    ff3 ff3Var2;
                    a99 a99Var3;
                    final gv9 gv9Var3;
                    final qug qugVar2;
                    boolean z11;
                    zu5 zu5Var = this;
                    s22 s22Var = (s22) obj;
                    of3 of3Var2 = (of3) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    s22Var.getClass();
                    if ((intValue & 6) == 0) {
                        intValue |= ((av8) of3Var2).g(s22Var) ? 4 : 2;
                    }
                    av8 av8Var3 = (av8) of3Var2;
                    if (av8Var3.T(intValue & 1, (intValue & 19) != 18)) {
                        boolean z12 = z3;
                        float c3 = s22Var.c();
                        if (z12) {
                            c3 -= 32.0f;
                        }
                        g28 g28Var = bkh.c;
                        lv1 lv1Var = uxf.m;
                        uxf uxfVar = ww9.c;
                        l8g a4 = k8g.a(uxfVar, lv1Var, av8Var3, 54);
                        int hashCode2 = Long.hashCode(av8Var3.T);
                        aee m3 = av8Var3.m();
                        xtc C2 = fqj.C(av8Var3, g28Var);
                        if3.k7.getClass();
                        zg3 zg3Var3 = hf3.b;
                        av8Var3.h0();
                        if (av8Var3.S) {
                            av8Var3.l(zg3Var3);
                        } else {
                            av8Var3.q0();
                        }
                        f50 f50Var7 = hf3.g;
                        waa.K(av8Var3, a4, f50Var7);
                        ff3 ff3Var3 = hf3.f;
                        waa.K(av8Var3, m3, ff3Var3);
                        Integer valueOf2 = Integer.valueOf(hashCode2);
                        f50 f50Var8 = hf3.j;
                        waa.K(av8Var3, valueOf2, f50Var8);
                        ry ryVar3 = hf3.k;
                        waa.J(av8Var3, ryVar3);
                        f50 f50Var9 = hf3.d;
                        waa.K(av8Var3, C2, f50Var9);
                        utc utcVar = utc.a;
                        int i10 = i2;
                        Function1 function14 = function1;
                        a99 a99Var4 = nf3.a;
                        if (z12) {
                            av8Var3.d0(-1703088660);
                            w12 w12Var = (w12) CollectionsKt.firstOrNull(gv9Var);
                            if (w12Var == null) {
                                av8Var3.d0(-1256140907);
                                av8Var3.s(false);
                                f50Var4 = f50Var7;
                                z10 = z12;
                                z11 = false;
                                ff3Var2 = ff3Var3;
                                ryVar2 = ryVar3;
                                function13 = function14;
                                a99Var2 = a99Var4;
                                i8 = i10;
                                zg3Var2 = zg3Var3;
                                f50Var5 = f50Var9;
                                f50Var6 = f50Var8;
                                i9 = 54;
                            } else {
                                av8Var3.d0(-1256140906);
                                ff3Var2 = ff3Var3;
                                boolean z13 = i10 == 0;
                                boolean g2 = av8Var3.g(function14);
                                Object O5 = av8Var3.O();
                                if (g2 || O5 == a99Var4) {
                                    z10 = z12;
                                    O5 = new is5(2, function14);
                                    av8Var3.n0(O5);
                                } else {
                                    z10 = z12;
                                }
                                a99Var2 = a99Var4;
                                ryVar2 = ryVar3;
                                i8 = i10;
                                function13 = function14;
                                f50Var6 = f50Var8;
                                f50Var4 = f50Var7;
                                zg3Var2 = zg3Var3;
                                f50Var5 = f50Var9;
                                i9 = 54;
                                z8e.b(w12Var, z13, (Function0) O5, n9e.q(utcVar, lz.D(R.color.surface_1, av8Var3), oyn.e), av8Var3, 0, 0);
                                Unit unit = Unit.a;
                                z11 = false;
                                av8Var3.s(false);
                            }
                            av8Var3.s(z11);
                        } else {
                            f50Var4 = f50Var7;
                            z10 = z12;
                            ryVar2 = ryVar3;
                            function13 = function14;
                            a99Var2 = a99Var4;
                            i8 = i10;
                            zg3Var2 = zg3Var3;
                            f50Var5 = f50Var9;
                            i9 = 54;
                            f50Var6 = f50Var8;
                            ff3Var2 = ff3Var3;
                            av8Var3.d0(-1255774207);
                            av8Var3.s(false);
                        }
                        xtc c4 = bkh.c(bkh.q(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, c3, 1), 1.0f);
                        boolean z14 = z && z2;
                        qug qugVar3 = qugVar;
                        xtc Z = hkg.Z(c4, qugVar3, z14, 12);
                        l8g a5 = k8g.a(uxfVar, lv1Var, av8Var3, i9);
                        int hashCode3 = Long.hashCode(av8Var3.T);
                        aee m4 = av8Var3.m();
                        xtc C3 = fqj.C(av8Var3, Z);
                        av8Var3.h0();
                        if (av8Var3.S) {
                            av8Var3.l(zg3Var2);
                        } else {
                            av8Var3.q0();
                        }
                        waa.K(av8Var3, a5, f50Var4);
                        waa.K(av8Var3, m4, ff3Var2);
                        bf3.s(hashCode3, av8Var3, f50Var6, av8Var3, ryVar2);
                        gv9 gv9Var4 = gv9Var2;
                        Iterator p = ljg.p(av8Var3, C3, f50Var5, -285205262, gv9Var4);
                        int i11 = 0;
                        while (p.hasNext()) {
                            Object next = p.next();
                            int i12 = i11 + 1;
                            if (i11 < 0) {
                                b.q();
                                throw null;
                            }
                            w12 w12Var2 = (w12) next;
                            int i13 = z10 ? i12 : i11;
                            int i14 = i8;
                            boolean z15 = i13 == i14;
                            boolean e2 = av8Var3.e(i13) | av8Var3.e(i11) | av8Var3.g(gv9Var4);
                            final float f10 = f2;
                            boolean d3 = e2 | av8Var3.d(f10);
                            final kx4 kx4Var2 = kx4Var;
                            boolean g3 = d3 | av8Var3.g(kx4Var2);
                            final ku3 ku3Var2 = ku3Var;
                            Iterator it = p;
                            final Function1 function15 = function13;
                            boolean i15 = g3 | av8Var3.i(ku3Var2) | av8Var3.g(qugVar3) | av8Var3.g(function15);
                            final Function1 function16 = function12;
                            boolean g4 = i15 | av8Var3.g(function16);
                            Object O6 = av8Var3.O();
                            if (g4) {
                                a99Var3 = a99Var2;
                            } else {
                                a99Var3 = a99Var2;
                                if (O6 != a99Var3) {
                                    gv9Var3 = gv9Var4;
                                    qugVar2 = qugVar3;
                                    z8e.b(w12Var2, z15, (Function0) O6, null, av8Var3, 0, 8);
                                    zu5Var = this;
                                    p = it;
                                    i11 = i12;
                                    i8 = i14;
                                    a99Var2 = a99Var3;
                                    gv9Var4 = gv9Var3;
                                    qugVar3 = qugVar2;
                                    function13 = function15;
                                }
                            }
                            gv9Var3 = gv9Var4;
                            final int i16 = i13;
                            final int i17 = i11;
                            qugVar2 = qugVar3;
                            O6 = new Function0() { // from class: bv5
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    int i18 = i16;
                                    function15.invoke(Integer.valueOf(i18));
                                    if (i18 >= 2) {
                                        kx4 kx4Var3 = kx4Var2;
                                        float H02 = kx4Var3.H0(44.0f);
                                        float H03 = kx4Var3.H0(104.0f);
                                        qug qugVar4 = qugVar2;
                                        float h2 = qugVar4.e.h();
                                        float f11 = f10;
                                        if ((H03 - f11) + h2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                            xw3.L(ku3Var2, null, null, new ev5(f11, H02, kx4Var3, qugVar4, function16, gv9Var3, i17, null), 3);
                                        }
                                    }
                                    return Unit.a;
                                }
                            };
                            av8Var3.n0(O6);
                            z8e.b(w12Var2, z15, (Function0) O6, null, av8Var3, 0, 8);
                            zu5Var = this;
                            p = it;
                            i11 = i12;
                            i8 = i14;
                            a99Var2 = a99Var3;
                            gv9Var4 = gv9Var3;
                            qugVar3 = qugVar2;
                            function13 = function15;
                        }
                        i.o(av8Var3, false, utcVar, 8.0f, av8Var3);
                        av8Var3.s(true);
                        av8Var3.s(true);
                    } else {
                        av8Var3.W();
                    }
                    return Unit.a;
                }
            }), av8Var2, 3072, 6);
            long D2 = lz.D(R.color.n_lv_4, av8Var2);
            Object O5 = av8Var2.O();
            if (O5 == a99Var) {
                O5 = mz1.e(av8Var2);
            }
            wzc wzcVar = (wzc) O5;
            Object[] objArr = new Object[0];
            Object O6 = av8Var2.O();
            if (O6 == a99Var) {
                O6 = b74.l;
                av8Var2.n0(O6);
            }
            gm gmVar = new gm((boh) o3a.N(objArr, (Function0) O6, av8Var2, 48), function0, 15);
            utc utcVar = utc.a;
            xtc a4 = n12Var.a(n9e.q(l98.f0(bkh.c(bkh.p(tol.y(utcVar, true, true, true, D2, wzcVar, gmVar, av8Var2, 0), (b2 < f6 ? f6 : b2) + f3), 1.0f), 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), lz.D(R.color.surface_1, av8Var2), jf9Var), mv1Var);
            l8g a5 = k8g.a(new ng0(2.0f, true, new a70(6)), uxf.m, av8Var2, 54);
            int hashCode2 = Long.hashCode(av8Var2.T);
            aee m3 = av8Var2.m();
            xtc C2 = fqj.C(av8Var2, a4);
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, a5, f50Var);
            waa.K(av8Var2, m3, ff3Var);
            bf3.s(hashCode2, av8Var2, f50Var2, av8Var2, ryVar);
            waa.K(av8Var2, C2, f50Var3);
            if (r9kVar == null) {
                av8Var2.d0(356857472);
                z5 = false;
                av8Var2.s(false);
                a2 = null;
            } else {
                z5 = false;
                av8Var2.d0(1812626849);
                a2 = r9kVar.a(av8Var2);
                av8Var2.s(false);
            }
            if (a2 == null) {
                a2 = "";
            }
            String str2 = a2;
            yf8 yf8Var = xth.a;
            q5a.w(str2, null, lz.D(R.color.primary_default, av8Var2), null, 0L, 0L, null, 0L, 2, false, 1, 0, xth.b(), av8Var2, 0, 24960, 110586);
            boolean z10 = z5;
            kq9.b(s6a.N(R.drawable.ic_info, 6, av8Var2), null, bkh.l(utcVar, 16.0f), lz.D(R.color.primary_default, av8Var2), av8Var2, 432, 0);
            av8Var2.s(true);
            n(((Boolean) cdiVar2.getValue()).booleanValue() ? R.drawable.ic_horiz_scroll_left_double : R.drawable.ic_advantage_arrow_left_8, 48, av8Var2, l98.f0(l98.f0(l98.f0(l98.f0(l98.f0(l98.f0(utcVar, 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), 24.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), b2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), z3 ? 32.0f : 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), (((Boolean) cdiVar.getValue()).booleanValue() || !z4) ? z10 : true, true);
            n(z9 ? R.drawable.ic_horiz_scroll_right_double : R.drawable.ic_advantage_arrow_right_8, 48, av8Var2, n12Var.a(utcVar, uxf.h), qugVar.d(), false);
            xtc d3 = bkh.d(n12Var.a(l98.f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 7), uxf.j), 1.0f);
            if (b2 >= f6) {
                f6 = b2;
            }
            xtc f02 = l98.f0(d3, f6 + f7 + 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14);
            if ((i7 & 57344) == 16384) {
                z10 = true;
            }
            Object O7 = av8Var2.O();
            if (z10 || O7 == a99Var) {
                O7 = new c31(z4, 1);
                av8Var2.n0(O7);
            }
            yso.c(qugVar, s02.M(f02, (Function1) O7), lz.D(R.color.primary_default, av8Var2), lz.D(R.color.n_lv_4, av8Var2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var2, (i7 >> 9) & 14);
            av8Var = av8Var2;
            av8Var.s(true);
        } else {
            z4 = z2;
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            final boolean z11 = z4;
            u.d = new Function2(f2, z, qugVar, z11, i2, z3, str, r9kVar, function1, function12, function0, xtcVar, i3) { // from class: av5
                public final /* synthetic */ float b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ qug d;
                public final /* synthetic */ boolean e;
                public final /* synthetic */ int f;
                public final /* synthetic */ boolean g;
                public final /* synthetic */ String h;
                public final /* synthetic */ r9k i;
                public final /* synthetic */ Function1 j;
                public final /* synthetic */ Function1 k;
                public final /* synthetic */ Function0 l;
                public final /* synthetic */ xtc m;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int K = aba.K(1);
                    z8e.f(gv9.this, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, (of3) obj, K);
                    return Unit.a;
                }
            };
        }
    }

    public static final void g(String str, String str2, String str3, boolean z, Function0 function0, xtc xtcVar, of3 of3Var, int i2) {
        int i3;
        int i4;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(774951622);
        int i5 = i2 | (av8Var.g(str) ? 4 : 2) | (av8Var.g(str2) ? 32 : 16) | (av8Var.g(str3) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.h(z) ? com.ironsource.mediationsdk.metadata.a.o : 1024) | (av8Var.i(function0) ? 16384 : 8192);
        if (av8Var.T(i5 & 1, (74899 & i5) != 74898)) {
            lv1 lv1Var = uxf.m;
            xtc d0 = l98.d0(n9e.q(bkh.d(xtcVar, 1.0f), lz.D(R.color.surface_1, av8Var), o7g.a(16.0f)), 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            l8g a2 = k8g.a(ww9.b, lv1Var, av8Var, 48);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, d0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a2, hf3.g);
            waa.K(av8Var, m2, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            String v = oea.v(R.string.average, av8Var);
            Locale locale = Locale.ROOT;
            String upperCase = v.toUpperCase(locale);
            upperCase.getClass();
            p8g p8gVar = p8g.a;
            utc utcVar = utc.a;
            i(str, upperCase, p8gVar.a(1.0f, utcVar, true), 0L, null, null, false, false, av8Var, i5 & 14, 248);
            if (z) {
                i3 = -1797357429;
                i4 = R.color.live;
            } else {
                i3 = -1797356949;
                i4 = R.color.n_lv_1;
            }
            long f2 = ljg.f(av8Var, i3, i4, av8Var, false);
            yf8 yf8Var = xth.a;
            dfj h2 = xth.h();
            String upperCase2 = oea.v(R.string.points, av8Var).toUpperCase(locale);
            upperCase2.getClass();
            i(str2, upperCase2, p8gVar.a(1.0f, utcVar, true), f2, h2, null, false, false, av8Var, (i5 >> 3) & 14, 224);
            String upperCase3 = oea.v(R.string.highest_points_scored, av8Var).toUpperCase(locale);
            upperCase3.getClass();
            i(str3, upperCase3, p8gVar.a(1.0f, utcVar, true), 0L, null, function0, true, false, av8Var, ((i5 >> 6) & 14) | 1572864 | (458752 & (i5 << 3)), 152);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new x64(str, str2, str3, z, function0, xtcVar, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v9 */
    public static final void h(a07 a07Var, FantasyCompetitionType fantasyCompetitionType, Function1 function1, boolean z, xtc xtcVar, of3 of3Var, int i2) {
        av8 av8Var;
        ff3 ff3Var;
        ry ryVar;
        f50 f50Var;
        zg3 zg3Var;
        int i3;
        ?? r10;
        float f2;
        float f3;
        int i4;
        av8 av8Var2;
        a07 a07Var2 = a07Var;
        a07Var2.getClass();
        int i5 = a07Var2.c;
        fantasyCompetitionType.getClass();
        function1.getClass();
        av8 av8Var3 = (av8) of3Var;
        av8Var3.f0(800138398);
        int i6 = i2 | (av8Var3.g(a07Var2) ? 4 : 2) | (av8Var3.i(function1) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var3.h(z) ? com.ironsource.mediationsdk.metadata.a.o : 1024);
        if (av8Var3.T(i6 & 1, (i6 & 9347) != 9346)) {
            xtc d2 = bkh.d(xtcVar, 1.0f);
            u23 a2 = t23.a(ww9.d, uxf.o, av8Var3, 0);
            int hashCode = Long.hashCode(av8Var3.T);
            aee m2 = av8Var3.m();
            xtc C = fqj.C(av8Var3, d2);
            if3.k7.getClass();
            zg3 zg3Var2 = hf3.b;
            av8Var3.h0();
            if (av8Var3.S) {
                av8Var3.l(zg3Var2);
            } else {
                av8Var3.q0();
            }
            f50 f50Var2 = hf3.g;
            waa.K(av8Var3, a2, f50Var2);
            ff3 ff3Var2 = hf3.f;
            waa.K(av8Var3, m2, ff3Var2);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var3 = hf3.j;
            waa.K(av8Var3, valueOf, f50Var3);
            ry ryVar2 = hf3.k;
            waa.J(av8Var3, ryVar2);
            f50 f50Var4 = hf3.d;
            waa.K(av8Var3, C, f50Var4);
            ng0 ng0Var = new ng0(8.0f, true, new a70(6));
            utc utcVar = utc.a;
            xtc d3 = bkh.d(utcVar, 1.0f);
            lv1 lv1Var = uxf.l;
            l8g a3 = k8g.a(ng0Var, lv1Var, av8Var3, 6);
            int hashCode2 = Long.hashCode(av8Var3.T);
            aee m3 = av8Var3.m();
            xtc C2 = fqj.C(av8Var3, d3);
            av8Var3.h0();
            if (av8Var3.S) {
                av8Var3.l(zg3Var2);
            } else {
                av8Var3.q0();
            }
            waa.K(av8Var3, a3, f50Var2);
            waa.K(av8Var3, m3, ff3Var2);
            bf3.s(hashCode2, av8Var3, f50Var3, av8Var3, ryVar2);
            waa.K(av8Var3, C2, f50Var4);
            int i7 = a07Var2.d;
            p8g p8gVar = p8g.a;
            if (i5 > 0) {
                av8Var3.d0(-1978926108);
                String v = oea.v(R.string.form, av8Var3);
                xtc a4 = p8gVar.a(i5, utcVar, true);
                f50Var = f50Var3;
                zg3Var = zg3Var2;
                ff3Var = ff3Var2;
                ryVar = ryVar2;
                i2a.f(v, a4, null, av8Var3, 0, 4);
                av8Var3.s(false);
            } else {
                ff3Var = ff3Var2;
                ryVar = ryVar2;
                f50Var = f50Var3;
                zg3Var = zg3Var2;
                av8Var3.d0(-1978705078);
                av8Var3.s(false);
            }
            if (i7 > 0) {
                av8Var3.d0(-1978634212);
                float f4 = i7;
                r10 = 1;
                i2a.f(oea.v(R.string.fixtures, av8Var3), p8gVar.a(f4, utcVar, true), null, av8Var3, 0, 4);
                i3 = 0;
                av8Var3.s(false);
            } else {
                i3 = 0;
                r10 = 1;
                av8Var3.d0(-1978405494);
                av8Var3.s(false);
            }
            av8Var3.s(r10);
            xtc Y = fz8.Y(bkh.d(utcVar, 1.0f), n9a.a);
            float f5 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            xtc d0 = l98.d0(Y, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, r10);
            l8g a5 = k8g.a(ww9.b, lv1Var, av8Var3, i3);
            int hashCode3 = Long.hashCode(av8Var3.T);
            aee m4 = av8Var3.m();
            xtc C3 = fqj.C(av8Var3, d0);
            av8Var3.h0();
            if (av8Var3.S) {
                av8Var3.l(zg3Var);
            } else {
                av8Var3.q0();
            }
            waa.K(av8Var3, a5, f50Var2);
            waa.K(av8Var3, m4, ff3Var);
            bf3.s(hashCode3, av8Var3, f50Var, av8Var3, ryVar);
            waa.K(av8Var3, C3, f50Var4);
            a07Var2 = a07Var;
            gv9 gv9Var = a07Var2.a;
            gv9 gv9Var2 = a07Var2.b;
            ArrayList w0 = CollectionsKt.w0(gv9Var2, gv9Var);
            av8Var3.d0(221470984);
            Iterator it = w0.iterator();
            int i8 = 0;
            av8 av8Var4 = av8Var3;
            while (it.hasNext()) {
                Object next = it.next();
                int i9 = i8 + 1;
                if (i8 < 0) {
                    b.q();
                    throw null;
                }
                zd7 zd7Var = (zd7) next;
                int size = zd7Var.d.size();
                if (size == 0) {
                    f2 = f5;
                    f3 = 8.0f;
                    av8Var4.d0(-1599557139);
                    i4 = 1;
                    a(zd7Var, p8gVar.a(1.0f, bkh.c(utcVar, 1.0f), true), av8Var4, 0);
                    av8Var4.s(false);
                    Unit unit = Unit.a;
                    av8Var2 = av8Var4;
                } else if (size != 1) {
                    av8Var4.d0(-1598798166);
                    f2 = f5;
                    f3 = 8.0f;
                    av8 av8Var5 = av8Var4;
                    m(zd7Var, function1, z, p8gVar.a(zd7Var.d.size() > 2 ? 2.0f : 1.0f, bkh.c(utcVar, 1.0f), true), av8Var5, (i6 >> 3) & 1008);
                    av8 av8Var6 = av8Var5;
                    av8Var6.s(false);
                    Unit unit2 = Unit.a;
                    i4 = 1;
                    av8Var2 = av8Var6;
                } else {
                    f2 = f5;
                    f3 = 8.0f;
                    av8Var4.d0(-1599240722);
                    av8 av8Var7 = av8Var4;
                    p(zd7Var, function1, z, p8gVar.a(1.0f, bkh.c(utcVar, 1.0f), true), av8Var7, (i6 >> 3) & 1008);
                    av8 av8Var8 = av8Var7;
                    av8Var8.s(false);
                    Unit unit3 = Unit.a;
                    i4 = 1;
                    av8Var2 = av8Var8;
                }
                nq8.h(av8Var2, bkh.p(utcVar, (gv9Var.isEmpty() || gv9Var2.isEmpty() || i8 != gv9Var.size() - i4) ? i8 == w0.size() - i4 ? f2 : 4.0f : f3));
                i8 = i9;
                f5 = f2;
                av8Var4 = av8Var2;
            }
            ljg.t(av8Var4, false, true, true);
            av8Var = av8Var4;
        } else {
            av8Var3.W();
            av8Var = av8Var3;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new f70(a07Var2, fantasyCompetitionType, function1, z, xtcVar, i2, 5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x034f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void i(String str, String str2, xtc xtcVar, long j2, dfj dfjVar, Function0 function0, boolean z, boolean z2, of3 of3Var, int i2, int i3) {
        int i4;
        dfj dfjVar2;
        Function0 function02;
        int i5;
        boolean z3;
        int i6;
        boolean z4;
        long j3;
        dfj dfjVar3;
        Function0 function03;
        boolean z5;
        eqf u;
        long j4;
        dfj dfjVar4;
        int i7;
        Function0 function04;
        boolean z6;
        long j5;
        long j6;
        kg0 kg0Var;
        boolean z7;
        float f2;
        Function0 function05;
        utc utcVar;
        kv1 kv1Var;
        av8 av8Var;
        String str3;
        boolean z8;
        long j7;
        int i8;
        int i9;
        str.getClass();
        str2.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(351101179);
        if ((i2 & 6) == 0) {
            i4 = (av8Var2.g(str) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= av8Var2.g(str2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= av8Var2.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i2 & 3072) == 0) {
            if ((i3 & 8) == 0 && av8Var2.f(j2)) {
                i9 = com.ironsource.mediationsdk.metadata.a.o;
                i4 |= i9;
            }
            i9 = 1024;
            i4 |= i9;
        }
        if ((i2 & 24576) == 0) {
            if ((i3 & 16) == 0) {
                dfjVar2 = dfjVar;
                if (av8Var2.g(dfjVar2)) {
                    i8 = 16384;
                    i4 |= i8;
                }
            } else {
                dfjVar2 = dfjVar;
            }
            i8 = 8192;
            i4 |= i8;
        } else {
            dfjVar2 = dfjVar;
        }
        int i10 = i3 & 32;
        if (i10 != 0) {
            i4 |= 196608;
        } else if ((196608 & i2) == 0) {
            function02 = function0;
            i4 |= av8Var2.i(function02) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
            i5 = i3 & 64;
            if (i5 == 0) {
                i4 |= 1572864;
            } else if ((1572864 & i2) == 0) {
                z3 = z;
                i4 |= av8Var2.h(z3) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
                i6 = i3 & 128;
                if (i6 != 0) {
                    i4 |= 12582912;
                    z4 = z2;
                } else {
                    z4 = z2;
                    if ((i2 & 12582912) == 0) {
                        i4 |= av8Var2.h(z4) ? 8388608 : 4194304;
                    }
                }
                if (av8Var2.T(i4 & 1, (i4 & 4793491) != 4793490)) {
                    av8Var2.Y();
                    if ((i2 & 1) == 0 || av8Var2.B()) {
                        if ((i3 & 8) != 0) {
                            j4 = lz.D(R.color.n_lv_1, av8Var2);
                            i4 &= -7169;
                        } else {
                            j4 = j2;
                        }
                        if ((i3 & 16) != 0) {
                            yf8 yf8Var = xth.a;
                            dfjVar4 = xth.j();
                            i4 &= -57345;
                        } else {
                            dfjVar4 = dfjVar2;
                        }
                        Function0 function06 = i10 != 0 ? null : function02;
                        if (i5 != 0) {
                            z3 = false;
                        }
                        i7 = i4;
                        dfjVar2 = dfjVar4;
                        function04 = function06;
                        z6 = z3;
                        j5 = j4;
                        if (i6 != 0) {
                            z4 = false;
                        }
                    } else {
                        av8Var2.W();
                        if ((i3 & 8) != 0) {
                            i4 &= -7169;
                        }
                        if ((i3 & 16) != 0) {
                            i4 &= -57345;
                        }
                        j5 = j2;
                        i7 = i4;
                        function04 = function02;
                        z6 = z3;
                    }
                    av8Var2.t();
                    String str4 = (!z6 || function04 == null) ? "" : ((Configuration) av8Var2.k(nz.a)).getLayoutDirection() == 1 ? " ←" : " →";
                    kg0 kg0Var2 = ww9.f;
                    kv1 kv1Var2 = uxf.p;
                    av8Var2.d0(-1894160035);
                    xtc A = wnn.A(xtcVar, o7g.a(8.0f));
                    String str5 = str4;
                    utc utcVar2 = utc.a;
                    if (function04 != null) {
                        boolean z9 = (i7 & 458752) == 131072;
                        Object O = av8Var2.O();
                        if (z9 || O == nf3.a) {
                            O = new v61(24, function04);
                            av8Var2.n0(O);
                        }
                        Function0 function07 = (Function0) O;
                        kg0Var = kg0Var2;
                        str3 = str5;
                        j6 = j5;
                        z7 = false;
                        f2 = 8.0f;
                        function05 = function04;
                        kv1Var = kv1Var2;
                        xtc y = tol.y(utcVar2, false, false, false, 0L, null, function07, av8Var2, 31);
                        utcVar = utcVar2;
                        av8Var = av8Var2;
                        A = A.z(y);
                    } else {
                        j6 = j5;
                        kg0Var = kg0Var2;
                        z7 = false;
                        f2 = 8.0f;
                        function05 = function04;
                        utcVar = utcVar2;
                        kv1Var = kv1Var2;
                        av8Var = av8Var2;
                        str3 = str5;
                    }
                    av8Var.s(z7);
                    xtc d0 = l98.d0(A, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, 1);
                    u23 a2 = t23.a(kg0Var, kv1Var, av8Var, 54);
                    int hashCode = Long.hashCode(av8Var.T);
                    aee m2 = av8Var.m();
                    xtc C = fqj.C(av8Var, d0);
                    if3.k7.getClass();
                    zg3 zg3Var = hf3.b;
                    av8Var.h0();
                    if (av8Var.S) {
                        av8Var.l(zg3Var);
                    } else {
                        av8Var.q0();
                    }
                    f50 f50Var = hf3.g;
                    waa.K(av8Var, a2, f50Var);
                    ff3 ff3Var = hf3.f;
                    waa.K(av8Var, m2, ff3Var);
                    Integer valueOf = Integer.valueOf(hashCode);
                    f50 f50Var2 = hf3.j;
                    waa.K(av8Var, valueOf, f50Var2);
                    ry ryVar = hf3.k;
                    waa.J(av8Var, ryVar);
                    f50 f50Var3 = hf3.d;
                    waa.K(av8Var, C, f50Var3);
                    dfj dfjVar5 = dfjVar2;
                    boolean z10 = z6;
                    l8g a3 = k8g.a(ww9.b, uxf.m, av8Var, 48);
                    int hashCode2 = Long.hashCode(av8Var.T);
                    aee m3 = av8Var.m();
                    boolean z11 = z4;
                    xtc C2 = fqj.C(av8Var, utcVar);
                    av8Var.h0();
                    if (av8Var.S) {
                        av8Var.l(zg3Var);
                    } else {
                        av8Var.q0();
                    }
                    waa.K(av8Var, a3, f50Var);
                    waa.K(av8Var, m3, ff3Var);
                    bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
                    waa.K(av8Var, C2, f50Var3);
                    long D = lz.D(R.color.n_lv_3, av8Var);
                    yf8 yf8Var2 = xth.a;
                    utc utcVar3 = utcVar;
                    av8 av8Var3 = av8Var;
                    udj.c(str2, null, D, null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.c(), av8Var3, (i7 >> 3) & 14, 24960, 110586);
                    av8 av8Var4 = av8Var3;
                    if (z11) {
                        ljg.r(4.0f, -1952373447, av8Var4, av8Var4, utcVar3);
                        kq9.b(s6a.N(R.drawable.ic_info, 6, av8Var4), null, bkh.l(utcVar3, 12.0f), lz.D(R.color.primary_default, av8Var4), av8Var4, 432, 0);
                        av8Var4 = av8Var4;
                        z8 = false;
                        av8Var4.s(false);
                    } else {
                        z8 = false;
                        av8Var4.d0(-1952046707);
                        av8Var4.s(false);
                    }
                    av8Var4.s(true);
                    String concat = str.concat(str3);
                    if (!z10 || function05 == null) {
                        av8Var4.d0(2131370299);
                        av8Var4.s(z8);
                        j7 = j6;
                    } else {
                        j7 = ljg.f(av8Var4, 2131369508, R.color.primary_default, av8Var4, z8);
                    }
                    av8 av8Var5 = av8Var4;
                    udj.c(concat, null, j7, null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, dfjVar5, av8Var5, 0, ((i7 << 9) & 29360128) | 24960, 110586);
                    av8Var2 = av8Var5;
                    av8Var2.s(true);
                    function03 = function05;
                    j3 = j6;
                    z5 = z10;
                    z4 = z11;
                    dfjVar3 = dfjVar5;
                } else {
                    av8Var2.W();
                    j3 = j2;
                    dfjVar3 = dfjVar2;
                    function03 = function02;
                    z5 = z3;
                }
                u = av8Var2.u();
                if (u != null) {
                    u.d = new v77(str, str2, xtcVar, j3, dfjVar3, function03, z5, z4, i2, i3);
                    return;
                }
                return;
            }
            z3 = z;
            i6 = i3 & 128;
            if (i6 != 0) {
            }
            if (av8Var2.T(i4 & 1, (i4 & 4793491) != 4793490)) {
            }
            u = av8Var2.u();
            if (u != null) {
            }
        }
        function02 = function0;
        i5 = i3 & 64;
        if (i5 == 0) {
        }
        z3 = z;
        i6 = i3 & 128;
        if (i6 != 0) {
        }
        if (av8Var2.T(i4 & 1, (i4 & 4793491) != 4793490)) {
        }
        u = av8Var2.u();
        if (u != null) {
        }
    }

    public static final void j(lj7 lj7Var, int i2, boolean z, xtc xtcVar, of3 of3Var, int i3) {
        lj7Var.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-40265518);
        int i4 = i3 | (av8Var.g(lj7Var) ? 4 : 2) | (av8Var.e(i2) ? 32 : 16) | (av8Var.h(z) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.g(xtcVar) ? com.ironsource.mediationsdk.metadata.a.o : 1024);
        if (av8Var.T(i4 & 1, (i4 & 1171) != 1170)) {
            un0.a(xtcVar, o7g.a(12.0f), rd0.t(lz.D(R.color.surface_2, av8Var), av8Var, 0), rd0.u(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 62), null, yqo.H(427369120, av8Var, new ak(lj7Var, (Context) av8Var.k(nz.b), z, i2)), av8Var, ((i4 >> 9) & 14) | 196608, 16);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new di(i2, i3, 7, lj7Var, xtcVar, z);
        }
    }

    public static final void k(dh8 dh8Var, Function1 function1, xtc xtcVar, of3 of3Var, int i2) {
        int i3;
        av8 av8Var;
        tc3 tc3Var;
        int i4;
        function1.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-781956600);
        int i5 = 2;
        if ((i2 & 6) == 0) {
            i3 = (av8Var2.i(dh8Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var2.i(function1) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= av8Var2.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        int i6 = 0;
        int i7 = 1;
        if (av8Var2.T(i3 & 1, (i3 & 147) != 146)) {
            int i8 = dh8Var.g;
            x43 x43Var = dh8Var.r;
            boolean z = dh8Var.e;
            String str = dh8Var.h;
            String str2 = dh8Var.i;
            tc3 H = yqo.H(2050847022, av8Var2, new zg8(dh8Var, i6));
            tc3 H2 = yqo.H(-52426264, av8Var2, new zg8(dh8Var, i7));
            tc3 H3 = yqo.H(-773345686, av8Var2, new zg8(dh8Var, i5));
            int i9 = i3 & 112;
            boolean i10 = (i9 == 32) | av8Var2.i(dh8Var);
            Object O = av8Var2.O();
            a99 a99Var = nf3.a;
            if (i10 || O == a99Var) {
                tc3Var = H3;
                i4 = 0;
                O = new ah8(function1, dh8Var, i4);
                av8Var2.n0(O);
            } else {
                tc3Var = H3;
                i4 = 0;
            }
            Function0 function0 = (Function0) O;
            if (i9 == 32) {
                i4 = 1;
            }
            int i11 = i4 | (av8Var2.i(dh8Var) ? 1 : 0);
            Object O2 = av8Var2.O();
            if (i11 != 0 || O2 == a99Var) {
                O2 = new ah8(function1, dh8Var, 1);
                av8Var2.n0(O2);
            }
            av8Var = av8Var2;
            pco.a(i8, x43Var, xtcVar, H, H2, null, tc3Var, null, str, str2, false, z, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, function1, function0, (Function0) O2, av8Var, (i3 & 896) | 1600512, ((i3 << 15) & 3670016) | 24576, 46240);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new bh8(dh8Var, function1, xtcVar, i2, 0);
        }
    }

    public static final void l(int i2, int i3, int i4, of3 of3Var, xtc xtcVar) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1702597300);
        int i5 = i4 | (av8Var.e(i2) ? 4 : 2) | (av8Var.e(i3) ? 32 : 16);
        if (av8Var.T(i5 & 1, (i5 & 147) != 146)) {
            l8g a2 = k8g.a(ww9.b, uxf.m, av8Var, 48);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, xtcVar);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a2, hf3.g);
            waa.K(av8Var, m2, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            kq9.b(s6a.N(i2, ((i5 << 3) & 112) | 6, av8Var), null, null, lz.D(R.color.primary_default, av8Var), av8Var, 48, 4);
            xtc f0 = l98.f0(utc.a, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14);
            String v = oea.v(i3, av8Var);
            long D = lz.D(R.color.n_lv_1, av8Var);
            yf8 yf8Var = xth.a;
            udj.c(v, f0, D, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.j(), av8Var, 48, 0, 131064);
            av8Var = av8Var;
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new hn1(i2, i3, xtcVar, i4, 3);
        }
    }

    public static final void m(zd7 zd7Var, Function1 function1, boolean z, xtc xtcVar, of3 of3Var, int i2) {
        int i3;
        boolean z2;
        int i4;
        int i5;
        boolean z3;
        boolean z4;
        long j2;
        Iterator it;
        f50 f50Var;
        gv9 gv9Var;
        lv1 lv1Var;
        kv1 kv1Var;
        ry ryVar;
        f50 f50Var2;
        zg3 zg3Var;
        ff3 ff3Var;
        p68 p68Var;
        f50 f50Var3;
        long j3;
        float f2;
        boolean z5;
        mv1 mv1Var;
        float f3;
        boolean z6;
        boolean z7;
        ImageVector N;
        mv1 mv1Var2 = uxf.g;
        lv1 lv1Var2 = uxf.l;
        kv1 kv1Var2 = uxf.p;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1777753151);
        if ((i2 & 6) == 0) {
            i3 = (av8Var.g(zd7Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var.i(function1) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= av8Var.h(z) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= av8Var.g(xtcVar) ? com.ironsource.mediationsdk.metadata.a.o : 1024;
        }
        if (av8Var.T(i3 & 1, (i3 & 1171) != 1170)) {
            Context context = (Context) av8Var.k(nz.b);
            gv9 gv9Var2 = zd7Var.d;
            if (gv9Var2 == null || !gv9Var2.isEmpty()) {
                Iterator<E> it2 = gv9Var2.iterator();
                while (it2.hasNext()) {
                    if (!Intrinsics.c(((FantasyPlayerFixtureUiModel) it2.next()).n, StatusKt.STATUS_FINISHED)) {
                        z2 = false;
                        break;
                    }
                }
            }
            z2 = true;
            xtc q = n9e.q(wnn.A(xtcVar, o7g.a(8.0f)), lz.D(R.color.surface_2, av8Var), oyn.e);
            k1c c2 = e12.c(uxf.c, false);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, q);
            if3.k7.getClass();
            zg3 zg3Var2 = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var2);
            } else {
                av8Var.q0();
            }
            f50 f50Var4 = hf3.g;
            waa.K(av8Var, c2, f50Var4);
            ff3 ff3Var2 = hf3.f;
            waa.K(av8Var, m2, ff3Var2);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var5 = hf3.j;
            waa.K(av8Var, valueOf, f50Var5);
            ry ryVar2 = hf3.k;
            waa.J(av8Var, ryVar2);
            f50 f50Var6 = hf3.d;
            waa.K(av8Var, C, f50Var6);
            ng0 ng0Var = new ng0(4.0f, true, new a70(6));
            utc utcVar = utc.a;
            xtc b0 = l98.b0(utcVar, 4.0f);
            u23 a2 = t23.a(ng0Var, kv1Var2, av8Var, 54);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C2 = fqj.C(av8Var, b0);
            av8Var.h0();
            mv1 mv1Var3 = mv1Var2;
            if (av8Var.S) {
                av8Var.l(zg3Var2);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a2, f50Var4);
            waa.K(av8Var, m3, ff3Var2);
            bf3.s(hashCode2, av8Var, f50Var5, av8Var, ryVar2);
            waa.K(av8Var, C2, f50Var6);
            String C3 = f5p.C(context, zd7Var.b, zd7Var.c);
            yf8 yf8Var = xth.a;
            boolean z8 = true;
            gv9 gv9Var3 = gv9Var2;
            udj.c(C3, null, lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.c(), av8Var, 0, 24960, 110586);
            av8Var = av8Var;
            float f4 = 1.0f;
            xtc d2 = bkh.d(utcVar, 1.0f);
            float f5 = 2.0f;
            l8g a3 = k8g.a(new ng0(2.0f, true, new a70(6)), lv1Var2, av8Var, 6);
            int hashCode3 = Long.hashCode(av8Var.T);
            aee m4 = av8Var.m();
            xtc C4 = fqj.C(av8Var, d2);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var2);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a3, f50Var4);
            waa.K(av8Var, m4, ff3Var2);
            bf3.s(hashCode3, av8Var, f50Var5, av8Var, ryVar2);
            Iterator p = ljg.p(av8Var, C4, f50Var6, 1182562341, gv9Var3);
            while (p.hasNext()) {
                FantasyPlayerFixtureUiModel fantasyPlayerFixtureUiModel = (FantasyPlayerFixtureUiModel) p.next();
                Integer num = fantasyPlayerFixtureUiModel.q;
                p68 p68Var2 = fantasyPlayerFixtureUiModel.o;
                boolean z9 = (num == null || fantasyPlayerFixtureUiModel.s == null || fantasyPlayerFixtureUiModel.t == null) ? false : z8;
                if (z9) {
                    j2 = ljg.f(av8Var, 662224074, R.color.surface_P, av8Var, false);
                } else {
                    av8Var.d0(662317074);
                    o68 o68Var = fantasyPlayerFixtureUiModel.p;
                    r13 r13Var = null;
                    Integer valueOf2 = o68Var != null ? Integer.valueOf(o68Var.a) : null;
                    if (valueOf2 == null) {
                        av8Var.d0(662351917);
                        z4 = false;
                        av8Var.s(false);
                    } else {
                        z4 = false;
                        r13Var = new r13(wv8.b(av8Var, 662351918, valueOf2, av8Var, false));
                    }
                    if (r13Var == null) {
                        j2 = ljg.f(av8Var, 1268293102, R.color.neutral_default, av8Var, z4);
                    } else {
                        av8Var.d0(1268291056);
                        av8Var.s(z4);
                        j2 = r13Var.a;
                    }
                    av8Var.s(z4);
                }
                ng0 ng0Var2 = new ng0(4.0f, z8, new a70(6));
                goa goaVar = new goa(f4, z8);
                u23 a4 = t23.a(ng0Var2, kv1Var2, av8Var, 54);
                long j4 = j2;
                int hashCode4 = Long.hashCode(av8Var.T);
                aee m5 = av8Var.m();
                xtc C5 = fqj.C(av8Var, goaVar);
                if3.k7.getClass();
                zg3 zg3Var3 = hf3.b;
                av8Var.h0();
                if (av8Var.S) {
                    av8Var.l(zg3Var3);
                } else {
                    av8Var.q0();
                }
                f50 f50Var7 = hf3.g;
                waa.K(av8Var, a4, f50Var7);
                ff3 ff3Var3 = hf3.f;
                waa.K(av8Var, m5, ff3Var3);
                Integer valueOf3 = Integer.valueOf(hashCode4);
                f50 f50Var8 = hf3.j;
                waa.K(av8Var, valueOf3, f50Var8);
                ry ryVar3 = hf3.k;
                waa.J(av8Var, ryVar3);
                f50 f50Var9 = hf3.d;
                waa.K(av8Var, C5, f50Var9);
                if (z) {
                    av8Var.d0(1876387932);
                    String str = fantasyPlayerFixtureUiModel.h;
                    yf8 yf8Var2 = xth.a;
                    it = p;
                    av8 av8Var2 = av8Var;
                    f50Var2 = f50Var8;
                    p68Var = p68Var2;
                    f50Var = f50Var9;
                    kv1Var = kv1Var2;
                    zg3Var = zg3Var3;
                    ryVar = ryVar3;
                    j3 = j4;
                    f2 = 16.0f;
                    gv9Var = gv9Var3;
                    lv1Var = lv1Var2;
                    ff3Var = ff3Var3;
                    f50Var3 = f50Var7;
                    udj.c(str, null, lz.D(R.color.n_lv_1, av8Var), new es0(v8a.v(6), v8a.v(11), v8a.u(0.25d)), 0L, null, 0L, null, null, 0L, 0, false, 1, 0, null, xth.k(), av8Var2, 0, 24576, 114674);
                    av8Var = av8Var2;
                    z5 = false;
                    av8Var.s(false);
                } else {
                    it = p;
                    f50Var = f50Var9;
                    gv9Var = gv9Var3;
                    lv1Var = lv1Var2;
                    kv1Var = kv1Var2;
                    ryVar = ryVar3;
                    f50Var2 = f50Var8;
                    zg3Var = zg3Var3;
                    ff3Var = ff3Var3;
                    p68Var = p68Var2;
                    f50Var3 = f50Var7;
                    j3 = j4;
                    f2 = 16.0f;
                    z5 = false;
                    av8Var.d0(1876785166);
                    td4.u(fantasyPlayerFixtureUiModel.g, 48, av8Var, bkh.l(utcVar, 16.0f));
                    av8Var.s(false);
                }
                if (z2) {
                    mv1Var = mv1Var3;
                    f3 = 2.0f;
                    z6 = true;
                    av8Var.d0(1878869265);
                    av8Var.s(z5);
                } else {
                    av8Var.d0(1877137698);
                    f3 = 2.0f;
                    xtc g2 = bkh.g(l98.c0(n9e.q(bkh.d(utcVar, 1.0f), j3, o7g.a(4.0f)), 4.0f, 2.0f), f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
                    mv1 mv1Var4 = mv1Var3;
                    k1c c3 = e12.c(mv1Var4, z5);
                    int hashCode5 = Long.hashCode(av8Var.T);
                    aee m6 = av8Var.m();
                    xtc C6 = fqj.C(av8Var, g2);
                    av8Var.h0();
                    if (av8Var.S) {
                        av8Var.l(zg3Var);
                    } else {
                        av8Var.q0();
                    }
                    waa.K(av8Var, c3, f50Var3);
                    waa.K(av8Var, m6, ff3Var);
                    bf3.s(hashCode5, av8Var, f50Var2, av8Var, ryVar);
                    waa.K(av8Var, C6, f50Var);
                    if (z9) {
                        av8Var.d0(-803577705);
                        String valueOf4 = String.valueOf(yid.m(fantasyPlayerFixtureUiModel.j));
                        yf8 yf8Var3 = xth.a;
                        av8 av8Var3 = av8Var;
                        mv1Var = mv1Var4;
                        q5a.w(valueOf4, null, lz.D(R.color.n_lv_1, av8Var), null, 0L, 0L, null, 0L, 0, false, 1, 0, xth.k(), av8Var3, 0, 24576, 114682);
                        av8Var = av8Var3;
                        av8Var.s(false);
                        Unit unit = Unit.a;
                        z7 = false;
                    } else {
                        mv1Var = mv1Var4;
                        av8Var.d0(-803146247);
                        if (p68Var == null) {
                            av8Var.d0(-803146248);
                            av8Var.s(false);
                            z7 = false;
                        } else {
                            av8Var.d0(-803146247);
                            xtc l2 = bkh.l(utcVar, f2);
                            long D = lz.D(R.color.on_color_primary, av8Var);
                            int ordinal = p68Var.ordinal();
                            if (ordinal == 0) {
                                z7 = false;
                                av8Var.d0(625837383);
                                N = s6a.N(R.drawable.ic_home, 6, av8Var);
                                av8Var.s(false);
                            } else {
                                if (ordinal != 1) {
                                    throw dmi.h(av8Var, 625833899, false);
                                }
                                av8Var.d0(625841479);
                                N = s6a.N(R.drawable.ic_away, 6, av8Var);
                                z7 = false;
                                av8Var.s(false);
                            }
                            kq9.b(N, null, l2, D, av8Var, 432, 0);
                            Unit unit2 = Unit.a;
                            av8Var.s(z7);
                        }
                        av8Var.s(z7);
                    }
                    z6 = true;
                    av8Var.s(true);
                    av8Var.s(z7);
                }
                av8Var.s(z6);
                f4 = 1.0f;
                mv1Var3 = mv1Var;
                f5 = f3;
                z8 = z6;
                kv1Var2 = kv1Var;
                p = it;
                gv9Var3 = gv9Var;
                lv1Var2 = lv1Var;
            }
            gv9 gv9Var4 = gv9Var3;
            lv1 lv1Var3 = lv1Var2;
            float f6 = f5;
            mv1 mv1Var5 = mv1Var3;
            av8Var.s(false);
            av8Var.s(z8);
            if (z2) {
                av8Var.d0(609222674);
                xtc g3 = bkh.g(l98.c0(n9e.q(bkh.d(utcVar, 1.0f), lz.D(R.color.surface_P, av8Var), o7g.a(4.0f)), 4.0f, f6), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
                k1c c4 = e12.c(mv1Var5, false);
                int hashCode6 = Long.hashCode(av8Var.T);
                aee m7 = av8Var.m();
                xtc C7 = fqj.C(av8Var, g3);
                if3.k7.getClass();
                zg3 zg3Var4 = hf3.b;
                av8Var.h0();
                if (av8Var.S) {
                    av8Var.l(zg3Var4);
                } else {
                    av8Var.q0();
                }
                waa.K(av8Var, c4, hf3.g);
                waa.K(av8Var, m7, hf3.f);
                waa.K(av8Var, Integer.valueOf(hashCode6), hf3.j);
                waa.J(av8Var, hf3.k);
                waa.K(av8Var, C7, hf3.d);
                Iterator<E> it3 = gv9Var4.iterator();
                int i6 = 0;
                while (it3.hasNext()) {
                    Integer num2 = ((FantasyPlayerFixtureUiModel) it3.next()).j;
                    i6 += num2 != null ? num2.intValue() : 0;
                }
                String valueOf5 = String.valueOf(i6);
                yf8 yf8Var4 = xth.a;
                av8 av8Var4 = av8Var;
                i5 = 48;
                q5a.w(valueOf5, null, lz.D(R.color.n_lv_1, av8Var), null, 0L, 0L, null, 0L, 0, false, 1, 0, xth.k(), av8Var4, 0, 24576, 114682);
                av8Var = av8Var4;
                z3 = true;
                av8Var.s(true);
                i4 = 0;
                av8Var.s(false);
            } else {
                i4 = 0;
                i5 = 48;
                z3 = true;
                av8Var.d0(609871783);
                av8Var.s(false);
            }
            av8Var.s(z3);
            xtc b2 = n12.a.b(utcVar);
            l8g a5 = k8g.a(ww9.b, lv1Var3, av8Var, i4);
            int hashCode7 = Long.hashCode(av8Var.T);
            aee m8 = av8Var.m();
            xtc C8 = fqj.C(av8Var, b2);
            if3.k7.getClass();
            zg3 zg3Var5 = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var5);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a5, hf3.g);
            waa.K(av8Var, m8, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode7), hf3.j);
            waa.J(av8Var, hf3.k);
            Iterator p2 = ljg.p(av8Var, C8, hf3.d, 1196311634, gv9Var4);
            while (p2.hasNext()) {
                FantasyPlayerFixtureUiModel fantasyPlayerFixtureUiModel2 = (FantasyPlayerFixtureUiModel) p2.next();
                xtc c5 = bkh.c(new goa(1.0f, true), 1.0f);
                long D2 = lz.D(R.color.n_lv_4, av8Var);
                Object O = av8Var.O();
                a99 a99Var = nf3.a;
                if (O == a99Var) {
                    O = mz1.e(av8Var);
                }
                wzc wzcVar = (wzc) O;
                int i7 = 0;
                Object[] objArr = new Object[0];
                Object O2 = av8Var.O();
                if (O2 == a99Var) {
                    O2 = o67.e;
                    av8Var.n0(O2);
                }
                av8 av8Var5 = av8Var;
                xtc y = tol.y(c5, true, true, true, D2, wzcVar, new hd7((boh) o3a.N(objArr, (Function0) O2, av8Var, i5), function1, fantasyPlayerFixtureUiModel2, i7), av8Var5, 0);
                av8Var = av8Var5;
                e12.a(0, av8Var, y);
            }
            ljg.t(av8Var, false, true, true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new gd7(zd7Var, function1, z, xtcVar, i2, 0);
        }
    }

    public static final void n(int i2, int i3, of3 of3Var, xtc xtcVar, boolean z, boolean z2) {
        List j2;
        int i4;
        mv1 mv1Var = uxf.f;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1220899757);
        int i5 = 2;
        int i6 = i3 | (av8Var.h(z) ? 4 : 2) | (av8Var.e(i2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.g(xtcVar) ? com.ironsource.mediationsdk.metadata.a.o : 1024);
        if (av8Var.T(i6 & 1, (i6 & 1171) != 1170)) {
            boolean z3 = av8Var.k(dh3.n) == ema.b;
            mv1 mv1Var2 = z2 ? mv1Var : uxf.h;
            if (z2 ^ z3) {
                av8Var.d0(-2041265255);
                j2 = b.j(new r13(lz.D(R.color.shadow, av8Var)), new r13(r13.h));
                av8Var.s(false);
            } else {
                av8Var.d0(-2041205735);
                j2 = b.j(new r13(r13.h), new r13(lz.D(R.color.shadow, av8Var)));
                av8Var.s(false);
            }
            xtc c2 = bkh.c(xtcVar, 1.0f);
            boolean z4 = (i6 & 14) == 4;
            Object O = av8Var.O();
            if (z4 || O == nf3.a) {
                O = new c31(z, i5);
                av8Var.n0(O);
            }
            xtc M = s02.M(c2, (Function1) O);
            k1c c3 = e12.c(uxf.c, false);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, M);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            f50 f50Var = hf3.g;
            waa.K(av8Var, c3, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var, m2, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            utc utcVar = utc.a;
            n12 n12Var = n12.a;
            if (z2) {
                i4 = i6;
                av8Var.d0(1404777078);
                e12.a(0, av8Var, n9e.p(bkh.c(bkh.p(mha.G(n12Var.a(utcVar, mv1Var), 1.0f), 42.0f), 1.0f), wxf.s(j2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), null, 6));
                av8Var.s(false);
            } else {
                i4 = i6;
                av8Var.d0(1405114389);
                av8Var.s(false);
            }
            mv1 mv1Var3 = uxf.g;
            xtc f0 = l98.f0(n9e.q(bkh.c(n12Var.a(utcVar, mv1Var2), 1.0f), lz.D(R.color.surface_1, av8Var), oyn.e), z2 ? 4.0f : 2.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, z2 ? 2.0f : 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10);
            k1c c4 = e12.c(mv1Var3, false);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C2 = fqj.C(av8Var, f0);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, c4, f50Var);
            waa.K(av8Var, m3, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C2, f50Var3);
            wnn.d(Integer.valueOf(i2), null, s02.h0(300, 0, null, 6), null, yqo.H(1357140609, av8Var, new cv5(z3, 0)), av8Var, ((i4 >> 6) & 14) | 24960, 10);
            av8Var.s(true);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new dv5(z, z2, i2, xtcVar, i3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006c, code lost:
    
        if (r7 == defpackage.nf3.a) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void o(TotrSharePayload totrSharePayload, xtc xtcVar, of3 of3Var, int i2) {
        int i3;
        av8 av8Var;
        Object obj;
        zg3 zg3Var;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(1383082375);
        if ((i2 & 6) == 0) {
            i3 = (av8Var2.g(totrSharePayload) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var2.g(xtcVar) ? 32 : 16;
        }
        if (av8Var2.T(i3 & 1, (i3 & 19) != 18)) {
            Context context = (Context) av8Var2.k(nz.b);
            g6b lifecycle = ((u6b) av8Var2.k(mhb.a)).getLifecycle();
            int i4 = totrSharePayload.e;
            int i5 = totrSharePayload.f;
            boolean e2 = av8Var2.e(i4) | av8Var2.e(i5);
            Object O = av8Var2.O();
            if (!e2) {
                obj = O;
            }
            hkj hkjVar = new hkj(context);
            hkjVar.c(new qy0(totrSharePayload.e, i5), lifecycle);
            av8Var2.n0(hkjVar);
            obj = hkjVar;
            ht9 ht9Var = new ht9(context);
            ht9Var.c = (hkj) obj;
            yj0 w = uaa.w(ht9Var.a(), av8Var2, 30);
            xtc A = wnn.A(bkh.e(bkh.d(xtcVar, 1.0f), 56.0f), o7g.a(8.0f));
            k1c c2 = e12.c(uxf.c, false);
            int hashCode = Long.hashCode(av8Var2.T);
            aee m2 = av8Var2.m();
            xtc C = fqj.C(av8Var2, A);
            if3.k7.getClass();
            zg3 zg3Var2 = hf3.b;
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var2);
            } else {
                av8Var2.q0();
            }
            f50 f50Var = hf3.g;
            waa.K(av8Var2, c2, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var2, m2, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var2, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var2, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var2, C, f50Var3);
            n12 n12Var = n12.a;
            utc utcVar = utc.a;
            wkn.k(w, null, n12Var.b(utcVar), null, mp3.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, av8Var2, 24624, 104);
            xtc d0 = l98.d0(bkh.c, 12.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            l8g a2 = k8g.a(new ng0(8.0f, true, new a70(6)), uxf.m, av8Var2, 54);
            int hashCode2 = Long.hashCode(av8Var2.T);
            aee m3 = av8Var2.m();
            xtc C2 = fqj.C(av8Var2, d0);
            av8Var2.h0();
            if (av8Var2.S) {
                zg3Var = zg3Var2;
                av8Var2.l(zg3Var);
            } else {
                zg3Var = zg3Var2;
                av8Var2.q0();
            }
            waa.K(av8Var2, a2, f50Var);
            waa.K(av8Var2, m3, ff3Var);
            bf3.s(hashCode2, av8Var2, f50Var2, av8Var2, ryVar);
            waa.K(av8Var2, C2, f50Var3);
            td4.y(totrSharePayload.e, 0, 8, av8Var2, ljg.h(8.0f, bkh.l(utcVar, 40.0f), lz.D(R.color.on_color_primary, av8Var2), 2.0f), Integer.valueOf(i5), false);
            goa goaVar = new goa(1.0f, true);
            u23 a3 = t23.a(ww9.d, uxf.o, av8Var2, 0);
            int hashCode3 = Long.hashCode(av8Var2.T);
            aee m4 = av8Var2.m();
            xtc C3 = fqj.C(av8Var2, goaVar);
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, a3, f50Var);
            waa.K(av8Var2, m4, ff3Var);
            bf3.s(hashCode3, av8Var2, f50Var2, av8Var2, ryVar);
            waa.K(av8Var2, C3, f50Var3);
            String str = totrSharePayload.c;
            yf8 yf8Var = xth.a;
            udj.c(str, null, lz.D(R.color.on_color_primary, av8Var2), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.j(), av8Var2, 0, 24960, 110586);
            udj.c(totrSharePayload.d, null, lz.D(R.color.on_color_primary, av8Var2), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.b(), av8Var2, 0, 24960, 110586);
            av8 av8Var3 = av8Var2;
            av8Var3.s(true);
            wkn.k(haa.t(2131231886, 0, av8Var3), null, bkh.l(utcVar, 16.0f), null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, new ay1(lz.D(R.color.on_color_primary, av8Var3), 5), av8Var3, 440, 56);
            av8Var3.s(true);
            av8Var3.s(true);
            av8Var = av8Var3;
        } else {
            av8Var2.W();
            av8Var = av8Var2;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new wxi(totrSharePayload, xtcVar, i2);
        }
    }

    public static final void p(zd7 zd7Var, Function1 function1, boolean z, xtc xtcVar, of3 of3Var, int i2) {
        int i3;
        long j2;
        float f2;
        utc utcVar;
        float f3;
        boolean z2;
        boolean z3;
        ImageVector N;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1614702230);
        if ((i2 & 6) == 0) {
            i3 = (av8Var.g(zd7Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var.i(function1) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= av8Var.h(z) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= av8Var.g(xtcVar) ? com.ironsource.mediationsdk.metadata.a.o : 1024;
        }
        if (av8Var.T(i3 & 1, (i3 & 1171) != 1170)) {
            Context context = (Context) av8Var.k(nz.b);
            FantasyPlayerFixtureUiModel fantasyPlayerFixtureUiModel = (FantasyPlayerFixtureUiModel) CollectionsKt.Y(zd7Var.d);
            Integer num = fantasyPlayerFixtureUiModel.q;
            p68 p68Var = fantasyPlayerFixtureUiModel.o;
            boolean z4 = (num == null || fantasyPlayerFixtureUiModel.s == null || fantasyPlayerFixtureUiModel.t == null) ? false : true;
            if (z4) {
                j2 = ljg.f(av8Var, 40008731, R.color.surface_P, av8Var, false);
            } else {
                av8Var.d0(40055107);
                o68 o68Var = fantasyPlayerFixtureUiModel.p;
                r13 r13Var = null;
                Integer valueOf = o68Var != null ? Integer.valueOf(o68Var.a) : null;
                if (valueOf == null) {
                    av8Var.d0(40089950);
                    av8Var.s(false);
                } else {
                    r13Var = new r13(wv8.b(av8Var, 40089951, valueOf, av8Var, false));
                }
                if (r13Var == null) {
                    j2 = ljg.f(av8Var, -1245631843, R.color.neutral_default, av8Var, false);
                } else {
                    av8Var.d0(-1245633889);
                    av8Var.s(false);
                    j2 = r13Var.a;
                }
                av8Var.s(false);
            }
            kv1 kv1Var = uxf.p;
            ng0 ng0Var = new ng0(4.0f, true, new a70(6));
            xtc q = n9e.q(wnn.A(fz8.d0(xtcVar, n9a.b), o7g.a(8.0f)), lz.D(R.color.surface_2, av8Var), oyn.e);
            long D = lz.D(R.color.n_lv_4, av8Var);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = mz1.e(av8Var);
            }
            wzc wzcVar = (wzc) O;
            Object[] objArr = new Object[0];
            Object O2 = av8Var.O();
            if (O2 == a99Var) {
                O2 = o67.f;
                av8Var.n0(O2);
            }
            long j3 = j2;
            xtc b0 = l98.b0(tol.y(q, true, true, true, D, wzcVar, new hd7((boh) o3a.N(objArr, (Function0) O2, av8Var, 48), function1, fantasyPlayerFixtureUiModel, 1), av8Var, 0), 4.0f);
            u23 a2 = t23.a(ng0Var, kv1Var, av8Var, 54);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, b0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            f50 f50Var = hf3.g;
            waa.K(av8Var, a2, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var, m2, ff3Var);
            Integer valueOf2 = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf2, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            String C2 = f5p.C(context, zd7Var.b, zd7Var.c);
            yf8 yf8Var = xth.a;
            udj.c(C2, null, lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.c(), av8Var, 0, 24960, 110586);
            av8Var = av8Var;
            utc utcVar2 = utc.a;
            if (z) {
                av8Var.d0(1095445511);
                f2 = 4.0f;
                f3 = 16.0f;
                utcVar = utcVar2;
                udj.c(fantasyPlayerFixtureUiModel.h, null, lz.D(R.color.n_lv_1, av8Var), new es0(v8a.v(6), v8a.v(11), v8a.u(0.25d)), 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.k(), av8Var, 0, 24960, 110578);
                av8Var = av8Var;
                z2 = false;
                av8Var.s(false);
            } else {
                f2 = 4.0f;
                utcVar = utcVar2;
                f3 = 16.0f;
                z2 = false;
                av8Var.d0(1095780187);
                td4.u(fantasyPlayerFixtureUiModel.g, 48, av8Var, bkh.l(utcVar, 16.0f));
                av8Var.s(false);
            }
            mv1 mv1Var = uxf.g;
            xtc g2 = bkh.g(l98.c0(n9e.q(bkh.d(utcVar, 1.0f), j3, o7g.a(f2)), f2, 2.0f), f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            k1c c2 = e12.c(mv1Var, z2);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C3 = fqj.C(av8Var, g2);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, c2, f50Var);
            waa.K(av8Var, m3, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C3, f50Var3);
            if (z4) {
                av8Var.d0(-1913707466);
                av8 av8Var2 = av8Var;
                q5a.w(String.valueOf(yid.m(fantasyPlayerFixtureUiModel.j)), null, lz.D(R.color.n_lv_1, av8Var), null, 0L, 0L, null, 0L, 0, false, 1, 0, xth.k(), av8Var2, 0, 24576, 114682);
                av8Var = av8Var2;
                av8Var.s(false);
                Unit unit = Unit.a;
                z3 = true;
            } else {
                boolean z5 = false;
                av8Var.d0(-1913417988);
                if (p68Var == null) {
                    av8Var.d0(-1913417989);
                    av8Var.s(false);
                    z3 = true;
                } else {
                    av8Var.d0(-1913417988);
                    xtc l2 = bkh.l(utcVar, f3);
                    long D2 = lz.D(R.color.on_color_primary, av8Var);
                    int ordinal = p68Var.ordinal();
                    if (ordinal != 0) {
                        z3 = true;
                        if (ordinal != 1) {
                            throw dmi.h(av8Var, -347636922, false);
                        }
                        av8Var.d0(-347630562);
                        N = s6a.N(R.drawable.ic_away, 6, av8Var);
                        z5 = false;
                        av8Var.s(false);
                    } else {
                        z5 = false;
                        z3 = true;
                        av8Var.d0(-347634018);
                        N = s6a.N(R.drawable.ic_home, 6, av8Var);
                        av8Var.s(false);
                    }
                    kq9.b(N, null, l2, D2, av8Var, 432, 0);
                    Unit unit2 = Unit.a;
                    av8Var.s(z5);
                }
                av8Var.s(z5);
            }
            av8Var.s(z3);
            av8Var.s(z3);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new gd7(zd7Var, function1, z, xtcVar, i2, 1);
        }
    }

    public static final void q(TotrSharePayload totrSharePayload, xtc xtcVar, of3 of3Var, int i2, int i3) {
        xtc xtcVar2;
        int i4;
        xtc xtcVar3;
        totrSharePayload.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1726358486);
        int i5 = i2 | (av8Var.g(totrSharePayload) ? 4 : 2);
        int i6 = i3 & 2;
        if (i6 != 0) {
            i4 = i5 | 48;
            xtcVar2 = xtcVar;
        } else {
            xtcVar2 = xtcVar;
            i4 = i5 | (av8Var.g(xtcVar2) ? 32 : 16);
        }
        if (av8Var.T(i4 & 1, (i4 & 19) != 18)) {
            utc utcVar = utc.a;
            xtcVar3 = i6 != 0 ? utcVar : xtcVar2;
            xtc d0 = l98.d0(n9e.q(bkh.d(xtcVar3, 1.0f), lz.D(R.color.surface_0, av8Var), oyn.e), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1);
            u23 a2 = t23.a(new ng0(8.0f, true, new a70(6)), uxf.o, av8Var, 6);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, d0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            f50 f50Var = hf3.g;
            waa.K(av8Var, a2, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var, m2, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            o(totrSharePayload, l98.d0(utcVar, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), av8Var, (i4 & 14) | 48);
            tol.b(dh3.n.a(ema.a), yqo.H(382192096, av8Var, new q8i(totrSharePayload, 11)), av8Var, 56);
            xtc d02 = l98.d0(bkh.d(utcVar, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1);
            k1c c2 = e12.c(uxf.g, false);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C2 = fqj.C(av8Var, d02);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, c2, f50Var);
            waa.K(av8Var, m3, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C2, f50Var3);
            kq9.b(s6a.N(R.drawable.ic_sofascore_logo_watermark, 6, av8Var), null, bkh.e(utcVar, 16.0f), lz.D(R.color.primary_default, av8Var), av8Var, 432, 0);
            av8Var.s(true);
            av8Var.s(true);
        } else {
            av8Var.W();
            xtcVar3 = xtcVar2;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new wxi(totrSharePayload, xtcVar3, i2, i3);
        }
    }

    public static final void r(AppBarLayout appBarLayout, ViewGroup viewGroup, boolean z) {
        viewGroup.getClass();
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        ta0 ta0Var = layoutParams != null ? new ta0(layoutParams) : new ta0(-2);
        ta0Var.a = z ? 1 : 0;
        Unit unit = Unit.a;
        appBarLayout.addView(viewGroup, ta0Var);
    }

    public static final void s(View view, boolean z) {
        view.getClass();
        view.animate().setInterpolator(new LinearInterpolator()).setDuration(250L).rotation(z ? -180.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    public static String t(StatusTime statusTime, int i2, boolean z) {
        long initial = ((statusTime.getInitial() + (System.currentTimeMillis() / 1000)) + i2) - statusTime.getTimestamp();
        if (initial <= statusTime.getMax()) {
            return E(initial, true, true);
        }
        String concat = E(statusTime.getMax(), false, true).concat("'+");
        if (initial - statusTime.getMax() >= 900) {
            return concat;
        }
        if (z) {
            return E(initial, true, false);
        }
        long max = initial - statusTime.getMax();
        StringBuilder r = mz1.r(concat, " ");
        r.append(E(max, true, false));
        return r.toString();
    }

    public static String u(Context context, String str, String str2, boolean z) {
        String concat = str.matches("[0-9]*") ? str.concat("'") : afi.c(context, str, str2, z);
        return hkg.c0(context) ? concat.replace(".", "") : concat;
    }

    public static final void v(Fragment fragment, z88 z88Var, Function2 function2) {
        z88Var.getClass();
        u6b viewLifecycleOwner = fragment.getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        xw3.L(wca.x(viewLifecycleOwner.getLifecycle()), null, null, new fk6(fragment, z88Var, function2, null, 0), 3);
    }

    public static final void w(AbstractActivity abstractActivity, z88 z88Var, Function2 function2) {
        z88Var.getClass();
        xw3.L(wca.x(abstractActivity.getLifecycle()), null, null, new rh4(abstractActivity, z88Var, function2, (rq3) null, 19), 3);
    }

    public static final void x(ComponentActivity componentActivity, z88 z88Var, Function2 function2) {
        componentActivity.getClass();
        z88Var.getClass();
        xw3.L(wca.x(componentActivity.getLifecycle()), null, null, new rh4(componentActivity, z88Var, function2, (rq3) null, 20), 3);
    }

    public static final void y(Fragment fragment, z88 z88Var, Function2 function2) {
        fragment.getClass();
        z88Var.getClass();
        u6b viewLifecycleOwner = fragment.getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        xw3.L(wca.x(viewLifecycleOwner.getLifecycle()), null, null, new fk6(fragment, z88Var, function2, null, 1), 3);
    }

    public static final void z(ppd ppdVar, upd updVar) {
        updVar.getClass();
        ppdVar.f(false);
        updVar.c();
        ppdVar.f(true);
    }
}
