package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ei6 {
    public static final ei6 a;
    public static final ei6 b;
    public static final ei6 c;
    public static final /* synthetic */ ei6[] d;
    public static final /* synthetic */ kp5 e;

    static {
        ei6 ei6Var = new ei6("COLLAPSIBLE_CATEGORY", 0);
        ei6 ei6Var2 = new ei6("EVENT_ROW", 1);
        ei6 ei6Var3 = new ei6("FOOTBALL_EVENT_ROW", 2);
        ei6 ei6Var4 = new ei6("TENNIS_EVENT_ROW", 3);
        ei6 ei6Var5 = new ei6("BASKETBALL_EVENT_ROW", 4);
        ei6 ei6Var6 = new ei6("CRICKET_EVENT_ROW", 5);
        ei6 ei6Var7 = new ei6("TOURNAMENT_ROW", 6);
        ei6 ei6Var8 = new ei6("TOURNAMENT_GROUP_ROW", 7);
        ei6 ei6Var9 = new ei6("DIVIDER_ROW", 8);
        ei6 ei6Var10 = new ei6("EMPTY_STATE_ROW_FAVORITES", 9);
        a = ei6Var10;
        ei6 ei6Var11 = new ei6("EMPTY_STATE_ROW_SUGGESTED", 10);
        b = ei6Var11;
        ei6 ei6Var12 = new ei6("EMPTY_STATE_ROW_SUGGESTED_CLEARED", 11);
        c = ei6Var12;
        ei6[] ei6VarArr = {ei6Var, ei6Var2, ei6Var3, ei6Var4, ei6Var5, ei6Var6, ei6Var7, ei6Var8, ei6Var9, ei6Var10, ei6Var11, ei6Var12, new ei6("BRANDING_ROW", 12), new ei6("BANNER_IN_LIST", 13)};
        d = ei6VarArr;
        e = new kp5(ei6VarArr);
    }

    public static ei6 valueOf(String str) {
        return (ei6) Enum.valueOf(ei6.class, str);
    }

    public static ei6[] values() {
        return (ei6[]) d.clone();
    }
}
