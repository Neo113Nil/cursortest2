package defpackage;

import com.sofascore.model.mvvm.IRecent;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Manager;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Referee;
import com.sofascore.model.mvvm.model.Sport;
import com.sofascore.model.mvvm.model.Stage;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.UniqueStage;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.newNetwork.PredictedEvent;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class jaf extends j25 {
    public final /* synthetic */ int a;

    public /* synthetic */ jaf(int i) {
        this.a = i;
    }

    @Override // defpackage.j25
    public final boolean a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                yaf yafVar = (yaf) obj;
                yaf yafVar2 = (yaf) obj2;
                yafVar.getClass();
                yafVar2.getClass();
                if ((yafVar instanceof xaf) && (yafVar2 instanceof xaf)) {
                    PredictedEvent predictedEvent = ((xaf) yafVar).a;
                    long startDateTimestamp = predictedEvent.getStartDateTimestamp();
                    PredictedEvent predictedEvent2 = ((xaf) yafVar2).a;
                    return startDateTimestamp == predictedEvent2.getStartDateTimestamp() && Intrinsics.c(predictedEvent.getHomeTeamScore(), predictedEvent2.getHomeTeamScore()) && Intrinsics.c(predictedEvent.getAwayTeamScore(), predictedEvent2.getAwayTeamScore()) && Intrinsics.c(predictedEvent.getHomeNameCode(), predictedEvent2.getHomeNameCode()) && Intrinsics.c(predictedEvent.getAwayNameCode(), predictedEvent2.getAwayNameCode()) && Intrinsics.c(predictedEvent.getVotes(), predictedEvent2.getVotes());
                }
                if ((yafVar instanceof waf) && (yafVar2 instanceof waf)) {
                    return ((waf) yafVar).a.equals(((waf) yafVar2).a);
                }
                return false;
            default:
                obj.getClass();
                obj2.getClass();
                IRecent iRecent = obj instanceof IRecent ? (IRecent) obj : null;
                Boolean valueOf = iRecent != null ? Boolean.valueOf(iRecent.getIsRecent()) : null;
                Boolean bool = Boolean.TRUE;
                if (!Intrinsics.c(valueOf, bool)) {
                    return false;
                }
                IRecent iRecent2 = obj2 instanceof IRecent ? (IRecent) obj2 : null;
                if (!Intrinsics.c(iRecent2 != null ? Boolean.valueOf(iRecent2.getIsRecent()) : null, bool)) {
                    return false;
                }
                if ((obj instanceof Player) && (obj2 instanceof Player)) {
                    return obj.equals(obj2);
                }
                if ((obj instanceof Team) && (obj2 instanceof Team)) {
                    return obj.equals(obj2);
                }
                if ((obj instanceof UniqueTournament) && (obj2 instanceof UniqueTournament)) {
                    return obj.equals(obj2);
                }
                if ((obj instanceof Manager) && (obj2 instanceof Manager)) {
                    return obj.equals(obj2);
                }
                if ((obj instanceof Referee) && (obj2 instanceof Referee)) {
                    return obj.equals(obj2);
                }
                if ((obj instanceof Event) && (obj2 instanceof Event)) {
                    return obj.equals(obj2);
                }
                if ((obj instanceof Stage) && (obj2 instanceof Stage)) {
                    return obj.equals(obj2);
                }
                if ((obj instanceof UniqueStage) && (obj2 instanceof UniqueStage)) {
                    return obj.equals(obj2);
                }
                if ((obj instanceof Sport) && (obj2 instanceof Sport)) {
                    return obj.equals(obj2);
                }
                if ((obj instanceof String) && (obj2 instanceof String)) {
                    return obj.equals(obj2);
                }
                if ((obj instanceof Integer) && (obj2 instanceof Integer)) {
                    return obj.equals(obj2);
                }
                return false;
        }
    }

    @Override // defpackage.j25
    public final boolean b(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                yaf yafVar = (yaf) obj;
                yaf yafVar2 = (yaf) obj2;
                yafVar.getClass();
                yafVar2.getClass();
                if (!(yafVar instanceof xaf) || !(yafVar2 instanceof xaf)) {
                    if ((yafVar instanceof waf) && (yafVar2 instanceof waf)) {
                        break;
                    }
                } else if (((xaf) yafVar).a.getId() == ((xaf) yafVar2).a.getId()) {
                }
                break;
            default:
                obj.getClass();
                obj2.getClass();
                if ((obj instanceof Player) && (obj2 instanceof Player)) {
                    if (((Player) obj).getId() == ((Player) obj2).getId()) {
                    }
                } else if ((obj instanceof Team) && (obj2 instanceof Team)) {
                    if (((Team) obj).getId() == ((Team) obj2).getId()) {
                    }
                } else if ((obj instanceof UniqueTournament) && (obj2 instanceof UniqueTournament)) {
                    if (((UniqueTournament) obj).getId() == ((UniqueTournament) obj2).getId()) {
                    }
                } else if ((obj instanceof Manager) && (obj2 instanceof Manager)) {
                    if (((Manager) obj).getId() == ((Manager) obj2).getId()) {
                    }
                } else if ((obj instanceof Referee) && (obj2 instanceof Referee)) {
                    if (((Referee) obj).getId() == ((Referee) obj2).getId()) {
                    }
                } else if ((obj instanceof Event) && (obj2 instanceof Event)) {
                    if (((Event) obj).getId() == ((Event) obj2).getId()) {
                    }
                } else if ((obj instanceof Stage) && (obj2 instanceof Stage)) {
                    if (((Stage) obj).getId() == ((Stage) obj2).getId()) {
                    }
                } else if ((obj instanceof UniqueStage) && (obj2 instanceof UniqueStage)) {
                    if (((UniqueStage) obj).getId() == ((UniqueStage) obj2).getId()) {
                    }
                } else if (!(obj instanceof Sport) || !(obj2 instanceof Sport)) {
                    if ((obj instanceof String) && (obj2 instanceof String)) {
                        break;
                    } else if ((obj instanceof Integer) && (obj2 instanceof Integer)) {
                    }
                } else if (((Sport) obj).getId() == ((Sport) obj2).getId()) {
                }
                break;
        }
        return false;
    }
}
