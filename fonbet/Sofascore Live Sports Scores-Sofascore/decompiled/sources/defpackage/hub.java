package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class hub {
    public static final hub a;
    public static final hub b;
    public static final hub c;
    public static final hub d;
    public static final hub e;
    public static final /* synthetic */ hub[] f;

    static {
        hub hubVar = new hub("PREMATCH_LINEUPS", 0);
        a = hubVar;
        hub hubVar2 = new hub("TOP_PLAYERS", 1);
        b = hubVar2;
        hub hubVar3 = new hub("HISTORICAL_DATA", 2);
        c = hubVar3;
        hub hubVar4 = new hub("WC_TEAM_LEADERS", 3);
        d = hubVar4;
        hub hubVar5 = new hub("WC_STATS_LEADERS", 4);
        e = hubVar5;
        f = new hub[]{hubVar, hubVar2, hubVar3, hubVar4, hubVar5};
    }

    public static hub valueOf(String str) {
        return (hub) Enum.valueOf(hub.class, str);
    }

    public static hub[] values() {
        return (hub[]) f.clone();
    }
}
