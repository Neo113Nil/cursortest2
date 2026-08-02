package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.media.MediaFormat;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.internal.ads.zzagn;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Gender;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.model.newNetwork.ErrorResponse;
import com.sofascore.model.newNetwork.NetworkResponse;
import com.sofascore.model.profile.InvitedUser;
import com.sofascore.results.R;
import com.sofascore.results.league.service.LeagueWorker;
import com.unity3d.services.UnityAdsConstants;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import kotlin.text.c;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class yaa implements zzagn {
    public static final /* synthetic */ int a = 0;
    public static final /* synthetic */ int b = 0;
    public static final /* synthetic */ int c = 0;
    public static final /* synthetic */ int d = 0;
    public static final /* synthetic */ int e = 0;
    public static String f = "BlazeSDK-DefaultUserAgent";
    public static final /* synthetic */ int g = 0;

    /* JADX WARN: Code restructure failed: missing block: B:126:0x030b, code lost:
    
        if (r4.equals("Blocked shots") == false) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0061, code lost:
    
        if (r4.equals("Blocked") == false) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x030e, code lost:
    
        r4 = r3.getString(com.sofascore.results.R.string.hockey_blocked_shots);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00dd, code lost:
    
        if (r4.equals("Faceoffs won") == false) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0111, code lost:
    
        r4 = r3.getString(com.sofascore.results.R.string.hockey_faceoffs_won);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x010d, code lost:
    
        if (r4.equals("Faceoffs won %") == false) goto L183;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String A(Context context, String str) {
        switch (str.hashCode()) {
            case -2108793354:
                if (str.equals("Backhand")) {
                    str = context.getString(R.string.hockey_shot_backhand);
                    break;
                }
                break;
            case -1845097990:
                if (str.equals("Powerplays")) {
                    str = context.getString(R.string.powerplays);
                    break;
                }
                break;
            case -1675117759:
                if (str.equals("Corsi %")) {
                    str = context.getString(R.string.hockey_corsi_percentage);
                    break;
                }
                break;
            case -1614116507:
                break;
            case -1498500520:
                if (str.equals("Even strength shot %")) {
                    str = context.getString(R.string.hockey_even_strength_shot_percentage);
                    break;
                }
                break;
            case -1490204954:
                if (str.equals("Defensive deflection")) {
                    str = context.getString(R.string.hockey_shot_defensive_deflection);
                    break;
                }
                break;
            case -1474525740:
                if (str.equals("Power play %")) {
                    str = context.getString(R.string.hockey_power_play_percentage);
                    break;
                }
                break;
            case -1210766649:
                if (str.equals("Penalties")) {
                    str = context.getString(R.string.penalties);
                    break;
                }
                break;
            case -1208476470:
                if (str.equals("Shorthanded goals")) {
                    str = context.getString(R.string.hockey_shorthanded_goals);
                    break;
                }
                break;
            case -986892936:
                if (str.equals("Average shot distance")) {
                    str = context.getString(R.string.hockey_average_shot_distance);
                    break;
                }
                break;
            case -832736588:
                if (str.equals("Giveaways")) {
                    str = context.getString(R.string.hockey_giveaways);
                    break;
                }
                break;
            case -790027522:
                if (str.equals("Takeaways")) {
                    str = context.getString(R.string.hockey_takeaways);
                    break;
                }
                break;
            case -404228006:
                if (str.equals("Even strength faceoffs")) {
                    str = context.getString(R.string.hockey_even_strength_faceoffs);
                    break;
                }
                break;
            case -222709712:
                if (str.equals("Power play shot %")) {
                    str = context.getString(R.string.hockey_power_play_shot_percentage);
                    break;
                }
                break;
            case -109659091:
                if (str.equals("Shots on goal")) {
                    str = context.getString(R.string.hockey_shots_on_goal);
                    break;
                }
                break;
            case 66549:
                if (str.equals("Bat")) {
                    str = context.getString(R.string.hockey_shot_bat);
                    break;
                }
                break;
            case 84091:
                if (str.equals("Tip")) {
                    str = context.getString(R.string.hockey_shot_tip);
                    break;
                }
                break;
            case 2249568:
                if (str.equals("Hits")) {
                    str = context.getString(R.string.hockey_hits);
                    break;
                }
                break;
            case 2493369:
                if (str.equals("Poke")) {
                    str = context.getString(R.string.hockey_shot_poke);
                    break;
                }
                break;
            case 2579560:
                if (str.equals("Slap")) {
                    str = context.getString(R.string.hockey_shot_slap);
                    break;
                }
                break;
            case 2581482:
                if (str.equals("Snap")) {
                    str = context.getString(R.string.hockey_shot_snap);
                    break;
                }
                break;
            case 40055701:
                if (str.equals("Goals + Assists")) {
                    str = wv8.i(context.getString(R.string.goals), " + ", context.getString(R.string.ice_hockey_assists));
                    break;
                }
                break;
            case 62001406:
                if (str.equals("Goals in powerplay")) {
                    str = context.getString(R.string.goals_in_powerplay);
                    break;
                }
                break;
            case 68973472:
                if (str.equals("Goals")) {
                    str = context.getString(R.string.goals);
                    break;
                }
                break;
            case 79658614:
                if (str.equals("Saves")) {
                    str = context.getString(R.string.ice_hockey_saves);
                    break;
                }
                break;
            case 83847087:
                if (str.equals("Wrist")) {
                    str = context.getString(R.string.hockey_shot_wrist);
                    break;
                }
                break;
            case 146185290:
                if (str.equals("Empty net goals")) {
                    str = context.getString(R.string.hockey_empty_net_goals);
                    break;
                }
                break;
            case 310472814:
                if (str.equals("Fenwick %")) {
                    str = context.getString(R.string.hockey_fenwick_percentage);
                    break;
                }
                break;
            case 959996682:
                if (str.equals("Assists")) {
                    str = context.getString(R.string.ice_hockey_assists);
                    break;
                }
                break;
            case 968513468:
                if (str.equals("Suspension minutes")) {
                    str = context.getString(R.string.suspension_minutes);
                    break;
                }
                break;
            case 1037365020:
                break;
            case 1187643986:
                if (str.equals("Penalties Accuracy")) {
                    str = context.getString(R.string.penalties_accuracy);
                    break;
                }
                break;
            case 1269235267:
                if (str.equals("Wrap around")) {
                    str = context.getString(R.string.hockey_shot_wrap_around);
                    break;
                }
                break;
            case 1332921559:
                break;
            case 1376996484:
                if (str.equals("5v3 conversion")) {
                    str = context.getString(R.string.hockey_5v3_conversion);
                    break;
                }
                break;
            case 1474310060:
                if (str.equals("Between the legs")) {
                    str = context.getString(R.string.hockey_shot_between_the_legs);
                    break;
                }
                break;
            case 1506079203:
                if (str.equals("5v4 conversion")) {
                    str = context.getString(R.string.hockey_5v4_conversion);
                    break;
                }
                break;
            case 1508496923:
                if (str.equals("Max goals in row")) {
                    str = context.getString(R.string.max_goals_in_row);
                    break;
                }
                break;
            case 1529442485:
                if (str.equals("Shorthanded shot %")) {
                    str = context.getString(R.string.hockey_shorthanded_shot_percentage);
                    break;
                }
                break;
            case 1565059122:
                if (str.equals("Power play faceoffs")) {
                    str = context.getString(R.string.hockey_power_play_faceoffs);
                    break;
                }
                break;
            case 1643215308:
                break;
            case 1756140407:
                if (str.equals("Shorthanded faceoffs")) {
                    str = context.getString(R.string.hockey_shorthanded_faceoffs);
                    break;
                }
                break;
            case 1768427560:
                if (str.equals("Penalty minutes")) {
                    str = context.getString(R.string.hockey_penalty_minutes);
                    break;
                }
                break;
            case 1882555109:
                if (str.equals("4v3 conversion")) {
                    str = context.getString(R.string.hockey_4v3_conversion);
                    break;
                }
                break;
            case 2026423787:
                if (str.equals("Cradle")) {
                    str = context.getString(R.string.hockey_shot_cradle);
                    break;
                }
                break;
        }
        str.getClass();
        return str;
    }

    public static final h8g B(g1c g1cVar) {
        Object h = g1cVar.h();
        if (h instanceof h8g) {
            return (h8g) h;
        }
        return null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    public static String C(Context context, String str) {
        switch (str.hashCode()) {
            case -2142803292:
                if (str.equals("First serve points")) {
                    str = context.getString(R.string.tennis_first_serve_points_won);
                    break;
                }
                break;
            case -2108793354:
                if (str.equals("Backhand")) {
                    str = context.getString(R.string.tennis_backhand_stat);
                    break;
                }
                break;
            case -2001356669:
                if (str.equals("Second serve")) {
                    str = context.getString(R.string.tennis_second_serve);
                    break;
                }
                break;
            case -1864468238:
                if (str.equals("First serve return points")) {
                    str = context.getString(R.string.first_serve_return_points);
                    break;
                }
                break;
            case -1850529456:
                if (str.equals("Return")) {
                    str = context.getString(R.string.tennis_return_stat);
                    break;
                }
                break;
            case -1806105824:
                if (str.equals("Second serve points")) {
                    str = context.getString(R.string.tennis_second_serve_points);
                    break;
                }
                break;
            case -1760997652:
                if (str.equals("Service games won")) {
                    str = context.getString(R.string.service_games_won);
                    break;
                }
                break;
            case -1727025011:
                if (str.equals("Volley")) {
                    str = context.getString(R.string.tennis_volley_stat);
                    break;
                }
                break;
            case -1280532492:
                if (str.equals("Winners")) {
                    str = context.getString(R.string.winners);
                    break;
                }
                break;
            case -1273863529:
                if (str.equals("Games won")) {
                    str = context.getString(R.string.games_won);
                    break;
                }
                break;
            case -1023380821:
                if (str.equals("Break points saved")) {
                    str = context.getString(R.string.break_points_saved);
                    break;
                }
                break;
            case -996032581:
                if (str.equals("Max games in a row")) {
                    str = context.getString(R.string.max_games_in_a_row);
                    break;
                }
                break;
            case -833225788:
                if (str.equals("Tiebreaks")) {
                    str = context.getString(R.string.tiebreaks);
                    break;
                }
                break;
            case -826606209:
                if (str.equals("First serve")) {
                    str = context.getString(R.string.tennis_first_serve);
                    break;
                }
                break;
            case -646160747:
                if (str.equals("Service")) {
                    str = context.getString(R.string.tennis_service_stat);
                    break;
                }
                break;
            case -635807147:
                if (str.equals("Total points won")) {
                    str = context.getString(R.string.total_points_won);
                    break;
                }
                break;
            case -77357834:
                if (str.equals("Second serve return points")) {
                    str = context.getString(R.string.second_serve_return_points);
                    break;
                }
                break;
            case -14568261:
                if (str.equals("Total games won")) {
                    str = context.getString(R.string.total_games_won);
                    break;
                }
                break;
            case 76575:
                if (str.equals("Lob")) {
                    str = context.getString(R.string.tennis_lob_stat);
                    break;
                }
                break;
            case 2034800:
                if (str.equals("Aces")) {
                    str = context.getString(R.string.aces);
                    break;
                }
                break;
            case 80997156:
                if (str.equals("Total")) {
                    str = context.getString(R.string.total);
                    break;
                }
                break;
            case 90801802:
                if (str.equals("Receiver points won")) {
                    str = context.getString(R.string.receiver_points);
                    break;
                }
                break;
            case 96120290:
                if (str.equals("Return games played")) {
                    str = context.getString(R.string.return_games_played);
                    break;
                }
                break;
            case 169169569:
                if (str.equals("Max points in a row")) {
                    str = context.getString(R.string.max_points_in_a_row);
                    break;
                }
                break;
            case 390388711:
                if (str.equals("Total errors")) {
                    str = context.getString(R.string.tennis_total_errors);
                    break;
                }
                break;
            case 445671840:
                if (str.equals("Double faults")) {
                    str = context.getString(R.string.double_faults);
                    break;
                }
                break;
            case 531526475:
                if (str.equals("Forehand")) {
                    str = context.getString(R.string.tennis_forehand_stat);
                    break;
                }
                break;
            case 594339028:
                if (str.equals("Overhead")) {
                    str = context.getString(R.string.tennis_overhead_stat);
                    break;
                }
                break;
            case 702269791:
                if (str.equals("Total points")) {
                    str = context.getString(R.string.tennis_total_points);
                    break;
                }
                break;
            case 918626975:
                if (str.equals("Groundstroke")) {
                    str = context.getString(R.string.tennis_groundstroke_stat);
                    break;
                }
                break;
            case 941027517:
                if (str.equals("Service games played")) {
                    str = context.getString(R.string.service_games_played);
                    break;
                }
                break;
            case 1059456580:
                if (str.equals("Service points won")) {
                    str = context.getString(R.string.service_points);
                    break;
                }
                break;
            case 1425150362:
                if (str.equals("Total won")) {
                    str = context.getString(R.string.tennis_total_won);
                    break;
                }
                break;
            case 1432271211:
                if (str.equals("Drop shot")) {
                    str = context.getString(R.string.tennis_drop_shot_stat);
                    break;
                }
                break;
            case 1696637700:
                if (str.equals("Overhead stroke")) {
                    str = context.getString(R.string.tennis_overhead_stroke_stat);
                    break;
                }
                break;
            case 1781708921:
                if (str.equals("Unforced errors")) {
                    str = context.getString(R.string.tennis_unforced_errors);
                    break;
                }
                break;
            case 1929305014:
                if (str.equals("Break points converted")) {
                    str = context.getString(R.string.break_points_converted);
                    break;
                }
                break;
            case 2045913880:
                if (str.equals("Total winners")) {
                    str = context.getString(R.string.tennis_total_winners);
                    break;
                }
                break;
        }
        str.getClass();
        return str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:599:0x0dd1, code lost:
    
        if (r26.equals(com.sofascore.model.Sports.BEACH_VOLLEY) == false) goto L837;
     */
    /* JADX WARN: Code restructure failed: missing block: B:601:0x0dfa, code lost:
    
        switch(r25.hashCode()) {
            case -2011905198: goto L824;
            case -1019254791: goto L820;
            case 2034800: goto L816;
            case 90801802: goto L812;
            case 169169569: goto L808;
            case 925488982: goto L804;
            case 1059456580: goto L800;
            default: goto L826;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:603:0x0e03, code lost:
    
        if (r25.equals(r3) != false) goto L803;
     */
    /* JADX WARN: Code restructure failed: missing block: B:604:0x0e06, code lost:
    
        r0 = r24.getString(com.sofascore.results.R.string.service_points);
     */
    /* JADX WARN: Code restructure failed: missing block: B:605:0x0e6a, code lost:
    
        r0.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:606:0x0e6d, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:608:0x0e12, code lost:
    
        if (r25.equals(r4) != false) goto L807;
     */
    /* JADX WARN: Code restructure failed: missing block: B:609:0x0e15, code lost:
    
        r0 = r24.getString(com.sofascore.results.R.string.service_errors);
     */
    /* JADX WARN: Code restructure failed: missing block: B:611:0x0e21, code lost:
    
        if (r25.equals("Max points in a row") != false) goto L811;
     */
    /* JADX WARN: Code restructure failed: missing block: B:612:0x0e24, code lost:
    
        r0 = r24.getString(com.sofascore.results.R.string.max_points_in_a_row);
     */
    /* JADX WARN: Code restructure failed: missing block: B:614:0x0e30, code lost:
    
        if (r25.equals(r5) != false) goto L815;
     */
    /* JADX WARN: Code restructure failed: missing block: B:615:0x0e33, code lost:
    
        r0 = r24.getString(com.sofascore.results.R.string.receiver_points);
     */
    /* JADX WARN: Code restructure failed: missing block: B:617:0x0e41, code lost:
    
        if (r25.equals("Aces") != false) goto L819;
     */
    /* JADX WARN: Code restructure failed: missing block: B:618:0x0e44, code lost:
    
        r0 = r24.getString(com.sofascore.results.R.string.aces);
     */
    /* JADX WARN: Code restructure failed: missing block: B:620:0x0e50, code lost:
    
        if (r25.equals(r7) != false) goto L823;
     */
    /* JADX WARN: Code restructure failed: missing block: B:621:0x0e53, code lost:
    
        r0 = r24.getString(com.sofascore.results.R.string.points_won);
     */
    /* JADX WARN: Code restructure failed: missing block: B:623:0x0e5f, code lost:
    
        if (r25.equals("Timeouts") != false) goto L827;
     */
    /* JADX WARN: Code restructure failed: missing block: B:624:0x0e63, code lost:
    
        r0 = r24.getString(com.sofascore.results.R.string.timeouts);
     */
    /* JADX WARN: Code restructure failed: missing block: B:625:0x0e61, code lost:
    
        r0 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:631:0x0df2, code lost:
    
        if (r26.equals(com.sofascore.model.Sports.VOLLEYBALL) == false) goto L837;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String D(Context context, String str, String str2) {
        String str3;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        context.getClass();
        str.getClass();
        str2.getClass();
        switch (str2.hashCode()) {
            case -2005973498:
                if (str2.equals(Sports.BADMINTON)) {
                    switch (str.hashCode()) {
                        case -2049299907:
                            if (str.equals("Biggest lead")) {
                                str3 = context.getString(R.string.biggest_lead);
                                break;
                            }
                            str3 = str;
                            break;
                        case -1019254791:
                            if (str.equals("Points won")) {
                                str3 = context.getString(R.string.points_won);
                                break;
                            }
                            str3 = str;
                            break;
                        case -1001238420:
                            if (str.equals("Comeback to win")) {
                                str3 = context.getString(R.string.comeback_to_win);
                                break;
                            }
                            str3 = str;
                            break;
                        case 90801802:
                            if (str.equals("Receiver points won")) {
                                str3 = context.getString(R.string.receiver_points);
                                break;
                            }
                            str3 = str;
                            break;
                        case 169169569:
                            if (str.equals("Max points in a row")) {
                                str3 = context.getString(R.string.max_points_in_a_row);
                                break;
                            }
                            str3 = str;
                            break;
                        case 1059456580:
                            if (str.equals("Service points won")) {
                                str3 = context.getString(R.string.service_points);
                                break;
                            }
                            str3 = str;
                            break;
                        case 1484957630:
                            if (str.equals("Match points")) {
                                str3 = context.getString(R.string.match_points);
                                break;
                            }
                            str3 = str;
                            break;
                        default:
                            str3 = str;
                            break;
                    }
                    str3.getClass();
                    return str3;
                }
                return str;
            case -2002238939:
                if (str2.equals(Sports.ICE_HOCKEY)) {
                    return A(context, str);
                }
                return str;
            case -1160328212:
                obj = "Points won";
                obj2 = "Receiver points won";
                obj3 = "Service errors";
                obj4 = "Service points won";
                break;
            case -877324069:
                if (str2.equals(Sports.TENNIS)) {
                    return C(context, str);
                }
                return str;
            case -433846249:
                obj = "Points won";
                obj2 = "Receiver points won";
                obj3 = "Service errors";
                obj4 = "Service points won";
                break;
            case -83759494:
                if (str2.equals(Sports.AMERICAN_FOOTBALL)) {
                    switch (str.hashCode()) {
                        case -1467219353:
                            if (str.equals("First downs by passing")) {
                                str4 = context.getString(R.string.american_football_passing_first_downs);
                                break;
                            }
                            str4 = str;
                            break;
                        case -1357853505:
                            if (str.equals("First downs by penalty")) {
                                str4 = context.getString(R.string.amf_first_downs_by_penalty);
                                break;
                            }
                            str4 = str;
                            break;
                        case -1235775603:
                            if (str.equals("Yards penalized")) {
                                str4 = context.getString(R.string.american_football_penalty_yards);
                                break;
                            }
                            str4 = str;
                            break;
                        case -1210766649:
                            if (str.equals("Penalties")) {
                                str4 = context.getString(R.string.amf_penalties);
                                break;
                            }
                            str4 = str;
                            break;
                        case -1032690244:
                            if (str.equals("Rushing attempts")) {
                                str4 = context.getString(R.string.american_football_rushing_attempts);
                                break;
                            }
                            str4 = str;
                            break;
                        case -840156543:
                            if (str.equals("First downs")) {
                                str4 = context.getString(R.string.amf_first_downs);
                                break;
                            }
                            str4 = str;
                            break;
                        case -530758706:
                            if (str.equals("Third down efficiency")) {
                                str4 = context.getString(R.string.amf_third_down_efficiency);
                                break;
                            }
                            str4 = str;
                            break;
                        case -523632515:
                            if (str.equals("Total yards")) {
                                str4 = context.getString(R.string.amf_total_yards);
                                break;
                            }
                            str4 = str;
                            break;
                        case -152287967:
                            if (str.equals("Red zone rushing attempts")) {
                                str4 = context.getString(R.string.american_football_red_zone_rushing);
                                break;
                            }
                            str4 = str;
                            break;
                        case 60920259:
                            if (str.equals("Rushing yards")) {
                                str4 = context.getString(R.string.amf_rushing_yards);
                                break;
                            }
                            str4 = str;
                            break;
                        case 76098474:
                            if (str.equals("Average rushing yards per attempt")) {
                                str4 = context.getString(R.string.american_football_average_rushing_yards_attempt);
                                break;
                            }
                            str4 = str;
                            break;
                        case 77476648:
                            if (str.equals("Punts")) {
                                str4 = context.getString(R.string.punts);
                                break;
                            }
                            str4 = str;
                            break;
                        case 331902225:
                            if (str.equals("Average passing yards per attempt")) {
                                str4 = context.getString(R.string.american_football_average_passing_yards_attempt);
                                break;
                            }
                            str4 = str;
                            break;
                        case 400890962:
                            if (str.equals("Touchdowns")) {
                                str4 = context.getString(R.string.touchdowns);
                                break;
                            }
                            str4 = str;
                            break;
                        case 554736890:
                            if (str.equals("Field goals")) {
                                str4 = context.getString(R.string.amf_field_goals);
                                break;
                            }
                            str4 = str;
                            break;
                        case 645057953:
                            if (str.equals("Passing touchdowns")) {
                                str4 = context.getString(R.string.passing_touchdowns);
                                break;
                            }
                            str4 = str;
                            break;
                        case 691342296:
                            if (str.equals("Time of Possession")) {
                                str4 = context.getString(R.string.amf_time_of_Possession);
                                break;
                            }
                            str4 = str;
                            break;
                        case 739727521:
                            if (str.equals("Average yards per play")) {
                                str4 = context.getString(R.string.american_football_average_yards_play);
                                break;
                            }
                            str4 = str;
                            break;
                        case 739736568:
                            if (str.equals("Average yards per punt")) {
                                str4 = context.getString(R.string.amf_average_yards_per_punt);
                                break;
                            }
                            str4 = str;
                            break;
                        case 880043328:
                            if (str.equals("First downs by rushing")) {
                                str4 = context.getString(R.string.american_football_rushing_first_downs);
                                break;
                            }
                            str4 = str;
                            break;
                        case 1014578363:
                            if (str.equals("Interceptions thrown")) {
                                str4 = context.getString(R.string.interceptions_thrown);
                                break;
                            }
                            str4 = str;
                            break;
                        case 1068986798:
                            if (str.equals("Red zone efficiency")) {
                                str4 = context.getString(R.string.amf_red_zone_efficiency);
                                break;
                            }
                            str4 = str;
                            break;
                        case 1126373518:
                            if (str.equals("Gross yards passing")) {
                                str4 = context.getString(R.string.american_football_gross_passing_yards);
                                break;
                            }
                            str4 = str;
                            break;
                        case 1154049238:
                            if (str.equals("Fumbles")) {
                                str4 = context.getString(R.string.fumbles);
                                break;
                            }
                            str4 = str;
                            break;
                        case 1306981415:
                            if (str.equals("Net yards passing")) {
                                str4 = context.getString(R.string.american_football_net_passing_yards);
                                break;
                            }
                            str4 = str;
                            break;
                        case 1445820861:
                            if (str.equals("Average yards per drive")) {
                                str4 = context.getString(R.string.american_football_average_yards_drive);
                                break;
                            }
                            str4 = str;
                            break;
                        case 1687676974:
                            if (str.equals("Fumbles lost")) {
                                str4 = context.getString(R.string.fumbles_lost);
                                break;
                            }
                            str4 = str;
                            break;
                        case 1850049498:
                            if (str.equals("Red zone passing attempts")) {
                                str4 = context.getString(R.string.american_football_red_zone_passing);
                                break;
                            }
                            str4 = str;
                            break;
                        case 1894564770:
                            if (str.equals("Turnovers")) {
                                str4 = context.getString(R.string.amf_turnovers);
                                break;
                            }
                            str4 = str;
                            break;
                        default:
                            str4 = str;
                            break;
                    }
                    str4.getClass();
                    return str4;
                }
                return str;
            case 1767150:
                if (str2.equals(Sports.HANDBALL)) {
                    switch (str.hashCode()) {
                        case -2011905198:
                            if (str.equals("Timeouts")) {
                                str5 = context.getString(R.string.timeouts);
                                break;
                            }
                            str5 = str;
                            break;
                        case -1808513756:
                            if (str.equals("Steals")) {
                                str5 = context.getString(R.string.steals);
                                break;
                            }
                            str5 = str;
                            break;
                        case -1613802229:
                            if (str.equals("Goal streak")) {
                                str5 = context.getString(R.string.goal_streak);
                                break;
                            }
                            str5 = str;
                            break;
                        case -1409210025:
                            if (str.equals("6m goals")) {
                                str5 = context.getString(R.string.m6_goals);
                                break;
                            }
                            str5 = str;
                            break;
                        case -1406666291:
                            if (str.equals("2 min penalty")) {
                                str5 = context.getString(R.string.two_min_penalty);
                                break;
                            }
                            str5 = str;
                            break;
                        case -1376923117:
                            if (str.equals("7 meters")) {
                                str5 = context.getString(R.string.seven_meters);
                                break;
                            }
                            str5 = str;
                            break;
                        case -1208476470:
                            if (str.equals("Shorthanded goals")) {
                                str5 = context.getString(R.string.short_handed_goals);
                                break;
                            }
                            str5 = str;
                            break;
                        case -1044360154:
                            if (str.equals("Breakthrough goals")) {
                                str5 = context.getString(R.string.breakthrough_goals);
                                break;
                            }
                            str5 = str;
                            break;
                        case -995417245:
                            if (str.equals("Fastbreak goals")) {
                                str5 = context.getString(R.string.fastbreak_goals);
                                break;
                            }
                            str5 = str;
                            break;
                        case -549002028:
                            if (str.equals("Technical faults")) {
                                str5 = context.getString(R.string.technical_faults);
                                break;
                            }
                            str5 = str;
                            break;
                        case -475746316:
                            if (str.equals("9m goals")) {
                                str5 = context.getString(R.string.m9_goals);
                                break;
                            }
                            str5 = str;
                            break;
                        case -457470761:
                            if (str.equals("Yellow cards")) {
                                str5 = context.getString(R.string.handball_yellow_cards);
                                break;
                            }
                            str5 = str;
                            break;
                        case -52129909:
                            if (str.equals("Wing goals")) {
                                str5 = context.getString(R.string.wing_goals);
                                break;
                            }
                            str5 = str;
                            break;
                        case 62001406:
                            if (str.equals("Goals in powerplay")) {
                                str5 = context.getString(R.string.goals_in_powerplay);
                                break;
                            }
                            str5 = str;
                            break;
                        case 68973472:
                            if (str.equals("Goals")) {
                                str5 = context.getString(R.string.goals);
                                break;
                            }
                            str5 = str;
                            break;
                        case 79658614:
                            if (str.equals("Saves")) {
                                str5 = context.getString(R.string.handball_saves);
                                break;
                            }
                            str5 = str;
                            break;
                        case 344285452:
                            if (str.equals("7m saves")) {
                                str5 = context.getString(R.string.m7_saves);
                                break;
                            }
                            str5 = str;
                            break;
                        case 393449254:
                            if (str.equals("Shooting efficiency")) {
                                str5 = context.getString(R.string.shooting_efficiency);
                                break;
                            }
                            str5 = str;
                            break;
                        case 959996682:
                            if (str.equals("Assists")) {
                                str5 = context.getString(R.string.handball_assists);
                                break;
                            }
                            str5 = str;
                            break;
                        case 1609392884:
                            if (str.equals("Red cards")) {
                                str5 = context.getString(R.string.handball_red_cards);
                                break;
                            }
                            str5 = str;
                            break;
                        default:
                            str5 = str;
                            break;
                    }
                    str5.getClass();
                    return str5;
                }
                return str;
            case 95355092:
                if (str2.equals(Sports.DARTS)) {
                    switch (str.hashCode()) {
                        case -1972890644:
                            if (str.equals("Checkouts accuracy")) {
                                str6 = context.getString(R.string.checkouts_accuracy);
                                break;
                            }
                            str6 = str;
                            break;
                        case -1832994462:
                            if (str.equals("Highest checkout")) {
                                str6 = context.getString(R.string.highest_checkout);
                                break;
                            }
                            str6 = str;
                            break;
                        case -1605046435:
                            if (str.equals("Thrown over 100")) {
                                str6 = context.getString(R.string.thrown_over_100);
                                break;
                            }
                            str6 = str;
                            break;
                        case -1605046311:
                            if (str.equals("Thrown over 140")) {
                                str6 = context.getString(R.string.thrown_over_140);
                                break;
                            }
                            str6 = str;
                            break;
                        case 686315416:
                            if (str.equals("Checkouts over 100")) {
                                str6 = context.getString(R.string.checkouts_over_100);
                                break;
                            }
                            str6 = str;
                            break;
                        case 1731066161:
                            if (str.equals("Thrown 180")) {
                                str6 = context.getString(R.string.thrown_180);
                                break;
                            }
                            str6 = str;
                            break;
                        case 1765779332:
                            if (str.equals("Average 3 darts")) {
                                str6 = context.getString(R.string.average_3_darts);
                                break;
                            }
                            str6 = str;
                            break;
                        default:
                            str6 = str;
                            break;
                    }
                    str6.getClass();
                    return str6;
                }
                return str;
            case 108869083:
                if (str2.equals(Sports.RUGBY)) {
                    switch (str.hashCode()) {
                        case -2075953447:
                            if (str.equals("Carries")) {
                                str7 = context.getString(R.string.rugby_carries);
                                break;
                            }
                            str7 = str;
                            break;
                        case -2068910493:
                            if (str.equals("Ball possession")) {
                                str7 = context.getString(R.string.rugby_ball_possession);
                                break;
                            }
                            str7 = str;
                            break;
                        case -1975720539:
                            if (str.equals("Try assists")) {
                                str7 = context.getString(R.string.rugby_try_assists);
                                break;
                            }
                            str7 = str;
                            break;
                        case -1960188597:
                            if (str.equals("Scrums lost")) {
                                str7 = context.getString(R.string.rugby_scrums_lost);
                                break;
                            }
                            str7 = str;
                            break;
                        case -1911513953:
                            if (str.equals("Passes")) {
                                str7 = context.getString(R.string.passes);
                                break;
                            }
                            str7 = str;
                            break;
                        case -1823807079:
                            if (str.equals("Scrums")) {
                                str7 = context.getString(R.string.scrums);
                                break;
                            }
                            str7 = str;
                            break;
                        case -1623291560:
                            if (str.equals("Penalties conceded")) {
                                str7 = context.getString(R.string.rugby_penalty_conceded);
                                break;
                            }
                            str7 = str;
                            break;
                        case -1293823083:
                            if (str.equals("Meters run")) {
                                str7 = context.getString(R.string.rugby_meters_run);
                                break;
                            }
                            str7 = str;
                            break;
                        case -1171599985:
                            if (str.equals("Scrums won")) {
                                str7 = context.getString(R.string.rugby_scrums_won);
                                break;
                            }
                            str7 = str;
                            break;
                        case -716478225:
                            if (str.equals("Lineouts won")) {
                                str7 = context.getString(R.string.rugby_lineouts_won);
                                break;
                            }
                            str7 = str;
                            break;
                        case -697525154:
                            if (str.equals("Offloads")) {
                                str7 = context.getString(R.string.rugby_offloads);
                                break;
                            }
                            str7 = str;
                            break;
                        case -457470761:
                            if (str.equals("Yellow cards")) {
                                str7 = context.getString(R.string.rugby_yellow_cards);
                                break;
                            }
                            str7 = str;
                            break;
                        case -128674487:
                            if (str.equals("Penalty goals")) {
                                str7 = context.getString(R.string.rugby_penalty_goals);
                                break;
                            }
                            str7 = str;
                            break;
                        case 81076089:
                            if (str.equals("Tries")) {
                                str7 = context.getString(R.string.tries);
                                break;
                            }
                            str7 = str;
                            break;
                        case 112648773:
                            if (str.equals("Tackles")) {
                                str7 = context.getString(R.string.rugby_tackles);
                                break;
                            }
                            str7 = str;
                            break;
                        case 583599613:
                            if (str.equals("Conversions")) {
                                str7 = context.getString(R.string.conversions);
                                break;
                            }
                            str7 = str;
                            break;
                        case 1184710870:
                            if (str.equals("Tackles missed")) {
                                str7 = context.getString(R.string.rugby_tackles_missed);
                                break;
                            }
                            str7 = str;
                            break;
                        case 1254110457:
                            if (str.equals("Lineouts")) {
                                str7 = context.getString(R.string.lineouts);
                                break;
                            }
                            str7 = str;
                            break;
                        case 1343936811:
                            if (str.equals("Clean breaks")) {
                                str7 = context.getString(R.string.rugby_clean_breaks);
                                break;
                            }
                            str7 = str;
                            break;
                        case 1439847279:
                            if (str.equals("Drop goals")) {
                                str7 = context.getString(R.string.rugby_drop_goals);
                                break;
                            }
                            str7 = str;
                            break;
                        case 1609392884:
                            if (str.equals("Red cards")) {
                                str7 = context.getString(R.string.rugby_red_cards);
                                break;
                            }
                            str7 = str;
                            break;
                        case 1894564770:
                            if (str.equals("Turnovers")) {
                                str7 = context.getString(R.string.rugby_turnovers);
                                break;
                            }
                            str7 = str;
                            break;
                        default:
                            str7 = str;
                            break;
                    }
                    str7.getClass();
                    return str7;
                }
                return str;
            case 203883450:
                if (str2.equals(Sports.TABLE_TENNIS)) {
                    switch (str.hashCode()) {
                        case -2049299907:
                            if (str.equals("Biggest lead")) {
                                str8 = context.getString(R.string.biggest_lead);
                                break;
                            }
                            str8 = str;
                            break;
                        case -2011905198:
                            if (str.equals("Timeouts")) {
                                str8 = context.getString(R.string.timeouts);
                                break;
                            }
                            str8 = str;
                            break;
                        case -1019254791:
                            if (str.equals("Points won")) {
                                str8 = context.getString(R.string.points_won);
                                break;
                            }
                            str8 = str;
                            break;
                        case -1001238420:
                            if (str.equals("Comeback to win")) {
                                str8 = context.getString(R.string.comeback_to_win);
                                break;
                            }
                            str8 = str;
                            break;
                        case 90801802:
                            if (str.equals("Receiver points won")) {
                                str8 = context.getString(R.string.receiver_points);
                                break;
                            }
                            str8 = str;
                            break;
                        case 169169569:
                            if (str.equals("Max points in a row")) {
                                str8 = context.getString(R.string.max_points_in_a_row);
                                break;
                            }
                            str8 = str;
                            break;
                        case 925488982:
                            if (str.equals("Service errors")) {
                                str8 = context.getString(R.string.service_errors);
                                break;
                            }
                            str8 = str;
                            break;
                        case 1059456580:
                            if (str.equals("Service points won")) {
                                str8 = context.getString(R.string.service_points);
                                break;
                            }
                            str8 = str;
                            break;
                        default:
                            str8 = str;
                            break;
                    }
                    str8.getClass();
                    return str8;
                }
                return str;
            case 394668909:
                if (str2.equals(Sports.FOOTBALL)) {
                    switch (str.hashCode()) {
                        case -2106254519:
                            if (str.equals("Shots off target")) {
                                str9 = context.getString(R.string.football_shots_off_target);
                                break;
                            }
                            str9 = str;
                            break;
                        case -2068910493:
                            if (str.equals("Ball possession")) {
                                str9 = context.getString(R.string.football_ball_possession);
                                break;
                            }
                            str9 = str;
                            break;
                        case -1956299392:
                            if (str.equals("Key passes")) {
                                str9 = context.getString(R.string.key_passes);
                                break;
                            }
                            str9 = str;
                            break;
                        case -1943416789:
                            if (str.equals("Shots on target")) {
                                str9 = context.getString(R.string.football_shots_on_goal);
                                break;
                            }
                            str9 = str;
                            break;
                        case -1914843335:
                            if (str.equals("Yellow/Red cards")) {
                                str9 = context.getString(R.string.yellow_red_cards);
                                break;
                            }
                            str9 = str;
                            break;
                        case -1911513953:
                            if (str.equals("Passes")) {
                                str9 = context.getString(R.string.passes);
                                break;
                            }
                            str9 = str;
                            break;
                        case -1885235168:
                            if (str.equals("Total shots/on target")) {
                                str9 = context.getString(R.string.total_shots_on_target);
                                break;
                            }
                            str9 = str;
                            break;
                        case -1859830843:
                            if (str.equals("Successful dribbles")) {
                                str9 = context.getString(R.string.football_successful_dribbles);
                                break;
                            }
                            str9 = str;
                            break;
                        case -1739647014:
                            if (str.equals("Acc. crosses per game")) {
                                str9 = context.getString(R.string.football_accurate_crosses_per_game);
                                break;
                            }
                            str9 = str;
                            break;
                        case -1697867709:
                            if (str.equals("Aerials won")) {
                                str9 = context.getString(R.string.football_aerials_won);
                                break;
                            }
                            str9 = str;
                            break;
                        case -1614116507:
                            if (str.equals("Blocked shots")) {
                                str9 = context.getString(R.string.blocked_shots);
                                break;
                            }
                            str9 = str;
                            break;
                        case -1591989042:
                            if (str.equals("Crosses")) {
                                str9 = context.getString(R.string.football_crosses);
                                break;
                            }
                            str9 = str;
                            break;
                        case -1533147191:
                            if (str.equals("Shots outside box")) {
                                str9 = context.getString(R.string.football_shots_outside_box);
                                break;
                            }
                            str9 = str;
                            break;
                        case -1472289086:
                            if (str.equals("Ground duels")) {
                                str9 = context.getString(R.string.football_ground_duels);
                                break;
                            }
                            str9 = str;
                            break;
                        case -1450271981:
                            if (str.equals("Recoveries")) {
                                str9 = context.getString(R.string.football_recoveries);
                                break;
                            }
                            str9 = str;
                            break;
                        case -1413769842:
                            if (str.equals("Shots inside box")) {
                                str9 = context.getString(R.string.football_shots_inside_box);
                                break;
                            }
                            str9 = str;
                            break;
                        case -1280222217:
                            if (str.equals("Goals prevented")) {
                                str9 = context.getString(R.string.football_goals_prevented);
                                break;
                            }
                            str9 = str;
                            break;
                        case -1245237605:
                            if (str.equals("Goalkeeper saves")) {
                                str9 = context.getString(R.string.football_goalkeeper_saves);
                                break;
                            }
                            str9 = str;
                            break;
                        case -1207417459:
                            if (str.equals("Final third entries")) {
                                str9 = context.getString(R.string.football_final_third_entries);
                                break;
                            }
                            str9 = str;
                            break;
                        case -855872151:
                            if (str.equals("Total tackles")) {
                                str9 = context.getString(R.string.total_tackles);
                                break;
                            }
                            str9 = str;
                            break;
                        case -778497326:
                            if (str.equals("Acc. long balls per game")) {
                                str9 = context.getString(R.string.football_accurate_long_balls_per_game);
                                break;
                            }
                            str9 = str;
                            break;
                        case -691236339:
                            if (str.equals("Offsides")) {
                                str9 = context.getString(R.string.football_offsides);
                                break;
                            }
                            str9 = str;
                            break;
                        case -674163326:
                            if (str.equals("Corner kicks")) {
                                str9 = context.getString(R.string.football_corner_kicks);
                                break;
                            }
                            str9 = str;
                            break;
                        case -552184513:
                            if (str.equals("Dribbles")) {
                                str9 = context.getString(R.string.football_dribbles);
                                break;
                            }
                            str9 = str;
                            break;
                        case -529169766:
                            if (str.equals("Total saves")) {
                                str9 = context.getString(R.string.football_goalkeeper_saves);
                                break;
                            }
                            str9 = str;
                            break;
                        case -528967491:
                            if (str.equals("Total shots")) {
                                str9 = context.getString(R.string.football_total_shots);
                                break;
                            }
                            str9 = str;
                            break;
                        case -515049124:
                            if (str.equals("Big chances missed")) {
                                str9 = context.getString(R.string.football_big_chances_missed);
                                break;
                            }
                            str9 = str;
                            break;
                        case -457470761:
                            if (str.equals("Yellow cards")) {
                                str9 = context.getString(R.string.football_yellow_cards);
                                break;
                            }
                            str9 = str;
                            break;
                        case -445734631:
                            if (str.equals("Through balls")) {
                                str9 = context.getString(R.string.football_through_balls);
                                break;
                            }
                            str9 = str;
                            break;
                        case -438092803:
                            if (str.equals("Penalties saves")) {
                                str9 = context.getString(R.string.football_penalties_saved);
                                break;
                            }
                            str9 = str;
                            break;
                        case -370502567:
                            if (str.equals("Free kicks")) {
                                str9 = context.getString(R.string.football_free_kicks);
                                break;
                            }
                            str9 = str;
                            break;
                        case -348935469:
                            if (str.equals("Big chances scored")) {
                                str9 = context.getString(R.string.football_big_chances_scored);
                                break;
                            }
                            str9 = str;
                            break;
                        case -198335552:
                            if (str.equals("Goal kicks")) {
                                str9 = context.getString(R.string.football_goal_kicks);
                                break;
                            }
                            str9 = str;
                            break;
                        case -150297648:
                            if (str.equals("Long balls")) {
                                str9 = context.getString(R.string.football_long_balls);
                                break;
                            }
                            str9 = str;
                            break;
                        case -117989345:
                            if (str.equals("Penalty saves")) {
                                str9 = context.getString(R.string.football_penalties_saved);
                                break;
                            }
                            str9 = str;
                            break;
                        case -63639902:
                            if (str.equals("Possession lost")) {
                                str9 = context.getString(R.string.football_possession_lost);
                                break;
                            }
                            str9 = str;
                            break;
                        case 23234829:
                            if (str.equals("Interceptions")) {
                                str9 = context.getString(R.string.interceptions);
                                break;
                            }
                            str9 = str;
                            break;
                        case 66385499:
                            if (str.equals("Duels")) {
                                str9 = context.getString(R.string.football_duels);
                                break;
                            }
                            str9 = str;
                            break;
                        case 68069171:
                            if (str.equals("Fouls")) {
                                str9 = context.getString(R.string.football_fouls);
                                break;
                            }
                            str9 = str;
                            break;
                        case 68973472:
                            if (str.equals("Goals")) {
                                str9 = context.getString(R.string.goals);
                                break;
                            }
                            str9 = str;
                            break;
                        case 79658614:
                            if (str.equals("Saves")) {
                                str9 = context.getString(R.string.football_saves);
                                break;
                            }
                            str9 = str;
                            break;
                        case 112648773:
                            if (str.equals("Tackles")) {
                                str9 = context.getString(R.string.football_tackles);
                                break;
                            }
                            str9 = str;
                            break;
                        case 147252664:
                            if (str.equals("Final third phase")) {
                                str9 = context.getString(R.string.final_third_passes);
                                break;
                            }
                            str9 = str;
                            break;
                        case 208152935:
                            if (str.equals("Number of sprints")) {
                                str9 = context.getString(R.string.football_running_number_of_sprints);
                                break;
                            }
                            str9 = str;
                            break;
                        case 547542956:
                            if (str.equals("Counter attack goals")) {
                                str9 = context.getString(R.string.counter_attack_goals);
                                break;
                            }
                            str9 = str;
                            break;
                        case 552152780:
                            if (str.equals("Touches in penalty area")) {
                                str9 = context.getString(R.string.football_touches_in_opposition_box);
                                break;
                            }
                            str9 = str;
                            break;
                        case 558430373:
                            if (str.equals("Counter attack shots")) {
                                str9 = context.getString(R.string.football_counter_attack_shots);
                                break;
                            }
                            str9 = str;
                            break;
                        case 689642747:
                            if (str.equals("Total passes")) {
                                str9 = context.getString(R.string.football_total_passes);
                                break;
                            }
                            str9 = str;
                            break;
                        case 746713191:
                            if (str.equals("Throw-ins")) {
                                str9 = context.getString(R.string.football_throw_ins);
                                break;
                            }
                            str9 = str;
                            break;
                        case 810717243:
                            if (str.equals("Tackles won")) {
                                str9 = context.getString(R.string.football_tackles_won);
                                break;
                            }
                            str9 = str;
                            break;
                        case 882295843:
                            if (str.equals("Fouled in final third")) {
                                str9 = context.getString(R.string.football_fouled_in_final_third);
                                break;
                            }
                            str9 = str;
                            break;
                        case 885392414:
                            if (str.equals("Clearances per game")) {
                                str9 = context.getString(R.string.football_clearances_per_game);
                                break;
                            }
                            str9 = str;
                            break;
                        case 887186625:
                            if (str.equals("Aerial duels")) {
                                str9 = context.getString(R.string.football_aerial_duels);
                                break;
                            }
                            str9 = str;
                            break;
                        case 959996682:
                            if (str.equals("Assists")) {
                                str9 = context.getString(R.string.football_assists);
                                break;
                            }
                            str9 = str;
                            break;
                        case 961238997:
                            if (str.equals("High claims")) {
                                str9 = context.getString(R.string.football_high_claims);
                                break;
                            }
                            str9 = str;
                            break;
                        case 1172455495:
                            if (str.equals("Big chances created")) {
                                str9 = context.getString(R.string.football_big_chances_created);
                                break;
                            }
                            str9 = str;
                            break;
                        case 1253271909:
                            if (str.equals("Shots blocked")) {
                                str9 = context.getString(R.string.football_shots_blocked);
                                break;
                            }
                            str9 = str;
                            break;
                        case 1262319351:
                            if (str.equals("Clearances")) {
                                str9 = context.getString(R.string.football_clearances);
                                break;
                            }
                            str9 = str;
                            break;
                        case 1341999863:
                            if (str.equals("Dispossessed")) {
                                str9 = context.getString(R.string.football_dispossessed);
                                break;
                            }
                            str9 = str;
                            break;
                        case 1406050424:
                            if (str.equals("Expected goals")) {
                                str9 = context.getString(R.string.football_expected_goals);
                                break;
                            }
                            str9 = str;
                            break;
                        case 1414437643:
                            if (str.equals("Accurate passes")) {
                                str9 = context.getString(R.string.football_accurate_passes);
                                break;
                            }
                            str9 = str;
                            break;
                        case 1440100924:
                            if (str.equals("Punches")) {
                                str9 = context.getString(R.string.football_goalkeeper_punches);
                                break;
                            }
                            str9 = str;
                            break;
                        case 1442902568:
                            if (str.equals("Errors lead to a goal")) {
                                str9 = context.getString(R.string.errors_leading_to_goal);
                                break;
                            }
                            str9 = str;
                            break;
                        case 1443253775:
                            if (str.equals("Errors lead to a shot")) {
                                str9 = context.getString(R.string.error_lead_to_shot);
                                break;
                            }
                            str9 = str;
                            break;
                        case 1522491222:
                            if (str.equals("Big saves")) {
                                str9 = context.getString(R.string.football_big_saves);
                                break;
                            }
                            str9 = str;
                            break;
                        case 1609392884:
                            if (str.equals("Red cards")) {
                                str9 = context.getString(R.string.football_red_cards);
                                break;
                            }
                            str9 = str;
                            break;
                        case 1627387275:
                            if (str.equals("Distance covered")) {
                                str9 = context.getString(R.string.football_running_distance_covered);
                                break;
                            }
                            str9 = str;
                            break;
                        case 1691292799:
                            if (str.equals("Big chances")) {
                                str9 = context.getString(R.string.football_big_chances);
                                break;
                            }
                            str9 = str;
                            break;
                        case 1695726050:
                            if (str.equals("Expected assists")) {
                                str9 = context.getString(R.string.football_expected_assists);
                                break;
                            }
                            str9 = str;
                            break;
                        case 1914007696:
                            if (str.equals("Tackles per game")) {
                                str9 = context.getString(R.string.football_tackles_per_game);
                                break;
                            }
                            str9 = str;
                            break;
                        case 1916495179:
                            if (str.equals("Hit woodwork")) {
                                str9 = context.getString(R.string.football_hit_woodwork);
                                break;
                            }
                            str9 = str;
                            break;
                        case 1992739047:
                            if (str.equals("Counter attacks")) {
                                str9 = context.getString(R.string.counter_attacks);
                                break;
                            }
                            str9 = str;
                            break;
                        case 2040310097:
                            if (str.equals("Duels won")) {
                                str9 = context.getString(R.string.football_total_duels_won);
                                break;
                            }
                            str9 = str;
                            break;
                        case 2064910416:
                            if (str.equals("Accurate passes %")) {
                                str9 = dmi.y(context.getString(R.string.football_accurate_passes), " %");
                                break;
                            }
                            str9 = str;
                            break;
                        default:
                            str9 = str;
                            break;
                    }
                    str9.getClass();
                    return str9;
                }
                return str;
            case 727149765:
                if (str2.equals(Sports.BASKETBALL)) {
                    switch (str.hashCode()) {
                        case -2049299907:
                            if (str.equals("Biggest lead")) {
                                str10 = context.getString(R.string.biggest_lead);
                                break;
                            }
                            str10 = str;
                            break;
                        case -2011905198:
                            if (str.equals("Timeouts")) {
                                str10 = context.getString(R.string.timeouts);
                                break;
                            }
                            str10 = str;
                            break;
                        case -1808513756:
                            if (str.equals("Steals")) {
                                str10 = context.getString(R.string.steals);
                                break;
                            }
                            str10 = str;
                            break;
                        case -1447569889:
                            if (str.equals("Lead changes")) {
                                str10 = context.getString(R.string.lead_change);
                                break;
                            }
                            str10 = str;
                            break;
                        case -763119928:
                            if (str.equals("Rebounds")) {
                                str10 = context.getString(R.string.rebounds);
                                break;
                            }
                            str10 = str;
                            break;
                        case -737990229:
                            if (str.equals("Offensive rebounds")) {
                                str10 = context.getString(R.string.offensive_rebounds);
                                break;
                            }
                            str10 = str;
                            break;
                        case 68069171:
                            if (str.equals("Fouls")) {
                                str10 = context.getString(R.string.football_fouls);
                                break;
                            }
                            str10 = str;
                            break;
                        case 169169569:
                            if (str.equals("Max points in a row")) {
                                str10 = context.getString(R.string.max_points_in_a_row);
                                break;
                            }
                            str10 = str;
                            break;
                        case 286561365:
                            if (str.equals("Defensive rebounds")) {
                                str10 = context.getString(R.string.defensive_rebounds);
                                break;
                            }
                            str10 = str;
                            break;
                        case 554736890:
                            if (str.equals("Field goals")) {
                                str10 = context.getString(R.string.field_goals);
                                break;
                            }
                            str10 = str;
                            break;
                        case 596515026:
                            if (str.equals("Time spent in lead")) {
                                str10 = context.getString(R.string.time_spent_in_lead);
                                break;
                            }
                            str10 = str;
                            break;
                        case 932513332:
                            if (str.equals("Rebounds (off/def)")) {
                                str10 = context.getString(R.string.rebounds_off_def);
                                break;
                            }
                            str10 = str;
                            break;
                        case 959996682:
                            if (str.equals("Assists")) {
                                str10 = context.getString(R.string.basketball_assists);
                                break;
                            }
                            str10 = str;
                            break;
                        case 1133901652:
                            if (str.equals("Free throw attempts")) {
                                str10 = context.getString(R.string.basketball_free_throws_attempted);
                                break;
                            }
                            str10 = str;
                            break;
                        case 1324872483:
                            if (str.equals("3 pointers")) {
                                str10 = context.getString(R.string.three_pointers);
                                break;
                            }
                            str10 = str;
                            break;
                        case 1521385988:
                            if (str.equals("2 pointers")) {
                                str10 = context.getString(R.string.two_pointers);
                                break;
                            }
                            str10 = str;
                            break;
                        case 1656512097:
                            if (str.equals("Free throws")) {
                                str10 = context.getString(R.string.free_throws);
                                break;
                            }
                            str10 = str;
                            break;
                        case 1894564770:
                            if (str.equals("Turnovers")) {
                                str10 = context.getString(R.string.turnovers);
                                break;
                            }
                            str10 = str;
                            break;
                        case 1992669606:
                            if (str.equals("Blocks")) {
                                str10 = context.getString(R.string.blocks);
                                break;
                            }
                            str10 = str;
                            break;
                        default:
                            str10 = str;
                            break;
                    }
                    str10.getClass();
                    return str10;
                }
                return str;
            case 932645060:
                if (str2.equals(Sports.MINI_FOOTBALL)) {
                    String string = str.equals("Accumulated Fouls") ? context.getString(R.string.minifootball_accumulated_fouls) : str;
                    string.getClass();
                    return string;
                }
                return str;
            default:
                return str;
        }
    }

    public static final float E(h8g h8gVar) {
        return h8gVar != null ? h8gVar.a : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public static final t2g F(wi9 wi9Var) {
        int i = wi9Var.a;
        return i == 404 ? new r2g(wi9Var) : (500 > i || i >= 600) ? new q2g(wi9Var) : new s2g(wi9Var);
    }

    public static final boolean G(x2g x2gVar) {
        return x2gVar instanceof v2g;
    }

    public static void H(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    public static final Paint I(Bitmap bitmap, int i, int i2) {
        Matrix matrix = new Matrix();
        float r = (float) tol.r(bitmap.getWidth(), bitmap.getHeight(), i, i2, jrg.a, kjh.c);
        matrix.setTranslate(mz1.c(r, bitmap.getWidth(), i, 2.0f), mz1.c(r, bitmap.getHeight(), i2, 2.0f));
        matrix.preScale(r, r);
        Paint paint = new Paint(3);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        return paint;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, java.lang.Object[]] */
    public static final boolean J(ne8 ne8Var, x40 x40Var) {
        ne8[] ne8VarArr = new ne8[16];
        if (!ne8Var.a.n) {
            r3a.b("visitChildren called on an unattached node");
        }
        i1d i1dVar = new i1d(new wtc[16], 0);
        wtc wtcVar = ne8Var.a;
        wtc wtcVar2 = wtcVar.f;
        if (wtcVar2 == null) {
            c6o.x(i1dVar, wtcVar);
        } else {
            i1dVar.b(wtcVar2);
        }
        int i = 0;
        while (true) {
            int i2 = i1dVar.c;
            if (i2 == 0) {
                break;
            }
            wtc wtcVar3 = (wtc) i1dVar.r(i2 - 1);
            if ((wtcVar3.d & 1024) == 0) {
                c6o.x(i1dVar, wtcVar3);
            } else {
                while (true) {
                    if (wtcVar3 == null) {
                        break;
                    }
                    if ((wtcVar3.c & 1024) != 0) {
                        i1d i1dVar2 = null;
                        while (wtcVar3 != null) {
                            if (wtcVar3 instanceof ne8) {
                                ne8 ne8Var2 = (ne8) wtcVar3;
                                int i3 = i + 1;
                                if (ne8VarArr.length < i3) {
                                    int length = ne8VarArr.length;
                                    ?? r10 = new Object[Math.max(i3, length * 2)];
                                    System.arraycopy(ne8VarArr, 0, r10, 0, length);
                                    ne8VarArr = r10;
                                }
                                ne8VarArr[i] = ne8Var2;
                                i = i3;
                            } else if ((wtcVar3.c & 1024) != 0 && (wtcVar3 instanceof bw4)) {
                                int i4 = 0;
                                for (wtc wtcVar4 = ((bw4) wtcVar3).p; wtcVar4 != null; wtcVar4 = wtcVar4.f) {
                                    if ((wtcVar4.c & 1024) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            wtcVar3 = wtcVar4;
                                        } else {
                                            if (i1dVar2 == null) {
                                                i1dVar2 = new i1d(new wtc[16], 0);
                                            }
                                            if (wtcVar3 != null) {
                                                i1dVar2.b(wtcVar3);
                                                wtcVar3 = null;
                                            }
                                            i1dVar2.b(wtcVar4);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                            wtcVar3 = c6o.X(i1dVar2);
                        }
                    } else {
                        wtcVar3 = wtcVar3.f;
                    }
                }
            }
        }
        Arrays.sort(ne8VarArr, 0, i, qe8.b);
        int i5 = i - 1;
        if (i5 < ne8VarArr.length) {
            while (i5 >= 0) {
                ne8 ne8Var3 = ne8VarArr[i5];
                if (l98.Y(ne8Var3) && n(ne8Var3, x40Var)) {
                    return true;
                }
                i5--;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, java.lang.Object[]] */
    public static final boolean K(ne8 ne8Var, x40 x40Var) {
        ne8[] ne8VarArr = new ne8[16];
        if (!ne8Var.a.n) {
            r3a.b("visitChildren called on an unattached node");
        }
        i1d i1dVar = new i1d(new wtc[16], 0);
        wtc wtcVar = ne8Var.a;
        wtc wtcVar2 = wtcVar.f;
        if (wtcVar2 == null) {
            c6o.x(i1dVar, wtcVar);
        } else {
            i1dVar.b(wtcVar2);
        }
        int i = 0;
        while (true) {
            int i2 = i1dVar.c;
            if (i2 == 0) {
                break;
            }
            wtc wtcVar3 = (wtc) i1dVar.r(i2 - 1);
            if ((wtcVar3.d & 1024) == 0) {
                c6o.x(i1dVar, wtcVar3);
            } else {
                while (true) {
                    if (wtcVar3 == null) {
                        break;
                    }
                    if ((wtcVar3.c & 1024) != 0) {
                        i1d i1dVar2 = null;
                        while (wtcVar3 != null) {
                            if (wtcVar3 instanceof ne8) {
                                ne8 ne8Var2 = (ne8) wtcVar3;
                                int i3 = i + 1;
                                if (ne8VarArr.length < i3) {
                                    int length = ne8VarArr.length;
                                    ?? r10 = new Object[Math.max(i3, length * 2)];
                                    System.arraycopy(ne8VarArr, 0, r10, 0, length);
                                    ne8VarArr = r10;
                                }
                                ne8VarArr[i] = ne8Var2;
                                i = i3;
                            } else if ((wtcVar3.c & 1024) != 0 && (wtcVar3 instanceof bw4)) {
                                int i4 = 0;
                                for (wtc wtcVar4 = ((bw4) wtcVar3).p; wtcVar4 != null; wtcVar4 = wtcVar4.f) {
                                    if ((wtcVar4.c & 1024) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            wtcVar3 = wtcVar4;
                                        } else {
                                            if (i1dVar2 == null) {
                                                i1dVar2 = new i1d(new wtc[16], 0);
                                            }
                                            if (wtcVar3 != null) {
                                                i1dVar2.b(wtcVar3);
                                                wtcVar3 = null;
                                            }
                                            i1dVar2.b(wtcVar4);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                            wtcVar3 = c6o.X(i1dVar2);
                        }
                    } else {
                        wtcVar3 = wtcVar3.f;
                    }
                }
            }
        }
        Arrays.sort(ne8VarArr, 0, i, qe8.b);
        for (int i5 = 0; i5 < i; i5++) {
            ne8 ne8Var3 = ne8VarArr[i5];
            if (l98.Y(ne8Var3) && s(ne8Var3, x40Var)) {
                return true;
            }
        }
        return false;
    }

    public static final byte[] L(bwh bwhVar, int i) {
        long j = i;
        if (j >= 0) {
            return M(bwhVar, i);
        }
        ogj.h(vxd.m("byteCount (", j, ") < 0"));
        return null;
    }

    public static final byte[] M(bwh bwhVar, int i) {
        if (i == -1) {
            for (long j = 2147483647L; bwhVar.u().c < 2147483647L && bwhVar.request(j); j *= 2) {
            }
            if (bwhVar.u().c >= 2147483647L) {
                throw new IllegalStateException(("Can't create an array of size " + bwhVar.u().c).toString());
            }
            i = (int) bwhVar.u().c;
        } else {
            bwhVar.o(i);
        }
        byte[] bArr = new byte[i];
        w52 u = bwhVar.u();
        u.getClass();
        long j2 = i;
        ww9.v(j2, 0L, j2);
        int i2 = 0;
        while (i2 < i) {
            int e2 = u.e(i2, i, bArr);
            if (e2 == -1) {
                throw new EOFException(lnb.j(i, e2, "Source exhausted before reading ", " bytes. Only ", " bytes were read."));
            }
            i2 += e2;
        }
        return bArr;
    }

    public static final flb N(of3 of3Var) {
        av8 av8Var = (av8) of3Var;
        av8Var.e0(2024497114);
        av8Var.e0(-610207850);
        Object O = av8Var.O();
        if (O == nf3.a) {
            O = new flb();
            av8Var.n0(O);
        }
        flb flbVar = (flb) O;
        av8Var.s(false);
        av8Var.s(false);
        return flbVar;
    }

    public static void O(int i, Context context) {
        Pair[] pairArr = {wv8.t(context, "ACTION", "REMOVE_LEAGUE"), new Pair("LEAGUE_ID", Integer.valueOf(i))};
        hpo hpoVar = new hpo(18);
        for (int i2 = 0; i2 < 2; i2++) {
            Pair pair = pairArr[i2];
            hpoVar.B(pair.b, (String) pair.a);
        }
        md4 l = hpoVar.l();
        vxd.h(context).b("LeagueWorker-".concat(mha.o(l)), nf6.a, (ltd) vxd.g(LeagueWorker.class, l).a());
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object P(Function1 function1, rq3 rq3Var) {
        abd abdVar;
        int i;
        String message;
        try {
            if (rq3Var instanceof abd) {
                abdVar = (abd) rq3Var;
                int i2 = abdVar.s;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    abdVar.s = i2 - Integer.MIN_VALUE;
                    Object obj = abdVar.r;
                    Object obj2 = lu3.a;
                    i = abdVar.s;
                    if (i != 0) {
                        y6a.M(obj);
                        abdVar.s = 1;
                        obj = function1.invoke(abdVar);
                        if (obj == obj2) {
                            return obj2;
                        }
                    } else {
                        if (i != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                    }
                    return ((obj instanceof c2g) || ((c2g) obj).a.q) ? new v2g(obj) : F(new wi9((c2g) obj));
                }
            }
            if (i != 0) {
            }
            if (obj instanceof c2g) {
            }
        } catch (IOException e2) {
            return new q2g(e2);
        } catch (CancellationException e3) {
            throw e3;
        } catch (wi9 e4) {
            return F(e4);
        } catch (Throwable th) {
            s38.a().c(th);
            if (th instanceof rkc) {
                th.getMessage();
            } else if ((th instanceof IllegalArgumentException) && (message = th.getMessage()) != null && c.v(message, "Unable to create converter", false)) {
                th.getMessage();
            }
            return new q2g(th);
        }
        abdVar = new abd(rq3Var);
        Object obj3 = abdVar.r;
        Object obj22 = lu3.a;
        i = abdVar.s;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:133:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x019b A[EDGE_INSN: B:151:0x019b->B:132:0x019b BREAK  A[LOOP:5: B:91:0x012c->B:146:0x012c], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x012e  */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object, java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean Q(ne8 ne8Var, ne8 ne8Var2, int i, x40 x40Var) {
        wtc wtcVar;
        wma c0;
        c40 c40Var;
        if (ne8Var.p1() != ie8.b) {
            a70.r("This function should only be used within a parent that has focus.");
            return false;
        }
        ne8[] ne8VarArr = new ne8[16];
        if (!ne8Var.a.n) {
            r3a.b("visitChildren called on an unattached node");
        }
        i1d i1dVar = new i1d(new wtc[16], 0);
        wtc wtcVar2 = ne8Var.a;
        wtc wtcVar3 = wtcVar2.f;
        if (wtcVar3 == null) {
            c6o.x(i1dVar, wtcVar2);
        } else {
            i1dVar.b(wtcVar3);
        }
        int i2 = 0;
        while (true) {
            int i3 = i1dVar.c;
            wtcVar = null;
            if (i3 == 0) {
                break;
            }
            wtc wtcVar4 = (wtc) i1dVar.r(i3 - 1);
            if ((wtcVar4.d & 1024) == 0) {
                c6o.x(i1dVar, wtcVar4);
            } else {
                while (true) {
                    if (wtcVar4 == null) {
                        break;
                    }
                    if ((wtcVar4.c & 1024) != 0) {
                        i1d i1dVar2 = null;
                        while (wtcVar4 != null) {
                            if (wtcVar4 instanceof ne8) {
                                ne8 ne8Var3 = (ne8) wtcVar4;
                                int i4 = i2 + 1;
                                if (ne8VarArr.length < i4) {
                                    int length = ne8VarArr.length;
                                    ?? r11 = new Object[Math.max(i4, length * 2)];
                                    System.arraycopy(ne8VarArr, 0, r11, 0, length);
                                    ne8VarArr = r11;
                                }
                                ne8VarArr[i2] = ne8Var3;
                                i2 = i4;
                            } else if ((wtcVar4.c & 1024) != 0 && (wtcVar4 instanceof bw4)) {
                                int i5 = 0;
                                for (wtc wtcVar5 = ((bw4) wtcVar4).p; wtcVar5 != null; wtcVar5 = wtcVar5.f) {
                                    if ((wtcVar5.c & 1024) != 0) {
                                        i5++;
                                        if (i5 == 1) {
                                            wtcVar4 = wtcVar5;
                                        } else {
                                            if (i1dVar2 == null) {
                                                i1dVar2 = new i1d(new wtc[16], 0);
                                            }
                                            if (wtcVar4 != null) {
                                                i1dVar2.b(wtcVar4);
                                                wtcVar4 = null;
                                            }
                                            i1dVar2.b(wtcVar5);
                                        }
                                    }
                                }
                                if (i5 == 1) {
                                }
                            }
                            wtcVar4 = c6o.X(i1dVar2);
                        }
                    } else {
                        wtcVar4 = wtcVar4.f;
                    }
                }
            }
        }
        Arrays.sort(ne8VarArr, 0, i2, qe8.b);
        if (i != 1) {
            if (i != 2) {
                a70.r("This function should only be used for 1-D focus search");
                return false;
            }
            IntRange j = llf.j(0, i2);
            int i6 = j.a;
            int i7 = j.b;
            if (i6 <= i7) {
                boolean z = false;
                while (true) {
                    if (z) {
                        ne8 ne8Var4 = ne8VarArr[i7];
                        if (l98.Y(ne8Var4) && n(ne8Var4, x40Var)) {
                            break;
                        }
                    }
                    if (Intrinsics.c(ne8VarArr[i7], ne8Var2)) {
                        z = true;
                    }
                    if (i7 == i6) {
                        break;
                    }
                    i7--;
                }
                return true;
            }
            if (i != 1) {
                if (!ne8Var.a.n) {
                }
                wtc wtcVar6 = ne8Var.a.e;
                c0 = c6o.c0(ne8Var);
                loop5: while (true) {
                    if (c0 == null) {
                    }
                }
                if (wtcVar != null) {
                }
            }
            return false;
        }
        IntRange j2 = llf.j(0, i2);
        int i8 = j2.a;
        int i9 = j2.b;
        if (i8 <= i9) {
            boolean z2 = false;
            while (true) {
                if (z2) {
                    ne8 ne8Var5 = ne8VarArr[i8];
                    if (l98.Y(ne8Var5) && s(ne8Var5, x40Var)) {
                        break;
                    }
                }
                if (Intrinsics.c(ne8VarArr[i8], ne8Var2)) {
                    z2 = true;
                }
                if (i8 == i9) {
                    break;
                }
                i8++;
            }
            return true;
        }
        if (i != 1 && ne8Var.m1().a) {
            if (!ne8Var.a.n) {
                r3a.b("visitAncestors called on an unattached node");
            }
            wtc wtcVar62 = ne8Var.a.e;
            c0 = c6o.c0(ne8Var);
            loop5: while (true) {
                if (c0 == null) {
                    break;
                }
                if ((((wtc) c0.F.g).d & 1024) != 0) {
                    while (wtcVar62 != null) {
                        if ((wtcVar62.c & 1024) != 0) {
                            wtc wtcVar7 = wtcVar62;
                            i1d i1dVar3 = null;
                            while (wtcVar7 != null) {
                                if (wtcVar7 instanceof ne8) {
                                    wtcVar = wtcVar7;
                                    break loop5;
                                }
                                if ((wtcVar7.c & 1024) != 0 && (wtcVar7 instanceof bw4)) {
                                    int i10 = 0;
                                    for (wtc wtcVar8 = ((bw4) wtcVar7).p; wtcVar8 != null; wtcVar8 = wtcVar8.f) {
                                        if ((wtcVar8.c & 1024) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                wtcVar7 = wtcVar8;
                                            } else {
                                                if (i1dVar3 == null) {
                                                    i1dVar3 = new i1d(new wtc[16], 0);
                                                }
                                                if (wtcVar7 != null) {
                                                    i1dVar3.b(wtcVar7);
                                                    wtcVar7 = null;
                                                }
                                                i1dVar3.b(wtcVar8);
                                            }
                                        }
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                wtcVar7 = c6o.X(i1dVar3);
                            }
                        }
                        wtcVar62 = wtcVar62.e;
                    }
                }
                c0 = c0.v();
                wtcVar62 = (c0 == null || (c40Var = c0.F) == null) ? null : (hti) c40Var.f;
            }
            if (wtcVar != null) {
                return ((Boolean) x40Var.invoke(ne8Var)).booleanValue();
            }
        }
        return false;
    }

    public static void R(MediaFormat mediaFormat, List list) {
        for (int i = 0; i < list.size(); i++) {
            mediaFormat.setByteBuffer(ljg.j(i, "csd-"), ByteBuffer.wrap((byte[]) list.get(i)));
        }
    }

    public static cmn S(Context context, String str, String str2) {
        cmn cmnVar;
        try {
            cmnVar = (cmn) new fzo(context, str, str2).d.poll(5000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            cmnVar = null;
        }
        return cmnVar == null ? fzo.b() : cmnVar;
    }

    public static final void a(boolean z, gv9 gv9Var, int i, Function1 function1, Function0 function0, Function0 function02, of3 of3Var, int i2) {
        gv9Var.getClass();
        function1.getClass();
        function0.getClass();
        function02.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1117594849);
        int i3 = i2 | (av8Var.h(z) ? 4 : 2) | (av8Var.i(gv9Var) ? 32 : 16) | (av8Var.e(i) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.i(function0) ? 16384 : 8192) | (av8Var.i(function02) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE);
        if (av8Var.T(i3 & 1, (74899 & i3) != 74898)) {
            un0.a(bkh.d(l98.b0(utc.a, 8.0f), 1.0f), o7g.a(16.0f), rd0.t(lz.D(R.color.surface_1, av8Var), av8Var, 0), null, null, yqo.H(-1264612847, av8Var, new v17(z, function02, i, gv9Var, function1, function0)), av8Var, 196614, 24);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new ki4(z, gv9Var, i, function1, function0, function02, i2);
        }
    }

    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v30 */
    public static final void b(InvitedUser invitedUser, xtc xtcVar, of3 of3Var, int i) {
        av8 av8Var;
        String str;
        utc utcVar;
        ?? r4;
        av8 av8Var2;
        int i2;
        int i3;
        boolean z;
        String h;
        String obj;
        av8 av8Var3 = (av8) of3Var;
        av8Var3.f0(-1357958104);
        int i4 = (av8Var3.i(invitedUser) ? 4 : 2) | i | (av8Var3.g(xtcVar) ? 32 : 16);
        if (av8Var3.T(i4 & 1, (i4 & 19) != 18)) {
            xtc e2 = bkh.e(bkh.p(xtcVar, 44.0f), 40.0f);
            k1c c2 = e12.c(uxf.c, false);
            int hashCode = Long.hashCode(av8Var3.T);
            aee m = av8Var3.m();
            xtc C = fqj.C(av8Var3, e2);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var3.h0();
            if (av8Var3.S) {
                av8Var3.l(zg3Var);
            } else {
                av8Var3.q0();
            }
            f50 f50Var = hf3.g;
            waa.K(av8Var3, c2, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var3, m, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var3, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var3, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var3, C, f50Var3);
            utc utcVar2 = utc.a;
            xtc o = yso.o(n9e.q(bkh.e(bkh.p(utcVar2, 40.0f), 40.0f), lz.D(R.color.neutral_highlight, av8Var3), o7g.a(20.0f)), 1.0f, invitedUser.isProgressFinished() ? ljg.f(av8Var3, 1143146645, R.color.primary_default, av8Var3, false) : ljg.f(av8Var3, 1143147445, R.color.neutral_default, av8Var3, false), o7g.a(20.0f));
            k1c c3 = e12.c(uxf.g, false);
            int hashCode2 = Long.hashCode(av8Var3.T);
            aee m2 = av8Var3.m();
            xtc C2 = fqj.C(av8Var3, o);
            av8Var3.h0();
            if (av8Var3.S) {
                av8Var3.l(zg3Var);
            } else {
                av8Var3.q0();
            }
            waa.K(av8Var3, c3, f50Var);
            waa.K(av8Var3, m2, ff3Var);
            bf3.s(hashCode2, av8Var3, f50Var2, av8Var3, ryVar);
            waa.K(av8Var3, C2, f50Var3);
            String nickname = invitedUser.getNickname();
            if (nickname == null || (h = me4.h("[\\p{So}\\p{Sk}\\u200D\\u2600-\\u26FF\\u2700-\\u27BF\\uD83C-\\uDBFF\\uDC00-\\uDFFF]+", nickname, "")) == null || (obj = StringsKt.l0(h).toString()) == null) {
                str = null;
            } else {
                str = iii.H(2, obj).toUpperCase(Locale.ROOT);
                str.getClass();
            }
            String userAccountId = invitedUser.getUserAccountId();
            if (str != null) {
                av8Var3.d0(1588410319);
                yf8 yf8Var = xth.a;
                utcVar = utcVar2;
                udj.c(str, null, lz.D(R.color.n_lv_1, av8Var3), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), av8Var3, 0, 0, 131066);
                av8 av8Var4 = av8Var3;
                if (userAccountId != null) {
                    av8Var4.d0(1588642850);
                    xtc A = wnn.A(bkh.l(utcVar, 38.0f), o7g.a(20.0f));
                    ht9 ht9Var = new ht9((Context) av8Var4.k(nz.b));
                    ht9Var.c = pco.z(userAccountId);
                    wkn.k(uaa.w(ht9Var.a(), av8Var4, 30), null, A, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, av8Var4, 48, 120);
                    z = false;
                    av8Var4.s(false);
                } else {
                    z = false;
                    av8Var4.d0(1589125830);
                    av8Var4.s(false);
                }
                av8Var4.s(z);
                r4 = z;
                av8Var2 = av8Var4;
            } else {
                utcVar = utcVar2;
                av8Var3.d0(1589153079);
                kq9.b(s6a.N(R.drawable.ic_profile, 6, av8Var3), null, null, lz.D(R.color.neutral_default, av8Var3), av8Var3, 48, 4);
                av8 av8Var5 = av8Var3;
                r4 = 0;
                av8Var5.s(false);
                av8Var2 = av8Var5;
            }
            av8Var2.s(true);
            xtc a2 = n12.a.a(bkh.l(utcVar, 16.0f), uxf.k);
            if (invitedUser.isProgressFinished()) {
                i2 = 1143196981;
                i3 = R.color.primary_default;
            } else {
                i2 = 1143197776;
                i3 = R.color.on_color_primary;
            }
            wkn.k(haa.t(invitedUser.isProgressFinished() ? R.drawable.ic_done : R.drawable.ic_hour, r4, av8Var2), null, n9e.q(a2, ljg.f(av8Var2, i2, i3, av8Var2, r4), o7g.a(20.0f)), null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, av8Var2, 56, 120);
            av8Var2.s(true);
            av8Var = av8Var2;
        } else {
            av8Var3.W();
            av8Var = av8Var3;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new op9(invitedUser, xtcVar, i, 5);
        }
    }

    public static final void c(Gender gender, Function0 function0, of3 of3Var, int i) {
        av8 av8Var;
        String Q;
        Function0 function02 = function0;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(1540515209);
        int i2 = i | (av8Var2.e(gender == null ? -1 : gender.ordinal()) ? 4 : 2) | (av8Var2.i(function02) ? 32 : 16);
        if (av8Var2.T(i2 & 1, (i2 & 19) != 18)) {
            long D = lz.D(R.color.surface_P, av8Var2);
            jf9 jf9Var = oyn.e;
            utc utcVar = utc.a;
            xtc q = n9e.q(utcVar, D, jf9Var);
            p4h p4hVar = ww9.d;
            kv1 kv1Var = uxf.o;
            u23 a2 = t23.a(p4hVar, kv1Var, av8Var2, 0);
            int hashCode = Long.hashCode(av8Var2.T);
            aee m = av8Var2.m();
            xtc C = fqj.C(av8Var2, q);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            f50 f50Var = hf3.g;
            waa.K(av8Var2, a2, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var2, m, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var2, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var2, ryVar);
            f50 f50Var3 = hf3.d;
            xtc d0 = l98.d0(hkg.u0(ljg.g(av8Var2, C, f50Var3, 1.0f, false), hkg.o0(av8Var2), false, 14), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            u23 a3 = t23.a(p4hVar, kv1Var, av8Var2, 0);
            int hashCode2 = Long.hashCode(av8Var2.T);
            aee m2 = av8Var2.m();
            xtc C2 = fqj.C(av8Var2, d0);
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, a3, f50Var);
            waa.K(av8Var2, m2, ff3Var);
            bf3.s(hashCode2, av8Var2, f50Var2, av8Var2, ryVar);
            waa.K(av8Var2, C2, f50Var3);
            wkn.k(haa.t(R.drawable.pots_info_trophies_basketball, 0, av8Var2), null, ljg.h(8.0f, l98.f0(new we9(uxf.p), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 5), lz.D(R.color.surface_2, av8Var2), 16.0f), null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, av8Var2, 56, 120);
            Q = hkg.Q((Context) av8Var2.k(nz.b), R.string.player_of_the_season_award_part_1, gender, new Object[0]);
            yf8 yf8Var = xth.a;
            udj.c(Q, l98.f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), lz.D(R.color.n_lv_1, av8Var2), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.f(), av8Var2, 48, 0, 131064);
            udj.c(oea.v(R.string.player_of_the_season_award_part_2, av8Var2), l98.d0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 1), lz.D(R.color.n_lv_1, av8Var2), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.f(), av8Var2, 48, 0, 131064);
            av8Var2.s(true);
            function02 = function0;
            mha.h(oea.v(R.string.learn_more_button, av8Var2), function02, bkh.d(l98.b0(utcVar, 16.0f), 1.0f), kqh.a, null, false, false, false, 0L, 0, 0, av8Var2, (i2 & 112) | 3456, 0, 2032);
            av8Var = av8Var2;
            av8Var.s(true);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new gme(gender, function02, i, 7);
        }
    }

    public static final void e(ri5 ri5Var, xtc xtcVar, of3 of3Var, int i) {
        ri5Var.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1669449817);
        int i2 = (av8Var.g(ri5Var) ? 4 : 2) | i | (av8Var.g(xtcVar) ? 32 : 16);
        if (av8Var.T(i2 & 1, (i2 & 19) != 18)) {
            l8g a2 = k8g.a(new ng0(8.0f, true, new a70(6)), uxf.m, av8Var, 54);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
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
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            int i3 = ri5Var.a;
            utc utcVar = utc.a;
            td4.y(i3, 48, 12, av8Var, bkh.l(utcVar, 24.0f), null, false);
            yf8 yf8Var = xth.a;
            dfj e2 = xth.e();
            long D = lz.D(R.color.n_lv_1, av8Var);
            String str = ri5Var.b;
            if (str == null) {
                str = "";
            }
            udj.c(str, new goa(1.0f, true), D, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, e2, av8Var, 0, 0, 131064);
            kq9.b(s6a.N(R.drawable.ic_chevron_right, 6, av8Var), null, bkh.l(utcVar, 24.0f), lz.D(R.color.primary_default, av8Var), av8Var, 432, 0);
            av8Var = av8Var;
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new gme(ri5Var, xtcVar, i, 15);
        }
    }

    public static final long f(float f2, float f3) {
        return (Float.floatToRawIntBits(f3) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32);
    }

    public static final void g(final m6j m6jVar, Function1 function1, xtc xtcVar, of3 of3Var, int i) {
        int i2;
        av8 av8Var;
        int i3;
        function1.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-1485363149);
        if ((i & 6) == 0) {
            i2 = (av8Var2.i(m6jVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var2.i(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= av8Var2.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        final int i4 = 0;
        final int i5 = 1;
        if (av8Var2.T(i2 & 1, (i2 & 147) != 146)) {
            int i6 = m6jVar.g;
            x43 x43Var = m6jVar.o;
            String str = m6jVar.h;
            String str2 = m6jVar.i;
            boolean z = m6jVar.e;
            tc3 H = yqo.H(990932045, av8Var2, new ct8() { // from class: h6j
                @Override // defpackage.ct8
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    String valueOf;
                    String valueOf2;
                    int i7 = i4;
                    m6j m6jVar2 = m6jVar;
                    switch (i7) {
                        case 0:
                            of3 of3Var2 = (of3) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            ((m12) obj).getClass();
                            av8 av8Var3 = (av8) of3Var2;
                            if (av8Var3.T(intValue & 1, (intValue & 17) != 16)) {
                                String str3 = m6jVar2.k;
                                bx7 bx7Var = m6jVar2.l;
                                l98.r(str3, bx7Var.c, bx7Var.b, bx7Var.d, av8Var3, 0);
                            } else {
                                av8Var3.W();
                            }
                            break;
                        default:
                            of3 of3Var3 = (of3) obj2;
                            int intValue2 = ((Integer) obj3).intValue();
                            ((v23) obj).getClass();
                            av8 av8Var4 = (av8) of3Var3;
                            if (av8Var4.T(intValue2 & 1, (intValue2 & 17) != 16)) {
                                bx7 bx7Var2 = m6jVar2.l;
                                fy7 fy7Var = bx7Var2.g;
                                fy7 fy7Var2 = bx7Var2.h;
                                if (fy7Var != null && fy7Var2 != null) {
                                    xtc f0 = l98.f0(utc.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
                                    Integer num = bx7Var2.m;
                                    String str4 = (num == null || (valueOf2 = String.valueOf(num.intValue())) == null) ? "" : valueOf2;
                                    Integer num2 = bx7Var2.q;
                                    int intValue3 = num2 != null ? num2.intValue() : 0;
                                    Integer num3 = bx7Var2.n;
                                    String str5 = (num3 == null || (valueOf = String.valueOf(num3.intValue())) == null) ? "" : valueOf;
                                    String str6 = bx7Var2.k;
                                    String str7 = str6 == null ? "" : str6;
                                    String str8 = m6jVar2.k;
                                    boolean z2 = bx7Var2.r;
                                    fy7 fy7Var3 = bx7Var2.g;
                                    l98.k(fy7Var, fy7Var2, str4, str5, intValue3, str7, fy7Var3 != null ? fy7Var3.h : null, fy7Var2 != null ? fy7Var2.h : null, z2, str8, f0, bx7Var2.s, null, null, 0L, 0L, av8Var4, 0, 6, 61440);
                                }
                            } else {
                                av8Var4.W();
                            }
                            break;
                    }
                    return Unit.a;
                }
            });
            tc3 H2 = yqo.H(-1968411565, av8Var2, new ct8() { // from class: h6j
                @Override // defpackage.ct8
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    String valueOf;
                    String valueOf2;
                    int i7 = i5;
                    m6j m6jVar2 = m6jVar;
                    switch (i7) {
                        case 0:
                            of3 of3Var2 = (of3) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            ((m12) obj).getClass();
                            av8 av8Var3 = (av8) of3Var2;
                            if (av8Var3.T(intValue & 1, (intValue & 17) != 16)) {
                                String str3 = m6jVar2.k;
                                bx7 bx7Var = m6jVar2.l;
                                l98.r(str3, bx7Var.c, bx7Var.b, bx7Var.d, av8Var3, 0);
                            } else {
                                av8Var3.W();
                            }
                            break;
                        default:
                            of3 of3Var3 = (of3) obj2;
                            int intValue2 = ((Integer) obj3).intValue();
                            ((v23) obj).getClass();
                            av8 av8Var4 = (av8) of3Var3;
                            if (av8Var4.T(intValue2 & 1, (intValue2 & 17) != 16)) {
                                bx7 bx7Var2 = m6jVar2.l;
                                fy7 fy7Var = bx7Var2.g;
                                fy7 fy7Var2 = bx7Var2.h;
                                if (fy7Var != null && fy7Var2 != null) {
                                    xtc f0 = l98.f0(utc.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
                                    Integer num = bx7Var2.m;
                                    String str4 = (num == null || (valueOf2 = String.valueOf(num.intValue())) == null) ? "" : valueOf2;
                                    Integer num2 = bx7Var2.q;
                                    int intValue3 = num2 != null ? num2.intValue() : 0;
                                    Integer num3 = bx7Var2.n;
                                    String str5 = (num3 == null || (valueOf = String.valueOf(num3.intValue())) == null) ? "" : valueOf;
                                    String str6 = bx7Var2.k;
                                    String str7 = str6 == null ? "" : str6;
                                    String str8 = m6jVar2.k;
                                    boolean z2 = bx7Var2.r;
                                    fy7 fy7Var3 = bx7Var2.g;
                                    l98.k(fy7Var, fy7Var2, str4, str5, intValue3, str7, fy7Var3 != null ? fy7Var3.h : null, fy7Var2 != null ? fy7Var2.h : null, z2, str8, f0, bx7Var2.s, null, null, 0L, 0L, av8Var4, 0, 6, 61440);
                                }
                            } else {
                                av8Var4.W();
                            }
                            break;
                    }
                    return Unit.a;
                }
            });
            tc3 H3 = yqo.H(1495902097, av8Var2, new i6j(i4, m6jVar, function1));
            int i7 = i2 & 112;
            boolean i8 = (i7 == 32) | av8Var2.i(m6jVar);
            Object O = av8Var2.O();
            a99 a99Var = nf3.a;
            if (i8 || O == a99Var) {
                i3 = 0;
                O = new j6j(i3, m6jVar, function1);
                av8Var2.n0(O);
            } else {
                i3 = 0;
            }
            Function0 function0 = (Function0) O;
            if (i7 == 32) {
                i3 = 1;
            }
            int i9 = i3 | (av8Var2.i(m6jVar) ? 1 : 0);
            Object O2 = av8Var2.O();
            if (i9 != 0 || O2 == a99Var) {
                O2 = new j6j(1, m6jVar, function1);
                av8Var2.n0(O2);
            }
            av8Var = av8Var2;
            pco.a(i6, x43Var, xtcVar, H, H2, null, H3, null, str, str2, false, z, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, function1, function0, (Function0) O2, av8Var, (i2 & 896) | 1600512, ((i2 << 15) & 3670016) | 24576, 46240);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new k6j(m6jVar, function1, xtcVar, i, 0);
        }
    }

    public static final void h(cqk cqkVar, Function1 function1, xtc xtcVar, of3 of3Var, int i) {
        int i2;
        av8 av8Var;
        tc3 tc3Var;
        int i3;
        function1.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(404082524);
        int i4 = 2;
        if ((i & 6) == 0) {
            i2 = (av8Var2.i(cqkVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i5 = 16;
        if ((i & 48) == 0) {
            i2 |= av8Var2.i(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= av8Var2.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if (av8Var2.T(i2 & 1, (i2 & 147) != 146)) {
            int i6 = cqkVar.g;
            x43 x43Var = cqkVar.o;
            String str = cqkVar.l;
            String str2 = cqkVar.m;
            boolean z = cqkVar.e;
            tc3 H = yqo.H(-769750910, av8Var2, new w39(cqkVar, i4));
            tc3 H2 = yqo.H(196816700, av8Var2, new w39(cqkVar, 3));
            tc3 H3 = yqo.H(1354348990, av8Var2, new e6i(i5, function1, cqkVar));
            int i7 = i2 & 112;
            boolean i8 = (i7 == 32) | av8Var2.i(cqkVar);
            Object O = av8Var2.O();
            a99 a99Var = nf3.a;
            if (i8 || O == a99Var) {
                tc3Var = H;
                i3 = 0;
                O = new bqk(function1, cqkVar, i3);
                av8Var2.n0(O);
            } else {
                tc3Var = H;
                i3 = 0;
            }
            Function0 function0 = (Function0) O;
            if (i7 == 32) {
                i3 = 1;
            }
            int i9 = i3 | (av8Var2.i(cqkVar) ? 1 : 0);
            Object O2 = av8Var2.O();
            if (i9 != 0 || O2 == a99Var) {
                O2 = new bqk(function1, cqkVar, 1);
                av8Var2.n0(O2);
            }
            av8Var = av8Var2;
            pco.a(i6, x43Var, xtcVar, tc3Var, H2, null, H3, null, str, str2, true, z, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, function1, function0, (Function0) O2, av8Var, (i2 & 896) | 1600512, ((i2 << 15) & 3670016) | 6, 61600);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new opg(cqkVar, function1, xtcVar, i, 17);
        }
    }

    public static final void i(final int i, final boolean z, final Bitmap bitmap, final Bitmap bitmap2, final Bitmap bitmap3, final Bitmap bitmap4, final boolean z2, final Integer num, final jfj jfjVar, final jfj jfjVar2, final String str, final int i2, final jfj jfjVar3, final jfj jfjVar4, final boolean z3, final jfj jfjVar5, final jfj jfjVar6, final jfj jfjVar7, final jfj jfjVar8, final int i3, of3 of3Var, final int i4, final int i5) {
        int i6;
        av8 av8Var;
        str.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(1603514682);
        int i7 = i4 | (av8Var2.e(i) ? 4 : 2) | (av8Var2.h(z) ? 32 : 16) | (av8Var2.i(bitmap) ? 256 : 128);
        boolean i8 = av8Var2.i(bitmap2);
        int i9 = a.o;
        int i10 = i7 | (i8 ? 2048 : 1024) | (av8Var2.i(bitmap3) ? 16384 : 8192);
        boolean i11 = av8Var2.i(bitmap4);
        int i12 = C.DEFAULT_BUFFER_SEGMENT_SIZE;
        int i13 = i10 | (i11 ? 131072 : 65536) | (av8Var2.h(z2) ? 1048576 : 524288) | (av8Var2.g(num) ? 8388608 : 4194304) | (av8Var2.g(jfjVar) ? 67108864 : 33554432) | (av8Var2.g(jfjVar2) ? 536870912 : 268435456);
        int i14 = (av8Var2.g(str) ? 4 : 2) | (av8Var2.e(i2) ? 32 : 16) | (av8Var2.g(jfjVar3) ? 256 : 128);
        if (!av8Var2.g(jfjVar4)) {
            i9 = 1024;
        }
        int i15 = i14 | i9 | (av8Var2.h(z3) ? 16384 : 8192);
        if (av8Var2.g(jfjVar5)) {
            i12 = 131072;
        }
        int i16 = i15 | i12 | (av8Var2.g(jfjVar6) ? 1048576 : 524288) | (av8Var2.g(jfjVar7) ? 8388608 : 4194304) | (av8Var2.g(jfjVar8) ? 67108864 : 33554432) | (av8Var2.e(i3) ? 536870912 : 268435456);
        int i17 = i5 & 6;
        ty8 ty8Var = ty8.a;
        if (i17 == 0) {
            i6 = i5 | (av8Var2.g(ty8Var) ? 4 : 2);
        } else {
            i6 = i5;
        }
        if (av8Var2.T(i13 & 1, ((i13 & 306783379) == 306783378 && (i16 & 306783379) == 306783378 && (i6 & 3) == 2) ? false : true)) {
            final int i18 = 0;
            final boolean z4 = str.equals(StatusKt.STATUS_IN_PROGRESS) || str.equals(StatusKt.STATUS_FINISHED) || str.equals(StatusKt.STATUS_INTERRUPTED) || i2 == 92;
            final int i19 = 1;
            av8Var = av8Var2;
            z9.a(i, i3, ty8Var, yqo.H(-633706889, av8Var2, new Function2() { // from class: w6l
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i20 = i18;
                    of3 of3Var2 = (of3) obj;
                    int intValue = ((Integer) obj2).intValue();
                    switch (i20) {
                        case 0:
                            av8 av8Var3 = (av8) of3Var2;
                            if (av8Var3.T(intValue & 1, (intValue & 3) != 2)) {
                                z9.b(z, true, bitmap, bitmap2, z2, false, num, jfjVar, null, av8Var3, 196656);
                            } else {
                                av8Var3.W();
                            }
                            break;
                        default:
                            av8 av8Var4 = (av8) of3Var2;
                            if (av8Var4.T(intValue & 1, (intValue & 3) != 2)) {
                                z9.b(z, false, bitmap, bitmap2, z2, false, num, jfjVar, null, av8Var4, 196656);
                            } else {
                                av8Var4.W();
                            }
                            break;
                    }
                    return Unit.a;
                }
            }), yqo.H(829931128, av8Var2, new Function2() { // from class: x6l
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    of3 of3Var2 = (of3) obj;
                    int intValue = ((Integer) obj2).intValue();
                    av8 av8Var3 = (av8) of3Var2;
                    if (av8Var3.T(intValue & 1, (intValue & 3) != 2)) {
                        yaa.j(z4, str, jfjVar3, jfjVar4, z3, jfjVar5, jfjVar6, jfjVar7, jfjVar8, z2, null, av8Var3, 0);
                    } else {
                        av8Var3.W();
                    }
                    return Unit.a;
                }
            }), yqo.H(-2001398151, av8Var2, new Function2() { // from class: w6l
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i20 = i19;
                    of3 of3Var2 = (of3) obj;
                    int intValue = ((Integer) obj2).intValue();
                    switch (i20) {
                        case 0:
                            av8 av8Var3 = (av8) of3Var2;
                            if (av8Var3.T(intValue & 1, (intValue & 3) != 2)) {
                                z9.b(z, true, bitmap3, bitmap4, z2, false, num, jfjVar2, null, av8Var3, 196656);
                            } else {
                                av8Var3.W();
                            }
                            break;
                        default:
                            av8 av8Var4 = (av8) of3Var2;
                            if (av8Var4.T(intValue & 1, (intValue & 3) != 2)) {
                                z9.b(z, false, bitmap3, bitmap4, z2, false, num, jfjVar2, null, av8Var4, 196656);
                            } else {
                                av8Var4.W();
                            }
                            break;
                    }
                    return Unit.a;
                }
            }), av8Var, (i13 & 14) | 224256 | ((i16 >> 24) & 112) | ((i6 << 6) & 896));
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new Function2(i, z, bitmap, bitmap2, bitmap3, bitmap4, z2, num, jfjVar, jfjVar2, str, i2, jfjVar3, jfjVar4, z3, jfjVar5, jfjVar6, jfjVar7, jfjVar8, i3, i4, i5) { // from class: y6l
                public final /* synthetic */ int a;
                public final /* synthetic */ boolean b;
                public final /* synthetic */ Bitmap c;
                public final /* synthetic */ Bitmap d;
                public final /* synthetic */ Bitmap e;
                public final /* synthetic */ Bitmap f;
                public final /* synthetic */ boolean g;
                public final /* synthetic */ Integer h;
                public final /* synthetic */ jfj i;
                public final /* synthetic */ jfj j;
                public final /* synthetic */ String k;
                public final /* synthetic */ int l;
                public final /* synthetic */ jfj m;
                public final /* synthetic */ jfj n;
                public final /* synthetic */ boolean o;
                public final /* synthetic */ jfj p;
                public final /* synthetic */ jfj q;
                public final /* synthetic */ jfj r;
                public final /* synthetic */ jfj s;
                public final /* synthetic */ int t;
                public final /* synthetic */ int u;

                {
                    this.u = i5;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int K = aba.K(1);
                    int K2 = aba.K(this.u);
                    yaa.i(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, (of3) obj, K, K2);
                    return Unit.a;
                }
            };
        }
    }

    public static final void j(final boolean z, final String str, final jfj jfjVar, final jfj jfjVar2, final boolean z2, final jfj jfjVar3, final jfj jfjVar4, final jfj jfjVar5, final jfj jfjVar6, final boolean z3, vy8 vy8Var, of3 of3Var, final int i) {
        final vy8 vy8Var2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(682280723);
        int i2 = i | (av8Var.h(z) ? 4 : 2) | (av8Var.g(str) ? 32 : 16) | (av8Var.g(jfjVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.g(jfjVar2) ? a.o : 1024) | (av8Var.h(z2) ? 16384 : 8192) | (av8Var.g(jfjVar3) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE) | (av8Var.g(jfjVar4) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (av8Var.g(jfjVar5) ? 8388608 : 4194304) | (av8Var.g(jfjVar6) ? 67108864 : 33554432) | (av8Var.h(z3) ? 536870912 : 268435456);
        if (av8Var.T(i2 & 1, (306783379 & i2) != 306783378)) {
            float f2 = z3 ? 32.0f : 16.0f;
            ty8 ty8Var = ty8.a;
            rd0.b(h5a.O(nq8.A(ty8Var), f2, 2), 1, 1, yqo.H(843244125, av8Var, new bsd(z, str, jfjVar2, jfjVar3, jfjVar5, jfjVar4, jfjVar6, jfjVar, z2)), av8Var, 3072, 0);
            vy8Var2 = ty8Var;
        } else {
            av8Var.W();
            vy8Var2 = vy8Var;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new Function2(z, str, jfjVar, jfjVar2, z2, jfjVar3, jfjVar4, jfjVar5, jfjVar6, z3, vy8Var2, i) { // from class: z6l
                public final /* synthetic */ boolean a;
                public final /* synthetic */ String b;
                public final /* synthetic */ jfj c;
                public final /* synthetic */ jfj d;
                public final /* synthetic */ boolean e;
                public final /* synthetic */ jfj f;
                public final /* synthetic */ jfj g;
                public final /* synthetic */ jfj h;
                public final /* synthetic */ jfj i;
                public final /* synthetic */ boolean j;
                public final /* synthetic */ vy8 k;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int K = aba.K(1);
                    yaa.j(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, (of3) obj, K);
                    return Unit.a;
                }
            };
        }
    }

    public static void k(int i, boolean z, Context context) {
        Pair[] pairArr = {wv8.t(context, "ACTION", "ADD_LEAGUE"), new Pair("LEAGUE_ID", Integer.valueOf(i)), new Pair("NOTIFICATIONS_ENABLED", Boolean.valueOf(z))};
        hpo hpoVar = new hpo(18);
        for (int i2 = 0; i2 < 3; i2++) {
            Pair pair = pairArr[i2];
            hpoVar.B(pair.b, (String) pair.a);
        }
        md4 l = hpoVar.l();
        vxd.h(context).b("LeagueWorker-".concat(mha.o(l)), nf6.a, (ltd) vxd.g(LeagueWorker.class, l).a());
    }

    public static void l(mlh mlhVar, List list, fqf fqfVar) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            int c2 = mlhVar.c((vu8) list.get(i));
            int O = mlhVar.O(mlhVar.q(c2), mlhVar.b);
            Object obj = O < mlhVar.f(mlhVar.q(c2 + 1), mlhVar.b) ? mlhVar.c[mlhVar.g(O)] : nf3.a;
            eqf eqfVar = obj instanceof eqf ? (eqf) obj : null;
            if (eqfVar != null) {
                eqfVar.a = fqfVar;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0076 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean n(ne8 ne8Var, x40 x40Var) {
        int ordinal = ne8Var.p1().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                ne8 V = l98.V(ne8Var);
                if (V == null) {
                    a70.r("ActiveParent must have a focusedChild");
                    return false;
                }
                int ordinal2 = V.p1().ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 != 1) {
                        if (ordinal2 != 2) {
                            if (ordinal2 != 3) {
                                zzl.b();
                                return false;
                            }
                            a70.r("ActiveParent must have a focusedChild");
                            return false;
                        }
                    } else if (n(V, x40Var) || t(ne8Var, V, 2, x40Var) || (V.m1().a && ((Boolean) x40Var.invoke(V)).booleanValue())) {
                        return true;
                    }
                }
                return t(ne8Var, V, 2, x40Var);
            }
            if (ordinal != 2) {
                if (ordinal != 3) {
                    zzl.b();
                    return false;
                }
                if (!J(ne8Var, x40Var)) {
                    if (!(ne8Var.m1().a ? ((Boolean) x40Var.invoke(ne8Var)).booleanValue() : false)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return J(ne8Var, x40Var);
    }

    public static final List o(uqa uqaVar, bra braVar, cqa cqaVar) {
        IntRange intRange;
        i1d i1dVar = (i1d) cqaVar.a;
        if (!(i1dVar.c != 0) && braVar.a.isEmpty()) {
            return km5.a;
        }
        ArrayList arrayList = new ArrayList();
        if (((i1d) cqaVar.a).c != 0) {
            int i = i1dVar.c;
            if (i == 0) {
                ogj.m("MutableVector is empty.");
                return null;
            }
            Object[] objArr = i1dVar.a;
            int i2 = ((bqa) objArr[0]).a;
            for (int i3 = 0; i3 < i; i3++) {
                int i4 = ((bqa) objArr[i3]).a;
                if (i4 < i2) {
                    i2 = i4;
                }
            }
            if (i2 < 0) {
                u3a.a("negative minIndex");
            }
            int i5 = i1dVar.c;
            if (i5 == 0) {
                ogj.m("MutableVector is empty.");
                return null;
            }
            Object[] objArr2 = i1dVar.a;
            int i6 = ((bqa) objArr2[0]).b;
            for (int i7 = 0; i7 < i5; i7++) {
                int i8 = ((bqa) objArr2[i7]).b;
                if (i8 > i6) {
                    i6 = i8;
                }
            }
            intRange = new IntRange(i2, Math.min(i6, uqaVar.getItemCount() - 1), 1);
        } else {
            IntRange.e.getClass();
            intRange = IntRange.f;
        }
        int size = braVar.a.size();
        for (int i9 = 0; i9 < size; i9++) {
            ara araVar = (ara) braVar.get(i9);
            int C = nq8.C(araVar.c, uqaVar, araVar.a);
            int i10 = intRange.a;
            if ((C > intRange.b || i10 > C) && C >= 0 && C < uqaVar.getItemCount()) {
                arrayList.add(Integer.valueOf(C));
            }
        }
        int i11 = intRange.a;
        int i12 = intRange.b;
        if (i11 <= i12) {
            while (true) {
                arrayList.add(Integer.valueOf(i11));
                if (i11 == i12) {
                    break;
                }
                i11++;
            }
        }
        return arrayList;
    }

    public static av4 p(ku3 ku3Var, boolean z, Function2 function2) {
        g gVar = g.a;
        nu3 nu3Var = nu3.a;
        ku3Var.getClass();
        gVar.getClass();
        if (!z) {
            return null;
        }
        CoroutineContext b2 = yt3.b(ku3Var, gVar);
        nu3 nu3Var2 = nu3.a;
        av4 av4Var = new av4(b2, true);
        av4Var.l0(nu3Var, av4Var, function2);
        return av4Var;
    }

    public static void q(int i, Context context) {
        Pair[] pairArr = {wv8.t(context, "ACTION", "DISABLE_NOTIFICATIONS"), new Pair("LEAGUE_ID", Integer.valueOf(i))};
        hpo hpoVar = new hpo(18);
        for (int i2 = 0; i2 < 2; i2++) {
            Pair pair = pairArr[i2];
            hpoVar.B(pair.b, (String) pair.a);
        }
        md4 l = hpoVar.l();
        vxd.h(context).b("LeagueWorker-".concat(mha.o(l)), nf6.a, (ltd) vxd.g(LeagueWorker.class, l).a());
    }

    public static void r(int i, Context context) {
        Pair[] pairArr = {wv8.t(context, "ACTION", "ENABLE_NOTIFICATIONS"), new Pair("LEAGUE_ID", Integer.valueOf(i))};
        hpo hpoVar = new hpo(18);
        for (int i2 = 0; i2 < 2; i2++) {
            Pair pair = pairArr[i2];
            hpoVar.B(pair.b, (String) pair.a);
        }
        md4 l = hpoVar.l();
        vxd.h(context).b("LeagueWorker-".concat(mha.o(l)), nf6.a, (ltd) vxd.g(LeagueWorker.class, l).a());
    }

    public static final boolean s(ne8 ne8Var, x40 x40Var) {
        int ordinal = ne8Var.p1().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                ne8 V = l98.V(ne8Var);
                if (V != null) {
                    return s(V, x40Var) || t(ne8Var, V, 1, x40Var);
                }
                a70.r("ActiveParent must have a focusedChild");
                return false;
            }
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return ne8Var.m1().a ? ((Boolean) x40Var.invoke(ne8Var)).booleanValue() : K(ne8Var, x40Var);
                }
                zzl.b();
                return false;
            }
        }
        return K(ne8Var, x40Var);
    }

    public static final boolean t(ne8 ne8Var, ne8 ne8Var2, int i, x40 x40Var) {
        if (Q(ne8Var, ne8Var2, i, x40Var)) {
            return true;
        }
        Boolean bool = (Boolean) wkn.M(ne8Var, i, new itd(((yd8) ((xy) c6o.d0(ne8Var)).getFocusOwner()).g(), ne8Var, ne8Var2, i, x40Var, 0));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final long u(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) / 2.0f;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) / 2.0f;
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    public static final long v() {
        Calendar calendar = ke0.a;
        return Instant.now().toEpochMilli();
    }

    public static final long w() {
        Calendar calendar = ke0.a;
        return Instant.now().getEpochSecond();
    }

    public static final Object x(x2g x2gVar) {
        x2gVar.getClass();
        if (x2gVar instanceof v2g) {
            return ((v2g) x2gVar).a;
        }
        return null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    public static String y(Context context, String str) {
        context.getClass();
        str.getClass();
        switch (str.hashCode()) {
            case -2125995793:
                if (str.equals("wonTackles")) {
                    str = context.getString(R.string.football_tackles_won);
                    break;
                }
                break;
            case -1990953464:
                if (str.equals("wasFouled")) {
                    str = context.getString(R.string.football_was_fouled);
                    break;
                }
                break;
            case -1486438997:
                if (str.equals("penaltyShootoutGoal")) {
                    str = context.getString(R.string.football_penalty_shootout_goals);
                    break;
                }
                break;
            case -1486265452:
                if (str.equals("penaltyShootoutMiss")) {
                    str = context.getString(R.string.football_penalty_shootout_misses);
                    break;
                }
                break;
            case -1486094315:
                if (str.equals("penaltyShootoutSave")) {
                    str = context.getString(R.string.football_penalty_shootout_save);
                    break;
                }
                break;
            case -1208408239:
                if (str.equals("punchesAndGoodHighClaims")) {
                    str = context.getString(R.string.punches_and_high_claims);
                    break;
                }
                break;
            case -1073869509:
                if (str.equals("totalClearances")) {
                    str = context.getString(R.string.football_clearances);
                    break;
                }
                break;
            case -995381121:
                if (str.equals("passes")) {
                    str = context.getString(R.string.passes);
                    break;
                }
                break;
            case -938102371:
                if (str.equals(CampaignEx.JSON_KEY_STAR)) {
                    str = context.getString(R.string.sofascore_rating);
                    break;
                }
                break;
            case -929343161:
                if (str.equals("clearanceOffLine")) {
                    str = context.getString(R.string.clearance_off_line);
                    break;
                }
                break;
            case -885692392:
                if (str.equals("attemptPenaltyMiss")) {
                    str = context.getString(R.string.football_penalties_missed);
                    break;
                }
                break;
            case -872062131:
                if (str.equals("penaltyWon")) {
                    str = context.getString(R.string.football_penalties_won);
                    break;
                }
                break;
            case -858768234:
                if (str.equals("cleanSheet")) {
                    str = context.getString(R.string.clean_sheet);
                    break;
                }
                break;
            case -815583472:
                if (str.equals("keyPass")) {
                    str = context.getString(R.string.key_passes);
                    break;
                }
                break;
            case -775726803:
                if (str.equals("interceptions")) {
                    str = context.getString(R.string.interceptions);
                    break;
                }
                break;
            case -765116270:
                if (str.equals("minutesPlayed")) {
                    str = context.getString(R.string.football_minutes_played);
                    break;
                }
                break;
            case -755880467:
                if (str.equals("offsides")) {
                    str = context.getString(R.string.football_offsides);
                    break;
                }
                break;
            case -704656598:
                if (str.equals("assists")) {
                    str = context.getString(R.string.football_assists);
                    break;
                }
                break;
            case -571672156:
                if (str.equals("yellowCard")) {
                    str = context.getString(R.string.yellow_card);
                    break;
                }
                break;
            case -546542072:
                if (str.equals("secondYellow")) {
                    str = context.getString(R.string.second_yellow_card);
                    break;
                }
                break;
            case -537185395:
                if (str.equals("penaltySaves")) {
                    str = context.getString(R.string.football_penalties_saved);
                    break;
                }
                break;
            case -31062483:
                if (str.equals("blockedShots")) {
                    str = context.getString(R.string.blocked_shots);
                    break;
                }
                break;
            case 95938171:
                if (str.equals("duels")) {
                    str = context.getString(R.string.duels);
                    break;
                }
                break;
            case 98526144:
                if (str.equals("goals")) {
                    str = context.getString(R.string.goals);
                    break;
                }
                break;
            case 100774200:
                if (str.equals("longBalls")) {
                    str = context.getString(R.string.football_long_balls);
                    break;
                }
                break;
            case 377539486:
                if (str.equals("wonContest")) {
                    str = context.getString(R.string.football_successful_dribbles);
                    break;
                }
                break;
            case 1082193729:
                if (str.equals("redCard")) {
                    str = context.getString(R.string.red_card);
                    break;
                }
                break;
            case 1086300611:
                if (str.equals("savedShotsFromOutsideTheBox")) {
                    str = context.getString(R.string.football_saves_from_outside_box);
                    break;
                }
                break;
            case 1111075839:
                if (str.equals("goalsConceded")) {
                    str = context.getString(R.string.football_goals_conceded);
                    break;
                }
                break;
            case 1177679575:
                if (str.equals("dispossessed")) {
                    str = context.getString(R.string.football_dispossessed);
                    break;
                }
                break;
            case 1246799816:
                if (str.equals("penaltyConceded")) {
                    str = context.getString(R.string.football_penalties_committed);
                    break;
                }
                break;
            case 1262319351:
                if (str.equals("Clearances")) {
                    str = context.getString(R.string.football_clearances);
                    break;
                }
                break;
            case 1550908134:
                if (str.equals("runsOut")) {
                    str = context.getString(R.string.football_runs_out_characteristic);
                    break;
                }
                break;
            case 1635354586:
                if (str.equals("ownGoals")) {
                    str = context.getString(R.string.own_goals);
                    break;
                }
                break;
            case 2141647378:
                if (str.equals("savedShotsFromInsideTheBox")) {
                    str = context.getString(R.string.football_saves_from_inside_box);
                    break;
                }
                break;
        }
        str.getClass();
        return str;
    }

    public static final String z(Throwable th) {
        Object u2gVar;
        ErrorResponse error;
        String string;
        th.getClass();
        wi9 wi9Var = th instanceof wi9 ? (wi9) th : null;
        if (wi9Var == null) {
            String message = th.getMessage();
            return message == null ? "Unknown error." : message;
        }
        c2g c2gVar = wi9Var.c;
        try {
            p2g p2gVar = w2g.b;
            i2g i2gVar = c2gVar.c;
            if (i2gVar == null || (string = i2gVar.string()) == null) {
                u2gVar = null;
            } else {
                bga bgaVar = vga.a;
                bgaVar.getClass();
                u2gVar = (NetworkResponse) bgaVar.b(NetworkResponse.INSTANCE.serializer(), string);
            }
        } catch (Throwable th2) {
            p2g p2gVar2 = w2g.b;
            u2gVar = new u2g(th2);
        }
        NetworkResponse networkResponse = (NetworkResponse) (u2gVar instanceof u2g ? null : u2gVar);
        if (networkResponse != null && (error = networkResponse.getError()) != null) {
            return "HTTP " + error.getCode() + ": " + error.getMessage();
        }
        d2g d2gVar = c2gVar.a;
        return "HTTP " + d2gVar.d + ": " + d2gVar.c;
    }

    public abstract void m(b0g b0gVar, Object obj);
}
