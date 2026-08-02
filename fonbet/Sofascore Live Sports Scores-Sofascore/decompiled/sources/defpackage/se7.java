package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.sofascore.model.fantasy.FantasyPlayerFixture;
import com.sofascore.model.fantasy.FantasyPlayerPriceChanges;
import com.sofascore.model.fantasy.FantasyTopPlayerRoundWrapper;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Incident;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.TournamentRoundWrapper;
import com.sofascore.model.newNetwork.BaseHockeyShotmapItem;
import com.sofascore.model.newNetwork.PlayerWithDepthAssignment;
import com.sofascore.model.newNetwork.TopFollowedPlayerInfo;
import com.sofascore.results.fantasy.ui.model.FantasyRoundPlayerUiModel;
import java.nio.charset.Charset;
import java.util.Comparator;
import kotlin.Pair;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class se7 implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ se7(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Long l;
        switch (this.a) {
            case 0:
                return Integer.valueOf(((FantasyTopPlayerRoundWrapper) obj2).getRound().getSequence()).compareTo(Integer.valueOf(((FantasyTopPlayerRoundWrapper) obj).getRound().getSequence()));
            case 1:
                return Float.valueOf(((FantasyPlayerPriceChanges) obj).getTotalPriceChange()).compareTo(Float.valueOf(((FantasyPlayerPriceChanges) obj2).getTotalPriceChange()));
            case 2:
                return Float.valueOf(((FantasyPlayerPriceChanges) obj2).getTotalPriceChange()).compareTo(Float.valueOf(((FantasyPlayerPriceChanges) obj).getTotalPriceChange()));
            case 3:
                return Float.valueOf(((FantasyPlayerPriceChanges) obj2).getTotalPriceChange()).compareTo(Float.valueOf(((FantasyPlayerPriceChanges) obj).getTotalPriceChange()));
            case 4:
                return Long.valueOf(((FantasyPlayerFixture) obj).getEventStartTimestamp()).compareTo(Long.valueOf(((FantasyPlayerFixture) obj2).getEventStartTimestamp()));
            case 5:
                return Long.valueOf(((qx6) obj).a.p).compareTo(Long.valueOf(((qx6) obj2).a.p));
            case 6:
                rz6 rz6Var = ((FantasyRoundPlayerUiModel) obj).b;
                rz6 rz6Var2 = rz6.h;
                return Boolean.valueOf(rz6Var != rz6Var2).compareTo(Boolean.valueOf(((FantasyRoundPlayerUiModel) obj2).b != rz6Var2));
            case 7:
                return Boolean.valueOf(((FantasyRoundPlayerUiModel) obj).k).compareTo(Boolean.valueOf(((FantasyRoundPlayerUiModel) obj2).k));
            case 8:
                return Integer.valueOf(((FantasyRoundPlayerUiModel) obj).d).compareTo(Integer.valueOf(((FantasyRoundPlayerUiModel) obj2).d));
            case 9:
                return Long.valueOf(((ho7) obj).a.e).compareTo(Long.valueOf(((ho7) obj2).a.e));
            case 10:
                return Long.valueOf(((Event) obj).getStartTimestamp()).compareTo(Long.valueOf(((Event) obj2).getStartTimestamp()));
            case 11:
                TournamentRoundWrapper tournamentRoundWrapper = (TournamentRoundWrapper) obj2;
                Long valueOf = Long.valueOf(tournamentRoundWrapper.getStartDateTimestamp());
                if (valueOf.longValue() == 0) {
                    valueOf = null;
                }
                Long valueOf2 = Long.valueOf(valueOf != null ? valueOf.longValue() : tournamentRoundWrapper.getCreatedAtTimestamp());
                TournamentRoundWrapper tournamentRoundWrapper2 = (TournamentRoundWrapper) obj;
                Long valueOf3 = Long.valueOf(tournamentRoundWrapper2.getStartDateTimestamp());
                l = valueOf3.longValue() != 0 ? valueOf3 : null;
                return valueOf2.compareTo(Long.valueOf(l != null ? l.longValue() : tournamentRoundWrapper2.getCreatedAtTimestamp()));
            case 12:
                rz6 rz6Var3 = ((FantasyRoundPlayerUiModel) obj).b;
                rz6 rz6Var4 = rz6.h;
                return Boolean.valueOf(rz6Var3 != rz6Var4).compareTo(Boolean.valueOf(((FantasyRoundPlayerUiModel) obj2).b != rz6Var4));
            case 13:
                fv8 fv8Var = (fv8) obj;
                fv8 fv8Var2 = (fv8) obj2;
                RecyclerView recyclerView = fv8Var.d;
                if ((recyclerView == null) == (fv8Var2.d == null)) {
                    boolean z = fv8Var.a;
                    if (z == fv8Var2.a) {
                        int i = fv8Var2.b - fv8Var.b;
                        if (i != 0) {
                            return i;
                        }
                        int i2 = fv8Var.c - fv8Var2.c;
                        if (i2 != 0) {
                            return i2;
                        }
                        return 0;
                    }
                    if (!z) {
                        return 1;
                    }
                } else if (recyclerView == null) {
                    return 1;
                }
                return -1;
            case 14:
                return ((bdi) obj).d - ((bdi) obj2).d;
            case 15:
                int type = ((wd9) obj).a.getType();
                BaseHockeyShotmapItem.ShotmapItemType shotmapItemType = BaseHockeyShotmapItem.ShotmapItemType.GOAL;
                return Boolean.valueOf(type == shotmapItemType.getId()).compareTo(Boolean.valueOf(((wd9) obj2).a.getType() == shotmapItemType.getId()));
            case 16:
                return o93.b(tba.t((Player) obj), tba.t((Player) obj2));
            case 17:
                return o93.b(gz8.J((Charset) obj), gz8.J((Charset) obj2));
            case 18:
                return o93.b((Float) ((Pair) obj2).b, (Float) ((Pair) obj).b);
            case 19:
                Integer depth = ((PlayerWithDepthAssignment) obj).getDepth();
                Integer valueOf4 = Integer.valueOf(depth != null ? depth.intValue() : Integer.MAX_VALUE);
                Integer depth2 = ((PlayerWithDepthAssignment) obj2).getDepth();
                return valueOf4.compareTo(Integer.valueOf(depth2 != null ? depth2.intValue() : Integer.MAX_VALUE));
            case 20:
                Integer depth3 = ((PlayerWithDepthAssignment) obj).getDepth();
                Integer valueOf5 = Integer.valueOf(depth3 != null ? depth3.intValue() : Integer.MAX_VALUE);
                Integer depth4 = ((PlayerWithDepthAssignment) obj2).getDepth();
                return valueOf5.compareTo(Integer.valueOf(depth4 != null ? depth4.intValue() : Integer.MAX_VALUE));
            case 21:
                return Integer.valueOf(((bfc) obj2).c.length()).compareTo(Integer.valueOf(((bfc) obj).c.length()));
            case 22:
                return Long.valueOf(((TopFollowedPlayerInfo) obj2).getPlayer().getUserCount()).compareTo(Long.valueOf(((TopFollowedPlayerInfo) obj).getPlayer().getUserCount()));
            case 23:
                TournamentRoundWrapper tournamentRoundWrapper3 = (TournamentRoundWrapper) obj2;
                Long valueOf6 = Long.valueOf(tournamentRoundWrapper3.getStartDateTimestamp());
                if (valueOf6.longValue() == 0) {
                    valueOf6 = null;
                }
                Long valueOf7 = Long.valueOf(valueOf6 != null ? valueOf6.longValue() : tournamentRoundWrapper3.getCreatedAtTimestamp());
                TournamentRoundWrapper tournamentRoundWrapper4 = (TournamentRoundWrapper) obj;
                Long valueOf8 = Long.valueOf(tournamentRoundWrapper4.getStartDateTimestamp());
                l = valueOf8.longValue() != 0 ? valueOf8 : null;
                return valueOf7.compareTo(Long.valueOf(l != null ? l.longValue() : tournamentRoundWrapper4.getCreatedAtTimestamp()));
            case 24:
                return Integer.valueOf(((jrj) obj).e).compareTo(Integer.valueOf(((jrj) obj2).e));
            case 25:
                return o93.b(((oxh) obj).b, ((oxh) obj2).b);
            case 26:
                return o93.b(((oxh) obj).b, ((oxh) obj2).b);
            case 27:
                return o93.b(((Incident.SubstitutionIncident) obj).getTime(), ((Incident.SubstitutionIncident) obj2).getTime());
            case 28:
                return Boolean.valueOf(((vab) obj2).e).compareTo(Boolean.valueOf(((vab) obj).e));
            default:
                return ((Comparable) obj).compareTo((Comparable) obj2);
        }
    }
}
