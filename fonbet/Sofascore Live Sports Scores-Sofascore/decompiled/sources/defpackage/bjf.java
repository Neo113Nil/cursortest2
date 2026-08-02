package defpackage;

import com.sofascore.results.R;
import kotlin.jvm.functions.Function1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class bjf {
    public static final /* synthetic */ bjf[] f;
    public static final /* synthetic */ kp5 g;
    public final Object a;
    public final r9k b;
    public final cjf c;
    public final Function1 d;
    public final boolean e;

    static {
        Integer valueOf = Integer.valueOf(R.drawable.ic_menu_list_settings);
        q9k q9kVar = new q9k(R.string.developer_options);
        cjf cjfVar = cjf.a;
        bjf[] bjfVarArr = {new bjf("DEVELOPER_OPTIONS", 0, valueOf, q9kVar, new b1f(25), 48), new bjf("NOTIFICATION", 1, Integer.valueOf(R.drawable.ic_notification_default), new q9k(R.string.profile_notifications), null, 56), new bjf("SETTINGS", 2, valueOf, new q9k(R.string.profile_preferences), null, 60), new bjf("PICKEM", 3, Integer.valueOf(R.drawable.ic_pickem), new q9k(R.string.pickem), new b1f(26), 48), new bjf("PLAYER_TRANSFERS", 4, Integer.valueOf(R.drawable.ic_swap), new q9k(R.string.transfers), null, 56), new bjf("TV_SCHEDULE", 5, Integer.valueOf(R.drawable.ic_tv), new q9k(R.string.tv_schedule), null, 60), new bjf("DROPPING_ODDS", 6, Integer.valueOf(R.drawable.ic_menu_list_dropping_odds), new q9k(R.string.dropping_odds), new b1f(27), 52), new bjf("POTS", 7, Integer.valueOf(R.drawable.ic_pots_trophy), new n9k(R.string.player_of_the_season, null), null, 60), new bjf("FIFA_RANKING", 8, Integer.valueOf(R.drawable.ic_fifa), new q9k(R.string.fifa_rankings), null, 28), new bjf("UEFA_RANKING", 9, Integer.valueOf(R.drawable.ic_uefa), new q9k(R.string.uefa_rankings), null, 28), new bjf("ATP_RANKING", 10, pco.x(3), new q9k(R.string.atp_rankings), null, 28), new bjf("WTA_RANKING", 11, pco.x(6), new q9k(R.string.wta_rankings), null, 28), new bjf("UTR_MEN_RANKING", 12, pco.x(1843), new q9k(R.string.utr_mens_rankings), null, 28), new bjf("UTR_WOMEN_RANKING", 13, pco.x(1844), new q9k(R.string.utr_womens_rankings), null, 28), new bjf("RUGBY_RANKING", 14, pco.x(82), new q9k(R.string.rugby_union_ranking), null, 28)};
        f = bjfVarArr;
        g = new kp5(bjfVarArr);
    }

    public bjf(String str, int i, Object obj, r9k r9kVar, Function1 function1, int i2) {
        cjf cjfVar = (i2 & 4) != 0 ? cjf.a : cjf.b;
        function1 = (i2 & 8) != 0 ? new b1f(28) : function1;
        boolean z = (i2 & 32) != 0;
        this.a = obj;
        this.b = r9kVar;
        this.c = cjfVar;
        this.d = function1;
        this.e = z;
    }

    public static bjf valueOf(String str) {
        return (bjf) Enum.valueOf(bjf.class, str);
    }

    public static bjf[] values() {
        return (bjf[]) f.clone();
    }
}
