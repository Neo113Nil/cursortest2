package defpackage;

import com.sofascore.model.mvvm.model.Incident;
import kotlin.jvm.functions.Function1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class l43 {
    public static final l43 c;
    public static final l43 d;
    public static final l43 e;
    public static final l43 f;
    public static final l43 g;
    public static final /* synthetic */ l43[] h;
    public static final /* synthetic */ kp5 i;
    public final String a;
    public final Function1 b;

    static {
        qa5 qa5Var = qa5.a;
        Class<qa5> cls = qa5.class;
        l43 l43Var = new l43("GOAL", 0, "regular", new kj1(1, qa5Var, cls, "getFootballGoalIcon16", "getFootballGoalIcon16(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;", 0, 27));
        c = l43Var;
        int i2 = 0;
        int i3 = 1;
        l43 l43Var2 = new l43("PENALTY", 1, "penalty", new kj1(i3, qa5Var, cls, "getFootballPenaltyIcon16", "getFootballPenaltyIcon16(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;", i2, 28));
        l43 l43Var3 = new l43("HEADING", 2, "heading", new kj1(i3, qa5Var, cls, "getFootballGoalIcon16", "getFootballGoalIcon16(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;", i2, 29));
        l43 l43Var4 = new l43("OWN_GOAL", 3, Incident.GoalIncident.TYPE_OWN_GOAL, new k43(i3, qa5Var, cls, "getAutoGoalIcon16", "getAutoGoalIcon16(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;", i2, 0));
        d = l43Var4;
        l43 l43Var5 = new l43("FREE_KICK", 4, "freeKick", new k43(i3, qa5Var, cls, "getFootballGoalIcon16", "getFootballGoalIcon16(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;", i2, 1));
        l43 l43Var6 = new l43("FREE_THROW_MADE", 5, "freeThrowMade", new k43(i3, qa5Var, cls, "getBasketballPointOneIcon", "getBasketballPointOneIcon(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;", i2, 2));
        e = l43Var6;
        l43 l43Var7 = new l43("TWO_POINTS_MADE", 6, "twoPointMade", new k43(i3, qa5Var, cls, "getBasketballPointTwoIcon", "getBasketballPointTwoIcon(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;", i2, 3));
        f = l43Var7;
        l43 l43Var8 = new l43("THREE_POINTS_MADE", 7, "threePointMade", new k43(1, qa5Var, cls, "getBasketballPointThreeIcon", "getBasketballPointThreeIcon(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;", i2, 4));
        g = l43Var8;
        l43[] l43VarArr = {l43Var, l43Var2, l43Var3, l43Var4, l43Var5, l43Var6, l43Var7, l43Var8};
        h = l43VarArr;
        i = new kp5(l43VarArr);
    }

    public l43(String str, int i2, String str2, Function1 function1) {
        this.a = str2;
        this.b = function1;
    }

    public static l43 valueOf(String str) {
        return (l43) Enum.valueOf(l43.class, str);
    }

    public static l43[] values() {
        return (l43[]) h.clone();
    }
}
