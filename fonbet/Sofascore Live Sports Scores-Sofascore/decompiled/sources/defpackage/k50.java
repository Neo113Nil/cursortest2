package defpackage;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import android.util.Base64;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.content.FileProvider;
import androidx.viewpager2.widget.ViewPager2;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.equativ.displaysdk.adadapter.SASParallaxBannerAdapter;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.ironsource.C4094gc;
import com.ironsource.U3;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Category;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Sport;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.newNetwork.CategoriesForDateResponse;
import com.sofascore.model.newNetwork.CategoryWrapper;
import com.sofascore.model.newNetwork.DistinctEventSet;
import com.sofascore.model.newNetwork.SearchPlayersResponse;
import com.sofascore.model.newNetwork.StageDriverPerformance;
import com.sofascore.model.newNetwork.StageDriverPerformanceRaceEntry;
import com.sofascore.results.R;
import com.sofascore.results.fantasy.competition.FantasyCompetitionActivity;
import com.sofascore.results.fantasy.teammanagement.transfers.FantasyTransfersFragment;
import com.sofascore.results.fantasy.ui.model.FantasyPlayerUiModel;
import com.sofascore.results.fantasy.walkthrough.FantasyWalkthroughActivity;
import com.sofascore.results.stagesport.fragments.raceFlow.RaceFlowModels$RaceEntrant;
import com.sofascore.results.stagesport.fragments.raceFlow.RaceFlowModels$RaceTeam;
import com.unity3d.services.UnityAdsConstants;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;
import kotlin.text.c;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class k50 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public /* synthetic */ Object s;
    public final /* synthetic */ Object t;
    public final /* synthetic */ Object u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k50(r82 r82Var, Object obj, xs5 xs5Var, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = 4;
        this.t = r82Var;
        this.s = obj;
        this.u = xs5Var;
    }

    private final Object e(Object obj) {
        Sport sport;
        Sport sport2;
        Sport sport3;
        Player player = (Player) this.u;
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        x2g x2gVar = (x2g) this.s;
        boolean z = x2gVar instanceof v2g;
        roe roeVar = (roe) this.t;
        if (z) {
            yzc yzcVar = roeVar.k;
            List<Player> players = ((SearchPlayersResponse) ((v2g) x2gVar).a).getPlayers();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = players.iterator();
            while (true) {
                String str = null;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                Team team = ((Player) next).getTeam();
                String slug = (team == null || (sport3 = team.getSport()) == null) ? null : sport3.getSlug();
                Team team2 = player.getTeam();
                if (team2 != null && (sport2 = team2.getSport()) != null) {
                    str = sport2.getSlug();
                }
                if (Intrinsics.c(slug, str)) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Object next2 = it2.next();
                if (!Intrinsics.c(((Player) next2).getName(), player.getName())) {
                    arrayList2.add(next2);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                Object next3 = it3.next();
                Player player2 = (Player) next3;
                Team team3 = player.getTeam();
                boolean z2 = true;
                if (Intrinsics.c((team3 == null || (sport = team3.getSport()) == null) ? null : sport.getSlug(), Sports.FOOTBALL)) {
                    if (Intrinsics.c(player.getPosition(), "G")) {
                        z2 = Intrinsics.c(player2.getPosition(), "G");
                    } else if (Intrinsics.c(player2.getPosition(), "G")) {
                        z2 = false;
                    }
                }
                if (z2) {
                    arrayList3.add(next3);
                }
            }
            yzcVar.k(arrayList3);
        } else {
            roeVar.k.k(km5.a);
        }
        return Unit.a;
    }

    private final Object f(Object obj) {
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        for (lmb lmbVar : ((HashMap) ((plb) this.s).c()).values()) {
            lmbVar.getClass();
            Bitmap bitmap = lmbVar.f;
            String str = lmbVar.d;
            if (bitmap == null && c.v(str, "data:", false) && StringsKt.P(str, "base64,", 0, false, 6) > 0) {
                try {
                    byte[] decode = Base64.decode(str.substring(StringsKt.O(str, ',', 0, 6) + 1), 0);
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inScaled = true;
                    options.inDensity = 160;
                    lmbVar.f = BitmapFactory.decodeByteArray(decode, 0, decode.length, options);
                } catch (IllegalArgumentException unused) {
                    ajb.c("data URL did not have correct base64 format.");
                }
            }
            Context context = (Context) this.t;
            String str2 = (String) this.u;
            if (lmbVar.f == null && str2 != null) {
                try {
                    InputStream open = context.getAssets().open(str2 + str);
                    open.getClass();
                    Bitmap bitmap2 = null;
                    try {
                        BitmapFactory.Options options2 = new BitmapFactory.Options();
                        options2.inScaled = true;
                        options2.inDensity = 160;
                        bitmap2 = BitmapFactory.decodeStream(open, null, options2);
                    } catch (IllegalArgumentException unused2) {
                        ajb.c("Unable to decode image.");
                    }
                    if (bitmap2 != null) {
                        lmbVar.f = vik.d(bitmap2, lmbVar.a, lmbVar.b);
                    }
                } catch (IOException unused3) {
                    ajb.c("Unable to open asset.");
                }
            }
        }
        return Unit.a;
    }

    private final Object g(Object obj) {
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        View view;
        FrameLayout frameLayout3;
        boolean z;
        kbg kbgVar;
        wfg wfgVar;
        RelativeLayout relativeLayout;
        Function1 function1;
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        SASParallaxBannerAdapter sASParallaxBannerAdapter = (SASParallaxBannerAdapter) this.s;
        Context context = (Context) this.t;
        sASParallaxBannerAdapter.g = new f32(sASParallaxBannerAdapter, context);
        frameLayout = sASParallaxBannerAdapter.g;
        if (frameLayout == null) {
            Intrinsics.i("renderedViewParallaxContainer");
            throw null;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        int i = 1;
        layoutParams.gravity = 1;
        frameLayout.setLayoutParams(layoutParams);
        frameLayout2 = sASParallaxBannerAdapter.g;
        if (frameLayout2 == null) {
            Intrinsics.i("renderedViewParallaxContainer");
            throw null;
        }
        view = sASParallaxBannerAdapter.e;
        if (view == null) {
            Intrinsics.i("rendererView");
            throw null;
        }
        frameLayout2.addView(view, new FrameLayout.LayoutParams(-1, -1));
        RelativeLayout relativeLayout2 = new RelativeLayout(context);
        nig nigVar = (nig) this.u;
        frameLayout3 = sASParallaxBannerAdapter.g;
        if (frameLayout3 == null) {
            Intrinsics.i("renderedViewParallaxContainer");
            throw null;
        }
        relativeLayout2.addView(frameLayout3);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(10);
        layoutParams2.addRule(11);
        z = sASParallaxBannerAdapter.b;
        if (z) {
            relativeLayout2.addView(((pig) nigVar).m, layoutParams2);
            ((pig) nigVar).c(gig.SMALL);
        }
        kbgVar = sASParallaxBannerAdapter.j;
        if (kbgVar != null && kbgVar.c()) {
            function1 = sASParallaxBannerAdapter.c;
            yeg yegVar = (yeg) function1.invoke(context);
            sASParallaxBannerAdapter.i = yegVar;
            xeg xegVar = (xeg) yegVar;
            xegVar.setMuteControllerListener(new qfg(sASParallaxBannerAdapter, i));
            xegVar.setMuteButtonSize(gig.SMALL);
            relativeLayout2.addView(xegVar.getView());
        }
        wfgVar = sASParallaxBannerAdapter.d;
        if (wfgVar == null) {
            Intrinsics.i("parallaxAd");
            throw null;
        }
        relativeLayout2.setBackgroundColor(wfgVar.b);
        sASParallaxBannerAdapter.f = relativeLayout2;
        relativeLayout = sASParallaxBannerAdapter.f;
        if (relativeLayout != null) {
            relativeLayout.getViewTreeObserver().addOnPreDrawListener(SASParallaxBannerAdapter.access$getOnPreDrawListener(sASParallaxBannerAdapter));
            return Unit.a;
        }
        Intrinsics.i("parallaxBannerView");
        throw null;
    }

    private final Object h(Object obj) {
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        eig eigVar = (eig) this.s;
        String str = (String) this.t;
        eigVar.e = str;
        y3g y3gVar = eigVar.b;
        String str2 = (String) this.u;
        y3gVar.getClass();
        str2.getClass();
        ((WebView) y3gVar.b).loadDataWithBaseURL(str, str2, "text/html", C.UTF8_NAME, null);
        return Unit.a;
    }

    private final Object j(Object obj) {
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        Context context = (Context) this.s;
        pyg pygVar = (pyg) this.t;
        e73 e73Var = pygVar.l;
        String str = pygVar.m;
        final LinkedHashMap linkedHashMap = (LinkedHashMap) this.u;
        e73Var.getClass();
        str.getClass();
        gvh gvhVar = (e73Var == e73.a || wyh.e(str)) ? gvh.d : gvh.e;
        int ordinal = e73Var.ordinal();
        final int i = 0;
        final int i2 = 1;
        if (ordinal == 0) {
            if (str.equals(Sports.FOOTBALL)) {
                return td4.S(context, linkedHashMap, new or1(linkedHashMap, gvhVar, str, i2));
            }
            if (!str.equals(Sports.BASKETBALL)) {
                return rlh.b;
            }
            mqi mqiVar = rr1.a;
            return td4.S(context, linkedHashMap, new or1(linkedHashMap, gvhVar, str, i));
        }
        if (ordinal != 1) {
            zzl.b();
            return null;
        }
        int hashCode = str.hashCode();
        if (hashCode != -877324069) {
            if (hashCode != 394668909) {
                if (hashCode == 727149765 && str.equals(Sports.BASKETBALL)) {
                    return td4.S(context, linkedHashMap, new Function1() { // from class: ks1
                        /* JADX WARN: Removed duplicated region for block: B:21:0x01ed A[ADDED_TO_REGION] */
                        /* JADX WARN: Removed duplicated region for block: B:26:0x01ca  */
                        /* JADX WARN: Removed duplicated region for block: B:50:0x0556 A[ADDED_TO_REGION] */
                        /* JADX WARN: Removed duplicated region for block: B:54:0x0533  */
                        @Override // kotlin.jvm.functions.Function1
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object invoke(Object obj2) {
                            boolean z;
                            boolean z2;
                            int i3 = i;
                            c83 c83Var = c83.a;
                            LinkedHashMap linkedHashMap2 = linkedHashMap;
                            int i4 = 28;
                            int i5 = 27;
                            byte b = 0;
                            switch (i3) {
                                case 0:
                                    o73 o73Var = (o73) obj2;
                                    o73Var.getClass();
                                    o73Var.b(new q9k(R.string.summary));
                                    o73Var.a(new q9k(R.string.basketball_points_pg), new js1((byte) 0, 7), new qr1(10), null);
                                    o73Var.a(new q9k(R.string.basketball_points_allowed_pg), new js1((byte) 0, 3), new qr1(21), null);
                                    o73Var.a(new q9k(R.string.basketball_assists_pg), new js1((byte) 0, 16), new ls1(2), null);
                                    o73Var.a(new q9k(R.string.basketball_assist_to_turnover_ratio), new js1((byte) 0, 21), new ls1(3), null);
                                    o73Var.b(new q9k(R.string.amf_offense));
                                    o73Var.a(new q9k(R.string.basketball_fg_made_pg), new js1((byte) 0, 22), new ls1(4), null);
                                    o73Var.a(new q9k(R.string.basketball_fg_attempted_pg), new js1((byte) 0, 12), new qr1(28), null);
                                    o73Var.a(new q9k(R.string.field_goals_percentage_made), new js1((byte) 0, 23), new ls1(5), null);
                                    o73Var.a(new q9k(R.string.basketball_three_pts_made_pg), new js1((byte) 0, 24), new ls1(6), null);
                                    o73Var.a(new q9k(R.string.basketball_three_pts_attempted_pg), new js1((byte) 0, 25), new qr1(8), null);
                                    o73Var.a(new q9k(R.string.three_points_percentage_made), new hd3(b, i5), new qr1(9), null);
                                    o73Var.a(new q9k(R.string.basketball_free_throws_made_pg), new hd3(b, i4), new qr1(11), null);
                                    o73Var.a(new q9k(R.string.basketball_free_throws_attempted_pg), new hd3(b, 29), new qr1(12), null);
                                    o73Var.a(new q9k(R.string.free_throws_percentage_made), new js1((byte) 0, 0), new qr1(13), null);
                                    o73Var.a(new q9k(R.string.basketball_effective_field_goal_pct), new js1((byte) 0, 1), new qr1(14), new i83(new q9k(R.string.basketball_effective_field_goal_pct), new q9k(R.string.basketball_effective_fg_pct_info)));
                                    o73Var.a(new q9k(R.string.basketball_true_shooting_pct), new js1((byte) 0, 2), new qr1(15), new i83(new q9k(R.string.basketball_true_shooting_pct), new q9k(R.string.basketball_true_shooting_pct_info)));
                                    o73Var.a(new q9k(R.string.basketball_pts_off_the_bench_pg), new js1((byte) 0, 4), new qr1(16), null);
                                    o73Var.a(new q9k(R.string.basketball_second_chance_pts_pg), new js1((byte) 0, 5), new qr1(17), null);
                                    o73Var.a(new q9k(R.string.basketball_pts_in_paint_pg), new js1((byte) 0, 6), new qr1(18), null);
                                    o73Var.b(new q9k(R.string.rebounds));
                                    o73Var.a(new q9k(R.string.basketball_offensive_rebounds_pg), new js1((byte) 0, 8), new qr1(19), null);
                                    o73Var.a(new q9k(R.string.basketball_defensive_rebounds_pg), new js1((byte) 0, 9), new qr1(20), null);
                                    o73Var.a(new q9k(R.string.basketball_total_rebounds_pg), new js1((byte) 0, 10), new qr1(22), null);
                                    o73Var.b(new q9k(R.string.amf_defense));
                                    o73Var.a(new q9k(R.string.basketball_blocks_pg), new js1((byte) 0, 11), new qr1(23), null);
                                    o73Var.a(new q9k(R.string.basketball_steals_pg), new js1((byte) 0, 13), new qr1(24), null);
                                    o73Var.a(new q9k(R.string.three_points_percent_allowed), new js1((byte) 0, 14), new qr1(25), null);
                                    o73Var.a(new q9k(R.string.basketball_opponent_true_shooting_pct), new js1((byte) 0, 15), new qr1(26), null);
                                    o73Var.a(new q9k(R.string.basketball_charges_drawn_pg), new js1((byte) 0, 17), new qr1(27), null);
                                    o73Var.b(new q9k(R.string.other));
                                    o73Var.a(new q9k(R.string.basketball_turnovers_pg), new js1((byte) 0, 18), new qr1(29), null);
                                    o73Var.a(new q9k(R.string.basketball_total_technical_fouls), new js1((byte) 0, 19), new ls1(0), null);
                                    o73Var.a(new q9k(R.string.basketball_total_flagrant_fouls), new js1((byte) 0, 20), new ls1(1), null);
                                    if (!linkedHashMap2.isEmpty()) {
                                        Iterator it = linkedHashMap2.entrySet().iterator();
                                        while (it.hasNext()) {
                                            if (((c73) ((Map.Entry) it.next()).getValue()).a != null) {
                                                z = true;
                                                if (!linkedHashMap2.isEmpty()) {
                                                    Iterator it2 = linkedHashMap2.entrySet().iterator();
                                                    while (it2.hasNext()) {
                                                        if (z8e.F((c73) ((Map.Entry) it2.next()).getValue()) != null) {
                                                            if (z && b != 0) {
                                                                o73Var.c.add(c83Var);
                                                            }
                                                            break;
                                                        }
                                                    }
                                                }
                                                b = 1;
                                                if (z) {
                                                    o73Var.c.add(c83Var);
                                                }
                                            }
                                        }
                                    }
                                    z = false;
                                    if (!linkedHashMap2.isEmpty()) {
                                    }
                                    b = 1;
                                    if (z) {
                                    }
                                default:
                                    o73 o73Var2 = (o73) obj2;
                                    o73Var2.getClass();
                                    o73Var2.a(new q9k(R.string.age), new c8i((byte) 0, 26), null, null);
                                    ArrayList arrayList = o73Var2.c;
                                    o73Var2.a(new q9k(R.string.player_height), new c8i((byte) 0, 20), null, null);
                                    o73Var2.b(new q9k(R.string.performance));
                                    o73Var2.a(new q9k(R.string.tennis_matches_won), new c8i((byte) 0, 22), null, null);
                                    o73Var2.a(new q9k(R.string.tournaments_won), new c8i((byte) 0, 23), null, null);
                                    o73Var2.a(new q9k(R.string.result), new c8i((byte) 0, 24), null, null);
                                    o73Var2.b(new q9k(R.string.tennis_service_stat));
                                    o73Var2.a(new q9k(R.string.tennis_first_serve), new c8i((byte) 0, 25), new i1j(19), null);
                                    o73Var2.a(new q9k(R.string.tennis_first_serve_points_won), new c8i((byte) 0, 27), new i1j(20), null);
                                    o73Var2.a(new q9k(R.string.tennis_second_serve), new c8i((byte) 0, 28), new i1j(21), null);
                                    o73Var2.a(new q9k(R.string.tennis_second_serve_points), new c8i((byte) 0, 29), new i1j(22), null);
                                    o73Var2.a(new q9k(R.string.tennis_average_aces_per_match), new t6j(0), new i1j(23), null);
                                    o73Var2.a(new q9k(R.string.tennis_average_double_faults_per_match), new t6j(1), new i1j(24), null);
                                    o73Var2.b(new q9k(R.string.tennis_pressure_metrics));
                                    o73Var2.a(new q9k(R.string.break_points_saved), new t6j(2), new i1j(16), null);
                                    o73Var2.a(new q9k(R.string.break_points_converted), new c8i((byte) 0, 19), new i1j(17), null);
                                    o73Var2.a(new q9k(R.string.tennis_tiebreaks_won), new c8i((byte) 0, 21), new i1j(18), null);
                                    if (!linkedHashMap2.isEmpty()) {
                                        Iterator it3 = linkedHashMap2.entrySet().iterator();
                                        while (true) {
                                            if (it3.hasNext()) {
                                                if (tba.o((c73) ((Map.Entry) it3.next()).getValue()) != null) {
                                                    arrayList.add(new g83(new q9k(R.string.tennis_disclaimer)));
                                                }
                                            }
                                        }
                                    }
                                    if (!linkedHashMap2.isEmpty()) {
                                        Iterator it4 = linkedHashMap2.entrySet().iterator();
                                        while (it4.hasNext()) {
                                            if (((c73) ((Map.Entry) it4.next()).getValue()).a != null) {
                                                z2 = true;
                                                if (!linkedHashMap2.isEmpty()) {
                                                    Iterator it5 = linkedHashMap2.entrySet().iterator();
                                                    while (it5.hasNext()) {
                                                        if (tba.o((c73) ((Map.Entry) it5.next()).getValue()) != null) {
                                                            if (z2 && b != 0) {
                                                                arrayList.add(c83Var);
                                                            }
                                                            break;
                                                        }
                                                    }
                                                }
                                                b = 1;
                                                if (z2) {
                                                    arrayList.add(c83Var);
                                                }
                                            }
                                        }
                                    }
                                    z2 = false;
                                    if (!linkedHashMap2.isEmpty()) {
                                    }
                                    b = 1;
                                    if (z2) {
                                    }
                            }
                            return Unit.a;
                        }
                    });
                }
            } else if (str.equals(Sports.FOOTBALL)) {
                return td4.S(context, linkedHashMap, new or1(gvhVar, str, linkedHashMap));
            }
        } else if (str.equals(Sports.TENNIS)) {
            return td4.S(context, linkedHashMap, new Function1() { // from class: ks1
                /* JADX WARN: Removed duplicated region for block: B:21:0x01ed A[ADDED_TO_REGION] */
                /* JADX WARN: Removed duplicated region for block: B:26:0x01ca  */
                /* JADX WARN: Removed duplicated region for block: B:50:0x0556 A[ADDED_TO_REGION] */
                /* JADX WARN: Removed duplicated region for block: B:54:0x0533  */
                @Override // kotlin.jvm.functions.Function1
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invoke(Object obj2) {
                    boolean z;
                    boolean z2;
                    int i3 = i2;
                    c83 c83Var = c83.a;
                    LinkedHashMap linkedHashMap2 = linkedHashMap;
                    int i4 = 28;
                    int i5 = 27;
                    byte b = 0;
                    switch (i3) {
                        case 0:
                            o73 o73Var = (o73) obj2;
                            o73Var.getClass();
                            o73Var.b(new q9k(R.string.summary));
                            o73Var.a(new q9k(R.string.basketball_points_pg), new js1((byte) 0, 7), new qr1(10), null);
                            o73Var.a(new q9k(R.string.basketball_points_allowed_pg), new js1((byte) 0, 3), new qr1(21), null);
                            o73Var.a(new q9k(R.string.basketball_assists_pg), new js1((byte) 0, 16), new ls1(2), null);
                            o73Var.a(new q9k(R.string.basketball_assist_to_turnover_ratio), new js1((byte) 0, 21), new ls1(3), null);
                            o73Var.b(new q9k(R.string.amf_offense));
                            o73Var.a(new q9k(R.string.basketball_fg_made_pg), new js1((byte) 0, 22), new ls1(4), null);
                            o73Var.a(new q9k(R.string.basketball_fg_attempted_pg), new js1((byte) 0, 12), new qr1(28), null);
                            o73Var.a(new q9k(R.string.field_goals_percentage_made), new js1((byte) 0, 23), new ls1(5), null);
                            o73Var.a(new q9k(R.string.basketball_three_pts_made_pg), new js1((byte) 0, 24), new ls1(6), null);
                            o73Var.a(new q9k(R.string.basketball_three_pts_attempted_pg), new js1((byte) 0, 25), new qr1(8), null);
                            o73Var.a(new q9k(R.string.three_points_percentage_made), new hd3(b, i5), new qr1(9), null);
                            o73Var.a(new q9k(R.string.basketball_free_throws_made_pg), new hd3(b, i4), new qr1(11), null);
                            o73Var.a(new q9k(R.string.basketball_free_throws_attempted_pg), new hd3(b, 29), new qr1(12), null);
                            o73Var.a(new q9k(R.string.free_throws_percentage_made), new js1((byte) 0, 0), new qr1(13), null);
                            o73Var.a(new q9k(R.string.basketball_effective_field_goal_pct), new js1((byte) 0, 1), new qr1(14), new i83(new q9k(R.string.basketball_effective_field_goal_pct), new q9k(R.string.basketball_effective_fg_pct_info)));
                            o73Var.a(new q9k(R.string.basketball_true_shooting_pct), new js1((byte) 0, 2), new qr1(15), new i83(new q9k(R.string.basketball_true_shooting_pct), new q9k(R.string.basketball_true_shooting_pct_info)));
                            o73Var.a(new q9k(R.string.basketball_pts_off_the_bench_pg), new js1((byte) 0, 4), new qr1(16), null);
                            o73Var.a(new q9k(R.string.basketball_second_chance_pts_pg), new js1((byte) 0, 5), new qr1(17), null);
                            o73Var.a(new q9k(R.string.basketball_pts_in_paint_pg), new js1((byte) 0, 6), new qr1(18), null);
                            o73Var.b(new q9k(R.string.rebounds));
                            o73Var.a(new q9k(R.string.basketball_offensive_rebounds_pg), new js1((byte) 0, 8), new qr1(19), null);
                            o73Var.a(new q9k(R.string.basketball_defensive_rebounds_pg), new js1((byte) 0, 9), new qr1(20), null);
                            o73Var.a(new q9k(R.string.basketball_total_rebounds_pg), new js1((byte) 0, 10), new qr1(22), null);
                            o73Var.b(new q9k(R.string.amf_defense));
                            o73Var.a(new q9k(R.string.basketball_blocks_pg), new js1((byte) 0, 11), new qr1(23), null);
                            o73Var.a(new q9k(R.string.basketball_steals_pg), new js1((byte) 0, 13), new qr1(24), null);
                            o73Var.a(new q9k(R.string.three_points_percent_allowed), new js1((byte) 0, 14), new qr1(25), null);
                            o73Var.a(new q9k(R.string.basketball_opponent_true_shooting_pct), new js1((byte) 0, 15), new qr1(26), null);
                            o73Var.a(new q9k(R.string.basketball_charges_drawn_pg), new js1((byte) 0, 17), new qr1(27), null);
                            o73Var.b(new q9k(R.string.other));
                            o73Var.a(new q9k(R.string.basketball_turnovers_pg), new js1((byte) 0, 18), new qr1(29), null);
                            o73Var.a(new q9k(R.string.basketball_total_technical_fouls), new js1((byte) 0, 19), new ls1(0), null);
                            o73Var.a(new q9k(R.string.basketball_total_flagrant_fouls), new js1((byte) 0, 20), new ls1(1), null);
                            if (!linkedHashMap2.isEmpty()) {
                                Iterator it = linkedHashMap2.entrySet().iterator();
                                while (it.hasNext()) {
                                    if (((c73) ((Map.Entry) it.next()).getValue()).a != null) {
                                        z = true;
                                        if (!linkedHashMap2.isEmpty()) {
                                            Iterator it2 = linkedHashMap2.entrySet().iterator();
                                            while (it2.hasNext()) {
                                                if (z8e.F((c73) ((Map.Entry) it2.next()).getValue()) != null) {
                                                    if (z && b != 0) {
                                                        o73Var.c.add(c83Var);
                                                    }
                                                    break;
                                                }
                                            }
                                        }
                                        b = 1;
                                        if (z) {
                                            o73Var.c.add(c83Var);
                                        }
                                    }
                                }
                            }
                            z = false;
                            if (!linkedHashMap2.isEmpty()) {
                            }
                            b = 1;
                            if (z) {
                            }
                        default:
                            o73 o73Var2 = (o73) obj2;
                            o73Var2.getClass();
                            o73Var2.a(new q9k(R.string.age), new c8i((byte) 0, 26), null, null);
                            ArrayList arrayList = o73Var2.c;
                            o73Var2.a(new q9k(R.string.player_height), new c8i((byte) 0, 20), null, null);
                            o73Var2.b(new q9k(R.string.performance));
                            o73Var2.a(new q9k(R.string.tennis_matches_won), new c8i((byte) 0, 22), null, null);
                            o73Var2.a(new q9k(R.string.tournaments_won), new c8i((byte) 0, 23), null, null);
                            o73Var2.a(new q9k(R.string.result), new c8i((byte) 0, 24), null, null);
                            o73Var2.b(new q9k(R.string.tennis_service_stat));
                            o73Var2.a(new q9k(R.string.tennis_first_serve), new c8i((byte) 0, 25), new i1j(19), null);
                            o73Var2.a(new q9k(R.string.tennis_first_serve_points_won), new c8i((byte) 0, 27), new i1j(20), null);
                            o73Var2.a(new q9k(R.string.tennis_second_serve), new c8i((byte) 0, 28), new i1j(21), null);
                            o73Var2.a(new q9k(R.string.tennis_second_serve_points), new c8i((byte) 0, 29), new i1j(22), null);
                            o73Var2.a(new q9k(R.string.tennis_average_aces_per_match), new t6j(0), new i1j(23), null);
                            o73Var2.a(new q9k(R.string.tennis_average_double_faults_per_match), new t6j(1), new i1j(24), null);
                            o73Var2.b(new q9k(R.string.tennis_pressure_metrics));
                            o73Var2.a(new q9k(R.string.break_points_saved), new t6j(2), new i1j(16), null);
                            o73Var2.a(new q9k(R.string.break_points_converted), new c8i((byte) 0, 19), new i1j(17), null);
                            o73Var2.a(new q9k(R.string.tennis_tiebreaks_won), new c8i((byte) 0, 21), new i1j(18), null);
                            if (!linkedHashMap2.isEmpty()) {
                                Iterator it3 = linkedHashMap2.entrySet().iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        if (tba.o((c73) ((Map.Entry) it3.next()).getValue()) != null) {
                                            arrayList.add(new g83(new q9k(R.string.tennis_disclaimer)));
                                        }
                                    }
                                }
                            }
                            if (!linkedHashMap2.isEmpty()) {
                                Iterator it4 = linkedHashMap2.entrySet().iterator();
                                while (it4.hasNext()) {
                                    if (((c73) ((Map.Entry) it4.next()).getValue()).a != null) {
                                        z2 = true;
                                        if (!linkedHashMap2.isEmpty()) {
                                            Iterator it5 = linkedHashMap2.entrySet().iterator();
                                            while (it5.hasNext()) {
                                                if (tba.o((c73) ((Map.Entry) it5.next()).getValue()) != null) {
                                                    if (z2 && b != 0) {
                                                        arrayList.add(c83Var);
                                                    }
                                                    break;
                                                }
                                            }
                                        }
                                        b = 1;
                                        if (z2) {
                                            arrayList.add(c83Var);
                                        }
                                    }
                                }
                            }
                            z2 = false;
                            if (!linkedHashMap2.isEmpty()) {
                            }
                            b = 1;
                            if (z2) {
                            }
                    }
                    return Unit.a;
                }
            });
        }
        return rlh.b;
    }

    private final Object k(Object obj) {
        OutputStream fileOutputStream;
        String str = (String) this.t;
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        Context context = (Context) this.s;
        String string = context.getString(R.string.app_name);
        string.getClass();
        OutputStream outputStream = null;
        Unit unit = null;
        OutputStream outputStream2 = null;
        try {
            try {
                if (Build.VERSION.SDK_INT >= 29) {
                    ContentResolver contentResolver = context.getContentResolver();
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("_display_name", str);
                    contentValues.put("mime_type", "image/png");
                    contentValues.put("relative_path", Environment.DIRECTORY_PICTURES + File.separator + string);
                    Uri insert = contentResolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
                    insert.getClass();
                    fileOutputStream = contentResolver.openOutputStream(insert);
                } else {
                    fileOutputStream = new FileOutputStream(new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES).toString() + File.separator + string, str + ".png"));
                }
                if (fileOutputStream != null) {
                    try {
                        Bitmap bitmap = (Bitmap) this.u;
                        bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                        bitmap.recycle();
                        unit = Unit.a;
                    } catch (IOException e) {
                        e = e;
                        outputStream2 = fileOutputStream;
                        s38.a().c(e);
                        e.printStackTrace();
                        Unit unit2 = Unit.a;
                        if (outputStream2 != null) {
                            try {
                                outputStream2.flush();
                                outputStream2.close();
                            } catch (IOException unused) {
                            }
                        }
                        return unit2;
                    } catch (Throwable th) {
                        th = th;
                        outputStream = fileOutputStream;
                        if (outputStream != null) {
                            try {
                                outputStream.flush();
                                outputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        throw th;
                    }
                }
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.flush();
                        fileOutputStream.close();
                    } catch (IOException unused3) {
                    }
                }
                return unit;
            } catch (IOException e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private final Object l(Object obj) {
        Object u2gVar;
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        Context context = (Context) this.t;
        Bitmap bitmap = (Bitmap) this.u;
        try {
            p2g p2gVar = w2g.b;
            String str = "Sofascore_" + yaa.w();
            File file = new File(context.getExternalCacheDir(), "images");
            file.mkdir();
            File file2 = new File(file, str.concat(".png"));
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            u2gVar = FileProvider.getUriForFile(context, context.getPackageName(), file2);
        } catch (Throwable th) {
            p2g p2gVar2 = w2g.b;
            u2gVar = new u2g(th);
        }
        if (u2gVar instanceof u2g) {
            return null;
        }
        return u2gVar;
    }

    private final Object m(Object obj) {
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        ((e1d) this.u).setValue(Boolean.FALSE);
        String str = (String) this.s;
        scj scjVar = (scj) this.t;
        if (!Intrinsics.c(str, scjVar.c().c.toString())) {
            w1a.E(scjVar, str);
        }
        return Unit.a;
    }

    private final Object n(Object obj) {
        boh bohVar = (boh) this.t;
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        if (((Boolean) ((e1d) this.s).getValue()).booleanValue()) {
            bohVar.i(yaa.v());
        } else {
            long v = yaa.v();
            boh bohVar2 = (boh) this.u;
            bohVar2.i((v - bohVar.h()) + bohVar2.h());
        }
        return Unit.a;
    }

    private final Object o(Object obj) {
        Object obj2;
        Object obj3;
        Integer position;
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        List<StageDriverPerformance> list = (List) this.s;
        Function1 function1 = (Function1) this.t;
        List list2 = (List) this.u;
        ArrayList arrayList = new ArrayList(k13.r(list, 10));
        for (StageDriverPerformance stageDriverPerformance : list) {
            List list3 = (List) function1.invoke(new Integer(stageDriverPerformance.getStartNumber()));
            Iterator it = list3.iterator();
            while (true) {
                obj2 = null;
                if (!it.hasNext()) {
                    obj3 = null;
                    break;
                }
                obj3 = it.next();
                if (((StageDriverPerformanceRaceEntry) obj3).getEntry() == 0) {
                    break;
                }
            }
            StageDriverPerformanceRaceEntry stageDriverPerformanceRaceEntry = (StageDriverPerformanceRaceEntry) obj3;
            int intValue = (stageDriverPerformanceRaceEntry == null || (position = stageDriverPerformanceRaceEntry.getPosition()) == null) ? Integer.MAX_VALUE : position.intValue();
            boolean z = false;
            if (!list3.isEmpty()) {
                Iterator it2 = list3.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (((StageDriverPerformanceRaceEntry) it2.next()).getOut()) {
                        z = true;
                        break;
                    }
                }
            }
            boolean z2 = z;
            int startNumber = stageDriverPerformance.getStartNumber();
            int startNumber2 = stageDriverPerformance.getStartNumber();
            String nameCode = stageDriverPerformance.getNameCode();
            String name = stageDriverPerformance.getName();
            Iterator it3 = list2.iterator();
            while (true) {
                if (it3.hasNext()) {
                    Object next = it3.next();
                    RaceFlowModels$RaceTeam raceFlowModels$RaceTeam = (RaceFlowModels$RaceTeam) next;
                    Team parentTeam = stageDriverPerformance.getParentTeam();
                    if (parentTeam != null && raceFlowModels$RaceTeam.a == parentTeam.getId()) {
                        obj2 = next;
                        break;
                    }
                }
            }
            arrayList.add(new RaceFlowModels$RaceEntrant(startNumber, startNumber2, nameCode, name, (RaceFlowModels$RaceTeam) obj2, intValue, z2));
        }
        return CollectionsKt.H0(arrayList, new laf(21));
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        Object obj2 = this.u;
        Object obj3 = this.t;
        switch (i) {
            case 0:
                k50 k50Var = new k50((t9e) obj3, (sz8) obj2, rq3Var, 0);
                k50Var.s = obj;
                return k50Var;
            case 1:
                k50 k50Var2 = new k50((u53) obj3, (skk) obj2, rq3Var, 1);
                k50Var2.s = obj;
                return k50Var2;
            case 2:
                return new k50((CategoriesForDateResponse) this.s, (ai4) obj3, (String) obj2, rq3Var, 2);
            case 3:
                return new k50((e1d) this.s, (y15) obj3, (SnapshotStateList) obj2, rq3Var, 3);
            case 4:
                return new k50((r82) obj3, this.s, (xs5) obj2, rq3Var);
            case 5:
                k50 k50Var3 = new k50((FantasyCompetitionActivity) obj3, (ip6) obj2, rq3Var, 5);
                k50Var3.s = obj;
                return k50Var3;
            case 6:
                return new k50((FantasyPlayerUiModel) this.s, (FantasyPlayerUiModel) obj3, (yc7) obj2, rq3Var, 6);
            case 7:
                k50 k50Var4 = new k50((FantasyTransfersFragment) obj3, (View) obj2, rq3Var, 7);
                k50Var4.s = obj;
                return k50Var4;
            case 8:
                k50 k50Var5 = new k50((FantasyWalkthroughActivity) obj3, (ed) obj2, rq3Var, 8);
                k50Var5.s = obj;
                return k50Var5;
            case 9:
                return new k50((u6b) this.s, (ku3) obj3, (ksa) obj2, rq3Var, 9);
            case 10:
                return new k50((Context) this.s, (Uri) obj3, (Bitmap) obj2, rq3Var, 10);
            case 11:
                k50 k50Var6 = new k50((e5f) obj3, (Long) obj2, rq3Var, 11);
                k50Var6.s = obj;
                return k50Var6;
            case 12:
                k50 k50Var7 = new k50((qze) obj3, (b9j) obj2, rq3Var, 12);
                k50Var7.s = obj;
                return k50Var7;
            case 13:
                return new k50((JSONObject) this.s, (s5d) obj3, (List) obj2, rq3Var, 13);
            case 14:
                k50 k50Var8 = new k50((k6l) obj3, (List) obj2, rq3Var, 14);
                k50Var8.s = obj;
                return k50Var8;
            case 15:
                k50 k50Var9 = new k50((Context) obj3, (jgd) obj2, rq3Var, 15);
                k50Var9.s = obj;
                return k50Var9;
            case 16:
                return new k50((x2g) this.s, (roe) obj3, (Player) obj2, rq3Var, 16);
            case 17:
                k50 k50Var10 = new k50((Function2) obj3, (Function2) obj2, rq3Var, 17);
                k50Var10.s = obj;
                return k50Var10;
            case 18:
                return new k50((plb) this.s, (Context) obj3, (String) obj2, rq3Var, 18);
            case 19:
                return new k50((xbg) this.s, (fcg) obj3, (xag) obj2, rq3Var, 19);
            case 20:
                return new k50((SASParallaxBannerAdapter) this.s, (Context) obj3, (nig) obj2, rq3Var, 20);
            case 21:
                return new k50((eig) this.s, (String) obj3, (g62) obj2, rq3Var, 21);
            case 22:
                return new k50((eig) this.s, (String) obj3, (String) obj2, rq3Var, 22);
            case 23:
                return new k50((Context) this.s, (pyg) obj3, (LinkedHashMap) obj2, rq3Var, 23);
            case 24:
                return new k50((Context) this.s, (String) obj3, (Bitmap) obj2, rq3Var, 24);
            case 25:
                k50 k50Var11 = new k50((Context) obj3, (Bitmap) obj2, rq3Var, 25);
                k50Var11.s = obj;
                return k50Var11;
            case 26:
                return new k50((String) this.s, (scj) obj3, (e1d) obj2, rq3Var, 26);
            case 27:
                return new k50((e1d) this.s, (boh) obj3, (boh) obj2, rq3Var, 27);
            case 28:
                return new k50((List) this.s, (Function1) obj3, (List) obj2, rq3Var, 28);
            default:
                k50 k50Var12 = new k50((caj) obj3, (qze) obj2, rq3Var, 29);
                k50Var12.s = obj;
                return k50Var12;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
        }
        return ((k50) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11, types: [y8g] */
    /* JADX WARN: Type inference failed for: r2v12, types: [y8g] */
    /* JADX WARN: Type inference failed for: r2v14, types: [y8g] */
    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        rq3 rq3Var;
        InputStream byteStream;
        Object value;
        Object value2;
        Float f;
        Float f2;
        Integer num;
        Integer num2;
        String str;
        String str2;
        String str3;
        String str4;
        Integer num3;
        Integer num4;
        Integer num5;
        String valueOf;
        Integer num6;
        String valueOf2;
        Integer num7;
        Integer num8;
        Integer num9;
        String valueOf3;
        Integer num10;
        String valueOf4;
        Float f3;
        Float f4;
        String str5;
        String str6;
        String str7;
        String str8;
        Pair pair;
        int i = this.r;
        int i2 = -1;
        int i3 = 2;
        int i4 = 3;
        int i5 = 1;
        int i6 = 0;
        rq3 rq3Var2 = null;
        r8 = null;
        Object u2gVar = null;
        Object obj2 = this.u;
        Object obj3 = this.t;
        switch (i) {
            case 0:
                t9e t9eVar = (t9e) obj3;
                ku3 ku3Var = (ku3) this.s;
                lu3 lu3Var = lu3.a;
                y6a.M(obj);
                try {
                    try {
                        XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
                        newInstance.setNamespaceAware(false);
                        XmlPullParser newPullParser = newInstance.newPullParser();
                        newPullParser.setInput(t9eVar.a, null);
                        for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.next()) {
                            if (eventType == 2) {
                                if (yfa.k(newPullParser, d9g.b)) {
                                    rq3Var = wba.t(ku3Var, newPullParser);
                                } else if (yfa.i(newPullParser, tl0.b)) {
                                    rq3Var = l6g.D(ku3Var, newPullParser, t9eVar);
                                } else if (yfa.j(newPullParser, vnf.b)) {
                                    rq3Var = uaa.m(ku3Var, newPullParser);
                                }
                                rq3Var2 = rq3Var;
                            }
                        }
                        if (rq3Var2 == null) {
                            throw new IllegalArgumentException("The provided XML is not supported. Only RSS and Atom feeds are supported");
                        }
                        InputStream inputStream = t9eVar.a;
                        inputStream.getClass();
                        try {
                            inputStream.close();
                        } catch (RuntimeException e) {
                            throw e;
                        } catch (Exception unused) {
                        }
                        return rq3Var2;
                    } catch (Throwable th) {
                        InputStream inputStream2 = t9eVar.a;
                        inputStream2.getClass();
                        try {
                            inputStream2.close();
                        } catch (RuntimeException e2) {
                            throw e2;
                        } catch (Exception unused2) {
                        }
                        throw th;
                    }
                } catch (XmlPullParserException e3) {
                    throw new e9g(e3);
                }
            case 1:
                lu3 lu3Var2 = lu3.a;
                y6a.M(obj);
                u53 u53Var = (u53) obj3;
                skk skkVar = (skk) obj2;
                try {
                    p2g p2gVar = w2g.b;
                    jod jodVar = (jod) ((mqi) u53Var.e).getValue();
                    pzf pzfVar = new pzf();
                    pzfVar.f(skkVar.i);
                    pzfVar.e(C4094gc.a, null);
                    qzf qzfVar = new qzf(pzfVar);
                    jodVar.getClass();
                    d2g execute = FirebasePerfOkHttpClient.execute(new pof(jodVar, qzfVar));
                    try {
                        i2g i2gVar = execute.g;
                        if (i2gVar != null && (byteStream = i2gVar.byteStream()) != null) {
                            u2gVar = BitmapFactory.decodeStream(byteStream);
                        }
                        execute.close();
                    } finally {
                    }
                } catch (Throwable th2) {
                    p2g p2gVar2 = w2g.b;
                    u2gVar = new u2g(th2);
                }
                if (w2g.a(u2gVar) != null) {
                    b6a.p((olk) u53Var.c, 16);
                }
                return new w2g(u2gVar);
            case 2:
                lu3 lu3Var3 = lu3.a;
                y6a.M(obj);
                CategoriesForDateResponse categoriesForDateResponse = (CategoriesForDateResponse) this.s;
                List<CategoryWrapper> categories = categoriesForDateResponse != null ? categoriesForDateResponse.getCategories() : null;
                if (categories == null) {
                    categories = km5.a;
                }
                String str9 = (String) obj2;
                ArrayList arrayList = new ArrayList();
                for (CategoryWrapper categoryWrapper : categories) {
                    DistinctEventSet y = i2a.y(categoryWrapper, str9);
                    lh4 lh4Var = y == null ? null : new lh4(j72.E(categoryWrapper), y, CollectionsKt.W0(y.getEventIds()));
                    if (lh4Var != null) {
                        arrayList.add(lh4Var);
                    }
                }
                int c = sub.c(k13.r(arrayList, 10));
                if (c < 16) {
                    c = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(c);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    lh4 lh4Var2 = (lh4) it.next();
                    linkedHashMap.put(String.valueOf(lh4Var2.a.getId()), new ih4(lh4Var2.b.getLiveEvents(), lh4Var2.c.size()));
                }
                int c2 = sub.c(k13.r(arrayList, 10));
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(c2 >= 16 ? c2 : 16);
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    lh4 lh4Var3 = (lh4) it2.next();
                    linkedHashMap2.put(new Integer(lh4Var3.a.getId()), lh4Var3.c);
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    o13.v(((lh4) it3.next()).b.getUniqueTournamentIds(), arrayList2);
                }
                Set W0 = CollectionsKt.W0(arrayList2);
                ai4 ai4Var = (ai4) obj3;
                ArrayList arrayList3 = new ArrayList(k13.r(arrayList, 10));
                Iterator it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    arrayList3.add(((lh4) it4.next()).a);
                }
                ArrayList arrayList4 = new ArrayList();
                Iterator it5 = arrayList3.iterator();
                while (it5.hasNext()) {
                    Object next = it5.next();
                    if (((Category) next).getTotalEvents() > 0) {
                        arrayList4.add(next);
                    }
                }
                return new kh4(linkedHashMap, linkedHashMap2, W0, ai4Var.y(arrayList4));
            case 3:
                lu3 lu3Var4 = lu3.a;
                y6a.M(obj);
                y15 y15Var = (y15) obj3;
                SnapshotStateList snapshotStateList = (SnapshotStateList) obj2;
                for (d6d d6dVar : (Set) ((e1d) this.s).getValue()) {
                    if (!((List) y15Var.b().e.a.getValue()).contains(d6dVar) && !snapshotStateList.contains(d6dVar)) {
                        y15Var.b().c(d6dVar);
                    }
                }
                return Unit.a;
            case 4:
                lu3 lu3Var5 = lu3.a;
                y6a.M(obj);
                mm mmVar = (mm) ((r82) obj3).invoke(this.s);
                fdi fdiVar = ((xs5) obj2).e;
                if (mmVar != null) {
                    do {
                        value2 = fdiVar.getValue();
                        ((vnb) value2).getClass();
                    } while (!fdiVar.k(value2, new unb(new ns5(mmVar))));
                } else {
                    do {
                        value = fdiVar.getValue();
                        ((vnb) value).getClass();
                    } while (!fdiVar.k(value, new snb()));
                }
                return Unit.a;
            case 5:
                do7 do7Var = (do7) this.s;
                lu3 lu3Var6 = lu3.a;
                y6a.M(obj);
                FantasyCompetitionActivity fantasyCompetitionActivity = (FantasyCompetitionActivity) obj3;
                su suVar = fantasyCompetitionActivity.x;
                if (fantasyCompetitionActivity.P) {
                    fantasyCompetitionActivity.P = false;
                    ev6 ev6Var = do7Var.c;
                    boolean z = ev6Var.w;
                    suVar.a = new Integer(ev6Var.c);
                    suVar.c = ev6Var.i.m.b;
                    MenuItem menuItem = fantasyCompetitionActivity.Q;
                    if (menuItem != null) {
                        menuItem.setVisible(!z);
                    }
                    fantasyCompetitionActivity.R().c.setVisibility(!z ? 0 : 8);
                    if (!z) {
                        aba.y(fantasyCompetitionActivity.R().b, 0, 3);
                        z8e.a0(fantasyCompetitionActivity.R().b, 1000L, new ap6(fantasyCompetitionActivity, i4));
                    }
                    fantasyCompetitionActivity.R().d.setText(ev6Var.e);
                    fantasyCompetitionActivity.Q().g.setDrawBottomDivider(false);
                    fantasyCompetitionActivity.Q().c.setStateListAnimator(null);
                    fantasyCompetitionActivity.Q().c.setElevation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    fantasyCompetitionActivity.Q().c.setBackground(new py0(ev6Var.f));
                    fantasyCompetitionActivity.O = new jp6(fantasyCompetitionActivity, fantasyCompetitionActivity.Q().i, fantasyCompetitionActivity.Q().g, do7Var);
                    ViewPager2 viewPager2 = fantasyCompetitionActivity.Q().i;
                    jp6 jp6Var = fantasyCompetitionActivity.O;
                    if (jp6Var == null) {
                        Intrinsics.i("viewPagerAdapter");
                        throw null;
                    }
                    viewPager2.setAdapter(jp6Var);
                    fantasyCompetitionActivity.Q().a.post(new p3(22, fantasyCompetitionActivity, (ip6) obj2, do7Var));
                }
                return Unit.a;
            case 6:
                FantasyPlayerUiModel fantasyPlayerUiModel = (FantasyPlayerUiModel) obj3;
                lu3 lu3Var7 = lu3.a;
                y6a.M(obj);
                FantasyPlayerUiModel fantasyPlayerUiModel2 = (FantasyPlayerUiModel) this.s;
                return b.j(new f93((fantasyPlayerUiModel2 == null || (str8 = fantasyPlayerUiModel2.k) == null) ? "-" : str8, (fantasyPlayerUiModel == null || (str7 = fantasyPlayerUiModel.k) == null) ? "-" : str7, yc7.l(fantasyPlayerUiModel2 != null ? fantasyPlayerUiModel2.l : null, fantasyPlayerUiModel != null ? fantasyPlayerUiModel.l : null), "price", R.string.player_price), new f93((fantasyPlayerUiModel2 == null || (str6 = fantasyPlayerUiModel2.n) == null) ? "-" : str6, (fantasyPlayerUiModel == null || (str5 = fantasyPlayerUiModel.n) == null) ? "-" : str5, yc7.l(fantasyPlayerUiModel2 != null ? fantasyPlayerUiModel2.u : null, fantasyPlayerUiModel != null ? fantasyPlayerUiModel.u : null), "form", R.string.form), new f93((fantasyPlayerUiModel2 == null || (f4 = fantasyPlayerUiModel2.m) == null) ? "-" : yid.q(f4.floatValue(), 1), (fantasyPlayerUiModel == null || (f3 = fantasyPlayerUiModel.m) == null) ? "-" : yid.q(f3.floatValue(), 1), yc7.l(fantasyPlayerUiModel2 != null ? fantasyPlayerUiModel2.m : null, fantasyPlayerUiModel != null ? fantasyPlayerUiModel.m : null), "selected_by", R.string.selected_by), new f93((fantasyPlayerUiModel2 == null || (num10 = fantasyPlayerUiModel2.x) == null || (valueOf4 = String.valueOf(num10.intValue())) == null) ? "-" : valueOf4, (fantasyPlayerUiModel == null || (num9 = fantasyPlayerUiModel.x) == null || (valueOf3 = String.valueOf(num9.intValue())) == null) ? "-" : valueOf3, yc7.l((fantasyPlayerUiModel2 == null || (num8 = fantasyPlayerUiModel2.x) == null) ? null : new Float(num8.intValue()), (fantasyPlayerUiModel == null || (num7 = fantasyPlayerUiModel.x) == null) ? null : new Float(num7.intValue())), "goals", R.string.goals), new f93((fantasyPlayerUiModel2 == null || (num6 = fantasyPlayerUiModel2.y) == null || (valueOf2 = String.valueOf(num6.intValue())) == null) ? "-" : valueOf2, (fantasyPlayerUiModel == null || (num5 = fantasyPlayerUiModel.y) == null || (valueOf = String.valueOf(num5.intValue())) == null) ? "-" : valueOf, yc7.l((fantasyPlayerUiModel2 == null || (num4 = fantasyPlayerUiModel2.y) == null) ? null : new Float(num4.intValue()), (fantasyPlayerUiModel == null || (num3 = fantasyPlayerUiModel.y) == null) ? null : new Float(num3.intValue())), "assists", R.string.football_assists), new f93((fantasyPlayerUiModel2 == null || (str4 = fantasyPlayerUiModel2.j) == null) ? "-" : str4, (fantasyPlayerUiModel == null || (str3 = fantasyPlayerUiModel.j) == null) ? "-" : str3, yc7.l(fantasyPlayerUiModel2 != null ? fantasyPlayerUiModel2.w : null, fantasyPlayerUiModel != null ? fantasyPlayerUiModel.w : null), "avg_points", R.string.average_points_short), new f93((fantasyPlayerUiModel2 == null || (str2 = fantasyPlayerUiModel2.o) == null) ? "-" : str2, (fantasyPlayerUiModel == null || (str = fantasyPlayerUiModel.o) == null) ? "-" : str, yc7.l((fantasyPlayerUiModel2 == null || (num2 = fantasyPlayerUiModel2.v) == null) ? null : new Float(num2.intValue()), (fantasyPlayerUiModel == null || (num = fantasyPlayerUiModel.v) == null) ? null : new Float(num.intValue())), "total_points", R.string.total_points), new f93((fantasyPlayerUiModel2 == null || (f2 = fantasyPlayerUiModel2.z) == null) ? null : dti.n(f2.floatValue(), 2), (fantasyPlayerUiModel == null || (f = fantasyPlayerUiModel.z) == null) ? null : dti.n(f.floatValue(), 2), yc7.l(fantasyPlayerUiModel2 != null ? fantasyPlayerUiModel2.z : null, fantasyPlayerUiModel != null ? fantasyPlayerUiModel.z : null), CampaignEx.JSON_KEY_STAR, R.string.avg_sofascore_rating));
            case 7:
                vn7 vn7Var = (vn7) this.s;
                lu3 lu3Var8 = lu3.a;
                y6a.M(obj);
                FantasyTransfersFragment fantasyTransfersFragment = (FantasyTransfersFragment) obj3;
                fantasyTransfersFragment.t((View) obj2, new w47(14, fantasyTransfersFragment, vn7Var));
                return Unit.a;
            case 8:
                bnh bnhVar = (bnh) this.s;
                lu3 lu3Var9 = lu3.a;
                y6a.M(obj);
                int i7 = ze3.C;
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) ((ed) obj2).c;
                coordinatorLayout.getClass();
                ze3 I = fkf.I((FantasyWalkthroughActivity) obj3, coordinatorLayout, bnhVar);
                if (I != null) {
                    I.i();
                }
                return Unit.a;
            case 9:
                lu3 lu3Var10 = lu3.a;
                y6a.M(obj);
                u6b u6bVar = (u6b) this.s;
                e6b e6bVar = e6b.a;
                ku3 ku3Var2 = (ku3) obj3;
                ksa ksaVar = (ksa) obj2;
                LinkedHashMap linkedHashMap3 = qv5.b;
                KClass orCreateKotlinClass = duf.a.getOrCreateKotlinClass(e52.class);
                Object obj4 = linkedHashMap3.get(orCreateKotlinClass);
                Object obj5 = obj4;
                if (obj4 == null) {
                    aeh b = beh.b(0, 0, null, 7);
                    linkedHashMap3.put(orCreateKotlinClass, b);
                    obj5 = b;
                }
                xw3.L(hda.E(u6bVar), null, null, new u1(u6bVar, (b1d) obj5, (rq3) null, ku3Var2, ksaVar), 3);
                return Unit.a;
            case 10:
                Bitmap bitmap = (Bitmap) obj2;
                lu3 lu3Var11 = lu3.a;
                y6a.M(obj);
                try {
                    Cursor query = ((Context) this.s).getContentResolver().query((Uri) obj3, new String[]{U3.i.n}, null, null, null);
                    if (query != null) {
                        try {
                            int i8 = query.moveToFirst() ? query.getInt(0) : -1;
                            query.close();
                            i2 = i8;
                        } finally {
                        }
                    }
                } catch (Exception unused3) {
                }
                if (i2 == 0) {
                    return bitmap;
                }
                Matrix matrix = new Matrix();
                matrix.postRotate(i2);
                Bitmap bitmap2 = (Bitmap) obj2;
                Bitmap createBitmap = Bitmap.createBitmap(bitmap2, 0, 0, bitmap2.getWidth(), bitmap.getHeight(), matrix, true);
                if (!Intrinsics.c(createBitmap, bitmap)) {
                    bitmap.recycle();
                }
                return createBitmap;
            case 11:
                lu3 lu3Var12 = lu3.a;
                y6a.M(obj);
                p0d p0dVar = (p0d) this.s;
                p0dVar.getClass();
                p0dVar.f((e5f) obj3, (Long) obj2);
                return Unit.a;
            case 12:
                lu3 lu3Var13 = lu3.a;
                y6a.M(obj);
                ku3 ku3Var3 = (ku3) this.s;
                nu3 nu3Var = nu3.d;
                qze qzeVar = (qze) obj3;
                b9j b9jVar = (b9j) obj2;
                xw3.L(ku3Var3, null, nu3Var, new nt3(qzeVar, b9jVar, rq3Var2, i5), 1);
                return xw3.L(ku3Var3, null, nu3Var, new nt3(qzeVar, b9jVar, rq3Var2, i3), 1);
            case 13:
                lu3 lu3Var14 = lu3.a;
                y6a.M(obj);
                we2 we2Var = uoh.a;
                JSONObject jSONObject = (JSONObject) this.s;
                uoh.a(jSONObject);
                Context context = ((s5d) obj3).a;
                List list = (List) obj2;
                list.getClass();
                Iterator<String> keys = jSONObject.keys();
                keys.getClass();
                Iterator it6 = e5h.b(keys).iterator();
                while (it6.hasNext()) {
                    String str10 = (String) it6.next();
                    str10.getClass();
                    if (j72.D(str10)) {
                        try {
                            int optInt = jSONObject.optInt("id");
                            for (Object obj6 : list) {
                                int i9 = i6 + 1;
                                if (i6 < 0) {
                                    b.q();
                                    throw null;
                                }
                                if ((obj6 instanceof Event) && ((Event) obj6).getId() == optInt) {
                                    Event copyEvent = ((Event) obj6).copyEvent();
                                    if (!ufa.D(jSONObject, copyEvent)) {
                                        copyEvent = null;
                                    }
                                    if (copyEvent == null) {
                                        return null;
                                    }
                                    pair = new Pair(Integer.valueOf(copyEvent.getId()), copyEvent);
                                } else if ((obj6 instanceof y21) && ((y21) obj6).d().getId() == optInt) {
                                    Event d = ((y21) obj6).d();
                                    d.getClass();
                                    Event copyEvent2 = d.copyEvent();
                                    if (!ufa.D(jSONObject, copyEvent2)) {
                                        copyEvent2 = null;
                                    }
                                    if (copyEvent2 == null) {
                                        return null;
                                    }
                                    y21 J = s9a.J(copyEvent2, context, false, false, null, 30);
                                    J.M = ((y21) obj6).M;
                                    J.n = ((y21) obj6).n;
                                    J.o = ((y21) obj6).o;
                                    J.p = ((y21) obj6).p;
                                    J.m = ((y21) obj6).m;
                                    pair = new Pair(Integer.valueOf(J.d().getId()), J);
                                } else {
                                    i6 = i9;
                                }
                                return pair;
                            }
                            return null;
                        } catch (CancellationException e4) {
                            throw e4;
                        } catch (Throwable unused4) {
                            return null;
                        }
                    }
                }
                return null;
            case 14:
                p0d p0dVar2 = (p0d) this.s;
                lu3 lu3Var15 = lu3.a;
                y6a.M(obj);
                p0d g = p0dVar2.g();
                k6l k6lVar = (k6l) obj3;
                List list2 = (List) obj2;
                n6l n6lVar = n6l.a;
                e5f e5fVar = n6l.d;
                List list3 = k6lVar.a;
                list3.getClass();
                bga bgaVar = vga.a;
                bgaVar.getClass();
                g.e(e5fVar, bgaVar.c(new xg0(v6l.Companion.serializer(), 0), list3));
                g.e(n6l.i, new Integer(k6lVar.b));
                e5f e5fVar2 = n6l.j;
                list2.getClass();
                g.e(e5fVar2, CollectionsKt.f0(list2, BlazeDataSourcePersonalizedType.STRING_SEPARATOR, null, null, null, 62));
                g.e(n6l.k, Boolean.valueOf(k6lVar.c));
                g.e(n6l.l, Boolean.valueOf(k6lVar.d));
                return g;
            case 15:
                ku3 ku3Var4 = (ku3) this.s;
                lu3 lu3Var16 = lu3.a;
                y6a.M(obj);
                Context context2 = (Context) obj3;
                NotificationManager notificationManager = (NotificationManager) context2.getSystemService(NotificationManager.class);
                List<NotificationChannel> notificationChannels = notificationManager != null ? notificationManager.getNotificationChannels() : null;
                if (notificationChannels == null) {
                    notificationChannels = km5.a;
                }
                List<NotificationChannel> list4 = notificationChannels;
                List<NotificationChannelGroup> notificationChannelGroups = notificationManager != null ? notificationManager.getNotificationChannelGroups() : null;
                if (notificationChannelGroups == null) {
                    notificationChannelGroups = km5.a;
                }
                xw3.L(ku3Var4, null, null, new va8((jgd) obj2, list4, notificationChannelGroups, (Context) obj3, null, 25), 3);
                return xw3.L(ku3Var4, null, null, new hgd(i6, rq3Var2, context2), 3);
            case 16:
                return e(obj);
            case 17:
                ku3 ku3Var5 = (ku3) this.s;
                lu3 lu3Var17 = lu3.a;
                y6a.M(obj);
                xw3.L(ku3Var5, null, null, new p4f((Function2) obj3, null, 2), 3);
                xw3.L(ku3Var5, null, null, new p4f((Function2) obj2, null, 3), 3);
                return Unit.a;
            case 18:
                return f(obj);
            case 19:
                xag xagVar = (xag) obj2;
                lu3 lu3Var18 = lu3.a;
                y6a.M(obj);
                xbg xbgVar = (xbg) this.s;
                fcg fcgVar = (fcg) obj3;
                int i10 = fcg.p;
                xbgVar.onRuntimeInfoChange(sub.d(new Pair(SASParallaxBannerAdapter.PARALLAX_MARGINS, fcgVar.d)));
                RelativeLayout relativeLayout = fcgVar.l;
                relativeLayout.addView(xbgVar.getBannerView(), new ViewGroup.LayoutParams(-1, -2));
                if (fcgVar.isAttachedToWindow()) {
                    if (!fcgVar.m) {
                        ((zag) xagVar).k(relativeLayout);
                        fcgVar.m = true;
                    }
                    ((zag) xagVar).l();
                }
                zag zagVar = (zag) xagVar;
                zagVar.w.add(new dcg(fcgVar));
                fcgVar.j = xagVar;
                fcgVar.i = xbgVar;
                zagVar.f(fcgVar.getContext().getResources().getConfiguration().orientation);
                return Unit.a;
            case 20:
                return g(obj);
            case 21:
                lu3 lu3Var19 = lu3.a;
                y6a.M(obj);
                y3g y3gVar = ((eig) this.s).b;
                final g62 g62Var = (g62) obj2;
                ValueCallback<String> valueCallback = new ValueCallback() { // from class: aig
                    @Override // android.webkit.ValueCallback
                    public final void onReceiveValue(Object obj7) {
                        xw3.L(s9a.c(z45.a), null, null, new big(g62.this, (String) obj7, null, 0), 3);
                    }
                };
                y3gVar.getClass();
                ((WebView) y3gVar.b).evaluateJavascript((String) obj3, valueCallback);
                return Unit.a;
            case 22:
                return h(obj);
            case 23:
                return j(obj);
            case 24:
                return k(obj);
            case 25:
                return l(obj);
            case 26:
                return m(obj);
            case 27:
                return n(obj);
            case 28:
                return o(obj);
            default:
                lu3 lu3Var20 = lu3.a;
                y6a.M(obj);
                ku3 ku3Var6 = (ku3) this.s;
                caj cajVar = (caj) obj3;
                lcj lcjVar = cajVar.s;
                qze qzeVar2 = (qze) obj2;
                deh dehVar = new deh(28, lcjVar, cajVar);
                nu3 nu3Var2 = nu3.d;
                rq3 rq3Var3 = null;
                xw3.L(ku3Var6, null, nu3Var2, new baj(lcjVar, qzeVar2, rq3Var3, i6), 1);
                xw3.L(ku3Var6, null, nu3Var2, new cce(cajVar, lcjVar, qzeVar2, dehVar, null, 28), 1);
                xw3.L(ku3Var6, null, nu3Var2, new h4i(lcjVar, qzeVar2, dehVar, rq3Var3, 17), 1);
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k50(Object obj, Object obj2, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = obj;
        this.u = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k50(Object obj, Object obj2, Object obj3, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.s = obj;
        this.t = obj2;
        this.u = obj3;
    }
}
