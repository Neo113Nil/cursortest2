package defpackage;

import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.results.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class zu1 {
    public static final zu1 c;
    public static final zu1 d;
    public static final zu1 e;
    public static final zu1 f;
    public static final zu1 g;
    public static final zu1 h;
    public static final /* synthetic */ zu1[] i;
    public static final /* synthetic */ kp5 j;
    public final String a;
    public final int b;

    static {
        zu1 zu1Var = new zu1("ALL_SPORTS", 0, Season.YEAR_ALL_TIME, R.string.all_sports);
        c = zu1Var;
        zu1 zu1Var2 = new zu1("FOOTBALL", 1, Sports.FOOTBALL, R.string.football);
        d = zu1Var2;
        zu1 zu1Var3 = new zu1("BASKETBALL", 2, Sports.BASKETBALL, R.string.basketball);
        e = zu1Var3;
        zu1 zu1Var4 = new zu1("TENNIS", 3, Sports.TENNIS, R.string.tennis);
        f = zu1Var4;
        zu1 zu1Var5 = new zu1("ICE_HOCKEY", 4, Sports.ICE_HOCKEY, R.string.ice_hockey);
        g = zu1Var5;
        zu1 zu1Var6 = new zu1("VOLLEYBALL", 5, Sports.VOLLEYBALL, R.string.volleyball);
        h = zu1Var6;
        zu1[] zu1VarArr = {zu1Var, zu1Var2, zu1Var3, zu1Var4, zu1Var5, zu1Var6};
        i = zu1VarArr;
        j = new kp5(zu1VarArr);
    }

    public zu1(String str, int i2, String str2, int i3) {
        this.a = str2;
        this.b = i3;
    }

    public static zu1 valueOf(String str) {
        return (zu1) Enum.valueOf(zu1.class, str);
    }

    public static zu1[] values() {
        return (zu1[]) i.clone();
    }
}
