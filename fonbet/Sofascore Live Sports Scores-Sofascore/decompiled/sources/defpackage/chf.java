package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.sofascore.local_persistance.Brand;
import com.sofascore.local_persistance.BrandingTeam;
import com.sofascore.model.GridItem;
import com.sofascore.model.Sports;
import com.sofascore.model.branding.BrandLocation;
import com.sofascore.model.mvvm.model.Country;
import com.sofascore.model.mvvm.model.MotorsportTeamInfo;
import com.sofascore.model.mvvm.model.PlayerTeamInfo;
import com.sofascore.model.mvvm.model.Referee;
import com.sofascore.model.mvvm.model.RefereeDetailsHeadFlags;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.mvvm.model.SeasonKt;
import com.sofascore.model.mvvm.model.Sport;
import com.sofascore.model.mvvm.model.Stage;
import com.sofascore.model.mvvm.model.StageSeason;
import com.sofascore.model.mvvm.model.StageSeasonKt;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.TeamDetailsHeadFlags;
import com.sofascore.model.mvvm.model.UniqueStage;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.model.newNetwork.StageSportDriverCareerData;
import com.sofascore.model.newNetwork.StageTeamHistoryResponse;
import com.sofascore.model.newNetwork.topperformance.response.TopStatsItem;
import com.sofascore.results.R;
import com.sofascore.results.ads.iml.banner.AdBannerView;
import com.sofascore.results.league.LeagueActivity;
import com.sofascore.results.main.matches.StageSeriesWeekFragment;
import com.sofascore.results.mvvm.base.CollapsibleToolbarActivity;
import com.sofascore.results.redesign.emptystateblocks.GraphicLarge;
import com.sofascore.results.referee.RefereeActivity;
import com.sofascore.results.stagesport.StageDetailsActivity;
import com.sofascore.results.stagesport.fragments.team.constructor.StageConstructorDetailsFragment;
import com.sofascore.results.stagesport.fragments.team.driver.StageDriverDetailsFragment;
import com.sofascore.results.team.TeamActivity;
import com.sofascore.results.team.details.view.TeamAchievementsView;
import com.sofascore.results.team.details.view.TeamInfoView;
import com.sofascore.results.team.playerstats.TeamPlayerStatsFragment;
import com.sofascore.results.view.ToolbarBackgroundAppBarLayout;
import com.sofascore.results.view.typeheader.SegmentedButtonsView;
import com.sofascore.results.view.typeheader.TypeHeaderView;
import com.unity3d.services.UnityAdsConstants;
import java.time.Instant;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.c;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class chf extends ot8 implements Function1 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ chf(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.b = i3;
    }

    private final Object b(Object obj) {
        List list = (List) obj;
        list.getClass();
        TeamPlayerStatsFragment teamPlayerStatsFragment = (TeamPlayerStatsFragment) this.receiver;
        teamPlayerStatsFragment.n();
        mqi mqiVar = teamPlayerStatsFragment.w;
        ImageView imageView = ((wxc) teamPlayerStatsFragment.t.getValue()).b;
        tyi F = teamPlayerStatsFragment.F();
        imageView.setSelected(!F.m.equals(F.l));
        joa joaVar = teamPlayerStatsFragment.u;
        TypeHeaderView typeHeaderView = (TypeHeaderView) joaVar.getValue();
        if (typeHeaderView != null) {
            typeHeaderView.setVisibility(!list.isEmpty() ? 0 : 8);
        }
        ConstraintLayout constraintLayout = teamPlayerStatsFragment.D().a;
        constraintLayout.getClass();
        constraintLayout.setVisibility(!list.isEmpty() ? 0 : 8);
        krk krkVar = teamPlayerStatsFragment.l;
        krkVar.getClass();
        ((xq8) krkVar).c.setVisibility(list.isEmpty() ? 8 : 0);
        boolean isEmpty = list.isEmpty();
        krk krkVar2 = teamPlayerStatsFragment.l;
        if (isEmpty) {
            krkVar2.getClass();
            if (((xq8) krkVar2).b.indexOfChild((GraphicLarge) mqiVar.getValue()) == -1) {
                krk krkVar3 = teamPlayerStatsFragment.l;
                krkVar3.getClass();
                TeamPlayerStatsFragment.C(((xq8) krkVar3).b, (GraphicLarge) mqiVar.getValue());
            }
        } else {
            krkVar2.getClass();
            ((xq8) krkVar2).b.removeView((GraphicLarge) mqiVar.getValue());
        }
        TypeHeaderView typeHeaderView2 = (TypeHeaderView) joaVar.getValue();
        if (typeHeaderView2 != null) {
            ArrayList arrayList = new ArrayList(k13.r(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(teamPlayerStatsFragment.getString(((nk2) it.next()).d()));
            }
            TypeHeaderView.z(typeHeaderView2, arrayList, null, 2);
        }
        krk krkVar4 = teamPlayerStatsFragment.l;
        krkVar4.getClass();
        ((xq8) krkVar4).b.requestLayout();
        return Unit.a;
    }

    private final Object c(Object obj) {
        List list = (List) obj;
        list.getClass();
        TeamPlayerStatsFragment teamPlayerStatsFragment = (TeamPlayerStatsFragment) this.receiver;
        fyi fyiVar = (fyi) teamPlayerStatsFragment.x.getValue();
        int i = teamPlayerStatsFragment.F().o;
        fyiVar.getClass();
        fyiVar.o = new eyi(fyiVar.i, list, fyiVar.n != i);
        fyiVar.n = i;
        fyiVar.F(list);
        return Unit.a;
    }

    private final Object d(Object obj) {
        long j = ((dnd) obj).a;
        k8j k8jVar = (k8j) this.receiver;
        k8jVar.getClass();
        o8j o8jVar = (o8j) tgj.x(k8jVar, p8j.a);
        if (o8jVar != null) {
            xw3.L(k8jVar.Y0(), null, null, new h2(k8jVar, j, o8jVar, new j8j(k8jVar, j), (rq3) null), 3);
        }
        return Unit.a;
    }

    private final Object e(Object obj) {
        Integer a;
        ria x;
        KeyEvent keyEvent = ((sia) obj).a;
        raj rajVar = (raj) this.receiver;
        oej oejVar = rajVar.f;
        boolean z = rajVar.d;
        boolean z2 = true;
        t43 t43Var = (sha.F(keyEvent) && (a = rajVar.i.a(keyEvent)) != null) ? new t43(new StringBuilder().appendCodePoint(a.intValue()).toString(), 1) : null;
        if (t43Var != null) {
            if (z) {
                rajVar.a(a.c(t43Var));
                oejVar.a = null;
            }
            z2 = false;
        } else {
            if (u0a.z(keyEvent) == 2 && (x = rz8.h.x(keyEvent)) != null && (!x.a || z)) {
                asf asfVar = new asf();
                asfVar.a = true;
                vsc vscVar = new vsc(26, x, rajVar, asfVar);
                wcj wcjVar = rajVar.c;
                hbj hbjVar = new hbj(wcjVar, rajVar.g, rajVar.a.d(), oejVar);
                vscVar.invoke(hbjVar);
                boolean c = pej.c(hbjVar.f, wcjVar.b);
                q80 q80Var = hbjVar.g;
                if (!c || !Intrinsics.c(q80Var, wcjVar.a)) {
                    rajVar.j.invoke(wcj.a(wcjVar, q80Var, hbjVar.f, 4));
                }
                rajVar.h.e = true;
                z2 = asfVar.a;
            }
            z2 = false;
        }
        return Boolean.valueOf(z2);
    }

    private final Object f(Object obj) {
        List<TopStatsItem> list = (List) obj;
        list.getClass();
        ((xlj) this.receiver).getClass();
        ArrayList arrayList = new ArrayList(k13.r(list, 10));
        for (TopStatsItem topStatsItem : list) {
            arrayList.add(new TopStatsItem(rei.b(1, Double.valueOf(Double.parseDouble(topStatsItem.getStatistic()))), topStatsItem.getPlayer(), topStatsItem.getEvent()));
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:460:0x0bdc, code lost:
    
        if (android.provider.Settings.System.getInt(r1.getContentResolver(), "accelerometer_rotation") == 1) goto L444;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [rq3] */
    /* JADX WARN: Type inference failed for: r6v25 */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        float h;
        String slug;
        Object value;
        vnb vnbVar;
        MotorsportTeamInfo motorsportTeamInfo;
        String engine;
        MotorsportTeamInfo motorsportTeamInfo2;
        String chassis;
        List<StageSportDriverCareerData> total;
        Typeface typeface;
        UniqueStage uniqueStage;
        Typeface typeface2;
        Drawable drawable;
        StageSeason stageSeason;
        String sportName;
        PlayerTeamInfo playerTeamInfo;
        Double weight;
        PlayerTeamInfo playerTeamInfo2;
        Double height;
        String w;
        Boolean bool;
        PlayerTeamInfo playerTeamInfo3;
        Integer number;
        String Q;
        PlayerTeamInfo playerTeamInfo4;
        Country country;
        PlayerTeamInfo playerTeamInfo5;
        String birthplace;
        PlayerTeamInfo playerTeamInfo6;
        String residence;
        List<StageSportDriverCareerData> total2;
        Drawable mutate;
        String c;
        yy0 vy0Var;
        String alpha2;
        Country country2;
        String alpha22;
        String slug2;
        GradientDrawable gradientDrawable;
        Brand brand;
        List list;
        int i = 6;
        int i2 = 24;
        int i3 = 16;
        int i4 = 3;
        r6 = null;
        Object obj2 = null;
        r6 = null;
        Drawable drawable2 = null;
        r6 = null;
        StageSportDriverCareerData stageSportDriverCareerData = null;
        int i5 = 0;
        switch (this.b) {
            case 0:
                float floatValue = ((Number) obj).floatValue();
                ghf ghfVar = (ghf) this.receiver;
                xnh xnhVar = ghfVar.f;
                xnh xnhVar2 = ghfVar.g;
                boolean b = ghfVar.b();
                float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                if (!b) {
                    float h2 = xnhVar.h() + floatValue;
                    if (h2 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        h2 = 0.0f;
                    }
                    float h3 = h2 - xnhVar.h();
                    ghfVar.f.i(h2);
                    if (ghfVar.a() <= xnhVar2.h()) {
                        h = ghfVar.a();
                    } else {
                        float abs = Math.abs(ghfVar.a() / xnhVar2.h()) - 1.0f;
                        if (abs >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            f = abs;
                        }
                        if (f > 2.0f) {
                            f = 2.0f;
                        }
                        h = (xnhVar2.h() * (f - (((float) Math.pow(f, 2.0d)) / 4.0f))) + xnhVar2.h();
                    }
                    ghfVar.e.i(h);
                    f = h3;
                }
                return Float.valueOf(f);
            case 1:
                return (Integer) ((gef) this.receiver).a(obj);
            case 2:
                x2g x2gVar = (x2g) obj;
                RefereeActivity refereeActivity = (RefereeActivity) this.receiver;
                int i6 = RefereeActivity.R;
                vc Q2 = refereeActivity.Q();
                mqi mqiVar = refereeActivity.O;
                Q2.l.setRefreshing(false);
                if (x2gVar instanceof v2g) {
                    Object obj3 = ((v2g) x2gVar).a;
                    Referee referee = ((RefereeDetailsHeadFlags) obj3).getReferee();
                    ftf ftfVar = (ftf) mqiVar.getValue();
                    ftfVar.getClass();
                    referee.getClass();
                    ftfVar.r = referee;
                    if (!refereeActivity.P) {
                        refereeActivity.P = true;
                        new hsf(refereeActivity, i4);
                        refereeActivity.Q().l.setEnabled(false);
                        AdBannerView adBannerView = refereeActivity.Q().b;
                        ltb ltbVar = new ltb();
                        Referee referee2 = ((ftf) mqiVar.getValue()).r;
                        if (referee2 == null) {
                            Intrinsics.i(SearchResponseKt.REFEREE_ENTITY);
                            throw null;
                        }
                        Sport sport = referee2.getSport();
                        if (sport != null && (slug = sport.getSlug()) != null) {
                            ltbVar.put(SearchResponseKt.SPORT_ENTITY, slug);
                        }
                        refereeActivity.I(adBannerView, ltbVar.d());
                        as9.m(refereeActivity.R(), ((Number) refereeActivity.M.getValue()).intValue());
                        CollapsibleToolbarActivity.V(refereeActivity, tba.u(referee), referee.getCountry(), null, 12);
                        refereeActivity.W(null, referee.getCountry(), false);
                    }
                    kp5 kp5Var = dtf.d;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj4 : kp5Var) {
                        if (((Boolean) ((dtf) obj4).b.invoke(obj3)).booleanValue()) {
                            arrayList.add(obj4);
                        }
                    }
                    ((ftf) mqiVar.getValue()).x(arrayList);
                }
                return Unit.a;
            case 3:
                Activity activity = (Activity) obj;
                activity.getClass();
                ((fdg) this.receiver).getClass();
                int requestedOrientation = activity.getRequestedOrientation();
                if (activity.getRequestedOrientation() != 14 && requestedOrientation != 1 && requestedOrientation != 0 && requestedOrientation != 9 && requestedOrientation != 8 && requestedOrientation != 12 && requestedOrientation != 11 && requestedOrientation != 7 && requestedOrientation != 6) {
                    r15 = false;
                }
                return Boolean.valueOf(r15);
            case 4:
                Context context = (Context) obj;
                context.getClass();
                ((fdg) this.receiver).getClass();
                try {
                    break;
                } catch (Exception unused) {
                    break;
                }
            case 5:
                blg blgVar = (blg) obj;
                blgVar.getClass();
                ((tdg) this.receiver).h(blgVar);
                return Unit.a;
            case 6:
                blg blgVar2 = (blg) obj;
                blgVar2.getClass();
                ((tfg) this.receiver).i(blgVar2);
                return Unit.a;
            case 7:
                blg blgVar3 = (blg) obj;
                blgVar3.getClass();
                ((yhg) this.receiver).h(blgVar3);
                return Unit.a;
            case 8:
                ((yhg) this.receiver).n(((Boolean) obj).booleanValue());
                return Unit.a;
            case 9:
                String str = (String) obj;
                str.getClass();
                SegmentedButtonsView segmentedButtonsView = (SegmentedButtonsView) this.receiver;
                int i7 = SegmentedButtonsView.m;
                segmentedButtonsView.p(str);
                return Unit.a;
            case 10:
                n2h n2hVar = (n2h) obj;
                n2hVar.getClass();
                a0i a0iVar = (a0i) this.receiver;
                a0iVar.getClass();
                if (n2hVar.equals(k2h.a)) {
                    fdi fdiVar = a0iVar.e;
                    do {
                        value = fdiVar.getValue();
                        vnbVar = (vnb) value;
                        vnbVar.getClass();
                        if (vnbVar instanceof unb) {
                            p2h p2hVar = (p2h) ((unb) vnbVar).a;
                            p2hVar.getClass();
                            vnbVar = new unb(p2h.a(p2hVar, true));
                        }
                    } while (!fdiVar.k(value, vnbVar));
                } else if (n2hVar instanceof l2h) {
                    xw3.L(un0.z(a0iVar), null, null, new cce(a0iVar, (l2h) n2hVar, (rq3) r6, 18), 3);
                } else {
                    if (!(n2hVar instanceof m2h)) {
                        zzl.b();
                        return null;
                    }
                    nzh nzhVar = ((m2h) n2hVar).a;
                    r6 = ((nzhVar instanceof mzh) || (nzhVar instanceof lzh)) ? nzhVar.getSportSlug() : 0;
                    if (r6 != 0) {
                        a0iVar.k(new o2h(r6));
                    }
                }
                return Unit.a;
            case 11:
                return (Integer) ((gef) this.receiver).a(obj);
            case 12:
                StageTeamHistoryResponse stageTeamHistoryResponse = (StageTeamHistoryResponse) obj;
                StageConstructorDetailsFragment stageConstructorDetailsFragment = (StageConstructorDetailsFragment) this.receiver;
                k2i C = stageConstructorDetailsFragment.C();
                if (stageTeamHistoryResponse != null && (total = stageTeamHistoryResponse.getTotal()) != null) {
                    stageSportDriverCareerData = (StageSportDriverCareerData) CollectionsKt.firstOrNull(total);
                }
                Team l = stageConstructorDetailsFragment.E().l();
                Context context2 = C.b;
                xbb b2 = a.b();
                if (l != null && (motorsportTeamInfo2 = l.getMotorsportTeamInfo()) != null && (chassis = motorsportTeamInfo2.getChassis()) != null) {
                    String string = context2.getString(R.string.motorsport_car_chassis);
                    string.getClass();
                    b2.add(new i8i(string, chassis, false));
                }
                if (l != null && (motorsportTeamInfo = l.getMotorsportTeamInfo()) != null && (engine = motorsportTeamInfo.getEngine()) != null) {
                    String string2 = context2.getString(R.string.motorsport_car_power_unit);
                    string2.getClass();
                    b2.add(new i8i(string2, engine, false));
                }
                if (stageSportDriverCareerData != null) {
                    String string3 = context2.getString(R.string.championship_titles);
                    string3.getClass();
                    b2.add(new i8i(string3, String.valueOf(stageSportDriverCareerData.getWorldChampionshipTitles()), stageSportDriverCareerData.getWorldChampionshipTitles() > 0));
                    String string4 = context2.getString(R.string.podiums);
                    string4.getClass();
                    b2.add(new i8i(string4, String.valueOf(stageSportDriverCareerData.getPodiums()), false));
                    String string5 = context2.getString(R.string.wins);
                    string5.getClass();
                    b2.add(new i8i(string5, String.valueOf(stageSportDriverCareerData.getVictories()), false));
                    String string6 = context2.getString(R.string.pole_positions);
                    string6.getClass();
                    b2.add(new i8i(string6, String.valueOf(stageSportDriverCareerData.getPolePositions()), false));
                }
                C.F(a.a(b2));
                return Unit.a;
            case 13:
                i4i i4iVar = (i4i) obj;
                StageDetailsActivity stageDetailsActivity = (StageDetailsActivity) this.receiver;
                fff fffVar = StageDetailsActivity.T;
                stageDetailsActivity.Q().l.setRefreshing(false);
                if (i4iVar != null) {
                    Stage stage = i4iVar.a;
                    if (!stageDetailsActivity.O) {
                        stageDetailsActivity.O = true;
                        stageDetailsActivity.Q().l.setEnabled(false);
                        stage.getClass();
                        as9.n(stageDetailsActivity.R(), stage, true);
                        TextView textView = (TextView) stageDetailsActivity.Q().f.g;
                        long timestamp = stage.getTimestamp();
                        bi4 bi4Var = bi4.PATTERN_Y;
                        ConcurrentHashMap concurrentHashMap = hk4.a;
                        String i8 = fc6.i(timestamp, hk4.a(bi4Var.d()));
                        textView.setText(stageDetailsActivity.getString(R.string.bullet_separator, c.r(stage.getDescription(), " ".concat(i8), "", false), i8));
                        try {
                            typeface = z1g.a(R.font.sofascore_sans_regular, stageDetailsActivity);
                        } catch (Exception unused2) {
                            typeface = Typeface.DEFAULT;
                        }
                        textView.setTypeface(typeface);
                        textView.setTextSize(1, 14.0f);
                        TextView textView2 = (TextView) stageDetailsActivity.Q().f.i;
                        StageSeason stageSeason2 = stage.getStageSeason();
                        if (stageSeason2 == null || (uniqueStage = stageSeason2.getUniqueStage()) == null) {
                            uniqueStage = stage.getUniqueStage();
                        }
                        textView2.setText(uniqueStage != null ? uniqueStage.getName() : null);
                        try {
                            typeface2 = z1g.a(R.font.sofascore_sans_medium, stageDetailsActivity);
                        } catch (Exception unused3) {
                            typeface2 = Typeface.DEFAULT;
                        }
                        textView2.setTypeface(typeface2);
                        textView2.setTextSize(1, 20.0f);
                        if (uniqueStage != null) {
                            textView2.setOnClickListener(new cn(i3, stageDetailsActivity, uniqueStage));
                        }
                        aba.y(textView2, R.color.on_color_secondary, 2);
                        Context context3 = textView2.getContext();
                        context3.getClass();
                        int s = ao2.s(24, stageDetailsActivity);
                        Drawable drawable3 = context3.getDrawable(R.drawable.ic_chevron_right_small_16);
                        if (drawable3 == null || (drawable = drawable3.mutate()) == null) {
                            drawable = null;
                        } else {
                            drawable.setTint(context3.getColor(R.color.on_color_primary));
                            drawable.setBounds(0, 0, s, s);
                        }
                        haa.K(textView2, drawable, ua5.b, null, null);
                        su suVar = stageDetailsActivity.x;
                        if (stageDetailsActivity.P == null) {
                            stageDetailsActivity.Y(stage);
                        } else {
                            Stage stageEvent = stage.getStageEvent();
                            if (stageEvent == null) {
                                stageEvent = stage;
                            }
                            stageDetailsActivity.P = stageEvent;
                        }
                        suVar.a = Integer.valueOf(stage.getId());
                        suVar.c = stage.getStatusType();
                        Stage stage2 = stageDetailsActivity.P;
                        if (stage2 != null) {
                            stageDetailsActivity.S = new jp6(stageDetailsActivity, stageDetailsActivity.Q().k, stageDetailsActivity.Q().h, stage2);
                            ViewPager2 viewPager2 = stageDetailsActivity.Q().k;
                            jp6 jp6Var = stageDetailsActivity.S;
                            if (jp6Var == null) {
                                Intrinsics.i("viewPagerAdapter");
                                throw null;
                            }
                            viewPager2.setAdapter(jp6Var);
                            kp5 kp5Var2 = o4i.h;
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj5 : kp5Var2) {
                                if (((Boolean) ((o4i) obj5).b.invoke(i4iVar)).booleanValue()) {
                                    arrayList2.add(obj5);
                                }
                            }
                            Iterator it = arrayList2.iterator();
                            while (it.hasNext()) {
                                o4i o4iVar = (o4i) it.next();
                                if (o4iVar != o4i.f || Intrinsics.c(stage.getStatusType(), StatusKt.STATUS_FINISHED)) {
                                    jp6 jp6Var2 = stageDetailsActivity.S;
                                    if (jp6Var2 == null) {
                                        Intrinsics.i("viewPagerAdapter");
                                        throw null;
                                    }
                                    jp6Var2.v(o4iVar, jp6Var2.l.size());
                                } else {
                                    jp6 jp6Var3 = stageDetailsActivity.S;
                                    if (jp6Var3 == null) {
                                        Intrinsics.i("viewPagerAdapter");
                                        throw null;
                                    }
                                    jp6Var3.v(o4iVar, 1);
                                }
                            }
                            o4i o4iVar2 = stageDetailsActivity.N;
                            if (o4iVar2 != null) {
                                stageDetailsActivity.N = null;
                                jp6 jp6Var4 = stageDetailsActivity.S;
                                if (jp6Var4 == null) {
                                    Intrinsics.i("viewPagerAdapter");
                                    throw null;
                                }
                                int D = jp6Var4.D(o4iVar2);
                                Integer valueOf = D >= 0 ? Integer.valueOf(D) : null;
                                if (valueOf != null) {
                                    stageDetailsActivity.Q().k.c(valueOf.intValue(), false);
                                }
                            }
                            AdBannerView adBannerView2 = stageDetailsActivity.Q().b;
                            ltb ltbVar2 = new ltb();
                            Stage stage3 = stageDetailsActivity.P;
                            if (stage3 != null && (stageSeason = stage3.getStageSeason()) != null && (sportName = StageSeasonKt.getSportName(stageSeason)) != null) {
                                ltbVar2.put(SearchResponseKt.SPORT_ENTITY, sportName);
                            }
                            stageDetailsActivity.I(adBannerView2, ltbVar2.d());
                        }
                    }
                }
                return Unit.a;
            case 14:
                StageTeamHistoryResponse stageTeamHistoryResponse2 = (StageTeamHistoryResponse) obj;
                StageDriverDetailsFragment stageDriverDetailsFragment = (StageDriverDetailsFragment) this.receiver;
                a5i a5iVar = (a5i) stageDriverDetailsFragment.w.getValue();
                StageSportDriverCareerData stageSportDriverCareerData2 = (stageTeamHistoryResponse2 == null || (total2 = stageTeamHistoryResponse2.getTotal()) == null) ? null : (StageSportDriverCareerData) CollectionsKt.firstOrNull(total2);
                Team l2 = stageDriverDetailsFragment.C().l();
                Context context4 = a5iVar.b;
                xbb b3 = a.b();
                if (stageSportDriverCareerData2 != null) {
                    Integer valueOf2 = Integer.valueOf(stageSportDriverCareerData2.getWorldChampionshipTitles());
                    if (stageSportDriverCareerData2.getWorldChampionshipTitles() <= 0) {
                        valueOf2 = null;
                    }
                    if (valueOf2 != null) {
                        int intValue = valueOf2.intValue();
                        String string7 = context4.getString(R.string.championship_titles);
                        string7.getClass();
                        b3.add(new i8i(string7, String.valueOf(intValue), true));
                    }
                    if (stageSportDriverCareerData2.getRacesStarted() > 0) {
                        String string8 = context4.getString(R.string.grand_prix_starts);
                        string8.getClass();
                        b3.add(new i8i(string8, String.valueOf(stageSportDriverCareerData2.getRacesStarted()), false));
                        String string9 = context4.getString(R.string.podiums);
                        string9.getClass();
                        b3.add(new i8i(string9, String.valueOf(stageSportDriverCareerData2.getPodiums()), false));
                        String string10 = context4.getString(R.string.wins);
                        string10.getClass();
                        b3.add(new i8i(string10, String.valueOf(stageSportDriverCareerData2.getVictories()), false));
                        String string11 = context4.getString(R.string.pole_positions);
                        string11.getClass();
                        b3.add(new i8i(string11, String.valueOf(stageSportDriverCareerData2.getPolePositions()), false));
                    }
                }
                if (l2 != null && (playerTeamInfo6 = l2.getPlayerTeamInfo()) != null && (residence = playerTeamInfo6.getResidence()) != null) {
                    String string12 = context4.getString(R.string.residence);
                    string12.getClass();
                    b3.add(new i8i(string12, residence, false));
                }
                if (l2 != null && (playerTeamInfo5 = l2.getPlayerTeamInfo()) != null && (birthplace = playerTeamInfo5.getBirthplace()) != null) {
                    String string13 = context4.getString(R.string.birthplace);
                    string13.getClass();
                    b3.add(new i8i(string13, birthplace, false));
                }
                a5iVar.F(a.a(b3));
                Team l3 = stageDriverDetailsFragment.C().l();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = dv3.a;
                com.sofascore.model.Country a = dv3.a((l3 == null || (country = l3.getCountry()) == null) ? null : country.getAlpha2());
                if (a != null) {
                    GridItem gridItem = new GridItem(GridItem.Type.IMAGE, stageDriverDetailsFragment.getString(R.string.nationality));
                    gridItem.setFirst(a.getIoc());
                    gridItem.setCountryCode(a.getIso2Alpha());
                    gridItem.setIsEnabled(true);
                    arrayList3.add(gridItem);
                }
                Long birthDateTimestamp = (l3 == null || (playerTeamInfo4 = l3.getPlayerTeamInfo()) == null) ? null : playerTeamInfo4.getBirthDateTimestamp();
                if (birthDateTimestamp != null) {
                    int between = (int) ChronoUnit.YEARS.between(vxd.o(Instant.ofEpochMilli(birthDateTimestamp.longValue() * 1000)), vxd.o(Instant.ofEpochMilli(yaa.v())));
                    long longValue = birthDateTimestamp.longValue();
                    bi4 bi4Var2 = bi4.PATTERN_DMMY;
                    Locale d = dla.d();
                    ZoneId of = ZoneId.of("GMT");
                    of.getClass();
                    GridItem gridItem2 = new GridItem(GridItem.Type.SPLIT, rik.i(longValue, bi4Var2, d, of));
                    PlayerTeamInfo playerTeamInfo7 = l3.getPlayerTeamInfo();
                    Long dateOfDeathTimestamp = playerTeamInfo7 != null ? playerTeamInfo7.getDateOfDeathTimestamp() : null;
                    PlayerTeamInfo playerTeamInfo8 = l3.getPlayerTeamInfo();
                    if (playerTeamInfo8 != null ? Intrinsics.c(playerTeamInfo8.getDeceased(), Boolean.TRUE) : false) {
                        if (dateOfDeathTimestamp != null) {
                            Context requireContext = stageDriverDetailsFragment.requireContext();
                            requireContext.getClass();
                            String Q3 = hkg.Q(requireContext, R.string.deceased, l3.getGender(), new Object[0]);
                            long longValue2 = dateOfDeathTimestamp.longValue();
                            bi4 bi4Var3 = bi4.PATTERN_Y;
                            Locale d2 = dla.d();
                            ZoneId of2 = ZoneId.of("GMT");
                            of2.getClass();
                            Q = wv8.i(Q3, " ", rik.i(longValue2, bi4Var3, d2, of2));
                        } else {
                            Context requireContext2 = stageDriverDetailsFragment.requireContext();
                            requireContext2.getClass();
                            Q = hkg.Q(requireContext2, R.string.deceased, l3.getGender(), new Object[0]);
                        }
                        gridItem2.setSecond(Q);
                        gridItem2.setGrayedSecondText(true);
                    } else {
                        gridItem2.setFirst(stageDriverDetailsFragment.getResources().getQuantityString(R.plurals.years_short, between, String.valueOf(between)));
                        gridItem2.setSecond(stageDriverDetailsFragment.getResources().getQuantityString(R.plurals.years_short, between, ""));
                    }
                    arrayList3.add(gridItem2);
                }
                int intValue2 = (l3 == null || (playerTeamInfo3 = l3.getPlayerTeamInfo()) == null || (number = playerTeamInfo3.getNumber()) == null) ? 0 : number.intValue();
                if (intValue2 > 0) {
                    GridItem.Type type = GridItem.Type.DEFAULT;
                    if (l3 != null) {
                        joa joaVar = l5i.a;
                        bool = Boolean.valueOf(l5i.h(l3));
                    } else {
                        bool = null;
                    }
                    GridItem gridItem3 = new GridItem(type, stageDriverDetailsFragment.getString(Intrinsics.c(bool, Boolean.TRUE) ? R.string.motorsport_riders_race_number : R.string.motorosport_drivers_race_number));
                    gridItem3.setFirst(String.valueOf(intValue2));
                    arrayList3.add(gridItem3);
                }
                if (l3 != null && (playerTeamInfo2 = l3.getPlayerTeamInfo()) != null && (height = playerTeamInfo2.getHeight()) != null) {
                    double doubleValue = height.doubleValue();
                    GridItem gridItem4 = new GridItem(GridItem.Type.DISABLED_ALL_CAPS, stageDriverDetailsFragment.getString(R.string.player_height));
                    Context requireContext3 = stageDriverDetailsFragment.requireContext();
                    requireContext3.getClass();
                    w = v7a.w(requireContext3, doubleValue, (r4 & 4) == 0, false);
                    gridItem4.setFirst(w);
                    arrayList3.add(gridItem4);
                }
                if (l3 != null && (playerTeamInfo = l3.getPlayerTeamInfo()) != null && (weight = playerTeamInfo.getWeight()) != null) {
                    double doubleValue2 = weight.doubleValue();
                    GridItem gridItem5 = new GridItem(GridItem.Type.DISABLED_ALL_CAPS, stageDriverDetailsFragment.getString(R.string.motorsport_driver_weight));
                    Context requireContext4 = stageDriverDetailsFragment.requireContext();
                    requireContext4.getClass();
                    gridItem5.setFirst(v7a.q(requireContext4, doubleValue2));
                    arrayList3.add(gridItem5);
                }
                ((ofe) stageDriverDetailsFragment.v.getValue()).a(arrayList3);
                if (arrayList3.isEmpty()) {
                    stageDriverDetailsFragment.D().c.setVisibility(8);
                } else {
                    stageDriverDetailsFragment.D().c.setVisibility(0);
                    int size = ((arrayList3.size() - 1) / 3) + 1;
                    GridView gridView = stageDriverDetailsFragment.D().c;
                    ViewGroup.LayoutParams layoutParams = gridView.getLayoutParams();
                    if (layoutParams == null) {
                        yhk.s("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        return null;
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    Context requireContext5 = stageDriverDetailsFragment.requireContext();
                    requireContext5.getClass();
                    marginLayoutParams.height = ao2.s(56, requireContext5) * size;
                    gridView.setLayoutParams(marginLayoutParams);
                }
                return Unit.a;
            case 15:
                List list2 = (List) obj;
                list2.getClass();
                StageSeriesWeekFragment stageSeriesWeekFragment = (StageSeriesWeekFragment) this.receiver;
                stageSeriesWeekFragment.n();
                stageSeriesWeekFragment.C().F(list2);
                krk krkVar = stageSeriesWeekFragment.l;
                krkVar.getClass();
                ((rp8) krkVar).c.scrollToPosition(0);
                return Unit.a;
            case 16:
                ((u7i) this.receiver).e(((Number) obj).intValue());
                return Unit.a;
            case 17:
                int intValue3 = ((Number) obj).intValue();
                TeamAchievementsView teamAchievementsView = (TeamAchievementsView) this.receiver;
                int i9 = TeamAchievementsView.m;
                teamAchievementsView.getClass();
                a99 a99Var = LeagueActivity.h0;
                Context context5 = teamAchievementsView.getContext();
                context5.getClass();
                a99.A(a99Var, context5, Integer.valueOf(intValue3), 0, null, null, null, null, 4088);
                return Unit.a;
            case 18:
                TeamDetailsHeadFlags teamDetailsHeadFlags = (TeamDetailsHeadFlags) obj;
                TeamActivity teamActivity = (TeamActivity) this.receiver;
                int i10 = TeamActivity.Z;
                teamActivity.Q().l.setRefreshing(false);
                teamActivity.Q().l.setEnabled(false);
                as9.o(teamActivity.R(), teamActivity.a0());
                if (teamDetailsHeadFlags != null) {
                    Team team = teamDetailsHeadFlags.getTeam();
                    u4j b0 = teamActivity.b0();
                    b0.getClass();
                    team.getClass();
                    b0.u = team;
                    int id = team.getId();
                    Intent intent = teamActivity.getIntent();
                    intent.getClass();
                    nv.h0(teamActivity, id, intent);
                    teamActivity.c0(teamDetailsHeadFlags.getTeam());
                    if (!teamActivity.T) {
                        teamActivity.T = true;
                        new iui(teamActivity, i5);
                        teamActivity.Q().l.setEnabled(false);
                        iz8.D(teamActivity.Q().f, team, false);
                        ((TextView) teamActivity.Q().f.g).setText(tba.p(teamActivity, team));
                        if (team.getNational()) {
                            c = wyh.c(teamActivity, team.getSportSlug());
                        } else {
                            Country country3 = team.getCountry();
                            c = tv3.c(teamActivity, country3 != null ? country3.getName() : null);
                        }
                        TextView textView3 = (TextView) teamActivity.Q().f.i;
                        textView3.setVisibility(!StringsKt.R(c) ? 0 : 8);
                        textView3.setText(c);
                        ImageView imageView = (ImageView) teamActivity.Q().f.j;
                        if (team.getNational()) {
                            Set set = wyh.a;
                            imageView.setImageResource(wyh.a(team.getSportSlug()));
                            imageView.setVisibility(n9e.F(team.getSportSlug()) ? 0 : 8);
                            imageView.setImageTintList(ColorStateList.valueOf(imageView.getContext().getColor(R.color.on_color_primary)));
                        } else {
                            Country country4 = team.getCountry();
                            as9.c(imageView, country4 != null ? country4.getAlpha2() : null, true, null, 4);
                            Country country5 = team.getCountry();
                            imageView.setVisibility((country5 != null ? country5.getAlpha2() : null) != null ? 0 : 8);
                        }
                        BrandingTeam Y = teamActivity.Y();
                        if (Y != null ? Intrinsics.c(Y.getAppHeader(), Boolean.TRUE) : false) {
                            ToolbarBackgroundAppBarLayout toolbarBackgroundAppBarLayout = teamActivity.Q().d;
                            BrandingTeam Y2 = teamActivity.Y();
                            toolbarBackgroundAppBarLayout.setBackground(new ly0(team.getId(), (Y2 == null || (brand = Y2.getBrand()) == null) ? null : Integer.valueOf(brand.getId())));
                        } else {
                            Set set2 = wyh.a;
                            Sport sport2 = team.getSport();
                            if (wyh.e(sport2 != null ? sport2.getSlug() : null)) {
                                if (!team.hasSubTeams() && (country2 = team.getCountry()) != null && (alpha22 = country2.getAlpha2()) != null) {
                                    if (alpha22.length() <= 0) {
                                        alpha22 = null;
                                    }
                                    if (alpha22 != null) {
                                        teamActivity.Q().d.setBackground(new uy0(alpha22));
                                    }
                                }
                            } else if (team.getNational()) {
                                Country country6 = team.getCountry();
                                if (country6 != null && (alpha2 = country6.getAlpha2()) != null) {
                                    if (alpha2.length() <= 0) {
                                        alpha2 = null;
                                    }
                                    if (alpha2 != null) {
                                        teamActivity.Q().d.setBackground(new uy0(alpha2));
                                    }
                                }
                            } else {
                                Sport sport3 = team.getSport();
                                if (!Intrinsics.c(sport3 != null ? sport3.getSlug() : null, Sports.MINI_FOOTBALL) || team.getPrimaryUniqueTournament() == null) {
                                    vy0Var = new vy0(teamActivity.a0());
                                } else {
                                    UniqueTournament primaryUniqueTournament = team.getPrimaryUniqueTournament();
                                    vy0Var = new qy0(primaryUniqueTournament != null ? primaryUniqueTournament.getId() : 0, 0);
                                }
                                teamActivity.Q().d.setBackground(vy0Var);
                            }
                        }
                        BrandingTeam Y3 = teamActivity.Y();
                        Brand brand2 = Y3 != null ? Y3.getBrand() : null;
                        if (brand2 != null) {
                            BrandingTeam Y4 = teamActivity.Y();
                            if (Y4 != null ? Intrinsics.c(Y4.getTakeoverImage(), Boolean.TRUE) : false) {
                                LinearLayout linearLayout = teamActivity.Q().c;
                                f32 f32Var = new f32(teamActivity, 1);
                                Integer valueOf3 = Integer.valueOf(teamActivity.a0());
                                BrandingTeam Y5 = teamActivity.Y();
                                f32.a(f32Var, brand2, null, valueOf3, Y5 != null ? Y5.getTakeoverImageHeight() : null, BrandLocation.TeamScreen, 2);
                                BrandingTeam Y6 = teamActivity.Y();
                                if (Y6 != null) {
                                    Context context6 = f32Var.getContext();
                                    context6.getClass();
                                    c1g L = tz9.L(context6, Y6.getBackgroundColor(), Y6.getBackgroundGradientColor());
                                    if (L != null) {
                                        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.LEFT_RIGHT;
                                        int i11 = L.a;
                                        gradientDrawable = new GradientDrawable(orientation, new int[]{i11, L.b, i11});
                                        f32Var.setBackground(gradientDrawable);
                                        linearLayout.removeAllViews();
                                        linearLayout.addView(f32Var);
                                        linearLayout.setVisibility(0);
                                    }
                                }
                                gradientDrawable = null;
                                f32Var.setBackground(gradientDrawable);
                                linearLayout.removeAllViews();
                                linearLayout.addView(f32Var);
                                linearLayout.setVisibility(0);
                            }
                        }
                        AdBannerView adBannerView3 = teamActivity.Q().b;
                        ltb ltbVar3 = new ltb();
                        Sport sport4 = teamActivity.b0().J().getSport();
                        if (sport4 != null && (slug2 = sport4.getSlug()) != null) {
                            ltbVar3.put(SearchResponseKt.SPORT_ENTITY, slug2);
                        }
                        ltbVar3.put("team_id", String.valueOf(teamActivity.a0()));
                        ltbVar3.put("page", "team");
                        teamActivity.I(adBannerView3, ltbVar3.d());
                    }
                    kp5 kp5Var3 = t4j.k;
                    ArrayList arrayList5 = new ArrayList();
                    for (Object obj6 : kp5Var3) {
                        if (((Boolean) ((t4j) obj6).b.invoke(teamDetailsHeadFlags)).booleanValue()) {
                            arrayList5.add(obj6);
                        }
                    }
                    teamActivity.b0().x(arrayList5);
                    if (teamActivity.X != null) {
                        u4j b02 = teamActivity.b0();
                        t4j t4jVar = teamActivity.X;
                        if (t4jVar == null) {
                            t4jVar = t4j.c;
                        }
                        int D2 = b02.D(t4jVar);
                        if (D2 >= 0) {
                            teamActivity.Q().k.c(D2, false);
                        }
                        teamActivity.X = null;
                    }
                    if (teamDetailsHeadFlags.getTransfers()) {
                        ExtendedFloatingActionButton extendedFloatingActionButton = teamActivity.Q().e;
                        extendedFloatingActionButton.setTransformationMethod(null);
                        Team Z = teamActivity.Z();
                        extendedFloatingActionButton.setText(teamActivity.getString(Intrinsics.c(Z != null ? Z.getSportSlug() : null, Sports.BASKETBALL) ? R.string.transactions : R.string.transfers));
                        Context context7 = extendedFloatingActionButton.getContext();
                        context7.getClass();
                        int s2 = ao2.s(16, context7);
                        Drawable drawable4 = teamActivity.getDrawable(R.drawable.ic_transfer_swap);
                        if (drawable4 != null && (mutate = drawable4.mutate()) != null) {
                            mutate.setTint(teamActivity.getColor(R.color.surface_1));
                            mutate.setBounds(0, 0, s2, s2);
                            drawable2 = mutate;
                        }
                        extendedFloatingActionButton.setIcon(drawable2);
                        extendedFloatingActionButton.setOnClickListener(new eyd(i2, teamActivity, extendedFloatingActionButton));
                        teamActivity.e0(teamActivity.Q().k.getCurrentItem());
                        teamActivity.Q().h.a(new kta(teamActivity, i4));
                    }
                }
                teamActivity.d0();
                teamActivity.Q().d.a(new xq5(teamActivity, i));
                return Unit.a;
            case 19:
                hxi hxiVar = (hxi) obj;
                hxiVar.getClass();
                TeamInfoView teamInfoView = (TeamInfoView) this.receiver;
                int i12 = TeamInfoView.l;
                teamInfoView.m(hxiVar);
                return Unit.a;
            case 20:
                List list3 = (List) obj;
                list3.getClass();
                TeamPlayerStatsFragment teamPlayerStatsFragment = (TeamPlayerStatsFragment) this.receiver;
                e1d e1dVar = teamPlayerStatsFragment.y;
                e1d e1dVar2 = teamPlayerStatsFragment.z;
                ((eoh) e1dVar).setValue(list3);
                syi syiVar = (syi) CollectionsKt.firstOrNull((List) ((eoh) teamPlayerStatsFragment.y).getValue());
                e1d e1dVar3 = teamPlayerStatsFragment.A;
                ((eoh) e1dVar3).setValue(syiVar);
                syi syiVar2 = (syi) ((eoh) e1dVar3).getValue();
                if (syiVar2 != null && (list = syiVar2.c) != null) {
                    obj2 = SeasonKt.mapToSubSeasonType(list);
                }
                if (obj2 == null) {
                    obj2 = km5.a;
                }
                ((eoh) e1dVar2).setValue(obj2);
                ((eoh) teamPlayerStatsFragment.B).setValue((Season.SubSeasonType) CollectionsKt.firstOrNull((List) ((eoh) e1dVar2).getValue()));
                teamPlayerStatsFragment.u();
                return Unit.a;
            case 21:
                return b(obj);
            case 22:
                return c(obj);
            case 23:
                ((TeamPlayerStatsFragment) this.receiver).H(((Number) obj).intValue());
                return Unit.a;
            case 24:
                return d(obj);
            case 25:
                ((d8j) this.receiver).b.a((Function1) obj);
                return Unit.a;
            case 26:
                return e(obj);
            case 27:
                return f(obj);
            case 28:
                List list4 = (List) obj;
                list4.getClass();
                ((xlj) this.receiver).getClass();
                return xlj.b(list4);
            default:
                List list5 = (List) obj;
                list5.getClass();
                ((xlj) this.receiver).getClass();
                return xlj.b(list5);
        }
        r15 = false;
        return Boolean.valueOf(r15);
    }
}
