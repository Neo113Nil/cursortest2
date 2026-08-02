package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.compose.runtime.e;
import com.sofascore.local_persistance.BrandingFantasyCompetition;
import com.sofascore.model.fantasy.FantasyAverageScoreTopPlayerWrapper;
import com.sofascore.model.fantasy.FantasyScoreTopPlayerWrapper;
import com.sofascore.model.fantasy.FantasyTopPlayersResponse;
import com.sofascore.model.mvvm.model.Team;
import com.unity3d.services.UnityAdsConstants;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lnr6;", "Lq8;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class nr6 extends q8 {
    public final wi7 e;
    public final ky6 f;
    public final tj7 g;
    public final do7 h;
    public final String i;
    public final e1d j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nr6(Application application, fqg fqgVar, wi7 wi7Var, ky6 ky6Var, tj7 tj7Var) {
        super(application);
        SharedPreferences d;
        SharedPreferences d2;
        fqgVar.getClass();
        wi7Var.getClass();
        ky6Var.getClass();
        tj7Var.getClass();
        this.e = wi7Var;
        this.f = ky6Var;
        this.g = tj7Var;
        Object a = fqgVar.a("USER_COMPETITION_EXTRA");
        rq3 rq3Var = null;
        if (a == null) {
            a70.r("Required value was null.");
            throw null;
        }
        do7 do7Var = (do7) a;
        this.h = do7Var;
        ia0 ia0Var = ia0.q;
        this.i = fc6.e();
        Context i = i();
        SharedPreferences sharedPreferences = uic.j;
        if (sharedPreferences == null) {
            Context applicationContext = i.getApplicationContext();
            synchronized (uic.i) {
                d2 = a5f.d(applicationContext);
                uic.j = d2;
            }
            d2.getClass();
            sharedPreferences = d2;
        }
        this.j = e.f(new hr6(do7Var, true, null, null, null, null, null, null, null, null, null, null, null, null, sharedPreferences.getBoolean("SHOW_FANTASY_HOW_TO_PLAY_BUBBLE", true), false, false, null, false, false));
        it7 it7Var = un6.b;
        BrandingFantasyCompetition brandingFantasyCompetition = do7Var.c.D;
        un6 un6Var = un6.FULL;
        it7Var.getClass();
        boolean x = it7.x(brandingFantasyCompetition, un6Var, true);
        ev6 ev6Var = do7Var.c;
        boolean z = ev6Var.y && !x;
        if (z || x) {
            String j = ljg.j(ev6Var.c, "FANTASY_PARTNER_SPLASH_SHOWN_TIMESTAMP_");
            Context i2 = i();
            SharedPreferences sharedPreferences2 = uic.j;
            if (sharedPreferences2 == null) {
                Context applicationContext2 = i2.getApplicationContext();
                synchronized (uic.i) {
                    d = a5f.d(applicationContext2);
                    uic.j = d;
                }
                d.getClass();
                sharedPreferences2 = d;
            }
            long j2 = sharedPreferences2.getLong(j, 0L);
            LocalDate t = fc6.t(Instant.ofEpochSecond(yaa.w()));
            LocalDate localDate = Instant.ofEpochSecond(j2).atZone(ZoneId.systemDefault()).toLocalDate();
            localDate.getClass();
            if (t.isEqual(localDate)) {
                return;
            }
            n(hr6.a(k(), null, null, null, null, null, null, null, null, null, null, null, null, null, z, x, null, false, false, 950271));
            xw3.L(un0.z(this), null, null, new ce4(this, j, rq3Var, 28), 3);
        }
    }

    public final hr6 k() {
        return (hr6) ((eoh) this.j).getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0217  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Pair l(FantasyTopPlayersResponse fantasyTopPlayersResponse) {
        ArrayList arrayList;
        ArrayList arrayList2;
        List<FantasyAverageScoreTopPlayerWrapper> averageScoreTopPlayers;
        List<FantasyAverageScoreTopPlayerWrapper> L0;
        String str;
        Float price;
        String str2;
        String name;
        List<FantasyScoreTopPlayerWrapper> scoreTopPlayers;
        List<FantasyScoreTopPlayerWrapper> L02;
        String str3;
        Float price2;
        String str4;
        String name2;
        do7 do7Var = this.h;
        int i = 3;
        if (fantasyTopPlayersResponse != null && (scoreTopPlayers = fantasyTopPlayersResponse.getScoreTopPlayers()) != null) {
            if (!scoreTopPlayers.isEmpty()) {
                Iterator<T> it = scoreTopPlayers.iterator();
                while (it.hasNext()) {
                    if (((FantasyScoreTopPlayerWrapper) it.next()).getTotalScore() > 0) {
                        break;
                    }
                }
            }
            scoreTopPlayers = null;
            if (scoreTopPlayers != null && (L02 = CollectionsKt.L0(scoreTopPlayers, 5)) != null) {
                arrayList = new ArrayList(k13.r(L02, 10));
                for (FantasyScoreTopPlayerWrapper fantasyScoreTopPlayerWrapper : L02) {
                    int id = fantasyScoreTopPlayerWrapper.getFantasyPlayer().getId();
                    int id2 = fantasyScoreTopPlayerWrapper.getFantasyPlayer().getPlayer().getId();
                    String t = tba.t(fantasyScoreTopPlayerWrapper.getFantasyPlayer().getPlayer());
                    int id3 = fantasyScoreTopPlayerWrapper.getFantasyPlayer().getTeam().getId();
                    String nameCode = fantasyScoreTopPlayerWrapper.getFantasyPlayer().getTeam().getNameCode();
                    if (nameCode == null) {
                        Team team = fantasyScoreTopPlayerWrapper.getFantasyPlayer().getPlayer().getTeam();
                        nameCode = (team == null || (name2 = team.getName()) == null) ? null : iii.H(3, name2);
                        if (nameCode == null) {
                            str3 = "";
                            f7a f7aVar = rz6.g;
                            String position = fantasyScoreTopPlayerWrapper.getFantasyPlayer().getPosition();
                            f7aVar.getClass();
                            rz6 g = f7a.g(position);
                            String valueOf = String.valueOf(fantasyScoreTopPlayerWrapper.getTotalScore());
                            int i2 = do7Var.c.c;
                            price2 = fantasyScoreTopPlayerWrapper.getFantasyPlayer().getPrice();
                            if (price2 == null) {
                                float floatValue = price2.floatValue();
                                Context i3 = i();
                                Locale d = dla.d();
                                Set set = o84.a;
                                str4 = String.format(d, "%s%.1fM", Arrays.copyOf(new Object[]{o84.e(i3), Float.valueOf(floatValue)}, 2));
                            } else {
                                str4 = "-";
                            }
                            arrayList.add(new dm7(id, id2, id3, t, g, str3, valueOf, i2, str4));
                        }
                    }
                    str3 = nameCode;
                    f7a f7aVar2 = rz6.g;
                    String position2 = fantasyScoreTopPlayerWrapper.getFantasyPlayer().getPosition();
                    f7aVar2.getClass();
                    rz6 g2 = f7a.g(position2);
                    String valueOf2 = String.valueOf(fantasyScoreTopPlayerWrapper.getTotalScore());
                    int i22 = do7Var.c.c;
                    price2 = fantasyScoreTopPlayerWrapper.getFantasyPlayer().getPrice();
                    if (price2 == null) {
                    }
                    arrayList.add(new dm7(id, id2, id3, t, g2, str3, valueOf2, i22, str4));
                }
                if (fantasyTopPlayersResponse != null && (averageScoreTopPlayers = fantasyTopPlayersResponse.getAverageScoreTopPlayers()) != null) {
                    if (!averageScoreTopPlayers.isEmpty()) {
                        for (FantasyAverageScoreTopPlayerWrapper fantasyAverageScoreTopPlayerWrapper : averageScoreTopPlayers) {
                            if (fantasyAverageScoreTopPlayerWrapper.getAverageScore() != null) {
                                Float averageScore = fantasyAverageScoreTopPlayerWrapper.getAverageScore();
                                averageScore.getClass();
                                if (averageScore.floatValue() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                    break;
                                }
                            }
                        }
                    }
                    averageScoreTopPlayers = null;
                    if (averageScoreTopPlayers != null && (L0 = CollectionsKt.L0(averageScoreTopPlayers, 5)) != null) {
                        arrayList2 = new ArrayList(k13.r(L0, 10));
                        for (FantasyAverageScoreTopPlayerWrapper fantasyAverageScoreTopPlayerWrapper2 : L0) {
                            int id4 = fantasyAverageScoreTopPlayerWrapper2.getFantasyPlayer().getId();
                            int id5 = fantasyAverageScoreTopPlayerWrapper2.getFantasyPlayer().getPlayer().getId();
                            String t2 = tba.t(fantasyAverageScoreTopPlayerWrapper2.getFantasyPlayer().getPlayer());
                            int id6 = fantasyAverageScoreTopPlayerWrapper2.getFantasyPlayer().getTeam().getId();
                            String nameCode2 = fantasyAverageScoreTopPlayerWrapper2.getFantasyPlayer().getTeam().getNameCode();
                            if (nameCode2 == null) {
                                Team team2 = fantasyAverageScoreTopPlayerWrapper2.getFantasyPlayer().getPlayer().getTeam();
                                nameCode2 = (team2 == null || (name = team2.getName()) == null) ? null : iii.H(i, name);
                                if (nameCode2 == null) {
                                    str = "";
                                    f7a f7aVar3 = rz6.g;
                                    String position3 = fantasyAverageScoreTopPlayerWrapper2.getFantasyPlayer().getPosition();
                                    f7aVar3.getClass();
                                    rz6 g3 = f7a.g(position3);
                                    String format = String.format("%.1f", Arrays.copyOf(new Object[]{fantasyAverageScoreTopPlayerWrapper2.getAverageScore()}, 1));
                                    int i4 = do7Var.c.c;
                                    price = fantasyAverageScoreTopPlayerWrapper2.getFantasyPlayer().getPrice();
                                    if (price == null) {
                                        float floatValue2 = price.floatValue();
                                        Context i5 = i();
                                        Locale d2 = dla.d();
                                        Set set2 = o84.a;
                                        str2 = String.format(d2, "%s%.1fM", Arrays.copyOf(new Object[]{o84.e(i5), Float.valueOf(floatValue2)}, 2));
                                    } else {
                                        str2 = "-";
                                    }
                                    arrayList2.add(new dm7(id4, id5, id6, t2, g3, str, format, i4, str2));
                                    i = 3;
                                }
                            }
                            str = nameCode2;
                            f7a f7aVar32 = rz6.g;
                            String position32 = fantasyAverageScoreTopPlayerWrapper2.getFantasyPlayer().getPosition();
                            f7aVar32.getClass();
                            rz6 g32 = f7a.g(position32);
                            String format2 = String.format("%.1f", Arrays.copyOf(new Object[]{fantasyAverageScoreTopPlayerWrapper2.getAverageScore()}, 1));
                            int i42 = do7Var.c.c;
                            price = fantasyAverageScoreTopPlayerWrapper2.getFantasyPlayer().getPrice();
                            if (price == null) {
                            }
                            arrayList2.add(new dm7(id4, id5, id6, t2, g32, str, format2, i42, str2));
                            i = 3;
                        }
                        return new Pair(arrayList, arrayList2);
                    }
                }
                arrayList2 = null;
                return new Pair(arrayList, arrayList2);
            }
        }
        arrayList = null;
        if (fantasyTopPlayersResponse != null) {
            if (!averageScoreTopPlayers.isEmpty()) {
            }
            averageScoreTopPlayers = null;
            if (averageScoreTopPlayers != null) {
                arrayList2 = new ArrayList(k13.r(L0, 10));
                while (r7.hasNext()) {
                }
                return new Pair(arrayList, arrayList2);
            }
        }
        arrayList2 = null;
        return new Pair(arrayList, arrayList2);
    }

    public final void m() {
        iz2 z = un0.z(this);
        hs4 hs4Var = z45.a;
        xw3.L(z, hq4.c, null, new mr6(this, null), 2);
    }

    public final void n(hr6 hr6Var) {
        ((eoh) this.j).setValue(hr6Var);
    }
}
