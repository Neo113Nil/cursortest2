package defpackage;

import com.sofascore.results.R;
import kotlin.jvm.functions.Function1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class y4b {
    public static final y4b c;
    public static final y4b d;
    public static final y4b e;
    public static final y4b f;
    public static final y4b g;
    public static final y4b h;
    public static final y4b i;
    public static final y4b j;
    public static final y4b k;
    public static final /* synthetic */ y4b[] l;
    public static final /* synthetic */ kp5 m;
    public final int a;
    public final Function1 b;

    static {
        y4b y4bVar = new y4b("DETAILS", 0, R.string.details, q4b.b);
        c = y4bVar;
        y4b y4bVar2 = new y4b("MATCHES", 1, R.string.matches, r4b.b);
        d = y4bVar2;
        y4b y4bVar3 = new y4b("STANDINGS", 2, R.string.standings, s4b.b);
        e = y4bVar3;
        y4b y4bVar4 = new y4b("KNOCKOUT", 3, R.string.competition_type_knockout, t4b.b);
        f = y4bVar4;
        y4b y4bVar5 = new y4b("STATS", 4, R.string.league_tab_stats, new isa(22));
        g = y4bVar5;
        y4b y4bVar6 = new y4b("POWER_RANKINGS", 5, R.string.power_rankings, u4b.b);
        h = y4bVar6;
        y4b y4bVar7 = new y4b("TRANSACTIONS", 6, R.string.transactions, v4b.b);
        i = y4bVar7;
        y4b y4bVar8 = new y4b("DRAFT", 7, R.string.player_draft, w4b.b);
        j = y4bVar8;
        y4b y4bVar9 = new y4b("AWARDS", 8, R.string.awards, x4b.b);
        k = y4bVar9;
        y4b[] y4bVarArr = {y4bVar, y4bVar2, y4bVar3, y4bVar4, y4bVar5, y4bVar6, y4bVar7, y4bVar8, y4bVar9};
        l = y4bVarArr;
        m = new kp5(y4bVarArr);
    }

    public y4b(String str, int i2, int i3, Function1 function1) {
        this.a = i3;
        this.b = function1;
    }

    public static y4b valueOf(String str) {
        return (y4b) Enum.valueOf(y4b.class, str);
    }

    public static y4b[] values() {
        return (y4b[]) l.clone();
    }
}
