package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.DashPathEffect;
import android.icu.text.DateTimePatternGenerator;
import android.os.Bundle;
import android.text.format.DateFormat;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.AgeRestrictedTreatment;
import com.google.android.gms.ads.MobileAds;
import com.inmobi.compliance.InMobiPrivacyCompliance;
import com.ironsource.C4427z5;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.sofascore.model.FirebaseBundle;
import com.sofascore.model.fantasy.FantasyCompetition;
import com.sofascore.model.fantasy.FantasyCompetitionType;
import com.sofascore.model.fantasy.FantasyLeagueGameType;
import com.sofascore.model.fantasy.FantasyRound;
import com.sofascore.model.fantasy.FantasyUpcomingCompetition;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.nio.charset.Charset;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
import kotlin.text.Charsets;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class f5p {
    public static rfn a;
    public static final tc3 b = new tc3(-1278703047, new qs2(3), false);
    public static final tc3 c = new tc3(-151855871, new qd3(0), false);
    public static final tc3 d = new tc3(-1622891015, new pd3(27), false);
    public static final s58 e = new s58(0);
    public static final String[] f = {MimeTypes.AUDIO_MPEG_L1, MimeTypes.AUDIO_MPEG_L2, MimeTypes.AUDIO_MPEG};
    public static final int[] g = {44100, 48000, 32000};
    public static final int[] h = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};
    public static final int[] i = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};
    public static final int[] j = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};
    public static final int[] k = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};
    public static final int[] l = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};
    public static final y3g m = new y3g(9, new npg(1), new gfg(11));
    public static final /* synthetic */ int n = 0;
    public static final /* synthetic */ int o = 0;
    public static final /* synthetic */ int p = 0;
    public static final /* synthetic */ int q = 0;

    public static xh2 A(vh2 vh2Var) {
        uh2 uh2Var = new uh2();
        uh2Var.c = new b1g();
        xh2 xh2Var = new xh2(uh2Var);
        uh2Var.b = xh2Var;
        uh2Var.a = vh2Var.getClass();
        try {
            Object g2 = vh2Var.g(uh2Var);
            if (g2 == null) {
                return xh2Var;
            }
            uh2Var.a = g2;
            return xh2Var;
        } catch (Exception e2) {
            xh2Var.b(e2);
            return xh2Var;
        }
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
    public static String B(Context context, int i2, String str) {
        context.getClass();
        str.getClass();
        switch (str.hashCode()) {
            case -1876692277:
                if (str.equals("Semifinals 1st Leg")) {
                    String string = context.getString(R.string.semi_finals_1st_leg);
                    string.getClass();
                    return string;
                }
                break;
            case -1670738103:
                if (str.equals("Quarterfinals")) {
                    String string2 = context.getString(R.string.quarter_finals);
                    string2.getClass();
                    return string2;
                }
                break;
            case -1490122959:
                if (str.equals("3rd Place Match")) {
                    String string3 = context.getString(R.string.third_place_match);
                    string3.getClass();
                    return string3;
                }
                break;
            case -1147110687:
                if (str.equals("Semifinals 2nd Leg")) {
                    String string4 = context.getString(R.string.semi_finals_2nd_leg);
                    string4.getClass();
                    return string4;
                }
                break;
            case -626605802:
                if (str.equals("Round of 32 1st Leg")) {
                    String string5 = context.getString(R.string.round_of_32_1st_leg);
                    string5.getClass();
                    return string5;
                }
                break;
            case -369715236:
                if (str.equals("Round of 16")) {
                    String string6 = context.getString(R.string.round_of_16);
                    string6.getClass();
                    return string6;
                }
                break;
            case -369715178:
                if (str.equals("Round of 32")) {
                    String string7 = context.getString(R.string.round_of_32);
                    string7.getClass();
                    return string7;
                }
                break;
            case -214542167:
                if (str.equals("Playoff Round 1st Leg")) {
                    String string8 = context.getString(R.string.play_off_1st_leg);
                    string8.getClass();
                    return string8;
                }
                break;
            case -86649527:
                if (str.equals("Quarterfinals 1st Leg")) {
                    String string9 = context.getString(R.string.quarter_finals_1st_leg);
                    string9.getClass();
                    return string9;
                }
                break;
            case 67883350:
                if (str.equals("Final")) {
                    String string10 = context.getString(R.string.final_string);
                    string10.getClass();
                    return string10;
                }
                break;
            case 102975788:
                if (str.equals("Round of 32 2nd Leg")) {
                    String string11 = context.getString(R.string.round_of_32_2nd_leg);
                    string11.getClass();
                    return string11;
                }
                break;
            case 515039423:
                if (str.equals("Playoff Round 2nd Leg")) {
                    String string12 = context.getString(R.string.play_off_2nd_leg);
                    string12.getClass();
                    return string12;
                }
                break;
            case 642932063:
                if (str.equals("Quarterfinals 2nd Leg")) {
                    String string13 = context.getString(R.string.quarter_finals_2nd_leg);
                    string13.getClass();
                    return string13;
                }
                break;
            case 1126537948:
                if (str.equals("Round of 16 1st Leg")) {
                    String string14 = context.getString(R.string.round_of_16_1st_leg);
                    string14.getClass();
                    return string14;
                }
                break;
            case 1411862219:
                if (str.equals("Semifinals")) {
                    String string15 = context.getString(R.string.semi_finals);
                    string15.getClass();
                    return string15;
                }
                break;
            case 1856119538:
                if (str.equals("Round of 16 2nd Leg")) {
                    String string16 = context.getString(R.string.round_of_16_2nd_leg);
                    string16.getClass();
                    return string16;
                }
                break;
            case 2104383965:
                if (str.equals("Finals")) {
                    String string17 = context.getString(R.string.finals);
                    string17.getClass();
                    return string17;
                }
                break;
        }
        String string18 = context.getString(R.string.fantasy_round_number, Integer.valueOf(i2));
        string18.getClass();
        return string18;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009d, code lost:
    
        if (r3.equals("Final") == false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0015, code lost:
    
        if (r3.equals("Finals") == false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x00a1, code lost:
    
        r1 = r1.getString(com.sofascore.results.R.string.finals_short);
        r1.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x00ab, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String C(Context context, int i2, String str) {
        context.getClass();
        str.getClass();
        switch (str.hashCode()) {
            case -1876692277:
                if (str.equals("Semifinals 1st Leg")) {
                    String string = context.getString(R.string.semi_finals_1st_leg_short);
                    string.getClass();
                    return string;
                }
                String string2 = context.getString(R.string.fantasy_round_short_number, Integer.valueOf(i2));
                string2.getClass();
                return string2;
            case -1670738103:
                if (str.equals("Quarterfinals")) {
                    String string3 = context.getString(R.string.quarterfinals_short);
                    string3.getClass();
                    return string3;
                }
                String string22 = context.getString(R.string.fantasy_round_short_number, Integer.valueOf(i2));
                string22.getClass();
                return string22;
            case -1490122959:
                if (str.equals("3rd Place Match")) {
                    String string4 = context.getString(R.string.third_place_match_short);
                    string4.getClass();
                    return string4;
                }
                String string222 = context.getString(R.string.fantasy_round_short_number, Integer.valueOf(i2));
                string222.getClass();
                return string222;
            case -1147110687:
                if (str.equals("Semifinals 2nd Leg")) {
                    String string5 = context.getString(R.string.semi_finals_2nd_leg_short);
                    string5.getClass();
                    return string5;
                }
                String string2222 = context.getString(R.string.fantasy_round_short_number, Integer.valueOf(i2));
                string2222.getClass();
                return string2222;
            case -626605802:
                if (str.equals("Round of 32 1st Leg")) {
                    String string6 = context.getString(R.string.round_of_32_1st_leg_short);
                    string6.getClass();
                    return string6;
                }
                String string22222 = context.getString(R.string.fantasy_round_short_number, Integer.valueOf(i2));
                string22222.getClass();
                return string22222;
            case -369715236:
                if (str.equals("Round of 16")) {
                    String string7 = context.getString(R.string.round_of_16_short);
                    string7.getClass();
                    return string7;
                }
                String string222222 = context.getString(R.string.fantasy_round_short_number, Integer.valueOf(i2));
                string222222.getClass();
                return string222222;
            case -369715178:
                if (str.equals("Round of 32")) {
                    String string8 = context.getString(R.string.round_of_32_short);
                    string8.getClass();
                    return string8;
                }
                String string2222222 = context.getString(R.string.fantasy_round_short_number, Integer.valueOf(i2));
                string2222222.getClass();
                return string2222222;
            case -214542167:
                if (str.equals("Playoff Round 1st Leg")) {
                    String string9 = context.getString(R.string.play_off_1st_leg_short);
                    string9.getClass();
                    return string9;
                }
                String string22222222 = context.getString(R.string.fantasy_round_short_number, Integer.valueOf(i2));
                string22222222.getClass();
                return string22222222;
            case -86649527:
                if (str.equals("Quarterfinals 1st Leg")) {
                    String string10 = context.getString(R.string.quarter_finals_1st_leg_short);
                    string10.getClass();
                    return string10;
                }
                String string222222222 = context.getString(R.string.fantasy_round_short_number, Integer.valueOf(i2));
                string222222222.getClass();
                return string222222222;
            case 67883350:
                break;
            case 102975788:
                if (str.equals("Round of 32 2nd Leg")) {
                    String string11 = context.getString(R.string.round_of_32_2nd_leg_short);
                    string11.getClass();
                    return string11;
                }
                String string2222222222 = context.getString(R.string.fantasy_round_short_number, Integer.valueOf(i2));
                string2222222222.getClass();
                return string2222222222;
            case 515039423:
                if (str.equals("Playoff Round 2nd Leg")) {
                    String string12 = context.getString(R.string.play_off_2nd_leg_short);
                    string12.getClass();
                    return string12;
                }
                String string22222222222 = context.getString(R.string.fantasy_round_short_number, Integer.valueOf(i2));
                string22222222222.getClass();
                return string22222222222;
            case 642932063:
                if (str.equals("Quarterfinals 2nd Leg")) {
                    String string13 = context.getString(R.string.quarter_finals_2nd_leg_short);
                    string13.getClass();
                    return string13;
                }
                String string222222222222 = context.getString(R.string.fantasy_round_short_number, Integer.valueOf(i2));
                string222222222222.getClass();
                return string222222222222;
            case 1126537948:
                if (str.equals("Round of 16 1st Leg")) {
                    String string14 = context.getString(R.string.round_of_16_1st_leg_short);
                    string14.getClass();
                    return string14;
                }
                String string2222222222222 = context.getString(R.string.fantasy_round_short_number, Integer.valueOf(i2));
                string2222222222222.getClass();
                return string2222222222222;
            case 1411862219:
                if (str.equals("Semifinals")) {
                    String string15 = context.getString(R.string.semifinals_short);
                    string15.getClass();
                    return string15;
                }
                String string22222222222222 = context.getString(R.string.fantasy_round_short_number, Integer.valueOf(i2));
                string22222222222222.getClass();
                return string22222222222222;
            case 1856119538:
                if (str.equals("Round of 16 2nd Leg")) {
                    String string16 = context.getString(R.string.round_of_16_2nd_leg_short);
                    string16.getClass();
                    return string16;
                }
                String string222222222222222 = context.getString(R.string.fantasy_round_short_number, Integer.valueOf(i2));
                string222222222222222.getClass();
                return string222222222222222;
            case 2104383965:
                break;
            default:
                String string2222222222222222 = context.getString(R.string.fantasy_round_short_number, Integer.valueOf(i2));
                string2222222222222222.getClass();
                return string2222222222222222;
        }
    }

    public static final void D(Context context, CoroutineContext coroutineContext, Function2 function2) {
        context.getClass();
        coroutineContext.getClass();
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        ((ia0) applicationContext).b(coroutineContext, function2);
    }

    public static void E(Context context, Function2 function2) {
        hs4 hs4Var = z45.a;
        D(context, rob.a, function2);
    }

    public static final xtc F(long j2) {
        return td4.Z(utc.a, new yz(j2, 3));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final mp6 G(FantasyCompetition fantasyCompetition) {
        boolean z;
        fantasyCompetition.getClass();
        if (fantasyCompetition.getType() == FantasyCompetitionType.WEEKLY) {
            Long revealTimestamp = fantasyCompetition.getCurrentRound().getRevealTimestamp();
            long longValue = revealTimestamp != null ? revealTimestamp.longValue() : 0L;
            long deadlineTimestamp = fantasyCompetition.getCurrentRound().getDeadlineTimestamp();
            long w = yaa.w();
            if (longValue > w || w > deadlineTimestamp) {
                z = true;
                lp6 lp6Var = fantasyCompetition.getCurrentRoundSequence() >= 3 ? lp6.b : lp6.c;
                FantasyRound nextRound = fantasyCompetition.getCurrentRound().getDeadlineTimestamp() >= yaa.w() ? fantasyCompetition.getNextRound() : fantasyCompetition.getCurrentRound();
                boolean z2 = nextRound != null || nextRound.getDeadlineTimestamp() < yaa.w();
                int id = fantasyCompetition.getId();
                String name = fantasyCompetition.getName();
                FantasyCompetitionType type = fantasyCompetition.getType();
                UniqueTournament uniqueTournament = fantasyCompetition.getUniqueTournament();
                return new mp6(id, name, type, uniqueTournament == null ? Integer.valueOf(uniqueTournament.getId()) : null, fantasyCompetition.getCategory().getId(), fantasyCompetition.getOfficial(), fantasyCompetition.isAlpha(), lp6Var, Long.valueOf(fantasyCompetition.getTotalPlayers()), Intrinsics.c(nextRound != null ? Boolean.valueOf(nextRound.isPlaceholderRound()) : null, Boolean.TRUE), z, z2);
            }
        }
        z = false;
        lp6 lp6Var2 = fantasyCompetition.getCurrentRoundSequence() >= 3 ? lp6.b : lp6.c;
        if (fantasyCompetition.getCurrentRound().getDeadlineTimestamp() >= yaa.w()) {
        }
        if (nextRound != null) {
        }
        int id2 = fantasyCompetition.getId();
        String name2 = fantasyCompetition.getName();
        FantasyCompetitionType type2 = fantasyCompetition.getType();
        UniqueTournament uniqueTournament2 = fantasyCompetition.getUniqueTournament();
        return new mp6(id2, name2, type2, uniqueTournament2 == null ? Integer.valueOf(uniqueTournament2.getId()) : null, fantasyCompetition.getCategory().getId(), fantasyCompetition.getOfficial(), fantasyCompetition.isAlpha(), lp6Var2, Long.valueOf(fantasyCompetition.getTotalPlayers()), Intrinsics.c(nextRound != null ? Boolean.valueOf(nextRound.isPlaceholderRound()) : null, Boolean.TRUE), z, z2);
    }

    public static final mp6 H(FantasyUpcomingCompetition fantasyUpcomingCompetition) {
        fantasyUpcomingCompetition.getClass();
        return new mp6(fantasyUpcomingCompetition.getId(), fantasyUpcomingCompetition.getName(), fantasyUpcomingCompetition.getType(), fantasyUpcomingCompetition.getUniqueTournamentId(), fantasyUpcomingCompetition.getCategory().getId(), fantasyUpcomingCompetition.isOfficial(), fantasyUpcomingCompetition.isAlpha(), lp6.a, null, false, false, false);
    }

    public static final yt9 I(yt9 yt9Var, boolean z) {
        if (!z) {
            return yt9Var;
        }
        l62 source = yt9Var.source();
        return (source.I(0L, yl4.b) || source.I(0L, yl4.a)) ? c6o.i(new lof(new fr8(yt9Var.source())), yt9Var.getFileSystem()) : yt9Var;
    }

    public static final nn2 J(g62 g62Var) {
        return new nn2(g62Var, false);
    }

    public static final void K(da daVar, s3h s3hVar) {
        Object g2 = s3hVar.k().a.g(w3h.g);
        if (g2 == null) {
            g2 = null;
        }
        if (g2 != null) {
            pvd.j();
            return;
        }
        s3h l2 = s3hVar.l();
        if (l2 == null) {
            return;
        }
        Object g3 = l2.k().a.g(w3h.e);
        if (g3 == null) {
            g3 = null;
        }
        if (g3 != null) {
            Object g4 = l2.k().a.g(w3h.f);
            f13 f13Var = (f13) (g4 != null ? g4 : null);
            if (f13Var == null || (f13Var.a >= 0 && f13Var.b >= 0)) {
                if (s3hVar.k().a.c(w3h.K)) {
                    ArrayList arrayList = new ArrayList();
                    List j2 = s3h.j(4, l2);
                    int size = j2.size();
                    int i2 = 0;
                    for (int i3 = 0; i3 < size; i3++) {
                        s3h s3hVar2 = (s3h) j2.get(i3);
                        if (s3hVar2.k().a.c(w3h.K)) {
                            arrayList.add(s3hVar2);
                            if (s3hVar2.c.w() < s3hVar.c.w()) {
                                i2++;
                            }
                        }
                    }
                    if (arrayList.isEmpty()) {
                        return;
                    }
                    boolean v = v(arrayList);
                    int i4 = v ? 0 : i2;
                    int i5 = v ? i2 : 0;
                    Object g5 = s3hVar.k().a.g(w3h.K);
                    if (g5 == null) {
                        g5 = Boolean.FALSE;
                    }
                    daVar.m(dad.w(i4, 1, i5, 1, ((Boolean) g5).booleanValue()));
                }
            }
        }
    }

    public static final boolean L(FantasyCompetition fantasyCompetition, String str, boolean z) {
        boolean z2;
        fantasyCompetition.getClass();
        str.getClass();
        List<String> countries = fantasyCompetition.getCountries();
        if (countries != null && !countries.isEmpty()) {
            List<String> countries2 = fantasyCompetition.getCountries();
            if (!Intrinsics.c(countries2 != null ? Boolean.valueOf(countries2.contains(str)) : null, Boolean.TRUE)) {
                z2 = false;
                return !z2 && (fantasyCompetition.isAlpha() || z || ph0.a0(new String[]{"debug", "qa", "alpha", "nightly"}).contains("release"));
            }
        }
        z2 = true;
        if (z2) {
        }
    }

    public static final boolean M(FantasyUpcomingCompetition fantasyUpcomingCompetition, String str, boolean z) {
        boolean z2;
        fantasyUpcomingCompetition.getClass();
        str.getClass();
        List<String> countries = fantasyUpcomingCompetition.getCountries();
        if (countries != null && !countries.isEmpty()) {
            List<String> countries2 = fantasyUpcomingCompetition.getCountries();
            if (!Intrinsics.c(countries2 != null ? Boolean.valueOf(countries2.contains(str)) : null, Boolean.TRUE)) {
                z2 = false;
                return !z2 && (fantasyUpcomingCompetition.isAlpha() || z || ph0.a0(new String[]{"debug", "qa", "alpha", "nightly"}).contains("release"));
            }
        }
        z2 = true;
        if (z2) {
        }
    }

    public static synchronized v3p N(Context context, Intent intent) {
        rfn rfnVar;
        synchronized (f5p.class) {
            rfnVar = a;
            if (rfnVar == null) {
                rfnVar = new rfn(context.getApplicationContext(), intent);
                rfnVar.d = new o4n(rfnVar);
                ((CopyOnWriteArrayList) rfnVar.b.f).add(rfnVar);
                a = rfnVar;
            }
        }
        return rfnVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final gv9 gv9Var, final float f2, final long j2, final long j3, xtc xtcVar, of3 of3Var, final int i2, final int i3) {
        xtc xtcVar2;
        int i4;
        eqf u;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(967904339);
        int i5 = (av8Var.g(gv9Var) ? 4 : 2) | i2 | (av8Var.d(f2) ? 32 : 16) | (av8Var.f(j2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.f(j3) ? a.o : 1024);
        int i6 = i3 & 16;
        if (i6 != 0) {
            i5 |= 24576;
        } else if ((i2 & 24576) == 0) {
            xtcVar2 = xtcVar;
            i5 |= av8Var.g(xtcVar2) ? 16384 : 8192;
            i4 = i5;
            if (av8Var.T(i4 & 1, (i4 & 9363) == 9362)) {
                av8Var.W();
            } else {
                if (i6 != 0) {
                    xtcVar2 = utc.a;
                }
                Object O = av8Var.O();
                a99 a99Var = nf3.a;
                Object obj = O;
                if (O == a99Var) {
                    b20 a2 = e20.a();
                    float f3 = -f2;
                    a2.g(f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    a2.f(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3);
                    a2.f(f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    a2.f(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2);
                    a2.d();
                    av8Var.n0(a2);
                    obj = a2;
                }
                b20 b20Var = (b20) obj;
                boolean i7 = ((i4 & 14) == 4) | av8Var.i(b20Var) | ((i4 & 112) == 32) | ((i4 & 7168) == 2048) | ((i4 & 896) == 256);
                Object O2 = av8Var.O();
                if (i7 || O2 == a99Var) {
                    s71 s71Var = new s71(gv9Var, b20Var, f2, j3, j2);
                    av8Var.n0(s71Var);
                    O2 = s71Var;
                }
                lz.d((i4 >> 12) & 14, av8Var, xtcVar2, (Function1) O2);
            }
            final xtc xtcVar3 = xtcVar2;
            u = av8Var.u();
            if (u == null) {
                u.d = new Function2() { // from class: t71
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        ((Integer) obj3).getClass();
                        f5p.a(gv9.this, f2, j2, j3, xtcVar3, (of3) obj2, aba.K(i2 | 1), i3);
                        return Unit.a;
                    }
                };
                return;
            }
            return;
        }
        xtcVar2 = xtcVar;
        i4 = i5;
        if (av8Var.T(i4 & 1, (i4 & 9363) == 9362)) {
        }
        final xtc xtcVar32 = xtcVar2;
        u = av8Var.u();
        if (u == null) {
        }
    }

    public static final void b(int i2, of3 of3Var, xtc xtcVar) {
        xtc xtcVar2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-654049266);
        int i3 = i2 | 6;
        if (av8Var.T(i3 & 1, (i3 & 3) != 2)) {
            utc utcVar = utc.a;
            xtc c0 = l98.c0(utcVar, 8.0f, 8.0f);
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
            nq8.h(av8Var, n9e.q(wnn.A(l98.b0(bkh.l(utcVar, 24.0f), 8.0f), o7g.a), lz.D(R.color.value, av8Var), oyn.e));
            nq8.h(av8Var, bkh.p(utcVar, 8.0f));
            String v = oea.v(R.string.team_starters, av8Var);
            long D = lz.D(R.color.n_lv_3, av8Var);
            yf8 yf8Var = xth.a;
            q5a.w(v, null, D, null, 0L, 0L, null, 0L, 0, false, 0, 0, xth.b(), av8Var, 0, 0, 131066);
            av8Var = av8Var;
            av8Var.s(true);
            xtcVar2 = utcVar;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new l63(xtcVar2, i2, 4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(final String str, final gv9 gv9Var, final boolean z, xtc xtcVar, boolean z2, of3 of3Var, int i2, int i3) {
        final boolean z3;
        eqf u;
        str.getClass();
        gv9Var.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1381143767);
        int i4 = (av8Var.g(str) ? 4 : 2) | i2 | (av8Var.g(gv9Var) ? 32 : 16) | (av8Var.h(z) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        int i5 = i3 & 16;
        if (i5 != 0) {
            i4 |= 24576;
        } else if ((i2 & 24576) == 0) {
            z3 = z2;
            i4 |= av8Var.h(z3) ? 16384 : 8192;
            if (av8Var.T(i4 & 1, (i4 & 9363) == 9362)) {
                av8Var.W();
            } else {
                if (i5 != 0) {
                    z3 = false;
                }
                un0.a(xtcVar, o7g.a(12.0f), rd0.t(lz.D(R.color.surface_1, av8Var), av8Var, 0), null, null, yqo.H(1076573605, av8Var, new ct8() { // from class: mo6
                    @Override // defpackage.ct8
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        of3 of3Var2 = (of3) obj2;
                        int intValue = ((Integer) obj3).intValue();
                        ((v23) obj).getClass();
                        av8 av8Var2 = (av8) of3Var2;
                        if (av8Var2.T(intValue & 1, (intValue & 17) != 16)) {
                            kv1 kv1Var = uxf.p;
                            xtc f0 = l98.f0(l98.d0(n9e.q(bkh.d(utc.a, 1.0f), lz.D(R.color.surface_1, av8Var2), oyn.e), 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 7);
                            u23 a2 = t23.a(ww9.d, kv1Var, av8Var2, 48);
                            int hashCode = Long.hashCode(av8Var2.T);
                            aee m2 = av8Var2.m();
                            xtc C = fqj.C(av8Var2, f0);
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
                            rha.b(str, null, 0L, av8Var2, 0, 6);
                            av8Var2.d0(-530984298);
                            gv9 gv9Var2 = gv9Var;
                            int i6 = 0;
                            for (Object obj4 : gv9Var2) {
                                int i7 = i6 + 1;
                                if (i6 < 0) {
                                    b.q();
                                    throw null;
                                }
                                rd0.i((h73) obj4, z, z3, null, av8Var2, 0);
                                if (i6 != gv9Var2.size() - 1) {
                                    av8Var2.d0(-1231488156);
                                    td4.w(null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, lz.D(R.color.n_lv_4, av8Var2), av8Var2, 0, 3);
                                    av8Var2.s(false);
                                } else {
                                    av8Var2.d0(-1231415120);
                                    av8Var2.s(false);
                                }
                                i6 = i7;
                            }
                            av8Var2.s(false);
                            av8Var2.s(true);
                        } else {
                            av8Var2.W();
                        }
                        return Unit.a;
                    }
                }), av8Var, 196614, 24);
            }
            u = av8Var.u();
            if (u == null) {
                u.d = new e82(str, gv9Var, z, xtcVar, z3, i2, i3, 2);
                return;
            }
            return;
        }
        z3 = z2;
        if (av8Var.T(i4 & 1, (i4 & 9363) == 9362)) {
        }
        u = av8Var.u();
        if (u == null) {
        }
    }

    public static final void d(String str, d7e d7eVar, Function0 function0, xtc xtcVar, of3 of3Var, int i2) {
        xtc xtcVar2;
        str.getClass();
        d7eVar.getClass();
        function0.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1988636272);
        int i3 = i2 | (av8Var.g(str) ? 4 : 2) | (av8Var.i(d7eVar) ? 32 : 16) | (av8Var.i(function0) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | 3072;
        if (av8Var.T(i3 & 1, (i3 & 1171) != 1170)) {
            ek2 t = rd0.t(lz.D(R.color.surface_1, av8Var), av8Var, 0);
            n7g a2 = o7g.a(16.0f);
            tc3 H = yqo.H(-935172770, av8Var, new d67(20, str, d7eVar, function0));
            xtcVar2 = utc.a;
            un0.a(xtcVar2, a2, t, null, null, H, av8Var, 196614, 24);
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new ace(i2, 20, str, d7eVar, function0, xtcVar2);
        }
    }

    public static final void e(int i2, of3 of3Var, xtc xtcVar, Function1 function1, Function1 function12) {
        jf9 jf9Var = oyn.e;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(2019715862);
        int i3 = (i2 & 6) == 0 ? (av8Var.i(function1) ? 4 : 2) | i2 : i2;
        if ((i2 & 48) == 0) {
            i3 |= av8Var.i(function12) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= av8Var.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        int i4 = i3;
        int i5 = 1;
        if (av8Var.T(i4 & 1, (i4 & 147) != 146)) {
            qug o0 = hkg.o0(av8Var);
            cdi P = z1a.P(o0, av8Var);
            Boolean bool = (Boolean) P.getValue();
            bool.getClass();
            boolean g2 = ((i4 & 14) == 4) | av8Var.g(P);
            Object O = av8Var.O();
            Object obj = nf3.a;
            rq3 rq3Var = null;
            if (g2 || O == obj) {
                O = new p97(function1, P, rq3Var, i5);
                av8Var.n0(O);
            }
            hz8.o(av8Var, bool, (Function2) O);
            xtc q2 = n9e.q(xtcVar, lz.D(R.color.surface_1, av8Var), jf9Var);
            p4h p4hVar = ww9.d;
            kv1 kv1Var = uxf.o;
            u23 a2 = t23.a(p4hVar, kv1Var, av8Var, 0);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, q2);
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
            kv1 kv1Var2 = uxf.p;
            xtc u0 = hkg.u0(new goa(1.0f, true), o0, false, 14);
            u23 a3 = t23.a(p4hVar, kv1Var2, av8Var, 48);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C2 = fqj.C(av8Var, u0);
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
            tba.e(0, 4, av8Var, null, oea.v(R.string.fantasy_create_or_join_league_title, av8Var), oea.v(R.string.fantasy_create_or_join_league_body, av8Var));
            ng0 ng0Var = new ng0(8.0f, true, new a70(6));
            utc utcVar = utc.a;
            xtc c0 = l98.c0(utcVar, 16.0f, 8.0f);
            u23 a4 = t23.a(ng0Var, kv1Var, av8Var, 6);
            int hashCode3 = Long.hashCode(av8Var.T);
            aee m4 = av8Var.m();
            xtc C3 = fqj.C(av8Var, c0);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a4, f50Var);
            waa.K(av8Var, m4, ff3Var);
            bf3.s(hashCode3, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C3, f50Var3);
            av8Var.d0(-1089699851);
            for (ja7 ja7Var : ja7.e) {
                boolean z = (i4 & 112) == 32;
                Object O2 = av8Var.O();
                if (z || O2 == obj) {
                    O2 = new k46(18, function12);
                    av8Var.n0(O2);
                }
                kik.c(ja7Var, (Function1) O2, null, av8Var, 0);
            }
            av8Var.s(false);
            av8Var.s(true);
            nq8.h(av8Var, bkh.e(utcVar, 8.0f));
            String v = oea.v(R.string.fantasy_skip_league_step_text, av8Var);
            yf8 yf8Var = xth.a;
            udj.c(v, l98.f0(l98.d0(utcVar, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 5), lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, new p7j(3), 0L, 2, false, 3, 0, null, xth.g(), av8Var, 48, 24960, 109560);
            av8Var.s(true);
            String v2 = oea.v(R.string.skip, av8Var);
            xtc b0 = l98.b0(ml4.f0(n9e.q(bkh.d(utcVar, 1.0f), lz.D(R.color.surface_1, av8Var), jf9Var)), 16.0f);
            boolean z2 = (i4 & 112) == 32;
            Object O3 = av8Var.O();
            if (z2 || O3 == obj) {
                O3 = new l77(6, function12);
                av8Var.n0(O3);
            }
            mha.h(v2, (Function0) O3, b0, gqh.a, null, false, false, false, 0L, 0, 0, av8Var, 3072, 0, 2032);
            av8Var = av8Var;
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new ga7(function1, function12, xtcVar, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void f(final ia7 ia7Var, Function1 function1, final Function1 function12, xtc xtcVar, of3 of3Var, int i2) {
        final ia7 ia7Var2;
        int i3;
        Context context;
        Object obj;
        int i4;
        int i5;
        xtc r;
        ia7 ia7Var3;
        xtc r2;
        Object p1Var;
        Object s26Var;
        final ia7 ia7Var4;
        final int i6;
        ia7Var.getClass();
        function1.getClass();
        function12.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-998749870);
        int i7 = i2 | (av8Var.i(ia7Var) ? 4 : 2) | (av8Var.i(function1) ? 32 : 16) | (av8Var.i(function12) ? 256 : 128) | (av8Var.g(xtcVar) ? a.o : 1024);
        final int i8 = 0;
        if (av8Var.T(i7 & 1, (i7 & 1171) != 1170)) {
            final Context context2 = (Context) av8Var.k(nz.b);
            e1d x = rfo.x(ia7Var.h, av8Var, 0);
            hof hofVar = ia7Var.j;
            int i9 = i7 & 896;
            boolean i10 = av8Var.i(context2) | (i9 == 256) | av8Var.i(ia7Var);
            Object O = av8Var.O();
            Object obj2 = nf3.a;
            if (i10 || O == obj2) {
                O = new Function1() { // from class: ea7
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        int i11 = i8;
                        ia7 ia7Var5 = ia7Var;
                        Function1 function13 = function12;
                        Context context3 = context2;
                        rq3 rq3Var = null;
                        switch (i11) {
                            case 0:
                                da7 da7Var = (da7) obj3;
                                da7Var.getClass();
                                if (!da7Var.equals(ca7.a)) {
                                    if (!da7Var.equals(ba7.a)) {
                                        zzl.b();
                                        break;
                                    } else {
                                        context3.getClass();
                                        FirebaseBundle firebaseBundle = new FirebaseBundle();
                                        firebaseBundle.putString("location", "onboarding");
                                        nv.N(context3, firebaseBundle, "fantasy_create_league");
                                        function13.invoke(Integer.valueOf(ia7Var5.f));
                                    }
                                } else {
                                    context3.getClass();
                                    FirebaseBundle firebaseBundle2 = new FirebaseBundle();
                                    firebaseBundle2.putString("location", "onboarding");
                                    nv.N(context3, firebaseBundle2, "fantasy_join_league");
                                    function13.invoke(Integer.valueOf(ia7Var5.f));
                                }
                                break;
                            default:
                                x97 x97Var = (x97) obj3;
                                x97Var.getClass();
                                if (!x97Var.equals(w97.a)) {
                                    if (!(x97Var instanceof v97)) {
                                        zzl.b();
                                        break;
                                    } else {
                                        int ordinal = ((v97) x97Var).a.ordinal();
                                        if (ordinal == 0) {
                                            ia7Var5.k(new z97("", false, false, false));
                                        } else if (ordinal == 1) {
                                            ia7Var5.k(new y97("", "", FantasyLeagueGameType.CLASSIC, false, false, false));
                                        } else if (ordinal != 2) {
                                            zzl.b();
                                            break;
                                        } else {
                                            nv.A(context3, "join_random_league", "onboarding");
                                            ia7Var5.getClass();
                                            xw3.L(un0.z(ia7Var5), null, null, new hs6(ia7Var5, rq3Var, 18), 3);
                                        }
                                    }
                                } else {
                                    nv.A(context3, "skip_joining_league", null);
                                    function13.invoke(Integer.valueOf(ia7Var5.f));
                                }
                                break;
                        }
                        return null;
                    }
                };
                av8Var.n0(O);
            }
            w1a.c(hofVar, null, (Function1) O, av8Var, 0, 14);
            aa7 aa7Var = ((ha7) x.getValue()).a;
            if (aa7Var instanceof y97) {
                av8Var.d0(1777115238);
                r2 = m6k.r(utc.a, "CreateLeagueModal", new su(Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE, null, null));
                y97 y97Var = (y97) aa7Var;
                boolean i11 = av8Var.i(ia7Var);
                Object O2 = av8Var.O();
                if (i11 || O2 == obj2) {
                    i3 = i7;
                    i4 = i9;
                    context = context2;
                    obj = obj2;
                    p1Var = new p1(2, ia7Var, ia7.class, "updateNameOrDescription", "updateNameOrDescription(Ljava/lang/String;Ljava/lang/String;)V", 0, 5);
                    av8Var.n0(p1Var);
                } else {
                    i3 = i7;
                    p1Var = O2;
                    context = context2;
                    obj = obj2;
                    i4 = i9;
                }
                KFunction kFunction = (KFunction) p1Var;
                boolean i12 = av8Var.i(ia7Var);
                Object O3 = av8Var.O();
                if (i12 || O3 == obj) {
                    Object pyVar = new py(3, ia7Var, ia7.class, "createLeague", "createLeague(Ljava/lang/String;Ljava/lang/String;Lcom/sofascore/model/fantasy/FantasyLeagueGameType;)V", 0, 4);
                    av8Var.n0(pyVar);
                    O3 = pyVar;
                }
                KFunction kFunction2 = (KFunction) O3;
                boolean i13 = av8Var.i(ia7Var);
                Object O4 = av8Var.O();
                if (i13 || O4 == obj) {
                    s26Var = new s26(1, ia7Var, ia7.class, "updateGameType", "updateGameType(Lcom/sofascore/model/fantasy/FantasyLeagueGameType;)V", 0, 6);
                    ia7Var4 = ia7Var;
                    av8Var.n0(s26Var);
                } else {
                    s26Var = O4;
                    ia7Var4 = ia7Var;
                }
                ct8 ct8Var = (ct8) kFunction2;
                Function2 function2 = (Function2) kFunction;
                Function1 function13 = (Function1) ((KFunction) s26Var);
                boolean i14 = av8Var.i(ia7Var4);
                Object O5 = av8Var.O();
                if (i14 || O5 == obj) {
                    i6 = 0;
                    O5 = new Function0() { // from class: fa7
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int i15 = i6;
                            ia7 ia7Var5 = ia7Var4;
                            switch (i15) {
                                case 0:
                                    ia7Var5.k(null);
                                    break;
                                default:
                                    ia7Var5.k(null);
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    av8Var.n0(O5);
                } else {
                    i6 = 0;
                }
                boolean z = i6;
                wnn.k(y97Var, ct8Var, function2, function13, (Function0) O5, r2, av8Var, 24576);
                av8Var.s(z);
                ia7Var2 = ia7Var4;
                i5 = z;
            } else {
                i3 = i7;
                context = context2;
                obj = obj2;
                i4 = i9;
                if (aa7Var instanceof z97) {
                    av8Var.d0(1777660373);
                    r = m6k.r(utc.a, "JoinLeagueModal", new su(Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE, null, null));
                    z97 z97Var = (z97) aa7Var;
                    boolean i15 = av8Var.i(ia7Var);
                    Object O6 = av8Var.O();
                    if (i15 || O6 == obj) {
                        ia7Var3 = ia7Var;
                        Object s26Var2 = new s26(1, ia7Var3, ia7.class, "updateJoinCode", "updateJoinCode(Ljava/lang/String;)V", 0, 7);
                        av8Var.n0(s26Var2);
                        O6 = s26Var2;
                    } else {
                        ia7Var3 = ia7Var;
                    }
                    KFunction kFunction3 = (KFunction) O6;
                    boolean i16 = av8Var.i(ia7Var3);
                    Object O7 = av8Var.O();
                    if (i16 || O7 == obj) {
                        Object s26Var3 = new s26(1, ia7Var3, ia7.class, "joinLeague", "joinLeague(Ljava/lang/String;)V", 0, 8);
                        ia7Var2 = ia7Var3;
                        av8Var.n0(s26Var3);
                        O7 = s26Var3;
                    } else {
                        ia7Var2 = ia7Var3;
                    }
                    Function1 function14 = (Function1) ((KFunction) O7);
                    Function1 function15 = (Function1) kFunction3;
                    boolean i17 = av8Var.i(ia7Var2);
                    Object O8 = av8Var.O();
                    if (i17 || O8 == obj) {
                        final int i18 = 1;
                        O8 = new Function0() { // from class: fa7
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i152 = i18;
                                ia7 ia7Var5 = ia7Var2;
                                switch (i152) {
                                    case 0:
                                        ia7Var5.k(null);
                                        break;
                                    default:
                                        ia7Var5.k(null);
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        av8Var.n0(O8);
                    }
                    yso.h(z97Var, function14, function15, (Function0) O8, r, av8Var, 3072);
                    i5 = 0;
                    av8Var.s(false);
                } else {
                    ia7Var2 = ia7Var;
                    i5 = 0;
                    av8Var.d0(-2020853450);
                    av8Var.s(false);
                }
            }
            k53.N(((ha7) x.getValue()).b, null, av8Var, i5);
            final Context context3 = context;
            int i19 = av8Var.i(context3) | (i4 == 256 ? true : i5) | av8Var.i(ia7Var2);
            Object O9 = av8Var.O();
            if (i19 != false || O9 == obj) {
                final int i20 = 1;
                O9 = new Function1() { // from class: ea7
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        int i112 = i20;
                        ia7 ia7Var5 = ia7Var2;
                        Function1 function132 = function12;
                        Context context32 = context3;
                        rq3 rq3Var = null;
                        switch (i112) {
                            case 0:
                                da7 da7Var = (da7) obj3;
                                da7Var.getClass();
                                if (!da7Var.equals(ca7.a)) {
                                    if (!da7Var.equals(ba7.a)) {
                                        zzl.b();
                                        break;
                                    } else {
                                        context32.getClass();
                                        FirebaseBundle firebaseBundle = new FirebaseBundle();
                                        firebaseBundle.putString("location", "onboarding");
                                        nv.N(context32, firebaseBundle, "fantasy_create_league");
                                        function132.invoke(Integer.valueOf(ia7Var5.f));
                                    }
                                } else {
                                    context32.getClass();
                                    FirebaseBundle firebaseBundle2 = new FirebaseBundle();
                                    firebaseBundle2.putString("location", "onboarding");
                                    nv.N(context32, firebaseBundle2, "fantasy_join_league");
                                    function132.invoke(Integer.valueOf(ia7Var5.f));
                                }
                                break;
                            default:
                                x97 x97Var = (x97) obj3;
                                x97Var.getClass();
                                if (!x97Var.equals(w97.a)) {
                                    if (!(x97Var instanceof v97)) {
                                        zzl.b();
                                        break;
                                    } else {
                                        int ordinal = ((v97) x97Var).a.ordinal();
                                        if (ordinal == 0) {
                                            ia7Var5.k(new z97("", false, false, false));
                                        } else if (ordinal == 1) {
                                            ia7Var5.k(new y97("", "", FantasyLeagueGameType.CLASSIC, false, false, false));
                                        } else if (ordinal != 2) {
                                            zzl.b();
                                            break;
                                        } else {
                                            nv.A(context32, "join_random_league", "onboarding");
                                            ia7Var5.getClass();
                                            xw3.L(un0.z(ia7Var5), null, null, new hs6(ia7Var5, rq3Var, 18), 3);
                                        }
                                    }
                                } else {
                                    nv.A(context32, "skip_joining_league", null);
                                    function132.invoke(Integer.valueOf(ia7Var5.f));
                                }
                                break;
                        }
                        return null;
                    }
                };
                av8Var.n0(O9);
            }
            e((i3 >> 3) & 910, av8Var, xtcVar, function1, (Function1) O9);
        } else {
            ia7Var2 = ia7Var;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new ace(i2, 25, ia7Var2, function1, function12, xtcVar);
        }
    }

    public static final void g(phh phhVar, r9k r9kVar, of3 of3Var, int i2) {
        av8 av8Var;
        int i3;
        Pair pair;
        int i4;
        av8 av8Var2;
        r9k r9kVar2 = phhVar.d;
        av8 av8Var3 = (av8) of3Var;
        av8Var3.f0(1842934462);
        int i5 = (av8Var3.g(phhVar) ? 4 : 2) | i2 | (av8Var3.g(r9kVar) ? 32 : 16);
        if (av8Var3.T(i5 & 1, (i5 & 19) != 18)) {
            if (r9kVar2 != null) {
                av8Var3.d0(293741760);
                String a2 = r9kVar2.a(av8Var3);
                yf8 yf8Var = xth.a;
                q5a.w(a2, null, lz.D(R.color.n_lv_1, av8Var3), null, 0L, 0L, null, 0L, 2, false, 1, 0, xth.j(), av8Var3, 0, 24960, 110586);
                av8Var2 = av8Var3;
                av8Var2.s(false);
                i4 = R.color.n_lv_3;
            } else {
                av8Var3.d0(293997944);
                int ordinal = phhVar.c.ordinal();
                if (ordinal == 0) {
                    i3 = R.color.n_lv_3;
                    av8Var3.d0(1533507572);
                    pair = new Pair(new r13(lz.D(R.color.n_lv_1, av8Var3)), new r13(lz.D(R.color.n_lv_3, av8Var3)));
                    av8Var3.s(false);
                } else if (ordinal != 1) {
                    av8Var3.d0(1533511284);
                    i3 = R.color.n_lv_3;
                    pair = new Pair(new r13(lz.D(R.color.n_lv_3, av8Var3)), new r13(lz.D(R.color.n_lv_3, av8Var3)));
                    av8Var3.s(false);
                } else {
                    i3 = R.color.n_lv_3;
                    av8Var3.d0(1533509908);
                    pair = new Pair(new r13(lz.D(R.color.n_lv_3, av8Var3)), new r13(lz.D(R.color.n_lv_1, av8Var3)));
                    av8Var3.s(false);
                }
                long j2 = ((r13) pair.a).a;
                long j3 = ((r13) pair.b).a;
                l8g a3 = k8g.a(ww9.b, uxf.l, av8Var3, 0);
                int hashCode = Long.hashCode(av8Var3.T);
                aee m2 = av8Var3.m();
                xtc C = fqj.C(av8Var3, utc.a);
                if3.k7.getClass();
                zg3 zg3Var = hf3.b;
                av8Var3.h0();
                if (av8Var3.S) {
                    av8Var3.l(zg3Var);
                } else {
                    av8Var3.q0();
                }
                waa.K(av8Var3, a3, hf3.g);
                waa.K(av8Var3, m2, hf3.f);
                waa.K(av8Var3, Integer.valueOf(hashCode), hf3.j);
                waa.J(av8Var3, hf3.k);
                waa.K(av8Var3, C, hf3.d);
                String str = phhVar.a;
                yf8 yf8Var2 = xth.a;
                i4 = i3;
                q5a.w(str, null, j2, null, 0L, 0L, null, 0L, 0, false, 0, 0, xth.j(), av8Var3, 0, 0, 131066);
                q5a.w(" - ", null, lz.D(i4, av8Var3), null, 0L, 0L, null, 0L, 0, false, 0, 0, xth.j(), av8Var3, 6, 0, 131066);
                q5a.w(phhVar.b, null, j3, null, 0L, 0L, null, 0L, 0, false, 0, 0, xth.j(), av8Var3, 0, 0, 131066);
                av8Var2 = av8Var3;
                av8Var2.s(true);
                av8Var2.s(false);
            }
            av8Var = av8Var2;
            q5a.w(r9kVar.a(av8Var2), null, lz.D(i4, av8Var2), null, 0L, 0L, null, 0L, 2, false, 1, 0, xth.b(), av8Var, 0, 24960, 110586);
        } else {
            av8Var = av8Var3;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new hzj(phhVar, r9kVar, i2, 1);
        }
    }

    public static final void h(phh phhVar, phh phhVar2, m9k m9kVar, of3 of3Var, int i2) {
        Pair pair;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-135805795);
        int i3 = i2 | (av8Var.g(phhVar) ? 4 : 2) | (av8Var.g(phhVar2) ? 32 : 16) | (av8Var.g(m9kVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        if (av8Var.T(i3 & 1, (i3 & 147) != 146)) {
            int ordinal = phhVar.c.ordinal();
            if (ordinal == 0) {
                av8Var.d0(-1660342477);
                pair = new Pair(new r13(lz.D(R.color.n_lv_1, av8Var)), new r13(lz.D(R.color.n_lv_3, av8Var)));
                av8Var.s(false);
            } else if (ordinal != 1) {
                av8Var.d0(-1660339021);
                pair = new Pair(new r13(lz.D(R.color.n_lv_3, av8Var)), new r13(lz.D(R.color.n_lv_3, av8Var)));
                av8Var.s(false);
            } else {
                av8Var.d0(-1660340269);
                pair = new Pair(new r13(lz.D(R.color.n_lv_3, av8Var)), new r13(lz.D(R.color.n_lv_1, av8Var)));
                av8Var.s(false);
            }
            long j2 = ((r13) pair.a).a;
            long j3 = ((r13) pair.b).a;
            l8g a2 = k8g.a(ww9.b, uxf.l, av8Var, 0);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, utc.a);
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
            o(phhVar.a, j2, lz.D(R.color.n_lv_1, av8Var), (phhVar2 != null ? phhVar2.c : null) == qyj.a, av8Var, 0);
            yf8 yf8Var = xth.a;
            q5a.w(" - ", null, lz.D(R.color.n_lv_3, av8Var), null, 0L, 0L, null, 0L, 0, false, 0, 0, xth.j(), av8Var, 6, 0, 131066);
            o(phhVar.b, j3, lz.D(R.color.n_lv_1, av8Var), (phhVar2 != null ? phhVar2.c : null) == qyj.b, av8Var, 0);
            av8Var.s(true);
            q5a.w(m9kVar.a(av8Var), null, lz.D(R.color.n_lv_3, av8Var), null, 0L, 0L, null, 0L, 2, false, 1, 0, xth.b(), av8Var, 0, 24960, 110586);
            av8Var = av8Var;
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new izj(phhVar, phhVar2, m9kVar, i2, 0);
        }
    }

    public static final void i(phh phhVar, r9k r9kVar, of3 of3Var, int i2) {
        av8 av8Var;
        int i3;
        av8 av8Var2;
        r9k r9kVar2 = phhVar.d;
        av8 av8Var3 = (av8) of3Var;
        av8Var3.f0(1757572536);
        int i4 = (av8Var3.g(phhVar) ? 4 : 2) | i2 | (av8Var3.g(r9kVar) ? 32 : 16);
        if (av8Var3.T(i4 & 1, (i4 & 19) != 18)) {
            l8g a2 = k8g.a(ww9.b, uxf.l, av8Var3, 0);
            int hashCode = Long.hashCode(av8Var3.T);
            aee m2 = av8Var3.m();
            xtc C = fqj.C(av8Var3, utc.a);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var3.h0();
            if (av8Var3.S) {
                av8Var3.l(zg3Var);
            } else {
                av8Var3.q0();
            }
            waa.K(av8Var3, a2, hf3.g);
            waa.K(av8Var3, m2, hf3.f);
            waa.K(av8Var3, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var3, hf3.k);
            waa.K(av8Var3, C, hf3.d);
            if (r9kVar2 != null) {
                av8Var3.d0(-954654542);
                String a3 = r9kVar2.a(av8Var3);
                yf8 yf8Var = xth.a;
                i3 = 0;
                q5a.w(a3, null, lz.D(R.color.live, av8Var3), null, 0L, 0L, null, 0L, 2, false, 1, 0, xth.j(), av8Var3, 0, 24960, 110586);
                av8Var2 = av8Var3;
                av8Var2.s(false);
            } else {
                i3 = 0;
                av8Var3.d0(-954380316);
                String str = phhVar.a;
                yf8 yf8Var2 = xth.a;
                q5a.w(str, null, lz.D(R.color.live, av8Var3), null, 0L, 0L, null, 0L, 0, false, 0, 0, xth.j(), av8Var3, 0, 0, 131066);
                q5a.w(" - ", null, lz.D(R.color.live, av8Var3), null, 0L, 0L, null, 0L, 0, false, 0, 0, xth.j(), av8Var3, 6, 0, 131066);
                q5a.w(phhVar.b, null, lz.D(R.color.live, av8Var3), null, 0L, 0L, null, 0L, 0, false, 0, 0, xth.j(), av8Var3, 0, 0, 131066);
                av8Var2 = av8Var3;
                av8Var2.s(false);
            }
            av8Var2.s(true);
            av8Var = av8Var2;
            q5a.w(r9kVar.a(av8Var2), null, lz.D(R.color.live, av8Var2), null, 0L, 0L, null, 0L, 2, false, 1, 0, xth.b(), av8Var, 0, 24960, 110586);
        } else {
            av8Var = av8Var3;
            i3 = 0;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new hzj(phhVar, r9kVar, i2, i3);
        }
    }

    public static final void j(phh phhVar, phh phhVar2, m9k m9kVar, of3 of3Var, int i2) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(841402851);
        int i3 = i2 | (av8Var.g(phhVar) ? 4 : 2) | (av8Var.g(phhVar2) ? 32 : 16) | (av8Var.g(m9kVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        if (av8Var.T(i3 & 1, (i3 & 147) != 146)) {
            l8g a2 = k8g.a(ww9.b, uxf.l, av8Var, 0);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, utc.a);
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
            o(phhVar.a, lz.D(R.color.live, av8Var), lz.D(R.color.live, av8Var), (phhVar2 != null ? phhVar2.c : null) == qyj.a, av8Var, 0);
            yf8 yf8Var = xth.a;
            q5a.w(" - ", null, lz.D(R.color.live, av8Var), null, 0L, 0L, null, 0L, 0, false, 0, 0, xth.j(), av8Var, 6, 0, 131066);
            o(phhVar.b, lz.D(R.color.live, av8Var), lz.D(R.color.live, av8Var), (phhVar2 != null ? phhVar2.c : null) == qyj.b, av8Var, 0);
            av8Var.s(true);
            q5a.w(m9kVar.a(av8Var), null, lz.D(R.color.live, av8Var), null, 0L, 0L, null, 0L, 2, false, 1, 0, xth.b(), av8Var, 0, 24960, 110586);
            av8Var = av8Var;
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new izj(phhVar, phhVar2, m9kVar, i2, 1);
        }
    }

    public static final void k(phh phhVar, q9k q9kVar, of3 of3Var, int i2) {
        r9k r9kVar;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1704580393);
        int i3 = i2 | (av8Var.g(phhVar) ? 4 : 2) | (av8Var.g(q9kVar) ? 32 : 16);
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            wxf wxfVar = ww9.b;
            l8g a2 = k8g.a(wxfVar, uxf.l, av8Var, 0);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            utc utcVar = utc.a;
            xtc C = fqj.C(av8Var, utcVar);
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
            String str = phhVar.a;
            yf8 yf8Var = xth.a;
            q5a.w(str, null, lz.D(R.color.crowdsourcing_live, av8Var), null, 0L, 0L, null, 0L, 0, false, 0, 0, xth.j(), av8Var, 0, 0, 131066);
            q5a.w(" - ", null, lz.D(R.color.crowdsourcing_live, av8Var), null, 0L, 0L, null, 0L, 0, false, 0, 0, xth.j(), av8Var, 6, 0, 131066);
            q5a.w(phhVar.b, null, lz.D(R.color.crowdsourcing_live, av8Var), null, 0L, 0L, null, 0L, 0, false, 0, 0, xth.j(), av8Var, 0, 0, 131066);
            av8Var.s(true);
            l8g a3 = k8g.a(wxfVar, uxf.m, av8Var, 48);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
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
            kq9.b(s6a.N(R.drawable.ic_crowdsourcing, 6, av8Var), null, bkh.l(utcVar, 10.0f), lz.D(R.color.n_lv_1, av8Var), av8Var, 432, 0);
            nq8.h(av8Var, bkh.p(utcVar, 4.0f));
            r9kVar = q9kVar;
            q5a.w(r9kVar.a(av8Var), null, lz.D(R.color.crowdsourcing_live, av8Var), null, 0L, 0L, null, 0L, 2, false, 1, 0, xth.b(), av8Var, 0, 24960, 110586);
            av8Var = av8Var;
            av8Var.s(true);
        } else {
            r9kVar = q9kVar;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new bmj(phhVar, r9kVar, i2, 5);
        }
    }

    public static final void l(azj azjVar, of3 of3Var, int i2) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1920525706);
        int i3 = (av8Var.g(azjVar) ? 4 : 2) | i2;
        if (av8Var.T(i3 & 1, (i3 & 3) != 2)) {
            qxb qxbVar = azjVar.g;
            phh phhVar = azjVar.h;
            phh phhVar2 = azjVar.f;
            if (qxbVar instanceof pxb) {
                av8Var.d0(1210738049);
                m(((pxb) qxbVar).a, av8Var, 0);
                av8Var.s(false);
            } else if ((qxbVar instanceof mxb) || (qxbVar instanceof lxb)) {
                av8Var.d0(1210742066);
                i(phhVar2, ((nxb) qxbVar).a(), av8Var, 0);
                av8Var.s(false);
            } else if (qxbVar instanceof kxb) {
                av8Var.d0(1210747551);
                k(phhVar2, ((kxb) qxbVar).a, av8Var, 0);
                av8Var.s(false);
            } else if (qxbVar instanceof jxb) {
                av8Var.d0(1210753357);
                j(phhVar2, phhVar, ((jxb) qxbVar).a, av8Var, 0);
                av8Var.s(false);
            } else if (qxbVar instanceof dxb) {
                av8Var.d0(1210760689);
                h(phhVar2, phhVar, ((dxb) qxbVar).a, av8Var, 0);
                av8Var.s(false);
            } else if (qxbVar instanceof ixb) {
                av8Var.d0(1210767798);
                g(phhVar2, ((ixb) qxbVar).a(), av8Var, 0);
                av8Var.s(false);
            } else {
                if (!(qxbVar instanceof oxb)) {
                    throw dmi.h(av8Var, 1210737494, false);
                }
                av8Var.d0(1210773045);
                p(phhVar2, ((oxb) qxbVar).a, av8Var, 0);
                av8Var.s(false);
            }
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new fzj(azjVar, i2);
        }
    }

    public static final void m(long j2, of3 of3Var, int i2) {
        String i3;
        String str;
        String str2;
        String str3;
        ema emaVar;
        ema emaVar2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-2065693987);
        int i4 = (av8Var.f(j2) ? 4 : 2) | i2;
        int i5 = 3;
        if (av8Var.T(i4 & 1, (i4 & 3) != 2)) {
            Context context = (Context) av8Var.k(nz.b);
            context.getClass();
            long j3 = 1000 * j2;
            long currentTimeMillis = j3 - System.currentTimeMillis();
            long j4 = currentTimeMillis / 86400000;
            if (currentTimeMillis < 0) {
                if (ug5.u(j2)) {
                    str2 = context.getString(R.string.today);
                    str2.getClass();
                } else if (ug5.w(j2)) {
                    str2 = context.getString(R.string.yesterday);
                    str2.getClass();
                } else {
                    bi4 bi4Var = bi4.PATTERN_DMY;
                    ConcurrentHashMap concurrentHashMap = hk4.a;
                    str2 = fc6.i(j2, hk4.a(bi4Var.d()));
                }
                DateTimePatternGenerator b2 = hk4.b();
                String bestPattern = DateFormat.is24HourFormat(context) ? b2.getBestPattern("Hm") : b2.getBestPattern("hm");
                bestPattern.getClass();
                str3 = fc6.i(j2, hk4.a(bestPattern));
            } else {
                if (j4 >= 1) {
                    if (((int) ChronoUnit.DAYS.between(vxd.o(Instant.ofEpochMilli(yaa.v())), vxd.o(Instant.ofEpochMilli(j3)))) == 1) {
                        DateTimePatternGenerator b3 = hk4.b();
                        String bestPattern2 = DateFormat.is24HourFormat(context) ? b3.getBestPattern("Hm") : b3.getBestPattern("hm");
                        bestPattern2.getClass();
                        i3 = fc6.i(j2, hk4.a(bestPattern2));
                        str = context.getString(R.string.tomorrow);
                        str.getClass();
                    } else {
                        str3 = rik.m(j2, context);
                        str2 = String.format("%s, %s", Arrays.copyOf(new Object[]{rik.h(j2, bi4.PATTERN_DAY_SHORT), rik.h(j2, bi4.PATTERN_DM)}, 2));
                    }
                } else {
                    DateTimePatternGenerator b4 = hk4.b();
                    String bestPattern3 = DateFormat.is24HourFormat(context) ? b4.getBestPattern("Hm") : b4.getBestPattern("hm");
                    bestPattern3.getClass();
                    i3 = fc6.i(j2, hk4.a(bestPattern3));
                    String string = context.getString(R.string.today);
                    if (!fc6.B(fc6.t(Instant.ofEpochSecond(j2)))) {
                        string = null;
                    }
                    if (string == null) {
                        str = context.getString(R.string.tomorrow);
                        str.getClass();
                    } else {
                        str = string;
                    }
                }
                String str4 = i3;
                str2 = str;
                str3 = str4;
            }
            Pair x = pd0.x(j2);
            int intValue = ((Number) x.a).intValue();
            int intValue2 = ((Number) x.b).intValue();
            if (intValue == 3) {
                av8Var.d0(-857017632);
                av8Var.s(false);
                emaVar = ema.a;
            } else {
                av8Var.d0(-857016668);
                emaVar = (ema) av8Var.k(dh3.n);
                av8Var.s(false);
            }
            ff5 ff5Var = dh3.n;
            tol.b(ff5Var.a(emaVar), yqo.H(-1218611683, av8Var, new tk1(str3, 14)), av8Var, 56);
            if (intValue2 == 3) {
                av8Var.d0(-857004320);
                av8Var.s(false);
                emaVar2 = ema.a;
            } else {
                av8Var.d0(-857003356);
                ema emaVar3 = (ema) av8Var.k(ff5Var);
                av8Var.s(false);
                emaVar2 = emaVar3;
            }
            tol.b(ff5Var.a(emaVar2), yqo.H(565493382, av8Var, new tk1(str2, 13)), av8Var, 56);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new kv3(j2, i2, i5);
        }
    }

    public static final void n(dxi dxiVar, dxi dxiVar2, tc3 tc3Var, of3 of3Var, int i2) {
        ff3 ff3Var;
        utc utcVar;
        f50 f50Var;
        mv1 mv1Var;
        ry ryVar;
        f50 f50Var2;
        float f2;
        Integer num = dxiVar.c;
        Integer num2 = dxiVar2.d;
        Integer num3 = dxiVar2.c;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(246912411);
        int i3 = i2 | (av8Var.g(dxiVar) ? 4 : 2) | (av8Var.g(dxiVar2) ? 32 : 16);
        if (av8Var.T(i3 & 1, (i3 & 147) != 146)) {
            Integer num4 = dxiVar.d;
            boolean z = (num == null || num4 == null || num3 == null || num2 == null) ? false : true;
            lv1 lv1Var = uxf.m;
            utc utcVar2 = utc.a;
            xtc d0 = l98.d0(bkh.e(bkh.d(utcVar2, 1.0f), 52.0f), 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
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
            f50 f50Var3 = hf3.g;
            waa.K(av8Var, a2, f50Var3);
            ff3 ff3Var2 = hf3.f;
            waa.K(av8Var, m2, ff3Var2);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var4 = hf3.j;
            waa.K(av8Var, valueOf, f50Var4);
            ry ryVar2 = hf3.k;
            waa.J(av8Var, ryVar2);
            f50 f50Var5 = hf3.d;
            waa.K(av8Var, C, f50Var5);
            xtc l2 = bkh.l(utcVar2, 32.0f);
            mv1 mv1Var2 = uxf.c;
            k1c c2 = e12.c(mv1Var2, false);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C2 = fqj.C(av8Var, l2);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, c2, f50Var3);
            waa.K(av8Var, m3, ff3Var2);
            bf3.s(hashCode2, av8Var, f50Var4, av8Var, ryVar2);
            waa.K(av8Var, C2, f50Var5);
            n12 n12Var = n12.a;
            if (z) {
                av8Var.d0(365428545);
                int intValue = num4.intValue();
                xtc l3 = bkh.l(n12Var.a(utcVar2, mv1Var2), 24.0f);
                n7g n7gVar = o7g.a;
                xtc o2 = yso.o(wnn.A(l3, n7gVar), 1.0f, lz.D(R.color.n_lv_4, av8Var), n7gVar);
                utcVar = utcVar2;
                ff3Var = ff3Var2;
                f50Var = f50Var5;
                mv1Var = mv1Var2;
                ryVar = ryVar2;
                f50Var2 = f50Var4;
                f2 = 32.0f;
                td4.G(intValue, o2, false, 0L, av8Var, 0, 12);
                td4.G(num.intValue(), yso.o(wnn.A(bkh.l(n12Var.a(utcVar, uxf.k), 24.0f), n7gVar), 1.0f, lz.D(R.color.n_lv_4, av8Var), n7gVar), false, 0L, av8Var, 0, 12);
                av8Var.s(false);
            } else {
                ff3Var = ff3Var2;
                utcVar = utcVar2;
                f50Var = f50Var5;
                mv1Var = mv1Var2;
                ryVar = ryVar2;
                f50Var2 = f50Var4;
                f2 = 32.0f;
                av8Var.d0(366162160);
                td4.G(dxiVar.a, bkh.l(utcVar, 32.0f), false, 0L, av8Var, 48, 12);
                av8Var.s(false);
            }
            av8Var.s(true);
            kv1 kv1Var = uxf.p;
            kg0 kg0Var = ww9.f;
            xtc d02 = l98.d0(new goa(1.0f, true), 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            u23 a3 = t23.a(kg0Var, kv1Var, av8Var, 54);
            int hashCode3 = Long.hashCode(av8Var.T);
            aee m4 = av8Var.m();
            xtc C3 = fqj.C(av8Var, d02);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a3, f50Var3);
            waa.K(av8Var, m4, ff3Var);
            ry ryVar3 = ryVar;
            f50 f50Var6 = f50Var2;
            bf3.s(hashCode3, av8Var, f50Var6, av8Var, ryVar3);
            f50 f50Var7 = f50Var;
            waa.K(av8Var, C3, f50Var7);
            fc6.v(6, tc3Var, av8Var, true);
            xtc l4 = bkh.l(utcVar, f2);
            k1c c3 = e12.c(mv1Var, false);
            int hashCode4 = Long.hashCode(av8Var.T);
            aee m5 = av8Var.m();
            xtc C4 = fqj.C(av8Var, l4);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, c3, f50Var3);
            waa.K(av8Var, m5, ff3Var);
            bf3.s(hashCode4, av8Var, f50Var6, av8Var, ryVar3);
            waa.K(av8Var, C4, f50Var7);
            if (z) {
                av8Var.d0(1727019448);
                int intValue2 = num2.intValue();
                xtc l5 = bkh.l(n12Var.a(utcVar, uxf.e), 24.0f);
                n7g n7gVar2 = o7g.a;
                td4.G(intValue2, yso.o(wnn.A(l5, n7gVar2), 1.0f, lz.D(R.color.n_lv_4, av8Var), n7gVar2), false, 0L, av8Var, 0, 12);
                td4.G(num3.intValue(), yso.o(wnn.A(bkh.l(n12Var.a(utcVar, uxf.i), 24.0f), n7gVar2), 1.0f, lz.D(R.color.n_lv_4, av8Var), n7gVar2), false, 0L, av8Var, 0, 12);
                av8Var.s(false);
            } else {
                av8Var.d0(1727753063);
                td4.G(dxiVar2.a, bkh.l(utcVar, 32.0f), false, 0L, av8Var, 48, 12);
                av8Var.s(false);
            }
            av8Var.s(true);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new mfh(dxiVar, dxiVar2, tc3Var, i2, 15);
        }
    }

    public static final void o(final String str, final long j2, final long j3, final boolean z, of3 of3Var, final int i2) {
        av8 av8Var;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-1046791552);
        int i3 = i2 | (av8Var2.g(str) ? 4 : 2) | (av8Var2.f(j2) ? 32 : 16) | (av8Var2.f(j3) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var2.h(z) ? a.o : 1024);
        if (av8Var2.T(i3 & 1, (i3 & 1171) != 1170)) {
            boolean c0 = hkg.c0((Context) av8Var2.k(nz.b));
            k1c c2 = e12.c(uxf.c, false);
            int hashCode = Long.hashCode(av8Var2.T);
            aee m2 = av8Var2.m();
            utc utcVar = utc.a;
            xtc C = fqj.C(av8Var2, utcVar);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, c2, hf3.g);
            waa.K(av8Var2, m2, hf3.f);
            waa.K(av8Var2, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var2, hf3.k);
            waa.K(av8Var2, C, hf3.d);
            yf8 yf8Var = xth.a;
            q5a.w(str, null, j2, null, 0L, 0L, null, 0L, 0, false, 0, 0, xth.j(), av8Var2, (i3 & 14) | ((i3 << 3) & 896), 0, 131066);
            av8Var = av8Var2;
            if (z) {
                av8Var.d0(-932858223);
                xtc O = rd0.O(n12.a.a(bkh.l(utcVar, 6.0f), uxf.e), 2.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
                boolean h2 = av8Var.h(c0) | ((i3 & 896) == 256);
                Object O2 = av8Var.O();
                if (h2 || O2 == nf3.a) {
                    O2 = new ut6(j3, c0);
                    av8Var.n0(O2);
                }
                lz.d(0, av8Var, O, (Function1) O2);
                av8Var.s(false);
            } else {
                av8Var.d0(-932201860);
                av8Var.s(false);
            }
            av8Var.s(true);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new Function2(str, j2, j3, z, i2) { // from class: gzj
                public final /* synthetic */ String a;
                public final /* synthetic */ long b;
                public final /* synthetic */ long c;
                public final /* synthetic */ boolean d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int K = aba.K(1);
                    f5p.o(this.a, this.b, this.c, this.d, (of3) obj, K);
                    return Unit.a;
                }
            };
        }
    }

    public static final void p(phh phhVar, m9k m9kVar, of3 of3Var, int i2) {
        av8 av8Var;
        av8 av8Var2;
        r9k r9kVar = phhVar.d;
        av8 av8Var3 = (av8) of3Var;
        av8Var3.f0(-618778563);
        int i3 = (av8Var3.g(phhVar) ? 4 : 2) | i2 | (av8Var3.g(m9kVar) ? 32 : 16);
        if (av8Var3.T(i3 & 1, (i3 & 19) != 18)) {
            l8g a2 = k8g.a(ww9.b, uxf.l, av8Var3, 0);
            int hashCode = Long.hashCode(av8Var3.T);
            aee m2 = av8Var3.m();
            xtc C = fqj.C(av8Var3, utc.a);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var3.h0();
            if (av8Var3.S) {
                av8Var3.l(zg3Var);
            } else {
                av8Var3.q0();
            }
            waa.K(av8Var3, a2, hf3.g);
            waa.K(av8Var3, m2, hf3.f);
            waa.K(av8Var3, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var3, hf3.k);
            waa.K(av8Var3, C, hf3.d);
            if (r9kVar != null) {
                av8Var3.d0(1873593541);
                String a3 = r9kVar.a(av8Var3);
                yf8 yf8Var = xth.a;
                q5a.w(a3, null, lz.D(R.color.n_lv_1, av8Var3), null, 0L, 0L, null, 0L, 2, false, 1, 0, xth.j(), av8Var3, 0, 24960, 110586);
                av8Var2 = av8Var3;
                av8Var2.s(false);
            } else {
                av8Var3.d0(1873867767);
                String str = phhVar.a;
                yf8 yf8Var2 = xth.a;
                q5a.w(str, null, lz.D(R.color.n_lv_1, av8Var3), null, 0L, 0L, null, 0L, 0, false, 0, 0, xth.j(), av8Var3, 0, 0, 131066);
                q5a.w(" - ", null, lz.D(R.color.n_lv_1, av8Var3), null, 0L, 0L, null, 0L, 0, false, 0, 0, xth.j(), av8Var3, 6, 0, 131066);
                q5a.w(phhVar.b, null, lz.D(R.color.n_lv_1, av8Var3), null, 0L, 0L, null, 0L, 0, false, 0, 0, xth.j(), av8Var3, 0, 0, 131066);
                av8Var2 = av8Var3;
                av8Var2.s(false);
            }
            av8Var2.s(true);
            av8Var = av8Var2;
            q5a.w(m9kVar.a(av8Var2), null, lz.D(R.color.error, av8Var2), null, 0L, 0L, null, 0L, 2, false, 1, 0, xth.b(), av8Var, 0, 24960, 110586);
        } else {
            av8Var = av8Var3;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new bmj(phhVar, m9kVar, i2, 6);
        }
    }

    public static final void q(azj azjVar, Function0 function0, xtc xtcVar, of3 of3Var, int i2) {
        int i3;
        boolean z;
        azjVar.getClass();
        function0.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1481617882);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? av8Var.g(azjVar) : av8Var.i(azjVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var.i(function0) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= av8Var.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if (av8Var.T(i3 & 1, (i3 & 147) != 146)) {
            kv1 kv1Var = uxf.p;
            kg0 kg0Var = ww9.f;
            xtc A = wnn.A(xtcVar.z(bkh.c), o7g.a(16.0f));
            long D = lz.D(R.color.surface_1, av8Var);
            jf9 jf9Var = oyn.e;
            xtc q2 = n9e.q(A, D, jf9Var);
            long D2 = lz.D(R.color.n_lv_4, av8Var);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = mz1.e(av8Var);
            }
            wzc wzcVar = (wzc) O;
            Object[] objArr = new Object[0];
            Object O2 = av8Var.O();
            if (O2 == a99Var) {
                O2 = nuh.E;
                av8Var.n0(O2);
            }
            xtc y = tol.y(q2, true, true, true, D2, wzcVar, new cyg((boh) o3a.N(objArr, (Function0) O2, av8Var, 48), function0, 21), av8Var, 0);
            u23 a2 = t23.a(kg0Var, kv1Var, av8Var, 54);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, y);
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
            lv1 lv1Var = uxf.m;
            n7g a3 = o7g.a(16.0f);
            utc utcVar = utc.a;
            xtc c0 = l98.c0(n9e.q(wnn.A(utcVar, a3), lz.D(R.color.surface_2, av8Var), jf9Var), 8.0f, 4.0f);
            l8g a4 = k8g.a(ww9.b, lv1Var, av8Var, 48);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C2 = fqj.C(av8Var, c0);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a4, f50Var);
            waa.K(av8Var, m3, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C2, f50Var3);
            Set set = wyh.a;
            String str = azjVar.b;
            r9k r9kVar = azjVar.i;
            kq9.b(s6a.N(wyh.a(str), 6, av8Var), null, bkh.l(utcVar, 16.0f), lz.D(R.color.neutral_default, av8Var), av8Var, 432, 0);
            nq8.h(av8Var, bkh.p(utcVar, 4.0f));
            td4.y(azjVar.e, 48, 12, av8Var, bkh.l(utcVar, 16.0f), null, false);
            if (r9kVar != null) {
                ljg.r(4.0f, 1228074061, av8Var, av8Var, utcVar);
                String a5 = r9kVar.a(av8Var);
                yf8 yf8Var = xth.a;
                z = true;
                q5a.w(a5, null, lz.D(R.color.n_lv_1, av8Var), null, 0L, 0L, new p7j(3), 0L, 0, false, 0, 0, xth.b(), av8Var, 0, 0, 130042);
                av8Var = av8Var;
                av8Var.s(false);
            } else {
                z = true;
                av8Var.d0(1228390230);
                av8Var.s(false);
            }
            av8Var.s(z);
            n(azjVar.c, azjVar.d, yqo.H(-1957340391, av8Var, new fzj(azjVar)), av8Var, 384);
            av8Var.s(z);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new opg(azjVar, function0, xtcVar, i2, 14);
        }
    }

    public static final c20 r(float[] fArr, float f2) {
        return new c20(new DashPathEffect(fArr, f2));
    }

    public static final xtc s(long j2) {
        return td4.Z(utc.a, new yz(j2, 2));
    }

    public static uz2 t(Context context, String str, Bundle bundle) {
        HashMap hashMap = new HashMap();
        if (bundle != null && bundle.keySet() != null) {
            for (String str2 : bundle.keySet()) {
                if (!str2.contains("IABUSPrivacy_String")) {
                    hashMap.put(str2, bundle.getString(str2));
                }
            }
        }
        boolean z = false;
        String string = context.getSharedPreferences("NonNullPackage", 0).getString("IABUSPrivacy_String", null);
        if (string != null) {
            InMobiPrivacyCompliance.setUSPrivacyString(string);
        }
        hashMap.put("tp", str);
        hashMap.put("tp-ver", MobileAds.getVersion().toString());
        if (n9e.I() && MobileAds.getRequestConfiguration().getAgeRestrictedTreatment() == AgeRestrictedTreatment.CHILD) {
            z = true;
        }
        if (MobileAds.getRequestConfiguration().getTagForChildDirectedTreatment() == 1 || z) {
            hashMap.put("coppa", "1");
        } else {
            hashMap.put("coppa", "0");
        }
        return new uz2(hashMap);
    }

    public static ma9 u(int[] iArr, int[] iArr2, float f2, float f3, float f4, float f5, boolean z, Float f6) {
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr2[0];
        int i5 = iArr2[1];
        float f7 = i4;
        float f8 = i2;
        float f9 = f7 - f8;
        float f10 = f9 - f5;
        float f11 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (f10 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && ((f7 + f3) - f8) + f5 <= f2 && z) {
            f11 = f5;
        }
        float f12 = i5;
        float f13 = i3;
        return new ma9(f9 - f11, f12 - f13, ((f7 + f3) - f8) + f11, (f12 + f4) - f13, f6);
    }

    public static final boolean v(ArrayList arrayList) {
        List list;
        long j2;
        if (arrayList.size() >= 2) {
            if (arrayList.size() <= 1) {
                list = km5.a;
            } else {
                ArrayList arrayList2 = new ArrayList();
                Object obj = arrayList.get(0);
                int size = arrayList.size() - 1;
                int i2 = 0;
                while (i2 < size) {
                    i2++;
                    Object obj2 = arrayList.get(i2);
                    s3h s3hVar = (s3h) obj2;
                    s3h s3hVar2 = (s3h) obj;
                    float abs = Math.abs(Float.intBitsToFloat((int) (s3hVar2.g().d() >> 32)) - Float.intBitsToFloat((int) (s3hVar.g().d() >> 32)));
                    float abs2 = Math.abs(Float.intBitsToFloat((int) (s3hVar2.g().d() & 4294967295L)) - Float.intBitsToFloat((int) (s3hVar.g().d() & 4294967295L)));
                    arrayList2.add(new dnd((Float.floatToRawIntBits(abs) << 32) | (Float.floatToRawIntBits(abs2) & 4294967295L)));
                    obj = obj2;
                }
                list = arrayList2;
            }
            if (list.size() == 1) {
                j2 = ((dnd) CollectionsKt.Y(list)).a;
            } else {
                if (list.isEmpty()) {
                    ycb.c("Empty collection can't be reduced.");
                }
                Object Y = CollectionsKt.Y(list);
                int size2 = list.size() - 1;
                if (1 <= size2) {
                    int i3 = 1;
                    while (true) {
                        Y = new dnd(dnd.i(((dnd) Y).a, ((dnd) list.get(i3)).a));
                        if (i3 == size2) {
                            break;
                        }
                        i3++;
                    }
                }
                j2 = ((dnd) Y).a;
            }
            if (Float.intBitsToFloat((int) (4294967295L & j2)) >= Float.intBitsToFloat((int) (j2 >> 32))) {
                return false;
            }
        }
        return true;
    }

    public static final Charset w(up3 up3Var) {
        String a2 = up3Var.a(C4427z5.N);
        if (a2 == null) {
            return null;
        }
        try {
            Charsets.a.getClass();
            Charset forName = Charset.forName(a2);
            forName.getClass();
            return forName;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static final nn2 x(g62 g62Var) {
        return new nn2(g62Var, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0082, code lost:
    
        if (r2.emit(r10, r0) == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0070 A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #0 {all -> 0x0035, blocks: (B:12:0x002f, B:14:0x0053, B:20:0x0068, B:22:0x0070, B:32:0x0045, B:34:0x004f), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0082 -> B:13:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object y(b98 b98Var, ln2 ln2Var, boolean z, rq3 rq3Var) {
        o98 o98Var;
        int i2;
        b62 it;
        b62 b62Var;
        b98 b98Var2;
        Object a2;
        try {
            if (rq3Var instanceof o98) {
                o98Var = (o98) rq3Var;
                int i3 = o98Var.w;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    o98Var.w = i3 - Integer.MIN_VALUE;
                    Object obj = o98Var.v;
                    lu3 lu3Var = lu3.a;
                    i2 = o98Var.w;
                    if (i2 != 0) {
                        y6a.M(obj);
                        kik.n(b98Var);
                        it = ln2Var.iterator();
                        o98Var.r = b98Var;
                        o98Var.s = ln2Var;
                        o98Var.t = it;
                        o98Var.u = z;
                        o98Var.w = 1;
                        a2 = it.a(o98Var);
                        if (a2 != lu3Var) {
                        }
                    } else if (i2 == 1) {
                        z = o98Var.u;
                        b62Var = o98Var.t;
                        ln2Var = o98Var.s;
                        b98Var2 = o98Var.r;
                        y6a.M(obj);
                        if (((Boolean) obj).booleanValue()) {
                        }
                    } else {
                        if (i2 != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z = o98Var.u;
                        b62Var = o98Var.t;
                        ln2Var = o98Var.s;
                        b98Var2 = o98Var.r;
                        y6a.M(obj);
                        it = b62Var;
                        b98Var = b98Var2;
                        o98Var.r = b98Var;
                        o98Var.s = ln2Var;
                        o98Var.t = it;
                        o98Var.u = z;
                        o98Var.w = 1;
                        a2 = it.a(o98Var);
                        if (a2 != lu3Var) {
                            return lu3Var;
                        }
                        b98Var2 = b98Var;
                        b62Var = it;
                        obj = a2;
                        if (((Boolean) obj).booleanValue()) {
                            if (z) {
                                ln2Var.e(null);
                            }
                            return Unit.a;
                        }
                        Object c2 = b62Var.c();
                        o98Var.r = b98Var2;
                        o98Var.s = ln2Var;
                        o98Var.t = b62Var;
                        o98Var.u = z;
                        o98Var.w = 2;
                    }
                }
            }
            if (i2 != 0) {
            }
        } finally {
        }
        o98Var = new o98(rq3Var);
        Object obj2 = o98Var.v;
        lu3 lu3Var2 = lu3.a;
        i2 = o98Var.w;
    }

    public static int z(int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        if ((i2 & (-2097152)) != -2097152 || (i3 = (i2 >>> 19) & 3) == 1 || (i4 = (i2 >>> 17) & 3) == 0 || (i5 = (i2 >>> 12) & 15) == 0 || i5 == 15 || (i6 = (i2 >>> 10) & 3) == 3) {
            return -1;
        }
        int i7 = g[i6];
        if (i3 == 2) {
            i7 /= 2;
        } else if (i3 == 0) {
            i7 /= 4;
        }
        int i8 = (i2 >>> 9) & 1;
        if (i4 == 3) {
            return ((((i3 == 3 ? h[i5 - 1] : i[i5 - 1]) * 12) / i7) + i8) * 4;
        }
        int i9 = i3 == 3 ? i4 == 2 ? j[i5 - 1] : k[i5 - 1] : l[i5 - 1];
        if (i3 == 3) {
            return vxd.c(i9, 144, i7, i8);
        }
        return vxd.c(i4 == 1 ? 72 : 144, i9, i7, i8);
    }
}
