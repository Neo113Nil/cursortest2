package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class ll1 {
    public static final ll1 a;
    public static final ll1 b;
    public static final ll1 c;
    public static final ll1 d;
    public static final ll1 e;
    public static final ll1 f;
    public static final /* synthetic */ ll1[] g;

    static {
        ll1 ll1Var = new ll1("PitchTypes", 0);
        a = ll1Var;
        ll1 ll1Var2 = new ll1("PitchOutcomes", 1);
        b = ll1Var2;
        ll1 ll1Var3 = new ll1("HitSpray", 2);
        c = ll1Var3;
        ll1 ll1Var4 = new ll1("PitchZone", 3);
        d = ll1Var4;
        ll1 ll1Var5 = new ll1("BattingAverage", 4);
        e = ll1Var5;
        ll1 ll1Var6 = new ll1("BattingAverageAgainst", 5);
        f = ll1Var6;
        g = new ll1[]{ll1Var, ll1Var2, ll1Var3, ll1Var4, ll1Var5, ll1Var6};
    }

    public static ll1 valueOf(String str) {
        return (ll1) Enum.valueOf(ll1.class, str);
    }

    public static ll1[] values() {
        return (ll1[]) g.clone();
    }
}
