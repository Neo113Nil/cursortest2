package defpackage;

import com.sofascore.model.mvvm.model.PlayerKt;
import com.sofascore.results.R;
import java.util.List;
import kotlin.collections.a;
import kotlin.collections.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class yt {
    public static final yt c;
    public static final /* synthetic */ yt[] d;
    public static final /* synthetic */ kp5 e;
    public final int a;
    public final List b;

    static {
        yt ytVar = new yt(0, R.string.all, "ALL", null);
        c = ytVar;
        yt[] ytVarArr = {ytVar, new yt(1, R.string.am_football_quarterbacks, "QUARTERBACKS", a.c(PlayerKt.AMERICAN_FOOTBALL_QUARTERBACK)), new yt(2, R.string.am_football_running_backs, "RUNNING_BACKS", b.j("RB", PlayerKt.AMERICAN_FOOTBALL_FULLBACK)), new yt(3, R.string.am_football_receivers, "RECEIVERS", b.j(PlayerKt.AMERICAN_FOOTBALL_WIDE_RECEIVER, PlayerKt.AMERICAN_FOOTBALL_TIGHT_END)), new yt(4, R.string.am_football_offensive_line, "OFFENSIVE_LINE", b.j(PlayerKt.AMERICAN_FOOTBALL_OFFENSIVE_TACKLE, PlayerKt.AMERICAN_FOOTBALL_OFFENSIVE_LINEMAN, PlayerKt.AMERICAN_FOOTBALL_OFFENSIVE_GUARD, "C", "T", "G")), new yt(5, R.string.am_football_defensive_line, "DEFENSIVE_LINE", b.j(PlayerKt.AMERICAN_FOOTBALL_DEFENSIVE_TACKLE, PlayerKt.AMERICAN_FOOTBALL_DEFENSIVE_LINEMAN, PlayerKt.AMERICAN_FOOTBALL_DEFENSIVE_END, PlayerKt.AMERICAN_FOOTBALL_NOSE_TACKLE)), new yt(6, R.string.am_football_defensive_backs, "DEFENSIVE_BACKS", b.j(PlayerKt.AMERICAN_FOOTBALL_DEFENSIVE_BACK, PlayerKt.AMERICAN_FOOTBALL_STRONG_SAFETY, PlayerKt.AMERICAN_FOOTBALL_FREE_SAFETY, "CB", PlayerKt.AMERICAN_FOOTBALL_SAFETY)), new yt(7, R.string.am_football_linebackers, "LINEBACKERS", b.j(PlayerKt.AMERICAN_FOOTBALL_OUTSIDE_LINEBACK, "LB", PlayerKt.AMERICAN_FOOTBALL_MIDDLE_LINEBACK, PlayerKt.AMERICAN_FOOTBALL_INSIDE_LINEBACK)), new yt(8, R.string.amf_kicker, "KICKERS", a.c(PlayerKt.AMERICAN_FOOTBALL_KICKER)), new yt(9, R.string.amf_punter, "PUNTERS", a.c("P"))};
        d = ytVarArr;
        e = new kp5(ytVarArr);
    }

    public yt(int i, int i2, String str, List list) {
        this.a = i2;
        this.b = list;
    }

    public static yt valueOf(String str) {
        return (yt) Enum.valueOf(yt.class, str);
    }

    public static yt[] values() {
        return (yt[]) d.clone();
    }
}
