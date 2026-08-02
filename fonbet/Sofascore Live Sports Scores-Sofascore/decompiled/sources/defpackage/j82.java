package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class j82 {
    public static final /* synthetic */ j82[] a;
    public static final /* synthetic */ kp5 b;

    static {
        j82[] j82VarArr = {new j82("UNDEFINED", 0), new j82("QUIZ", 1), new j82("SPORT", 2), new j82("WHATS_NEW", 3), new j82("EXTERNAL", 4), new j82("EVENT", 5), new j82("CHAT", 6), new j82("PLAYER", 7), new j82("LEAGUE", 8), new j82("BATTLE_DRAFT", 9), new j82("COMEBACK_SCHEDULE", 10), new j82("STAGE", 11), new j82("PLAYER_EVENT_STATISTICS", 12), new j82("TEAM", 13), new j82("RANKING_LIST", 14), new j82("SOCIAL", 15), new j82("INTERESTING_STATISTICS_TEAM", 16), new j82("INTERESTING_STATISTICS_PLAYER", 17), new j82("RETIRED_TOTO", 18), new j82("TOP_PLAYER_ACTION", 19), new j82("SOCIAL_OPEN_IN_MODAL_ACTION", 20), new j82("WEEKLY_CHALLENGE_ACTION", 21), new j82("FANTASY", 22), new j82("HISTORICAL_DATA", 23), new j82("PLAYER_SEASON_STATS", 24), new j82("TRANSFERS", 25), new j82("AI_INSIGHTS", 26), new j82("TOURNAMENT_TRANSACTIONS_ACTION", 27), new j82("TOURNAMENT_DRAFT_ACTION", 28)};
        a = j82VarArr;
        b = new kp5(j82VarArr);
    }

    public static j82 valueOf(String str) {
        return (j82) Enum.valueOf(j82.class, str);
    }

    public static j82[] values() {
        return (j82[]) a.clone();
    }
}
