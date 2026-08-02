package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class mlb {
    public static final mlb a;
    public static final mlb b;
    public static final mlb c;
    public static final mlb d;
    public static final mlb e;
    public static final mlb f;
    public static final /* synthetic */ mlb[] g;

    static {
        mlb mlbVar = new mlb("SET_ANIMATION", 0);
        a = mlbVar;
        mlb mlbVar2 = new mlb("SET_PROGRESS", 1);
        b = mlbVar2;
        mlb mlbVar3 = new mlb("SET_REPEAT_MODE", 2);
        c = mlbVar3;
        mlb mlbVar4 = new mlb("SET_REPEAT_COUNT", 3);
        d = mlbVar4;
        mlb mlbVar5 = new mlb("SET_IMAGE_ASSETS", 4);
        e = mlbVar5;
        mlb mlbVar6 = new mlb("PLAY_OPTION", 5);
        f = mlbVar6;
        g = new mlb[]{mlbVar, mlbVar2, mlbVar3, mlbVar4, mlbVar5, mlbVar6};
    }

    public static mlb valueOf(String str) {
        return (mlb) Enum.valueOf(mlb.class, str);
    }

    public static mlb[] values() {
        return (mlb[]) g.clone();
    }
}
