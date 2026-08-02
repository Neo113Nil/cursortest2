package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.format.DateFormat;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Score;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.model.newNetwork.topperformance.TeamTopPlayer;
import com.sofascore.model.newNetwork.topperformance.TeamTopPlayerResponse;
import com.sofascore.results.R;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class tll {
    public final Context a;
    public final w3b b;
    public final j0j c;
    public final cg4 d;

    public tll(Context context, w3b w3bVar, j0j j0jVar, cg4 cg4Var) {
        w3bVar.getClass();
        j0jVar.getClass();
        cg4Var.getClass();
        this.a = context;
        this.b = w3bVar;
        this.c = j0jVar;
        this.d = cg4Var;
    }

    public static mll d(Event event, p7l p7lVar, Bitmap bitmap, Bitmap bitmap2) {
        Pair pair;
        Pair pair2;
        Integer valueOf = Integer.valueOf(R.color.stayDarkLive);
        Integer valueOf2 = Integer.valueOf(R.color.on_color_primary);
        Integer valueOf3 = Integer.valueOf(R.color.on_color_secondary);
        boolean z = p7lVar == p7l.b;
        Score homeScore$default = Event.getHomeScore$default(event, null, 1, null);
        Score awayScore$default = Event.getAwayScore$default(event, null, 1, null);
        Integer display = homeScore$default.getDisplay();
        String valueOf4 = display != null ? String.valueOf(display.intValue()) : null;
        if (valueOf4 == null) {
            valueOf4 = "";
        }
        Integer display2 = awayScore$default.getDisplay();
        String valueOf5 = display2 != null ? String.valueOf(display2.intValue()) : null;
        String str = valueOf5 != null ? valueOf5 : "";
        if (z) {
            pair = new Pair(valueOf, valueOf);
        } else {
            Integer display3 = homeScore$default.getDisplay();
            int intValue = display3 != null ? display3.intValue() : 0;
            Integer display4 = awayScore$default.getDisplay();
            if (intValue > (display4 != null ? display4.intValue() : 0)) {
                pair2 = new Pair(valueOf2, valueOf3);
            } else {
                Integer display5 = awayScore$default.getDisplay();
                int intValue2 = display5 != null ? display5.intValue() : 0;
                Integer display6 = homeScore$default.getDisplay();
                if (intValue2 > (display6 != null ? display6.intValue() : 0)) {
                    pair2 = new Pair(valueOf3, valueOf2);
                } else {
                    Integer penalties = homeScore$default.getPenalties();
                    int intValue3 = penalties != null ? penalties.intValue() : 0;
                    Integer penalties2 = awayScore$default.getPenalties();
                    if (intValue3 > (penalties2 != null ? penalties2.intValue() : 0)) {
                        pair2 = new Pair(valueOf2, valueOf3);
                    } else {
                        Integer penalties3 = awayScore$default.getPenalties();
                        int intValue4 = penalties3 != null ? penalties3.intValue() : 0;
                        Integer penalties4 = homeScore$default.getPenalties();
                        if (intValue4 > (penalties4 != null ? penalties4.intValue() : 0)) {
                            pair2 = new Pair(valueOf3, valueOf2);
                        } else {
                            pair = new Pair(valueOf3, valueOf3);
                        }
                    }
                }
            }
            pair = pair2;
        }
        int intValue5 = ((Number) pair.a).intValue();
        int intValue6 = ((Number) pair.b).intValue();
        int id = event.getId();
        jfj jfjVar = new jfj(4, valueOf4, Integer.valueOf(intValue5));
        Integer penalties5 = homeScore$default.getPenalties();
        jfj jfjVar2 = penalties5 != null ? new jfj(4, lnb.k(penalties5.intValue(), "(", ")"), Integer.valueOf(intValue5)) : null;
        jfj jfjVar3 = new jfj(4, str, Integer.valueOf(intValue6));
        Integer penalties6 = awayScore$default.getPenalties();
        return new mll(id, p7lVar, bitmap, bitmap2, jfjVar, jfjVar2, jfjVar3, penalties6 != null ? new jfj(4, lnb.k(penalties6.intValue(), "(", ")"), Integer.valueOf(intValue6)) : null);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(sq3 sq3Var) {
        qll qllVar;
        int i;
        String str;
        if (sq3Var instanceof qll) {
            qllVar = (qll) sq3Var;
            int i2 = qllVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qllVar.t = i2 - Integer.MIN_VALUE;
                Object obj = qllVar.r;
                lu3 lu3Var = lu3.a;
                i = qllVar.t;
                if (i != 0) {
                    y6a.M(obj);
                    qllVar.t = 1;
                    obj = this.d.e("WC_26_MY_TEAM_ALPHA2", null, qllVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                str = (String) obj;
                if (str != null || str.length() <= 0) {
                    return null;
                }
                return str;
            }
        }
        qllVar = new qll(this, sq3Var);
        Object obj2 = qllVar.r;
        lu3 lu3Var2 = lu3.a;
        i = qllVar.t;
        if (i != 0) {
        }
        str = (String) obj2;
        if (str != null) {
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(int i, sq3 sq3Var) {
        rll rllVar;
        int i2;
        TeamTopPlayerResponse teamTopPlayerResponse;
        TeamTopPlayer topPlayer;
        if (sq3Var instanceof rll) {
            rllVar = (rll) sq3Var;
            int i3 = rllVar.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                rllVar.t = i3 - Integer.MIN_VALUE;
                Object obj = rllVar.r;
                lu3 lu3Var = lu3.a;
                i2 = rllVar.t;
                rq3 rq3Var = null;
                if (i2 != 0) {
                    y6a.M(obj);
                    rllVar.t = 1;
                    j0j j0jVar = this.c;
                    j0jVar.getClass();
                    obj = yaa.P(new azi(j0jVar, i, rq3Var, 18), rllVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                teamTopPlayerResponse = (TeamTopPlayerResponse) yaa.x((x2g) obj);
                if (teamTopPlayerResponse != null || (topPlayer = teamTopPlayerResponse.getTopPlayer()) == null) {
                    return null;
                }
                return new dmj(topPlayer.getPlayer().getId(), topPlayer.getRating());
            }
        }
        rllVar = new rll(this, sq3Var);
        Object obj2 = rllVar.r;
        lu3 lu3Var2 = lu3.a;
        i2 = rllVar.t;
        rq3 rq3Var2 = null;
        if (i2 != 0) {
        }
        teamTopPlayerResponse = (TeamTopPlayerResponse) yaa.x((x2g) obj2);
        if (teamTopPlayerResponse != null) {
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(sq3 sq3Var) {
        sll sllVar;
        int i;
        if (sq3Var instanceof sll) {
            sllVar = (sll) sq3Var;
            int i2 = sllVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sllVar.t = i2 - Integer.MIN_VALUE;
                Object obj = sllVar.r;
                lu3 lu3Var = lu3.a;
                i = sllVar.t;
                if (i != 0) {
                    y6a.M(obj);
                    sllVar.t = 1;
                    obj = this.d.e("WC_26_MY_TEAM_ALPHA2", null, sllVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                String str = (String) obj;
                return Boolean.valueOf(str == null && str.length() > 0);
            }
        }
        sllVar = new sll(this, sq3Var);
        Object obj2 = sllVar.r;
        lu3 lu3Var2 = lu3.a;
        i = sllVar.t;
        if (i != 0) {
        }
        String str2 = (String) obj2;
        return Boolean.valueOf(str2 == null && str2.length() > 0);
    }

    public final mll e(Event event, Map map) {
        Bitmap bitmap = (Bitmap) map.get(Integer.valueOf(Event.getHomeTeam$default(event, null, 1, null).getId()));
        Bitmap bitmap2 = (Bitmap) map.get(Integer.valueOf(Event.getAwayTeam$default(event, null, 1, null).getId()));
        String type = event.getStatus().getType();
        int hashCode = type.hashCode();
        if (hashCode == -1947652542 ? type.equals(StatusKt.STATUS_INTERRUPTED) : !(hashCode == -1411655086 ? !type.equals(StatusKt.STATUS_IN_PROGRESS) : !(hashCode == 527231609 && type.equals(StatusKt.STATUS_WILL_CONTINUE)))) {
            return d(event, p7l.b, bitmap, bitmap2);
        }
        if (event.getStartTimestamp() < yaa.w()) {
            return d(event, p7l.a, bitmap, bitmap2);
        }
        p7l p7lVar = p7l.c;
        Integer valueOf = Integer.valueOf(R.color.on_color_primary);
        long startTimestamp = event.getStartTimestamp();
        bi4 bi4Var = bi4.PATTERN_DMM;
        ConcurrentHashMap concurrentHashMap = hk4.a;
        String i = fc6.i(startTimestamp, hk4.a(bi4Var.d()));
        long startTimestamp2 = event.getStartTimestamp();
        String bestPattern = hk4.b().getBestPattern(DateFormat.is24HourFormat(this.a) ? "Hm" : "hm");
        bestPattern.getClass();
        return new mll(event.getId(), p7lVar, bitmap, bitmap2, new jfj(4, i, valueOf), null, new jfj(4, fc6.i(startTimestamp2, hk4.a(bestPattern)), valueOf), null);
    }
}
