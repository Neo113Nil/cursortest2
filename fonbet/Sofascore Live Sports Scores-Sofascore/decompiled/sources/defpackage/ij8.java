package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.foundation.lazy.layout.c;
import androidx.fragment.app.Fragment;
import com.inmobi.ads.InMobiBanner;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Gender;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.newNetwork.PlayerOfTheSeasonResponse;
import com.sofascore.results.R;
import com.sofascore.results.event.details.view.promotion.PromotionBannerView;
import com.sofascore.results.event.statistics.view.football.FootballShotmapView;
import com.sofascore.results.featureWalkthrough.FeatureWalkthroughFullScreenDialog;
import com.sofascore.results.league.fragment.details.LeagueDetailsFragment;
import com.sofascore.results.league.fragment.details.view.PlayerOfTheSeasonInfoBottomSheet;
import com.sofascore.results.league.fragment.events.LeagueEventsFragment;
import com.sofascore.results.player.PlayerActivity;
import com.sofascore.results.view.InformationView;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class ij8 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ij8(d6d d6dVar, h6d h6dVar, ip8 ip8Var, Fragment fragment) {
        this.a = 4;
        this.b = h6dVar;
        this.c = fragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [rq3] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.String] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        long a;
        String[] names;
        vt7 vt7Var = null;
        r3 = null;
        ih9[] ih9VarArr = null;
        switch (this.a) {
            case 0:
                Context context = (Context) this.b;
                kj8 kj8Var = (kj8) this.c;
                LayoutInflater from = LayoutInflater.from(context);
                FrameLayout frameLayout = kj8Var.getBinding().b;
                View inflate = from.inflate(R.layout.view_event_football_header_goals_container, (ViewGroup) frameLayout, false);
                frameLayout.addView(inflate);
                int i = R.id.away_team_goals;
                LinearLayout linearLayout = (LinearLayout) nq8.B(R.id.away_team_goals, inflate);
                if (linearLayout != null) {
                    LinearLayout linearLayout2 = (LinearLayout) inflate;
                    i = R.id.home_team_goals;
                    LinearLayout linearLayout3 = (LinearLayout) nq8.B(R.id.home_team_goals, inflate);
                    if (linearLayout3 != null) {
                        i = R.id.ic_goal;
                        ImageView imageView = (ImageView) nq8.B(R.id.ic_goal, inflate);
                        if (imageView != null) {
                            return new ksk(linearLayout2, linearLayout, linearLayout2, linearLayout3, imageView);
                        }
                    }
                }
                yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
                return null;
            case 1:
                ((nj8) this.b).o((mj8) this.c, true, true);
                return Unit.a;
            case 2:
                ((Function1) this.b).invoke((oz6) this.c);
                return Unit.a;
            case 3:
                Integer num = (Integer) this.b;
                FootballShotmapView footballShotmapView = (FootballShotmapView) this.c;
                if (num != null) {
                    int intValue = num.intValue();
                    Context context2 = footballShotmapView.getContext();
                    context2.getClass();
                    nv.D(context2, intValue, "shot_click", uk8.EVENT_STATISTICS);
                }
                return Unit.a;
            case 4:
                h6d h6dVar = (h6d) this.b;
                Fragment fragment = (Fragment) this.c;
                for (d6d d6dVar : (Iterable) h6dVar.f.a.getValue()) {
                    if (ip8.n()) {
                        Objects.toString(d6dVar);
                        Objects.toString(fragment);
                    }
                    h6dVar.c(d6dVar);
                }
                return Unit.a;
            case 5:
                ((View) this.b).removeOnAttachStateChangeListener((oym) this.c);
                return Unit.a;
            case 6:
                av8 av8Var = (av8) this.b;
                twc twcVar = (twc) this.c;
                av8Var.F(twcVar.a, twcVar.g, twcVar.b, true);
                return Unit.a;
            case 7:
                ((Function1) this.b).invoke(new yv7((v39) this.c));
                return Unit.a;
            case 8:
                ((Function1) this.b).invoke(new yv7((b49) this.c));
                return Unit.a;
            case 9:
                dc9 dc9Var = (dc9) this.b;
                rlj rljVar = (rlj) this.c;
                Context context3 = dc9Var.b;
                String string = context3.getString(R.string.average_sofascore_rating);
                string.getClass();
                gvh e0 = rljVar != null ? rljVar.e0() : null;
                gvh gvhVar = gvh.d;
                String string2 = e0 == gvhVar ? context3.getString(R.string.average_rating_players_all_time) : context3.getString(R.string.average_rating_teams_all_time);
                string2.getClass();
                f7a.w(context3, string, string2, "HistoricalDataModal", (rljVar != null ? rljVar.e0() : null) != gvhVar ? context3.getString(R.string.bottom_sheet_new_rating_calculation_addition) : 0);
                return Unit.a;
            case 10:
                ((Function1) this.b).invoke(Integer.valueOf(((ke9) this.c).b));
                return Unit.a;
            case 11:
                zg9 zg9Var = (zg9) this.b;
                ih9 ih9Var = (ih9) this.c;
                try {
                    zg9Var.a.d(ih9Var);
                } catch (IOException e) {
                    gie gieVar = gie.a;
                    gie.a.i(4, "Http2Connection.Listener failure for " + zg9Var.c);
                    try {
                        ih9Var.c(tp5.PROTOCOL_ERROR, e);
                    } catch (IOException unused) {
                    }
                }
                return Unit.a;
            case 12:
                pi piVar = (pi) this.b;
                aah aahVar = (aah) this.c;
                fsf fsfVar = new fsf();
                zg9 zg9Var2 = (zg9) piVar.c;
                synchronized (zg9Var2.x) {
                    synchronized (zg9Var2) {
                        try {
                            aah aahVar2 = zg9Var2.s;
                            aah aahVar3 = new aah();
                            aahVar2.getClass();
                            for (int i2 = 0; i2 < 10; i2++) {
                                if (((1 << i2) & aahVar2.a) != 0) {
                                    aahVar3.b(i2, aahVar2.b[i2]);
                                }
                            }
                            for (int i3 = 0; i3 < 10; i3++) {
                                if (((1 << i3) & aahVar.a) != 0) {
                                    aahVar3.b(i3, aahVar.b[i3]);
                                }
                            }
                            fsfVar.a = aahVar3;
                            a = aahVar3.a() - aahVar2.a();
                            if (a != 0 && !zg9Var2.b.isEmpty()) {
                                ih9VarArr = (ih9[]) zg9Var2.b.values().toArray(new ih9[0]);
                            }
                            aah aahVar4 = (aah) fsfVar.a;
                            aahVar4.getClass();
                            zg9Var2.s = aahVar4;
                            bui.c(zg9Var2.j, zg9Var2.c + " onSettings", new ij8(13, zg9Var2, fsfVar));
                            Unit unit = Unit.a;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    try {
                        zg9Var2.x.e((aah) fsfVar.a);
                    } catch (IOException e2) {
                        tp5 tp5Var = tp5.PROTOCOL_ERROR;
                        zg9Var2.e(tp5Var, tp5Var, e2);
                    }
                    Unit unit2 = Unit.a;
                }
                if (ih9VarArr != null) {
                    for (ih9 ih9Var2 : ih9VarArr) {
                        synchronized (ih9Var2) {
                            ih9Var2.e += a;
                            if (a > 0) {
                                ih9Var2.notifyAll();
                            }
                            Unit unit3 = Unit.a;
                        }
                    }
                }
                return Unit.a;
            case 13:
                zg9 zg9Var3 = (zg9) this.b;
                zg9Var3.a.c(zg9Var3, (aah) ((fsf) this.c).a);
                return Unit.a;
            case 14:
                Context context4 = (Context) this.b;
                qp9 qp9Var = (qp9) this.c;
                int i4 = PlayerActivity.Z;
                jle.q(context4, qp9Var.a, 0, null, null, false, null, null, IronSourceError.ERROR_CODE_INIT_FAILED);
                return Unit.a;
            case 15:
                ((Function1) this.b).invoke(new yv7((w31) this.c));
                return Unit.a;
            case 16:
                return InMobiBanner.a((InMobiBanner) this.b, (byte[]) this.c);
            case 17:
                return vz9.a(((yy9) this.b).m, (ViewGroup) this.c);
            case 18:
                ((Function1) this.b).invoke(new aw7(((daa) this.c).j.a, 26));
                return Unit.a;
            case 19:
                ((Function1) this.b).invoke((mea) this.c);
                return Unit.a;
            case 20:
                SerialDescriptor serialDescriptor = (SerialDescriptor) this.b;
                yea yeaVar = (yea) this.c;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                gfa gfaVar = yeaVar.a;
                hz8.Q(yeaVar, serialDescriptor);
                int d = serialDescriptor.d();
                for (int i5 = 0; i5 < d; i5++) {
                    List f = serialDescriptor.f(i5);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : f) {
                        if (obj instanceof fga) {
                            arrayList.add(obj);
                        }
                    }
                    fga fgaVar = (fga) CollectionsKt.F0(arrayList);
                    if (fgaVar != null && (names = fgaVar.names()) != null) {
                        for (String str : names) {
                            String str2 = Intrinsics.c(serialDescriptor.getKind(), p5h.f) ? "enum value" : "property";
                            if (linkedHashMap.containsKey(str)) {
                                throw new ofa(yfa.m(-1, "The suggested name '" + str + "' for " + str2 + ' ' + serialDescriptor.e(i5) + " is already one of the names for " + str2 + ' ' + serialDescriptor.e(((Number) rub.a(str, linkedHashMap)).intValue()) + " in " + serialDescriptor, null, null, null));
                            }
                            linkedHashMap.put(str, Integer.valueOf(i5));
                        }
                    }
                }
                if (!linkedHashMap.isEmpty()) {
                    return linkedHashMap;
                }
                lm5 lm5Var = lm5.a;
                lm5Var.getClass();
                return lm5Var;
            case 21:
                return Integer.valueOf(((w8l) this.b).c((kx4) this.c));
            case 22:
                ay4 ay4Var = (ay4) this.b;
                qpa qpaVar = (qpa) this.c;
                yoa yoaVar = (yoa) ay4Var.getValue();
                return new zoa(qpaVar, yoaVar, new c((IntRange) qpaVar.d.f.getValue(), yoaVar));
            case 23:
                ay4 ay4Var2 = (ay4) this.b;
                a6e a6eVar = (a6e) this.c;
                o5e o5eVar = (o5e) ay4Var2.getValue();
                return new p5e(a6eVar, o5eVar, new c((IntRange) ((yqa) a6eVar.d.f).getValue(), o5eVar));
            case 24:
                spg spgVar = (spg) this.b;
                mpg mpgVar = (mpg) this.c;
                lm5 lm5Var2 = lm5.a;
                lm5Var2.getClass();
                return new ssa(spgVar, lm5Var2, mpgVar);
            case 25:
                ((Function1) this.b).invoke((vw0) this.c);
                return Unit.a;
            case 26:
                ((LeagueDetailsFragment) this.b).D().B((PromotionBannerView) this.c);
                return Unit.a;
            case 27:
                LeagueDetailsFragment leagueDetailsFragment = (LeagueDetailsFragment) this.b;
                PlayerOfTheSeasonResponse playerOfTheSeasonResponse = (PlayerOfTheSeasonResponse) this.c;
                if (Intrinsics.c(leagueDetailsFragment.G().getSportSlug(), Sports.BASKETBALL)) {
                    Context requireContext = leagueDetailsFragment.requireContext();
                    requireContext.getClass();
                    Team team = playerOfTheSeasonResponse.getTeam();
                    Gender gender = team != null ? team.getGender() : null;
                    String sportSlug = leagueDetailsFragment.G().getSportSlug();
                    sportSlug.getClass();
                    PlayerOfTheSeasonInfoBottomSheet playerOfTheSeasonInfoBottomSheet = new PlayerOfTheSeasonInfoBottomSheet();
                    playerOfTheSeasonInfoBottomSheet.setArguments(fz8.C(fz8.H("ARG_GENDER", gender != null ? gender.getValue() : null), fz8.H("ARG_SPORT_SLUG", sportSlug)));
                    if (requireContext instanceof csk) {
                        requireContext = ((csk) requireContext).getBaseContext();
                    }
                    AppCompatActivity appCompatActivity = requireContext instanceof AppCompatActivity ? (AppCompatActivity) requireContext : null;
                    if (appCompatActivity != null) {
                        wca.x(appCompatActivity.getLifecycle()).b(new r1(playerOfTheSeasonInfoBottomSheet, appCompatActivity, r3, 3));
                    }
                } else {
                    String sportSlug2 = leagueDetailsFragment.G().getSportSlug();
                    sportSlug2.getClass();
                    if (sportSlug2.equals(Sports.FOOTBALL)) {
                        vt7Var = ut7.a;
                    } else if (sportSlug2.equals(Sports.BASKETBALL)) {
                        vt7Var = tt7.a;
                    }
                    if (vt7Var != null) {
                        FeatureWalkthroughFullScreenDialog featureWalkthroughFullScreenDialog = new FeatureWalkthroughFullScreenDialog();
                        featureWalkthroughFullScreenDialog.setArguments(hz8.E(new Pair("TYPE", vt7Var.getKey())));
                        featureWalkthroughFullScreenDialog.p(leagueDetailsFragment.requireActivity().k(), "FeatureWalkthroughFullScreenDialog");
                    }
                }
                return Unit.a;
            case 28:
                ((ka9) this.b).w((g6c) this.c);
                return Unit.a;
            default:
                InformationView informationView = (InformationView) this.b;
                LeagueEventsFragment leagueEventsFragment = (LeagueEventsFragment) this.c;
                informationView.setVisibility(8);
                Context i6 = leagueEventsFragment.G().i();
                SharedPreferences sharedPreferences = uic.j;
                if (sharedPreferences == null) {
                    Context applicationContext = i6.getApplicationContext();
                    synchronized (uic.i) {
                        sharedPreferences = a5f.d(applicationContext);
                        uic.j = sharedPreferences;
                    }
                    sharedPreferences.getClass();
                }
                SharedPreferences.Editor i7 = dmi.i(sharedPreferences, "PREF_TENNIS_COURT_DISCLAIMER", false);
                Unit unit4 = Unit.a;
                i7.apply();
                return Unit.a;
        }
    }

    public /* synthetic */ ij8(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
