package defpackage;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.app.PendingIntent;
import android.app.RemoteAction;
import android.content.Context;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.appbar.AppBarLayout;
import com.inmobi.media.core.config.models.CrashConfig;
import com.sofascore.local_persistance.BrandingTeam;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.results.R;
import com.sofascore.results.ads.iml.banner.AdBannerView;
import com.sofascore.results.bettingtips.fragment.TopH2HFragment;
import com.sofascore.results.bettingtips.fragment.TrendingOddsFragment;
import com.sofascore.results.dialog.TopStatsCategoryBottomSheet;
import com.sofascore.results.event.details.view.tv.dialog.TvChannelCountriesDialog;
import com.sofascore.results.league.fragment.details.view.TournamentPreviousWinnersBottomSheet;
import com.sofascore.results.mvvm.base.AbstractActivity;
import com.sofascore.results.mvvm.base.SofaTabLayout;
import com.sofascore.results.stagesport.fragments.category.StageCategoryRacesFragment;
import com.sofascore.results.stagesport.fragments.media.StageMediaFragment;
import com.sofascore.results.stagesport.fragments.team.StageTeamRankingsFragment;
import com.sofascore.results.team.lastnext.calendar.monthpicker.TeamEventsCalendarMonthPickerBottomSheet;
import com.sofascore.results.team.media.TeamMediaFragment;
import com.sofascore.results.team.squad.TeamSquadFragment;
import com.sofascore.results.team.transfers.TeamTransfersModal;
import com.sofascore.results.tv.TVScheduleActivity;
import com.sofascore.results.view.header.widget.TimerGoalAnimatedView;
import com.unity3d.ads.core.data.datasource.UniversalRequestDataStoreProvider;
import com.unity3d.services.UnityAdsConstants;
import java.io.File;
import java.io.Serializable;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class w1i implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ w1i(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Drawable mutate;
        Throwable th;
        f4a f4aVar;
        float f;
        float f2;
        float max;
        Drawable mutate2;
        File createDataStore$lambda$3;
        int i = this.a;
        int i2 = 1;
        int i3 = 0;
        rq3 rq3Var = null;
        Object obj = this.b;
        switch (i) {
            case 0:
                Context requireContext = ((StageCategoryRacesFragment) obj).requireContext();
                requireContext.getClass();
                return new s7i(requireContext);
            case 1:
                Context requireContext2 = ((StageMediaFragment) obj).requireContext();
                requireContext2.getClass();
                return new y4c(requireContext2);
            case 2:
                Context context = ((u6i) obj).b;
                int s = ao2.s(16, context);
                Drawable drawable = context.getDrawable(R.drawable.ic_timer);
                if (drawable == null || (mutate = drawable.mutate()) == null) {
                    return null;
                }
                mutate.setBounds(0, 0, s, s);
                return mutate;
            case 3:
                Long l = ((h7i) obj).h;
                if (l != null) {
                    return vxd.o(Instant.ofEpochSecond(l.longValue()));
                }
                return null;
            case 4:
                StageTeamRankingsFragment stageTeamRankingsFragment = (StageTeamRankingsFragment) obj;
                LayoutInflater layoutInflater = stageTeamRankingsFragment.getLayoutInflater();
                krk krkVar = stageTeamRankingsFragment.l;
                krkVar.getClass();
                xhh a = xhh.a(layoutInflater, ((tp8) krkVar).c);
                a.b.setVisibility(0);
                a8i C = stageTeamRankingsFragment.C();
                FrameLayout frameLayout = a.a;
                frameLayout.getClass();
                ConstraintLayout constraintLayout = ((c75) stageTeamRankingsFragment.x.getValue()).a;
                int size = C.g.size();
                int c0 = CollectionsKt.c0(C.g, constraintLayout) + 1;
                Integer valueOf = Integer.valueOf(c0);
                if (c0 == 0) {
                    valueOf = null;
                }
                if (valueOf != null) {
                    size = valueOf.intValue();
                }
                C.p(size, frameLayout);
                return a;
            case 5:
                soi soiVar = (soi) obj;
                yt9 yt9Var = soiVar.a;
                tvd tvdVar = soiVar.b;
                l62 source = yt9Var.source();
                try {
                    f4aVar = qoi.a.a(source);
                    try {
                        source.close();
                        th = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Throwable th3) {
                    try {
                        source.close();
                    } catch (Throwable th4) {
                        de6.a(th3, th4);
                    }
                    th = th3;
                    f4aVar = null;
                }
                if (th != null) {
                    throw th;
                }
                ejg ejgVar = (ejg) f4aVar.b;
                pmg pmgVar = (pmg) ejgVar.c;
                if (pmgVar != null) {
                    w0d w0dVar = pmgVar.o;
                    RectF rectF = w0dVar == null ? null : new RectF(w0dVar.b, w0dVar.c, w0dVar.c(), w0dVar.d());
                    roi roiVar = rectF != null ? new roi(rectF.left, rectF.top, rectF.right, rectF.bottom) : null;
                    if (roiVar != null) {
                        f = roiVar.c - roiVar.a;
                        f2 = roiVar.d - roiVar.b;
                    } else if (((pmg) ejgVar.c) != null) {
                        f = ejgVar.i().d;
                        if (((pmg) ejgVar.c) != null) {
                            f2 = ejgVar.i().e;
                        } else {
                            a70.p("SVG document is empty");
                        }
                    } else {
                        a70.p("SVG document is empty");
                    }
                    kjh kjhVar = tvdVar.b;
                    jrg jrgVar = tvdVar.c;
                    if (Intrinsics.c(kjhVar, kjh.c)) {
                        float floatValue = ((Number) soiVar.c.invoke(tvdVar.a)).floatValue();
                        if (f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            f *= floatValue;
                        }
                        if (f2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            f2 *= floatValue;
                        }
                    }
                    int b = f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? wzb.b(f) : 512;
                    int b2 = f2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? wzb.b(f2) : 512;
                    kjh kjhVar2 = tvdVar.b;
                    sl6 sl6Var = st9.b;
                    long q = tol.q(b, b2, kjhVar2, jrgVar, (kjh) fqj.x(tvdVar, sl6Var));
                    roi roiVar2 = roiVar;
                    int i4 = (int) (q >> 32);
                    int i5 = (int) (q & 4294967295L);
                    if (f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        float f3 = i4;
                        float f4 = i5;
                        kjh kjhVar3 = (kjh) fqj.x(tvdVar, sl6Var);
                        float f5 = f3 / f;
                        float f6 = f4 / f2;
                        int ordinal = jrgVar.ordinal();
                        if (ordinal == 0) {
                            max = Math.max(f5, f6);
                        } else if (ordinal == 1) {
                            max = Math.min(f5, f6);
                        } else {
                            zzl.b();
                        }
                        if (kjhVar3.a instanceof t25) {
                            float f7 = ((t25) r3).a / f;
                            if (max > f7) {
                                max = f7;
                            }
                        }
                        if (kjhVar3.b instanceof t25) {
                            float f8 = ((t25) r3).a / f2;
                            if (max > f8) {
                                max = f8;
                            }
                        }
                        i4 = (int) (max * f);
                        i5 = (int) (max * f2);
                        if (roiVar2 == null) {
                            float f9 = f - UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                            float f10 = f2 - UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                            pmg pmgVar2 = (pmg) ejgVar.c;
                            if (pmgVar2 != null) {
                                pmgVar2.o = new w0d(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f9, f10);
                            } else {
                                a70.p("SVG document is empty");
                            }
                        }
                    }
                    pmg pmgVar3 = (pmg) ejgVar.c;
                    if (pmgVar3 != null) {
                        pmgVar3.r = fog.s("100%");
                        pmg pmgVar4 = (pmg) ejgVar.c;
                        if (pmgVar4 != null) {
                            pmgVar4.s = fog.s("100%");
                            String str = (String) fqj.x(tvdVar, ut9.a);
                            if (str != null) {
                                k1d k1dVar = new k1d(24);
                                pp4 pp4Var = new pp4(2);
                                qd2 qd2Var = new qd2(str);
                                qd2Var.Q();
                                k1dVar.b = pp4Var.j(qd2Var);
                                f4aVar.c = k1dVar;
                            }
                            return new vl4(new ax1(rfo.O(new uoi(ejgVar, (k1d) f4aVar.c, i4, i5))), true);
                        }
                        a70.p("SVG document is empty");
                    } else {
                        a70.p("SVG document is empty");
                    }
                } else {
                    a70.p("SVG document is empty");
                }
                return null;
            case 6:
                int i6 = TVScheduleActivity.O;
                View inflate = ((TVScheduleActivity) obj).getLayoutInflater().inflate(R.layout.activity_tv_schedule, (ViewGroup) null, false);
                int i7 = R.id.ad_banner_view;
                AdBannerView adBannerView = (AdBannerView) nq8.B(R.id.ad_banner_view, inflate);
                if (adBannerView != null) {
                    i7 = R.id.content_holder;
                    if (((RelativeLayout) nq8.B(R.id.content_holder, inflate)) != null) {
                        i7 = R.id.filter_toolbar_container;
                        FrameLayout frameLayout2 = (FrameLayout) nq8.B(R.id.filter_toolbar_container, inflate);
                        if (frameLayout2 != null) {
                            i7 = R.id.info_banner;
                            if (((ViewStub) nq8.B(R.id.info_banner, inflate)) != null) {
                                i7 = R.id.loading_view;
                                ViewStub viewStub = (ViewStub) nq8.B(R.id.loading_view, inflate);
                                if (viewStub != null) {
                                    i7 = R.id.no_internet_view;
                                    ViewStub viewStub2 = (ViewStub) nq8.B(R.id.no_internet_view, inflate);
                                    if (viewStub2 != null) {
                                        i7 = R.id.tabs;
                                        SofaTabLayout sofaTabLayout = (SofaTabLayout) nq8.B(R.id.tabs, inflate);
                                        if (sofaTabLayout != null) {
                                            i7 = R.id.toolbar;
                                            View B = nq8.B(R.id.toolbar, inflate);
                                            if (B != null) {
                                                z3f b3 = z3f.b(B);
                                                i7 = R.id.toolbar_holder;
                                                if (((AppBarLayout) nq8.B(R.id.toolbar_holder, inflate)) != null) {
                                                    i7 = R.id.toolbar_padded_container;
                                                    FrameLayout frameLayout3 = (FrameLayout) nq8.B(R.id.toolbar_padded_container, inflate);
                                                    if (frameLayout3 != null) {
                                                        i7 = R.id.vpMain;
                                                        ViewPager2 viewPager2 = (ViewPager2) nq8.B(R.id.vpMain, inflate);
                                                        if (viewPager2 != null) {
                                                            return new bf((RelativeLayout) inflate, adBannerView, frameLayout2, viewStub, viewStub2, sofaTabLayout, b3, frameLayout3, viewPager2);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i7)));
                return null;
            case 7:
                AbstractActivity abstractActivity = (AbstractActivity) ((ng2) obj).a;
                Drawable drawable2 = abstractActivity.getDrawable(R.drawable.ic_close);
                if (drawable2 == null || (mutate2 = drawable2.mutate()) == null) {
                    return null;
                }
                mutate2.setTint(abstractActivity.getColor(R.color.on_color_primary));
                return mutate2;
            case 8:
                Fragment requireParentFragment = ((TeamEventsCalendarMonthPickerBottomSheet) obj).requireParentFragment();
                requireParentFragment.getClass();
                return requireParentFragment;
            case 9:
                u6e u6eVar = (u6e) obj;
                u6eVar.e = true;
                u6eVar.f = true;
                u6eVar.g = 1;
                u6eVar.h = 1;
                return Unit.a;
            case 10:
                Bundle requireArguments = ((TeamMediaFragment) obj).requireArguments();
                requireArguments.getClass();
                Serializable M = gz8.M(requireArguments, "team", Team.class);
                if (M != null) {
                    return (Team) M;
                }
                a70.p("Serializable team not found");
                return null;
            case 11:
                ArrayList arrayList = ((v0j) obj).g;
                if (arrayList == null || !arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((View) it.next()).getVisibility() == 0) {
                                i3 = 4;
                            }
                        }
                    }
                }
                return Integer.valueOf(i3);
            case 12:
                TeamSquadFragment teamSquadFragment = (TeamSquadFragment) obj;
                Context requireContext3 = teamSquadFragment.requireContext();
                requireContext3.getClass();
                BrandingTeam A = ccd.A(((g2j) teamSquadFragment.r.getValue()).m.getId(), requireContext3);
                if (A == null) {
                    return null;
                }
                Context requireContext4 = teamSquadFragment.requireContext();
                requireContext4.getClass();
                return tz9.B(requireContext4, A.getBackgroundColor(), A.getBackgroundGradientColor());
            case 13:
                Context requireContext5 = ((TeamTransfersModal) obj).requireContext();
                requireContext5.getClass();
                return new rvj(requireContext5, true);
            case 14:
                vm6 vm6Var = (vm6) obj;
                Calendar calendar = ke0.a;
                Context context2 = vm6Var.getContext();
                context2.getClass();
                ke0.g(context2, vm6Var.getContext().getString(R.string.prize_pool_explanation), 0);
                return Unit.a;
            case 15:
                v7j v7jVar = (v7j) obj;
                v7jVar.E = null;
                sea.p(v7jVar);
                y6a.E(v7jVar);
                n9e.E(v7jVar);
                return Boolean.TRUE;
            case 16:
                PendingIntent actionIntent = ((RemoteAction) obj).getActionIntent();
                if (Build.VERSION.SDK_INT >= 34) {
                    q9.D(actionIntent);
                } else {
                    actionIntent.send();
                }
                return Unit.a;
            case 17:
                u8j u8jVar = (u8j) obj;
                return u8jVar.n ? qea.o(u8jVar) : f8j.b;
            case 18:
                ebj ebjVar = (ebj) obj;
                return (ebjVar.t || ((acj) ((eoh) ebjVar.r.q).getValue()) == acj.b) ? new dnd(tz9.u(ebjVar.q, ebjVar.r, ebjVar.s, ((c7a) ((eoh) ebjVar.u).getValue()).a)) : new dnd(9205357640488583168L);
            case 19:
                return new r6a(((x6a) obj).c());
            case 20:
                bfj bfjVar = (bfj) obj;
                bfjVar.z = null;
                sea.p(bfjVar);
                y6a.E(bfjVar);
                n9e.E(bfjVar);
                return Boolean.TRUE;
            case 21:
                TimerGoalAnimatedView timerGoalAnimatedView = (TimerGoalAnimatedView) obj;
                int i8 = TimerGoalAnimatedView.q;
                ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(timerGoalAnimatedView, PropertyValuesHolder.ofFloat((Property<?, Float>) View.ALPHA, 1.0f, 1.0f, 1.0f, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, 1.0f, 1.0f, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, 1.0f, 1.0f, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f));
                ofPropertyValuesHolder.setInterpolator(new LinearInterpolator());
                ofPropertyValuesHolder.setDuration(CrashConfig.DEFAULT_ANR_WATCHDOG_INTERVAL);
                ofPropertyValuesHolder.addListener(new xij(timerGoalAnimatedView, i2));
                ofPropertyValuesHolder.addListener(new xij(timerGoalAnimatedView, i3));
                return ofPropertyValuesHolder;
            case 22:
                Context requireContext6 = ((TopH2HFragment) obj).requireContext();
                requireContext6.getClass();
                return new hlj(requireContext6);
            case 23:
                return Integer.valueOf(((plj) obj).a.size());
            case 24:
                return Float.valueOf(((flb) obj).e());
            case 25:
                return ((TopStatsCategoryBottomSheet) obj).requireArguments().getString("CATEGORY_NAME", "");
            case 26:
                qrj qrjVar = (qrj) obj;
                Context context3 = qrjVar.getContext();
                context3.getClass();
                Integer num = qrjVar.n;
                int intValue = num != null ? num.intValue() : -1;
                String str2 = qrjVar.l;
                str2.getClass();
                TournamentPreviousWinnersBottomSheet tournamentPreviousWinnersBottomSheet = new TournamentPreviousWinnersBottomSheet();
                tournamentPreviousWinnersBottomSheet.setArguments(fz8.C(fz8.H("PREVIOUS_WINNERS_SPORT_SLUG", str2), fz8.D(intValue, "UNIQUE_TOURNAMENT_ID")));
                if (context3 instanceof csk) {
                    context3 = ((csk) context3).getBaseContext();
                }
                AppCompatActivity appCompatActivity = context3 instanceof AppCompatActivity ? (AppCompatActivity) context3 : null;
                if (appCompatActivity != null) {
                    wca.x(appCompatActivity.getLifecycle()).b(new r1(tournamentPreviousWinnersBottomSheet, appCompatActivity, rq3Var, 3));
                }
                return Unit.a;
            case 27:
                Context requireContext7 = ((TrendingOddsFragment) obj).requireContext();
                requireContext7.getClass();
                return new l0k(requireContext7);
            case 28:
                Context requireContext8 = ((TvChannelCountriesDialog) obj).requireContext();
                requireContext8.getClass();
                return new h3k(requireContext8);
            default:
                createDataStore$lambda$3 = UniversalRequestDataStoreProvider.createDataStore$lambda$3((UniversalRequestDataStoreProvider) obj);
                return createDataStore$lambda$3;
        }
    }
}
