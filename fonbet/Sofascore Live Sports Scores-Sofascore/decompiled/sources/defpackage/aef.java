package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Category;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.PlayerKt;
import com.sofascore.model.mvvm.model.Sport;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.Tournament;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.mvvm.model.UniqueTournamentDetails;
import com.sofascore.results.base.BaseActivity;
import com.vungle.ads.internal.protos.Sdk;
import java.time.LocalDate;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class aef {
    public static final Set a = ph0.a0(new String[]{"CH", "AT", "LI", "IT", "FR", PlayerKt.AMERICAN_FOOTBALL_DEFENSIVE_END});

    public static bef a(Context context, Object obj) {
        UniqueTournament primaryUniqueTournament;
        Category category;
        Sport sport;
        Category category2;
        Sport sport2;
        context.getClass();
        if (obj instanceof Event) {
            Event event = (Event) obj;
            UniqueTournament uniqueTournament = event.getTournament().getUniqueTournament();
            if (g(context, (uniqueTournament == null || (category2 = uniqueTournament.getCategory()) == null || (sport2 = category2.getSport()) == null) ? null : sport2.getSlug())) {
                return bef.r;
            }
            if (f(context, o3a.F(event.getTournament()))) {
                return bef.t;
            }
        } else if (obj instanceof UniqueTournamentDetails) {
            UniqueTournamentDetails uniqueTournamentDetails = (UniqueTournamentDetails) obj;
            if (g(context, uniqueTournamentDetails.getCategory().getSport().getSlug())) {
                return bef.r;
            }
            if (f(context, Integer.valueOf(uniqueTournamentDetails.getId()))) {
                return bef.t;
            }
        } else if (obj instanceof Tournament) {
            Tournament tournament = (Tournament) obj;
            UniqueTournament uniqueTournament2 = tournament.getUniqueTournament();
            if (g(context, (uniqueTournament2 == null || (category = uniqueTournament2.getCategory()) == null || (sport = category.getSport()) == null) ? null : sport.getSlug())) {
                return bef.r;
            }
            if (f(context, o3a.F(tournament))) {
                return bef.t;
            }
        } else if (obj instanceof Player) {
            Team team = ((Player) obj).getTeam();
            if (f(context, (team == null || (primaryUniqueTournament = team.getPrimaryUniqueTournament()) == null) ? null : Integer.valueOf(primaryUniqueTournament.getId()))) {
                return bef.t;
            }
        } else if (obj instanceof Team) {
            Team team2 = (Team) obj;
            if (g(context, team2.getSportSlug())) {
                return bef.r;
            }
            UniqueTournament primaryUniqueTournament2 = team2.getPrimaryUniqueTournament();
            if (f(context, primaryUniqueTournament2 != null ? Integer.valueOf(primaryUniqueTournament2.getId()) : null)) {
                return bef.t;
            }
        }
        return null;
    }

    public static x0f b(BaseActivity baseActivity, Object obj, fv fvVar) {
        baseActivity.getClass();
        bef a2 = a(baseActivity, obj);
        if (a2 == null || Boolean.valueOf(a2.f).equals(Boolean.FALSE)) {
            return null;
        }
        ZoneOffset zoneOffset = ZoneOffset.UTC;
        long epochMilli = LocalDate.now(zoneOffset).atStartOfDay(zoneOffset).toInstant().toEpochMilli();
        long j = baseActivity.A().getLong(a2.o, 0L);
        int i = baseActivity.A().getInt(a2.p, 0);
        if (epochMilli <= j) {
            return null;
        }
        Integer num = a2.n;
        if (num == null || i < num.intValue()) {
            return new x0f(fvVar, a2);
        }
        return null;
    }

    public static void c(SharedPreferences sharedPreferences, bef befVar) {
        sharedPreferences.getClass();
        ZoneOffset zoneOffset = ZoneOffset.UTC;
        LocalDate now = LocalDate.now(zoneOffset);
        long j = befVar.m;
        String str = befVar.p;
        long epochMilli = now.plusDays(j).atStartOfDay(zoneOffset).toInstant().toEpochMilli();
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.getClass();
        edit.putLong(befVar.o, epochMilli);
        edit.apply();
        if (befVar.n != null) {
            int i = sharedPreferences.getInt(str, 0);
            SharedPreferences.Editor edit2 = sharedPreferences.edit();
            edit2.getClass();
            edit2.putInt(str, i + 1);
            edit2.apply();
        }
    }

    public static bef d(Context context, Object obj) {
        context.getClass();
        bef a2 = a(context, obj);
        if (a2 == null || ke0.m.contains(Integer.valueOf(a2.a))) {
            return null;
        }
        return a2;
    }

    public static boolean e(Context context, Integer num) {
        context.getClass();
        if (!h(context) || num == null || num.intValue() != 132) {
            return false;
        }
        yea yeaVar = j58.a;
        return fn0.B("nba_banner") && !ke0.m.contains(Integer.valueOf(bef.q.a));
    }

    public static boolean f(Context context, Integer num) {
        if (!h(context) || !CollectionsKt.R(ph0.a0(new Integer[]{Integer.valueOf(Sdk.SDKError.Reason.AD_RESPONSE_EMPTY_VALUE), Integer.valueOf(Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE)}), num)) {
            return false;
        }
        yea yeaVar = j58.a;
        if (!fn0.B("promotion_sfl")) {
            return false;
        }
        Set<String> set = a;
        if ((set instanceof Collection) && set.isEmpty()) {
            return true;
        }
        for (String str : set) {
            ArrayList arrayList = dv3.a;
            if (Intrinsics.c(str, dv3.d(Integer.valueOf(ke0.c)))) {
                return false;
            }
        }
        return true;
    }

    public static boolean g(Context context, String str) {
        if (!h(context)) {
            return false;
        }
        yea yeaVar = j58.a;
        return fn0.B("promotion_utr") && Intrinsics.c(str, Sports.TENNIS);
    }

    public static boolean h(Context context) {
        SharedPreferences d;
        context.getClass();
        ia0 ia0Var = ia0.q;
        if (!mz1.C()) {
            SharedPreferences sharedPreferences = uic.j;
            if (sharedPreferences == null) {
                Context applicationContext = context.getApplicationContext();
                synchronized (uic.i) {
                    d = a5f.d(applicationContext);
                    uic.j = d;
                }
                d.getClass();
                sharedPreferences = d;
            }
            if (!sharedPreferences.getBoolean("PREF_PROMOTIONS_ENABLE", true)) {
                return false;
            }
        }
        return true;
    }
}
