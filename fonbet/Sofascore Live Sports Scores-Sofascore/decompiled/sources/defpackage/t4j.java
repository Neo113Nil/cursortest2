package defpackage;

import com.sofascore.results.R;
import kotlin.jvm.functions.Function1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class t4j {
    public static final t4j c;
    public static final t4j d;
    public static final t4j e;
    public static final t4j f;
    public static final t4j g;
    public static final t4j h;
    public static final t4j i;
    public static final /* synthetic */ t4j[] j;
    public static final /* synthetic */ kp5 k;
    public final int a;
    public final Function1 b;

    static {
        t4j t4jVar = new t4j("DETAILS", 0, R.string.details, new i1j(12));
        c = t4jVar;
        t4j t4jVar2 = new t4j("MATCHES", 1, R.string.matches, new i1j(13));
        d = t4jVar2;
        t4j t4jVar3 = new t4j("STANDINGS", 2, R.string.standings, n4j.b);
        e = t4jVar3;
        t4j t4jVar4 = new t4j("PLAYER_STATISTICS", 3, R.string.tab_player_stats, o4j.b);
        t4j t4jVar5 = new t4j("SQUAD", 4, R.string.squad, p4j.b);
        f = t4jVar5;
        t4j t4jVar6 = new t4j("TOP_PLAYERS", 5, R.string.top_players, q4j.b);
        g = t4jVar6;
        t4j t4jVar7 = new t4j("STATISTICS", 6, R.string.statistics, r4j.b);
        h = t4jVar7;
        t4j t4jVar8 = new t4j("MEDIA", 7, R.string.media, s4j.b);
        i = t4jVar8;
        t4j[] t4jVarArr = {t4jVar, t4jVar2, t4jVar3, t4jVar4, t4jVar5, t4jVar6, t4jVar7, t4jVar8};
        j = t4jVarArr;
        k = new kp5(t4jVarArr);
    }

    public t4j(String str, int i2, int i3, Function1 function1) {
        this.a = i3;
        this.b = function1;
    }

    public static t4j valueOf(String str) {
        return (t4j) Enum.valueOf(t4j.class, str);
    }

    public static t4j[] values() {
        return (t4j[]) j.clone();
    }
}
