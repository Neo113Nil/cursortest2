package defpackage;

import com.sofascore.model.mvvm.model.PlayerKt;
import com.sofascore.results.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class rz6 {
    public static final f7a g;
    public static final rz6 h;
    public static final rz6 i;
    public static final rz6 j;
    public static final rz6 k;
    public static final /* synthetic */ rz6[] l;
    public static final /* synthetic */ kp5 m;
    public final String a;
    public final String b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;

    static {
        rz6 rz6Var = new rz6("GOALKEEPER", 0, "GK", "G", R.string.goalkeeper, 1, 1, 2);
        h = rz6Var;
        rz6 rz6Var2 = new rz6("DEFENDER", 1, "DEF", "D", R.string.football_defender, 3, 5, 5);
        i = rz6Var2;
        rz6 rz6Var3 = new rz6("MIDFIELDER", 2, "MID", PlayerKt.FOOTBALL_MIDFIELDER, R.string.football_midfielder, 3, 5, 5);
        j = rz6Var3;
        rz6 rz6Var4 = new rz6("FORWARD", 3, "FWD", "F", R.string.football_forward, 1, 3, 3);
        k = rz6Var4;
        rz6[] rz6VarArr = {rz6Var, rz6Var2, rz6Var3, rz6Var4};
        l = rz6VarArr;
        m = new kp5(rz6VarArr);
        g = new f7a(23);
    }

    public rz6(String str, int i2, String str2, String str3, int i3, int i4, int i5, int i6) {
        this.a = str2;
        this.b = str3;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
    }

    public static rz6 valueOf(String str) {
        return (rz6) Enum.valueOf(rz6.class, str);
    }

    public static rz6[] values() {
        return (rz6[]) l.clone();
    }
}
