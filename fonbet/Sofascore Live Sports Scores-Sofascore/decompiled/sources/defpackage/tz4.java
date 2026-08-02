package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class tz4 {
    public static final tz4 d;
    public static final tz4 e;
    public static final /* synthetic */ tz4[] f;
    public static final /* synthetic */ kp5 g;
    public final String a;
    public final Function1 b;
    public final ct8 c;

    static {
        int i = 3;
        rq3 rq3Var = null;
        tz4 tz4Var = new tz4("ADS", 0, "Ads", new bj4(5), new sz4(i, rq3Var, 0));
        tz4 tz4Var2 = new tz4("FANTASY", 1, "Fantasy", new qz4(7), new rz4(i, rq3Var, 14));
        tz4 tz4Var3 = new tz4("TEST_RATING", 2, "Test Rating", new bj4(6), new sz4(i, rq3Var, 1));
        tz4 tz4Var4 = new tz4("WEEKLY_CHALLENGE_NOTIFICATION", 3, "Show local notifications", new bj4(7), new rz4(i, rq3Var, 15));
        tz4 tz4Var5 = new tz4("FUN_FACTS", 4, "Show fun facts", new bj4(8), new rz4(i, rq3Var, 0));
        tz4 tz4Var6 = new tz4("ALLOW_UNSAFE_NETWORK", 5, "Allow unsafe network", new bj4(9), new rz4(i, rq3Var, 1));
        tz4 tz4Var7 = new tz4("SHORTEN_AI_RELEVANCE", 6, "Shorten AI relevance", new bj4(10), new rz4(i, rq3Var, 2));
        tz4 tz4Var8 = new tz4("SHOW_REFERRAL", 7, "Show Referral", new bj4(11), new rz4(i, rq3Var, 3));
        tz4 tz4Var9 = new tz4("FEED_IGNORE_RULES", 8, "Feed ignore card creation rules", new bj4(12), new rz4(i, rq3Var, 4));
        tz4 tz4Var10 = new tz4("FORCE_ADS_TELEMETRY", 9, "Force Ads Telemetry", new bj4(13), new rz4(i, rq3Var, 5));
        d = tz4Var10;
        tz4 tz4Var11 = new tz4("SOFA_SEASON_2025", 10, "Show SofaSeason 2025", new bj4(16), new rz4(i, rq3Var, 6));
        tz4 tz4Var12 = new tz4("USE_LOCAL_TIME", 11, "Force use device time", new bj4(27), new rz4(i, rq3Var, 7));
        tz4 tz4Var13 = new tz4("WORLD_CUP_2026", 12, "Enable World Cup 2026", new qz4(1), new rz4(i, rq3Var, 8));
        tz4 tz4Var14 = new tz4("FORCE_LIVE_ACTION_WIDGET", 13, "Force Live Action Widget (finished matches)", new qz4(2), new rz4(i, rq3Var, 9));
        tz4 tz4Var15 = new tz4("LEAK_CANARY", 14, "LeakCanary (restart required)", new qz4(3), new rz4(i, rq3Var, 10));
        tz4 tz4Var16 = new tz4("FORCE_BIDDING_ADAPTERS", 15, "Force bidding adapters setup", new qz4(4), new rz4(i, rq3Var, 11));
        tz4 tz4Var17 = new tz4("MULTI_ENTITY_COMPARISON", 16, "Multi-entity comparison (3-4 slots)", new qz4(5), new rz4(i, rq3Var, 12));
        e = tz4Var17;
        tz4[] tz4VarArr = {tz4Var, tz4Var2, tz4Var3, tz4Var4, tz4Var5, tz4Var6, tz4Var7, tz4Var8, tz4Var9, tz4Var10, tz4Var11, tz4Var12, tz4Var13, tz4Var14, tz4Var15, tz4Var16, tz4Var17, new tz4("SIMULATE_LOW_RAM", 17, "Simulate low RAM device (restart required)", new qz4(6), new rz4(i, rq3Var, 13))};
        f = tz4VarArr;
        g = new kp5(tz4VarArr);
    }

    public tz4(String str, int i, String str2, Function1 function1, ct8 ct8Var) {
        this.a = str2;
        this.b = function1;
        this.c = ct8Var;
    }

    public static tz4 valueOf(String str) {
        return (tz4) Enum.valueOf(tz4.class, str);
    }

    public static tz4[] values() {
        return (tz4[]) f.clone();
    }
}
