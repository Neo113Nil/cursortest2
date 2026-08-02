package defpackage;

import android.os.Parcelable;
import android.view.View;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import com.sofascore.model.cuptree.CupTreeBlock;
import com.sofascore.model.cuptree.CupTreeRound;
import com.sofascore.model.mvvm.model.Category;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.mvvm.model.StandingsFormEvent;
import com.sofascore.model.mvvm.model.TournamentRoundWrapper;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.newNetwork.PowerRanking;
import com.sofascore.model.newNetwork.UniqueTournamentAchievements;
import com.sofascore.model.newNetwork.UniqueTournamentWinner;
import java.io.File;
import java.time.DayOfWeek;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class q6i implements Comparator {
    public static final /* synthetic */ q6i b = new q6i(25);
    public static final /* synthetic */ q6i c = new q6i(27);
    public static final /* synthetic */ q6i d = new q6i(28);
    public static final /* synthetic */ q6i e = new q6i(29);
    public final /* synthetic */ int a;

    public /* synthetic */ q6i(int i) {
        this.a = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x0244, code lost:
    
        if (r8 != null) goto L82;
     */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int compare(Object obj, Object obj2) {
        Integer num;
        String competitionType;
        String competitionType2;
        int i = -1;
        int i2 = 0;
        switch (this.a) {
            case 0:
                DayOfWeek dayOfWeek = hwc.a;
                Integer c2 = hwc.c(((o6i) obj).a);
                Integer valueOf = Integer.valueOf(c2 != null ? c2.intValue() : Integer.MAX_VALUE);
                Integer c3 = hwc.c(((o6i) obj2).a);
                return valueOf.compareTo(Integer.valueOf(c3 != null ? c3.intValue() : Integer.MAX_VALUE));
            case 1:
                return Integer.valueOf(((Category) obj2).getPriority()).compareTo(Integer.valueOf(((Category) obj).getPriority()));
            case 2:
                return Long.valueOf(((StandingsFormEvent) obj).getStartTimestamp()).compareTo(Long.valueOf(((StandingsFormEvent) obj2).getStartTimestamp()));
            case 3:
                return o93.b((String) ((Pair) obj).a, (String) ((Pair) obj2).a);
            case 4:
                return o93.b(((psi) obj).a, ((psi) obj2).a);
            case 5:
                return o93.b(((rsi) obj).a, ((rsi) obj2).a);
            case 6:
                String str = (String) obj;
                Iterator it = Season.SubSeasonType.getEntries().iterator();
                int i3 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i3 = -1;
                    } else if (!Intrinsics.c(((Season.SubSeasonType) it.next()).getLabel(), str)) {
                        i3++;
                    }
                }
                Integer valueOf2 = Integer.valueOf(i3);
                String str2 = (String) obj2;
                Iterator it2 = Season.SubSeasonType.getEntries().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (Intrinsics.c(((Season.SubSeasonType) it2.next()).getLabel(), str2)) {
                            i = i2;
                        } else {
                            i2++;
                        }
                    }
                }
                return valueOf2.compareTo(Integer.valueOf(i));
            case 7:
                Integer num2 = Integer.MAX_VALUE;
                UniqueTournament uniqueTournament = ((UniqueTournamentAchievements) obj).getUniqueTournament();
                if (uniqueTournament != null && (competitionType2 = uniqueTournament.getCompetitionType()) != null) {
                    wk2.f.getClass();
                    wk2 r = inb.r(competitionType2);
                    if (r == null) {
                        num = null;
                        break;
                    } else {
                        num = Integer.valueOf(r.ordinal());
                        break;
                    }
                }
                num = num2;
                UniqueTournament uniqueTournament2 = ((UniqueTournamentAchievements) obj2).getUniqueTournament();
                if (uniqueTournament2 != null && (competitionType = uniqueTournament2.getCompetitionType()) != null) {
                    wk2.f.getClass();
                    wk2 r2 = inb.r(competitionType);
                    Integer valueOf3 = r2 != null ? Integer.valueOf(r2.ordinal()) : null;
                    if (valueOf3 != null) {
                        num2 = valueOf3;
                    }
                }
                return num.compareTo(num2);
            case 8:
                return ((View) obj).getTop() - ((View) obj2).getTop();
            case 9:
                return o93.b((String) ((oxh) obj).a, (String) ((oxh) obj2).a);
            case 10:
                return Integer.valueOf(((UniqueTournamentWinner) obj2).getYear()).compareTo(Integer.valueOf(((UniqueTournamentWinner) obj).getYear()));
            case 11:
                return Long.valueOf(((UniqueTournament) obj2).getUserCount()).compareTo(Long.valueOf(((UniqueTournament) obj).getUserCount()));
            case 12:
                return Boolean.valueOf(Intrinsics.c(((ilk) obj2).e, "streaming")).compareTo(Boolean.valueOf(Intrinsics.c(((ilk) obj).e, "streaming")));
            case 13:
                ktk ktkVar = (ktk) obj;
                ktk ktkVar2 = (ktk) obj2;
                if (ktkVar.a() > ktkVar2.a()) {
                    return -1;
                }
                return ktkVar.a() < ktkVar2.a() ? 1 : 0;
            case 14:
                return ((cuk) obj).b - ((cuk) obj2).b;
            case 15:
                return Integer.valueOf(((ffl) obj2).a).compareTo(Integer.valueOf(((ffl) obj).a));
            case 16:
                return o93.b((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
            case 17:
                TournamentRoundWrapper tournamentRoundWrapper = (TournamentRoundWrapper) obj2;
                Long valueOf4 = Long.valueOf(tournamentRoundWrapper.getStartDateTimestamp());
                if (valueOf4.longValue() == 0) {
                    valueOf4 = null;
                }
                Long valueOf5 = Long.valueOf(valueOf4 != null ? valueOf4.longValue() : tournamentRoundWrapper.getCreatedAtTimestamp());
                TournamentRoundWrapper tournamentRoundWrapper2 = (TournamentRoundWrapper) obj;
                Long valueOf6 = Long.valueOf(tournamentRoundWrapper2.getStartDateTimestamp());
                Long l = valueOf6.longValue() != 0 ? valueOf6 : null;
                return valueOf5.compareTo(Long.valueOf(l != null ? l.longValue() : tournamentRoundWrapper2.getCreatedAtTimestamp()));
            case 18:
                return Long.valueOf(((xel) obj).a.p).compareTo(Long.valueOf(((xel) obj2).a.p));
            case 19:
                return Integer.valueOf(((CupTreeRound) obj).getOrder()).compareTo(Integer.valueOf(((CupTreeRound) obj2).getOrder()));
            case 20:
                return Integer.valueOf(((CupTreeBlock) obj).getOrder()).compareTo(Integer.valueOf(((CupTreeBlock) obj2).getOrder()));
            case 21:
                return Long.valueOf(((rxb) obj).a.getStartTimestamp()).compareTo(Long.valueOf(((rxb) obj2).a.getStartTimestamp()));
            case 22:
                return Integer.valueOf(((PowerRanking) obj).getRank()).compareTo(Integer.valueOf(((PowerRanking) obj2).getRank()));
            case 23:
                return o93.b(((pol) obj).a, ((pol) obj2).a);
            case 24:
                long lastModified = ((File) obj2).lastModified() - ((File) obj).lastModified();
                if (lastModified == 0) {
                    return 0;
                }
                return lastModified < 0 ? -1 : 1;
            case 25:
                Parcelable.Creator<GoogleSignInAccount> creator = GoogleSignInAccount.CREATOR;
                return ((Scope) obj).b.compareTo(((Scope) obj2).b);
            case 26:
                return ((Scope) obj).b.compareTo(((Scope) obj2).b);
            case 27:
                return ((r4n) Collections.max((List) obj)).compareTo((r4n) Collections.max((List) obj2));
            case 28:
                return Integer.compare(((l5n) ((List) obj).get(0)).f, ((l5n) ((List) obj2).get(0)).f);
            default:
                return ((w5n) ((List) obj).get(0)).compareTo((w5n) ((List) obj2).get(0));
        }
    }
}
